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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getValue <em>Value</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getAssignExp()
 * @model
 * @generated
 */
public interface AssignExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expression.imperativeocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getAssignExp_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getValue();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(OclExpression)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getAssignExp_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getLeft();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(OclExpression)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getAssignExp_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getDefaultValue();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Is Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reset</em>' attribute.
	 * @see #setIsReset(Boolean)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getAssignExp_IsReset()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsReset();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reset</em>' attribute.
	 * @see #getIsReset()
	 * @generated
	 */
	void setIsReset(Boolean value);

} // AssignExp
