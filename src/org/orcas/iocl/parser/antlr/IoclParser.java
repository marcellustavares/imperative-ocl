// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-07-16 13:28:47

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ALT_EXP", "APPEND", "ARROW", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "ITERATOR_NAME", "IDENTIFIER", "NUMERIC_OPERATION", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'@pre'", "'['", "']'", "'|'"
    };
    public static final int T__68=68;
    public static final int ITERATOR_NAME=57;
    public static final int T__69=69;
    public static final int APPEND=6;
    public static final int EXPONENT=62;
    public static final int LT=32;
    public static final int WHILE=50;
    public static final int PRIMITIVE_TYPE_LITERAL=60;
    public static final int COMPUTE=13;
    public static final int GTE=25;
    public static final int OCTAL_ESC=67;
    public static final int DO=15;
    public static final int FOR=23;
    public static final int NOT=35;
    public static final int AND=4;
    public static final int EXCEPT=22;
    public static final int EOF=-1;
    public static final int LTE=33;
    public static final int BREAK=9;
    public static final int LPAREN=31;
    public static final int IF=26;
    public static final int RPAREN=43;
    public static final int ESC_SEQ=63;
    public static final int STRING_LITERAL=53;
    public static final int REAL_LITERAL=56;
    public static final int SCOPE=44;
    public static final int COLLECTION_TYPE_LITERAL=52;
    public static final int CONTINUE=14;
    public static final int NOT_EQUAL=36;
    public static final int IS=29;
    public static final int IDENTIFIER=58;
    public static final int ITERATOR=28;
    public static final int EQUAL=21;
    public static final int RETURN=42;
    public static final int ENDIF=18;
    public static final int PLUS=39;
    public static final int VAR=48;
    public static final int RAISE=40;
    public static final int DOT=17;
    public static final int COLLECTION_LITERAL=10;
    public static final int FOR_NAME=61;
    public static final int XOR=51;
    public static final int COLLECTION_TYPE=11;
    public static final int UNICODE_ESC=66;
    public static final int NUMERIC_OPERATION=59;
    public static final int ELSE=20;
    public static final int HEX_DIGIT=65;
    public static final int LCURLY=30;
    public static final int SEMICOLON=46;
    public static final int MINUS=34;
    public static final int MULT=37;
    public static final int TRY=47;
    public static final int BOOLEAN_LITERAL=54;
    public static final int COLON=12;
    public static final int ALT_EXP=5;
    public static final int ELIF=19;
    public static final int ITERATE=27;
    public static final int WS=64;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int VARIABLE=49;
    public static final int T__70=70;
    public static final int INTEGER_LITERAL=55;
    public static final int BLOCK=8;
    public static final int RCURLY=41;
    public static final int OR=38;
    public static final int ARROW=7;
    public static final int GT=24;
    public static final int DIV=16;
    public static final int SELF=45;

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
    public String getGrammarFileName() { return "/Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g"; }


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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:105:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression377);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression382);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:110:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp393);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:17: ( AND | OR | XOR ) equalityExp
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

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp409);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp422);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:19: ( EQUAL | NOT_EQUAL ) relationalExp
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

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp434);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:118:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp447);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:17: ( LT | LTE | GT | GTE ) additiveExp
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

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp467);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:122:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp480);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:23: ( PLUS | MINUS ) multiplicativeExp
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

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp492);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:126:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp505);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:14: ( MULT | DIV ) unaryExp
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

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp518);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:130:1: unaryExp : ( ( MINUS | NOT ) unaryExp | dotArrowExp );
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:2: ( ( MINUS | NOT ) unaryExp | dotArrowExp )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:4: ( MINUS | NOT ) unaryExp
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

                    pushFollow(FOLLOW_unaryExp_in_unaryExp540);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp545);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:1: dotArrowExp : ( propertyCallExp | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.propertyCallExp_return propertyCallExp21 = null;

        IoclParser.oclExp_return oclExp22 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:2: ( propertyCallExp | oclExp )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:4: propertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp556);
                    propertyCallExp21=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp21.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp561);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:1: oclExp : ( variableExp | literalExp | type | '(' oclExpression ')' -> oclExpression );
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:2: ( variableExp | literalExp | type | '(' oclExpression ')' -> oclExpression )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp572);
                    variableExp23=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp23.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp577);
                    literalExp24=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp24.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp582);
                    type25=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type25.getTree());

                    }
                    break;
                case 4 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: '(' oclExpression ')'
                    {
                    char_literal26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal26);

                    pushFollow(FOLLOW_oclExpression_in_oclExp589);
                    oclExpression27=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression27.getTree());
                    char_literal28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp591); if (state.failed) return retval; 
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
                    // 144:26: -> oclExpression
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:147:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName29 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp609);
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
            // 148:15: -> ^( VARIABLE simpleName )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:18: ^( VARIABLE simpleName )
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:151:1: literalExp : ( collectionLiteralExp | primitiveLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp30 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp31 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:2: ( collectionLiteralExp | primitiveLiteralExp )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp628);
                    collectionLiteralExp30=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp30.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp634);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:156:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp645);
            collectionTypeIdentifier32=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier32.getTree());
            char_literal33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal33);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:33: ( collectionLiteralParts )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BREAK||(LA11_0>=COMPUTE && LA11_0<=DO)||LA11_0==IF||(LA11_0>=LCURLY && LA11_0<=LPAREN)||(LA11_0>=MINUS && LA11_0<=NOT)||LA11_0==RAISE||LA11_0==RETURN||LA11_0==SELF||(LA11_0>=TRY && LA11_0<=VAR)||LA11_0==WHILE||(LA11_0>=COLLECTION_TYPE_LITERAL && LA11_0<=REAL_LITERAL)||(LA11_0>=IDENTIFIER && LA11_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp649);
                    collectionLiteralParts34=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts34.getTree());

                    }
                    break;

            }

            char_literal35=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp652); if (state.failed) return retval; 
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
            // 157:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:110: ( collectionLiteralParts )?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:160:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL36=null;

        Object COLLECTION_TYPE_LITERAL36_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:2: ( COLLECTION_TYPE_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL36=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier674); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:164:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts685);
            collectionLiteralPart37=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart37.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:26: ( ',' collectionLiteralParts )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==68) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred23_Iocl()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:27: ',' collectionLiteralParts
            	    {
            	    char_literal38=(Token)match(input,68,FOLLOW_68_in_collectionLiteralParts688); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts691);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:168:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression40 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:169:2: ( oclExpression )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:169:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart704);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:172:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
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
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:173:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:173:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp715);
                    numericLiteralExp41=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp41.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:174:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp720);
                    stringLiteralExp42=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp42.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp725);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:178:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp44 = null;

        IoclParser.realLiteralExp_return realLiteralExp45 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:2: ( integerLiteralExp | realLiteralExp )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp736);
                    integerLiteralExp44=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp44.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp741);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:183:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL46=null;

        Object STRING_LITERAL46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:2: ( STRING_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL46=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp756); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:187:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL47=null;

        Object BOOLEAN_LITERAL47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:2: ( BOOLEAN_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL47=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp767); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL48=null;

        Object INTEGER_LITERAL48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:192:2: ( INTEGER_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:192:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL48=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp778); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL49=null;

        Object REAL_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:196:2: ( REAL_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:196:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL49=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp790); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:1: propertyCallExp : ( modelPropertyCallExp | loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp50 = null;

        IoclParser.loopExp_return loopExp51 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:2: ( modelPropertyCallExp | loopExp )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:4: modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp801);
                    modelPropertyCallExp50=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp50.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopExp_in_propertyCallExp806);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:204:1: modelPropertyCallExp : operationCallExp ;
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp52 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:2: ( operationCallExp )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:4: operationCallExp
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp817);
            operationCallExp52=operationCallExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp52.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:210:1: attributeCallExp : ( oclExpression DOT simpleName ( isMarkedPre )? | simpleName ( isMarkedPre )? | pathName );
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token DOT54=null;
        IoclParser.oclExpression_return oclExpression53 = null;

        IoclParser.simpleName_return simpleName55 = null;

        IoclParser.isMarkedPre_return isMarkedPre56 = null;

        IoclParser.simpleName_return simpleName57 = null;

        IoclParser.isMarkedPre_return isMarkedPre58 = null;

        IoclParser.pathName_return pathName59 = null;


        Object DOT54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:2: ( oclExpression DOT simpleName ( isMarkedPre )? | simpleName ( isMarkedPre )? | pathName )
            int alt18=3;
            switch ( input.LA(1) ) {
            case BREAK:
            case COMPUTE:
            case CONTINUE:
            case DO:
            case IF:
            case LCURLY:
            case LPAREN:
            case MINUS:
            case NOT:
            case RAISE:
            case RETURN:
            case TRY:
            case VAR:
            case WHILE:
            case COLLECTION_TYPE_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
            case NUMERIC_OPERATION:
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt18=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==AND||(LA18_2>=APPEND && LA18_2<=ARROW)||(LA18_2>=DIV && LA18_2<=DOT)||LA18_2==EQUAL||(LA18_2>=GT && LA18_2<=GTE)||LA18_2==IS||(LA18_2>=LT && LA18_2<=MINUS)||(LA18_2>=NOT_EQUAL && LA18_2<=PLUS)||LA18_2==SCOPE||LA18_2==XOR) ) {
                    alt18=1;
                }
                else if ( (synpred31_Iocl()) ) {
                    alt18=2;
                }
                else if ( (true) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case SELF:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==AND||(LA18_3>=APPEND && LA18_3<=ARROW)||(LA18_3>=DIV && LA18_3<=DOT)||LA18_3==EQUAL||(LA18_3>=GT && LA18_3<=GTE)||LA18_3==IS||(LA18_3>=LT && LA18_3<=MINUS)||(LA18_3>=NOT_EQUAL && LA18_3<=PLUS)||LA18_3==XOR) ) {
                    alt18=1;
                }
                else if ( (LA18_3==EOF||LA18_3==69) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:4: oclExpression DOT simpleName ( isMarkedPre )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpression_in_attributeCallExp832);
                    oclExpression53=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression53.getTree());
                    DOT54=(Token)match(input,DOT,FOLLOW_DOT_in_attributeCallExp834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT54_tree = (Object)adaptor.create(DOT54);
                    adaptor.addChild(root_0, DOT54_tree);
                    }
                    pushFollow(FOLLOW_simpleName_in_attributeCallExp836);
                    simpleName55=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName55.getTree());
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:33: ( isMarkedPre )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==69) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                            {
                            pushFollow(FOLLOW_isMarkedPre_in_attributeCallExp838);
                            isMarkedPre56=isMarkedPre();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, isMarkedPre56.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: simpleName ( isMarkedPre )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleName_in_attributeCallExp844);
                    simpleName57=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName57.getTree());
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:15: ( isMarkedPre )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==69) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                            {
                            pushFollow(FOLLOW_isMarkedPre_in_attributeCallExp846);
                            isMarkedPre58=isMarkedPre();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, isMarkedPre58.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_attributeCallExp852);
                    pathName59=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName59.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:216:1: isMarkedPre : '@pre' ;
    public final IoclParser.isMarkedPre_return isMarkedPre() throws RecognitionException {
        IoclParser.isMarkedPre_return retval = new IoclParser.isMarkedPre_return();
        retval.start = input.LT(1);
        int isMarkedPre_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal60=null;

        Object string_literal60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:217:2: ( '@pre' )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:217:4: '@pre'
            {
            root_0 = (Object)adaptor.nil();

            string_literal60=(Token)match(input,69,FOLLOW_69_in_isMarkedPre863); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = (Object)adaptor.create(string_literal60);
            adaptor.addChild(root_0, string_literal60_tree);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:1: navigationCallExp : oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )? ;
    public final IoclParser.navigationCallExp_return navigationCallExp() throws RecognitionException {
        IoclParser.navigationCallExp_return retval = new IoclParser.navigationCallExp_return();
        retval.start = input.LT(1);
        int navigationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token DOT62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        IoclParser.oclExpression_return oclExpression61 = null;

        IoclParser.simpleName_return simpleName63 = null;

        IoclParser.arguments_return arguments65 = null;

        IoclParser.isMarkedPre_return isMarkedPre67 = null;


        Object DOT62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:2: ( oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )? )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:4: oclExpression DOT simpleName ( '[' arguments ']' )? ( isMarkedPre )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_navigationCallExp874);
            oclExpression61=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression61.getTree());
            DOT62=(Token)match(input,DOT,FOLLOW_DOT_in_navigationCallExp876); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT62_tree = (Object)adaptor.create(DOT62);
            adaptor.addChild(root_0, DOT62_tree);
            }
            pushFollow(FOLLOW_simpleName_in_navigationCallExp878);
            simpleName63=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName63.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:33: ( '[' arguments ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==70) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:34: '[' arguments ']'
                    {
                    char_literal64=(Token)match(input,70,FOLLOW_70_in_navigationCallExp881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_navigationCallExp883);
                    arguments65=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments65.getTree());
                    char_literal66=(Token)match(input,71,FOLLOW_71_in_navigationCallExp885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal66_tree = (Object)adaptor.create(char_literal66);
                    adaptor.addChild(root_0, char_literal66_tree);
                    }

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:54: ( isMarkedPre )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==69) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                    {
                    pushFollow(FOLLOW_isMarkedPre_in_navigationCallExp889);
                    isMarkedPre67=isMarkedPre();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isMarkedPre67.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp68 = null;

        IoclParser.iterateExp_return iterateExp69 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:2: ( iteratorExp | iterateExp )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp901);
                    iteratorExp68=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp68.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp906);
                    iterateExp69=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp69.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:1: iteratorExp : oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW71=null;
        Token ITERATOR_NAME72=null;
        Token LPAREN73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token RPAREN77=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExp_return oclExp70 = null;

        IoclParser.oclExpression_return oclExpression76 = null;


        Object ARROW71_tree=null;
        Object ITERATOR_NAME72_tree=null;
        Object LPAREN73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object RPAREN77_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:2: ( oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:5: oclExp ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            pushFollow(FOLLOW_oclExp_in_iteratorExp918);
            oclExp70=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp70.getTree());
            ARROW71=(Token)match(input,ARROW,FOLLOW_ARROW_in_iteratorExp920); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW71);

            ITERATOR_NAME72=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME72);

            LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN73);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:39: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:40: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:40: (v1= variableDeclaration ',' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==IDENTIFIER) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred35_Iocl()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:41: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp932);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal74=(Token)match(input,68,FOLLOW_68_in_iteratorExp934); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_68.add(char_literal74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp942);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal75=(Token)match(input,72,FOLLOW_72_in_iteratorExp944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(char_literal75);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp948);
            oclExpression76=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression76.getTree());
            RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp950); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN77);



            // AST REWRITE
            // elements: ITERATOR_NAME, oclExp, v2, v1, oclExpression
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
            // 231:3: -> ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:6: ^( ITERATOR oclExp ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:38: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:43: ( $v2)?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:1: iterateExp : oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW79=null;
        Token ITERATE80=null;
        Token LPAREN81=null;
        Token SEMICOLON82=null;
        Token char_literal83=null;
        Token RPAREN85=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExp_return oclExp78 = null;

        IoclParser.oclExpression_return oclExpression84 = null;


        Object ARROW79_tree=null;
        Object ITERATE80_tree=null;
        Object LPAREN81_tree=null;
        Object SEMICOLON82_tree=null;
        Object char_literal83_tree=null;
        Object RPAREN85_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:2: ( oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:4: oclExp ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            pushFollow(FOLLOW_oclExp_in_iterateExp984);
            oclExp78=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp78.getTree());
            ARROW79=(Token)match(input,ARROW,FOLLOW_ARROW_in_iterateExp986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW79);

            ITERATE80=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp988); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE80);

            LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN81);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:32: (v1= variableDeclaration SEMICOLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred37_Iocl()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:33: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp997);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON82);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1007);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal83=(Token)match(input,72,FOLLOW_72_in_iterateExp1010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_72.add(char_literal83);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1012);
            oclExpression84=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression84.getTree());
            RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN85);



            // AST REWRITE
            // elements: oclExp, oclExpression, v2, ITERATE, v1
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
            // 236:3: -> ^( ITERATE oclExp ( $v1)? $v2 oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:236:6: ^( ITERATE oclExp ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExp.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:236:23: ( $v1)?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        IoclParser.type_return type88 = null;

        IoclParser.oclExpression_return oclExpression90 = null;


        Object IDENTIFIER86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1045); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:15: ( ':' type )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==COLON) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:16: ':' type
                    {
                    char_literal87=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal87);

                    pushFollow(FOLLOW_type_in_variableDeclaration1050);
                    type88=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type88.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:27: ( '=' oclExpression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQUAL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:28: '=' oclExpression
                    {
                    char_literal89=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal89);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1057);
                    oclExpression90=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression90.getTree());

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
            // 240:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:79: ( oclExpression )?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | oclExp ( DOT | ARROW ) simpleName '(' ( arguments )? ')' );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token set96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        IoclParser.arguments_return arguments93 = null;

        IoclParser.oclExp_return oclExp95 = null;

        IoclParser.simpleName_return simpleName97 = null;

        IoclParser.arguments_return arguments99 = null;


        Object NUMERIC_OPERATION91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        Object set96_tree=null;
        Object char_literal98_tree=null;
        Object char_literal100_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | oclExp ( DOT | ARROW ) simpleName '(' ( arguments )? ')' )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION91=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION91);

                    char_literal92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal92);

                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:26: ( arguments )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BREAK||(LA27_0>=COMPUTE && LA27_0<=DO)||LA27_0==IF||(LA27_0>=LCURLY && LA27_0<=LPAREN)||(LA27_0>=MINUS && LA27_0<=NOT)||LA27_0==RAISE||LA27_0==RETURN||LA27_0==SELF||(LA27_0>=TRY && LA27_0<=VAR)||LA27_0==WHILE||(LA27_0>=COLLECTION_TYPE_LITERAL && LA27_0<=REAL_LITERAL)||(LA27_0>=IDENTIFIER && LA27_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp1088);
                            arguments93=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments93.getTree());

                            }
                            break;

                    }

                    char_literal94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp1091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal94);



                    // AST REWRITE
                    // elements: NUMERIC_OPERATION, arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:64: ( arguments )?
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:245:4: oclExp ( DOT | ARROW ) simpleName '(' ( arguments )? ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_operationCallExp1105);
                    oclExp95=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp95.getTree());
                    set96=(Token)input.LT(1);
                    set96=(Token)input.LT(1);
                    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set96), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleName_in_operationCallExp1116);
                    simpleName97=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName97.getTree());
                    char_literal98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp1118); if (state.failed) return retval;
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:245:42: ( arguments )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==BREAK||(LA28_0>=COMPUTE && LA28_0<=DO)||LA28_0==IF||(LA28_0>=LCURLY && LA28_0<=LPAREN)||(LA28_0>=MINUS && LA28_0<=NOT)||LA28_0==RAISE||LA28_0==RETURN||LA28_0==SELF||(LA28_0>=TRY && LA28_0<=VAR)||LA28_0==WHILE||(LA28_0>=COLLECTION_TYPE_LITERAL && LA28_0<=REAL_LITERAL)||(LA28_0>=IDENTIFIER && LA28_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp1121);
                            arguments99=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments99.getTree());

                            }
                            break;

                    }

                    char_literal100=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp1124); if (state.failed) return retval;

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:248:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal102=null;
        IoclParser.oclExpression_return oclExpression101 = null;

        IoclParser.oclExpression_return oclExpression103 = null;


        Object char_literal102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:2: ( oclExpression ( ',' oclExpression )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1136);
            oclExpression101=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression101.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:18: ( ',' oclExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==68) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:19: ',' oclExpression
            	    {
            	    char_literal102=(Token)match(input,68,FOLLOW_68_in_arguments1139); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1142);
            	    oclExpression103=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression103.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:252:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set104=null;

        Object set104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:253:2: ( SELF | IDENTIFIER )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set104=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set104));
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:257:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL105=null;

        Object PRIMITIVE_TYPE_LITERAL105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL105=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL105_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL105);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL105_tree);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:1: collectionType : collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN107=null;
        Token RPAREN109=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier106 = null;

        IoclParser.type_return type108 = null;


        Object LPAREN107_tree=null;
        Object RPAREN109_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:2: ( collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:4: collectionTypeIdentifier LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1183);
            collectionTypeIdentifier106=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier106.getTree());
            LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN107);

            pushFollow(FOLLOW_type_in_collectionType1187);
            type108=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type108.getTree());
            RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN109);



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
            // 262:48: -> ^( COLLECTION_TYPE collectionTypeIdentifier type )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:51: ^( COLLECTION_TYPE collectionTypeIdentifier type )
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:265:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType110 = null;

        IoclParser.collectionType_return collectionType111 = null;

        IoclParser.pathName_return pathName112 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:2: ( primitiveType | collectionType | pathName )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1211);
                    primitiveType110=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType110.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1216);
                    collectionType111=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType111.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1221);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER113=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER113);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:15: ( SCOPE IDENTIFIER )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SCOPE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE114=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1235); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE114);

            	    IDENTIFIER115=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1237); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER115);


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
            // 272:35: -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:38: ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:272:57: ( IDENTIFIER )*
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:277:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );
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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp )
            int alt33=12;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1263);
                    blockExp116=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp116.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:279:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1268);
                    breakExp117=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp117.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1273);
                    computeExp118=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp118.getTree());

                    }
                    break;
                case 4 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:281:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1278);
                    continueExp119=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp119.getTree());

                    }
                    break;
                case 5 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1283);
                    returnExp120=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp120.getTree());

                    }
                    break;
                case 6 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1288);
                    variableInitExp121=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp121.getTree());

                    }
                    break;
                case 7 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1293);
                    assignExp122=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp122.getTree());

                    }
                    break;
                case 8 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:285:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1298);
                    raiseExp123=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp123.getTree());

                    }
                    break;
                case 9 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:286:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1303);
                    whileExp124=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp124.getTree());

                    }
                    break;
                case 10 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1308);
                    ifExp125=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp125.getTree());

                    }
                    break;
                case 11 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1313);
                    tryExp126=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp126.getTree());

                    }
                    break;
                case 12 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:289:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1318);
                    forExp127=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp127.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:1: blockExp : ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO128=null;
        Token LCURLY129=null;
        Token RCURLY131=null;
        IoclParser.oclExpression_return oclExpression130 = null;


        Object DO128_tree=null;
        Object LCURLY129_tree=null;
        Object RCURLY131_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:2: ( ( DO )? LCURLY ( oclExpression )* RCURLY -> ^( BLOCK ( oclExpression )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:4: ( DO )? LCURLY ( oclExpression )* RCURLY
            {
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:4: ( DO )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DO) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO128=(Token)match(input,DO,FOLLOW_DO_in_blockExp1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO128);


                    }
                    break;

            }

            LCURLY129=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1332); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY129);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:15: ( oclExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==BREAK||(LA35_0>=COMPUTE && LA35_0<=DO)||LA35_0==IF||(LA35_0>=LCURLY && LA35_0<=LPAREN)||(LA35_0>=MINUS && LA35_0<=NOT)||LA35_0==RAISE||LA35_0==RETURN||LA35_0==SELF||(LA35_0>=TRY && LA35_0<=VAR)||LA35_0==WHILE||(LA35_0>=COLLECTION_TYPE_LITERAL && LA35_0<=REAL_LITERAL)||(LA35_0>=IDENTIFIER && LA35_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_blockExp1334);
            	    oclExpression130=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression130.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            RCURLY131=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY131);



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
            // 293:37: -> ^( BLOCK ( oclExpression )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:40: ^( BLOCK ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:293:48: ( oclExpression )*
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:296:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK132=null;
        Token SEMICOLON133=null;

        Object BREAK132_tree=null;
        Object SEMICOLON133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:297:2: ( BREAK SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:297:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK132=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1357); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK132_tree = (Object)adaptor.create(BREAK132);
            root_0 = (Object)adaptor.becomeRoot(BREAK132_tree, root_0);
            }
            SEMICOLON133=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1360); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON133_tree = (Object)adaptor.create(SEMICOLON133);
            adaptor.addChild(root_0, SEMICOLON133_tree);
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:300:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpression RCURLY -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE134=null;
        Token LPAREN135=null;
        Token RPAREN137=null;
        Token LCURLY138=null;
        Token RCURLY140=null;
        IoclParser.variableDeclaration_return variableDeclaration136 = null;

        IoclParser.oclExpression_return oclExpression139 = null;


        Object COMPUTE134_tree=null;
        Object LPAREN135_tree=null;
        Object RPAREN137_tree=null;
        Object LCURLY138_tree=null;
        Object RCURLY140_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:301:2: ( COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpression RCURLY -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:301:4: COMPUTE LPAREN variableDeclaration RPAREN LCURLY oclExpression RCURLY
            {
            COMPUTE134=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE134);

            LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN135);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1375);
            variableDeclaration136=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration136.getTree());
            RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN137);

            LCURLY138=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_computeExp1379); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY138);

            pushFollow(FOLLOW_oclExpression_in_computeExp1381);
            oclExpression139=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression139.getTree());
            RCURLY140=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_computeExp1383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY140);



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
            // 301:74: -> ^( COMPUTE variableDeclaration oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:301:77: ^( COMPUTE variableDeclaration oclExpression )
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:304:1: continueExp : CONTINUE SEMICOLON ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:305:2: ( CONTINUE SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:305:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE141=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE141_tree = (Object)adaptor.create(CONTINUE141);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE141_tree, root_0);
            }
            SEMICOLON142=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1407); if (state.failed) return retval;
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:308:1: returnExp : RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN143=null;
        Token SEMICOLON145=null;
        IoclParser.oclExpression_return oclExpression144 = null;


        Object RETURN143_tree=null;
        Object SEMICOLON145_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:309:2: ( RETURN ( oclExpression )? SEMICOLON -> ^( RETURN ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:309:4: RETURN ( oclExpression )? SEMICOLON
            {
            RETURN143=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN143);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:309:11: ( oclExpression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==BREAK||(LA36_0>=COMPUTE && LA36_0<=DO)||LA36_0==IF||(LA36_0>=LCURLY && LA36_0<=LPAREN)||(LA36_0>=MINUS && LA36_0<=NOT)||LA36_0==RAISE||LA36_0==RETURN||LA36_0==SELF||(LA36_0>=TRY && LA36_0<=VAR)||LA36_0==WHILE||(LA36_0>=COLLECTION_TYPE_LITERAL && LA36_0<=REAL_LITERAL)||(LA36_0>=IDENTIFIER && LA36_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_returnExp1420);
                    oclExpression144=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression144.getTree());

                    }
                    break;

            }

            SEMICOLON145=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON145);



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
            // 309:36: -> ^( RETURN ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:309:39: ^( RETURN ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:309:48: ( oclExpression )?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:312:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:313:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:313:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR146=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1443); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR146_tree = (Object)adaptor.create(VAR146);
            root_0 = (Object)adaptor.becomeRoot(VAR146_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1446);
            imperativeVarDeclarations147=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations147.getTree());
            SEMICOLON148=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1448); if (state.failed) return retval;

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:316:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:317:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:317:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1461);
            imperativeVarDeclaration149=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration149.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:317:29: ( ',' imperativeVarDeclaration )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==68) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:317:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal150=(Token)match(input,68,FOLLOW_68_in_imperativeVarDeclarations1464); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1467);
            	    imperativeVarDeclaration151=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration151.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:320:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
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

        IoclParser.oclExpression_return oclExpression157 = null;


        Object IDENTIFIER152_tree=null;
        Object char_literal153_tree=null;
        Object EQUAL155_tree=null;
        Object IS156_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) oclExpression )?
            {
            IDENTIFIER152=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER152);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:15: ( ':' type )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:16: ':' type
                    {
                    char_literal153=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal153);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1486);
                    type154=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type154.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:27: ( ( EQUAL | IS ) oclExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EQUAL||LA40_0==IS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:28: ( EQUAL | IS ) oclExpression
                    {
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:28: ( EQUAL | IS )
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
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:29: EQUAL
                            {
                            EQUAL155=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1492); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL155);


                            }
                            break;
                        case 2 :
                            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:37: IS
                            {
                            IS156=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1496); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS156);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_oclExpression_in_imperativeVarDeclaration1500);
                    oclExpression157=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression157.getTree());

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
            // 321:58: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:61: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:83: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:321:89: ( oclExpression )?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:324:1: assignExp : dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set159=null;
        Token SEMICOLON161=null;
        IoclParser.dotArrowExp_return dotArrowExp158 = null;

        IoclParser.oclExpression_return oclExpression160 = null;


        Object set159_tree=null;
        Object SEMICOLON161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:325:2: ( dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:325:4: dotArrowExp ( IS | APPEND ) oclExpression SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dotArrowExp_in_assignExp1527);
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

            pushFollow(FOLLOW_oclExpression_in_assignExp1538);
            oclExpression160=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression160.getTree());
            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1540); if (state.failed) return retval;

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:328:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:329:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:329:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE162=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1552); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE162_tree = (Object)adaptor.create(RAISE162);
            root_0 = (Object)adaptor.becomeRoot(RAISE162_tree, root_0);
            }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:329:11: ( type | STRING_LITERAL )
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
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:329:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1556);
                    type163=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type163.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:329:19: STRING_LITERAL
                    {
                    STRING_LITERAL164=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL164_tree = (Object)adaptor.create(STRING_LITERAL164);
                    adaptor.addChild(root_0, STRING_LITERAL164_tree);
                    }

                    }
                    break;

            }

            SEMICOLON165=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1563); if (state.failed) return retval;

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:332:1: whileExp : WHILE LPAREN condition= oclExpression RPAREN LCURLY body= oclExpression RCURLY -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE166=null;
        Token LPAREN167=null;
        Token RPAREN168=null;
        Token LCURLY169=null;
        Token RCURLY170=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object WHILE166_tree=null;
        Object LPAREN167_tree=null;
        Object RPAREN168_tree=null;
        Object LCURLY169_tree=null;
        Object RCURLY170_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:333:2: ( WHILE LPAREN condition= oclExpression RPAREN LCURLY body= oclExpression RCURLY -> ^( WHILE $condition $body) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:333:4: WHILE LPAREN condition= oclExpression RPAREN LCURLY body= oclExpression RCURLY
            {
            WHILE166=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE166);

            LPAREN167=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN167);

            pushFollow(FOLLOW_oclExpression_in_whileExp1583);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN168=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN168);

            LCURLY169=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_whileExp1590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY169);

            pushFollow(FOLLOW_oclExpression_in_whileExp1596);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());
            RCURLY170=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_whileExp1598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY170);



            // AST REWRITE
            // elements: condition, WHILE, body
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
            // 334:38: -> ^( WHILE $condition $body)
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:334:41: ^( WHILE $condition $body)
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:337:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF171=null;
        Token ENDIF175=null;
        IoclParser.altExp_return altExp172 = null;

        IoclParser.elifExp_return elifExp173 = null;

        IoclParser.elseExp_return elseExp174 = null;


        Object IF171_tree=null;
        Object ENDIF175_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF171=(Token)match(input,IF,FOLLOW_IF_in_ifExp1621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF171);

            pushFollow(FOLLOW_altExp_in_ifExp1623);
            altExp172=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp172.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:14: ( elifExp )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ELIF) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred69_Iocl()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1626);
            	    elifExp173=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp173.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:25: ( elseExp )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ELSE) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred70_Iocl()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1631);
                    elseExp174=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp174.getTree());

                    }
                    break;

            }

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:36: ( ENDIF )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ENDIF) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred71_Iocl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF175=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF175);


                    }
                    break;

            }



            // AST REWRITE
            // elements: elifExp, IF, altExp, elseExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 338:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:67: ( elseExp )?
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:341:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF176=null;
        IoclParser.altExp_return altExp177 = null;


        Object ELIF176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:342:2: ( ELIF altExp )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:342:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF176=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1661); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1664);
            altExp177=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp177.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:345:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE178=null;
        IoclParser.oclExpression_return oclExpression179 = null;


        Object ELSE178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:346:2: ( ELSE oclExpression )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:346:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE178=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1676); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1679);
            oclExpression179=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression179.getTree());

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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:349:1: altExp : LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN180=null;
        Token RPAREN181=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;


        Object LPAREN180_tree=null;
        Object RPAREN181_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:350:2: ( LPAREN condition= oclExpression RPAREN body= oclExpression -> ^( ALT_EXP $condition $body) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:350:4: LPAREN condition= oclExpression RPAREN body= oclExpression
            {
            LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1692); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN180);

            pushFollow(FOLLOW_oclExpression_in_altExp1698);
            condition=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());
            RPAREN181=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN181);

            pushFollow(FOLLOW_oclExpression_in_altExp1707);
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
            // 350:66: -> ^( ALT_EXP $condition $body)
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:350:69: ^( ALT_EXP $condition $body)
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:353:1: tryExp : TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY182=null;
        Token LCURLY183=null;
        Token RCURLY185=null;
        IoclParser.oclExpression_return oclExpression184 = null;

        IoclParser.except_return except186 = null;


        Object TRY182_tree=null;
        Object LCURLY183_tree=null;
        Object RCURLY185_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:354:2: ( TRY LCURLY ( oclExpression )* RCURLY except -> ^( TRY ( oclExpression )* except ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:354:4: TRY LCURLY ( oclExpression )* RCURLY except
            {
            TRY182=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY182);

            LCURLY183=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1732); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY183);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:354:15: ( oclExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BREAK||(LA45_0>=COMPUTE && LA45_0<=DO)||LA45_0==IF||(LA45_0>=LCURLY && LA45_0<=LPAREN)||(LA45_0>=MINUS && LA45_0<=NOT)||LA45_0==RAISE||LA45_0==RETURN||LA45_0==SELF||(LA45_0>=TRY && LA45_0<=VAR)||LA45_0==WHILE||(LA45_0>=COLLECTION_TYPE_LITERAL && LA45_0<=REAL_LITERAL)||(LA45_0>=IDENTIFIER && LA45_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_tryExp1734);
            	    oclExpression184=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression184.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            RCURLY185=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY185);

            pushFollow(FOLLOW_except_in_tryExp1739);
            except186=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except186.getTree());


            // AST REWRITE
            // elements: oclExpression, except, TRY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 354:44: -> ^( TRY ( oclExpression )* except )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:354:47: ^( TRY ( oclExpression )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:354:53: ( oclExpression )*
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:357:1: except : EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT187=null;
        Token LPAREN188=null;
        Token RPAREN190=null;
        Token LCURLY191=null;
        Token RCURLY193=null;
        IoclParser.type_return type189 = null;

        IoclParser.oclExpression_return oclExpression192 = null;


        Object EXCEPT187_tree=null;
        Object LPAREN188_tree=null;
        Object RPAREN190_tree=null;
        Object LCURLY191_tree=null;
        Object RCURLY193_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:358:2: ( EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY -> ^( EXCEPT type ( oclExpression )* ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:358:4: EXCEPT LPAREN type RPAREN LCURLY ( oclExpression )* RCURLY
            {
            EXCEPT187=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT187);

            LPAREN188=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN188);

            pushFollow(FOLLOW_type_in_except1765);
            type189=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type189.getTree());
            RPAREN190=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN190);

            LCURLY191=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY191);

            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:358:37: ( oclExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==BREAK||(LA46_0>=COMPUTE && LA46_0<=DO)||LA46_0==IF||(LA46_0>=LCURLY && LA46_0<=LPAREN)||(LA46_0>=MINUS && LA46_0<=NOT)||LA46_0==RAISE||LA46_0==RETURN||LA46_0==SELF||(LA46_0>=TRY && LA46_0<=VAR)||LA46_0==WHILE||(LA46_0>=COLLECTION_TYPE_LITERAL && LA46_0<=REAL_LITERAL)||(LA46_0>=IDENTIFIER && LA46_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpression
            	    {
            	    pushFollow(FOLLOW_oclExpression_in_except1771);
            	    oclExpression192=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression192.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            RCURLY193=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY193);



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
            // 358:59: -> ^( EXCEPT type ( oclExpression )* )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:358:62: ^( EXCEPT type ( oclExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:358:76: ( oclExpression )*
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:361:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpression )? RPAREN LCURLY oclExpression RCURLY -> ^( FOR FOR_NAME oclExp iteratorList ( oclExpression )? oclExpression ) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW195=null;
        Token FOR_NAME196=null;
        Token LPAREN197=null;
        Token char_literal199=null;
        Token RPAREN201=null;
        Token LCURLY202=null;
        Token RCURLY204=null;
        IoclParser.oclExp_return oclExp194 = null;

        IoclParser.iteratorList_return iteratorList198 = null;

        IoclParser.oclExpression_return oclExpression200 = null;

        IoclParser.oclExpression_return oclExpression203 = null;


        Object ARROW195_tree=null;
        Object FOR_NAME196_tree=null;
        Object LPAREN197_tree=null;
        Object char_literal199_tree=null;
        Object RPAREN201_tree=null;
        Object LCURLY202_tree=null;
        Object RCURLY204_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpression )? RPAREN LCURLY oclExpression RCURLY -> ^( FOR FOR_NAME oclExp iteratorList ( oclExpression )? oclExpression ) )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' oclExpression )? RPAREN LCURLY oclExpression RCURLY
            {
            pushFollow(FOLLOW_oclExp_in_forExp1797);
            oclExp194=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp194.getTree());
            ARROW195=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW195);

            FOR_NAME196=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME196);

            LPAREN197=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN197);

            pushFollow(FOLLOW_iteratorList_in_forExp1805);
            iteratorList198=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList198.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:46: ( '|' oclExpression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:362:47: '|' oclExpression
                    {
                    char_literal199=(Token)match(input,72,FOLLOW_72_in_forExp1808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(char_literal199);

                    pushFollow(FOLLOW_oclExpression_in_forExp1810);
                    oclExpression200=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression200.getTree());

                    }
                    break;

            }

            RPAREN201=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN201);

            LCURLY202=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forExp1816); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY202);

            pushFollow(FOLLOW_oclExpression_in_forExp1818);
            oclExpression203=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression203.getTree());
            RCURLY204=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forExp1820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY204);



            // AST REWRITE
            // elements: FOR_NAME, iteratorList, oclExp, oclExpression, oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 363:3: -> ^( FOR FOR_NAME oclExp iteratorList ( oclExpression )? oclExpression )
            {
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:363:6: ^( FOR FOR_NAME oclExp iteratorList ( oclExpression )? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:363:41: ( oclExpression )?
                if ( stream_oclExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_oclExpression.nextTree());

                }
                stream_oclExpression.reset();
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
    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:366:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal206=null;
        IoclParser.variableDeclaration_return variableDeclaration205 = null;

        IoclParser.variableDeclaration_return variableDeclaration207 = null;


        Object char_literal206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:367:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:367:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1851);
            variableDeclaration205=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration205.getTree());
            // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:367:24: ( ',' variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==68) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:367:25: ',' variableDeclaration
            	    {
            	    char_literal206=(Token)match(input,68,FOLLOW_68_in_iteratorList1854); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1857);
            	    variableDeclaration207=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration207.getTree());

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
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: ( imperativeExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl377);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred12_Iocl
    public final void synpred12_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:23: ( ( PLUS | MINUS ) multiplicativeExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:23: ( PLUS | MINUS ) multiplicativeExp
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

        pushFollow(FOLLOW_multiplicativeExp_in_synpred12_Iocl492);
        multiplicativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Iocl

    // $ANTLR start synpred17_Iocl
    public final void synpred17_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:4: ( propertyCallExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:4: propertyCallExp
        {
        pushFollow(FOLLOW_propertyCallExp_in_synpred17_Iocl556);
        propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Iocl

    // $ANTLR start synpred18_Iocl
    public final void synpred18_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:4: ( variableExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred18_Iocl572);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Iocl

    // $ANTLR start synpred20_Iocl
    public final void synpred20_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:4: ( type )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:4: type
        {
        pushFollow(FOLLOW_type_in_synpred20_Iocl582);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Iocl

    // $ANTLR start synpred23_Iocl
    public final void synpred23_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:27: ( ',' collectionLiteralParts )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:27: ',' collectionLiteralParts
        {
        match(input,68,FOLLOW_68_in_synpred23_Iocl688); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred23_Iocl691);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Iocl

    // $ANTLR start synpred27_Iocl
    public final void synpred27_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:4: ( modelPropertyCallExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:4: modelPropertyCallExp
        {
        pushFollow(FOLLOW_modelPropertyCallExp_in_synpred27_Iocl801);
        modelPropertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: ( simpleName ( isMarkedPre )? )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: simpleName ( isMarkedPre )?
        {
        pushFollow(FOLLOW_simpleName_in_synpred31_Iocl844);
        simpleName();

        state._fsp--;
        if (state.failed) return ;
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:15: ( isMarkedPre )?
        int alt50=2;
        int LA50_0 = input.LA(1);

        if ( (LA50_0==69) ) {
            alt50=1;
        }
        switch (alt50) {
            case 1 :
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: isMarkedPre
                {
                pushFollow(FOLLOW_isMarkedPre_in_synpred31_Iocl846);
                isMarkedPre();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred34_Iocl
    public final void synpred34_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: ( iteratorExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: iteratorExp
        {
        pushFollow(FOLLOW_iteratorExp_in_synpred34_Iocl901);
        iteratorExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Iocl

    // $ANTLR start synpred35_Iocl
    public final void synpred35_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:41: (v1= variableDeclaration ',' )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:41: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred35_Iocl932);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,68,FOLLOW_68_in_synpred35_Iocl934); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Iocl

    // $ANTLR start synpred36_Iocl
    public final void synpred36_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:40: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:40: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:40: (v1= variableDeclaration ',' )?
        int alt51=2;
        int LA51_0 = input.LA(1);

        if ( (LA51_0==IDENTIFIER) ) {
            int LA51_1 = input.LA(2);

            if ( (synpred35_Iocl()) ) {
                alt51=1;
            }
        }
        switch (alt51) {
            case 1 :
                // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:41: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred36_Iocl932);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,68,FOLLOW_68_in_synpred36_Iocl934); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred36_Iocl942);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,72,FOLLOW_72_in_synpred36_Iocl944); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Iocl

    // $ANTLR start synpred37_Iocl
    public final void synpred37_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:33: (v1= variableDeclaration SEMICOLON )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:33: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred37_Iocl997);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred37_Iocl999); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Iocl

    // $ANTLR start synpred55_Iocl
    public final void synpred55_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:4: ( assignExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred55_Iocl1293);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Iocl

    // $ANTLR start synpred69_Iocl
    public final void synpred69_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:15: ( elifExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred69_Iocl1626);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Iocl

    // $ANTLR start synpred70_Iocl
    public final void synpred70_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:26: ( elseExp )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred70_Iocl1631);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Iocl

    // $ANTLR start synpred71_Iocl
    public final void synpred71_Iocl_fragment() throws RecognitionException {   
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:36: ( ENDIF )
        // /Users/Marcellus/Documents/Msc/Projects/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:338:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred71_Iocl1635); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_Iocl

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
    public final boolean synpred36_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred71_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Iocl_fragment(); // can never throw exception
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\11\7\uffff\12\0\5\uffff";
    static final String DFA1_maxS =
        "\1\74\7\uffff\12\0\5\uffff";
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
            return "105:1: oclExpression : ( imperativeExp | logicalExp );";
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
        "\1\4\40\uffff\1\0\5\uffff";
    static final String DFA5_maxS =
        "\1\110\40\uffff\1\0\5\uffff";
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
            return "()* loopback of 123:22: ( ( PLUS | MINUS ) multiplicativeExp )*";
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
        "\1\37\1\uffff\11\0\1\uffff";
    static final String DFA8_maxS =
        "\1\74\1\uffff\11\0\1\uffff";
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
            return "135:1: dotArrowExp : ( propertyCallExp | oclExp );";
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
        "\1\37\1\uffff\11\0\1\uffff";
    static final String DFA15_maxS =
        "\1\74\1\uffff\11\0\1\uffff";
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
            return "199:1: propertyCallExp : ( modelPropertyCallExp | loopExp );";
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
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\37\11\0\2\uffff";
    static final String DFA21_maxS =
        "\1\74\11\0\2\uffff";
    static final String DFA21_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA21_transitionS = {
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "224:1: loopExp : ( iteratorExp | iterateExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\30\uffff";
    static final String DFA23_eofS =
        "\30\uffff";
    static final String DFA23_minS =
        "\1\11\1\0\26\uffff";
    static final String DFA23_maxS =
        "\1\74\1\0\26\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA23_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA23_transitionS = {
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "230:39: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\27\uffff";
    static final String DFA33_eofS =
        "\27\uffff";
    static final String DFA33_minS =
        "\1\11\10\uffff\11\0\5\uffff";
    static final String DFA33_maxS =
        "\1\74\10\uffff\11\0\5\uffff";
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
            return "277:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp );";
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
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_11 = input.LA(1);

                         
                        int index33_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_12 = input.LA(1);

                         
                        int index33_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_13 = input.LA(1);

                         
                        int index33_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_14 = input.LA(1);

                         
                        int index33_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_15 = input.LA(1);

                         
                        int index33_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_16 = input.LA(1);

                         
                        int index33_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index33_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA33_17 = input.LA(1);

                         
                        int index33_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Iocl()) ) {s = 8;}

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
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp393 = new BitSet(new long[]{0x0008004000000012L});
    public static final BitSet FOLLOW_set_in_logicalExp396 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp409 = new BitSet(new long[]{0x0008004000000012L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp422 = new BitSet(new long[]{0x0000001000200002L});
    public static final BitSet FOLLOW_set_in_equalityExp425 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp434 = new BitSet(new long[]{0x0000001000200002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp447 = new BitSet(new long[]{0x0000000303000002L});
    public static final BitSet FOLLOW_set_in_relationalExp450 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp467 = new BitSet(new long[]{0x0000000303000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp480 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_set_in_additiveExp483 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp492 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp505 = new BitSet(new long[]{0x0000002000010002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp508 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp518 = new BitSet(new long[]{0x0000002000010002L});
    public static final BitSet FOLLOW_set_in_unaryExp531 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp587 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_oclExp589 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp645 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp647 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp649 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_collectionLiteralParts688 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_attributeCallExp832 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_attributeCallExp834 = new BitSet(new long[]{0x0400200000000000L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_isMarkedPre_in_attributeCallExp838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_isMarkedPre_in_attributeCallExp846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_attributeCallExp852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_isMarkedPre863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_navigationCallExp874 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_navigationCallExp876 = new BitSet(new long[]{0x0400200000000000L});
    public static final BitSet FOLLOW_simpleName_in_navigationCallExp878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_navigationCallExp881 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_arguments_in_navigationCallExp883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_navigationCallExp885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_isMarkedPre_in_navigationCallExp889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_iteratorExp918 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iteratorExp920 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp922 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp924 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iteratorExp934 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iteratorExp944 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp948 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_iterateExp984 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iterateExp986 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp988 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp990 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp997 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp999 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterateExp1010 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1012 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1045 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1048 = new BitSet(new long[]{0x1410000000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1050 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1055 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp1084 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp1086 = new BitSet(new long[]{0x1DF5AD0CC400E200L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp1088 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_operationCallExp1105 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_set_in_operationCallExp1107 = new BitSet(new long[]{0x0400200000000000L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp1116 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp1118 = new BitSet(new long[]{0x1DF5AD0CC400E200L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp1121 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_arguments1139 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1183 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1185 = new BitSet(new long[]{0x1410000000000000L});
    public static final BitSet FOLLOW_type_in_collectionType1187 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1232 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1235 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1237 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1332 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_blockExp1334 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1357 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1371 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1373 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1375 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1377 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_computeExp1379 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1381 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_computeExp1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1404 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1418 = new BitSet(new long[]{0x1DF5E50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_returnExp1420 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1443 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1446 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_imperativeVarDeclarations1464 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1481 = new BitSet(new long[]{0x0000000020201002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1484 = new BitSet(new long[]{0x1410000000000000L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1486 = new BitSet(new long[]{0x0000000020200002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1492 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1496 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_imperativeVarDeclaration1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_assignExp1527 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_set_in_assignExp1529 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_assignExp1538 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1552 = new BitSet(new long[]{0x1430000000000000L});
    public static final BitSet FOLLOW_type_in_raiseExp1556 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1560 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1575 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1577 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1583 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1585 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_whileExp1590 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_whileExp1596 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_whileExp1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1621 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1623 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1626 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1631 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1661 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1676 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1692 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1698 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1700 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_altExp1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1730 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1732 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_tryExp1734 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1737 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_except_in_tryExp1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1761 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1763 = new BitSet(new long[]{0x1410000000000000L});
    public static final BitSet FOLLOW_type_in_except1765 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1767 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1769 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_except1771 = new BitSet(new long[]{0x1DF5A70CC400E200L});
    public static final BitSet FOLLOW_RCURLY_in_except1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1797 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1799 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1801 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1803 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1805 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_forExp1808 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1810 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1814 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LCURLY_in_forExp1816 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1818 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_forExp1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iteratorList1854 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred12_Iocl483 = new BitSet(new long[]{0x1DF0200C80000000L});
    public static final BitSet FOLLOW_multiplicativeExp_in_synpred12_Iocl492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred17_Iocl556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred18_Iocl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred20_Iocl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred23_Iocl688 = new BitSet(new long[]{0x1DF5A50CC400E200L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred23_Iocl691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_synpred27_Iocl801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_synpred31_Iocl844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_isMarkedPre_in_synpred31_Iocl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_synpred34_Iocl901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred35_Iocl932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_synpred35_Iocl934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred36_Iocl932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_synpred36_Iocl934 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred36_Iocl942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_synpred36_Iocl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred37_Iocl997 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred37_Iocl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred55_Iocl1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred69_Iocl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred70_Iocl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred71_Iocl1635 = new BitSet(new long[]{0x0000000000000002L});

}