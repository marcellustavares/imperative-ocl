package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.exp.BooleanLiteralExpCS;

public class BooleanLiteralExpCSImpl extends PrimitiveLiteralExpCSImpl
    implements BooleanLiteralExpCS {

    public BooleanLiteralExpCSImpl(Token token) {
        super(token);
    }

    public Boolean getBooleanSymbol() {
        return _booleanSymbol;
    }

    public void setBooleanSymbol(Boolean booleanSymbol) {
        _booleanSymbol = booleanSymbol;
    }

    private Boolean _booleanSymbol;

}