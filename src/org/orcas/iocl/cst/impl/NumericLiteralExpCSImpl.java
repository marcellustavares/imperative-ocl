package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.NumericLiteralExpCS;

public class NumericLiteralExpCSImpl extends PrimitiveLiteralExpCSImpl
    implements NumericLiteralExpCS {

    public NumericLiteralExpCSImpl(Token token) {
        super(token);
    }

}