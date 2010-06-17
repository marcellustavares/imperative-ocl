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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.orcas.iocl.util.Template;
import org.orcas.iocl.util.TemplateUtil;

public class JavaVisitor extends AbstractVisitor<String> {

	protected String handleAssignExp(
		AssignExp assignExp, String leftResult, String defaultValueResult) {

		_map.clear();
		_map.put("leftResult", leftResult);
		_map.put("defaultValueResult", defaultValueResult);

		return TemplateUtil.process(Template.ASSIGN, _map);
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

		String result = null;

		_map.clear();

		int opCode = operationCallExp.getOperationCode();
		int argumentsSize = argResult.size();

		switch (argumentsSize) {
			case 1:
				switch (opCode) {
					case OperationCode.DIV:
					case OperationCode.MINUS:
					case OperationCode.MULT:
					case OperationCode.PLUS:
						_map.put("sourceResult", sourceResult);
						_map.put("operation", OperationCode.toLabel(opCode));
						_map.put("argResult", argResult.get(0));

						result = TemplateUtil.process(
							Template.ARITHMETIC_EXPRESSION, _map);

						break;
				}

				break;
		}

		return result;
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
		_map.clear();
		_map.put("returnResult", returnResult);

		return TemplateUtil.process(Template.RETURN, _map);
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

	private Map<String, String> _map = new HashMap<String, String>();

}