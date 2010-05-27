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

public interface Visitor<T> {

	public T visitAssignExp(AssignExp assignExp);

	public T visitBlockExp(BlockExp blockExp);

	public T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp);

	public T visitBreakExp(BreakExp breakExp);

	public T visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp);

	public T visitCollectionLiteralPart(
		CollectionLiteralPart collectionLiteralPart);

	public T visitCollectionLiteralParts(
		CollectionLiteralParts collectionLiteralParts);

	public T visitContinueExp(ContinueExp continueExp);

	public T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp);

	public T visitOperationCallExp(OperationCallExp operationCallExp);

	public T visitPropertyCallExp(PropertyCallExp propertyCallExp);

	public T visitRaiseExp(RaiseExp raiseExp);

	public T visitRealLiteralExp(RealLiteralExp realLiteralExp);

	public T visitReturnExp(ReturnExp returnExp);

	public T visitSimpleName(SimpleName simpleName);

	public T visitStringLiteralExp(StringLiteralExp stringLiteralExp);

}