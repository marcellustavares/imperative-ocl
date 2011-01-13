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

import junit.framework.TestSuite;

public class ParserTestSuite {

	public static void main(String[] args) throws Exception {
		TestSuite suite = new TestSuite();

		suite.addTestSuite(ArithmeticExpTest.class);
		suite.addTestSuite(AssignExpTest.class);
		suite.addTestSuite(CollectionLiteralExpTest.class);
		suite.addTestSuite(EqualityExpTest.class);
		suite.addTestSuite(IterateExpTest.class);
		suite.addTestSuite(IteratorExpTest.class);
		suite.addTestSuite(LogicalExpTest.class);
		suite.addTestSuite(PrimitiveLiteralExpTest.class);
		suite.addTestSuite(RaiseExpTest.class);
		suite.addTestSuite(RelationalExpTest.class);
		suite.addTestSuite(ReturnExpTest.class);
		suite.addTestSuite(TryExpTest.class);
		suite.addTestSuite(VariableInitExpTest.class);
		suite.addTestSuite(WhileExpTest.class);

		junit.textui.TestRunner.run(suite);
	}

}