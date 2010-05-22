package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionTypeIdentifier;

public class CollectionLiteralExpImpl extends LiteralExpImpl
    implements CollectionLiteralExp {

    public CollectionTypeIdentifier getCollectionKind() {
        return _collectionTypeIdentifier;
    }

    public CollectionLiteralParts getCollectionParts() {
        return _collectionLiteralParts;
    }

    public void setCollectionKind(
            CollectionTypeIdentifier collectionTypeIdentifier) {

        _collectionTypeIdentifier = collectionTypeIdentifier;
    }

    public void setCollectionParts(
            CollectionLiteralParts collectionLiteralParts) {

        _collectionLiteralParts = collectionLiteralParts;
    }

    private CollectionTypeIdentifier _collectionTypeIdentifier;

    private CollectionLiteralParts _collectionLiteralParts;

}