package org.orcas.iocl.exp;

public abstract class AbstractVisitor<T> implements Visitor<T> {

    public final T visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
        return handleStringLiteralExp(stringLiteralExp);
    }

    protected abstract T handleStringLiteralExp(
        StringLiteralExp stringLiteralExp);

}