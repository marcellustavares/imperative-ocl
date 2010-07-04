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

public enum Template {

	ABS("abs"),

	AND("and"),

	ANY("any"),

	APPEND("append"),

	ARITHMETIC_EXPRESSION("arithmeticExp"),

	ASSIGN("assign"),

	AS_BAG("asBag"),

	AS_ORDERED_SET("asOrderedSet"),

	AS_SEQUENCE("asSequence"),

	AS_SET("asSet"),

	AT("at"),

	CLOSURE("closure"),

	COLLECT("collect"),

	COLLECTION("collection"),

	COLLECT_NESTED("collectNested"),

	CONCAT("concat"),

	COUNT("count"),

	DIV("div"),

	EQUAL("="),

	EXCLUDES("excludes"),

	EXCLUDING("excluding"),

	EXISTS("exists"),

	FIRST("first"),

	FLATTEN("flatten"),

	FLOOR("floor"),

	FOR_ALL("forAll"),

	GT(">"),

	GTE(">="),

	INCLUDES("includes"),

	INCLUDES_ALL("includesAll"),

	INCLUDING("including"),

	INDEX_OF("indexOf"),

	INSERT_AT("insertAt"),

	INTERSECTION("intersection"),

	IS_EMPTY("isEmpty"),

	IS_UNIQUE("isUnique"),

	LAST("last"),

	LT("<"),

	LTE("<="),

	MAX("max"),

	MIN("min"),

	MOD("mod"),

	NOT("not"),

	NOT_EMPTY("not"),

	NOT_EQUAL("<>"),

	OCL_AS_TYPE("oclAsType"),

	OCL_IS_KIND_OF("oclIsKindOf"),

	OCL_IS_TYPE_OF("oclIsTypeOf"),

	ONE("one"),

	OR("or"),

	PREPEND("prepend"),

	PRODUCT("product"),

	REJECT("reject"),

	RETURN("return"),

	ROUND("round"),

	SELECT("select"),

	SIZE("size"),

	SORTED_BY("sortedBy"),

	SUBSTRING("substring"),

	SUB_ORDERED_SET("subOrderedSet"),

	SUB_SEQUENCE("subSequence"),

	SYMMETRIC_DIFFERENCE("symmetricDifference"),

	SUM("sum"),

	TO_INTEGER("toInteger"),

	TO_LOWER("toLower"),

	TO_REAL("toReal"),

	TO_UPPER("toUpper"),

	UNION("union"),

	XOR("xor");

	public static Template[] TEMPLATES = {
		ABS, AND, ANY, APPEND, ARITHMETIC_EXPRESSION, ASSIGN, AT, AS_BAG,
		AS_ORDERED_SET, AS_SEQUENCE, AS_SET, CLOSURE, COLLECT, COLLECTION,
		COLLECT_NESTED,	CONCAT, COUNT, DIV, EQUAL, EXCLUDES, EXCLUDING, EXISTS,
		FIRST, FLATTEN, FLOOR, FOR_ALL, GT, GTE,	INCLUDES, INCLUDES_ALL,
		INCLUDING, INDEX_OF, INSERT_AT, INTERSECTION, IS_EMPTY, IS_UNIQUE, LAST,
		LT, LTE, MAX, MIN, MOD, NOT, NOT_EMPTY, NOT_EQUAL,	OCL_AS_TYPE,
		OCL_IS_KIND_OF, OCL_IS_TYPE_OF, ONE, OR, PREPEND, PRODUCT, REJECT,
		RETURN, ROUND, SELECT, SIZE, SORTED_BY, SUBSTRING,	SUB_ORDERED_SET,
		SUB_SEQUENCE, SYMMETRIC_DIFFERENCE, SUM, TO_INTEGER, TO_LOWER, TO_REAL,
		TO_UPPER, UNION, XOR};

	public static Template getByName(String templateName) {
		for (int i = 0; i < TEMPLATES.length; i++) {
			if (Validator.equals(
					TEMPLATES[i].getTemplateName(), templateName)) {

				return TEMPLATES[i];
			}
		}

		return null;
	}

	public String getTemplateName() {
		return _templateName;
	}

	private Template(String templateName) {
		_templateName = templateName;
	}

	private String _templateName;

}