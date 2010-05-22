package org.orcas.iocl.exp;


public interface CollectionLiteralExp extends LiteralExp {

    public CollectionTypeIdentifier getCollectionKind();

    public CollectionLiteralParts getCollectionParts();

    public void setCollectionKind(
        CollectionTypeIdentifier collectionTypeIdentifier);

    public void setCollectionParts(
        CollectionLiteralParts collectionLiteralParts);

}