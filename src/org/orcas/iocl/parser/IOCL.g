grammar IOCL;

options {
ASTLabelType=NodeCS;
output=AST;
superClass=IOCLBaseParser;
}

@lexer::header{
package org.orcas.iocl.parser;
}

@header {
package org.orcas.iocl.parser;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.orcas.iocl.cst.NodeCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
}

@members{
}

ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS]
	: ocle = oclExpressionCS { $ioclExpressionCS = $ocle.oclExpressionCS; }
	;

oclExpressionCS returns [OCLExpressionCS oclExpressionCS] 
	: le = literalExpCS { $oclExpressionCS = $le.literalExpCS; }
	;

literalExpCS  returns [LiteralExpCS literalExpCS]
	: ple = primitiveLiteralExpCS { $literalExpCS = $ple.primitiveLiteralExpCS; }
	;

primitiveLiteralExpCS returns [PrimitiveLiteralExpCS primitiveLiteralExpCS] 	
	: nle = numericLiteralExpCS { $primitiveLiteralExpCS = $nle.numericLiteralExpCS; }
	| sle = stringLiteralExpCS { $primitiveLiteralExpCS = $sle.stringLiteralExpCS; }
	| ble = booleanLiteralExpCS { $primitiveLiteralExpCS = $ble.booleanLiteralExpCS; }
	;

numericLiteralExpCS  returns [NumericLiteralExpCS numericLiteralExpCS]
	: ile = integerLiteralExpCS { $numericLiteralExpCS = $ile.integerLiteralExpCS; }
	| rle = realLiteralExpCS { $numericLiteralExpCS = $rle.realLiteralExpCS; }
	;

stringLiteralExpCS  returns [StringLiteralExpCS stringLiteralExpCS]
	: STRING_LITERAL { $stringLiteralExpCS = createStringLiteralExpCS($STRING_LITERAL, $STRING_LITERAL.text); }
	;	

booleanLiteralExpCS  returns [BooleanLiteralExpCS booleanLiteralExpCS]
	: BOOLEAN_LITERAL { $booleanLiteralExpCS = createBooleanLiteralExpCS($BOOLEAN_LITERAL, $BOOLEAN_LITERAL.text); }
	;

integerLiteralExpCS  returns [IntegerLiteralExpCS integerLiteralExpCS]
	: INTEGER_LITERAL { $integerLiteralExpCS = createIntegerLiteralExpCS($INTEGER_LITERAL, $INTEGER_LITERAL.text); }
	;	

realLiteralExpCS  returns [RealLiteralExpCS realLiteralExpCS]
	: REAL_LITERAL { $realLiteralExpCS = createRealLiteralExpCS($REAL_LITERAL, $REAL_LITERAL.text); }
	;

BOOLEAN_LITERAL 
	: 'true' 
	| 'false'
	;

INTEGER_LITERAL
	: '0'..'9'+
	; 

REAL_LITERAL
	: ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
	| '.' ('0'..'9')+ EXPONENT?
	| ('0'..'9')+ EXPONENT
	;
		
STRING_LITERAL
	: '\'' ( ESC_SEQ | ~('\\'|'"') )* '\''
	;

ID  
	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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