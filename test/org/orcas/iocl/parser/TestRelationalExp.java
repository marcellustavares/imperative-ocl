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

import org.orcas.iocl.Iocl;

import org.orcas.iocl.exp.NumericLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.SimpleName;

public class TestRelationalExp extends TestCase {

	public void testEqualityExp() {
		String[] exps = new String[] {"1 < 2", "1.2 >= 0 "};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			OperationCallExp opCallExp = (OperationCallExp) oclExp;

			OclExpression source = opCallExp.getSource();

			assertTrue(source instanceof NumericLiteralExp);

			SimpleName simpleName = opCallExp.getSimpleName();

			String operation = simpleName.getValue();

			boolean opCheck = (operation.equals("<") || operation.equals(">="));

			assertTrue(opCheck);
		}
	}

	protected String exp;
	protected Iocl iocl = Iocl.getInstance();
	protected OclExpression oclExp;

}