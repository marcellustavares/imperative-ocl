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
import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.exp.OclExpression;

public class TestCollectionLiteralExp extends TestCase {

	public void testBagExpression() {
		exp = "Bag{1, 2}";

		basicCheck(exp, CollectionTypeIdentifier.BAG, 2);
	}

	public void testCollectionExpression() {
		exp = "Collection{}";

		basicCheck(exp, CollectionTypeIdentifier.COLLECTION, 0);
	}

	public void testOrderedSetExpression() {
		exp = "OrderedSet{1, 2}";

		basicCheck(exp, CollectionTypeIdentifier.ORDERED_SET, 2);
	}

	public void testSequenceExpression() {
		exp = "Sequence {1.2, 3.5, 4, true}";

		basicCheck(exp, CollectionTypeIdentifier.SEQUENCE, 4);
	}

	public void testSetExpression() {
		exp = "Set{false, 'marcellus'}";

		basicCheck(exp, CollectionTypeIdentifier.SET, 2);
	}

	protected void basicCheck(String exp, int expectedType, int expectedSize)
		{

		oclExp = iocl.parse(exp);

		assertTrue(oclExp instanceof CollectionLiteralExp);

		collectionLiteralExp = (CollectionLiteralExp) oclExp;

		CollectionTypeIdentifier type =
			collectionLiteralExp.getCollectionKind();

		assertEquals(type.getCollectionType(), expectedType);

		if (expectedSize == 0) {
			assertNull(collectionLiteralExp.getCollectionLiteralParts());
		}
		else {
			CollectionLiteralParts collectionLiteralParts =
				collectionLiteralExp.getCollectionLiteralParts();
			assertEquals(
				collectionLiteralParts.getParts().size(), expectedSize);
		}
	}

	protected String exp;
	protected CollectionLiteralExp collectionLiteralExp;
	protected ImperativeOcl iocl = ImperativeOcl.getInstance();
	protected OclExpression oclExp;

}