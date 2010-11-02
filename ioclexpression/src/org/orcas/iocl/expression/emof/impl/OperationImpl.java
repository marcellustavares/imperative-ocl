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
package org.orcas.iocl.expression.emof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orcas.iocl.expression.emof.Comment;
import org.orcas.iocl.expression.emof.Element;
import org.orcas.iocl.expression.emof.EmofPackage;
import org.orcas.iocl.expression.emof.NamedElement;
import org.orcas.iocl.expression.emof.Operation;
import org.orcas.iocl.expression.emof.Parameter;
import org.orcas.iocl.expression.emof.Tag;
import org.orcas.iocl.expression.emof.Type;
import org.orcas.iocl.expression.emof.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.impl.OperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MultiplicityElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComment;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmofPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, EmofPackage.OPERATION__TAG, EmofPackage.TAG__ELEMENT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, EmofPackage.OPERATION__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmofPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmofPackage.OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmofPackage.OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.orcas.iocl.expression.emof.Class getClass_() {
		if (eContainerFeatureID() != EmofPackage.OPERATION__CLASS) return null;
		return (org.orcas.iocl.expression.emof.Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.orcas.iocl.expression.emof.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, EmofPackage.OPERATION__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.orcas.iocl.expression.emof.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != EmofPackage.OPERATION__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EmofPackage.CLASS__OWNED_OPERATION, org.orcas.iocl.expression.emof.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmofPackage.OPERATION__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, EmofPackage.OPERATION__OWNED_PARAMETER, EmofPackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, EmofPackage.OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmofPackage.OPERATION__TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTag()).basicAdd(otherEnd, msgs);
			case EmofPackage.OPERATION__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((org.orcas.iocl.expression.emof.Class)otherEnd, msgs);
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
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
			case EmofPackage.OPERATION__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case EmofPackage.OPERATION__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case EmofPackage.OPERATION__CLASS:
				return basicSetClass(null, msgs);
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case EmofPackage.OPERATION__CLASS:
				return eInternalContainer().eInverseRemove(this, EmofPackage.CLASS__OWNED_OPERATION, org.orcas.iocl.expression.emof.Class.class, msgs);
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
			case EmofPackage.OPERATION__TAG:
				return getTag();
			case EmofPackage.OPERATION__OWNED_COMMENT:
				return getOwnedComment();
			case EmofPackage.OPERATION__NAME:
				return getName();
			case EmofPackage.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case EmofPackage.OPERATION__CLASS:
				return getClass_();
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				return getOwnedParameter();
			case EmofPackage.OPERATION__RAISED_EXCEPTION:
				return getRaisedException();
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
			case EmofPackage.OPERATION__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case EmofPackage.OPERATION__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case EmofPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case EmofPackage.OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case EmofPackage.OPERATION__CLASS:
				setClass((org.orcas.iocl.expression.emof.Class)newValue);
				return;
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case EmofPackage.OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
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
			case EmofPackage.OPERATION__TAG:
				getTag().clear();
				return;
			case EmofPackage.OPERATION__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case EmofPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmofPackage.OPERATION__TYPE:
				setType((Type)null);
				return;
			case EmofPackage.OPERATION__CLASS:
				setClass((org.orcas.iocl.expression.emof.Class)null);
				return;
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case EmofPackage.OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
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
			case EmofPackage.OPERATION__TAG:
				return tag != null && !tag.isEmpty();
			case EmofPackage.OPERATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case EmofPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmofPackage.OPERATION__TYPE:
				return type != null;
			case EmofPackage.OPERATION__CLASS:
				return getClass_() != null;
			case EmofPackage.OPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case EmofPackage.OPERATION__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.orcas.iocl.expression.emof.Object.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case EmofPackage.OPERATION__TAG: return EmofPackage.ELEMENT__TAG;
				case EmofPackage.OPERATION__OWNED_COMMENT: return EmofPackage.ELEMENT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case EmofPackage.OPERATION__NAME: return EmofPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case EmofPackage.OPERATION__TYPE: return EmofPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.orcas.iocl.expression.emof.Object.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case EmofPackage.ELEMENT__TAG: return EmofPackage.OPERATION__TAG;
				case EmofPackage.ELEMENT__OWNED_COMMENT: return EmofPackage.OPERATION__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.NAMED_ELEMENT__NAME: return EmofPackage.OPERATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.TYPED_ELEMENT__TYPE: return EmofPackage.OPERATION__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
