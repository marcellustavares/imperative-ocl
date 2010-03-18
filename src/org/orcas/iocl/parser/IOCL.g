grammar IOCL;

options {
    ASTLabelType=NodeCS;
    output=AST;
    superClass=IOCLBaseParser;
}

@lexer::header{
package iocl.parser;
}

@header {
package iocl.parser;

import iocl.cst.NodeCS;
import iocl.cst.IOCLExpressionCS;
import iocl.cst.OCLExpressionCS;
import iocl.cst.StringLiteralExpCS;
import iocl.cst.PrimitiveLiteralExpCS;
import iocl.cst.LiteralExpCS;
import org.antlr.runtime.Token;
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
	:  ple = primitiveLiteralExpCS { $literalExpCS = $ple.primitiveLiteralExpCS; }
	;

primitiveLiteralExpCS returns [PrimitiveLiteralExpCS primitiveLiteralExpCS] 	
	:  sle = stringLiteralExpCS { $primitiveLiteralExpCS = $sle.stringLiteralExpCS; }
	;

stringLiteralExpCS  returns [StringLiteralExpCS stringLiteralExpCS]
	: STRING_LITERAL { $stringLiteralExpCS = createStringLiteralExpCS($STRING_LITERAL, $STRING_LITERAL.text); }
	;	

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING_LITERAL
    :  '\'' ( ESC_SEQ | ~('\\'|'"') )* '\''
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
