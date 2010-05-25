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

import junit.framework.TestCase;

import org.orcas.iocl.Iocl;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.RaiseExp;
import org.orcas.iocl.exp.StringLiteralExp;

public class TestRaiseExp extends TestCase {

    public void testAssignResetExp() throws IOCLException {
        exp = "raise 'custom exception message';";

        oclExp = iocl.parse(exp);

        assertTrue(oclExp instanceof RaiseExp);

        RaiseExp raiseExp = (RaiseExp) oclExp;

        assertTrue(raiseExp.getException() instanceof StringLiteralExp);

        StringLiteralExp stringLiteralExp =
            (StringLiteralExp) raiseExp.getException();

        String exceptionMessage = stringLiteralExp.getStringSymbol();

        assertEquals(exceptionMessage, "custom exception message");
    }

    protected String exp;
    protected Iocl iocl = Iocl.getInstance();
    protected OclExpression oclExp;

}