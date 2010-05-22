package org.orcas.iocl.exp;

public interface SimpleName extends OclExpression{

    public SimpleTypeEnum getSimpleNameType();

    public String getValue();

    public void setValue(String value);

    public void setSimpleNameType(SimpleTypeEnum type);

}