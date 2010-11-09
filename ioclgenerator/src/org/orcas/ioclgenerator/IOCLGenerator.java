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

package org.orcas.ioclgenerator;

import org.apache.log4j.Logger;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.util.Visitor;
import org.orcas.ioclgenerator.util.PropsUtil;

@SuppressWarnings({"rawtypes", "unchecked"})
public class IOCLGenerator {

	private IOCLGenerator() {
		try {
			Class generatorClass = Class.forName(
				PropsUtil.get("iocl.visitor.class"));

			_generator = (Visitor)generatorClass.newInstance();
		}
		catch (Exception e) {
			_log.error(e);
		}
	}

	public static String generate(OclExpression expression) {
		return _instance._generate(expression);
	}

	private String _generate(OclExpression expression) {
		return (String)expression.accept(_generator);
	}

	private static IOCLGenerator _instance = new IOCLGenerator();

	private Visitor _generator;

	private Logger _log = Logger.getLogger(IOCLGenerator.class);

}