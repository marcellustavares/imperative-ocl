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

import junit.framework.TestCase;

import org.orcas.iocl.ImperativeOclServiceUtil;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.exception.SemanticException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;

public class TestPrimitiveTypeOperations extends TestCase {

	public void testStringLiteralExp() throws ImperativeOclException {
		try {
			exp = "'marcellus' + 1";
			oclExp = ImperativeOclServiceUtil.parse(null, exp);
		}
		catch (SemanticException se) {
			assertTrue(true);
		}
	}

	protected String exp;
	protected OclExpression oclExp;

}