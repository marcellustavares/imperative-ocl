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

package org.orcas.ioclengine;

import org.apache.log4j.Logger;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.analyzer.IOCLAnalyzer;
import org.orcas.ioclengine.exception.IOCLException;
import org.orcas.ioclengine.helper.Choice;
import org.orcas.ioclengine.helper.SyntaxHelper;
import org.orcas.ioclengine.parser.IOCLLexer;
import org.orcas.ioclengine.parser.IOCLParser;
import org.orcas.ioclengine.util.PropsUtil;

import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class IOCLEngine {

	private IOCLEngine() {
		try {
			Class analyzerClass = Class.forName(
				PropsUtil.get("iocl.analyzer.class"));

			_analyzer = (IOCLAnalyzer)analyzerClass.newInstance();
			_syntaxHelper = new SyntaxHelper(_analyzer);
		}
		catch (Exception e) {
			_log.error(e);
		}
	}

	public static List<Choice> getSyntaxHelp(Object context, String expression)
		throws IOCLException {

		return _instance._getSyntaxHelp(context, expression);
	}

	public static OclExpression parse(Object context, String expression)
		throws IOCLException {

		return _instance._parse(context, expression);
	}

	private List<Choice> _getSyntaxHelp(Object context, String expression)
		throws IOCLException {

		return _syntaxHelper.getSyntaxHelp(context, expression);
	}


	private OclExpression _parse(Object context, String expression)
		throws IOCLException {

		IOCLLexer lexer = new IOCLLexer(expression);

		IOCLParser parser = new IOCLParser(lexer.getTokenStream());

		OclExpression oclExpression = parser.getOclExpression();

		if (Boolean.valueOf(PropsUtil.get("iocl.analyzer.enabled"))) {
			_analyzer.check(context, oclExpression);
		}

		return oclExpression;
	}

	private static IOCLEngine _instance = new IOCLEngine();

	private IOCLAnalyzer _analyzer;
	private SyntaxHelper _syntaxHelper;

	private Logger _log = Logger.getLogger(IOCLEngine.class);

}