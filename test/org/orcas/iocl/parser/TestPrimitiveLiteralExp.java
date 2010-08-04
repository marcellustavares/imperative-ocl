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

import org.orcas.iocl.ImperativeOclServiceUtil;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;

import junit.framework.TestCase;

public class TestPrimitiveLiteralExp extends TestCase {

	public void testBooleanLiteralExp() throws ImperativeOclException {
		exp = "true";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof BooleanLiteralExp);

		exp = "false";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof BooleanLiteralExp);
	}

	public void testIntegerLiteralExp() throws ImperativeOclException {
		exp = "2";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof IntegerLiteralExp);
	}

	public void testRealLiteralExp() throws ImperativeOclException {
		exp = "2.2";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof RealLiteralExp);
	}

	public void testStringLiteralExp() throws ImperativeOclException {
		exp = "'marcellus'";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		exp = "'\u4147 ok'  ";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		exp = "' t  e\t\nst '	  ";
		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof StringLiteralExp);
	}

	protected String exp;
	protected OclExpression oclExp;

}