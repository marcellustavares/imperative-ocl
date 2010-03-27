package org.orcas.iocl.cst;

public interface PropertyCallExpCS extends OCLExpressionCS {

    public SimpleNameCS getSimpleNameCS();

    public OCLExpressionCS getSource();

    public void setSimpleNameCS(SimpleNameCS simpleNameCS);

    public void setSource(OCLExpressionCS source);

}