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

import org.orcas.iocl.expression.imperativeocl.IteratorExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;

public class IteratorExpTest extends TestCase {

	public void testIterateExp() throws IOCLException {
		exp = "Sequence{1,2,3,4,5}->forAll(a | a > 2)";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof IteratorExp);

		IteratorExp iteratorExp = (IteratorExp)oclExp;

		assertEquals("forAll", iteratorExp.getName());
	}

	protected String exp;
	protected OclExpression oclExp;

}