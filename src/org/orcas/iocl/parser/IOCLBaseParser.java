package org.orcas.iocl.parser;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.orcas.iocl.cst.ArgumentsCS;
import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.cst.SimpleTypeEnum;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.cst.impl.ArgumentsCSImpl;
import org.orcas.iocl.cst.impl.BooleanLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralPartCSImpl;
import org.orcas.iocl.cst.impl.CollectionLiteralPartsCSImpl;
import org.orcas.iocl.cst.impl.CollectionTypeIdentifierCSImpl;
import org.orcas.iocl.cst.impl.IntegerLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.OperationCallExpCSImpl;
import org.orcas.iocl.cst.impl.RealLiteralExpCSImpl;
import org.orcas.iocl.cst.impl.SimpleNameCSImpl;
import org.orcas.iocl.cst.impl.StringLiteralExpCSImpl;

public abstract class IOCLBaseParser extends Parser {

    public IOCLBaseParser(TokenStream input) {
        super(input);
    }

    public IOCLBaseParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public ArgumentsCS createArgumentsCS(OCLExpressionCS argument) {
        arguments.addArgument(argument);

        return arguments;
    }

    public BooleanLiteralExpCS createBooleanLiteralExpCS(
        Token token, String booleanSymbol) {

        BooleanLiteralExpCS exp = new BooleanLiteralExpCSImpl(token);
        exp.setBooleanSymbol(Boolean.parseBoolean(booleanSymbol));

        return exp;
    }

    public CollectionLiteralExpCS createCollectionLiteralExpCS(
        OCLExpressionCS collectionTypeIdentifierCS,
        OCLExpressionCS collectionLiteralPartsCS) {

        CollectionLiteralExpCS exp = new CollectionLiteralExpCSImpl(
            collectionTypeIdentifierCS.getToken());

        exp.setCollectionKind(
            (CollectionTypeIdentifierCS) collectionTypeIdentifierCS);
        exp.setCollectionParts(
            (CollectionLiteralPartsCS) collectionLiteralPartsCS);

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
            OCLExpressionCS collectionLiteralPartCS) {

        if (parts == null) {
            parts = new CollectionLiteralPartsCSImpl(
                collectionLiteralPartCS.getToken());
        }

        parts.addPart((CollectionLiteralPartCS) collectionLiteralPartCS);

        return parts;
    }

    public CollectionTypeIdentifierCS createCollectionTypeIdentifierCS(
        Token token, String type) {

        CollectionTypeIdentifierCS identifierCS =
            new CollectionTypeIdentifierCSImpl(token);

        identifierCS.setCollectionType(type);

        return identifierCS;
    }

    public SimpleNameCS createSimpleNameCS(
        Token token, SimpleTypeEnum type, String value) {

        SimpleNameCS simpleNameCS = new SimpleNameCSImpl(token);

        simpleNameCS.setSimpleNameType(type);
        simpleNameCS.setValue(value);

        return simpleNameCS;
    }

    public OperationCallExpCS createOperationCallExpCS(
        OCLExpressionCS source, OCLExpressionCS simpleNameCS) {

        OperationCallExpCS operationCallExpCS = new OperationCallExpCSImpl(
            simpleNameCS.getToken());

        operationCallExpCS.setSource(source);
        operationCallExpCS.setSimpleNameCS((SimpleNameCS) simpleNameCS);

        return operationCallExpCS;
    }

    public OperationCallExpCS createNumericOperationCallExpCS(
        Token token, String numericOperaration, ArgumentsCS arguments) {

        OperationCallExpCS operationCallExpCS = new OperationCallExpCSImpl(
            token);

        int index = numericOperaration.indexOf('.');
        String integerSymbol = numericOperaration.substring(0, index);

        IntegerLiteralExpCS integerLiteralExpCS = createIntegerLiteralExpCS(
            token, integerSymbol);

        operationCallExpCS.setSource(integerLiteralExpCS);

        String simpleName = numericOperaration.substring(index + 1);

        SimpleNameCS simpleNameCS = createSimpleNameCS(
            token, SimpleTypeEnum.IDENTIFIER, simpleName);

        operationCallExpCS.setSimpleNameCS(simpleNameCS);

        if (arguments != null) {
            operationCallExpCS.setArguments(arguments.getArguments());
        }

        return operationCallExpCS;
    }

    public OperationCallExpCS createOperationCallExpCS(
        OCLExpressionCS source, SimpleNameCS simpleNameCS,
        OCLExpressionCS arg) {

        OperationCallExpCS opCallExp = new OperationCallExpCSImpl(
            simpleNameCS.getToken());

        opCallExp.setSource(source);
        opCallExp.setSimpleNameCS(simpleNameCS);
        opCallExp.addArgument(arg);

        return opCallExp;
    }

    public OperationCallExpCS createOperationCallExpCS(
        OCLExpressionCS simpleNameCS, ArgumentsCS argumentsCS) {

        OperationCallExpCS opCallExp = new OperationCallExpCSImpl(
            simpleNameCS.getToken());

        opCallExp.setSimpleNameCS((SimpleNameCS) simpleNameCS);
        opCallExp.setArguments(arguments.getArguments());

        return opCallExp;
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

    public OperationCallExpCS setOperationCallExpCSSource(
        OCLExpressionCS source, OCLExpressionCS operationCallExpCS) {

        OperationCallExpCS opCall = (OperationCallExpCS) operationCallExpCS;

        opCall.setSource(source);

        return opCall;
    }

    protected ArgumentsCS arguments = new ArgumentsCSImpl();
    protected CollectionLiteralPartsCSImpl parts;

}