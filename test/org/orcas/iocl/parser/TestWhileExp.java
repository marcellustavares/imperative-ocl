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
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;

public class TestWhileExp extends TestCase {

	public void testWhileExp() throws ImperativeOclException {
		exp = "while (x < 10) { " +
			  " x := x + 1;" +
			  "} ";

		oclExp = ImperativeOclServiceUtil.parse(null, exp);

		assertTrue(oclExp instanceof WhileExp);

		WhileExp whileExp = (WhileExp) oclExp;

		assertTrue(whileExp.getCondition() instanceof OperationCallExp);
	}

	protected String exp;
	protected org.orcas.iocl.expressions.imperativeocl.OclExpression oclExp;

}