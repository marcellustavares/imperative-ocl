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
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionKind;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralPart;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.ImperativeOclFactory;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.parser.antlr.IoclParser;
import org.orcas.iocl.util.OperationCode;
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
				int operationCode = OperationCode.fromLabel(tree.getText());

				OperationCallExp operationCallExp = createOperationCallExp(
					operationCode, walk(tree.getChild(0)));

				EList<OclExpression> argument = operationCallExp.getArgument();

				if (tree.getChildCount() > 1) {
					argument.add(walk(tree.getChild(1)));
				}

				oclExpression = operationCallExp;

				break;

			case IoclParser.DOT:
			case IoclParser.ARROW:
				operationCode = OperationCode.fromLabel(
					tree.getChild(1).getText());

				operationCallExp = createOperationCallExp(
					operationCode, walk(tree.getChild(0)));

				argument = operationCallExp.getArgument();

				for (int i = 2; i < tree.getChildCount(); i++) {
					argument.add(walk(tree.getChild(i)));
				}

				oclExpression = operationCallExp;

				break;

			case IoclParser.ITERATE:
				IterateExp iterateExp = createIterateExp(
					walk(tree.getChild(0)));

				EList<Variable> iterator = iterateExp.getIterator();

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
				IteratorExp iteratorExp = createIteratorExp(
					walk(tree.getChild(0)));

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

			case IoclParser.VARIABLE:
				Variable variable = createVariable();

				variable.setName(tree.getChild(0).getText());

				for (int i = 1; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof Type) {
						variable.setType((Type)exp);
					}
					else {
						variable.setInitExpression(exp);
					}
				}

				oclExpression = createVariableExp(variable);

				break;

			case IoclParser.BOOLEAN_LITERAL:
				oclExpression = createBooleanLiteralExp(
					tree.getText());

				break;

			case IoclParser.COLLECTION_LITERAL:
				Tree kind = tree.getChild(0);

				CollectionKind collectionKind = CollectionKind.get(
					kind.getText());

				CollectionLiteralExp collectionLiteralExp =
					createCollectionLiteralExp(collectionKind);

				EList<CollectionLiteralPart> part =
					collectionLiteralExp.getPart();

				for (int i = 1; i < tree.getChildCount(); i++) {
					part.add(createCollectionItem(walk(tree.getChild(i))));
				}

				oclExpression = collectionLiteralExp;

				break;

			case IoclParser.INTEGER_LITERAL:
				oclExpression = createIntegerLiteralExp(
					tree.getText());

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

			case IoclParser.REAL_LITERAL:
				oclExpression = createRealLiteralExp(
					tree.getText());

				break;

			case IoclParser.STRING_LITERAL:
				oclExpression = createStringLiteralExp(
					tree.getText());

				break;
