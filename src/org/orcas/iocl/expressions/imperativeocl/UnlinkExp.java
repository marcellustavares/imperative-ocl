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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlink Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getTarget <em>Target</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getUnlinkExp()
 * @model
 * @generated
 */
public interface UnlinkExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(OclExpression)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getUnlinkExp_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getTarget();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(OclExpression)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getUnlinkExp_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getItem();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(OclExpression value);

} // UnlinkExp
