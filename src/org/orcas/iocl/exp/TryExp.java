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

package org.orcas.iocl.exp;

import java.util.List;

public interface TryExp extends ImperativeExp {

	public void addException(Type exception);

	public void addExceptExpression(OclExpression exceptExpression);

	public void addTryExpression(OclExpression tryExpression);

	public List<Type> getExceptions();

	public List<OclExpression> getExceptBody();

	public List<OclExpression> getTryBody();

}