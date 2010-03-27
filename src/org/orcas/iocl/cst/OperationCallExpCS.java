package org.orcas.iocl.cst;

import java.util.List;

public interface OperationCallExpCS extends ModelPropertyCallExpCS {

    public void addArgument(OCLExpressionCS argument);

    public List<OCLExpressionCS> getArguments();

}