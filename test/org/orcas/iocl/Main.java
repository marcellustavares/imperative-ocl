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

package org.orcas.iocl;

import java.util.List;

import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.helper.Choice;

import KobrA2.SUM.Constraint.Structural.ComponentClass;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Property;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;

public class Main {

	public static void main(String[] args) throws ImperativeOclException {

		/*ComponentClass componentClass = Main.getKobraFactory().createComponentClass();

		componentClass.setName("Component Test");

		List<Property> properties = componentClass.getOwnedAttribute();

		Property name = Main.getKobraFactory().createProperty();

		name.setName("name");
		name.setType(Main.getKobraFactory().createString());

		properties.add(name);

		Property age = Main.getKobraFactory().createProperty();

		age.setName("age");
		age.setType(Main.getKobraFactory().createInteger());

		properties.add(age);

		List<Operation> operations = componentClass.getOwnedOperation();

		Operation getNameOp = Main.getKobraFactory().createOperation();

		getNameOp.setName("getName");
		getNameOp.setType(Main.getKobraFactory().createString());

		operations.add(getNameOp);

		Operation getAgeOp = Main.getKobraFactory().createOperation();

		getAgeOp.setName("getAge");
		getAgeOp.setType(Main.getKobraFactory().createInteger());

		operations.add(getAgeOp);

		String exp = "'teste'->";

		long start = System.currentTimeMillis();

		List<Choice> choices = ImperativeOclServiceUtil.getSyntaxHelp(componentClass, exp);

		for (Choice choice : choices) {
			System.out.println(choice.getName());
			System.out.println("---");
		}

		System.out.println(System.currentTimeMillis() - start);
		*/

		String exp = "test := 'marcellus';";

		String code = ImperativeOclServiceUtil.compile(null, exp);

		System.out.println(code);
	}

	public static StructuralFactory getKobraFactory() {
		return StructuralFactory.eINSTANCE;
	}
}