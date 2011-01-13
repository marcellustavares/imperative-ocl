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

import org.orcas.iocl.expression.emof.Type;
import org.orcas.iocl.expression.imperativeocl.AltExp;
import org.orcas.iocl.expression.imperativeocl.AssignExp;
import org.orcas.iocl.expression.imperativeocl.BlockExp;
import org.orcas.iocl.expression.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expression.imperativeocl.BreakExp;
import org.orcas.iocl.expression.imperativeocl.CatchExp;
import org.orcas.iocl.expression.imperativeocl.CollectionItem;
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
import org.orcas.iocl.expression.imperativeocl.VariableInitExp;
import org.orcas.iocl.expression.imperativeocl.WhileExp;

import java.util.List;
import java.util.Map;

public interface Handler<T> {

	public T handleAltExp(AltExp altExp, T conditionResult, T bodyResult);

	public T handleAssignExp(
		AssignExp assignExp, T leftResult, T defaultValueResult);

	public T handleBlockExp(BlockExp blockExp, List<T> bodyResults);

	public T handleBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp);

	public T handleBreakExp(BreakExp breakExp);

	public T handleCatchExp(
		CatchExp catchExp, List<T> typeResults, List<T> bodyResults);

	public T handleCollectionItem(
		CollectionItem collectionItem, T collectionItemResult);

	public T handleCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp, List<T> partResults);

	public T handleComputeExp(
		ComputeExp computeExp, T variableResult, T bodyResult);

	public T handleContinueExp(ContinueExp continueExp);

	public T handleEnumLiteralExp(EnumLiteralExp enumLiteralExp);

	public T handleForExp(
		ForExp forExp, T conditionResult, T bodyResult, List<T> variableResults,
		T sourceResult);

	public T handleInstantiationExp(
		InstantiationExp instantiationExp, String className,
		List<T> packageResults, List<T> argumentResults);

	public T handleIntegerLiteralExp(IntegerLiteralExp integerLiteralExp);

	public T handleIterateExp(
		IterateExp iterateExp, T sourceResult, List<T> variableResults,
		T resultResult, T bodyResult);

	public T handleIteratorExp(
		IteratorExp iteratorExp, T sourceResult, List<T> variableResults,
		T bodyResult);

	public T handleLogExp(LogExp logExp);

	public T handleNullLiteralExp(NullLiteralExp nullLiteralExp);

	public T handleOperationCallExp(
		OperationCallExp operationCallExp, T sourceResult, List<T> argResults);

	public T handlePackage(org.orcas.iocl.expression.emof.Package pkg);

	public T handlePropertyCallExp(
		PropertyCallExp propertyCallExp, T sourceResult);

	public T handleRaiseExp(RaiseExp raiseExp, T typeResult);

	public T handleRealLiteralExp(RealLiteralExp realLiteralExp);

	public T handleReturnExp(ReturnExp returnExp, T valueResult);

	public T handleStringLiteralExp(StringLiteralExp stringLiteralExp);

	public T handleSwitchExp(
		SwitchExp switchExp, List<T> altPartResults, T elseResult);

	public T handleTryExp(
		TryExp tryExp, List<T> bodyResults, List<T> catchResults);

	public T handleType(Type type);

	public T handleTypeExp(TypeExp typeExp);

	public T handleVariable(Variable variable, T initResult);

	public T handleVariableInitExp(VariableInitExp variableInitExp);

	public T handleWhileExp(WhileExp whileExp, T conditionResult, T bodyResult);

	public void setContext(Map<String, String> context);

}