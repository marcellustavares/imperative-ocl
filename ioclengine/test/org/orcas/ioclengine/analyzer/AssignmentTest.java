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

package org.orcas.ioclengine.analyzer;

import org.orcas.ioclengine.IOCLEngine;
import org.orcas.ioclengine.exception.SemanticException;

import junit.framework.TestCase;

public class AssignmentTest extends TestCase {

	public void testVarInitialization() {
		String expression = "do {var test:String := 1.0;}";

		try {
			IOCLEngine.parse(null, expression);

			fail("Semantic exception not raised.");
		}
		catch (Exception e) {
			assertTrue(e instanceof SemanticException);
		}
	}

	public void testAssignment() {
		String expression = "do {var test:String := 'Hello'; test := 2;}";

		try {
			IOCLEngine.parse(null, expression);

			fail("Semantic exception not raised.");
		}
		catch (Exception e) {
			assertTrue(e instanceof SemanticException);
		}
	}

}