grammar IOCL;

options {
ASTLabelType=NodeCS;
backtrack=true;
output=AST;
superClass=IOCLBaseParser;
}

@lexer::header{
package org.orcas.iocl.parser;
}

@header {
package org.orcas.iocl.parser;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.ArgumentsCS;
import org.orcas.iocl.cst.BooleanLiteralExpCS; 
import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.orcas.iocl.cst.ModelPropertyCallExpCS;
import org.orcas.iocl.cst.NodeCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.PropertyCallExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.cst.SimpleTypeEnum;
import org.orcas.iocl.cst.StringLiteralExpCS;
}

ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS]
	: ocle = oclExpressionCS { $ioclExpressionCS = $ocle.oclExpressionCS; }
	;

oclExpressionCS returns [OCLExpressionCS oclExpressionCS]
	: ie = impliesExpCS { $oclExpressionCS = $ie.oclExpressionCS; } 
	;

impliesExpCS returns [OCLExpressionCS oclExpressionCS] 
	: le = logicalExpCS { $oclExpressionCS = $le.oclExpressionCS; }
	; 

logicalExpCS returns [OCLExpressionCS oclExpressionCS]
	: ee1 = equalityExpCS ( op = ('and'|'or'|'xor') ee2 = equalityExpCS { $oclExpressionCS = createOperationCallExpCS(ee1.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text), ee2.oclExpressionCS); } )+
	| ee = equalityExpCS { $oclExpressionCS = $ee.oclExpressionCS; }
	;

equalityExpCS returns [OCLExpressionCS oclExpressionCS]
	: rele1 = relationalExpCS ( op = ('<>'|'=') rele2 = relationalExpCS { $oclExpressionCS = createOperationCallExpCS(rele1.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text), rele2.oclExpressionCS); } )+
	| rele = relationalExpCS { $oclExpressionCS = $rele.oclExpressionCS; }
	;	

relationalExpCS returns [OCLExpressionCS oclExpressionCS] 
	: ae1 = additiveExpCS ( op = ('<='|'<'|'>'|'>=') ae2 = additiveExpCS { $oclExpressionCS = createOperationCallExpCS(ae1.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text), ae2.oclExpressionCS); } )+
	| ae = additiveExpCS { $oclExpressionCS = $ae.oclExpressionCS; }
	;

additiveExpCS returns [OCLExpressionCS oclExpressionCS]
	: me1 = multiplicativeExpCS { $oclExpressionCS = $me1.oclExpressionCS; } (op = ('+'|'-') me2 = multiplicativeExpCS { $oclExpressionCS = createOperationCallExpCS(me1.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text), me2.oclExpressionCS); } )+
	| me = multiplicativeExpCS { $oclExpressionCS = $me.oclExpressionCS; }
	;

multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS]
	: ue1 = unaryExpCS { $oclExpressionCS = $ue1.oclExpressionCS; } ( op = ('*'|'/') ue2 = unaryExpCS { $oclExpressionCS = createOperationCallExpCS(ue1.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text), ue2.oclExpressionCS); } )+
	| ue = unaryExpCS { $oclExpressionCS = $ue.oclExpressionCS; }
	;

unaryExpCS returns [OCLExpressionCS oclExpressionCS]
	: op = ('+'|'-'|'not') ue = unaryExpCS { $oclExpressionCS = createOperationCallExpCS($ue.oclExpressionCS, createSimpleNameCS($op, SimpleTypeEnum.STRING, $op.text) ); }
	| dae = dotArrowExpCS { $oclExpressionCS = $dae.oclExpressionCS; }
	;

dotArrowExpCS returns [OCLExpressionCS oclExpressionCS]
	: NUMERIC_OPERATION  '(' ( args = argumentsCS)? ')' { $oclExpressionCS = createNumericOperationCallExpCS($NUMERIC_OPERATION, $NUMERIC_OPERATION.text, (args != null) ? args.argumentsCS : null ); } 
	| ocle = oclExpCS pce = propertyCallExp { $oclExpressionCS = setOperationCallExpCSSource($ocle.oclExpressionCS, $pce.oclExpressionCS); }
	| ocle = oclExpCS { $oclExpressionCS = $ocle.oclExpressionCS; }
	;

oclExpCS returns [OCLExpressionCS oclExpressionCS]
	: le = literalExpCS { $oclExpressionCS = $le.oclExpressionCS; }
	;

literalExpCS returns [OCLExpressionCS oclExpressionCS]
	: cle = collectionLiteralExpCS { $oclExpressionCS = $cle.oclExpressionCS; }
	| ple = primitiveLiteralExpCS { $oclExpressionCS = $ple.oclExpressionCS; }
	;

collectionLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: cti = collectionTypeIdentifierCS '{' clpts = collectionLiteralPartsCS?  '}' { $oclExpressionCS = createCollectionLiteralExpCS($cti.oclExpressionCS, $clpts.oclExpressionCS); } 
	;

