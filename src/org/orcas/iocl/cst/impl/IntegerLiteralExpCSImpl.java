package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.IntegerLiteralExpCS;

public class IntegerLiteralExpCSImpl extends NumericLiteralExpCSImpl
    implements IntegerLiteralExpCS {

    public IntegerLiteralExpCSImpl(Token token) {
        super(token);
    }

    public Integer getIntegerSymbol() {
        return _integerSymbol;
    }

    public void setIntegerSymbol(Integer integerSymbol) {
        _integerSymbol = integerSymbol;
    }

    private Integer _integerSymbol;

}