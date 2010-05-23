grammar Iocl;

options {
backtrack=true;
memoize=true;
output=AST;
}

tokens {
AND = 'and';
ARROW = '->';
COLLECTION_LITERAL;
COLLECTION_LITERAL_PARTS;
DIV = '/';
DOT = '.';
EQUAL = '=';
GT = '>';
GTE = '>=';
LT = '<';
LTE = '<=';
MINUS = '-';
NOT = 'not';
NOT_EQUAL = '<>';
MULT = '*';
OR = 'or';
PLUS = '+';
XOR = 'xor';
}

@lexer::header{
package org.orcas.iocl.parser.antlr;
}

@header {
package org.orcas.iocl.parser.antlr;
}

oclExpressionCS
	: logicalExpCS
	;

logicalExpCS
	: equalityExpCS ((AND | OR | XOR)^ equalityExpCS)*
	;

equalityExpCS
	: relationalExpCS ((EQUAL | NOT_EQUAL)^ relationalExpCS)*
	;

relationalExpCS
	: additiveExpCS ((LT | LTE | GT | GTE)^ additiveExpCS)*
	;

additiveExpCS
	: multiplicativeExpCS ((PLUS | MINUS)^ multiplicativeExpCS)*
	;

multiplicativeExpCS
	: unaryExpCS ((MULT | DIV)^  unaryExpCS)*
	;

unaryExpCS
	: (MINUS | NOT)^ unaryExpCS
	| dotArrowExpCS
	;

dotArrowExpCS
	: NUMERIC_OPERATION '(' argumentsCS? ')' -> ^(NUMERIC_OPERATION argumentsCS?)
	| oclExpCS ((DOT | ARROW)^ propertyCallExp)*
	| oclExpCS
	;

oclExpCS
	: literalExpCS
	| '(' oclExpressionCS ')' -> oclExpressionCS 
	;		

literalExpCS
	: collectionLiteralExpCS 
	| primitiveLiteralExpCS
	;

collectionLiteralExpCS
	: collectionTypeIdentifierCS '{' collectionLiteralPartsCS? '}' -> ^(COLLECTION_LITERAL collectionTypeIdentifierCS collectionLiteralPartsCS?)
	;

collectionTypeIdentifierCS
	: COLLECTION_TYPE_LITERAL
	;

collectionLiteralPartsCS
	: collectionLiteralPartCS (',' collectionLiteralPartCS)* -> ^(COLLECTION_LITERAL_PARTS collectionLiteralPartCS collectionLiteralPartCS*)
	;

collectionLiteralPartCS
	: oclExpressionCS
	;

primitiveLiteralExpCS
	: numericLiteralExpCS
	| stringLiteralExpCS
	| booleanLiteralExpCS
	;

numericLiteralExpCS
	: integerLiteralExpCS
	| realLiteralExpCS
	;
    
stringLiteralExpCS
	: STRING_LITERAL
	;

booleanLiteralExpCS
	: BOOLEAN_LITERAL
	;

integerLiteralExpCS
	: INTEGER_LITERAL
	;	

realLiteralExpCS
	: REAL_LITERAL
	;

propertyCallExp
	: modelPropertyCallExp
	;

modelPropertyCallExp
	: operationCallExpCS
	;

operationCallExpCS
	: simpleNameCS '(' argumentsCS? ')' -> simpleNameCS argumentsCS?
	;

simpleNameCS
	: primitiveTypeCS
	| 'self'
	| IDENTIFIER
	;

primitiveTypeCS
	: 'Integer' 
	;

argumentsCS
	: oclExpressionCS (','! oclExpressionCS)*
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