/*
			case IoclParser.DO:
				BlockExp blockExp = new BlockExpImpl();

				for (int i = 0; i < tree.getChildCount(); i++) {
					blockExp.addExpression(walk(tree.getChild(i)));
				}

				oclExpression = blockExp;

				break;

			case IoclParser.VAR:
				VariableInitExp variableInitExp =
					createVariableInitExp(tree.getChild(0).getText());

				if (tree.getChildCount() > 2) {
					variableInitExp.setType((Type)walk(tree.getChild(1)));
					variableInitExp.setVarValue(walk(tree.getChild(2)));
				}
				else {
					variableInitExp.setVarValue(walk(tree.getChild(1)));
				}

				oclExpression = variableInitExp;

				break;

			case IoclParser.BREAK:
				oclExpression = new BreakExpImpl();

				break;
			case IoclParser.CONTINUE:
				oclExpression = new ContinueExpImpl();

				break;

			case IoclParser.RETURN:
				ReturnExp returnExp = new ReturnExpImpl();

				if (tree.getChildCount() > 0) {
					returnExp.setOclExpression(walk(tree.getChild(0)));
				}

				oclExpression = returnExp;

				break;

			case IoclParser.APPEND:
			case IoclParser.IS:
				SimpleName simpleName = createSimpleName(
					SimpleTypeEnum.IDENTIFIER, tree.getChild(0).getText());

				AssignExp assignExp = createAssignExp(simpleName);

				assignExp.setReset(tree.getType() == IoclParser.IS);
				assignExp.setValue(walk(tree.getChild(1)));

				oclExpression = assignExp;

				break;

			case IoclParser.RAISE:
				oclExpression = createRaiseExp(walk(tree.getChild(0)));

				break;

			case IoclParser.SCOPE:
				PathName pathName = new PathNameImpl();

				for (int i = 0; i < tree.getChildCount(); i++) {
					pathName.addName(tree.getChild(i).getText());
				}

				oclExpression = pathName;

				break;
			case IoclParser.WHILE:
				WhileExp whileExp = createWhileExp(walk(tree.getChild(0)));

				for (int i = 1; i < tree.getChildCount(); i++) {
					whileExp.addBodyExpression(
						(ImperativeExp) walk(tree.getChild(i)));
				}

				oclExpression = whileExp;

				break;

			case IoclParser.IF:
				SwitchExp switchExp = new SwitchExpImpl();

				for (int i = 0; i < tree.getChildCount(); i++) {
					OclExpression expression = walk(tree.getChild(i));

					if (expression instanceof AltExp) {
						switchExp.addAlternativePart((AltExp) expression);

					}
					else {
						switchExp.addElsePart((ImperativeExp) expression);
					}
				}

				oclExpression = switchExp;

				break;

			case IoclParser.ALT_EXP:
				AltExp altExp = createAltExp(walk(tree.getChild(0)));

				for (int i = 1; i < tree.getChildCount(); i++) {
					altExp.addBodyExpression(
						(ImperativeExp) walk(tree.getChild(i)));
				}

				oclExpression = altExp;

				break;

			case IoclParser.TRY:
				TryExp tryExp = createTryExp();

				boolean isExceptBody = false;

				for (int i = 0; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof Type) {
						tryExp.addException((Type)exp);
						isExceptBody = true;
					}
					else if (isExceptBody) {
						tryExp.addExceptExpression(exp);
					}
					else {
						tryExp.addTryExpression(exp);
					}
				}

				oclExpression = tryExp;

				break;

			case IoclParser.FOR:
				ForExp forExp = createForExp(tree.getChild(0).getText());

				forExp.setSource(walk(tree.getChild(1)));

				for (int i = 2; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));

					if (exp instanceof Variable) {
						forExp.addIterator((Variable)exp);
					}
					else if (exp instanceof ImperativeExp) {
						forExp.setBody(exp);
					}
					else {
						forExp.setCondition(exp);
					}
				}

				oclExpression = forExp;

				break;
				*/
		}

		return oclExpression;
	}

	protected AltExp createAltExp(OclExpression condition) {
		AltExp altExp = ImperativeOclFactory.eINSTANCE.createAltExp();

		altExp.setCondition(condition);

		return altExp;
	}

	protected AssignExp createAssignExp(OclExpression left) {
		AssignExp assignExp = ImperativeOclFactory.eINSTANCE.createAssignExp();

		assignExp.setLeft(left);

		return assignExp;
	}

	protected BooleanLiteralExp createBooleanLiteralExp(String booleanSymbol) {
		BooleanLiteralExp booleanLiteralExp =
			ImperativeOclFactory.eINSTANCE.createBooleanLiteralExp();

		booleanLiteralExp.setBooleanSymbol(Boolean.parseBoolean(booleanSymbol));

		return booleanLiteralExp;
	}

	protected CollectionLiteralExp createCollectionLiteralExp(
		CollectionKind collectionKind) {

		CollectionLiteralExp collectionLiteralExp =
			ImperativeOclFactory.eINSTANCE.createCollectionLiteralExp();

		collectionLiteralExp.setKind(collectionKind);

		return collectionLiteralExp;
	}

	protected CollectionItem createCollectionItem(OclExpression item) {
		CollectionItem collectionItem =
			ImperativeOclFactory.eINSTANCE.createCollectionItem();

		collectionItem.setItem(item);

		return collectionItem;
	}

	protected ForExp createForExp(String name) {
		ForExp forExp = ImperativeOclFactory.eINSTANCE.createForExp();

		forExp.setName(name);

		return forExp;
	}

	protected PrimitiveType createPrimitiveType(String name) {
		PrimitiveType primitiveType =
			EmofFactory.eINSTANCE.createPrimitiveType();

		primitiveType.setName(name);

		return primitiveType;
	}

	protected IntegerLiteralExp createIntegerLiteralExp(String integerSymbol) {
		IntegerLiteralExp integerLiteralExp =
			ImperativeOclFactory.eINSTANCE.createIntegerLiteralExp();

		integerLiteralExp.setIntegerSymbol(Integer.parseInt(integerSymbol));

		return integerLiteralExp;
	}

	protected IterateExp createIterateExp(OclExpression source) {
		IterateExp iterateExp =
			ImperativeOclFactory.eINSTANCE.createIterateExp();

		iterateExp.setSource(source);

		return iterateExp;
	}

	protected IteratorExp createIteratorExp(OclExpression source) {
		IteratorExp iteratorExp =
			ImperativeOclFactory.eINSTANCE.createIteratorExp();

		iteratorExp.setSource(source);

		return iteratorExp;
	}

	protected OperationCallExp createNumericOperationCallExp(
		String numericOperaration) {

		OperationCallExp operationCallExp =
			ImperativeOclFactory.eINSTANCE.createOperationCallExp();

		int index = numericOperaration.indexOf('.');
		String integerSymbol = numericOperaration.substring(0, index);

		IntegerLiteralExp integerLiteralExp = createIntegerLiteralExp(
			integerSymbol);

		operationCallExp.setSource(integerLiteralExp);

		String label = numericOperaration.substring(index + 1);

		operationCallExp.setOperationCode(OperationCode.fromLabel(label));

		return operationCallExp;
	}

	protected OperationCallExp createOperationCallExp(
		int operationCode, OclExpression source) {

		OperationCallExp operationCallExp =
			ImperativeOclFactory.eINSTANCE.createOperationCallExp();

		operationCallExp.setOperationCode(operationCode);
		operationCallExp.setSource(source);

		return operationCallExp;
	}

	protected RaiseExp createRaiseExp(OclExpression oclExpression) {
		RaiseExp raiseExp = ImperativeOclFactory.eINSTANCE.createRaiseExp();

		if (oclExpression instanceof Type) {
			raiseExp.setException((Type) oclExpression);
		}
		else {
			StringLiteralExp stringLiteralExp =
				(StringLiteralExp) oclExpression;

			//raiseExp.setExceptionMessage(stringLiteralExp.getStringSymbol());
		}

		return raiseExp;
	}

	protected RealLiteralExp createRealLiteralExp(String realSymbol) {
		RealLiteralExp realLiteralExp =
			ImperativeOclFactory.eINSTANCE.createRealLiteralExp();

		realLiteralExp.setRealSymbol(Double.parseDouble(realSymbol));

		return realLiteralExp;
	}

	protected StringLiteralExp createStringLiteralExp(String stringSymbol) {
		StringLiteralExp stringLiteralExp =
			ImperativeOclFactory.eINSTANCE.createStringLiteralExp();

		stringLiteralExp.setStringSymbol(StringUtil.unescape(stringSymbol));

		return stringLiteralExp;
	}

	protected TryExp createTryExp() {
		return ImperativeOclFactory.eINSTANCE.createTryExp();
	}

	protected Variable createVariable() {
		return ImperativeOclFactory.eINSTANCE.createVariable();
	}

	protected VariableExp createVariableExp(Variable variable) {
		VariableExp variableExp =
			ImperativeOclFactory.eINSTANCE.createVariableExp();

		variableExp.setReferredVariable(variable);

		return variableExp;
	}

	protected VariableInitExp createVariableInitExp(String name) {
		VariableInitExp variableInitExp =
			ImperativeOclFactory.eINSTANCE.createVariableInitExp();

		variableInitExp.setName(name);

		return variableInitExp;
	}

	protected WhileExp createWhileExp(OclExpression condition) {
		WhileExp whileExp = ImperativeOclFactory.eINSTANCE.createWhileExp();

		whileExp.setCondition(condition);

		return whileExp;
	}

}