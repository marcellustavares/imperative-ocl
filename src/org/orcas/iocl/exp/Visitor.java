package org.orcas.iocl.exp;


public interface Visitor<T> {

    T visitStringLiteralExp(StringLiteralExp stringLiteralExp);

}