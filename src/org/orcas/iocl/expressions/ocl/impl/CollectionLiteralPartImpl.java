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

import org.orcas.iocl.expressions.emof.impl.TypedElementImpl;

import org.orcas.iocl.expressions.ocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.ocl.CollectionLiteralPart;
import org.orcas.iocl.expressions.ocl.OclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.ocl.impl.CollectionLiteralPartImpl#getCollectionLiteralExp <em>Collection Literal Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CollectionLiteralPartImpl extends TypedElementImpl implements CollectionLiteralPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionLiteralPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OclPackage.Literals.COLLECTION_LITERAL_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionLiteralExp getCollectionLiteralExp() {
		if (eContainerFeatureID() != OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP) return null;
		return (CollectionLiteralExp)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionLiteralExp(CollectionLiteralExp newCollectionLiteralExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCollectionLiteralExp, OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionLiteralExp(CollectionLiteralExp newCollectionLiteralExp) {
		if (newCollectionLiteralExp != eInternalContainer() || (eContainerFeatureID() != OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP && newCollectionLiteralExp != null)) {
			if (EcoreUtil.isAncestor(this, newCollectionLiteralExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCollectionLiteralExp != null)
				msgs = ((InternalEObject)newCollectionLiteralExp).eInverseAdd(this, OclPackage.COLLECTION_LITERAL_EXP__PART, CollectionLiteralExp.class, msgs);
			msgs = basicSetCollectionLiteralExp(newCollectionLiteralExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP, newCollectionLiteralExp, newCollectionLiteralExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCollectionLiteralExp((CollectionLiteralExp)otherEnd, msgs);
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				return basicSetCollectionLiteralExp(null, msgs);
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				return eInternalContainer().eInverseRemove(this, OclPackage.COLLECTION_LITERAL_EXP__PART, CollectionLiteralExp.class, msgs);
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				return getCollectionLiteralExp();
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				setCollectionLiteralExp((CollectionLiteralExp)newValue);
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				setCollectionLiteralExp((CollectionLiteralExp)null);
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
			case OclPackage.COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP:
				return getCollectionLiteralExp() != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionLiteralPartImpl
