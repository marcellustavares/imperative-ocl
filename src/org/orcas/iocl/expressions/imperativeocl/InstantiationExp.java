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
import org.orcas.iocl.expressions.ocl.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getInstantiationExp()
 * @model
 * @generated
 */
public interface InstantiationExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Class</em>' reference.
	 * @see #setInstantiatedClass(org.orcas.iocl.expressions.emof.Class)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getInstantiationExp_InstantiatedClass()
	 * @model required="true"
	 * @generated
	 */
	org.orcas.iocl.expressions.emof.Class getInstantiatedClass();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Class</em>' reference.
	 * @see #getInstantiatedClass()
	 * @generated
	 */
	void setInstantiatedClass(org.orcas.iocl.expressions.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(Variable)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getInstantiationExp_Extent()
	 * @model
	 * @generated
	 */
	Variable getExtent();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Variable value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.ocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getInstantiationExp_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getArgument();

} // InstantiationExp
