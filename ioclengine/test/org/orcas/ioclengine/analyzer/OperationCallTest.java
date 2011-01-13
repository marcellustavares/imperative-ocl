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

package org.orcas.ioclengine.analyzer;

import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.SemanticException;

import java.util.List;

import KobrA2.SUM.Constraint.Structural.ComponentClass;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.StructuralFactory;
import KobrA2.SUM.Constraint.Structural.Type;
import KobrA2.SUM.Constraint.Structural.VisibilityKind;
import junit.framework.TestCase;

public class OperationCallTest extends TestCase {

	public void testNonexistentOpCall() {
		ComponentClass businessFacade = getFactory().createComponentClass();

		businessFacade.setName("WebAgencyBusinessFacade");

		Operation process = createOperation(
			"process", VisibilityKind.PUBLIC, null, false);

		List<Operation> operations = businessFacade.getOwnedOperation();

		operations.add(process);

		String expression = "self.process();";

		try {
			IOCLEngine.parse(businessFacade, expression);
		}
		catch (Exception e) {
			fail("Exception should not be raised.");
		}

		expression = "self.nonExistentOperation();";

		try {
			IOCLEngine.parse(businessFacade, expression);

			fail("Semantic exception not raised.");
		}
		catch (Exception e) {
			assertTrue(e instanceof SemanticException);
		}

	}

	public void testOperationCall() {
		ComponentClass component = getFactory().createComponentClass();

		component.setName("TestComponent");

		Operation hello = createOperation(
			"hello", VisibilityKind.PUBLIC, null, false);

		List<Parameter> parameters = hello.getOwnedParameter();

		Parameter parameter = createParameter(
			"name", getFactory().createString());

		parameters.add(parameter);

		List<Operation> operations = component.getOwnedOperation();

		operations.add(hello);

		String expression = "self.hello();";

		try {
			IOCLEngine.parse(component, expression);

			fail("Semantic exception not raised.");
		}
		catch (Exception e) {
			assertTrue(e instanceof SemanticException);
		}

		expression = "self.hello('Marcellus');";

		try {
			IOCLEngine.parse(component, expression);
		}
		catch (Exception e) {
			fail("Exception should not be raised.");
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

	protected Parameter createParameter(String name, Type type) {
		Parameter parameter = getFactory().createParameter();

		parameter.setName(name);
		parameter.setType(type);

		return parameter;
	}

	protected StructuralFactory getFactory() {
		return StructuralFactory.eINSTANCE;
	}


}