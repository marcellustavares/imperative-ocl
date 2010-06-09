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

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.TryExp;
import org.orcas.iocl.exp.Type;
import org.orcas.iocl.exp.Visitor;

public class TryExpImpl extends ImperativeExpImpl implements TryExp {

	public <T, V extends Visitor<T>> T accept(V v) {
		throw new UnsupportedOperationException();
	}

	public void addExceptExpression(OclExpression exceptExpression) {
		_exceptBody.add(exceptExpression);
	}

	public void addException(Type exception) {
		_exceptions.add(exception);
	}

	public void addTryExpression(OclExpression tryExpression) {
		_tryBody.add(tryExpression);
	}

	public List<OclExpression> getExceptBody() {
		return _exceptBody;
	}

	public List<Type> getExceptions() {
		return _exceptions;
	}

	public List<OclExpression> getTryBody() {
		return _tryBody;
	}

	private List<OclExpression> _exceptBody = new ArrayList<OclExpression>();
	private List<Type> _exceptions = new ArrayList<Type>();
	private List<OclExpression> _tryBody = new ArrayList<OclExpression>();

}