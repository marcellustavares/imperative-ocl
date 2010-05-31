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

package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.ImperativeOcl;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.PathName;
import org.orcas.iocl.exp.PrimitiveType;
import org.orcas.iocl.exp.SimpleTypeEnum;
import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.exp.VariableInitExp;

public class TestVariableInitExp extends TestCase {

	public void testVariableInitExp() {
		exp = "var tmp := 1+2;";

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof VariableInitExp);

		VariableInitExp variableInitExp = (VariableInitExp) oclExp;

		assertEquals(variableInitExp.getVarName(), "tmp");

		assertTrue(variableInitExp.getType() == null);

		assertTrue(variableInitExp.getVarValue() instanceof OperationCallExp);
	}

	public void testVariableInitTypedExp() {
		exp = "var tmp:String := 'Marcellus';";

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof VariableInitExp);

		VariableInitExp variableInitExp = (VariableInitExp) oclExp;

		assertEquals(variableInitExp.getVarName(), "tmp");

		assertTrue(variableInitExp.getType() instanceof PrimitiveType);

		PrimitiveType primitiveType = (PrimitiveType) variableInitExp.getType();

		assertEquals(primitiveType.getSimpleType(), SimpleTypeEnum.STRING);

		assertTrue(variableInitExp.getVarValue() instanceof StringLiteralExp);

		StringLiteralExp varValue =
			(StringLiteralExp) variableInitExp.getVarValue();

		assertEquals(varValue.getStringSymbol(), "Marcellus");

		exp = "var tmp:javax::portlet::Portlet := 'Marcellus';";

		oclExp = iocl.parse(exp);

		variableInitExp = (VariableInitExp) oclExp;

		assertTrue(variableInitExp.getType() instanceof PathName);

		PathName pathName = (PathName) variableInitExp.getType();

		assertTrue(pathName.getQualifiedName().size() == 3);
	}

	protected String exp;
	protected ImperativeOcl iocl = ImperativeOcl.getInstance();
	protected OclExpression oclExp;

}