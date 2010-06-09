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

package org.orcas.iocl.compiler;

import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ReturnExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.util.AbstractVisitor;

public class JavaVisitor extends AbstractVisitor<String> {

	protected String handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		return booleanLiteralExp.getBooleanSymbol().toString();
	}

	protected String handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		return integerLiteralExp.getIntegerSymbol().toString();
	}

	/*protected String handleOperationCallExp(
		OperationCallExp operationCallExp, String sourceResult,
		List<String> argumentsResult) {

		StringBuilder result = new StringBuilder();

		int operationCode = operationCallExp.getOperationCode();
		int argumentsSize = argumentsResult.size();

		switch (argumentsSize) {
			case 1:
				switch (operationCode) {
					case OperationCode.DIV:
					case OperationCode.MINUS:
					case OperationCode.MULT:
					case OperationCode.PLUS:
						result.append("(");
						result.append(sourceResult);
						result.append(OperationCode.toLabel(operationCode));
						result.append(argumentsResult.get(0));
						result.append(")");

						break;
				}

				break;
		}

		return result.toString();
	}
	*/

	protected String handleRealLiteralExp(RealLiteralExp realLiteralExp) {
		return realLiteralExp.getRealSymbol().toString();
	}

	protected String handleReturnExp(ReturnExp returnExp, String returnResult) {
		if (returnResult == null) {
			return "return;";
		}
		else {
			return "return " + returnResult + ";";
		}
	}

	protected String handleStringLiteralExp(StringLiteralExp stringLiteralExp) {
		return "\"" + stringLiteralExp.getStringSymbol() + "\"";
	}

}