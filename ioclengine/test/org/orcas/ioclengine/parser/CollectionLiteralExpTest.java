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

import org.orcas.iocl.expression.imperativeocl.CollectionKind;
import org.orcas.iocl.expression.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;

public class CollectionLiteralExpTest extends TestCase {

	public void testBagExpression() throws IOCLException {
		exp = "Bag{1, 2}";

		basicCheck(exp, CollectionKind.BAG, 2);
	}

	public void testOrderedSetExpression() throws IOCLException {
		exp = "OrderedSet{1, 2}";

		basicCheck(exp, CollectionKind.ORDERED_SET, 2);
	}

	public void testSequenceExpression() throws IOCLException {
		exp = "Sequence {1.2, 3.5, 4, true}";

		basicCheck(exp, CollectionKind.SEQUENCE, 4);
	}

	public void testSetExpression() throws IOCLException {
		exp = "Set{false, 'marcellus'}";

		basicCheck(exp, CollectionKind.SET, 2);
	}

	protected void basicCheck(
			String exp, CollectionKind kind, int expectedSize)
		throws IOCLException {

		oclExp = IOCLEngine.parse(null, exp);

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