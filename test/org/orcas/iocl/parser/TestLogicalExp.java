package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.exception.IOCLException;

public class TestLogicalExp extends TestCase {

    public void testLogicalExp() throws IOCLException{
        String[] exps = new String[] {
            "true and false", "true or true ", " false xor false"};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

            OCLExpressionCS source = opCallExp.getSource();

            assertTrue(source instanceof BooleanLiteralExpCS);

            SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

            String operation = simpleName.getValue();

            boolean opCheck = (
                operation.equals("and") || operation.equals("or") ||
                operation.equals("xor"));

            assertTrue(opCheck);
        }
    }

    public void testNestedLogicalExp() throws IOCLException {
        String exp = "false and false or false xor true";

        ioclExp = IOCLParserUtil.parse(exp);

        OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

        // false and (false or false xor true)

        OCLExpressionCS source = opCallExp.getSource();

        assertTrue(source instanceof BooleanLiteralExpCS);

        SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

        String operation = simpleName.getValue();

        assertEquals("and", operation);

        OCLExpressionCS arg = opCallExp.getArguments().get(0);

        assertTrue(arg instanceof OperationCallExpCS);

    }

    protected IOCLExpressionCS ioclExp;

}