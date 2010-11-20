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

package org.orcas.ioclengine.parser;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.exception.IOCLException;
import org.orcas.ioclengine.exception.SyntacticException;
import org.orcas.ioclengine.parser.antlr.IoclParser;

public class IOCLParser {

	public IOCLParser(TokenStream tokenStream) {
		_parser = new IoclParser(tokenStream);
	}

	public OclExpression getOclExpression() throws IOCLException {
		try {
			IoclParser.oclExpression_return r = _parser.oclExpression();

			Tree tree = (Tree) r.getTree();

			ParserWalker walker = new ParserWalker();

			return walker.walk(tree);
		}
		catch (RecognitionException e) {
			throw new SyntacticException(e);
		}
	}

	private IoclParser _parser;

}