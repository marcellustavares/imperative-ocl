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

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.CollectionLiteralPart;
import org.orcas.iocl.exp.CollectionLiteralParts;

public class CollectionLiteralPartsImpl extends OclExpressionImpl
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