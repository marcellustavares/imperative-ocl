package org.orcas.iocl.parser;

import java.util.List;

import junit.framework.TestCase;

import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.exception.IOCLException;

public class TestOperationCallExp extends TestCase {

    public void testUnaryExp() throws IOCLException{
        String[] exps = new String[] {" -1", "- 1.2 ", "+3", " + 33 "};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            checkUnaryExp(ioclExp);
        }
    }

    public void testMultiplicativeExp() throws IOCLException{
        String[] exps = new String[] {
            "1*1", "2 / 3", "1.2 /    4", "2.6   *4.3"};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            checkMultiplicativeExp(ioclExp);
        }
    }

    public void testAdditiveExp() throws IOCLException{
        String[] exps = new String[] {
            "1+1", "2 - 3", "1.2 +    4", "2.6   -4.3"};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            checkAdditiveExp(ioclExp);
        }
    }

    public void testArithmeticExp() throws IOCLException{
        String[] exps = new String[] {"-1+2", "+1+2", "+1-2", "-1-1"};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            // operationCallExp (+|-) numericLiteralExp

            checkAdditiveExp(ioclExp);

            // (-|+) numericLiteralExp

            OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

            OCLExpressionCS source = opCallExp.getSource();

            checkUnaryExp(source);
        }

        exps = new String[] {"-1*2", "+1*2", "+1/2", "-1/1"};

        for (String exp : exps) {
            ioclExp = IOCLParserUtil.parse(exp);

            // operationCallExp (*|/) numericLiteralExp

            checkMultiplicativeExp(ioclExp);

            // (-|+) numericLiteralExp

            OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

            OCLExpressionCS source = opCallExp.getSource();

            checkUnaryExp(source);
        }
    }

    protected void checkAdditiveExp(IOCLExpressionCS ioclExp) {
        assertTrue(ioclExp instanceof OperationCallExpCS);

        OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

        OCLExpressionCS lhs = opCallExp.getSource();

        if (lhs instanceof OperationCallExpCS) {
            checkMultiplicativeExp(lhs);
        }
        else {
            assertTrue(lhs instanceof NumericLiteralExpCS);
        }

        SimpleNameCS sipleName = opCallExp.getSimpleNameCS();

        String operation = sipleName.getValue();

        boolean opCheck = (operation.equals("+") || operation.equals("-"));

        assertTrue(opCheck);

        List<OCLExpressionCS> args = opCallExp.getArguments();

        assertTrue(args.size() == 1);

        OCLExpressionCS rhs = args.get(0);

        if (rhs instanceof OperationCallExpCS) {
            checkMultiplicativeExp(rhs);
        }
        else {
            assertTrue(rhs instanceof NumericLiteralExpCS);
        }
    }

    protected void checkMultiplicativeExp(IOCLExpressionCS ioclExp) {
        assertTrue(ioclExp instanceof OperationCallExpCS);

        OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

        OCLExpressionCS lhs = opCallExp.getSource();

        if (lhs instanceof OperationCallExpCS) {
            checkUnaryExp(lhs);
        }
        else {
            assertTrue(lhs instanceof NumericLiteralExpCS);
        }

        SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

        String operation = simpleName.getValue();

        if (operation.equals("+") || operation.equals("-")) {
            return;
        }

        boolean opCheck = (operation.equals("*") || operation.equals("/"));

        assertTrue(opCheck);

        List<OCLExpressionCS> args = opCallExp.getArguments();

        assertTrue(args.size() == 1);

        OCLExpressionCS rhs = args.get(0);

        if (rhs instanceof OperationCallExpCS) {
            checkUnaryExp(rhs);
        }
        else {
            assertTrue(rhs instanceof NumericLiteralExpCS);
        }
    }

    protected void checkUnaryExp(IOCLExpressionCS ioclExp) {
        assertTrue(ioclExp instanceof OperationCallExpCS);

        OperationCallExpCS opCallExp = (OperationCallExpCS) ioclExp;

        OCLExpressionCS source = opCallExp.getSource();

        assertTrue(source instanceof NumericLiteralExpCS);

        SimpleNameCS simpleName = opCallExp.getSimpleNameCS();

        String operation = simpleName.getValue();

        boolean opCheck = (operation.equals("-") || operation.equals("+"));

        assertTrue(opCheck);
    }

    protected IOCLExpressionCS ioclExp;

}