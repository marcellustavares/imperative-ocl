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
package org.orcas.iocl.expressions.imperativeocl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;

import org.orcas.iocl.expressions.ocl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Init Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl#getReferredVariable <em>Referred Variable</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl#getWithResult <em>With Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableInitExpImpl extends ImperativeExpressionImpl implements VariableInitExp {
	/**
	 * The cached value of the '{@link #getReferredVariable() <em>Referred Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable referredVariable;

	/**
	 * The default value of the '{@link #getWithResult() <em>With Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithResult()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WITH_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithResult() <em>With Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithResult()
	 * @generated
	 * @ordered
	 */
	protected Boolean withResult = WITH_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableInitExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeoclPackage.Literals.VARIABLE_INIT_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReferredVariable() {
		return referredVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferredVariable(Variable newReferredVariable, NotificationChain msgs) {
		Variable oldReferredVariable = referredVariable;
		referredVariable = newReferredVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE, oldReferredVariable, newReferredVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredVariable(Variable newReferredVariable) {
		if (newReferredVariable != referredVariable) {
			NotificationChain msgs = null;
			if (referredVariable != null)
				msgs = ((InternalEObject)referredVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE, null, msgs);
			if (newReferredVariable != null)
				msgs = ((InternalEObject)newReferredVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE, null, msgs);
			msgs = basicSetReferredVariable(newReferredVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE, newReferredVariable, newReferredVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWithResult() {
		return withResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithResult(Boolean newWithResult) {
		Boolean oldWithResult = withResult;
		withResult = newWithResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.VARIABLE_INIT_EXP__WITH_RESULT, oldWithResult, withResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE:
				return basicSetReferredVariable(null, msgs);
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
			case ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE:
				return getReferredVariable();
			case ImperativeoclPackage.VARIABLE_INIT_EXP__WITH_RESULT:
				return getWithResult();
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
			case ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE:
				setReferredVariable((Variable)newValue);
				return;
			case ImperativeoclPackage.VARIABLE_INIT_EXP__WITH_RESULT:
				setWithResult((Boolean)newValue);
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
			case ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE:
				setReferredVariable((Variable)null);
				return;
			case ImperativeoclPackage.VARIABLE_INIT_EXP__WITH_RESULT:
				setWithResult(WITH_RESULT_EDEFAULT);
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
			case ImperativeoclPackage.VARIABLE_INIT_EXP__REFERRED_VARIABLE:
				return referredVariable != null;
			case ImperativeoclPackage.VARIABLE_INIT_EXP__WITH_RESULT:
				return WITH_RESULT_EDEFAULT == null ? withResult != null : !WITH_RESULT_EDEFAULT.equals(withResult);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (withResult: "); //$NON-NLS-1$
		result.append(withResult);
		result.append(')');
		return result.toString();
	}

} //VariableInitExpImpl
