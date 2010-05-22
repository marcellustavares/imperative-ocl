package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.util.StringUtil;

public class StringLiteralExpImpl extends PrimitiveLiteralExpImpl
    implements StringLiteralExp {

    public String getStringSymbol() {
        return _stringSymbol;
    }

    public void setStringSymbol(String stringSymbol) {
        _stringSymbol = StringUtil.unescape(stringSymbol);
    }

    private String _stringSymbol;

}