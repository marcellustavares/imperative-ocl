package org.orcas.iocl.cst;

import org.orcas.iocl.cst.impl.NodeCSImpl;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class NodeCSAdaptor extends CommonTreeAdaptor{

    public NodeCS create(Token payload) {
        return new NodeCSImpl(payload);
    }

    public NodeCS errorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
        return null; //super.errorNode(input, start, stop, e);
    }

}