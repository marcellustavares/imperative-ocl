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
package org.orcas.iocl.expressions.imperativeocl;

import org.eclipse.emf.common.util.EList;

import org.orcas.iocl.expressions.ocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.TryExp#getTryBody <em>Try Body</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.TryExp#getCatchClause <em>Catch Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getTryExp()
 * @model
 * @generated
 */
public interface TryExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Try Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.ocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Body</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getTryExp_TryBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getTryBody();

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.imperativeocl.CatchExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getTryExp_CatchClause()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchExp> getCatchClause();

} // TryExp
