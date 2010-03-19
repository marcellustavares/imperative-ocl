// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-03-19 00:20:52

package org.orcas.iocl.parser;

import org.antlr.runtime.Token;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.orcas.iocl.cst.NodeCS;
import org.orcas.iocl.cst.NumericLiteralExpCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class IOCLParser extends IOCLBaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "EXPONENT", "ESC_SEQ", "ID", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC"
    };
    public static final int BOOLEAN_LITERAL=5;
    public static final int EXPONENT=8;
    public static final int WS=11;
    public static final int ESC_SEQ=9;
    public static final int STRING_LITERAL=4;
    public static final int REAL_LITERAL=7;
    public static final int INTEGER_LITERAL=6;
    public static final int UNICODE_ESC=13;
    public static final int OCTAL_ESC=14;
    public static final int HEX_DIGIT=12;
    public static final int ID=10;
    public static final int EOF=-1;

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
    // IOCL.g:33:1: ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.ioclExpressionCS_return ioclExpressionCS() throws RecognitionException {
        IOCLParser.ioclExpressionCS_return retval = new IOCLParser.ioclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:34:2: (ocle= oclExpressionCS )
            // IOCL.g:34:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_ioclExpressionCS58);
            ocle=oclExpressionCS();

            state._fsp--;

            adaptor.addChild(root_0, ocle.getTree());
             retval.ioclExpressionCS = (ocle!=null?ocle.oclExpressionCS:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:37:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : le= literalExpCS ;
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:38:2: (le= literalExpCS )
            // IOCL.g:38:4: le= literalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_literalExpCS_in_oclExpressionCS80);
            le=literalExpCS();

            state._fsp--;

            adaptor.addChild(root_0, le.getTree());
             retval.oclExpressionCS = (le!=null?le.literalExpCS:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:41:1: literalExpCS returns [LiteralExpCS literalExpCS] : ple= primitiveLiteralExpCS ;
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:42:2: (ple= primitiveLiteralExpCS )
            // IOCL.g:42:4: ple= primitiveLiteralExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS102);
            ple=primitiveLiteralExpCS();

            state._fsp--;

            adaptor.addChild(root_0, ple.getTree());
             retval.literalExpCS = (ple!=null?ple.primitiveLiteralExpCS:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class primitiveLiteralExpCS_return extends ParserRuleReturnScope {
        public PrimitiveLiteralExpCS primitiveLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExpCS"
    // IOCL.g:45:1: primitiveLiteralExpCS returns [PrimitiveLiteralExpCS primitiveLiteralExpCS] : (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS );
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.numericLiteralExpCS_return nle = null;

        IOCLParser.stringLiteralExpCS_return sle = null;

        IOCLParser.booleanLiteralExpCS_return ble = null;



        try {
            // IOCL.g:46:2: (nle= numericLiteralExpCS | sle= stringLiteralExpCS | ble= booleanLiteralExpCS )
            int alt1=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt1=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt1=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // IOCL.g:46:4: nle= numericLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS125);
                    nle=numericLiteralExpCS();

                    state._fsp--;

                    adaptor.addChild(root_0, nle.getTree());
                     retval.primitiveLiteralExpCS = (nle!=null?nle.numericLiteralExpCS:null); 

                    }
                    break;
                case 2 :
                    // IOCL.g:47:4: sle= stringLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS136);
                    sle=stringLiteralExpCS();

                    state._fsp--;

                    adaptor.addChild(root_0, sle.getTree());
                     retval.primitiveLiteralExpCS = (sle!=null?sle.stringLiteralExpCS:null); 

                    }
                    break;
                case 3 :
                    // IOCL.g:48:4: ble= booleanLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS147);
                    ble=booleanLiteralExpCS();

                    state._fsp--;

                    adaptor.addChild(root_0, ble.getTree());
                     retval.primitiveLiteralExpCS = (ble!=null?ble.booleanLiteralExpCS:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
        public NumericLiteralExpCS numericLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExpCS"
    // IOCL.g:51:1: numericLiteralExpCS returns [NumericLiteralExpCS numericLiteralExpCS] : (ile= integerLiteralExpCS | rle= realLiteralExpCS );
    public final IOCLParser.numericLiteralExpCS_return numericLiteralExpCS() throws RecognitionException {
        IOCLParser.numericLiteralExpCS_return retval = new IOCLParser.numericLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.integerLiteralExpCS_return ile = null;

        IOCLParser.realLiteralExpCS_return rle = null;



        try {
            // IOCL.g:52:2: (ile= integerLiteralExpCS | rle= realLiteralExpCS )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INTEGER_LITERAL) ) {
                alt2=1;
            }
            else if ( (LA2_0==REAL_LITERAL) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // IOCL.g:52:4: ile= integerLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS169);
                    ile=integerLiteralExpCS();

                    state._fsp--;

                    adaptor.addChild(root_0, ile.getTree());
                     retval.numericLiteralExpCS = (ile!=null?ile.integerLiteralExpCS:null); 

                    }
                    break;
                case 2 :
                    // IOCL.g:53:4: rle= realLiteralExpCS
                    {
                    root_0 = (NodeCS)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExpCS_in_numericLiteralExpCS180);
                    rle=realLiteralExpCS();

                    state._fsp--;

                    adaptor.addChild(root_0, rle.getTree());
                     retval.numericLiteralExpCS = (rle!=null?rle.realLiteralExpCS:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:56:1: stringLiteralExpCS returns [StringLiteralExpCS stringLiteralExpCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL1=null;

        NodeCS STRING_LITERAL1_tree=null;

        try {
            // IOCL.g:57:2: ( STRING_LITERAL )
            // IOCL.g:57:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS198); 
            STRING_LITERAL1_tree = (NodeCS)adaptor.create(STRING_LITERAL1);
            adaptor.addChild(root_0, STRING_LITERAL1_tree);

             retval.stringLiteralExpCS = createStringLiteralExpCS(STRING_LITERAL1, (STRING_LITERAL1!=null?STRING_LITERAL1.getText():null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:60:1: booleanLiteralExpCS returns [BooleanLiteralExpCS booleanLiteralExpCS] : BOOLEAN_LITERAL ;
    public final IOCLParser.booleanLiteralExpCS_return booleanLiteralExpCS() throws RecognitionException {
        IOCLParser.booleanLiteralExpCS_return retval = new IOCLParser.booleanLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token BOOLEAN_LITERAL2=null;

        NodeCS BOOLEAN_LITERAL2_tree=null;

        try {
            // IOCL.g:61:2: ( BOOLEAN_LITERAL )
            // IOCL.g:61:4: BOOLEAN_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            BOOLEAN_LITERAL2=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS217); 
            BOOLEAN_LITERAL2_tree = (NodeCS)adaptor.create(BOOLEAN_LITERAL2);
            adaptor.addChild(root_0, BOOLEAN_LITERAL2_tree);

             retval.booleanLiteralExpCS = createBooleanLiteralExpCS(BOOLEAN_LITERAL2, (BOOLEAN_LITERAL2!=null?BOOLEAN_LITERAL2.getText():null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:64:1: integerLiteralExpCS returns [IntegerLiteralExpCS integerLiteralExpCS] : INTEGER_LITERAL ;
    public final IOCLParser.integerLiteralExpCS_return integerLiteralExpCS() throws RecognitionException {
        IOCLParser.integerLiteralExpCS_return retval = new IOCLParser.integerLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token INTEGER_LITERAL3=null;

        NodeCS INTEGER_LITERAL3_tree=null;

        try {
            // IOCL.g:65:2: ( INTEGER_LITERAL )
            // IOCL.g:65:4: INTEGER_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            INTEGER_LITERAL3=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS235); 
            INTEGER_LITERAL3_tree = (NodeCS)adaptor.create(INTEGER_LITERAL3);
            adaptor.addChild(root_0, INTEGER_LITERAL3_tree);

             retval.integerLiteralExpCS = createIntegerLiteralExpCS(INTEGER_LITERAL3, (INTEGER_LITERAL3!=null?INTEGER_LITERAL3.getText():null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // IOCL.g:68:1: realLiteralExpCS returns [RealLiteralExpCS realLiteralExpCS] : REAL_LITERAL ;
    public final IOCLParser.realLiteralExpCS_return realLiteralExpCS() throws RecognitionException {
        IOCLParser.realLiteralExpCS_return retval = new IOCLParser.realLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token REAL_LITERAL4=null;

        NodeCS REAL_LITERAL4_tree=null;

        try {
            // IOCL.g:69:2: ( REAL_LITERAL )
            // IOCL.g:69:4: REAL_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            REAL_LITERAL4=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExpCS254); 
            REAL_LITERAL4_tree = (NodeCS)adaptor.create(REAL_LITERAL4);
            adaptor.addChild(root_0, REAL_LITERAL4_tree);

             retval.realLiteralExpCS = createRealLiteralExpCS(REAL_LITERAL4, (REAL_LITERAL4!=null?REAL_LITERAL4.getText():null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (NodeCS)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpressionCS80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExpCS_in_primitiveLiteralExpCS125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExpCS_in_primitiveLiteralExpCS147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExpCS_in_numericLiteralExpCS169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExpCS_in_numericLiteralExpCS180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExpCS217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExpCS235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExpCS254 = new BitSet(new long[]{0x0000000000000002L});

}