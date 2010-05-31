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
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.Visitor;

public class AltExpImpl extends ImperativeExpImpl implements AltExp {

	public <T, V extends Visitor<T>> T accept(V v) {
		throw new UnsupportedOperationException();
	}

	public void addBodyExpression(ImperativeExp bodyExp) {
		_body.add(bodyExp);
	}

	public List<ImperativeExp> getBody() {
		return _body;
	}

	public OclExpression getCondition() {
		return _condition;
	}

	public void setCondition(OclExpression condition) {
		_condition = condition;
	}

	private List<ImperativeExp> _body = new ArrayList<ImperativeExp>();
	private OclExpression _condition;

}