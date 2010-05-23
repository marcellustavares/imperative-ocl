package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.CollectionType;
import org.orcas.iocl.exp.CollectionTypeIdentifier;

public class CollectionTypeImpl extends TypeImpl
    implements CollectionType {

    public CollectionTypeIdentifier getCollectionTypeIdentifier() {
        return _collectionTypeIdentifier;
    }

    public void setCollectionTypeIdentifier(
        CollectionTypeIdentifier collectionTypeIdentifier) {

        _collectionTypeIdentifier = collectionTypeIdentifier;
    }

    public CollectionTypeIdentifier _collectionTypeIdentifier;

}