/**
 * Copyright (C) 2010  Marcellus C. Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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