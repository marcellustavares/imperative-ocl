package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.ModelPropertyCallExpCS;

public class ModelPropertyCallExpCSImpl extends PropertyCallExpCSImpl
    implements ModelPropertyCallExpCS {

    public ModelPropertyCallExpCSImpl(Token token) {
        super(token);
    }

}