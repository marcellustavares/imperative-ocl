package org.orcas.compiler;

import org.orcas.iocl.exp.AbstractVisitor;
import org.orcas.iocl.exp.StringLiteralExp;
import org.orcas.iocl.util.StringPool;

public class JavaVisitor extends AbstractVisitor<String> {

    public String visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
        StringBuilder stringLiteralBuilder = new StringBuilder();
        stringLiteralBuilder.append(StringPool.QUOTES);
        stringLiteralBuilder.append(stringLiteralExp.getStringSymbol());
        stringLiteralBuilder.append(StringPool.QUOTES);

        return stringLiteralBuilder.toString();
    }

}