package org.orcas.iocl.exp;

public interface SimpleNameCS extends OclExpressionCS{

    public SimpleTypeEnum getSimpleNameType();

    public String getValue();

    public void setValue(String value);

    public void setSimpleNameType(SimpleTypeEnum type);

}