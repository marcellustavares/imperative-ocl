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

package org.orcas.iocl;

import org.orcas.iocl.analyzer.Analyzer;
import org.orcas.iocl.exception.ImperativeOclException;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.util.Visitor;

public interface ImperativeOclService {

	public String compile(Object context, String expression)
		throws ImperativeOclException;

	public OclExpression parse(Object context, String expression)
		throws ImperativeOclException;

	public void setAnalyzer(Analyzer analyzer);

	public void setGenerator(Visitor<String> visitor);

}