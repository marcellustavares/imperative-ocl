package org.orcas.iocl.parser;

import org.antlr.runtime.tree.Tree;
import org.orcas.iocl.exp.BooleanLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralExp;
import org.orcas.iocl.exp.CollectionLiteralPart;
import org.orcas.iocl.exp.CollectionLiteralParts;
import org.orcas.iocl.exp.CollectionTypeIdentifier;
import org.orcas.iocl.exp.IntegerLiteralExp;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;
import org.orcas.iocl.exp.RealLiteralExp;
import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.SimpleTypeEnum;
import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.exp.impl.BooleanLiteralExpImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralExpImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralPartImpl;
import org.orcas.iocl.exp.impl.CollectionLiteralPartsImpl;
import org.orcas.iocl.exp.impl.CollectionTypeIdentifierImpl;
import org.orcas.iocl.exp.impl.IntegerLiteralExpImpl;
import org.orcas.iocl.exp.impl.OperationCallExpImpl;
import org.orcas.iocl.exp.impl.RealLiteralExpImpl;
import org.orcas.iocl.exp.impl.SimpleNameImpl;
import org.orcas.iocl.exp.impl.StringLiteralExpImpl;
import org.orcas.iocl.parser.antlr.IoclParser;

public class IoclTreeWalker {

    public OclExpression walk(Tree tree) {
        OclExpression oclExpression = null;

        switch (tree.getType()) {
            case IoclParser.AND:
            case IoclParser.DIV:
            case IoclParser.EQUAL:
            case IoclParser.GT:
            case IoclParser.GTE:
            case IoclParser.LT:
            case IoclParser.LTE:
            case IoclParser.MINUS:
            case IoclParser.NOT:
            case IoclParser.NOT_EQUAL:
            case IoclParser.MULT:
            case IoclParser.OR:
            case IoclParser.PLUS:
            case IoclParser.XOR:
                SimpleName simpleName = createSimpleName(
                    SimpleTypeEnum.STRING, tree.getText());

                OperationCallExp opCallExp = createOperationCallExp(
                    simpleName, walk(tree.getChild(0)));

                if (tree.getChildCount() > 1) {
                    opCallExp.addArgument(walk(tree.getChild(1)));
                }

                oclExpression = opCallExp;

                break;

            case IoclParser.DOT:
            case IoclParser.ARROW:
                simpleName = createSimpleName(
                    SimpleTypeEnum.IDENTIFIER, tree.getChild(1).getText());

                opCallExp = createOperationCallExp(
                    simpleName, walk(tree.getChild(0)));

                for (int i = 2; i < tree.getChildCount(); i++) {
                    opCallExp.addArgument(walk(tree.getChild(i)));
                }

                oclExpression = opCallExp;

                break;

            case IoclParser.BOOLEAN_LITERAL:
                oclExpression = createBooleanLiteralExp(
                    tree.getText());

                break;

          case IoclParser.COLLECTION_LITERAL:
                CollectionLiteralExp collectionLiteralExp =
                    createCollectionLiteralExp(walk(tree.getChild(0)));

                if (tree.getChildCount() > 1) {
                    collectionLiteralExp.setCollectionLiteralParts(
                        walk(tree.getChild(1)));
                }

                oclExpression = collectionLiteralExp;

                break;

            case IoclParser.COLLECTION_LITERAL_PARTS:
                CollectionLiteralParts collectionLiteralParts =
                    new CollectionLiteralPartsImpl();

                for (int i = 0; i < tree.getChildCount(); i++) {
                    collectionLiteralParts.addPart(
                        createCollectionLiteralPart(walk(tree.getChild(i))));
                }

                oclExpression = collectionLiteralParts;

                break;

            case IoclParser.COLLECTION_TYPE_LITERAL:
                oclExpression = createCollectionTypeIdentifier(tree.getText());

                break;

            case IoclParser.INTEGER_LITERAL:
                oclExpression = createIntegerLiteralExp(
                    tree.getText());

                break;

            case IoclParser.NUMERIC_OPERATION:
                OperationCallExp operationCallExp =
                    createNumericOperationCallExp(tree.getText());

                for (int i = 0; i < tree.getChildCount(); i++) {
                    operationCallExp.addArgument(walk(tree.getChild(i)));
                }

                oclExpression = operationCallExp;

                break;

            case IoclParser.REAL_LITERAL:
                oclExpression = createRealLiteralExp(
                    tree.getText());

                break;

            case IoclParser.STRING_LITERAL:
                oclExpression = createStringLiteralExp(
                    tree.getText());

                break;
        }

        return oclExpression;
    }

