package org.orcas.iocl.handler;

import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.IOCLExpression;
import org.orcas.iocl.handler.impl.IOCLHandlerImpl;

public class IOCLHandlerUtil {

    public static IOCLExpression parseIOCLExpression(String expression)
        throws IOCLException {

        _handler.setExpression(expression);

        return _handler.parseIOCLExpression();
    }

    private static IOCLHandler _handler = new IOCLHandlerImpl();

}