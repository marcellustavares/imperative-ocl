package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.BooleanLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.SimpleName;

public class TestLogicalExp extends TestCase {

    public void testLogicalExp() throws IOCLException{
        String[] exps = new String[] {
            "true and false", "true or true ", " false xor false"};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            OperationCallExp opCallExp = (OperationCallExp) oclExp;

            OclExpression source = opCallExp.getSource();

            assertTrue(source instanceof BooleanLiteralExp);

            SimpleName simpleName = opCallExp.getSimpleName();

            String operation = simpleName.getValue();

            boolean opCheck = (
                operation.equals("and") || operation.equals("or") ||
                operation.equals("xor"));

            assertTrue(opCheck);
        }
    }

    public void testNestedLogicalExp() throws IOCLException {
        String exp = "false and false or false xor true";

        oclExp = iocl.parse(exp);

        OperationCallExp opCallExp = (OperationCallExp) oclExp;

        // (((false and false) or false) xor true)

        OclExpression source = opCallExp.getSource();

        assertTrue(source instanceof OperationCallExp);

        SimpleName simpleName = opCallExp.getSimpleName();

        String operation = simpleName.getValue();

        assertEquals("xor", operation);

        OclExpression arg = opCallExp.getArguments().get(0);

        assertTrue(arg instanceof BooleanLiteralExp);

    }

    protected String exp;
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}