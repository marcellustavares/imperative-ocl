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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage;

import org.orcas.iocl.expressions.ocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl#getIsReset <em>Is Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignExpImpl extends ImperativeExpressionImpl implements AssignExp {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> value;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected OclExpression left;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected OclExpression defaultValue;

	/**
	 * The default value of the '{@link #getIsReset() <em>Is Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReset()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_RESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReset() <em>Is Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReset()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReset = IS_RESET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeoclPackage.Literals.ASSIGN_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, ImperativeoclPackage.ASSIGN_EXP__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(OclExpression newLeft, NotificationChain msgs) {
		OclExpression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.ASSIGN_EXP__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(OclExpression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.ASSIGN_EXP__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.ASSIGN_EXP__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.ASSIGN_EXP__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(OclExpression newDefaultValue, NotificationChain msgs) {
		OclExpression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(OclExpression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReset() {
		return isReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReset(Boolean newIsReset) {
		Boolean oldIsReset = isReset;
		isReset = newIsReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeoclPackage.ASSIGN_EXP__IS_RESET, oldIsReset, isReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeoclPackage.ASSIGN_EXP__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
			case ImperativeoclPackage.ASSIGN_EXP__LEFT:
				return basicSetLeft(null, msgs);
			case ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case ImperativeoclPackage.ASSIGN_EXP__VALUE:
				return getValue();
			case ImperativeoclPackage.ASSIGN_EXP__LEFT:
				return getLeft();
			case ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE:
				return getDefaultValue();
			case ImperativeoclPackage.ASSIGN_EXP__IS_RESET:
				return getIsReset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImperativeoclPackage.ASSIGN_EXP__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends OclExpression>)newValue);
				return;
			case ImperativeoclPackage.ASSIGN_EXP__LEFT:
				setLeft((OclExpression)newValue);
				return;
			case ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE:
				setDefaultValue((OclExpression)newValue);
				return;
			case ImperativeoclPackage.ASSIGN_EXP__IS_RESET:
				setIsReset((Boolean)newValue);
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
			case ImperativeoclPackage.ASSIGN_EXP__VALUE:
				getValue().clear();
				return;
			case ImperativeoclPackage.ASSIGN_EXP__LEFT:
				setLeft((OclExpression)null);
				return;
			case ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE:
				setDefaultValue((OclExpression)null);
				return;
			case ImperativeoclPackage.ASSIGN_EXP__IS_RESET:
				setIsReset(IS_RESET_EDEFAULT);
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
			case ImperativeoclPackage.ASSIGN_EXP__VALUE:
				return value != null && !value.isEmpty();
			case ImperativeoclPackage.ASSIGN_EXP__LEFT:
				return left != null;
			case ImperativeoclPackage.ASSIGN_EXP__DEFAULT_VALUE:
				return defaultValue != null;
			case ImperativeoclPackage.ASSIGN_EXP__IS_RESET:
				return IS_RESET_EDEFAULT == null ? isReset != null : !IS_RESET_EDEFAULT.equals(isReset);
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
		result.append(" (isReset: "); //$NON-NLS-1$
		result.append(isReset);
		result.append(')');
		return result.toString();
	}

} //AssignExpImpl
