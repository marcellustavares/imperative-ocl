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

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exp.AssignExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.SimpleTypeEnum;
import org.orcas.iocl.exp.StringLiteralExp;

public class TestAssignExp extends TestCase {

	public void testAssignResetExp() {
		exp = "tmp := 1+2;";

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.isReset());

		assertTrue(assignExp.getLeft() instanceof SimpleName);

		SimpleName simpleName = (SimpleName) assignExp.getLeft();

		assertEquals(simpleName.getSimpleType(), SimpleTypeEnum.IDENTIFIER);

		assertEquals(simpleName.getValue(), "tmp");

		assertTrue(assignExp.getValue() instanceof OperationCallExp);
	}

	public void testAssignNotResetExp() {
		exp = "tmp += 'test';";

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.isReset() == false);

		assertTrue(assignExp.getLeft() instanceof SimpleName);

		SimpleName simpleName = (SimpleName) assignExp.getLeft();

		assertEquals(simpleName.getSimpleType(), SimpleTypeEnum.IDENTIFIER);

		assertEquals(simpleName.getValue(), "tmp");

		assertTrue(assignExp.getValue() instanceof StringLiteralExp);
	}

	protected String exp;
	protected Iocl iocl = Iocl.getInstance();
	protected OclExpression oclExp;

}