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

public class OperationCode {

	public static final int AND = 1;

	public static final String AND_LABEL = "and";

	public static final int DIV = 2;

	public static final String DIV_LABEL = "/";

	public static final int EQUAL = 3;

	public static final String EQUAL_LABEL = "=";

	public static final int GT = 4;

	public static final String GT_LABEL = ">";

	public static final int GTE = 5;

	public static final String GTE_LABEL = ">=";

	public static final int LT = 6;

	public static final String LT_LABEL = "<";

	public static final int LTE = 7;

	public static final String LTE_LABEL = "<=";

	public static final int MINUS = 8;

	public static final String MINUS_LABEL = "-";

	public static final int MULT = 9;

	public static final String MULT_LABEL = "*";

	public static final int NOT_EQUAL = 10;

	public static final String NOT_EQUAL_LABEL = "<>";

	public static final int OR = 11;

	public static final String OR_LABEL = "or";

	public static final int PLUS = 12;

	public static final String PLUS_LABEL = "+";

	public static final int XOR = 13;

	public static final String XOR_LABEL = "xor";

	public static Object[][] OPERATIONS = {
		{AND, AND_LABEL}, {DIV, DIV_LABEL}, {EQUAL, EQUAL_LABEL},
		{GT, GT_LABEL}, {GTE, GTE_LABEL}, {LT, LT_LABEL}, {LTE, LTE_LABEL},
		{MINUS, MINUS_LABEL}, {MULT, MULT_LABEL}, {NOT_EQUAL, NOT_EQUAL_LABEL},
		{OR, OR_LABEL}, {PLUS, PLUS_LABEL}, {XOR, XOR_LABEL} };

	public static int fromLabel(String label) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (Validator.equals(OPERATIONS[i][1], label)) {
				return (Integer) OPERATIONS[i][0];
			}
		}

		return -1;
	}

	public static String toLabel(int operationCode) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (Validator.equals(OPERATIONS[i][0], operationCode)) {
				return (String) OPERATIONS[i][1];
			}
		}

		return null;
	}

}