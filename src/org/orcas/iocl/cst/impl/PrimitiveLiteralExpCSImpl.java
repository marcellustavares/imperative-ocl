package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.PrimitiveLiteralExpCS;

public class PrimitiveLiteralExpCSImpl extends LiteralExpCSImpl
    implements PrimitiveLiteralExpCS {


    public PrimitiveLiteralExpCSImpl(Token token) {
        super(token);
    }

    public String getSymbol() {
        return _symbol;
    }

    public void setSymbol(String symbol) {
        _symbol = symbol;
    }

    private String _symbol;

}