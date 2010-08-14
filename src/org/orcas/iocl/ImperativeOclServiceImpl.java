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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.orcas.iocl.analyzer.Analyzer;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.exception.ParserException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.util.Visitor;
import org.orcas.iocl.helper.Choice;
import org.orcas.iocl.helper.SyntaxHelperVisitor;
import org.orcas.iocl.parser.ParserWalker;
import org.orcas.iocl.parser.antlr.IoclLexer;
import org.orcas.iocl.parser.antlr.IoclParser;

public class ImperativeOclServiceImpl implements ImperativeOclService {

	public String compile(Object context, String exp)
		throws ImperativeOclException {

		OclExpression oclExpression = parse(context, exp);

		return oclExpression.accept(_visitor);
	}

	public OclExpression parse(Object context, String exp)
		throws ImperativeOclException {

		try {
			ANTLRStringStream input = new ANTLRStringStream(exp);

			IoclLexer lexer = new IoclLexer(input);
			IoclParser parser = new IoclParser(new CommonTokenStream(lexer));

			IoclParser.oclExpression_return r = parser.oclExpression();
			Tree tree = (Tree) r.getTree();

			showIoclAst(tree);

			ParserWalker walker = new ParserWalker();

			OclExpression oclExpresion = walker.walk(tree);

			_analyzer.check(context, oclExpresion);

			return oclExpresion;
		}
		catch (RecognitionException re) {
			ParserException pe = new ParserException(re);

			throw new ImperativeOclException(pe);
		}
	}

	public List<Choice> getSyntaxHelp(
			Object context, String incompleteExpression)
		throws ImperativeOclException {

		String text = incompleteExpression.trim();

		OclExpression oclExpression = parse(
			context, text.substring(0, text.length() - 1));

		SyntaxHelperVisitor syntaxHelperVisitor = new SyntaxHelperVisitor();

		syntaxHelperVisitor.setAnalyzer(_analyzer);

		return oclExpression.accept(syntaxHelperVisitor);
	}

	public void setAnalyzer(Analyzer analyzer){
		_analyzer = analyzer;
	}

	public void setGenerator(Visitor<String> visitor){
		_visitor = visitor;
	}

	protected void showIoclAst(Tree tree) {
		System.out.println(tree.toStringTree());
	}

	private Analyzer _analyzer;
	private Visitor<String> _visitor;

}