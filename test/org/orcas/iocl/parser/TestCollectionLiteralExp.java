package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.parser.IOCLParserUtil;

public class TestCollectionLiteralExp extends TestCase {

    public void testBagExpression() throws IOCLException {
        exp = "Bag{1, 2}";

        basicCheck(exp, CollectionTypeIdentifierCS.BAG, 2);
    }

    public void testCollectionExpression() throws IOCLException {
        exp = "Collection{}";

        basicCheck(exp, CollectionTypeIdentifierCS.COLLECTION, 0);
    }

    public void testOrderedSetExpression() throws IOCLException {
        exp = "OrderedSet{1, 2}";

        basicCheck(exp, CollectionTypeIdentifierCS.ORDERED_SET, 2);
    }

    public void testSequenceExpression() throws IOCLException {
        exp = "Sequence {1.2, 3.5, 4, true}";

        basicCheck(exp, CollectionTypeIdentifierCS.SEQUENCE, 4);
    }

    public void testSetExpression() throws IOCLException {
        exp = "Set{false, 'marcellus'}";

        basicCheck(exp, CollectionTypeIdentifierCS.SET, 2);
    }

    protected void basicCheck(String exp, int expectedType, int expectedSize)
        throws IOCLException {

        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof CollectionLiteralExpCS);

        collectionLiteralExp = (CollectionLiteralExpCS) ioclExp;

        CollectionTypeIdentifierCS type =
            collectionLiteralExp.getCollectionKind();

        assertEquals(type.getCollectionType(), expectedType);

        if (expectedSize == 0) {
            assertNull(collectionLiteralExp.getCollectionParts());
        }
        else {
            assertEquals(
                collectionLiteralExp.getCollectionParts().getParts().size(),
                expectedSize);
        }
    }

    protected String exp;
    protected IOCLExpressionCS ioclExp;
    protected CollectionLiteralExpCS collectionLiteralExp;

}