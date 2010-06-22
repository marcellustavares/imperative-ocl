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

import java.io.StringWriter;
import java.util.Map;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class TemplateUtil {

	public static String process(
		org.orcas.iocl.util.Template template, Map<String, Object> map) {

		try {
			Template tmpl = _instance._configuration.getTemplate(
				"templates/" + template.getTemplateName() + ".ftl");

			StringWriter writer = new StringWriter();

			tmpl.process(map, writer);

			writer.flush();

			return writer.toString();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private TemplateUtil() {
		_configuration = new Configuration();

		_configuration.setObjectWrapper(new DefaultObjectWrapper());
		_configuration.setTemplateLoader(
			new ClassTemplateLoader(TemplateUtil.class, "/"));
	}

	private static TemplateUtil _instance = new TemplateUtil();
	private Configuration _configuration;

}