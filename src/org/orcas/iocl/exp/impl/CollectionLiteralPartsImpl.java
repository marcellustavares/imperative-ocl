package org.orcas.iocl.exp.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.CollectionLiteralPart;
import org.orcas.iocl.exp.CollectionLiteralParts;

public class CollectionLiteralPartsImpl extends OCLExpressionImpl
    implements CollectionLiteralParts {

    public void addPart(CollectionLiteralPart collectionLiteralPart) {
        _parts.add(collectionLiteralPart);
    }

    public List<CollectionLiteralPart> getParts() {
        return _parts;
    }

    private List<CollectionLiteralPart> _parts =
        new ArrayList<CollectionLiteralPart>();

}