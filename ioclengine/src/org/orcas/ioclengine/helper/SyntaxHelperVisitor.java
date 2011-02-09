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
import java.util.Collections;
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
		return Collections.emptyList();
	}

	public List<Choice> visitAssignExp(AssignExp assignExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitBlockExp(BlockExp blockExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitBooleanLiteralExp(
		BooleanLiteralExp booleanLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, booleanLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitBreakExp(BreakExp breakExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitCatchExp(CatchExp catchExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitCollectionItem(CollectionItem collectionItem) {
		return Collections.emptyList();
	}

	public List<Choice> visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		return Collections.emptyList();
	}

	public List<Choice> visitComputeExp(ComputeExp computeExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitContinueExp(ContinueExp continueExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitEnumLiteralExp(EnumLiteralExp enumLiteralExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitForExp(ForExp forExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitInstantiationExp(
		InstantiationExp instantiationExp) {

		return Collections.emptyList();
	}

	public List<Choice> visitIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, integerLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitIterateExp(IterateExp iterateExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitIteratorExp(IteratorExp iteratorExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitLogExp(LogExp logExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitNullLiteralExp(NullLiteralExp nullLiteralExp) {
		return Collections.emptyList();
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
		return Collections.emptyList();
	}

	public List<Choice> visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		Object type = getTypeHelper().resolveType(_context, realLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitReturnExp(ReturnExp returnExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitStringLiteralExp(
		StringLiteralExp stringLiteralExp) {

		Object type = getTypeHelper().resolveType(_context, stringLiteralExp);

		return getOperationChoices(type);
	}

	public List<Choice> visitSwitchExp(SwitchExp switchExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitTryExp(TryExp tryExp) {
		return Collections.emptyList();
	}

	public List<Choice> visitTypeExp(TypeExp typeExp) {
		return Collections.emptyList();
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
		return Collections.emptyList();
	}

	public List<Choice> visitWhileExp(WhileExp whileExp) {
		return Collections.emptyList();
	}

	protected List<Choice> getOperationChoices(Object type) {
		List<Choice> choices = new ArrayList<Choice>();

		List<?> operations = getTypeHelper().getOperations(type);

		for (Object operation : operations) {
			String value = getTypeHelper().getName(operation).concat("()");

			Choice choice = new ChoiceImpl(
				ChoiceKind.OPERATION, value);

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