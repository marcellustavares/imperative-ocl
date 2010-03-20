package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.OCLExpressionCS;

public class CollectionLiteralPartCSImpl extends OCLExpressionCSImpl
    implements CollectionLiteralPartCS {

    public CollectionLiteralPartCSImpl(Token token) {
        super(token);
    }

    public OCLExpressionCS getOCLExpresionCS() {
        return _ocleExpressionCS;
    }

    public void setOCLExpresionCS(OCLExpressionCS oclExpressionCS) {
        _ocleExpressionCS = oclExpressionCS;
    }

    private OCLExpressionCS _ocleExpressionCS;

}