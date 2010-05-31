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

import org.orcas.iocl.exp.AltExp;
import org.orcas.iocl.exp.ImperativeExp;
import org.orcas.iocl.exp.SwitchExp;
import org.orcas.iocl.exp.Visitor;

public class SwitchExpImpl extends ImperativeExpImpl implements SwitchExp {

	public <T, V extends Visitor<T>> T accept(V v) {
		throw new UnsupportedOperationException();
	}

	public void addAlternativePart(AltExp altPart) {
		_alternativeParts.add(altPart);

	}

	public void addElsePart(ImperativeExp elsePart) {
		_elsePart.add(elsePart);
	}

	public List<AltExp> getAlternativeParts() {
		return _alternativeParts;
	}

	public List<ImperativeExp> getElsePart() {
		return _elsePart;
	}

	private List<AltExp> _alternativeParts = new ArrayList<AltExp>();
	private List<ImperativeExp> _elsePart = new ArrayList<ImperativeExp>();

}