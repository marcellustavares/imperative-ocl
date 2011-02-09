/**
 * Copyright (C) 2010  Marcellus C. Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.orcas.ioclengine.analyzer.kobra;

import KobrA2.SUM.Constraint.Structural.Acquires;
import KobrA2.SUM.Constraint.Structural.AnyType;
import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.ComponentClass;
import KobrA2.SUM.Constraint.Structural.Element;
import KobrA2.SUM.Constraint.Structural.Enumeration;
import KobrA2.SUM.Constraint.Structural.EnumerationLiteral;
import KobrA2.SUM.Constraint.Structural.NamedElement;
import KobrA2.SUM.Constraint.Structural.Nests;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.PackageableElement;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.Property;
import KobrA2.SUM.Constraint.Structural.Real;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.TemporaryType;
import KobrA2.SUM.Constraint.Structural.Type;

import org.orcas.iocl.expression.emof.PrimitiveType;
import org.orcas.iocl.expression.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expression.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;
import org.orcas.iocl.expression.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expression.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expression.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expression.imperativeocl.Variable;
import org.orcas.iocl.expression.imperativeocl.VariableExp;
import org.orcas.ioclengine.analyzer.TypeHelper;
import org.orcas.ioclengine.util.StringPool;
import org.orcas.ioclengine.util.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KobraTypeHelper implements
	TypeHelper<Classifier, Operation, Property, Parameter, EnumerationLiteral> {

	public void bindVariable(String variable, Classifier type) {
		_variablesMap.put(variable, type);
	}

	public Element createStringType() {
		return getKobraFactory().createString();
	}

	public List<Classifier> getAvailableEnumerations(
		ComponentClass componentClass, List<Classifier> availableEnumerations) {

		for (PackageableElement pe : componentClass.getPackagedElement()) {
			if (pe instanceof Enumeration) {
				availableEnumerations.add((Enumeration)pe);
			}
			else if (pe instanceof ComponentClass) {
				getAvailableEnumerations(
					(ComponentClass)pe, availableEnumerations);
			}
		}

		return availableEnumerations;
	}

	public List<Classifier> getAvailableEnumerations(Operation context) {
		List<Classifier> availableEnumerations = new ArrayList<Classifier>();

		ComponentClass componentClass = getTopLevelComponentClass(
			context.getComponentClass());

		return getAvailableEnumerations(componentClass, availableEnumerations);
	}

	public List<Classifier> getAvailableTypes(
		ComponentClass componentClass, List<Classifier> availableTypes) {

		for (PackageableElement pe : componentClass.getPackagedElement()) {
			if (pe instanceof KobrA2.SUM.Constraint.Structural.Class) {
				availableTypes.add((KobrA2.SUM.Constraint.Structural.Class)pe);
			}
			else if (pe instanceof ComponentClass) {
				getAvailableTypes((ComponentClass)pe, availableTypes);
			}
		}

		return availableTypes;
	}

	public List<Classifier> getAvailableTypes(Operation context) {
		List<Classifier> availableTypes = new ArrayList<Classifier>();

		ComponentClass componentClass = getTopLevelComponentClass(
			context.getComponentClass());

		return getAvailableTypes(componentClass, availableTypes);
	}

	public List<EnumerationLiteral> getEnumerationLiterals(
			Classifier enumeration) {

		Enumeration e = (Enumeration)enumeration;

		return e.getOwnedLiteral();
	}

	public String getName(Object namedElement) {
		NamedElement element = (NamedElement)namedElement;

		if (Validator.isNotNull(element.getName())) {
			return element.getName();
		}

		if (namedElement instanceof Property) {
			Property property = (Property)namedElement;

			String componentName = property.getComponentClass().getName();
			String firstLowerCase = componentName.substring(0, 1).toLowerCase();

			return firstLowerCase.concat(componentName.substring(1));
		}

		return StringPool.BLANK;
	}

	public Operation getOperation(
		Classifier owner, String name, List<Classifier> parameterTypes) {

		List<Operation> operations = getOperations(owner);

		return lookup(name, parameterTypes, operations);
	}

	public List<Classifier> getOperationParameterTypes(
		Object context, OperationCallExp operationCallExp) {

		List<Classifier> parameterTypes = new ArrayList<Classifier>();

		for (OclExpression parameter : operationCallExp.getArgument()) {
			parameterTypes.add(resolveType(context, parameter));
		}

		return parameterTypes;
	}

	public List<Operation> getOperations(Classifier owner) {
		List<Operation> operations = new ArrayList<Operation>();

		if (owner instanceof KobrA2.SUM.Constraint.Structural.Boolean) {
			operations = createBooleanOperations();
		}
		else if (owner instanceof ComponentClass) {
			ComponentClass componentClass = (ComponentClass)owner;

			operations.addAll(createAnyTypeOperations());
			operations.addAll(componentClass.getOwnedOperation());
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.Integer) {
			operations = createIntegerOperations();
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.Real) {
			operations = createRealOperations();
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.String) {
			operations = createStringOperations();
		}

		return operations;
	}

	public String getParameterName(Parameter parameter) {
		return parameter.getName();
	}

	public List<Parameter> getParameters(Operation operation) {
		return operation.getOwnedParameter();
	}

	public List<Property> getProperties(Classifier classifier) {
		List<Property> properties = new ArrayList<Property>();

		if (classifier instanceof ComponentClass) {
			ComponentClass componentClass = (ComponentClass)classifier;

			properties.addAll(componentClass.getOwnedAttribute());

			for (PackageableElement pe : componentClass.getPackagedElement()) {
				if (pe instanceof Nests) {
					Property property =
						((Nests)pe).getNavigableOwnedEnd().get(0);

					properties.add(property);
				}
				else if (pe instanceof Acquires) {
					Property property =
						((Acquires)pe).getNavigableOwnedEnd().get(0);

					properties.add(property);
				}
			}
		}

		return properties;
	}

	public Property getProperty(Classifier classifier, String name) {
		List<Property> properties = getProperties(classifier);

		return lookup(name, properties);
	}

	public List<String> getVariableNames() {
		List<String> variables = new ArrayList<String>();

		for (Entry<String, Classifier> entry : _variablesMap.entrySet()) {
			variables.add(entry.getKey());
		}

		return variables;
	}

	public boolean hasOperation(
		Classifier owner, String name, List<Classifier> parameterTypes) {

		Operation operation = getOperation(owner, name, parameterTypes);

		if (operation == null) {
			return false;
		}

		return true;
	}

	public boolean hasProperty(Classifier classifier, String name) {
		Property property = getProperty(classifier, name);

		if (property == null) {
			return false;
		}

		return true;
	}

	public Classifier resolveType(Object context, OclExpression source) {
		if (source instanceof BooleanLiteralExp) {
			return getKobraFactory().createBoolean();
		}
		else if (source instanceof IntegerLiteralExp) {
			return getKobraFactory().createInteger();
		}
		else if (source instanceof OperationCallExp) {
			OperationCallExp operationCallExp = (OperationCallExp)source;

			Classifier owner = resolveType(
				context, operationCallExp.getSource());

			List<Classifier> operationParameterTypes =
				getOperationParameterTypes(context, operationCallExp);

			Operation operation = getOperation(
				owner, operationCallExp.getName(), operationParameterTypes);

			return (Classifier)operation.getType();
		}
		else if (source instanceof PropertyCallExp) {
			PropertyCallExp propertyCallExp = (PropertyCallExp)source;

			Classifier owner = resolveType(
				context, propertyCallExp.getSource());

			Property property = getProperty(
				owner, propertyCallExp.getReferredProperty().getName());

			Type type = property.getType();

			if (type != null) {
				return (Classifier)type;
			}

			return (Classifier)property.getComponentClass();
		}
		else if (source instanceof RealLiteralExp) {
			return getKobraFactory().createInteger();
		}
		else if (source instanceof StringLiteralExp) {
			return getKobraFactory().createString();
		}
		else if (source instanceof VariableExp) {
			VariableExp variableExp = (VariableExp)source;

			Variable variable = variableExp.getReferredVariable();

			return resolveVariable(context, variable);
		}

		return null;
	}

	public Classifier resolveType(Operation context, String variableName) {
		Classifier type = null;

		List<Parameter> parameters = context.getOwnedParameter();

		if (Validator.equals(variableName, StringPool.SELF)) {
			return context.getComponentClass();
		}

		for (Parameter parameter : parameters) {
			if (Validator.equals(parameter.getName(), variableName)) {
				Type parameterType = parameter.getType();

				if (parameterType instanceof TemporaryType) {
					TemporaryType temporaryType = (TemporaryType)parameterType;

					type = resolveTemporaryType(context, temporaryType);
				}
				else {
					type = (Classifier)parameterType;

				}

				break;
			}
		}

		return type;
	}

	public Classifier resolveType(org.orcas.iocl.expression.emof.Type type) {
		if (type instanceof PrimitiveType) {
			PrimitiveType primitiveType = (PrimitiveType)type;

			String typeName = primitiveType.getName();

			if (Validator.equals(StringPool.BOOLEAN, typeName)) {
				return getKobraFactory().createBoolean();
			}
			else if (Validator.equals(StringPool.INTEGER, typeName)) {
				return getKobraFactory().createInteger();
			}
			else if (Validator.equals(StringPool.REAL, typeName)) {
				return getKobraFactory().createReal();
			}
			else if (Validator.equals(StringPool.STRING, typeName)) {
				return getKobraFactory().createString();
			}
		}

		return null;
	}

	protected List<Operation> createAnyTypeOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.OCL_AS_TYPE.
				getOperationName(), getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.OCL_IS_KIND_OF.
				getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.OCL_IS_TYPE_OF.
				getOperationName(), getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		return operations;
	}

	protected Operation createBinaryOperation(
		String name, Classifier resultType, String parameterName,
		Classifier parameterType) {

		List<String> paramNames = new ArrayList<String>();

		paramNames.add(parameterName);

		List<Classifier> paramTypes = new ArrayList<Classifier>();

		paramTypes.add(parameterType);

		return createOperation(name, resultType, paramNames, paramTypes);
	}

	protected List<Operation> createBooleanOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		return operations;
	}

	protected List<Operation> createIntegerOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createRealOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.DIV.getOperationName(),
				getKobraFactory().createReal(), "integer",
				getKobraFactory().createInteger()));

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.MOD.getOperationName(),
				getKobraFactory().createInteger(), "integer",
				getKobraFactory().createInteger()));


		return operations;
	}

	protected Operation createOperation(
		String name, Classifier resultType, List<String> parameterNames,
		List<Classifier> parameterTypes) {

		Operation operation = getKobraFactory().createOperation();

		operation.setName(name);
		operation.setType(resultType);

		List<Parameter> ownedParameters =  operation.getOwnedParameter();

		for (int i = 0; i < parameterNames.size(); i++) {
			Parameter parameter = getKobraFactory().createParameter();

			parameter.setName(parameterNames.get(i));
			parameter.setType(parameterTypes.get(i));

			ownedParameters.add(parameter);
		}

		return operation;
	}


	protected List<Operation> createRealOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.ABS.getOperationName(),
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.FLOOR.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.MAX.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.MIN.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.ROUND.getOperationName(),
				getKobraFactory().createInteger()));

		return operations;
	}

	protected List<Operation> createStringOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.ioclengine.util.Operation.CONCAT.getOperationName(),
				getKobraFactory().createString(), "string",
				getKobraFactory().createString()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.SIZE.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createTernaryOperation(
				org.orcas.ioclengine.util.Operation.SUBSTRING.
				getOperationName(), getKobraFactory().createString(), "lower",
				getKobraFactory().createInteger(), "upper",
				getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.TO_INTEGER.
				getOperationName(), getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.TO_LOWER.getOperationName(),
				getKobraFactory().createString()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.TO_REAL.getOperationName(),
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.ioclengine.util.Operation.TO_UPPER.getOperationName(),
				getKobraFactory().createString()));

		return operations;
	}

	protected Operation createTernaryOperation(
		String name, Classifier resultType, String parameterName1,
		Classifier parameterType1, String parameterName2,
		Classifier parameterType2) {

		List<String> paramNames =  new ArrayList<String>();

		paramNames.add(parameterName1);
		paramNames.add(parameterName2);

		List<Classifier> paramTypes = new ArrayList<Classifier>();

		paramTypes.add(parameterType1);
		paramTypes.add(parameterType2);

		return createOperation(name, resultType, paramNames, paramTypes);
	}

	protected Operation createUnaryOperation(
		String name, Classifier resultType) {

		List<String> paramNames =  new ArrayList<String>();

		List<Classifier> paramTypes = new ArrayList<Classifier>();

		return createOperation(name, resultType, paramNames, paramTypes);
	}

	protected StructuralFactory getKobraFactory() {
		return StructuralFactory.eINSTANCE;
	}

	protected ComponentClass getTopLevelComponentClass(
		ComponentClass componentClass) {

		if (componentClass.getComponentClass() == null) {
			return componentClass;
		}

		return getTopLevelComponentClass(componentClass.getComponentClass());
	}

	protected boolean isTypeConformant(
		Object parameterType, Object operarationType) {

		if (operarationType instanceof AnyType) {
			return true;
		}
		else if (operarationType instanceof
					KobrA2.SUM.Constraint.Structural.Integer) {

			if (parameterType instanceof Real) {
				return true;
			}
		}
		else if (operarationType instanceof Real) {
			if (parameterType instanceof
					KobrA2.SUM.Constraint.Structural.Integer) {

				return true;
			}
		}

		Class<?> operationTypeClass = operarationType.getClass();

		return operationTypeClass.isInstance(parameterType);
	}

	protected Operation lookup(
		String name, List<Classifier> parameterTypes,
		List<Operation> availableOperations) {

		for (Operation operation : availableOperations) {
			if (Validator.equals(name, operation.getName())) {
				List<Parameter> parameters = operation.getOwnedParameter();

				if (parameterTypes.size() != parameters.size()) {
					continue;
				}

				for (int i = 0; i < parameterTypes.size(); i++) {
					Object parameterType = parameterTypes.get(i);

					Type operationType = parameters.get(i).getType();

					if(!isTypeConformant(parameterType, operationType)) {
						return null;
					}
				}

				return operation;
			}
		}

		return null;
	}

	protected <T> T lookup(String name, List<T> elements) {
		for (T element : elements) {
			if (Validator.equals(name, getName(element))) {
				return element;
			}
		}

		return null;
	}

	protected Classifier resolveTemporaryType(
		Operation context, TemporaryType temporaryType) {

		List<Classifier> availableTypes = getAvailableTypes(context);

		for (Classifier classifier : availableTypes) {
			if (Validator.equals(
					classifier.getName(), temporaryType.getName())) {

				return classifier;
			}
		}

		return null;
	}

	protected Classifier resolveVariable(Object context, Variable variable) {
		String variableName = variable.getName();

		if (!_variablesMap.containsKey(variableName)) {
			if (Validator.equals(variableName, StringPool.SELF)) {
				if (context instanceof Classifier) {
					return (Classifier)context;
				}
				else if (context instanceof Operation) {
					Operation operation = (Operation)context;

					return operation.getComponentClass();
				}
			}
			else {
				if (context instanceof Operation) {
					Operation operation = (Operation)context;

					Parameter parameter = lookup(
						variableName, getParameters(operation));

					if (parameter != null) {
						_variablesMap.put(
							getName(parameter),
							(Classifier)parameter.getType());
					}
				}
			}
		}

		return _variablesMap.get(variableName);
	}

	private Map<String, Classifier> _variablesMap =
		new HashMap<String, Classifier>();

}