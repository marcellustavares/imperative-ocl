package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.exp.Visitor;

public class StringLiteralExpImpl implements StringLiteralExp {

    public String getStringSymbol() {
        return _stringSymbol;
    }

    public void setStringSymbol(String stringSymbol) {
        _stringSymbol = stringSymbol;
    }

    public <T, V extends Visitor<T>> T accept(V v) {
        return ((Visitor<T>)v).visitStringLiteralExp(this);
    }

    private String _stringSymbol;

}