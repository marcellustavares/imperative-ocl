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
import org.orcas.ioclgenerator.util.PropsUtil;

import java.util.Map;

@SuppressWarnings({"rawtypes", "unchecked"})
public class IOCLGenerator {

	private IOCLGenerator() {
		try {
			Class generatorClass = Class.forName(
				PropsUtil.get("iocl.handler.class"));

			Handler handler = (Handler)generatorClass.newInstance();

			_visitor = new Visitor(handler);
		}
		catch (Exception e) {
			_log.error(e);
		}
	}

	public static String generate(
		Map<String, String> generationContext, OclExpression expression) {

		return _instance._generate(generationContext, expression);
	}

	private String _generate(
		Map<String, String> generationContext, OclExpression expression) {

		_visitor.setContext(generationContext);

		return (String)expression.accept(_visitor);
	}

	private static IOCLGenerator _instance = new IOCLGenerator();

	private Visitor _visitor;

	private Logger _log = Logger.getLogger(IOCLGenerator.class);

}