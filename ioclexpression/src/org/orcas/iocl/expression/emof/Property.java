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
package org.orcas.iocl.expression.emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getIsId <em>Is Id</em>}</li>
 *   <li>{@link org.orcas.iocl.expression.emof.Property#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends MultiplicityElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expression.emof.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(org.orcas.iocl.expression.emof.Class)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_Class()
	 * @see org.orcas.iocl.expression.emof.Class#getOwnedAttribute
	 * @model opposite="ownedAttribute" required="true"
	 * @generated
	 */
	org.orcas.iocl.expression.emof.Class getClass_();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.orcas.iocl.expression.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_Opposite()
	 * @model
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_IsReadOnly()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_IsDerived()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_IsComposite()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(Boolean)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_IsId()
	 * @model dataType="org.orcas.iocl.expression.emof.Boolean"
	 * @generated
	 */
	Boolean getIsId();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #getIsId()
	 * @generated
	 */
	void setIsId(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.orcas.iocl.expression.emof.EmofPackage#getProperty_Default()
	 * @model dataType="org.orcas.iocl.expression.emof.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.emof.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

} // Property
