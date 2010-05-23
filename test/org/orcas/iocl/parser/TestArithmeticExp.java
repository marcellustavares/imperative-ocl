package org.orcas.iocl.parser;

import java.util.List;

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.NumericLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.SimpleName;

public class TestArithmeticExp extends TestCase {

    public void testUnaryExp() throws IOCLException{
        String[] exps = new String[] {" -1", "- 1.2 "};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            checkUnaryExp(oclExp);
        }
    }

    public void testMultiplicativeExp() throws IOCLException{
        String[] exps = new String[] {
            "1*1", "2 / 3", "1.2 /    4", "2.6   *4.3"};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            checkMultiplicativeExp(oclExp);
        }
    }

    public void testAdditiveExp() throws IOCLException{
        String[] exps = new String[] {
            "1+1", "2 - 3", "1.2 +    4", "2.6   -4.3"};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            checkAdditiveExp(oclExp);
        }
    }

    public void testArithmeticExp() throws IOCLException{
        String[] exps = new String[] {"-1+2", "-1-1"};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            // operationCallExp (+|-) numericLiteralExp

            checkAdditiveExp(oclExp);

            // (- numericLiteralExp)

            OperationCallExp opCallExp = (OperationCallExp) oclExp;

            OclExpression source = opCallExp.getSource();

            checkUnaryExp(source);
        }

        exps = new String[] {"-1*2", "-1/1"};

        for (String exp : exps) {
            oclExp = iocl.parse(exp);

            // operationCallExp (*|/) numericLiteralExp

            checkMultiplicativeExp(oclExp);

            // (-|+) numericLiteralExp

            OperationCallExp opCallExp = (OperationCallExp) oclExp;

            OclExpression source = opCallExp.getSource();

            checkUnaryExp(source);
        }
    }

    protected void checkAdditiveExp(OclExpression ioclExp) {
        assertTrue(ioclExp instanceof OperationCallExp);

        OperationCallExp opCallExp = (OperationCallExp) ioclExp;

        OclExpression lhs = opCallExp.getSource();

        if (lhs instanceof OperationCallExp) {
            checkMultiplicativeExp(lhs);
        }
        else {
            assertTrue(lhs instanceof NumericLiteralExp);
        }

        SimpleName sipleName = opCallExp.getSimpleName();

        String operation = sipleName.getValue();

        boolean opCheck = (operation.equals("+") || operation.equals("-"));

        assertTrue(opCheck);

        List<OclExpression> args = opCallExp.getArguments();

        assertTrue(args.size() == 1);

        OclExpression rhs = args.get(0);

        if (rhs instanceof OperationCallExp) {
            checkMultiplicativeExp(rhs);
        }
        else {
            assertTrue(rhs instanceof NumericLiteralExp);
        }
    }

    protected void checkMultiplicativeExp(OclExpression oclExp) {
        assertTrue(oclExp instanceof OperationCallExp);

        OperationCallExp opCallExp = (OperationCallExp) oclExp;

        OclExpression lhs = opCallExp.getSource();

        if (lhs instanceof OperationCallExp) {
            checkUnaryExp(lhs);
        }
        else {
            assertTrue(lhs instanceof NumericLiteralExp);
        }

        SimpleName simpleName = opCallExp.getSimpleName();

        String operation = simpleName.getValue();

        if (operation.equals("+") || operation.equals("-")) {
            return;
        }

        boolean opCheck = (operation.equals("*") || operation.equals("/"));

        assertTrue(opCheck);

        List<OclExpression> args = opCallExp.getArguments();

        assertTrue(args.size() == 1);

        OclExpression rhs = args.get(0);

        if (rhs instanceof OperationCallExp) {
            checkUnaryExp(rhs);
        }
        else {
            assertTrue(rhs instanceof NumericLiteralExp);
        }
    }

    protected void checkUnaryExp(OclExpression oclExp) {
        assertTrue(oclExp instanceof OperationCallExp);

        OperationCallExp opCallExp = (OperationCallExp) oclExp;

        OclExpression source = opCallExp.getSource();

        assertTrue(source instanceof NumericLiteralExp);

        SimpleName simpleName = opCallExp.getSimpleName();

        String operation = simpleName.getValue();

        boolean opCheck = operation.equals("-");

        assertTrue(opCheck);
    }

    protected String exp;
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}