package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.IntegerLiteralExp;

public class IntegerLiteralExpImpl extends NumericLiteralExpImpl
    implements IntegerLiteralExp {

    public Integer getIntegerSymbol() {
        return _integerSymbol;
    }

    public void setIntegerSymbol(Integer integerSymbol) {
        _integerSymbol = integerSymbol;
    }

    private Integer _integerSymbol;

}