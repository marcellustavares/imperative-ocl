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
package org.orcas.iocl.expression.imperativeocl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.orcas.iocl.expression.imperativeocl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeoclFactoryImpl extends EFactoryImpl implements ImperativeoclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImperativeoclFactory init() {
		try {
			ImperativeoclFactory theImperativeoclFactory = (ImperativeoclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.orcas.org/spec/iocl/1.0/imperativeocl"); 
			if (theImperativeoclFactory != null) {
				return theImperativeoclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImperativeoclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeoclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImperativeoclPackage.ASSIGN_EXP: return createAssignExp();
			case ImperativeoclPackage.BLOCK_EXP: return createBlockExp();
			case ImperativeoclPackage.SWITCH_EXP: return createSwitchExp();
			case ImperativeoclPackage.VARIABLE_INIT_EXP: return createVariableInitExp();
			case ImperativeoclPackage.WHILE_EXP: return createWhileExp();
			case ImperativeoclPackage.COMPUTE_EXP: return createComputeExp();
			case ImperativeoclPackage.ALT_EXP: return createAltExp();
			case ImperativeoclPackage.UNLINK_EXP: return createUnlinkExp();
			case ImperativeoclPackage.RETURN_EXP: return createReturnExp();
			case ImperativeoclPackage.BREAK_EXP: return createBreakExp();
			case ImperativeoclPackage.TRY_EXP: return createTryExp();
			case ImperativeoclPackage.RAISE_EXP: return createRaiseExp();
			case ImperativeoclPackage.CONTINUE_EXP: return createContinueExp();
			case ImperativeoclPackage.FOR_EXP: return createForExp();
			case ImperativeoclPackage.TYPEDEF: return createTypedef();
			case ImperativeoclPackage.INSTANTIATION_EXP: return createInstantiationExp();
			case ImperativeoclPackage.DICTIONARY_TYPE: return createDictionaryType();
			case ImperativeoclPackage.DICT_LITERAL_EXP: return createDictLiteralExp();
			case ImperativeoclPackage.DICT_LITERAL_PART: return createDictLiteralPart();
			case ImperativeoclPackage.TEMPLATE_PARAMETER_TYPE: return createTemplateParameterType();
			case ImperativeoclPackage.LOG_EXP: return createLogExp();
			case ImperativeoclPackage.ASSERT_EXP: return createAssertExp();
			case ImperativeoclPackage.IMPERATIVE_ITERATE_EXP: return createImperativeIterateExp();
			case ImperativeoclPackage.UNPACK_EXP: return createUnpackExp();
			case ImperativeoclPackage.ORDERED_TUPLE_TYPE: return createOrderedTupleType();
			case ImperativeoclPackage.ORDERED_TUPLE_LITERAL_EXP: return createOrderedTupleLiteralExp();
			case ImperativeoclPackage.ORDERED_TUPLE_LITERAL_PART: return createOrderedTupleLiteralPart();
			case ImperativeoclPackage.LIST_TYPE: return createListType();
			case ImperativeoclPackage.CATCH_EXP: return createCatchExp();
			case ImperativeoclPackage.BOOLEAN_LITERAL_EXP: return createBooleanLiteralExp();
			case ImperativeoclPackage.UNLIMITED_NATURAL_EXP: return createUnlimitedNaturalExp();
			case ImperativeoclPackage.IF_EXP: return createIfExp();
			case ImperativeoclPackage.LET_EXP: return createLetExp();
			case ImperativeoclPackage.VARIABLE: return createVariable();
			case ImperativeoclPackage.PROPERTY_CALL_EXP: return createPropertyCallExp();
			case ImperativeoclPackage.VARIABLE_EXP: return createVariableExp();
			case ImperativeoclPackage.TYPE_EXP: return createTypeExp();
			case ImperativeoclPackage.ITERATOR_EXP: return createIteratorExp();
			case ImperativeoclPackage.STRING_LITERAL_EXP: return createStringLiteralExp();
			case ImperativeoclPackage.INTEGER_LITERAL_EXP: return createIntegerLiteralExp();
			case ImperativeoclPackage.OPERATION_CALL_EXP: return createOperationCallExp();
			case ImperativeoclPackage.REAL_LITERAL_EXP: return createRealLiteralExp();
			case ImperativeoclPackage.ITERATE_EXP: return createIterateExp();
			case ImperativeoclPackage.COLLECTION_LITERAL_EXP: return createCollectionLiteralExp();
			case ImperativeoclPackage.COLLECTION_ITEM: return createCollectionItem();
			case ImperativeoclPackage.COLLECTION_RANGE: return createCollectionRange();
			case ImperativeoclPackage.TUPLE_LITERAL_EXP: return createTupleLiteralExp();
			case ImperativeoclPackage.NULL_LITERAL_EXP: return createNullLiteralExp();
			case ImperativeoclPackage.EXPRESSION_IN_OCL: return createExpressionInOcl();
			case ImperativeoclPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case ImperativeoclPackage.INVALID_LITERAL_EXP: return createInvalidLiteralExp();
			case ImperativeoclPackage.TUPLE_LITERAL_PART: return createTupleLiteralPart();
			case ImperativeoclPackage.BAG_TYPE: return createBagType();
			case ImperativeoclPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
			case ImperativeoclPackage.INVALID_TYPE: return createInvalidType();
			case ImperativeoclPackage.ORDERED_SET_TYPE: return createOrderedSetType();
			case ImperativeoclPackage.SEQUENCE_TYPE: return createSequenceType();
			case ImperativeoclPackage.SET_TYPE: return createSetType();
			case ImperativeoclPackage.TUPLE_TYPE: return createTupleType();
			case ImperativeoclPackage.VOID_TYPE: return createVoidType();
			case ImperativeoclPackage.ANY_TYPE: return createAnyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ImperativeoclPackage.SEVERITY_KIND:
				return createSeverityKindFromString(eDataType, initialValue);
			case ImperativeoclPackage.COLLECTION_KIND:
				return createCollectionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ImperativeoclPackage.SEVERITY_KIND:
				return convertSeverityKindToString(eDataType, instanceValue);
			case ImperativeoclPackage.COLLECTION_KIND:
				return convertCollectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignExp createAssignExp() {
		AssignExpImpl assignExp = new AssignExpImpl();
		return assignExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockExp createBlockExp() {
		BlockExpImpl blockExp = new BlockExpImpl();
		return blockExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchExp createSwitchExp() {
		SwitchExpImpl switchExp = new SwitchExpImpl();
		return switchExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInitExp createVariableInitExp() {
		VariableInitExpImpl variableInitExp = new VariableInitExpImpl();
		return variableInitExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileExp createWhileExp() {
		WhileExpImpl whileExp = new WhileExpImpl();
		return whileExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeExp createComputeExp() {
		ComputeExpImpl computeExp = new ComputeExpImpl();
		return computeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltExp createAltExp() {
		AltExpImpl altExp = new AltExpImpl();
		return altExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlinkExp createUnlinkExp() {
		UnlinkExpImpl unlinkExp = new UnlinkExpImpl();
		return unlinkExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnExp createReturnExp() {
		ReturnExpImpl returnExp = new ReturnExpImpl();
		return returnExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakExp createBreakExp() {
		BreakExpImpl breakExp = new BreakExpImpl();
		return breakExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryExp createTryExp() {
		TryExpImpl tryExp = new TryExpImpl();
		return tryExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExp createRaiseExp() {
		RaiseExpImpl raiseExp = new RaiseExpImpl();
		return raiseExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueExp createContinueExp() {
		ContinueExpImpl continueExp = new ContinueExpImpl();
		return continueExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForExp createForExp() {
		ForExpImpl forExp = new ForExpImpl();
		return forExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typedef createTypedef() {
		TypedefImpl typedef = new TypedefImpl();
		return typedef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationExp createInstantiationExp() {
		InstantiationExpImpl instantiationExp = new InstantiationExpImpl();
		return instantiationExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType createDictionaryType() {
		DictionaryTypeImpl dictionaryType = new DictionaryTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictLiteralExp createDictLiteralExp() {
		DictLiteralExpImpl dictLiteralExp = new DictLiteralExpImpl();
		return dictLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictLiteralPart createDictLiteralPart() {
		DictLiteralPartImpl dictLiteralPart = new DictLiteralPartImpl();
		return dictLiteralPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterType createTemplateParameterType() {
		TemplateParameterTypeImpl templateParameterType = new TemplateParameterTypeImpl();
		return templateParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogExp createLogExp() {
		LogExpImpl logExp = new LogExpImpl();
		return logExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertExp createAssertExp() {
		AssertExpImpl assertExp = new AssertExpImpl();
		return assertExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeIterateExp createImperativeIterateExp() {
		ImperativeIterateExpImpl imperativeIterateExp = new ImperativeIterateExpImpl();
		return imperativeIterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpackExp createUnpackExp() {
		UnpackExpImpl unpackExp = new UnpackExpImpl();
		return unpackExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedTupleType createOrderedTupleType() {
		OrderedTupleTypeImpl orderedTupleType = new OrderedTupleTypeImpl();
		return orderedTupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedTupleLiteralExp createOrderedTupleLiteralExp() {
		OrderedTupleLiteralExpImpl orderedTupleLiteralExp = new OrderedTupleLiteralExpImpl();
		return orderedTupleLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedTupleLiteralPart createOrderedTupleLiteralPart() {
		OrderedTupleLiteralPartImpl orderedTupleLiteralPart = new OrderedTupleLiteralPartImpl();
		return orderedTupleLiteralPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchExp createCatchExp() {
		CatchExpImpl catchExp = new CatchExpImpl();
		return catchExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExp createBooleanLiteralExp() {
		BooleanLiteralExpImpl booleanLiteralExp = new BooleanLiteralExpImpl();
		return booleanLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlimitedNaturalExp createUnlimitedNaturalExp() {
		UnlimitedNaturalExpImpl unlimitedNaturalExp = new UnlimitedNaturalExpImpl();
		return unlimitedNaturalExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExp createPropertyCallExp() {
		PropertyCallExpImpl propertyCallExp = new PropertyCallExpImpl();
		return propertyCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeExp createTypeExp() {
		TypeExpImpl typeExp = new TypeExpImpl();
		return typeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExp createIteratorExp() {
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExp createStringLiteralExp() {
		StringLiteralExpImpl stringLiteralExp = new StringLiteralExpImpl();
		return stringLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralExp createIntegerLiteralExp() {
		IntegerLiteralExpImpl integerLiteralExp = new IntegerLiteralExpImpl();
		return integerLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp createOperationCallExp() {
		OperationCallExpImpl operationCallExp = new OperationCallExpImpl();
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteralExp createRealLiteralExp() {
		RealLiteralExpImpl realLiteralExp = new RealLiteralExpImpl();
		return realLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExp createIterateExp() {
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionLiteralExp createCollectionLiteralExp() {
		CollectionLiteralExpImpl collectionLiteralExp = new CollectionLiteralExpImpl();
		return collectionLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionRange createCollectionRange() {
		CollectionRangeImpl collectionRange = new CollectionRangeImpl();
		return collectionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralExp createTupleLiteralExp() {
		TupleLiteralExpImpl tupleLiteralExp = new TupleLiteralExpImpl();
		return tupleLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteralExp createNullLiteralExp() {
		NullLiteralExpImpl nullLiteralExp = new NullLiteralExpImpl();
		return nullLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOcl createExpressionInOcl() {
		ExpressionInOclImpl expressionInOcl = new ExpressionInOclImpl();
		return expressionInOcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidLiteralExp createInvalidLiteralExp() {
		InvalidLiteralExpImpl invalidLiteralExp = new InvalidLiteralExpImpl();
		return invalidLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralPart createTupleLiteralPart() {
		TupleLiteralPartImpl tupleLiteralPart = new TupleLiteralPartImpl();
		return tupleLiteralPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidType createInvalidType() {
		InvalidTypeImpl invalidType = new InvalidTypeImpl();
		return invalidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyType createAnyType() {
		AnyTypeImpl anyType = new AnyTypeImpl();
		return anyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKind createSeverityKindFromString(EDataType eDataType, String initialValue) {
		SeverityKind result = SeverityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind createCollectionKindFromString(EDataType eDataType, String initialValue) {
		CollectionKind result = CollectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeoclPackage getImperativeoclPackage() {
		return (ImperativeoclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImperativeoclPackage getPackage() {
		return ImperativeoclPackage.eINSTANCE;
	}

} //ImperativeoclFactoryImpl
