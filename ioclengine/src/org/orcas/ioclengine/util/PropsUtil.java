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

package org.orcas.ioclengine.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {

	public static String get(String key) {
		return _instance._properties.getProperty(key);
	}

	private PropsUtil() {
		try {
			InputStream is = getClass().getResourceAsStream(
				"/ioclengine.properties");

			_properties = new Properties();

			_properties.load(is);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static PropsUtil _instance = new PropsUtil();

	private Properties _properties;

}