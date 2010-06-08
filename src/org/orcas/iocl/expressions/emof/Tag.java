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
package org.orcas.iocl.expressions.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.emof.Tag#getElement <em>Element</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.emof.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.emof.Tag#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.emof.EmofPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.emof.Element}.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expressions.emof.Element#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see org.orcas.iocl.expressions.emof.EmofPackage#getTag_Element()
	 * @see org.orcas.iocl.expressions.emof.Element#getTag
	 * @model opposite="tag"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.orcas.iocl.expressions.emof.EmofPackage#getTag_Value()
	 * @model dataType="org.orcas.iocl.expressions.emof.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.emof.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orcas.iocl.expressions.emof.EmofPackage#getTag_Name()
	 * @model dataType="org.orcas.iocl.expressions.emof.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.emof.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tag
