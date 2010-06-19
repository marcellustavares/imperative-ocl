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

package org.orcas.iocl.parser;

import org.antlr.runtime.tree.Tree;
import org.eclipse.emf.common.util.EList;
import org.orcas.iocl.expressions.emof.EmofFactory;
import org.orcas.iocl.expressions.emof.PrimitiveType;
import org.orcas.iocl.expressions.emof.Type;
import org.orcas.iocl.expressions.imperativeocl.AltExp;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.CatchExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionKind;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralPart;
import org.orcas.iocl.expressions.imperativeocl.CollectionType;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.ImperativeExpression;
import org.orcas.iocl.expressions.imperativeocl.ImperativeOclFactory;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ReturnExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.SwitchExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.TypeExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.parser.antlr.IoclParser;
import org.orcas.iocl.util.Operation;
import org.orcas.iocl.util.PathType;
import org.orcas.iocl.util.StringUtil;

public class ImperativeOclTreeWalker {

	public OclExpression walk(Tree tree) {
		OclExpression oclExpression = null;

		switch (tree.getType()) {
			case IoclParser.AND:
			case IoclParser.DIV:
			case IoclParser.EQUAL:
			case IoclParser.GT:
			case IoclParser.GTE:
			case IoclParser.LT:
			case IoclParser.LTE:
			case IoclParser.MINUS:
			case IoclParser.NOT:
			case IoclParser.NOT_EQUAL:
			case IoclParser.MULT:
			case IoclParser.OR:
			case IoclParser.PLUS:
			case IoclParser.XOR:
				OperationCallExp operationCallExp =
					getFactory().createOperationCallExp();

				int operationCode = Operation.toOperationCode(tree.getText());

				operationCallExp.setOperationCode(operationCode);
				operationCallExp.setSource(walk(tree.getChild(0)));

				EList<OclExpression> argument = operationCallExp.getArgument();

				if (tree.getChildCount() > 1) {
					argument.add(walk(tree.getChild(1)));
				}

				oclExpression = operationCallExp;

				break;

			case IoclParser.ALT_EXP:
				AltExp altExp = getFactory().createAltExp();

				altExp.setCondition(walk(tree.getChild(0)));
				altExp.setBody(walk(tree.getChild(1)));

				oclExpression = altExp;

				break;

			case IoclParser.APPEND:
			case IoclParser.IS:
				AssignExp assignExp = getFactory().createAssignExp();

				boolean isReset = (tree.getType() == IoclParser.IS);

				assignExp.setLeft(walk(tree.getChild(0)));
				assignExp.setIsReset(isReset);
				assignExp.setDefaultValue(walk(tree.getChild(1)));

				oclExpression = assignExp;

				break;

			case IoclParser.ARROW:
			case IoclParser.DOT:
				operationCallExp = getFactory().createOperationCallExp();

				operationCode = Operation.toOperationCode(
					tree.getChild(1).getText());

				operationCallExp.setOperationCode(operationCode);
				operationCallExp.setSource(walk(tree.getChild(0)));

				argument = operationCallExp.getArgument();

				for (int i = 2; i < tree.getChildCount(); i++) {
					argument.add(walk(tree.getChild(i)));
				}

				oclExpression = operationCallExp;

				break;

			case IoclParser.BOOLEAN_LITERAL:
				BooleanLiteralExp booleanLiteralExp =
					getFactory().createBooleanLiteralExp();

				Boolean booleanSymbol = Boolean.parseBoolean(tree.getText());

				booleanLiteralExp.setBooleanSymbol(booleanSymbol);

				oclExpression = booleanLiteralExp;

				break;

			case IoclParser.BREAK:
				oclExpression = getFactory().createBreakExp();

				break;


			case IoclParser.COLLECTION_LITERAL:
				CollectionLiteralExp collectionLiteralExp =
					getFactory().createCollectionLiteralExp();

				Tree kind = tree.getChild(0);

				CollectionKind collectionKind = CollectionKind.get(
					kind.getText());

				collectionLiteralExp.setKind(collectionKind);

				EList<CollectionLiteralPart> part =
					collectionLiteralExp.getPart();

				CollectionItem collectionItem;

				for (int i = 1; i < tree.getChildCount(); i++) {
					collectionItem = getFactory().createCollectionItem();

					collectionItem.setItem(walk(tree.getChild(i)));

					part.add(collectionItem);
				}

				oclExpression = collectionLiteralExp;

				break;

			case IoclParser.COLLECTION_TYPE:
				kind = tree.getChild(0);

				collectionKind = CollectionKind.get(kind.getText());

				CollectionType collectionType = getCollectionType(
					collectionKind);

				TypeExp typeExp = getFactory().createTypeExp();

				typeExp.setReferredType(collectionType);

				oclExpression = typeExp;

				break;

			case IoclParser.CONTINUE:
				oclExpression = getFactory().createContinueExp();

				break;

			case IoclParser.DO:
				BlockExp blockExp = getFactory().createBlockExp();

				EList<OclExpression> body = blockExp.getBody();

				for (int i = 0; i < tree.getChildCount(); i++) {
					body.add(walk(tree.getChild(i)));
				}

				oclExpression = blockExp;

				break;


			case IoclParser.EXCEPT:
				CatchExp catchExp = getFactory().createCatchExp();

				EList<Type> exception = catchExp.getException();
				body = catchExp.getBody();

				for (int i = 0; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof TypeExp) {
						typeExp = (TypeExp)exp;

						exception.add(typeExp.getReferredType());
					}
					else {
						body.add(exp);
					}
				}

				oclExpression = catchExp;

				break;

			case IoclParser.FOR:
				ForExp forExp = getFactory().createForExp();

				tree = tree.getChild(0);

				forExp.setName(tree.getText());
				forExp.setSource(walk(tree.getChild(1)));

				EList<Variable> iterator = forExp.getIterator();

				for (int i = 2; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof Variable) {
						iterator.add((Variable)exp);
					}
					else if (exp instanceof ImperativeExpression) {
						forExp.setBody(exp);
					}
					else {
						forExp.setCondition(exp);
					}
				}

