package org.orcas.iocl.cst;

import java.util.List;

public interface CollectionLiteralPartsCS extends CollectionLiteralExpCS {

    public void addPart(CollectionLiteralPartCS collectionLiteralPartCS);

    public List<CollectionLiteralPartCS> getParts();

}