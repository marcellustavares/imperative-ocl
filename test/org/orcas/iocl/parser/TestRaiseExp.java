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

package org.orcas.iocl.parser;

import org.orcas.iocl.ImperativeOclServiceUtil;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.util.PathType;

import junit.framework.TestCase;

public class TestRaiseExp extends TestCase {

	public void testRaiseExceptionMessageExp() throws ImperativeOclException {
		exp = "raise 'custom exception message';";

		oclExp = ImperativeOclServiceUtil.parse(exp);

		assertTrue(oclExp instanceof RaiseExp);

		RaiseExp raiseExp = (RaiseExp) oclExp;

		assertEquals(
			raiseExp.getExceptionMessage(), "custom exception message");
	}

	public void testRaiseTypeExp() throws ImperativeOclException {
		exp = "raise java::lang::Exception;";

		oclExp = ImperativeOclServiceUtil.parse(exp);

		assertTrue(oclExp instanceof RaiseExp);

		RaiseExp raiseExp = (RaiseExp) oclExp;

		assertTrue(raiseExp.getException() instanceof PathType);

		PathType pathType = (PathType) raiseExp.getException();

		assertTrue(pathType.getQualifiedName().size() == 3);
	}

	protected String exp;
	protected OclExpression oclExp;

}