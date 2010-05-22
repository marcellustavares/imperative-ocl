package org.orcas.iocl.exp.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.exp.ArgumentsCS;
import org.orcas.iocl.exp.OclExpressionCS;

public class ArgumentsCSImpl implements ArgumentsCS {

    public void addArgument(OclExpressionCS argument) {
        _arguments.add(argument);
    }

    public List<OclExpressionCS> getArguments() {
        return _arguments;
    }

    private List<OclExpressionCS> _arguments = new ArrayList<OclExpressionCS>();

}