				oclExpression = forExp;

				break;

			case IoclParser.IF:
				SwitchExp switchExp = getFactory().createSwitchExp();

				EList<AltExp> alternativePart = switchExp.getAlternativePart();

				for (int i = 0; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof AltExp) {
						alternativePart.add((AltExp)exp);

					}
					else {
						switchExp.setElsePart(exp);
					}
				}

				oclExpression = switchExp;

				break;

			case IoclParser.INTEGER_LITERAL:
				IntegerLiteralExp integerLiteralExp =
					getFactory().createIntegerLiteralExp();

				Integer integerSymbol = Integer.parseInt(tree.getText());

				integerLiteralExp.setIntegerSymbol(integerSymbol);

				oclExpression = integerLiteralExp;

				break;

			case IoclParser.ITERATE:
				IterateExp iterateExp = getFactory().createIterateExp();

				iterateExp.setSource(walk(tree.getChild(0)));

				iterator = iterateExp.getIterator();

				for (int i = 1; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof VariableExp) {
						VariableExp variableExp = (VariableExp)exp;

						iterator.add(variableExp.getReferredVariable());
					}
					else {
						iterateExp.setBody(exp);
					}
				}

				oclExpression = iterateExp;

				break;

			case IoclParser.ITERATOR:
				IteratorExp iteratorExp = getFactory().createIteratorExp();

				iteratorExp.setSource(walk(tree.getChild(0)));
				iteratorExp.setName(tree.getChild(1).getText());

				iterator = iteratorExp.getIterator();

				for (int i = 2; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof VariableExp) {
						VariableExp variableExp = (VariableExp)exp;

						iterator.add(variableExp.getReferredVariable());
					}
					else {
						iteratorExp.setBody(exp);
					}
				}

				oclExpression = iteratorExp;

				break;

			case IoclParser.NUMERIC_OPERATION:
				operationCallExp =
					createNumericOperationCallExp(tree.getText());

				argument = operationCallExp.getArgument();

				for (int i = 0; i < tree.getChildCount(); i++) {
					argument.add(walk(tree.getChild(i)));
				}

				oclExpression = operationCallExp;

				break;

			case IoclParser.PRIMITIVE_TYPE_LITERAL:
				PrimitiveType primitiveType =
					EmofFactory.eINSTANCE.createPrimitiveType();

				primitiveType.setName(tree.getText());

				typeExp = getFactory().createTypeExp();

				typeExp.setReferredType(primitiveType);

				oclExpression = typeExp;

				break;

			case IoclParser.RAISE:
				RaiseExp raiseExp = getFactory().createRaiseExp();

				OclExpression exp = walk(tree.getChild(0));

				if (exp instanceof TypeExp) {
					typeExp = (TypeExp)exp;

					raiseExp.setException(typeExp.getReferredType());
				}
				else {
					StringLiteralExp stringLiteralExp = (StringLiteralExp)exp;

					raiseExp.setExceptionMessage(
						stringLiteralExp.getStringSymbol());
				}

				oclExpression = raiseExp;

				break;

			case IoclParser.REAL_LITERAL:
				RealLiteralExp realLiteralExp =
					getFactory().createRealLiteralExp();

				Double realSymbol = Double.parseDouble(tree.getText());

				realLiteralExp.setRealSymbol(realSymbol);

				oclExpression = realLiteralExp;

				break;

			case IoclParser.RETURN:
				ReturnExp returnExp = getFactory().createReturnExp();

				if (tree.getChildCount() > 0) {
					returnExp.setValue(walk(tree.getChild(0)));
				}

				oclExpression = returnExp;

				break;

			case IoclParser.SCOPE:
				PathType pathType = new PathType();

				for (int i = 0; i < tree.getChildCount(); i++) {
					pathType.addName(tree.getChild(i).getText());
				}

				typeExp = getFactory().createTypeExp();

				typeExp.setReferredType(pathType);

				oclExpression = typeExp;

				break;

			case IoclParser.STRING_LITERAL:
				StringLiteralExp stringLiteralExp =
					getFactory().createStringLiteralExp();

				String stringSymbol = StringUtil.unescape(tree.getText());

				stringLiteralExp.setStringSymbol(stringSymbol);

				oclExpression = stringLiteralExp;

				break;

			case IoclParser.TRY:
				TryExp tryExp = getFactory().createTryExp();

				EList<CatchExp> catchClause = tryExp.getCatchClause();
				EList<OclExpression> tryBody = tryExp.getTryBody();

				for (int i = 0; i < tree.getChildCount(); i++) {
					exp = walk(tree.getChild(i));

					if (exp instanceof CatchExp) {
						catchClause.add((CatchExp)exp);
					}
					else {
						tryBody.add(exp);
					}
				}

				oclExpression = tryExp;

				break;

			case IoclParser.VAR:
				VariableInitExp variableInitExp =
					getFactory().createVariableInitExp();

				VariableExp variableExp = (VariableExp)walk(tree.getChild(0));

				Variable referredVariable = variableExp.getReferredVariable();

				variableInitExp.setReferredVariable(referredVariable);

				oclExpression = variableInitExp;

				break;

			case IoclParser.VARIABLE:
				Variable variable = getFactory().createVariable();

				variable.setName(tree.getChild(0).getText());

				for (int i = 1; i < tree.getChildCount(); i++) {
					exp = walk(tree.getChild(i));

					if (exp instanceof TypeExp) {
						typeExp = (TypeExp)exp;

						variable.setType(typeExp.getReferredType());
					}
					else {
						variable.setInitExpression(exp);
					}
				}

				variableExp = getFactory().createVariableExp();

				variableExp.setReferredVariable(variable);

				oclExpression = variableExp;

				break;

			case IoclParser.WHILE:
				WhileExp whileExp = getFactory().createWhileExp();

				whileExp.setCondition(walk(tree.getChild(0)));
				whileExp.setBody(walk(tree.getChild(1)));

				oclExpression = whileExp;

				break;
		}

		return oclExpression;
	}

	protected OperationCallExp createNumericOperationCallExp(
		String numericOperaration) {

		IntegerLiteralExp integerLiteralExp =
			getFactory().createIntegerLiteralExp();

		int index = numericOperaration.indexOf('.');

		String integerSymbol = numericOperaration.substring(0, index);

		integerLiteralExp.setIntegerSymbol(Integer.parseInt(integerSymbol));

		OperationCallExp operationCallExp =
			getFactory().createOperationCallExp();

		operationCallExp.setSource(integerLiteralExp);

		String operationName = numericOperaration.substring(index + 1);

		operationCallExp.setOperationCode(
			Operation.toOperationCode(operationName));

		return operationCallExp;
	}

	protected CollectionType getCollectionType(CollectionKind collectionKind) {
		switch (collectionKind) {
			case BAG:
				return getFactory().createBagType();

			case ORDERED_SET:
				return getFactory().createOrderedSetType();

			case SEQUENCE:
				return getFactory().createSequenceType();

			default:
				return getFactory().createSetType();
		}
	}

	protected ImperativeOclFactory getFactory() {
		return ImperativeOclFactory.eINSTANCE;
	}

}