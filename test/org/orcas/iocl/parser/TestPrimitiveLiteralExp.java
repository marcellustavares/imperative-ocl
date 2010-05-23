package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.BooleanLiteralExp;
import org.orcas.iocl.exp.IntegerLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.RealLiteralExp;
import org.orcas.iocl.exp.StringLiteralExp;

public class TestPrimitiveLiteralExp extends TestCase {

    public void testBooleanLiteralExp() throws IOCLException {
        exp = "true";
        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof BooleanLiteralExp);

        exp = "false";
        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof BooleanLiteralExp);
    }

    public void testIntegerLiteralExp() throws IOCLException {
        exp = "2";
        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof IntegerLiteralExp);
    }

    public void testRealLiteralExp() throws IOCLException {
        exp = "2.2";
        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof RealLiteralExp);
    }

    public void testStringLiteralExp() throws IOCLException {
        exp = "'marcellus'";
        oclExp = iocl.parse(exp);

        exp = "'\u4147 ok'  ";
        oclExp = iocl.parse(exp);

        exp = "' t  e\t\nst '      ";
        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof StringLiteralExp);
    }

    protected String exp;
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}