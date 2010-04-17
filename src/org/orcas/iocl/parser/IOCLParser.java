// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-04-17 17:41:33

package org.orcas.iocl.parser;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.ArgumentsCS;
import org.orcas.iocl.cst.BooleanLiteralExpCS; 
import org.orcas.iocl.cst.CollectionLiteralExpCS;
import org.orcas.iocl.cst.CollectionLiteralPartCS;
import org.orcas.iocl.cst.CollectionLiteralPartsCS;
import org.orcas.iocl.cst.CollectionTypeIdentifierCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.orcas.iocl.cst.ModelPropertyCallExpCS;
import org.orcas.iocl.cst.NodeCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.PropertyCallExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.SimpleNameCS;
import org.orcas.iocl.cst.SimpleTypeEnum;
import org.orcas.iocl.cst.StringLiteralExpCS;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class IOCLParser extends IOCLBaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "BINARY_OPERATOR", "IDENTIFIER", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'+'", "'-'", "'*'", "'/'", "'not'", "'{'", "'}'", "','", "'->'", "'.'", "'('", "')'", "'self'", "'Integer'"
    };
    public static final int EXPONENT=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=15;
    public static final int T__20=20;
    public static final int OCTAL_ESC=16;
    public static final int HEX_DIGIT=14;
    public static final int BINARY_OPERATOR=9;
    public static final int EOF=-1;
    public static final int BOOLEAN_LITERAL=6;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int WS=13;
    public static final int ESC_SEQ=12;
    public static final int STRING_LITERAL=5;
    public static final int T__18=18;
    public static final int REAL_LITERAL=8;
    public static final int T__17=17;
    public static final int COLLECTION_TYPE_LITERAL=4;
    public static final int IDENTIFIER=10;
    public static final int INTEGER_LITERAL=7;

    // delegates
    // delegators


        public IOCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IOCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IOCLParser.tokenNames; }
    public String getGrammarFileName() { return "IOCL.g"; }


    public static class ioclExpressionCS_return extends ParserRuleReturnScope {
        public IOCLExpressionCS ioclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ioclExpressionCS"
    // IOCL.g:42:1: ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.ioclExpressionCS_return ioclExpressionCS() throws RecognitionException {
        IOCLParser.ioclExpressionCS_return retval = new IOCLParser.ioclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:43:2: (ocle= oclExpressionCS )
            // IOCL.g:43:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_ioclExpressionCS59);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.ioclExpressionCS = (ocle!=null?ocle.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ioclExpressionCS"

    public static class oclExpressionCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpressionCS"
    // IOCL.g:46:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : ie= impliesExpCS ;
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.impliesExpCS_return ie = null;



        try {
            // IOCL.g:47:2: (ie= impliesExpCS )
            // IOCL.g:47:4: ie= impliesExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_impliesExpCS_in_oclExpressionCS80);
            ie=impliesExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ie.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (ie!=null?ie.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oclExpressionCS"

    public static class impliesExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "impliesExpCS"
    // IOCL.g:50:1: impliesExpCS returns [OCLExpressionCS oclExpressionCS] : le= logicalExpCS ;
    public final IOCLParser.impliesExpCS_return impliesExpCS() throws RecognitionException {
        IOCLParser.impliesExpCS_return retval = new IOCLParser.impliesExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.logicalExpCS_return le = null;



        try {
            // IOCL.g:51:2: (le= logicalExpCS )
            // IOCL.g:51:4: le= logicalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_logicalExpCS_in_impliesExpCS103);
            le=logicalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, le.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (le!=null?le.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "impliesExpCS"

    public static class logicalExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalExpCS"
    // IOCL.g:54:1: logicalExpCS returns [OCLExpressionCS oclExpressionCS] : ee= equalityExpCS ;
    public final IOCLParser.logicalExpCS_return logicalExpCS() throws RecognitionException {
        IOCLParser.logicalExpCS_return retval = new IOCLParser.logicalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.equalityExpCS_return ee = null;



        try {
            // IOCL.g:55:2: (ee= equalityExpCS )
            // IOCL.g:55:4: ee= equalityExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS125);
            ee=equalityExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ee.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (ee!=null?ee.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalExpCS"

    public static class equalityExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpCS"
    // IOCL.g:58:1: equalityExpCS returns [OCLExpressionCS oclExpressionCS] : rele= relationalExpCS ;
    public final IOCLParser.equalityExpCS_return equalityExpCS() throws RecognitionException {
        IOCLParser.equalityExpCS_return retval = new IOCLParser.equalityExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.relationalExpCS_return rele = null;



        try {
            // IOCL.g:59:2: (rele= relationalExpCS )
            // IOCL.g:59:4: rele= relationalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS146);
            rele=relationalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rele.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (rele!=null?rele.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpCS"

    public static class relationalExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpCS"
    // IOCL.g:62:1: relationalExpCS returns [OCLExpressionCS oclExpressionCS] : ie= ifExpCSPrec ;
    public final IOCLParser.relationalExpCS_return relationalExpCS() throws RecognitionException {
        IOCLParser.relationalExpCS_return retval = new IOCLParser.relationalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.ifExpCSPrec_return ie = null;



        try {
            // IOCL.g:63:2: (ie= ifExpCSPrec )
            // IOCL.g:63:4: ie= ifExpCSPrec
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_ifExpCSPrec_in_relationalExpCS169);
            ie=ifExpCSPrec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ie.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (ie!=null?ie.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpCS"

    public static class ifExpCSPrec_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExpCSPrec"
    // IOCL.g:66:1: ifExpCSPrec returns [OCLExpressionCS oclExpressionCS] : ae= additiveExpCS ;
    public final IOCLParser.ifExpCSPrec_return ifExpCSPrec() throws RecognitionException {
        IOCLParser.ifExpCSPrec_return retval = new IOCLParser.ifExpCSPrec_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.additiveExpCS_return ae = null;



        try {
            // IOCL.g:67:2: (ae= additiveExpCS )
            // IOCL.g:67:4: ae= additiveExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_ifExpCSPrec190);
            ae=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ae.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (ae!=null?ae.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifExpCSPrec"

    public static class additiveExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpCS"
    // IOCL.g:70:1: additiveExpCS returns [OCLExpressionCS oclExpressionCS] : (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ | me= multiplicativeExpCS );
    public final IOCLParser.additiveExpCS_return additiveExpCS() throws RecognitionException {
        IOCLParser.additiveExpCS_return retval = new IOCLParser.additiveExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.multiplicativeExpCS_return me1 = null;

        IOCLParser.multiplicativeExpCS_return me2 = null;

        IOCLParser.multiplicativeExpCS_return me = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:71:2: (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ | me= multiplicativeExpCS )
            int alt2=2;
            switch ( input.LA(1) ) {
            case COLLECTION_TYPE_LITERAL:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER_LITERAL:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA2_3 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN_LITERAL:
                {
                int LA2_5 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
            case 21:
                {
                int LA2_6 = input.LA(2);

                if ( (synpred3_IOCL()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // IOCL.g:71:4: me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS212);
                    me1=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (me1!=null?me1.oclExpressionCS:null); 
                    }
                    // IOCL.g:71:75: (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // IOCL.g:71:76: op= ( '+' | '-' ) me2= multiplicativeExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=17 && input.LA(1)<=18) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS231);
                    	    me2=multiplicativeExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, me2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.oclExpressionCS = createOperationCallExpCS(me1.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), me2.oclExpressionCS); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:72:4: me= multiplicativeExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS244);
                    me=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, me.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (me!=null?me.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpCS"

    public static class multiplicativeExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpCS"
    // IOCL.g:75:1: multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS] : (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ | ue= unaryExpCS );
    public final IOCLParser.multiplicativeExpCS_return multiplicativeExpCS() throws RecognitionException {
        IOCLParser.multiplicativeExpCS_return retval = new IOCLParser.multiplicativeExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.unaryExpCS_return ue1 = null;

        IOCLParser.unaryExpCS_return ue2 = null;

        IOCLParser.unaryExpCS_return ue = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:76:2: (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ | ue= unaryExpCS )
            int alt4=2;
            switch ( input.LA(1) ) {
            case COLLECTION_TYPE_LITERAL:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER_LITERAL:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN_LITERAL:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
            case 21:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred6_IOCL()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // IOCL.g:76:4: ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS265);
                    ue1=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue1.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ue1!=null?ue1.oclExpressionCS:null); 
                    }
                    // IOCL.g:76:66: (op= ( '*' | '/' ) ue2= unaryExpCS )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // IOCL.g:76:68: op= ( '*' | '/' ) ue2= unaryExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=19 && input.LA(1)<=20) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS285);
                    	    ue2=unaryExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.oclExpressionCS = createOperationCallExpCS(ue1.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), ue2.oclExpressionCS); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:77:4: ue= unaryExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS299);
                    ue=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ue!=null?ue.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpCS"

    public static class unaryExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpCS"
    // IOCL.g:80:1: unaryExpCS returns [OCLExpressionCS oclExpressionCS] : (dae= dotArrowExpCS | op= ( '+' | '-' | 'not' ) ue= unaryExpCS );
    public final IOCLParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IOCLParser.unaryExpCS_return retval = new IOCLParser.unaryExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.dotArrowExpCS_return dae = null;

        IOCLParser.unaryExpCS_return ue = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:81:2: (dae= dotArrowExpCS | op= ( '+' | '-' | 'not' ) ue= unaryExpCS )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=COLLECTION_TYPE_LITERAL && LA5_0<=REAL_LITERAL)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=17 && LA5_0<=18)||LA5_0==21) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // IOCL.g:81:4: dae= dotArrowExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS320);
                    dae=dotArrowExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dae.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (dae!=null?dae.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:82:4: op= ( '+' | '-' | 'not' ) ue= unaryExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=17 && input.LA(1)<=18)||input.LA(1)==21 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS343);
                    ue=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS((ue!=null?ue.oclExpressionCS:null), createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)) ); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpCS"

    public static class dotArrowExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotArrowExpCS"
    // IOCL.g:85:1: dotArrowExpCS returns [OCLExpressionCS oclExpressionCS] : (ocle= oclExpCS | ocle= oclExpCS pce= propertyCallExp );
    public final IOCLParser.dotArrowExpCS_return dotArrowExpCS() throws RecognitionException {
        IOCLParser.dotArrowExpCS_return retval = new IOCLParser.dotArrowExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpCS_return ocle = null;

        IOCLParser.propertyCallExp_return pce = null;



        try {
            // IOCL.g:86:2: (ocle= oclExpCS | ocle= oclExpCS pce= propertyCallExp )
            int alt6=2;
            switch ( input.LA(1) ) {
            case COLLECTION_TYPE_LITERAL:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred10_IOCL()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER_LITERAL:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred10_IOCL()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred10_IOCL()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA6_4 = input.LA(2);

                if ( (synpred10_IOCL()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN_LITERAL:
                {
                int LA6_5 = input.LA(2);

                if ( (synpred10_IOCL()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // IOCL.g:86:4: ocle= oclExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS364);
                    ocle=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ocle!=null?ocle.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:87:4: ocle= oclExpCS pce= propertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS375);
                    ocle=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS381);
                    pce=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pce.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = setOperationCallExpCSSource((ocle!=null?ocle.oclExpressionCS:null), (pce!=null?pce.oclExpressionCS:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dotArrowExpCS"

    public static class oclExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExpCS"
    // IOCL.g:90:1: oclExpCS returns [OCLExpressionCS oclExpressionCS] : le= literalExpCS ;
    public final IOCLParser.oclExpCS_return oclExpCS() throws RecognitionException {
        IOCLParser.oclExpCS_return retval = new IOCLParser.oclExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:91:2: (le= literalExpCS )
            // IOCL.g:91:4: le= literalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_literalExpCS_in_oclExpCS402);
            le=literalExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, le.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (le!=null?le.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oclExpCS"

    public static class literalExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExpCS"
    // IOCL.g:94:1: literalExpCS returns [OCLExpressionCS oclExpressionCS] : (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS );
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.collectionLiteralExpCS_return cle = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:95:2: (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLLECTION_TYPE_LITERAL) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=STRING_LITERAL && LA7_0<=REAL_LITERAL)) ) {
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
                    // IOCL.g:95:4: cle= collectionLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS423);
                    cle=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (cle!=null?cle.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:96:4: ple= primitiveLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS434);
                    ple=primitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ple.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ple!=null?ple.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literalExpCS"

    public static class collectionLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExpCS"
    // IOCL.g:99:1: collectionLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' ;
    public final IOCLParser.collectionLiteralExpCS_return collectionLiteralExpCS() throws RecognitionException {
        IOCLParser.collectionLiteralExpCS_return retval = new IOCLParser.collectionLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal1=null;
        Token char_literal2=null;
        IOCLParser.collectionTypeIdentifierCS_return cti = null;

        IOCLParser.collectionLiteralPartsCS_return clpts = null;


        NodeCS char_literal1_tree=null;
        NodeCS char_literal2_tree=null;

        try {
            // IOCL.g:100:2: (cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' )
            // IOCL.g:100:4: cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS455);
            cti=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cti.getTree());
            char_literal1=(Token)match(input,22,FOLLOW_22_in_collectionLiteralExpCS457); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal1_tree = (NodeCS)adaptor.create(char_literal1);
            adaptor.addChild(root_0, char_literal1_tree);
            }
            // IOCL.g:100:47: (clpts= collectionLiteralPartsCS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=COLLECTION_TYPE_LITERAL && LA8_0<=REAL_LITERAL)||(LA8_0>=17 && LA8_0<=18)||LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // IOCL.g:0:0: clpts= collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS463);
                    clpts=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, clpts.getTree());

                    }
                    break;

            }

            char_literal2=(Token)match(input,23,FOLLOW_23_in_collectionLiteralExpCS467); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal2_tree = (NodeCS)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionLiteralExpCS((cti!=null?cti.oclExpressionCS:null), (clpts!=null?clpts.oclExpressionCS:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExpCS"

    public static class collectionTypeIdentifierCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifierCS"
    // IOCL.g:103:1: collectionTypeIdentifierCS returns [OCLExpressionCS oclExpressionCS] : COLLECTION_TYPE_LITERAL ;
    public final IOCLParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IOCLParser.collectionTypeIdentifierCS_return retval = new IOCLParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token COLLECTION_TYPE_LITERAL3=null;

        NodeCS COLLECTION_TYPE_LITERAL3_tree=null;

        try {
            // IOCL.g:104:2: ( COLLECTION_TYPE_LITERAL )
            // IOCL.g:104:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            COLLECTION_TYPE_LITERAL3=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS485); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL3_tree = (NodeCS)adaptor.create(COLLECTION_TYPE_LITERAL3);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL3_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionTypeIdentifierCS(COLLECTION_TYPE_LITERAL3, (COLLECTION_TYPE_LITERAL3!=null?COLLECTION_TYPE_LITERAL3.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifierCS"

    public static class collectionLiteralPartsCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartsCS"
    // IOCL.g:107:1: collectionLiteralPartsCS returns [OCLExpressionCS oclExpressionCS] : clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? ;
    public final IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartsCS_return retval = new IOCLParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal4=null;
        IOCLParser.collectionLiteralPartCS_return clpe = null;

        IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS5 = null;


        NodeCS char_literal4_tree=null;

        try {
            // IOCL.g:108:2: (clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? )
            // IOCL.g:108:4: clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS506);
            clpe=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, clpe.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionLiteralPartsCS((clpe!=null?clpe.oclExpressionCS:null)); 
            }
            // IOCL.g:108:113: ( ',' collectionLiteralPartsCS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // IOCL.g:108:114: ',' collectionLiteralPartsCS
                    {
                    char_literal4=(Token)match(input,24,FOLLOW_24_in_collectionLiteralPartsCS511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal4_tree = (NodeCS)adaptor.create(char_literal4);
                    adaptor.addChild(root_0, char_literal4_tree);
                    }
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS513);
                    collectionLiteralPartsCS5=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPartsCS5.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartsCS"

    public static class collectionLiteralPartCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartCS"
    // IOCL.g:111:1: collectionLiteralPartCS returns [OCLExpressionCS oclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartCS_return retval = new IOCLParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:113:2: (ocle= oclExpressionCS )
            // IOCL.g:113:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS539);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionLiteralPartCS((ocle!=null?ocle.oclExpressionCS:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPartCS"

    public static class primitiveLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExpCS"
    // IOCL.g:116:1: primitiveLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS );
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.numericLiteralExpCS_return nle = null;

        IOCLParser.stringLiteralExpCS_return sle = null;

        IOCLParser.booleanLiteralExpCS_return ble = null;



        try {
            // IOCL.g:117:2: (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS )
            int alt10=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt10=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt10=2;
                }
                break;
            case BOOLEAN_LITERAL:
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
                    // IOCL.g:117:4: nle= numericLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS562);
                    nle=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (nle!=null?nle.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:118:4: sle= stringLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS573);
                    sle=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (sle!=null?sle.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:119:4: ble= booleanLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS584);
                    ble=booleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ble.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ble!=null?ble.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExpCS"

    public static class numericLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExpCS"
    // IOCL.g:122:1: numericLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (ile= integerLiteralExpCS | rle= realLiteralExpCS );
    public final IOCLParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IOCLParser.numericLiteralExpCS_return retval = new IOCLParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.integerLiteralExpCS_return ile = null;

        IOCLParser.realLiteralExpCS_return rle = null;



        try {
            // IOCL.g:123:2: (ile= integerLiteralExpCS | rle= realLiteralExpCS )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INTEGER_LITERAL) ) {
                alt11=1;
            }
            else if ( (LA11_0==REAL_LITERAL) ) {
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
                    // IOCL.g:123:4: ile= integerLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS605);
                    ile=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ile.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ile!=null?ile.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:124:4: rle= realLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS616);
                    rle=realLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (rle!=null?rle.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExpCS"

    public static class stringLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExpCS"
    // IOCL.g:127:1: stringLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL6=null;

        NodeCS STRING_LITERAL6_tree=null;

        try {
            // IOCL.g:128:2: ( STRING_LITERAL )
            // IOCL.g:128:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL6=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS637); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL6_tree = (NodeCS)adaptor.create(STRING_LITERAL6);
            adaptor.addChild(root_0, STRING_LITERAL6_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createStringLiteralExpCS(STRING_LITERAL6, (STRING_LITERAL6!=null?STRING_LITERAL6.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExpCS"

    public static class booleanLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExpCS"
    // IOCL.g:131:1: booleanLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : BOOLEAN_LITERAL ;
    public final IOCLParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IOCLParser.booleanLiteralExpCS_return retval = new IOCLParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BOOLEAN_LITERAL7=null;

        NodeCS BOOLEAN_LITERAL7_tree=null;

        try {
            // IOCL.g:132:2: ( BOOLEAN_LITERAL )
            // IOCL.g:132:4: BOOLEAN_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            BOOLEAN_LITERAL7=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS654); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL7_tree = (NodeCS)adaptor.create(BOOLEAN_LITERAL7);
            adaptor.addChild(root_0, BOOLEAN_LITERAL7_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createBooleanLiteralExpCS(BOOLEAN_LITERAL7, (BOOLEAN_LITERAL7!=null?BOOLEAN_LITERAL7.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExpCS"

    public static class integerLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExpCS"
    // IOCL.g:135:1: integerLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : INTEGER_LITERAL ;
    public final IOCLParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IOCLParser.integerLiteralExpCS_return retval = new IOCLParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token INTEGER_LITERAL8=null;

        NodeCS INTEGER_LITERAL8_tree=null;

        try {
            // IOCL.g:136:2: ( INTEGER_LITERAL )
            // IOCL.g:136:4: INTEGER_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            INTEGER_LITERAL8=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL8_tree = (NodeCS)adaptor.create(INTEGER_LITERAL8);
            adaptor.addChild(root_0, INTEGER_LITERAL8_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createIntegerLiteralExpCS(INTEGER_LITERAL8, (INTEGER_LITERAL8!=null?INTEGER_LITERAL8.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExpCS"

    public static class realLiteralExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExpCS"
    // IOCL.g:139:1: realLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : REAL_LITERAL ;
    public final IOCLParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IOCLParser.realLiteralExpCS_return retval = new IOCLParser.realLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token REAL_LITERAL9=null;

        NodeCS REAL_LITERAL9_tree=null;

        try {
            // IOCL.g:140:2: ( REAL_LITERAL )
            // IOCL.g:140:4: REAL_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            REAL_LITERAL9=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS689); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL9_tree = (NodeCS)adaptor.create(REAL_LITERAL9);
            adaptor.addChild(root_0, REAL_LITERAL9_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createRealLiteralExpCS(REAL_LITERAL9, (REAL_LITERAL9!=null?REAL_LITERAL9.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "realLiteralExpCS"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // IOCL.g:143:1: propertyCallExp returns [OCLExpressionCS oclExpressionCS] : ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp );
    public final IOCLParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IOCLParser.propertyCallExp_return retval = new IOCLParser.propertyCallExp_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal10=null;
        Token char_literal12=null;
        IOCLParser.modelPropertyCallExp_return mpce = null;

        IOCLParser.modelPropertyCallExp_return modelPropertyCallExp11 = null;


        NodeCS string_literal10_tree=null;
        NodeCS char_literal12_tree=null;

        try {
            // IOCL.g:144:2: ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // IOCL.g:144:4: '->' modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal10=(Token)match(input,25,FOLLOW_25_in_propertyCallExp706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal10_tree = (NodeCS)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp708);
                    modelPropertyCallExp11=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp11.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:145:4: '.' mpce= modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    char_literal12=(Token)match(input,26,FOLLOW_26_in_propertyCallExp713); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal12_tree = (NodeCS)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp719);
                    mpce=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mpce.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (mpce!=null?mpce.oclExpressionCS:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // IOCL.g:148:1: modelPropertyCallExp returns [OCLExpressionCS oclExpressionCS] : oce= operationCallExpCS ;
    public final IOCLParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IOCLParser.modelPropertyCallExp_return retval = new IOCLParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.operationCallExpCS_return oce = null;



        try {
            // IOCL.g:149:2: (oce= operationCallExpCS )
            // IOCL.g:149:4: oce= operationCallExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp740);
            oce=operationCallExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oce.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = (oce!=null?oce.oclExpressionCS:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExpCS"
    // IOCL.g:152:1: operationCallExpCS returns [OCLExpressionCS oclExpressionCS] : bn= binaryName '(' (args= argumentsCS )? ')' ;
    public final IOCLParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IOCLParser.operationCallExpCS_return retval = new IOCLParser.operationCallExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        IOCLParser.binaryName_return bn = null;

        IOCLParser.argumentsCS_return args = null;


        NodeCS char_literal13_tree=null;
        NodeCS char_literal14_tree=null;

        try {
            // IOCL.g:153:2: (bn= binaryName '(' (args= argumentsCS )? ')' )
            // IOCL.g:153:5: bn= binaryName '(' (args= argumentsCS )? ')'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_binaryName_in_operationCallExpCS762);
            bn=binaryName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bn.getTree());
            char_literal13=(Token)match(input,27,FOLLOW_27_in_operationCallExpCS764); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal13_tree = (NodeCS)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);
            }
            // IOCL.g:153:25: (args= argumentsCS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=COLLECTION_TYPE_LITERAL && LA13_0<=REAL_LITERAL)||(LA13_0>=17 && LA13_0<=18)||LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // IOCL.g:153:27: args= argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS772);
                    args=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            char_literal14=(Token)match(input,28,FOLLOW_28_in_operationCallExpCS776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal14_tree = (NodeCS)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);
            }
            if ( state.backtracking==0 ) {
              retval.oclExpressionCS = createOperationCallExpCS((bn!=null?bn.oclExpressionCS:null), (args!=null?args.argumentsCS:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationCallExpCS"

    public static class binaryName_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryName"
    // IOCL.g:156:1: binaryName returns [OCLExpressionCS oclExpressionCS] : (sn= simpleNameCS | BINARY_OPERATOR );
    public final IOCLParser.binaryName_return binaryName() throws RecognitionException {
        IOCLParser.binaryName_return retval = new IOCLParser.binaryName_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BINARY_OPERATOR15=null;
        IOCLParser.simpleNameCS_return sn = null;


        NodeCS BINARY_OPERATOR15_tree=null;

        try {
            // IOCL.g:157:2: (sn= simpleNameCS | BINARY_OPERATOR )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENTIFIER||(LA14_0>=29 && LA14_0<=30)) ) {
                alt14=1;
            }
            else if ( (LA14_0==BINARY_OPERATOR) ) {
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
                    // IOCL.g:157:4: sn= simpleNameCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_simpleNameCS_in_binaryName797);
                    sn=simpleNameCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sn.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (sn!=null?sn.oclExpressionCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:158:4: BINARY_OPERATOR
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    BINARY_OPERATOR15=(Token)match(input,BINARY_OPERATOR,FOLLOW_BINARY_OPERATOR_in_binaryName804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BINARY_OPERATOR15_tree = (NodeCS)adaptor.create(BINARY_OPERATOR15);
                    adaptor.addChild(root_0, BINARY_OPERATOR15_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryName"

    public static class simpleNameCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleNameCS"
    // IOCL.g:161:1: simpleNameCS returns [OCLExpressionCS oclExpressionCS] : ( primitiveTypeCS | 'self' | IDENTIFIER );
    public final IOCLParser.simpleNameCS_return simpleNameCS() throws RecognitionException {
        IOCLParser.simpleNameCS_return retval = new IOCLParser.simpleNameCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal17=null;
        Token IDENTIFIER18=null;
        IOCLParser.primitiveTypeCS_return primitiveTypeCS16 = null;


        NodeCS string_literal17_tree=null;
        NodeCS IDENTIFIER18_tree=null;

        try {
            // IOCL.g:162:2: ( primitiveTypeCS | 'self' | IDENTIFIER )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case IDENTIFIER:
                {
                alt15=3;
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
                    // IOCL.g:162:4: primitiveTypeCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveTypeCS_in_simpleNameCS819);
                    primitiveTypeCS16=primitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypeCS16.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:163:4: 'self'
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal17=(Token)match(input,29,FOLLOW_29_in_simpleNameCS824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal17_tree = (NodeCS)adaptor.create(string_literal17);
                    adaptor.addChild(root_0, string_literal17_tree);
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:164:4: IDENTIFIER
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER18_tree = (NodeCS)adaptor.create(IDENTIFIER18);
                    adaptor.addChild(root_0, IDENTIFIER18_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createSimpleNameCS(IDENTIFIER18, SimpleTypeEnum.IDENTIFIER, (IDENTIFIER18!=null?IDENTIFIER18.getText():null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleNameCS"

    public static class primitiveTypeCS_return extends ParserRuleReturnScope {
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveTypeCS"
    // IOCL.g:167:1: primitiveTypeCS : 'Integer' ;
    public final IOCLParser.primitiveTypeCS_return primitiveTypeCS() throws RecognitionException {
        IOCLParser.primitiveTypeCS_return retval = new IOCLParser.primitiveTypeCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal19=null;

        NodeCS string_literal19_tree=null;

        try {
            // IOCL.g:168:2: ( 'Integer' )
            // IOCL.g:168:4: 'Integer'
            {
            root_0 = (NodeCS)adaptor.nil();

            string_literal19=(Token)match(input,30,FOLLOW_30_in_primitiveTypeCS842); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal19_tree = (NodeCS)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveTypeCS"

    public static class argumentsCS_return extends ParserRuleReturnScope {
        public ArgumentsCS argumentsCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentsCS"
    // IOCL.g:171:1: argumentsCS returns [ArgumentsCS argumentsCS] : ocle= oclExpressionCS ( ',' argumentsCS )? ;
    public final IOCLParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IOCLParser.argumentsCS_return retval = new IOCLParser.argumentsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal20=null;
        IOCLParser.oclExpressionCS_return ocle = null;

        IOCLParser.argumentsCS_return argumentsCS21 = null;


        NodeCS char_literal20_tree=null;

        try {
            // IOCL.g:172:2: (ocle= oclExpressionCS ( ',' argumentsCS )? )
            // IOCL.g:172:4: ocle= oclExpressionCS ( ',' argumentsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS862);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.argumentsCS = createArgumentsCS((ocle!=null?ocle.oclExpressionCS:null)); 
            }
            // IOCL.g:172:88: ( ',' argumentsCS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // IOCL.g:172:90: ',' argumentsCS
                    {
                    char_literal20=(Token)match(input,24,FOLLOW_24_in_argumentsCS868); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal20_tree = (NodeCS)adaptor.create(char_literal20);
                    adaptor.addChild(root_0, char_literal20_tree);
                    }
                    pushFollow(FOLLOW_argumentsCS_in_argumentsCS870);
                    argumentsCS21=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsCS21.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (NodeCS)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentsCS"

    // $ANTLR start synpred3_IOCL
    public final void synpred3_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.multiplicativeExpCS_return me1 = null;

        IOCLParser.multiplicativeExpCS_return me2 = null;


        // IOCL.g:71:4: (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ )
        // IOCL.g:71:4: me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
        {
        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred3_IOCL212);
        me1=multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:71:75: (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
        int cnt17=0;
        loop17:
        do {
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=17 && LA17_0<=18)) ) {
                alt17=1;
            }


            switch (alt17) {
        	case 1 :
        	    // IOCL.g:71:76: op= ( '+' | '-' ) me2= multiplicativeExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=17 && input.LA(1)<=18) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_multiplicativeExpCS_in_synpred3_IOCL231);
        	    me2=multiplicativeExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt17 >= 1 ) break loop17;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(17, input);
                    throw eee;
            }
            cnt17++;
        } while (true);


        }
    }
    // $ANTLR end synpred3_IOCL

    // $ANTLR start synpred6_IOCL
    public final void synpred6_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.unaryExpCS_return ue1 = null;

        IOCLParser.unaryExpCS_return ue2 = null;


        // IOCL.g:76:4: (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ )
        // IOCL.g:76:4: ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+
        {
        pushFollow(FOLLOW_unaryExpCS_in_synpred6_IOCL265);
        ue1=unaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:76:66: (op= ( '*' | '/' ) ue2= unaryExpCS )+
        int cnt18=0;
        loop18:
        do {
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=19 && LA18_0<=20)) ) {
                alt18=1;
            }


            switch (alt18) {
        	case 1 :
        	    // IOCL.g:76:68: op= ( '*' | '/' ) ue2= unaryExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=19 && input.LA(1)<=20) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_unaryExpCS_in_synpred6_IOCL285);
        	    ue2=unaryExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt18 >= 1 ) break loop18;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(18, input);
                    throw eee;
            }
            cnt18++;
        } while (true);


        }
    }
    // $ANTLR end synpred6_IOCL

    // $ANTLR start synpred10_IOCL
    public final void synpred10_IOCL_fragment() throws RecognitionException {   
        IOCLParser.oclExpCS_return ocle = null;


        // IOCL.g:86:4: (ocle= oclExpCS )
        // IOCL.g:86:4: ocle= oclExpCS
        {
        pushFollow(FOLLOW_oclExpCS_in_synpred10_IOCL364);
        ocle=oclExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_IOCL

    // Delegated rules

    public final boolean synpred6_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impliesExpCS_in_oclExpressionCS80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpCS_in_impliesExpCS103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpCSPrec_in_relationalExpCS169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_ifExpCSPrec190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS212 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_additiveExpCS221 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS231 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS265 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS275 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS285 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS331 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS375 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS455 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_collectionLiteralExpCS457 = new BitSet(new long[]{0x0000000000A601F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS463 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_collectionLiteralExpCS467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS506 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_collectionLiteralPartsCS511 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_propertyCallExp706 = new BitSet(new long[]{0x0000000060000600L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_propertyCallExp713 = new BitSet(new long[]{0x0000000060000600L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryName_in_operationCallExpCS762 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_operationCallExpCS764 = new BitSet(new long[]{0x00000000102601F0L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS772 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_operationCallExpCS776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_binaryName797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_OPERATOR_in_binaryName804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypeCS_in_simpleNameCS819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_simpleNameCS824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primitiveTypeCS842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS862 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_argumentsCS868 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_argumentsCS_in_argumentsCS870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred3_IOCL212 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_synpred3_IOCL221 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred3_IOCL231 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred6_IOCL265 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_synpred6_IOCL275 = new BitSet(new long[]{0x00000000002601F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred6_IOCL285 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_oclExpCS_in_synpred10_IOCL364 = new BitSet(new long[]{0x0000000000000002L});

}