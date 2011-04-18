// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g 2011-04-18 02:34:51

package org.orcas.ioclengine.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

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
public class IoclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_EXP", "AND", "APPEND", "ARROW", "ATTRIBUTE_CALL", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DICT", "DIV", "DO", "DOT", "ENDIF", "ENUM_LITERAL", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "IMPERATIVE_OPERATION_CALL", "ITERATE", "ITERATOR", "IS", "LOG", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NEW", "NOT", "NOT_EQUAL", "MULT", "OPERATION_CALL", "OR", "PATH_NAME", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "IDENTIFIER", "ITERATOR_NAME", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=68;
    public static final int APPEND=6;
    public static final int EXPONENT=71;
    public static final int LT=37;
    public static final int WHILE=58;
    public static final int PRIMITIVE_TYPE_LITERAL=69;
    public static final int COMPUTE=14;
    public static final int IMPERATIVE_OPERATION_CALL=30;
    public static final int LOG=34;
    public static final int GTE=28;
    public static final int OCTAL_ESC=76;
    public static final int NEW=40;
    public static final int DO=18;
    public static final int FOR=26;
    public static final int NOT=41;
    public static final int AND=5;
    public static final int EXCEPT=25;
    public static final int EOF=-1;
    public static final int LTE=38;
    public static final int BREAK=10;
    public static final int LPAREN=36;
    public static final int IF=29;
    public static final int RPAREN=51;
    public static final int ESC_SEQ=72;
    public static final int STRING_LITERAL=63;
    public static final int REAL_LITERAL=66;
    public static final int SCOPE=52;
    public static final int COLLECTION_TYPE_LITERAL=61;
    public static final int CONTINUE=15;
    public static final int NOT_EQUAL=42;
    public static final int IS=33;
    public static final int IDENTIFIER=67;
    public static final int ITERATOR=32;
    public static final int DICT=16;
    public static final int EQUAL=24;
    public static final int RETURN=50;
    public static final int ENDIF=20;
    public static final int ENUM_LITERAL=21;
    public static final int PLUS=47;
    public static final int VAR=56;
    public static final int RAISE=48;
    public static final int DOT=19;
    public static final int PATH_NAME=46;
    public static final int COLLECTION_LITERAL=11;
    public static final int FOR_NAME=70;
    public static final int XOR=59;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int UNICODE_ESC=75;
    public static final int NUMERIC_OPERATION=60;
    public static final int ELSE=23;
    public static final int HEX_DIGIT=74;
    public static final int LCURLY=35;
    public static final int NULL_LITERAL=62;
    public static final int SEMICOLON=54;
    public static final int MULT=43;
    public static final int MINUS=39;
    public static final int TRY=55;
    public static final int BOOLEAN_LITERAL=64;
    public static final int COLON=13;
    public static final int ALT_EXP=4;
    public static final int ELIF=22;
    public static final int ITERATE=31;
    public static final int WS=73;
    public static final int VARIABLE=57;
    public static final int INTEGER_LITERAL=65;
    public static final int BLOCK=9;
    public static final int RCURLY=49;
    public static final int OR=45;
    public static final int ARROW=7;
    public static final int GT=27;
    public static final int OPERATION_CALL=44;
    public static final int DIV=17;
    public static final int SELF=53;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[143+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IoclParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g"; }


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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:114:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:114:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression413);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:115:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression418);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:118:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:119:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:119:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp429);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:119:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:119:17: ( AND | OR | XOR ) equalityExp
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

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp445);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:122:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:123:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:123:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp458);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:123:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:123:19: ( EQUAL | NOT_EQUAL ) relationalExp
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

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp470);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:126:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:127:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:127:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp483);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:127:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:127:17: ( LT | LTE | GT | GTE ) additiveExp
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

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp503);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:130:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:131:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:131:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp516);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:131:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:131:23: ( PLUS | MINUS ) multiplicativeExp
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

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp528);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:134:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:135:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:135:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp541);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:135:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:135:14: ( MULT | DIV ) unaryExp
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

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp554);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:138:1: unaryExp : ( ( MINUS | NOT ) unaryExp | instantiationExp | dotArrowExp );
    public final IoclParser.unaryExp_return unaryExp() throws RecognitionException {
        IoclParser.unaryExp_return retval = new IoclParser.unaryExp_return();
        retval.start = input.LT(1);
        int unaryExp_StartIndex = input.index();
        Object root_0 = null;

        Token set18=null;
        IoclParser.unaryExp_return unaryExp19 = null;

        IoclParser.instantiationExp_return instantiationExp20 = null;

        IoclParser.dotArrowExp_return dotArrowExp21 = null;


        Object set18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:139:2: ( ( MINUS | NOT ) unaryExp | instantiationExp | dotArrowExp )
            int alt7=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NOT:
                {
                alt7=1;
                }
                break;
            case NEW:
                {
                alt7=2;
                }
                break;
            case DICT:
            case LPAREN:
            case SELF:
            case COLLECTION_TYPE_LITERAL:
            case NULL_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
            case IDENTIFIER:
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:139:4: ( MINUS | NOT ) unaryExp
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

                    pushFollow(FOLLOW_unaryExp_in_unaryExp576);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:140:4: instantiationExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instantiationExp_in_unaryExp581);
                    instantiationExp20=instantiationExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instantiationExp20.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp586);
                    dotArrowExp21=dotArrowExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp21.getTree());

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

    public static class instantiationExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instantiationExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:144:1: instantiationExp : NEW pathName '(' ( arguments )? ')' ;
    public final IoclParser.instantiationExp_return instantiationExp() throws RecognitionException {
        IoclParser.instantiationExp_return retval = new IoclParser.instantiationExp_return();
        retval.start = input.LT(1);
        int instantiationExp_StartIndex = input.index();
        Object root_0 = null;

        Token NEW22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        IoclParser.pathName_return pathName23 = null;

        IoclParser.arguments_return arguments25 = null;


        Object NEW22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:145:2: ( NEW pathName '(' ( arguments )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:145:4: NEW pathName '(' ( arguments )? ')'
            {
            root_0 = (Object)adaptor.nil();

            NEW22=(Token)match(input,NEW,FOLLOW_NEW_in_instantiationExp597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEW22_tree = (Object)adaptor.create(NEW22);
            root_0 = (Object)adaptor.becomeRoot(NEW22_tree, root_0);
            }
            pushFollow(FOLLOW_pathName_in_instantiationExp600);
            pathName23=pathName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName23.getTree());
            char_literal24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_instantiationExp602); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:145:23: ( arguments )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BREAK||(LA8_0>=COMPUTE && LA8_0<=DICT)||LA8_0==DO||LA8_0==IF||(LA8_0>=LOG && LA8_0<=LPAREN)||(LA8_0>=MINUS && LA8_0<=NOT)||LA8_0==RAISE||LA8_0==RETURN||LA8_0==SELF||(LA8_0>=TRY && LA8_0<=VAR)||LA8_0==WHILE||(LA8_0>=COLLECTION_TYPE_LITERAL && LA8_0<=IDENTIFIER)||LA8_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_instantiationExp605);
                    arguments25=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments25.getTree());

                    }
                    break;

            }

            char_literal26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_instantiationExp608); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 8, instantiationExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instantiationExp"

    public static class dotArrowExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotArrowExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExp_return oclExp27 = null;

        IoclParser.propertyCallExp_return propertyCallExp28 = null;

        IoclParser.oclExp_return oclExp29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:2: ( oclExp ( propertyCallExp )+ | oclExp )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:4: oclExp ( propertyCallExp )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp620);
                    oclExp27=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp27.getTree());
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:26: ( propertyCallExp )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ARROW||LA9_0==DOT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
                    	    {
                    	    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp622);
                    	    propertyCallExp28=propertyCallExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(propertyCallExp28.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:150:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp629);
                    oclExp29=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, dotArrowExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotArrowExp"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:153:1: propertyCallExp : ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token set30=null;
        Token ARROW32=null;
        IoclParser.modelPropertyCallExp_return modelPropertyCallExp31 = null;

        IoclParser.loopExp_return loopExp33 = null;


        Object set30_tree=null;
        Object ARROW32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:154:2: ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARROW) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ITERATE||LA11_1==ITERATOR_NAME) ) {
                    alt11=2;
                }
                else if ( (LA11_1==SELF||LA11_1==NUMERIC_OPERATION||LA11_1==IDENTIFIER) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==DOT) ) {
                alt11=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:154:4: ( DOT | ARROW ) modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set30=(Token)input.LT(1);
                    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp649);
                    modelPropertyCallExp31=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp31.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:155:4: ARROW loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    ARROW32=(Token)match(input,ARROW,FOLLOW_ARROW_in_propertyCallExp654); if (state.failed) return retval;
                    pushFollow(FOLLOW_loopExp_in_propertyCallExp657);
                    loopExp33=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp33.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp34 = null;

        IoclParser.attributeCallExp_return attributeCallExp35 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:159:2: ( operationCallExp | attributeCallExp )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NUMERIC_OPERATION) ) {
                alt12=1;
            }
            else if ( (LA12_0==SELF||LA12_0==IDENTIFIER) ) {
                int LA12_2 = input.LA(2);

                if ( (synpred23_Iocl()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:159:4: operationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp668);
                    operationCallExp34=operationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp34.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:160:4: attributeCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeCallExp_in_modelPropertyCallExp673);
                    attributeCallExp35=attributeCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeCallExp35.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        IoclParser.arguments_return arguments38 = null;

        IoclParser.simpleName_return simpleName40 = null;

        IoclParser.arguments_return arguments42 = null;


        Object NUMERIC_OPERATION36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NUMERIC_OPERATION) ) {
                alt15=1;
            }
            else if ( (LA15_0==SELF||LA15_0==IDENTIFIER) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION36=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION36);

                    char_literal37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal37);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:26: ( arguments )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==BREAK||(LA13_0>=COMPUTE && LA13_0<=DICT)||LA13_0==DO||LA13_0==IF||(LA13_0>=LOG && LA13_0<=LPAREN)||(LA13_0>=MINUS && LA13_0<=NOT)||LA13_0==RAISE||LA13_0==RETURN||LA13_0==SELF||(LA13_0>=TRY && LA13_0<=VAR)||LA13_0==WHILE||(LA13_0>=COLLECTION_TYPE_LITERAL && LA13_0<=IDENTIFIER)||LA13_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp688);
                            arguments38=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments38.getTree());

                            }
                            break;

                    }

                    char_literal39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal39);



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
                    // 164:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:64: ( arguments )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:4: simpleName '(' ( arguments )? ')'
                    {
                    pushFollow(FOLLOW_simpleName_in_operationCallExp705);
                    simpleName40=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleName.add(simpleName40.getTree());
                    char_literal41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal41);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:19: ( arguments )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==BREAK||(LA14_0>=COMPUTE && LA14_0<=DICT)||LA14_0==DO||LA14_0==IF||(LA14_0>=LOG && LA14_0<=LPAREN)||(LA14_0>=MINUS && LA14_0<=NOT)||LA14_0==RAISE||LA14_0==RETURN||LA14_0==SELF||(LA14_0>=TRY && LA14_0<=VAR)||LA14_0==WHILE||(LA14_0>=COLLECTION_TYPE_LITERAL && LA14_0<=IDENTIFIER)||LA14_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp709);
                            arguments42=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments42.getTree());

                            }
                            break;

                    }

                    char_literal43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal43);



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
                    // 165:34: -> ^( OPERATION_CALL simpleName ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:37: ^( OPERATION_CALL simpleName ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATION_CALL, "OPERATION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_simpleName.nextTree());
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:65: ( arguments )?
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
            if ( state.backtracking>0 ) { memoize(input, 12, operationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExp"

    public static class attributeCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:168:1: attributeCallExp : simpleName -> ^( ATTRIBUTE_CALL simpleName ) ;
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName44 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:169:2: ( simpleName -> ^( ATTRIBUTE_CALL simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:169:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_attributeCallExp734);
            simpleName44=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName44.getTree());


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
            // 169:15: -> ^( ATTRIBUTE_CALL simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:169:18: ^( ATTRIBUTE_CALL simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 13, attributeCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "attributeCallExp"

    public static class oclExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:1: oclExp : ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression );
    public final IoclParser.oclExp_return oclExp() throws RecognitionException {
        IoclParser.oclExp_return retval = new IoclParser.oclExp_return();
        retval.start = input.LT(1);
        int oclExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        IoclParser.literalExp_return literalExp45 = null;

        IoclParser.variableExp_return variableExp46 = null;

        IoclParser.type_return type47 = null;

        IoclParser.oclExpression_return oclExpression49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:2: ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp752);
                    literalExp45=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp45.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp758);
                    variableExp46=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp46.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:174:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp763);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type47.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:175:4: '(' oclExpression ')'
                    {
                    char_literal48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal48);

                    pushFollow(FOLLOW_oclExpression_in_oclExp770);
                    oclExpression49=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression49.getTree());
                    char_literal50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal50);



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
                    // 175:26: -> oclExpression
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
            if ( state.backtracking>0 ) { memoize(input, 14, oclExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExp"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:178:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName51 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:179:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:179:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp790);
            simpleName51=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName51.getTree());


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
            // 179:15: -> ^( VARIABLE simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:179:18: ^( VARIABLE simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 15, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:1: literalExp : ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp | nullLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.enumerationLiteralExp_return enumerationLiteralExp52 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp53 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp54 = null;

        IoclParser.nullLiteralExp_return nullLiteralExp55 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:183:2: ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp | nullLiteralExp )
            int alt17=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt17=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt17=2;
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt17=3;
                }
                break;
            case NULL_LITERAL:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:183:4: enumerationLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumerationLiteralExp_in_literalExp809);
                    enumerationLiteralExp52=enumerationLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationLiteralExp52.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:184:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp814);
                    collectionLiteralExp53=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp53.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:185:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp820);
                    primitiveLiteralExp54=primitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExp54.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:186:4: nullLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nullLiteralExp_in_literalExp825);
                    nullLiteralExp55=nullLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLiteralExp55.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, literalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExp"

    public static class collectionLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
    public final IoclParser.collectionLiteralExp_return collectionLiteralExp() throws RecognitionException {
        IoclParser.collectionLiteralExp_return retval = new IoclParser.collectionLiteralExp_return();
        retval.start = input.LT(1);
        int collectionLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal57=null;
        Token char_literal59=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier56 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts58 = null;


        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionLiteralParts=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralParts");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp836);
            collectionTypeIdentifier56=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier56.getTree());
            char_literal57=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal57);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:33: ( collectionLiteralParts )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BREAK||(LA18_0>=COMPUTE && LA18_0<=DICT)||LA18_0==DO||LA18_0==IF||(LA18_0>=LOG && LA18_0<=LPAREN)||(LA18_0>=MINUS && LA18_0<=NOT)||LA18_0==RAISE||LA18_0==RETURN||LA18_0==SELF||(LA18_0>=TRY && LA18_0<=VAR)||LA18_0==WHILE||(LA18_0>=COLLECTION_TYPE_LITERAL && LA18_0<=IDENTIFIER)||LA18_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp840);
                    collectionLiteralParts58=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts58.getTree());

                    }
                    break;

            }

            char_literal59=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp843); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal59);



            // AST REWRITE
            // elements: collectionLiteralParts, collectionTypeIdentifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:110: ( collectionLiteralParts )?
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
            if ( state.backtracking>0 ) { memoize(input, 17, collectionLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExp"

    public static class collectionTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifier"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL60=null;

        Object COLLECTION_TYPE_LITERAL60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:194:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:194:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL60=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL60_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL60);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL60_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, collectionTypeIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifier"

    public static class collectionLiteralParts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralParts"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
    public final IoclParser.collectionLiteralParts_return collectionLiteralParts() throws RecognitionException {
        IoclParser.collectionLiteralParts_return retval = new IoclParser.collectionLiteralParts_return();
        retval.start = input.LT(1);
        int collectionLiteralParts_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal62=null;
        IoclParser.collectionLiteralPart_return collectionLiteralPart61 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts63 = null;


        Object char_literal62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts876);
            collectionLiteralPart61=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart61.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:26: ( ',' collectionLiteralParts )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==77) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred34_Iocl()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:27: ',' collectionLiteralParts
            	    {
            	    char_literal62=(Token)match(input,77,FOLLOW_77_in_collectionLiteralParts879); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts882);
            	    collectionLiteralParts63=collectionLiteralParts();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralParts63.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            if ( state.backtracking>0 ) { memoize(input, 19, collectionLiteralParts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralParts"

    public static class collectionLiteralPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPart"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:201:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression64 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:202:2: ( oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:202:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart895);
            oclExpression64=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression64.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, collectionLiteralPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPart"

    public static class primitiveLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:205:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
    public final IoclParser.primitiveLiteralExp_return primitiveLiteralExp() throws RecognitionException {
        IoclParser.primitiveLiteralExp_return retval = new IoclParser.primitiveLiteralExp_return();
        retval.start = input.LT(1);
        int primitiveLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExp_return numericLiteralExp65 = null;

        IoclParser.stringLiteralExp_return stringLiteralExp66 = null;

        IoclParser.booleanLiteralExp_return booleanLiteralExp67 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:206:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
            int alt20=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt20=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt20=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:206:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp906);
                    numericLiteralExp65=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp65.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:207:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp911);
                    stringLiteralExp66=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp66.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:208:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp916);
                    booleanLiteralExp67=booleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExp67.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, primitiveLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExp"

    public static class nullLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nullLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:211:1: nullLiteralExp : NULL_LITERAL ;
    public final IoclParser.nullLiteralExp_return nullLiteralExp() throws RecognitionException {
        IoclParser.nullLiteralExp_return retval = new IoclParser.nullLiteralExp_return();
        retval.start = input.LT(1);
        int nullLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token NULL_LITERAL68=null;

        Object NULL_LITERAL68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:212:2: ( NULL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:212:4: NULL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            NULL_LITERAL68=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_nullLiteralExp927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NULL_LITERAL68_tree = (Object)adaptor.create(NULL_LITERAL68);
            adaptor.addChild(root_0, NULL_LITERAL68_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, nullLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nullLiteralExp"

    public static class numericLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:215:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp69 = null;

        IoclParser.realLiteralExp_return realLiteralExp70 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:2: ( integerLiteralExp | realLiteralExp )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INTEGER_LITERAL) ) {
                alt21=1;
            }
            else if ( (LA21_0==REAL_LITERAL) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp938);
                    integerLiteralExp69=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp69.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:217:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp943);
                    realLiteralExp70=realLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExp70.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 23, numericLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExp"

    public static class stringLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL71=null;

        Object STRING_LITERAL71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:221:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:221:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL71=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL71_tree = (Object)adaptor.create(STRING_LITERAL71);
            adaptor.addChild(root_0, STRING_LITERAL71_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 24, stringLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExp"

    public static class booleanLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL72=null;

        Object BOOLEAN_LITERAL72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL72=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp969); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL72_tree = (Object)adaptor.create(BOOLEAN_LITERAL72);
            adaptor.addChild(root_0, BOOLEAN_LITERAL72_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, booleanLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExp"

    public static class integerLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL73=null;

        Object INTEGER_LITERAL73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:229:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:229:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL73=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp980); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL73_tree = (Object)adaptor.create(INTEGER_LITERAL73);
            adaptor.addChild(root_0, INTEGER_LITERAL73_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 26, integerLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExp"

    public static class realLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:232:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL74=null;

        Object REAL_LITERAL74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL74=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL74_tree = (Object)adaptor.create(REAL_LITERAL74);
            adaptor.addChild(root_0, REAL_LITERAL74_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 27, realLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExp"

    public static class enumerationLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumerationLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:1: enumerationLiteralExp : IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) ;
    public final IoclParser.enumerationLiteralExp_return enumerationLiteralExp() throws RecognitionException {
        IoclParser.enumerationLiteralExp_return retval = new IoclParser.enumerationLiteralExp_return();
        retval.start = input.LT(1);
        int enumerationLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER75=null;
        Token SCOPE76=null;
        Token IDENTIFIER77=null;

        Object IDENTIFIER75_tree=null;
        Object SCOPE76_tree=null;
        Object IDENTIFIER77_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:2: ( IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:4: IDENTIFIER ( SCOPE IDENTIFIER )+
            {
            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp1003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER75);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:15: ( SCOPE IDENTIFIER )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SCOPE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE76=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_enumerationLiteralExp1006); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE76);

            	    IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp1008); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER77);


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // 237:35: -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:237:38: ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 28, enumerationLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumerationLiteralExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:240:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp78 = null;

        IoclParser.iterateExp_return iterateExp79 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:241:2: ( iteratorExp | iterateExp )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ITERATOR_NAME) ) {
                alt23=1;
            }
            else if ( (LA23_0==ITERATE) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:241:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp1033);
                    iteratorExp78=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp78.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:242:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp1038);
                    iterateExp79=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp79.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, loopExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loopExp"

    public static class iteratorExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:1: iteratorExp : ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATOR_NAME80=null;
        Token LPAREN81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token RPAREN85=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression84 = null;


        Object ITERATOR_NAME80_tree=null;
        Object LPAREN81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object RPAREN85_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:2: ( ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:4: ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            ITERATOR_NAME80=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME80);

            LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp1051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN81);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:26: (v1= variableDeclaration ',' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred40_Iocl()) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:27: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1059);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal82=(Token)match(input,77,FOLLOW_77_in_iteratorExp1061); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_77.add(char_literal82);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1069);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal83=(Token)match(input,78,FOLLOW_78_in_iteratorExp1071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal83);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp1075);
            oclExpression84=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression84.getTree());
            RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp1077); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN85);



            // AST REWRITE
            // elements: v2, v1, ITERATOR_NAME, oclExpression
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
            // 247:3: -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:6: ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:31: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:36: ( $v2)?
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
            if ( state.backtracking>0 ) { memoize(input, 30, iteratorExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorExp"

    public static class iterateExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterateExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:1: iterateExp : ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATE86=null;
        Token LPAREN87=null;
        Token SEMICOLON88=null;
        Token char_literal89=null;
        Token RPAREN91=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression90 = null;


        Object ITERATE86_tree=null;
        Object LPAREN87_tree=null;
        Object SEMICOLON88_tree=null;
        Object char_literal89_tree=null;
        Object RPAREN91_tree=null;
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:2: ( ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:4: ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            ITERATE86=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp1109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE86);

            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp1111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:19: (v1= variableDeclaration SEMICOLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENTIFIER) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred42_Iocl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:20: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp1118);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp1120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON88);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1128);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal89=(Token)match(input,78,FOLLOW_78_in_iterateExp1131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(char_literal89);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1133);
            oclExpression90=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression90.getTree());
            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);



            // AST REWRITE
            // elements: oclExpression, ITERATE, v2, v1
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
            // 252:3: -> ^( ITERATE ( $v1)? $v2 oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:252:6: ^( ITERATE ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:252:16: ( $v1)?
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
            if ( state.backtracking>0 ) { memoize(input, 31, iterateExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterateExp"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        IoclParser.type_return type94 = null;

        IoclParser.oclExpression_return oclExpression96 = null;


        Object IDENTIFIER92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER92=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER92);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:15: ( ':' type )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:16: ':' type
                    {
                    char_literal93=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal93);

                    pushFollow(FOLLOW_type_in_variableDeclaration1169);
                    type94=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type94.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:27: ( '=' oclExpression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EQUAL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:28: '=' oclExpression
                    {
                    char_literal95=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal95);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1176);
                    oclExpression96=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression96.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, IDENTIFIER, oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 256:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:79: ( oclExpression )?
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
            if ( state.backtracking>0 ) { memoize(input, 32, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal98=null;
        IoclParser.oclExpression_return oclExpression97 = null;

        IoclParser.oclExpression_return oclExpression99 = null;


        Object char_literal98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:2: ( oclExpression ( ',' oclExpression )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1203);
            oclExpression97=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression97.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:18: ( ',' oclExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==77) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:19: ',' oclExpression
            	    {
            	    char_literal98=(Token)match(input,77,FOLLOW_77_in_arguments1206); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1209);
            	    oclExpression99=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
            if ( state.backtracking>0 ) { memoize(input, 33, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:263:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:264:2: ( SELF | IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
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
            if ( state.backtracking>0 ) { memoize(input, 34, simpleName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:268:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL101=null;

        Object PRIMITIVE_TYPE_LITERAL101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:269:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:269:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL101=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1239); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL101_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL101);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL101_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 35, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:272:1: collectionType : collectionTypeIdentifier ( LPAREN type RPAREN )? -> ^( COLLECTION_TYPE collectionTypeIdentifier ( type )? ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN103=null;
        Token RPAREN105=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier102 = null;

        IoclParser.type_return type104 = null;


        Object LPAREN103_tree=null;
        Object RPAREN105_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:2: ( collectionTypeIdentifier ( LPAREN type RPAREN )? -> ^( COLLECTION_TYPE collectionTypeIdentifier ( type )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:4: collectionTypeIdentifier ( LPAREN type RPAREN )?
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1250);
            collectionTypeIdentifier102=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier102.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:29: ( LPAREN type RPAREN )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:30: LPAREN type RPAREN
                    {
                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);

                    pushFollow(FOLLOW_type_in_collectionType1255);
                    type104=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type104.getTree());
                    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);


                    }
                    break;

            }



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
            // 273:51: -> ^( COLLECTION_TYPE collectionTypeIdentifier ( type )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:54: ^( COLLECTION_TYPE collectionTypeIdentifier ( type )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_TYPE, "COLLECTION_TYPE"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:97: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 36, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:1: type : ( primitiveType | collectionType | DICT ( LPAREN keyType= type ',' valueType= type RPAREN )? -> ^( DICT ( $keyType)? ( $valueType)? ) | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token DICT108=null;
        Token LPAREN109=null;
        Token char_literal110=null;
        Token RPAREN111=null;
        IoclParser.type_return keyType = null;

        IoclParser.type_return valueType = null;

        IoclParser.primitiveType_return primitiveType106 = null;

        IoclParser.collectionType_return collectionType107 = null;

        IoclParser.pathName_return pathName112 = null;


        Object DICT108_tree=null;
        Object LPAREN109_tree=null;
        Object char_literal110_tree=null;
        Object RPAREN111_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_DICT=new RewriteRuleTokenStream(adaptor,"token DICT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:2: ( primitiveType | collectionType | DICT ( LPAREN keyType= type ',' valueType= type RPAREN )? -> ^( DICT ( $keyType)? ( $valueType)? ) | pathName )
            int alt32=4;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt32=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt32=2;
                }
                break;
            case DICT:
                {
                alt32=3;
                }
                break;
            case IDENTIFIER:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1282);
                    primitiveType106=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType106.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:278:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1287);
                    collectionType107=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType107.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:4: DICT ( LPAREN keyType= type ',' valueType= type RPAREN )?
                    {
                    DICT108=(Token)match(input,DICT,FOLLOW_DICT_in_type1292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DICT.add(DICT108);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:9: ( LPAREN keyType= type ',' valueType= type RPAREN )?
                    int alt31=2;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:10: LPAREN keyType= type ',' valueType= type RPAREN
                            {
                            LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type1295); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN109);

                            pushFollow(FOLLOW_type_in_type1299);
                            keyType=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type.add(keyType.getTree());
                            char_literal110=(Token)match(input,77,FOLLOW_77_in_type1301); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_77.add(char_literal110);

                            pushFollow(FOLLOW_type_in_type1305);
                            valueType=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_type.add(valueType.getTree());
                            RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type1307); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN111);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: keyType, valueType, DICT
                    // token labels: 
                    // rule labels: retval, keyType, valueType
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_keyType=new RewriteRuleSubtreeStream(adaptor,"rule keyType",keyType!=null?keyType.tree:null);
                    RewriteRuleSubtreeStream stream_valueType=new RewriteRuleSubtreeStream(adaptor,"rule valueType",valueType!=null?valueType.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 279:58: -> ^( DICT ( $keyType)? ( $valueType)? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:61: ^( DICT ( $keyType)? ( $valueType)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DICT.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:68: ( $keyType)?
                        if ( stream_keyType.hasNext() ) {
                            adaptor.addChild(root_1, stream_keyType.nextTree());

                        }
                        stream_keyType.reset();
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:78: ( $valueType)?
                        if ( stream_valueType.hasNext() ) {
                            adaptor.addChild(root_1, stream_valueType.nextTree());

                        }
                        stream_valueType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:280:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1328);
                    pathName112=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName112.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:283:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER113=null;
        Token SCOPE114=null;
        Token IDENTIFIER115=null;

        Object IDENTIFIER113_tree=null;
        Object SCOPE114_tree=null;
        Object IDENTIFIER115_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER113=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER113);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:15: ( SCOPE IDENTIFIER )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SCOPE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE114=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1342); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE114);

            	    IDENTIFIER115=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1344); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER115);


            	    }
            	    break;

            	default :
            	    break loop33;
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
            // 284:35: -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:38: ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_NAME, "PATH_NAME"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:61: ( IDENTIFIER )*
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
            if ( state.backtracking>0 ) { memoize(input, 38, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:289:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp116 = null;

        IoclParser.breakExp_return breakExp117 = null;

        IoclParser.computeExp_return computeExp118 = null;

        IoclParser.continueExp_return continueExp119 = null;

        IoclParser.returnExp_return returnExp120 = null;

        IoclParser.variableInitExp_return variableInitExp121 = null;

        IoclParser.assignExp_return assignExp122 = null;

        IoclParser.raiseExp_return raiseExp123 = null;

        IoclParser.whileExp_return whileExp124 = null;

        IoclParser.ifExp_return ifExp125 = null;

        IoclParser.tryExp_return tryExp126 = null;

        IoclParser.forExp_return forExp127 = null;

        IoclParser.logExp_return logExp128 = null;

        IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp129 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:290:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp )
            int alt34=14;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:290:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1370);
                    blockExp116=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp116.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:291:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1375);
                    breakExp117=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp117.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1380);
                    computeExp118=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp118.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:293:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1385);
                    continueExp119=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp119.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1390);
                    returnExp120=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp120.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:295:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1395);
                    variableInitExp121=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp121.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1400);
                    assignExp122=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp122.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:297:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1405);
                    raiseExp123=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp123.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:298:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1410);
                    whileExp124=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp124.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:299:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1415);
                    ifExp125=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp125.getTree());

                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:300:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1420);
                    tryExp126=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp126.getTree());

                    }
                    break;
                case 12 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:301:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1425);
                    forExp127=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp127.getTree());

                    }
                    break;
                case 13 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:302:4: logExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logExp_in_imperativeExp1430);
                    logExp128=logExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logExp128.getTree());

                    }
                    break;
                case 14 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:303:4: imperativeOperationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeOperationCallExp_in_imperativeExp1435);
                    imperativeOperationCallExp129=imperativeOperationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeOperationCallExp129.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:306:1: blockExp : ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO130=null;
        Token LCURLY131=null;
        Token RCURLY133=null;
        IoclParser.imperativeExp_return imperativeExp132 = null;


        Object DO130_tree=null;
        Object LCURLY131_tree=null;
        Object RCURLY133_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:2: ( ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:4: ( DO )? LCURLY ( imperativeExp )* RCURLY
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:4: ( DO )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==DO) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO130=(Token)match(input,DO,FOLLOW_DO_in_blockExp1446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO130);


                    }
                    break;

            }

            LCURLY131=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY131);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:15: ( imperativeExp )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==BREAK||(LA36_0>=COMPUTE && LA36_0<=DICT)||LA36_0==DO||LA36_0==IF||(LA36_0>=LOG && LA36_0<=LPAREN)||LA36_0==RAISE||LA36_0==RETURN||LA36_0==SELF||(LA36_0>=TRY && LA36_0<=VAR)||LA36_0==WHILE||(LA36_0>=COLLECTION_TYPE_LITERAL && LA36_0<=IDENTIFIER)||LA36_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_blockExp1451);
            	    imperativeExp132=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp132.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            RCURLY133=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY133);



            // AST REWRITE
            // elements: imperativeExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:37: -> ^( BLOCK ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:40: ^( BLOCK ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:307:48: ( imperativeExp )*
                while ( stream_imperativeExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_imperativeExp.nextTree());

                }
                stream_imperativeExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 40, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK134=null;
        Token SEMICOLON135=null;

        Object BREAK134_tree=null;
        Object SEMICOLON135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:311:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:311:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK134=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK134_tree = (Object)adaptor.create(BREAK134);
            root_0 = (Object)adaptor.becomeRoot(BREAK134_tree, root_0);
            }
            SEMICOLON135=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1477); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON135_tree = (Object)adaptor.create(SEMICOLON135);
            adaptor.addChild(root_0, SEMICOLON135_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 41, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:314:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE136=null;
        Token LPAREN137=null;
        Token RPAREN139=null;
        IoclParser.variableDeclaration_return variableDeclaration138 = null;

        IoclParser.oclExpression_return oclExpression140 = null;


        Object COMPUTE136_tree=null;
        Object LPAREN137_tree=null;
        Object RPAREN139_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:315:2: ( COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:315:4: COMPUTE LPAREN variableDeclaration RPAREN oclExpression
            {
            COMPUTE136=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE136);

            LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN137);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1492);
            variableDeclaration138=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration138.getTree());
            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1494); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN139);

            pushFollow(FOLLOW_oclExpression_in_computeExp1496);
            oclExpression140=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression140.getTree());


            // AST REWRITE
            // elements: COMPUTE, variableDeclaration, oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 315:60: -> ^( COMPUTE variableDeclaration oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:315:63: ^( COMPUTE variableDeclaration oclExpression )
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
            if ( state.backtracking>0 ) { memoize(input, 42, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:318:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE141=null;
        Token SEMICOLON142=null;

        Object CONTINUE141_tree=null;
        Object SEMICOLON142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:319:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:319:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE141=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE141_tree = (Object)adaptor.create(CONTINUE141);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE141_tree, root_0);
            }
            SEMICOLON142=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON142_tree = (Object)adaptor.create(SEMICOLON142);
            adaptor.addChild(root_0, SEMICOLON142_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 43, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:1: returnExp : RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN143=null;
        Token SEMICOLON145=null;
        IoclParser.logicalExp_return logicalExp144 = null;


        Object RETURN143_tree=null;
        Object SEMICOLON145_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:2: ( RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:4: RETURN ( logicalExp )? SEMICOLON
            {
            RETURN143=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1531); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN143);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:11: ( logicalExp )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DICT||LA37_0==LPAREN||(LA37_0>=MINUS && LA37_0<=NOT)||LA37_0==SELF||(LA37_0>=COLLECTION_TYPE_LITERAL && LA37_0<=IDENTIFIER)||LA37_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: logicalExp
                    {
                    pushFollow(FOLLOW_logicalExp_in_returnExp1533);
                    logicalExp144=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp144.getTree());

                    }
                    break;

            }

            SEMICOLON145=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON145);



            // AST REWRITE
            // elements: RETURN, logicalExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 323:33: -> ^( RETURN ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:36: ^( RETURN ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:323:45: ( logicalExp )?
                if ( stream_logicalExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_logicalExp.nextTree());

                }
                stream_logicalExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 44, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:326:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR146=null;
        Token SEMICOLON148=null;
        IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations147 = null;


        Object VAR146_tree=null;
        Object SEMICOLON148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:327:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:327:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR146=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1556); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR146_tree = (Object)adaptor.create(VAR146);
            root_0 = (Object)adaptor.becomeRoot(VAR146_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1559);
            imperativeVarDeclarations147=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations147.getTree());
            SEMICOLON148=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1561); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 45, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class imperativeVarDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclarations"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
    public final IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations() throws RecognitionException {
        IoclParser.imperativeVarDeclarations_return retval = new IoclParser.imperativeVarDeclarations_return();
        retval.start = input.LT(1);
        int imperativeVarDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal150=null;
        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration149 = null;

        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration151 = null;


        Object char_literal150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:331:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:331:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1574);
            imperativeVarDeclaration149=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration149.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:331:29: ( ',' imperativeVarDeclaration )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==77) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:331:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal150=(Token)match(input,77,FOLLOW_77_in_imperativeVarDeclarations1577); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1580);
            	    imperativeVarDeclaration151=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration151.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            if ( state.backtracking>0 ) { memoize(input, 46, imperativeVarDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclarations"

    public static class imperativeVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:334:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) ;
    public final IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration() throws RecognitionException {
        IoclParser.imperativeVarDeclaration_return retval = new IoclParser.imperativeVarDeclaration_return();
        retval.start = input.LT(1);
        int imperativeVarDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER152=null;
        Token char_literal153=null;
        Token EQUAL155=null;
        Token IS156=null;
        IoclParser.type_return type154 = null;

        IoclParser.logicalExp_return logicalExp157 = null;


        Object IDENTIFIER152_tree=null;
        Object char_literal153_tree=null;
        Object EQUAL155_tree=null;
        Object IS156_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )?
            {
            IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:15: ( ':' type )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLON) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:16: ':' type
                    {
                    char_literal153=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal153);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1599);
                    type154=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type154.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:27: ( ( EQUAL | IS ) logicalExp )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EQUAL||LA41_0==IS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:28: ( EQUAL | IS ) logicalExp
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:28: ( EQUAL | IS )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EQUAL) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==IS) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:29: EQUAL
                            {
                            EQUAL155=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1605); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL155);


                            }
                            break;
                        case 2 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:37: IS
                            {
                            IS156=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1609); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS156);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalExp_in_imperativeVarDeclaration1613);
                    logicalExp157=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp157.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: logicalExp, IDENTIFIER, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 335:55: -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:58: ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:80: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:86: ( logicalExp )?
                if ( stream_logicalExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_logicalExp.nextTree());

                }
                stream_logicalExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 47, imperativeVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclaration"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:338:1: assignExp : dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set159=null;
        Token SEMICOLON161=null;
        IoclParser.dotArrowExp_return dotArrowExp158 = null;

        IoclParser.logicalExp_return logicalExp160 = null;


        Object set159_tree=null;
        Object SEMICOLON161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:2: ( dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:4: dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dotArrowExp_in_assignExp1640);
            dotArrowExp158=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp158.getTree());
            set159=(Token)input.LT(1);
            set159=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set159), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_logicalExp_in_assignExp1651);
            logicalExp160=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExp160.getTree());
            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1653); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 48, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:342:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE162=null;
        Token STRING_LITERAL164=null;
        Token SEMICOLON165=null;
        IoclParser.type_return type163 = null;


        Object RAISE162_tree=null;
        Object STRING_LITERAL164_tree=null;
        Object SEMICOLON165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE162=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1665); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE162_tree = (Object)adaptor.create(RAISE162);
            root_0 = (Object)adaptor.becomeRoot(RAISE162_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:11: ( type | STRING_LITERAL )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DICT||LA42_0==COLLECTION_TYPE_LITERAL||LA42_0==IDENTIFIER||LA42_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt42=1;
            }
            else if ( (LA42_0==STRING_LITERAL) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1669);
                    type163=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type163.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:19: STRING_LITERAL
                    {
                    STRING_LITERAL164=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1673); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL164_tree = (Object)adaptor.create(STRING_LITERAL164);
                    adaptor.addChild(root_0, STRING_LITERAL164_tree);
                    }

                    }
                    break;

            }

            SEMICOLON165=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1676); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 49, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:346:1: whileExp : WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE166=null;
        Token LPAREN167=null;
        Token RPAREN168=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object WHILE166_tree=null;
        Object LPAREN167_tree=null;
        Object RPAREN168_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:347:2: ( WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:347:4: WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            WHILE166=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE166);

            LPAREN167=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN167);

            pushFollow(FOLLOW_logicalExp_in_whileExp1696);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN168=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN168);

            pushFollow(FOLLOW_imperativeExp_in_whileExp1707);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


            // AST REWRITE
            // elements: body, WHILE, condition
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
            // 348:24: -> ^( WHILE $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:348:27: ^( WHILE $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 50, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:351:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF169=null;
        Token ENDIF173=null;
        IoclParser.altExp_return altExp170 = null;

        IoclParser.elifExp_return elifExp171 = null;

        IoclParser.elseExp_return elseExp172 = null;


        Object IF169_tree=null;
        Object ENDIF173_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF169=(Token)match(input,IF,FOLLOW_IF_in_ifExp1730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF169);

            pushFollow(FOLLOW_altExp_in_ifExp1732);
            altExp170=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp170.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:14: ( elifExp )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ELIF) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred75_Iocl()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1735);
            	    elifExp171=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp171.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:25: ( elseExp )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ELSE) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred76_Iocl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1740);
                    elseExp172=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp172.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:36: ( ENDIF )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ENDIF) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred77_Iocl()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF173=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF173);


                    }
                    break;

            }



            // AST REWRITE
            // elements: elifExp, altExp, IF, elseExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 352:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:67: ( elseExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 51, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF174=null;
        IoclParser.altExp_return altExp175 = null;


        Object ELIF174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:356:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:356:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF174=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1770); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1773);
            altExp175=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE176=null;
        IoclParser.oclExpression_return oclExpression177 = null;


        Object ELSE176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:360:2: ( ELSE oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:360:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE176=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1785); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1788);
            oclExpression177=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression177.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:363:1: altExp : LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN178=null;
        Token RPAREN179=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object LPAREN178_tree=null;
        Object RPAREN179_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:364:2: ( LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:364:4: LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            LPAREN178=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN178);

            pushFollow(FOLLOW_logicalExp_in_altExp1807);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN179);

            pushFollow(FOLLOW_imperativeExp_in_altExp1816);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


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
            // 364:63: -> ^( ALT_EXP $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:364:66: ^( ALT_EXP $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 54, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:367:1: tryExp : TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY180=null;
        Token LCURLY181=null;
        Token RCURLY183=null;
        IoclParser.imperativeExp_return imperativeExp182 = null;

        IoclParser.except_return except184 = null;


        Object TRY180_tree=null;
        Object LCURLY181_tree=null;
        Object RCURLY183_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:2: ( TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:4: TRY LCURLY ( imperativeExp )* RCURLY except
            {
            TRY180=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY180);

            LCURLY181=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY181);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:15: ( imperativeExp )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==BREAK||(LA46_0>=COMPUTE && LA46_0<=DICT)||LA46_0==DO||LA46_0==IF||(LA46_0>=LOG && LA46_0<=LPAREN)||LA46_0==RAISE||LA46_0==RETURN||LA46_0==SELF||(LA46_0>=TRY && LA46_0<=VAR)||LA46_0==WHILE||(LA46_0>=COLLECTION_TYPE_LITERAL && LA46_0<=IDENTIFIER)||LA46_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_tryExp1843);
            	    imperativeExp182=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp182.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            RCURLY183=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY183);

            pushFollow(FOLLOW_except_in_tryExp1848);
            except184=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except184.getTree());


            // AST REWRITE
            // elements: except, imperativeExp, TRY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 368:44: -> ^( TRY ( imperativeExp )* except )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:47: ^( TRY ( imperativeExp )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:53: ( imperativeExp )*
                while ( stream_imperativeExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_imperativeExp.nextTree());

                }
                stream_imperativeExp.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 55, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:371:1: except : EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT185=null;
        Token LPAREN186=null;
        Token RPAREN188=null;
        Token LCURLY189=null;
        Token RCURLY191=null;
        IoclParser.type_return type187 = null;

        IoclParser.imperativeExp_return imperativeExp190 = null;


        Object EXCEPT185_tree=null;
        Object LPAREN186_tree=null;
        Object RPAREN188_tree=null;
        Object LCURLY189_tree=null;
        Object RCURLY191_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:2: ( EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:4: EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY
            {
            EXCEPT185=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT185);

            LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN186);

            pushFollow(FOLLOW_type_in_except1874);
            type187=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type187.getTree());
            RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN188);

            LCURLY189=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY189);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:37: ( imperativeExp )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BREAK||(LA47_0>=COMPUTE && LA47_0<=DICT)||LA47_0==DO||LA47_0==IF||(LA47_0>=LOG && LA47_0<=LPAREN)||LA47_0==RAISE||LA47_0==RETURN||LA47_0==SELF||(LA47_0>=TRY && LA47_0<=VAR)||LA47_0==WHILE||(LA47_0>=COLLECTION_TYPE_LITERAL && LA47_0<=IDENTIFIER)||LA47_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_except1880);
            	    imperativeExp190=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp190.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            RCURLY191=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY191);



            // AST REWRITE
            // elements: imperativeExp, EXCEPT, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 372:59: -> ^( EXCEPT type ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:62: ^( EXCEPT type ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:76: ( imperativeExp )*
                while ( stream_imperativeExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_imperativeExp.nextTree());

                }
                stream_imperativeExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 56, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:375:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW193=null;
        Token FOR_NAME194=null;
        Token LPAREN195=null;
        Token char_literal197=null;
        Token RPAREN198=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;

        IoclParser.oclExp_return oclExp192 = null;

        IoclParser.iteratorList_return iteratorList196 = null;


        Object ARROW193_tree=null;
        Object FOR_NAME194_tree=null;
        Object LPAREN195_tree=null;
        Object char_literal197_tree=null;
        Object RPAREN198_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression
            {
            pushFollow(FOLLOW_oclExp_in_forExp1906);
            oclExp192=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp192.getTree());
            ARROW193=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1908); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW193);

            FOR_NAME194=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME194);

            LPAREN195=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1912); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN195);

            pushFollow(FOLLOW_iteratorList_in_forExp1914);
            iteratorList196=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList196.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:46: ( '|' condition= oclExpression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:47: '|' condition= oclExpression
                    {
                    char_literal197=(Token)match(input,78,FOLLOW_78_in_forExp1917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal197);

                    pushFollow(FOLLOW_oclExpression_in_forExp1923);
                    condition=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());

                    }
                    break;

            }

            RPAREN198=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN198);

            pushFollow(FOLLOW_oclExpression_in_forExp1933);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: body, FOR_NAME, condition, iteratorList, oclExp
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
            // 377:3: -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:377:6: ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:377:41: ( $condition)?
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
            if ( state.backtracking>0 ) { memoize(input, 57, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:380:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal200=null;
        IoclParser.variableDeclaration_return variableDeclaration199 = null;

        IoclParser.variableDeclaration_return variableDeclaration201 = null;


        Object char_literal200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:381:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:381:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1965);
            variableDeclaration199=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration199.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:381:24: ( ',' variableDeclaration )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==77) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:381:25: ',' variableDeclaration
            	    {
            	    char_literal200=(Token)match(input,77,FOLLOW_77_in_iteratorList1968); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1971);
            	    variableDeclaration201=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration201.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
            if ( state.backtracking>0 ) { memoize(input, 58, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    public static class logExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:384:1: logExp : LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? ) ;
    public final IoclParser.logExp_return logExp() throws RecognitionException {
        IoclParser.logExp_return retval = new IoclParser.logExp_return();
        retval.start = input.LT(1);
        int logExp_StartIndex = input.index();
        Object root_0 = null;

        Token LOG202=null;
        Token LPAREN203=null;
        Token STRING_LITERAL204=null;
        Token char_literal205=null;
        Token IDENTIFIER206=null;
        Token char_literal207=null;
        Token INTEGER_LITERAL208=null;
        Token RPAREN209=null;
        Token SEMICOLON210=null;

        Object LOG202_tree=null;
        Object LPAREN203_tree=null;
        Object STRING_LITERAL204_tree=null;
        Object char_literal205_tree=null;
        Object IDENTIFIER206_tree=null;
        Object char_literal207_tree=null;
        Object INTEGER_LITERAL208_tree=null;
        Object RPAREN209_tree=null;
        Object SEMICOLON210_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LOG=new RewriteRuleTokenStream(adaptor,"token LOG");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:2: ( LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:4: LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON
            {
            LOG202=(Token)match(input,LOG,FOLLOW_LOG_in_logExp1984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LOG.add(LOG202);

            LPAREN203=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_logExp1986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN203);

            STRING_LITERAL204=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_logExp1988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL204);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:30: ( ',' IDENTIFIER )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==IDENTIFIER) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:31: ',' IDENTIFIER
                    {
                    char_literal205=(Token)match(input,77,FOLLOW_77_in_logExp1991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal205);

                    IDENTIFIER206=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logExp1993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER206);


                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:48: ( ',' INTEGER_LITERAL )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:49: ',' INTEGER_LITERAL
                    {
                    char_literal207=(Token)match(input,77,FOLLOW_77_in_logExp1998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal207);

                    INTEGER_LITERAL208=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_logExp2000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTEGER_LITERAL.add(INTEGER_LITERAL208);


                    }
                    break;

            }

            RPAREN209=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_logExp2004); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN209);

            SEMICOLON210=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_logExp2006); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON210);



            // AST REWRITE
            // elements: INTEGER_LITERAL, STRING_LITERAL, LOG
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 385:88: -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:91: ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOG.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:97: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                }
                stream_STRING_LITERAL.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:385:113: ( INTEGER_LITERAL )?
                if ( stream_INTEGER_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_INTEGER_LITERAL.nextNode());

                }
                stream_INTEGER_LITERAL.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 59, logExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logExp"

    public static class imperativeOperationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeOperationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:388:1: imperativeOperationCallExp : dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) ;
    public final IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp() throws RecognitionException {
        IoclParser.imperativeOperationCallExp_return retval = new IoclParser.imperativeOperationCallExp_return();
        retval.start = input.LT(1);
        int imperativeOperationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON212=null;
        IoclParser.dotArrowExp_return dotArrowExp211 = null;


        Object SEMICOLON212_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_dotArrowExp=new RewriteRuleSubtreeStream(adaptor,"rule dotArrowExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:389:2: ( dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:389:4: dotArrowExp SEMICOLON
            {
            pushFollow(FOLLOW_dotArrowExp_in_imperativeOperationCallExp2029);
            dotArrowExp211=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotArrowExp.add(dotArrowExp211.getTree());
            SEMICOLON212=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_imperativeOperationCallExp2031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON212);



            // AST REWRITE
            // elements: dotArrowExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 389:26: -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:389:29: ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPERATIVE_OPERATION_CALL, "IMPERATIVE_OPERATION_CALL"), root_1);

                adaptor.addChild(root_1, stream_dotArrowExp.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 60, imperativeOperationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeOperationCallExp"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:114:4: ( imperativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:114:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl413);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred20_Iocl
    public final void synpred20_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:4: ( oclExp ( propertyCallExp )+ )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:4: oclExp ( propertyCallExp )+
        {
        pushFollow(FOLLOW_oclExp_in_synpred20_Iocl620);
        oclExp();

        state._fsp--;
        if (state.failed) return ;
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:26: ( propertyCallExp )+
        int cnt52=0;
        loop52:
        do {
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARROW||LA52_0==DOT) ) {
                alt52=1;
            }


            switch (alt52) {
        	case 1 :
        	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
        	    {
        	    pushFollow(FOLLOW_propertyCallExp_in_synpred20_Iocl622);
        	    propertyCallExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt52 >= 1 ) break loop52;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(52, input);
                    throw eee;
            }
            cnt52++;
        } while (true);


        }
    }
    // $ANTLR end synpred20_Iocl

    // $ANTLR start synpred23_Iocl
    public final void synpred23_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:159:4: ( operationCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:159:4: operationCallExp
        {
        pushFollow(FOLLOW_operationCallExp_in_synpred23_Iocl668);
        operationCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Iocl

    // $ANTLR start synpred27_Iocl
    public final void synpred27_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: ( literalExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: literalExp
        {
        pushFollow(FOLLOW_literalExp_in_synpred27_Iocl752);
        literalExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: ( variableExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred28_Iocl758);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred29_Iocl
    public final void synpred29_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:174:4: ( type )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:174:4: type
        {
        pushFollow(FOLLOW_type_in_synpred29_Iocl763);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Iocl

    // $ANTLR start synpred34_Iocl
    public final void synpred34_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:27: ( ',' collectionLiteralParts )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:27: ',' collectionLiteralParts
        {
        match(input,77,FOLLOW_77_in_synpred34_Iocl879); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred34_Iocl882);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Iocl

    // $ANTLR start synpred40_Iocl
    public final void synpred40_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:27: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:27: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred40_Iocl1059);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,77,FOLLOW_77_in_synpred40_Iocl1061); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_Iocl

    // $ANTLR start synpred41_Iocl
    public final void synpred41_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:26: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:26: (v1= variableDeclaration ',' )?
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0==IDENTIFIER) ) {
            int LA54_1 = input.LA(2);

            if ( (synpred40_Iocl()) ) {
                alt54=1;
            }
        }
        switch (alt54) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:27: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred41_Iocl1059);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,77,FOLLOW_77_in_synpred41_Iocl1061); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred41_Iocl1069);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,78,FOLLOW_78_in_synpred41_Iocl1071); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Iocl

    // $ANTLR start synpred42_Iocl
    public final void synpred42_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:20: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:20: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred42_Iocl1118);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred42_Iocl1120); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Iocl

    // $ANTLR start synpred47_Iocl
    public final void synpred47_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:30: ( LPAREN type RPAREN )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:273:30: LPAREN type RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred47_Iocl1253); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred47_Iocl1255);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred47_Iocl1257); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_Iocl

    // $ANTLR start synpred50_Iocl
    public final void synpred50_Iocl_fragment() throws RecognitionException {   
        IoclParser.type_return keyType = null;

        IoclParser.type_return valueType = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:10: ( LPAREN keyType= type ',' valueType= type RPAREN )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:10: LPAREN keyType= type ',' valueType= type RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred50_Iocl1295); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred50_Iocl1299);
        keyType=type();

        state._fsp--;
        if (state.failed) return ;
        match(input,77,FOLLOW_77_in_synpred50_Iocl1301); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred50_Iocl1305);
        valueType=type();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred50_Iocl1307); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_Iocl

    // $ANTLR start synpred59_Iocl
    public final void synpred59_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:4: ( assignExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred59_Iocl1400);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Iocl

    // $ANTLR start synpred64_Iocl
    public final void synpred64_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:301:4: ( forExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:301:4: forExp
        {
        pushFollow(FOLLOW_forExp_in_synpred64_Iocl1425);
        forExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_Iocl

    // $ANTLR start synpred75_Iocl
    public final void synpred75_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:15: ( elifExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred75_Iocl1735);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Iocl

    // $ANTLR start synpred76_Iocl
    public final void synpred76_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:26: ( elseExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred76_Iocl1740);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_Iocl

    // $ANTLR start synpred77_Iocl
    public final void synpred77_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:36: ( ENDIF )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:352:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred77_Iocl1744); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_Iocl

    // Delegated rules

    public final boolean synpred42_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred77_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_Iocl_fragment(); // can never throw exception
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
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA1_eotS =
        "\32\uffff";
    static final String DFA1_eofS =
        "\32\uffff";
    static final String DFA1_minS =
        "\1\12\7\uffff\13\0\7\uffff";
    static final String DFA1_maxS =
        "\1\105\7\uffff\13\0\7\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\26\uffff\1\2\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\2\1\1\21\1\uffff\1\1\12\uffff\1\1\4\uffff\2\1\1"+
            "\22\2\uffff\3\30\6\uffff\1\1\1\uffff\1\1\2\uffff\1\17\1\uffff"+
            "\2\1\1\uffff\1\1\2\uffff\1\11\1\16\1\14\1\15\1\12\1\13\1\10"+
            "\1\uffff\1\20",
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
            return "113:1: oclExpression : ( imperativeExp | logicalExp );";
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

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index1_18);
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
    static final String DFA10_eotS =
        "\16\uffff";
    static final String DFA10_eofS =
        "\16\uffff";
    static final String DFA10_minS =
        "\1\20\13\0\2\uffff";
    static final String DFA10_maxS =
        "\1\105\13\0\2\uffff";
    static final String DFA10_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\12\23\uffff\1\13\20\uffff\1\10\7\uffff\1\2\1\7\1\5\1\6\1"+
            "\3\1\4\1\1\1\uffff\1\11",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "148:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\20\2\0\11\uffff";
    static final String DFA16_maxS =
        "\1\105\2\0\11\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\1\4\uffff\1\2\1\3\1\uffff\1\4";
    static final String DFA16_specialS =
        "\1\uffff\1\0\1\1\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\11\23\uffff\1\13\20\uffff\1\10\7\uffff\1\2\5\3\1\1\1\uffff"+
            "\1\11",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "171:1: oclExp : ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 3;}

                        else if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (synpred29_Iocl()) ) {s = 9;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 3;}

                        else if ( (synpred29_Iocl()) ) {s = 9;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\33\uffff";
    static final String DFA25_eofS =
        "\33\uffff";
    static final String DFA25_minS =
        "\1\12\1\0\31\uffff";
    static final String DFA25_maxS =
        "\1\105\1\0\31\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\27\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\31\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\3\uffff\3\2\1\uffff\1\2\12\uffff\1\2\4\uffff\3\2\2\uffff"+
            "\3\2\6\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\6\2\1\1\1\uffff\1\2",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "246:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_Iocl()) ) {s = 26;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\54\uffff";
    static final String DFA30_eofS =
        "\1\2\53\uffff";
    static final String DFA30_minS =
        "\1\5\1\0\52\uffff";
    static final String DFA30_maxS =
        "\1\116\1\0\52\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\2\uffff\1\2\3\uffff\7\2\1\uffff\3\2\2\uffff\3\2\3\uffff"+
            "\3\2\1\1\3\2\2\uffff\2\2\1\uffff\1\2\1\uffff\5\2\1\uffff\4\2"+
            "\1\uffff\2\2\1\uffff\7\2\1\uffff\1\2\7\uffff\2\2",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "273:29: ( LPAREN type RPAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_Iocl()) ) {s = 43;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\54\uffff";
    static final String DFA31_eofS =
        "\1\2\53\uffff";
    static final String DFA31_minS =
        "\1\5\1\0\52\uffff";
    static final String DFA31_maxS =
        "\1\116\1\0\52\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\50\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\52\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\2\uffff\1\2\3\uffff\7\2\1\uffff\3\2\2\uffff\3\2\3\uffff"+
            "\3\2\1\1\3\2\2\uffff\2\2\1\uffff\1\2\1\uffff\5\2\1\uffff\4\2"+
            "\1\uffff\2\2\1\uffff\7\2\1\uffff\1\2\7\uffff\2\2",
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
            return "279:9: ( LPAREN keyType= type ',' valueType= type RPAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_Iocl()) ) {s = 43;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
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
    static final String DFA34_eotS =
        "\33\uffff";
    static final String DFA34_eofS =
        "\33\uffff";
    static final String DFA34_minS =
        "\1\12\7\uffff\13\0\10\uffff";
    static final String DFA34_maxS =
        "\1\105\7\uffff\13\0\10\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\13\uffff\1\10\1\11\1\12"+
        "\1\13\1\15\1\7\1\14\1\16";
    static final String DFA34_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\3\uffff\1\4\1\5\1\21\1\uffff\1\1\12\uffff\1\25\4\uffff"+
            "\1\27\1\1\1\22\13\uffff\1\23\1\uffff\1\6\2\uffff\1\17\1\uffff"+
            "\1\26\1\7\1\uffff\1\24\2\uffff\1\11\1\16\1\14\1\15\1\12\1\13"+
            "\1\10\1\uffff\1\20",
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
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "289:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_18 = input.LA(1);

                         
                        int index34_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_Iocl()) ) {s = 24;}

                        else if ( (synpred64_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index34_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp429 = new BitSet(new long[]{0x0800200000000022L});
    public static final BitSet FOLLOW_set_in_logicalExp432 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp445 = new BitSet(new long[]{0x0800200000000022L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp458 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_set_in_equalityExp461 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp470 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp483 = new BitSet(new long[]{0x0000006018000002L});
    public static final BitSet FOLLOW_set_in_relationalExp486 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp503 = new BitSet(new long[]{0x0000006018000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp516 = new BitSet(new long[]{0x0000808000000002L});
    public static final BitSet FOLLOW_set_in_additiveExp519 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp528 = new BitSet(new long[]{0x0000808000000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp541 = new BitSet(new long[]{0x0000080000020002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp544 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp554 = new BitSet(new long[]{0x0000080000020002L});
    public static final BitSet FOLLOW_set_in_unaryExp567 = new BitSet(new long[]{0xE020039000010000L,0x000000000000002FL});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiationExp_in_unaryExp581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_instantiationExp597 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_pathName_in_instantiationExp600 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_instantiationExp602 = new BitSet(new long[]{0xE5AD039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_arguments_in_instantiationExp605 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_instantiationExp608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp620 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp622 = new BitSet(new long[]{0x0000000000080082L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyCallExp640 = new BitSet(new long[]{0x1020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_propertyCallExp654 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeCallExp_in_modelPropertyCallExp673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp684 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp686 = new BitSet(new long[]{0xE5AD039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_arguments_in_operationCallExp688 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp705 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp707 = new BitSet(new long[]{0xE5AD039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_arguments_in_operationCallExp709 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp768 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_oclExp770 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerationLiteralExp_in_literalExp809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteralExp_in_literalExp825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp836 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp838 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp840 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_collectionLiteralParts879 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_nullLiteralExp927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp1003 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_enumerationLiteralExp1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp1008 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp1049 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp1051 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_iteratorExp1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iteratorExp1071 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp1075 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp1109 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1118 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iterateExp1131 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1133 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1164 = new BitSet(new long[]{0x0000000001002002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1167 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1169 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1174 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arguments1206 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_arguments1209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1250 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1253 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_collectionType1255 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DICT_in_type1292 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LPAREN_in_type1295 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_type1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_type1301 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_type1305 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1339 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1344 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logExp_in_imperativeExp1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeOperationCallExp_in_imperativeExp1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1446 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1449 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_imperativeExp_in_blockExp1451 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1474 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1488 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1492 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1494 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1517 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1531 = new BitSet(new long[]{0xE5E5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_logicalExp_in_returnExp1533 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1559 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_imperativeVarDeclarations1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1594 = new BitSet(new long[]{0x0000000201002002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1597 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1599 = new BitSet(new long[]{0x0000000201000002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1605 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1609 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_logicalExp_in_imperativeVarDeclaration1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_assignExp1640 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_set_in_assignExp1642 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_logicalExp_in_assignExp1651 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1665 = new BitSet(new long[]{0xA000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_raiseExp1669 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1673 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1688 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1690 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_logicalExp_in_whileExp1696 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1698 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_imperativeExp_in_whileExp1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1730 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1732 = new BitSet(new long[]{0x0000000000D00002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1735 = new BitSet(new long[]{0x0000000000D00002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1740 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1785 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1801 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_logicalExp_in_altExp1807 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1809 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_imperativeExp_in_altExp1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1839 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1841 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_imperativeExp_in_tryExp1843 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1846 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_except_in_tryExp1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1870 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1872 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_except1874 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1876 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1878 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_imperativeExp_in_except1880 = new BitSet(new long[]{0xE5A7039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_RCURLY_in_except1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1906 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1910 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1914 = new BitSet(new long[]{0x0008000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_forExp1917 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_forExp1923 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1927 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_oclExpression_in_forExp1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_iteratorList1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LOG_in_logExp1984 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_logExp1986 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_logExp1988 = new BitSet(new long[]{0x0008000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_logExp1991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_logExp1993 = new BitSet(new long[]{0x0008000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_logExp1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_logExp2000 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_logExp2004 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_logExp2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_imperativeOperationCallExp2029 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_imperativeOperationCallExp2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_synpred20_Iocl620 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred20_Iocl622 = new BitSet(new long[]{0x0000000000080082L});
    public static final BitSet FOLLOW_operationCallExp_in_synpred23_Iocl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_synpred27_Iocl752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred28_Iocl758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred29_Iocl763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred34_Iocl879 = new BitSet(new long[]{0xE5A5039C2005C400L,0x000000000000002FL});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred34_Iocl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred40_Iocl1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred40_Iocl1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred41_Iocl1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred41_Iocl1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred41_Iocl1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_synpred41_Iocl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred42_Iocl1118 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred42_Iocl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred47_Iocl1253 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_synpred47_Iocl1255 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred47_Iocl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred50_Iocl1295 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_synpred50_Iocl1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred50_Iocl1301 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000028L});
    public static final BitSet FOLLOW_type_in_synpred50_Iocl1305 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred50_Iocl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred59_Iocl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_synpred64_Iocl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred75_Iocl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred76_Iocl1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred77_Iocl1744 = new BitSet(new long[]{0x0000000000000002L});

}