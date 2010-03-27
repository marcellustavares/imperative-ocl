package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.SimpleNameCS;

public class SimpleNameCSImpl extends OCLExpressionCSImpl
    implements SimpleNameCS {

    public SimpleNameCSImpl(Token token) {
        super(token);
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    private String _value;

}