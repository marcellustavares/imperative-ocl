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

import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.TryExp;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;

public class TryExpTest extends TestCase {

	public void testTryExp() throws IOCLException {
		exp = "try {" +
			  " var a:String := 'marcellus';" +
			  "	var size:Integer := a.size();" +
			  "} " +
			  "except(java::lang::NullPointerException) {" +
			  " raise 'something is wrong'; " +
			  "}";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof TryExp);
	}

	protected String exp;
	protected OclExpression oclExp;

}