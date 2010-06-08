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

import org.orcas.iocl.expressions.ocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getLog <em>Log</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getAssertExp()
 * @model
 * @generated
 */
public interface AssertExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orcas.iocl.expressions.imperativeocl.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.orcas.iocl.expressions.imperativeocl.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getAssertExp_Severity()
	 * @model
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.orcas.iocl.expressions.imperativeocl.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference.
	 * @see #setLog(LogExp)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getAssertExp_Log()
	 * @model containment="true"
	 * @generated
	 */
	LogExp getLog();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getLog <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' containment reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(LogExp value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(OclExpression)
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage#getAssertExp_Assertion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getAssertion();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(OclExpression value);

} // AssertExp
