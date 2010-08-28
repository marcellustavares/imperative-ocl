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

package org.orcas.iocl.analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.orcas.iocl.expressions.emof.PrimitiveType;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.util.StringPool;
import org.orcas.iocl.util.Validator;

import KobrA2.SUM.Constraint.Structural.AnyType;
import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.ComponentClass;
import KobrA2.SUM.Constraint.Structural.Element;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.Property;
import KobrA2.SUM.Constraint.Structural.Real;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.Type;

public class KobraTypeHelper implements
	TypeHelper<Classifier, Operation, Property> {

	public void bindVariable(String variable, Classifier type) {
		_variablesMap.put(variable, type);
	}

	public Element createStringType() {
		return getKobraFactory().createString();
	}

	public List<Operation> getOperations(Classifier owner) {
		List<Operation> operations = new ArrayList<Operation>();

		if (owner instanceof KobrA2.SUM.Constraint.Structural.Boolean) {
			operations = createBooleanOperations();
		}
		else if (owner instanceof ComponentClass) {
			ComponentClass componentClass = (ComponentClass)owner;

			operations =  componentClass.getOwnedOperation();
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

	public Operation getOperation(
		Classifier owner, String name, List<Classifier> parameterTypes) {

		List<Operation> operations = getOperations(owner);

		return lookup(name, parameterTypes, operations);
	}

	public List<Classifier> getOperationParameterTypes(
		Classifier owner, OperationCallExp operationCallExp) {

		List<Classifier> parameterTypes = new ArrayList<Classifier>();

		for (OclExpression parameter : operationCallExp.getArgument()) {
			parameterTypes.add(resolveType(owner, parameter));
		}

		return parameterTypes;
	}

	public Property getProperty(Classifier owner, String name) {
		List<Property> availableProperties = new ArrayList<Property>();

		if (owner instanceof ComponentClass) {
			ComponentClass componentClass = (ComponentClass)owner;

			availableProperties = componentClass.getOwnedAttribute();
		}

		return lookup(name, availableProperties);
	}

	public boolean hasOperation(
		Classifier owner, String name, List<Classifier> parameterTypes) {

		Operation operation = getOperation(owner, name, parameterTypes);

		if (operation == null) {
			return false;
		}

		return true;
	}

	public boolean hasProperty(Classifier owner, String name) {
		Property property = (Property)getProperty(owner, name);

		if (property == null) {
			return false;
		}

		return true;
	}

	public Classifier resolveType(Classifier context, OclExpression source) {
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

			Property property = (Property)getProperty(
				owner, propertyCallExp.getReferredProperty().getName());

			return (Classifier)property.getType();
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

	public Classifier resolveType(org.orcas.iocl.expressions.emof.Type type) {
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
				org.orcas.iocl.util.Operation.EQUAL.getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.OCL_AS_TYPE.getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.OCL_IS_KIND_OF.getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.OCL_IS_TYPE_OF.getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.NOT_EQUAL.getOperationName(),
				getKobraFactory().createBoolean(), "object",
				getKobraFactory().createAnyType()));


		return operations;
	}

	protected List<Operation> createBooleanOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.AND.getOperationName(),
				getKobraFactory().createBoolean(), "boolean",
				getKobraFactory().createBoolean()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.NOT.getOperationName(),
				getKobraFactory().createBoolean()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.OR.getOperationName(),
				getKobraFactory().createBoolean(), "boolean",
				getKobraFactory().createBoolean()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.XOR.getOperationName(),
				getKobraFactory().createBoolean(), "boolean",
				getKobraFactory().createBoolean()));

		return operations;
	}

	protected List<Operation> createIntegerOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createRealOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.DIV.getOperationName(),
				getKobraFactory().createReal(), "integer",
				getKobraFactory().createInteger()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.MOD.getOperationName(),
				getKobraFactory().createInteger(), "integer",
				getKobraFactory().createInteger()));


		return operations;
	}

	protected List<Operation> createRealOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.ABS.getOperationName(),
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.DIVIDE.getOperationName(),
				getKobraFactory().createReal(), "integer",
				getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.FLOOR.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.GT.getOperationName(),
				getKobraFactory().createBoolean(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.GTE.getOperationName(),
				getKobraFactory().createBoolean(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.LT.getOperationName(),
				getKobraFactory().createBoolean(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.LTE.getOperationName(),
				getKobraFactory().createBoolean(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.MAX.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.MIN.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.MINUS.getOperationName(),
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.MINUS.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.MULT.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.PLUS.getOperationName(),
				getKobraFactory().createReal(), "real",
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.ROUND.getOperationName(),
				getKobraFactory().createInteger()));

		return operations;
	}

	protected List<Operation> createStringOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.CONCAT.getOperationName(),
				getKobraFactory().createString(), "string",
				getKobraFactory().createString()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.SIZE.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createTernaryOperation(
				org.orcas.iocl.util.Operation.SUBSTRING.getOperationName(),
				getKobraFactory().createString(), "lower",
				getKobraFactory().createInteger(), "upper",
				getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.TO_INTEGER.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
					org.orcas.iocl.util.Operation.TO_LOWER.getOperationName(),
					getKobraFactory().createString()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.TO_REAL.getOperationName(),
				getKobraFactory().createReal()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.TO_UPPER.getOperationName(),
				getKobraFactory().createString()));

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

				for (int i = 0; i < parameterTypes.size(); i++) {
					Object parameterType = parameterTypes.get(i);

					if (parameters.isEmpty() || parameters.size() < i) {
						continue;
					}

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

	protected Property lookup(
		String name, List<Property> availableProperties) {

		for (Property property : availableProperties) {
			if (Validator.equals(name, property.getName())) {
				return property;
			}
		}

		return null;
	}

	protected Classifier resolveVariable(Object context, Variable variable) {
		String variableName = variable.getName();

		if (!_variablesMap.containsKey(variableName)) {
			if (Validator.equals(variableName, StringPool.SELF)) {
				if (context instanceof Classifier) {
					_variablesMap.put(variableName, (Classifier)context);
				}
				else if (context instanceof Operation) {
					Operation operation = (Operation)context;

					_variablesMap.put(
						variableName, operation.getComponentClass());
				}
			}
		}

		return _variablesMap.get(variableName);
	}


	private Map<String, Classifier> _variablesMap =
		new HashMap<String, Classifier>();

}