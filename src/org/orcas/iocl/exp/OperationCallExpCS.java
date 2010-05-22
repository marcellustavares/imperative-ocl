package org.orcas.iocl.exp;

import java.util.List;

public interface OperationCallExpCS extends ModelPropertyCallExpCS {

    public void addArgument(OclExpressionCS argument);

    public List<OclExpressionCS> getArguments();

    public void setArguments(List<OclExpressionCS> arguments);

}