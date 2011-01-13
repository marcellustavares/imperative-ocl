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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.orcas.ioclengine.parser.antlr.IoclLexer;

public class IOCLLexer {

	public IOCLLexer(String exp) {
		ANTLRStringStream stream = new ANTLRStringStream(exp);

		_lexer = new IoclLexer(stream);
	}

	public TokenStream getTokenStream() {
		return new CommonTokenStream(_lexer);
	}

	private IoclLexer _lexer;

}