package org.orcas.iocl.cst;

import java.util.List;

public interface ArgumentsCS {

    public void addArgument(OCLExpressionCS argument);

    public List<OCLExpressionCS> getArguments();

}