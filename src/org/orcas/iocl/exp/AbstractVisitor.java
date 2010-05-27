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

package org.orcas.iocl.exp;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractVisitor<T> implements Visitor<T> {

	public final T visitAssignExp(AssignExp assignExp) {
		return null;
	}

	public final T visitBlockExp(BlockExp blockExp) {
		return null;
	}

	public final T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp) {
		return handleBooleanLiteralExp(booleanLiteralExp);
	}

	public final T visitBreakExp(BreakExp breakExp) {
		return null;
	}

	public final T visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		return null;
	}

	public final T visitCollectionLiteralPart(
		CollectionLiteralPart collectionLiteralPart) {

		return null;
	}

	public final T visitCollectionLiteralParts(
		CollectionLiteralParts collectionLiteralParts) {

		return null;
	}

	public final T visitContinueExp(ContinueExp continueExp) {
		return null;
	}

	public final T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp) {
		return handleIntegerLiteralExp(integerLiteralExp);
	}

	public final T visitOperationCallExp(OperationCallExp operationCallExp) {
		OclExpression source = operationCallExp.getSource();

		T sourceResult = _visit(source);

		List<T> argumentsResult = new ArrayList<T>();

		for (OclExpression argument : operationCallExp.getArguments()) {
			argumentsResult.add(_visit(argument));
		}

		return handleOperationCallExp(
			operationCallExp, sourceResult, argumentsResult);
	}

	public final T visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		return null;
	}

	public final T visitRaiseExp(RaiseExp raiseExp) {
		return null;
	}

	public final T visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		return handleRealLiteralExp(realLiteralExp);
	}

	public final T visitReturnExp(ReturnExp returnExp) {
		return handleReturnExp(returnExp, _visit(returnExp.getOclExpression()));
	}

	public final T visitSimpleName(SimpleName simpleName) {
		return handleSimpleName(simpleName);
	}

	public final T visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
		return handleStringLiteralExp(stringLiteralExp);
	}

	protected abstract T handleBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp);

	protected abstract T handleIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp);

	protected abstract T handleOperationCallExp(
		OperationCallExp operationCallExp, T sourceResult,
		List<T> argumentsResult);

	protected abstract T handleRealLiteralExp(
		RealLiteralExp realLiteralExp);

	protected abstract T handleReturnExp(ReturnExp returnExp, T returnResult);

	protected abstract T handleSimpleName(SimpleName simpleName);

	protected abstract T handleStringLiteralExp(
		StringLiteralExp stringLiteralExp);

	private T _visit(Visitable v) {
		if (v == null) {
			return null;
		}

		return v.accept(this);
	}

}