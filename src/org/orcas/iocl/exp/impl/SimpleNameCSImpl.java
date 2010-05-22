package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.cst.SimpleTypeEnum;

public class SimpleNameCSImpl extends OCLExpressionCSImpl
    implements SimpleNameCS {

    public SimpleNameCSImpl(Token token) {
        super(token);
    }

    public SimpleTypeEnum getSimpleNameType() {
        return _type;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public void setSimpleNameType(SimpleTypeEnum type) {
        _type = type;
    }

    private String _value;
    private SimpleTypeEnum _type;

}