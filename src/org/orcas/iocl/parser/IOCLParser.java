// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-04-17 21:39:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "BINARY_OPERATOR", "IDENTIFIER", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'and'", "'or'", "'xor'", "'<>'", "'='", "'<='", "'<'", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'('", "')'", "'{'", "'}'", "','", "'->'", "'.'", "'self'", "'Integer'"
    };
    public static final int T__40=40;
    public static final int EXPONENT=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=16;
    public static final int NUMERIC_OPERATION=4;
    public static final int T__20=20;
    public static final int OCTAL_ESC=17;
    public static final int HEX_DIGIT=15;
    public static final int BINARY_OPERATOR=10;
    public static final int EOF=-1;
    public static final int BOOLEAN_LITERAL=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=14;
    public static final int ESC_SEQ=13;
    public static final int STRING_LITERAL=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int REAL_LITERAL=9;
    public static final int T__36=36;
    public static final int COLLECTION_TYPE_LITERAL=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int IDENTIFIER=11;
    public static final int INTEGER_LITERAL=8;

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
    // IOCL.g:41:1: ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.ioclExpressionCS_return ioclExpressionCS() throws RecognitionException {
        IOCLParser.ioclExpressionCS_return retval = new IOCLParser.ioclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:42:2: (ocle= oclExpressionCS )
            // IOCL.g:42:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_ioclExpressionCS58);
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
    // IOCL.g:45:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : ie= impliesExpCS ;
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.impliesExpCS_return ie = null;



        try {
            // IOCL.g:46:2: (ie= impliesExpCS )
            // IOCL.g:46:4: ie= impliesExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_impliesExpCS_in_oclExpressionCS79);
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
    // IOCL.g:49:1: impliesExpCS returns [OCLExpressionCS oclExpressionCS] : le= logicalExpCS ;
    public final IOCLParser.impliesExpCS_return impliesExpCS() throws RecognitionException {
        IOCLParser.impliesExpCS_return retval = new IOCLParser.impliesExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.logicalExpCS_return le = null;



        try {
            // IOCL.g:50:2: (le= logicalExpCS )
            // IOCL.g:50:4: le= logicalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_logicalExpCS_in_impliesExpCS102);
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
    // IOCL.g:53:1: logicalExpCS returns [OCLExpressionCS oclExpressionCS] : (ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+ | ee= equalityExpCS );
    public final IOCLParser.logicalExpCS_return logicalExpCS() throws RecognitionException {
        IOCLParser.logicalExpCS_return retval = new IOCLParser.logicalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.equalityExpCS_return ee1 = null;

        IOCLParser.equalityExpCS_return ee2 = null;

        IOCLParser.equalityExpCS_return ee = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:54:2: (ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+ | ee= equalityExpCS )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // IOCL.g:54:4: ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS124);
                    ee1=equalityExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ee1.getTree());
                    // IOCL.g:54:24: (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=18 && LA1_0<=20)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // IOCL.g:54:26: op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=18 && input.LA(1)<=20) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS144);
                    	    ee2=equalityExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ee2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.oclExpressionCS = createOperationCallExpCS(ee1.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), ee2.oclExpressionCS); 
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
                    // IOCL.g:55:4: ee= equalityExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS158);
                    ee=equalityExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ee.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ee!=null?ee.oclExpressionCS:null); 
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
    // $ANTLR end "logicalExpCS"

    public static class equalityExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpCS"
    // IOCL.g:58:1: equalityExpCS returns [OCLExpressionCS oclExpressionCS] : (rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+ | rele= relationalExpCS );
    public final IOCLParser.equalityExpCS_return equalityExpCS() throws RecognitionException {
        IOCLParser.equalityExpCS_return retval = new IOCLParser.equalityExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.relationalExpCS_return rele1 = null;

        IOCLParser.relationalExpCS_return rele2 = null;

        IOCLParser.relationalExpCS_return rele = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:59:2: (rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+ | rele= relationalExpCS )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // IOCL.g:59:4: rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS179);
                    rele1=relationalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rele1.getTree());
                    // IOCL.g:59:28: (op= ( '<>' | '=' ) rele2= relationalExpCS )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=21 && LA3_0<=22)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // IOCL.g:59:30: op= ( '<>' | '=' ) rele2= relationalExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS197);
                    	    rele2=relationalExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rele2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.oclExpressionCS = createOperationCallExpCS(rele1.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), rele2.oclExpressionCS); 
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
                    // IOCL.g:60:4: rele= relationalExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS211);
                    rele=relationalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rele.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (rele!=null?rele.oclExpressionCS:null); 
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
    // $ANTLR end "equalityExpCS"

    public static class relationalExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpCS"
    // IOCL.g:63:1: relationalExpCS returns [OCLExpressionCS oclExpressionCS] : (ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+ | ae= additiveExpCS );
    public final IOCLParser.relationalExpCS_return relationalExpCS() throws RecognitionException {
        IOCLParser.relationalExpCS_return retval = new IOCLParser.relationalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.additiveExpCS_return ae1 = null;

        IOCLParser.additiveExpCS_return ae2 = null;

        IOCLParser.additiveExpCS_return ae = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:64:2: (ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+ | ae= additiveExpCS )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // IOCL.g:64:4: ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS234);
                    ae1=additiveExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ae1.getTree());
                    // IOCL.g:64:24: (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=23 && LA5_0<=26)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // IOCL.g:64:26: op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=23 && input.LA(1)<=26) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS256);
                    	    ae2=additiveExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ae2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.oclExpressionCS = createOperationCallExpCS(ae1.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), ae2.oclExpressionCS); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:65:4: ae= additiveExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS270);
                    ae=additiveExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ae.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ae!=null?ae.oclExpressionCS:null); 
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
    // $ANTLR end "relationalExpCS"

    public static class additiveExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpCS"
    // IOCL.g:68:1: additiveExpCS returns [OCLExpressionCS oclExpressionCS] : (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ | me= multiplicativeExpCS );
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
            // IOCL.g:69:2: (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ | me= multiplicativeExpCS )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // IOCL.g:69:4: me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS291);
                    me1=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, me1.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (me1!=null?me1.oclExpressionCS:null); 
                    }
                    // IOCL.g:69:75: (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=27 && LA7_0<=28)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // IOCL.g:69:76: op= ( '+' | '-' ) me2= multiplicativeExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS310);
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
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:70:4: me= multiplicativeExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS324);
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
    // IOCL.g:73:1: multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS] : (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ | ue= unaryExpCS );
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
            // IOCL.g:74:2: (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ | ue= unaryExpCS )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // IOCL.g:74:4: ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS345);
                    ue1=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue1.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ue1!=null?ue1.oclExpressionCS:null); 
                    }
                    // IOCL.g:74:66: (op= ( '*' | '/' ) ue2= unaryExpCS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=29 && LA9_0<=30)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // IOCL.g:74:68: op= ( '*' | '/' ) ue2= unaryExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=29 && input.LA(1)<=30) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS365);
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
                    // IOCL.g:75:4: ue= unaryExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS379);
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
    // IOCL.g:78:1: unaryExpCS returns [OCLExpressionCS oclExpressionCS] : (op= ( '+' | '-' | 'not' ) ue= unaryExpCS | dae= dotArrowExpCS );
    public final IOCLParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IOCLParser.unaryExpCS_return retval = new IOCLParser.unaryExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.unaryExpCS_return ue = null;

        IOCLParser.dotArrowExpCS_return dae = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:79:2: (op= ( '+' | '-' | 'not' ) ue= unaryExpCS | dae= dotArrowExpCS )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=28)||LA11_0==31) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=NUMERIC_OPERATION && LA11_0<=REAL_LITERAL)) ) {
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
                    // IOCL.g:79:4: op= ( '+' | '-' | 'not' ) ue= unaryExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=27 && input.LA(1)<=28)||input.LA(1)==31 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS412);
                    ue=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS((ue!=null?ue.oclExpressionCS:null), createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)) ); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:80:4: dae= dotArrowExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS423);
                    dae=dotArrowExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dae.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (dae!=null?dae.oclExpressionCS:null); 
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
    // IOCL.g:83:1: dotArrowExpCS returns [OCLExpressionCS oclExpressionCS] : ( NUMERIC_OPERATION '(' (args= argumentsCS )? ')' | ocle= oclExpCS pce= propertyCallExp | ocle= oclExpCS );
    public final IOCLParser.dotArrowExpCS_return dotArrowExpCS() throws RecognitionException {
        IOCLParser.dotArrowExpCS_return retval = new IOCLParser.dotArrowExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token NUMERIC_OPERATION1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        IOCLParser.argumentsCS_return args = null;

        IOCLParser.oclExpCS_return ocle = null;

        IOCLParser.propertyCallExp_return pce = null;


        NodeCS NUMERIC_OPERATION1_tree=null;
        NodeCS char_literal2_tree=null;
        NodeCS char_literal3_tree=null;

        try {
            // IOCL.g:84:2: ( NUMERIC_OPERATION '(' (args= argumentsCS )? ')' | ocle= oclExpCS pce= propertyCallExp | ocle= oclExpCS )
            int alt13=3;
            switch ( input.LA(1) ) {
            case NUMERIC_OPERATION:
                {
                alt13=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred24_IOCL()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER_LITERAL:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred24_IOCL()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA13_4 = input.LA(2);

                if ( (synpred24_IOCL()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred24_IOCL()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN_LITERAL:
                {
                int LA13_6 = input.LA(2);

                if ( (synpred24_IOCL()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;
                }
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
                    // IOCL.g:84:4: NUMERIC_OPERATION '(' (args= argumentsCS )? ')'
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    NUMERIC_OPERATION1=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMERIC_OPERATION1_tree = (NodeCS)adaptor.create(NUMERIC_OPERATION1);
                    adaptor.addChild(root_0, NUMERIC_OPERATION1_tree);
                    }
                    char_literal2=(Token)match(input,32,FOLLOW_32_in_dotArrowExpCS443); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal2_tree = (NodeCS)adaptor.create(char_literal2);
                    adaptor.addChild(root_0, char_literal2_tree);
                    }
                    // IOCL.g:84:27: (args= argumentsCS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=NUMERIC_OPERATION && LA12_0<=REAL_LITERAL)||(LA12_0>=27 && LA12_0<=28)||LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // IOCL.g:84:29: args= argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS451);
                            args=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                            }
                            break;

                    }

                    char_literal3=(Token)match(input,33,FOLLOW_33_in_dotArrowExpCS455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal3_tree = (NodeCS)adaptor.create(char_literal3);
                    adaptor.addChild(root_0, char_literal3_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createNumericOperationCallExpCS(NUMERIC_OPERATION1, (NUMERIC_OPERATION1!=null?NUMERIC_OPERATION1.getText():null), (args != null) ? args.argumentsCS : null ); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:85:4: ocle= oclExpCS pce= propertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS467);
                    ocle=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS473);
                    pce=propertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pce.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = setOperationCallExpCSSource((ocle!=null?ocle.oclExpressionCS:null), (pce!=null?pce.oclExpressionCS:null)); 
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:86:4: ocle= oclExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS484);
                    ocle=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (ocle!=null?ocle.oclExpressionCS:null); 
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
    // IOCL.g:89:1: oclExpCS returns [OCLExpressionCS oclExpressionCS] : le= literalExpCS ;
    public final IOCLParser.oclExpCS_return oclExpCS() throws RecognitionException {
        IOCLParser.oclExpCS_return retval = new IOCLParser.oclExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:90:2: (le= literalExpCS )
            // IOCL.g:90:4: le= literalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_literalExpCS_in_oclExpCS505);
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
    // IOCL.g:93:1: literalExpCS returns [OCLExpressionCS oclExpressionCS] : (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS );
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.collectionLiteralExpCS_return cle = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:94:2: (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLLECTION_TYPE_LITERAL) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=STRING_LITERAL && LA14_0<=REAL_LITERAL)) ) {
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
                    // IOCL.g:94:4: cle= collectionLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS526);
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
                    // IOCL.g:95:4: ple= primitiveLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS537);
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
    // IOCL.g:98:1: collectionLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' ;
    public final IOCLParser.collectionLiteralExpCS_return collectionLiteralExpCS() throws RecognitionException {
        IOCLParser.collectionLiteralExpCS_return retval = new IOCLParser.collectionLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal4=null;
        Token char_literal5=null;
        IOCLParser.collectionTypeIdentifierCS_return cti = null;

        IOCLParser.collectionLiteralPartsCS_return clpts = null;


        NodeCS char_literal4_tree=null;
        NodeCS char_literal5_tree=null;

        try {
            // IOCL.g:99:2: (cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' )
            // IOCL.g:99:4: cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS558);
            cti=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cti.getTree());
            char_literal4=(Token)match(input,34,FOLLOW_34_in_collectionLiteralExpCS560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = (NodeCS)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);
            }
            // IOCL.g:99:47: (clpts= collectionLiteralPartsCS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=NUMERIC_OPERATION && LA15_0<=REAL_LITERAL)||(LA15_0>=27 && LA15_0<=28)||LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // IOCL.g:0:0: clpts= collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS566);
                    clpts=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, clpts.getTree());

                    }
                    break;

            }

            char_literal5=(Token)match(input,35,FOLLOW_35_in_collectionLiteralExpCS570); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = (NodeCS)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);
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
    // IOCL.g:102:1: collectionTypeIdentifierCS returns [OCLExpressionCS oclExpressionCS] : COLLECTION_TYPE_LITERAL ;
    public final IOCLParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IOCLParser.collectionTypeIdentifierCS_return retval = new IOCLParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token COLLECTION_TYPE_LITERAL6=null;

        NodeCS COLLECTION_TYPE_LITERAL6_tree=null;

        try {
            // IOCL.g:103:2: ( COLLECTION_TYPE_LITERAL )
            // IOCL.g:103:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            COLLECTION_TYPE_LITERAL6=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL6_tree = (NodeCS)adaptor.create(COLLECTION_TYPE_LITERAL6);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL6_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionTypeIdentifierCS(COLLECTION_TYPE_LITERAL6, (COLLECTION_TYPE_LITERAL6!=null?COLLECTION_TYPE_LITERAL6.getText():null)); 
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
    // IOCL.g:106:1: collectionLiteralPartsCS returns [OCLExpressionCS oclExpressionCS] : clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? ;
    public final IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartsCS_return retval = new IOCLParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal7=null;
        IOCLParser.collectionLiteralPartCS_return clpe = null;

        IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS8 = null;


        NodeCS char_literal7_tree=null;

        try {
            // IOCL.g:107:2: (clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? )
            // IOCL.g:107:4: clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS609);
            clpe=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, clpe.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionLiteralPartsCS((clpe!=null?clpe.oclExpressionCS:null)); 
            }
            // IOCL.g:107:113: ( ',' collectionLiteralPartsCS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // IOCL.g:107:114: ',' collectionLiteralPartsCS
                    {
                    char_literal7=(Token)match(input,36,FOLLOW_36_in_collectionLiteralPartsCS614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal7_tree = (NodeCS)adaptor.create(char_literal7);
                    adaptor.addChild(root_0, char_literal7_tree);
                    }
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS616);
                    collectionLiteralPartsCS8=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPartsCS8.getTree());

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
    // IOCL.g:110:1: collectionLiteralPartCS returns [OCLExpressionCS oclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartCS_return retval = new IOCLParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:112:2: (ocle= oclExpressionCS )
            // IOCL.g:112:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS642);
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
    // IOCL.g:115:1: primitiveLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS );
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.numericLiteralExpCS_return nle = null;

        IOCLParser.stringLiteralExpCS_return sle = null;

        IOCLParser.booleanLiteralExpCS_return ble = null;



        try {
            // IOCL.g:116:2: (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS )
            int alt17=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt17=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt17=2;
                }
                break;
            case BOOLEAN_LITERAL:
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
                    // IOCL.g:116:4: nle= numericLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS665);
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
                    // IOCL.g:117:4: sle= stringLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS676);
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
                    // IOCL.g:118:4: ble= booleanLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS687);
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
    // IOCL.g:121:1: numericLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (ile= integerLiteralExpCS | rle= realLiteralExpCS );
    public final IOCLParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IOCLParser.numericLiteralExpCS_return retval = new IOCLParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.integerLiteralExpCS_return ile = null;

        IOCLParser.realLiteralExpCS_return rle = null;



        try {
            // IOCL.g:122:2: (ile= integerLiteralExpCS | rle= realLiteralExpCS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INTEGER_LITERAL) ) {
                alt18=1;
            }
            else if ( (LA18_0==REAL_LITERAL) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // IOCL.g:122:4: ile= integerLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS708);
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
                    // IOCL.g:123:4: rle= realLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS719);
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
    // IOCL.g:126:1: stringLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL9=null;

        NodeCS STRING_LITERAL9_tree=null;

        try {
            // IOCL.g:127:2: ( STRING_LITERAL )
            // IOCL.g:127:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL9_tree = (NodeCS)adaptor.create(STRING_LITERAL9);
            adaptor.addChild(root_0, STRING_LITERAL9_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createStringLiteralExpCS(STRING_LITERAL9, (STRING_LITERAL9!=null?STRING_LITERAL9.getText():null)); 
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
    // IOCL.g:130:1: booleanLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : BOOLEAN_LITERAL ;
    public final IOCLParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IOCLParser.booleanLiteralExpCS_return retval = new IOCLParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BOOLEAN_LITERAL10=null;

        NodeCS BOOLEAN_LITERAL10_tree=null;

        try {
            // IOCL.g:131:2: ( BOOLEAN_LITERAL )
            // IOCL.g:131:4: BOOLEAN_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            BOOLEAN_LITERAL10=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL10_tree = (NodeCS)adaptor.create(BOOLEAN_LITERAL10);
            adaptor.addChild(root_0, BOOLEAN_LITERAL10_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createBooleanLiteralExpCS(BOOLEAN_LITERAL10, (BOOLEAN_LITERAL10!=null?BOOLEAN_LITERAL10.getText():null)); 
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
    // IOCL.g:134:1: integerLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : INTEGER_LITERAL ;
    public final IOCLParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IOCLParser.integerLiteralExpCS_return retval = new IOCLParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token INTEGER_LITERAL11=null;

        NodeCS INTEGER_LITERAL11_tree=null;

        try {
            // IOCL.g:135:2: ( INTEGER_LITERAL )
            // IOCL.g:135:4: INTEGER_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            INTEGER_LITERAL11=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS774); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL11_tree = (NodeCS)adaptor.create(INTEGER_LITERAL11);
            adaptor.addChild(root_0, INTEGER_LITERAL11_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createIntegerLiteralExpCS(INTEGER_LITERAL11, (INTEGER_LITERAL11!=null?INTEGER_LITERAL11.getText():null)); 
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
    // IOCL.g:138:1: realLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : REAL_LITERAL ;
    public final IOCLParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IOCLParser.realLiteralExpCS_return retval = new IOCLParser.realLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token REAL_LITERAL12=null;

        NodeCS REAL_LITERAL12_tree=null;

        try {
            // IOCL.g:139:2: ( REAL_LITERAL )
            // IOCL.g:139:4: REAL_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            REAL_LITERAL12=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS792); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL12_tree = (NodeCS)adaptor.create(REAL_LITERAL12);
            adaptor.addChild(root_0, REAL_LITERAL12_tree);
            }
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createRealLiteralExpCS(REAL_LITERAL12, (REAL_LITERAL12!=null?REAL_LITERAL12.getText():null)); 
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
    // IOCL.g:142:1: propertyCallExp returns [OCLExpressionCS oclExpressionCS] : ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp );
    public final IOCLParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IOCLParser.propertyCallExp_return retval = new IOCLParser.propertyCallExp_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal13=null;
        Token char_literal15=null;
        IOCLParser.modelPropertyCallExp_return mpce = null;

        IOCLParser.modelPropertyCallExp_return modelPropertyCallExp14 = null;


        NodeCS string_literal13_tree=null;
        NodeCS char_literal15_tree=null;

        try {
            // IOCL.g:143:2: ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // IOCL.g:143:4: '->' modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal13=(Token)match(input,37,FOLLOW_37_in_propertyCallExp809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal13_tree = (NodeCS)adaptor.create(string_literal13);
                    adaptor.addChild(root_0, string_literal13_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp811);
                    modelPropertyCallExp14=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp14.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:144:4: '.' mpce= modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    char_literal15=(Token)match(input,38,FOLLOW_38_in_propertyCallExp816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal15_tree = (NodeCS)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp822);
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
    // IOCL.g:147:1: modelPropertyCallExp returns [OCLExpressionCS oclExpressionCS] : oce= operationCallExpCS ;
    public final IOCLParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IOCLParser.modelPropertyCallExp_return retval = new IOCLParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.operationCallExpCS_return oce = null;



        try {
            // IOCL.g:148:2: (oce= operationCallExpCS )
            // IOCL.g:148:4: oce= operationCallExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp843);
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
    // IOCL.g:151:1: operationCallExpCS returns [OCLExpressionCS oclExpressionCS] : bn= binaryName '(' (args= argumentsCS )? ')' ;
    public final IOCLParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IOCLParser.operationCallExpCS_return retval = new IOCLParser.operationCallExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal16=null;
        Token char_literal17=null;
        IOCLParser.binaryName_return bn = null;

        IOCLParser.argumentsCS_return args = null;


        NodeCS char_literal16_tree=null;
        NodeCS char_literal17_tree=null;

        try {
            // IOCL.g:152:2: (bn= binaryName '(' (args= argumentsCS )? ')' )
            // IOCL.g:152:5: bn= binaryName '(' (args= argumentsCS )? ')'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_binaryName_in_operationCallExpCS865);
            bn=binaryName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bn.getTree());
            char_literal16=(Token)match(input,32,FOLLOW_32_in_operationCallExpCS867); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal16_tree = (NodeCS)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);
            }
            // IOCL.g:152:25: (args= argumentsCS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=NUMERIC_OPERATION && LA20_0<=REAL_LITERAL)||(LA20_0>=27 && LA20_0<=28)||LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // IOCL.g:152:27: args= argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS875);
                    args=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            char_literal17=(Token)match(input,33,FOLLOW_33_in_operationCallExpCS879); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal17_tree = (NodeCS)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);
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
    // IOCL.g:155:1: binaryName returns [OCLExpressionCS oclExpressionCS] : (sn= simpleNameCS | BINARY_OPERATOR );
    public final IOCLParser.binaryName_return binaryName() throws RecognitionException {
        IOCLParser.binaryName_return retval = new IOCLParser.binaryName_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BINARY_OPERATOR18=null;
        IOCLParser.simpleNameCS_return sn = null;


        NodeCS BINARY_OPERATOR18_tree=null;

        try {
            // IOCL.g:156:2: (sn= simpleNameCS | BINARY_OPERATOR )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER||(LA21_0>=39 && LA21_0<=40)) ) {
                alt21=1;
            }
            else if ( (LA21_0==BINARY_OPERATOR) ) {
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
                    // IOCL.g:156:4: sn= simpleNameCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_simpleNameCS_in_binaryName900);
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
                    // IOCL.g:157:4: BINARY_OPERATOR
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    BINARY_OPERATOR18=(Token)match(input,BINARY_OPERATOR,FOLLOW_BINARY_OPERATOR_in_binaryName907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BINARY_OPERATOR18_tree = (NodeCS)adaptor.create(BINARY_OPERATOR18);
                    adaptor.addChild(root_0, BINARY_OPERATOR18_tree);
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
    // IOCL.g:160:1: simpleNameCS returns [OCLExpressionCS oclExpressionCS] : ( primitiveTypeCS | 'self' | IDENTIFIER );
    public final IOCLParser.simpleNameCS_return simpleNameCS() throws RecognitionException {
        IOCLParser.simpleNameCS_return retval = new IOCLParser.simpleNameCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal20=null;
        Token IDENTIFIER21=null;
        IOCLParser.primitiveTypeCS_return primitiveTypeCS19 = null;


        NodeCS string_literal20_tree=null;
        NodeCS IDENTIFIER21_tree=null;

        try {
            // IOCL.g:161:2: ( primitiveTypeCS | 'self' | IDENTIFIER )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case IDENTIFIER:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // IOCL.g:161:4: primitiveTypeCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveTypeCS_in_simpleNameCS922);
                    primitiveTypeCS19=primitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypeCS19.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:162:4: 'self'
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal20=(Token)match(input,39,FOLLOW_39_in_simpleNameCS927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (NodeCS)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:163:4: IDENTIFIER
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER21_tree = (NodeCS)adaptor.create(IDENTIFIER21);
                    adaptor.addChild(root_0, IDENTIFIER21_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createSimpleNameCS(IDENTIFIER21, SimpleTypeEnum.IDENTIFIER, (IDENTIFIER21!=null?IDENTIFIER21.getText():null)); 
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
    // IOCL.g:166:1: primitiveTypeCS : 'Integer' ;
    public final IOCLParser.primitiveTypeCS_return primitiveTypeCS() throws RecognitionException {
        IOCLParser.primitiveTypeCS_return retval = new IOCLParser.primitiveTypeCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal22=null;

        NodeCS string_literal22_tree=null;

        try {
            // IOCL.g:167:2: ( 'Integer' )
            // IOCL.g:167:4: 'Integer'
            {
            root_0 = (NodeCS)adaptor.nil();

            string_literal22=(Token)match(input,40,FOLLOW_40_in_primitiveTypeCS945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal22_tree = (NodeCS)adaptor.create(string_literal22);
            adaptor.addChild(root_0, string_literal22_tree);
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
    // IOCL.g:170:1: argumentsCS returns [ArgumentsCS argumentsCS] : ocle= oclExpressionCS ( ',' argumentsCS )? ;
    public final IOCLParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IOCLParser.argumentsCS_return retval = new IOCLParser.argumentsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal23=null;
        IOCLParser.oclExpressionCS_return ocle = null;

        IOCLParser.argumentsCS_return argumentsCS24 = null;


        NodeCS char_literal23_tree=null;

        try {
            // IOCL.g:171:2: (ocle= oclExpressionCS ( ',' argumentsCS )? )
            // IOCL.g:171:4: ocle= oclExpressionCS ( ',' argumentsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS965);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.argumentsCS = createArgumentsCS((ocle!=null?ocle.oclExpressionCS:null)); 
            }
            // IOCL.g:171:88: ( ',' argumentsCS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // IOCL.g:171:90: ',' argumentsCS
                    {
                    char_literal23=(Token)match(input,36,FOLLOW_36_in_argumentsCS971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal23_tree = (NodeCS)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);
                    }
                    pushFollow(FOLLOW_argumentsCS_in_argumentsCS973);
                    argumentsCS24=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentsCS24.getTree());

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

    // $ANTLR start synpred4_IOCL
    public final void synpred4_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.equalityExpCS_return ee1 = null;

        IOCLParser.equalityExpCS_return ee2 = null;


        // IOCL.g:54:4: (ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+ )
        // IOCL.g:54:4: ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+
        {
        pushFollow(FOLLOW_equalityExpCS_in_synpred4_IOCL124);
        ee1=equalityExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:54:24: (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+
        int cnt24=0;
        loop24:
        do {
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=18 && LA24_0<=20)) ) {
                alt24=1;
            }


            switch (alt24) {
        	case 1 :
        	    // IOCL.g:54:26: op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=18 && input.LA(1)<=20) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_equalityExpCS_in_synpred4_IOCL144);
        	    ee2=equalityExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt24 >= 1 ) break loop24;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(24, input);
                    throw eee;
            }
            cnt24++;
        } while (true);


        }
    }
    // $ANTLR end synpred4_IOCL

    // $ANTLR start synpred7_IOCL
    public final void synpred7_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.relationalExpCS_return rele1 = null;

        IOCLParser.relationalExpCS_return rele2 = null;


        // IOCL.g:59:4: (rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+ )
        // IOCL.g:59:4: rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+
        {
        pushFollow(FOLLOW_relationalExpCS_in_synpred7_IOCL179);
        rele1=relationalExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:59:28: (op= ( '<>' | '=' ) rele2= relationalExpCS )+
        int cnt25=0;
        loop25:
        do {
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=21 && LA25_0<=22)) ) {
                alt25=1;
            }


            switch (alt25) {
        	case 1 :
        	    // IOCL.g:59:30: op= ( '<>' | '=' ) rele2= relationalExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_relationalExpCS_in_synpred7_IOCL197);
        	    rele2=relationalExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt25 >= 1 ) break loop25;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(25, input);
                    throw eee;
            }
            cnt25++;
        } while (true);


        }
    }
    // $ANTLR end synpred7_IOCL

    // $ANTLR start synpred12_IOCL
    public final void synpred12_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.additiveExpCS_return ae1 = null;

        IOCLParser.additiveExpCS_return ae2 = null;


        // IOCL.g:64:4: (ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+ )
        // IOCL.g:64:4: ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+
        {
        pushFollow(FOLLOW_additiveExpCS_in_synpred12_IOCL234);
        ae1=additiveExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:64:24: (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+
        int cnt26=0;
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=23 && LA26_0<=26)) ) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // IOCL.g:64:26: op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=23 && input.LA(1)<=26) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_additiveExpCS_in_synpred12_IOCL256);
        	    ae2=additiveExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt26 >= 1 ) break loop26;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(26, input);
                    throw eee;
            }
            cnt26++;
        } while (true);


        }
    }
    // $ANTLR end synpred12_IOCL

    // $ANTLR start synpred15_IOCL
    public final void synpred15_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.multiplicativeExpCS_return me1 = null;

        IOCLParser.multiplicativeExpCS_return me2 = null;


        // IOCL.g:69:4: (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ )
        // IOCL.g:69:4: me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
        {
        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred15_IOCL291);
        me1=multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:69:75: (op= ( '+' | '-' ) me2= multiplicativeExpCS )+
        int cnt27=0;
        loop27:
        do {
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=27 && LA27_0<=28)) ) {
                alt27=1;
            }


            switch (alt27) {
        	case 1 :
        	    // IOCL.g:69:76: op= ( '+' | '-' ) me2= multiplicativeExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_multiplicativeExpCS_in_synpred15_IOCL310);
        	    me2=multiplicativeExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt27 >= 1 ) break loop27;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(27, input);
                    throw eee;
            }
            cnt27++;
        } while (true);


        }
    }
    // $ANTLR end synpred15_IOCL

    // $ANTLR start synpred18_IOCL
    public final void synpred18_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.unaryExpCS_return ue1 = null;

        IOCLParser.unaryExpCS_return ue2 = null;


        // IOCL.g:74:4: (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ )
        // IOCL.g:74:4: ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+
        {
        pushFollow(FOLLOW_unaryExpCS_in_synpred18_IOCL345);
        ue1=unaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:74:66: (op= ( '*' | '/' ) ue2= unaryExpCS )+
        int cnt28=0;
        loop28:
        do {
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=29 && LA28_0<=30)) ) {
                alt28=1;
            }


            switch (alt28) {
        	case 1 :
        	    // IOCL.g:74:68: op= ( '*' | '/' ) ue2= unaryExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=29 && input.LA(1)<=30) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_unaryExpCS_in_synpred18_IOCL365);
        	    ue2=unaryExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt28 >= 1 ) break loop28;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(28, input);
                    throw eee;
            }
            cnt28++;
        } while (true);


        }
    }
    // $ANTLR end synpred18_IOCL

    // $ANTLR start synpred24_IOCL
    public final void synpred24_IOCL_fragment() throws RecognitionException {   
        IOCLParser.oclExpCS_return ocle = null;

        IOCLParser.propertyCallExp_return pce = null;


        // IOCL.g:85:4: (ocle= oclExpCS pce= propertyCallExp )
        // IOCL.g:85:4: ocle= oclExpCS pce= propertyCallExp
        {
        pushFollow(FOLLOW_oclExpCS_in_synpred24_IOCL467);
        ocle=oclExpCS();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_propertyCallExp_in_synpred24_IOCL473);
        pce=propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_IOCL

    // Delegated rules

    public final boolean synpred18_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA2_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA2_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\3\1\6\1\7\1\4\1\5\21\uffff\2\1\2\uffff\1\1",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "53:1: logicalExpCS returns [OCLExpressionCS oclExpressionCS] : (ee1= equalityExpCS (op= ( 'and' | 'or' | 'xor' ) ee2= equalityExpCS )+ | ee= equalityExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA4_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA4_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\3\1\6\1\7\1\4\1\5\21\uffff\2\1\2\uffff\1\1",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "58:1: equalityExpCS returns [OCLExpressionCS oclExpressionCS] : (rele1= relationalExpCS (op= ( '<>' | '=' ) rele2= relationalExpCS )+ | rele= relationalExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA6_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\3\1\6\1\7\1\4\1\5\21\uffff\2\1\2\uffff\1\1",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "63:1: relationalExpCS returns [OCLExpressionCS oclExpressionCS] : (ae1= additiveExpCS (op= ( '<=' | '<' | '>' | '>=' ) ae2= additiveExpCS )+ | ae= additiveExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA8_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA8_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\3\1\6\1\7\1\4\1\5\21\uffff\2\1\2\uffff\1\1",
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
            return "68:1: additiveExpCS returns [OCLExpressionCS oclExpressionCS] : (me1= multiplicativeExpCS (op= ( '+' | '-' ) me2= multiplicativeExpCS )+ | me= multiplicativeExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_7);
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
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA10_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA10_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\3\1\6\1\7\1\4\1\5\21\uffff\2\1\2\uffff\1\1",
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
            return "73:1: multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS] : (ue1= unaryExpCS (op= ( '*' | '/' ) ue2= unaryExpCS )+ | ue= unaryExpCS );";
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
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_7);
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
 

    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impliesExpCS_in_oclExpressionCS79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpCS_in_impliesExpCS102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS124 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_set_in_logicalExpCS132 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS144 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS179 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_equalityExpCS187 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS197 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS234 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_set_in_relationalExpCS242 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS256 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS291 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_additiveExpCS300 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS310 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS345 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS355 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS365 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS400 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS440 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dotArrowExpCS443 = new BitSet(new long[]{0x00000002980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS451 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dotArrowExpCS455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS467 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS558 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionLiteralExpCS560 = new BitSet(new long[]{0x00000008980003F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS566 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_collectionLiteralExpCS570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS609 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_collectionLiteralPartsCS614 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_propertyCallExp809 = new BitSet(new long[]{0x0000018000000C00L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_propertyCallExp816 = new BitSet(new long[]{0x0000018000000C00L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryName_in_operationCallExpCS865 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_operationCallExpCS867 = new BitSet(new long[]{0x00000002980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS875 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_operationCallExpCS879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_binaryName900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_OPERATOR_in_binaryName907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypeCS_in_simpleNameCS922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_simpleNameCS927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primitiveTypeCS945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS965 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_argumentsCS971 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_argumentsCS973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_synpred4_IOCL124 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_set_in_synpred4_IOCL132 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_equalityExpCS_in_synpred4_IOCL144 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_relationalExpCS_in_synpred7_IOCL179 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_synpred7_IOCL187 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_relationalExpCS_in_synpred7_IOCL197 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_additiveExpCS_in_synpred12_IOCL234 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_set_in_synpred12_IOCL242 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_additiveExpCS_in_synpred12_IOCL256 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred15_IOCL291 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_synpred15_IOCL300 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred15_IOCL310 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred18_IOCL345 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_synpred18_IOCL355 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred18_IOCL365 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_oclExpCS_in_synpred24_IOCL467 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred24_IOCL473 = new BitSet(new long[]{0x0000000000000002L});

}