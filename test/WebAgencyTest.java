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


import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclgenerator.IOCLGenerator;

import java.util.List;

import KobrA2.SUM.Constraint.Structural.ComponentClass;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Package;
import KobrA2.SUM.Constraint.Structural.Property;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.Type;
import KobrA2.SUM.Constraint.Structural.VisibilityKind;

public class WebAgencyTest {

	public static void main(String[] args) {
		new WebAgencyTest();
	}

	public WebAgencyTest() {
		ComponentClass businessFacade = getFactory().createComponentClass();

		Package p = getFactory().createPackage();

		p.setName("name");
		p.setQualifiedName("name");
		businessFacade.setPackage(p);

		businessFacade.setName("WebAgencyBusinessFacade");

		ComponentClass addClientAction = getFactory().createComponentClass();

		addClientAction.setName("AddClientAction");

		Property property = getFactory().createProperty();

		property.setName("addClientAction");
		property.setType(addClientAction);

		List<Property> properties = businessFacade.getOwnedAttribute();

		properties.add(property);

		Operation process = createOperation(
			"process", VisibilityKind.PUBLIC, null, false);

		List<Operation> operations = businessFacade.getOwnedOperation();

		operations.add(process);

		System.out.println(businessFacade.getQualifiedName());

		String body = " do {" +
				" var action:String := message.getAction();" +
				" if (action = 'test') { " +
				"  var b:Integer := 1;" +
				" self.test();" +
				"} " +

				"  }";
		try {
			OclExpression oclExpression = IOCLEngine.parse(
				businessFacade, body);

			System.out.println(IOCLGenerator.generate(null, oclExpression));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected Operation createOperation(
		String name, VisibilityKind visibilityKind, Type type,
		boolean isAbstract) {

		Operation operation = getFactory().createOperation();

		operation.setName(name);
		operation.setType(type);
		operation.setVisibility(visibilityKind);
		operation.setIsAbstract(isAbstract);

		return operation;
	}

	protected StructuralFactory getFactory() {
		return StructuralFactory.eINSTANCE;
	}

}