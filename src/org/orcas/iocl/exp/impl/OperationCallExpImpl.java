package org.orcas.iocl.exp.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.OperationCallExp;

public class OperationCallExpImpl extends ModelPropertyCallExpImpl
    implements OperationCallExp {

    public void addArgument(OclExpression argument) {
        _arguments.add(argument);
    }

    public List<OclExpression> getArguments() {
        return _arguments;
    }

    public void setArguments(List<OclExpression> arguments) {
        _arguments = arguments;
    }

    private List<OclExpression> _arguments = new ArrayList<OclExpression>();

}