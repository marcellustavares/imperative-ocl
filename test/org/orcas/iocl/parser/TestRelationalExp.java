package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.exception.IOCLException;

public class TestRelationalExp extends TestCase {

    public void testEqualityExp() throws IOCLException{
        String[] exps = new String[] {"1 < 2", "1.2 >= 0 "};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

            OCLExpressionCS source = opCallExp.getSource();

            assertTrue(source instanceof NumericLiteralExpCS);

            SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

            String operation = simpleName.getValue();

            boolean opCheck = (operation.equals("<") || operation.equals(">="));

            assertTrue(opCheck);
        }
    }

    protected IOCLExpressionCS ioclExp;

}