package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.RealLiteralExpCS;

public class RealLiteralExpCSImpl extends NumericLiteralExpCSImpl
    implements RealLiteralExpCS {

    public RealLiteralExpCSImpl(Token token) {
        super(token);
    }

    public Double getRealSymbol() {
        return _realSymbol;
    }

    public void setRealSymbol(Double realSymbol) {
        _realSymbol = realSymbol;
    }

    private Double _realSymbol;

}