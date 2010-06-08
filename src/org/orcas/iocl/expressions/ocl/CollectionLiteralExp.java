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
package org.orcas.iocl.expressions.ocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expressions.ocl.CollectionLiteralExp#getKind <em>Kind</em>}</li>
 *   <li>{@link org.orcas.iocl.expressions.ocl.CollectionLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expressions.ocl.OclPackage#getCollectionLiteralExp()
 * @model
 * @generated
 */
public interface CollectionLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orcas.iocl.expressions.ocl.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.orcas.iocl.expressions.ocl.CollectionKind
	 * @see #setKind(CollectionKind)
	 * @see org.orcas.iocl.expressions.ocl.OclPackage#getCollectionLiteralExp_Kind()
	 * @model
	 * @generated
	 */
	CollectionKind getKind();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expressions.ocl.CollectionLiteralExp#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.orcas.iocl.expressions.ocl.CollectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.orcas.iocl.expressions.ocl.CollectionLiteralPart}.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expressions.ocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.orcas.iocl.expressions.ocl.OclPackage#getCollectionLiteralExp_Part()
	 * @see org.orcas.iocl.expressions.ocl.CollectionLiteralPart#getCollectionLiteralExp
	 * @model opposite="collectionLiteralExp" containment="true"
	 * @generated
	 */
	EList<CollectionLiteralPart> getPart();

} // CollectionLiteralExp
