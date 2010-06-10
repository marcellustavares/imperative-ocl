// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-06-10 00:35:41

package org.orcas.iocl.parser.antlr;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ALT_EXP", "APPEND", "ARROW", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "ITERATOR_NAME", "IDENTIFIER", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int T__68=68;
    public static final int ITERATOR_NAME=57;
    public static final int APPEND=6;
    public static final int EXPONENT=61;
    public static final int T__67=67;
    public static final int LT=31;
    public static final int WHILE=49;
    public static final int PRIMITIVE_TYPE_LITERAL=59;
    public static final int COMPUTE=12;
    public static final int GTE=24;
    public static final int OCTAL_ESC=66;
    public static final int DO=14;
    public static final int FOR=22;
    public static final int NOT=34;
    public static final int AND=4;
    public static final int EXCEPT=21;
    public static final int EOF=-1;
    public static final int LTE=32;
    public static final int BREAK=8;
    public static final int LPAREN=30;
    public static final int IF=25;
    public static final int RPAREN=42;
    public static final int ESC_SEQ=62;
    public static final int STRING_LITERAL=53;
    public static final int REAL_LITERAL=56;
    public static final int SCOPE=43;
    public static final int COLLECTION_TYPE_LITERAL=52;
    public static final int CONTINUE=13;
    public static final int NOT_EQUAL=35;
    public static final int IS=28;
    public static final int IDENTIFIER=58;
    public static final int ITERATOR=27;
    public static final int EQUAL=20;
    public static final int RETURN=41;
    public static final int ENDIF=17;
    public static final int PLUS=38;
    public static final int VAR=47;
    public static final int RAISE=39;
    public static final int DOT=16;
    public static final int COLLECTION_LITERAL=9;
    public static final int FOR_NAME=60;
    public static final int XOR=50;
    public static final int COLLECTION_TYPE=10;
    public static final int UNICODE_ESC=65;
    public static final int NUMERIC_OPERATION=51;
    public static final int ELSE=19;
    public static final int HEX_DIGIT=64;
    public static final int LCURLY=29;
    public static final int SEMICOLON=45;
    public static final int MINUS=33;
    public static final int MULT=36;
    public static final int TRY=46;
    public static final int BOOLEAN_LITERAL=54;
    public static final int COLON=11;
    public static final int ALT_EXP=5;
    public static final int ELIF=18;
    public static final int ITERATE=26;
    public static final int WS=63;
    public static final int VARIABLE=48;
    public static final int INTEGER_LITERAL=55;
    public static final int OR=37;
    public static final int RCURLY=40;
    public static final int ARROW=7;
    public static final int GT=23;
    public static final int DIV=15;
    public static final int SELF=44;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[117+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IoclParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g"; }


    public static class oclExpressionCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpressionCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:1: oclExpressionCS : ( imperativeExp | logicalExpCS );
    public final IoclParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IoclParser.oclExpressionCS_return retval = new IoclParser.oclExpressionCS_return();
        retval.start = input.LT(1);
        int oclExpressionCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExpCS_return logicalExpCS2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:85:2: ( imperativeExp | logicalExpCS )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:85:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpressionCS362);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:86:4: logicalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExpCS_in_oclExpressionCS367);
                    logicalExpCS2=logicalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpCS2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, oclExpressionCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExpressionCS"

    public static class logicalExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:89:1: logicalExpCS : equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* ;
    public final IoclParser.logicalExpCS_return logicalExpCS() throws RecognitionException {
        IoclParser.logicalExpCS_return retval = new IoclParser.logicalExpCS_return();
        retval.start = input.LT(1);
        int logicalExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set4=null;
        IoclParser.equalityExpCS_return equalityExpCS3 = null;

        IoclParser.equalityExpCS_return equalityExpCS5 = null;


        Object set4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:2: ( equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:4: equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS378);
            equalityExpCS3=equalityExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:18: ( ( AND | OR | XOR ) equalityExpCS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:19: ( AND | OR | XOR ) equalityExpCS
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

            	    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS394);
            	    equalityExpCS5=equalityExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS5.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, logicalExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalExpCS"

    public static class equalityExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:93:1: equalityExpCS : relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* ;
    public final IoclParser.equalityExpCS_return equalityExpCS() throws RecognitionException {
        IoclParser.equalityExpCS_return retval = new IoclParser.equalityExpCS_return();
        retval.start = input.LT(1);
        int equalityExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set7=null;
        IoclParser.relationalExpCS_return relationalExpCS6 = null;

        IoclParser.relationalExpCS_return relationalExpCS8 = null;


        Object set7_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:2: ( relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:4: relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS407);
            relationalExpCS6=relationalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:20: ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:21: ( EQUAL | NOT_EQUAL ) relationalExpCS
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

            	    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS419);
            	    relationalExpCS8=relationalExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS8.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, equalityExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpCS"

    public static class relationalExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:97:1: relationalExpCS : additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* ;
    public final IoclParser.relationalExpCS_return relationalExpCS() throws RecognitionException {
        IoclParser.relationalExpCS_return retval = new IoclParser.relationalExpCS_return();
        retval.start = input.LT(1);
        int relationalExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set10=null;
        IoclParser.additiveExpCS_return additiveExpCS9 = null;

        IoclParser.additiveExpCS_return additiveExpCS11 = null;


        Object set10_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:2: ( additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:4: additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS432);
            additiveExpCS9=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:18: ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:19: ( LT | LTE | GT | GTE ) additiveExpCS
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

            	    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS452);
            	    additiveExpCS11=additiveExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS11.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, relationalExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpCS"

    public static class additiveExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:101:1: additiveExpCS : multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* ;
    public final IoclParser.additiveExpCS_return additiveExpCS() throws RecognitionException {
        IoclParser.additiveExpCS_return retval = new IoclParser.additiveExpCS_return();
        retval.start = input.LT(1);
        int additiveExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set13=null;
        IoclParser.multiplicativeExpCS_return multiplicativeExpCS12 = null;

        IoclParser.multiplicativeExpCS_return multiplicativeExpCS14 = null;


        Object set13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:2: ( multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:4: multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS465);
            multiplicativeExpCS12=multiplicativeExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:24: ( ( PLUS | MINUS ) multiplicativeExpCS )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:25: ( PLUS | MINUS ) multiplicativeExpCS
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

            	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS477);
            	    multiplicativeExpCS14=multiplicativeExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS14.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, additiveExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpCS"

    public static class multiplicativeExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:105:1: multiplicativeExpCS : unaryExpCS ( ( MULT | DIV ) unaryExpCS )* ;
    public final IoclParser.multiplicativeExpCS_return multiplicativeExpCS() throws RecognitionException {
        IoclParser.multiplicativeExpCS_return retval = new IoclParser.multiplicativeExpCS_return();
        retval.start = input.LT(1);
        int multiplicativeExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set16=null;
        IoclParser.unaryExpCS_return unaryExpCS15 = null;

        IoclParser.unaryExpCS_return unaryExpCS17 = null;


        Object set16_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:2: ( unaryExpCS ( ( MULT | DIV ) unaryExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: unaryExpCS ( ( MULT | DIV ) unaryExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS490);
            unaryExpCS15=unaryExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:15: ( ( MULT | DIV ) unaryExpCS )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:16: ( MULT | DIV ) unaryExpCS
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

            	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS503);
            	    unaryExpCS17=unaryExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS17.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, multiplicativeExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpCS"

    public static class unaryExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:109:1: unaryExpCS : ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS );
    public final IoclParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IoclParser.unaryExpCS_return retval = new IoclParser.unaryExpCS_return();
        retval.start = input.LT(1);
        int unaryExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set18=null;
        IoclParser.unaryExpCS_return unaryExpCS19 = null;

        IoclParser.dotArrowExpCS_return dotArrowExpCS20 = null;


        Object set18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:110:2: ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=MINUS && LA7_0<=NOT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN||LA7_0==SELF||(LA7_0>=NUMERIC_OPERATION && LA7_0<=REAL_LITERAL)||LA7_0==IDENTIFIER) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:110:4: ( MINUS | NOT ) unaryExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    set18=(Token)input.LT(1);
                    set18=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=NOT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set18), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS525);
                    unaryExpCS19=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:4: dotArrowExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS530);
                    dotArrowExpCS20=dotArrowExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExpCS20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, unaryExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpCS"

    public static class dotArrowExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotArrowExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );
    public final IoclParser.dotArrowExpCS_return dotArrowExpCS() throws RecognitionException {
        IoclParser.dotArrowExpCS_return retval = new IoclParser.dotArrowExpCS_return();
        retval.start = input.LT(1);
        int dotArrowExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        IoclParser.argumentsCS_return argumentsCS23 = null;

        IoclParser.propertyCallExp_return propertyCallExp25 = null;

        IoclParser.oclExpCS_return oclExpCS26 = null;


        Object NUMERIC_OPERATION21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_argumentsCS=new RewriteRuleSubtreeStream(adaptor,"rule argumentsCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:2: ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:4: NUMERIC_OPERATION '(' ( argumentsCS )? ')'
                    {
                    NUMERIC_OPERATION21=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION21);

                    char_literal22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dotArrowExpCS543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal22);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:26: ( argumentsCS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BREAK||(LA8_0>=COMPUTE && LA8_0<=DO)||LA8_0==IF||(LA8_0>=LCURLY && LA8_0<=LPAREN)||(LA8_0>=MINUS && LA8_0<=NOT)||LA8_0==RAISE||LA8_0==RETURN||LA8_0==SELF||(LA8_0>=TRY && LA8_0<=VAR)||LA8_0==WHILE||(LA8_0>=NUMERIC_OPERATION && LA8_0<=REAL_LITERAL)||LA8_0==IDENTIFIER) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS545);
                            argumentsCS23=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentsCS.add(argumentsCS23.getTree());

                            }
                            break;

                    }

                    char_literal24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dotArrowExpCS548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal24);



                    // AST REWRITE
                    // elements: argumentsCS, NUMERIC_OPERATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:43: -> ^( NUMERIC_OPERATION ( argumentsCS )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:46: ^( NUMERIC_OPERATION ( argumentsCS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:66: ( argumentsCS )?
                        if ( stream_argumentsCS.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentsCS.nextTree());

                        }
                        stream_argumentsCS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:4: propertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS562);
                    propertyCallExp25=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp25.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:117:4: oclExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS567);
                    oclExpCS26=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpCS26.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, dotArrowExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotArrowExpCS"

    public static class oclExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:1: oclExpCS : ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS );
    public final IoclParser.oclExpCS_return oclExpCS() throws RecognitionException {
        IoclParser.oclExpCS_return retval = new IoclParser.oclExpCS_return();
        retval.start = input.LT(1);
        int oclExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal31=null;
        IoclParser.variableExp_return variableExp27 = null;

        IoclParser.literalExpCS_return literalExpCS28 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS30 = null;


        Object char_literal29_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:121:2: ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS )
            int alt10=3;
            switch ( input.LA(1) ) {
            case SELF:
            case IDENTIFIER:
                {
                alt10=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt10=2;
                }
                break;
            case LPAREN:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:121:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExpCS578);
                    variableExp27=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp27.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:122:4: literalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExpCS_in_oclExpCS583);
                    literalExpCS28=literalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExpCS28.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:4: '(' oclExpressionCS ')'
                    {
                    char_literal29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExpCS588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal29);

                    pushFollow(FOLLOW_oclExpressionCS_in_oclExpCS590);
                    oclExpressionCS30=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS30.getTree());
                    char_literal31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExpCS592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal31);



                    // AST REWRITE
                    // elements: oclExpressionCS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:28: -> oclExpressionCS
                    {
                        adaptor.addChild(root_0, stream_oclExpressionCS.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, oclExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExpCS"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:126:1: variableExp : simpleNameCS ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleNameCS_return simpleNameCS32 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:2: ( simpleNameCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:4: simpleNameCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleNameCS_in_variableExp610);
            simpleNameCS32=simpleNameCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleNameCS32.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:130:1: literalExpCS : ( collectionLiteralExpCS | primitiveLiteralExpCS );
    public final IoclParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IoclParser.literalExpCS_return retval = new IoclParser.literalExpCS_return();
        retval.start = input.LT(1);
        int literalExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS33 = null;

        IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS34 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:2: ( collectionLiteralExpCS | primitiveLiteralExpCS )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==COLLECTION_TYPE_LITERAL) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=STRING_LITERAL && LA11_0<=REAL_LITERAL)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:4: collectionLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS621);
                    collectionLiteralExpCS33=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExpCS33.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:4: primitiveLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS627);
                    primitiveLiteralExpCS34=primitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExpCS34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, literalExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExpCS"

    public static class collectionLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:1: collectionLiteralExpCS : collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) ;
    public final IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS() throws RecognitionException {
        IoclParser.collectionLiteralExpCS_return retval = new IoclParser.collectionLiteralExpCS_return();
        retval.start = input.LT(1);
        int collectionLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS35 = null;

        IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS37 = null;


        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifierCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifierCS");
        RewriteRuleSubtreeStream stream_collectionLiteralPartsCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartsCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:2: ( collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:4: collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS638);
            collectionTypeIdentifierCS35=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS35.getTree());
            char_literal36=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExpCS640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal36);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:35: ( collectionLiteralPartsCS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BREAK||(LA12_0>=COMPUTE && LA12_0<=DO)||LA12_0==IF||(LA12_0>=LCURLY && LA12_0<=LPAREN)||(LA12_0>=MINUS && LA12_0<=NOT)||LA12_0==RAISE||LA12_0==RETURN||LA12_0==SELF||(LA12_0>=TRY && LA12_0<=VAR)||LA12_0==WHILE||(LA12_0>=NUMERIC_OPERATION && LA12_0<=REAL_LITERAL)||LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS642);
                    collectionLiteralPartsCS37=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralPartsCS.add(collectionLiteralPartsCS37.getTree());

                    }
                    break;

            }

            char_literal38=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExpCS645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal38);



            // AST REWRITE
            // elements: collectionLiteralPartsCS, collectionTypeIdentifierCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:65: -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:68: ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifierCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:116: ( collectionLiteralPartsCS )?
                if ( stream_collectionLiteralPartsCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_collectionLiteralPartsCS.nextTree());

                }
                stream_collectionLiteralPartsCS.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, collectionLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExpCS"

    public static class collectionTypeIdentifierCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifierCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:139:1: collectionTypeIdentifierCS : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IoclParser.collectionTypeIdentifierCS_return retval = new IoclParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifierCS_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL39=null;

        Object COLLECTION_TYPE_LITERAL39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL39=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS667); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL39_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL39);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL39_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, collectionTypeIdentifierCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifierCS"

    public static class collectionLiteralPartsCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartsCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:1: collectionLiteralPartsCS : clp1= collectionLiteralPartCS ( ',' clp2= collectionLiteralPartCS )* -> $clp1 ( $clp2)* ;
    public final IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IoclParser.collectionLiteralPartsCS_return retval = new IoclParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal40=null;
        IoclParser.collectionLiteralPartCS_return clp1 = null;

        IoclParser.collectionLiteralPartCS_return clp2 = null;


        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_collectionLiteralPartCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:2: (clp1= collectionLiteralPartCS ( ',' clp2= collectionLiteralPartCS )* -> $clp1 ( $clp2)* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: clp1= collectionLiteralPartCS ( ',' clp2= collectionLiteralPartCS )*
            {
            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS682);
            clp1=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(clp1.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:35: ( ',' clp2= collectionLiteralPartCS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==67) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:36: ',' clp2= collectionLiteralPartCS
            	    {
            	    char_literal40=(Token)match(input,67,FOLLOW_67_in_collectionLiteralPartsCS685); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_67.add(char_literal40);

            	    pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS691);
            	    clp2=collectionLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(clp2.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: clp1, clp2
            // token labels: 
            // rule labels: clp1, clp2, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_clp1=new RewriteRuleSubtreeStream(adaptor,"rule clp1",clp1!=null?clp1.tree:null);
            RewriteRuleSubtreeStream stream_clp2=new RewriteRuleSubtreeStream(adaptor,"rule clp2",clp2!=null?clp2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:73: -> $clp1 ( $clp2)*
            {
                adaptor.addChild(root_0, stream_clp1.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:82: ( $clp2)*
                while ( stream_clp2.hasNext() ) {
                    adaptor.addChild(root_0, stream_clp2.nextTree());

                }
                stream_clp2.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, collectionLiteralPartsCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartsCS"

    public static class collectionLiteralPartCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:147:1: collectionLiteralPartCS : oclExpressionCS ;
    public final IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IoclParser.collectionLiteralPartCS_return retval = new IoclParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS41 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:2: ( oclExpressionCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:4: oclExpressionCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS713);
            oclExpressionCS41=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS41.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, collectionLiteralPartCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartCS"

    public static class primitiveLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:151:1: primitiveLiteralExpCS : ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS );
    public final IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IoclParser.primitiveLiteralExpCS_return retval = new IoclParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);
        int primitiveLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExpCS_return numericLiteralExpCS42 = null;

        IoclParser.stringLiteralExpCS_return stringLiteralExpCS43 = null;

        IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS44 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:2: ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS )
            int alt14=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt14=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt14=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:4: numericLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS724);
                    numericLiteralExpCS42=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExpCS42.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:4: stringLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS729);
                    stringLiteralExpCS43=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExpCS43.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:154:4: booleanLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS734);
                    booleanLiteralExpCS44=booleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExpCS44.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, primitiveLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExpCS"

    public static class numericLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:1: numericLiteralExpCS : ( integerLiteralExpCS | realLiteralExpCS );
    public final IoclParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IoclParser.numericLiteralExpCS_return retval = new IoclParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);
        int numericLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExpCS_return integerLiteralExpCS45 = null;

        IoclParser.realLiteralExpCS_return realLiteralExpCS46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:2: ( integerLiteralExpCS | realLiteralExpCS )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INTEGER_LITERAL) ) {
                alt15=1;
            }
            else if ( (LA15_0==REAL_LITERAL) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:4: integerLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS745);
                    integerLiteralExpCS45=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExpCS45.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:159:4: realLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS750);
                    realLiteralExpCS46=realLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExpCS46.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, numericLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExpCS"

    public static class stringLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:162:1: stringLiteralExpCS : STRING_LITERAL ;
    public final IoclParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IoclParser.stringLiteralExpCS_return retval = new IoclParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);
        int stringLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL47=null;

        Object STRING_LITERAL47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:163:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:163:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL47=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS765); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL47_tree = (Object)adaptor.create(STRING_LITERAL47);
            adaptor.addChild(root_0, STRING_LITERAL47_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, stringLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExpCS"

    public static class booleanLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:1: booleanLiteralExpCS : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IoclParser.booleanLiteralExpCS_return retval = new IoclParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);
        int booleanLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL48=null;

        Object BOOLEAN_LITERAL48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:167:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:167:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL48=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL48_tree = (Object)adaptor.create(BOOLEAN_LITERAL48);
            adaptor.addChild(root_0, BOOLEAN_LITERAL48_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, booleanLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExpCS"

    public static class integerLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:1: integerLiteralExpCS : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IoclParser.integerLiteralExpCS_return retval = new IoclParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);
        int integerLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL49=null;

        Object INTEGER_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL49=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL49_tree = (Object)adaptor.create(INTEGER_LITERAL49);
            adaptor.addChild(root_0, INTEGER_LITERAL49_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, integerLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExpCS"

    public static class realLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:174:1: realLiteralExpCS : REAL_LITERAL ;
    public final IoclParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IoclParser.realLiteralExpCS_return retval = new IoclParser.realLiteralExpCS_return();
        retval.start = input.LT(1);
        int realLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL50=null;

        Object REAL_LITERAL50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL50=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL50_tree = (Object)adaptor.create(REAL_LITERAL50);
            adaptor.addChild(root_0, REAL_LITERAL50_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, realLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExpCS"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:178:1: propertyCallExp : ( modelPropertyCallExp | loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp51 = null;

        IoclParser.loopExp_return loopExp52 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:2: ( modelPropertyCallExp | loopExp )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:4: modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp810);
                    modelPropertyCallExp51=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp51.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:4: loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopExp_in_propertyCallExp815);
                    loopExp52=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp52.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:183:1: modelPropertyCallExp : operationCallExpCS ;
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExpCS_return operationCallExpCS53 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:2: ( operationCallExpCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: operationCallExpCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp826);
            operationCallExpCS53=operationCallExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExpCS53.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:187:1: loopExp : ( iteratorExpCS | iterateExpCS );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExpCS_return iteratorExpCS54 = null;

        IoclParser.iterateExpCS_return iterateExpCS55 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:2: ( iteratorExpCS | iterateExpCS )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:4: iteratorExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExpCS_in_loopExp837);
                    iteratorExpCS54=iteratorExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExpCS54.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:4: iterateExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExpCS_in_loopExp842);
                    iterateExpCS55=iterateExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExpCS55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, loopExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loopExp"

    public static class iteratorExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:192:1: iteratorExpCS : oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) ;
    public final IoclParser.iteratorExpCS_return iteratorExpCS() throws RecognitionException {
        IoclParser.iteratorExpCS_return retval = new IoclParser.iteratorExpCS_return();
        retval.start = input.LT(1);
        int iteratorExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW57=null;
        Token ITERATOR_NAME58=null;
        Token LPAREN59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token RPAREN63=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpCS_return oclExpCS56 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS62 = null;


        Object ARROW57_tree=null;
        Object ITERATOR_NAME58_tree=null;
        Object LPAREN59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object RPAREN63_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:2: ( oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:5: oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iteratorExpCS854);
            oclExpCS56=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS56.getTree());
            ARROW57=(Token)match(input,ARROW,FOLLOW_ARROW_in_iteratorExpCS856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW57);

            ITERATOR_NAME58=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExpCS858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME58);

            LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExpCS860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN59);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:42: (v1= variableDeclaration ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==IDENTIFIER) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred30_Iocl()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:43: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS868);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal60=(Token)match(input,67,FOLLOW_67_in_iteratorExpCS870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_67.add(char_literal60);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS878);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal61=(Token)match(input,68,FOLLOW_68_in_iteratorExpCS880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal61);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpressionCS_in_iteratorExpCS884);
            oclExpressionCS62=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS62.getTree());
            RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExpCS886); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN63);



            // AST REWRITE
            // elements: v2, oclExpressionCS, ITERATOR_NAME, oclExpCS, v1
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
            // 193:128: -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:131: ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:165: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:170: ( $v2)?
                if ( stream_v2.hasNext() ) {
                    adaptor.addChild(root_1, stream_v2.nextTree());

                }
                stream_v2.reset();
                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, iteratorExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorExpCS"

    public static class iterateExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterateExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:196:1: iterateExpCS : oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) ;
    public final IoclParser.iterateExpCS_return iterateExpCS() throws RecognitionException {
        IoclParser.iterateExpCS_return retval = new IoclParser.iterateExpCS_return();
        retval.start = input.LT(1);
        int iterateExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW65=null;
        Token ITERATE66=null;
        Token LPAREN67=null;
        Token SEMICOLON68=null;
        Token char_literal69=null;
        Token RPAREN71=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpCS_return oclExpCS64 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS70 = null;


        Object ARROW65_tree=null;
        Object ITERATE66_tree=null;
        Object LPAREN67_tree=null;
        Object SEMICOLON68_tree=null;
        Object char_literal69_tree=null;
        Object RPAREN71_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:2: ( oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:4: oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iterateExpCS917);
            oclExpCS64=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS64.getTree());
            ARROW65=(Token)match(input,ARROW,FOLLOW_ARROW_in_iterateExpCS919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW65);

            ITERATE66=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExpCS921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE66);

            LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpCS923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN67);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:34: (v1= variableDeclaration SEMICOLON )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred32_Iocl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:35: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS930);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON68=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExpCS932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON68);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS940);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal69=(Token)match(input,68,FOLLOW_68_in_iterateExpCS943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal69);

            pushFollow(FOLLOW_oclExpressionCS_in_iterateExpCS945);
            oclExpressionCS70=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS70.getTree());
            RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpCS947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN71);



            // AST REWRITE
            // elements: v2, v1, ITERATE, oclExpressionCS, oclExpCS
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
            // 197:125: -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:128: ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:147: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                adaptor.addChild(root_1, stream_v2.nextTree());
                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, iterateExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterateExpCS"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        IoclParser.type_return type74 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS76 = null;


        Object IDENTIFIER72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )?
            {
            IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration975); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER72);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:15: ( ':' type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==COLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:16: ':' type
                    {
                    char_literal73=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal73);

                    pushFollow(FOLLOW_type_in_variableDeclaration980);
                    type74=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type74.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:27: ( '=' oclExpressionCS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:28: '=' oclExpressionCS
                    {
                    char_literal75=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal75);

                    pushFollow(FOLLOW_oclExpressionCS_in_variableDeclaration987);
                    oclExpressionCS76=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS76.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, oclExpressionCS, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:50: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:53: ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:75: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:81: ( oclExpressionCS )?
                if ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class operationCallExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:204:1: operationCallExpCS : oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' ;
    public final IoclParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IoclParser.operationCallExpCS_return retval = new IoclParser.operationCallExpCS_return();
        retval.start = input.LT(1);
        int operationCallExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        IoclParser.oclExpCS_return oclExpCS77 = null;

        IoclParser.simpleNameCS_return simpleNameCS79 = null;

        IoclParser.argumentsCS_return argumentsCS81 = null;


        Object set78_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:2: ( oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:4: oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpCS_in_operationCallExpCS1014);
            oclExpCS77=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpCS77.getTree());
            set78=(Token)input.LT(1);
            set78=(Token)input.LT(1);
            if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set78), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_simpleNameCS_in_operationCallExpCS1025);
            simpleNameCS79=simpleNameCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleNameCS79.getTree());
            char_literal80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExpCS1027); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:46: ( argumentsCS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BREAK||(LA23_0>=COMPUTE && LA23_0<=DO)||LA23_0==IF||(LA23_0>=LCURLY && LA23_0<=LPAREN)||(LA23_0>=MINUS && LA23_0<=NOT)||LA23_0==RAISE||LA23_0==RETURN||LA23_0==SELF||(LA23_0>=TRY && LA23_0<=VAR)||LA23_0==WHILE||(LA23_0>=NUMERIC_OPERATION && LA23_0<=REAL_LITERAL)||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS1030);
                    argumentsCS81=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsCS81.getTree());

                    }
                    break;

            }

            char_literal82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExpCS1033); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, operationCallExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExpCS"

    public static class argumentsCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:208:1: argumentsCS : oclExpressionCS ( ',' oclExpressionCS )* ;
    public final IoclParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IoclParser.argumentsCS_return retval = new IoclParser.argumentsCS_return();
        retval.start = input.LT(1);
        int argumentsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal84=null;
        IoclParser.oclExpressionCS_return oclExpressionCS83 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS85 = null;


        Object char_literal84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:2: ( oclExpressionCS ( ',' oclExpressionCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:4: oclExpressionCS ( ',' oclExpressionCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1045);
            oclExpressionCS83=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS83.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:20: ( ',' oclExpressionCS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==67) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:21: ',' oclExpressionCS
            	    {
            	    char_literal84=(Token)match(input,67,FOLLOW_67_in_argumentsCS1048); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1051);
            	    oclExpressionCS85=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS85.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, argumentsCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argumentsCS"

    public static class simpleNameCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleNameCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:1: simpleNameCS : ( SELF | IDENTIFIER );
    public final IoclParser.simpleNameCS_return simpleNameCS() throws RecognitionException {
        IoclParser.simpleNameCS_return retval = new IoclParser.simpleNameCS_return();
        retval.start = input.LT(1);
        int simpleNameCS_StartIndex = input.index();
        Object root_0 = null;

        Token set86=null;

        Object set86_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:2: ( SELF | IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set86=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set86));
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, simpleNameCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleNameCS"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:218:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL87=null;

        Object PRIMITIVE_TYPE_LITERAL87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL87=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1082); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL87_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL87);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL87_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:222:1: collectionType : collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN89=null;
        Token RPAREN91=null;
        IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS88 = null;

        IoclParser.type_return type90 = null;


        Object LPAREN89_tree=null;
        Object RPAREN91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifierCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifierCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:2: ( collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:4: collectionTypeIdentifierCS LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionType1093);
            collectionTypeIdentifierCS88=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS88.getTree());
            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);

            pushFollow(FOLLOW_type_in_collectionType1097);
            type90=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type90.getTree());
            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);



            // AST REWRITE
            // elements: type, collectionTypeIdentifierCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 223:50: -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:53: ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_TYPE, "COLLECTION_TYPE"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifierCS.nextTree());
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType92 = null;

        IoclParser.collectionType_return collectionType93 = null;

        IoclParser.pathName_return pathName94 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:227:2: ( primitiveType | collectionType | pathName )
            int alt25=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt25=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt25=2;
                }
                break;
            case IDENTIFIER:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:227:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1121);
                    primitiveType92=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType92.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:228:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1126);
                    collectionType93=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType93.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1131);
                    pathName94=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName94.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:232:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER95=null;
        Token SCOPE96=null;
        Token IDENTIFIER97=null;

        Object IDENTIFIER95_tree=null;
        Object SCOPE96_tree=null;
        Object IDENTIFIER97_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER95=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER95);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:15: ( SCOPE IDENTIFIER )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==SCOPE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE96=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1145); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE96);

            	    IDENTIFIER97=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1147); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER97);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER, SCOPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:35: -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:38: ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:57: ( IDENTIFIER )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp98 = null;

        IoclParser.breakExp_return breakExp99 = null;

        IoclParser.computeExp_return computeExp100 = null;

        IoclParser.continueExp_return continueExp101 = null;

        IoclParser.returnExp_return returnExp102 = null;

        IoclParser.variableInitExp_return variableInitExp103 = null;

        IoclParser.assignExp_return assignExp104 = null;

        IoclParser.raiseExp_return raiseExp105 = null;

        IoclParser.whileExp_return whileExp106 = null;

        IoclParser.ifExp_return ifExp107 = null;

        IoclParser.tryExp_return tryExp108 = null;

        IoclParser.forExp_return forExp109 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp )
            int alt27=12;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1173);
                    blockExp98=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp98.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1178);
                    breakExp99=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp99.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:241:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1183);
                    computeExp100=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp100.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1188);
                    continueExp101=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp101.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1193);
                    returnExp102=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp102.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1198);
                    variableInitExp103=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp103.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:245:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1203);
                    assignExp104=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp104.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:246:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1208);
                    raiseExp105=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp105.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1213);
                    whileExp106=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp106.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1218);
                    ifExp107=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp107.getTree());

                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1223);
                    tryExp108=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp108.getTree());

                    }
                    break;
                case 12 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:250:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1228);
                    forExp109=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:253:1: blockExp : ( DO )? LCURLY ( oclExpressionCS )* RCURLY -> ^( DO ( oclExpressionCS )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO110=null;
        Token LCURLY111=null;
        Token RCURLY113=null;
        IoclParser.oclExpressionCS_return oclExpressionCS112 = null;


        Object DO110_tree=null;
        Object LCURLY111_tree=null;
        Object RCURLY113_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:2: ( ( DO )? LCURLY ( oclExpressionCS )* RCURLY -> ^( DO ( oclExpressionCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:4: ( DO )? LCURLY ( oclExpressionCS )* RCURLY
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:4: ( DO )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DO) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO110=(Token)match(input,DO,FOLLOW_DO_in_blockExp1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO110);


                    }
                    break;

            }

            LCURLY111=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY111);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:15: ( oclExpressionCS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BREAK||(LA29_0>=COMPUTE && LA29_0<=DO)||LA29_0==IF||(LA29_0>=LCURLY && LA29_0<=LPAREN)||(LA29_0>=MINUS && LA29_0<=NOT)||LA29_0==RAISE||LA29_0==RETURN||LA29_0==SELF||(LA29_0>=TRY && LA29_0<=VAR)||LA29_0==WHILE||(LA29_0>=NUMERIC_OPERATION && LA29_0<=REAL_LITERAL)||LA29_0==IDENTIFIER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
            	    {
            	    pushFollow(FOLLOW_oclExpressionCS_in_blockExp1244);
            	    oclExpressionCS112=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS112.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            RCURLY113=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY113);



            // AST REWRITE
            // elements: oclExpressionCS, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:39: -> ^( DO ( oclExpressionCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:42: ^( DO ( oclExpressionCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:47: ( oclExpressionCS )*
                while ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:257:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK114=null;
        Token SEMICOLON115=null;

        Object BREAK114_tree=null;
        Object SEMICOLON115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK114=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK114_tree = (Object)adaptor.create(BREAK114);
            adaptor.addChild(root_0, BREAK114_tree);
            }
            SEMICOLON115=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON115_tree = (Object)adaptor.create(SEMICOLON115);
            adaptor.addChild(root_0, SEMICOLON115_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpressionCS RCURLY -> ^( COMPUTE variableDeclaration oclExpressionCS ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE116=null;
        Token LPAREN117=null;
        Token RPAREN119=null;
        Token LCURLY120=null;
        Token RCURLY122=null;
        IoclParser.variableDeclaration_return variableDeclaration118 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS121 = null;


        Object COMPUTE116_tree=null;
        Object LPAREN117_tree=null;
        Object RPAREN119_tree=null;
        Object LCURLY120_tree=null;
        Object RCURLY122_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:2: ( COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpressionCS RCURLY -> ^( COMPUTE variableDeclaration oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:4: COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpressionCS RCURLY
            {
            COMPUTE116=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE116);

            LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN117);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1284);
            variableDeclaration118=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration118.getTree());
            RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN119);

            LCURLY120=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_computeExp1288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY120);

            pushFollow(FOLLOW_oclExpressionCS_in_computeExp1290);
            oclExpressionCS121=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS121.getTree());
            RCURLY122=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_computeExp1292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY122);



            // AST REWRITE
            // elements: variableDeclaration, oclExpressionCS, COMPUTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:76: -> ^( COMPUTE variableDeclaration oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:79: ^( COMPUTE variableDeclaration oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_COMPUTE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_variableDeclaration.nextTree());
                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:265:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE123=null;
        Token SEMICOLON124=null;

        Object CONTINUE123_tree=null;
        Object SEMICOLON124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE123=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE123_tree = (Object)adaptor.create(CONTINUE123);
            adaptor.addChild(root_0, CONTINUE123_tree);
            }
            SEMICOLON124=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON124_tree = (Object)adaptor.create(SEMICOLON124);
            adaptor.addChild(root_0, SEMICOLON124_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:269:1: returnExp : RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN125=null;
        Token SEMICOLON127=null;
        IoclParser.oclExpressionCS_return oclExpressionCS126 = null;


        Object RETURN125_tree=null;
        Object SEMICOLON127_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:2: ( RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:4: RETURN ( oclExpressionCS )? SEMICOLON
            {
            RETURN125=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN125);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:11: ( oclExpressionCS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BREAK||(LA30_0>=COMPUTE && LA30_0<=DO)||LA30_0==IF||(LA30_0>=LCURLY && LA30_0<=LPAREN)||(LA30_0>=MINUS && LA30_0<=NOT)||LA30_0==RAISE||LA30_0==RETURN||LA30_0==SELF||(LA30_0>=TRY && LA30_0<=VAR)||LA30_0==WHILE||(LA30_0>=NUMERIC_OPERATION && LA30_0<=REAL_LITERAL)||LA30_0==IDENTIFIER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
                    {
                    pushFollow(FOLLOW_oclExpressionCS_in_returnExp1328);
                    oclExpressionCS126=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS126.getTree());

                    }
                    break;

            }

            SEMICOLON127=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON127);



            // AST REWRITE
            // elements: RETURN, oclExpressionCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:38: -> ^( RETURN ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:41: ^( RETURN ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:50: ( oclExpressionCS )?
                if ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:273:1: variableInitExp : VAR v1= variableDeclaration ( ',' v2= variableDeclaration )* SEMICOLON -> ^( VAR $v1 $v2) ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR128=null;
        Token char_literal129=null;
        Token SEMICOLON130=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        Object VAR128_tree=null;
        Object char_literal129_tree=null;
        Object SEMICOLON130_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:2: ( VAR v1= variableDeclaration ( ',' v2= variableDeclaration )* SEMICOLON -> ^( VAR $v1 $v2) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:4: VAR v1= variableDeclaration ( ',' v2= variableDeclaration )* SEMICOLON
            {
            VAR128=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR128);

            pushFollow(FOLLOW_variableDeclaration_in_variableInitExp1357);
            v1=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:33: ( ',' v2= variableDeclaration )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==67) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:34: ',' v2= variableDeclaration
            	    {
            	    char_literal129=(Token)match(input,67,FOLLOW_67_in_variableInitExp1360); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_67.add(char_literal129);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableInitExp1366);
            	    v2=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            SEMICOLON130=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON130);



            // AST REWRITE
            // elements: v1, v2, VAR
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
            // 274:75: -> ^( VAR $v1 $v2)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:78: ^( VAR $v1 $v2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                adaptor.addChild(root_1, stream_v1.nextTree());
                adaptor.addChild(root_1, stream_v2.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:277:1: assignExp : variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set132=null;
        Token SEMICOLON134=null;
        IoclParser.variableExp_return variableExp131 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS133 = null;


        Object set132_tree=null;
        Object SEMICOLON134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:2: ( variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:4: variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableExp_in_assignExp1393);
            variableExp131=variableExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp131.getTree());
            set132=(Token)input.LT(1);
            set132=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set132), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_oclExpressionCS_in_assignExp1404);
            oclExpressionCS133=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS133.getTree());
            SEMICOLON134=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1406); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:281:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE135=null;
        Token STRING_LITERAL137=null;
        Token SEMICOLON138=null;
        IoclParser.type_return type136 = null;


        Object RAISE135_tree=null;
        Object STRING_LITERAL137_tree=null;
        Object SEMICOLON138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE135=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE135_tree = (Object)adaptor.create(RAISE135);
            root_0 = (Object)adaptor.becomeRoot(RAISE135_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:11: ( type | STRING_LITERAL )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COLLECTION_TYPE_LITERAL||(LA32_0>=IDENTIFIER && LA32_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt32=1;
            }
            else if ( (LA32_0==STRING_LITERAL) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1422);
                    type136=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type136.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:19: STRING_LITERAL
                    {
                    STRING_LITERAL137=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL137_tree = (Object)adaptor.create(STRING_LITERAL137);
                    adaptor.addChild(root_0, STRING_LITERAL137_tree);
                    }

                    }
                    break;

            }

            SEMICOLON138=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1429); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:285:1: whileExp : WHILE LPAREN condition= oclExpressionCS RPAREN LCURLY body= oclExpressionCS RCURLY -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE139=null;
        Token LPAREN140=null;
        Token RPAREN141=null;
        Token LCURLY142=null;
        Token RCURLY143=null;
        IoclParser.oclExpressionCS_return condition = null;

        IoclParser.oclExpressionCS_return body = null;


        Object WHILE139_tree=null;
        Object LPAREN140_tree=null;
        Object RPAREN141_tree=null;
        Object LCURLY142_tree=null;
        Object RCURLY143_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:286:2: ( WHILE LPAREN condition= oclExpressionCS RPAREN LCURLY body= oclExpressionCS RCURLY -> ^( WHILE $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:286:4: WHILE LPAREN condition= oclExpressionCS RPAREN LCURLY body= oclExpressionCS RCURLY
            {
            WHILE139=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE139);

            LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN140);

            pushFollow(FOLLOW_oclExpressionCS_in_whileExp1449);
            condition=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(condition.getTree());
            RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN141);

            LCURLY142=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_whileExp1456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY142);

            pushFollow(FOLLOW_oclExpressionCS_in_whileExp1462);
            body=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(body.getTree());
            RCURLY143=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_whileExp1464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY143);



            // AST REWRITE
            // elements: condition, body, WHILE
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
            // 287:40: -> ^( WHILE $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:43: ^( WHILE $condition $body)
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:290:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ENDIF -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF144=null;
        Token ENDIF148=null;
        IoclParser.altExp_return altExp145 = null;

        IoclParser.elifExp_return elifExp146 = null;

        IoclParser.elseExp_return elseExp147 = null;


        Object IF144_tree=null;
        Object ENDIF148_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:2: ( IF altExp ( elifExp )* ( elseExp )? ENDIF -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:4: IF altExp ( elifExp )* ( elseExp )? ENDIF
            {
            IF144=(Token)match(input,IF,FOLLOW_IF_in_ifExp1487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF144);

            pushFollow(FOLLOW_altExp_in_ifExp1489);
            altExp145=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp145.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:14: ( elifExp )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELIF) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1492);
            	    elifExp146=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp146.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:25: ( elseExp )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1497);
                    elseExp147=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp147.getTree());

                    }
                    break;

            }

            ENDIF148=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF148);



            // AST REWRITE
            // elements: elifExp, elseExp, altExp, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 291:42: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:45: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:57: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:66: ( elseExp )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:294:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF149=null;
        IoclParser.altExp_return altExp150 = null;


        Object ELIF149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:295:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:295:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF149=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1526); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1529);
            altExp150=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp150.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:298:1: elseExp : ELSE oclExpressionCS ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE151=null;
        IoclParser.oclExpressionCS_return oclExpressionCS152 = null;


        Object ELSE151_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:2: ( ELSE oclExpressionCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:4: ELSE oclExpressionCS
            {
            root_0 = (Object)adaptor.nil();

            ELSE151=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1541); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpressionCS_in_elseExp1544);
            oclExpressionCS152=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS152.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:302:1: altExp : LPAREN condition= oclExpressionCS RPAREN body= oclExpressionCS -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN153=null;
        Token RPAREN154=null;
        IoclParser.oclExpressionCS_return condition = null;

        IoclParser.oclExpressionCS_return body = null;


        Object LPAREN153_tree=null;
        Object RPAREN154_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:2: ( LPAREN condition= oclExpressionCS RPAREN body= oclExpressionCS -> ^( ALT_EXP $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:4: LPAREN condition= oclExpressionCS RPAREN body= oclExpressionCS
            {
            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN153);

            pushFollow(FOLLOW_oclExpressionCS_in_altExp1563);
            condition=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(condition.getTree());
            RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN154);

            pushFollow(FOLLOW_oclExpressionCS_in_altExp1572);
            body=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(body.getTree());


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
            // 303:70: -> ^( ALT_EXP $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:73: ^( ALT_EXP $condition $body)
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:306:1: tryExp : TRY LCURLY ( oclExpressionCS )* RCURLY except -> ^( TRY ( oclExpressionCS )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY155=null;
        Token LCURLY156=null;
        Token RCURLY158=null;
        IoclParser.oclExpressionCS_return oclExpressionCS157 = null;

        IoclParser.except_return except159 = null;


        Object TRY155_tree=null;
        Object LCURLY156_tree=null;
        Object RCURLY158_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:2: ( TRY LCURLY ( oclExpressionCS )* RCURLY except -> ^( TRY ( oclExpressionCS )* except ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:4: TRY LCURLY ( oclExpressionCS )* RCURLY except
            {
            TRY155=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY155);

            LCURLY156=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY156);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:15: ( oclExpressionCS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==BREAK||(LA35_0>=COMPUTE && LA35_0<=DO)||LA35_0==IF||(LA35_0>=LCURLY && LA35_0<=LPAREN)||(LA35_0>=MINUS && LA35_0<=NOT)||LA35_0==RAISE||LA35_0==RETURN||LA35_0==SELF||(LA35_0>=TRY && LA35_0<=VAR)||LA35_0==WHILE||(LA35_0>=NUMERIC_OPERATION && LA35_0<=REAL_LITERAL)||LA35_0==IDENTIFIER) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
            	    {
            	    pushFollow(FOLLOW_oclExpressionCS_in_tryExp1599);
            	    oclExpressionCS157=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS157.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            RCURLY158=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY158);

            pushFollow(FOLLOW_except_in_tryExp1604);
            except159=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except159.getTree());


            // AST REWRITE
            // elements: oclExpressionCS, TRY, except
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:46: -> ^( TRY ( oclExpressionCS )* except )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:49: ^( TRY ( oclExpressionCS )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:55: ( oclExpressionCS )*
                while ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:310:1: except : EXCEPT LPAREN t1= type ( ',' (t2= type )* ) RPAREN LCURLY ( oclExpressionCS )* RCURLY -> ^( EXCEPT $t1 ( $t2)* ( oclExpressionCS )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT160=null;
        Token LPAREN161=null;
        Token char_literal162=null;
        Token RPAREN163=null;
        Token LCURLY164=null;
        Token RCURLY166=null;
        IoclParser.type_return t1 = null;

        IoclParser.type_return t2 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS165 = null;


        Object EXCEPT160_tree=null;
        Object LPAREN161_tree=null;
        Object char_literal162_tree=null;
        Object RPAREN163_tree=null;
        Object LCURLY164_tree=null;
        Object RCURLY166_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:2: ( EXCEPT LPAREN t1= type ( ',' (t2= type )* ) RPAREN LCURLY ( oclExpressionCS )* RCURLY -> ^( EXCEPT $t1 ( $t2)* ( oclExpressionCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:4: EXCEPT LPAREN t1= type ( ',' (t2= type )* ) RPAREN LCURLY ( oclExpressionCS )* RCURLY
            {
            EXCEPT160=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1626); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT160);

            LPAREN161=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1628); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN161);

            pushFollow(FOLLOW_type_in_except1634);
            t1=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(t1.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:28: ( ',' (t2= type )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:29: ',' (t2= type )*
            {
            char_literal162=(Token)match(input,67,FOLLOW_67_in_except1637); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal162);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:36: (t2= type )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COLLECTION_TYPE_LITERAL||(LA36_0>=IDENTIFIER && LA36_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: t2= type
            	    {
            	    pushFollow(FOLLOW_type_in_except1643);
            	    t2=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(t2.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            RPAREN163=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN163);

            LCURLY164=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY164);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:59: ( oclExpressionCS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==BREAK||(LA37_0>=COMPUTE && LA37_0<=DO)||LA37_0==IF||(LA37_0>=LCURLY && LA37_0<=LPAREN)||(LA37_0>=MINUS && LA37_0<=NOT)||LA37_0==RAISE||LA37_0==RETURN||LA37_0==SELF||(LA37_0>=TRY && LA37_0<=VAR)||LA37_0==WHILE||(LA37_0>=NUMERIC_OPERATION && LA37_0<=REAL_LITERAL)||LA37_0==IDENTIFIER) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
            	    {
            	    pushFollow(FOLLOW_oclExpressionCS_in_except1651);
            	    oclExpressionCS165=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS165.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            RCURLY166=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY166);



            // AST REWRITE
            // elements: t2, EXCEPT, t1, oclExpressionCS
            // token labels: 
            // rule labels: t2, retval, t1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 311:83: -> ^( EXCEPT $t1 ( $t2)* ( oclExpressionCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:86: ^( EXCEPT $t1 ( $t2)* ( oclExpressionCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_t1.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:99: ( $t2)*
                while ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_1, stream_t2.nextTree());

                }
                stream_t2.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:104: ( oclExpressionCS )*
                while ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:314:1: forExp : oclExpCS ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpressionCS )? RPAREN LCURLY oclExpressionCS RCURLY -> ^( FOR FOR_NAME oclExpCS iteratorList ( oclExpressionCS )? oclExpressionCS ) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW168=null;
        Token FOR_NAME169=null;
        Token LPAREN170=null;
        Token char_literal172=null;
        Token RPAREN174=null;
        Token LCURLY175=null;
        Token RCURLY177=null;
        IoclParser.oclExpCS_return oclExpCS167 = null;

        IoclParser.iteratorList_return iteratorList171 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS173 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS176 = null;


        Object ARROW168_tree=null;
        Object FOR_NAME169_tree=null;
        Object LPAREN170_tree=null;
        Object char_literal172_tree=null;
        Object RPAREN174_tree=null;
        Object LCURLY175_tree=null;
        Object RCURLY177_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:315:2: ( oclExpCS ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpressionCS )? RPAREN LCURLY oclExpressionCS RCURLY -> ^( FOR FOR_NAME oclExpCS iteratorList ( oclExpressionCS )? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:315:4: oclExpCS ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpressionCS )? RPAREN LCURLY oclExpressionCS RCURLY
            {
            pushFollow(FOLLOW_oclExpCS_in_forExp1682);
            oclExpCS167=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS167.getTree());
            ARROW168=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW168);

            FOR_NAME169=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME169);

            LPAREN170=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN170);

            pushFollow(FOLLOW_iteratorList_in_forExp1690);
            iteratorList171=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList171.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:315:48: ( '|' oclExpressionCS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==68) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:315:49: '|' oclExpressionCS
                    {
                    char_literal172=(Token)match(input,68,FOLLOW_68_in_forExp1693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal172);

                    pushFollow(FOLLOW_oclExpressionCS_in_forExp1695);
                    oclExpressionCS173=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS173.getTree());

                    }
                    break;

            }

            RPAREN174=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN174);

            LCURLY175=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forExp1701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY175);

            pushFollow(FOLLOW_oclExpressionCS_in_forExp1703);
            oclExpressionCS176=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS176.getTree());
            RCURLY177=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forExp1705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY177);



            // AST REWRITE
            // elements: oclExpCS, oclExpressionCS, iteratorList, oclExpressionCS, FOR_NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 316:3: -> ^( FOR FOR_NAME oclExpCS iteratorList ( oclExpressionCS )? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:6: ^( FOR FOR_NAME oclExpCS iteratorList ( oclExpressionCS )? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:43: ( oclExpressionCS )?
                if ( stream_oclExpressionCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

                }
                stream_oclExpressionCS.reset();
                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:319:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal179=null;
        IoclParser.variableDeclaration_return variableDeclaration178 = null;

        IoclParser.variableDeclaration_return variableDeclaration180 = null;


        Object char_literal179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1736);
            variableDeclaration178=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration178.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:24: ( ',' variableDeclaration )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:25: ',' variableDeclaration
            	    {
            	    char_literal179=(Token)match(input,67,FOLLOW_67_in_iteratorList1739); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1742);
            	    variableDeclaration180=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration180.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:85:4: ( imperativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:85:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl362);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred12_Iocl
    public final void synpred12_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:25: ( ( PLUS | MINUS ) multiplicativeExpCS )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:25: ( PLUS | MINUS ) multiplicativeExpCS
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

        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred12_Iocl477);
        multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Iocl

    // $ANTLR start synpred19_Iocl
    public final void synpred19_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:4: ( propertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:4: propertyCallExp
        {
        pushFollow(FOLLOW_propertyCallExp_in_synpred19_Iocl562);
        propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:4: ( modelPropertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:4: modelPropertyCallExp
        {
        pushFollow(FOLLOW_modelPropertyCallExp_in_synpred28_Iocl810);
        modelPropertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred29_Iocl
    public final void synpred29_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:4: ( iteratorExpCS )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:4: iteratorExpCS
        {
        pushFollow(FOLLOW_iteratorExpCS_in_synpred29_Iocl837);
        iteratorExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Iocl

    // $ANTLR start synpred30_Iocl
    public final void synpred30_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:43: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:43: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred30_Iocl868);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,67,FOLLOW_67_in_synpred30_Iocl870); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:42: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:42: (v1= variableDeclaration ',' )?
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==IDENTIFIER) ) {
            int LA41_1 = input.LA(2);

            if ( (synpred30_Iocl()) ) {
                alt41=1;
            }
        }
        switch (alt41) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:43: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl868);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,67,FOLLOW_67_in_synpred31_Iocl870); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl878);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,68,FOLLOW_68_in_synpred31_Iocl880); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred32_Iocl
    public final void synpred32_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:35: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:35: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred32_Iocl930);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred32_Iocl932); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Iocl

    // Delegated rules

    public final boolean synpred30_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred32_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Iocl_fragment(); // can never throw exception
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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA1_eotS =
        "\25\uffff";
    static final String DFA1_eofS =
        "\25\uffff";
    static final String DFA1_minS =
        "\1\10\7\uffff\1\0\4\uffff\6\0\2\uffff";
    static final String DFA1_maxS =
        "\1\72\7\uffff\1\0\4\uffff\6\0\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\21\uffff\1\2\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\3\1\12\uffff\1\1\3\uffff\1\1\1\22\2\uffff\2\23"+
            "\4\uffff\1\1\1\uffff\1\1\2\uffff\1\10\1\uffff\2\1\1\uffff\1"+
            "\1\1\uffff\1\23\1\15\1\20\1\21\1\16\1\17\1\uffff\1\10",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "84:1: oclExpressionCS : ( imperativeExp | logicalExpCS );";
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

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
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
    static final String DFA5_eotS =
        "\43\uffff";
    static final String DFA5_eofS =
        "\1\1\42\uffff";
    static final String DFA5_minS =
        "\1\4\33\uffff\1\0\6\uffff";
    static final String DFA5_maxS =
        "\1\104\33\uffff\1\0\6\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\40\uffff\1\1";
    static final String DFA5_specialS =
        "\34\uffff\1\0\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\3\uffff\1\1\3\uffff\3\1\2\uffff\4\1\2\uffff\3\1\3\uffff"+
            "\4\1\1\34\2\1\1\uffff\1\1\1\42\4\1\1\uffff\4\1\1\uffff\10\1"+
            "\1\uffff\1\1\10\uffff\2\1",
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
            return "()* loopback of 102:24: ( ( PLUS | MINUS ) multiplicativeExpCS )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_28 = input.LA(1);

                         
                        int index5_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_Iocl()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_28);
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
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\36\1\uffff\7\0\2\uffff";
    static final String DFA9_maxS =
        "\1\72\1\uffff\7\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\1\3";
    static final String DFA9_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\10\15\uffff\1\2\6\uffff\1\1\1\3\1\6\1\7\1\4\1\5\1\uffff\1"+
            "\2",
            "",
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
            return "114:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_8);
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
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\36\7\0\2\uffff";
    static final String DFA16_maxS =
        "\1\72\7\0\2\uffff";
    static final String DFA16_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\7\15\uffff\1\1\7\uffff\1\2\1\5\1\6\1\3\1\4\1\uffff\1\1",
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
            return "178:1: propertyCallExp : ( modelPropertyCallExp | loopExp );";
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
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index16_7);
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
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\12\uffff";
    static final String DFA17_minS =
        "\1\36\7\0\2\uffff";
    static final String DFA17_maxS =
        "\1\72\7\0\2\uffff";
    static final String DFA17_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\7\15\uffff\1\1\7\uffff\1\2\1\5\1\6\1\3\1\4\1\uffff\1\1",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "187:1: loopExp : ( iteratorExpCS | iterateExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\27\uffff";
    static final String DFA19_eofS =
        "\27\uffff";
    static final String DFA19_minS =
        "\1\10\1\0\25\uffff";
    static final String DFA19_maxS =
        "\1\72\1\0\25\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\23\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\3\uffff\3\2\12\uffff\1\2\3\uffff\2\2\2\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\6\2\1\uffff\1\1",
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
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "193:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_Iocl()) ) {s = 22;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\16\uffff";
    static final String DFA27_eofS =
        "\16\uffff";
    static final String DFA27_minS =
        "\1\10\6\uffff\1\6\6\uffff";
    static final String DFA27_maxS =
        "\1\72\6\uffff\1\34\6\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
        "\1\7";
    static final String DFA27_specialS =
        "\16\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\3\uffff\1\3\1\4\1\1\12\uffff\1\12\3\uffff\1\1\1\14\10\uffff"+
            "\1\10\1\uffff\1\5\2\uffff\1\7\1\uffff\1\13\1\6\1\uffff\1\11"+
            "\2\uffff\5\14\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\1\14\24\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "238:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );";
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpressionCS362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpCS_in_oclExpressionCS367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS378 = new BitSet(new long[]{0x0004002000000012L});
    public static final BitSet FOLLOW_set_in_logicalExpCS381 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS394 = new BitSet(new long[]{0x0004002000000012L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS407 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_set_in_equalityExpCS410 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS419 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS432 = new BitSet(new long[]{0x0000000181800002L});
    public static final BitSet FOLLOW_set_in_relationalExpCS435 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS452 = new BitSet(new long[]{0x0000000181800002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS465 = new BitSet(new long[]{0x0000004200000002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS468 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS477 = new BitSet(new long[]{0x0000004200000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS490 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS493 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS503 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS516 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS541 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_dotArrowExpCS543 = new BitSet(new long[]{0x05FAD68662007100L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS545 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dotArrowExpCS548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExpCS578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExpCS588 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_oclExpCS590 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExpCS592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_variableExp610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS638 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExpCS640 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS642 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExpCS645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_collectionLiteralPartsCS685 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_loopExp837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpCS_in_loopExp842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iteratorExpCS854 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iteratorExpCS856 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExpCS858 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExpCS860 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_iteratorExpCS870 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iteratorExpCS880 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iteratorExpCS884 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExpCS886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iterateExpCS917 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iterateExpCS919 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExpCS921 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpCS923 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS930 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExpCS932 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterateExpCS943 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iterateExpCS945 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpCS947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration975 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration978 = new BitSet(new long[]{0x0C10000000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration980 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration985 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_variableDeclaration987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_operationCallExpCS1014 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_set_in_operationCallExpCS1016 = new BitSet(new long[]{0x0400100000000000L});
    public static final BitSet FOLLOW_simpleNameCS_in_operationCallExpCS1025 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExpCS1027 = new BitSet(new long[]{0x05FAD68662007100L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS1030 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExpCS1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1045 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_argumentsCS1048 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_simpleNameCS0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionType1093 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1095 = new BitSet(new long[]{0x0C10000000000000L});
    public static final BitSet FOLLOW_type_in_collectionType1097 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1142 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1145 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1147 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1239 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1242 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_blockExp1244 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1267 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1280 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1282 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1284 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1286 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_computeExp1288 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_computeExp1290 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RCURLY_in_computeExp1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1313 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1326 = new BitSet(new long[]{0x05FAF28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_returnExp1328 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1351 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableInitExp1357 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_variableInitExp1360 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableInitExp1366 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_assignExp1393 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_set_in_assignExp1395 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_assignExp1404 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1418 = new BitSet(new long[]{0x0C30000000000000L});
    public static final BitSet FOLLOW_type_in_raiseExp1422 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1426 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1441 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1443 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_whileExp1449 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1451 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_whileExp1456 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_whileExp1462 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RCURLY_in_whileExp1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1487 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1489 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1492 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1526 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1541 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_elseExp1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1557 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_altExp1563 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1565 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_altExp1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1595 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1597 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_tryExp1599 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1602 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_except_in_tryExp1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1626 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1628 = new BitSet(new long[]{0x0C10000000000000L});
    public static final BitSet FOLLOW_type_in_except1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_except1637 = new BitSet(new long[]{0x0C10040000000000L});
    public static final BitSet FOLLOW_type_in_except1643 = new BitSet(new long[]{0x0C10040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1647 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1649 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_except1651 = new BitSet(new long[]{0x05FAD38662007100L});
    public static final BitSet FOLLOW_RCURLY_in_except1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_forExp1682 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1684 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1686 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1688 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1690 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_forExp1693 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_forExp1695 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1699 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LCURLY_in_forExp1701 = new BitSet(new long[]{0x05FAD28662007100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_forExp1703 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RCURLY_in_forExp1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_iteratorList1739 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred12_Iocl468 = new BitSet(new long[]{0x05F8100640000000L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred12_Iocl477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred19_Iocl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_synpred28_Iocl810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_synpred29_Iocl837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred30_Iocl868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_synpred30_Iocl870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_synpred31_Iocl870 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_synpred31_Iocl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred32_Iocl930 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred32_Iocl932 = new BitSet(new long[]{0x0000000000000002L});

}