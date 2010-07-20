// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-07-19 23:13:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_EXP", "AND", "APPEND", "ARROW", "ATTRIBUTE_CALL", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "ITERATOR_NAME", "IDENTIFIER", "NUMERIC_OPERATION", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'@pre'", "'['", "']'", "'|'"
    };
    public static final int ITERATOR_NAME=58;
    public static final int T__69=69;
    public static final int APPEND=6;
    public static final int EXPONENT=63;
    public static final int LT=33;
    public static final int WHILE=51;
    public static final int PRIMITIVE_TYPE_LITERAL=61;
    public static final int COMPUTE=14;
    public static final int GTE=26;
    public static final int OCTAL_ESC=68;
    public static final int DO=16;
    public static final int FOR=24;
    public static final int NOT=36;
    public static final int AND=5;
    public static final int EXCEPT=23;
    public static final int EOF=-1;
    public static final int LTE=34;
    public static final int BREAK=10;
    public static final int LPAREN=32;
    public static final int IF=27;
    public static final int RPAREN=44;
    public static final int ESC_SEQ=64;
    public static final int STRING_LITERAL=54;
    public static final int REAL_LITERAL=57;
    public static final int SCOPE=45;
    public static final int COLLECTION_TYPE_LITERAL=53;
    public static final int CONTINUE=15;
    public static final int NOT_EQUAL=37;
    public static final int IS=30;
    public static final int IDENTIFIER=59;
    public static final int ITERATOR=29;
    public static final int EQUAL=22;
    public static final int RETURN=43;
    public static final int ENDIF=19;
    public static final int PLUS=40;
    public static final int VAR=49;
    public static final int RAISE=41;
    public static final int DOT=18;
    public static final int COLLECTION_LITERAL=11;
    public static final int FOR_NAME=62;
    public static final int XOR=52;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int UNICODE_ESC=67;
    public static final int NUMERIC_OPERATION=60;
    public static final int ELSE=21;
    public static final int HEX_DIGIT=66;
    public static final int LCURLY=31;
    public static final int SEMICOLON=47;
    public static final int MINUS=35;
    public static final int MULT=38;
    public static final int TRY=48;
    public static final int BOOLEAN_LITERAL=55;
    public static final int COLON=13;
    public static final int ALT_EXP=4;
    public static final int ELIF=20;
    public static final int ITERATE=28;
    public static final int WS=65;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int VARIABLE=50;
    public static final int T__70=70;
    public static final int INTEGER_LITERAL=56;
    public static final int BLOCK=9;
    public static final int RCURLY=42;
    public static final int OR=39;
    public static final int ARROW=7;
    public static final int GT=25;
    public static final int DIV=17;
    public static final int SELF=46;
    public static final int T__73=73;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[131+1];
             
             
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression380);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:108:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression385);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp396);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:17: ( AND | OR | XOR ) equalityExp
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

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp412);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp425);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:19: ( EQUAL | NOT_EQUAL ) relationalExp
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

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp437);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp450);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:17: ( LT | LTE | GT | GTE ) additiveExp
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

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp470);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp483);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:23: ( PLUS | MINUS ) multiplicativeExp
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

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp495);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp508);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:14: ( MULT | DIV ) unaryExp
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

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp521);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:1: unaryExp : ( ( MINUS | NOT ) unaryExp | dotArrowExp );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:2: ( ( MINUS | NOT ) unaryExp | dotArrowExp )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=MINUS && LA7_0<=NOT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN||LA7_0==SELF||(LA7_0>=COLLECTION_TYPE_LITERAL && LA7_0<=REAL_LITERAL)||(LA7_0>=IDENTIFIER && LA7_0<=PRIMITIVE_TYPE_LITERAL)) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:4: ( MINUS | NOT ) unaryExp
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

                    pushFollow(FOLLOW_unaryExp_in_unaryExp543);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:133:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp548);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:1: dotArrowExp : ( propertyCallExp | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.propertyCallExp_return propertyCallExp21 = null;

        IoclParser.oclExp_return oclExp22 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:2: ( propertyCallExp | oclExp )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:4: propertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp559);
                    propertyCallExp21=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp21.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:138:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp564);
                    oclExp22=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp22.getTree());

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

    public static class oclExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:1: oclExp : ( variableExp | literalExp | type | '(' oclExpression ')' -> oclExpression );
    public final IoclParser.oclExp_return oclExp() throws RecognitionException {
        IoclParser.oclExp_return retval = new IoclParser.oclExp_return();
        retval.start = input.LT(1);
        int oclExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal28=null;
        IoclParser.variableExp_return variableExp23 = null;

        IoclParser.literalExp_return literalExp24 = null;

        IoclParser.type_return type25 = null;

        IoclParser.oclExpression_return oclExpression27 = null;


        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:2: ( variableExp | literalExp | type | '(' oclExpression ')' -> oclExpression )
            int alt9=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred18_Iocl()) ) {
                    alt9=1;
                }
                else if ( (synpred20_Iocl()) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==LCURLY) ) {
                    alt9=2;
                }
                else if ( (LA9_2==LPAREN) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt9=2;
                }
                break;
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt9=3;
                }
                break;
            case SELF:
                {
                alt9=1;
                }
                break;
            case LPAREN:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp575);
                    variableExp23=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp23.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp580);
                    literalExp24=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp24.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp585);
                    type25=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type25.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:145:4: '(' oclExpression ')'
                    {
                    char_literal26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal26);

                    pushFollow(FOLLOW_oclExpression_in_oclExp592);
                    oclExpression27=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression27.getTree());
                    char_literal28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal28);



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
                    // 145:26: -> oclExpression
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
            if ( state.backtracking>0 ) { memoize(input, 9, oclExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExp"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName29 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp612);
            simpleName29=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName29.getTree());


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
            // 149:15: -> ^( VARIABLE simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:18: ^( VARIABLE simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 10, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:1: literalExp : ( collectionLiteralExp | primitiveLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp30 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp31 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:2: ( collectionLiteralExp | primitiveLiteralExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLLECTION_TYPE_LITERAL) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=STRING_LITERAL && LA10_0<=REAL_LITERAL)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp631);
                    collectionLiteralExp30=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp30.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:154:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp637);
                    primitiveLiteralExp31=primitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExp31.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, literalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExp"

    public static class collectionLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
    public final IoclParser.collectionLiteralExp_return collectionLiteralExp() throws RecognitionException {
        IoclParser.collectionLiteralExp_return retval = new IoclParser.collectionLiteralExp_return();
        retval.start = input.LT(1);
        int collectionLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal33=null;
        Token char_literal35=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier32 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts34 = null;


        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionLiteralParts=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralParts");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp648);
            collectionTypeIdentifier32=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier32.getTree());
            char_literal33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal33);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:33: ( collectionLiteralParts )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BREAK||(LA11_0>=COMPUTE && LA11_0<=DO)||LA11_0==IF||(LA11_0>=LCURLY && LA11_0<=LPAREN)||(LA11_0>=MINUS && LA11_0<=NOT)||LA11_0==RAISE||LA11_0==RETURN||LA11_0==SELF||(LA11_0>=TRY && LA11_0<=VAR)||LA11_0==WHILE||(LA11_0>=COLLECTION_TYPE_LITERAL && LA11_0<=REAL_LITERAL)||(LA11_0>=IDENTIFIER && LA11_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp652);
                    collectionLiteralParts34=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts34.getTree());

                    }
                    break;

            }

            char_literal35=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal35);



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
            // 158:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:110: ( collectionLiteralParts )?
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
            if ( state.backtracking>0 ) { memoize(input, 12, collectionLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExp"

    public static class collectionTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifier"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL36=null;

        Object COLLECTION_TYPE_LITERAL36_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:162:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:162:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL36=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier677); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL36_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL36);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL36_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 13, collectionTypeIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifier"

    public static class collectionLiteralParts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralParts"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
    public final IoclParser.collectionLiteralParts_return collectionLiteralParts() throws RecognitionException {
        IoclParser.collectionLiteralParts_return retval = new IoclParser.collectionLiteralParts_return();
        retval.start = input.LT(1);
        int collectionLiteralParts_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal38=null;
        IoclParser.collectionLiteralPart_return collectionLiteralPart37 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts39 = null;


        Object char_literal38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts688);
            collectionLiteralPart37=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart37.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:26: ( ',' collectionLiteralParts )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==69) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred23_Iocl()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:27: ',' collectionLiteralParts
            	    {
            	    char_literal38=(Token)match(input,69,FOLLOW_69_in_collectionLiteralParts691); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts694);
            	    collectionLiteralParts39=collectionLiteralParts();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralParts39.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
            if ( state.backtracking>0 ) { memoize(input, 14, collectionLiteralParts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralParts"

    public static class collectionLiteralPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPart"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:169:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression40 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:2: ( oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart707);
            oclExpression40=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression40.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, collectionLiteralPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPart"

    public static class primitiveLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:173:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
    public final IoclParser.primitiveLiteralExp_return primitiveLiteralExp() throws RecognitionException {
        IoclParser.primitiveLiteralExp_return retval = new IoclParser.primitiveLiteralExp_return();
        retval.start = input.LT(1);
        int primitiveLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExp_return numericLiteralExp41 = null;

        IoclParser.stringLiteralExp_return stringLiteralExp42 = null;

        IoclParser.booleanLiteralExp_return booleanLiteralExp43 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:174:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
            int alt13=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt13=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt13=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:174:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp718);
                    numericLiteralExp41=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp41.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp723);
                    stringLiteralExp42=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp42.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp728);
                    booleanLiteralExp43=booleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExp43.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, primitiveLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExp"

    public static class numericLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp44 = null;

        IoclParser.realLiteralExp_return realLiteralExp45 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:2: ( integerLiteralExp | realLiteralExp )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INTEGER_LITERAL) ) {
                alt14=1;
            }
            else if ( (LA14_0==REAL_LITERAL) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp739);
                    integerLiteralExp44=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp44.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:181:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp744);
                    realLiteralExp45=realLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExp45.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, numericLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExp"

    public static class stringLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL46=null;

        Object STRING_LITERAL46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:185:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:185:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL46=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp759); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL46_tree = (Object)adaptor.create(STRING_LITERAL46);
            adaptor.addChild(root_0, STRING_LITERAL46_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, stringLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExp"

    public static class booleanLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL47=null;

        Object BOOLEAN_LITERAL47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL47=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp770); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL47_tree = (Object)adaptor.create(BOOLEAN_LITERAL47);
            adaptor.addChild(root_0, BOOLEAN_LITERAL47_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 19, booleanLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExp"

    public static class integerLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:192:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL48=null;

        Object INTEGER_LITERAL48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL48=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL48_tree = (Object)adaptor.create(INTEGER_LITERAL48);
            adaptor.addChild(root_0, INTEGER_LITERAL48_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 20, integerLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExp"

    public static class realLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:196:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL49=null;

        Object REAL_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL49=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp793); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL49_tree = (Object)adaptor.create(REAL_LITERAL49);
            adaptor.addChild(root_0, REAL_LITERAL49_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 21, realLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExp"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:1: propertyCallExp : ( modelPropertyCallExp | loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp50 = null;

        IoclParser.loopExp_return loopExp51 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:2: ( modelPropertyCallExp | loopExp )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp804);
                    modelPropertyCallExp50=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp50.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:202:4: loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopExp_in_propertyCallExp809);
                    loopExp51=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp51.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp52 = null;

        IoclParser.attributeCallExp_return attributeCallExp53 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:2: ( operationCallExp | attributeCallExp )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:4: operationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp820);
                    operationCallExp52=operationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp52.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:4: attributeCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeCallExp_in_modelPropertyCallExp825);
                    attributeCallExp53=attributeCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeCallExp53.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 23, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class attributeCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:1: attributeCallExp : oclExp DOT simpleName ( isMarkedPre )? -> ^( ATTRIBUTE_CALL oclExp simpleName ( isMarkedPre )? ) ;
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token DOT55=null;
        IoclParser.oclExp_return oclExp54 = null;

        IoclParser.simpleName_return simpleName56 = null;

        IoclParser.isMarkedPre_return isMarkedPre57 = null;


        Object DOT55_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_isMarkedPre=new RewriteRuleSubtreeStream(adaptor,"rule isMarkedPre");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:2: ( oclExp DOT simpleName ( isMarkedPre )? -> ^( ATTRIBUTE_CALL oclExp simpleName ( isMarkedPre )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: oclExp DOT simpleName ( isMarkedPre )?
            {
            pushFollow(FOLLOW_oclExp_in_attributeCallExp838);
            oclExp54=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp54.getTree());
            DOT55=(Token)match(input,DOT,FOLLOW_DOT_in_attributeCallExp840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT55);

            pushFollow(FOLLOW_simpleName_in_attributeCallExp842);
            simpleName56=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName56.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:26: ( isMarkedPre )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==70) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                    {
                    pushFollow(FOLLOW_isMarkedPre_in_attributeCallExp844);
                    isMarkedPre57=isMarkedPre();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_isMarkedPre.add(isMarkedPre57.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: simpleName, isMarkedPre, oclExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:39: -> ^( ATTRIBUTE_CALL oclExp simpleName ( isMarkedPre )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:42: ^( ATTRIBUTE_CALL oclExp simpleName ( isMarkedPre )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_CALL, "ATTRIBUTE_CALL"), root_1);

                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_simpleName.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:77: ( isMarkedPre )?
                if ( stream_isMarkedPre.hasNext() ) {
                    adaptor.addChild(root_1, stream_isMarkedPre.nextTree());

                }
                stream_isMarkedPre.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 24, attributeCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "attributeCallExp"

    public static class isMarkedPre_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "isMarkedPre"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:1: isMarkedPre : '@pre' ;
    public final IoclParser.isMarkedPre_return isMarkedPre() throws RecognitionException {
        IoclParser.isMarkedPre_return retval = new IoclParser.isMarkedPre_return();
        retval.start = input.LT(1);
        int isMarkedPre_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal58=null;

        Object string_literal58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:216:2: ( '@pre' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:216:4: '@pre'
            {
            root_0 = (Object)adaptor.nil();

            string_literal58=(Token)match(input,70,FOLLOW_70_in_isMarkedPre869); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal58_tree = (Object)adaptor.create(string_literal58);
            adaptor.addChild(root_0, string_literal58_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, isMarkedPre_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "isMarkedPre"

    public static class navigationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "navigationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:1: navigationCallExp : oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )? ;
    public final IoclParser.navigationCallExp_return navigationCallExp() throws RecognitionException {
        IoclParser.navigationCallExp_return retval = new IoclParser.navigationCallExp_return();
        retval.start = input.LT(1);
        int navigationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token DOT60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        IoclParser.oclExpression_return oclExpression59 = null;

        IoclParser.simpleName_return simpleName61 = null;

        IoclParser.arguments_return arguments63 = null;

        IoclParser.isMarkedPre_return isMarkedPre65 = null;


        Object DOT60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:2: ( oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )? )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:4: oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_navigationCallExp880);
            oclExpression59=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression59.getTree());
            DOT60=(Token)match(input,DOT,FOLLOW_DOT_in_navigationCallExp882); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT60_tree = (Object)adaptor.create(DOT60);
            adaptor.addChild(root_0, DOT60_tree);
            }
            pushFollow(FOLLOW_simpleName_in_navigationCallExp884);
            simpleName61=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName61.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:33: ( '[' arguments ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==71) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:34: '[' arguments ']'
                    {
                    char_literal62=(Token)match(input,71,FOLLOW_71_in_navigationCallExp887); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal62_tree = (Object)adaptor.create(char_literal62);
                    adaptor.addChild(root_0, char_literal62_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_navigationCallExp889);
                    arguments63=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments63.getTree());
                    char_literal64=(Token)match(input,72,FOLLOW_72_in_navigationCallExp891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:54: ( isMarkedPre )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==70) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                    {
                    pushFollow(FOLLOW_isMarkedPre_in_navigationCallExp895);
                    isMarkedPre65=isMarkedPre();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isMarkedPre65.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 26, navigationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "navigationCallExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp66 = null;

        IoclParser.iterateExp_return iterateExp67 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:2: ( iteratorExp | iterateExp )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp907);
                    iteratorExp66=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp66.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp912);
                    iterateExp67=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp67.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:228:1: iteratorExp : oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW69=null;
        Token ITERATOR_NAME70=null;
        Token LPAREN71=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Token RPAREN75=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExp_return oclExp68 = null;

        IoclParser.oclExpression_return oclExpression74 = null;


        Object ARROW69_tree=null;
        Object ITERATOR_NAME70_tree=null;
        Object LPAREN71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal73_tree=null;
        Object RPAREN75_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:2: ( oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:5: oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            pushFollow(FOLLOW_oclExp_in_iteratorExp924);
            oclExp68=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp68.getTree());
            ARROW69=(Token)match(input,ARROW,FOLLOW_ARROW_in_iteratorExp926); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW69);

            ITERATOR_NAME70=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME70);

            LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN71);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:39: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:40: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:40: (v1= variableDeclaration ',' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==IDENTIFIER) ) {
                        int LA21_1 = input.LA(2);

                        if ( (synpred33_Iocl()) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:41: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp938);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal72=(Token)match(input,69,FOLLOW_69_in_iteratorExp940); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_69.add(char_literal72);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp948);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal73=(Token)match(input,73,FOLLOW_73_in_iteratorExp950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(char_literal73);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp954);
            oclExpression74=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression74.getTree());
            RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN75);



            // AST REWRITE
            // elements: oclExpression, oclExp, v1, ITERATOR_NAME, v2
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
            // 230:3: -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:6: ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:38: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:43: ( $v2)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:233:1: iterateExp : oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW77=null;
        Token ITERATE78=null;
        Token LPAREN79=null;
        Token SEMICOLON80=null;
        Token char_literal81=null;
        Token RPAREN83=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExp_return oclExp76 = null;

        IoclParser.oclExpression_return oclExpression82 = null;


        Object ARROW77_tree=null;
        Object ITERATE78_tree=null;
        Object LPAREN79_tree=null;
        Object SEMICOLON80_tree=null;
        Object char_literal81_tree=null;
        Object RPAREN83_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:2: ( oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:4: oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            pushFollow(FOLLOW_oclExp_in_iterateExp990);
            oclExp76=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp76.getTree());
            ARROW77=(Token)match(input,ARROW,FOLLOW_ARROW_in_iterateExp992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW77);

            ITERATE78=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE78);

            LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:32: (v1= variableDeclaration SEMICOLON )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred35_Iocl()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:33: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp1003);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON80=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp1005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON80);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1013);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal81=(Token)match(input,73,FOLLOW_73_in_iterateExp1016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal81);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1018);
            oclExpression82=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression82.getTree());
            RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1020); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN83);



            // AST REWRITE
            // elements: ITERATE, v2, v1, oclExp, oclExpression
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
            // 235:3: -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:6: ^( ITERATE oclExp ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:23: ( $v1)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:15: ( ':' type )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:16: ':' type
                    {
                    char_literal85=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal85);

                    pushFollow(FOLLOW_type_in_variableDeclaration1056);
                    type86=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type86.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:27: ( '=' oclExpression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EQUAL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:28: '=' oclExpression
                    {
                    char_literal87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal87);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1063);
                    oclExpression88=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression88.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: oclExpression, type, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:79: ( oclExpression )?
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

    public static class operationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | oclExp ( ( DOT | ARROW ) simpleName '(' ( arguments )? ')' )* );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION89=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token set94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        IoclParser.arguments_return arguments91 = null;

        IoclParser.oclExp_return oclExp93 = null;

        IoclParser.simpleName_return simpleName95 = null;

        IoclParser.arguments_return arguments97 = null;


        Object NUMERIC_OPERATION89_tree=null;
        Object char_literal90_tree=null;
        Object char_literal92_tree=null;
        Object set94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | oclExp ( ( DOT | ARROW ) simpleName '(' ( arguments )? ')' )* )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NUMERIC_OPERATION) ) {
                alt29=1;
            }
            else if ( (LA29_0==LPAREN||LA29_0==SELF||(LA29_0>=COLLECTION_TYPE_LITERAL && LA29_0<=REAL_LITERAL)||LA29_0==IDENTIFIER||LA29_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION89=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp1090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION89);

                    char_literal90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp1092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal90);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:26: ( arguments )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BREAK||(LA26_0>=COMPUTE && LA26_0<=DO)||LA26_0==IF||(LA26_0>=LCURLY && LA26_0<=LPAREN)||(LA26_0>=MINUS && LA26_0<=NOT)||LA26_0==RAISE||LA26_0==RETURN||LA26_0==SELF||(LA26_0>=TRY && LA26_0<=VAR)||LA26_0==WHILE||(LA26_0>=COLLECTION_TYPE_LITERAL && LA26_0<=REAL_LITERAL)||(LA26_0>=IDENTIFIER && LA26_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp1094);
                            arguments91=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments91.getTree());

                            }
                            break;

                    }

                    char_literal92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp1097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal92);



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
                    // 243:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:64: ( arguments )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:4: oclExp ( ( DOT | ARROW ) simpleName '(' ( arguments )? ')' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_operationCallExp1111);
                    oclExp93=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp93.getTree());
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:11: ( ( DOT | ARROW ) simpleName '(' ( arguments )? ')' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==DOT) ) {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==SELF||LA28_2==IDENTIFIER) ) {
                                int LA28_4 = input.LA(3);

                                if ( (LA28_4==LPAREN) ) {
                                    alt28=1;
                                }


                            }


                        }
                        else if ( (LA28_0==ARROW) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:12: ( DOT | ARROW ) simpleName '(' ( arguments )? ')'
                    	    {
                    	    set94=(Token)input.LT(1);
                    	    set94=(Token)input.LT(1);
                    	    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set94), root_0);
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_simpleName_in_operationCallExp1123);
                    	    simpleName95=simpleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName95.getTree());
                    	    char_literal96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp1125); if (state.failed) return retval;
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:43: ( arguments )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==BREAK||(LA27_0>=COMPUTE && LA27_0<=DO)||LA27_0==IF||(LA27_0>=LCURLY && LA27_0<=LPAREN)||(LA27_0>=MINUS && LA27_0<=NOT)||LA27_0==RAISE||LA27_0==RETURN||LA27_0==SELF||(LA27_0>=TRY && LA27_0<=VAR)||LA27_0==WHILE||(LA27_0>=COLLECTION_TYPE_LITERAL && LA27_0<=REAL_LITERAL)||(LA27_0>=IDENTIFIER && LA27_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: arguments
                    	            {
                    	            pushFollow(FOLLOW_arguments_in_operationCallExp1128);
                    	            arguments97=arguments();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments97.getTree());

                    	            }
                    	            break;

                    	    }

                    	    char_literal98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp1131); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 31, operationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExp"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal100=null;
        IoclParser.oclExpression_return oclExpression99 = null;

        IoclParser.oclExpression_return oclExpression101 = null;


        Object char_literal100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:2: ( oclExpression ( ',' oclExpression )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1145);
            oclExpression99=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression99.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:18: ( ',' oclExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:19: ',' oclExpression
            	    {
            	    char_literal100=(Token)match(input,69,FOLLOW_69_in_arguments1148); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1151);
            	    oclExpression101=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression101.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            if ( state.backtracking>0 ) { memoize(input, 32, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set102=null;

        Object set102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:252:2: ( SELF | IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set102=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set102));
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
            if ( state.backtracking>0 ) { memoize(input, 33, simpleName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:256:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL103=null;

        Object PRIMITIVE_TYPE_LITERAL103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:257:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:257:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL103=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1181); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL103_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL103);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL103_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 34, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:260:1: collectionType : collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN105=null;
        Token RPAREN107=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier104 = null;

        IoclParser.type_return type106 = null;


        Object LPAREN105_tree=null;
        Object RPAREN107_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:2: ( collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:4: collectionTypeIdentifier LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1192);
            collectionTypeIdentifier104=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier104.getTree());
            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN105);

            pushFollow(FOLLOW_type_in_collectionType1196);
            type106=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type106.getTree());
            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN107);



            // AST REWRITE
            // elements: collectionTypeIdentifier, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:48: -> ^( COLLECTION_TYPE collectionTypeIdentifier type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:51: ^( COLLECTION_TYPE collectionTypeIdentifier type )
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
            if ( state.backtracking>0 ) { memoize(input, 35, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:264:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType108 = null;

        IoclParser.collectionType_return collectionType109 = null;

        IoclParser.pathName_return pathName110 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:265:2: ( primitiveType | collectionType | pathName )
            int alt31=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt31=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt31=2;
                }
                break;
            case IDENTIFIER:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:265:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1220);
                    primitiveType108=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType108.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1225);
                    collectionType109=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType109.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1230);
                    pathName110=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName110.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER111=null;
        Token SCOPE112=null;
        Token IDENTIFIER113=null;

        Object IDENTIFIER111_tree=null;
        Object SCOPE112_tree=null;
        Object IDENTIFIER113_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER111=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER111);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:15: ( SCOPE IDENTIFIER )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SCOPE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE112=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1244); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE112);

            	    IDENTIFIER113=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER113);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, SCOPE, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:35: -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:38: ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:57: ( IDENTIFIER )*
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
            if ( state.backtracking>0 ) { memoize(input, 37, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:276:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp114 = null;

        IoclParser.breakExp_return breakExp115 = null;

        IoclParser.computeExp_return computeExp116 = null;

        IoclParser.continueExp_return continueExp117 = null;

        IoclParser.returnExp_return returnExp118 = null;

        IoclParser.variableInitExp_return variableInitExp119 = null;

        IoclParser.assignExp_return assignExp120 = null;

        IoclParser.raiseExp_return raiseExp121 = null;

        IoclParser.whileExp_return whileExp122 = null;

        IoclParser.ifExp_return ifExp123 = null;

        IoclParser.tryExp_return tryExp124 = null;

        IoclParser.forExp_return forExp125 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:277:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp )
            int alt33=12;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:277:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1272);
                    blockExp114=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp114.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1277);
                    breakExp115=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp115.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:279:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1282);
                    computeExp116=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp116.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1287);
                    continueExp117=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp117.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:281:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1292);
                    returnExp118=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp118.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1297);
                    variableInitExp119=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp119.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1302);
                    assignExp120=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp120.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1307);
                    raiseExp121=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp121.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:285:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1312);
                    whileExp122=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp122.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:286:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1317);
                    ifExp123=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp123.getTree());

                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1322);
                    tryExp124=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp124.getTree());

                    }
                    break;
                case 12 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1327);
                    forExp125=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp125.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:1: blockExp : ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO126=null;
        Token LCURLY127=null;
        Token RCURLY129=null;
        IoclParser.oclExpression_return oclExpression128 = null;


        Object DO126_tree=null;
        Object LCURLY127_tree=null;
        Object RCURLY129_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:2: ( ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:4: ( DO )? LCURLY ( oclExpression )* RCURLY
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:4: ( DO )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DO) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO126=(Token)match(input,DO,FOLLOW_DO_in_blockExp1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO126);


                    }
                    break;

            }

            LCURLY127=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1341); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY127);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:15: ( oclExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==BREAK||(LA35_0>=COMPUTE && LA35_0<=DO)||LA35_0==IF||(LA35_0>=LCURLY && LA35_0<=LPAREN)||(LA35_0>=MINUS && LA35_0<=NOT)||LA35_0==RAISE||LA35_0==RETURN||LA35_0==SELF||(LA35_0>=TRY && LA35_0<=VAR)||LA35_0==WHILE||(LA35_0>=COLLECTION_TYPE_LITERAL && LA35_0<=REAL_LITERAL)||(LA35_0>=IDENTIFIER && LA35_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_blockExp1343);
            	    oclExpression128=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression128.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            RCURLY129=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY129);



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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:40: ^( BLOCK ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:48: ( oclExpression )*
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
            if ( state.backtracking>0 ) { memoize(input, 39, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:295:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK130=null;
        Token SEMICOLON131=null;

        Object BREAK130_tree=null;
        Object SEMICOLON131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:296:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:296:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK130=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK130_tree = (Object)adaptor.create(BREAK130);
            root_0 = (Object)adaptor.becomeRoot(BREAK130_tree, root_0);
            }
            SEMICOLON131=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1369); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON131_tree = (Object)adaptor.create(SEMICOLON131);
            adaptor.addChild(root_0, SEMICOLON131_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 40, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE132=null;
        Token LPAREN133=null;
        Token RPAREN135=null;
        IoclParser.variableDeclaration_return variableDeclaration134 = null;

        IoclParser.oclExpression_return oclExpression136 = null;


        Object COMPUTE132_tree=null;
        Object LPAREN133_tree=null;
        Object RPAREN135_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:300:2: ( COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:300:4: COMPUTE LPAREN variableDeclaration RPAREN oclExpression
            {
            COMPUTE132=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE132);

            LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN133);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1384);
            variableDeclaration134=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration134.getTree());
            RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN135);

            pushFollow(FOLLOW_oclExpression_in_computeExp1388);
            oclExpression136=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression136.getTree());


            // AST REWRITE
            // elements: variableDeclaration, oclExpression, COMPUTE
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:300:63: ^( COMPUTE variableDeclaration oclExpression )
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
            if ( state.backtracking>0 ) { memoize(input, 41, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE137=null;
        Token SEMICOLON138=null;

        Object CONTINUE137_tree=null;
        Object SEMICOLON138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:304:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:304:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE137=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1409); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE137_tree = (Object)adaptor.create(CONTINUE137);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE137_tree, root_0);
            }
            SEMICOLON138=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON138_tree = (Object)adaptor.create(SEMICOLON138);
            adaptor.addChild(root_0, SEMICOLON138_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 42, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:1: returnExp : RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN139=null;
        Token SEMICOLON141=null;
        IoclParser.oclExpression_return oclExpression140 = null;


        Object RETURN139_tree=null;
        Object SEMICOLON141_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:2: ( RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:4: RETURN ( oclExpression )? SEMICOLON
            {
            RETURN139=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN139);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:11: ( oclExpression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BREAK||(LA36_0>=COMPUTE && LA36_0<=DO)||LA36_0==IF||(LA36_0>=LCURLY && LA36_0<=LPAREN)||(LA36_0>=MINUS && LA36_0<=NOT)||LA36_0==RAISE||LA36_0==RETURN||LA36_0==SELF||(LA36_0>=TRY && LA36_0<=VAR)||LA36_0==WHILE||(LA36_0>=COLLECTION_TYPE_LITERAL && LA36_0<=REAL_LITERAL)||(LA36_0>=IDENTIFIER && LA36_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_returnExp1425);
                    oclExpression140=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression140.getTree());

                    }
                    break;

            }

            SEMICOLON141=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON141);



            // AST REWRITE
            // elements: RETURN, oclExpression
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:39: ^( RETURN ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:48: ( oclExpression )?
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
            if ( state.backtracking>0 ) { memoize(input, 43, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:311:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR142=null;
        Token SEMICOLON144=null;
        IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations143 = null;


        Object VAR142_tree=null;
        Object SEMICOLON144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:312:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:312:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR142=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR142_tree = (Object)adaptor.create(VAR142);
            root_0 = (Object)adaptor.becomeRoot(VAR142_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1451);
            imperativeVarDeclarations143=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations143.getTree());
            SEMICOLON144=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1453); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 44, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class imperativeVarDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclarations"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:315:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
    public final IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations() throws RecognitionException {
        IoclParser.imperativeVarDeclarations_return retval = new IoclParser.imperativeVarDeclarations_return();
        retval.start = input.LT(1);
        int imperativeVarDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal146=null;
        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration145 = null;

        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration147 = null;


        Object char_literal146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1466);
            imperativeVarDeclaration145=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration145.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:29: ( ',' imperativeVarDeclaration )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==69) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal146=(Token)match(input,69,FOLLOW_69_in_imperativeVarDeclarations1469); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1472);
            	    imperativeVarDeclaration147=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration147.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
            if ( state.backtracking>0 ) { memoize(input, 45, imperativeVarDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclarations"

    public static class imperativeVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:319:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration() throws RecognitionException {
        IoclParser.imperativeVarDeclaration_return retval = new IoclParser.imperativeVarDeclaration_return();
        retval.start = input.LT(1);
        int imperativeVarDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER148=null;
        Token char_literal149=null;
        Token EQUAL151=null;
        Token IS152=null;
        IoclParser.type_return type150 = null;

        IoclParser.oclExpression_return oclExpression153 = null;


        Object IDENTIFIER148_tree=null;
        Object char_literal149_tree=null;
        Object EQUAL151_tree=null;
        Object IS152_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )?
            {
            IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1486); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:15: ( ':' type )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:16: ':' type
                    {
                    char_literal149=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal149);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1491);
                    type150=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type150.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:27: ( ( EQUAL | IS ) oclExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EQUAL||LA40_0==IS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:28: ( EQUAL | IS ) oclExpression
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:28: ( EQUAL | IS )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EQUAL) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==IS) ) {
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
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:29: EQUAL
                            {
                            EQUAL151=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1497); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL151);


                            }
                            break;
                        case 2 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:37: IS
                            {
                            IS152=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS152);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_oclExpression_in_imperativeVarDeclaration1505);
                    oclExpression153=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression153.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: oclExpression, type, IDENTIFIER
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:61: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:83: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:89: ( oclExpression )?
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
            if ( state.backtracking>0 ) { memoize(input, 46, imperativeVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclaration"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:323:1: assignExp : dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set155=null;
        Token SEMICOLON157=null;
        IoclParser.dotArrowExp_return dotArrowExp154 = null;

        IoclParser.oclExpression_return oclExpression156 = null;


        Object set155_tree=null;
        Object SEMICOLON157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:324:2: ( dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:324:4: dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dotArrowExp_in_assignExp1532);
            dotArrowExp154=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp154.getTree());
            set155=(Token)input.LT(1);
            set155=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set155), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_oclExpression_in_assignExp1543);
            oclExpression156=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression156.getTree());
            SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1545); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 47, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:327:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE158=null;
        Token STRING_LITERAL160=null;
        Token SEMICOLON161=null;
        IoclParser.type_return type159 = null;


        Object RAISE158_tree=null;
        Object STRING_LITERAL160_tree=null;
        Object SEMICOLON161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE158=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE158_tree = (Object)adaptor.create(RAISE158);
            root_0 = (Object)adaptor.becomeRoot(RAISE158_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:11: ( type | STRING_LITERAL )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==COLLECTION_TYPE_LITERAL||LA41_0==IDENTIFIER||LA41_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt41=1;
            }
            else if ( (LA41_0==STRING_LITERAL) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1561);
                    type159=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type159.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:19: STRING_LITERAL
                    {
                    STRING_LITERAL160=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL160_tree = (Object)adaptor.create(STRING_LITERAL160);
                    adaptor.addChild(root_0, STRING_LITERAL160_tree);
                    }

                    }
                    break;

            }

            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1568); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 48, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:331:1: whileExp : WHILE LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE162=null;
        Token LPAREN163=null;
        Token RPAREN164=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object WHILE162_tree=null;
        Object LPAREN163_tree=null;
        Object RPAREN164_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:332:2: ( WHILE LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( WHILE $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:332:4: WHILE LPAREN condition= oclExpression RPAREN body= oclExpression
            {
            WHILE162=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE162);

            LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN163);

            pushFollow(FOLLOW_oclExpression_in_whileExp1588);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN164);

            pushFollow(FOLLOW_oclExpression_in_whileExp1599);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


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
            // 333:24: -> ^( WHILE $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:333:27: ^( WHILE $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 49, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:336:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF165=null;
        Token ENDIF169=null;
        IoclParser.altExp_return altExp166 = null;

        IoclParser.elifExp_return elifExp167 = null;

        IoclParser.elseExp_return elseExp168 = null;


        Object IF165_tree=null;
        Object ENDIF169_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF165=(Token)match(input,IF,FOLLOW_IF_in_ifExp1622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF165);

            pushFollow(FOLLOW_altExp_in_ifExp1624);
            altExp166=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp166.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:14: ( elifExp )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ELIF) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred68_Iocl()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1627);
            	    elifExp167=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp167.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:25: ( elseExp )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ELSE) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred69_Iocl()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1632);
                    elseExp168=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp168.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:36: ( ENDIF )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ENDIF) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred70_Iocl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF169=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF169);


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
            // 337:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:67: ( elseExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 50, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:340:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF170=null;
        IoclParser.altExp_return altExp171 = null;


        Object ELIF170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:341:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:341:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF170=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1662); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1665);
            altExp171=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp171.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:344:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE172=null;
        IoclParser.oclExpression_return oclExpression173 = null;


        Object ELSE172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:345:2: ( ELSE oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:345:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE172=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1677); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1680);
            oclExpression173=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression173.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:348:1: altExp : LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN174=null;
        Token RPAREN175=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object LPAREN174_tree=null;
        Object RPAREN175_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:349:2: ( LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:349:4: LPAREN condition= oclExpression RPAREN body= oclExpression
            {
            LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN174);

            pushFollow(FOLLOW_oclExpression_in_altExp1699);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN175=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN175);

            pushFollow(FOLLOW_oclExpression_in_altExp1708);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: body, condition
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:349:69: ^( ALT_EXP $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 53, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:352:1: tryExp : TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY176=null;
        Token LCURLY177=null;
        Token RCURLY179=null;
        IoclParser.oclExpression_return oclExpression178 = null;

        IoclParser.except_return except180 = null;


        Object TRY176_tree=null;
        Object LCURLY177_tree=null;
        Object RCURLY179_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:2: ( TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:4: TRY LCURLY ( oclExpression )* RCURLY except
            {
            TRY176=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY176);

            LCURLY177=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY177);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:15: ( oclExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BREAK||(LA45_0>=COMPUTE && LA45_0<=DO)||LA45_0==IF||(LA45_0>=LCURLY && LA45_0<=LPAREN)||(LA45_0>=MINUS && LA45_0<=NOT)||LA45_0==RAISE||LA45_0==RETURN||LA45_0==SELF||(LA45_0>=TRY && LA45_0<=VAR)||LA45_0==WHILE||(LA45_0>=COLLECTION_TYPE_LITERAL && LA45_0<=REAL_LITERAL)||(LA45_0>=IDENTIFIER && LA45_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_tryExp1735);
            	    oclExpression178=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression178.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            RCURLY179=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY179);

            pushFollow(FOLLOW_except_in_tryExp1740);
            except180=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except180.getTree());


            // AST REWRITE
            // elements: TRY, oclExpression, except
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:47: ^( TRY ( oclExpression )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:53: ( oclExpression )*
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
            if ( state.backtracking>0 ) { memoize(input, 54, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:356:1: except : EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        Token LCURLY185=null;
        Token RCURLY187=null;
        IoclParser.type_return type183 = null;

        IoclParser.oclExpression_return oclExpression186 = null;


        Object EXCEPT181_tree=null;
        Object LPAREN182_tree=null;
        Object RPAREN184_tree=null;
        Object LCURLY185_tree=null;
        Object RCURLY187_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:2: ( EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:4: EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY
            {
            EXCEPT181=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1762); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT181);

            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_type_in_except1766);
            type183=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type183.getTree());
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            LCURLY185=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1770); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY185);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:37: ( oclExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==BREAK||(LA46_0>=COMPUTE && LA46_0<=DO)||LA46_0==IF||(LA46_0>=LCURLY && LA46_0<=LPAREN)||(LA46_0>=MINUS && LA46_0<=NOT)||LA46_0==RAISE||LA46_0==RETURN||LA46_0==SELF||(LA46_0>=TRY && LA46_0<=VAR)||LA46_0==WHILE||(LA46_0>=COLLECTION_TYPE_LITERAL && LA46_0<=REAL_LITERAL)||(LA46_0>=IDENTIFIER && LA46_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_except1772);
            	    oclExpression186=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression186.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            RCURLY187=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY187);



            // AST REWRITE
            // elements: EXCEPT, oclExpression, type
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:62: ^( EXCEPT type ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:76: ( oclExpression )*
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
            if ( state.backtracking>0 ) { memoize(input, 55, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:360:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW189=null;
        Token FOR_NAME190=null;
        Token LPAREN191=null;
        Token char_literal193=null;
        Token RPAREN194=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;

        IoclParser.oclExp_return oclExp188 = null;

        IoclParser.iteratorList_return iteratorList192 = null;


        Object ARROW189_tree=null;
        Object FOR_NAME190_tree=null;
        Object LPAREN191_tree=null;
        Object char_literal193_tree=null;
        Object RPAREN194_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:361:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:361:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression
            {
            pushFollow(FOLLOW_oclExp_in_forExp1798);
            oclExp188=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp188.getTree());
            ARROW189=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1800); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW189);

            FOR_NAME190=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME190);

            LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN191);

            pushFollow(FOLLOW_iteratorList_in_forExp1806);
            iteratorList192=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList192.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:361:46: ( '|' condition= oclExpression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:361:47: '|' condition= oclExpression
                    {
                    char_literal193=(Token)match(input,73,FOLLOW_73_in_forExp1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(char_literal193);

                    pushFollow(FOLLOW_oclExpression_in_forExp1815);
                    condition=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());

                    }
                    break;

            }

            RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN194);

            pushFollow(FOLLOW_oclExpression_in_forExp1825);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: body, iteratorList, FOR_NAME, condition, oclExp
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:6: ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:41: ( $condition)?
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
            if ( state.backtracking>0 ) { memoize(input, 56, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:365:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal196=null;
        IoclParser.variableDeclaration_return variableDeclaration195 = null;

        IoclParser.variableDeclaration_return variableDeclaration197 = null;


        Object char_literal196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:366:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:366:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1857);
            variableDeclaration195=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration195.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:366:24: ( ',' variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==69) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:366:25: ',' variableDeclaration
            	    {
            	    char_literal196=(Token)match(input,69,FOLLOW_69_in_iteratorList1860); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1863);
            	    variableDeclaration197=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration197.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
            if ( state.backtracking>0 ) { memoize(input, 57, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: ( imperativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl380);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred12_Iocl
    public final void synpred12_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:23: ( ( PLUS | MINUS ) multiplicativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:23: ( PLUS | MINUS ) multiplicativeExp
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

        pushFollow(FOLLOW_multiplicativeExp_in_synpred12_Iocl495);
        multiplicativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Iocl

    // $ANTLR start synpred17_Iocl
    public final void synpred17_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:4: ( propertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:4: propertyCallExp
        {
        pushFollow(FOLLOW_propertyCallExp_in_synpred17_Iocl559);
        propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Iocl

    // $ANTLR start synpred18_Iocl
    public final void synpred18_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:4: ( variableExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred18_Iocl575);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Iocl

    // $ANTLR start synpred20_Iocl
    public final void synpred20_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: ( type )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: type
        {
        pushFollow(FOLLOW_type_in_synpred20_Iocl585);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Iocl

    // $ANTLR start synpred23_Iocl
    public final void synpred23_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:27: ( ',' collectionLiteralParts )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:27: ',' collectionLiteralParts
        {
        match(input,69,FOLLOW_69_in_synpred23_Iocl691); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred23_Iocl694);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Iocl

    // $ANTLR start synpred27_Iocl
    public final void synpred27_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: ( modelPropertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: modelPropertyCallExp
        {
        pushFollow(FOLLOW_modelPropertyCallExp_in_synpred27_Iocl804);
        modelPropertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:4: ( operationCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:4: operationCallExp
        {
        pushFollow(FOLLOW_operationCallExp_in_synpred28_Iocl820);
        operationCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred32_Iocl
    public final void synpred32_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: ( iteratorExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: iteratorExp
        {
        pushFollow(FOLLOW_iteratorExp_in_synpred32_Iocl907);
        iteratorExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Iocl

    // $ANTLR start synpred33_Iocl
    public final void synpred33_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:41: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:41: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred33_Iocl938);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,69,FOLLOW_69_in_synpred33_Iocl940); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Iocl

    // $ANTLR start synpred34_Iocl
    public final void synpred34_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:40: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:40: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:40: (v1= variableDeclaration ',' )?
        int alt49=2;
        int LA49_0 = input.LA(1);

        if ( (LA49_0==IDENTIFIER) ) {
            int LA49_1 = input.LA(2);

            if ( (synpred33_Iocl()) ) {
                alt49=1;
            }
        }
        switch (alt49) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:41: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred34_Iocl938);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,69,FOLLOW_69_in_synpred34_Iocl940); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred34_Iocl948);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,73,FOLLOW_73_in_synpred34_Iocl950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Iocl

    // $ANTLR start synpred35_Iocl
    public final void synpred35_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:33: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:33: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred35_Iocl1003);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred35_Iocl1005); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Iocl

    // $ANTLR start synpred54_Iocl
    public final void synpred54_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:4: ( assignExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred54_Iocl1302);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_Iocl

    // $ANTLR start synpred68_Iocl
    public final void synpred68_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:15: ( elifExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred68_Iocl1627);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Iocl

    // $ANTLR start synpred69_Iocl
    public final void synpred69_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:26: ( elseExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred69_Iocl1632);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Iocl

    // $ANTLR start synpred70_Iocl
    public final void synpred70_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:36: ( ENDIF )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred70_Iocl1636); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Iocl

    // Delegated rules

    public final boolean synpred17_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred35_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Iocl_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\12\7\uffff\12\0\5\uffff";
    static final String DFA1_maxS =
        "\1\75\7\uffff\12\0\5\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\24\uffff\1\2";
    static final String DFA1_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\3\1\12\uffff\1\1\3\uffff\1\1\1\21\2\uffff\2\26"+
            "\4\uffff\1\1\1\uffff\1\1\2\uffff\1\20\1\uffff\2\1\1\uffff\1"+
            "\1\1\uffff\1\12\1\15\1\16\1\13\1\14\1\uffff\1\11\1\10\1\17",
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
            return "106:1: oclExpression : ( imperativeExp | logicalExp );";
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
                    case 9 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index1_17);
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
        "\47\uffff";
    static final String DFA5_eofS =
        "\1\1\46\uffff";
    static final String DFA5_minS =
        "\1\5\40\uffff\1\0\5\uffff";
    static final String DFA5_maxS =
        "\1\111\40\uffff\1\0\5\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\44\uffff\1\1";
    static final String DFA5_specialS =
        "\41\uffff\1\0\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\4\uffff\1\1\3\uffff\3\1\1\uffff\5\1\2\uffff\3\1\3\uffff"+
            "\4\1\1\41\2\1\1\uffff\1\1\1\46\4\1\1\uffff\4\1\1\uffff\7\1\1"+
            "\uffff\3\1\7\uffff\1\1\2\uffff\2\1",
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
            return "()* loopback of 124:22: ( ( PLUS | MINUS ) multiplicativeExp )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_33 = input.LA(1);

                         
                        int index5_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_Iocl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_33);
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
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\40\1\uffff\11\0\1\uffff";
    static final String DFA8_maxS =
        "\1\75\1\uffff\11\0\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA8_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\12\15\uffff\1\11\6\uffff\1\3\1\6\1\7\1\4\1\5\1\uffff\1\2"+
            "\1\1\1\10",
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
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "136:1: dotArrowExp : ( propertyCallExp | oclExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\40\1\uffff\11\0\1\uffff";
    static final String DFA15_maxS =
        "\1\75\1\uffff\11\0\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA15_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\12\15\uffff\1\11\6\uffff\1\3\1\6\1\7\1\4\1\5\1\uffff\1\2"+
            "\1\1\1\10",
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
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "200:1: propertyCallExp : ( modelPropertyCallExp | loopExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\40\1\uffff\11\0\1\uffff";
    static final String DFA16_maxS =
        "\1\75\1\uffff\11\0\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA16_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\12\15\uffff\1\11\6\uffff\1\3\1\6\1\7\1\4\1\5\1\uffff\1\2"+
            "\1\1\1\10",
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
            return "205:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_10);
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
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\40\11\0\2\uffff";
    static final String DFA20_maxS =
        "\1\75\11\0\2\uffff";
    static final String DFA20_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\11\15\uffff\1\10\6\uffff\1\2\1\5\1\6\1\3\1\4\1\uffff\1\1"+
            "\1\uffff\1\7",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "223:1: loopExp : ( iteratorExp | iterateExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\30\uffff";
    static final String DFA22_eofS =
        "\30\uffff";
    static final String DFA22_minS =
        "\1\12\1\0\26\uffff";
    static final String DFA22_maxS =
        "\1\75\1\0\26\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\3\uffff\3\2\12\uffff\1\2\3\uffff\2\2\2\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\5\2\1\uffff\1\1\2\2",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "229:39: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\27\uffff";
    static final String DFA33_eofS =
        "\27\uffff";
    static final String DFA33_minS =
        "\1\12\10\uffff\11\0\5\uffff";
    static final String DFA33_maxS =
        "\1\75\10\uffff\11\0\5\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\11\uffff\1\10\1\11"+
        "\1\12\1\13\1\14";
    static final String DFA33_specialS =
        "\11\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\3\uffff\1\4\1\5\1\1\12\uffff\1\24\3\uffff\1\1\1\21\10\uffff"+
            "\1\22\1\uffff\1\6\2\uffff\1\20\1\uffff\1\25\1\7\1\uffff\1\23"+
            "\1\uffff\1\12\1\15\1\16\1\13\1\14\1\uffff\1\11\1\10\1\17",
            "",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "276:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_11 = input.LA(1);

                         
                        int index33_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_12 = input.LA(1);

                         
                        int index33_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_13 = input.LA(1);

                         
                        int index33_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_14 = input.LA(1);

                         
                        int index33_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_15 = input.LA(1);

                         
                        int index33_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_16 = input.LA(1);

                         
                        int index33_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA33_17 = input.LA(1);

                         
                        int index33_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp396 = new BitSet(new long[]{0x0010008000000022L});
    public static final BitSet FOLLOW_set_in_logicalExp399 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp412 = new BitSet(new long[]{0x0010008000000022L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp425 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_set_in_equalityExp428 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp437 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp450 = new BitSet(new long[]{0x0000000606000002L});
    public static final BitSet FOLLOW_set_in_relationalExp453 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp470 = new BitSet(new long[]{0x0000000606000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp483 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_set_in_additiveExp486 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp495 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp508 = new BitSet(new long[]{0x0000004000020002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp511 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp521 = new BitSet(new long[]{0x0000004000020002L});
    public static final BitSet FOLLOW_set_in_unaryExp534 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp590 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_oclExp592 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp648 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp650 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp652 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts688 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_collectionLiteralParts691 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeCallExp_in_modelPropertyCallExp825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_attributeCallExp838 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_attributeCallExp840 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_isMarkedPre_in_attributeCallExp844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_isMarkedPre869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_navigationCallExp880 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_navigationCallExp882 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_simpleName_in_navigationCallExp884 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_navigationCallExp887 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_arguments_in_navigationCallExp889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_navigationCallExp891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_isMarkedPre_in_navigationCallExp895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_iteratorExp924 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iteratorExp926 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp928 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp930 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_iteratorExp940 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iteratorExp950 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp954 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_iterateExp990 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iterateExp992 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp994 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp996 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1003 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp1005 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterateExp1016 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1018 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1051 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1054 = new BitSet(new long[]{0x2820000000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1056 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1061 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp1090 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp1092 = new BitSet(new long[]{0x3BEB5A198801C400L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp1094 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_operationCallExp1111 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_set_in_operationCallExp1114 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp1123 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp1125 = new BitSet(new long[]{0x3BEB5A198801C400L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp1128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp1131 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_arguments1148 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1192 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1194 = new BitSet(new long[]{0x2820000000000000L});
    public static final BitSet FOLLOW_type_in_collectionType1196 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1241 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1244 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1246 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1338 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1341 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_blockExp1343 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1366 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1380 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1382 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1384 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1386 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1409 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1423 = new BitSet(new long[]{0x3BEBCA198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_returnExp1425 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1448 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1451 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_imperativeVarDeclarations1469 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1472 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1486 = new BitSet(new long[]{0x0000000040402002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1489 = new BitSet(new long[]{0x2820000000000000L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1491 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1497 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1501 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_imperativeVarDeclaration1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_assignExp1532 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_set_in_assignExp1534 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_assignExp1543 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1557 = new BitSet(new long[]{0x2860000000000000L});
    public static final BitSet FOLLOW_type_in_raiseExp1561 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1565 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1582 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1588 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1590 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1622 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1624 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1627 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1632 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1662 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1677 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1693 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1699 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1701 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1731 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1733 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_tryExp1735 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1738 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_except_in_tryExp1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1762 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1764 = new BitSet(new long[]{0x2820000000000000L});
    public static final BitSet FOLLOW_type_in_except1766 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1768 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1770 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_except1772 = new BitSet(new long[]{0x3BEB4E198801C400L});
    public static final BitSet FOLLOW_RCURLY_in_except1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1798 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1800 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1802 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1804 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1806 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_forExp1809 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1815 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1819 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_iteratorList1860 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred12_Iocl486 = new BitSet(new long[]{0x3BE0401900000000L});
    public static final BitSet FOLLOW_multiplicativeExp_in_synpred12_Iocl495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred17_Iocl559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred18_Iocl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred20_Iocl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred23_Iocl691 = new BitSet(new long[]{0x3BEB4A198801C400L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred23_Iocl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_synpred27_Iocl804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_synpred28_Iocl820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_synpred32_Iocl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred33_Iocl938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred33_Iocl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred34_Iocl938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred34_Iocl940 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred34_Iocl948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_synpred34_Iocl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred35_Iocl1003 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred35_Iocl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred54_Iocl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred68_Iocl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred69_Iocl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred70_Iocl1636 = new BitSet(new long[]{0x0000000000000002L});

}