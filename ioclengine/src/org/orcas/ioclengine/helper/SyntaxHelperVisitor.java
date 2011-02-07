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

package org.orcas.ioclengine.helper;

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
import org.orcas.iocl.expression.imperativeocl.VariableExp;
import org.orcas.iocl.expression.imperativeocl.VariableInitExp;
import org.orcas.iocl.expression.imperativeocl.WhileExp;
import org.orcas.ioclengine.analyzer.IOCLAnalyzer;
import org.orcas.ioclengine.analyzer.TypeHelper;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class SyntaxHelperVisitor extends EAbstractVisitor<List<Choice>> {

	public void setAnalyzer(IOCLAnalyzer analyzer) {
		_analyzer = analyzer;
	}

	public void setContext(Object context) {
		_context = context;
	}

	public List<Choice> visitAltExp(AltExp altExp) {
		return null;
	}

	public List<Choice> visitAssignExp(AssignExp assignExp) {
		return null;
	}

	public List<Choice> visitBlockExp(BlockExp blockExp) {
		return null;
	}

	public List<Choice> visitBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, booleanLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitBreakExp(BreakExp breakExp) {
		return null;
	}

	public List<Choice> visitCatchExp(CatchExp catchExp) {
		return null;
	}

	public List<Choice> visitCollectionItem(CollectionItem collectionItem) {
		return null;
	}

	public List<Choice> visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		return null;
	}

	public List<Choice> visitComputeExp(ComputeExp computeExp) {
		return null;
	}

	public List<Choice> visitContinueExp(ContinueExp continueExp) {
		return null;
	}

	public List<Choice> visitEnumLiteralExp(EnumLiteralExp enumLiteralExp) {
		return null;
	}

	public List<Choice> visitForExp(ForExp forExp) {
		return null;
	}

	public List<Choice> visitInstantiationExp(
		InstantiationExp instantiationExp) {

		return null;
	}

	public List<Choice> visitIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, integerLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitIterateExp(IterateExp iterateExp) {
		return null;
	}

	public List<Choice> visitIteratorExp(IteratorExp iteratorExp) {
		return null;
	}

	public List<Choice> visitLogExp(LogExp logExp) {
		return null;
	}

	public List<Choice> visitNullLiteralExp(NullLiteralExp nullLiteralExp) {
		return null;
	}

	public List<Choice> visitOperationCallExp(
		OperationCallExp operationCallExp) {

		List<Choice> choices = new ArrayList<Choice>();

		Object type = getTypeHelper().resolveType(_context, operationCallExp);

		choices.addAll(getPropertiesChoices(type));
		choices.addAll(getOperationChoices(type));

		return choices;
	}

	public List<Choice> visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		List<Choice> choices = new ArrayList<Choice>();

		Object type = getTypeHelper().resolveType(_context, propertyCallExp);

		choices.addAll(getPropertiesChoices(type));
		choices.addAll(getOperationChoices(type));

		return choices;
	}

	public List<Choice> visitRaiseExp(RaiseExp raiseExp) {
		return null;
	}

	public List<Choice> visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		Object type = getTypeHelper().resolveType(_context, realLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitReturnExp(ReturnExp returnExp) {
		return null;
	}

	public List<Choice> visitStringLiteralExp(
		StringLiteralExp stringLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, stringLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitSwitchExp(SwitchExp switchExp) {
		return null;
	}

	public List<Choice> visitTryExp(TryExp tryExp) {
		return null;
	}

	public List<Choice> visitTypeExp(TypeExp typeExp) {
		return null;
	}

	public List<Choice> visitVariable(Variable variable) {
		List<Choice> choices = new ArrayList<Choice>();

		String variableName  = variable.getName();

		Object type = getTypeHelper().resolveType(_context, variableName);

		choices.addAll(getPropertiesChoices(type));
		choices.addAll(getOperationChoices(type));

		return choices;
	}

	public List<Choice> visitVariableExp(VariableExp variableExp) {
		Variable referredVariable = variableExp.getReferredVariable();

		return visit(referredVariable);
	}

	public List<Choice> visitVariableInitExp(VariableInitExp variableInitExp) {
		return null;
	}

	public List<Choice> visitWhileExp(WhileExp whileExp) {
		return null;
	}

	protected List<Choice> getOperationChoices(Object type) {
		List<Choice> choices = new ArrayList<Choice>();

		List<?> operations = getTypeHelper().getOperations(type);

		for (Object operation : operations) {
			Choice choice = new ChoiceImpl(
				ChoiceKind.OPERATION,
				getTypeHelper().getName(operation));

			choices.add(choice);
		}

		return choices;
	}

	protected List<Choice> getPropertiesChoices(Object type) {
		List<Choice> choices = new ArrayList<Choice>();

		List<?> properties = getTypeHelper().getProperties(type);

		for (Object property : properties) {
			Choice choice = new ChoiceImpl(
				ChoiceKind.PROPERTY,
				getTypeHelper().getName(property));

			choices.add(choice);
		}

		return choices;
	}

	protected TypeHelper getTypeHelper() {
		return _analyzer.getTypeHelper();
	}

	private IOCLAnalyzer _analyzer;
	private Object _context;

}