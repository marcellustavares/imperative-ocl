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

package org.orcas.iocl;

import org.orcas.iocl.exception.ParserException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;

public class ImperativeOclServiceUtil {

	public static String compileToJava(String expression)
		throws ParserException {

		return getService().compileToJava(expression);
	}

	public static OclExpression parse(String expression)
		throws ParserException {

		return getService().parse(expression);
	}

	public static ImperativeOclService getService() {
		if (_service == null) {
			_service = new ImperativeOclServiceImpl();
		}

		return _service;
	}

	private static ImperativeOclService _service;

}