package org.orcas.iocl.exp;

import java.util.List;

public interface OperationCallExp extends ModelPropertyCallExp {

    public void addArgument(OclExpression argument);

    public List<OclExpression> getArguments();

    public void setArguments(List<OclExpression> arguments);

}