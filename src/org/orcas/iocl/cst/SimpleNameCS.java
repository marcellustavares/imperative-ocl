package org.orcas.iocl.cst;

public interface SimpleNameCS extends OclExpressionCS{

    public SimpleTypeEnum getSimpleNameType();

    public String getValue();

    public void setValue(String value);

    public void setSimpleNameType(SimpleTypeEnum type);

}