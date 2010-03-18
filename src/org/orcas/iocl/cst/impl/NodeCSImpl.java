package org.orcas.iocl.cst.impl;

import org.orcas.iocl.cst.NodeCS;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class NodeCSImpl extends CommonTree implements NodeCS {

    public NodeCSImpl(Token token) {
        super(token);
    }

    public Object getAst() {
        return _ast;
    }

    public void setAst(Object ast) {
        _ast = ast;
    }

    private Object _ast;

}