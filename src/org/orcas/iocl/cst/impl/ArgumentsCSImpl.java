package org.orcas.iocl.cst.impl;

import java.util.ArrayList;
import java.util.List;

import org.orcas.iocl.cst.ArgumentsCS;
import org.orcas.iocl.cst.OCLExpressionCS;

public class ArgumentsCSImpl implements ArgumentsCS {

    public void addArgument(OCLExpressionCS argument) {
        _arguments.add(argument);
    }

    public List<OCLExpressionCS> getArguments() {
        return _arguments;
    }

    private List<OCLExpressionCS> _arguments = new ArrayList<OCLExpressionCS>();

}