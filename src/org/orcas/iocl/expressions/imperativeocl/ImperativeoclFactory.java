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
package org.orcas.iocl.expressions.imperativeocl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclPackage
 * @generated
 */
public interface ImperativeoclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativeoclFactory eINSTANCE = org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assign Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign Exp</em>'.
	 * @generated
	 */
	AssignExp createAssignExp();

	/**
	 * Returns a new object of class '<em>Block Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Exp</em>'.
	 * @generated
	 */
	BlockExp createBlockExp();

	/**
	 * Returns a new object of class '<em>Switch Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Exp</em>'.
	 * @generated
	 */
	SwitchExp createSwitchExp();

	/**
	 * Returns a new object of class '<em>Variable Init Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Init Exp</em>'.
	 * @generated
	 */
	VariableInitExp createVariableInitExp();

	/**
	 * Returns a new object of class '<em>While Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Exp</em>'.
	 * @generated
	 */
	WhileExp createWhileExp();

	/**
	 * Returns a new object of class '<em>Compute Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compute Exp</em>'.
	 * @generated
	 */
	ComputeExp createComputeExp();

	/**
	 * Returns a new object of class '<em>Alt Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Exp</em>'.
	 * @generated
	 */
	AltExp createAltExp();

	/**
	 * Returns a new object of class '<em>Unlink Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlink Exp</em>'.
	 * @generated
	 */
	UnlinkExp createUnlinkExp();

	/**
	 * Returns a new object of class '<em>Return Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Exp</em>'.
	 * @generated
	 */
	ReturnExp createReturnExp();

	/**
	 * Returns a new object of class '<em>Break Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Exp</em>'.
	 * @generated
	 */
	BreakExp createBreakExp();

	/**
	 * Returns a new object of class '<em>Try Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Exp</em>'.
	 * @generated
	 */
	TryExp createTryExp();

	/**
	 * Returns a new object of class '<em>Raise Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Exp</em>'.
	 * @generated
	 */
	RaiseExp createRaiseExp();

	/**
	 * Returns a new object of class '<em>Continue Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Exp</em>'.
	 * @generated
	 */
	ContinueExp createContinueExp();

	/**
	 * Returns a new object of class '<em>For Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Exp</em>'.
	 * @generated
	 */
	ForExp createForExp();

	/**
	 * Returns a new object of class '<em>Typedef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typedef</em>'.
	 * @generated
	 */
	Typedef createTypedef();

	/**
	 * Returns a new object of class '<em>Instantiation Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Exp</em>'.
	 * @generated
	 */
	InstantiationExp createInstantiationExp();

	/**
	 * Returns a new object of class '<em>Dictionary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Type</em>'.
	 * @generated
	 */
	DictionaryType createDictionaryType();

	/**
	 * Returns a new object of class '<em>Dict Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dict Literal Exp</em>'.
	 * @generated
	 */
	DictLiteralExp createDictLiteralExp();

	/**
	 * Returns a new object of class '<em>Dict Literal Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dict Literal Part</em>'.
	 * @generated
	 */
	DictLiteralPart createDictLiteralPart();

	/**
	 * Returns a new object of class '<em>Template Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Parameter Type</em>'.
	 * @generated
	 */
	TemplateParameterType createTemplateParameterType();

	/**
	 * Returns a new object of class '<em>Log Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Exp</em>'.
	 * @generated
	 */
	LogExp createLogExp();

	/**
	 * Returns a new object of class '<em>Assert Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Exp</em>'.
	 * @generated
	 */
	AssertExp createAssertExp();

	/**
	 * Returns a new object of class '<em>Imperative Iterate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imperative Iterate Exp</em>'.
	 * @generated
	 */
	ImperativeIterateExp createImperativeIterateExp();

	/**
	 * Returns a new object of class '<em>Unpack Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unpack Exp</em>'.
	 * @generated
	 */
	UnpackExp createUnpackExp();

	/**
	 * Returns a new object of class '<em>Ordered Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Tuple Type</em>'.
	 * @generated
	 */
	OrderedTupleType createOrderedTupleType();

	/**
	 * Returns a new object of class '<em>Ordered Tuple Literal Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Tuple Literal Exp</em>'.
	 * @generated
	 */
	OrderedTupleLiteralExp createOrderedTupleLiteralExp();

	/**
	 * Returns a new object of class '<em>Ordered Tuple Literal Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Tuple Literal Part</em>'.
	 * @generated
	 */
	OrderedTupleLiteralPart createOrderedTupleLiteralPart();

	/**
	 * Returns a new object of class '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Type</em>'.
	 * @generated
	 */
	ListType createListType();

	/**
	 * Returns a new object of class '<em>Catch Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Exp</em>'.
	 * @generated
	 */
	CatchExp createCatchExp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImperativeoclPackage getImperativeoclPackage();

} //ImperativeoclFactory
