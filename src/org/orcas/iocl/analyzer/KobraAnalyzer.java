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

package org.orcas.iocl.analyzer;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.helper.Choice;
import org.orcas.iocl.helper.ChoiceFactory;
import org.orcas.iocl.helper.ChoiceKind;

import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Property;


public class KobraAnalyzer extends
	BaseAnalyzer<Classifier, Operation, Property> {

	public TypeHelper<Classifier, Operation, Property> getTypeHelper() {
		return _typeHelper;
	}

	protected List<Choice> getChoices(
		Classifier owner, List<Operation> operations) {

		List<Choice> choices = new ArrayList<Choice>();

		Choice choice = null;

		for (Operation operation : operations) {
			choice = ChoiceFactory.createChoice(
				ChoiceKind.OPERATION, operation.getName(),
				getDescriptrion(operation));

			choices.add(choice);
		}

		return choices;
	}

	protected String getDescriptrion(Operation operation) {
		return null;
	}

	private KobraTypeHelper _typeHelper = new KobraTypeHelper();

}