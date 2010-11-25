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

package org.orcas.ioclgenerator;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.expression.emof.Type;
import org.orcas.iocl.expression.imperativeocl.AltExp;
import org.orcas.iocl.expression.imperativeocl.AssignExp;
import org.orcas.iocl.expression.imperativeocl.BlockExp;
import org.orcas.iocl.expression.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expression.imperativeocl.BreakExp;
import org.orcas.iocl.expression.imperativeocl.CatchExp;
import org.orcas.iocl.expression.imperativeocl.CollectionItem;
import org.orcas.iocl.expression.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expression.imperativeocl.CollectionLiteralPart;
import org.orcas.iocl.expression.imperativeocl.ComputeExp;
import org.orcas.iocl.expression.imperativeocl.ContinueExp;
import org.orcas.iocl.expression.imperativeocl.EnumLiteralExp;
import org.orcas.iocl.expression.imperativeocl.ForExp;
import org.orcas.iocl.expression.imperativeocl.InstantiationExp;
import org.orcas.iocl.expression.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expression.imperativeocl.IterateExp;
import org.orcas.iocl.expression.imperativeocl.IteratorExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;
import org.orcas.iocl.expression.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expression.imperativeocl.RaiseExp;
import org.orcas.iocl.expression.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expression.imperativeocl.ReturnExp;
import org.orcas.iocl.expression.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expression.imperativeocl.SwitchExp;
import org.orcas.iocl.expression.imperativeocl.TryExp;
import org.orcas.iocl.expression.imperativeocl.TypeExp;
import org.orcas.iocl.expression.imperativeocl.Variable;
import org.orcas.iocl.expression.imperativeocl.VariableExp;
import org.orcas.iocl.expression.imperativeocl.VariableInitExp;
import org.orcas.iocl.expression.imperativeocl.WhileExp;
import org.orcas.ioclengine.helper.EAbstractVisitor;

public class Visitor<T> extends EAbstractVisitor<T> {

	public Visitor(Handler<T> handler) {
		_handler = handler;
	}

	public T visitAltExp(AltExp altExp) {
		T conditionResult = visit(altExp.getCondition());
		T bodyResult = visit(altExp.getBody());

		return _handler.handleAltExp(altExp, conditionResult, bodyResult);
	}

	public T visitAssignExp(AssignExp assignExp) {
		T leftResult = visit(assignExp.getLeft());

		T defaultValueResult = visit(assignExp.getDefaultValue());

		return _handler.handleAssignExp(
			assignExp, leftResult, defaultValueResult);
	}

	public T visitBlockExp(BlockExp blockExp) {
		List<T> bodyResults = new ArrayList<T>();

		List<OclExpression> body = blockExp.getBody();

		for (OclExpression bodyPart : body) {
			bodyResults.add(visit(bodyPart));
		}

		return _handler.handleBlockExp(blockExp, bodyResults);
	}

