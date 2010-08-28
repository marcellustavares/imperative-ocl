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
import java.util.Arrays;
import java.util.List;

import org.orcas.iocl.exception.SemanticException;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.helper.Choice;

public abstract class BaseAnalyzer<C, O, P> implements Analyzer<C, O, P> {

	public void check(C context, OclExpression oclExpression)
		throws SemanticException {

		if (oclExpression instanceof AssignExp) {
			checkAssignExp(context, (AssignExp)oclExpression);
		}
		else if (oclExpression instanceof BlockExp) {
			checkBlockExp(context, (BlockExp)oclExpression);
		}
		else if (oclExpression instanceof OperationCallExp) {
			checkOperationCallExp(context, (OperationCallExp)oclExpression);
		}
		else if (oclExpression instanceof PropertyCallExp) {
			checkPropertyCallExp(context, (PropertyCallExp)oclExpression);
		}
		else if (oclExpression instanceof VariableInitExp) {
			checkVariableInitExp(context, (VariableInitExp)oclExpression);
		}
	}

	public List<Choice> getChoices(
		C context, OclExpression oclExpresion) {

		List<Choice> choices = new ArrayList<Choice>();

		if (oclExpresion instanceof StringLiteralExp) {
			C owner = getTypeHelper().resolveType(context, oclExpresion);

			List<O> operations = getTypeHelper().getOperations(owner);

			return getChoices(owner, operations);
		}

		return choices;
	}

	protected void checkAssignExp(C context, AssignExp assignExp)
		throws SemanticException {

		OclExpression left = assignExp.getLeft();

		C leftType = null;

		if (left instanceof VariableExp) {
			VariableExp variableExp = (VariableExp)left;

			leftType = getTypeHelper().resolveType(context, variableExp);

			if (leftType == null) {
				StringBuilder message = new StringBuilder();

				message.append("Variable ");
				message.append(variableExp.getReferredVariable().getName());
				message.append(" was not defined.");

				throw new SemanticException(message.toString());
			}
		}

		Class<?> leftTypeClass = leftType.getClass();

		C defaultValueType = getTypeHelper().resolveType(
				context, assignExp.getDefaultValue());

		if (!leftTypeClass.isInstance(defaultValueType)) {
			StringBuilder message = new StringBuilder();

			message.append("Left hand expression with type ");
			message.append(leftType);
			message.append(" is not compatible with type ");
			message.append(defaultValueType);

			throw new SemanticException(message.toString());
		}
	}

	protected void checkBlockExp(C context, BlockExp blockExp)
		throws SemanticException {

		List<OclExpression> body = blockExp.getBody();

		for (OclExpression oclExpression : body) {
			check(context, oclExpression);
		}
	}

	protected void checkOperationCallExp(
			C context, OperationCallExp operationCallExp)
		throws SemanticException {

		OclExpression source = operationCallExp.getSource();

		check(context, source);

		C sourceType = getTypeHelper().resolveType(context, source);

		List<C> parameterTypes = getTypeHelper().getOperationParameterTypes(
			context, operationCallExp);

		if (!getTypeHelper().hasOperation(
				sourceType, operationCallExp.getName(), parameterTypes)) {

			StringBuilder message = new StringBuilder();

			message.append("Operation ");
			message.append(operationCallExp.getName());
			message.append(" ");
			message.append(Arrays.toString(parameterTypes.toArray()));
			message.append(" not found for type ");
			message.append(sourceType);

			throw new SemanticException(message.toString());
		}
	}

	protected void checkPropertyCallExp(
			C context, PropertyCallExp propertyCallExp)
		throws SemanticException {

		OclExpression source = propertyCallExp.getSource();

		check(context, source);

		C sourceType = getTypeHelper().resolveType(context, source);

		String propertyName = propertyCallExp.getReferredProperty().getName();

		if (!getTypeHelper().hasProperty(sourceType, propertyName)) {
			StringBuilder message = new StringBuilder();

			message.append("Property ");
			message.append(propertyName);
			message.append(" not found for type ");
			message.append(sourceType);

			throw new SemanticException(message.toString());
		}
	}

	protected void checkVariableInitExp(
			C context, VariableInitExp variableInitExp)
		throws SemanticException {

		Variable referredVariable = variableInitExp.getReferredVariable();

		C variableType = getTypeHelper().resolveType(
			referredVariable.getType());

		getTypeHelper().bindVariable(referredVariable.getName(), variableType);

		Class<?> variableTypeClass = variableType.getClass();

		C initExpressionType = getTypeHelper().resolveType(
			context, referredVariable.getInitExpression());

		if (initExpressionType != null &&
				!variableTypeClass.isInstance(initExpressionType)) {

			StringBuilder message = new StringBuilder();

			message.append("Variable ");
			message.append(referredVariable.getName());
			message.append(" with type ");
			message.append(variableType);
			message.append(" is not compatible with type ");
			message.append(initExpressionType);

			throw new SemanticException(message.toString());
		}
	}

	public abstract TypeHelper<C, O, P> getTypeHelper();

	protected abstract List<Choice> getChoices(
		C owner, List<O> operations);

}