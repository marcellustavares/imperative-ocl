package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.exp.OclExpression;

public class TestCollectionLiteralExp extends TestCase {

    public void testBagExpression() throws IOCLException {
        exp = "Bag{1, 2}";

        basicCheck(exp, CollectionTypeIdentifier.BAG, 2);
    }

    public void testCollectionExpression() throws IOCLException {
        exp = "Collection{}";

        basicCheck(exp, CollectionTypeIdentifier.COLLECTION, 0);
    }

    public void testOrderedSetExpression() throws IOCLException {
        exp = "OrderedSet{1, 2}";

        basicCheck(exp, CollectionTypeIdentifier.ORDERED_SET, 2);
    }

    public void testSequenceExpression() throws IOCLException {
        exp = "Sequence {1.2, 3.5, 4, true}";

        basicCheck(exp, CollectionTypeIdentifier.SEQUENCE, 4);
    }

    public void testSetExpression() throws IOCLException {
        exp = "Set{false, 'marcellus'}";

        basicCheck(exp, CollectionTypeIdentifier.SET, 2);
    }

    protected void basicCheck(String exp, int expectedType, int expectedSize)
        throws IOCLException {

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
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}