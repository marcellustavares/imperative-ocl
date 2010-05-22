package org.orcas.iocl.exp.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.Arguments;
import org.orcas.iocl.exp.OclExpression;

public class ArgumentsImpl implements Arguments {

    public void addArgument(OclExpression argument) {
        _arguments.add(argument);
    }

    public List<OclExpression> getArguments() {
        return _arguments;
    }

    private List<OclExpression> _arguments = new ArrayList<OclExpression>();

}