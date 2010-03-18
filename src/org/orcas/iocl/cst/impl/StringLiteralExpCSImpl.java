package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.util.StringUtil;

public class StringLiteralExpCSImpl extends PrimitiveLiteralExpCSImpl
    implements StringLiteralExpCS {

    public StringLiteralExpCSImpl(Token token) {
        super(token);
    }

    public String getStringSymbol() {
        return _stringSymbol;
    }

    public void setStringSymbol(String stringSymbol) {
        _stringSymbol = StringUtil.unescape(stringSymbol);
    }

    private String _stringSymbol;
}