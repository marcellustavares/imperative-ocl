package org.orcas.iocl.exp;

import org.orcas.iocl.util.Validator;

public enum SimpleTypeEnum {

    IDENTIFIER("identifier"),
    SELF("self"),
    INTEGER("Integer"),
    STRING("String"),
    BOOLEAN("Boolean"),
    REAL("Real"),
    OCL_ANY("OclAny");

    private SimpleTypeEnum(String value) {
        _value = value;
    }

    public static SimpleTypeEnum get(String value) {
        for (int i = 0; i < _simpleTypes.length; i++) {
            SimpleTypeEnum simpleType = _simpleTypes[i];

            if (Validator.equals(value, simpleType.getType())) {
                return simpleType;
            }
        }
        return null;
    }

    public String getType() {
        return _value;
    }

    private static SimpleTypeEnum[] _simpleTypes = new SimpleTypeEnum[]{
        IDENTIFIER, SELF, INTEGER, STRING, REAL, BOOLEAN, OCL_ANY};
    private String _value;

}