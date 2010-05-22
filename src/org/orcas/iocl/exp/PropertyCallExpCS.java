package org.orcas.iocl.exp;

public interface PropertyCallExpCS extends OclExpressionCS {

    public SimpleNameCS getSimpleNameCS();

    public OclExpressionCS getSource();

    public void setSimpleNameCS(SimpleNameCS simpleNameCS);

    public void setSource(OclExpressionCS source);

}