    protected BooleanLiteralExp createBooleanLiteralExp(String booleanSymbol) {
        BooleanLiteralExp booleanLiteralExp = new BooleanLiteralExpImpl();
        booleanLiteralExp.setBooleanSymbol(Boolean.parseBoolean(booleanSymbol));

        return booleanLiteralExp;
    }

    protected CollectionLiteralExp createCollectionLiteralExp(
        OclExpression collectionTypeIdentifierCS) {

        CollectionLiteralExp collectionLiteralExp =
            new CollectionLiteralExpImpl();

        collectionLiteralExp.setCollectionKind(
            (CollectionTypeIdentifier) collectionTypeIdentifierCS);

        return collectionLiteralExp;
    }

    protected CollectionLiteralPart createCollectionLiteralPart(
        OclExpression oclExpressionCS) {

        CollectionLiteralPartImpl part = new CollectionLiteralPartImpl();

        part.setOCLExpresion(oclExpressionCS);

        return part;
    }

    protected CollectionTypeIdentifier createCollectionTypeIdentifier(
        String type) {

        CollectionTypeIdentifier identifier =
            new CollectionTypeIdentifierImpl();

        identifier.setCollectionType(type);

        return identifier;
    }

    protected IntegerLiteralExp createIntegerLiteralExp(String integerSymbol) {
        IntegerLiteralExp integerLiteralExp = new IntegerLiteralExpImpl();
        integerLiteralExp.setIntegerSymbol(Integer.parseInt(integerSymbol));

        return integerLiteralExp;
    }

    protected OperationCallExp createNumericOperationCallExp(
        String numericOperaration) {

        OperationCallExp operationCallExpCS = new OperationCallExpImpl();

        int index = numericOperaration.indexOf('.');
        String integerSymbol = numericOperaration.substring(0, index);

        IntegerLiteralExp integerLiteralExpCS = createIntegerLiteralExp(
            integerSymbol);

        operationCallExpCS.setSource(integerLiteralExpCS);

        String simpleName = numericOperaration.substring(index + 1);

        SimpleName simpleNameCS = createSimpleName(
            SimpleTypeEnum.IDENTIFIER, simpleName);

        operationCallExpCS.setSimpleName(simpleNameCS);

        return operationCallExpCS;
    }

    protected OperationCallExp createOperationCallExp(
        SimpleName simpleName, OclExpression source) {

        OperationCallExp operationCallExp = new OperationCallExpImpl();

        operationCallExp.setSimpleName(simpleName);
        operationCallExp.setSource(source);

        return operationCallExp;
    }

    protected RealLiteralExp createRealLiteralExp(String realSymbol) {
        RealLiteralExp realLiteralExp = new RealLiteralExpImpl();
        realLiteralExp.setRealSymbol(Double.parseDouble(realSymbol));

        return realLiteralExp;
    }

    protected StringLiteralExp createStringLiteralExp(String stringSymbol) {
        StringLiteralExp stringLiteralExp = new StringLiteralExpImpl();
        stringLiteralExp.setStringSymbol(stringSymbol);

        return stringLiteralExp;
    }

    protected SimpleName createSimpleName(SimpleTypeEnum type, String value) {
        SimpleName simpleName = new SimpleNameImpl();

        simpleName.setSimpleNameType(type);
        simpleName.setValue(value);

        return simpleName;
    }

}