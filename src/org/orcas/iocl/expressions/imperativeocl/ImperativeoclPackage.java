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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.orcas.iocl.expressions.emof.EmofPackage;

import org.orcas.iocl.expressions.ocl.OclPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeoclFactory
 * @model kind="package"
 * @generated
 */
public interface ImperativeoclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imperativeocl"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.orcas.org/spec/iocl/1.0/imperativeocl"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imperativeocl"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativeoclPackage eINSTANCE = org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeExpressionImpl <em>Imperative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeExpressionImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeExpression()
	 * @generated
	 */
	int IMPERATIVE_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__TAG = OclPackage.OCL_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__OWNED_COMMENT = OclPackage.OCL_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__NAME = OclPackage.OCL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__TYPE = OclPackage.OCL_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Imperative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION_FEATURE_COUNT = OclPackage.OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl <em>Assign Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAssignExp()
	 * @generated
	 */
	int ASSIGN_EXP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__LEFT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__DEFAULT_VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__IS_RESET = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assign Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.BlockExpImpl <em>Block Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.BlockExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getBlockExp()
	 * @generated
	 */
	int BLOCK_EXP = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.SwitchExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getSwitchExp()
	 * @generated
	 */
	int SWITCH_EXP = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__TAG = OclPackage.CALL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__OWNED_COMMENT = OclPackage.CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__NAME = OclPackage.CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__TYPE = OclPackage.CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__SOURCE = OclPackage.CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Alternative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__ALTERNATIVE_PART = OclPackage.CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__ELSE_PART = OclPackage.CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_FEATURE_COUNT = OclPackage.CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl <em>Variable Init Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getVariableInitExp()
	 * @generated
	 */
	int VARIABLE_INIT_EXP = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__REFERRED_VARIABLE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>With Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__WITH_RESULT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Init Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.WhileExpImpl <em>While Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.WhileExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getWhileExp()
	 * @generated
	 */
	int WHILE_EXP = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__CONDITION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ComputeExpImpl <em>Compute Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ComputeExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getComputeExp()
	 * @generated
	 */
	int COMPUTE_EXP = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Returned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__RETURNED_ELEMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compute Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AltExpImpl <em>Alt Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.AltExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAltExp()
	 * @generated
	 */
	int ALT_EXP = 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__CONDITION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alt Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.UnlinkExpImpl <em>Unlink Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.UnlinkExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getUnlinkExp()
	 * @generated
	 */
	int UNLINK_EXP = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TARGET = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__ITEM = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unlink Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ReturnExpImpl <em>Return Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ReturnExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getReturnExp()
	 * @generated
	 */
	int RETURN_EXP = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.BreakExpImpl <em>Break Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.BreakExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getBreakExp()
	 * @generated
	 */
	int BREAK_EXP = 9;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Break Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TryExpImpl <em>Try Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.TryExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTryExp()
	 * @generated
	 */
	int TRY_EXP = 10;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Try Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TRY_BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__CATCH_CLAUSE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Try Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.RaiseExpImpl <em>Raise Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.RaiseExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getRaiseExp()
	 * @generated
	 */
	int RAISE_EXP = 11;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__EXCEPTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__ARGUMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raise Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ContinueExpImpl <em>Continue Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ContinueExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getContinueExp()
	 * @generated
	 */
	int CONTINUE_EXP = 12;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Continue Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeLoopExpImpl <em>Imperative Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeLoopExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeLoopExp()
	 * @generated
	 */
	int IMPERATIVE_LOOP_EXP = 22;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__TAG = OclPackage.LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__OWNED_COMMENT = OclPackage.LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__NAME = OclPackage.LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__TYPE = OclPackage.LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__SOURCE = OclPackage.LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__BODY = OclPackage.LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__ITERATOR = OclPackage.LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__CONDITION = OclPackage.LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_FEATURE_COUNT = OclPackage.LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ForExpImpl <em>For Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ForExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getForExp()
	 * @generated
	 */
	int FOR_EXP = 13;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__TAG = IMPERATIVE_LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__OWNED_COMMENT = IMPERATIVE_LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__NAME = IMPERATIVE_LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__TYPE = IMPERATIVE_LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__SOURCE = IMPERATIVE_LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__BODY = IMPERATIVE_LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__ITERATOR = IMPERATIVE_LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__CONDITION = IMPERATIVE_LOOP_EXP__CONDITION;

	/**
	 * The number of structural features of the '<em>For Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TypedefImpl <em>Typedef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.TypedefImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTypedef()
	 * @generated
	 */
	int TYPEDEF = 14;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__TAG = EmofPackage.CLASS__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__BASE = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__CONDITION = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typedef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl <em>Instantiation Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getInstantiationExp()
	 * @generated
	 */
	int INSTANTIATION_EXP = 15;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__INSTANTIATED_CLASS = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__EXTENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__ARGUMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instantiation Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictionaryTypeImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__TAG = OclPackage.COLLECTION_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__OWNED_COMMENT = OclPackage.COLLECTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__NAME = OclPackage.COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__PACKAGE = OclPackage.COLLECTION_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__ELEMENT_TYPE = OclPackage.COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__KEY_TYPE = OclPackage.COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dictionary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = OclPackage.COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralExpImpl <em>Dict Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralExp()
	 * @generated
	 */
	int DICT_LITERAL_EXP = 17;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__TAG = OclPackage.LITERAL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__OWNED_COMMENT = OclPackage.LITERAL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__NAME = OclPackage.LITERAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__TYPE = OclPackage.LITERAL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__PART = OclPackage.LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dict Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_FEATURE_COUNT = OclPackage.LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralPartImpl <em>Dict Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralPartImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralPart()
	 * @generated
	 */
	int DICT_LITERAL_PART = 18;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__KEY = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dict Literal Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TemplateParameterTypeImpl <em>Template Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.TemplateParameterTypeImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTemplateParameterType()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__TAG = EmofPackage.TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT = EmofPackage.TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__NAME = EmofPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__PACKAGE = EmofPackage.TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__SPECIFICATION = EmofPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE_FEATURE_COUNT = EmofPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.LogExpImpl <em>Log Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.LogExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getLogExp()
	 * @generated
	 */
	int LOG_EXP = 20;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__TAG = OclPackage.OPERATION_CALL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__OWNED_COMMENT = OclPackage.OPERATION_CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__NAME = OclPackage.OPERATION_CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__TYPE = OclPackage.OPERATION_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__SOURCE = OclPackage.OPERATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__ARGUMENT = OclPackage.OPERATION_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__REFERRED_OPERATION = OclPackage.OPERATION_CALL_EXP__REFERRED_OPERATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__CONDITION = OclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_FEATURE_COUNT = OclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AssertExpImpl <em>Assert Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.AssertExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAssertExp()
	 * @generated
	 */
	int ASSERT_EXP = 21;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__SEVERITY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__LOG = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__ASSERTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assert Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeIterateExpImpl <em>Imperative Iterate Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeIterateExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeIterateExp()
	 * @generated
	 */
	int IMPERATIVE_ITERATE_EXP = 23;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TAG = IMPERATIVE_LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__OWNED_COMMENT = IMPERATIVE_LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__NAME = IMPERATIVE_LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TYPE = IMPERATIVE_LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__SOURCE = IMPERATIVE_LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__BODY = IMPERATIVE_LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__ITERATOR = IMPERATIVE_LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__CONDITION = IMPERATIVE_LOOP_EXP__CONDITION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TARGET = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.UnpackExpImpl <em>Unpack Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.UnpackExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getUnpackExp()
	 * @generated
	 */
	int UNPACK_EXP = 25;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TARGET_VARIABLE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__SOURCE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unpack Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleTypeImpl <em>Ordered Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleTypeImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleType()
	 * @generated
	 */
	int ORDERED_TUPLE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__TAG = EmofPackage.CLASS__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__ELEMENT_TYPE = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralExpImpl <em>Ordered Tuple Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralExp()
	 * @generated
	 */
	int ORDERED_TUPLE_LITERAL_EXP = 27;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__TAG = OclPackage.LITERAL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__OWNED_COMMENT = OclPackage.LITERAL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__NAME = OclPackage.LITERAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__TYPE = OclPackage.LITERAL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__PART = OclPackage.LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP_FEATURE_COUNT = OclPackage.LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralPartImpl <em>Ordered Tuple Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralPartImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralPart()
	 * @generated
	 */
	int ORDERED_TUPLE_LITERAL_PART = 28;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Literal Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ListTypeImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__TAG = OclPackage.COLLECTION_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__OWNED_COMMENT = OclPackage.COLLECTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = OclPackage.COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__PACKAGE = OclPackage.COLLECTION_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ELEMENT_TYPE = OclPackage.COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = OclPackage.COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.CatchExpImpl <em>Catch Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.CatchExpImpl
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getCatchExp()
	 * @generated
	 */
	int CATCH_EXP = 30;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__EXCEPTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.orcas.iocl.expressions.imperativeocl.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orcas.iocl.expressions.imperativeocl.SeverityKind
	 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 31;


	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.AssignExp <em>Assign Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssignExp
	 * @generated
	 */
	EClass getAssignExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.AssignExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssignExp#getValue()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AssignExp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssignExp#getLeft()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssignExp#getDefaultValue()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.orcas.iocl.expressions.imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reset</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssignExp#getIsReset()
	 * @see #getAssignExp()
	 * @generated
	 */
	EAttribute getAssignExp_IsReset();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.BlockExp <em>Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.BlockExp
	 * @generated
	 */
	EClass getBlockExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.BlockExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.BlockExp#getBody()
	 * @see #getBlockExp()
	 * @generated
	 */
	EReference getBlockExp_Body();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.SwitchExp
	 * @generated
	 */
	EClass getSwitchExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp#getAlternativePart <em>Alternative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.SwitchExp#getAlternativePart()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_AlternativePart();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.SwitchExp#getElsePart()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_ElsePart();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.VariableInitExp <em>Variable Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Init Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.VariableInitExp
	 * @generated
	 */
	EClass getVariableInitExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.VariableInitExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referred Variable</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.VariableInitExp#getReferredVariable()
	 * @see #getVariableInitExp()
	 * @generated
	 */
	EReference getVariableInitExp_ReferredVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.orcas.iocl.expressions.imperativeocl.VariableInitExp#getWithResult <em>With Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Result</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.VariableInitExp#getWithResult()
	 * @see #getVariableInitExp()
	 * @generated
	 */
	EAttribute getVariableInitExp_WithResult();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.WhileExp
	 * @generated
	 */
	EClass getWhileExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.WhileExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.WhileExp#getCondition()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.WhileExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.WhileExp#getBody()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_Body();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ComputeExp <em>Compute Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ComputeExp
	 * @generated
	 */
	EClass getComputeExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.ComputeExp#getReturnedElement <em>Returned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returned Element</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ComputeExp#getReturnedElement()
	 * @see #getComputeExp()
	 * @generated
	 */
	EReference getComputeExp_ReturnedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.ComputeExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ComputeExp#getBody()
	 * @see #getComputeExp()
	 * @generated
	 */
	EReference getComputeExp_Body();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.AltExp <em>Alt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AltExp
	 * @generated
	 */
	EClass getAltExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AltExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AltExp#getCondition()
	 * @see #getAltExp()
	 * @generated
	 */
	EReference getAltExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AltExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AltExp#getBody()
	 * @see #getAltExp()
	 * @generated
	 */
	EReference getAltExp_Body();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp <em>Unlink Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlink Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnlinkExp
	 * @generated
	 */
	EClass getUnlinkExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getTarget()
	 * @see #getUnlinkExp()
	 * @generated
	 */
	EReference getUnlinkExp_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnlinkExp#getItem()
	 * @see #getUnlinkExp()
	 * @generated
	 */
	EReference getUnlinkExp_Item();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ReturnExp
	 * @generated
	 */
	EClass getReturnExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.ReturnExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ReturnExp#getValue()
	 * @see #getReturnExp()
	 * @generated
	 */
	EReference getReturnExp_Value();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.BreakExp <em>Break Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.BreakExp
	 * @generated
	 */
	EClass getBreakExp();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.TryExp <em>Try Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.TryExp
	 * @generated
	 */
	EClass getTryExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.TryExp#getTryBody <em>Try Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Try Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.TryExp#getTryBody()
	 * @see #getTryExp()
	 * @generated
	 */
	EReference getTryExp_TryBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.TryExp#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Clause</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.TryExp#getCatchClause()
	 * @see #getTryExp()
	 * @generated
	 */
	EReference getTryExp_CatchClause();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.RaiseExp <em>Raise Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.RaiseExp
	 * @generated
	 */
	EClass getRaiseExp();

	/**
	 * Returns the meta object for the reference '{@link org.orcas.iocl.expressions.imperativeocl.RaiseExp#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.RaiseExp#getException()
	 * @see #getRaiseExp()
	 * @generated
	 */
	EReference getRaiseExp_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.RaiseExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.RaiseExp#getArgument()
	 * @see #getRaiseExp()
	 * @generated
	 */
	EReference getRaiseExp_Argument();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ContinueExp <em>Continue Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ContinueExp
	 * @generated
	 */
	EClass getContinueExp();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ForExp
	 * @generated
	 */
	EClass getForExp();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.Typedef
	 * @generated
	 */
	EClass getTypedef();

	/**
	 * Returns the meta object for the reference '{@link org.orcas.iocl.expressions.imperativeocl.Typedef#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.Typedef#getBase()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Base();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.Typedef#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.Typedef#getCondition()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Condition();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.InstantiationExp
	 * @generated
	 */
	EClass getInstantiationExp();

	/**
	 * Returns the meta object for the reference '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Class</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getInstantiatedClass()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_InstantiatedClass();

	/**
	 * Returns the meta object for the reference '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getExtent()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_Extent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.InstantiationExp#getArgument()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_Argument();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the reference '{@link org.orcas.iocl.expressions.imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictionaryType#getKeyType()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_KeyType();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.DictLiteralExp <em>Dict Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictLiteralExp
	 * @generated
	 */
	EClass getDictLiteralExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.DictLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictLiteralExp#getPart()
	 * @see #getDictLiteralExp()
	 * @generated
	 */
	EReference getDictLiteralExp_Part();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.DictLiteralPart <em>Dict Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictLiteralPart
	 * @generated
	 */
	EClass getDictLiteralPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.DictLiteralPart#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictLiteralPart#getKey()
	 * @see #getDictLiteralPart()
	 * @generated
	 */
	EReference getDictLiteralPart_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.DictLiteralPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.DictLiteralPart#getValue()
	 * @see #getDictLiteralPart()
	 * @generated
	 */
	EReference getDictLiteralPart_Value();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.TemplateParameterType <em>Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.TemplateParameterType
	 * @generated
	 */
	EClass getTemplateParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.orcas.iocl.expressions.imperativeocl.TemplateParameterType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.TemplateParameterType#getSpecification()
	 * @see #getTemplateParameterType()
	 * @generated
	 */
	EAttribute getTemplateParameterType_Specification();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.LogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.LogExp
	 * @generated
	 */
	EClass getLogExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.LogExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.LogExp#getCondition()
	 * @see #getLogExp()
	 * @generated
	 */
	EReference getLogExp_Condition();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp <em>Assert Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssertExp
	 * @generated
	 */
	EClass getAssertExp();

	/**
	 * Returns the meta object for the attribute '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssertExp#getSeverity()
	 * @see #getAssertExp()
	 * @generated
	 */
	EAttribute getAssertExp_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssertExp#getLog()
	 * @see #getAssertExp()
	 * @generated
	 */
	EReference getAssertExp_Log();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.AssertExp#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.AssertExp#getAssertion()
	 * @see #getAssertExp()
	 * @generated
	 */
	EReference getAssertExp_Assertion();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ImperativeLoopExp <em>Imperative Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Loop Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeLoopExp
	 * @generated
	 */
	EClass getImperativeLoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.ImperativeLoopExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeLoopExp#getCondition()
	 * @see #getImperativeLoopExp()
	 * @generated
	 */
	EReference getImperativeLoopExp_Condition();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ImperativeIterateExp <em>Imperative Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Iterate Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeIterateExp
	 * @generated
	 */
	EClass getImperativeIterateExp();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.ImperativeIterateExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeIterateExp#getTarget()
	 * @see #getImperativeIterateExp()
	 * @generated
	 */
	EReference getImperativeIterateExp_Target();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Expression</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ImperativeExpression
	 * @generated
	 */
	EClass getImperativeExpression();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.UnpackExp <em>Unpack Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpack Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnpackExp
	 * @generated
	 */
	EClass getUnpackExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.UnpackExp#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Variable</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnpackExp#getTargetVariable()
	 * @see #getUnpackExp()
	 * @generated
	 */
	EReference getUnpackExp_TargetVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.UnpackExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.UnpackExp#getSource()
	 * @see #getUnpackExp()
	 * @generated
	 */
	EReference getUnpackExp_Source();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleType <em>Ordered Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleType
	 * @generated
	 */
	EClass getOrderedTupleType();

	/**
	 * Returns the meta object for the reference list '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleType#getElementType()
	 * @see #getOrderedTupleType()
	 * @generated
	 */
	EReference getOrderedTupleType_ElementType();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralExp <em>Ordered Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Literal Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralExp
	 * @generated
	 */
	EClass getOrderedTupleLiteralExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralExp#getPart()
	 * @see #getOrderedTupleLiteralExp()
	 * @generated
	 */
	EReference getOrderedTupleLiteralExp_Part();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralPart <em>Ordered Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Literal Part</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralPart
	 * @generated
	 */
	EClass getOrderedTupleLiteralPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.OrderedTupleLiteralPart#getValue()
	 * @see #getOrderedTupleLiteralPart()
	 * @generated
	 */
	EReference getOrderedTupleLiteralPart_Value();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for class '{@link org.orcas.iocl.expressions.imperativeocl.CatchExp <em>Catch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Exp</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.CatchExp
	 * @generated
	 */
	EClass getCatchExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.orcas.iocl.expressions.imperativeocl.CatchExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.CatchExp#getBody()
	 * @see #getCatchExp()
	 * @generated
	 */
	EReference getCatchExp_Body();

	/**
	 * Returns the meta object for the reference list '{@link org.orcas.iocl.expressions.imperativeocl.CatchExp#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.CatchExp#getException()
	 * @see #getCatchExp()
	 * @generated
	 */
	EReference getCatchExp_Exception();

	/**
	 * Returns the meta object for enum '{@link org.orcas.iocl.expressions.imperativeocl.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see org.orcas.iocl.expressions.imperativeocl.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImperativeoclFactory getImperativeoclFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl <em>Assign Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.AssignExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAssignExp()
		 * @generated
		 */
		EClass ASSIGN_EXP = eINSTANCE.getAssignExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__VALUE = eINSTANCE.getAssignExp_Value();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__LEFT = eINSTANCE.getAssignExp_Left();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__DEFAULT_VALUE = eINSTANCE.getAssignExp_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_EXP__IS_RESET = eINSTANCE.getAssignExp_IsReset();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.BlockExpImpl <em>Block Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.BlockExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getBlockExp()
		 * @generated
		 */
		EClass BLOCK_EXP = eINSTANCE.getBlockExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXP__BODY = eINSTANCE.getBlockExp_Body();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.SwitchExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getSwitchExp()
		 * @generated
		 */
		EClass SWITCH_EXP = eINSTANCE.getSwitchExp();

		/**
		 * The meta object literal for the '<em><b>Alternative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__ALTERNATIVE_PART = eINSTANCE.getSwitchExp_AlternativePart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__ELSE_PART = eINSTANCE.getSwitchExp_ElsePart();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl <em>Variable Init Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.VariableInitExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getVariableInitExp()
		 * @generated
		 */
		EClass VARIABLE_INIT_EXP = eINSTANCE.getVariableInitExp();

		/**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INIT_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableInitExp_ReferredVariable();

		/**
		 * The meta object literal for the '<em><b>With Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_INIT_EXP__WITH_RESULT = eINSTANCE.getVariableInitExp_WithResult();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.WhileExpImpl <em>While Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.WhileExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getWhileExp()
		 * @generated
		 */
		EClass WHILE_EXP = eINSTANCE.getWhileExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__CONDITION = eINSTANCE.getWhileExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__BODY = eINSTANCE.getWhileExp_Body();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ComputeExpImpl <em>Compute Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ComputeExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getComputeExp()
		 * @generated
		 */
		EClass COMPUTE_EXP = eINSTANCE.getComputeExp();

		/**
		 * The meta object literal for the '<em><b>Returned Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_EXP__RETURNED_ELEMENT = eINSTANCE.getComputeExp_ReturnedElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_EXP__BODY = eINSTANCE.getComputeExp_Body();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AltExpImpl <em>Alt Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.AltExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAltExp()
		 * @generated
		 */
		EClass ALT_EXP = eINSTANCE.getAltExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_EXP__CONDITION = eINSTANCE.getAltExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_EXP__BODY = eINSTANCE.getAltExp_Body();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.UnlinkExpImpl <em>Unlink Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.UnlinkExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getUnlinkExp()
		 * @generated
		 */
		EClass UNLINK_EXP = eINSTANCE.getUnlinkExp();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINK_EXP__TARGET = eINSTANCE.getUnlinkExp_Target();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINK_EXP__ITEM = eINSTANCE.getUnlinkExp_Item();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ReturnExpImpl <em>Return Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ReturnExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getReturnExp()
		 * @generated
		 */
		EClass RETURN_EXP = eINSTANCE.getReturnExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_EXP__VALUE = eINSTANCE.getReturnExp_Value();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.BreakExpImpl <em>Break Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.BreakExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getBreakExp()
		 * @generated
		 */
		EClass BREAK_EXP = eINSTANCE.getBreakExp();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TryExpImpl <em>Try Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.TryExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTryExp()
		 * @generated
		 */
		EClass TRY_EXP = eINSTANCE.getTryExp();

		/**
		 * The meta object literal for the '<em><b>Try Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_EXP__TRY_BODY = eINSTANCE.getTryExp_TryBody();

		/**
		 * The meta object literal for the '<em><b>Catch Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_EXP__CATCH_CLAUSE = eINSTANCE.getTryExp_CatchClause();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.RaiseExpImpl <em>Raise Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.RaiseExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getRaiseExp()
		 * @generated
		 */
		EClass RAISE_EXP = eINSTANCE.getRaiseExp();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP__EXCEPTION = eINSTANCE.getRaiseExp_Exception();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP__ARGUMENT = eINSTANCE.getRaiseExp_Argument();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ContinueExpImpl <em>Continue Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ContinueExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getContinueExp()
		 * @generated
		 */
		EClass CONTINUE_EXP = eINSTANCE.getContinueExp();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ForExpImpl <em>For Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ForExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getForExp()
		 * @generated
		 */
		EClass FOR_EXP = eINSTANCE.getForExp();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TypedefImpl <em>Typedef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.TypedefImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTypedef()
		 * @generated
		 */
		EClass TYPEDEF = eINSTANCE.getTypedef();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEF__BASE = eINSTANCE.getTypedef_Base();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEF__CONDITION = eINSTANCE.getTypedef_Condition();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl <em>Instantiation Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.InstantiationExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getInstantiationExp()
		 * @generated
		 */
		EClass INSTANTIATION_EXP = eINSTANCE.getInstantiationExp();

		/**
		 * The meta object literal for the '<em><b>Instantiated Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__INSTANTIATED_CLASS = eINSTANCE.getInstantiationExp_InstantiatedClass();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__EXTENT = eINSTANCE.getInstantiationExp_Extent();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__ARGUMENT = eINSTANCE.getInstantiationExp_Argument();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictionaryTypeImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictionaryType()
		 * @generated
		 */
		EClass DICTIONARY_TYPE = eINSTANCE.getDictionaryType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__KEY_TYPE = eINSTANCE.getDictionaryType_KeyType();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralExpImpl <em>Dict Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralExp()
		 * @generated
		 */
		EClass DICT_LITERAL_EXP = eINSTANCE.getDictLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_EXP__PART = eINSTANCE.getDictLiteralExp_Part();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralPartImpl <em>Dict Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.DictLiteralPartImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralPart()
		 * @generated
		 */
		EClass DICT_LITERAL_PART = eINSTANCE.getDictLiteralPart();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART__KEY = eINSTANCE.getDictLiteralPart_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART__VALUE = eINSTANCE.getDictLiteralPart_Value();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.TemplateParameterTypeImpl <em>Template Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.TemplateParameterTypeImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getTemplateParameterType()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_TYPE = eINSTANCE.getTemplateParameterType();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER_TYPE__SPECIFICATION = eINSTANCE.getTemplateParameterType_Specification();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.LogExpImpl <em>Log Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.LogExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getLogExp()
		 * @generated
		 */
		EClass LOG_EXP = eINSTANCE.getLogExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EXP__CONDITION = eINSTANCE.getLogExp_Condition();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.AssertExpImpl <em>Assert Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.AssertExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getAssertExp()
		 * @generated
		 */
		EClass ASSERT_EXP = eINSTANCE.getAssertExp();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_EXP__SEVERITY = eINSTANCE.getAssertExp_Severity();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP__LOG = eINSTANCE.getAssertExp_Log();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP__ASSERTION = eINSTANCE.getAssertExp_Assertion();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeLoopExpImpl <em>Imperative Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeLoopExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeLoopExp()
		 * @generated
		 */
		EClass IMPERATIVE_LOOP_EXP = eINSTANCE.getImperativeLoopExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP__CONDITION = eINSTANCE.getImperativeLoopExp_Condition();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeIterateExpImpl <em>Imperative Iterate Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeIterateExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeIterateExp()
		 * @generated
		 */
		EClass IMPERATIVE_ITERATE_EXP = eINSTANCE.getImperativeIterateExp();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_ITERATE_EXP__TARGET = eINSTANCE.getImperativeIterateExp_Target();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ImperativeExpressionImpl <em>Imperative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeExpressionImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getImperativeExpression()
		 * @generated
		 */
		EClass IMPERATIVE_EXPRESSION = eINSTANCE.getImperativeExpression();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.UnpackExpImpl <em>Unpack Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.UnpackExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getUnpackExp()
		 * @generated
		 */
		EClass UNPACK_EXP = eINSTANCE.getUnpackExp();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPACK_EXP__TARGET_VARIABLE = eINSTANCE.getUnpackExp_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPACK_EXP__SOURCE = eINSTANCE.getUnpackExp_Source();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleTypeImpl <em>Ordered Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleTypeImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleType()
		 * @generated
		 */
		EClass ORDERED_TUPLE_TYPE = eINSTANCE.getOrderedTupleType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_TYPE__ELEMENT_TYPE = eINSTANCE.getOrderedTupleType_ElementType();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralExpImpl <em>Ordered Tuple Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralExp()
		 * @generated
		 */
		EClass ORDERED_TUPLE_LITERAL_EXP = eINSTANCE.getOrderedTupleLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_LITERAL_EXP__PART = eINSTANCE.getOrderedTupleLiteralExp_Part();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralPartImpl <em>Ordered Tuple Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.OrderedTupleLiteralPartImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralPart()
		 * @generated
		 */
		EClass ORDERED_TUPLE_LITERAL_PART = eINSTANCE.getOrderedTupleLiteralPart();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_LITERAL_PART__VALUE = eINSTANCE.getOrderedTupleLiteralPart_Value();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ListTypeImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.impl.CatchExpImpl <em>Catch Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.CatchExpImpl
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getCatchExp()
		 * @generated
		 */
		EClass CATCH_EXP = eINSTANCE.getCatchExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EXP__BODY = eINSTANCE.getCatchExp_Body();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EXP__EXCEPTION = eINSTANCE.getCatchExp_Exception();

		/**
		 * The meta object literal for the '{@link org.orcas.iocl.expressions.imperativeocl.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orcas.iocl.expressions.imperativeocl.SeverityKind
		 * @see org.orcas.iocl.expressions.imperativeocl.impl.ImperativeoclPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

	}

} //ImperativeoclPackage
