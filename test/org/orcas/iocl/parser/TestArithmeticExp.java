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

import java.util.List;

import junit.framework.TestCase;

import org.orcas.iocl.ImperativeOcl;
import org.orcas.iocl.exp.NumericLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.util.OperationCode;

public class TestArithmeticExp extends TestCase {

	public void testUnaryExp() {
		String[] exps = new String[] {" -1", "- 1.2 "};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			checkUnaryExp(oclExp);
		}
	}

	public void testMultiplicativeExp() {
		String[] exps = new String[] {
			"1*1", "2 / 3", "1.2 /	4", "2.6   *4.3"};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			checkMultiplicativeExp(oclExp);
		}
	}

	public void testAdditiveExp() {
		String[] exps = new String[] {
			"1+1", "2 - 3", "1.2 +	4", "2.6   -4.3"};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			checkAdditiveExp(oclExp);
		}
	}

	public void testArithmeticExp() {
		String[] exps = new String[] {"-1+2", "-1-1"};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			checkAdditiveExp(oclExp);
		}

		exps = new String[] {"-1*2", "-1/1"};

		for (String exp : exps) {
			oclExp = iocl.parse(exp);

			checkMultiplicativeExp(oclExp);
		}
	}

	protected void checkAdditiveExp(OclExpression ioclExp) {
		assertTrue(ioclExp instanceof OperationCallExp);

		OperationCallExp opCallExp = (OperationCallExp) ioclExp;

		OclExpression lhs = opCallExp.getSource();

		if (lhs instanceof OperationCallExp) {
			checkUnaryExp(lhs);
		}
		else {
			assertTrue(lhs instanceof NumericLiteralExp);
		}

		int operationCode = opCallExp.getOperationCode();

		String operation = OperationCode.toLabel(operationCode);

		boolean opCheck = (operation.equals("+") || operation.equals("-"));

		assertTrue(opCheck);

		List<OclExpression> args = opCallExp.getArguments();

		assertTrue(args.size() == 1);

		OclExpression rhs = args.get(0);

		if (rhs instanceof OperationCallExp) {
			checkMultiplicativeExp(rhs);
		}
		else {
			assertTrue(rhs instanceof NumericLiteralExp);
		}
	}

	protected void checkMultiplicativeExp(OclExpression oclExp) {
		assertTrue(oclExp instanceof OperationCallExp);

		OperationCallExp opCallExp = (OperationCallExp) oclExp;

		OclExpression lhs = opCallExp.getSource();

		if (lhs instanceof OperationCallExp) {
			checkUnaryExp(lhs);
		}
		else {
			assertTrue(lhs instanceof NumericLiteralExp);
		}

		int operationCode = opCallExp.getOperationCode();

		String operation = OperationCode.toLabel(operationCode);

		boolean opCheck = (operation.equals("*") || operation.equals("/"));

		assertTrue(opCheck);

		List<OclExpression> args = opCallExp.getArguments();

		assertTrue(args.size() == 1);

		OclExpression rhs = args.get(0);

		if (rhs instanceof OperationCallExp) {
			checkUnaryExp(rhs);
		}
		else {
			assertTrue(rhs instanceof NumericLiteralExp);
		}
	}

	protected void checkUnaryExp(OclExpression oclExp) {
		assertTrue(oclExp instanceof OperationCallExp);

		OperationCallExp opCallExp = (OperationCallExp) oclExp;

		OclExpression source = opCallExp.getSource();

		assertTrue(source instanceof NumericLiteralExp);

		int operationCode = opCallExp.getOperationCode();

		String operation = OperationCode.toLabel(operationCode);

		boolean opCheck = operation.equals("-");

		assertTrue(opCheck);
	}

	protected String exp;
	protected ImperativeOcl iocl = ImperativeOcl.getInstance();
	protected OclExpression oclExp;

}