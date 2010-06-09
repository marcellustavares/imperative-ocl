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

import org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage;
import org.orcas.iocl.expressions.imperativeocl.InstantiationExp;
import org.orcas.iocl.expressions.imperativeocl.OclExpression;
import org.orcas.iocl.expressions.imperativeocl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl#getInstantiatedClass <em>Instantiated Class</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationExpImpl extends ImperativeExpressionImpl implements InstantiationExp {
	/**
	 * The cached value of the '{@link #getInstantiatedClass() <em>Instantiated Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedClass()
	 * @generated
	 * @ordered
	 */
	protected org.orcas.iocl.expressions.emof.Class instantiatedClass;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected Variable extent;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<OclExpression> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOclPackage.Literals.INSTANTIATION_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.orcas.iocl.expressions.emof.Class getInstantiatedClass() {
		if (instantiatedClass != null && instantiatedClass.eIsProxy()) {
			InternalEObject oldInstantiatedClass = (InternalEObject)instantiatedClass;
			instantiatedClass = (org.orcas.iocl.expressions.emof.Class)eResolveProxy(oldInstantiatedClass);
			if (instantiatedClass != oldInstantiatedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS, oldInstantiatedClass, instantiatedClass));
			}
		}
		return instantiatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.orcas.iocl.expressions.emof.Class basicGetInstantiatedClass() {
		return instantiatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedClass(org.orcas.iocl.expressions.emof.Class newInstantiatedClass) {
		org.orcas.iocl.expressions.emof.Class oldInstantiatedClass = instantiatedClass;
		instantiatedClass = newInstantiatedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS, oldInstantiatedClass, instantiatedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (Variable)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImperativeOclPackage.INSTANTIATION_EXP__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(Variable newExtent) {
		Variable oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOclPackage.INSTANTIATION_EXP__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclExpression> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<OclExpression>(OclExpression.class, this, ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS:
				if (resolve) return getInstantiatedClass();
				return basicGetInstantiatedClass();
			case ImperativeOclPackage.INSTANTIATION_EXP__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
			case ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT:
				return getArgument();
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
			case ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS:
				setInstantiatedClass((org.orcas.iocl.expressions.emof.Class)newValue);
				return;
			case ImperativeOclPackage.INSTANTIATION_EXP__EXTENT:
				setExtent((Variable)newValue);
				return;
			case ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends OclExpression>)newValue);
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
			case ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS:
				setInstantiatedClass((org.orcas.iocl.expressions.emof.Class)null);
				return;
			case ImperativeOclPackage.INSTANTIATION_EXP__EXTENT:
				setExtent((Variable)null);
				return;
			case ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT:
				getArgument().clear();
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
			case ImperativeOclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS:
				return instantiatedClass != null;
			case ImperativeOclPackage.INSTANTIATION_EXP__EXTENT:
				return extent != null;
			case ImperativeOclPackage.INSTANTIATION_EXP__ARGUMENT:
				return argument != null && !argument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstantiationExpImpl
