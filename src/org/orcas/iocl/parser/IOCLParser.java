// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-05-11 23:42:30

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
    // IOCL.g:45:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : le= logicalExpCS ;
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.logicalExpCS_return le = null;



        try {
            // IOCL.g:46:2: (le= logicalExpCS )
            // IOCL.g:46:4: le= logicalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_logicalExpCS_in_oclExpressionCS79);
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
    // $ANTLR end "oclExpressionCS"

    public static class logicalExpCS_return extends ParserRuleReturnScope {
        public OCLExpressionCS oclExpressionCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalExpCS"
    // IOCL.g:49:1: logicalExpCS returns [OCLExpressionCS oclExpressionCS] : (ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS | ee= equalityExpCS );
    public final IOCLParser.logicalExpCS_return logicalExpCS() throws RecognitionException {
        IOCLParser.logicalExpCS_return retval = new IOCLParser.logicalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.equalityExpCS_return ee = null;

        IOCLParser.logicalExpCS_return le = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:50:2: (ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS | ee= equalityExpCS )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // IOCL.g:50:4: ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS100);
                    ee=equalityExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ee.getTree());
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

                    pushFollow(FOLLOW_logicalExpCS_in_logicalExpCS118);
                    le=logicalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, le.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS(ee.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), le.oclExpressionCS); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:51:4: ee= equalityExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_equalityExpCS_in_logicalExpCS129);
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
    // IOCL.g:54:1: equalityExpCS returns [OCLExpressionCS oclExpressionCS] : (rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS | rele= relationalExpCS );
    public final IOCLParser.equalityExpCS_return equalityExpCS() throws RecognitionException {
        IOCLParser.equalityExpCS_return retval = new IOCLParser.equalityExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.relationalExpCS_return rele = null;

        IOCLParser.equalityExpCS_return ee = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:55:2: (rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS | rele= relationalExpCS )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // IOCL.g:55:4: rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS150);
                    rele=relationalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rele.getTree());
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

                    pushFollow(FOLLOW_equalityExpCS_in_equalityExpCS166);
                    ee=equalityExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ee.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS(rele.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), ee.oclExpressionCS); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:56:4: rele= relationalExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpCS_in_equalityExpCS177);
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
    // IOCL.g:59:1: relationalExpCS returns [OCLExpressionCS oclExpressionCS] : (ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS | ae= additiveExpCS );
    public final IOCLParser.relationalExpCS_return relationalExpCS() throws RecognitionException {
        IOCLParser.relationalExpCS_return retval = new IOCLParser.relationalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.additiveExpCS_return ae = null;

        IOCLParser.relationalExpCS_return rele = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:60:2: (ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS | ae= additiveExpCS )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // IOCL.g:60:4: ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS200);
                    ae=additiveExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ae.getTree());
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

                    pushFollow(FOLLOW_relationalExpCS_in_relationalExpCS220);
                    rele=relationalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rele.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS(ae.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), rele.oclExpressionCS); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:61:4: ae= additiveExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpCS_in_relationalExpCS231);
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
    // IOCL.g:64:1: additiveExpCS returns [OCLExpressionCS oclExpressionCS] : (me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS | me= multiplicativeExpCS );
    public final IOCLParser.additiveExpCS_return additiveExpCS() throws RecognitionException {
        IOCLParser.additiveExpCS_return retval = new IOCLParser.additiveExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.multiplicativeExpCS_return me = null;

        IOCLParser.additiveExpCS_return ae = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:65:2: (me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS | me= multiplicativeExpCS )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // IOCL.g:65:4: me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS252);
                    me=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, me.getTree());
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

                    pushFollow(FOLLOW_additiveExpCS_in_additiveExpCS268);
                    ae=additiveExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ae.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS(me.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), ae.oclExpressionCS); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:66:4: me= multiplicativeExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS279);
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
    // IOCL.g:69:1: multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS] : (ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS | ue= unaryExpCS );
    public final IOCLParser.multiplicativeExpCS_return multiplicativeExpCS() throws RecognitionException {
        IOCLParser.multiplicativeExpCS_return retval = new IOCLParser.multiplicativeExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.unaryExpCS_return ue = null;

        IOCLParser.multiplicativeExpCS_return me = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:70:2: (ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS | ue= unaryExpCS )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // IOCL.g:70:4: ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS300);
                    ue=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ue.getTree());
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

                    pushFollow(FOLLOW_multiplicativeExpCS_in_multiplicativeExpCS316);
                    me=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, me.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = createOperationCallExpCS(ue.oclExpressionCS, createSimpleNameCS(op, SimpleTypeEnum.STRING, (op!=null?op.getText():null)), me.oclExpressionCS); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:71:4: ue= unaryExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS327);
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
    // IOCL.g:74:1: unaryExpCS returns [OCLExpressionCS oclExpressionCS] : (op= ( '+' | '-' | 'not' ) ue= unaryExpCS | dae= dotArrowExpCS );
    public final IOCLParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IOCLParser.unaryExpCS_return retval = new IOCLParser.unaryExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.unaryExpCS_return ue = null;

        IOCLParser.dotArrowExpCS_return dae = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:75:2: (op= ( '+' | '-' | 'not' ) ue= unaryExpCS | dae= dotArrowExpCS )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=27 && LA6_0<=28)||LA6_0==31) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=NUMERIC_OPERATION && LA6_0<=REAL_LITERAL)) ) {
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
                    // IOCL.g:75:4: op= ( '+' | '-' | 'not' ) ue= unaryExpCS
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

                    pushFollow(FOLLOW_unaryExpCS_in_unaryExpCS360);
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
                    // IOCL.g:76:4: dae= dotArrowExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExpCS_in_unaryExpCS371);
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
    // IOCL.g:79:1: dotArrowExpCS returns [OCLExpressionCS oclExpressionCS] : ( NUMERIC_OPERATION '(' (args= argumentsCS )? ')' | ocle= oclExpCS pce= propertyCallExp | ocle= oclExpCS );
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
            // IOCL.g:80:2: ( NUMERIC_OPERATION '(' (args= argumentsCS )? ')' | ocle= oclExpCS pce= propertyCallExp | ocle= oclExpCS )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NUMERIC_OPERATION:
                {
                alt8=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred19_IOCL()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER_LITERAL:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred19_IOCL()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred19_IOCL()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
                {
                int LA8_5 = input.LA(2);

                if ( (synpred19_IOCL()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case BOOLEAN_LITERAL:
                {
                int LA8_6 = input.LA(2);

                if ( (synpred19_IOCL()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // IOCL.g:80:4: NUMERIC_OPERATION '(' (args= argumentsCS )? ')'
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    NUMERIC_OPERATION1=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMERIC_OPERATION1_tree = (NodeCS)adaptor.create(NUMERIC_OPERATION1);
                    adaptor.addChild(root_0, NUMERIC_OPERATION1_tree);
                    }
                    char_literal2=(Token)match(input,32,FOLLOW_32_in_dotArrowExpCS391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal2_tree = (NodeCS)adaptor.create(char_literal2);
                    adaptor.addChild(root_0, char_literal2_tree);
                    }
                    // IOCL.g:80:27: (args= argumentsCS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=NUMERIC_OPERATION && LA7_0<=REAL_LITERAL)||(LA7_0>=27 && LA7_0<=28)||LA7_0==31) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // IOCL.g:80:29: args= argumentsCS
                            {
                            pushFollow(FOLLOW_argumentsCS_in_dotArrowExpCS399);
                            args=argumentsCS();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                            }
                            break;

                    }

                    char_literal3=(Token)match(input,33,FOLLOW_33_in_dotArrowExpCS403); if (state.failed) return retval;
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
                    // IOCL.g:81:4: ocle= oclExpCS pce= propertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS415);
                    ocle=oclExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
                    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExpCS421);
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
                    // IOCL.g:82:4: ocle= oclExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_oclExpCS_in_dotArrowExpCS432);
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
    // IOCL.g:85:1: oclExpCS returns [OCLExpressionCS oclExpressionCS] : le= literalExpCS ;
    public final IOCLParser.oclExpCS_return oclExpCS() throws RecognitionException {
        IOCLParser.oclExpCS_return retval = new IOCLParser.oclExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:86:2: (le= literalExpCS )
            // IOCL.g:86:4: le= literalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_literalExpCS_in_oclExpCS453);
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
    // IOCL.g:90:1: literalExpCS returns [OCLExpressionCS oclExpressionCS] : (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS );
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.collectionLiteralExpCS_return cle = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:91:2: (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COLLECTION_TYPE_LITERAL) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=STRING_LITERAL && LA9_0<=REAL_LITERAL)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // IOCL.g:91:4: cle= collectionLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS476);
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
                    // IOCL.g:92:4: ple= primitiveLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS487);
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
    // IOCL.g:95:1: collectionLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' ;
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
            // IOCL.g:96:2: (cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' )
            // IOCL.g:96:4: cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS508);
            cti=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cti.getTree());
            char_literal4=(Token)match(input,34,FOLLOW_34_in_collectionLiteralExpCS510); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal4_tree = (NodeCS)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);
            }
            // IOCL.g:96:47: (clpts= collectionLiteralPartsCS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NUMERIC_OPERATION && LA10_0<=REAL_LITERAL)||(LA10_0>=27 && LA10_0<=28)||LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // IOCL.g:0:0: clpts= collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS516);
                    clpts=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, clpts.getTree());

                    }
                    break;

            }

            char_literal5=(Token)match(input,35,FOLLOW_35_in_collectionLiteralExpCS520); if (state.failed) return retval;
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
    // IOCL.g:99:1: collectionTypeIdentifierCS returns [OCLExpressionCS oclExpressionCS] : COLLECTION_TYPE_LITERAL ;
    public final IOCLParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IOCLParser.collectionTypeIdentifierCS_return retval = new IOCLParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token COLLECTION_TYPE_LITERAL6=null;

        NodeCS COLLECTION_TYPE_LITERAL6_tree=null;

        try {
            // IOCL.g:100:2: ( COLLECTION_TYPE_LITERAL )
            // IOCL.g:100:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            COLLECTION_TYPE_LITERAL6=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS538); if (state.failed) return retval;
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
    // IOCL.g:103:1: collectionLiteralPartsCS returns [OCLExpressionCS oclExpressionCS] : clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? ;
    public final IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartsCS_return retval = new IOCLParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal7=null;
        IOCLParser.collectionLiteralPartCS_return clpe = null;

        IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS8 = null;


        NodeCS char_literal7_tree=null;

        try {
            // IOCL.g:104:2: (clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? )
            // IOCL.g:104:4: clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS559);
            clpe=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, clpe.getTree());
            if ( state.backtracking==0 ) {
               retval.oclExpressionCS = createCollectionLiteralPartsCS((clpe!=null?clpe.oclExpressionCS:null)); 
            }
            // IOCL.g:104:113: ( ',' collectionLiteralPartsCS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // IOCL.g:104:114: ',' collectionLiteralPartsCS
                    {
                    char_literal7=(Token)match(input,36,FOLLOW_36_in_collectionLiteralPartsCS564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal7_tree = (NodeCS)adaptor.create(char_literal7);
                    adaptor.addChild(root_0, char_literal7_tree);
                    }
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS566);
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
    // IOCL.g:107:1: collectionLiteralPartCS returns [OCLExpressionCS oclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartCS_return retval = new IOCLParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:109:2: (ocle= oclExpressionCS )
            // IOCL.g:109:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS592);
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
    // IOCL.g:112:1: primitiveLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS );
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.numericLiteralExpCS_return nle = null;

        IOCLParser.stringLiteralExpCS_return sle = null;

        IOCLParser.booleanLiteralExpCS_return ble = null;



        try {
            // IOCL.g:113:2: (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS )
            int alt12=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt12=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt12=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // IOCL.g:113:4: nle= numericLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS615);
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
                    // IOCL.g:114:4: sle= stringLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS626);
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
                    // IOCL.g:115:4: ble= booleanLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS637);
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
    // IOCL.g:118:1: numericLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : (ile= integerLiteralExpCS | rle= realLiteralExpCS );
    public final IOCLParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IOCLParser.numericLiteralExpCS_return retval = new IOCLParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.integerLiteralExpCS_return ile = null;

        IOCLParser.realLiteralExpCS_return rle = null;



        try {
            // IOCL.g:119:2: (ile= integerLiteralExpCS | rle= realLiteralExpCS )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==INTEGER_LITERAL) ) {
                alt13=1;
            }
            else if ( (LA13_0==REAL_LITERAL) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // IOCL.g:119:4: ile= integerLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS658);
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
                    // IOCL.g:120:4: rle= realLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS669);
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
    // IOCL.g:123:1: stringLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL9=null;

        NodeCS STRING_LITERAL9_tree=null;

        try {
            // IOCL.g:124:2: ( STRING_LITERAL )
            // IOCL.g:124:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS690); if (state.failed) return retval;
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
    // IOCL.g:127:1: booleanLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : BOOLEAN_LITERAL ;
    public final IOCLParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IOCLParser.booleanLiteralExpCS_return retval = new IOCLParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BOOLEAN_LITERAL10=null;

        NodeCS BOOLEAN_LITERAL10_tree=null;

        try {
            // IOCL.g:128:2: ( BOOLEAN_LITERAL )
            // IOCL.g:128:4: BOOLEAN_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            BOOLEAN_LITERAL10=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS707); if (state.failed) return retval;
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
    // IOCL.g:131:1: integerLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : INTEGER_LITERAL ;
    public final IOCLParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IOCLParser.integerLiteralExpCS_return retval = new IOCLParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token INTEGER_LITERAL11=null;

        NodeCS INTEGER_LITERAL11_tree=null;

        try {
            // IOCL.g:132:2: ( INTEGER_LITERAL )
            // IOCL.g:132:4: INTEGER_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            INTEGER_LITERAL11=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS724); if (state.failed) return retval;
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
    // IOCL.g:135:1: realLiteralExpCS returns [OCLExpressionCS oclExpressionCS] : REAL_LITERAL ;
    public final IOCLParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IOCLParser.realLiteralExpCS_return retval = new IOCLParser.realLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token REAL_LITERAL12=null;

        NodeCS REAL_LITERAL12_tree=null;

        try {
            // IOCL.g:136:2: ( REAL_LITERAL )
            // IOCL.g:136:4: REAL_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            REAL_LITERAL12=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS742); if (state.failed) return retval;
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
    // IOCL.g:139:1: propertyCallExp returns [OCLExpressionCS oclExpressionCS] : ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp );
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
            // IOCL.g:140:2: ( '->' modelPropertyCallExp | '.' mpce= modelPropertyCallExp )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
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
                    // IOCL.g:140:4: '->' modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal13=(Token)match(input,37,FOLLOW_37_in_propertyCallExp759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal13_tree = (NodeCS)adaptor.create(string_literal13);
                    adaptor.addChild(root_0, string_literal13_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp761);
                    modelPropertyCallExp14=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp14.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:141:4: '.' mpce= modelPropertyCallExp
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    char_literal15=(Token)match(input,38,FOLLOW_38_in_propertyCallExp766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal15_tree = (NodeCS)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);
                    }
                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp772);
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
    // IOCL.g:144:1: modelPropertyCallExp returns [OCLExpressionCS oclExpressionCS] : oce= operationCallExpCS ;
    public final IOCLParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IOCLParser.modelPropertyCallExp_return retval = new IOCLParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.operationCallExpCS_return oce = null;



        try {
            // IOCL.g:145:2: (oce= operationCallExpCS )
            // IOCL.g:145:4: oce= operationCallExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExp793);
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
    // IOCL.g:148:1: operationCallExpCS returns [OCLExpressionCS oclExpressionCS] : bn= binaryName '(' (args= argumentsCS )? ')' ;
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
            // IOCL.g:149:2: (bn= binaryName '(' (args= argumentsCS )? ')' )
            // IOCL.g:149:5: bn= binaryName '(' (args= argumentsCS )? ')'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_binaryName_in_operationCallExpCS815);
            bn=binaryName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bn.getTree());
            char_literal16=(Token)match(input,32,FOLLOW_32_in_operationCallExpCS817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal16_tree = (NodeCS)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);
            }
            // IOCL.g:149:25: (args= argumentsCS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=NUMERIC_OPERATION && LA15_0<=REAL_LITERAL)||(LA15_0>=27 && LA15_0<=28)||LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // IOCL.g:149:27: args= argumentsCS
                    {
                    pushFollow(FOLLOW_argumentsCS_in_operationCallExpCS825);
                    args=argumentsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args.getTree());

                    }
                    break;

            }

            char_literal17=(Token)match(input,33,FOLLOW_33_in_operationCallExpCS829); if (state.failed) return retval;
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
    // IOCL.g:152:1: binaryName returns [OCLExpressionCS oclExpressionCS] : (sn= simpleNameCS | BINARY_OPERATOR );
    public final IOCLParser.binaryName_return binaryName() throws RecognitionException {
        IOCLParser.binaryName_return retval = new IOCLParser.binaryName_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BINARY_OPERATOR18=null;
        IOCLParser.simpleNameCS_return sn = null;


        NodeCS BINARY_OPERATOR18_tree=null;

        try {
            // IOCL.g:153:2: (sn= simpleNameCS | BINARY_OPERATOR )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER||(LA16_0>=39 && LA16_0<=40)) ) {
                alt16=1;
            }
            else if ( (LA16_0==BINARY_OPERATOR) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // IOCL.g:153:4: sn= simpleNameCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_simpleNameCS_in_binaryName850);
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
                    // IOCL.g:154:4: BINARY_OPERATOR
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    BINARY_OPERATOR18=(Token)match(input,BINARY_OPERATOR,FOLLOW_BINARY_OPERATOR_in_binaryName857); if (state.failed) return retval;
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
    // IOCL.g:157:1: simpleNameCS returns [OCLExpressionCS oclExpressionCS] : ( primitiveTypeCS | 'self' | IDENTIFIER );
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
            // IOCL.g:158:2: ( primitiveTypeCS | 'self' | IDENTIFIER )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt17=1;
                }
                break;
            case 39:
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
                    // IOCL.g:158:4: primitiveTypeCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveTypeCS_in_simpleNameCS872);
                    primitiveTypeCS19=primitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveTypeCS19.getTree());

                    }
                    break;
                case 2 :
                    // IOCL.g:159:4: 'self'
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    string_literal20=(Token)match(input,39,FOLLOW_39_in_simpleNameCS877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (NodeCS)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:160:4: IDENTIFIER
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleNameCS882); if (state.failed) return retval;
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
    // IOCL.g:163:1: primitiveTypeCS : 'Integer' ;
    public final IOCLParser.primitiveTypeCS_return primitiveTypeCS() throws RecognitionException {
        IOCLParser.primitiveTypeCS_return retval = new IOCLParser.primitiveTypeCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal22=null;

        NodeCS string_literal22_tree=null;

        try {
            // IOCL.g:164:2: ( 'Integer' )
            // IOCL.g:164:4: 'Integer'
            {
            root_0 = (NodeCS)adaptor.nil();

            string_literal22=(Token)match(input,40,FOLLOW_40_in_primitiveTypeCS895); if (state.failed) return retval;
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
    // IOCL.g:167:1: argumentsCS returns [ArgumentsCS argumentsCS] : ocle= oclExpressionCS ( ',' argumentsCS )? ;
    public final IOCLParser.argumentsCS_return argumentsCS() throws RecognitionException {
        IOCLParser.argumentsCS_return retval = new IOCLParser.argumentsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal23=null;
        IOCLParser.oclExpressionCS_return ocle = null;

        IOCLParser.argumentsCS_return argumentsCS24 = null;


        NodeCS char_literal23_tree=null;

        try {
            // IOCL.g:168:2: (ocle= oclExpressionCS ( ',' argumentsCS )? )
            // IOCL.g:168:4: ocle= oclExpressionCS ( ',' argumentsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_argumentsCS915);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.argumentsCS = createArgumentsCS((ocle!=null?ocle.oclExpressionCS:null)); 
            }
            // IOCL.g:168:88: ( ',' argumentsCS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // IOCL.g:168:90: ',' argumentsCS
                    {
                    char_literal23=(Token)match(input,36,FOLLOW_36_in_argumentsCS921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal23_tree = (NodeCS)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);
                    }
                    pushFollow(FOLLOW_argumentsCS_in_argumentsCS923);
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

    // $ANTLR start synpred3_IOCL
    public final void synpred3_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.equalityExpCS_return ee = null;

        IOCLParser.logicalExpCS_return le = null;


        // IOCL.g:50:4: (ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS )
        // IOCL.g:50:4: ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS
        {
        pushFollow(FOLLOW_equalityExpCS_in_synpred3_IOCL100);
        ee=equalityExpCS();

        state._fsp--;
        if (state.failed) return ;
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

        pushFollow(FOLLOW_logicalExpCS_in_synpred3_IOCL118);
        le=logicalExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_IOCL

    // $ANTLR start synpred5_IOCL
    public final void synpred5_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.relationalExpCS_return rele = null;

        IOCLParser.equalityExpCS_return ee = null;


        // IOCL.g:55:4: (rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS )
        // IOCL.g:55:4: rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS
        {
        pushFollow(FOLLOW_relationalExpCS_in_synpred5_IOCL150);
        rele=relationalExpCS();

        state._fsp--;
        if (state.failed) return ;
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

        pushFollow(FOLLOW_equalityExpCS_in_synpred5_IOCL166);
        ee=equalityExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_IOCL

    // $ANTLR start synpred9_IOCL
    public final void synpred9_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.additiveExpCS_return ae = null;

        IOCLParser.relationalExpCS_return rele = null;


        // IOCL.g:60:4: (ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS )
        // IOCL.g:60:4: ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS
        {
        pushFollow(FOLLOW_additiveExpCS_in_synpred9_IOCL200);
        ae=additiveExpCS();

        state._fsp--;
        if (state.failed) return ;
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

        pushFollow(FOLLOW_relationalExpCS_in_synpred9_IOCL220);
        rele=relationalExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_IOCL

    // $ANTLR start synpred11_IOCL
    public final void synpred11_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.multiplicativeExpCS_return me = null;

        IOCLParser.additiveExpCS_return ae = null;


        // IOCL.g:65:4: (me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS )
        // IOCL.g:65:4: me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS
        {
        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred11_IOCL252);
        me=multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;
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

        pushFollow(FOLLOW_additiveExpCS_in_synpred11_IOCL268);
        ae=additiveExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_IOCL

    // $ANTLR start synpred13_IOCL
    public final void synpred13_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.unaryExpCS_return ue = null;

        IOCLParser.multiplicativeExpCS_return me = null;


        // IOCL.g:70:4: (ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS )
        // IOCL.g:70:4: ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS
        {
        pushFollow(FOLLOW_unaryExpCS_in_synpred13_IOCL300);
        ue=unaryExpCS();

        state._fsp--;
        if (state.failed) return ;
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

        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred13_IOCL316);
        me=multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_IOCL

    // $ANTLR start synpred19_IOCL
    public final void synpred19_IOCL_fragment() throws RecognitionException {   
        IOCLParser.oclExpCS_return ocle = null;

        IOCLParser.propertyCallExp_return pce = null;


        // IOCL.g:81:4: (ocle= oclExpCS pce= propertyCallExp )
        // IOCL.g:81:4: ocle= oclExpCS pce= propertyCallExp
        {
        pushFollow(FOLLOW_oclExpCS_in_synpred19_IOCL415);
        ocle=oclExpCS();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_propertyCallExp_in_synpred19_IOCL421);
        pce=propertyCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_IOCL

    // Delegated rules

    public final boolean synpred9_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_IOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_IOCL_fragment(); // can never throw exception
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
    public final boolean synpred19_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_IOCL_fragment(); // can never throw exception
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
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA1_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA1_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA1_transitionS = {
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
            return "49:1: logicalExpCS returns [OCLExpressionCS oclExpressionCS] : (ee= equalityExpCS op= ( 'and' | 'or' | 'xor' ) le= logicalExpCS | ee= equalityExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_7);
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
            return "54:1: equalityExpCS returns [OCLExpressionCS oclExpressionCS] : (rele= relationalExpCS op= ( '<>' | '=' ) ee= equalityExpCS | rele= relationalExpCS );";
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
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_IOCL()) ) {s = 8;}

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
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA3_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA3_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "59:1: relationalExpCS returns [OCLExpressionCS oclExpressionCS] : (ae= additiveExpCS op= ( '<=' | '<' | '>' | '>=' ) rele= relationalExpCS | ae= additiveExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
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
            return "64:1: additiveExpCS returns [OCLExpressionCS oclExpressionCS] : (me= multiplicativeExpCS op= ( '+' | '-' ) ae= additiveExpCS | me= multiplicativeExpCS );";
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
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_IOCL()) ) {s = 8;}

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
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA5_maxS =
        "\1\37\7\0\2\uffff";
    static final String DFA5_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA5_transitionS = {
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
            return "69:1: multiplicativeExpCS returns [OCLExpressionCS oclExpressionCS] : (ue= unaryExpCS op= ( '*' | '/' ) me= multiplicativeExpCS | ue= unaryExpCS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_IOCL()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index5_7);
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
 

    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExpCS_in_oclExpressionCS79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS100 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_set_in_logicalExpCS106 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_logicalExpCS_in_logicalExpCS118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_logicalExpCS129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS150 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_equalityExpCS156 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_equalityExpCS_in_equalityExpCS166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpCS_in_equalityExpCS177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS200 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_set_in_relationalExpCS206 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_relationalExpCS_in_relationalExpCS220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_relationalExpCS231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS252 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_additiveExpCS258 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_additiveExpCS_in_additiveExpCS268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS300 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS306 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_multiplicativeExpCS316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS348 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_unaryExpCS_in_unaryExpCS360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExpCS_in_unaryExpCS371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_dotArrowExpCS388 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dotArrowExpCS391 = new BitSet(new long[]{0x00000002980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_dotArrowExpCS399 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dotArrowExpCS403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS415 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExpCS421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_dotArrowExpCS432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpCS453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS508 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionLiteralExpCS510 = new BitSet(new long[]{0x00000008980003F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS516 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_collectionLiteralExpCS520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS559 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_collectionLiteralPartsCS564 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_propertyCallExp759 = new BitSet(new long[]{0x0000018000000C00L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_propertyCallExp766 = new BitSet(new long[]{0x0000018000000C00L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExp793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryName_in_operationCallExpCS815 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_operationCallExpCS817 = new BitSet(new long[]{0x00000002980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_operationCallExpCS825 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_operationCallExpCS829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleNameCS_in_binaryName850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_OPERATOR_in_binaryName857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveTypeCS_in_simpleNameCS872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_simpleNameCS877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleNameCS882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primitiveTypeCS895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_argumentsCS915 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_argumentsCS921 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_argumentsCS_in_argumentsCS923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpCS_in_synpred3_IOCL100 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_set_in_synpred3_IOCL106 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_logicalExpCS_in_synpred3_IOCL118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpCS_in_synpred5_IOCL150 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_synpred5_IOCL156 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_equalityExpCS_in_synpred5_IOCL166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_synpred9_IOCL200 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_set_in_synpred9_IOCL206 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_relationalExpCS_in_synpred9_IOCL220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred11_IOCL252 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_synpred11_IOCL258 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_additiveExpCS_in_synpred11_IOCL268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred13_IOCL300 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_synpred13_IOCL306 = new BitSet(new long[]{0x00000000980003F0L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred13_IOCL316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpCS_in_synpred19_IOCL415 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred19_IOCL421 = new BitSet(new long[]{0x0000000000000002L});

}