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
BLOCK;
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

@members {
protected void mismatch(IntStream input, int ttype, BitSet follow)
    throws RecognitionException
{
    throw new MismatchedTokenException(ttype, input);
}

public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
    throws RecognitionException
{
    throw e;
}
}

@rulecatch {
catch (RecognitionException e) {
    throw e;
}
}

oclExpression
	: imperativeExp
	| logicalExp
	;

logicalExp
	: equalityExp ((AND | OR | XOR)^ equalityExp)*
	;

equalityExp
	: relationalExp ((EQUAL | NOT_EQUAL)^ relationalExp)*
	;

relationalExp
	: additiveExp ((LT | LTE | GT | GTE)^ additiveExp)*
	;

additiveExp
	: multiplicativeExp ((PLUS | MINUS)^ multiplicativeExp)*
	;

multiplicativeExp
	: unaryExp ((MULT | DIV)^  unaryExp)*
	;

unaryExp
	: (MINUS | NOT)^ unaryExp
	| dotArrowExp
	;

dotArrowExp
	: propertyCallExp
	| oclExp
	;

oclExp
	: variableExp
	| literalExp
	| type
	| '(' oclExpression ')' -> oclExpression 
	;		

variableExp
	: simpleName -> ^(VARIABLE simpleName)
	;

literalExp
	: collectionLiteralExp 
	| primitiveLiteralExp
	;

collectionLiteralExp
	: collectionTypeIdentifier '{' collectionLiteralParts? '}' -> ^(COLLECTION_LITERAL collectionTypeIdentifier collectionLiteralParts?)
	;

collectionTypeIdentifier
	: COLLECTION_TYPE_LITERAL
	;

collectionLiteralParts
	: collectionLiteralPart (','! collectionLiteralParts)*
	;

collectionLiteralPart
	: oclExpression
	;

primitiveLiteralExp
	: numericLiteralExp
	| stringLiteralExp
	| booleanLiteralExp
	;

numericLiteralExp
	: integerLiteralExp
	| realLiteralExp
	;
    
stringLiteralExp
	: STRING_LITERAL
	;

booleanLiteralExp
	: BOOLEAN_LITERAL
	;

integerLiteralExp
	: INTEGER_LITERAL
	;	

realLiteralExp
	: REAL_LITERAL
	;

propertyCallExp
	: modelPropertyCallExp
	| loopExp
	;

modelPropertyCallExp
	: operationCallExp
	//| attributeCallExp
	//| navigationCallExp
	;

attributeCallExp
	: oclExpression DOT simpleName isMarkedPre?
	| simpleName isMarkedPre?
	| pathName
	;

isMarkedPre
	: '@pre'
	;

navigationCallExp
	: oclExpression DOT simpleName ('[' arguments ']')? isMarkedPre?
	;

loopExp
	: iteratorExp
	| iterateExp
	;

iteratorExp
	:  oclExp ARROW ITERATOR_NAME LPAREN ((v1 = variableDeclaration ',')? v2 = variableDeclaration '|')? oclExpression RPAREN 
		-> ^(ITERATOR oclExp ITERATOR_NAME $v1? $v2? oclExpression)
	;

iterateExp
	: oclExp ARROW ITERATE LPAREN (v1 = variableDeclaration SEMICOLON)? v2 = variableDeclaration  '|' oclExpression RPAREN 
		-> ^(ITERATE oclExp $v1? $v2 oclExpression)
	;

variableDeclaration
	: IDENTIFIER (':' type)? ('=' oclExpression)? -> ^(VARIABLE IDENTIFIER type? oclExpression?)
	;

operationCallExp
	: NUMERIC_OPERATION '(' arguments? ')' -> ^(NUMERIC_OPERATION arguments?)
	| oclExp (DOT | ARROW)^ simpleName '('! arguments? ')'!
	;

arguments
	: oclExpression (','! oclExpression)*
	;

simpleName	
	: SELF
	| IDENTIFIER
	;

primitiveType
	: PRIMITIVE_TYPE_LITERAL
	;

collectionType
	: collectionTypeIdentifier LPAREN type RPAREN -> ^(COLLECTION_TYPE collectionTypeIdentifier type) 
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
	: DO? LCURLY oclExpression* RCURLY -> ^(BLOCK oclExpression*)
	;

breakExp
	: BREAK^ SEMICOLON
	;

computeExp
	: COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^(COMPUTE variableDeclaration oclExpression)
	;

continueExp
	: CONTINUE^ SEMICOLON
	;

returnExp
	: RETURN oclExpression? SEMICOLON -> ^(RETURN oclExpression?)
	;

variableInitExp
	: VAR^ imperativeVarDeclarations SEMICOLON!
	;
	
imperativeVarDeclarations
	: imperativeVarDeclaration (','! imperativeVarDeclaration)*
	;
	
imperativeVarDeclaration
	: IDENTIFIER (':' type)? ((EQUAL | IS)  oclExpression)? -> ^(VARIABLE IDENTIFIER type? oclExpression?)
	;

assignExp
	: dotArrowExp (IS | APPEND)^ oclExpression SEMICOLON!
	;

raiseExp
	: RAISE^ (type | STRING_LITERAL) SEMICOLON!
	;

whileExp
	: WHILE LPAREN condition = oclExpression RPAREN 
		body = oclExpression -> ^(WHILE $condition $body)
	;

ifExp
	: IF altExp (elifExp)* (elseExp)? ENDIF? -> ^(IF altExp elifExp* elseExp?)
	;

elifExp
	: ELIF! altExp
	;

elseExp	
	: ELSE! oclExpression
	;
	
altExp 
	: LPAREN condition = oclExpression RPAREN  body = oclExpression -> ^(ALT_EXP $condition $body)
	;

tryExp
	: TRY LCURLY oclExpression* RCURLY except -> ^(TRY oclExpression* except)
	;

except
	: EXCEPT LPAREN type RPAREN LCURLY oclExpression* RCURLY -> ^(EXCEPT type oclExpression*)
	;

forExp	
	: oclExp ARROW FOR_NAME LPAREN iteratorList ('|' oclExpression)? RPAREN LCURLY oclExpression RCURLY 
		-> ^(FOR FOR_NAME oclExp iteratorList oclExpression? oclExpression)
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