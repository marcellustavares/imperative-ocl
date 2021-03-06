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
ALT_EXP;
AND = 'and';
APPEND = '+=';
ARROW = '->';
ATTRIBUTE_CALL;
BLOCK;
BREAK = 'break';
COLLECTION_LITERAL;
COLLECTION_TYPE;
COLON = ':';
COMPUTE = 'compute';
CONTINUE = 'continue';
DICT = 'Dict';
DICT_LITERAL_EXP;
DIV = '/';
DO = 'do';
DOT = '.';
ENDIF = 'endif';
ENUM_LITERAL;
ELIF = 'elif';
ELSE = 'else';
EQUAL = '=';
EXCEPT = 'except';
FOR = 'for';
GT = '>';
GTE = '>=';
IF = 'if';
IMPERATIVE_OPERATION_CALL;
ITERATE = 'iterate';
ITERATOR;
IS = ':=';
LOG = 'log';
LCURLY = '{';
LPAREN = '(';
LT = '<';
LTE = '<=';
MINUS = '-';
NEW = 'new';
NOT = 'not';
NOT_EQUAL = '<>';
MULT = '*';
OPERATION_CALL;
OR = 'or';
PATH_NAME;
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
package org.orcas.ioclengine.parser.antlr;
}

@header {
package org.orcas.ioclengine.parser.antlr;
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
	| instantiationExp
	| dictLiteralExp
	| dotArrowExp
	;

instantiationExp
	: NEW^ pathName '('! arguments? ')'!
	;

dictLiteralExp
	: DICT LCURLY RCURLY -> ^(DICT_LITERAL_EXP)
	;

dotArrowExp
	: oclExp propertyCallExp^+
	| oclExp
	;

propertyCallExp
	: (DOT | ARROW)! modelPropertyCallExp
	| ARROW! loopExp
	;

modelPropertyCallExp
	: operationCallExp
	| attributeCallExp
	;

operationCallExp
	: NUMERIC_OPERATION '(' arguments? ')' -> ^(NUMERIC_OPERATION arguments?)
	| simpleName '(' arguments? ')' -> ^(OPERATION_CALL simpleName arguments?)
	;

attributeCallExp
	: simpleName -> ^(ATTRIBUTE_CALL simpleName)
	;
oclExp
	: literalExp 
	| variableExp
	| type
	| '(' oclExpression ')' -> oclExpression 
	;		

variableExp
	: simpleName -> ^(VARIABLE simpleName)
	;

literalExp
	: enumerationLiteralExp
	| collectionLiteralExp 
	| primitiveLiteralExp
	| nullLiteralExp
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

nullLiteralExp
	: NULL_LITERAL
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

enumerationLiteralExp
	: IDENTIFIER (SCOPE IDENTIFIER)+ -> ^(ENUM_LITERAL IDENTIFIER IDENTIFIER+) 
	;

loopExp
	: iteratorExp
	| iterateExp
	;

iteratorExp
	: ITERATOR_NAME LPAREN ((v1 = variableDeclaration ',')? v2 = variableDeclaration '|')? oclExpression RPAREN 
		-> ^(ITERATOR ITERATOR_NAME $v1? $v2? oclExpression)
	;

iterateExp
	: ITERATE LPAREN (v1 = variableDeclaration SEMICOLON)? v2 = variableDeclaration  '|' oclExpression RPAREN 
		-> ^(ITERATE $v1? $v2 oclExpression)
	;

variableDeclaration
	: IDENTIFIER (':' type)? ('=' oclExpression)? -> ^(VARIABLE IDENTIFIER type? oclExpression?)
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
	: collectionTypeIdentifier (LPAREN type RPAREN)? -> ^(COLLECTION_TYPE collectionTypeIdentifier type?) 
	;

type
	: primitiveType
	| collectionType
	| DICT (LPAREN keyType=type ',' valueType=type RPAREN)? -> ^(DICT $keyType? $valueType?)
	| pathName
	;

pathName
	: IDENTIFIER (SCOPE IDENTIFIER)* -> ^(PATH_NAME IDENTIFIER IDENTIFIER*)
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
	| logExp
	| imperativeOperationCallExp
	;

blockExp
	: DO? LCURLY imperativeExp* RCURLY -> ^(BLOCK imperativeExp*)
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
	: RETURN logicalExp? SEMICOLON -> ^(RETURN logicalExp?)
	;

variableInitExp
	: VAR^ imperativeVarDeclarations SEMICOLON!
	;
	
imperativeVarDeclarations
	: imperativeVarDeclaration (','! imperativeVarDeclaration)*
	;
	
imperativeVarDeclaration
	: IDENTIFIER (':' type)? ((EQUAL | IS)  logicalExp)? -> ^(VARIABLE IDENTIFIER type? logicalExp?)
	;

assignExp
	: dotArrowExp (IS | APPEND)^ logicalExp SEMICOLON!
	;

raiseExp
	: RAISE^ (type | STRING_LITERAL) SEMICOLON!
	;

whileExp
	: WHILE LPAREN condition = logicalExp RPAREN 
		body = imperativeExp -> ^(WHILE $condition $body)
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
	: LPAREN condition = logicalExp RPAREN  body = imperativeExp -> ^(ALT_EXP $condition $body)
	;

tryExp
	: TRY LCURLY imperativeExp* RCURLY except -> ^(TRY imperativeExp* except)
	;

except
	: EXCEPT LPAREN type RPAREN LCURLY imperativeExp* RCURLY -> ^(EXCEPT type imperativeExp*)
	;

forExp	
	: oclExp ARROW FOR_NAME LPAREN iteratorList ('|' condition = oclExpression)? RPAREN body = oclExpression
		-> ^(FOR FOR_NAME oclExp iteratorList $condition? $body)
	;

iteratorList
	: variableDeclaration (','! variableDeclaration)*
	;

logExp
	: LOG LPAREN STRING_LITERAL (',' IDENTIFIER)? (',' INTEGER_LITERAL)? RPAREN SEMICOLON -> ^(LOG STRING_LITERAL? INTEGER_LITERAL?)
	;

imperativeOperationCallExp
	: dotArrowExp SEMICOLON -> ^(IMPERATIVE_OPERATION_CALL dotArrowExp)
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

NULL_LITERAL
	: 'null'
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