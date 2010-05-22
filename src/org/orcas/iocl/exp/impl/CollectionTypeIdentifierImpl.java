package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.util.StringPool;
import org.orcas.iocl.util.Validator;

public class CollectionTypeIdentifierImpl extends CollectionTypeImpl
    implements CollectionTypeIdentifier {

    public int getCollectionType() {
        return _type;
    }

    public void setCollectionType(int type) {
        _type = type;
    }

    public void setCollectionType(String type) {
        if (Validator.equals(type, StringPool.BAG)) {
            _type = CollectionTypeIdentifier.BAG;
        }
        else if (Validator.equals(type, StringPool.COLLECTION)) {
            _type = CollectionTypeIdentifier.COLLECTION;
        }
        else if (Validator.equals(type, StringPool.ORDERED_SET)) {
            _type = CollectionTypeIdentifier.ORDERED_SET;
        }
        else if (Validator.equals(type, StringPool.SEQUENCE)) {
            _type = CollectionTypeIdentifier.SEQUENCE;
        }
        else {
            _type = CollectionTypeIdentifier.SET;
        }
    }

    private int _type;

}