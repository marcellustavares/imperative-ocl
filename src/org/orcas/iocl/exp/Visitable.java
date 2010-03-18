package org.orcas.iocl.exp;

public interface Visitable {

    public <T, V extends Visitor<T>> T accept(V v);

}