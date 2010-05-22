package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.BooleanLiteralExp;

public class BooleanLiteralExpImpl extends PrimitiveLiteralExpImpl
    implements BooleanLiteralExp {

    public Boolean getBooleanSymbol() {
        return _booleanSymbol;
    }

    public void setBooleanSymbol(Boolean booleanSymbol) {
        _booleanSymbol = booleanSymbol;
    }

    private Boolean _booleanSymbol;

}