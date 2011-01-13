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
 * A representation of the model object '<em><b>Expression In Ocl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getContext <em>Context</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getResultVariable <em>Result Variable</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getParameterVariable <em>Parameter Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getExpressionInOcl()
 * @model
 * @generated
 */
public interface ExpressionInOcl extends OpaqueExpression {
	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Expression</em>' containment reference.
	 * @see #setBodyExpression(OclExpression)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getExpressionInOcl_BodyExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getBodyExpression();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getBodyExpression <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Expression</em>' containment reference.
	 * @see #getBodyExpression()
	 * @generated
	 */
	void setBodyExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Variable)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getExpressionInOcl_Context()
	 * @model containment="true"
	 * @generated
	 */
	Variable getContext();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Variable value);

	/**
	 * Returns the value of the '<em><b>Result Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Variable</em>' containment reference.
	 * @see #setResultVariable(Variable)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getExpressionInOcl_ResultVariable()
	 * @model containment="true"
	 * @generated
	 */
	Variable getResultVariable();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getResultVariable <em>Result Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Variable</em>' containment reference.
	 * @see #getResultVariable()
	 * @generated
	 */
	void setResultVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Parameter Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Variable</em>' containment reference.
	 * @see #setParameterVariable(Variable)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getExpressionInOcl_ParameterVariable()
	 * @model containment="true"
	 * @generated
	 */
	Variable getParameterVariable();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.ExpressionInOcl#getParameterVariable <em>Parameter Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Variable</em>' containment reference.
	 * @see #getParameterVariable()
	 * @generated
	 */
	void setParameterVariable(Variable value);

} // ExpressionInOcl
