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

import org.orcas.iocl.expression.imperativeocl.AssignExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;

public class AssignExpTest extends TestCase {

	public void testAssignResetExp() throws IOCLException {
		exp = "tmp := 1+2;";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.getIsReset());
	}

	public void testAssignNotResetExp() throws IOCLException {
		exp = "tmp += 'test';";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof AssignExp);

		AssignExp assignExp = (AssignExp) oclExp;

		assertTrue(assignExp.getIsReset() == false);
	}

	protected String exp;
	protected OclExpression oclExp;

}