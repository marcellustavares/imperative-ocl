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

package org.orcas.iocl.util;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.expressions.imperativeocl.AltExp;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.BreakExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralPart;
import org.orcas.iocl.expressions.imperativeocl.ComputeExp;
import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
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
import org.orcas.iocl.expressions.imperativeocl.SwitchExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.TypeExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.expressions.util.Visitable;

public abstract class AbstractVisitor<T> extends EAbstractVisitor<T> {

	public T visitAltExp(AltExp altExp) {
		T conditionResult = visit(altExp.getCondition());
		T bodyResult = visit(altExp.getBody());

		return handleAltExp(altExp, conditionResult, bodyResult);
	}

	public T visitAssignExp(AssignExp assignExp) {
		T leftResult = visit(assignExp.getLeft());

		T defaultValueResult = visit(assignExp.getDefaultValue());

		return handleAssignExp(assignExp, leftResult, defaultValueResult);
	}

	public T visitBlockExp(BlockExp blockExp) {
		List<T> bodyResults = new ArrayList<T>();

		List<OclExpression> body = blockExp.getBody();

		for (OclExpression bodyPart : body) {
			bodyResults.add(visit(bodyPart));
		}

		return handleBlockExp(blockExp, bodyResults);
	}

	public T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp) {
		return handleBooleanLiteralExp(booleanLiteralExp);
	}

	public T visitBreakExp(BreakExp breakExp) {
		return handleBreakExp(breakExp);
	}

	public T visitCollectionItem(CollectionItem collectionItem) {
		T collectionItemResult = visit(collectionItem.getItem());

		return handleCollectionItem(collectionItem, collectionItemResult);
	}

	public T visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		List<T> partResults = new ArrayList<T>();

		List<CollectionLiteralPart> parts = collectionLiteralExp.getPart();

		for (CollectionLiteralPart part : parts) {
			partResults.add(visit(part));
		}

		return handleCollectionLiteralExp(collectionLiteralExp, partResults);
	}

	public T visitComputeExp(ComputeExp computeExp) {
		return null;
	}

	public T visitContinueExp(ContinueExp continueExp) {
		return handleContinueExp(continueExp);
	}

	public T visitForExp(ForExp forExp) {
		return null;
	}

	public T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp) {
		return handleIntegerLiteralExp(integerLiteralExp);
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

		return handleIterateExp(
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

		return handleIteratorExp(
			iteratorExp, sourceResult, variableResults, bodyResult);
	}

	public T visitOperationCallExp(OperationCallExp operationCallExp) {
		T sourceResult = visit(operationCallExp.getSource());

		List<T> argResult = new ArrayList<T>();
		List<OclExpression> argument = operationCallExp.getArgument();

		for (OclExpression arg : argument) {
			argResult.add(visit(arg));
		}

		return handleOperationCallExp(
			operationCallExp, sourceResult, argResult);
	}

	public T visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		return null;
	}

	public T visitRaiseExp(RaiseExp raiseExp) {
		return null;
	}

	public T visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		return handleRealLiteralExp(realLiteralExp);
	}

	public T visitReturnExp(ReturnExp returnExp) {
		T returnResult = visit(returnExp.getValue());

		return handleReturnExp(returnExp, returnResult);
	}

	public T visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
		return handleStringLiteralExp(stringLiteralExp);
	}

	public T visitSwitchExp(SwitchExp switchExp) {
		List<T> altPartResults = new ArrayList<T>();
		List<AltExp> altParts = switchExp.getAlternativePart();

		for (AltExp altExp : altParts) {
			altPartResults.add(visit(altExp));
		}

		T elseResult = visit(switchExp.getElsePart());

		return handleSwitchExp(switchExp, altPartResults, elseResult);
	}


	public T visitTryExp(TryExp tryExp) {
		return null;
	}

	public T visitTypeExp(TypeExp typeExp) {
		return handleTypeExp(typeExp);
	}

	public T visitVariable(Variable variable) {
		T initResult = visit(variable.getInitExpression());

		return handleVariable(variable, initResult);
	}

	public T visitVariableExp(VariableExp variableExp) {
		Variable referredVariable = variableExp.getReferredVariable();

		return visit(referredVariable);
	}

	public T visitWhileExp(WhileExp whileExp) {
		return null;
	}

	protected abstract T handleAltExp(
		AltExp altExp, T conditionResult, T bodyResult);

	protected abstract T handleAssignExp(
		AssignExp assignExp, T leftResult, T defaultValueResult);

	protected abstract T handleBlockExp(BlockExp blockExp, List<T> bodyResults);

	protected abstract T handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp);

	protected abstract T handleBreakExp(BreakExp breakExp);

	protected abstract T handleCollectionItem(
		CollectionItem collectionItem, T collectionItemResult);

	protected abstract T handleCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp, List<T> partResults);

	protected abstract T handleComputeExp(ComputeExp computeExp);

	protected abstract T handleContinueExp(ContinueExp continueExp);

	protected abstract T handleForExp(ForExp forExp);

	protected abstract T handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp);

	protected abstract T handleIterateExp(
		IterateExp iterateExp, T sourceResult, List<T> variableResults,
		T resultResult, T bodyResult);

	protected abstract T handleIteratorExp(
		IteratorExp iteratorExp, T sourceResult, List<T> variableResults,
		T bodyResult);

	protected abstract T handleOperationCallExp(
		OperationCallExp operationCallExp, T sourceResult, List<T> argResult);

	protected abstract T handlePropertyCallExp(PropertyCallExp propertyCallExp);

	protected abstract T handleRaiseExp(RaiseExp raiseExp);

	protected abstract T handleRealLiteralExp(RealLiteralExp realLiteralExp);

	protected abstract T handleReturnExp(ReturnExp returnExp, T valueResult);

	protected abstract T handleStringLiteralExp(
		StringLiteralExp stringLiteralExp);

	protected abstract T handleSwitchExp(
		SwitchExp switchExp, List<T> altPartResults, T elseResult);

	protected abstract T handleTryExp(TryExp tryExp);

	protected abstract T handleTypeExp(TypeExp typeExp);

	protected abstract T handleVariable(Variable variable, T initResult);

	protected abstract T handleVariableInitExp(VariableInitExp variableInitExp);

	protected abstract T handleWhileExp(WhileExp whileExp);

	protected T visit(Visitable visitable) {
		if (visitable != null) {
			return visitable.accept(this);
		}
		else {
			return null;
		}
	}

}