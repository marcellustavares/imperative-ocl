package org.orcas.iocl.exp;

public interface PropertyCallExp extends OclExpression {

    public SimpleName getSimpleName();

    public OclExpression getSource();

    public void setSimpleName(SimpleName simpleName);

    public void setSource(OclExpression source);

}