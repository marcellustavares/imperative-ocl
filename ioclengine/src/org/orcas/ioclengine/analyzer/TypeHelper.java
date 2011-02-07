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

package org.orcas.ioclengine.analyzer;

import org.orcas.iocl.expression.emof.Type;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;

import java.util.List;

public interface TypeHelper<C, O, P, PM, EL> {

	public void bindVariable(String variable, C type);

	public List<C> getAvailableEnumerations(O context);

	public List<C> getAvailableTypes(O context);

	public List<EL> getEnumerationLiterals(C enumeration);

	public String getName(Object namedElement);

	public O getOperation(
		C owner, String name, List<C> parameterTypes);

	public List<C> getOperationParameterTypes(
			Object context, OperationCallExp operationCallExp);

	public List<O> getOperations(C owner);

	public List<PM> getParameters(O operation);

	public List<P> getProperties(C owner);

	public P getProperty(C owner, String name);

	public List<String> getVariableNames();

	public boolean hasOperation(
		C owner, String name, List<C> parameterTypes);

	public boolean hasProperty(C classifier, String name);

	public C resolveType(O context, String variableName);

	public C resolveType(Object context, OclExpression source);

	public C resolveType(Type type);

}