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
package org.orcas.ioclengine.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class IoclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_EXP", "AND", "APPEND", "ARROW", "ATTRIBUTE_CALL", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ENUM_LITERAL", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NEW", "NOT", "NOT_EQUAL", "MULT", "OPERATION_CALL", "OR", "PATH_NAME", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "IDENTIFIER", "ITERATOR_NAME", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=64;
    public static final int APPEND=6;
    public static final int EXPONENT=67;
    public static final int LT=34;
    public static final int WHILE=55;
    public static final int PRIMITIVE_TYPE_LITERAL=65;
    public static final int COMPUTE=14;
    public static final int GTE=27;
    public static final int OCTAL_ESC=72;
    public static final int NEW=37;
    public static final int DO=16;
    public static final int FOR=25;
    public static final int NOT=38;
    public static final int AND=5;
    public static final int EXCEPT=24;
    public static final int EOF=-1;
    public static final int LTE=35;
    public static final int BREAK=10;
    public static final int LPAREN=33;
    public static final int IF=28;
    public static final int RPAREN=48;
    public static final int ESC_SEQ=68;
    public static final int STRING_LITERAL=59;
    public static final int REAL_LITERAL=62;
    public static final int SCOPE=49;
    public static final int COLLECTION_TYPE_LITERAL=58;
    public static final int CONTINUE=15;
    public static final int NOT_EQUAL=39;
    public static final int IS=31;
    public static final int IDENTIFIER=63;
    public static final int ITERATOR=30;
    public static final int EQUAL=23;
    public static final int RETURN=47;
    public static final int ENDIF=19;
    public static final int ENUM_LITERAL=20;
    public static final int PLUS=44;
    public static final int VAR=53;
    public static final int RAISE=45;
    public static final int DOT=18;
    public static final int PATH_NAME=43;
    public static final int COLLECTION_LITERAL=11;
    public static final int FOR_NAME=66;
    public static final int XOR=56;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int UNICODE_ESC=71;
    public static final int NUMERIC_OPERATION=57;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=70;
    public static final int LCURLY=32;
    public static final int SEMICOLON=51;
    public static final int MINUS=36;
    public static final int MULT=40;
    public static final int TRY=52;
    public static final int BOOLEAN_LITERAL=60;
    public static final int COLON=13;
    public static final int ALT_EXP=4;
    public static final int ELIF=21;
    public static final int ITERATE=29;
    public static final int WS=69;
    public static final int VARIABLE=54;
    public static final int INTEGER_LITERAL=61;
    public static final int BLOCK=9;
    public static final int RCURLY=46;
    public static final int OR=42;
    public static final int ARROW=7;
    public static final int GT=26;
    public static final int OPERATION_CALL=41;
    public static final int DIV=17;
    public static final int SELF=50;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[132+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IoclParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g"; }


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


    public static class oclExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpression"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:110:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:111:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:111:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression396);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression401);
                    logicalExp2=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExp2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, oclExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExpression"

    public static class logicalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:115:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
    public final IoclParser.logicalExp_return logicalExp() throws RecognitionException {
        IoclParser.logicalExp_return retval = new IoclParser.logicalExp_return();
        retval.start = input.LT(1);
        int logicalExp_StartIndex = input.index();
        Object root_0 = null;

        Token set4=null;
        IoclParser.equalityExp_return equalityExp3 = null;

        IoclParser.equalityExp_return equalityExp5 = null;


        Object set4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:116:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:116:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp412);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:116:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:116:17: ( AND | OR | XOR ) equalityExp
            	    {
            	    set4=(Token)input.LT(1);
            	    set4=(Token)input.LT(1);
            	    if ( input.LA(1)==AND||input.LA(1)==OR||input.LA(1)==XOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set4), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp428);
            	    equalityExp5=equalityExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, logicalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalExp"

    public static class equalityExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:119:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
    public final IoclParser.equalityExp_return equalityExp() throws RecognitionException {
        IoclParser.equalityExp_return retval = new IoclParser.equalityExp_return();
        retval.start = input.LT(1);
        int equalityExp_StartIndex = input.index();
        Object root_0 = null;

        Token set7=null;
        IoclParser.relationalExp_return relationalExp6 = null;

        IoclParser.relationalExp_return relationalExp8 = null;


        Object set7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:120:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:120:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp441);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:120:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:120:19: ( EQUAL | NOT_EQUAL ) relationalExp
            	    {
            	    set7=(Token)input.LT(1);
            	    set7=(Token)input.LT(1);
            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set7), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp453);
            	    relationalExp8=relationalExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp8.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, equalityExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExp"

    public static class relationalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:123:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
    public final IoclParser.relationalExp_return relationalExp() throws RecognitionException {
        IoclParser.relationalExp_return retval = new IoclParser.relationalExp_return();
        retval.start = input.LT(1);
        int relationalExp_StartIndex = input.index();
        Object root_0 = null;

        Token set10=null;
        IoclParser.additiveExp_return additiveExp9 = null;

        IoclParser.additiveExp_return additiveExp11 = null;


        Object set10_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:124:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:124:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp466);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:124:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:124:17: ( LT | LTE | GT | GTE ) additiveExp
            	    {
            	    set10=(Token)input.LT(1);
            	    set10=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GT && input.LA(1)<=GTE)||(input.LA(1)>=LT && input.LA(1)<=LTE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set10), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp486);
            	    additiveExp11=additiveExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp11.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, relationalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExp"

    public static class additiveExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:127:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
    public final IoclParser.additiveExp_return additiveExp() throws RecognitionException {
        IoclParser.additiveExp_return retval = new IoclParser.additiveExp_return();
        retval.start = input.LT(1);
        int additiveExp_StartIndex = input.index();
        Object root_0 = null;

        Token set13=null;
        IoclParser.multiplicativeExp_return multiplicativeExp12 = null;

        IoclParser.multiplicativeExp_return multiplicativeExp14 = null;


        Object set13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp499);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:23: ( PLUS | MINUS ) multiplicativeExp
            	    {
            	    set13=(Token)input.LT(1);
            	    set13=(Token)input.LT(1);
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set13), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp511);
            	    multiplicativeExp14=multiplicativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, additiveExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExp"

    public static class multiplicativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:131:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
    public final IoclParser.multiplicativeExp_return multiplicativeExp() throws RecognitionException {
        IoclParser.multiplicativeExp_return retval = new IoclParser.multiplicativeExp_return();
        retval.start = input.LT(1);
        int multiplicativeExp_StartIndex = input.index();
        Object root_0 = null;

        Token set16=null;
        IoclParser.unaryExp_return unaryExp15 = null;

        IoclParser.unaryExp_return unaryExp17 = null;


        Object set16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:132:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:132:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp524);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:132:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:132:14: ( MULT | DIV ) unaryExp
            	    {
            	    set16=(Token)input.LT(1);
            	    set16=(Token)input.LT(1);
            	    if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set16), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp537);
            	    unaryExp17=unaryExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp17.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, multiplicativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExp"

    public static class unaryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:135:1: unaryExp : ( ( MINUS | NOT ) unaryExp | dotArrowExp );
    public final IoclParser.unaryExp_return unaryExp() throws RecognitionException {
        IoclParser.unaryExp_return retval = new IoclParser.unaryExp_return();
        retval.start = input.LT(1);
        int unaryExp_StartIndex = input.index();
        Object root_0 = null;

        Token set18=null;
        IoclParser.unaryExp_return unaryExp19 = null;

        IoclParser.dotArrowExp_return dotArrowExp20 = null;


        Object set18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:136:2: ( ( MINUS | NOT ) unaryExp | dotArrowExp )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MINUS||LA7_0==NOT) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN||LA7_0==SELF||(LA7_0>=COLLECTION_TYPE_LITERAL && LA7_0<=IDENTIFIER)||LA7_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:136:4: ( MINUS | NOT ) unaryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set18=(Token)input.LT(1);
                    set18=(Token)input.LT(1);
                    if ( input.LA(1)==MINUS||input.LA(1)==NOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set18), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExp_in_unaryExp559);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:137:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp564);
                    dotArrowExp20=dotArrowExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, unaryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExp"

    public static class dotArrowExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotArrowExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:140:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExp_return oclExp21 = null;

        IoclParser.propertyCallExp_return propertyCallExp22 = null;

        IoclParser.oclExp_return oclExp23 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:2: ( oclExp ( propertyCallExp )+ | oclExp )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:4: oclExp ( propertyCallExp )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp575);
                    oclExp21=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp21.getTree());
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:26: ( propertyCallExp )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ARROW||LA8_0==DOT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
                    	    {
                    	    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp577);
                    	    propertyCallExp22=propertyCallExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(propertyCallExp22.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp584);
                    oclExp23=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp23.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, dotArrowExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotArrowExp"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:145:1: propertyCallExp : ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token set24=null;
        Token ARROW26=null;
        IoclParser.modelPropertyCallExp_return modelPropertyCallExp25 = null;

        IoclParser.loopExp_return loopExp27 = null;


        Object set24_tree=null;
        Object ARROW26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:146:2: ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARROW) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==ITERATE||LA10_1==ITERATOR_NAME) ) {
                    alt10=2;
                }
                else if ( (LA10_1==SELF||LA10_1==NUMERIC_OPERATION||LA10_1==IDENTIFIER) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==DOT) ) {
                alt10=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:146:4: ( DOT | ARROW ) modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set24=(Token)input.LT(1);
                    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp604);
                    modelPropertyCallExp25=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:147:4: ARROW loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    ARROW26=(Token)match(input,ARROW,FOLLOW_ARROW_in_propertyCallExp609); if (state.failed) return retval;
                    pushFollow(FOLLOW_loopExp_in_propertyCallExp612);
                    loopExp27=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:150:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp28 = null;

        IoclParser.attributeCallExp_return attributeCallExp29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:151:2: ( operationCallExp | attributeCallExp )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NUMERIC_OPERATION) ) {
                alt11=1;
            }
            else if ( (LA11_0==SELF||LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred21_Iocl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:151:4: operationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp623);
                    operationCallExp28=operationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp28.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:4: attributeCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeCallExp_in_modelPropertyCallExp628);
                    attributeCallExp29=attributeCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeCallExp29.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:155:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        IoclParser.arguments_return arguments32 = null;

        IoclParser.simpleName_return simpleName34 = null;

        IoclParser.arguments_return arguments36 = null;


        Object NUMERIC_OPERATION30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NUMERIC_OPERATION) ) {
                alt14=1;
            }
            else if ( (LA14_0==SELF||LA14_0==IDENTIFIER) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION30=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION30);

                    char_literal31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal31);

                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:26: ( arguments )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==BREAK||(LA12_0>=COMPUTE && LA12_0<=DO)||LA12_0==IF||(LA12_0>=LCURLY && LA12_0<=LPAREN)||(LA12_0>=MINUS && LA12_0<=NOT)||LA12_0==RAISE||LA12_0==RETURN||LA12_0==SELF||(LA12_0>=TRY && LA12_0<=VAR)||LA12_0==WHILE||(LA12_0>=COLLECTION_TYPE_LITERAL && LA12_0<=IDENTIFIER)||LA12_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp643);
                            arguments32=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments32.getTree());

                            }
                            break;

                    }

                    char_literal33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal33);



                    // AST REWRITE
                    // elements: arguments, NUMERIC_OPERATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:64: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:4: simpleName '(' ( arguments )? ')'
                    {
                    pushFollow(FOLLOW_simpleName_in_operationCallExp660);
                    simpleName34=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleName.add(simpleName34.getTree());
                    char_literal35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal35);

                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:19: ( arguments )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==BREAK||(LA13_0>=COMPUTE && LA13_0<=DO)||LA13_0==IF||(LA13_0>=LCURLY && LA13_0<=LPAREN)||(LA13_0>=MINUS && LA13_0<=NOT)||LA13_0==RAISE||LA13_0==RETURN||LA13_0==SELF||(LA13_0>=TRY && LA13_0<=VAR)||LA13_0==WHILE||(LA13_0>=COLLECTION_TYPE_LITERAL && LA13_0<=IDENTIFIER)||LA13_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp664);
                            arguments36=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments36.getTree());

                            }
                            break;

                    }

                    char_literal37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal37);



                    // AST REWRITE
                    // elements: arguments, simpleName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:34: -> ^( OPERATION_CALL simpleName ( arguments )? )
                    {
                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:37: ^( OPERATION_CALL simpleName ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATION_CALL, "OPERATION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_simpleName.nextTree());
                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:65: ( arguments )?
                        if ( stream_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_arguments.nextTree());

                        }
                        stream_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, operationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExp"

    public static class attributeCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeCallExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:160:1: attributeCallExp : simpleName -> ^( ATTRIBUTE_CALL simpleName ) ;
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName38 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:161:2: ( simpleName -> ^( ATTRIBUTE_CALL simpleName ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:161:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_attributeCallExp689);
            simpleName38=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName38.getTree());


            // AST REWRITE
            // elements: simpleName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:15: -> ^( ATTRIBUTE_CALL simpleName )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:161:18: ^( ATTRIBUTE_CALL simpleName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_CALL, "ATTRIBUTE_CALL"), root_1);

                adaptor.addChild(root_1, stream_simpleName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, attributeCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "attributeCallExp"

    public static class oclExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:1: oclExp : ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression );
    public final IoclParser.oclExp_return oclExp() throws RecognitionException {
        IoclParser.oclExp_return retval = new IoclParser.oclExp_return();
        retval.start = input.LT(1);
        int oclExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        IoclParser.literalExp_return literalExp39 = null;

        IoclParser.variableExp_return variableExp40 = null;

        IoclParser.type_return type41 = null;

        IoclParser.oclExpression_return oclExpression43 = null;


        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:2: ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression )
            int alt15=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==SCOPE) ) {
                    alt15=1;
                }
                else if ( (synpred26_Iocl()) ) {
                    alt15=2;
                }
                else if ( (synpred27_Iocl()) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==LPAREN) ) {
                    alt15=3;
                }
                else if ( (LA15_2==LCURLY) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt15=1;
                }
                break;
            case SELF:
                {
                alt15=2;
                }
                break;
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt15=3;
                }
                break;
            case LPAREN:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp707);
                    literalExp39=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp39.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp713);
                    variableExp40=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp40.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp718);
                    type41=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type41.getTree());

                    }
                    break;
                case 4 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:167:4: '(' oclExpression ')'
                    {
                    char_literal42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal42);

                    pushFollow(FOLLOW_oclExpression_in_oclExp725);
                    oclExpression43=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression43.getTree());
                    char_literal44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal44);



                    // AST REWRITE
                    // elements: oclExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:26: -> oclExpression
                    {
                        adaptor.addChild(root_0, stream_oclExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, oclExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExp"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:170:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName45 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp745);
            simpleName45=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName45.getTree());


            // AST REWRITE
            // elements: simpleName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:15: -> ^( VARIABLE simpleName )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:18: ^( VARIABLE simpleName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_simpleName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:174:1: literalExp : ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.enumerationLiteralExp_return enumerationLiteralExp46 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp47 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:175:2: ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp )
            int alt16=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt16=2;
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:175:4: enumerationLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumerationLiteralExp_in_literalExp764);
                    enumerationLiteralExp46=enumerationLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationLiteralExp46.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:176:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp769);
                    collectionLiteralExp47=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp47.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:177:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp775);
                    primitiveLiteralExp48=primitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExp48.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, literalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExp"

    public static class collectionLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:180:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
    public final IoclParser.collectionLiteralExp_return collectionLiteralExp() throws RecognitionException {
        IoclParser.collectionLiteralExp_return retval = new IoclParser.collectionLiteralExp_return();
        retval.start = input.LT(1);
        int collectionLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal50=null;
        Token char_literal52=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier49 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts51 = null;


        Object char_literal50_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionLiteralParts=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralParts");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp787);
            collectionTypeIdentifier49=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier49.getTree());
            char_literal50=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal50);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:33: ( collectionLiteralParts )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==BREAK||(LA17_0>=COMPUTE && LA17_0<=DO)||LA17_0==IF||(LA17_0>=LCURLY && LA17_0<=LPAREN)||(LA17_0>=MINUS && LA17_0<=NOT)||LA17_0==RAISE||LA17_0==RETURN||LA17_0==SELF||(LA17_0>=TRY && LA17_0<=VAR)||LA17_0==WHILE||(LA17_0>=COLLECTION_TYPE_LITERAL && LA17_0<=IDENTIFIER)||LA17_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp791);
                    collectionLiteralParts51=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts51.getTree());

                    }
                    break;

            }

            char_literal52=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp794); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal52);



            // AST REWRITE
            // elements: collectionTypeIdentifier, collectionLiteralParts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:110: ( collectionLiteralParts )?
                if ( stream_collectionLiteralParts.hasNext() ) {
                    adaptor.addChild(root_1, stream_collectionLiteralParts.nextTree());

                }
                stream_collectionLiteralParts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, collectionLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExp"

    public static class collectionTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifier"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:184:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL53=null;

        Object COLLECTION_TYPE_LITERAL53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:185:2: ( COLLECTION_TYPE_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:185:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL53=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier816); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL53_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL53);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL53_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, collectionTypeIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifier"

    public static class collectionLiteralParts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralParts"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:188:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
    public final IoclParser.collectionLiteralParts_return collectionLiteralParts() throws RecognitionException {
        IoclParser.collectionLiteralParts_return retval = new IoclParser.collectionLiteralParts_return();
        retval.start = input.LT(1);
        int collectionLiteralParts_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal55=null;
        IoclParser.collectionLiteralPart_return collectionLiteralPart54 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts56 = null;


        Object char_literal55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts827);
            collectionLiteralPart54=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart54.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:26: ( ',' collectionLiteralParts )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==73) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred31_Iocl()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:27: ',' collectionLiteralParts
            	    {
            	    char_literal55=(Token)match(input,73,FOLLOW_73_in_collectionLiteralParts830); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts833);
            	    collectionLiteralParts56=collectionLiteralParts();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralParts56.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, collectionLiteralParts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralParts"

    public static class collectionLiteralPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPart"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:192:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression57 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:2: ( oclExpression )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart846);
            oclExpression57=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression57.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, collectionLiteralPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPart"

    public static class primitiveLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:196:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
    public final IoclParser.primitiveLiteralExp_return primitiveLiteralExp() throws RecognitionException {
        IoclParser.primitiveLiteralExp_return retval = new IoclParser.primitiveLiteralExp_return();
        retval.start = input.LT(1);
        int primitiveLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExp_return numericLiteralExp58 = null;

        IoclParser.stringLiteralExp_return stringLiteralExp59 = null;

        IoclParser.booleanLiteralExp_return booleanLiteralExp60 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
            int alt19=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt19=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt19=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp857);
                    numericLiteralExp58=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp58.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp862);
                    stringLiteralExp59=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp59.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:199:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp867);
                    booleanLiteralExp60=booleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExp60.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, primitiveLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExp"

    public static class numericLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:202:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp61 = null;

        IoclParser.realLiteralExp_return realLiteralExp62 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:203:2: ( integerLiteralExp | realLiteralExp )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INTEGER_LITERAL) ) {
                alt20=1;
            }
            else if ( (LA20_0==REAL_LITERAL) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:203:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp878);
                    integerLiteralExp61=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp61.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:204:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp883);
                    realLiteralExp62=realLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExp62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, numericLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExp"

    public static class stringLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:207:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL63=null;

        Object STRING_LITERAL63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:208:2: ( STRING_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:208:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL63=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp898); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL63_tree = (Object)adaptor.create(STRING_LITERAL63);
            adaptor.addChild(root_0, STRING_LITERAL63_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, stringLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExp"

    public static class booleanLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:211:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL64=null;

        Object BOOLEAN_LITERAL64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:212:2: ( BOOLEAN_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:212:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL64=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp909); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL64_tree = (Object)adaptor.create(BOOLEAN_LITERAL64);
            adaptor.addChild(root_0, BOOLEAN_LITERAL64_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, booleanLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExp"

    public static class integerLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:215:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL65=null;

        Object INTEGER_LITERAL65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:2: ( INTEGER_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL65=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL65_tree = (Object)adaptor.create(INTEGER_LITERAL65);
            adaptor.addChild(root_0, INTEGER_LITERAL65_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, integerLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExp"

    public static class realLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:219:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL66=null;

        Object REAL_LITERAL66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:2: ( REAL_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL66=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp932); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL66_tree = (Object)adaptor.create(REAL_LITERAL66);
            adaptor.addChild(root_0, REAL_LITERAL66_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, realLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExp"

    public static class enumerationLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumerationLiteralExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:223:1: enumerationLiteralExp : IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) ;
    public final IoclParser.enumerationLiteralExp_return enumerationLiteralExp() throws RecognitionException {
        IoclParser.enumerationLiteralExp_return retval = new IoclParser.enumerationLiteralExp_return();
        retval.start = input.LT(1);
        int enumerationLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER67=null;
        Token SCOPE68=null;
        Token IDENTIFIER69=null;

        Object IDENTIFIER67_tree=null;
        Object SCOPE68_tree=null;
        Object IDENTIFIER69_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:2: ( IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:4: IDENTIFIER ( SCOPE IDENTIFIER )+
            {
            IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER67);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:15: ( SCOPE IDENTIFIER )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SCOPE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE68=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_enumerationLiteralExp946); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE68);

            	    IDENTIFIER69=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp948); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER69);


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:35: -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:38: ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUM_LITERAL, "ENUM_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, enumerationLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumerationLiteralExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:227:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp70 = null;

        IoclParser.iterateExp_return iterateExp71 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:2: ( iteratorExp | iterateExp )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ITERATOR_NAME) ) {
                alt22=1;
            }
            else if ( (LA22_0==ITERATE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp973);
                    iteratorExp70=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp70.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:229:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp978);
                    iterateExp71=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp71.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, loopExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loopExp"

    public static class iteratorExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:232:1: iteratorExp : ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATOR_NAME72=null;
        Token LPAREN73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token RPAREN77=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression76 = null;


        Object ITERATOR_NAME72_tree=null;
        Object LPAREN73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object RPAREN77_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:2: ( ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:4: ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            ITERATOR_NAME72=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME72);

            LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN73);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:26: (v1= variableDeclaration ',' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==IDENTIFIER) ) {
                        int LA23_1 = input.LA(2);

                        if ( (synpred37_Iocl()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:27: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp999);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal74=(Token)match(input,73,FOLLOW_73_in_iteratorExp1001); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_73.add(char_literal74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1009);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal75=(Token)match(input,74,FOLLOW_74_in_iteratorExp1011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal75);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp1015);
            oclExpression76=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression76.getTree());
            RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN77);



            // AST REWRITE
            // elements: v1, oclExpression, v2, ITERATOR_NAME
            // token labels: 
            // rule labels: v1, retval, v2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:3: -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:6: ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:31: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:36: ( $v2)?
                if ( stream_v2.hasNext() ) {
                    adaptor.addChild(root_1, stream_v2.nextTree());

                }
                stream_v2.reset();
                adaptor.addChild(root_1, stream_oclExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, iteratorExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorExp"

    public static class iterateExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterateExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:1: iterateExp : ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATE78=null;
        Token LPAREN79=null;
        Token SEMICOLON80=null;
        Token char_literal81=null;
        Token RPAREN83=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression82 = null;


        Object ITERATE78_tree=null;
        Object LPAREN79_tree=null;
        Object SEMICOLON80_tree=null;
        Object char_literal81_tree=null;
        Object RPAREN83_tree=null;
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:2: ( ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:4: ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            ITERATE78=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE78);

            LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp1051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:19: (v1= variableDeclaration SEMICOLON )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENTIFIER) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred39_Iocl()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:20: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp1058);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON80=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp1060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON80);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1068);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal81=(Token)match(input,74,FOLLOW_74_in_iterateExp1071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal81);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1073);
            oclExpression82=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression82.getTree());
            RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1075); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN83);



            // AST REWRITE
            // elements: v2, oclExpression, v1, ITERATE
            // token labels: 
            // rule labels: v1, retval, v2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:3: -> ^( ITERATE ( $v1)? $v2 oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:6: ^( ITERATE ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:16: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                adaptor.addChild(root_1, stream_v2.nextTree());
                adaptor.addChild(root_1, stream_oclExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, iterateExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterateExp"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:242:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        IoclParser.type_return type86 = null;

        IoclParser.oclExpression_return oclExpression88 = null;


        Object IDENTIFIER84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:15: ( ':' type )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:16: ':' type
                    {
                    char_literal85=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal85);

                    pushFollow(FOLLOW_type_in_variableDeclaration1109);
                    type86=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type86.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:27: ( '=' oclExpression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQUAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:28: '=' oclExpression
                    {
                    char_literal87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal87);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1116);
                    oclExpression88=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression88.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, oclExpression, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:79: ( oclExpression )?
                if ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal90=null;
        IoclParser.oclExpression_return oclExpression89 = null;

        IoclParser.oclExpression_return oclExpression91 = null;


        Object char_literal90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:2: ( oclExpression ( ',' oclExpression )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1143);
            oclExpression89=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression89.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:18: ( ',' oclExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==73) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:19: ',' oclExpression
            	    {
            	    char_literal90=(Token)match(input,73,FOLLOW_73_in_arguments1146); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1149);
            	    oclExpression91=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression91.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set92=null;

        Object set92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:2: ( SELF | IDENTIFIER )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set92=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set92));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, simpleName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL93=null;

        Object PRIMITIVE_TYPE_LITERAL93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL93=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL93_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL93);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL93_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:1: collectionType : collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN95=null;
        Token RPAREN97=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier94 = null;

        IoclParser.type_return type96 = null;


        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:2: ( collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:4: collectionTypeIdentifier LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1190);
            collectionTypeIdentifier94=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier94.getTree());
            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN95);

            pushFollow(FOLLOW_type_in_collectionType1194);
            type96=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type96.getTree());
            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);



            // AST REWRITE
            // elements: type, collectionTypeIdentifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 260:48: -> ^( COLLECTION_TYPE collectionTypeIdentifier type )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:51: ^( COLLECTION_TYPE collectionTypeIdentifier type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_TYPE, "COLLECTION_TYPE"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:263:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType98 = null;

        IoclParser.collectionType_return collectionType99 = null;

        IoclParser.pathName_return pathName100 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:264:2: ( primitiveType | collectionType | pathName )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt29=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt29=2;
                }
                break;
            case IDENTIFIER:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:264:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1218);
                    primitiveType98=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType98.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:265:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1223);
                    collectionType99=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType99.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:266:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1228);
                    pathName100=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName100.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:269:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER101=null;
        Token SCOPE102=null;
        Token IDENTIFIER103=null;

        Object IDENTIFIER101_tree=null;
        Object SCOPE102_tree=null;
        Object IDENTIFIER103_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER101);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:15: ( SCOPE IDENTIFIER )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SCOPE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE102=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1242); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE102);

            	    IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1244); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER103);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:35: -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:38: ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_NAME, "PATH_NAME"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:61: ( IDENTIFIER )*
                while ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:275:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp104 = null;

        IoclParser.breakExp_return breakExp105 = null;

        IoclParser.computeExp_return computeExp106 = null;

        IoclParser.continueExp_return continueExp107 = null;

        IoclParser.returnExp_return returnExp108 = null;

        IoclParser.variableInitExp_return variableInitExp109 = null;

        IoclParser.assignExp_return assignExp110 = null;

        IoclParser.raiseExp_return raiseExp111 = null;

        IoclParser.whileExp_return whileExp112 = null;

        IoclParser.ifExp_return ifExp113 = null;

        IoclParser.tryExp_return tryExp114 = null;

        IoclParser.forExp_return forExp115 = null;

        IoclParser.instantiationExp_return instantiationExp116 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1270);
                    blockExp104=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp104.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1275);
                    breakExp105=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp105.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:278:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1280);
                    computeExp106=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp106.getTree());

                    }
                    break;
                case 4 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1285);
                    continueExp107=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp107.getTree());

                    }
                    break;
                case 5 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:280:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1290);
                    returnExp108=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp108.getTree());

                    }
                    break;
                case 6 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:281:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1295);
                    variableInitExp109=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp109.getTree());

                    }
                    break;
                case 7 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1300);
                    assignExp110=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp110.getTree());

                    }
                    break;
                case 8 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:283:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1305);
                    raiseExp111=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp111.getTree());

                    }
                    break;
                case 9 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1310);
                    whileExp112=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp112.getTree());

                    }
                    break;
                case 10 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:285:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1315);
                    ifExp113=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp113.getTree());

                    }
                    break;
                case 11 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:286:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1320);
                    tryExp114=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp114.getTree());

                    }
                    break;
                case 12 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:287:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1325);
                    forExp115=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp115.getTree());

                    }
                    break;
                case 13 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:4: instantiationExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instantiationExp_in_imperativeExp1330);
                    instantiationExp116=instantiationExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instantiationExp116.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:291:1: blockExp : ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO117=null;
        Token LCURLY118=null;
        Token RCURLY120=null;
        IoclParser.oclExpression_return oclExpression119 = null;


        Object DO117_tree=null;
        Object LCURLY118_tree=null;
        Object RCURLY120_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:2: ( ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:4: ( DO )? LCURLY ( oclExpression )* RCURLY
            {
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:4: ( DO )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DO) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO117=(Token)match(input,DO,FOLLOW_DO_in_blockExp1341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO117);


                    }
                    break;

            }

            LCURLY118=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY118);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:15: ( oclExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==BREAK||(LA33_0>=COMPUTE && LA33_0<=DO)||LA33_0==IF||(LA33_0>=LCURLY && LA33_0<=LPAREN)||(LA33_0>=MINUS && LA33_0<=NOT)||LA33_0==RAISE||LA33_0==RETURN||LA33_0==SELF||(LA33_0>=TRY && LA33_0<=VAR)||LA33_0==WHILE||(LA33_0>=COLLECTION_TYPE_LITERAL && LA33_0<=IDENTIFIER)||LA33_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_blockExp1346);
            	    oclExpression119=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression119.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            RCURLY120=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY120);



            // AST REWRITE
            // elements: oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:37: -> ^( BLOCK ( oclExpression )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:40: ^( BLOCK ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:48: ( oclExpression )*
                while ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:295:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK121=null;
        Token SEMICOLON122=null;

        Object BREAK121_tree=null;
        Object SEMICOLON122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:2: ( BREAK SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK121=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1369); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK121_tree = (Object)adaptor.create(BREAK121);
            root_0 = (Object)adaptor.becomeRoot(BREAK121_tree, root_0);
            }
            SEMICOLON122=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON122_tree = (Object)adaptor.create(SEMICOLON122);
            adaptor.addChild(root_0, SEMICOLON122_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:299:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE123=null;
        Token LPAREN124=null;
        Token RPAREN126=null;
        IoclParser.variableDeclaration_return variableDeclaration125 = null;

        IoclParser.oclExpression_return oclExpression127 = null;


        Object COMPUTE123_tree=null;
        Object LPAREN124_tree=null;
        Object RPAREN126_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:300:2: ( COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:300:4: COMPUTE LPAREN variableDeclaration RPAREN oclExpression
            {
            COMPUTE123=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE123);

            LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN124);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1387);
            variableDeclaration125=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration125.getTree());
            RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN126);

            pushFollow(FOLLOW_oclExpression_in_computeExp1391);
            oclExpression127=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression127.getTree());


            // AST REWRITE
            // elements: oclExpression, COMPUTE, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:60: -> ^( COMPUTE variableDeclaration oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:300:63: ^( COMPUTE variableDeclaration oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_COMPUTE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_variableDeclaration.nextTree());
                adaptor.addChild(root_1, stream_oclExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:303:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE128=null;
        Token SEMICOLON129=null;

        Object CONTINUE128_tree=null;
        Object SEMICOLON129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:304:2: ( CONTINUE SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:304:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE128=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE128_tree = (Object)adaptor.create(CONTINUE128);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE128_tree, root_0);
            }
            SEMICOLON129=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1415); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON129_tree = (Object)adaptor.create(SEMICOLON129);
            adaptor.addChild(root_0, SEMICOLON129_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:1: returnExp : RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN130=null;
        Token SEMICOLON132=null;
        IoclParser.oclExpression_return oclExpression131 = null;


        Object RETURN130_tree=null;
        Object SEMICOLON132_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:2: ( RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:4: RETURN ( oclExpression )? SEMICOLON
            {
            RETURN130=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN130);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:11: ( oclExpression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BREAK||(LA34_0>=COMPUTE && LA34_0<=DO)||LA34_0==IF||(LA34_0>=LCURLY && LA34_0<=LPAREN)||(LA34_0>=MINUS && LA34_0<=NOT)||LA34_0==RAISE||LA34_0==RETURN||LA34_0==SELF||(LA34_0>=TRY && LA34_0<=VAR)||LA34_0==WHILE||(LA34_0>=COLLECTION_TYPE_LITERAL && LA34_0<=IDENTIFIER)||LA34_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_returnExp1428);
                    oclExpression131=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression131.getTree());

                    }
                    break;

            }

            SEMICOLON132=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON132);



            // AST REWRITE
            // elements: oclExpression, RETURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:36: -> ^( RETURN ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:39: ^( RETURN ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:48: ( oclExpression )?
                if ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:311:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR133=null;
        Token SEMICOLON135=null;
        IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations134 = null;


        Object VAR133_tree=null;
        Object SEMICOLON135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:312:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:312:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR133=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR133_tree = (Object)adaptor.create(VAR133);
            root_0 = (Object)adaptor.becomeRoot(VAR133_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1454);
            imperativeVarDeclarations134=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations134.getTree());
            SEMICOLON135=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1456); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class imperativeVarDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclarations"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:315:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
    public final IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations() throws RecognitionException {
        IoclParser.imperativeVarDeclarations_return retval = new IoclParser.imperativeVarDeclarations_return();
        retval.start = input.LT(1);
        int imperativeVarDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal137=null;
        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration136 = null;

        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration138 = null;


        Object char_literal137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:316:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:316:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1469);
            imperativeVarDeclaration136=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration136.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:316:29: ( ',' imperativeVarDeclaration )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==73) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:316:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal137=(Token)match(input,73,FOLLOW_73_in_imperativeVarDeclarations1472); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1475);
            	    imperativeVarDeclaration138=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration138.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, imperativeVarDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclarations"

    public static class imperativeVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclaration"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:319:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration() throws RecognitionException {
        IoclParser.imperativeVarDeclaration_return retval = new IoclParser.imperativeVarDeclaration_return();
        retval.start = input.LT(1);
        int imperativeVarDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER139=null;
        Token char_literal140=null;
        Token EQUAL142=null;
        Token IS143=null;
        IoclParser.type_return type141 = null;

        IoclParser.oclExpression_return oclExpression144 = null;


        Object IDENTIFIER139_tree=null;
        Object char_literal140_tree=null;
        Object EQUAL142_tree=null;
        Object IS143_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )?
            {
            IDENTIFIER139=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER139);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:15: ( ':' type )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COLON) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:16: ':' type
                    {
                    char_literal140=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal140);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1494);
                    type141=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type141.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:27: ( ( EQUAL | IS ) oclExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==EQUAL||LA38_0==IS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:28: ( EQUAL | IS ) oclExpression
                    {
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:28: ( EQUAL | IS )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==EQUAL) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==IS) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:29: EQUAL
                            {
                            EQUAL142=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1500); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL142);


                            }
                            break;
                        case 2 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:37: IS
                            {
                            IS143=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1504); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS143);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_oclExpression_in_imperativeVarDeclaration1508);
                    oclExpression144=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression144.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: oclExpression, IDENTIFIER, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 320:58: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:61: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:83: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:89: ( oclExpression )?
                if ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, imperativeVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclaration"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:1: assignExp : dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set146=null;
        Token SEMICOLON148=null;
        IoclParser.dotArrowExp_return dotArrowExp145 = null;

        IoclParser.oclExpression_return oclExpression147 = null;


        Object set146_tree=null;
        Object SEMICOLON148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:324:2: ( dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:324:4: dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dotArrowExp_in_assignExp1535);
            dotArrowExp145=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp145.getTree());
            set146=(Token)input.LT(1);
            set146=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set146), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_oclExpression_in_assignExp1546);
            oclExpression147=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression147.getTree());
            SEMICOLON148=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1548); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:327:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE149=null;
        Token STRING_LITERAL151=null;
        Token SEMICOLON152=null;
        IoclParser.type_return type150 = null;


        Object RAISE149_tree=null;
        Object STRING_LITERAL151_tree=null;
        Object SEMICOLON152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE149=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE149_tree = (Object)adaptor.create(RAISE149);
            root_0 = (Object)adaptor.becomeRoot(RAISE149_tree, root_0);
            }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:11: ( type | STRING_LITERAL )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLLECTION_TYPE_LITERAL||LA39_0==IDENTIFIER||LA39_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt39=1;
            }
            else if ( (LA39_0==STRING_LITERAL) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1564);
                    type150=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type150.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:19: STRING_LITERAL
                    {
                    STRING_LITERAL151=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL151_tree = (Object)adaptor.create(STRING_LITERAL151);
                    adaptor.addChild(root_0, STRING_LITERAL151_tree);
                    }

                    }
                    break;

            }

            SEMICOLON152=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1571); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:331:1: whileExp : WHILE LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE153=null;
        Token LPAREN154=null;
        Token RPAREN155=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object WHILE153_tree=null;
        Object LPAREN154_tree=null;
        Object RPAREN155_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:332:2: ( WHILE LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( WHILE $condition $body) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:332:4: WHILE LPAREN condition= oclExpression RPAREN body= oclExpression
            {
            WHILE153=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE153);

            LPAREN154=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN154);

            pushFollow(FOLLOW_oclExpression_in_whileExp1591);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN155);

            pushFollow(FOLLOW_oclExpression_in_whileExp1602);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: WHILE, body, condition
            // token labels: 
            // rule labels: body, retval, condition
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:24: -> ^( WHILE $condition $body)
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:27: ^( WHILE $condition $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:336:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF156=null;
        Token ENDIF160=null;
        IoclParser.altExp_return altExp157 = null;

        IoclParser.elifExp_return elifExp158 = null;

        IoclParser.elseExp_return elseExp159 = null;


        Object IF156_tree=null;
        Object ENDIF160_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF156=(Token)match(input,IF,FOLLOW_IF_in_ifExp1625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF156);

            pushFollow(FOLLOW_altExp_in_ifExp1627);
            altExp157=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp157.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:14: ( elifExp )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ELIF) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred68_Iocl()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1630);
            	    elifExp158=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp158.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:25: ( elseExp )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ELSE) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred69_Iocl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1635);
                    elseExp159=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp159.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:36: ( ENDIF )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ENDIF) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred70_Iocl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF160=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF160);


                    }
                    break;

            }



            // AST REWRITE
            // elements: altExp, elifExp, elseExp, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:67: ( elseExp )?
                if ( stream_elseExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseExp.nextTree());

                }
                stream_elseExp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:340:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF161=null;
        IoclParser.altExp_return altExp162 = null;


        Object ELIF161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:2: ( ELIF altExp )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF161=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1665); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1668);
            altExp162=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp162.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:344:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE163=null;
        IoclParser.oclExpression_return oclExpression164 = null;


        Object ELSE163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:345:2: ( ELSE oclExpression )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:345:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE163=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1680); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1683);
            oclExpression164=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression164.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:348:1: altExp : LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN165=null;
        Token RPAREN166=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object LPAREN165_tree=null;
        Object RPAREN166_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:349:2: ( LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:349:4: LPAREN condition= oclExpression RPAREN body= oclExpression
            {
            LPAREN165=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN165);

            pushFollow(FOLLOW_oclExpression_in_altExp1702);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN166=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN166);

            pushFollow(FOLLOW_oclExpression_in_altExp1711);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: condition, body
            // token labels: 
            // rule labels: body, retval, condition
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);

            root_0 = (Object)adaptor.nil();
            // 349:66: -> ^( ALT_EXP $condition $body)
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:349:69: ^( ALT_EXP $condition $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALT_EXP, "ALT_EXP"), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:1: tryExp : TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY167=null;
        Token LCURLY168=null;
        Token RCURLY170=null;
        IoclParser.oclExpression_return oclExpression169 = null;

        IoclParser.except_return except171 = null;


        Object TRY167_tree=null;
        Object LCURLY168_tree=null;
        Object RCURLY170_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:2: ( TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:4: TRY LCURLY ( oclExpression )* RCURLY except
            {
            TRY167=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY167);

            LCURLY168=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1736); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY168);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:15: ( oclExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BREAK||(LA43_0>=COMPUTE && LA43_0<=DO)||LA43_0==IF||(LA43_0>=LCURLY && LA43_0<=LPAREN)||(LA43_0>=MINUS && LA43_0<=NOT)||LA43_0==RAISE||LA43_0==RETURN||LA43_0==SELF||(LA43_0>=TRY && LA43_0<=VAR)||LA43_0==WHILE||(LA43_0>=COLLECTION_TYPE_LITERAL && LA43_0<=IDENTIFIER)||LA43_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_tryExp1738);
            	    oclExpression169=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression169.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            RCURLY170=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1741); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY170);

            pushFollow(FOLLOW_except_in_tryExp1743);
            except171=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except171.getTree());


            // AST REWRITE
            // elements: oclExpression, TRY, except
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:44: -> ^( TRY ( oclExpression )* except )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:47: ^( TRY ( oclExpression )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:53: ( oclExpression )*
                while ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();
                adaptor.addChild(root_1, stream_except.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:356:1: except : EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT172=null;
        Token LPAREN173=null;
        Token RPAREN175=null;
        Token LCURLY176=null;
        Token RCURLY178=null;
        IoclParser.type_return type174 = null;

        IoclParser.oclExpression_return oclExpression177 = null;


        Object EXCEPT172_tree=null;
        Object LPAREN173_tree=null;
        Object RPAREN175_tree=null;
        Object LCURLY176_tree=null;
        Object RCURLY178_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:2: ( EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:4: EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY
            {
            EXCEPT172=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT172);

            LPAREN173=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN173);

            pushFollow(FOLLOW_type_in_except1769);
            type174=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type174.getTree());
            RPAREN175=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN175);

            LCURLY176=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1773); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY176);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:37: ( oclExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==BREAK||(LA44_0>=COMPUTE && LA44_0<=DO)||LA44_0==IF||(LA44_0>=LCURLY && LA44_0<=LPAREN)||(LA44_0>=MINUS && LA44_0<=NOT)||LA44_0==RAISE||LA44_0==RETURN||LA44_0==SELF||(LA44_0>=TRY && LA44_0<=VAR)||LA44_0==WHILE||(LA44_0>=COLLECTION_TYPE_LITERAL && LA44_0<=IDENTIFIER)||LA44_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_except1775);
            	    oclExpression177=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression177.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            RCURLY178=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY178);



            // AST REWRITE
            // elements: type, EXCEPT, oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 357:59: -> ^( EXCEPT type ( oclExpression )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:62: ^( EXCEPT type ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:76: ( oclExpression )*
                while ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:360:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW180=null;
        Token FOR_NAME181=null;
        Token LPAREN182=null;
        Token char_literal184=null;
        Token RPAREN185=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;

        IoclParser.oclExp_return oclExp179 = null;

        IoclParser.iteratorList_return iteratorList183 = null;


        Object ARROW180_tree=null;
        Object FOR_NAME181_tree=null;
        Object LPAREN182_tree=null;
        Object char_literal184_tree=null;
        Object RPAREN185_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:361:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:361:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression
            {
            pushFollow(FOLLOW_oclExp_in_forExp1801);
            oclExp179=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp179.getTree());
            ARROW180=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW180);

            FOR_NAME181=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME181);

            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_iteratorList_in_forExp1809);
            iteratorList183=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList183.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:361:46: ( '|' condition= oclExpression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==74) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:361:47: '|' condition= oclExpression
                    {
                    char_literal184=(Token)match(input,74,FOLLOW_74_in_forExp1812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal184);

                    pushFollow(FOLLOW_oclExpression_in_forExp1818);
                    condition=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());

                    }
                    break;

            }

            RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);

            pushFollow(FOLLOW_oclExpression_in_forExp1828);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: oclExp, FOR_NAME, body, iteratorList, condition
            // token labels: 
            // rule labels: body, retval, condition
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition",condition!=null?condition.tree:null);

            root_0 = (Object)adaptor.nil();
            // 362:3: -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:6: ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:41: ( $condition)?
                if ( stream_condition.hasNext() ) {
                    adaptor.addChild(root_1, stream_condition.nextTree());

                }
                stream_condition.reset();
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:365:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal187=null;
        IoclParser.variableDeclaration_return variableDeclaration186 = null;

        IoclParser.variableDeclaration_return variableDeclaration188 = null;


        Object char_literal187_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1860);
            variableDeclaration186=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration186.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:24: ( ',' variableDeclaration )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==73) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:25: ',' variableDeclaration
            	    {
            	    char_literal187=(Token)match(input,73,FOLLOW_73_in_iteratorList1863); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1866);
            	    variableDeclaration188=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration188.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    public static class instantiationExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instantiationExp"
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:369:1: instantiationExp : NEW pathName '(' ( arguments )? ')' ;
    public final IoclParser.instantiationExp_return instantiationExp() throws RecognitionException {
        IoclParser.instantiationExp_return retval = new IoclParser.instantiationExp_return();
        retval.start = input.LT(1);
        int instantiationExp_StartIndex = input.index();
        Object root_0 = null;

        Token NEW189=null;
        Token char_literal191=null;
        Token char_literal193=null;
        IoclParser.pathName_return pathName190 = null;

        IoclParser.arguments_return arguments192 = null;


        Object NEW189_tree=null;
        Object char_literal191_tree=null;
        Object char_literal193_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:2: ( NEW pathName '(' ( arguments )? ')' )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:4: NEW pathName '(' ( arguments )? ')'
            {
            root_0 = (Object)adaptor.nil();

            NEW189=(Token)match(input,NEW,FOLLOW_NEW_in_instantiationExp1879); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEW189_tree = (Object)adaptor.create(NEW189);
            root_0 = (Object)adaptor.becomeRoot(NEW189_tree, root_0);
            }
            pushFollow(FOLLOW_pathName_in_instantiationExp1882);
            pathName190=pathName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName190.getTree());
            char_literal191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_instantiationExp1884); if (state.failed) return retval;
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:23: ( arguments )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==BREAK||(LA47_0>=COMPUTE && LA47_0<=DO)||LA47_0==IF||(LA47_0>=LCURLY && LA47_0<=LPAREN)||(LA47_0>=MINUS && LA47_0<=NOT)||LA47_0==RAISE||LA47_0==RETURN||LA47_0==SELF||(LA47_0>=TRY && LA47_0<=VAR)||LA47_0==WHILE||(LA47_0>=COLLECTION_TYPE_LITERAL && LA47_0<=IDENTIFIER)||LA47_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_instantiationExp1887);
                    arguments192=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments192.getTree());

                    }
                    break;

            }

            char_literal193=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_instantiationExp1890); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, instantiationExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instantiationExp"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:111:4: ( imperativeExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:111:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl396);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred12_Iocl
    public final void synpred12_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:23: ( ( PLUS | MINUS ) multiplicativeExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:23: ( PLUS | MINUS ) multiplicativeExp
        {
        if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multiplicativeExp_in_synpred12_Iocl511);
        multiplicativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Iocl

    // $ANTLR start synpred18_Iocl
    public final void synpred18_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:4: ( oclExp ( propertyCallExp )+ )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:4: oclExp ( propertyCallExp )+
        {
        pushFollow(FOLLOW_oclExp_in_synpred18_Iocl575);
        oclExp();

        state._fsp--;
        if (state.failed) return ;
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:26: ( propertyCallExp )+
        int cnt48=0;
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ARROW||LA48_0==DOT) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
        	    {
        	    pushFollow(FOLLOW_propertyCallExp_in_synpred18_Iocl577);
        	    propertyCallExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt48 >= 1 ) break loop48;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(48, input);
                    throw eee;
            }
            cnt48++;
        } while (true);


        }
    }
    // $ANTLR end synpred18_Iocl

    // $ANTLR start synpred21_Iocl
    public final void synpred21_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:151:4: ( operationCallExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:151:4: operationCallExp
        {
        pushFollow(FOLLOW_operationCallExp_in_synpred21_Iocl623);
        operationCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Iocl

    // $ANTLR start synpred26_Iocl
    public final void synpred26_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:4: ( variableExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred26_Iocl713);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Iocl

    // $ANTLR start synpred27_Iocl
    public final void synpred27_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: ( type )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: type
        {
        pushFollow(FOLLOW_type_in_synpred27_Iocl718);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:27: ( ',' collectionLiteralParts )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:27: ',' collectionLiteralParts
        {
        match(input,73,FOLLOW_73_in_synpred31_Iocl830); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred31_Iocl833);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred37_Iocl
    public final void synpred37_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:27: (v1= variableDeclaration ',' )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:27: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred37_Iocl999);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,73,FOLLOW_73_in_synpred37_Iocl1001); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Iocl

    // $ANTLR start synpred38_Iocl
    public final void synpred38_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:26: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:26: (v1= variableDeclaration ',' )?
        int alt50=2;
        int LA50_0 = input.LA(1);

        if ( (LA50_0==IDENTIFIER) ) {
            int LA50_1 = input.LA(2);

            if ( (synpred37_Iocl()) ) {
                alt50=1;
            }
        }
        switch (alt50) {
            case 1 :
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:27: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred38_Iocl999);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,73,FOLLOW_73_in_synpred38_Iocl1001); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred38_Iocl1009);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,74,FOLLOW_74_in_synpred38_Iocl1011); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Iocl

    // $ANTLR start synpred39_Iocl
    public final void synpred39_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:20: (v1= variableDeclaration SEMICOLON )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:20: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred39_Iocl1058);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred39_Iocl1060); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Iocl

    // $ANTLR start synpred53_Iocl
    public final void synpred53_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:4: ( assignExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred53_Iocl1300);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Iocl

    // $ANTLR start synpred58_Iocl
    public final void synpred58_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:287:4: ( forExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:287:4: forExp
        {
        pushFollow(FOLLOW_forExp_in_synpred58_Iocl1325);
        forExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Iocl

    // $ANTLR start synpred68_Iocl
    public final void synpred68_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:15: ( elifExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred68_Iocl1630);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Iocl

    // $ANTLR start synpred69_Iocl
    public final void synpred69_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:26: ( elseExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred69_Iocl1635);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Iocl

    // $ANTLR start synpred70_Iocl
    public final void synpred70_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:36: ( ENDIF )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred70_Iocl1639); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Iocl

    // Delegated rules

    public final boolean synpred58_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\12\7\uffff\11\0\6\uffff";
    static final String DFA1_maxS =
        "\1\101\7\uffff\11\0\6\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\24\uffff\1\2";
    static final String DFA1_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\3\1\13\uffff\1\1\3\uffff\1\1\1\20\2\uffff\1\26"+
            "\1\1\1\26\6\uffff\1\1\1\uffff\1\1\2\uffff\1\16\1\uffff\2\1\1"+
            "\uffff\1\1\2\uffff\1\11\1\14\1\15\1\12\1\13\1\10\1\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "110:1: oclExpression : ( imperativeExp | logicalExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\45\uffff";
    static final String DFA5_eofS =
        "\1\1\44\uffff";
    static final String DFA5_minS =
        "\1\5\36\uffff\1\0\5\uffff";
    static final String DFA5_maxS =
        "\1\112\36\uffff\1\0\5\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\42\uffff\1\1";
    static final String DFA5_specialS =
        "\37\uffff\1\0\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\4\uffff\1\1\3\uffff\3\1\2\uffff\1\1\1\uffff\3\1\2\uffff"+
            "\3\1\3\uffff\4\1\1\37\3\1\2\uffff\1\1\1\uffff\1\44\4\1\1\uffff"+
            "\4\1\1\uffff\2\1\1\uffff\6\1\1\uffff\1\1\7\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 128:22: ( ( PLUS | MINUS ) multiplicativeExp )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_31 = input.LA(1);

                         
                        int index5_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_Iocl()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\41\11\0\2\uffff";
    static final String DFA9_maxS =
        "\1\101\11\0\2\uffff";
    static final String DFA9_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\11\20\uffff\1\7\7\uffff\1\2\1\5\1\6\1\3\1\4\1\1\1\uffff\1"+
            "\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "140:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\30\uffff";
    static final String DFA24_eofS =
        "\30\uffff";
    static final String DFA24_minS =
        "\1\12\1\0\26\uffff";
    static final String DFA24_maxS =
        "\1\101\1\0\26\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\3\uffff\3\2\13\uffff\1\2\3\uffff\2\2\2\uffff\3\2\6\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\5\2\1\1\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "233:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\30\uffff";
    static final String DFA31_eofS =
        "\30\uffff";
    static final String DFA31_minS =
        "\1\12\7\uffff\11\0\7\uffff";
    static final String DFA31_maxS =
        "\1\101\7\uffff\11\0\7\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\11\uffff\1\10\1\11\1\12"+
        "\1\13\1\15\1\7\1\14";
    static final String DFA31_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\3\3\uffff\1\4\1\5\1\1\13\uffff\1\23\3\uffff\1\1\1\20\3\uffff"+
            "\1\25\7\uffff\1\21\1\uffff\1\6\2\uffff\1\16\1\uffff\1\24\1\7"+
            "\1\uffff\1\22\2\uffff\1\11\1\14\1\15\1\12\1\13\1\10\1\uffff"+
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "275:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp412 = new BitSet(new long[]{0x0100040000000022L});
    public static final BitSet FOLLOW_set_in_logicalExp415 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp428 = new BitSet(new long[]{0x0100040000000022L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp441 = new BitSet(new long[]{0x0000008000800002L});
    public static final BitSet FOLLOW_set_in_equalityExp444 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp453 = new BitSet(new long[]{0x0000008000800002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp466 = new BitSet(new long[]{0x0000000C0C000002L});
    public static final BitSet FOLLOW_set_in_relationalExp469 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp486 = new BitSet(new long[]{0x0000000C0C000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp499 = new BitSet(new long[]{0x0000101000000002L});
    public static final BitSet FOLLOW_set_in_additiveExp502 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp511 = new BitSet(new long[]{0x0000101000000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp524 = new BitSet(new long[]{0x0000010000020002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp527 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp537 = new BitSet(new long[]{0x0000010000020002L});
    public static final BitSet FOLLOW_set_in_unaryExp550 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp575 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp577 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyCallExp595 = new BitSet(new long[]{0x8204000000000000L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_propertyCallExp609 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeCallExp_in_modelPropertyCallExp628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp639 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp641 = new BitSet(new long[]{0xFCB5A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp643 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp660 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp662 = new BitSet(new long[]{0xFCB5A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp664 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp723 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_oclExp725 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerationLiteralExp_in_literalExp764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp787 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp789 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp791 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_collectionLiteralParts830 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp943 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_enumerationLiteralExp946 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp948 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp989 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp991 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iteratorExp1001 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iteratorExp1011 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp1015 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp1049 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp1051 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1058 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp1060 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iterateExp1071 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1073 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1104 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1107 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1109 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1114 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_arguments1146 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1190 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1192 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_collectionType1194 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1239 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1242 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1244 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiationExp_in_imperativeExp1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1341 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1344 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_blockExp1346 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1369 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1383 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1385 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1387 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1389 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1412 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1426 = new BitSet(new long[]{0xFCBCA0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_returnExp1428 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1451 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1454 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_imperativeVarDeclarations1472 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1489 = new BitSet(new long[]{0x0000000080802002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1492 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1494 = new BitSet(new long[]{0x0000000080800002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1500 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1504 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_imperativeVarDeclaration1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_assignExp1535 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_set_in_assignExp1537 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_assignExp1546 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1560 = new BitSet(new long[]{0x8C00000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_raiseExp1564 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1568 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1583 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1585 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1591 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1593 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1625 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1627 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1630 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1635 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1665 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1680 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1696 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1702 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1704 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1734 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1736 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_tryExp1738 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1741 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_except_in_tryExp1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1765 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1767 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_except1769 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1771 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1773 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_except1775 = new BitSet(new long[]{0xFCB4E0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_except1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1801 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1805 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1807 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1809 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_forExp1812 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1818 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1822 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iteratorList1863 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_NEW_in_instantiationExp1879 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_instantiationExp1882 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_instantiationExp1884 = new BitSet(new long[]{0xFCB5A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_instantiationExp1887 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_instantiationExp1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred12_Iocl502 = new BitSet(new long[]{0xFC04005200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_synpred12_Iocl511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_synpred18_Iocl575 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred18_Iocl577 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_operationCallExp_in_synpred21_Iocl623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred26_Iocl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred27_Iocl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred31_Iocl830 = new BitSet(new long[]{0xFCB4A0731001C400L,0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred31_Iocl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred37_Iocl999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_synpred37_Iocl1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred38_Iocl999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_synpred38_Iocl1001 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred38_Iocl1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred38_Iocl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred39_Iocl1058 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred39_Iocl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred53_Iocl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_synpred58_Iocl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred68_Iocl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred69_Iocl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred70_Iocl1639 = new BitSet(new long[]{0x0000000000000002L});

}