	public T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp) {
		return _handler.handleBooleanLiteralExp(booleanLiteralExp);
	}

	public T visitBreakExp(BreakExp breakExp) {
		return _handler.handleBreakExp(breakExp);
	}

	public T visitCatchExp(CatchExp catchExp) {
		List<T> typeResults = new ArrayList<T>();

		List<Type> exceptions = catchExp.getException();

		for (Type exception : exceptions) {
			typeResults.add(_handler.handleType(exception));
		}

		List<T> bodyResults = new ArrayList<T>();

		List<OclExpression> body = catchExp.getBody();

		for (OclExpression bodyPart : body) {
			bodyResults.add(visit(bodyPart));
		}

		return _handler.handleCatchExp(catchExp, typeResults, bodyResults);
	}

	public T visitCollectionItem(CollectionItem collectionItem) {
		T collectionItemResult = visit(collectionItem.getItem());

		return _handler.handleCollectionItem(collectionItem, collectionItemResult);
	}

	public T visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		List<T> partResults = new ArrayList<T>();

		List<CollectionLiteralPart> parts = collectionLiteralExp.getPart();

		for (CollectionLiteralPart part : parts) {
			partResults.add(visit(part));
		}

		return _handler.handleCollectionLiteralExp(
			collectionLiteralExp, partResults);
	}

	public T visitComputeExp(ComputeExp computeExp) {
		T variableResult = visit(computeExp.getReturnedElement());

		T bodyResult = visit(computeExp.getBody());

		return _handler.handleComputeExp(
			computeExp, variableResult, bodyResult);
	}

	public T visitContinueExp(ContinueExp continueExp) {
		return _handler.handleContinueExp(continueExp);
	}

	public T visitEnumLiteralExp(EnumLiteralExp enumLiteralExp) {
		return _handler.handleEnumLiteralExp(enumLiteralExp);
	}

	public T visitForExp(ForExp forExp) {
		T conditionResult = visit(forExp.getCondition());
		T bodyResult = visit(forExp.getBody());

		List<T> variableResults = new ArrayList<T>();

		List<Variable> variables = forExp.getIterator();

		for (Variable variable : variables) {
			variableResults.add(visit(variable));
		}

		T sourceResult = visit(forExp.getSource());

		return _handler.handleForExp(
			forExp, conditionResult, bodyResult, variableResults, sourceResult);
	}

	public T visitInstantiationExp(InstantiationExp instantiationExp) {
		org.orcas.iocl.expression.emof.Class instantiatedClass =
			instantiationExp.getInstantiatedClass();

		List<T> packageResults = new ArrayList<T>();

		org.orcas.iocl.expression.emof.Package classPackage =
			instantiatedClass.getPackage();

		if (classPackage != null) {
			List<org.orcas.iocl.expression.emof.Package> nestedPackages =
				classPackage.getNestedPackage();

			for (org.orcas.iocl.expression.emof.Package nestedPackage :
				 nestedPackages) {

				packageResults.add(_handler.handlePackage(nestedPackage));
			}

			packageResults.add(_handler.handlePackage(classPackage));
		}

		List<T> argumentResults = new ArrayList<T>();

		List<OclExpression> arguments = instantiationExp.getArgument();

		for (OclExpression argument : arguments) {
			argumentResults.add(visit(argument));
		}

		return _handler.handleInstantiationExp(
			instantiationExp, instantiatedClass.getName(), packageResults,
			argumentResults);
	}


	public T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp) {
		return _handler.handleIntegerLiteralExp(integerLiteralExp);
	}

	public T visitIterateExp(IterateExp iterateExp) {
		T sourceResult = visit(iterateExp.getSource());

		List<T> variableResults = new ArrayList<T>();

		List<Variable> variables = iterateExp.getIterator();

		for (Variable variable : variables) {
			variableResults.add(visit(variable));
		}

		T resultResult = visit(iterateExp.getResult());
		T bodyResult = visit(iterateExp.getBody());

		return _handler.handleIterateExp(
			iterateExp, sourceResult, variableResults, resultResult,
			bodyResult);
	}

	public T visitIteratorExp(IteratorExp iteratorExp) {
		T sourceResult = visit(iteratorExp.getSource());

		List<T> variableResults = new ArrayList<T>();

		List<Variable> variables = iteratorExp.getIterator();

		for (Variable variable : variables) {
			variableResults.add(visit(variable));
		}

		T bodyResult = visit(iteratorExp.getBody());

		return _handler.handleIteratorExp(
			iteratorExp, sourceResult, variableResults, bodyResult);
	}

	public T visitOperationCallExp(OperationCallExp operationCallExp) {
		T sourceResult = visit(operationCallExp.getSource());

		List<T> argResults = new ArrayList<T>();
		List<OclExpression> argument = operationCallExp.getArgument();

		for (OclExpression arg : argument) {
			argResults.add(visit(arg));
		}

		return _handler.handleOperationCallExp(
			operationCallExp, sourceResult, argResults);
	}

	public T visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		T sourceResult = visit(propertyCallExp.getSource());

		return _handler.handlePropertyCallExp(propertyCallExp, sourceResult);
	}

	public T visitRaiseExp(RaiseExp raiseExp) {
		T typeResult = null;

		if (raiseExp.getException() != null) {
			typeResult = _handler.handleType(raiseExp.getException());
		}

		return _handler.handleRaiseExp(raiseExp, typeResult);
	}

	public T visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		return _handler.handleRealLiteralExp(realLiteralExp);
	}

	public T visitReturnExp(ReturnExp returnExp) {
		T returnResult = visit(returnExp.getValue());

		return _handler.handleReturnExp(returnExp, returnResult);
	}

	public T visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
		return _handler.handleStringLiteralExp(stringLiteralExp);
	}

	public T visitSwitchExp(SwitchExp switchExp) {
		List<T> altPartResults = new ArrayList<T>();

		List<AltExp> altParts = switchExp.getAlternativePart();

		for (AltExp altExp : altParts) {
			altPartResults.add(visit(altExp));
		}

		T elseResult = visit(switchExp.getElsePart());

		return _handler.handleSwitchExp(switchExp, altPartResults, elseResult);
	}


	public T visitTryExp(TryExp tryExp) {
		List<T> bodyResults = new ArrayList<T>();

		List<OclExpression> body = tryExp.getTryBody();

		for (OclExpression bodyPart : body) {
			bodyResults.add(visit(bodyPart));
		}

		List<T> catchResults = new ArrayList<T>();

		List<CatchExp> catchClauses = tryExp.getCatchClause();

		for (CatchExp catchExp : catchClauses) {
			catchResults.add(visit(catchExp));
		}

		return _handler.handleTryExp(tryExp, bodyResults, catchResults);
	}

	public T visitTypeExp(TypeExp typeExp) {
		return _handler.handleTypeExp(typeExp);
	}

	public T visitVariable(Variable variable) {
		T initResult = visit(variable.getInitExpression());

		return _handler.handleVariable(variable, initResult);
	}

	public T visitVariableExp(VariableExp variableExp) {
		Variable referredVariable = variableExp.getReferredVariable();

		return visit(referredVariable);
	}

	public T visitVariableInitExp(VariableInitExp variableInitExp) {
		Variable referredVarible = variableInitExp.getReferredVariable();

		return visitVariable(referredVarible);
	}

	public T visitWhileExp(WhileExp whileExp) {
		T conditionResult = visit(whileExp.getCondition());

		T bodyResult = visit(whileExp.getBody());

		return _handler.handleWhileExp(whileExp, conditionResult, bodyResult);
	}

	private Handler<T> _handler;

}