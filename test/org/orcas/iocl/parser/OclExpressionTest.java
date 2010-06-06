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

import junit.framework.TestSuite;

public class OclExpressionTest {

	public static void main(String[] args) throws Exception {

		TestSuite suite = new TestSuite();

		suite.addTestSuite(TestArithmeticExp.class);
		suite.addTestSuite(TestAssignExp.class);
		suite.addTestSuite(TestCollectionLiteralExp.class);
		suite.addTestSuite(TestEqualityExp.class);
		suite.addTestSuite(TestIterateExp.class);
		suite.addTestSuite(TestIteratorExp.class);
		suite.addTestSuite(TestLogicalExp.class);
		suite.addTestSuite(TestPrimitiveLiteralExp.class);
		suite.addTestSuite(TestRaiseExp.class);
		suite.addTestSuite(TestRelationalExp.class);
		suite.addTestSuite(TestReturnExp.class);
		suite.addTestSuite(TestVariableInitExp.class);
		suite.addTestSuite(TestWhileExp.class);

		junit.textui.TestRunner.run(suite);
	}

}