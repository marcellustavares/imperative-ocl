package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.OclExpressionCS;

public class CollectionLiteralPartCSImpl extends OCLExpressionCSImpl
    implements CollectionLiteralPartCS {

    public CollectionLiteralPartCSImpl(Token token) {
        super(token);
    }

    public OclExpressionCS getOCLExpresionCS() {
        return _ocleExpressionCS;
    }

    public void setOCLExpresionCS(OclExpressionCS oclExpressionCS) {
        _ocleExpressionCS = oclExpressionCS;
    }

    private OclExpressionCS _ocleExpressionCS;

}