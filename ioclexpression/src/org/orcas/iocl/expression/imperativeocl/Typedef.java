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
 */
package org.orcas.iocl.expression.imperativeocl;

import org.orcas.iocl.expression.emof.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.Typedef#getBase <em>Base</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.Typedef#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getTypedef()
 * @model
 * @generated
 */
public interface Typedef extends org.orcas.iocl.expression.emof.Class {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Type)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getTypedef_Base()
	 * @model required="true"
	 * @generated
	 */
	Type getBase();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.Typedef#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Type value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getTypedef_Condition()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.Typedef#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

} // Typedef
