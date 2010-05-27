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

	public static final int DIV=1;

	public static final String DIV_LABEL = "/";

	public static final int MINUS=2;

	public static final String MINUS_LABEL = "-";

	public static final int MULT=3;

	public static final String MULT_LABEL = "*";

	public static final int PLUS=4;

	public static final String PLUS_LABEL = "+";

	public static Object[][] OPERATIONS = {
		{DIV, DIV_LABEL}, {MINUS, MINUS_LABEL}, {DIV, DIV_LABEL},
		{MULT, MINUS_LABEL}, {PLUS, PLUS_LABEL}};

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