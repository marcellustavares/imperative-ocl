package org.orcas.iocl.parser;

import junit.framework.TestSuite;

public class OCLExpressionTest {

    public static void main(String[] args) throws Exception {

        TestSuite suite = new TestSuite();

        suite.addTestSuite(TestPrimitiveLiteralExp.class);
        suite.addTestSuite(TestCollectionLiteralExp.class);
        suite.addTestSuite(TestOperationCallExp.class);

        junit.textui.TestRunner.run(suite);
    }

}