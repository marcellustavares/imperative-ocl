package org.orcas.iocl.cst;

public interface SimpleNameCS extends OCLExpressionCS{

    public SimpleTypeEnum getSimpleNameType();

    public String getValue();

    public void setValue(String value);

    public void setSimpleNameType(SimpleTypeEnum type);

}