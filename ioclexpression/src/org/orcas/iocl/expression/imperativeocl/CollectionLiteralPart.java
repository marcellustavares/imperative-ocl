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
package org.orcas.iocl.expression.imperativeocl;

import org.orcas.iocl.expression.emof.TypedElement;

import org.orcas.iocl.expression.util.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orcas.iocl.expression.imperativeocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getCollectionLiteralPart()
 * @model abstract="true"
 * @generated
 */
public interface CollectionLiteralPart extends TypedElement, Visitable {
	/**
	 * Returns the value of the '<em><b>Collection Literal Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.orcas.iocl.expression.imperativeocl.CollectionLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Literal Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Literal Exp</em>' container reference.
	 * @see #setCollectionLiteralExp(CollectionLiteralExp)
	 * @see org.orcas.iocl.expression.imperativeocl.ImperativeoclPackage#getCollectionLiteralPart_CollectionLiteralExp()
	 * @see org.orcas.iocl.expression.imperativeocl.CollectionLiteralExp#getPart
	 * @model opposite="part" required="true"
	 * @generated
	 */
	CollectionLiteralExp getCollectionLiteralExp();

	/**
	 * Sets the value of the '{@link org.orcas.iocl.expression.imperativeocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Literal Exp</em>' container reference.
	 * @see #getCollectionLiteralExp()
	 * @generated
	 */
	void setCollectionLiteralExp(CollectionLiteralExp value);

} // CollectionLiteralPart
