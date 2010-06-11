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
ALT_EXP;
APPEND = '+=';
ARROW = '->';
BREAK = 'break';
COLLECTION_LITERAL;
COLLECTION_TYPE;
COLON = ':';
COMPUTE = 'compute';
CONTINUE = 'continue';
DO = 'do';
DIV = '/';
DOT = '.';
ENDIF = 'endif';
ELIF = 'elif';
ELSE = 'else';
EQUAL = '=';
EXCEPT = 'except';
FOR = 'for';
GT = '>';
GTE = '>=';
IF = 'if';
ITERATE = 'iterate';
ITERATOR;
IS = ':=';
LCURLY = '{';
LPAREN = '(';
LT = '<';
LTE = '<=';
MINUS = '-';
NOT = 'not';
NOT_EQUAL = '<>';
MULT = '*';
OR = 'or';
PLUS = '+';
RAISE = 'raise';
RCURLY = '}';
RETURN = 'return';
RPAREN = ')';
SCOPE = '::';
SELF = 'self';
SEMICOLON = ';';
TRY = 'try';
VAR = 'var';
VARIABLE;
WHILE = 'while';
XOR = 'xor';
}

@lexer::header{
package org.orcas.iocl.parser.antlr;
}

@header {
package org.orcas.iocl.parser.antlr;
}

oclExpressionCS
	: imperativeExp
	| logicalExpCS
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
	| propertyCallExp
	| oclExpCS
	;

oclExpCS
	: variableExp
	| literalExpCS
	| '(' oclExpressionCS ')' -> oclExpressionCS 
	;		

variableExp
	: simpleNameCS
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
	: collectionLiteralPartCS (','! collectionLiteralPartsCS)*
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
	| loopExp
	;

modelPropertyCallExp
	: operationCallExpCS
	;

loopExp
	: iteratorExpCS
	| iterateExpCS
	;

iteratorExpCS
	:  oclExpCS ARROW ITERATOR_NAME LPAREN ((v1 = variableDeclaration ',')? v2 = variableDeclaration '|')? oclExpressionCS RPAREN -> ^(ITERATOR oclExpCS ITERATOR_NAME $v1? $v2? oclExpressionCS)
	;

iterateExpCS
	: oclExpCS ARROW ITERATE LPAREN (v1 = variableDeclaration SEMICOLON)? v2 = variableDeclaration  '|' oclExpressionCS RPAREN -> ^(ITERATE oclExpCS $v1? $v2 oclExpressionCS)
	;

variableDeclaration
	: IDENTIFIER (':' type)? ('=' oclExpressionCS)? -> ^(VARIABLE IDENTIFIER type? oclExpressionCS?)
	;

operationCallExpCS
	: oclExpCS (DOT | ARROW)^ simpleNameCS '('! argumentsCS? ')'!
	;

argumentsCS
	: oclExpressionCS (','! oclExpressionCS)*
	;

simpleNameCS
	//: primitiveType
	: SELF
	| IDENTIFIER
	;

primitiveType
	: PRIMITIVE_TYPE_LITERAL
	;

collectionType
	: collectionTypeIdentifierCS LPAREN type RPAREN -> ^(COLLECTION_TYPE collectionTypeIdentifierCS type) 
	;

type
	: primitiveType
	| collectionType
	| pathName
	;

pathName
	: IDENTIFIER (SCOPE IDENTIFIER)* -> ^(SCOPE IDENTIFIER IDENTIFIER*)
	;

// Imperative Expressions

imperativeExp
	: blockExp
	| breakExp
	| computeExp
	| continueExp
	| returnExp
	| variableInitExp
	| assignExp
	| raiseExp
	| whileExp
	| ifExp
	| tryExp
	| forExp
	;

blockExp
	: DO? LCURLY oclExpressionCS* RCURLY -> ^(DO oclExpressionCS*)
	;

breakExp
	: BREAK SEMICOLON
	;

computeExp
	: COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpressionCS RCURLY -> ^(COMPUTE variableDeclaration oclExpressionCS)
	;

continueExp
	: CONTINUE SEMICOLON
	;

returnExp
	: RETURN oclExpressionCS? SEMICOLON -> ^(RETURN oclExpressionCS?)
	;

variableInitExp
	: VAR^ imperativeVarDeclarations SEMICOLON!
	;
	
imperativeVarDeclarations
	: imperativeVarDeclaration (','! imperativeVarDeclaration)*
	;
	
imperativeVarDeclaration
	: IDENTIFIER (':' type)? ((EQUAL | IS)  oclExpressionCS)? -> ^(VARIABLE IDENTIFIER type? oclExpressionCS?)
	;

assignExp
	: variableExp (IS | APPEND)^ oclExpressionCS SEMICOLON!
	;

raiseExp
	: RAISE^ (type | STRING_LITERAL) SEMICOLON!
	;

whileExp
	: WHILE LPAREN condition = oclExpressionCS RPAREN 
		LCURLY body = oclExpressionCS RCURLY -> ^(WHILE $condition $body)
	;

ifExp
	: IF altExp (elifExp)* (elseExp)? ENDIF -> ^(IF altExp elifExp* elseExp?)
	;

elifExp
	: ELIF! altExp
	;

elseExp	
	: ELSE! oclExpressionCS
	;
	
altExp 
	: LPAREN condition = oclExpressionCS RPAREN  body = oclExpressionCS -> ^(ALT_EXP $condition $body)
	;

tryExp
	: TRY LCURLY oclExpressionCS* RCURLY except -> ^(TRY oclExpressionCS* except)
	;

except
	: EXCEPT LPAREN type RPAREN LCURLY oclExpressionCS* RCURLY -> ^(EXCEPT type oclExpressionCS*)
	;

forExp	
	: oclExpCS ARROW FOR_NAME LPAREN iteratorList ('|' oclExpressionCS)? RPAREN LCURLY oclExpressionCS RCURLY 
		-> ^(FOR FOR_NAME oclExpCS iteratorList oclExpressionCS? oclExpressionCS)
	;

iteratorList
	: variableDeclaration (','! variableDeclaration)*
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

ITERATOR_NAME
	: 'any'
	| 'closure'
	| 'collect'
	| 'collectNested'
	| 'exists'
	| 'forAll'
	| 'isUnique'
	| 'one'
	| 'select'
	| 'sortedBy'
	| 'reject'
	;

FOR_NAME
	: 'forEach'
	| 'forOne'
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