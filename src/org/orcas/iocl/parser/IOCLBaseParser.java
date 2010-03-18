package org.orcas.iocl.parser;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.cst.impl.BooleanLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.IntegerLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.RealLiteralExpCSImpl;
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

    public BooleanLiteralExpCS createBooleanLiteralExpCS(
        Token token, String booleanSymbol) {

        BooleanLiteralExpCS exp = new BooleanLiteralExpCSImpl(token);
        exp.setBooleanSymbol(Boolean.parseBoolean(booleanSymbol));

        return exp;
    }

    public RealLiteralExpCS createRealLiteralExpCS(
        Token token, String realSymbol) {

        RealLiteralExpCS exp = new RealLiteralExpCSImpl(token);
        exp.setRealSymbol(Double.parseDouble(realSymbol));

        return exp;
    }

    public StringLiteralExpCS createStringLiteralExpCS(
        Token token, String stringSymbol) {

        StringLiteralExpCS exp = new StringLiteralExpCSImpl(token);
        exp.setStringSymbol(stringSymbol);

        return exp;
    }

    public IntegerLiteralExpCS createIntegerLiteralExpCS(
        Token token, String integerSymbol) {

        IntegerLiteralExpCS exp = new IntegerLiteralExpCSImpl(token);
        exp.setIntegerSymbol(Integer.parseInt(integerSymbol));

        return exp;
    }

}