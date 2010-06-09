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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp#getAlternativePart <em>Alternative Part</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getSwitchExp()
 * @model
 * @generated
 */
public interface SwitchExp extends CallExp, ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Alternative Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.imperativeocl.AltExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Part</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getSwitchExp_AlternativePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<AltExp> getAlternativePart();

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(OclExpression)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getSwitchExp_ElsePart()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getElsePart();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(OclExpression value);

} // SwitchExp
