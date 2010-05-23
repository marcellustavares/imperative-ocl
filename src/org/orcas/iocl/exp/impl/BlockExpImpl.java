package org.orcas.iocl.exp.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.BlockExp;
import org.orcas.iocl.exp.OclExpression;

public class BlockExpImpl extends ImperativeExpImpl implements BlockExp {

    public void addExpression(OclExpression oclExpression) {
        _expressions.add(oclExpression);
    }

    public List<OclExpression> getExpressions() {
        return _expressions;
    }

    public List<OclExpression> _expressions = new ArrayList<OclExpression>();

}