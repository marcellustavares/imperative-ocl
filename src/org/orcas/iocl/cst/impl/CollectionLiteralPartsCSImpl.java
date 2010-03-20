package org.orcas.iocl.cst.impl;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;

public class CollectionLiteralPartsCSImpl extends CollectionLiteralExpCSImpl
    implements CollectionLiteralPartsCS {

    public CollectionLiteralPartsCSImpl(Token token) {
        super(token);
    }

    public void addPart(CollectionLiteralPartCS collectionLiteralPartCS) {
        _parts.add(collectionLiteralPartCS);
    }

    public List<CollectionLiteralPartCS> getParts() {
        return _parts;
    }

    private List<CollectionLiteralPartCS> _parts =
        new ArrayList<CollectionLiteralPartCS>();

}