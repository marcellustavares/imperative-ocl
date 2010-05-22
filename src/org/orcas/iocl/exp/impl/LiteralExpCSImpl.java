package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.exp.LiteralExpCS;

public class LiteralExpCSImpl extends OCLExpressionCSImpl
    implements LiteralExpCS {

    public LiteralExpCSImpl(Token token) {
        super(token);
    }


}