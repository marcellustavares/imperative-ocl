package org.orcas.iocl.exp.impl;

import org.antlr.runtime.Token;
import org.orcas.iocl.exp.CollectionTypeIdentifierCS;
import org.orcas.iocl.util.StringPool;
import org.orcas.iocl.util.Validator;

public class CollectionTypeIdentifierCSImpl extends CollectionTypeCSImpl
    implements CollectionTypeIdentifierCS {

    public CollectionTypeIdentifierCSImpl(Token token) {
        super(token);
    }

    public int getCollectionType() {
        return _type;
    }

    public void setCollectionType(int type) {
        _type = type;
    }

    public void setCollectionType(String type) {
        if (Validator.equals(type, StringPool.BAG)) {
            _type = CollectionTypeIdentifierCS.BAG;
        }
        else if (Validator.equals(type, StringPool.COLLECTION)) {
            _type = CollectionTypeIdentifierCS.COLLECTION;
        }
        else if (Validator.equals(type, StringPool.ORDERED_SET)) {
            _type = CollectionTypeIdentifierCS.ORDERED_SET;
        }
        else if (Validator.equals(type, StringPool.SEQUENCE)) {
            _type = CollectionTypeIdentifierCS.SEQUENCE;
        }
        else {
            _type = CollectionTypeIdentifierCS.SET;
        }
    }

    private int _type;

}