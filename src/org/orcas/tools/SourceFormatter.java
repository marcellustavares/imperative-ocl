package org.orcas.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import org.apache.tools.ant.DirectoryScanner;
import org.orcas.iocl.util.StringPool;
import org.orcas.iocl.util.StringUtil;
import org.orcas.util.FileUtil;

public class SourceFormatter {

    public static void main(String[] args) throws Exception {
        String basedir = "./";

        String copyright = FileUtil.read(
    		new File("./src/org/orcas/tools/copyright.txt"));

        String[] files = _getJavaFiles();

        for (int i = 0; i < files.length; i++) {
            File file = new File(basedir + files[i]);

            String content = FileUtil.read(file);

            String className = file.getName();
            
            className = className.substring(0, className.length() - 5);

            String packagePath = files[i];

            packagePath = packagePath.replace("src" + File.separator, "");
            packagePath = packagePath.replace('/', '.');

            String newContent = _formatContent(packagePath, content);
            
            if (!newContent.contains(copyright)) {
            	newContent = copyright.concat("\n\n" + newContent);
            }
            
            if (newContent.indexOf("if(") != -1) {
				newContent = newContent.replace("if(", "if (");
			}

			if (newContent.indexOf("while(") != -1) {
				newContent = newContent.replace("while(", "while (");
			}
			
			if (newContent.indexOf("){") != -1) {
				newContent = newContent.replace("){", ") {");
			}
			
			if (newContent.indexOf("  {") != -1) {
				System.out.println("{:" + files[i]);
			}
			
			if (!newContent.endsWith("\n\n}") &&
				!newContent.endsWith("{\n}")) {

				System.out.println("}: " + files[i]);
			}

            if (!content.equals(newContent)) {
                FileUtil.write(file, newContent);

                System.out.println(file);
            }
        }
    }

    private static String _formatContent(
		String fileName, String content) throws IOException{

    	BufferedReader bufferedReader = new BufferedReader(
			new StringReader(content));
        String line = null;
        StringBuilder sb = new StringBuilder();

        int lineCount = 0;
        while ((line = bufferedReader.readLine()) != null) {

            lineCount++;

            if (line.trim().length() == 0) {
                line = StringPool.BLANK;
            }

            line = StringUtil.trimTrailing(line);
            
            sb.append(line);
            sb.append("\n");

            StringBuilder lineSB = new StringBuilder();

            int spacesPerTab = 4;

            for (char c : line.toCharArray()) {
                if (c == '\t') {
                    for (int i = 0; i < spacesPerTab; i++) {
                        lineSB.append(' ');
                    }

                    spacesPerTab = 4;
                }
                else {
                    lineSB.append(c);

                    spacesPerTab--;

                    if (spacesPerTab <= 0) {
                        spacesPerTab = 4;
                    }
                }
            }

            line = lineSB.toString();

            if ((line.length() > 80) && !line.startsWith("import ") &&
                !line.startsWith("package ")) {

                System.out.println("> 80: " + fileName + " " + lineCount);
            }
        }

        bufferedReader.close();

        String newContent = sb.toString();

        if (newContent.endsWith("\n")) {
            newContent = newContent.substring(0, newContent.length() -1);
        }


        return newContent;
    }
    
    private static String[] _getJavaFiles() {
        String basedir = "./";

        DirectoryScanner ds = new DirectoryScanner();

        ds.setBasedir(basedir);
        ds.setExcludes(new String[] {
            "**\\bin\\**", "**\\IoclLexer.java", "**\\IoclParser.java",
            "**\\SourceFormatter.java", "**\\input\\**"});

        ds.setIncludes(new String[] {"**\\*.java"});

        ds.scan();

        return ds.getIncludedFiles();
    }

}