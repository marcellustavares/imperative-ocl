package org.orcas.iocl.exp;

public interface Visitor<T> {

    public T visitStringLiteralExp(StringLiteralExp stringLiteralExp);

}