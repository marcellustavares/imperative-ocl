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
package org.orcas.iocl.expressions.util;

import org.eclipse.emf.ecore.EObject;
import org.orcas.iocl.expressions.imperativeocl.AltExp;
import org.orcas.iocl.expressions.imperativeocl.AssignExp;
import org.orcas.iocl.expressions.imperativeocl.BlockExp;
import org.orcas.iocl.expressions.imperativeocl.BooleanLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.BreakExp;
import org.orcas.iocl.expressions.imperativeocl.CatchExp;
import org.orcas.iocl.expressions.imperativeocl.CollectionItem;
import org.orcas.iocl.expressions.imperativeocl.CollectionLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ComputeExp;
import org.orcas.iocl.expressions.imperativeocl.ContinueExp;
import org.orcas.iocl.expressions.imperativeocl.ForExp;
import org.orcas.iocl.expressions.imperativeocl.IfExp;
import org.orcas.iocl.expressions.imperativeocl.IntegerLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.IterateExp;
import org.orcas.iocl.expressions.imperativeocl.IteratorExp;
import org.orcas.iocl.expressions.imperativeocl.OperationCallExp;
import org.orcas.iocl.expressions.imperativeocl.PropertyCallExp;
import org.orcas.iocl.expressions.imperativeocl.RaiseExp;
import org.orcas.iocl.expressions.imperativeocl.RealLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.ReturnExp;
import org.orcas.iocl.expressions.imperativeocl.StringLiteralExp;
import org.orcas.iocl.expressions.imperativeocl.SwitchExp;
import org.orcas.iocl.expressions.imperativeocl.TryExp;
import org.orcas.iocl.expressions.imperativeocl.TypeExp;
import org.orcas.iocl.expressions.imperativeocl.Variable;
import org.orcas.iocl.expressions.imperativeocl.VariableExp;
import org.orcas.iocl.expressions.imperativeocl.VariableInitExp;
import org.orcas.iocl.expressions.imperativeocl.WhileExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.orcas.iocl.expressions.util.UtilPackage#getVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Visitor<T> extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitAltExp(AltExp altExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitAssignExp(AssignExp assignExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitBlockExp(BlockExp blockExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitBreakExp(BreakExp breakExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitCatchExp(CatchExp catchExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitCollectionLiteralExp(CollectionLiteralExp collectionLiteralExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitCollectionItem(CollectionItem collectionItem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitComputeExp(ComputeExp computeExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitContinueExp(ContinueExp continueExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitForExp(ForExp forExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitIterateExp(IterateExp iterateExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitIteratorExp(IteratorExp iteratorExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitOperationCallExp(OperationCallExp operationCallExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitPropertyCallExp(PropertyCallExp propertyCallExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitRaiseExp(RaiseExp raiseExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitRealLiteralExp(RealLiteralExp realLiteralExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitReturnExp(ReturnExp returnExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitStringLiteralExp(StringLiteralExp stringLiteralExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitSwitchExp(SwitchExp switchExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitTryExp(TryExp tryExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitTypeExp(TypeExp typeExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitVariableExp(VariableExp variableExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitVariable(Variable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T visitWhileExp(WhileExp whileExp);
} // Visitor
