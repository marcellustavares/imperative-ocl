package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.exp.ModelPropertyCallExpCS;

public class ModelPropertyCallExpCSImpl extends PropertyCallExpCSImpl
    implements ModelPropertyCallExpCS {

    public ModelPropertyCallExpCSImpl(Token token) {
        super(token);
    }

}