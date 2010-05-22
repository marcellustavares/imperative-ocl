package org.orcas.iocl.exp;

import org.antlr.runtime.Token;

public interface NodeCS {

    public Object getAst();

    public Token getToken();

    public void setAst(Object ast);

}