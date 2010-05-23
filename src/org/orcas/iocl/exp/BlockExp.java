package org.orcas.iocl.exp;

import java.util.List;

public interface BlockExp extends ImperativeExp {

    public void addExpression(OclExpression oclExpression);

    public List<OclExpression> getExpressions();

}