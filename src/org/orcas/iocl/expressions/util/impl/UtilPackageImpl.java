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
package org.orcas.iocl.expressions.util.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.orcas.iocl.expressions.emof.EmofPackage;

import org.orcas.iocl.expressions.emof.impl.EmofPackageImpl;

import org.orcas.iocl.expressions.imperativeocl.ImperativeOclPackage;

import org.orcas.iocl.expressions.imperativeocl.impl.ImperativeOclPackageImpl;

import org.orcas.iocl.expressions.util.UtilFactory;
import org.orcas.iocl.expressions.util.UtilPackage;
import org.orcas.iocl.expressions.util.Visitable;
import org.orcas.iocl.expressions.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.orcas.iocl.expressions.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EmofPackageImpl theEmofPackage = (EmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) instanceof EmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) : EmofPackage.eINSTANCE);
		ImperativeOclPackageImpl theImperativeOclPackage = (ImperativeOclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativeOclPackage.eNS_URI) instanceof ImperativeOclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativeOclPackage.eNS_URI) : ImperativeOclPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theEmofPackage.createPackageContents();
		theImperativeOclPackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theEmofPackage.initializePackageContents();
		theImperativeOclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitable() {
		return visitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitor() {
		return visitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		visitableEClass = createEClass(VISITABLE);

		visitorEClass = createEClass(VISITOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ImperativeOclPackage theImperativeOclPackage = (ImperativeOclPackage)EPackage.Registry.INSTANCE.getEPackage(ImperativeOclPackage.eNS_URI);

		// Create type parameters
		ETypeParameter visitorEClass_T = addETypeParameter(visitorEClass, "T"); //$NON-NLS-1$

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(visitableEClass, Visitable.class, "Visitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		EOperation op = addEOperation(visitableEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		ETypeParameter t1 = addETypeParameter(op, "T"); //$NON-NLS-1$
		ETypeParameter t2 = addETypeParameter(op, "V"); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(this.getVisitor());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		t2.getEBounds().add(g1);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "v", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(visitorEClass, Visitor.class, "Visitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(visitorEClass, null, "visitAssignExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getAssignExp(), "assignExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitBlockExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getBlockExp(), "blockExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitBooleanLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getBooleanLiteralExp(), "booleanLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitBreakExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getBreakExp(), "breakExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitCollectionLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getCollectionLiteralExp(), "collectionLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitCollectionItem", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getCollectionItem(), "collectionItem", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitComputeExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getComputeExp(), "computeExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitContinueExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getContinueExp(), "continueExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitForExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getForExp(), "forExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitIfExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getIfExp(), "ifExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitIntegerLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getIntegerLiteralExp(), "integerLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitIterateExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getIterateExp(), "iterateExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitIteratorExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getIteratorExp(), "iteratorExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitOperationCallExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getOperationCallExp(), "operationCallExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitPropertyCallExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getPropertyCallExp(), "propertyCallExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitRaiseExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getRaiseExp(), "raiseExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitRealLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getRealLiteralExp(), "realLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitReturnExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getReturnExp(), "returnExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitStringLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getStringLiteralExp(), "stringLiteralExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitTryExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getTryExp(), "tryExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitTypeExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getTypeExp(), "typeExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitVariableExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getVariableExp(), "variableExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitVariableInitExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getVariableInitExp(), "variableInitExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		op = addEOperation(visitorEClass, null, "visitWhileExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theImperativeOclPackage.getWhileExp(), "whileExp", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(visitorEClass_T);
		initEOperation(op, g1);

		// Create resource
		createResource(eNS_URI);
	}

} //UtilPackageImpl
