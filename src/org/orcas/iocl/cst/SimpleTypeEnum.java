package org.orcas.iocl.cst;

public enum SimpleTypeEnum {

    INTEGER_LITERAL(3, "Integer", "Integer");

    private SimpleTypeEnum(int value, String name, String literal) {
        _value = value;
        _name = name;
        _literal = literal;
    }

    public String getLiteral() {
        return _literal;
    }

    public String getName() {
        return _name;
    }

    public int getValue() {
        return _value;
    }

    private int _value;
    private String _name;
    private String _literal;

}