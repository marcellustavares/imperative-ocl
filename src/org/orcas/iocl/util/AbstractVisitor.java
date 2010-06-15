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
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;
import org.orcas.iocl.expressions.util.Visitable;

public abstract class AbstractVisitor<T> extends EAbstractVisitor<T> {

	public T visitAssignExp(AssignExp assignExp) {
		T leftResult = visit(assignExp.getLeft());

		T defaultValueResult = visit(assignExp.getDefaultValue());

		return handleAssignExp(assignExp, leftResult, defaultValueResult);
	}

	public T visitBlockExp(BlockExp blockExp) {
		return null;
	}

	public T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp) {
		return handleBooleanLiteralExp(booleanLiteralExp);
	}

	public T visitBreakExp(BreakExp breakExp) {
		return null;
	}

	public T visitCollectionItem(CollectionItem collectionItem) {
		return null;
	}

	public T visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		return null;
	}

	public T visitComputeExp(ComputeExp computeExp) {
		return null;
	}

	public T visitContinueExp(ContinueExp continueExp) {
		return null;
	}

	public T visitForExp(ForExp forExp) {
		return null;
	}

	public T visitIfExp(IfExp ifExp) {
		return null;
	}

	public T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp) {
		return handleIntegerLiteralExp(integerLiteralExp);
	}

	public T visitIterateExp(IterateExp iterateExp) {
		return null;
	}

	public T visitIteratorExp(IteratorExp iteratorExp) {
		return null;
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

	public T visitTryExp(TryExp tryExp) {
		return null;
	}

	public T visitTypeExp(TypeExp typeExp) {
		return null;
	}

	public T visitVariable(Variable variable) {
		T initResult = visit(variable.getInitExpression());

		return handleVariable(variable, initResult);
	}

	public T visitVariableExp(VariableExp variableExp) {
		return visitVariable(variableExp.getReferredVariable());
	}

	public T visitVariableInitExp(VariableInitExp variableInitExp) {
		return null;
	}

	public T visitWhileExp(WhileExp whileExp) {
		return null;
	}

	protected abstract T handleAssignExp(
		AssignExp assignExp, T leftResult, T defaultValueResult);

	protected abstract T handleBlockExp(BlockExp blockExp);

	protected abstract T handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp);

	protected abstract T handleBreakExp(BreakExp breakExp);

	protected abstract T handleCollectionItem(CollectionItem collectionItem);

	protected abstract T handleCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp);

	protected abstract T handleComputeExp(ComputeExp computeExp);

	protected abstract T handleContinueExp(ContinueExp continueExp);

	protected abstract T handleForExp(ForExp forExp);

	protected abstract T handleIfExp(IfExp ifExp);

	protected abstract T handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp);

	protected abstract T handleIterateExp(IterateExp iterateExp);

	protected abstract T handleIteratorExp(IteratorExp iteratorExp);

	protected abstract T handleOperationCallExp(
		OperationCallExp operationCallExp, T sourceResult, List<T> argResult);

	protected abstract T handlePropertyCallExp(PropertyCallExp propertyCallExp);

	protected abstract T handleRaiseExp(RaiseExp raiseExp);

	protected abstract T handleRealLiteralExp(RealLiteralExp realLiteralExp);

	protected abstract T handleReturnExp(ReturnExp returnExp, T valueResult);

	protected abstract T handleStringLiteralExp(
		StringLiteralExp stringLiteralExp);

	protected abstract T handleTryExp(TryExp tryExp);

	protected abstract T handleVariable(Variable variable, T initResult);

	protected abstract T handleVariableExp(VariableExp variableExp);

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