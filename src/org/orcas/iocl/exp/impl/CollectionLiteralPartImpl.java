package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.CollectionLiteralPart;
import org.orcas.iocl.exp.OclExpression;

public class CollectionLiteralPartImpl extends OCLExpressionImpl
    implements CollectionLiteralPart {

    public OclExpression getOCLExpresion() {
        return _ocleExpression;
    }

    public void setOCLExpresion(OclExpression oclExpression) {
        _ocleExpression = oclExpression;
    }

    private OclExpression _ocleExpression;

}