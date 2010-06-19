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

public enum Operation {

	AND(1, "and"),

	DIV(2, "/"),

	EQUAL(3, "="),

	GT(4, ">"),

	GTE(5, ">="),

	LT(6, "<"),

	LTE(7, "<="),

	MINUS(8, "-"),

	MULT(9, "*"),

	NOT_EQUAL(10, "<>"),

	OR(11, "or"),

	PLUS(12, "+"),

	XOR(13, "xor");

	public static Operation[] OPERATIONS = {
		AND, DIV, EQUAL, GT, GTE, LT, LTE, MINUS, MULT, NOT_EQUAL, OR, PLUS,
		XOR};

	public static int toOperationCode(String operationName) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (Validator.equals(
					OPERATIONS[i].getOperationName(), operationName)) {

				return (Integer) OPERATIONS[i].getOperationCode();
			}
		}

		return -1;
	}

	public static String fromOperationCode(int operationCode) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (OPERATIONS[i].getOperationCode() == operationCode) {
				return OPERATIONS[i].getOperationName();
			}
		}

		return null;
	}

	public int getOperationCode() {
		return _code;
	}

	public String getOperationName() {
		return _name;
	}


	private Operation(int code, String name) {
		_code = code;
		_name = name;
	}

	private int _code;
	private String _name;

}