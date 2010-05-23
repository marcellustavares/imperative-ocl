package org.orcas.iocl.parser;

import junit.framework.TestSuite;

public class OclExpressionTest {

    public static void main(String[] args) throws Exception {

        TestSuite suite = new TestSuite();

        suite.addTestSuite(TestArithmeticExp.class);
        suite.addTestSuite(TestCollectionLiteralExp.class);
        suite.addTestSuite(TestEqualityExp.class);
        suite.addTestSuite(TestLogicalExp.class);
        suite.addTestSuite(TestPrimitiveLiteralExp.class);
        suite.addTestSuite(TestRelationalExp.class);

        junit.textui.TestRunner.run(suite);
    }

}