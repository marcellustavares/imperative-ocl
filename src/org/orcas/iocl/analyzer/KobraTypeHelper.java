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
import java.util.List;

import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.util.Validator;

import KobrA2.SUM.Constraint.Structural.AnyType;
import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.Real;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.Type;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class KobraTypeHelper implements TypeHelper {

	public Object getOperation(
		Object owner, String name, List<Object> parameterTypes) {

		List<Operation> availableOperations = new ArrayList<Operation>();

		if (owner instanceof KobrA2.SUM.Constraint.Structural.Boolean) {
			availableOperations = createBooleanOperations();
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.Integer) {
			availableOperations = createIntegerOperations();
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.Real) {
			availableOperations = createRealOperations();
		}
		else if (owner instanceof KobrA2.SUM.Constraint.Structural.String) {
			availableOperations = createStringOperations();
		}

		return lookup(name, parameterTypes, availableOperations);
	}

	public List<Object> getOperationParameterTypes(
		Object context, OperationCallExp operationCallExp) {

		List parameterTypes = new ArrayList();

		for (OclExpression parameter : operationCallExp.getArgument()) {
			parameterTypes.add(resolveType(context, parameter));
		}

		return parameterTypes;
	}

	public boolean hasOperation(
		Object owner, String name, List<Object> parameterTypes) {

		Operation operation = (Operation)getOperation(
			owner, name, parameterTypes);

		if (operation == null) {
			return false;
		}

		return true;
	}

	public Object resolveType(Object context, OclExpression source) {
		if (source instanceof BooleanLiteralExp) {
			return getKobraFactory().createBoolean();
		}
		else if (source instanceof IntegerLiteralExp) {
			return getKobraFactory().createInteger();
		}
		else if (source instanceof OperationCallExp) {
			OperationCallExp operationCallExp = (OperationCallExp)source;

			Object owner = resolveType(context, operationCallExp.getSource());

			List<Object> operationParameterTypes = getOperationParameterTypes(
				context, operationCallExp);

			Operation operation = (Operation)getOperation(
				owner, operationCallExp.getName(), operationParameterTypes);

			return operation.getType();
		}
		else if (source instanceof RealLiteralExp) {
			return getKobraFactory().createInteger();
		}
		else if (source instanceof StringLiteralExp) {
			return getKobraFactory().createString();
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

	protected Operation lookup(
		String name, List<Object> parameterTypes,
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

}