package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.exp.NumericLiteralExpCS;

public class NumericLiteralExpCSImpl extends PrimitiveLiteralExpCSImpl
    implements NumericLiteralExpCS {

    public NumericLiteralExpCSImpl(Token token) {
        super(token);
    }

}