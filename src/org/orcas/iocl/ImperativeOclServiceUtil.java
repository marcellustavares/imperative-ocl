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

import java.util.List;

import org.orcas.iocl.analyzer.Analyzer;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.util.Visitor;
import org.orcas.iocl.helper.Choice;
import org.orcas.iocl.util.PropsKeys;
import org.orcas.iocl.util.PropsUtil;

public class ImperativeOclServiceUtil {

	public static String compile(Object context, String expression)
		throws ImperativeOclException {

		return getService().compile(context, expression);
	}

	public static OclExpression parse(Object context, String expression)
		throws ImperativeOclException {

		return getService().parse(context, expression);
	}

	public static List<Choice> getSyntaxHelp(
			Object context, String incompleteExpression)
		throws ImperativeOclException {

		return getService().getSyntaxHelp(context, incompleteExpression);
	}

	public static void setAnalyzer(Analyzer analyzer) {
		getService().setAnalyzer(analyzer);
	}

	public static void setGenerator(Visitor<String> visitor) {
		getService().setGenerator(visitor);
	}

	@SuppressWarnings({"unchecked",  "rawtypes"})
	public static ImperativeOclService getService() {
		try {
			if (_service == null) {
				_service = new ImperativeOclServiceImpl();

				Class analyzer = Class.forName(
					PropsUtil.get(PropsKeys.IOCL_ANALYZER_CLASS));

				_service.setAnalyzer((Analyzer)analyzer.newInstance());

				Class generator = Class.forName(
					PropsUtil.get(PropsKeys.IOCL_GENERATOR_CLASS));

				_service.setGenerator((Visitor<String>)generator.newInstance());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return _service;
	}

	private static ImperativeOclService _service;

}