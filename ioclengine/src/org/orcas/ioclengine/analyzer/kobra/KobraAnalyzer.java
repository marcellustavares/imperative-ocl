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

package org.orcas.ioclengine.analyzer.kobra;

import KobrA2.SUM.Constraint.Structural.Classifier;
import KobrA2.SUM.Constraint.Structural.EnumerationLiteral;
import KobrA2.SUM.Constraint.Structural.Operation;
import KobrA2.SUM.Constraint.Structural.Parameter;
import KobrA2.SUM.Constraint.Structural.Property;

import org.orcas.ioclengine.analyzer.IOCLAnalyzer;
import org.orcas.ioclengine.analyzer.TypeHelper;


public class KobraAnalyzer extends
	IOCLAnalyzer<
	Classifier, Operation, Property, Parameter, EnumerationLiteral> {

	public TypeHelper<
		Classifier, Operation, Property, Parameter,
		EnumerationLiteral> getTypeHelper() {

		return _typeHelper;
	}

	private KobraTypeHelper _typeHelper = new KobraTypeHelper();

}