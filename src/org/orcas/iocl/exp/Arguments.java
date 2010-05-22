package org.orcas.iocl.exp;

import java.util.List;

public interface Arguments {

    public void addArgument(OclExpression argument);

    public List<OclExpression> getArguments();

}