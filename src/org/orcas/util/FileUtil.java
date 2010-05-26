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

package org.orcas.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileUtil {

    public static String read(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = new byte[fis.available()];

        fis.read(bytes);

        fis.close();

        String s = new String(bytes);

        return s.replaceAll("\r\n", "\n");
    }

    public static void write(File file, String content) throws IOException {
        Writer writer = new OutputStreamWriter(
            new FileOutputStream(file, false));

        writer.write(content);

        writer.close();
    }

}