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
import org.orcas.iocl.exp.OperationCallExp;

public class OperationCallExpImpl extends ModelPropertyCallExpImpl
	implements OperationCallExp {

	public void addArgument(OclExpression argument) {
		_arguments.add(argument);
	}

	public List<OclExpression> getArguments() {
		return _arguments;
	}

	public void setArguments(List<OclExpression> arguments) {
		_arguments = arguments;
	}

	private List<OclExpression> _arguments = new ArrayList<OclExpression>();

}