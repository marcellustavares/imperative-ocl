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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.VariableExp#getReferredVariable <em>Referred Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getVariableExp()
 * @model
 * @generated
 */
public interface VariableExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Variable</em>' reference.
	 * @see #setReferredVariable(Variable)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getVariableExp_ReferredVariable()
	 * @model
	 * @generated
	 */
	Variable getReferredVariable();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.VariableExp#getReferredVariable <em>Referred Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Variable</em>' reference.
	 * @see #getReferredVariable()
	 * @generated
	 */
	void setReferredVariable(Variable value);

} // VariableExp
