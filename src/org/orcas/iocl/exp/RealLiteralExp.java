package org.orcas.iocl.exp;

public interface RealLiteralExp extends NumericLiteralExp {

    public Double getRealSymbol();

    public void setRealSymbol(Double realSymbol);

}