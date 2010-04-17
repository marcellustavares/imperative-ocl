package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.exception.IOCLException;

public class TestEqualityExp extends TestCase {

    public void testEqualityExp() throws IOCLException{
        String[] exps = new String[] {"true = false", "false <> true "};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

            OCLExpressionCS source = opCallExp.getSource();

            assertTrue(source instanceof BooleanLiteralExpCS);

            SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

            String operation = simpleName.getValue();

            boolean opCheck = (operation.equals("=") || operation.equals("<>"));

            assertTrue(opCheck);
        }
    }

    protected IOCLExpressionCS ioclExp;

}