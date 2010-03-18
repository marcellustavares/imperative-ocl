package org.orcas.iocl.handler.impl;

import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.IOCLExpression;
import org.orcas.iocl.exp.LiteralExp;
import org.orcas.iocl.exp.OCLExpression;
import org.orcas.iocl.exp.PrimitiveLiteralExp;
import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.exp.impl.StringLiteralExpImpl;
import org.orcas.iocl.handler.IOCLHandler;
import org.orcas.iocl.parser.IOCLParserUtil;
import org.orcas.iocl.util.Validator;

public class IOCLHandlerImpl implements IOCLHandler {

    public void setExpression(String expression) {
        _expression = expression;
    }

    public IOCLExpression parseIOCLExpression() throws IOCLException {
        if (Validator.isNotNull(_expression)) {
            IOCLExpressionCS expCS = IOCLParserUtil.parse(_expression);

            return createIOCLExpression(expCS);
        }

        return null;
    }

    protected IOCLExpression createIOCLExpression(IOCLExpressionCS expCS) {
        if (expCS instanceof OCLExpressionCS) {
            return createOCLExpression((OCLExpressionCS) expCS);
        }

        return null;
    }

    protected OCLExpression createOCLExpression(OCLExpressionCS expCS) {
        if (expCS instanceof LiteralExpCS) {
            return createLiteralExp((LiteralExpCS) expCS);
        }

        return null;
    }

    protected LiteralExp createLiteralExp(LiteralExpCS expCS) {
        if (expCS instanceof PrimitiveLiteralExpCS) {
            return createPrimitiveLiteralExp((PrimitiveLiteralExpCS) expCS);
        }

        return null;
    }

    protected PrimitiveLiteralExp createPrimitiveLiteralExp(
        PrimitiveLiteralExpCS expCS) {

        if (expCS instanceof StringLiteralExpCS) {
            return createStringLiteralExp((StringLiteralExpCS) expCS);
        }

        return null;
    }

    protected StringLiteralExp createStringLiteralExp(
        StringLiteralExpCS expCS) {

        StringLiteralExp result = new StringLiteralExpImpl();

        result.setStringSymbol(expCS.getStringSymbol());

        return result;
    }

    private String _expression;

}