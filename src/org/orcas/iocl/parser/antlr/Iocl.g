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

grammar Iocl;

options {
backtrack=true;
memoize=true;
output=AST;
}

tokens {
AND = 'and';
APPEND = '+=';
ARROW = '->';
BREAK = 'break';
CLOSE_CURLY_BRACE = '}';
CLOSE_PARENTHESIS = ')';
COLLECTION_LITERAL;
COLLECTION_LITERAL_PARTS;
COLON = ':';
CONTINUE = 'continue';
DO = 'do';
DIV = '/';
DOT = '.';
EQUAL = '=';
GT = '>';
GTE = '>=';
IS = ':=';
LT = '<';
LTE = '<=';
MINUS = '-';
NOT = 'not';
NOT_EQUAL = '<>';
OPEN_CURLY_BRACE = '{';
OPEN_PARENTHESIS = '(';
MULT = '*';
OR = 'or';
PLUS = '+';
RETURN = 'return';
SELF = 'self';
SEMICOLON = ';';
TYPE_SPECIFICATION; 
VAR = 'var';
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
	| imperativeExp
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
	: PRIMITIVE_TYPE_LITERAL
	| SELF
	| IDENTIFIER
	;

argumentsCS
	: oclExpressionCS (','! oclExpressionCS)*
	;

// Imperative Expressions

imperativeExp
	: blockExp
	| breakExp
	| continueExp
	| returnExp
	| variableInitExp
	| assigntExp
	;

blockExp
	: DO OPEN_CURLY_BRACE (oclExpressionCS SEMICOLON)* CLOSE_CURLY_BRACE -> ^(DO oclExpressionCS*)
	;

breakExp
	: BREAK SEMICOLON!
	;

continueExp
	: CONTINUE SEMICOLON!
	;

returnExp
	: RETURN oclExpressionCS? SEMICOLON -> ^(RETURN oclExpressionCS?)
	;

variableInitExp
	: VAR IDENTIFIER (COLON typeSpecification)? IS oclExpressionCS SEMICOLON -> ^(VAR IDENTIFIER typeSpecification? oclExpressionCS)
	;

assigntExp
	: IDENTIFIER (IS | APPEND)^ oclExpressionCS
	;

typeSpecification
	: PRIMITIVE_TYPE_LITERAL -> ^(TYPE_SPECIFICATION PRIMITIVE_TYPE_LITERAL)
	| COLLECTION_TYPE_LITERAL -> ^(TYPE_SPECIFICATION COLLECTION_TYPE_LITERAL)
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

PRIMITIVE_TYPE_LITERAL
	: 'Integer' 
	| 'String'
	| 'Real'
	| 'Boolean'
	| 'OclAny'
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