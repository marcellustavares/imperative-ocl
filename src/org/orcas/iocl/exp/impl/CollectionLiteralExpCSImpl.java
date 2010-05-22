package org.orcas.iocl.cst.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;

public class CollectionLiteralExpCSImpl extends LiteralExpCSImpl
    implements CollectionLiteralExpCS {

    public CollectionLiteralExpCSImpl(Token token) {
        super(token);
    }

    public CollectionTypeIdentifierCS getCollectionKind() {
        return _collectionTypeIdentifierCS;
    }

    public CollectionLiteralPartsCS getCollectionParts() {
        return _collectionLiteralPartsCS;
    }

    public void setCollectionKind(
            CollectionTypeIdentifierCS collectionTypeIdentifierCS) {

        _collectionTypeIdentifierCS = collectionTypeIdentifierCS;
    }

    public void setCollectionParts(
            CollectionLiteralPartsCS collectionLiteralPartsCS) {

        _collectionLiteralPartsCS = collectionLiteralPartsCS;
    }

    private CollectionTypeIdentifierCS _collectionTypeIdentifierCS;

    private CollectionLiteralPartsCS _collectionLiteralPartsCS;

}