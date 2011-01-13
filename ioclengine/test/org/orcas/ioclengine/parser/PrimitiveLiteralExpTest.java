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

package org.orcas.ioclengine.parser;

import junit.framework.TestCase;

import org.orcas.iocl.expression.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expression.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expression.imperativeocl.StringLiteralExp;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;

public class PrimitiveLiteralExpTest extends TestCase {

	public void testBooleanLiteralExp() throws IOCLException {
		exp = "true";
		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof BooleanLiteralExp);

		exp = "false";
		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof BooleanLiteralExp);
	}

	public void testIntegerLiteralExp() throws IOCLException {
		exp = "2";
		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof IntegerLiteralExp);
	}

	public void testRealLiteralExp() throws IOCLException {
		exp = "2.2";
		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof RealLiteralExp);
	}

	public void testStringLiteralExp() throws IOCLException {
		exp = "'marcellus'";
		oclExp = IOCLEngine.parse(null, exp);

		exp = "'\u4147 ok'  ";
		oclExp = IOCLEngine.parse(null, exp);

		exp = "' t  e\t\nst '	  ";
		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof StringLiteralExp);
	}

	protected String exp;
	protected OclExpression oclExp;

}