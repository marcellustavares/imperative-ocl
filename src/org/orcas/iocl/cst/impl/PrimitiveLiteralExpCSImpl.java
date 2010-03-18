package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.PrimitiveLiteralExpCS;

public class PrimitiveLiteralExpCSImpl extends LiteralExpCSImpl
    implements PrimitiveLiteralExpCS {


    public PrimitiveLiteralExpCSImpl(Token token) {
        super(token);
    }

}