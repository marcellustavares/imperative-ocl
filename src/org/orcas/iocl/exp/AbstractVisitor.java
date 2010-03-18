package org.orcas.iocl.exp;

public abstract class AbstractVisitor<T> implements Visitor<T> {

    public T visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
        return null;
    }

}