package org.orcas.iocl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.parser.antlr.IoclLexer;
import org.orcas.iocl.parser.antlr.IoclParser;
import org.orcas.iocl.parser.IoclTreeWalker;

public class Iocl {

    public static Iocl getInstance() {
        return _instance;
    }

    public OclExpression parse(String exp) {
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
            re.printStackTrace();
        }

        return null;
    }

    protected void showIoclAst(Tree tree) {
        System.out.println(tree.toStringTree());
    }

    private static Iocl _instance = new Iocl();
    private IoclTreeWalker _walker = new IoclTreeWalker();

}