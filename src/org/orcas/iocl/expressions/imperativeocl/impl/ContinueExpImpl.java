/**
 * Copyright (C) 2010  Marcellus C. Tavares
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id$
 */
package org.orcas.iocl.expressions.imperativeocl.impl;

import org.eclipse.emf.ecore.EClass;

import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage;
import org.orcas.iocl.expressions.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continue Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinueExpImpl extends ImperativeExpressionImpl implements ContinueExp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinueExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOclPackage.Literals.CONTINUE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T, V extends Visitor<T>> T accept(V v) {
		return v.visitContinueExp(this);
	}

} //ContinueExpImpl
