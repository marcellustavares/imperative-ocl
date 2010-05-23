package org.orcas.iocl.exp;

public interface CollectionLiteralExp extends LiteralExp {

    public CollectionTypeIdentifier getCollectionKind();

    public CollectionLiteralParts getCollectionLiteralParts();

    public void setCollectionKind(
        CollectionTypeIdentifier collectionTypeIdentifier);

    public void setCollectionLiteralParts(
        OclExpression collectionLiteralParts);

}