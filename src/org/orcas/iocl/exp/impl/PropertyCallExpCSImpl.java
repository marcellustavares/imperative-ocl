package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.OclExpressionCS;
import org.orcas.iocl.cst.PropertyCallExpCS;
import org.orcas.iocl.cst.SimpleNameCS;

public class PropertyCallExpCSImpl extends OCLExpressionCSImpl
    implements PropertyCallExpCS {

    public PropertyCallExpCSImpl(Token token) {
        super(token);
    }

    public SimpleNameCS getSimpleNameCS() {
        return _simpleNameCS;
    }

    public OclExpressionCS getSource() {
        return _source;
    }

    public void setSimpleNameCS(SimpleNameCS simpleNameCS) {
        _simpleNameCS = simpleNameCS;
    }

    public void setSource(OclExpressionCS source) {
        _source = source;
    }

    private SimpleNameCS _simpleNameCS;
    private OclExpressionCS _source;

}