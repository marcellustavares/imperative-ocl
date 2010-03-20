package org.orcas.iocl.cst;

public interface CollectionTypeIdentifierCS extends CollectionTypeCS {

    public static final int BAG = 0;
    public static final int COLLECTION = 1;
    public static final int ORDERED_SET = 2;
    public static final int SEQUENCE = 3;
    public static final int SET = 4;

    public int getCollectionType();

    public void setCollectionType(int type);

    public void setCollectionType(String type);

}