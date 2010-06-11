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
import org.orcas.iocl.exception.ParserException;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.util.OperationCode;

public class TestEqualityExp extends TestCase {

	public void testEqualityExp() throws ParserException {
		String[] exps = new String[] {"true = false", "false <> true "};

		for (String exp : exps) {
			oclExp = ImperativeOclServiceUtil.parse(exp);

			OperationCallExp opCallExp = (OperationCallExp) oclExp;

			OclExpression source = opCallExp.getSource();

			assertTrue(source instanceof BooleanLiteralExp);

			int operationCode = opCallExp.getOperationCode();

			String operation = OperationCode.toLabel(operationCode);

			boolean opCheck = (operation.equals("=") || operation.equals("<>"));

			assertTrue(opCheck);
		}
	}

	protected String exp;
	protected OclExpression oclExp;

}