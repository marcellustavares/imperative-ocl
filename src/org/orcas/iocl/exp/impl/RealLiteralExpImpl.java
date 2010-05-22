package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.RealLiteralExp;

public class RealLiteralExpImpl extends NumericLiteralExpImpl
    implements RealLiteralExp {

    public Double getRealSymbol() {
        return _realSymbol;
    }

    public void setRealSymbol(Double realSymbol) {
        _realSymbol = realSymbol;
    }

    private Double _realSymbol;

}