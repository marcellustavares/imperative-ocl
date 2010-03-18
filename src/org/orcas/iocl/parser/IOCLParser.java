// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-03-13 11:31:11

package org.orcas.iocl.parser;

import org.orcas.iocl.cst.NodeCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.OCLExpressionCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.cst.PrimitiveLiteralExpCS;
import org.orcas.iocl.cst.LiteralExpCS;
import org.antlr.runtime.Token;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class IOCLParser extends IOCLBaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "ID", "INT", "EXPONENT", "FLOAT", "WS", "ESC_SEQ", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC"
    };
    public static final int EXPONENT=7;
    public static final int ESC_SEQ=10;
    public static final int WS=9;
    public static final int STRING_LITERAL=4;
    public static final int UNICODE_ESC=13;
    public static final int OCTAL_ESC=14;
    public static final int CHAR=11;
    public static final int HEX_DIGIT=12;
    public static final int FLOAT=8;
    public static final int INT=6;
    public static final int ID=5;
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
    // IOCL.g:28:1: ioclExpressionCS returns [IOCLExpressionCS ioclExpressionCS] : ocle= oclExpressionCS ;
    public final IOCLParser.ioclExpressionCS_return ioclExpressionCS() throws RecognitionException {
        IOCLParser.ioclExpressionCS_return retval = new IOCLParser.ioclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.oclExpressionCS_return ocle = null;



        try {
            // IOCL.g:29:2: (ocle= oclExpressionCS )
            // IOCL.g:29:4: ocle= oclExpressionCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_oclExpressionCS_in_ioclExpressionCS70);
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
    // IOCL.g:32:1: oclExpressionCS returns [OCLExpressionCS oclExpressionCS] : le= literalExpCS ;
    public final IOCLParser.oclExpressionCS_return oclExpressionCS() throws RecognitionException {
        IOCLParser.oclExpressionCS_return retval = new IOCLParser.oclExpressionCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.literalExpCS_return le = null;



        try {
            // IOCL.g:33:2: (le= literalExpCS )
            // IOCL.g:33:4: le= literalExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_literalExpCS_in_oclExpressionCS92);
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
    // IOCL.g:36:1: literalExpCS returns [LiteralExpCS literalExpCS] : ple= primitiveLiteralExpCS ;
    public final IOCLParser.literalExpCS_return literalExpCS() throws RecognitionException {
        IOCLParser.literalExpCS_return retval = new IOCLParser.literalExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.primitiveLiteralExpCS_return ple = null;



        try {
            // IOCL.g:37:2: (ple= primitiveLiteralExpCS )
            // IOCL.g:37:5: ple= primitiveLiteralExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_primitiveLiteralExpCS_in_literalExpCS115);
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
    // IOCL.g:40:1: primitiveLiteralExpCS returns [PrimitiveLiteralExpCS primitiveLiteralExpCS] : sle= stringLiteralExpCS ;
    public final IOCLParser.primitiveLiteralExpCS_return primitiveLiteralExpCS() throws RecognitionException {
        IOCLParser.primitiveLiteralExpCS_return retval = new IOCLParser.primitiveLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        IOCLParser.stringLiteralExpCS_return sle = null;



        try {
            // IOCL.g:41:2: (sle= stringLiteralExpCS )
            // IOCL.g:41:5: sle= stringLiteralExpCS
            {
            root_0 = (NodeCS)adaptor.nil();

            pushFollow(FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS139);
            sle=stringLiteralExpCS();

            state._fsp--;

            adaptor.addChild(root_0, sle.getTree());
             retval.primitiveLiteralExpCS = (sle!=null?sle.stringLiteralExpCS:null);

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

    public static class stringLiteralExpCS_return extends ParserRuleReturnScope {
        public StringLiteralExpCS stringLiteralExpCS;
        NodeCS tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExpCS"
    // IOCL.g:44:1: stringLiteralExpCS returns [StringLiteralExpCS stringLiteralExpCS] : STRING_LITERAL ;
    public final IOCLParser.stringLiteralExpCS_return stringLiteralExpCS() throws RecognitionException {
        IOCLParser.stringLiteralExpCS_return retval = new IOCLParser.stringLiteralExpCS_return();
        retval.start = input.LT(1);

        NodeCS root_0 = null;

        Token STRING_LITERAL1=null;

        NodeCS STRING_LITERAL1_tree=null;

        try {
            // IOCL.g:45:2: ( STRING_LITERAL )
            // IOCL.g:45:4: STRING_LITERAL
            {
            root_0 = (NodeCS)adaptor.nil();

            STRING_LITERAL1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExpCS157);
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

    // Delegated rules




    public static final BitSet FOLLOW_oclExpressionCS_in_ioclExpressionCS70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExpCS_in_oclExpressionCS92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExpCS_in_literalExpCS115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExpCS_in_primitiveLiteralExpCS139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExpCS157 = new BitSet(new long[]{0x0000000000000002L});

}