package org.orcas.iocl.util;

public class StringUtil {

    public static String trimTrailing(String str) {
        if (str == null) {
            return null;
        }

        char[] charArray = str.toCharArray();

        int len = charArray.length;

        int x = 0;
        int y = charArray.length;

        for (int i = len - 1; i >= 0; i--) {
            char c = charArray[i];

            if (Character.isWhitespace(c)) {
                y = i;
            }
            else {
                break;
            }
        }

        if ((x != 0) || (y != len)) {
            return str.substring(x, y);
        }
        else {
            return str;
        }
    }

    public static String unescape(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder unescapedString = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            switch (c) {
                case '\'':
                    break;

                default:
                    unescapedString.append(c);
            }
        }

        return unescapedString.toString();
    }

}