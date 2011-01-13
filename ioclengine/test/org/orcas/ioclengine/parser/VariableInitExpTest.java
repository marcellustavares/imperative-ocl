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

package org.orcas.ioclengine.parser;

import junit.framework.TestCase;

import org.orcas.iocl.expression.emof.PrimitiveType;
import org.orcas.iocl.expression.imperativeocl.OclExpression;
import org.orcas.iocl.expression.imperativeocl.OperationCallExp;
import org.orcas.iocl.expression.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expression.imperativeocl.Variable;
import org.orcas.iocl.expression.imperativeocl.VariableInitExp;
import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.IOCLException;
import org.orcas.ioclengine.util.PathType;

public class VariableInitExpTest extends TestCase {

	public void testVariableInitExp() throws IOCLException {
		exp = "var tmp := 1+2;";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof VariableInitExp);

		VariableInitExp variableInitExp = (VariableInitExp) oclExp;

		Variable referredVariable = variableInitExp.getReferredVariable();

		assertEquals(referredVariable.getName(), "tmp");

		assertTrue(variableInitExp.getType() == null);

		OclExpression initExpression = referredVariable.getInitExpression();

		assertTrue(initExpression instanceof OperationCallExp);
	}

	public void testVariableInitTypedExp() throws IOCLException {
		exp = "var tmp:String := 'Marcellus';";

		oclExp = IOCLEngine.parse(null, exp);

		assertTrue(oclExp instanceof VariableInitExp);

		VariableInitExp variableInitExp = (VariableInitExp) oclExp;

		Variable referredVariable = variableInitExp.getReferredVariable();

		assertEquals(referredVariable.getName(), "tmp");

		assertTrue(referredVariable.getType() instanceof PrimitiveType);

		OclExpression initExpression = referredVariable.getInitExpression();

		assertTrue(initExpression instanceof StringLiteralExp);

		StringLiteralExp stringLiteralExp = (StringLiteralExp)initExpression;

		assertEquals(stringLiteralExp.getStringSymbol(), "Marcellus");

		exp = "var tmp:javax::portlet::Portlet := 'Marcellus';";

		oclExp = IOCLEngine.parse(null, exp);

		variableInitExp = (VariableInitExp) oclExp;

		assertTrue(oclExp instanceof VariableInitExp);

		variableInitExp = (VariableInitExp) oclExp;

		referredVariable = variableInitExp.getReferredVariable();

		assertTrue(referredVariable.getType() instanceof PathType);

		PathType pathType = (PathType)referredVariable.getType();

		assertEquals(3, pathType.getQualifiedName().size());
	}

	protected String exp;
	protected OclExpression oclExp;

}