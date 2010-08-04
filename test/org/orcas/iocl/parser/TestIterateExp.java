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
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;

public class TestIterateExp extends TestCase {

	public void testIterateExp() throws ImperativeOclException {
		exp = "Set{1 ,2 ,3}->iterate(v1; v2:Boolean = false | v2 or v1 > 2)";

		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof IterateExp);
	}

	protected String exp;
	protected OclExpression oclExp;

}