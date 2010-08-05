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

@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class BaseAnalyzer implements Analyzer {

	public void check(Object context, OclExpression oclExpresion)
		throws SemanticException {

		if (oclExpresion instanceof OperationCallExp) {
			checkOperationCallExp(context, (OperationCallExp)oclExpresion);
		}
	}

	protected void checkOperationCallExp(
			Object context, OperationCallExp operationCallExp)
		throws SemanticException {

		OclExpression source = operationCallExp.getSource();

		check(context, source);

		Object sourceType = getTypeHelper().resolveType(context, source);

		List argumentTypes = new ArrayList();

		List<OclExpression> arguments = operationCallExp.getArgument();

		for (OclExpression argument : arguments) {
			argumentTypes.add(
				getTypeHelper().resolveType(context, argument));
		}

		if (!getTypeHelper().hasOperation(
				sourceType, operationCallExp.getName(), argumentTypes)) {

			StringBuilder message = new StringBuilder();

			message.append("Operation ");
			message.append(operationCallExp.getName());
			message.append(" ");
			message.append(Arrays.toString(argumentTypes.toArray()));
			message.append(" not found for type ");
			message.append(sourceType);

			throw new SemanticException(message.toString());
		}
	}

	public abstract TypeHelper getTypeHelper();

}