collectionTypeIdentifierCS returns [OCLExpressionCS oclExpressionCS]
	: COLLECTION_TYPE_LITERAL { $oclExpressionCS = createCollectionTypeIdentifierCS($COLLECTION_TYPE_LITERAL, $COLLECTION_TYPE_LITERAL.text); }
	;

collectionLiteralPartsCS returns [OCLExpressionCS oclExpressionCS]
	: clpe = collectionLiteralPartCS { $oclExpressionCS = createCollectionLiteralPartsCS($clpe.oclExpressionCS); } (',' collectionLiteralPartsCS)?
	;		 

collectionLiteralPartCS returns [OCLExpressionCS oclExpressionCS]
	//: collectionRangeCS
	: ocle = oclExpressionCS { $oclExpressionCS = createCollectionLiteralPartCS($ocle.oclExpressionCS); }
	;

primitiveLiteralExpCS returns [OCLExpressionCS oclExpressionCS] 	
	: nle = numericLiteralExpCS { $oclExpressionCS = $nle.oclExpressionCS; }
	| sle = stringLiteralExpCS { $oclExpressionCS = $sle.oclExpressionCS; }
	| ble = booleanLiteralExpCS { $oclExpressionCS = $ble.oclExpressionCS; }
	;

numericLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: ile = integerLiteralExpCS { $oclExpressionCS = $ile.oclExpressionCS; }
	| rle = realLiteralExpCS { $oclExpressionCS = $rle.oclExpressionCS; }
	;
    
stringLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: STRING_LITERAL { $oclExpressionCS = createStringLiteralExpCS($STRING_LITERAL, $STRING_LITERAL.text); }
	;

booleanLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: BOOLEAN_LITERAL { $oclExpressionCS = createBooleanLiteralExpCS($BOOLEAN_LITERAL, $BOOLEAN_LITERAL.text); }
	;

integerLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: INTEGER_LITERAL { $oclExpressionCS = createIntegerLiteralExpCS($INTEGER_LITERAL, $INTEGER_LITERAL.text); }
	;	

realLiteralExpCS returns [OCLExpressionCS oclExpressionCS]
	: REAL_LITERAL { $oclExpressionCS = createRealLiteralExpCS($REAL_LITERAL, $REAL_LITERAL.text); }
	;

propertyCallExp returns [OCLExpressionCS oclExpressionCS]
	: '->' modelPropertyCallExp
	| '.' mpce = modelPropertyCallExp { $oclExpressionCS = $mpce.oclExpressionCS; }
	;

modelPropertyCallExp returns [OCLExpressionCS oclExpressionCS]
	: oce = operationCallExpCS { $oclExpressionCS = $oce.oclExpressionCS; }
	;

operationCallExpCS returns [OCLExpressionCS oclExpressionCS]
	:  bn = binaryName '(' ( args = argumentsCS)? ')' {$oclExpressionCS = createOperationCallExpCS($bn.oclExpressionCS, $args.argumentsCS); }
	;

binaryName returns [OCLExpressionCS oclExpressionCS]
	: sn = simpleNameCS { $oclExpressionCS = $sn.oclExpressionCS; }
	| BINARY_OPERATOR
	;

simpleNameCS returns [OCLExpressionCS oclExpressionCS]
	: primitiveTypeCS
	| 'self'
	| IDENTIFIER { $oclExpressionCS = createSimpleNameCS($IDENTIFIER, SimpleTypeEnum.IDENTIFIER, $IDENTIFIER.text); }
	;

primitiveTypeCS
	: 'Integer' 
	;

argumentsCS returns [ArgumentsCS argumentsCS]
	: ocle = oclExpressionCS { $argumentsCS = createArgumentsCS($ocle.oclExpressionCS); } ( ',' argumentsCS )?
	;

// Literals

BINARY_OPERATOR
	:
	;

BOOLEAN_LITERAL
	: 'true' 
	| 'false'
	;

COLLECTION_TYPE_LITERAL
	: 'Bag'
	| 'Collection' 
	| 'OrderedSet'  
	| 'Sequence'
	| 'Set'
	;

INTEGER_LITERAL
	: '0'..'9'+
	; 

REAL_LITERAL
	: ('0'..'9')+ '.' ('0'..'9')+ EXPONENT?
	| '.' ('0'..'9')+ EXPONENT?
	| ('0'..'9')+ EXPONENT
	;
		
STRING_LITERAL
	: '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
	;

IDENTIFIER  
	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

NUMERIC_OPERATION
	: INTEGER_LITERAL '.' IDENTIFIER
	;	   

WS  
	: ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
	;

fragment
EXPONENT 
	: ('e'|'E') ('+'|'-')? ('0'..'9')+ 
	;

fragment
HEX_DIGIT 
	: ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
	: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	| UNICODE_ESC
	| OCTAL_ESC
	;

fragment
OCTAL_ESC
	: '\\' ('0'..'3') ('0'..'7') ('0'..'7')
	| '\\' ('0'..'7') ('0'..'7')
	| '\\' ('0'..'7')
	;

fragment
UNICODE_ESC
	: '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;