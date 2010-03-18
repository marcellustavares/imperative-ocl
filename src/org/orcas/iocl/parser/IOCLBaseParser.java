package org.orcas.iocl.parser;

import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.cst.impl.StringLiteralExpCSImpl;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public abstract class IOCLBaseParser extends Parser {

    public IOCLBaseParser(TokenStream input) {
        super(input);
    }

     public IOCLBaseParser(TokenStream input, RecognizerSharedState state) {
         super(input, state);
     }

    public StringLiteralExpCS createStringLiteralExpCS(
        Token token, String stringSymbol) {

        StringLiteralExpCS exp = new StringLiteralExpCSImpl(token);
        exp.setStringSymbol(stringSymbol);

        return exp;
    }

}