package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.SimpleTypeEnum;

public class SimpleNameImpl extends OCLExpressionImpl
    implements SimpleName {

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