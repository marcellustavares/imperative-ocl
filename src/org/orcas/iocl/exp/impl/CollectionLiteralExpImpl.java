package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.exp.OclExpression;

public class CollectionLiteralExpImpl extends LiteralExpImpl
    implements CollectionLiteralExp {

    public CollectionTypeIdentifier getCollectionKind() {
        return _collectionTypeIdentifier;
    }

    public CollectionLiteralParts getCollectionLiteralParts() {
        return _collectionLiteralParts;
    }

    public void setCollectionKind(
            CollectionTypeIdentifier collectionTypeIdentifier) {

        _collectionTypeIdentifier = collectionTypeIdentifier;
    }

    public void setCollectionLiteralParts(
        OclExpression collectionLiteralParts) {

        _collectionLiteralParts =
            (CollectionLiteralParts) collectionLiteralParts;
    }

    private CollectionTypeIdentifier _collectionTypeIdentifier;
    private CollectionLiteralParts _collectionLiteralParts;

}