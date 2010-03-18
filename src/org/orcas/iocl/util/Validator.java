package org.orcas.iocl.util;

public class Validator {

    public static boolean equals(Object obj1, Object obj2) {
        if ((obj1 == null) && (obj2 == null)) {
            return true;
        }
        else if ((obj1 == null) || (obj2 == null)) {
            return false;
        }
        else {
            return obj1.equals(obj2);
        }
    }
    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

    public static boolean isNull(String str) {
        if (str == null) {
            return true;
        }
        else if (equals(str, StringPool.BLANK)) {
            return true;
        }

        return false;
    }

}