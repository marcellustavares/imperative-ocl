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
package org.orcas.iocl.expressions.ocl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.orcas.iocl.expressions.ocl.ExpressionInOcl;
import org.orcas.iocl.expressions.ocl.OclExpression;
import org.orcas.iocl.expressions.ocl.OclPackage;
import org.orcas.iocl.expressions.ocl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression In Ocl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.ExpressionInOclImpl#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.ExpressionInOclImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.ExpressionInOclImpl#getResultVariable <em>Result Variable</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.ExpressionInOclImpl#getParameterVariable <em>Parameter Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionInOclImpl extends OpaqueExpressionImpl implements ExpressionInOcl {
	/**
	 * The cached value of the '{@link #getBodyExpression() <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyExpression()
	 * @generated
	 * @ordered
	 */
	protected OclExpression bodyExpression;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Variable context;

	/**
	 * The cached value of the '{@link #getResultVariable() <em>Result Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable resultVariable;

	/**
	 * The cached value of the '{@link #getParameterVariable() <em>Parameter Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable parameterVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionInOclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OclPackage.Literals.EXPRESSION_IN_OCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getBodyExpression() {
		return bodyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyExpression(OclExpression newBodyExpression, NotificationChain msgs) {
		OclExpression oldBodyExpression = bodyExpression;
		bodyExpression = newBodyExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, oldBodyExpression, newBodyExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyExpression(OclExpression newBodyExpression) {
		if (newBodyExpression != bodyExpression) {
			NotificationChain msgs = null;
			if (bodyExpression != null)
				msgs = ((InternalEObject)bodyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null, msgs);
			if (newBodyExpression != null)
				msgs = ((InternalEObject)newBodyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, null, msgs);
			msgs = basicSetBodyExpression(newBodyExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION, newBodyExpression, newBodyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Variable newContext, NotificationChain msgs) {
		Variable oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Variable newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getResultVariable() {
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultVariable(Variable newResultVariable, NotificationChain msgs) {
		Variable oldResultVariable = resultVariable;
		resultVariable = newResultVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, oldResultVariable, newResultVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultVariable(Variable newResultVariable) {
		if (newResultVariable != resultVariable) {
			NotificationChain msgs = null;
			if (resultVariable != null)
				msgs = ((InternalEObject)resultVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null, msgs);
			if (newResultVariable != null)
				msgs = ((InternalEObject)newResultVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, null, msgs);
			msgs = basicSetResultVariable(newResultVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE, newResultVariable, newResultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getParameterVariable() {
		return parameterVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterVariable(Variable newParameterVariable, NotificationChain msgs) {
		Variable oldParameterVariable = parameterVariable;
		parameterVariable = newParameterVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE, oldParameterVariable, newParameterVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterVariable(Variable newParameterVariable) {
		if (newParameterVariable != parameterVariable) {
			NotificationChain msgs = null;
			if (parameterVariable != null)
				msgs = ((InternalEObject)parameterVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE, null, msgs);
			if (newParameterVariable != null)
				msgs = ((InternalEObject)newParameterVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE, null, msgs);
			msgs = basicSetParameterVariable(newParameterVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE, newParameterVariable, newParameterVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return basicSetBodyExpression(null, msgs);
			case OclPackage.EXPRESSION_IN_OCL__CONTEXT:
				return basicSetContext(null, msgs);
			case OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return basicSetResultVariable(null, msgs);
			case OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return basicSetParameterVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return getBodyExpression();
			case OclPackage.EXPRESSION_IN_OCL__CONTEXT:
				return getContext();
			case OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return getResultVariable();
			case OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return getParameterVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				setBodyExpression((OclExpression)newValue);
				return;
			case OclPackage.EXPRESSION_IN_OCL__CONTEXT:
				setContext((Variable)newValue);
				return;
			case OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				setResultVariable((Variable)newValue);
				return;
			case OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				setParameterVariable((Variable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				setBodyExpression((OclExpression)null);
				return;
			case OclPackage.EXPRESSION_IN_OCL__CONTEXT:
				setContext((Variable)null);
				return;
			case OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				setResultVariable((Variable)null);
				return;
			case OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				setParameterVariable((Variable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OclPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
				return bodyExpression != null;
			case OclPackage.EXPRESSION_IN_OCL__CONTEXT:
				return context != null;
			case OclPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				return resultVariable != null;
			case OclPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
				return parameterVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionInOclImpl
