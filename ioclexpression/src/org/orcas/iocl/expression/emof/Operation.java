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
package org.orcas.iocl.expression.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.emof.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Operation#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.emof.EmofPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends MultiplicityElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expression.emof.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(org.orcas.iocl.expression.emof.Class)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getOperation_Class()
	 * @see org.orcas.iocl.expression.emof.Class#getOwnedOperation
	 * @model opposite="ownedOperation" required="true"
	 * @generated
	 */
	org.orcas.iocl.expression.emof.Class getClass_();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.orcas.iocl.expression.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expression.emof.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expression.emof.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getOperation_OwnedParameter()
	 * @see org.orcas.iocl.expression.emof.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.orcas.iocl.expression.emof.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getOperation_RaisedException()
	 * @model
	 * @generated
	 */
	EList<Type> getRaisedException();

} // Operation
