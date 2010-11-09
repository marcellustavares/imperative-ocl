package org.orcas.ioclgenerator;

import org.apache.log4j.Logger;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.util.Visitor;
import org.orcas.ioclgenerator.util.PropsUtil;

@SuppressWarnings({"rawtypes", "unchecked"})
public class IOCLGenerator {
	
	private IOCLGenerator() {
		try {
			Class generatorClass = Class.forName(
				PropsUtil.get("iocl.visitor.class"));

			_generator = (Visitor)generatorClass.newInstance();
		}
		catch (Exception e) {
			_log.error(e);
		}
	}
	
	public static String generate(OclExpression expression) {
		return _instance._generate(expression);
	}
	
	private String _generate(OclExpression expression) {
		return (String)expression.accept(_generator);
	}
	
	private static IOCLGenerator _instance = new IOCLGenerator();
	
	private Visitor _generator;
	
	private Logger _log = Logger.getLogger(IOCLGenerator.class);
}
