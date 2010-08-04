/**
 * Copyright (C) 2010  Marcellus C. Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.orcas.iocl.generator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.orcas.iocl.expressions.util.Visitor;

public abstract class EAbstractVisitor<T> implements Visitor<T> {

	public EList<Adapter> eAdapters() {
		throw new UnsupportedOperationException();
	}

	public TreeIterator<EObject> eAllContents() {
		throw new UnsupportedOperationException();
	}

	public EClass eClass() {
		throw new UnsupportedOperationException();
	}

	public EObject eContainer() {
		throw new UnsupportedOperationException();
	}

	public EStructuralFeature eContainingFeature() {
		throw new UnsupportedOperationException();
	}

	public EReference eContainmentFeature() {
		throw new UnsupportedOperationException();
	}

	public EList<EObject> eContents() {
		throw new UnsupportedOperationException();
	}

	public EList<EObject> eCrossReferences() {
		throw new UnsupportedOperationException();
	}

	public boolean eDeliver() {
		throw new UnsupportedOperationException();
	}

	public Object eGet(EStructuralFeature arg0) {
		throw new UnsupportedOperationException();
	}

	public Object eGet(EStructuralFeature eStructuralFeature, boolean b) {
		throw new UnsupportedOperationException();
	}

	public boolean eIsProxy() {
		throw new UnsupportedOperationException();
	}

	public boolean eIsSet(EStructuralFeature eStructuralFeature) {
		throw new UnsupportedOperationException();
	}

	public void eNotify(Notification notification) {
	}

	public Resource eResource() {
		throw new UnsupportedOperationException();
	}

	public void eSet(EStructuralFeature eStructuralFeature, Object object) {
	}

	public void eSetDeliver(boolean b) {
	}

	public void eUnset(EStructuralFeature eStructuralFeature) {
	}

}