package org.orcas.iocl.parser;

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.BooleanLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.SimpleName;

public class TestEqualityExp extends TestCase {

    public void testEqualityExp() throws IOCLException{
        String[] exps = new String[] {"true = false", "false <> true "};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            OperationCallExp opCallExp = (OperationCallExp) oclExp;

            OclExpression source = opCallExp.getSource();

            assertTrue(source instanceof BooleanLiteralExp);

            SimpleName simpleName = opCallExp.getSimpleName();

            String operation = simpleName.getValue();

            boolean opCheck = (operation.equals("=") || operation.equals("<>"));

            assertTrue(opCheck);
        }
    }

    protected String exp;
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}