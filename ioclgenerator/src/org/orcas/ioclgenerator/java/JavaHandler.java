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

package org.orcas.ioclgenerator.java;

import org.orcas.iocl.expression.emof.Enumeration;
import org.orcas.iocl.expression.emof.EnumerationLiteral;
import org.orcas.iocl.expression.emof.Package;
import org.orcas.iocl.expression.emof.PrimitiveType;
import org.orcas.iocl.expression.emof.Property;
import org.orcas.iocl.expression.emof.Type;
import org.orcas.iocl.expression.imperativeocl.AltExp;
import org.orcas.iocl.expression.imperativeocl.AssignExp;
import org.orcas.iocl.expression.imperativeocl.BlockExp;
import org.orcas.iocl.expression.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expression.imperativeocl.BreakExp;
import org.orcas.iocl.expression.imperativeocl.CatchExp;
import org.orcas.iocl.expression.imperativeocl.CollectionItem;
import org.orcas.iocl.expression.imperativeocl.CollectionKind;
import org.orcas.iocl.expression.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expression.imperativeocl.ComputeExp;
import org.orcas.iocl.expression.imperativeocl.ContinueExp;
import org.orcas.iocl.expression.imperativeocl.EnumLiteralExp;
import org.orcas.iocl.expression.imperativeocl.ForExp;
import org.orcas.iocl.expression.imperativeocl.InstantiationExp;
import org.orcas.iocl.expression.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expression.imperativeocl.IterateExp;
import org.orcas.iocl.expression.imperativeocl.IteratorExp;
import org.orcas.iocl.expression.imperativeocl.LogExp;
import org.orcas.iocl.expression.imperativeocl.NullLiteralExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;
import org.orcas.iocl.expression.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expression.imperativeocl.RaiseExp;
import org.orcas.iocl.expression.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expression.imperativeocl.ReturnExp;
import org.orcas.iocl.expression.imperativeocl.SequenceType;
import org.orcas.iocl.expression.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expression.imperativeocl.SwitchExp;
import org.orcas.iocl.expression.imperativeocl.TryExp;
import org.orcas.iocl.expression.imperativeocl.TypeExp;
import org.orcas.iocl.expression.imperativeocl.Variable;
import org.orcas.iocl.expression.imperativeocl.VariableInitExp;
import org.orcas.iocl.expression.imperativeocl.WhileExp;
import org.orcas.ioclengine.util.Operation;
import org.orcas.ioclengine.util.PathType;
import org.orcas.ioclengine.util.StringPool;
import org.orcas.ioclengine.util.Template;
import org.orcas.ioclengine.util.TemplateUtil;
import org.orcas.ioclengine.util.Validator;
import org.orcas.ioclgenerator.Handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaHandler implements Handler<String> {

	public String handleAltExp(
		AltExp altExp, String conditionResult, String bodyResult) {

		_map.clear();
		_map.put("conditionResult", conditionResult);
		_map.put("bodyResult", bodyResult);

		return TemplateUtil.process(Template.ALT, _map);
	}

	public String handleAssignExp(
		AssignExp assignExp, String leftResult, String defaultValueResult) {

		_map.clear();
		_map.put("leftResult", leftResult);
		_map.put("defaultValueResult", defaultValueResult);

		return TemplateUtil.process(Template.ASSIGN, _map);
	}

	public String handleBlockExp(
		BlockExp blockExp, List<String> bodyResults) {

		_map.clear();
		_map.put("bodyResults", bodyResults);

		return TemplateUtil.process(Template.BLOCK, _map);
	}

	public String handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		return booleanLiteralExp.getBooleanSymbol().toString();
	}

	public String handleBreakExp(BreakExp breakExp) {
		return TemplateUtil.process(Template.BREAK, null);
	}

	public String handleCatchExp(
		CatchExp catchExp, List<String> typeResults, List<String> bodyResults) {

		_map.clear();
		_map.put("typeResults", typeResults);
		_map.put("bodyResults", bodyResults);

		return TemplateUtil.process(Template.CATCH, _map);
	}

	public String handleCollectionItem(
		CollectionItem collectionItem, String collectionItemResult) {

		return collectionItemResult;
	}

	public String handleCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp, List<String> partResults) {

		_map.clear();
		_map.put("partResults", partResults);

		CollectionKind collectionKind = collectionLiteralExp.getKind();

		_map.put("collectionType", collectionKind.getName());

		return TemplateUtil.process(Template.COLLECTION, _map);
	}

	public String handleComputeExp(
		ComputeExp computeExp, String variableResult, String bodyResult) {

		_map.clear();
		_map.put("variableName", computeExp.getReturnedElement().getName());
		_map.put("variableResult", variableResult);
		_map.put("bodyResult", bodyResult);

		return TemplateUtil.process(Template.COMPUTE, _map);
	}

	public String handleContinueExp(ContinueExp continueExp) {
		return TemplateUtil.process(Template.CONTINUE, null);
	}

	public String handleEnumLiteralExp(EnumLiteralExp enumLiteralExp) {
		EnumerationLiteral enumerationLiteral =
			enumLiteralExp.getReferredEnumLiteral();

		Enumeration enumeration = enumerationLiteral.getEnumeration();

		_map.clear();
		_map.put("enumerationName", enumeration.getName());
		_map.put("enumerationLiteralName", enumerationLiteral.getName());

		return TemplateUtil.process(Template.ENUM_LITERAL, _map);
	}

	public String handleForExp(
		ForExp forExp, String conditionResult, String bodyResult,
		List<String> variableResults, String sourceResult) {

		_map.clear();
		_map.put("forName", forExp.getName());
		_map.put("conditionResult", conditionResult);
		_map.put("bodyResult", bodyResult);
		_map.put("variableResults", variableResults);
		_map.put("sourceResult", sourceResult);

		Variable variable = forExp.getIterator().get(0);

		_map.put("variableName", variable.getName());
		_map.put("variableType", _getType(variable.getType()));

		return TemplateUtil.process(Template.FOR, _map);
	}

	public String handleInstantiationExp(
		InstantiationExp instantiationExp, String className,
		List<String> packageResults, List<String> argumentResults) {

		_map.clear();
		_map.put("className", _getQualifiedName(className));
		_map.put("packageResults", packageResults);
		_map.put("argumentResults", argumentResults);

		return TemplateUtil.process(Template.INSTANTIATION, _map);
	}

	public String handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		return integerLiteralExp.getIntegerSymbol().toString();
	}

	public String handleIterateExp(
		IterateExp iterateExp, String sourceResult,
		List<String> variableResults, String resultResult, String bodyResult) {

		_map.clear();
		_map.put("sourceResult", sourceResult);
		_map.put("variableResults", variableResults);
		_map.put("bodyResult", bodyResult);

		String iterateName = iterateExp.getName();

		Template template = Template.getByName(iterateName);

		return TemplateUtil.process(template, _map);
	}


	public String handleIteratorExp(
		IteratorExp iteratorExp, String sourceResult,
		List<String> variableResults, String bodyResult) {

		_map.clear();

		_map.put("sourceResult", sourceResult);
		_map.put("sourceType", _getType(iteratorExp.getSource()));
		_map.put("variableResults", variableResults);
		_map.put("bodyResult", bodyResult);

		List<Variable> variables = iteratorExp.getIterator();

		Variable accumulator = variables.get(0);

		_map.put("accName", accumulator.getName());
		_map.put("accType", _getType(accumulator.getType()));

		String iteratorName = iteratorExp.getName();

		Template template = Template.getByName(iteratorName);

		return TemplateUtil.process(template, _map);
	}

	public String handleLogExp(LogExp logExp) {
		_map.clear();
		_map.put("text", logExp.getText());

		return TemplateUtil.process(Template.LOG, _map);
	}

	public String handleNullLiteralExp(NullLiteralExp nullLiteralExp) {
		return "null";
	}

	public String handleOperationCallExp(
		OperationCallExp operationCallExp, String sourceResult,
		List<String> argResults) {

		String result = null;

		OclExpression source = operationCallExp.getSource();
		Boolean isImperativeOperation =
			operationCallExp.getIsImperativeOperation();

		int argumentsSize = argResults.size();
		int operationCode = operationCallExp.getOperationCode();

		Operation operation = Operation.getByOperationCode(operationCode);

		if (operation == Operation.CUSTOM) {
			_map.clear();
			_map.put("sourceResult", sourceResult);
			_map.put("operation", operationCallExp.getName());
			_map.put("argResults", argResults);
			_map.put("isImperativeOperation", isImperativeOperation);

			return TemplateUtil.process(Template.CUSTOM, _map);
		}

		switch (argumentsSize) {
			case 0:
				_map.clear();
				_map.put("sourceResult", sourceResult);
				_map.put("isImperativeOperation", isImperativeOperation);

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
							_getTemplateName(operation.getOperationName()));

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
				_map.put("sourceType", _getType(source));
				_map.put("argResult", argResults.get(0));

				switch (operation) {
					case AND:
					case APPEND:
					case AT:
					case CONCAT:
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
							_getTemplateName(operation.getOperationName()));

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
				_map.put("arg0Result", argResults.get(0));
				_map.put("arg1Result", argResults.get(1));

				switch (operation) {
					case INSERT_AT:
					case SUBSTRING:
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

	public String handlePackage(Package pkg) {
		return pkg.getName();
	}

	public String handlePropertyCallExp(
		PropertyCallExp propertyCallExp, String sourceResult) {

		Property referredProperty = propertyCallExp.getReferredProperty();

		_map.clear();
		_map.put("sourceResult", sourceResult);
		_map.put("propertyName", referredProperty.getName());

		return TemplateUtil.process(Template.PROPERTY_CALL, _map);
	}

	public String handleRaiseExp(RaiseExp raiseExp, String typeResult) {
		_map.clear();
		_map.put("typeResult", typeResult);
		_map.put("exceptionMessage", raiseExp.getExceptionMessage());

		return TemplateUtil.process(Template.RAISE, _map);
	}

	public String handleRealLiteralExp(RealLiteralExp realLiteralExp) {
		return realLiteralExp.getRealSymbol().toString();
	}

	public String handleReturnExp(ReturnExp returnExp, String returnResult) {
		_map.clear();
		_map.put("returnResult", returnResult);

		return TemplateUtil.process(Template.RETURN, _map);
	}

	public String handleStringLiteralExp(StringLiteralExp stringLiteralExp) {
		return "\"" + stringLiteralExp.getStringSymbol() + "\"";
	}

	public String handleSwitchExp(
		SwitchExp switchExp, List<String> altPartResults, String elseResult) {

		_map.clear();
		_map.put("altPartResults", altPartResults);
		_map.put("elseResult", elseResult);

		return TemplateUtil.process(Template.SWITCH, _map);
	}

	public String handleTryExp(
		TryExp tryExp, List<String> bodyResults, List<String> catchResults) {

		_map.clear();
		_map.put("bodyResults", bodyResults);
		_map.put("catchResults", catchResults);

		return TemplateUtil.process(Template.TRY, _map);
	}

	public String handleType(Type type) {
		StringBuilder typeBuilder = new StringBuilder();

		if (type instanceof PathType) {
			PathType pathType = (PathType)type;

			Iterator<String> it = pathType.getQualifiedName().iterator();

			while (it.hasNext()) {
				typeBuilder.append(it.next());

				if (it.hasNext()) {
					typeBuilder.append(".");
				}
			}
		}
		else {
			typeBuilder.append(type.getName());
		}

		return typeBuilder.toString();
	}

	public String handleTypeExp(TypeExp typeExp) {
		return handleType(typeExp.getReferredType());
	}

	public String handleVariable(Variable variable, String initResult) {
		_map.clear();
		_map.put("initResult", initResult);
		_map.put("name", variable.getName());
		_map.put("type", _getType(variable.getType()));

		return TemplateUtil.process(Template.VARIABLE, _map);
	}

	public String handleVariableInitExp(VariableInitExp variableInitExp) {
		return null;
	}

	public String handleWhileExp(
		WhileExp whileExp, String conditionResult, String bodyResult) {

		_map.clear();
		_map.put("conditionResult", conditionResult);
		_map.put("bodyResult", bodyResult);

		return TemplateUtil.process(Template.WHILE, _map);
	}

	public void setContext(Map<String, String> context) {
		_context = context;
	}

	private String _getQualifiedName(String type) {
		if (_context != null) {
			return _context.get(type);
		}

		return type;
	}

	private String _getTemplateName(String operationName) {
		if (_templateMap.containsKey(operationName)) {
			return _templateMap.get(operationName);
		}

		return operationName;
	}


	private String _getType(OclExpression oclExpression) {
		if (oclExpression instanceof BooleanLiteralExp) {
			return StringPool.BOOLEAN;
		}
		else if (oclExpression instanceof IntegerLiteralExp) {
			return StringPool.INTEGER;
		}
		else if (oclExpression instanceof RealLiteralExp) {
			return StringPool.REAL;
		}
		else if (oclExpression instanceof StringLiteralExp) {
			return StringPool.STRING;
		}
		else if (oclExpression instanceof CollectionLiteralExp) {
			CollectionLiteralExp collectionExp =
				(CollectionLiteralExp)oclExpression;

			return collectionExp.getKind().getName();
		}

		return "";
	}

	private String _getType(Type type) {
		if (type != null) {
			if (type instanceof PathType) {
				PathType pathType = (PathType)type;

				StringBuilder sb = new StringBuilder();

				List<String> qualifiedName =  pathType.getQualifiedName();

				for (int i = 0; i < qualifiedName.size(); i++) {
					sb.append(qualifiedName.get(i));

					if ((i + 1) != qualifiedName.size()) {
						sb.append(StringPool.DOT);
					}
				}

				return _getQualifiedName(sb.toString());
			}
			else if (type instanceof PrimitiveType) {
				PrimitiveType primitiveType = (PrimitiveType)type;

				String name = primitiveType.getName();

				if (Validator.equals(name, StringPool.REAL)){
					return StringPool.DOUBLE;
				}
			}
			else if (type instanceof SequenceType) {
				SequenceType sequenceType =(SequenceType)type;

				StringBuilder sb = new StringBuilder();

				sb.append("org.orcas.commons.collections.list.TreeList<");
				sb.append(_getType(sequenceType.getElementType()));
				sb.append(">");

				return sb.toString();
			}

			return type.getName();
		}

		return null;
	}

	private Map<String, String> _context;
	private Map<String, Object> _map = new HashMap<String, Object>();
	private Map<String, String> _templateMap = new HashMap<String, String>();
	{
		_templateMap.put("-", "minus");
		_templateMap.put("<", "lt");
		_templateMap.put("<=", "lte");
		_templateMap.put(">", "gt");
		_templateMap.put(">=", "gte");
		_templateMap.put("=", "eq");
		_templateMap.put("<>", "notEqual");
	}

}