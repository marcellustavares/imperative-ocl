// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-03-26 22:17:43

package org.orcas.iocl.parser;

import org.antlr.runtime.Token;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "EXPONENT", "ESC_SEQ", "ID", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'{'", "'}'", "','", "'..'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int EXPONENT=9;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=14;
    public static final int T__20=20;
    public static final int OCTAL_ESC=15;
    public static final int HEX_DIGIT=13;
    public static final int ID=11;
    public static final int EOF=-1;
    public static final int BOOLEAN_LITERAL=6;
    public static final int T__19=19;
    public static final int WS=12;
    public static final int T__16=16;
    public static final int STRING_LITERAL=5;
    public static final int ESC_SEQ=10;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int REAL_LITERAL=8;
    public static final int COLLECTION_TYPE_LITERAL=4;
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

            pushFollow(FOLLOW_oclExpressionCS_in_ioclExpressionCS63);
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
    // IOCL.g:46:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : (pce= propertyCallExpCS | le= literalExpCS );
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.propertyCallExpCS_return pce = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:47:2: (pce= propertyCallExpCS | le= literalExpCS )
            int alt1=2;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=17 && LA1_1<=19)) ) {
                    alt1=2;
                }
                else if ( ((LA1_1>=20 && LA1_1<=23)) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case REAL_LITERAL:
                {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=20 && LA1_2<=23)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||(LA1_2>=17 && LA1_2<=19)) ) {
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
            case 20:
            case 21:
                {
                alt1=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
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
                    // IOCL.g:47:4: pce= propertyCallExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_propertyCallExpCS_in_oclExpressionCS85);
                    pce=propertyCallExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pce.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS =  (pce!=null?pce.propertyCallExpCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:48:4: le= literalExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_literalExpCS_in_oclExpressionCS96);
                    le=literalExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, le.getTree());
                    if ( state.backtracking==0 ) {
                       retval.oclExpressionCS = (le!=null?le.literalExpCS:null); 
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
    // $ANTLR end "oclExpressionCS"

    public static class literalExpCS_return extends ParserRuleReturnScope {
        public LiteralExpCS literalExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExpCS"
    // IOCL.g:51:1: literalExpCS returns [LiteralExpCS literalExpCS] : (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS );
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.collectionLiteralExpCS_return cle = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:52:2: (cle= collectionLiteralExpCS | ple= primitiveLiteralExpCS )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==COLLECTION_TYPE_LITERAL) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=STRING_LITERAL && LA2_0<=REAL_LITERAL)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // IOCL.g:52:4: cle= collectionLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExpCS_in_literalExpCS118);
                    cle=collectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.literalExpCS = (cle!=null?cle.collectionLiteralExpCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:53:4: ple= primitiveLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS129);
                    ple=primitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ple.getTree());
                    if ( state.backtracking==0 ) {
                       retval.literalExpCS = (ple!=null?ple.primitiveLiteralExpCS:null); 
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
        public CollectionLiteralExpCS collectionLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExpCS"
    // IOCL.g:56:1: collectionLiteralExpCS returns [CollectionLiteralExpCS collectionLiteralExpCS] : cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' ;
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
            // IOCL.g:57:2: (cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}' )
            // IOCL.g:57:4: cti= collectionTypeIdentifierCS '{' (clpts= collectionLiteralPartsCS )? '}'
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS150);
            cti=collectionTypeIdentifierCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cti.getTree());
            char_literal1=(Token)match(input,16,FOLLOW_16_in_collectionLiteralExpCS152); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal1_tree = (NodeCS)adaptor.create(char_literal1);
            adaptor.addChild(root_0, char_literal1_tree);
            }
            // IOCL.g:57:47: (clpts= collectionLiteralPartsCS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=COLLECTION_TYPE_LITERAL && LA3_0<=REAL_LITERAL)||(LA3_0>=20 && LA3_0<=21)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // IOCL.g:0:0: clpts= collectionLiteralPartsCS
                    {
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS158);
                    clpts=collectionLiteralPartsCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, clpts.getTree());

                    }
                    break;

            }

            char_literal2=(Token)match(input,17,FOLLOW_17_in_collectionLiteralExpCS162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal2_tree = (NodeCS)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);
            }
            if ( state.backtracking==0 ) {
               retval.collectionLiteralExpCS = createCollectionLiteralExpCS((cti!=null?cti.collectionTypeIdentifierCS:null), (clpts!=null?clpts.collectionLiteralPartsCS:null)); 
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
        public CollectionTypeIdentifierCS collectionTypeIdentifierCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifierCS"
    // IOCL.g:60:1: collectionTypeIdentifierCS returns [CollectionTypeIdentifierCS collectionTypeIdentifierCS] : COLLECTION_TYPE_LITERAL ;
    public final IOCLParser.collectionTypeIdentifierCS_return collectionTypeIdentifierCS() throws RecognitionException {
        IOCLParser.collectionTypeIdentifierCS_return retval = new IOCLParser.collectionTypeIdentifierCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token COLLECTION_TYPE_LITERAL3=null;

        NodeCS COLLECTION_TYPE_LITERAL3_tree=null;

        try {
            // IOCL.g:61:2: ( COLLECTION_TYPE_LITERAL )
            // IOCL.g:61:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            COLLECTION_TYPE_LITERAL3=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL3_tree = (NodeCS)adaptor.create(COLLECTION_TYPE_LITERAL3);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL3_tree);
            }
            if ( state.backtracking==0 ) {
               retval.collectionTypeIdentifierCS = createCollectionTypeIdentifierCS(COLLECTION_TYPE_LITERAL3, (COLLECTION_TYPE_LITERAL3!=null?COLLECTION_TYPE_LITERAL3.getText():null)); 
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
        public CollectionLiteralPartsCS collectionLiteralPartsCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartsCS"
    // IOCL.g:64:1: collectionLiteralPartsCS returns [CollectionLiteralPartsCS collectionLiteralPartsCS] : clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? ;
    public final IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartsCS_return retval = new IOCLParser.collectionLiteralPartsCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token char_literal4=null;
        IOCLParser.collectionLiteralPartCS_return clpe = null;

        IOCLParser.collectionLiteralPartsCS_return collectionLiteralPartsCS5 = null;


        NodeCS char_literal4_tree=null;

        try {
            // IOCL.g:65:2: (clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )? )
            // IOCL.g:65:4: clpe= collectionLiteralPartCS ( ',' collectionLiteralPartsCS )?
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS201);
            clpe=collectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, clpe.getTree());
            if ( state.backtracking==0 ) {
               retval.collectionLiteralPartsCS = createCollectionLiteralPartsCS((clpe!=null?clpe.collectionLiteralPartCS:null)); 
            }
            // IOCL.g:65:130: ( ',' collectionLiteralPartsCS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // IOCL.g:65:131: ',' collectionLiteralPartsCS
                    {
                    char_literal4=(Token)match(input,18,FOLLOW_18_in_collectionLiteralPartsCS206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal4_tree = (NodeCS)adaptor.create(char_literal4);
                    adaptor.addChild(root_0, char_literal4_tree);
                    }
                    pushFollow(FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS208);
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
        public CollectionLiteralPartCS collectionLiteralPartCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPartCS"
    // IOCL.g:68:1: collectionLiteralPartCS returns [CollectionLiteralPartCS collectionLiteralPartCS] : ocle= oclExpressionCS ;
    public final IOCLParser.collectionLiteralPartCS_return collectionLiteralPartCS() throws RecognitionException {
        IOCLParser.collectionLiteralPartCS_return retval = new IOCLParser.collectionLiteralPartCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:70:2: (ocle= oclExpressionCS )
            // IOCL.g:70:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionLiteralPartCS234);
            ocle=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
               retval.collectionLiteralPartCS = createCollectionLiteralPartCS((ocle!=null?ocle.oclExpressionCS:null)); 
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

    public static class collectionRangeCS_return extends ParserRuleReturnScope {
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionRangeCS"
    // IOCL.g:73:1: collectionRangeCS : oclExpressionCS '..' oclExpressionCS ;
    public final IOCLParser.collectionRangeCS_return collectionRangeCS() throws RecognitionException {
        IOCLParser.collectionRangeCS_return retval = new IOCLParser.collectionRangeCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token string_literal7=null;
        IOCLParser.oclExpressionCS_return oclExpressionCS6 = null;

        IOCLParser.oclExpressionCS_return oclExpressionCS8 = null;


        NodeCS string_literal7_tree=null;

        try {
            // IOCL.g:74:2: ( oclExpressionCS '..' oclExpressionCS )
            // IOCL.g:74:4: oclExpressionCS '..' oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_collectionRangeCS247);
            oclExpressionCS6=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS6.getTree());
            string_literal7=(Token)match(input,19,FOLLOW_19_in_collectionRangeCS249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (NodeCS)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            pushFollow(FOLLOW_oclExpressionCS_in_collectionRangeCS251);
            oclExpressionCS8=oclExpressionCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpressionCS8.getTree());

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
    // $ANTLR end "collectionRangeCS"

    public static class primitiveLiteralExpCS_return extends ParserRuleReturnScope {
        public PrimitiveLiteralExpCS primitiveLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExpCS"
    // IOCL.g:77:1: primitiveLiteralExpCS returns [PrimitiveLiteralExpCS primitiveLiteralExpCS] : (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS );
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.numericLiteralExpCS_return nle = null;

        IOCLParser.stringLiteralExpCS_return sle = null;

        IOCLParser.booleanLiteralExpCS_return ble = null;



        try {
            // IOCL.g:78:2: (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS )
            int alt5=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt5=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt5=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // IOCL.g:78:4: nle= numericLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS272);
                    nle=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.primitiveLiteralExpCS = (nle!=null?nle.numericLiteralExpCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:79:4: sle= stringLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS283);
                    sle=stringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.primitiveLiteralExpCS = (sle!=null?sle.stringLiteralExpCS:null); 
                    }

                    }
                    break;
                case 3 :
                    // IOCL.g:80:4: ble= booleanLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS294);
                    ble=booleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ble.getTree());
                    if ( state.backtracking==0 ) {
                       retval.primitiveLiteralExpCS = (ble!=null?ble.booleanLiteralExpCS:null); 
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

    public static class propertyCallExpCS_return extends ParserRuleReturnScope {
        public PropertyCallExpCS propertyCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExpCS"
    // IOCL.g:83:1: propertyCallExpCS returns [PropertyCallExpCS propertyCallExpCS] : mpce= modelPropertyCallExpCS ;
    public final IOCLParser.propertyCallExpCS_return propertyCallExpCS() throws RecognitionException {
        IOCLParser.propertyCallExpCS_return retval = new IOCLParser.propertyCallExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.modelPropertyCallExpCS_return mpce = null;



        try {
            // IOCL.g:84:2: (mpce= modelPropertyCallExpCS )
            // IOCL.g:84:4: mpce= modelPropertyCallExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_modelPropertyCallExpCS_in_propertyCallExpCS316);
            mpce=modelPropertyCallExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mpce.getTree());
            if ( state.backtracking==0 ) {
              retval.propertyCallExpCS = (mpce!=null?mpce.modelPropertyCallExpCS:null); 
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
    // $ANTLR end "propertyCallExpCS"

    public static class modelPropertyCallExpCS_return extends ParserRuleReturnScope {
        public ModelPropertyCallExpCS modelPropertyCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExpCS"
    // IOCL.g:87:1: modelPropertyCallExpCS returns [ModelPropertyCallExpCS modelPropertyCallExpCS] : ocle= operationCallExpCS ;
    public final IOCLParser.modelPropertyCallExpCS_return modelPropertyCallExpCS() throws RecognitionException {
        IOCLParser.modelPropertyCallExpCS_return retval = new IOCLParser.modelPropertyCallExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.operationCallExpCS_return ocle = null;



        try {
            // IOCL.g:88:2: (ocle= operationCallExpCS )
            // IOCL.g:88:4: ocle= operationCallExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_operationCallExpCS_in_modelPropertyCallExpCS337);
            ocle=operationCallExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ocle.getTree());
            if ( state.backtracking==0 ) {
              retval.modelPropertyCallExpCS = ocle.operationCallExpCS; 
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
    // $ANTLR end "modelPropertyCallExpCS"

    public static class operationCallExpCS_return extends ParserRuleReturnScope {
        public OperationCallExpCS operationCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExpCS"
    // IOCL.g:91:1: operationCallExpCS returns [OperationCallExpCS operationCallExpCS] : ae= additiveExpCS ;
    public final IOCLParser.operationCallExpCS_return operationCallExpCS() throws RecognitionException {
        IOCLParser.operationCallExpCS_return retval = new IOCLParser.operationCallExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.additiveExpCS_return ae = null;



        try {
            // IOCL.g:92:2: (ae= additiveExpCS )
            // IOCL.g:92:4: ae= additiveExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_additiveExpCS_in_operationCallExpCS359);
            ae=additiveExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ae.getTree());
            if ( state.backtracking==0 ) {
              retval.operationCallExpCS = ae.operationCallExpCS; 
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

    public static class additiveExpCS_return extends ParserRuleReturnScope {
        public OperationCallExpCS operationCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpCS"
    // IOCL.g:95:1: additiveExpCS returns [OperationCallExpCS operationCallExpCS] : (nlel= numericLiteralExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )+ | mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )* | mel= multiplicativeExpCS (op= ( '+' | '-' ) mer= multiplicativeExpCS )* );
    public final IOCLParser.additiveExpCS_return additiveExpCS() throws RecognitionException {
        IOCLParser.additiveExpCS_return retval = new IOCLParser.additiveExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.numericLiteralExpCS_return nlel = null;

        IOCLParser.numericLiteralExpCS_return nler = null;

        IOCLParser.multiplicativeExpCS_return mel = null;

        IOCLParser.multiplicativeExpCS_return mer = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:96:2: (nlel= numericLiteralExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )+ | mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )* | mel= multiplicativeExpCS (op= ( '+' | '-' ) mer= multiplicativeExpCS )* )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // IOCL.g:96:4: nlel= numericLiteralExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_additiveExpCS381);
                    nlel=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nlel.getTree());
                    // IOCL.g:96:32: (op= ( '+' | '-' ) nler= numericLiteralExpCS )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // IOCL.g:96:34: op= ( '+' | '-' ) nler= numericLiteralExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_numericLiteralExpCS_in_additiveExpCS403);
                    	    nler=numericLiteralExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nler.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.operationCallExpCS = createOperationCallExpCS(nlel.numericLiteralExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), nler.numericLiteralExpCS ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:97:8: mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )*
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS421);
                    mel=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mel.getTree());
                    if ( state.backtracking==0 ) {
                       retval.operationCallExpCS = (mel!=null?mel.operationCallExpCS:null); 
                    }
                    // IOCL.g:97:86: (op= ( '+' | '-' ) nler= numericLiteralExpCS )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // IOCL.g:97:88: op= ( '+' | '-' ) nler= numericLiteralExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_numericLiteralExpCS_in_additiveExpCS444);
                    	    nler=numericLiteralExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nler.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.operationCallExpCS = createOperationCallExpCS(mel.operationCallExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), nler.numericLiteralExpCS); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // IOCL.g:98:8: mel= multiplicativeExpCS (op= ( '+' | '-' ) mer= multiplicativeExpCS )*
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS463);
                    mel=multiplicativeExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mel.getTree());
                    if ( state.backtracking==0 ) {
                       retval.operationCallExpCS = (mel!=null?mel.operationCallExpCS:null); 
                    }
                    // IOCL.g:98:86: (op= ( '+' | '-' ) mer= multiplicativeExpCS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // IOCL.g:98:88: op= ( '+' | '-' ) mer= multiplicativeExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_multiplicativeExpCS_in_additiveExpCS486);
                    	    mer=multiplicativeExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mer.getTree());
                    	    if ( state.backtracking==0 ) {
                    	       retval.operationCallExpCS = createOperationCallExpCS(mel.operationCallExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), mer.operationCallExpCS); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
        public OperationCallExpCS operationCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpCS"
    // IOCL.g:101:1: multiplicativeExpCS returns [OperationCallExpCS operationCallExpCS] : (nlel= numericLiteralExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )+ | nlel= numericLiteralExpCS (op= ( '*' | '/' ) uer= unaryExpCS )+ | uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )* | uel= unaryExpCS (op= ( '*' | '/' ) uer= unaryExpCS )* );
    public final IOCLParser.multiplicativeExpCS_return multiplicativeExpCS() throws RecognitionException {
        IOCLParser.multiplicativeExpCS_return retval = new IOCLParser.multiplicativeExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.numericLiteralExpCS_return nlel = null;

        IOCLParser.numericLiteralExpCS_return nler = null;

        IOCLParser.unaryExpCS_return uer = null;

        IOCLParser.unaryExpCS_return uel = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:102:2: (nlel= numericLiteralExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )+ | nlel= numericLiteralExpCS (op= ( '*' | '/' ) uer= unaryExpCS )+ | uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )* | uel= unaryExpCS (op= ( '*' | '/' ) uer= unaryExpCS )* )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // IOCL.g:102:4: nlel= numericLiteralExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS512);
                    nlel=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nlel.getTree());
                    // IOCL.g:102:32: (op= ( '*' | '/' ) nler= numericLiteralExpCS )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // IOCL.g:102:34: op= ( '*' | '/' ) nler= numericLiteralExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS534);
                    	    nler=numericLiteralExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nler.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.operationCallExpCS = createOperationCallExpCS(nlel.numericLiteralExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), nler.numericLiteralExpCS ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // IOCL.g:103:4: nlel= numericLiteralExpCS (op= ( '*' | '/' ) uer= unaryExpCS )+
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS549);
                    nlel=numericLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nlel.getTree());
                    // IOCL.g:103:32: (op= ( '*' | '/' ) uer= unaryExpCS )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // IOCL.g:103:34: op= ( '*' | '/' ) uer= unaryExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS571);
                    	    uer=unaryExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, uer.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.operationCallExpCS = createOperationCallExpCS(nlel.numericLiteralExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), uer.operationCallExpCS ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // IOCL.g:104:4: uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )*
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS586);
                    uel=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, uel.getTree());
                    if ( state.backtracking==0 ) {
                       retval.operationCallExpCS = (uel!=null?uel.operationCallExpCS:null);
                    }
                    // IOCL.g:104:72: (op= ( '*' | '/' ) nler= numericLiteralExpCS )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // IOCL.g:104:74: op= ( '*' | '/' ) nler= numericLiteralExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS610);
                    	    nler=numericLiteralExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nler.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.operationCallExpCS = createOperationCallExpCS(uel.operationCallExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), nler.numericLiteralExpCS ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // IOCL.g:105:4: uel= unaryExpCS (op= ( '*' | '/' ) uer= unaryExpCS )*
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS625);
                    uel=unaryExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, uel.getTree());
                    if ( state.backtracking==0 ) {
                       retval.operationCallExpCS = (uel!=null?uel.operationCallExpCS:null);
                    }
                    // IOCL.g:105:72: (op= ( '*' | '/' ) uer= unaryExpCS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=22 && LA13_0<=23)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // IOCL.g:105:74: op= ( '*' | '/' ) uer= unaryExpCS
                    	    {
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_unaryExpCS_in_multiplicativeExpCS649);
                    	    uer=unaryExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, uer.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.operationCallExpCS = createOperationCallExpCS(uel.operationCallExpCS, createSimpleNameCS(op, (op!=null?op.getText():null)), uer.operationCallExpCS ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
        public OperationCallExpCS operationCallExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpCS"
    // IOCL.g:108:1: unaryExpCS returns [OperationCallExpCS operationCallExpCS] : op= ( '+' | '-' ) nle= numericLiteralExpCS ;
    public final IOCLParser.unaryExpCS_return unaryExpCS() throws RecognitionException {
        IOCLParser.unaryExpCS_return retval = new IOCLParser.unaryExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token op=null;
        IOCLParser.numericLiteralExpCS_return nle = null;


        NodeCS op_tree=null;

        try {
            // IOCL.g:109:5: (op= ( '+' | '-' ) nle= numericLiteralExpCS )
            // IOCL.g:109:9: op= ( '+' | '-' ) nle= numericLiteralExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            op=(Token)input.LT(1);
            if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (NodeCS)adaptor.create(op));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_numericLiteralExpCS_in_unaryExpCS696);
            nle=numericLiteralExpCS();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nle.getTree());
            if ( state.backtracking==0 ) {
               retval.operationCallExpCS = createOperationCallExpCS((nle!=null?nle.numericLiteralExpCS:null), createSimpleNameCS(op, (op!=null?op.getText():null)) ); 
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
    // $ANTLR end "unaryExpCS"

    public static class numericLiteralExpCS_return extends ParserRuleReturnScope {
        public NumericLiteralExpCS numericLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExpCS"
    // IOCL.g:112:1: numericLiteralExpCS returns [NumericLiteralExpCS numericLiteralExpCS] : (ile= integerLiteralExpCS | rle= realLiteralExpCS );
    public final IOCLParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IOCLParser.numericLiteralExpCS_return retval = new IOCLParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.integerLiteralExpCS_return ile = null;

        IOCLParser.realLiteralExpCS_return rle = null;



        try {
            // IOCL.g:113:2: (ile= integerLiteralExpCS | rle= realLiteralExpCS )
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
                    // IOCL.g:113:4: ile= integerLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS721);
                    ile=integerLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ile.getTree());
                    if ( state.backtracking==0 ) {
                       retval.numericLiteralExpCS = (ile!=null?ile.integerLiteralExpCS:null); 
                    }

                    }
                    break;
                case 2 :
                    // IOCL.g:114:4: rle= realLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS732);
                    rle=realLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rle.getTree());
                    if ( state.backtracking==0 ) {
                       retval.numericLiteralExpCS = (rle!=null?rle.realLiteralExpCS:null); 
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
        public StringLiteralExpCS stringLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExpCS"
    // IOCL.g:117:1: stringLiteralExpCS returns [StringLiteralExpCS stringLiteralExpCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL9=null;

        NodeCS STRING_LITERAL9_tree=null;

        try {
            // IOCL.g:118:2: ( STRING_LITERAL )
            // IOCL.g:118:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL9_tree = (NodeCS)adaptor.create(STRING_LITERAL9);
            adaptor.addChild(root_0, STRING_LITERAL9_tree);
            }
            if ( state.backtracking==0 ) {
               retval.stringLiteralExpCS = createStringLiteralExpCS(STRING_LITERAL9, (STRING_LITERAL9!=null?STRING_LITERAL9.getText():null)); 
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
        public BooleanLiteralExpCS booleanLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExpCS"
    // IOCL.g:121:1: booleanLiteralExpCS returns [BooleanLiteralExpCS booleanLiteralExpCS] : BOOLEAN_LITERAL ;
    public final IOCLParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IOCLParser.booleanLiteralExpCS_return retval = new IOCLParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BOOLEAN_LITERAL10=null;

        NodeCS BOOLEAN_LITERAL10_tree=null;

        try {
            // IOCL.g:122:2: ( BOOLEAN_LITERAL )
            // IOCL.g:122:4: BOOLEAN_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            BOOLEAN_LITERAL10=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL10_tree = (NodeCS)adaptor.create(BOOLEAN_LITERAL10);
            adaptor.addChild(root_0, BOOLEAN_LITERAL10_tree);
            }
            if ( state.backtracking==0 ) {
               retval.booleanLiteralExpCS = createBooleanLiteralExpCS(BOOLEAN_LITERAL10, (BOOLEAN_LITERAL10!=null?BOOLEAN_LITERAL10.getText():null)); 
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
        public IntegerLiteralExpCS integerLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExpCS"
    // IOCL.g:125:1: integerLiteralExpCS returns [IntegerLiteralExpCS integerLiteralExpCS] : INTEGER_LITERAL ;
    public final IOCLParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IOCLParser.integerLiteralExpCS_return retval = new IOCLParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token INTEGER_LITERAL11=null;

        NodeCS INTEGER_LITERAL11_tree=null;

        try {
            // IOCL.g:126:2: ( INTEGER_LITERAL )
            // IOCL.g:126:4: INTEGER_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            INTEGER_LITERAL11=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL11_tree = (NodeCS)adaptor.create(INTEGER_LITERAL11);
            adaptor.addChild(root_0, INTEGER_LITERAL11_tree);
            }
            if ( state.backtracking==0 ) {
               retval.integerLiteralExpCS = createIntegerLiteralExpCS(INTEGER_LITERAL11, (INTEGER_LITERAL11!=null?INTEGER_LITERAL11.getText():null)); 
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
        public RealLiteralExpCS realLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExpCS"
    // IOCL.g:129:1: realLiteralExpCS returns [RealLiteralExpCS realLiteralExpCS] : REAL_LITERAL ;
    public final IOCLParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IOCLParser.realLiteralExpCS_return retval = new IOCLParser.realLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token REAL_LITERAL12=null;

        NodeCS REAL_LITERAL12_tree=null;

        try {
            // IOCL.g:130:2: ( REAL_LITERAL )
            // IOCL.g:130:4: REAL_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            REAL_LITERAL12=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL12_tree = (NodeCS)adaptor.create(REAL_LITERAL12);
            adaptor.addChild(root_0, REAL_LITERAL12_tree);
            }
            if ( state.backtracking==0 ) {
               retval.realLiteralExpCS = createRealLiteralExpCS(REAL_LITERAL12, (REAL_LITERAL12!=null?REAL_LITERAL12.getText():null)); 
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

    // $ANTLR start synpred12_IOCL
    public final void synpred12_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.multiplicativeExpCS_return mel = null;

        IOCLParser.numericLiteralExpCS_return nler = null;


        // IOCL.g:97:8: (mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )* )
        // IOCL.g:97:8: mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )*
        {
        pushFollow(FOLLOW_multiplicativeExpCS_in_synpred12_IOCL421);
        mel=multiplicativeExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:97:86: (op= ( '+' | '-' ) nler= numericLiteralExpCS )*
        loop17:
        do {
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=20 && LA17_0<=21)) ) {
                alt17=1;
            }


            switch (alt17) {
        	case 1 :
        	    // IOCL.g:97:88: op= ( '+' | '-' ) nler= numericLiteralExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_numericLiteralExpCS_in_synpred12_IOCL444);
        	    nler=numericLiteralExpCS();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop17;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred12_IOCL

    // $ANTLR start synpred23_IOCL
    public final void synpred23_IOCL_fragment() throws RecognitionException {   
        Token op=null;
        IOCLParser.unaryExpCS_return uel = null;

        IOCLParser.numericLiteralExpCS_return nler = null;


        // IOCL.g:104:4: (uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )* )
        // IOCL.g:104:4: uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )*
        {
        pushFollow(FOLLOW_unaryExpCS_in_synpred23_IOCL586);
        uel=unaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // IOCL.g:104:72: (op= ( '*' | '/' ) nler= numericLiteralExpCS )*
        loop20:
        do {
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=22 && LA20_0<=23)) ) {
                alt20=1;
            }


            switch (alt20) {
        	case 1 :
        	    // IOCL.g:104:74: op= ( '*' | '/' ) nler= numericLiteralExpCS
        	    {
        	    op=(Token)input.LT(1);
        	    if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
        	        input.consume();
        	        state.errorRecovery=false;state.failed=false;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        MismatchedSetException mse = new MismatchedSetException(null,input);
        	        throw mse;
        	    }

        	    pushFollow(FOLLOW_numericLiteralExpCS_in_synpred23_IOCL610);
        	    nler=numericLiteralExpCS();

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
    // $ANTLR end synpred23_IOCL

    // Delegated rules

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
    public final boolean synpred23_IOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_IOCL_fragment(); // can never throw exception
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
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA9_eotS =
        "\17\uffff";
    static final String DFA9_eofS =
        "\17\uffff";
    static final String DFA9_minS =
        "\1\7\2\24\2\7\1\uffff\4\0\1\7\2\uffff\2\0";
    static final String DFA9_maxS =
        "\1\25\2\27\1\10\1\25\1\uffff\4\0\1\10\2\uffff\2\0";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\5\uffff\1\2\1\3\2\uffff";
    static final String DFA9_specialS =
        "\6\uffff\1\1\1\4\1\3\1\5\3\uffff\1\2\1\0}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\13\uffff\2\3",
            "\2\5\2\4",
            "\2\5\2\4",
            "\1\6\1\7",
            "\1\10\1\11\13\uffff\2\12",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\16",
            "",
            "",
            "\1\uffff",
            "\1\uffff"
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
            return "95:1: additiveExpCS returns [OperationCallExpCS operationCallExpCS] : (nlel= numericLiteralExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )+ | mel= multiplicativeExpCS (op= ( '+' | '-' ) nler= numericLiteralExpCS )* | mel= multiplicativeExpCS (op= ( '+' | '-' ) mer= multiplicativeExpCS )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_IOCL()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_9);
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
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\7\2\26\2\7\2\0\4\uffff";
    static final String DFA14_maxS =
        "\1\25\2\27\1\10\1\25\2\0\4\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4";
    static final String DFA14_specialS =
        "\5\uffff\1\0\1\1\4\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\2\13\uffff\2\3",
            "\2\4",
            "\2\4",
            "\1\5\1\6",
            "\2\7\13\uffff\2\10",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "101:1: multiplicativeExpCS returns [OperationCallExpCS operationCallExpCS] : (nlel= numericLiteralExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )+ | nlel= numericLiteralExpCS (op= ( '*' | '/' ) uer= unaryExpCS )+ | uel= unaryExpCS (op= ( '*' | '/' ) nler= numericLiteralExpCS )* | uel= unaryExpCS (op= ( '*' | '/' ) uer= unaryExpCS )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_IOCL()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_IOCL()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCallExpCS_in_oclExpressionCS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpressionCS96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExpCS_in_literalExpCS118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifierCS_in_collectionLiteralExpCS150 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_collectionLiteralExpCS152 = new BitSet(new long[]{0x00000000003201F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralExpCS158 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_collectionLiteralExpCS162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifierCS180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPartCS_in_collectionLiteralPartsCS201 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_collectionLiteralPartsCS206 = new BitSet(new long[]{0x00000000003001F0L});
    public static final BitSet FOLLOW_collectionLiteralPartsCS_in_collectionLiteralPartsCS208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionLiteralPartCS234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionRangeCS247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_collectionRangeCS249 = new BitSet(new long[]{0x00000000003001F0L});
    public static final BitSet FOLLOW_oclExpressionCS_in_collectionRangeCS251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modelPropertyCallExpCS_in_propertyCallExpCS316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExpCS_in_modelPropertyCallExpCS337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpCS_in_operationCallExpCS359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_additiveExpCS381 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_set_in_additiveExpCS389 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_additiveExpCS403 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS421 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS432 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_additiveExpCS444 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS463 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_additiveExpCS474 = new BitSet(new long[]{0x0000000000300180L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_additiveExpCS486 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS512 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS520 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS534 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS549 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS557 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS571 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS586 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS596 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_multiplicativeExpCS610 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS625 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpCS635 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_unaryExpCS_in_multiplicativeExpCS649 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_unaryExpCS682 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_unaryExpCS696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpCS_in_synpred12_IOCL421 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_synpred12_IOCL432 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_synpred12_IOCL444 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_unaryExpCS_in_synpred23_IOCL586 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_set_in_synpred23_IOCL596 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_synpred23_IOCL610 = new BitSet(new long[]{0x0000000000C00002L});

}