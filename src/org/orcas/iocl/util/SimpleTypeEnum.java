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

import org.orcas.iocl.util.Validator;

public enum SimpleTypeEnum {

	IDENTIFIER("identifier"),
	SELF("self"),
	INTEGER("Integer"),
	STRING("String"),
	BOOLEAN("Boolean"),
	REAL("Real"),
	OCL_ANY("OclAny");

	private SimpleTypeEnum(String value) {
		_value = value;
	}

	public static SimpleTypeEnum get(String value) {
		for (int i = 0; i < _simpleTypes.length; i++) {
			SimpleTypeEnum simpleType = _simpleTypes[i];

			if (Validator.equals(value, simpleType.getType())) {
				return simpleType;
			}
		}
		return null;
	}

	public String getType() {
		return _value;
	}

	private static SimpleTypeEnum[] _simpleTypes = new SimpleTypeEnum[]{
		IDENTIFIER, SELF, INTEGER, STRING, REAL, BOOLEAN, OCL_ANY};
	private String _value;

}