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

import java.util.List;

import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.BreakExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ComputeExp;
import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.IfExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ReturnExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.util.AbstractVisitor;
import org.orcas.iocl.util.OperationCode;

public class JavaVisitor extends AbstractVisitor<String> {

	protected String handleAssignExp(
		AssignExp assignExp, String leftResult, String defaultValueResult) {

		StringBuilder result = new StringBuilder();

		result.append(leftResult);
		result.append(" = ");
		result.append(defaultValueResult);
		result.append(";");

		return result.toString();
	}

	protected String handleBlockExp(BlockExp blockExp) {

		return null;
	}

	protected String handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		return booleanLiteralExp.getBooleanSymbol().toString();
	}

	protected String handleBreakExp(BreakExp breakExp) {

		return null;
	}

	protected String handleCollectionItem(CollectionItem collectionItem) {

		return null;
	}

	protected String handleCollectionLiteralExp(
			CollectionLiteralExp collectionLiteralExp) {

		return null;
	}

	protected String handleComputeExp(ComputeExp computeExp) {

		return null;
	}

	protected String handleContinueExp(ContinueExp continueExp) {

		return null;
	}

	protected String handleForExp(ForExp forExp) {

		return null;
	}

	protected String handleIfExp(IfExp ifExp) {

		return null;
	}

	protected String handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		return integerLiteralExp.getIntegerSymbol().toString();
	}

	protected String handleIterateExp(IterateExp iterateExp) {

		return null;
	}


	protected String handleIteratorExp(IteratorExp iteratorExp) {

		return null;
	}

	protected String handleOperationCallExp(
		OperationCallExp operationCallExp, String sourceResult,
		List<String> argResult) {

		StringBuilder result = new StringBuilder();

		int operationCode = operationCallExp.getOperationCode();
		int argumentsSize = argResult.size();

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
						result.append(argResult.get(0));
						result.append(")");

						break;
				}

				break;
		}

		return result.toString();
	}

	protected String handlePropertyCallExp(PropertyCallExp propertyCallExp) {

		return null;
	}

	protected String handleRaiseExp(RaiseExp raiseExp) {

		return null;
	}

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


	protected String handleTryExp(TryExp tryExp) {

		return null;
	}

	protected String handleVariable(Variable variable, String initResult) {
		return variable.getName();
	}

	protected String handleVariableInitExp(VariableInitExp variableInitExp) {

		return null;
	}

	protected String handleWhileExp(WhileExp whileExp) {

		return null;
	}

}