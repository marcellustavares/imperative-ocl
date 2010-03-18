package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.LiteralExpCS;

public class LiteralExpCSImpl extends OCLExpressionCSImpl
    implements LiteralExpCS {

    public LiteralExpCSImpl(Token token) {
        super(token);
    }


}