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

import org.orcas.iocl.expressions.emof.Parameter;
import org.orcas.iocl.expressions.emof.TypedElement;
import org.orcas.iocl.expressions.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.Variable#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.Variable#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.Variable#getBindParameter <em>Bind Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TypedElement, Visitable {
	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(OclExpression)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getVariable_InitExpression()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getInitExpression();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.Variable#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Let Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expressions.imperativeocl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Exp</em>' container reference.
	 * @see #setLetExp(LetExp)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getVariable_LetExp()
	 * @see org.orcas.iocl.expressions.imperativeocl.LetExp#getVariable
	 * @model opposite="variable"
	 * @generated
	 */
	LetExp getLetExp();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.Variable#getLetExp <em>Let Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let Exp</em>' container reference.
	 * @see #getLetExp()
	 * @generated
	 */
	void setLetExp(LetExp value);

	/**
	 * Returns the value of the '<em><b>Bind Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Parameter</em>' reference.
	 * @see #setBindParameter(Parameter)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage#getVariable_BindParameter()
	 * @model
	 * @generated
	 */
	Parameter getBindParameter();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.Variable#getBindParameter <em>Bind Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Parameter</em>' reference.
	 * @see #getBindParameter()
	 * @generated
	 */
	void setBindParameter(Parameter value);

} // Variable
