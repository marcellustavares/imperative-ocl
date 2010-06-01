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

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.Type;
import org.orcas.iocl.exp.Variable;
import org.orcas.iocl.exp.Visitor;

public class VariableImpl extends OclExpressionImpl implements Variable {

	public <T, V extends Visitor<T>> T accept(V v) {
		throw new UnsupportedOperationException();
	}

	public OclExpression getInitExpression() {
		return _initExpression;
	}

	public String getName() {
		return _name;
	}

	public Type getType() {
		return _type;
	}

	public void setInitExpression(OclExpression initExpression) {
		_initExpression = initExpression;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setType(Type type) {
		_type = type;
	}

	private OclExpression _initExpression;
	private String _name;
	private Type _type;

}