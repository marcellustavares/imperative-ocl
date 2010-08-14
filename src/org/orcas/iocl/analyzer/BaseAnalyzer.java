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
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.helper.Choice;

public abstract class BaseAnalyzer<C, O, P> implements Analyzer<C, O, P> {

	public void check(C context, OclExpression oclExpresion)
		throws SemanticException {

		if (oclExpresion instanceof OperationCallExp) {
			checkOperationCallExp(context, (OperationCallExp)oclExpresion);
		}
		else if (oclExpresion instanceof PropertyCallExp) {
			checkPropertyCallExp(context, (PropertyCallExp)oclExpresion);
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

			message.append("Propery ");
			message.append(propertyName);
			message.append(" not found for type ");
			message.append(sourceType);

			throw new SemanticException(message.toString());
		}
	}

	public abstract TypeHelper<C, O, P> getTypeHelper();

	protected abstract List<Choice> getChoices(
		C owner, List<O> operations);

}