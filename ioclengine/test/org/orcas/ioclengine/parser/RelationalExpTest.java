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

import org.orcas.iocl.expression.imperativeocl.NumericLiteralExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;
import org.orcas.ioclengine.util.Operation;

public class RelationalExpTest extends TestCase {

	public void testEqualityExp() throws IOCLException {
		String[] exps = new String[] {"1 < 2", "1.2 >= 0 "};

		for (String exp : exps) {
			oclExp = IOCLEngine.parse(null, exp);

			OperationCallExp opCallExp = (OperationCallExp) oclExp;

			OclExpression source = opCallExp.getSource();

			assertTrue(source instanceof NumericLiteralExp);

			int operationCode = opCallExp.getOperationCode();

			String operation = Operation.fromOperationCode(operationCode);

			boolean opCheck = (operation.equals("<") || operation.equals(">="));

			assertTrue(opCheck);
		}
	}

	protected String exp;
	protected OclExpression oclExp;

}