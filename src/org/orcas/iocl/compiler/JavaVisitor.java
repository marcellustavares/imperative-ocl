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
import org.orcas.iocl.expressions.imperativeocl.CollectionKind;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ComputeExp;
import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.IfExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ReturnExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.TypeExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.util.AbstractVisitor;
import org.orcas.iocl.util.Operation;
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

	protected String handleBlockExp(
		BlockExp blockExp, List<String> bodyResults) {

		_map.clear();
		_map.put("bodyResults", bodyResults);

		return TemplateUtil.process(Template.BLOCK, _map);
	}

	protected String handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		return booleanLiteralExp.getBooleanSymbol().toString();
	}

	protected String handleBreakExp(BreakExp breakExp) {
		return TemplateUtil.process(Template.BREAK, null);
	}

	protected String handleCollectionItem(
		CollectionItem collectionItem, String collectionItemResult) {

		return collectionItemResult;
	}

	protected String handleCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp, List<String> partResults) {

		_map.clear();
		_map.put("partResults", partResults);

		CollectionKind collectionKind = collectionLiteralExp.getKind();

		_map.put("collectionType", collectionKind.getName());

		return TemplateUtil.process(Template.COLLECTION, _map);
	}

	protected String handleComputeExp(ComputeExp computeExp) {

		return null;
	}

	protected String handleContinueExp(ContinueExp continueExp) {
		return TemplateUtil.process(Template.CONTINUE, null);
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

		OclExpression source = operationCallExp.getSource();

		int argumentsSize = argResult.size();
		int operationCode = operationCallExp.getOperationCode();

		Operation operation = Operation.getByOperationCode(operationCode);

		switch (argumentsSize) {
			case 0:
				_map.clear();
				_map.put("sourceResult", sourceResult);

				switch (operation) {
					case ABS:
					case AS_BAG:
					case AS_ORDERED_SET:
					case AS_SEQUENCE:
					case AS_SET:
					case FIRST:
					case FLATTEN:
					case IS_EMPTY:
					case LAST:
					case MINUS:
					case NOT:
					case NOT_EMPTY:
					case SUM:
					case TO_INTEGER:
					case TO_LOWER:
					case TO_REAL:
					case TO_UPPER:
						Template template = Template.getByName(
							operation.getOperationName());

						result = TemplateUtil.process(template, _map);

						break;

					case FLOOR:
					case ROUND:
						if (source instanceof RealLiteralExp) {
							template = Template.getByName(
								operation.getOperationName());

							result = TemplateUtil.process(template, _map);
						}
						else {
							result = sourceResult;
						}

						break;

					case SIZE:
						if (source instanceof StringLiteralExp){
							_map.put("operator", "length");
						}
						else {
							_map.put("operator", "size");
						}

						result = TemplateUtil.process(Template.SIZE, _map);

						break;
				}

				break;

			case 1:
				_map.clear();
				_map.put("sourceResult", sourceResult);
				_map.put("argResult", argResult.get(0));

				switch (operation) {
					case AND:
					case APPEND:
					case AT:
					case COUNT:
					case DIV:
					case EQUAL:
					case EXCLUDES:
					case EXCLUDING:
					case GT:
					case GTE:
					case INCLUDES:
					case INCLUDES_ALL:
					case INCLUDING:
					case INDEX_OF:
					case INTERSECTION:
					case LT:
					case LTE:
					case MAX:
					case MIN:
					case MOD:
					case NOT_EQUAL:
					case OCL_AS_TYPE:
					case OCL_IS_KIND_OF:
					case OCL_IS_TYPE_OF:
					case OR:
					case SYMMETRIC_DIFFERENCE:
					case UNION:
					case XOR:
						Template template = Template.getByName(
							operation.getOperationName());

						result = TemplateUtil.process(template, _map);

						break;

					case DIVIDE:
					case MINUS:
					case MULT:
					case PLUS:
						_map.put("operator", operation.getOperationName());

						result = TemplateUtil.process(
							Template.ARITHMETIC_EXPRESSION, _map);

						break;
				}

				break;

			case 2:
				_map.clear();
				_map.put("sourceResult", sourceResult);
				_map.put("arg0Result", argResult.get(0));
				_map.put("arg1Result", argResult.get(1));

				switch (operation) {
					case INSERT_AT:
					case SUB_ORDERED_SET:
					case SUB_SEQUENCE:
						Template template = Template.getByName(
							operation.getOperationName());

						result = TemplateUtil.process(template, _map);

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

	protected String handleTypeExp(TypeExp typeExp) {
		return typeExp.getReferredType().getName();
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

	private Map<String, Object> _map = new HashMap<String, Object>();

}