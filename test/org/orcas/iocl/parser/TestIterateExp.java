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
import org.orcas.iocl.exp.IterateExp;
import org.orcas.iocl.exp.OclExpression;

public class TestIterateExp extends TestCase {

	public void testIterateExp() {
		exp = "Set{1 ,2 ,3}->iterate(v1; v2:Boolean = false | v2 or v1 > 2)";

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof IterateExp);
	}

	protected String exp;
	protected ImperativeOcl iocl = ImperativeOcl.getInstance();
	protected OclExpression oclExp;

}