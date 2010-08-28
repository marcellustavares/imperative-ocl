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

package org.orcas.iocl.helper;

import java.util.List;

import org.orcas.iocl.analyzer.Analyzer;
import org.orcas.iocl.expressions.imperativeocl.AltExp;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.BreakExp;
import org.orcas.iocl.expressions.imperativeocl.CatchExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ComputeExp;
import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.EnumLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
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
import org.orcas.iocl.generator.EAbstractVisitor;

public class SyntaxHelperVisitor extends EAbstractVisitor<List<Choice>> {

	public void setAnalyzer(Analyzer analyzer) {
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

		return null;
	}

	public List<Choice> visitBreakExp(BreakExp breakExp) {
		return null;
	}

	public List<Choice> visitCatchExp(CatchExp catchExp) {
		return null;
	}

	public List<Choice> visitCollectionLiteralExp(
		CollectionLiteralExp collectionLiteralExp) {

		return null;
	}

	public List<Choice> visitCollectionItem(CollectionItem collectionItem) {
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

	public List<Choice> visitIntegerLiteralExp(
		IntegerLiteralExp integerLiteralExp) {

		return null;
	}

	public List<Choice> visitIterateExp(IterateExp iterateExp) {
		return null;
	}

	public List<Choice> visitIteratorExp(IteratorExp iteratorExp) {
		return null;
	}

	public List<Choice> visitOperationCallExp(
		OperationCallExp operationCallExp) {

		return null;
	}

	public List<Choice> visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		return null;
	}

	public List<Choice> visitRaiseExp(RaiseExp raiseExp) {
		return null;
	}

	public List<Choice> visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		return null;
	}

	public List<Choice> visitReturnExp(ReturnExp returnExp) {
		return null;
	}

	public List<Choice> visitStringLiteralExp(
		StringLiteralExp stringLiteralExp) {

		return _analyzer.getChoices(_context, stringLiteralExp);
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

	public List<Choice> visitVariableExp(VariableExp variableExp) {
		return null;
	}

	public List<Choice> visitVariableInitExp(VariableInitExp variableInitExp) {
		return null;
	}

	public List<Choice> visitVariable(Variable variable) {
		return null;
	}

	public List<Choice> visitWhileExp(WhileExp whileExp) {
		return null;
	}

	private Analyzer _analyzer;
	private Object _context;

}