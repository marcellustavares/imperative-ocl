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

import org.orcas.iocl.exp.SimpleName;
import org.orcas.iocl.exp.SimpleTypeEnum;

public class SimpleNameImpl extends OclExpressionImpl
    implements SimpleName {

    public SimpleTypeEnum getSimpleNameType() {
        return _type;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public void setSimpleNameType(SimpleTypeEnum type) {
        _type = type;
    }

    private String _value;
    private SimpleTypeEnum _type;

}