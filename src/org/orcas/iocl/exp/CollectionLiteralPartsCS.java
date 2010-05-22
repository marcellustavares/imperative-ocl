package org.orcas.iocl.exp;

import java.util.List;

public interface CollectionLiteralPartsCS extends OclExpressionCS {

    public void addPart(CollectionLiteralPartCS collectionLiteralPartCS);

    public List<CollectionLiteralPartCS> getParts();

}