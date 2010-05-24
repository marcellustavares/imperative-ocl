/**
 * Copyright (C) 2010  Marcellus C. Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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