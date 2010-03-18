package org.orcas.iocl.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.NodeCSAdaptor;
import org.orcas.iocl.exception.IOCLException;

public class IOCLParserUtil {

    public static IOCLExpressionCS parse(String expression)
        throws IOCLException {

        try{
            ANTLRStringStream stream = new ANTLRStringStream(expression);

            IOCLLexer lexer = new IOCLLexer(stream);

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            IOCLParser parser = new IOCLParser(tokenStream);

            parser.setTreeAdaptor(new NodeCSAdaptor());

            return parser.ioclExpressionCS().ioclExpressionCS;
        }
        catch (RecognitionException re) {
            throw new IOCLException(re);
        }
    }

}