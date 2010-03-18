package org.orcas.iocl.handler;

import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.IOCLExpression;

public interface IOCLHandler {

    public void setExpression(String expression);

    public IOCLExpression parseIOCLExpression() throws IOCLException;

}