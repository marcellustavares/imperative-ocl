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

package org.orcas.ioclengine.helper;

import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.analyzer.IOCLAnalyzer;
import org.orcas.ioclengine.analyzer.TypeHelper;
import org.orcas.ioclengine.exception.IOCLException;
import org.orcas.ioclengine.util.ChoiceUtil;
import org.orcas.ioclengine.util.StringPool;
import org.orcas.ioclengine.util.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class SyntaxHelper {

	public SyntaxHelper(IOCLAnalyzer analyzer) {
		_analyzer = analyzer;
	}

	public List<Choice> getSyntaxHelp(Object context, String text)
		throws IOCLException {

		List<Choice> result = new ArrayList<Choice>();

		if (text.endsWith(StringPool.ARROW)) {
			int index = text.lastIndexOf(StringPool.ARROW);

			text = text.substring(0, index);
			text = getLastWord(text);

			return getChoices(context, text);
		}
		else if (text.endsWith(StringPool.DOT)) {
			int index = text.lastIndexOf(StringPool.DOT);

			text = text.substring(0, index);
			text = getLastWord(text);

			return getChoices(context, text);
		}
		else if (text.endsWith(StringPool.SCOPE)) {
			int index = text.lastIndexOf(StringPool.SCOPE);

			text = text.substring(0, index);
			text = getLastWord(text);

			result.addAll(getEnumerationLiterals(context, text));
		}
		else if (text.endsWith(StringPool.COLON)) {
			result.addAll(getPrimitiveTypes());
			result.addAll(getAvailableTypes(context));
		}
		else {
			text = getLastWord(text);

			result.addAll(getKeywords(text));
			result.addAll(getOperationParameters(context, text));
			result.addAll(getVariableNames(text));
		}

		return result;
	}
	protected List<Choice> getAvailableTypes(Object context) {
		List<String> availableTypes = new ArrayList<String>();

		List<?> classifiers = getTypeHelper().getAvailableTypes(context);

		for (Object classifier : classifiers) {
			availableTypes.add(getTypeHelper().getName(classifier));
		}

		return ChoiceUtil.toChoices(availableTypes);
	}

	protected List<Choice> getEnumerationLiterals(Object context, String text) {
		List<Choice> availableEnumerationLiterals = new ArrayList<Choice>();

		List<?> enumerations =
			getTypeHelper().getAvailableEnumerations(context);

		for (Object enumeration : enumerations) {
			String enumerationName = getTypeHelper().getName(enumeration);

			if (Validator.equals(text, enumerationName)) {
				List<?> enumerationLiterals =
					getTypeHelper().getEnumerationLiterals(enumeration);

				for (Object enumerationLiteral : enumerationLiterals) {
					availableEnumerationLiterals.add(
						new ChoiceImpl(
							ChoiceKind.PROPERTY,
							getTypeHelper().getName(enumerationLiteral)));

				}
			}
		}

		return availableEnumerationLiterals;
	}

	protected List<Choice> getChoices(Object context, String text)
		throws IOCLException {

		OclExpression oclExpression = IOCLEngine.parse(context, text);

		SyntaxHelperVisitor syntaxHelperVisitor = new SyntaxHelperVisitor();

		syntaxHelperVisitor.setAnalyzer(_analyzer);
		syntaxHelperVisitor.setContext(context);

		return oclExpression.accept(syntaxHelperVisitor);
	}

	protected List<Choice> getKeywords(String text) {
		List<String> selectedKeywords = new ArrayList<String>();

		if (Validator.isNull(text)) {
			selectedKeywords = Arrays.asList(_keywords);
		}
		else {
			for (String keyword : _keywords) {
				if (keyword.startsWith(text)) {
					selectedKeywords.add(keyword);
				}
			}
		}

		return ChoiceUtil.toChoices(selectedKeywords);
	}

	protected String getLastWord(String text) {
		if (Validator.isNull(text)) {
			return StringPool.BLANK;
		}

		char[] charArray = text.toCharArray();

		int beginIndex = -1;

		for(int i = (charArray.length-1) ; i >= 0; i--) {
			if ((charArray[i] == ' ') || (charArray[i] == '\n') ||
				(charArray[i] == '{') || (charArray[i] == '}')) {

				beginIndex = i;

				break;
			}
		}

		return text.substring(beginIndex+1);
	}

	protected List<Choice> getOperationParameters(Object context, String text) {
		List<String> selectedParameters = new ArrayList<String>();

		if (Validator.isNull(text)) {
			List<?> parameters = getTypeHelper().getParameters(context);

			for (Object parameter : parameters) {
				selectedParameters.add(getTypeHelper().getName(parameter));
			}
		}
		else {
			List<?> parameters = getTypeHelper().getParameters(context);

			for (Object parameter : parameters) {
				String parameterName = getTypeHelper().getName(parameter);

				if (parameterName.startsWith(text)){
					selectedParameters.add(parameterName);
				}
			}
		}

		return ChoiceUtil.toChoices(selectedParameters);
	}

	protected List<Choice> getPrimitiveTypes() {
		List<String> primitiveTypes = new ArrayList<String>();

		primitiveTypes.add("String");
		primitiveTypes.add("Integer");
		primitiveTypes.add("Boolean");
		primitiveTypes.add("Real");
		primitiveTypes.add("Sequence");

		return ChoiceUtil.toChoices(primitiveTypes);
	}

	protected TypeHelper getTypeHelper() {
		return _analyzer.getTypeHelper();
	}

	protected List<Choice> getVariableNames(String text) {
		List<String> selectedVariables = new ArrayList<String>();

		if (Validator.isNull(text)) {
			selectedVariables = getTypeHelper().getVariableNames();
		}
		else {
			List<String> variableNames = getTypeHelper().getVariableNames();

			for (String variableName : variableNames) {
				if (variableName.startsWith(text)) {
					selectedVariables.add(variableName);
				}
			}
		}

		return ChoiceUtil.toChoices(selectedVariables);
	}

	private IOCLAnalyzer _analyzer;

	private String[] _keywords = new String[] {
		"and", "break", "compute", "continue", "do", "if",
		"elif", "else", "try", "except", "raise",
		"return", "self", "log", "var", "while", "xor"};

}