package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.exp.PrimitiveLiteralExpCS;

public class PrimitiveLiteralExpCSImpl extends LiteralExpCSImpl
    implements PrimitiveLiteralExpCS {


    public PrimitiveLiteralExpCSImpl(Token token) {
        super(token);
    }

}