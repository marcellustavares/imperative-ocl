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

import org.orcas.iocl.ImperativeOclServiceUtil;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.CollectionKind;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;

import junit.framework.TestCase;

public class TestCollectionLiteralExp extends TestCase {

	public void testBagExpression() throws ImperativeOclException {
		exp = "Bag{1, 2}";

		basicCheck(exp, CollectionKind.BAG, 2);
	}

	public void testOrderedSetExpression() throws ImperativeOclException {
		exp = "OrderedSet{1, 2}";

		basicCheck(exp, CollectionKind.ORDERED_SET, 2);
	}

	public void testSequenceExpression() throws ImperativeOclException {
		exp = "Sequence {1.2, 3.5, 4, true}";

		basicCheck(exp, CollectionKind.SEQUENCE, 4);
	}

	public void testSetExpression() throws ImperativeOclException {
		exp = "Set{false, 'marcellus'}";

		basicCheck(exp, CollectionKind.SET, 2);
	}

	protected void basicCheck(
			String exp, CollectionKind kind, int expectedSize)
		throws ImperativeOclException {

		oclExp = ImperativeOclServiceUtil.parse(exp);

		assertTrue(oclExp instanceof CollectionLiteralExp);

		collectionLiteralExp = (CollectionLiteralExp) oclExp;

		CollectionKind collectionKind =
			collectionLiteralExp.getKind();

		assertEquals(kind, collectionKind);

		if (expectedSize == 0) {
			assertNull(collectionLiteralExp.getPart().isEmpty());
		}
		else {
			assertEquals(
				expectedSize, collectionLiteralExp.getPart().size());
		}
	}

	protected String exp;
	protected CollectionLiteralExp collectionLiteralExp;
	protected OclExpression oclExp;

}