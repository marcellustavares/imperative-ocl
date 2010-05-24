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

package org.orcas.iocl.exp.impl;

import org.orcas.iocl.exp.OclExpression;
import org.orcas.iocl.exp.PropertyCallExp;
import org.orcas.iocl.exp.SimpleName;

public class PropertyCallExpImpl extends OclExpressionImpl
    implements PropertyCallExp {

    public SimpleName getSimpleName() {
        return _simpleName;
    }

    public OclExpression getSource() {
        return _source;
    }

    public void setSimpleName(SimpleName simpleName) {
        _simpleName = simpleName;
    }

    public void setSource(OclExpression source) {
        _source = source;
    }

    private SimpleName _simpleName;
    private OclExpression _source;

}