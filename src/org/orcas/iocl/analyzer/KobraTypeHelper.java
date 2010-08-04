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

import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.util.Validator;

import KobrA2.SUM.Constraint.Structural.AnyType;
import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.Type;

public class KobraTypeHelper implements TypeHelper {

	public boolean hasOperation(
		Object owner, String name, List<Object> parameterTypes) {

		if (owner instanceof KobrA2.SUM.Constraint.Structural.String) {
			List<Operation> availableOperations = createStringOperations();

			return lookup(name, parameterTypes, availableOperations);
		}

		return false;
	}

	public Object resolveType(Object context, OclExpression source) {
		if (source instanceof StringLiteralExp) {
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

	protected List<Operation> createStringOperations() {
		List<Operation> operations = new ArrayList<Operation>();

		operations.addAll(createAnyTypeOperations());

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.CONCAT.getOperationName(),
				getKobraFactory().createBoolean(), "string",
				getKobraFactory().createString()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.GT.getOperationName(),
				getKobraFactory().createBoolean(), "string",
				getKobraFactory().createString()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.GTE.getOperationName(),
				getKobraFactory().createBoolean(), "string",
				getKobraFactory().createString()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.LT.getOperationName(),
				getKobraFactory().createBoolean(), "string",
				getKobraFactory().createString()));

		operations.add(
			createBinaryOperation(
				org.orcas.iocl.util.Operation.LTE.getOperationName(),
				getKobraFactory().createBoolean(), "string",
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
					getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.TO_REAL.getOperationName(),
				getKobraFactory().createInteger()));

		operations.add(
			createUnaryOperation(
				org.orcas.iocl.util.Operation.TO_UPPER.getOperationName(),
				getKobraFactory().createInteger()));

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

	protected boolean lookup(
		String name, List<Object> parameterTypes,
		List<Operation> availableOperations) {

		try {
			for (Operation operation : availableOperations) {
				if (Validator.equals(name, operation.getName())) {
					List<Parameter> parameters = operation.getOwnedParameter();

					for (int i = 0; i < parameters.size(); i++) {
						Object parameterType = parameterTypes.get(i);
						Type operationType = parameters.get(i).getType();

						if(!isTypeConformant(parameterType, operationType)) {
							return false;
						}
					}

					return true;
				}
			}
		}
		catch (Exception e) {
			return false;
		}

		return false;
	}

	protected boolean isTypeConformant(
		Object parameterType, Object operarationType) {

		if (operarationType instanceof AnyType) {
			return true;
		}

		return Validator.equals(
			parameterType.getClass(), operarationType.getClass());
	}

}