package org.orcas.iocl.exp;

import java.util.List;

public interface CollectionLiteralParts extends OclExpression {

    public void addPart(CollectionLiteralPart collectionLiteralPart);

    public List<CollectionLiteralPart> getParts();

}