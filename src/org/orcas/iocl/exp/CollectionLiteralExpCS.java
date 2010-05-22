package org.orcas.iocl.exp;


public interface CollectionLiteralExpCS extends LiteralExpCS {

    public CollectionTypeIdentifierCS getCollectionKind();

    public CollectionLiteralPartsCS getCollectionParts();

    public void setCollectionKind(
        CollectionTypeIdentifierCS collectionTypeIdentifierCS);

    public void setCollectionParts(
        CollectionLiteralPartsCS collectionLiteralPartsCS);

}