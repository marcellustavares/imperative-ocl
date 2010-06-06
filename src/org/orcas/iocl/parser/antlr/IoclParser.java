// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-06-06 16:34:41

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ALT_EXP", "APPEND", "ARROW", "BREAK", "COLLECTION_LITERAL", "COLLECTION_LITERAL_PARTS", "COLLECTION_TYPE", "COLON", "CONTINUE", "DO", "DIV", "DOT", "ELIF", "ELSE", "EQUAL", "GT", "GTE", "IF", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "ITERATOR_NAME", "IDENTIFIER", "PRIMITIVE_TYPE_LITERAL", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=53;
    public static final int APPEND=6;
    public static final int EXPONENT=56;
    public static final int LT=28;
    public static final int T__62=62;
    public static final int WHILE=45;
    public static final int T__63=63;
    public static final int PRIMITIVE_TYPE_LITERAL=55;
    public static final int GTE=21;
    public static final int OCTAL_ESC=61;
    public static final int COLLECTION_LITERAL_PARTS=10;
    public static final int DO=14;
    public static final int NOT=31;
    public static final int AND=4;
    public static final int EOF=-1;
    public static final int LTE=29;
    public static final int BREAK=8;
    public static final int LPAREN=27;
    public static final int IF=22;
    public static final int RPAREN=39;
    public static final int ESC_SEQ=57;
    public static final int STRING_LITERAL=49;
    public static final int REAL_LITERAL=52;
    public static final int SCOPE=40;
    public static final int COLLECTION_TYPE_LITERAL=48;
    public static final int CONTINUE=13;
    public static final int NOT_EQUAL=32;
    public static final int IS=25;
    public static final int IDENTIFIER=54;
    public static final int ITERATOR=24;
    public static final int EQUAL=19;
    public static final int RETURN=38;
    public static final int PLUS=35;
    public static final int VAR=43;
    public static final int RAISE=36;
    public static final int DOT=16;
    public static final int COLLECTION_LITERAL=9;
    public static final int XOR=46;
    public static final int COLLECTION_TYPE=11;
    public static final int UNICODE_ESC=60;
    public static final int NUMERIC_OPERATION=47;
    public static final int ELSE=18;
    public static final int HEX_DIGIT=59;
    public static final int LCURLY=26;
    public static final int SEMICOLON=42;
    public static final int MINUS=30;
    public static final int MULT=33;
    public static final int BOOLEAN_LITERAL=50;
    public static final int COLON=12;
    public static final int ALT_EXP=5;
    public static final int ELIF=17;
    public static final int ITERATE=23;
    public static final int WS=58;
    public static final int VARIABLE=44;
    public static final int INTEGER_LITERAL=51;
    public static final int OR=34;
    public static final int RCURLY=37;
    public static final int ARROW=7;
    public static final int GT=20;
    public static final int DIV=15;
    public static final int SELF=41;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[107+1];
             
             
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:80:1: oclExpressionCS : ( logicalExpCS | imperativeExp );
    public final IoclParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IoclParser.oclExpressionCS_return retval = new IoclParser.oclExpressionCS_return();
        retval.start = input.LT(1);
        int oclExpressionCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.logicalExpCS_return logicalExpCS1 = null;

        IoclParser.imperativeExp_return imperativeExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:81:2: ( logicalExpCS | imperativeExp )
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

                if ( (LA1_2==EOF||LA1_2==AND||LA1_2==ARROW||(LA1_2>=DIV && LA1_2<=DOT)||(LA1_2>=EQUAL && LA1_2<=GTE)||(LA1_2>=LT && LA1_2<=MINUS)||(LA1_2>=NOT_EQUAL && LA1_2<=PLUS)||LA1_2==RCURLY||LA1_2==RPAREN||LA1_2==SEMICOLON||LA1_2==XOR||(LA1_2>=62 && LA1_2<=63)) ) {
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

                if ( (LA1_3==EOF||LA1_3==AND||LA1_3==ARROW||(LA1_3>=DIV && LA1_3<=DOT)||(LA1_3>=EQUAL && LA1_3<=GTE)||(LA1_3>=LT && LA1_3<=MINUS)||(LA1_3>=NOT_EQUAL && LA1_3<=PLUS)||LA1_3==RCURLY||LA1_3==RPAREN||LA1_3==SEMICOLON||LA1_3==XOR||(LA1_3>=62 && LA1_3<=63)) ) {
                    alt1=1;
                }
                else if ( (LA1_3==APPEND||LA1_3==IS) ) {
                    alt1=2;
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
                else if ( (LA1_4==EOF||LA1_4==AND||LA1_4==ARROW||(LA1_4>=DIV && LA1_4<=DOT)||(LA1_4>=EQUAL && LA1_4<=GTE)||(LA1_4>=LT && LA1_4<=MINUS)||(LA1_4>=NOT_EQUAL && LA1_4<=PLUS)||LA1_4==RCURLY||LA1_4==RPAREN||LA1_4==SEMICOLON||LA1_4==XOR||(LA1_4>=62 && LA1_4<=63)) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:81:4: logicalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExpCS_in_oclExpressionCS330);
                    logicalExpCS1=logicalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpCS1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:82:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpressionCS335);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:85:1: logicalExpCS : equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:86:2: ( equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:86:4: equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS346);
            equalityExpCS3=equalityExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:86:18: ( ( AND | OR | XOR ) equalityExpCS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:86:19: ( AND | OR | XOR ) equalityExpCS
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

            	    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS362);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:89:1: equalityExpCS : relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:2: ( relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:4: relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS375);
            relationalExpCS6=relationalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:20: ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:90:21: ( EQUAL | NOT_EQUAL ) relationalExpCS
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

            	    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS387);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:93:1: relationalExpCS : additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:2: ( additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:4: additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS400);
            additiveExpCS9=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:18: ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:94:19: ( LT | LTE | GT | GTE ) additiveExpCS
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

            	    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS420);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:97:1: additiveExpCS : multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:2: ( multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:4: multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS433);
            multiplicativeExpCS12=multiplicativeExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:24: ( ( PLUS | MINUS ) multiplicativeExpCS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:98:25: ( PLUS | MINUS ) multiplicativeExpCS
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

            	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS445);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:101:1: multiplicativeExpCS : unaryExpCS ( ( MULT | DIV ) unaryExpCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:2: ( unaryExpCS ( ( MULT | DIV ) unaryExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:4: unaryExpCS ( ( MULT | DIV ) unaryExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS458);
            unaryExpCS15=unaryExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:15: ( ( MULT | DIV ) unaryExpCS )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:16: ( MULT | DIV ) unaryExpCS
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

            	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS471);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:105:1: unaryExpCS : ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:2: ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: ( MINUS | NOT ) unaryExpCS
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

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS493);
                    unaryExpCS19=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: dotArrowExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS498);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:110:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:2: ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:4: NUMERIC_OPERATION '(' ( argumentsCS )? ')'
                    {
                    NUMERIC_OPERATION21=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION21);

                    char_literal22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dotArrowExpCS511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal22);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:26: ( argumentsCS )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BREAK||(LA8_0>=CONTINUE && LA8_0<=DO)||LA8_0==IF||LA8_0==LPAREN||(LA8_0>=MINUS && LA8_0<=NOT)||LA8_0==RAISE||LA8_0==RETURN||LA8_0==SELF||LA8_0==VAR||LA8_0==WHILE||(LA8_0>=NUMERIC_OPERATION && LA8_0<=REAL_LITERAL)||(LA8_0>=IDENTIFIER && LA8_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS513);
                            argumentsCS23=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentsCS.add(argumentsCS23.getTree());

                            }
                            break;

                    }

                    char_literal24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dotArrowExpCS516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal24);



                    // AST REWRITE
                    // elements: NUMERIC_OPERATION, argumentsCS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:43: -> ^( NUMERIC_OPERATION ( argumentsCS )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:46: ^( NUMERIC_OPERATION ( argumentsCS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:66: ( argumentsCS )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:4: propertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS530);
                    propertyCallExp25=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp25.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:113:4: oclExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS535);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:116:1: oclExpCS : ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:117:2: ( variableExp | literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:117:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExpCS546);
                    variableExp27=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp27.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:118:4: literalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExpCS_in_oclExpCS551);
                    literalExpCS28=literalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExpCS28.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:4: '(' oclExpressionCS ')'
                    {
                    char_literal29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExpCS556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal29);

                    pushFollow(FOLLOW_oclExpressionCS_in_oclExpCS558);
                    oclExpressionCS30=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS30.getTree());
                    char_literal31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExpCS560); if (state.failed) return retval; 
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
                    // 119:28: -> oclExpressionCS
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:122:1: variableExp : simpleNameCS ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleNameCS_return simpleNameCS32 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:2: ( simpleNameCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:4: simpleNameCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleNameCS_in_variableExp578);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:126:1: literalExpCS : ( collectionLiteralExpCS | primitiveLiteralExpCS );
    public final IoclParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IoclParser.literalExpCS_return retval = new IoclParser.literalExpCS_return();
        retval.start = input.LT(1);
        int literalExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS33 = null;

        IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS34 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:2: ( collectionLiteralExpCS | primitiveLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:4: collectionLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS589);
                    collectionLiteralExpCS33=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExpCS33.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:128:4: primitiveLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS595);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:1: collectionLiteralExpCS : collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:2: ( collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:4: collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS606);
            collectionTypeIdentifierCS35=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS35.getTree());
            char_literal36=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExpCS608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal36);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:35: ( collectionLiteralPartsCS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BREAK||(LA12_0>=CONTINUE && LA12_0<=DO)||LA12_0==IF||LA12_0==LPAREN||(LA12_0>=MINUS && LA12_0<=NOT)||LA12_0==RAISE||LA12_0==RETURN||LA12_0==SELF||LA12_0==VAR||LA12_0==WHILE||(LA12_0>=NUMERIC_OPERATION && LA12_0<=REAL_LITERAL)||(LA12_0>=IDENTIFIER && LA12_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS610);
                    collectionLiteralPartsCS37=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralPartsCS.add(collectionLiteralPartsCS37.getTree());

                    }
                    break;

            }

            char_literal38=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExpCS613); if (state.failed) return retval; 
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
            // 132:65: -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:68: ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifierCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:132:116: ( collectionLiteralPartsCS )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:1: collectionTypeIdentifierCS : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IoclParser.collectionTypeIdentifierCS_return retval = new IoclParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifierCS_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL39=null;

        Object COLLECTION_TYPE_LITERAL39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:136:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL39=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS635); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:139:1: collectionLiteralPartsCS : collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) ;
    public final IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IoclParser.collectionLiteralPartsCS_return retval = new IoclParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal41=null;
        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS40 = null;

        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS42 = null;


        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_collectionLiteralPartCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:2: ( collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:4: collectionLiteralPartCS ( ',' collectionLiteralPartCS )*
            {
            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS646);
            collectionLiteralPartCS40=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(collectionLiteralPartCS40.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:28: ( ',' collectionLiteralPartCS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==62) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:29: ',' collectionLiteralPartCS
            	    {
            	    char_literal41=(Token)match(input,62,FOLLOW_62_in_collectionLiteralPartsCS649); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_62.add(char_literal41);

            	    pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS651);
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
            // 140:59: -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:62: ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL_PARTS, "COLLECTION_LITERAL_PARTS"), root_1);

                adaptor.addChild(root_1, stream_collectionLiteralPartCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:113: ( collectionLiteralPartCS )*
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:143:1: collectionLiteralPartCS : oclExpressionCS ;
    public final IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IoclParser.collectionLiteralPartCS_return retval = new IoclParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS43 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:2: ( oclExpressionCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:4: oclExpressionCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS675);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:147:1: primitiveLiteralExpCS : ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:2: ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:4: numericLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS686);
                    numericLiteralExpCS44=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExpCS44.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:4: stringLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS691);
                    stringLiteralExpCS45=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExpCS45.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:150:4: booleanLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS696);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:1: numericLiteralExpCS : ( integerLiteralExpCS | realLiteralExpCS );
    public final IoclParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IoclParser.numericLiteralExpCS_return retval = new IoclParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);
        int numericLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExpCS_return integerLiteralExpCS47 = null;

        IoclParser.realLiteralExpCS_return realLiteralExpCS48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:154:2: ( integerLiteralExpCS | realLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:154:4: integerLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS707);
                    integerLiteralExpCS47=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExpCS47.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:155:4: realLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS712);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:1: stringLiteralExpCS : STRING_LITERAL ;
    public final IoclParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IoclParser.stringLiteralExpCS_return retval = new IoclParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);
        int stringLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL49=null;

        Object STRING_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:159:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:159:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL49=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS727); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:162:1: booleanLiteralExpCS : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IoclParser.booleanLiteralExpCS_return retval = new IoclParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);
        int booleanLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL50=null;

        Object BOOLEAN_LITERAL50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:163:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:163:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL50=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS738); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:1: integerLiteralExpCS : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IoclParser.integerLiteralExpCS_return retval = new IoclParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);
        int integerLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL51=null;

        Object INTEGER_LITERAL51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:167:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:167:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL51=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS749); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:1: realLiteralExpCS : REAL_LITERAL ;
    public final IoclParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IoclParser.realLiteralExpCS_return retval = new IoclParser.realLiteralExpCS_return();
        retval.start = input.LT(1);
        int realLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL52=null;

        Object REAL_LITERAL52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL52=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS761); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:174:1: propertyCallExp : ( modelPropertyCallExp | loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp53 = null;

        IoclParser.loopExp_return loopExp54 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:2: ( modelPropertyCallExp | loopExp )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp772);
                    modelPropertyCallExp53=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp53.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:4: loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopExp_in_propertyCallExp777);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:179:1: modelPropertyCallExp : operationCallExpCS ;
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExpCS_return operationCallExpCS55 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:2: ( operationCallExpCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:4: operationCallExpCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp788);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:183:1: loopExp : ( iteratorExpCS | iterateExpCS );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExpCS_return iteratorExpCS56 = null;

        IoclParser.iterateExpCS_return iterateExpCS57 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:2: ( iteratorExpCS | iterateExpCS )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: iteratorExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExpCS_in_loopExp799);
                    iteratorExpCS56=iteratorExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExpCS56.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:185:4: iterateExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExpCS_in_loopExp804);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:1: iteratorExpCS : oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) ;
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
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:2: ( oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:5: oclExpCS ARROW ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iteratorExpCS816);
            oclExpCS58=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS58.getTree());
            ARROW59=(Token)match(input,ARROW,FOLLOW_ARROW_in_iteratorExpCS818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW59);

            ITERATOR_NAME60=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExpCS820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME60);

            LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExpCS822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN61);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:42: (v1= variableDeclaration ',' )?
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
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:43: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS830);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal62=(Token)match(input,62,FOLLOW_62_in_iteratorExpCS832); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_62.add(char_literal62);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExpCS840);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal63=(Token)match(input,63,FOLLOW_63_in_iteratorExpCS842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal63);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpressionCS_in_iteratorExpCS846);
            oclExpressionCS64=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS64.getTree());
            RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExpCS848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN65);



            // AST REWRITE
            // elements: ITERATOR_NAME, v2, v1, oclExpCS, oclExpressionCS
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
            // 189:128: -> ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:131: ^( ITERATOR oclExpCS ITERATOR_NAME ( $v1)? ( $v2)? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:165: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:170: ( $v2)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:192:1: iterateExpCS : oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) ;
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
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpCS");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:2: ( oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:4: oclExpCS ARROW ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpressionCS RPAREN
            {
            pushFollow(FOLLOW_oclExpCS_in_iterateExpCS879);
            oclExpCS66=oclExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpCS.add(oclExpCS66.getTree());
            ARROW67=(Token)match(input,ARROW,FOLLOW_ARROW_in_iterateExpCS881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW67);

            ITERATE68=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExpCS883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE68);

            LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpCS885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN69);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:34: (v1= variableDeclaration SEMICOLON )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:35: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS892);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExpCS894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON70);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExpCS902);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal71=(Token)match(input,63,FOLLOW_63_in_iterateExpCS905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal71);

            pushFollow(FOLLOW_oclExpressionCS_in_iterateExpCS907);
            oclExpressionCS72=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS72.getTree());
            RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpCS909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);



            // AST REWRITE
            // elements: oclExpressionCS, v1, ITERATE, oclExpCS, v2
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
            // 193:125: -> ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:128: ^( ITERATE oclExpCS ( $v1)? $v2 oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExpCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:147: ( $v1)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:196:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:4: IDENTIFIER ( ':' type )? ( '=' oclExpressionCS )?
            {
            IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER74);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:15: ( ':' type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==COLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:16: ':' type
                    {
                    char_literal75=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal75);

                    pushFollow(FOLLOW_type_in_variableDeclaration942);
                    type76=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type76.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:27: ( '=' oclExpressionCS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:28: '=' oclExpressionCS
                    {
                    char_literal77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal77);

                    pushFollow(FOLLOW_oclExpressionCS_in_variableDeclaration949);
                    oclExpressionCS78=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS78.getTree());

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
            // 197:50: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:53: ^( VARIABLE IDENTIFIER ( type )? ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:75: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:81: ( oclExpressionCS )?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:1: operationCallExpCS : oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:2: ( oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:4: oclExpCS ( DOT | ARROW ) simpleNameCS '(' ( argumentsCS )? ')'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpCS_in_operationCallExpCS976);
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

            pushFollow(FOLLOW_simpleNameCS_in_operationCallExpCS987);
            simpleNameCS81=simpleNameCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleNameCS81.getTree());
            char_literal82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExpCS989); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:201:46: ( argumentsCS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BREAK||(LA23_0>=CONTINUE && LA23_0<=DO)||LA23_0==IF||LA23_0==LPAREN||(LA23_0>=MINUS && LA23_0<=NOT)||LA23_0==RAISE||LA23_0==RETURN||LA23_0==SELF||LA23_0==VAR||LA23_0==WHILE||(LA23_0>=NUMERIC_OPERATION && LA23_0<=REAL_LITERAL)||(LA23_0>=IDENTIFIER && LA23_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS992);
                    argumentsCS83=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsCS83.getTree());

                    }
                    break;

            }

            char_literal84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExpCS995); if (state.failed) return retval;

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:204:1: argumentsCS : oclExpressionCS ( ',' oclExpressionCS )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:2: ( oclExpressionCS ( ',' oclExpressionCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:4: oclExpressionCS ( ',' oclExpressionCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1007);
            oclExpressionCS85=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS85.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:20: ( ',' oclExpressionCS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==62) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:21: ',' oclExpressionCS
            	    {
            	    char_literal86=(Token)match(input,62,FOLLOW_62_in_argumentsCS1010); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS1013);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:208:1: simpleNameCS : ( primitiveType | SELF | IDENTIFIER );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:2: ( primitiveType | SELF | IDENTIFIER )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:209:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_simpleNameCS1026);
                    primitiveType88=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType88.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:210:4: SELF
                    {
                    root_0 = (Object)adaptor.nil();

                    SELF89=(Token)match(input,SELF,FOLLOW_SELF_in_simpleNameCS1031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SELF89_tree = (Object)adaptor.create(SELF89);
                    adaptor.addChild(root_0, SELF89_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:211:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS1036); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL91=null;

        Object PRIMITIVE_TYPE_LITERAL91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL91=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1047); if (state.failed) return retval;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:218:1: collectionType : collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:2: ( collectionTypeIdentifierCS LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:4: collectionTypeIdentifierCS LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionType1058);
            collectionTypeIdentifierCS92=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS92.getTree());
            LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

            pushFollow(FOLLOW_type_in_collectionType1062);
            type94=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type94.getTree());
            RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1064); if (state.failed) return retval; 
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
            // 219:50: -> ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:219:53: ^( COLLECTION_TYPE collectionTypeIdentifierCS type )
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:222:1: type : ( primitiveType | collectionType | pathName );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:2: ( primitiveType | collectionType | pathName )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:223:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1086);
                    primitiveType96=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType96.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1091);
                    collectionType97=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType97.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1096);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:228:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER99=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER99);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:15: ( SCOPE IDENTIFIER )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==SCOPE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE100=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1110); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE100);

            	    IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1112); if (state.failed) return retval; 
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
            // 229:35: -> ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:38: ^( SCOPE IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:229:57: ( IDENTIFIER )*
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:1: imperativeExp : ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp );
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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:2: ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp )
            int alt28=9;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:235:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1138);
                    blockExp102=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp102.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:236:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1143);
                    breakExp103=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp103.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:237:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1148);
                    continueExp104=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp104.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1153);
                    returnExp105=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp105.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:239:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1158);
                    variableInitExp106=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp106.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:240:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1163);
                    assignExp107=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp107.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:241:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1168);
                    raiseExp108=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp108.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1173);
                    whileExp109=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp109.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:243:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1178);
                    ifExp110=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp110.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:246:1: blockExp : DO LCURLY ( oclExpressionCS SEMICOLON )* RCURLY -> ^( DO ( oclExpressionCS )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO111=null;
        Token LCURLY112=null;
        Token SEMICOLON114=null;
        Token RCURLY115=null;
        IoclParser.oclExpressionCS_return oclExpressionCS113 = null;


        Object DO111_tree=null;
        Object LCURLY112_tree=null;
        Object SEMICOLON114_tree=null;
        Object RCURLY115_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:2: ( DO LCURLY ( oclExpressionCS SEMICOLON )* RCURLY -> ^( DO ( oclExpressionCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:4: DO LCURLY ( oclExpressionCS SEMICOLON )* RCURLY
            {
            DO111=(Token)match(input,DO,FOLLOW_DO_in_blockExp1189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO111);

            LCURLY112=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY112);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:14: ( oclExpressionCS SEMICOLON )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==BREAK||(LA29_0>=CONTINUE && LA29_0<=DO)||LA29_0==IF||LA29_0==LPAREN||(LA29_0>=MINUS && LA29_0<=NOT)||LA29_0==RAISE||LA29_0==RETURN||LA29_0==SELF||LA29_0==VAR||LA29_0==WHILE||(LA29_0>=NUMERIC_OPERATION && LA29_0<=REAL_LITERAL)||(LA29_0>=IDENTIFIER && LA29_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:15: oclExpressionCS SEMICOLON
            	    {
            	    pushFollow(FOLLOW_oclExpressionCS_in_blockExp1194);
            	    oclExpressionCS113=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS113.getTree());
            	    SEMICOLON114=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_blockExp1196); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON114);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            RCURLY115=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY115);



            // AST REWRITE
            // elements: DO, oclExpressionCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 247:50: -> ^( DO ( oclExpressionCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:53: ^( DO ( oclExpressionCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:247:58: ( oclExpressionCS )*
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:250:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK116=null;
        Token SEMICOLON117=null;

        Object BREAK116_tree=null;
        Object SEMICOLON117_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK116=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK116_tree = (Object)adaptor.create(BREAK116);
            adaptor.addChild(root_0, BREAK116_tree);
            }
            SEMICOLON117=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1222); if (state.failed) return retval;

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

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:254:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE118=null;
        Token SEMICOLON119=null;

        Object CONTINUE118_tree=null;
        Object SEMICOLON119_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:255:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:255:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE118=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE118_tree = (Object)adaptor.create(CONTINUE118);
            adaptor.addChild(root_0, CONTINUE118_tree);
            }
            SEMICOLON119=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1236); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 38, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:258:1: returnExp : RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN120=null;
        Token SEMICOLON122=null;
        IoclParser.oclExpressionCS_return oclExpressionCS121 = null;


        Object RETURN120_tree=null;
        Object SEMICOLON122_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:259:2: ( RETURN ( oclExpressionCS )? SEMICOLON -> ^( RETURN ( oclExpressionCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:259:4: RETURN ( oclExpressionCS )? SEMICOLON
            {
            RETURN120=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN120);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:259:11: ( oclExpressionCS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BREAK||(LA30_0>=CONTINUE && LA30_0<=DO)||LA30_0==IF||LA30_0==LPAREN||(LA30_0>=MINUS && LA30_0<=NOT)||LA30_0==RAISE||LA30_0==RETURN||LA30_0==SELF||LA30_0==VAR||LA30_0==WHILE||(LA30_0>=NUMERIC_OPERATION && LA30_0<=REAL_LITERAL)||(LA30_0>=IDENTIFIER && LA30_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: oclExpressionCS
                    {
                    pushFollow(FOLLOW_oclExpressionCS_in_returnExp1250);
                    oclExpressionCS121=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS121.getTree());

                    }
                    break;

            }

            SEMICOLON122=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON122);



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
            // 259:38: -> ^( RETURN ( oclExpressionCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:259:41: ^( RETURN ( oclExpressionCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:259:50: ( oclExpressionCS )?
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
            if ( state.backtracking>0 ) { memoize(input, 39, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:1: variableInitExp : VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON -> ^( VAR IDENTIFIER ( type )? oclExpressionCS ) ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR123=null;
        Token IDENTIFIER124=null;
        Token COLON125=null;
        Token IS127=null;
        Token SEMICOLON129=null;
        IoclParser.type_return type126 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS128 = null;


        Object VAR123_tree=null;
        Object IDENTIFIER124_tree=null;
        Object COLON125_tree=null;
        Object IS127_tree=null;
        Object SEMICOLON129_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:2: ( VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON -> ^( VAR IDENTIFIER ( type )? oclExpressionCS ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:4: VAR IDENTIFIER ( COLON type )? IS oclExpressionCS SEMICOLON
            {
            VAR123=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR123);

            IDENTIFIER124=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableInitExp1275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER124);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:19: ( COLON type )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COLON) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:20: COLON type
                    {
                    COLON125=(Token)match(input,COLON,FOLLOW_COLON_in_variableInitExp1278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON125);

                    pushFollow(FOLLOW_type_in_variableInitExp1280);
                    type126=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type126.getTree());

                    }
                    break;

            }

            IS127=(Token)match(input,IS,FOLLOW_IS_in_variableInitExp1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IS.add(IS127);

            pushFollow(FOLLOW_oclExpressionCS_in_variableInitExp1286);
            oclExpressionCS128=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS128.getTree());
            SEMICOLON129=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON129);



            // AST REWRITE
            // elements: IDENTIFIER, VAR, type, oclExpressionCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 263:62: -> ^( VAR IDENTIFIER ( type )? oclExpressionCS )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:65: ^( VAR IDENTIFIER ( type )? oclExpressionCS )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:263:82: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 40, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:266:1: assignExp : variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set131=null;
        Token SEMICOLON133=null;
        IoclParser.variableExp_return variableExp130 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS132 = null;


        Object set131_tree=null;
        Object SEMICOLON133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:2: ( variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:4: variableExp ( IS | APPEND ) oclExpressionCS SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableExp_in_assignExp1312);
            variableExp130=variableExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp130.getTree());
            set131=(Token)input.LT(1);
            set131=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set131), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_oclExpressionCS_in_assignExp1323);
            oclExpressionCS132=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS132.getTree());
            SEMICOLON133=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1325); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 41, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:270:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE134=null;
        Token STRING_LITERAL136=null;
        Token SEMICOLON137=null;
        IoclParser.type_return type135 = null;


        Object RAISE134_tree=null;
        Object STRING_LITERAL136_tree=null;
        Object SEMICOLON137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE134=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE134_tree = (Object)adaptor.create(RAISE134);
            root_0 = (Object)adaptor.becomeRoot(RAISE134_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:11: ( type | STRING_LITERAL )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1341);
                    type135=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type135.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:271:19: STRING_LITERAL
                    {
                    STRING_LITERAL136=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1345); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL136_tree = (Object)adaptor.create(STRING_LITERAL136);
                    adaptor.addChild(root_0, STRING_LITERAL136_tree);
                    }

                    }
                    break;

            }

            SEMICOLON137=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1348); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 42, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:1: whileExp : WHILE LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( WHILE oclExpressionCS ( imperativeExp )* ) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE138=null;
        Token LPAREN139=null;
        Token RPAREN141=null;
        Token LCURLY142=null;
        Token RCURLY144=null;
        IoclParser.oclExpressionCS_return oclExpressionCS140 = null;

        IoclParser.imperativeExp_return imperativeExp143 = null;


        Object WHILE138_tree=null;
        Object LPAREN139_tree=null;
        Object RPAREN141_tree=null;
        Object LCURLY142_tree=null;
        Object RCURLY144_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:275:2: ( WHILE LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( WHILE oclExpressionCS ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:275:4: WHILE LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY
            {
            WHILE138=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE138);

            LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN139);

            pushFollow(FOLLOW_oclExpressionCS_in_whileExp1364);
            oclExpressionCS140=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS140.getTree());
            RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN141);

            LCURLY142=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_whileExp1371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY142);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:276:10: ( imperativeExp )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==BREAK||(LA33_0>=CONTINUE && LA33_0<=DO)||LA33_0==IF||LA33_0==RAISE||LA33_0==RETURN||LA33_0==SELF||LA33_0==VAR||LA33_0==WHILE||(LA33_0>=IDENTIFIER && LA33_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_whileExp1373);
            	    imperativeExp143=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp143.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            RCURLY144=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_whileExp1376); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY144);



            // AST REWRITE
            // elements: imperativeExp, WHILE, oclExpressionCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:32: -> ^( WHILE oclExpressionCS ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:276:35: ^( WHILE oclExpressionCS ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:276:59: ( imperativeExp )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:279:1: ifExp : IF altExp ( elifExp )* ( elseExp )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF145=null;
        IoclParser.altExp_return altExp146 = null;

        IoclParser.elifExp_return elifExp147 = null;

        IoclParser.elseExp_return elseExp148 = null;


        Object IF145_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:2: ( IF altExp ( elifExp )* ( elseExp )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:4: IF altExp ( elifExp )* ( elseExp )?
            {
            IF145=(Token)match(input,IF,FOLLOW_IF_in_ifExp1398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF145);

            pushFollow(FOLLOW_altExp_in_ifExp1400);
            altExp146=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp146.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:14: ( elifExp )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ELIF) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1403);
            	    elifExp147=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp147.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:25: ( elseExp )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ELSE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1408);
                    elseExp148=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp148.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: elseExp, elifExp, altExp, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:36: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:39: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:51: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:280:60: ( elseExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 44, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:283:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF149=null;
        IoclParser.altExp_return altExp150 = null;


        Object ELIF149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:284:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF149=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1435); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1438);
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
            if ( state.backtracking>0 ) { memoize(input, 45, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:287:1: elseExp : ELSE LCURLY ( imperativeExp )* RCURLY -> ( imperativeExp )* ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE151=null;
        Token LCURLY152=null;
        Token RCURLY154=null;
        IoclParser.imperativeExp_return imperativeExp153 = null;


        Object ELSE151_tree=null;
        Object LCURLY152_tree=null;
        Object RCURLY154_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:2: ( ELSE LCURLY ( imperativeExp )* RCURLY -> ( imperativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:4: ELSE LCURLY ( imperativeExp )* RCURLY
            {
            ELSE151=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE151);

            LCURLY152=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_elseExp1452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY152);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:16: ( imperativeExp )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==BREAK||(LA36_0>=CONTINUE && LA36_0<=DO)||LA36_0==IF||LA36_0==RAISE||LA36_0==RETURN||LA36_0==SELF||LA36_0==VAR||LA36_0==WHILE||(LA36_0>=IDENTIFIER && LA36_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:17: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_elseExp1455);
            	    imperativeExp153=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp153.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            RCURLY154=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_elseExp1459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY154);



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
            // 288:40: -> ( imperativeExp )*
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:288:43: ( imperativeExp )*
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
            if ( state.backtracking>0 ) { memoize(input, 46, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:291:1: altExp : LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( ALT_EXP oclExpressionCS ( imperativeExp )* ) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN155=null;
        Token RPAREN157=null;
        Token LCURLY158=null;
        Token RCURLY160=null;
        IoclParser.oclExpressionCS_return oclExpressionCS156 = null;

        IoclParser.imperativeExp_return imperativeExp159 = null;


        Object LPAREN155_tree=null;
        Object RPAREN157_tree=null;
        Object LCURLY158_tree=null;
        Object RCURLY160_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:2: ( LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( ALT_EXP oclExpressionCS ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:4: LPAREN oclExpressionCS RPAREN LCURLY ( imperativeExp )* RCURLY
            {
            LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN155);

            pushFollow(FOLLOW_oclExpressionCS_in_altExp1479);
            oclExpressionCS156=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS156.getTree());
            RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN157);

            LCURLY158=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_altExp1483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY158);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:41: ( imperativeExp )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==BREAK||(LA37_0>=CONTINUE && LA37_0<=DO)||LA37_0==IF||LA37_0==RAISE||LA37_0==RETURN||LA37_0==SELF||LA37_0==VAR||LA37_0==WHILE||(LA37_0>=IDENTIFIER && LA37_0<=PRIMITIVE_TYPE_LITERAL)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:42: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_altExp1486);
            	    imperativeExp159=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp159.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            RCURLY160=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_altExp1490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY160);



            // AST REWRITE
            // elements: oclExpressionCS, imperativeExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:65: -> ^( ALT_EXP oclExpressionCS ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:68: ^( ALT_EXP oclExpressionCS ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALT_EXP, "ALT_EXP"), root_1);

                adaptor.addChild(root_1, stream_oclExpressionCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:292:94: ( imperativeExp )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    // $ANTLR start synpred19_Iocl
    public final void synpred19_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:4: ( propertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:112:4: propertyCallExp
        {
        pushFollow(FOLLOW_propertyCallExp_in_synpred19_Iocl530);
        propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: ( modelPropertyCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:175:4: modelPropertyCallExp
        {
        pushFollow(FOLLOW_modelPropertyCallExp_in_synpred28_Iocl772);
        modelPropertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred29_Iocl
    public final void synpred29_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: ( iteratorExpCS )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: iteratorExpCS
        {
        pushFollow(FOLLOW_iteratorExpCS_in_synpred29_Iocl799);
        iteratorExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Iocl

    // $ANTLR start synpred30_Iocl
    public final void synpred30_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:43: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:43: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred30_Iocl830);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,62,FOLLOW_62_in_synpred30_Iocl832); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:42: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:42: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:42: (v1= variableDeclaration ',' )?
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==IDENTIFIER) ) {
            int LA39_1 = input.LA(2);

            if ( (synpred30_Iocl()) ) {
                alt39=1;
            }
        }
        switch (alt39) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:189:43: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl830);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,62,FOLLOW_62_in_synpred31_Iocl832); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred31_Iocl840);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,63,FOLLOW_63_in_synpred31_Iocl842); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred32_Iocl
    public final void synpred32_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:35: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/src/org/orcas/iocl/parser/antlr/Iocl.g:193:35: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred32_Iocl892);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred32_Iocl894); if (state.failed) return ;

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
        "\1\33\1\uffff\11\0\2\uffff";
    static final String DFA9_maxS =
        "\1\67\1\uffff\11\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\11\uffff\1\2\1\3";
    static final String DFA9_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\12\15\uffff\1\3\5\uffff\1\1\1\5\1\10\1\11\1\6\1\7\1\uffff"+
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
            return "110:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | propertyCallExp | oclExpCS );";
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
        "\1\33\11\0\2\uffff";
    static final String DFA16_maxS =
        "\1\67\11\0\2\uffff";
    static final String DFA16_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\11\15\uffff\1\2\6\uffff\1\4\1\7\1\10\1\5\1\6\1\uffff\1\3"+
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
            return "174:1: propertyCallExp : ( modelPropertyCallExp | loopExp );";
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
        "\1\33\11\0\2\uffff";
    static final String DFA17_maxS =
        "\1\67\11\0\2\uffff";
    static final String DFA17_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\11\15\uffff\1\2\6\uffff\1\4\1\7\1\10\1\5\1\6\1\uffff\1\3"+
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
            return "183:1: loopExp : ( iteratorExpCS | iterateExpCS );";
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
        "\25\uffff";
    static final String DFA19_eofS =
        "\25\uffff";
    static final String DFA19_minS =
        "\1\10\1\0\23\uffff";
    static final String DFA19_maxS =
        "\1\67\1\0\23\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\21\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\4\uffff\2\2\7\uffff\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
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
            return "189:41: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
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
                        if ( (synpred31_Iocl()) ) {s = 20;}

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
        "\12\uffff";
    static final String DFA28_eofS =
        "\12\uffff";
    static final String DFA28_minS =
        "\1\10\11\uffff";
    static final String DFA28_maxS =
        "\1\67\11\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA28_specialS =
        "\12\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\4\uffff\1\3\1\1\7\uffff\1\11\15\uffff\1\7\1\uffff\1\4\2"+
            "\uffff\1\6\1\uffff\1\5\1\uffff\1\10\10\uffff\2\6",
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
            return "234:1: imperativeExp : ( blockExp | breakExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp );";
        }
    }
 

    public static final BitSet FOLLOW_logicalExpCS_in_oclExpressionCS330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_oclExpressionCS335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS346 = new BitSet(new long[]{0x0000400400000012L});
    public static final BitSet FOLLOW_set_in_logicalExpCS349 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS362 = new BitSet(new long[]{0x0000400400000012L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS375 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_set_in_equalityExpCS378 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS387 = new BitSet(new long[]{0x0000000100080002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS400 = new BitSet(new long[]{0x0000000030300002L});
    public static final BitSet FOLLOW_set_in_relationalExpCS403 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS420 = new BitSet(new long[]{0x0000000030300002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS433 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS436 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS445 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS458 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS461 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS471 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS484 = new BitSet(new long[]{0x00DF8200C8000000L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS509 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_dotArrowExpCS511 = new BitSet(new long[]{0x00DFAAD0C8406100L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS513 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dotArrowExpCS516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExpCS546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExpCS556 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_oclExpCS558 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExpCS560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_variableExp578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS606 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExpCS608 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS610 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExpCS613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS646 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_collectionLiteralPartsCS649 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS651 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_loopExp799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpCS_in_loopExp804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iteratorExpCS816 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iteratorExpCS818 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExpCS820 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExpCS822 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS830 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_iteratorExpCS832 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExpCS840 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_iteratorExpCS842 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iteratorExpCS846 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExpCS848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_iterateExpCS879 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_iterateExpCS881 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExpCS883 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpCS885 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS892 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExpCS894 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExpCS902 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_iterateExpCS905 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_iterateExpCS907 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpCS909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration937 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration940 = new BitSet(new long[]{0x00C1000000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration942 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration947 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_variableDeclaration949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_operationCallExpCS976 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_set_in_operationCallExpCS978 = new BitSet(new long[]{0x00C0020000000000L});
    public static final BitSet FOLLOW_simpleNameCS_in_operationCallExpCS987 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExpCS989 = new BitSet(new long[]{0x00DFAAD0C8406100L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS992 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExpCS995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1007 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_argumentsCS1010 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS1013 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_simpleNameCS1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_simpleNameCS1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionType1058 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1060 = new BitSet(new long[]{0x00C1000000000000L});
    public static final BitSet FOLLOW_type_in_collectionType1062 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1107 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1110 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1112 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1189 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1191 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_blockExp1194 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_blockExp1196 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1220 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1234 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1248 = new BitSet(new long[]{0x00DFAE50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_returnExp1250 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1273 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableInitExp1275 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_COLON_in_variableInitExp1278 = new BitSet(new long[]{0x00C1000000000000L});
    public static final BitSet FOLLOW_type_in_variableInitExp1280 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IS_in_variableInitExp1284 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_variableInitExp1286 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_assignExp1312 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_set_in_assignExp1314 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_assignExp1323 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1337 = new BitSet(new long[]{0x00C3000000000000L});
    public static final BitSet FOLLOW_type_in_raiseExp1341 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1345 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1360 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1362 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_whileExp1364 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1366 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LCURLY_in_whileExp1371 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_imperativeExp_in_whileExp1373 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_RCURLY_in_whileExp1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1398 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1400 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1403 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1435 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1450 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LCURLY_in_elseExp1452 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_imperativeExp_in_elseExp1455 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_RCURLY_in_elseExp1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1477 = new BitSet(new long[]{0x00DFAA50C8406100L});
    public static final BitSet FOLLOW_oclExpressionCS_in_altExp1479 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1481 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LCURLY_in_altExp1483 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_imperativeExp_in_altExp1486 = new BitSet(new long[]{0x00DFAA70C8406100L});
    public static final BitSet FOLLOW_RCURLY_in_altExp1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred19_Iocl530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_synpred28_Iocl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteratorExpCS_in_synpred29_Iocl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred30_Iocl830 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_synpred30_Iocl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl830 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_synpred31_Iocl832 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred31_Iocl840 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_synpred31_Iocl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred32_Iocl892 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred32_Iocl894 = new BitSet(new long[]{0x0000000000000002L});

}