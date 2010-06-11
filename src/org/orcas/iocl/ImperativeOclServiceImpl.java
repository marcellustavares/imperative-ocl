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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.orcas.iocl.compiler.JavaVisitor;
import org.orcas.iocl.exception.ParserException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.parser.antlr.IoclLexer;
import org.orcas.iocl.parser.antlr.IoclParser;
import org.orcas.iocl.parser.ImperativeOclTreeWalker;

public class ImperativeOclServiceImpl implements ImperativeOclService {

	public OclExpression parse(String exp) throws ParserException {
		try {
			ANTLRStringStream input = new ANTLRStringStream(exp);

			IoclLexer lexer = new IoclLexer(input);
			IoclParser parser = new IoclParser(new CommonTokenStream(lexer));

			IoclParser.oclExpressionCS_return r = parser.oclExpressionCS();
			Tree tree = (Tree) r.getTree();

			showIoclAst(tree);

			return _walker.walk(tree);
		}
		catch (RecognitionException re) {
			throw new ParserException(re);
		}
	}

	public String compileToJava(String exp) throws ParserException {
		OclExpression oclExpression = parse(exp);

		return oclExpression.accept(_javaVisitor);
	}

	protected void showIoclAst(Tree tree) {
		System.out.println(tree.toStringTree());
	}

	private JavaVisitor _javaVisitor = new JavaVisitor();
	private ImperativeOclTreeWalker _walker = new ImperativeOclTreeWalker();

}