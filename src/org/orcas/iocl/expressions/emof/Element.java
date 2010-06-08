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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.emof.Element#getTag <em>Tag</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.emof.Element#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.emof.EmofPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends org.orcas.iocl.expressions.emof.Object {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.emof.Tag}.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expressions.emof.Tag#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see org.orcas.iocl.expressions.emof.EmofPackage#getElement_Tag()
	 * @see org.orcas.iocl.expressions.emof.Tag#getElement
	 * @model opposite="element"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.emof.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.emof.EmofPackage#getElement_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

} // Element
