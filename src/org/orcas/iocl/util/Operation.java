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

	ABS(1, "abs"),

	AND(2, "and"),

	ANY(3, "any"),

	APPEND(4, "append"),

	AS_BAG(6, "asBag"),

	AS_ORDERED_SET(7, "asOrderedSet"),

	AS_SEQUENCE(8, "asSequence"),

	AS_SET(9, "asSet"),

	AT(5, "at"),

	CLOSURE(10, "closure"),

	COLLECT(11, "collect"),

	COLLECT_NESTED(12, "collectNested"),

	CONCAT(13, "concat"),

	COUNT(14, "count"),

	DIV(15, "div"),

	DIVIDE(16, "/"),

	EQUAL(17, "="),

	EXCLUDES(18, "excludes"),

	EXCLUDING(19, "excluding"),

	EXISTS(20, "exists"),

	FIRST(21, "first"),

	FLATTEN(22, "flatten"),

	FLOOR(23, "floor"),

	FOR_ALL(24, "forAll"),

	GT(25, ">"),

	GTE(26, ">="),

	INCLUDES(27, "includes"),

	INCLUDES_ALL(28, "includesAll"),

	INCLUDING(29, "including"),

	INDEX_OF(30, "indexOf"),

	INSERT_AT(31, "insertAt"),

	INTERSECTION(32, "intersection"),

	IS_EMPTY(33, "isEmpty"),

	IS_UNIQUE(34, "isUnique"),

	LAST(35, "last"),

	LT(36, "<"),

	LTE(37, "<="),

	MAX(38, "max"),

	MIN(39, "min"),

	MINUS(40, "-"),

	MOD(41, "mod"),

	MULT(42, "*"),

	NOT(43, "not"),

	NOT_EMPTY(44, "not"),

	NOT_EQUAL(45, "<>"),

	OCL_AS_TYPE(46, "oclAsType"),

	OCL_IS_KIND_OF(47, "oclIsKindOf"),

	OCL_IS_TYPE_OF(48, "oclIsTypeOf"),

	ONE(49, "one"),

	OR(50, "or"),

	PLUS(51, "+"),

	PREPEND(52, "prepend"),

	PRODUCT(53, "product"),

	REJECT(54, "reject"),

	ROUND(55, "round"),

	SELECT(56, "select"),

	SIZE(57, "size"),

	SORTED_BY(58, "sortedBy"),

	SUBSTRING(59, "substring"),

	SUB_ORDERED_SET(60, "subOrderedSet"),

	SUB_SEQUENCE(61, "subSequence"),

	SYMMETRIC_DIFFERENCE(62, "symmetricDifference"),

	SUM(63, "sum"),

	TO_INTEGER(64, "toInteger"),

	TO_LOWER(65, "toLower"),

	TO_REAL(66, "toReal"),

	TO_UPPER(67, "toUpper"),

	UNION(68, "union"),

	XOR(69, "xor");

	public static Operation[] OPERATIONS = {
		ABS, AND, ANY, APPEND, AT, AS_BAG, AS_ORDERED_SET, AS_SEQUENCE, AS_SET,
		CLOSURE, COLLECT, COLLECT_NESTED, CONCAT, COUNT, DIV, DIVIDE, EQUAL,
		EXCLUDES, EXCLUDING, EXISTS, FIRST, FLATTEN, FLOOR, FOR_ALL, GT, GTE,
		INCLUDES, INCLUDES_ALL, INCLUDING, INDEX_OF, INSERT_AT, INTERSECTION,
		IS_EMPTY, IS_UNIQUE, LAST, LT, LTE, MAX, MIN, MINUS, MOD, MULT, NOT,
		NOT_EMPTY, NOT_EQUAL, OCL_AS_TYPE, OCL_IS_KIND_OF, OCL_IS_TYPE_OF, ONE,
		OR, PLUS, PREPEND, PRODUCT, REJECT, ROUND, SELECT, SIZE, SORTED_BY,
		SUBSTRING, SUB_ORDERED_SET, SUB_SEQUENCE, SYMMETRIC_DIFFERENCE, SUM,
		TO_INTEGER, TO_LOWER, TO_REAL, TO_UPPER, UNION, XOR};

	public static String fromOperationCode(int operationCode) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (OPERATIONS[i].getOperationCode() == operationCode) {
				return OPERATIONS[i].getOperationName();
			}
		}

		return null;
	}

	public static Operation getByOperationCode(int operationCode) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (OPERATIONS[i].getOperationCode() == operationCode) {
				return OPERATIONS[i];
			}
		}

		return null;
	}

	public static int toOperationCode(String operationName) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (Validator.equals(
					OPERATIONS[i].getOperationName(), operationName)) {

				return (Integer) OPERATIONS[i].getOperationCode();
			}
		}

		return -1;
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