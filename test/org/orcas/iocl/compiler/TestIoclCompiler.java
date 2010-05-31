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

package org.orcas.iocl.compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.DirectoryScanner;
import org.orcas.iocl.ImperativeOcl;
import org.orcas.util.FileUtil;

public class TestIoclCompiler {

	public static void main(String[] args) throws Exception {
		String basedir = "./input/";

		String[] files = _getTestFiles();

		for (int i = 0; i < files.length; i++) {
			File file = new File(basedir + files[i]);

			String className = file.getName();

			className = className.substring(0, className.length() - 6);

			String content = FileUtil.read(file);

			List<String> bodyList = _scan(content);

			String newContent = _translate(content, bodyList);

			File outputFile = new File(basedir + className + ".java");

			FileUtil.write(outputFile, newContent);
		}
	}

	private static List<String> _scan(String content) throws Exception {
		List<String> bodyList = new ArrayList<String>();

		BufferedReader bufferedReader = new BufferedReader(
			new StringReader(content));

		String line = null;
		StringBuilder bodySB = null;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.indexOf("<![") != -1) {
				bodySB = new StringBuilder();

				continue;
			}

			if (bodySB != null) {
				if (line.indexOf("]>") != -1) {
					bodyList.add(bodySB.toString());
				}
				else {
					bodySB.append(line);
				}

			}
		}

		bufferedReader.close();

		return bodyList;
	}

	private static String _translate(
		String content, List<String> bodyList) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(
			new StringReader(content));

		StringBuilder sb = new StringBuilder();

		int bodyIndex = 0;
		String line = null;
		String bodyExp = null;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.indexOf("<![") != -1) {
				sb.append(line.replace("<![", "{"));
				sb.append("\n");

				bodyExp = bodyList.get(bodyIndex++);
			}

			if (line.indexOf("]>") != -1) {
				sb.append(ImperativeOcl.getInstance().compileToJava(bodyExp));
				sb.append("\n");
				sb.append(line.replace("]>", "}"));
				sb.append("\n");

				bodyExp = null;

				continue;
			}

			if (bodyExp == null) {
				sb.append(line);
				sb.append("\n");
			}
		}

		bufferedReader.close();

		return sb.toString();
	}

	private static String[] _getTestFiles() {
		String basedir = "./input";

		DirectoryScanner ds = new DirectoryScanner();

		ds.setBasedir(basedir);
		ds.setIncludes(new String[] {"**\\*.jiocl"});

		ds.scan();

		return ds.getIncludedFiles();
	}

}