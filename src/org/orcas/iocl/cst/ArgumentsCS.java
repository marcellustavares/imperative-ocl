package org.orcas.iocl.cst;

import java.util.List;

public interface ArgumentsCS {

    public void addArgument(OclExpressionCS argument);

    public List<OclExpressionCS> getArguments();

}