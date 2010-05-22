package org.orcas.iocl.cst.impl;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.orcas.iocl.cst.OclExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;

public class OperationCallExpCSImpl extends ModelPropertyCallExpCSImpl
    implements OperationCallExpCS {

    public OperationCallExpCSImpl(Token token) {
        super(token);
    }

    public void addArgument(OclExpressionCS argument) {
        _arguments.add(argument);
    }

    public List<OclExpressionCS> getArguments() {
        return _arguments;
    }

    public void setArguments(List<OclExpressionCS> arguments) {
        _arguments = arguments;
    }

    private List<OclExpressionCS> _arguments = new ArrayList<OclExpressionCS>();

}