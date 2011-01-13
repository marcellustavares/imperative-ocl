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

import org.orcas.iocl.expression.emof.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getReferredOperation <em>Referred Operation</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getOperationCode <em>Operation Code</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getIsImperativeOperation <em>Is Imperative Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getOperationCallExp()
 * @model
 * @generated
 */
public interface OperationCallExp extends FeaturePropertyCall {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expression.imperativeocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getOperationCallExp_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Operation</em>' reference.
	 * @see #setReferredOperation(Operation)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getOperationCallExp_ReferredOperation()
	 * @model
	 * @generated
	 */
	Operation getReferredOperation();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getReferredOperation <em>Referred Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Operation</em>' reference.
	 * @see #getReferredOperation()
	 * @generated
	 */
	void setReferredOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Operation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Code</em>' attribute.
	 * @see #setOperationCode(Integer)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getOperationCallExp_OperationCode()
	 * @model dataType="org.orcas.iocl.expression.emof.Integer"
	 * @generated
	 */
	Integer getOperationCode();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getOperationCode <em>Operation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Code</em>' attribute.
	 * @see #getOperationCode()
	 * @generated
	 */
	void setOperationCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Imperative Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Imperative Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Imperative Operation</em>' attribute.
	 * @see #setIsImperativeOperation(Boolean)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getOperationCallExp_IsImperativeOperation()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsImperativeOperation();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.OperationCallExp#getIsImperativeOperation <em>Is Imperative Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Imperative Operation</em>' attribute.
	 * @see #getIsImperativeOperation()
	 * @generated
	 */
	void setIsImperativeOperation(Boolean value);

} // OperationCallExp
