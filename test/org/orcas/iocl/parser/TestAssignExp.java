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

import org.orcas.iocl.ImperativeOclServiceUtil;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;

public class TestAssignExp extends TestCase {

	public void testAssignResetExp() throws ImperativeOclException {
		exp = "tmp := 1+2;";

		oclExp = ImperativeOclServiceUtil.parse(exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.getIsReset());

		/*
		assertTrue(assignExp.getLeft() instanceof SimpleName);

		SimpleName simpleName = (SimpleName) assignExp.getLeft();

		assertEquals(simpleName.getSimpleType(), SimpleTypeEnum.IDENTIFIER);

		assertEquals(simpleName.getValue(), "tmp");

		assertTrue(assignExp.getValue() instanceof OperationCallExp);
		*/
	}

	public void testAssignNotResetExp() throws ImperativeOclException {
		exp = "tmp += 'test';";

		oclExp = ImperativeOclServiceUtil.parse(exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.getIsReset() == false);

		/*
		assertTrue(assignExp.getLeft() instanceof SimpleName);

		SimpleName simpleName = (SimpleName) assignExp.getLeft();

		assertEquals(simpleName.getSimpleType(), SimpleTypeEnum.IDENTIFIER);

		assertEquals(simpleName.getValue(), "tmp");

		assertTrue(assignExp.getValue() instanceof StringLiteralExp);
		*/
	}

	protected String exp;
	protected OclExpression oclExp;

}