package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.Type;
import org.orcas.iocl.exp.VariableInitExp;

public class VariableInitExpImpl extends ImperativeExpImpl
    implements VariableInitExp {

    public SimpleName getSimpleName() {
        return _simpleName;
    }

    public OclExpression getOclExpression() {
        return _oclExpression;
    }

    public Type getType() {
        return _type;
    }

    public void setSimpleName(SimpleName simpleName) {
        _simpleName = simpleName;
    }

    public void setOclExpression(OclExpression ocExpression) {
        _oclExpression = ocExpression;
    }

    public void setType(OclExpression type) {
        _type = (Type) type;
    }

    public SimpleName _simpleName;
    public Type _type;
    public OclExpression _oclExpression;

}