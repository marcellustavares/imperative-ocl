package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.NodeCS;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class NodeCSImpl extends CommonTree implements NodeCS {

    public NodeCSImpl(Token token) {
        super(token);

        _token = token;
    }

    public Object getAst() {
        return _ast;
    }

    public Token getToken() {
        return _token;
    }

    public void setAst(Object ast) {
        _ast = ast;
    }

    private Object _ast;
    private Token _token;

}