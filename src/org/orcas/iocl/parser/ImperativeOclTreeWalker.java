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
import org.orcas.iocl.exp.AltExp;
import org.orcas.iocl.exp.AssignExp;
import org.orcas.iocl.exp.BlockExp;
import org.orcas.iocl.exp.BooleanLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralPart;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionType;
import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.exp.ImperativeExp;
import org.orcas.iocl.exp.IntegerLiteralExp;
import org.orcas.iocl.exp.IterateExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.PathName;
import org.orcas.iocl.exp.PrimitiveType;
import org.orcas.iocl.exp.RaiseExp;
import org.orcas.iocl.exp.RealLiteralExp;
import org.orcas.iocl.exp.ReturnExp;
import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.SimpleTypeEnum;
import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.exp.SwitchExp;
import org.orcas.iocl.exp.Type;
import org.orcas.iocl.exp.Variable;
import org.orcas.iocl.exp.VariableInitExp;
import org.orcas.iocl.exp.WhileExp;
import org.orcas.iocl.exp.impl.AltExpImpl;
import org.orcas.iocl.exp.impl.AssignExpImpl;
import org.orcas.iocl.exp.impl.BlockExpImpl;
import org.orcas.iocl.exp.impl.BooleanLiteralExpImpl;
import org.orcas.iocl.exp.impl.BreakExpImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralExpImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralPartImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralPartsImpl;
import org.orcas.iocl.exp.impl.CollectionTypeIdentifierImpl;
import org.orcas.iocl.exp.impl.CollectionTypeImpl;
import org.orcas.iocl.exp.impl.ContinueExpImpl;
import org.orcas.iocl.exp.impl.IntegerLiteralExpImpl;
import org.orcas.iocl.exp.impl.IterateExpImpl;
import org.orcas.iocl.exp.impl.OperationCallExpImpl;
import org.orcas.iocl.exp.impl.PathNameImpl;
import org.orcas.iocl.exp.impl.PrimitiveTypeImpl;
import org.orcas.iocl.exp.impl.RaiseExpImpl;
import org.orcas.iocl.exp.impl.RealLiteralExpImpl;
import org.orcas.iocl.exp.impl.ReturnExpImpl;
import org.orcas.iocl.exp.impl.SimpleNameImpl;
import org.orcas.iocl.exp.impl.StringLiteralExpImpl;
import org.orcas.iocl.exp.impl.SwitchExpImpl;
import org.orcas.iocl.exp.impl.VariableImpl;
import org.orcas.iocl.exp.impl.VariableInitExpImpl;
import org.orcas.iocl.exp.impl.WhileExpImpl;
import org.orcas.iocl.parser.antlr.IoclParser;
import org.orcas.iocl.util.OperationCode;

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

				OperationCallExp opCallExp = createOperationCallExp(
					operationCode, walk(tree.getChild(0)));

				if (tree.getChildCount() > 1) {
					opCallExp.addArgument(walk(tree.getChild(1)));
				}

				oclExpression = opCallExp;

				break;

			case IoclParser.DOT:
			case IoclParser.ARROW:
				operationCode = OperationCode.fromLabel(
					tree.getChild(1).getText());

				opCallExp = createOperationCallExp(
					operationCode, walk(tree.getChild(0)));

				for (int i = 2; i < tree.getChildCount(); i++) {
					opCallExp.addArgument(walk(tree.getChild(i)));
				}

				oclExpression = opCallExp;

				break;

			case IoclParser.ITERATE:
				IterateExp iterateExp = createIterateExp(
					walk(tree.getChild(0)));

				for (int i = 1; i < tree.getChildCount(); i++) {
					OclExpression exp = walk(tree.getChild(i));
					
					if (exp instanceof Variable) {
						iterateExp.addIterator((Variable)exp);
					}
					else {
						iterateExp.setBody(exp);
					}
				}

				oclExpression = iterateExp;

				break;

			case IoclParser.VARIABLE:
				Variable variable = new VariableImpl();

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

				oclExpression = variable;

				break;

			case IoclParser.BOOLEAN_LITERAL:
				oclExpression = createBooleanLiteralExp(
					tree.getText());

				break;

		  case IoclParser.COLLECTION_LITERAL:
				CollectionLiteralExp collectionLiteralExp =
					createCollectionLiteralExp(walk(tree.getChild(0)));

				if (tree.getChildCount() > 1) {
					collectionLiteralExp.setCollectionLiteralParts(
						walk(tree.getChild(1)));
				}

				oclExpression = collectionLiteralExp;

				break;

			case IoclParser.COLLECTION_LITERAL_PARTS:
				CollectionLiteralParts collectionLiteralParts =
					new CollectionLiteralPartsImpl();

				for (int i = 0; i < tree.getChildCount(); i++) {
					collectionLiteralParts.addPart(
						createCollectionLiteralPart(walk(tree.getChild(i))));
				}

				oclExpression = collectionLiteralParts;

				break;

			case IoclParser.COLLECTION_TYPE_LITERAL:
				oclExpression = createCollectionTypeIdentifier(tree.getText());

				break;

			case IoclParser.PRIMITIVE_TYPE_LITERAL:
				oclExpression = createPrimitiveType(tree.getText());

				break;

			case IoclParser.IDENTIFIER:
				oclExpression = createSimpleName(
					SimpleTypeEnum.IDENTIFIER, tree.getText());

				break;

			case IoclParser.INTEGER_LITERAL:
				oclExpression = createIntegerLiteralExp(
					tree.getText());

				break;

			case IoclParser.NUMERIC_OPERATION:
				OperationCallExp operationCallExp =
					createNumericOperationCallExp(tree.getText());

				for (int i = 0; i < tree.getChildCount(); i++) {
					operationCallExp.addArgument(walk(tree.getChild(i)));
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

			case IoclParser.COLLECTION_TYPE:
				CollectionType collectionType =
					createCollectionType(walk(tree.getChild(0)));

				Type type = (Type) walk(tree.getChild(1));

				collectionType.setType(type);

				oclExpression = collectionType;

				break;

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
		}

		return oclExpression;
	}

	protected AltExp createAltExp(OclExpression condition) {
		AltExp altExp = new AltExpImpl();

		altExp.setCondition(condition);

		return altExp;
	}

	protected AssignExp createAssignExp(SimpleName simpleName) {
		AssignExp assignExp = new AssignExpImpl();

		assignExp.setLeft(simpleName);

		return assignExp;
	}

	protected BooleanLiteralExp createBooleanLiteralExp(String booleanSymbol) {
		BooleanLiteralExp booleanLiteralExp = new BooleanLiteralExpImpl();
		booleanLiteralExp.setBooleanSymbol(Boolean.parseBoolean(booleanSymbol));

		return booleanLiteralExp;
	}

	protected CollectionLiteralExp createCollectionLiteralExp(
		OclExpression collectionTypeIdentifierCS) {

		CollectionLiteralExp collectionLiteralExp =
			new CollectionLiteralExpImpl();

		collectionLiteralExp.setCollectionKind(
			(CollectionTypeIdentifier) collectionTypeIdentifierCS);

		return collectionLiteralExp;
	}

	protected CollectionLiteralPart createCollectionLiteralPart(
		OclExpression oclExpressionCS) {

		CollectionLiteralPartImpl part = new CollectionLiteralPartImpl();

		part.setOCLExpresion(oclExpressionCS);

		return part;
	}

	protected CollectionType createCollectionType(
		OclExpression collectionTypeIdentifier) {

		CollectionType collectionType = new CollectionTypeImpl();

		collectionType.setCollectionTypeIdentifier(
			(CollectionTypeIdentifier) collectionTypeIdentifier);

		return collectionType;
	}

	protected CollectionTypeIdentifier createCollectionTypeIdentifier(
		String type) {

		CollectionTypeIdentifier identifier =
			new CollectionTypeIdentifierImpl();

		identifier.setCollectionType(type);

		return identifier;
	}

	protected PrimitiveType createPrimitiveType(String type) {
		PrimitiveType primitiveType = new PrimitiveTypeImpl();

		primitiveType.setSimpleType(SimpleTypeEnum.get(type));

		return primitiveType;
	}

	protected IntegerLiteralExp createIntegerLiteralExp(String integerSymbol) {
		IntegerLiteralExp integerLiteralExp = new IntegerLiteralExpImpl();

		integerLiteralExp.setIntegerSymbol(Integer.parseInt(integerSymbol));

		return integerLiteralExp;
	}
	
	protected IterateExp createIterateExp(OclExpression source) {
		IterateExp iterateExp = new IterateExpImpl();

		iterateExp.setSource(source);

		return iterateExp;
	}

	protected OperationCallExp createNumericOperationCallExp(
		String numericOperaration) {

		OperationCallExp operationCallExp = new OperationCallExpImpl();

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

		OperationCallExp operationCallExp = new OperationCallExpImpl();

		operationCallExp.setOperationCode(operationCode);
		operationCallExp.setSource(source);

		return operationCallExp;
	}

	protected RaiseExp createRaiseExp(OclExpression oclExpression) {
		RaiseExp raiseExp = new RaiseExpImpl();

		if (oclExpression instanceof Type) {
			raiseExp.setException((Type) oclExpression);
		}
		else {
			StringLiteralExp stringLiteralExp =
				(StringLiteralExp) oclExpression;

			raiseExp.setExceptionMessage(stringLiteralExp.getStringSymbol());
		}

		return raiseExp;
	}

	protected RealLiteralExp createRealLiteralExp(String realSymbol) {
		RealLiteralExp realLiteralExp = new RealLiteralExpImpl();
		realLiteralExp.setRealSymbol(Double.parseDouble(realSymbol));

		return realLiteralExp;
	}

	protected StringLiteralExp createStringLiteralExp(String stringSymbol) {
		StringLiteralExp stringLiteralExp = new StringLiteralExpImpl();
		stringLiteralExp.setStringSymbol(stringSymbol);

		return stringLiteralExp;
	}

	protected SimpleName createSimpleName(SimpleTypeEnum type, String value) {
		SimpleName simpleName = new SimpleNameImpl();

		simpleName.setSimpleType(type);
		simpleName.setValue(value);

		return simpleName;
	}

	protected VariableInitExp createVariableInitExp(String varName) {
		VariableInitExp variableInitExp = new VariableInitExpImpl();

		variableInitExp.setVarName(varName);

		return variableInitExp;
	}

	protected WhileExp createWhileExp(OclExpression condition) {
		WhileExp whileExp = new WhileExpImpl();

		whileExp.setCondition(condition);

		return whileExp;
	}

}