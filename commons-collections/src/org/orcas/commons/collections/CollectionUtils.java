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

package org.orcas.commons.collections;

import org.apache.commons.collections.Bag;
import org.orcas.commons.collections.bag.HashBag;
import org.orcas.commons.collections.list.TreeList;
import org.orcas.commons.collections.set.HashSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("unchecked")
public class CollectionUtils extends
	org.apache.commons.collections.CollectionUtils {

	public static <E> E at(Collection<E> collection, int index)
		throws Exception {

		Iterator<E> itr = collection.iterator();

		for(int i = 0; itr.hasNext(); i++) {
			E element = itr.next();

			if (i == index){
				return element;
			}
		}

		return null;
	}

	public static <E> Collection<E> excluding(
			Collection<E> collection, E object)
		throws Exception {

		collection.remove(object);

		return collection;
	}

	public static <E> Collection<E> including(
			Collection<E> collection, E object)
		throws Exception {

		collection.add(object);

		return collection;
	}

	public static <E> Collection<E> reject(
			Collection<E> collection, String iteratorName, String expression)
			throws Exception {

		Collection<E> selected = select(collection, iteratorName, expression);

		collection.removeAll(selected);

		return collection;
	}

	public static <E> Collection<E> select(
			Collection<E> collection, String iteratorName, String expression)
		throws Exception {

		if (collection.isEmpty()) {
			return collection;
		}

		Collection<E> result = _createBasedOnType(collection);

		for (Iterator<E> it = collection.iterator(); it.hasNext();) {
			E object = it.next();

			if (EvaluatorUtil.evaluate(object, iteratorName, expression)) {
				result.add(object);
			}
		}

		return result;
	}

	private static <E> Collection<E> _createBasedOnType(
		Collection<E> collection) {

		if (collection instanceof Bag) {
			return new HashBag<E>();
		}
		else if (collection instanceof Set) {
			return new HashSet<E>();
		}
		else {
			return new TreeList<E>();
		}
	}

}