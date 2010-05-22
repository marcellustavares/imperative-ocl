package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.PropertyCallExp;
import org.orcas.iocl.exp.SimpleName;

public class PropertyCallExpImpl extends OCLExpressionImpl
    implements PropertyCallExp {

    public SimpleName getSimpleName() {
        return _simpleName;
    }

    public OclExpression getSource() {
        return _source;
    }

    public void setSimpleName(SimpleName simpleName) {
        _simpleName = simpleName;
    }

    public void setSource(OclExpression source) {
        _source = source;
    }

    private SimpleName _simpleName;
    private OclExpression _source;

}