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

import org.orcas.iocl.exp.RaiseExp;
import org.orcas.iocl.exp.Type;
import org.orcas.iocl.util.StringPool;

public class RaiseExpImpl extends ImperativeExpImpl implements RaiseExp {

    public Type getException() {
        return _exception;
    }

    public String getExceptionMessage() {
        return _exceptionMessage;
    }

    public void setException(Type exception) {
        _exception = exception;
    }

    public void setExceptionMessage(String exceptionMessage) {
        _exceptionMessage = exceptionMessage;
    }

    private Type _exception;
    private String _exceptionMessage = StringPool.BLANK;

}