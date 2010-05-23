// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-05-23 15:31:59

package org.orcas.iocl.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class IoclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "COLLECTION_LITERAL", "COLLECTION_LITERAL_PARTS", "DIV", "DOT", "EQUAL", "GT", "GTE", "LT", "LTE", "MINUS", "NOT", "NOT_EQUAL", "MULT", "OR", "PLUS", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "IDENTIFIER", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'('", "')'", "'{'", "'}'", "','", "'self'", "'Integer'"
    };
    public static final int T__40=40;
    public static final int EXPONENT=29;
    public static final int LT=13;
    public static final int T__41=41;
    public static final int XOR=21;
    public static final int UNICODE_ESC=33;
    public static final int NUMERIC_OPERATION=22;
    public static final int GTE=12;
    public static final int OCTAL_ESC=34;
    public static final int COLLECTION_LITERAL_PARTS=7;
    public static final int HEX_DIGIT=32;
    public static final int NOT=16;
    public static final int MULT=18;
    public static final int MINUS=15;
    public static final int AND=4;
    public static final int EOF=-1;
    public static final int LTE=14;
    public static final int BOOLEAN_LITERAL=25;
    public static final int WS=31;
    public static final int ESC_SEQ=30;
    public static final int STRING_LITERAL=24;
    public static final int T__35=35;
    public static final int REAL_LITERAL=27;
    public static final int T__36=36;
    public static final int COLLECTION_TYPE_LITERAL=23;
    public static final int T__37=37;
    public static final int NOT_EQUAL=17;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int IDENTIFIER=28;
    public static final int INTEGER_LITERAL=26;
    public static final int EQUAL=10;
    public static final int OR=19;
    public static final int ARROW=5;
    public static final int GT=11;
    public static final int PLUS=20;
    public static final int DIV=8;
    public static final int DOT=9;
    public static final int COLLECTION_LITERAL=6;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[57+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IoclParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g"; }


    public static class oclExpressionCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpressionCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:38:1: oclExpressionCS : logicalExpCS ;
    public final IoclParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IoclParser.oclExpressionCS_return retval = new IoclParser.oclExpressionCS_return();
        retval.start = input.LT(1);
        int oclExpressionCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.logicalExpCS_return logicalExpCS1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:39:2: ( logicalExpCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:39:4: logicalExpCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalExpCS_in_oclExpressionCS168);
            logicalExpCS1=logicalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpCS1.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:42:1: logicalExpCS : equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* ;
    public final IoclParser.logicalExpCS_return logicalExpCS() throws RecognitionException {
        IoclParser.logicalExpCS_return retval = new IoclParser.logicalExpCS_return();
        retval.start = input.LT(1);
        int logicalExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set3=null;
        IoclParser.equalityExpCS_return equalityExpCS2 = null;

        IoclParser.equalityExpCS_return equalityExpCS4 = null;


        Object set3_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:43:2: ( equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:43:4: equalityExpCS ( ( AND | OR | XOR ) equalityExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS179);
            equalityExpCS2=equalityExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS2.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:43:18: ( ( AND | OR | XOR ) equalityExpCS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND||LA1_0==OR||LA1_0==XOR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:43:19: ( AND | OR | XOR ) equalityExpCS
            	    {
            	    set3=(Token)input.LT(1);
            	    set3=(Token)input.LT(1);
            	    if ( input.LA(1)==AND||input.LA(1)==OR||input.LA(1)==XOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set3), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS195);
            	    equalityExpCS4=equalityExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpCS4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:46:1: equalityExpCS : relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* ;
    public final IoclParser.equalityExpCS_return equalityExpCS() throws RecognitionException {
        IoclParser.equalityExpCS_return retval = new IoclParser.equalityExpCS_return();
        retval.start = input.LT(1);
        int equalityExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set6=null;
        IoclParser.relationalExpCS_return relationalExpCS5 = null;

        IoclParser.relationalExpCS_return relationalExpCS7 = null;


        Object set6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:47:2: ( relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:47:4: relationalExpCS ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS208);
            relationalExpCS5=relationalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS5.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:47:20: ( ( EQUAL | NOT_EQUAL ) relationalExpCS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==EQUAL||LA2_0==NOT_EQUAL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:47:21: ( EQUAL | NOT_EQUAL ) relationalExpCS
            	    {
            	    set6=(Token)input.LT(1);
            	    set6=(Token)input.LT(1);
            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set6), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS220);
            	    relationalExpCS7=relationalExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpCS7.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:50:1: relationalExpCS : additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* ;
    public final IoclParser.relationalExpCS_return relationalExpCS() throws RecognitionException {
        IoclParser.relationalExpCS_return retval = new IoclParser.relationalExpCS_return();
        retval.start = input.LT(1);
        int relationalExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set9=null;
        IoclParser.additiveExpCS_return additiveExpCS8 = null;

        IoclParser.additiveExpCS_return additiveExpCS10 = null;


        Object set9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:51:2: ( additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:51:4: additiveExpCS ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS233);
            additiveExpCS8=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS8.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:51:18: ( ( LT | LTE | GT | GTE ) additiveExpCS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=GT && LA3_0<=LTE)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:51:19: ( LT | LTE | GT | GTE ) additiveExpCS
            	    {
            	    set9=(Token)input.LT(1);
            	    set9=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GT && input.LA(1)<=LTE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set9), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS253);
            	    additiveExpCS10=additiveExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpCS10.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:54:1: additiveExpCS : multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* ;
    public final IoclParser.additiveExpCS_return additiveExpCS() throws RecognitionException {
        IoclParser.additiveExpCS_return retval = new IoclParser.additiveExpCS_return();
        retval.start = input.LT(1);
        int additiveExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set12=null;
        IoclParser.multiplicativeExpCS_return multiplicativeExpCS11 = null;

        IoclParser.multiplicativeExpCS_return multiplicativeExpCS13 = null;


        Object set12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:55:2: ( multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:55:4: multiplicativeExpCS ( ( PLUS | MINUS ) multiplicativeExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS266);
            multiplicativeExpCS11=multiplicativeExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS11.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:55:24: ( ( PLUS | MINUS ) multiplicativeExpCS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:55:25: ( PLUS | MINUS ) multiplicativeExpCS
            	    {
            	    set12=(Token)input.LT(1);
            	    set12=(Token)input.LT(1);
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set12), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS278);
            	    multiplicativeExpCS13=multiplicativeExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpCS13.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:58:1: multiplicativeExpCS : unaryExpCS ( ( MULT | DIV ) unaryExpCS )* ;
    public final IoclParser.multiplicativeExpCS_return multiplicativeExpCS() throws RecognitionException {
        IoclParser.multiplicativeExpCS_return retval = new IoclParser.multiplicativeExpCS_return();
        retval.start = input.LT(1);
        int multiplicativeExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set15=null;
        IoclParser.unaryExpCS_return unaryExpCS14 = null;

        IoclParser.unaryExpCS_return unaryExpCS16 = null;


        Object set15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:59:2: ( unaryExpCS ( ( MULT | DIV ) unaryExpCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:59:4: unaryExpCS ( ( MULT | DIV ) unaryExpCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS291);
            unaryExpCS14=unaryExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS14.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:59:15: ( ( MULT | DIV ) unaryExpCS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DIV||LA5_0==MULT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:59:16: ( MULT | DIV ) unaryExpCS
            	    {
            	    set15=(Token)input.LT(1);
            	    set15=(Token)input.LT(1);
            	    if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set15), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS304);
            	    unaryExpCS16=unaryExpCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS16.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:62:1: unaryExpCS : ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS );
    public final IoclParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IoclParser.unaryExpCS_return retval = new IoclParser.unaryExpCS_return();
        retval.start = input.LT(1);
        int unaryExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token set17=null;
        IoclParser.unaryExpCS_return unaryExpCS18 = null;

        IoclParser.dotArrowExpCS_return dotArrowExpCS19 = null;


        Object set17_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:63:2: ( ( MINUS | NOT ) unaryExpCS | dotArrowExpCS )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=MINUS && LA6_0<=NOT)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=NUMERIC_OPERATION && LA6_0<=REAL_LITERAL)||LA6_0==35) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:63:4: ( MINUS | NOT ) unaryExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    set17=(Token)input.LT(1);
                    set17=(Token)input.LT(1);
                    if ( (input.LA(1)>=MINUS && input.LA(1)<=NOT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set17), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS326);
                    unaryExpCS18=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpCS18.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:64:4: dotArrowExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS331);
                    dotArrowExpCS19=dotArrowExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExpCS19.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:67:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | oclExpCS ( ( DOT | ARROW ) propertyCallExp )* | oclExpCS );
    public final IoclParser.dotArrowExpCS_return dotArrowExpCS() throws RecognitionException {
        IoclParser.dotArrowExpCS_return retval = new IoclParser.dotArrowExpCS_return();
        retval.start = input.LT(1);
        int dotArrowExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        Token set25=null;
        IoclParser.argumentsCS_return argumentsCS22 = null;

        IoclParser.oclExpCS_return oclExpCS24 = null;

        IoclParser.propertyCallExp_return propertyCallExp26 = null;

        IoclParser.oclExpCS_return oclExpCS27 = null;


        Object NUMERIC_OPERATION20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object set25_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleSubtreeStream stream_argumentsCS=new RewriteRuleSubtreeStream(adaptor,"rule argumentsCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:68:2: ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | oclExpCS ( ( DOT | ARROW ) propertyCallExp )* | oclExpCS )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:68:4: NUMERIC_OPERATION '(' ( argumentsCS )? ')'
                    {
                    NUMERIC_OPERATION20=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION20);

                    char_literal21=(Token)match(input,35,FOLLOW_35_in_dotArrowExpCS344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal21);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:68:26: ( argumentsCS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=MINUS && LA7_0<=NOT)||(LA7_0>=NUMERIC_OPERATION && LA7_0<=REAL_LITERAL)||LA7_0==35) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS346);
                            argumentsCS22=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentsCS.add(argumentsCS22.getTree());

                            }
                            break;

                    }

                    char_literal23=(Token)match(input,36,FOLLOW_36_in_dotArrowExpCS349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal23);



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
                    // 68:43: -> ^( NUMERIC_OPERATION ( argumentsCS )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:68:46: ^( NUMERIC_OPERATION ( argumentsCS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:68:66: ( argumentsCS )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:4: oclExpCS ( ( DOT | ARROW ) propertyCallExp )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS363);
                    oclExpCS24=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpCS24.getTree());
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:13: ( ( DOT | ARROW ) propertyCallExp )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ARROW||LA8_0==DOT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:14: ( DOT | ARROW ) propertyCallExp
                    	    {
                    	    set25=(Token)input.LT(1);
                    	    set25=(Token)input.LT(1);
                    	    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set25), root_0);
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS375);
                    	    propertyCallExp26=propertyCallExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyCallExp26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:70:4: oclExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS382);
                    oclExpCS27=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpCS27.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:73:1: oclExpCS : ( literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS );
    public final IoclParser.oclExpCS_return oclExpCS() throws RecognitionException {
        IoclParser.oclExpCS_return retval = new IoclParser.oclExpCS_return();
        retval.start = input.LT(1);
        int oclExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal31=null;
        IoclParser.literalExpCS_return literalExpCS28 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS30 = null;


        Object char_literal29_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_oclExpressionCS=new RewriteRuleSubtreeStream(adaptor,"rule oclExpressionCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:74:2: ( literalExpCS | '(' oclExpressionCS ')' -> oclExpressionCS )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=COLLECTION_TYPE_LITERAL && LA10_0<=REAL_LITERAL)) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:74:4: literalExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExpCS_in_oclExpCS393);
                    literalExpCS28=literalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExpCS28.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:75:4: '(' oclExpressionCS ')'
                    {
                    char_literal29=(Token)match(input,35,FOLLOW_35_in_oclExpCS398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal29);

                    pushFollow(FOLLOW_oclExpressionCS_in_oclExpCS400);
                    oclExpressionCS30=oclExpressionCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpressionCS.add(oclExpressionCS30.getTree());
                    char_literal31=(Token)match(input,36,FOLLOW_36_in_oclExpCS402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal31);



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
                    // 75:28: -> oclExpressionCS
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

    public static class literalExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:78:1: literalExpCS : ( collectionLiteralExpCS | primitiveLiteralExpCS );
    public final IoclParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IoclParser.literalExpCS_return retval = new IoclParser.literalExpCS_return();
        retval.start = input.LT(1);
        int literalExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS32 = null;

        IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS33 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:79:2: ( collectionLiteralExpCS | primitiveLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:79:4: collectionLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS420);
                    collectionLiteralExpCS32=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExpCS32.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:80:4: primitiveLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS426);
                    primitiveLiteralExpCS33=primitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExpCS33.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, literalExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExpCS"

    public static class collectionLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:83:1: collectionLiteralExpCS : collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) ;
    public final IoclParser.collectionLiteralExpCS_return collectionLiteralExpCS() throws RecognitionException {
        IoclParser.collectionLiteralExpCS_return retval = new IoclParser.collectionLiteralExpCS_return();
        retval.start = input.LT(1);
        int collectionLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS34 = null;

        IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS36 = null;


        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifierCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifierCS");
        RewriteRuleSubtreeStream stream_collectionLiteralPartsCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartsCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:2: ( collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:4: collectionTypeIdentifierCS '{' ( collectionLiteralPartsCS )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS437);
            collectionTypeIdentifierCS34=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifierCS.add(collectionTypeIdentifierCS34.getTree());
            char_literal35=(Token)match(input,37,FOLLOW_37_in_collectionLiteralExpCS439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(char_literal35);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:35: ( collectionLiteralPartsCS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=MINUS && LA12_0<=NOT)||(LA12_0>=NUMERIC_OPERATION && LA12_0<=REAL_LITERAL)||LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS441);
                    collectionLiteralPartsCS36=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralPartsCS.add(collectionLiteralPartsCS36.getTree());

                    }
                    break;

            }

            char_literal37=(Token)match(input,38,FOLLOW_38_in_collectionLiteralExpCS444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal37);



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
            // 84:65: -> ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:68: ^( COLLECTION_LITERAL collectionTypeIdentifierCS ( collectionLiteralPartsCS )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifierCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:84:116: ( collectionLiteralPartsCS )?
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
            if ( state.backtracking>0 ) { memoize(input, 11, collectionLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExpCS"

    public static class collectionTypeIdentifierCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifierCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:87:1: collectionTypeIdentifierCS : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IoclParser.collectionTypeIdentifierCS_return retval = new IoclParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifierCS_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL38=null;

        Object COLLECTION_TYPE_LITERAL38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:88:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL38=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL38_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL38);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL38_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 12, collectionTypeIdentifierCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifierCS"

    public static class collectionLiteralPartsCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartsCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:91:1: collectionLiteralPartsCS : collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) ;
    public final IoclParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IoclParser.collectionLiteralPartsCS_return retval = new IoclParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal40=null;
        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS39 = null;

        IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS41 = null;


        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_collectionLiteralPartCS=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralPartCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:2: ( collectionLiteralPartCS ( ',' collectionLiteralPartCS )* -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:4: collectionLiteralPartCS ( ',' collectionLiteralPartCS )*
            {
            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS477);
            collectionLiteralPartCS39=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(collectionLiteralPartCS39.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:28: ( ',' collectionLiteralPartCS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:29: ',' collectionLiteralPartCS
            	    {
            	    char_literal40=(Token)match(input,39,FOLLOW_39_in_collectionLiteralPartsCS480); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_39.add(char_literal40);

            	    pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS482);
            	    collectionLiteralPartCS41=collectionLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_collectionLiteralPartCS.add(collectionLiteralPartCS41.getTree());

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
            // 92:59: -> ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:62: ^( COLLECTION_LITERAL_PARTS collectionLiteralPartCS ( collectionLiteralPartCS )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL_PARTS, "COLLECTION_LITERAL_PARTS"), root_1);

                adaptor.addChild(root_1, stream_collectionLiteralPartCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:92:113: ( collectionLiteralPartCS )*
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
            if ( state.backtracking>0 ) { memoize(input, 13, collectionLiteralPartsCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartsCS"

    public static class collectionLiteralPartCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:95:1: collectionLiteralPartCS : oclExpressionCS ;
    public final IoclParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IoclParser.collectionLiteralPartCS_return retval = new IoclParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);
        int collectionLiteralPartCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS42 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:2: ( oclExpressionCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:96:4: oclExpressionCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS506);
            oclExpressionCS42=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS42.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, collectionLiteralPartCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartCS"

    public static class primitiveLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:99:1: primitiveLiteralExpCS : ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS );
    public final IoclParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IoclParser.primitiveLiteralExpCS_return retval = new IoclParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);
        int primitiveLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExpCS_return numericLiteralExpCS43 = null;

        IoclParser.stringLiteralExpCS_return stringLiteralExpCS44 = null;

        IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS45 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:2: ( numericLiteralExpCS | stringLiteralExpCS | booleanLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:100:4: numericLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS517);
                    numericLiteralExpCS43=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExpCS43.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:101:4: stringLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS522);
                    stringLiteralExpCS44=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExpCS44.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:102:4: booleanLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS527);
                    booleanLiteralExpCS45=booleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExpCS45.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, primitiveLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExpCS"

    public static class numericLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:105:1: numericLiteralExpCS : ( integerLiteralExpCS | realLiteralExpCS );
    public final IoclParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IoclParser.numericLiteralExpCS_return retval = new IoclParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);
        int numericLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExpCS_return integerLiteralExpCS46 = null;

        IoclParser.realLiteralExpCS_return realLiteralExpCS47 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:2: ( integerLiteralExpCS | realLiteralExpCS )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:106:4: integerLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS538);
                    integerLiteralExpCS46=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExpCS46.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:107:4: realLiteralExpCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS543);
                    realLiteralExpCS47=realLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExpCS47.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, numericLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExpCS"

    public static class stringLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:110:1: stringLiteralExpCS : STRING_LITERAL ;
    public final IoclParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IoclParser.stringLiteralExpCS_return retval = new IoclParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);
        int stringLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL48=null;

        Object STRING_LITERAL48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:111:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL48=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL48_tree = (Object)adaptor.create(STRING_LITERAL48);
            adaptor.addChild(root_0, STRING_LITERAL48_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 17, stringLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExpCS"

    public static class booleanLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:114:1: booleanLiteralExpCS : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IoclParser.booleanLiteralExpCS_return retval = new IoclParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);
        int booleanLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL49=null;

        Object BOOLEAN_LITERAL49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:115:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL49=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS569); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL49_tree = (Object)adaptor.create(BOOLEAN_LITERAL49);
            adaptor.addChild(root_0, BOOLEAN_LITERAL49_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, booleanLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExpCS"

    public static class integerLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:118:1: integerLiteralExpCS : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IoclParser.integerLiteralExpCS_return retval = new IoclParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);
        int integerLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL50=null;

        Object INTEGER_LITERAL50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:119:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL50=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS580); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL50_tree = (Object)adaptor.create(INTEGER_LITERAL50);
            adaptor.addChild(root_0, INTEGER_LITERAL50_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 19, integerLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExpCS"

    public static class realLiteralExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:122:1: realLiteralExpCS : REAL_LITERAL ;
    public final IoclParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IoclParser.realLiteralExpCS_return retval = new IoclParser.realLiteralExpCS_return();
        retval.start = input.LT(1);
        int realLiteralExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL51=null;

        Object REAL_LITERAL51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:123:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL51=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS592); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL51_tree = (Object)adaptor.create(REAL_LITERAL51);
            adaptor.addChild(root_0, REAL_LITERAL51_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 20, realLiteralExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExpCS"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:126:1: propertyCallExp : modelPropertyCallExp ;
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.modelPropertyCallExp_return modelPropertyCallExp52 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:2: ( modelPropertyCallExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:127:4: modelPropertyCallExp
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp603);
            modelPropertyCallExp52=modelPropertyCallExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp52.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:130:1: modelPropertyCallExp : operationCallExpCS ;
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExpCS_return operationCallExpCS53 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:2: ( operationCallExpCS )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:131:4: operationCallExpCS
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp614);
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
            if ( state.backtracking>0 ) { memoize(input, 22, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExpCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExpCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:134:1: operationCallExpCS : simpleNameCS '(' ( argumentsCS )? ')' -> simpleNameCS ( argumentsCS )? ;
    public final IoclParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IoclParser.operationCallExpCS_return retval = new IoclParser.operationCallExpCS_return();
        retval.start = input.LT(1);
        int operationCallExpCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        IoclParser.simpleNameCS_return simpleNameCS54 = null;

        IoclParser.argumentsCS_return argumentsCS56 = null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_simpleNameCS=new RewriteRuleSubtreeStream(adaptor,"rule simpleNameCS");
        RewriteRuleSubtreeStream stream_argumentsCS=new RewriteRuleSubtreeStream(adaptor,"rule argumentsCS");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:2: ( simpleNameCS '(' ( argumentsCS )? ')' -> simpleNameCS ( argumentsCS )? )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:4: simpleNameCS '(' ( argumentsCS )? ')'
            {
            pushFollow(FOLLOW_simpleNameCS_in_operationCallExpCS625);
            simpleNameCS54=simpleNameCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleNameCS.add(simpleNameCS54.getTree());
            char_literal55=(Token)match(input,35,FOLLOW_35_in_operationCallExpCS627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(char_literal55);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:21: ( argumentsCS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=MINUS && LA16_0<=NOT)||(LA16_0>=NUMERIC_OPERATION && LA16_0<=REAL_LITERAL)||LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:0:0: argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS629);
                    argumentsCS56=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentsCS.add(argumentsCS56.getTree());

                    }
                    break;

            }

            char_literal57=(Token)match(input,36,FOLLOW_36_in_operationCallExpCS632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal57);



            // AST REWRITE
            // elements: argumentsCS, simpleNameCS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:38: -> simpleNameCS ( argumentsCS )?
            {
                adaptor.addChild(root_0, stream_simpleNameCS.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:135:54: ( argumentsCS )?
                if ( stream_argumentsCS.hasNext() ) {
                    adaptor.addChild(root_0, stream_argumentsCS.nextTree());

                }
                stream_argumentsCS.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 23, operationCallExpCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExpCS"

    public static class simpleNameCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleNameCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:138:1: simpleNameCS : ( primitiveTypeCS | 'self' | IDENTIFIER );
    public final IoclParser.simpleNameCS_return simpleNameCS() throws RecognitionException {
        IoclParser.simpleNameCS_return retval = new IoclParser.simpleNameCS_return();
        retval.start = input.LT(1);
        int simpleNameCS_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal59=null;
        Token IDENTIFIER60=null;
        IoclParser.primitiveTypeCS_return primitiveTypeCS58 = null;


        Object string_literal59_tree=null;
        Object IDENTIFIER60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:139:2: ( primitiveTypeCS | 'self' | IDENTIFIER )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case IDENTIFIER:
                {
                alt17=3;
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:139:4: primitiveTypeCS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveTypeCS_in_simpleNameCS650);
                    primitiveTypeCS58=primitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypeCS58.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:140:4: 'self'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal59=(Token)match(input,40,FOLLOW_40_in_simpleNameCS655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal59_tree = (Object)adaptor.create(string_literal59);
                    adaptor.addChild(root_0, string_literal59_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:141:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
                    adaptor.addChild(root_0, IDENTIFIER60_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 24, simpleNameCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleNameCS"

    public static class primitiveTypeCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveTypeCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:144:1: primitiveTypeCS : 'Integer' ;
    public final IoclParser.primitiveTypeCS_return primitiveTypeCS() throws RecognitionException {
        IoclParser.primitiveTypeCS_return retval = new IoclParser.primitiveTypeCS_return();
        retval.start = input.LT(1);
        int primitiveTypeCS_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal61=null;

        Object string_literal61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:145:2: ( 'Integer' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:145:4: 'Integer'
            {
            root_0 = (Object)adaptor.nil();

            string_literal61=(Token)match(input,41,FOLLOW_41_in_primitiveTypeCS671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, primitiveTypeCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveTypeCS"

    public static class argumentsCS_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsCS"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:148:1: argumentsCS : oclExpressionCS ( ',' oclExpressionCS )* ;
    public final IoclParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IoclParser.argumentsCS_return retval = new IoclParser.argumentsCS_return();
        retval.start = input.LT(1);
        int argumentsCS_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal63=null;
        IoclParser.oclExpressionCS_return oclExpressionCS62 = null;

        IoclParser.oclExpressionCS_return oclExpressionCS64 = null;


        Object char_literal63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:2: ( oclExpressionCS ( ',' oclExpressionCS )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:4: oclExpressionCS ( ',' oclExpressionCS )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS683);
            oclExpressionCS62=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS62.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:20: ( ',' oclExpressionCS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:149:21: ',' oclExpressionCS
            	    {
            	    char_literal63=(Token)match(input,39,FOLLOW_39_in_argumentsCS686); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS689);
            	    oclExpressionCS64=oclExpressionCS();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS64.getTree());

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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, argumentsCS_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "argumentsCS"

    // $ANTLR start synpred20_Iocl
    public final void synpred20_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:4: ( oclExpCS ( ( DOT | ARROW ) propertyCallExp )* )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:4: oclExpCS ( ( DOT | ARROW ) propertyCallExp )*
        {
        pushFollow(FOLLOW_oclExpCS_in_synpred20_Iocl363);
        oclExpCS();

        state._fsp--;
        if (state.failed) return ;
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:13: ( ( DOT | ARROW ) propertyCallExp )*
        loop20:
        do {
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARROW||LA20_0==DOT) ) {
                alt20=1;
            }


            switch (alt20) {
        	case 1 :
        	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:69:14: ( DOT | ARROW ) propertyCallExp
        	    {
        	    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_propertyCallExp_in_synpred20_Iocl375);
        	    propertyCallExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop20;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred20_Iocl

    // Delegated rules

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


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\26\1\uffff\6\0\2\uffff";
    static final String DFA9_maxS =
        "\1\43\1\uffff\6\0\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA9_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\5\1\6\1\3\1\4\7\uffff\1\7",
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
            return "67:1: dotArrowExpCS : ( NUMERIC_OPERATION '(' ( argumentsCS )? ')' -> ^( NUMERIC_OPERATION ( argumentsCS )? ) | oclExpCS ( ( DOT | ARROW ) propertyCallExp )* | oclExpCS );";
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
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_7);
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
 

    public static final BitSet FOLLOW_logicalExpCS_in_oclExpressionCS168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS179 = new BitSet(new long[]{0x0000000000280012L});
    public static final BitSet FOLLOW_set_in_logicalExpCS182 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS195 = new BitSet(new long[]{0x0000000000280012L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS208 = new BitSet(new long[]{0x0000000000020402L});
    public static final BitSet FOLLOW_set_in_equalityExpCS211 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS220 = new BitSet(new long[]{0x0000000000020402L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS233 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_set_in_relationalExpCS236 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS253 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS266 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS269 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS278 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS291 = new BitSet(new long[]{0x0000000000040102L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS294 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS304 = new BitSet(new long[]{0x0000000000040102L});
    public static final BitSet FOLLOW_set_in_unaryExpCS317 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS342 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_dotArrowExpCS344 = new BitSet(new long[]{0x000000180FC18000L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS346 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dotArrowExpCS349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS363 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_set_in_dotArrowExpCS366 = new BitSet(new long[]{0x0000030010000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS375 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_oclExpCS398 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_oclExpressionCS_in_oclExpCS400 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_oclExpCS402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS437 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_collectionLiteralExpCS439 = new BitSet(new long[]{0x000000480FC18000L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS441 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_collectionLiteralExpCS444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS477 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_collectionLiteralPartsCS480 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS482 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_operationCallExpCS625 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_operationCallExpCS627 = new BitSet(new long[]{0x000000180FC18000L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS629 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_operationCallExpCS632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypeCS_in_simpleNameCS650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_simpleNameCS655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_primitiveTypeCS671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS683 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_argumentsCS686 = new BitSet(new long[]{0x000000080FC18000L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS689 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_synpred20_Iocl363 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_set_in_synpred20_Iocl366 = new BitSet(new long[]{0x0000030010000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred20_Iocl375 = new BitSet(new long[]{0x0000000000000222L});

}