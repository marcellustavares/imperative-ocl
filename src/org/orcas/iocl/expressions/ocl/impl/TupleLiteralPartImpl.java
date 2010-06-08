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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.orcas.iocl.expressions.emof.Property;

import org.orcas.iocl.expressions.emof.impl.TypedElementImpl;

import org.orcas.iocl.expressions.ocl.OclExpression;
import org.orcas.iocl.expressions.ocl.OclPackage;
import org.orcas.iocl.expressions.ocl.TupleLiteralExp;
import org.orcas.iocl.expressions.ocl.TupleLiteralPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.TupleLiteralPartImpl#getTupleLiteralExp <em>Tuple Literal Exp</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.TupleLiteralPartImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.TupleLiteralPartImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TupleLiteralPartImpl extends TypedElementImpl implements TupleLiteralPart {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property attribute;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OclExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleLiteralPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OclPackage.Literals.TUPLE_LITERAL_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralExp getTupleLiteralExp() {
		if (eContainerFeatureID() != OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP) return null;
		return (TupleLiteralExp)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleLiteralExp(TupleLiteralExp newTupleLiteralExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTupleLiteralExp, OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleLiteralExp(TupleLiteralExp newTupleLiteralExp) {
		if (newTupleLiteralExp != eInternalContainer() || (eContainerFeatureID() != OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP && newTupleLiteralExp != null)) {
			if (EcoreUtil.isAncestor(this, newTupleLiteralExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTupleLiteralExp != null)
				msgs = ((InternalEObject)newTupleLiteralExp).eInverseAdd(this, OclPackage.TUPLE_LITERAL_EXP__PART, TupleLiteralExp.class, msgs);
			msgs = basicSetTupleLiteralExp(newTupleLiteralExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP, newTupleLiteralExp, newTupleLiteralExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Property newAttribute, NotificationChain msgs) {
		Property oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, oldAttribute, newAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Property newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, null, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, null, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OclExpression newValue, NotificationChain msgs) {
		OclExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OclPackage.TUPLE_LITERAL_PART__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OclExpression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OclPackage.TUPLE_LITERAL_PART__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OclPackage.TUPLE_LITERAL_PART__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.TUPLE_LITERAL_PART__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTupleLiteralExp((TupleLiteralExp)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return basicSetTupleLiteralExp(null, msgs);
			case OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case OclPackage.TUPLE_LITERAL_PART__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return eInternalContainer().eInverseRemove(this, OclPackage.TUPLE_LITERAL_EXP__PART, TupleLiteralExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return getTupleLiteralExp();
			case OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return getAttribute();
			case OclPackage.TUPLE_LITERAL_PART__VALUE:
				return getValue();
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
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				setTupleLiteralExp((TupleLiteralExp)newValue);
				return;
			case OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				setAttribute((Property)newValue);
				return;
			case OclPackage.TUPLE_LITERAL_PART__VALUE:
				setValue((OclExpression)newValue);
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
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				setTupleLiteralExp((TupleLiteralExp)null);
				return;
			case OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				setAttribute((Property)null);
				return;
			case OclPackage.TUPLE_LITERAL_PART__VALUE:
				setValue((OclExpression)null);
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
			case OclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return getTupleLiteralExp() != null;
			case OclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return attribute != null;
			case OclPackage.TUPLE_LITERAL_PART__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //TupleLiteralPartImpl
