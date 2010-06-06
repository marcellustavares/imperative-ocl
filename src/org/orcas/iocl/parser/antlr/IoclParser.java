// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-06-06 17:59:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ALT_EXP", "APPEND", "ARROW", "BREAK", "COLLECTION_LITERAL", "COLLECTION_LITERAL_PARTS", "COLLECTION_TYPE", "COLON", "CONTINUE", "DO", "DIV", "DOT", "ELIF", "ELSE", "EQUAL", "EXCEPT", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "ITERATOR_NAME", "IDENTIFIER", "PRIMITIVE_TYPE_LITERAL", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=55;
    public static final int APPEND=6;
    public static final int EXPONENT=58;
    public static final int LT=29;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int WHILE=47;
    public static final int PRIMITIVE_TYPE_LITERAL=57;
    public static final int GTE=22;
    public static final int OCTAL_ESC=63;
    public static final int COLLECTION_LITERAL_PARTS=10;
    public static final int DO=14;
    public static final int NOT=32;
    public static final int AND=4;
    public static final int EXCEPT=20;
    public static final int EOF=-1;
    public static final int LTE=30;
    public static final int BREAK=8;
    public static final int LPAREN=28;
    public static final int IF=23;
    public static final int RPAREN=40;
    public static final int ESC_SEQ=59;
    public static final int STRING_LITERAL=51;
    public static final int REAL_LITERAL=54;
    public static final int SCOPE=41;
    public static final int COLLECTION_TYPE_LITERAL=50;
    public static final int CONTINUE=13;
    public static final int NOT_EQUAL=33;
    public static final int IS=26;
    public static final int IDENTIFIER=56;
    public static final int ITERATOR=25;
    public static final int EQUAL=19;
    public static final int RETURN=39;
    public static final int PLUS=36;
    public static final int VAR=45;
    public static final int RAISE=37;
    public static final int DOT=16;
    public static final int COLLECTION_LITERAL=9;
    public static final int XOR=48;
    public static final int COLLECTION_TYPE=11;
    public static final int UNICODE_ESC=62;
    public static final int NUMERIC_OPERATION=49;
    public static final int ELSE=18;
    public static final int HEX_DIGIT=61;
    public static final int LCURLY=27;
    public static final int SEMICOLON=43;
    public static final int MINUS=31;
    public static final int MULT=34;
    public static final int TRY=44;
    public static final int BOOLEAN_LITERAL=52;
    public static final int COLON=12;
    public static final int ALT_EXP=5;
    public static final int ELIF=17;
    public static final int ITERATE=24;
    public static final int WS=60;
    public static final int VARIABLE=46;
    public static final int INTEGER_LITERAL=53;
    public static final int OR=35;
    public static final int RCURLY=38;
    public static final int ARROW=7;
    public static final int GT=21;
    public static final int DIV=15;
    public static final int SELF=42;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[109+1];
             
             
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:82:1: oclExpressionCS : ( logicalExpCS | imperativeExp );
    public final IoclParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IoclParser.oclExpressionCS_return retval = new IoclParser.oclExpressionCS_return();
        retval.start = input.LT(1);
        int oclExpressionCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.logicalExpCS_return logicalExpCS1 = null;

        IoclParser.imperativeExp_return imperativeExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:83:2: ( logicalExpCS | imperativeExp )
            int alt1=2;
            switch ( input.LA(1) ) {
            case LPAREN:
            case MINUS:
            case NOT:
            case NUMERIC_OPERATION:
            case COLLECTION_TYPE_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt1=1;
                }
                break;
            case PRIMITIVE_TYPE_LITERAL:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==AND||LA1_2==ARROW||(LA1_2>=DIV && LA1_2<=DOT)||LA1_2==EQUAL||(LA1_2>=GT && LA1_2<=GTE)||(LA1_2>=LT && LA1_2<=MINUS)||(LA1_2>=NOT_EQUAL && LA1_2<=PLUS)||LA1_2==RCURLY||LA1_2==RPAREN||LA1_2==SEMICOLON||LA1_2==XOR||(LA1_2>=64 && LA1_2<=65)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==APPEND||LA1_2==IS) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case SELF:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==APPEND||LA1_3==IS) ) {
                    alt1=2;
                }
                else if ( (LA1_3==EOF||LA1_3==AND||LA1_3==ARROW||(LA1_3>=DIV && LA1_3<=DOT)||LA1_3==EQUAL||(LA1_3>=GT && LA1_3<=GTE)||(LA1_3>=LT && LA1_3<=MINUS)||(LA1_3>=NOT_EQUAL && LA1_3<=PLUS)||LA1_3==RCURLY||LA1_3==RPAREN||LA1_3==SEMICOLON||LA1_3==XOR||(LA1_3>=64 && LA1_3<=65)) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==APPEND||LA1_4==IS) ) {
                    alt1=2;
                }
                else if ( (LA1_4==EOF||LA1_4==AND||LA1_4==ARROW||(LA1_4>=DIV && LA1_4<=DOT)||LA1_4==EQUAL||(LA1_4>=GT && LA1_4<=GTE)||(LA1_4>=LT && LA1_4<=MINUS)||(LA1_4>=NOT_EQUAL && LA1_4<=PLUS)||LA1_4==RCURLY||LA1_4==RPAREN||LA1_4==SEMICOLON||LA1_4==XOR||(LA1_4>=64 && LA1_4<=65)) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case BREAK:
            case CONTINUE:
            case DO:
            case IF:
            case RAISE:
            case RETURN:
            case TRY:
            case VAR:
            case WHILE:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:83:4: logicalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExpCS_in_oclExpressionCS344);
                    logicalExpCS1=logicalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpCS1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpressionCS349);
                    imperativeExp2=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp2.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:87:1: logicalExpCS : equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:2: ( equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:4: equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS360);
            equalityExpCS3=equalityExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:18: ( ( AND | OR | XOR ) equalityExpCS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:19: ( AND | OR | XOR ) equalityExpCS
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

            	    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS376);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:91:1: equalityExpCS : relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:2: ( relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:4: relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS389);
            relationalExpCS6=relationalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:20: ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:21: ( EQUAL | NOT_EQUAL ) relationalExpCS
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

            	    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS401);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:95:1: relationalExpCS : additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:2: ( additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:4: additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS414);
            additiveExpCS9=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:18: ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:19: ( LT | LTE | GT | GTE ) additiveExpCS
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

            	    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS434);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:99:1: additiveExpCS : multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:2: ( multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:4: multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS447);
            multiplicativeExpCS12=multiplicativeExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:24: ( ( PLUS | MINUS ) multiplicativeExpCS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:25: ( PLUS | MINUS ) multiplicativeExpCS
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

            	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS459);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:103:1: multiplicativeExpCS : unaryExpCS ( ( MULT | DIV ) unaryExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:104:2: ( unaryExpCS ( ( MULT | DIV ) unaryExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:104:4: unaryExpCS ( ( MULT | DIV ) unaryExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS472);
            unaryExpCS15=unaryExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:104:15: ( ( MULT | DIV ) unaryExpCS )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:104:16: ( MULT | DIV ) unaryExpCS
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

            	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS485);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:1: unaryExpCS : ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:108:2: ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=MINUS && LA7_0<=NOT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN||LA7_0==SELF||(LA7_0>=NUMERIC_OPERATION && LA7_0<=REAL_LITERAL)||(LA7_0>=IDENTIFIER && LA7_0<=PRIMITIVE_TYPE_LITERAL)) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:108:4: ( MINUS | NOT ) unaryExpCS
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

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS507);
                    unaryExpCS19=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:109:4: dotArrowExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS512);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:2: ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:4: NUMERIC_OPERATION '(' ( argumentsCS )? ')'
                    {
                    NUMERIC_OPERATION21=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION21);

                    char_literal22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dotArrowExpCS525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal22);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:26: ( argumentsCS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BREAK||(LA8_0>=CONTINUE && LA8_0<=DO)||LA8_0==IF||LA8_0==LPAREN||(LA8_0>=MINUS && LA8_0<=NOT)||LA8_0==RAISE||LA8_0==RETURN||LA8_0==SELF||(LA8_0>=TRY && LA8_0<=VAR)||LA8_0==WHILE||(LA8_0>=NUMERIC_OPERATION && LA8_0<=REAL_LITERAL)||(LA8_0>=IDENTIFIER && LA8_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS527);
                            argumentsCS23=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentsCS.add(argumentsCS23.getTree());

                            }
                            break;

                    }

                    char_literal24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dotArrowExpCS530); if (state.failed) return retval; 
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
                    // 113:43: -> ^( NUMERIC_OPERATION ( argumentsCS )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:46: ^( NUMERIC_OPERATION ( argumentsCS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:66: ( argumentsCS )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:4: propertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS544);
                    propertyCallExp25=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp25.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:4: oclExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS549);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:118:1: oclExpCS : ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:2: ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS )
            int alt10=3;
            switch ( input.LA(1) ) {
            case SELF:
            case IDENTIFIER:
            case PRIMITIVE_TYPE_LITERAL:
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExpCS560);
                    variableExp27=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp27.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:120:4: literalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExpCS_in_oclExpCS565);
                    literalExpCS28=literalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExpCS28.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:121:4: '(' oclExpressionCS ')'
                    {
                    char_literal29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExpCS570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal29);

                    pushFollow(FOLLOW_oclExpressionCS_in_oclExpCS572);
                    oclExpressionCS30=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS30.getTree());
                    char_literal31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExpCS574); if (state.failed) return retval; 
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
                    // 121:28: -> oclExpressionCS
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:124:1: variableExp : simpleNameCS ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleNameCS_return simpleNameCS32 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:125:2: ( simpleNameCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:125:4: simpleNameCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleNameCS_in_variableExp592);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:1: literalExpCS : ( collectionLiteralExpCS | primitiveLiteralExpCS );
    public final IoclParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IoclParser.literalExpCS_return retval = new IoclParser.literalExpCS_return();
        retval.start = input.LT(1);
        int literalExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS33 = null;

        IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS34 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:129:2: ( collectionLiteralExpCS | primitiveLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:129:4: collectionLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS603);
                    collectionLiteralExpCS33=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExpCS33.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:130:4: primitiveLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS609);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:133:1: collectionLiteralExpCS : collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:2: ( collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:4: collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS620);
            collectionTypeIdentifierCS35=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS35.getTree());
            char_literal36=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExpCS622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal36);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:35: ( collectionLiteralPartsCS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BREAK||(LA12_0>=CONTINUE && LA12_0<=DO)||LA12_0==IF||LA12_0==LPAREN||(LA12_0>=MINUS && LA12_0<=NOT)||LA12_0==RAISE||LA12_0==RETURN||LA12_0==SELF||(LA12_0>=TRY && LA12_0<=VAR)||LA12_0==WHILE||(LA12_0>=NUMERIC_OPERATION && LA12_0<=REAL_LITERAL)||(LA12_0>=IDENTIFIER && LA12_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS624);
                    collectionLiteralPartsCS37=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralPartsCS.add(collectionLiteralPartsCS37.getTree());

                    }
                    break;

            }

            char_literal38=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExpCS627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal38);



            // AST REWRITE
            // elements: collectionTypeIdentifierCS, collectionLiteralPartsCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:65: -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:68: ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifierCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:116: ( collectionLiteralPartsCS )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:137:1: collectionTypeIdentifierCS : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IoclParser.collectionTypeIdentifierCS_return retval = new IoclParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifierCS_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL39=null;

        Object COLLECTION_TYPE_LITERAL39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:138:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:138:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL39=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS649); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:1: collectionLiteralPartsCS : collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) ;
    public final IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IoclParser.collectionLiteralPartsCS_return retval = new IoclParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal41=null;
        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS40 = null;

        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS42 = null;


        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_collectionLiteralPartCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:2: ( collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:4: collectionLiteralPartCS ( ',' collectionLiteralPartCS )*
            {
            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS660);
            collectionLiteralPartCS40=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(collectionLiteralPartCS40.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:28: ( ',' collectionLiteralPartCS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==64) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:29: ',' collectionLiteralPartCS
            	    {
            	    char_literal41=(Token)match(input,64,FOLLOW_64_in_collectionLiteralPartsCS663); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_64.add(char_literal41);

            	    pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS665);
            	    collectionLiteralPartCS42=collectionLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(collectionLiteralPartCS42.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: collectionLiteralPartCS, collectionLiteralPartCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:59: -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:62: ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL_PARTS, "COLLECTION_LITERAL_PARTS"), root_1);

                adaptor.addChild(root_1, stream_collectionLiteralPartCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:142:113: ( collectionLiteralPartCS )*
                while ( stream_collectionLiteralPartCS.hasNext() ) {
                    adaptor.addChild(root_1, stream_collectionLiteralPartCS.nextTree());

                }
                stream_collectionLiteralPartCS.reset();

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:145:1: collectionLiteralPartCS : oclExpressionCS ;
    public final IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IoclParser.collectionLiteralPartCS_return retval = new IoclParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS43 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:146:2: ( oclExpressionCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:146:4: oclExpressionCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS689);
            oclExpressionCS43=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS43.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:1: primitiveLiteralExpCS : ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS );
    public final IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IoclParser.primitiveLiteralExpCS_return retval = new IoclParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);
        int primitiveLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExpCS_return numericLiteralExpCS44 = null;

        IoclParser.stringLiteralExpCS_return stringLiteralExpCS45 = null;

        IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:150:2: ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:150:4: numericLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS700);
                    numericLiteralExpCS44=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExpCS44.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:151:4: stringLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS705);
                    stringLiteralExpCS45=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExpCS45.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:152:4: booleanLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS710);
                    booleanLiteralExpCS46=booleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExpCS46.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:155:1: numericLiteralExpCS : ( integerLiteralExpCS | realLiteralExpCS );
    public final IoclParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IoclParser.numericLiteralExpCS_return retval = new IoclParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);
        int numericLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExpCS_return integerLiteralExpCS47 = null;

        IoclParser.realLiteralExpCS_return realLiteralExpCS48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:156:2: ( integerLiteralExpCS | realLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:156:4: integerLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS721);
                    integerLiteralExpCS47=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExpCS47.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:157:4: realLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS726);
                    realLiteralExpCS48=realLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExpCS48.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:160:1: stringLiteralExpCS : STRING_LITERAL ;
    public final IoclParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IoclParser.stringLiteralExpCS_return retval = new IoclParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);
        int stringLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL49=null;

        Object STRING_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL49=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL49_tree = (Object)adaptor.create(STRING_LITERAL49);
            adaptor.addChild(root_0, STRING_LITERAL49_tree);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:164:1: booleanLiteralExpCS : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IoclParser.booleanLiteralExpCS_return retval = new IoclParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);
        int booleanLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL50=null;

        Object BOOLEAN_LITERAL50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:165:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL50=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS752); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL50_tree = (Object)adaptor.create(BOOLEAN_LITERAL50);
            adaptor.addChild(root_0, BOOLEAN_LITERAL50_tree);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:168:1: integerLiteralExpCS : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IoclParser.integerLiteralExpCS_return retval = new IoclParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);
        int integerLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL51=null;

        Object INTEGER_LITERAL51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:169:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:169:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL51=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS763); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL51_tree = (Object)adaptor.create(INTEGER_LITERAL51);
            adaptor.addChild(root_0, INTEGER_LITERAL51_tree);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:172:1: realLiteralExpCS : REAL_LITERAL ;
    public final IoclParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IoclParser.realLiteralExpCS_return retval = new IoclParser.realLiteralExpCS_return();
        retval.start = input.LT(1);
        int realLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL52=null;

        Object REAL_LITERAL52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:173:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:173:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL52=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS775); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL52_tree = (Object)adaptor.create(REAL_LITERAL52);
            adaptor.addChild(root_0, REAL_LITERAL52_tree);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:1: propertyCallExp : ( modelPropertyCallExp | loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp53 = null;

        IoclParser.loopExp_return loopExp54 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:177:2: ( modelPropertyCallExp | loopExp )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:177:4: modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp786);
                    modelPropertyCallExp53=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp53.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:178:4: loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopExp_in_propertyCallExp791);
                    loopExp54=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp54.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:181:1: modelPropertyCallExp : operationCallExpCS ;
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExpCS_return operationCallExpCS55 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:182:2: ( operationCallExpCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:182:4: operationCallExpCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp802);
            operationCallExpCS55=operationCallExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExpCS55.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:185:1: loopExp : ( iteratorExpCS | iterateExpCS );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExpCS_return iteratorExpCS56 = null;

        IoclParser.iterateExpCS_return iterateExpCS57 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:186:2: ( iteratorExpCS | iterateExpCS )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:186:4: iteratorExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExpCS_in_loopExp813);
                    iteratorExpCS56=iteratorExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExpCS56.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:187:4: iterateExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExpCS_in_loopExp818);
                    iterateExpCS57=iterateExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExpCS57.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:190:1: iteratorExpCS : oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) ;
    public final IoclParser.iteratorExpCS_return iteratorExpCS() throws RecognitionException {
        IoclParser.iteratorExpCS_return retval = new IoclParser.iteratorExpCS_return();
        retval.start = input.LT(1);
        int iteratorExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW59=null;
        Token ITERATOR_NAME60=null;
        Token LPAREN61=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token RPAREN65=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpCS_return oclExpCS58 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS64 = null;


        Object ARROW59_tree=null;
        Object ITERATOR_NAME60_tree=null;
        Object LPAREN61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal63_tree=null;
        Object RPAREN65_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:2: ( oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:5: oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iteratorExpCS830);
            oclExpCS58=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS58.getTree());
            ARROW59=(Token)match(input,ARROW,FOLLOW_ARROW_in_iteratorExpCS832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW59);

            ITERATOR_NAME60=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExpCS834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME60);

            LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExpCS836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN61);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:42: (v1= variableDeclaration ',' )?
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
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:43: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS844);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal62=(Token)match(input,64,FOLLOW_64_in_iteratorExpCS846); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_64.add(char_literal62);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS854);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal63=(Token)match(input,65,FOLLOW_65_in_iteratorExpCS856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal63);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpressionCS_in_iteratorExpCS860);
            oclExpressionCS64=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS64.getTree());
            RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExpCS862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN65);



            // AST REWRITE
            // elements: ITERATOR_NAME, v1, v2, oclExpressionCS, oclExpCS
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
            // 191:128: -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:131: ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:165: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:170: ( $v2)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:194:1: iterateExpCS : oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) ;
    public final IoclParser.iterateExpCS_return iterateExpCS() throws RecognitionException {
        IoclParser.iterateExpCS_return retval = new IoclParser.iterateExpCS_return();
        retval.start = input.LT(1);
        int iterateExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW67=null;
        Token ITERATE68=null;
        Token LPAREN69=null;
        Token SEMICOLON70=null;
        Token char_literal71=null;
        Token RPAREN73=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpCS_return oclExpCS66 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS72 = null;


        Object ARROW67_tree=null;
        Object ITERATE68_tree=null;
        Object LPAREN69_tree=null;
        Object SEMICOLON70_tree=null;
        Object char_literal71_tree=null;
        Object RPAREN73_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:2: ( oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:4: oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iterateExpCS893);
            oclExpCS66=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS66.getTree());
            ARROW67=(Token)match(input,ARROW,FOLLOW_ARROW_in_iterateExpCS895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW67);

            ITERATE68=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExpCS897); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE68);

            LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpCS899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:34: (v1= variableDeclaration SEMICOLON )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:35: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS906);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExpCS908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON70);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS916);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal71=(Token)match(input,65,FOLLOW_65_in_iterateExpCS919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal71);

            pushFollow(FOLLOW_oclExpressionCS_in_iterateExpCS921);
            oclExpressionCS72=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS72.getTree());
            RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpCS923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);



            // AST REWRITE
            // elements: ITERATE, oclExpCS, v2, oclExpressionCS, v1
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
            // 195:125: -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:128: ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:147: ( $v1)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:198:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        IoclParser.type_return type76 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS78 = null;


        Object IDENTIFIER74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:4: IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )?
            {
            IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER74);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:15: ( ':' type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==COLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:16: ':' type
                    {
                    char_literal75=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal75);

                    pushFollow(FOLLOW_type_in_variableDeclaration956);
                    type76=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type76.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:27: ( '=' oclExpressionCS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:28: '=' oclExpressionCS
                    {
                    char_literal77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal77);

                    pushFollow(FOLLOW_oclExpressionCS_in_variableDeclaration963);
                    oclExpressionCS78=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS78.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: oclExpressionCS, type, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 199:50: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:53: ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:75: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:81: ( oclExpressionCS )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:202:1: operationCallExpCS : oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' ;
    public final IoclParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IoclParser.operationCallExpCS_return retval = new IoclParser.operationCallExpCS_return();
        retval.start = input.LT(1);
        int operationCallExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set80=null;
        Token char_literal82=null;
        Token char_literal84=null;
        IoclParser.oclExpCS_return oclExpCS79 = null;

        IoclParser.simpleNameCS_return simpleNameCS81 = null;

        IoclParser.argumentsCS_return argumentsCS83 = null;


        Object set80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:203:2: ( oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:203:4: oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpCS_in_operationCallExpCS990);
            oclExpCS79=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpCS79.getTree());
            set80=(Token)input.LT(1);
            set80=(Token)input.LT(1);
            if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set80), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_simpleNameCS_in_operationCallExpCS1001);
            simpleNameCS81=simpleNameCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleNameCS81.getTree());
            char_literal82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExpCS1003); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:203:46: ( argumentsCS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BREAK||(LA23_0>=CONTINUE && LA23_0<=DO)||LA23_0==IF||LA23_0==LPAREN||(LA23_0>=MINUS && LA23_0<=NOT)||LA23_0==RAISE||LA23_0==RETURN||LA23_0==SELF||(LA23_0>=TRY && LA23_0<=VAR)||LA23_0==WHILE||(LA23_0>=NUMERIC_OPERATION && LA23_0<=REAL_LITERAL)||(LA23_0>=IDENTIFIER && LA23_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS1006);
                    argumentsCS83=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsCS83.getTree());

                    }
                    break;

            }

            char_literal84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExpCS1009); if (state.failed) return retval;

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:1: argumentsCS : oclExpressionCS ( ',' oclExpressionCS )* ;
    public final IoclParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IoclParser.argumentsCS_return retval = new IoclParser.argumentsCS_return();
        retval.start = input.LT(1);
        int argumentsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal86=null;
        IoclParser.oclExpressionCS_return oclExpressionCS85 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS87 = null;


        Object char_literal86_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:2: ( oclExpressionCS ( ',' oclExpressionCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:4: oclExpressionCS ( ',' oclExpressionCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1021);
            oclExpressionCS85=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS85.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:20: ( ',' oclExpressionCS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==64) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:21: ',' oclExpressionCS
            	    {
            	    char_literal86=(Token)match(input,64,FOLLOW_64_in_argumentsCS1024); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1027);
            	    oclExpressionCS87=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS87.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:210:1: simpleNameCS : ( primitiveType | SELF | IDENTIFIER );
    public final IoclParser.simpleNameCS_return simpleNameCS() throws RecognitionException {
        IoclParser.simpleNameCS_return retval = new IoclParser.simpleNameCS_return();
        retval.start = input.LT(1);
        int simpleNameCS_StartIndex = input.index();
        Object root_0 = null;

        Token SELF89=null;
        Token IDENTIFIER90=null;
        IoclParser.primitiveType_return primitiveType88 = null;


        Object SELF89_tree=null;
        Object IDENTIFIER90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:2: ( primitiveType | SELF | IDENTIFIER )
            int alt25=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt25=1;
                }
                break;
            case SELF:
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_simpleNameCS1040);
                    primitiveType88=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType88.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: SELF
                    {
                    root_0 = (Object)adaptor.nil();

                    SELF89=(Token)match(input,SELF,FOLLOW_SELF_in_simpleNameCS1045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SELF89_tree = (Object)adaptor.create(SELF89);
                    adaptor.addChild(root_0, SELF89_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS1050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER90_tree = (Object)adaptor.create(IDENTIFIER90);
                    adaptor.addChild(root_0, IDENTIFIER90_tree);
                    }

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:216:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL91=null;

        Object PRIMITIVE_TYPE_LITERAL91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:217:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:217:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL91=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1061); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL91_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL91);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL91_tree);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:1: collectionType : collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN93=null;
        Token RPAREN95=null;
        IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS92 = null;

        IoclParser.type_return type94 = null;


        Object LPAREN93_tree=null;
        Object RPAREN95_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifierCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifierCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:2: ( collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:4: collectionTypeIdentifierCS LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionType1072);
            collectionTypeIdentifierCS92=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS92.getTree());
            LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

            pushFollow(FOLLOW_type_in_collectionType1076);
            type94=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type94.getTree());
            RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);



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
            // 221:50: -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:221:53: ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType96 = null;

        IoclParser.collectionType_return collectionType97 = null;

        IoclParser.pathName_return pathName98 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:2: ( primitiveType | collectionType | pathName )
            int alt26=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt26=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt26=2;
                }
                break;
            case IDENTIFIER:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1100);
                    primitiveType96=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType96.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1105);
                    collectionType97=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType97.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:227:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1110);
                    pathName98=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName98.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER99=null;
        Token SCOPE100=null;
        Token IDENTIFIER101=null;

        Object IDENTIFIER99_tree=null;
        Object SCOPE100_tree=null;
        Object IDENTIFIER101_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER99=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER99);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:15: ( SCOPE IDENTIFIER )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==SCOPE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE100=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1124); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE100);

            	    IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1126); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER101);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: SCOPE, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:35: -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:38: ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:231:57: ( IDENTIFIER )*
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:236:1: imperativeExp : ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp102 = null;

        IoclParser.breakExp_return breakExp103 = null;

        IoclParser.continueExp_return continueExp104 = null;

        IoclParser.returnExp_return returnExp105 = null;

        IoclParser.variableInitExp_return variableInitExp106 = null;

        IoclParser.assignExp_return assignExp107 = null;

        IoclParser.raiseExp_return raiseExp108 = null;

        IoclParser.whileExp_return whileExp109 = null;

        IoclParser.ifExp_return ifExp110 = null;

        IoclParser.tryExp_return tryExp111 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:237:2: ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp )
            int alt28=10;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:237:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1152);
                    blockExp102=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp102.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1157);
                    breakExp103=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp103.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1162);
                    continueExp104=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp104.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1167);
                    returnExp105=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp105.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:241:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1172);
                    variableInitExp106=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp106.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1177);
                    assignExp107=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp107.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1182);
                    raiseExp108=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp108.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:244:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1187);
                    whileExp109=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp109.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:245:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1192);
                    ifExp110=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp110.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:246:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1197);
                    tryExp111=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp111.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:249:1: blockExp : DO LCURLY bodyExp RCURLY -> ^( DO bodyExp ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO112=null;
        Token LCURLY113=null;
        Token RCURLY115=null;
        IoclParser.bodyExp_return bodyExp114 = null;


        Object DO112_tree=null;
        Object LCURLY113_tree=null;
        Object RCURLY115_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_bodyExp=new RewriteRuleSubtreeStream(adaptor,"rule bodyExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:250:2: ( DO LCURLY bodyExp RCURLY -> ^( DO bodyExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:250:4: DO LCURLY bodyExp RCURLY
            {
            DO112=(Token)match(input,DO,FOLLOW_DO_in_blockExp1208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO112);

            LCURLY113=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY113);

            pushFollow(FOLLOW_bodyExp_in_blockExp1212);
            bodyExp114=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(bodyExp114.getTree());
            RCURLY115=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY115);



            // AST REWRITE
            // elements: DO, bodyExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 250:29: -> ^( DO bodyExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:250:32: ^( DO bodyExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                adaptor.addChild(root_1, stream_bodyExp.nextTree());

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

    public static class bodyExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bodyExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:253:1: bodyExp : ( imperativeExp )* -> ( imperativeExp )* ;
    public final IoclParser.bodyExp_return bodyExp() throws RecognitionException {
        IoclParser.bodyExp_return retval = new IoclParser.bodyExp_return();
        retval.start = input.LT(1);
        int bodyExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp116 = null;


        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:2: ( ( imperativeExp )* -> ( imperativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:4: ( imperativeExp )*
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:4: ( imperativeExp )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BREAK||(LA29_0>=CONTINUE && LA29_0<=DO)||LA29_0==IF||LA29_0==RAISE||LA29_0==RETURN||LA29_0==SELF||(LA29_0>=TRY && LA29_0<=VAR)||LA29_0==WHILE||(LA29_0>=IDENTIFIER && LA29_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_bodyExp1233);
            	    imperativeExp116=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp116.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



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
            // 254:19: -> ( imperativeExp )*
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:22: ( imperativeExp )*
                while ( stream_imperativeExp.hasNext() ) {
                    adaptor.addChild(root_0, stream_imperativeExp.nextTree());

                }
                stream_imperativeExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 37, bodyExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bodyExp"

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

        Token BREAK117=null;
        Token SEMICOLON118=null;

        Object BREAK117_tree=null;
        Object SEMICOLON118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK117=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1250); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK117_tree = (Object)adaptor.create(BREAK117);
            adaptor.addChild(root_0, BREAK117_tree);
            }
            SEMICOLON118=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1252); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 38, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE119=null;
        Token SEMICOLON120=null;

        Object CONTINUE119_tree=null;
        Object SEMICOLON120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE119=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE119_tree = (Object)adaptor.create(CONTINUE119);
            adaptor.addChild(root_0, CONTINUE119_tree);
            }
            SEMICOLON120=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1266); if (state.failed) return retval;

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:265:1: returnExp : RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN121=null;
        Token SEMICOLON123=null;
        IoclParser.oclExpressionCS_return oclExpressionCS122 = null;


        Object RETURN121_tree=null;
        Object SEMICOLON123_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:2: ( RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:4: RETURN ( oclExpressionCS )? SEMICOLON
            {
            RETURN121=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN121);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:11: ( oclExpressionCS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BREAK||(LA30_0>=CONTINUE && LA30_0<=DO)||LA30_0==IF||LA30_0==LPAREN||(LA30_0>=MINUS && LA30_0<=NOT)||LA30_0==RAISE||LA30_0==RETURN||LA30_0==SELF||(LA30_0>=TRY && LA30_0<=VAR)||LA30_0==WHILE||(LA30_0>=NUMERIC_OPERATION && LA30_0<=REAL_LITERAL)||(LA30_0>=IDENTIFIER && LA30_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
                    {
                    pushFollow(FOLLOW_oclExpressionCS_in_returnExp1280);
                    oclExpressionCS122=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS122.getTree());

                    }
                    break;

            }

            SEMICOLON123=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON123);



            // AST REWRITE
            // elements: oclExpressionCS, RETURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:38: -> ^( RETURN ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:41: ^( RETURN ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:50: ( oclExpressionCS )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:269:1: variableInitExp : VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON -> ^( VAR IDENTIFIER ( type )? oclExpressionCS ) ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR124=null;
        Token IDENTIFIER125=null;
        Token COLON126=null;
        Token IS128=null;
        Token SEMICOLON130=null;
        IoclParser.type_return type127 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS129 = null;


        Object VAR124_tree=null;
        Object IDENTIFIER125_tree=null;
        Object COLON126_tree=null;
        Object IS128_tree=null;
        Object SEMICOLON130_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:2: ( VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON -> ^( VAR IDENTIFIER ( type )? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:4: VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON
            {
            VAR124=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1303); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR124);

            IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableInitExp1305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER125);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:19: ( COLON type )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COLON) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:20: COLON type
                    {
                    COLON126=(Token)match(input,COLON,FOLLOW_COLON_in_variableInitExp1308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON126);

                    pushFollow(FOLLOW_type_in_variableInitExp1310);
                    type127=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type127.getTree());

                    }
                    break;

            }

            IS128=(Token)match(input,IS,FOLLOW_IS_in_variableInitExp1314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IS.add(IS128);

            pushFollow(FOLLOW_oclExpressionCS_in_variableInitExp1316);
            oclExpressionCS129=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS129.getTree());
            SEMICOLON130=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON130);



            // AST REWRITE
            // elements: oclExpressionCS, type, VAR, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:62: -> ^( VAR IDENTIFIER ( type )? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:65: ^( VAR IDENTIFIER ( type )? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:82: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:273:1: assignExp : variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:2: ( variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:4: variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableExp_in_assignExp1342);
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

            pushFollow(FOLLOW_oclExpressionCS_in_assignExp1353);
            oclExpressionCS133=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS133.getTree());
            SEMICOLON134=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1355); if (state.failed) return retval;

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:277:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE135=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE135_tree = (Object)adaptor.create(RAISE135);
            root_0 = (Object)adaptor.becomeRoot(RAISE135_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:11: ( type | STRING_LITERAL )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1371);
                    type136=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type136.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:278:19: STRING_LITERAL
                    {
                    STRING_LITERAL137=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL137_tree = (Object)adaptor.create(STRING_LITERAL137);
                    adaptor.addChild(root_0, STRING_LITERAL137_tree);
                    }

                    }
                    break;

            }

            SEMICOLON138=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1378); if (state.failed) return retval;

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:281:1: whileExp : WHILE LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY -> ^( WHILE oclExpressionCS bodyExp ) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE139=null;
        Token LPAREN140=null;
        Token RPAREN142=null;
        Token LCURLY143=null;
        Token RCURLY145=null;
        IoclParser.oclExpressionCS_return oclExpressionCS141 = null;

        IoclParser.bodyExp_return bodyExp144 = null;


        Object WHILE139_tree=null;
        Object LPAREN140_tree=null;
        Object RPAREN142_tree=null;
        Object LCURLY143_tree=null;
        Object RCURLY145_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_bodyExp=new RewriteRuleSubtreeStream(adaptor,"rule bodyExp");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:2: ( WHILE LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY -> ^( WHILE oclExpressionCS bodyExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:282:4: WHILE LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY
            {
            WHILE139=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE139);

            LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1392); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN140);

            pushFollow(FOLLOW_oclExpressionCS_in_whileExp1394);
            oclExpressionCS141=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS141.getTree());
            RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN142);

            LCURLY143=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_whileExp1401); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY143);

            pushFollow(FOLLOW_bodyExp_in_whileExp1403);
            bodyExp144=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(bodyExp144.getTree());
            RCURLY145=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_whileExp1405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY145);



            // AST REWRITE
            // elements: oclExpressionCS, WHILE, bodyExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:25: -> ^( WHILE oclExpressionCS bodyExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:28: ^( WHILE oclExpressionCS bodyExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());
                adaptor.addChild(root_1, stream_bodyExp.nextTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:286:1: ifExp : IF altExp ( elifExp )* ( elseExp )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF146=null;
        IoclParser.altExp_return altExp147 = null;

        IoclParser.elifExp_return elifExp148 = null;

        IoclParser.elseExp_return elseExp149 = null;


        Object IF146_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:2: ( IF altExp ( elifExp )* ( elseExp )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:4: IF altExp ( elifExp )* ( elseExp )?
            {
            IF146=(Token)match(input,IF,FOLLOW_IF_in_ifExp1426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF146);

            pushFollow(FOLLOW_altExp_in_ifExp1428);
            altExp147=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp147.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:14: ( elifExp )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELIF) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1431);
            	    elifExp148=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp148.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:25: ( elseExp )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1436);
                    elseExp149=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp149.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: IF, altExp, elifExp, elseExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 287:36: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:39: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:51: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:60: ( elseExp )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:290:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF150=null;
        IoclParser.altExp_return altExp151 = null;


        Object ELIF150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF150=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1463); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1466);
            altExp151=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp151.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:294:1: elseExp : ELSE LCURLY bodyExp RCURLY -> bodyExp ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE152=null;
        Token LCURLY153=null;
        Token RCURLY155=null;
        IoclParser.bodyExp_return bodyExp154 = null;


        Object ELSE152_tree=null;
        Object LCURLY153_tree=null;
        Object RCURLY155_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_bodyExp=new RewriteRuleSubtreeStream(adaptor,"rule bodyExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:295:2: ( ELSE LCURLY bodyExp RCURLY -> bodyExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:295:4: ELSE LCURLY bodyExp RCURLY
            {
            ELSE152=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE152);

            LCURLY153=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_elseExp1480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY153);

            pushFollow(FOLLOW_bodyExp_in_elseExp1482);
            bodyExp154=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(bodyExp154.getTree());
            RCURLY155=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_elseExp1484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY155);



            // AST REWRITE
            // elements: bodyExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:31: -> bodyExp
            {
                adaptor.addChild(root_0, stream_bodyExp.nextTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:298:1: altExp : LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY -> ^( ALT_EXP oclExpressionCS bodyExp ) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN156=null;
        Token RPAREN158=null;
        Token LCURLY159=null;
        Token RCURLY161=null;
        IoclParser.oclExpressionCS_return oclExpressionCS157 = null;

        IoclParser.bodyExp_return bodyExp160 = null;


        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;
        Object LCURLY159_tree=null;
        Object RCURLY161_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_bodyExp=new RewriteRuleSubtreeStream(adaptor,"rule bodyExp");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:2: ( LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY -> ^( ALT_EXP oclExpressionCS bodyExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:4: LPAREN oclExpressionCS RPAREN LCURLY bodyExp RCURLY
            {
            LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN156);

            pushFollow(FOLLOW_oclExpressionCS_in_altExp1503);
            oclExpressionCS157=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS157.getTree());
            RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN158);

            LCURLY159=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_altExp1507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY159);

            pushFollow(FOLLOW_bodyExp_in_altExp1509);
            bodyExp160=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(bodyExp160.getTree());
            RCURLY161=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_altExp1511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY161);



            // AST REWRITE
            // elements: bodyExp, oclExpressionCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:56: -> ^( ALT_EXP oclExpressionCS bodyExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:299:59: ^( ALT_EXP oclExpressionCS bodyExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALT_EXP, "ALT_EXP"), root_1);

                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());
                adaptor.addChild(root_1, stream_bodyExp.nextTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:302:1: tryExp : TRY LCURLY b1= bodyExp RCURLY except LCURLY b2= bodyExp RCURLY -> ^( TRY $b1 except $b2) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY162=null;
        Token LCURLY163=null;
        Token RCURLY164=null;
        Token LCURLY166=null;
        Token RCURLY167=null;
        IoclParser.bodyExp_return b1 = null;

        IoclParser.bodyExp_return b2 = null;

        IoclParser.except_return except165 = null;


        Object TRY162_tree=null;
        Object LCURLY163_tree=null;
        Object RCURLY164_tree=null;
        Object LCURLY166_tree=null;
        Object RCURLY167_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_bodyExp=new RewriteRuleSubtreeStream(adaptor,"rule bodyExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:2: ( TRY LCURLY b1= bodyExp RCURLY except LCURLY b2= bodyExp RCURLY -> ^( TRY $b1 except $b2) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:4: TRY LCURLY b1= bodyExp RCURLY except LCURLY b2= bodyExp RCURLY
            {
            TRY162=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY162);

            LCURLY163=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY163);

            pushFollow(FOLLOW_bodyExp_in_tryExp1540);
            b1=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(b1.getTree());
            RCURLY164=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY164);

            pushFollow(FOLLOW_except_in_tryExp1544);
            except165=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except165.getTree());
            LCURLY166=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY166);

            pushFollow(FOLLOW_bodyExp_in_tryExp1552);
            b2=bodyExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bodyExp.add(b2.getTree());
            RCURLY167=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY167);



            // AST REWRITE
            // elements: b1, b2, except, TRY
            // token labels: 
            // rule labels: retval, b1, b2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
            RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:69: -> ^( TRY $b1 except $b2)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:303:72: ^( TRY $b1 except $b2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                adaptor.addChild(root_1, stream_except.nextTree());
                adaptor.addChild(root_1, stream_b2.nextTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:306:1: except : EXCEPT LPAREN t1= type ( ',' t2= type )* RPAREN -> $t1 ( $t2)* ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT168=null;
        Token LPAREN169=null;
        Token char_literal170=null;
        Token RPAREN171=null;
        IoclParser.type_return t1 = null;

        IoclParser.type_return t2 = null;


        Object EXCEPT168_tree=null;
        Object LPAREN169_tree=null;
        Object char_literal170_tree=null;
        Object RPAREN171_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:2: ( EXCEPT LPAREN t1= type ( ',' t2= type )* RPAREN -> $t1 ( $t2)* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:4: EXCEPT LPAREN t1= type ( ',' t2= type )* RPAREN
            {
            EXCEPT168=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT168);

            LPAREN169=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN169);

            pushFollow(FOLLOW_type_in_except1587);
            t1=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(t1.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:28: ( ',' t2= type )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==64) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:29: ',' t2= type
            	    {
            	    char_literal170=(Token)match(input,64,FOLLOW_64_in_except1590); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_64.add(char_literal170);

            	    pushFollow(FOLLOW_type_in_except1596);
            	    t2=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(t2.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            RPAREN171=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN171);



            // AST REWRITE
            // elements: t2, t1
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
            // 307:52: -> $t1 ( $t2)*
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:307:59: ( $t2)*
                while ( stream_t2.hasNext() ) {
                    adaptor.addChild(root_0, stream_t2.nextTree());

                }
                stream_t2.reset();

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

    // $ANTLR start synpred19_Iocl
    public final void synpred19_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:4: ( propertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:4: propertyCallExp
        {
        pushFollow(FOLLOW_propertyCallExp_in_synpred19_Iocl544);
        propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:177:4: ( modelPropertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:177:4: modelPropertyCallExp
        {
        pushFollow(FOLLOW_modelPropertyCallExp_in_synpred28_Iocl786);
        modelPropertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred29_Iocl
    public final void synpred29_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:186:4: ( iteratorExpCS )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:186:4: iteratorExpCS
        {
        pushFollow(FOLLOW_iteratorExpCS_in_synpred29_Iocl813);
        iteratorExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Iocl

    // $ANTLR start synpred30_Iocl
    public final void synpred30_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:43: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:43: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred30_Iocl844);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,64,FOLLOW_64_in_synpred30_Iocl846); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:42: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:42: (v1= variableDeclaration ',' )?
        int alt37=2;
        int LA37_0 = input.LA(1);

        if ( (LA37_0==IDENTIFIER) ) {
            int LA37_1 = input.LA(2);

            if ( (synpred30_Iocl()) ) {
                alt37=1;
            }
        }
        switch (alt37) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:191:43: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl844);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,64,FOLLOW_64_in_synpred31_Iocl846); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl854);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,65,FOLLOW_65_in_synpred31_Iocl856); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred32_Iocl
    public final void synpred32_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:35: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:195:35: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred32_Iocl906);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred32_Iocl908); if (state.failed) return ;

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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\1\34\1\uffff\11\0\2\uffff";
    static final String DFA9_maxS =
        "\1\71\1\uffff\11\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\11\uffff\1\2\1\3";
    static final String DFA9_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\12\15\uffff\1\3\6\uffff\1\1\1\5\1\10\1\11\1\6\1\7\1\uffff"+
            "\1\4\1\2",
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
            return "112:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );";
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
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_10);
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
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\34\11\0\2\uffff";
    static final String DFA16_maxS =
        "\1\71\11\0\2\uffff";
    static final String DFA16_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\11\15\uffff\1\2\7\uffff\1\4\1\7\1\10\1\5\1\6\1\uffff\1\3"+
            "\1\1",
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
            return "176:1: propertyCallExp : ( modelPropertyCallExp | loopExp );";
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
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index16_9);
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
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\34\11\0\2\uffff";
    static final String DFA17_maxS =
        "\1\71\11\0\2\uffff";
    static final String DFA17_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\11\15\uffff\1\2\7\uffff\1\4\1\7\1\10\1\5\1\6\1\uffff\1\3"+
            "\1\1",
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
            return "185:1: loopExp : ( iteratorExpCS | iterateExpCS );";
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
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_9);
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
        "\26\uffff";
    static final String DFA19_eofS =
        "\26\uffff";
    static final String DFA19_minS =
        "\1\10\1\0\24\uffff";
    static final String DFA19_maxS =
        "\1\71\1\0\24\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\22\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\4\uffff\2\2\10\uffff\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\6\2\1\uffff\1\1\1\2",
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
            return "191:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
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
                        if ( (synpred31_Iocl()) ) {s = 21;}

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
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\13\uffff";
    static final String DFA28_minS =
        "\1\10\12\uffff";
    static final String DFA28_maxS =
        "\1\71\12\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA28_specialS =
        "\13\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\4\uffff\1\3\1\1\10\uffff\1\11\15\uffff\1\7\1\uffff\1\4"+
            "\2\uffff\1\6\1\uffff\1\12\1\5\1\uffff\1\10\10\uffff\2\6",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "236:1: imperativeExp : ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp );";
        }
    }
 

    public static final BitSet FOLLOW_logicalExpCS_in_oclExpressionCS344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_oclExpressionCS349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS360 = new BitSet(new long[]{0x0001000800000012L});
    public static final BitSet FOLLOW_set_in_logicalExpCS363 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS376 = new BitSet(new long[]{0x0001000800000012L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS389 = new BitSet(new long[]{0x0000000200080002L});
    public static final BitSet FOLLOW_set_in_equalityExpCS392 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS401 = new BitSet(new long[]{0x0000000200080002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS414 = new BitSet(new long[]{0x0000000060600002L});
    public static final BitSet FOLLOW_set_in_relationalExpCS417 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS434 = new BitSet(new long[]{0x0000000060600002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS447 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS450 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS459 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS472 = new BitSet(new long[]{0x0000000400008002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS475 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS485 = new BitSet(new long[]{0x0000000400008002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS498 = new BitSet(new long[]{0x037E040190000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS523 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_dotArrowExpCS525 = new BitSet(new long[]{0x037EB5A190806100L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS527 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dotArrowExpCS530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExpCS560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExpCS570 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_oclExpCS572 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExpCS574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_variableExp592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS620 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExpCS622 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS624 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExpCS627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_collectionLiteralPartsCS663 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_loopExp813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpCS_in_loopExp818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iteratorExpCS830 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iteratorExpCS832 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExpCS834 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExpCS836 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iteratorExpCS846 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteratorExpCS856 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iteratorExpCS860 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExpCS862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iterateExpCS893 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iterateExpCS895 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExpCS897 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpCS899 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS906 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExpCS908 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iterateExpCS919 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iterateExpCS921 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpCS923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration951 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration954 = new BitSet(new long[]{0x0304000000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration956 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration961 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_variableDeclaration963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_operationCallExpCS990 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_set_in_operationCallExpCS992 = new BitSet(new long[]{0x0300040000000000L});
    public static final BitSet FOLLOW_simpleNameCS_in_operationCallExpCS1001 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExpCS1003 = new BitSet(new long[]{0x037EB5A190806100L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS1006 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExpCS1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_argumentsCS1024 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_primitiveType_in_simpleNameCS1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_simpleNameCS1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionType1072 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1074 = new BitSet(new long[]{0x0304000000000000L});
    public static final BitSet FOLLOW_type_in_collectionType1076 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1121 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1124 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1126 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1208 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1210 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_blockExp1212 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_bodyExp1233 = new BitSet(new long[]{0x037EB4A190806102L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1250 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1264 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1278 = new BitSet(new long[]{0x037EBCA190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_returnExp1280 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1303 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableInitExp1305 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_COLON_in_variableInitExp1308 = new BitSet(new long[]{0x0304000000000000L});
    public static final BitSet FOLLOW_type_in_variableInitExp1310 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IS_in_variableInitExp1314 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_variableInitExp1316 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_assignExp1342 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_set_in_assignExp1344 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_assignExp1353 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1367 = new BitSet(new long[]{0x030C000000000000L});
    public static final BitSet FOLLOW_type_in_raiseExp1371 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1375 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1390 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1392 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_whileExp1394 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1396 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_whileExp1401 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_whileExp1403 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_whileExp1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1428 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1431 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1463 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1478 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_elseExp1480 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_elseExp1482 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_elseExp1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1501 = new BitSet(new long[]{0x037EB4A190806100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_altExp1503 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1505 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_altExp1507 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_altExp1509 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_altExp1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1534 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_tryExp1540 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_except_in_tryExp1544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1546 = new BitSet(new long[]{0x037EB4E190806100L});
    public static final BitSet FOLLOW_bodyExp_in_tryExp1552 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1579 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1581 = new BitSet(new long[]{0x0304000000000000L});
    public static final BitSet FOLLOW_type_in_except1587 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_except1590 = new BitSet(new long[]{0x0304000000000000L});
    public static final BitSet FOLLOW_type_in_except1596 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RPAREN_in_except1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred19_Iocl544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_synpred28_Iocl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_synpred29_Iocl813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred30_Iocl844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_synpred30_Iocl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_synpred31_Iocl846 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_synpred31_Iocl856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred32_Iocl906 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred32_Iocl908 = new BitSet(new long[]{0x0000000000000002L});

}