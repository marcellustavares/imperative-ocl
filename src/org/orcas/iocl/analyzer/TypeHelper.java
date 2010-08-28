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

package org.orcas.iocl.analyzer;

import java.util.List;

import org.orcas.iocl.expressions.emof.Type;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;

public interface TypeHelper<C, O, P> {

	public void bindVariable(String variable, C type);

	public O getOperation(
		C owner, String name, List<C> parameterTypes);

	public List<O> getOperations(C owner);

	public P getProperty(C owner, String name);

	public List<C> getOperationParameterTypes(
		C owner, OperationCallExp operationCallExp);

	public boolean hasOperation(
		C owner, String name, List<C> parameterTypes);

	public boolean hasProperty(C owner, String name);

	public C resolveType(C context, OclExpression source);

	public C resolveType(Type type);

}