package org.orcas.iocl.exp;

public interface VariableInitExp extends OclExpression {

    public SimpleName getSimpleName();

    public OclExpression getOclExpression();

    public Type getType();

    public void setSimpleName(SimpleName simpleName);

    public void setOclExpression(OclExpression ocExpression);

    public void setType(OclExpression type);

}