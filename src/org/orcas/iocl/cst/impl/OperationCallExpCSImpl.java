package org.orcas.iocl.cst.impl;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;

public class OperationCallExpCSImpl extends ModelPropertyCallExpCSImpl
    implements OperationCallExpCS {

    public OperationCallExpCSImpl(Token token) {
        super(token);
    }

    public void addArgument(OCLExpressionCS argument) {
        _arguments.add(argument);
    }

    public List<OCLExpressionCS> getArguments() {
        return _arguments;
    }

    private List<OCLExpressionCS> _arguments = new ArrayList<OCLExpressionCS>();

}