package org.orcas.iocl.parser;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.cst.impl.BooleanLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralPartCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralPartsCSImpl;
import org.orcas.iocl.cst.impl.CollectionTypeIdentifierCSImpl;
import org.orcas.iocl.cst.impl.IntegerLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.RealLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.StringLiteralExpCSImpl;

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

    public CollectionLiteralExpCS createCollectionLiteralExpCS(
        CollectionTypeIdentifierCS collectionTypeIdentifierCS,
        CollectionLiteralPartsCS collectionLiteralPartsCS) {

        CollectionLiteralExpCS exp = new CollectionLiteralExpCSImpl(
            collectionTypeIdentifierCS.getToken());

        exp.setCollectionKind(collectionTypeIdentifierCS);
        exp.setCollectionParts(collectionLiteralPartsCS);

        return exp;
    }

    public CollectionLiteralPartCS createCollectionLiteralPartCS(
        OCLExpressionCS oclExpressionCS) {

        CollectionLiteralPartCSImpl part = new CollectionLiteralPartCSImpl(
            oclExpressionCS.getToken());

        part.setOCLExpresionCS(oclExpressionCS);

        return part;
    }

    public CollectionLiteralPartsCS createCollectionLiteralPartsCS(
            CollectionLiteralPartCS collectionLiteralPartCS) {

        if (parts == null) {
            parts = new CollectionLiteralPartsCSImpl(
                collectionLiteralPartCS.getToken());
        }

        parts.addPart(collectionLiteralPartCS);

        return parts;
    }

    public CollectionTypeIdentifierCS createCollectionTypeIdentifierCS(
        Token token, String type) {

        CollectionTypeIdentifierCS identifierCS =
            new CollectionTypeIdentifierCSImpl(token);

        identifierCS.setCollectionType(type);

        return identifierCS;
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

    protected CollectionLiteralPartsCSImpl parts;

}