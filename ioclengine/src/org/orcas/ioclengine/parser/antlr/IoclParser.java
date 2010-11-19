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
package org.orcas.ioclengine.parser.antlr;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.HashMap;

public class IoclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_EXP", "AND", "APPEND", "ARROW", "ATTRIBUTE_CALL", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ENUM_LITERAL", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "IMPERATIVE_OPERATION_CALL", "ITERATE", "ITERATOR", "IS", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NEW", "NOT", "NOT_EQUAL", "MULT", "OPERATION_CALL", "OR", "PATH_NAME", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "IDENTIFIER", "ITERATOR_NAME", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=65;
    public static final int APPEND=6;
    public static final int EXPONENT=68;
    public static final int LT=35;
    public static final int WHILE=56;
    public static final int PRIMITIVE_TYPE_LITERAL=66;
    public static final int COMPUTE=14;
    public static final int IMPERATIVE_OPERATION_CALL=29;
    public static final int GTE=27;
    public static final int OCTAL_ESC=73;
    public static final int NEW=38;
    public static final int DO=16;
    public static final int FOR=25;
    public static final int NOT=39;
    public static final int AND=5;
    public static final int EXCEPT=24;
    public static final int EOF=-1;
    public static final int LTE=36;
    public static final int BREAK=10;
    public static final int LPAREN=34;
    public static final int IF=28;
    public static final int RPAREN=49;
    public static final int ESC_SEQ=69;
    public static final int STRING_LITERAL=60;
    public static final int REAL_LITERAL=63;
    public static final int SCOPE=50;
    public static final int COLLECTION_TYPE_LITERAL=59;
    public static final int CONTINUE=15;
    public static final int NOT_EQUAL=40;
    public static final int IS=32;
    public static final int IDENTIFIER=64;
    public static final int ITERATOR=31;
    public static final int EQUAL=23;
    public static final int RETURN=48;
    public static final int ENDIF=19;
    public static final int ENUM_LITERAL=20;
    public static final int PLUS=45;
    public static final int VAR=54;
    public static final int RAISE=46;
    public static final int DOT=18;
    public static final int PATH_NAME=44;
    public static final int COLLECTION_LITERAL=11;
    public static final int FOR_NAME=67;
    public static final int XOR=57;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int UNICODE_ESC=72;
    public static final int NUMERIC_OPERATION=58;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=71;
    public static final int LCURLY=33;
    public static final int SEMICOLON=52;
    public static final int MINUS=37;
    public static final int MULT=41;
    public static final int TRY=53;
    public static final int BOOLEAN_LITERAL=61;
    public static final int COLON=13;
    public static final int ALT_EXP=4;
    public static final int ELIF=21;
    public static final int ITERATE=30;
    public static final int WS=70;
    public static final int VARIABLE=55;
    public static final int INTEGER_LITERAL=62;
    public static final int BLOCK=9;
    public static final int RCURLY=47;
    public static final int OR=43;
    public static final int ARROW=7;
    public static final int GT=26;
    public static final int OPERATION_CALL=42;
    public static final int DIV=17;
    public static final int T__75=75;
    public static final int SELF=51;
    public static final int T__74=74;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[134+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IoclParser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g"; }


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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:111:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression399);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression404);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:116:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:117:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:117:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp415);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:117:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:117:17: ( AND | OR | XOR ) equalityExp
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

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp431);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:120:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:121:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:121:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp444);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:121:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:121:19: ( EQUAL | NOT_EQUAL ) relationalExp
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

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp456);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:124:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:125:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:125:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp469);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:125:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:125:17: ( LT | LTE | GT | GTE ) additiveExp
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

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp489);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:128:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:129:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:129:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp502);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:129:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:129:23: ( PLUS | MINUS ) multiplicativeExp
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

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp514);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:132:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:133:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:133:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp527);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:133:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:133:14: ( MULT | DIV ) unaryExp
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

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp540);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:136:1: unaryExp : ( ( MINUS | NOT ) unaryExp | dotArrowExp );
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:137:2: ( ( MINUS | NOT ) unaryExp | dotArrowExp )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MINUS||LA7_0==NOT) ) {
                alt7=1;
            }
            else if ( (LA7_0==LPAREN||LA7_0==SELF||(LA7_0>=COLLECTION_TYPE_LITERAL && LA7_0<=IDENTIFIER)||LA7_0==PRIMITIVE_TYPE_LITERAL) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:137:4: ( MINUS | NOT ) unaryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set18=(Token)input.LT(1);
                    set18=(Token)input.LT(1);
                    if ( input.LA(1)==MINUS||input.LA(1)==NOT ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set18), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExp_in_unaryExp562);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:138:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp567);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:141:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExp_return oclExp21 = null;

        IoclParser.propertyCallExp_return propertyCallExp22 = null;

        IoclParser.oclExp_return oclExp23 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:2: ( oclExp ( propertyCallExp )+ | oclExp )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:4: oclExp ( propertyCallExp )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp578);
                    oclExp21=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp21.getTree());
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:26: ( propertyCallExp )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ARROW||LA8_0==DOT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
                    	    {
                    	    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp580);
                    	    propertyCallExp22=propertyCallExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(propertyCallExp22.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:143:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp587);
                    oclExp23=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp23.getTree());

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

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:146:1: propertyCallExp : ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token set24=null;
        Token ARROW26=null;
        IoclParser.modelPropertyCallExp_return modelPropertyCallExp25 = null;

        IoclParser.loopExp_return loopExp27 = null;


        Object set24_tree=null;
        Object ARROW26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:147:2: ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ARROW) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==SELF||LA10_1==NUMERIC_OPERATION||LA10_1==IDENTIFIER) ) {
                    alt10=1;
                }
                else if ( (LA10_1==ITERATE||LA10_1==ITERATOR_NAME) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==DOT) ) {
                alt10=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:147:4: ( DOT | ARROW ) modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set24=(Token)input.LT(1);
                    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp607);
                    modelPropertyCallExp25=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp25.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:4: ARROW loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    ARROW26=(Token)match(input,ARROW,FOLLOW_ARROW_in_propertyCallExp612); if (state.failed) return retval;
                    pushFollow(FOLLOW_loopExp_in_propertyCallExp615);
                    loopExp27=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp27.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:151:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp28 = null;

        IoclParser.attributeCallExp_return attributeCallExp29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:2: ( operationCallExp | attributeCallExp )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NUMERIC_OPERATION) ) {
                alt11=1;
            }
            else if ( (LA11_0==SELF||LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred21_Iocl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:4: operationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp626);
                    operationCallExp28=operationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp28.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:153:4: attributeCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeCallExp_in_modelPropertyCallExp631);
                    attributeCallExp29=attributeCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeCallExp29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:156:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        IoclParser.arguments_return arguments32 = null;

        IoclParser.simpleName_return simpleName34 = null;

        IoclParser.arguments_return arguments36 = null;


        Object NUMERIC_OPERATION30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NUMERIC_OPERATION) ) {
                alt14=1;
            }
            else if ( (LA14_0==SELF||LA14_0==IDENTIFIER) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION30=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION30);

                    char_literal31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal31);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:26: ( arguments )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==BREAK||(LA12_0>=COMPUTE && LA12_0<=DO)||LA12_0==IF||(LA12_0>=LCURLY && LA12_0<=LPAREN)||(LA12_0>=MINUS && LA12_0<=NOT)||LA12_0==RAISE||LA12_0==RETURN||LA12_0==SELF||(LA12_0>=TRY && LA12_0<=VAR)||LA12_0==WHILE||(LA12_0>=COLLECTION_TYPE_LITERAL && LA12_0<=IDENTIFIER)||LA12_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp646);
                            arguments32=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments32.getTree());

                            }
                            break;

                    }

                    char_literal33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal33);



                    // AST REWRITE
                    // elements: arguments, NUMERIC_OPERATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:64: ( arguments )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:4: simpleName '(' ( arguments )? ')'
                    {
                    pushFollow(FOLLOW_simpleName_in_operationCallExp663);
                    simpleName34=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleName.add(simpleName34.getTree());
                    char_literal35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal35);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:19: ( arguments )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==BREAK||(LA13_0>=COMPUTE && LA13_0<=DO)||LA13_0==IF||(LA13_0>=LCURLY && LA13_0<=LPAREN)||(LA13_0>=MINUS && LA13_0<=NOT)||LA13_0==RAISE||LA13_0==RETURN||LA13_0==SELF||(LA13_0>=TRY && LA13_0<=VAR)||LA13_0==WHILE||(LA13_0>=COLLECTION_TYPE_LITERAL && LA13_0<=IDENTIFIER)||LA13_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp667);
                            arguments36=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments36.getTree());

                            }
                            break;

                    }

                    char_literal37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal37);



                    // AST REWRITE
                    // elements: arguments, simpleName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:34: -> ^( OPERATION_CALL simpleName ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:37: ^( OPERATION_CALL simpleName ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATION_CALL, "OPERATION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_simpleName.nextTree());
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:65: ( arguments )?
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
            if ( state.backtracking>0 ) { memoize(input, 11, operationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExp"

    public static class attributeCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:161:1: attributeCallExp : simpleName -> ^( ATTRIBUTE_CALL simpleName ) ;
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName38 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:162:2: ( simpleName -> ^( ATTRIBUTE_CALL simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:162:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_attributeCallExp692);
            simpleName38=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName38.getTree());


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
            // 162:15: -> ^( ATTRIBUTE_CALL simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:162:18: ^( ATTRIBUTE_CALL simpleName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_CALL, "ATTRIBUTE_CALL"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 12, attributeCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "attributeCallExp"

    public static class oclExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:1: oclExp : ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression );
    public final IoclParser.oclExp_return oclExp() throws RecognitionException {
        IoclParser.oclExp_return retval = new IoclParser.oclExp_return();
        retval.start = input.LT(1);
        int oclExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        IoclParser.literalExp_return literalExp39 = null;

        IoclParser.variableExp_return variableExp40 = null;

        IoclParser.type_return type41 = null;

        IoclParser.oclExpression_return oclExpression43 = null;


        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:2: ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression )
            int alt15=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==SCOPE) ) {
                    alt15=1;
                }
                else if ( (synpred26_Iocl()) ) {
                    alt15=2;
                }
                else if ( (synpred27_Iocl()) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==LCURLY) ) {
                    alt15=1;
                }
                else if ( (LA15_2==LPAREN) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt15=1;
                }
                break;
            case SELF:
                {
                alt15=2;
                }
                break;
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt15=3;
                }
                break;
            case LPAREN:
                {
                alt15=4;
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:165:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp710);
                    literalExp39=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp39.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp716);
                    variableExp40=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp40.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:167:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp721);
                    type41=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type41.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:168:4: '(' oclExpression ')'
                    {
                    char_literal42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal42);

                    pushFollow(FOLLOW_oclExpression_in_oclExp728);
                    oclExpression43=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression43.getTree());
                    char_literal44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal44);



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
                    // 168:26: -> oclExpression
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
            if ( state.backtracking>0 ) { memoize(input, 13, oclExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExp"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName45 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp748);
            simpleName45=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName45.getTree());


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
            // 172:15: -> ^( VARIABLE simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:18: ^( VARIABLE simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 14, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:175:1: literalExp : ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.enumerationLiteralExp_return enumerationLiteralExp46 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp47 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:176:2: ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp )
            int alt16=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt16=2;
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:176:4: enumerationLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumerationLiteralExp_in_literalExp767);
                    enumerationLiteralExp46=enumerationLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationLiteralExp46.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:177:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp772);
                    collectionLiteralExp47=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp47.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:178:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp778);
                    primitiveLiteralExp48=primitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExp48.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, literalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExp"

    public static class collectionLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
    public final IoclParser.collectionLiteralExp_return collectionLiteralExp() throws RecognitionException {
        IoclParser.collectionLiteralExp_return retval = new IoclParser.collectionLiteralExp_return();
        retval.start = input.LT(1);
        int collectionLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal50=null;
        Token char_literal52=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier49 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts51 = null;


        Object char_literal50_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionLiteralParts=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralParts");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp790);
            collectionTypeIdentifier49=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier49.getTree());
            char_literal50=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal50);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:33: ( collectionLiteralParts )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==BREAK||(LA17_0>=COMPUTE && LA17_0<=DO)||LA17_0==IF||(LA17_0>=LCURLY && LA17_0<=LPAREN)||(LA17_0>=MINUS && LA17_0<=NOT)||LA17_0==RAISE||LA17_0==RETURN||LA17_0==SELF||(LA17_0>=TRY && LA17_0<=VAR)||LA17_0==WHILE||(LA17_0>=COLLECTION_TYPE_LITERAL && LA17_0<=IDENTIFIER)||LA17_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp794);
                    collectionLiteralParts51=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts51.getTree());

                    }
                    break;

            }

            char_literal52=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp797); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal52);



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
            // 182:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:110: ( collectionLiteralParts )?
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
            if ( state.backtracking>0 ) { memoize(input, 16, collectionLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExp"

    public static class collectionTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifier"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:185:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL53=null;

        Object COLLECTION_TYPE_LITERAL53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:186:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:186:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL53=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier819); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL53_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL53);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL53_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 17, collectionTypeIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifier"

    public static class collectionLiteralParts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralParts"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
    public final IoclParser.collectionLiteralParts_return collectionLiteralParts() throws RecognitionException {
        IoclParser.collectionLiteralParts_return retval = new IoclParser.collectionLiteralParts_return();
        retval.start = input.LT(1);
        int collectionLiteralParts_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal55=null;
        IoclParser.collectionLiteralPart_return collectionLiteralPart54 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts56 = null;


        Object char_literal55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts830);
            collectionLiteralPart54=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart54.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:26: ( ',' collectionLiteralParts )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==74) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred31_Iocl()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:27: ',' collectionLiteralParts
            	    {
            	    char_literal55=(Token)match(input,74,FOLLOW_74_in_collectionLiteralParts833); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts836);
            	    collectionLiteralParts56=collectionLiteralParts();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralParts56.getTree());

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

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, collectionLiteralParts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralParts"

    public static class collectionLiteralPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPart"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression57 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:194:2: ( oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:194:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart849);
            oclExpression57=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression57.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, collectionLiteralPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPart"

    public static class primitiveLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
    public final IoclParser.primitiveLiteralExp_return primitiveLiteralExp() throws RecognitionException {
        IoclParser.primitiveLiteralExp_return retval = new IoclParser.primitiveLiteralExp_return();
        retval.start = input.LT(1);
        int primitiveLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExp_return numericLiteralExp58 = null;

        IoclParser.stringLiteralExp_return stringLiteralExp59 = null;

        IoclParser.booleanLiteralExp_return booleanLiteralExp60 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
            int alt19=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt19=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt19=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:198:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp860);
                    numericLiteralExp58=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp58.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:199:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp865);
                    stringLiteralExp59=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp59.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:200:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp870);
                    booleanLiteralExp60=booleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExp60.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, primitiveLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExp"

    public static class numericLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:203:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp61 = null;

        IoclParser.realLiteralExp_return realLiteralExp62 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:204:2: ( integerLiteralExp | realLiteralExp )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INTEGER_LITERAL) ) {
                alt20=1;
            }
            else if ( (LA20_0==REAL_LITERAL) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:204:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp881);
                    integerLiteralExp61=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp61.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:205:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp886);
                    realLiteralExp62=realLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExp62.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, numericLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExp"

    public static class stringLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:208:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL63=null;

        Object STRING_LITERAL63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:209:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:209:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL63=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL63_tree = (Object)adaptor.create(STRING_LITERAL63);
            adaptor.addChild(root_0, STRING_LITERAL63_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, stringLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExp"

    public static class booleanLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:212:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL64=null;

        Object BOOLEAN_LITERAL64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:213:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:213:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL64=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp912); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL64_tree = (Object)adaptor.create(BOOLEAN_LITERAL64);
            adaptor.addChild(root_0, BOOLEAN_LITERAL64_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 23, booleanLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExp"

    public static class integerLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL65=null;

        Object INTEGER_LITERAL65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:217:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:217:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL65=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL65_tree = (Object)adaptor.create(INTEGER_LITERAL65);
            adaptor.addChild(root_0, INTEGER_LITERAL65_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 24, integerLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExp"

    public static class realLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL66=null;

        Object REAL_LITERAL66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:221:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:221:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL66=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp935); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL66_tree = (Object)adaptor.create(REAL_LITERAL66);
            adaptor.addChild(root_0, REAL_LITERAL66_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, realLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExp"

    public static class enumerationLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumerationLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:1: enumerationLiteralExp : IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) ;
    public final IoclParser.enumerationLiteralExp_return enumerationLiteralExp() throws RecognitionException {
        IoclParser.enumerationLiteralExp_return retval = new IoclParser.enumerationLiteralExp_return();
        retval.start = input.LT(1);
        int enumerationLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER67=null;
        Token SCOPE68=null;
        Token IDENTIFIER69=null;

        Object IDENTIFIER67_tree=null;
        Object SCOPE68_tree=null;
        Object IDENTIFIER69_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:2: ( IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:4: IDENTIFIER ( SCOPE IDENTIFIER )+
            {
            IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER67);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:15: ( SCOPE IDENTIFIER )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SCOPE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE68=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_enumerationLiteralExp949); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE68);

            	    IDENTIFIER69=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp951); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER69);


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:35: -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:225:38: ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUM_LITERAL, "ENUM_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
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
            if ( state.backtracking>0 ) { memoize(input, 26, enumerationLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumerationLiteralExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp70 = null;

        IoclParser.iterateExp_return iterateExp71 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:229:2: ( iteratorExp | iterateExp )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ITERATOR_NAME) ) {
                alt22=1;
            }
            else if ( (LA22_0==ITERATE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:229:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp976);
                    iteratorExp70=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp70.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:230:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp981);
                    iterateExp71=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp71.getTree());

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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:233:1: iteratorExp : ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATOR_NAME72=null;
        Token LPAREN73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token RPAREN77=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression76 = null;


        Object ITERATOR_NAME72_tree=null;
        Object LPAREN73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object RPAREN77_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:2: ( ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:4: ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            ITERATOR_NAME72=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME72);

            LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp994); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN73);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:26: (v1= variableDeclaration ',' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==IDENTIFIER) ) {
                        int LA23_1 = input.LA(2);

                        if ( (synpred37_Iocl()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:27: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1002);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal74=(Token)match(input,74,FOLLOW_74_in_iteratorExp1004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_74.add(char_literal74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1012);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal75=(Token)match(input,75,FOLLOW_75_in_iteratorExp1014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal75);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp1018);
            oclExpression76=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression76.getTree());
            RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp1020); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN77);



            // AST REWRITE
            // elements: ITERATOR_NAME, v2, oclExpression, v1
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
            // 235:3: -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:235:6: ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:235:31: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:235:36: ( $v2)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:238:1: iterateExp : ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATE78=null;
        Token LPAREN79=null;
        Token SEMICOLON80=null;
        Token char_literal81=null;
        Token RPAREN83=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression82 = null;


        Object ITERATE78_tree=null;
        Object LPAREN79_tree=null;
        Object SEMICOLON80_tree=null;
        Object char_literal81_tree=null;
        Object RPAREN83_tree=null;
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:2: ( ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:4: ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            ITERATE78=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp1052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE78);

            LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp1054); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:19: (v1= variableDeclaration SEMICOLON )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENTIFIER) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred39_Iocl()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:20: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp1061);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON80=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp1063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON80);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1071);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal81=(Token)match(input,75,FOLLOW_75_in_iterateExp1074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal81);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1076);
            oclExpression82=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression82.getTree());
            RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN83);



            // AST REWRITE
            // elements: v2, v1, ITERATE, oclExpression
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
            // 240:3: -> ^( ITERATE ( $v1)? $v2 oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:240:6: ^( ITERATE ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:240:16: ( $v1)?
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:243:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        IoclParser.type_return type86 = null;

        IoclParser.oclExpression_return oclExpression88 = null;


        Object IDENTIFIER84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER84);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:15: ( ':' type )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:16: ':' type
                    {
                    char_literal85=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal85);

                    pushFollow(FOLLOW_type_in_variableDeclaration1112);
                    type86=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type86.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:27: ( '=' oclExpression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQUAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:28: '=' oclExpression
                    {
                    char_literal87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal87);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1119);
                    oclExpression88=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression88.getTree());

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
            // 244:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:79: ( oclExpression )?
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

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:247:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal90=null;
        IoclParser.oclExpression_return oclExpression89 = null;

        IoclParser.oclExpression_return oclExpression91 = null;


        Object char_literal90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:248:2: ( oclExpression ( ',' oclExpression )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:248:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1146);
            oclExpression89=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression89.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:248:18: ( ',' oclExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==74) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:248:19: ',' oclExpression
            	    {
            	    char_literal90=(Token)match(input,74,FOLLOW_74_in_arguments1149); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1152);
            	    oclExpression91=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression91.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
            if ( state.backtracking>0 ) { memoize(input, 31, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set92=null;

        Object set92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:252:2: ( SELF | IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set92=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set92));
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
            if ( state.backtracking>0 ) { memoize(input, 32, simpleName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:256:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL93=null;

        Object PRIMITIVE_TYPE_LITERAL93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:257:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:257:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL93=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL93_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL93);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL93_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 33, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:260:1: collectionType : collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN95=null;
        Token RPAREN97=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier94 = null;

        IoclParser.type_return type96 = null;


        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:261:2: ( collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:261:4: collectionTypeIdentifier LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1193);
            collectionTypeIdentifier94=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier94.getTree());
            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1195); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN95);

            pushFollow(FOLLOW_type_in_collectionType1197);
            type96=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type96.getTree());
            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1199); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);



            // AST REWRITE
            // elements: collectionTypeIdentifier, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:48: -> ^( COLLECTION_TYPE collectionTypeIdentifier type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:261:51: ^( COLLECTION_TYPE collectionTypeIdentifier type )
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
            if ( state.backtracking>0 ) { memoize(input, 34, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:264:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType98 = null;

        IoclParser.collectionType_return collectionType99 = null;

        IoclParser.pathName_return pathName100 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:265:2: ( primitiveType | collectionType | pathName )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt29=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt29=2;
                }
                break;
            case IDENTIFIER:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:265:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1221);
                    primitiveType98=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType98.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:266:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1226);
                    collectionType99=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType99.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:267:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1231);
                    pathName100=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName100.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:270:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER101=null;
        Token SCOPE102=null;
        Token IDENTIFIER103=null;

        Object IDENTIFIER101_tree=null;
        Object SCOPE102_tree=null;
        Object IDENTIFIER103_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER101);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:15: ( SCOPE IDENTIFIER )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SCOPE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE102=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1245); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE102);

            	    IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1247); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER103);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:35: -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:38: ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_NAME, "PATH_NAME"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:61: ( IDENTIFIER )*
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
            if ( state.backtracking>0 ) { memoize(input, 36, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp | imperativeOperationCallExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp104 = null;

        IoclParser.breakExp_return breakExp105 = null;

        IoclParser.computeExp_return computeExp106 = null;

        IoclParser.continueExp_return continueExp107 = null;

        IoclParser.returnExp_return returnExp108 = null;

        IoclParser.variableInitExp_return variableInitExp109 = null;

        IoclParser.assignExp_return assignExp110 = null;

        IoclParser.raiseExp_return raiseExp111 = null;

        IoclParser.whileExp_return whileExp112 = null;

        IoclParser.ifExp_return ifExp113 = null;

        IoclParser.tryExp_return tryExp114 = null;

        IoclParser.forExp_return forExp115 = null;

        IoclParser.instantiationExp_return instantiationExp116 = null;

        IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp117 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp | imperativeOperationCallExp )
            int alt31=14;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1273);
                    blockExp104=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp104.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:278:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1278);
                    breakExp105=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp105.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:279:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1283);
                    computeExp106=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp106.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:280:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1288);
                    continueExp107=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp107.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:281:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1293);
                    returnExp108=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp108.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1298);
                    variableInitExp109=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp109.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:283:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1303);
                    assignExp110=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp110.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:284:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1308);
                    raiseExp111=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp111.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:285:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1313);
                    whileExp112=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp112.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:286:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1318);
                    ifExp113=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp113.getTree());

                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:287:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1323);
                    tryExp114=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp114.getTree());

                    }
                    break;
                case 12 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1328);
                    forExp115=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp115.getTree());

                    }
                    break;
                case 13 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:289:4: instantiationExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instantiationExp_in_imperativeExp1333);
                    instantiationExp116=instantiationExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instantiationExp116.getTree());

                    }
                    break;
                case 14 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:290:4: imperativeOperationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeOperationCallExp_in_imperativeExp1338);
                    imperativeOperationCallExp117=imperativeOperationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeOperationCallExp117.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:293:1: blockExp : ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO118=null;
        Token LCURLY119=null;
        Token RCURLY121=null;
        IoclParser.imperativeExp_return imperativeExp120 = null;


        Object DO118_tree=null;
        Object LCURLY119_tree=null;
        Object RCURLY121_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:2: ( ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: ( DO )? LCURLY ( imperativeExp )* RCURLY
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: ( DO )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DO) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO118=(Token)match(input,DO,FOLLOW_DO_in_blockExp1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO118);


                    }
                    break;

            }

            LCURLY119=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY119);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:15: ( imperativeExp )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==BREAK||(LA33_0>=COMPUTE && LA33_0<=DO)||LA33_0==IF||(LA33_0>=LCURLY && LA33_0<=LPAREN)||LA33_0==NEW||LA33_0==RAISE||LA33_0==RETURN||LA33_0==SELF||(LA33_0>=TRY && LA33_0<=VAR)||LA33_0==WHILE||(LA33_0>=COLLECTION_TYPE_LITERAL && LA33_0<=IDENTIFIER)||LA33_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_blockExp1354);
            	    imperativeExp120=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp120.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            RCURLY121=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY121);



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
            // 294:37: -> ^( BLOCK ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:40: ^( BLOCK ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:48: ( imperativeExp )*
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

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:297:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK122=null;
        Token SEMICOLON123=null;

        Object BREAK122_tree=null;
        Object SEMICOLON123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:298:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:298:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK122=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1377); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK122_tree = (Object)adaptor.create(BREAK122);
            root_0 = (Object)adaptor.becomeRoot(BREAK122_tree, root_0);
            }
            SEMICOLON123=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1380); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON123_tree = (Object)adaptor.create(SEMICOLON123);
            adaptor.addChild(root_0, SEMICOLON123_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 39, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:301:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE124=null;
        Token LPAREN125=null;
        Token RPAREN127=null;
        IoclParser.variableDeclaration_return variableDeclaration126 = null;

        IoclParser.oclExpression_return oclExpression128 = null;


        Object COMPUTE124_tree=null;
        Object LPAREN125_tree=null;
        Object RPAREN127_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:302:2: ( COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:302:4: COMPUTE LPAREN variableDeclaration RPAREN oclExpression
            {
            COMPUTE124=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE124);

            LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1393); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN125);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1395);
            variableDeclaration126=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration126.getTree());
            RPAREN127=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN127);

            pushFollow(FOLLOW_oclExpression_in_computeExp1399);
            oclExpression128=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression128.getTree());


            // AST REWRITE
            // elements: variableDeclaration, oclExpression, COMPUTE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:60: -> ^( COMPUTE variableDeclaration oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:302:63: ^( COMPUTE variableDeclaration oclExpression )
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
            if ( state.backtracking>0 ) { memoize(input, 40, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE129=null;
        Token SEMICOLON130=null;

        Object CONTINUE129_tree=null;
        Object SEMICOLON130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:306:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:306:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE129=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE129_tree = (Object)adaptor.create(CONTINUE129);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE129_tree, root_0);
            }
            SEMICOLON130=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON130_tree = (Object)adaptor.create(SEMICOLON130);
            adaptor.addChild(root_0, SEMICOLON130_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 41, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:309:1: returnExp : RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN131=null;
        Token SEMICOLON133=null;
        IoclParser.logicalExp_return logicalExp132 = null;


        Object RETURN131_tree=null;
        Object SEMICOLON133_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:2: ( RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:4: RETURN ( logicalExp )? SEMICOLON
            {
            RETURN131=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN131);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:11: ( logicalExp )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LPAREN||LA34_0==MINUS||LA34_0==NOT||LA34_0==SELF||(LA34_0>=COLLECTION_TYPE_LITERAL && LA34_0<=IDENTIFIER)||LA34_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: logicalExp
                    {
                    pushFollow(FOLLOW_logicalExp_in_returnExp1436);
                    logicalExp132=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp132.getTree());

                    }
                    break;

            }

            SEMICOLON133=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON133);



            // AST REWRITE
            // elements: logicalExp, RETURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:33: -> ^( RETURN ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:36: ^( RETURN ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:310:45: ( logicalExp )?
                if ( stream_logicalExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_logicalExp.nextTree());

                }
                stream_logicalExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 42, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:313:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR134=null;
        Token SEMICOLON136=null;
        IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations135 = null;


        Object VAR134_tree=null;
        Object SEMICOLON136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:314:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:314:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR134=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR134_tree = (Object)adaptor.create(VAR134);
            root_0 = (Object)adaptor.becomeRoot(VAR134_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1462);
            imperativeVarDeclarations135=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations135.getTree());
            SEMICOLON136=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1464); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 43, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class imperativeVarDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclarations"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:317:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
    public final IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations() throws RecognitionException {
        IoclParser.imperativeVarDeclarations_return retval = new IoclParser.imperativeVarDeclarations_return();
        retval.start = input.LT(1);
        int imperativeVarDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal138=null;
        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration137 = null;

        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration139 = null;


        Object char_literal138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:318:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:318:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1477);
            imperativeVarDeclaration137=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration137.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:318:29: ( ',' imperativeVarDeclaration )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==74) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:318:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal138=(Token)match(input,74,FOLLOW_74_in_imperativeVarDeclarations1480); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1483);
            	    imperativeVarDeclaration139=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration139.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 44, imperativeVarDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclarations"

    public static class imperativeVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) ;
    public final IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration() throws RecognitionException {
        IoclParser.imperativeVarDeclaration_return retval = new IoclParser.imperativeVarDeclaration_return();
        retval.start = input.LT(1);
        int imperativeVarDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER140=null;
        Token char_literal141=null;
        Token EQUAL143=null;
        Token IS144=null;
        IoclParser.type_return type142 = null;

        IoclParser.logicalExp_return logicalExp145 = null;


        Object IDENTIFIER140_tree=null;
        Object char_literal141_tree=null;
        Object EQUAL143_tree=null;
        Object IS144_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )?
            {
            IDENTIFIER140=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1497); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER140);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:15: ( ':' type )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==COLON) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:16: ':' type
                    {
                    char_literal141=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal141);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1502);
                    type142=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type142.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:27: ( ( EQUAL | IS ) logicalExp )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==EQUAL||LA38_0==IS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:28: ( EQUAL | IS ) logicalExp
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:28: ( EQUAL | IS )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==EQUAL) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==IS) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:29: EQUAL
                            {
                            EQUAL143=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1508); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL143);


                            }
                            break;
                        case 2 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:37: IS
                            {
                            IS144=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1512); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS144);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalExp_in_imperativeVarDeclaration1516);
                    logicalExp145=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp145.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: logicalExp, IDENTIFIER, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 322:55: -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:58: ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:80: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:322:86: ( logicalExp )?
                if ( stream_logicalExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_logicalExp.nextTree());

                }
                stream_logicalExp.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 45, imperativeVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclaration"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:325:1: assignExp : dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set147=null;
        Token SEMICOLON149=null;
        IoclParser.dotArrowExp_return dotArrowExp146 = null;

        IoclParser.logicalExp_return logicalExp148 = null;


        Object set147_tree=null;
        Object SEMICOLON149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:326:2: ( dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:326:4: dotArrowExp ( IS | APPEND ) logicalExp SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dotArrowExp_in_assignExp1543);
            dotArrowExp146=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp146.getTree());
            set147=(Token)input.LT(1);
            set147=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set147), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_logicalExp_in_assignExp1554);
            logicalExp148=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExp148.getTree());
            SEMICOLON149=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1556); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 46, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:329:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE150=null;
        Token STRING_LITERAL152=null;
        Token SEMICOLON153=null;
        IoclParser.type_return type151 = null;


        Object RAISE150_tree=null;
        Object STRING_LITERAL152_tree=null;
        Object SEMICOLON153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE150=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1568); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE150_tree = (Object)adaptor.create(RAISE150);
            root_0 = (Object)adaptor.becomeRoot(RAISE150_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:11: ( type | STRING_LITERAL )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLLECTION_TYPE_LITERAL||LA39_0==IDENTIFIER||LA39_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt39=1;
            }
            else if ( (LA39_0==STRING_LITERAL) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1572);
                    type151=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type151.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:330:19: STRING_LITERAL
                    {
                    STRING_LITERAL152=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL152_tree = (Object)adaptor.create(STRING_LITERAL152);
                    adaptor.addChild(root_0, STRING_LITERAL152_tree);
                    }

                    }
                    break;

            }

            SEMICOLON153=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1579); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 47, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:1: whileExp : WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE154=null;
        Token LPAREN155=null;
        Token RPAREN156=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object WHILE154_tree=null;
        Object LPAREN155_tree=null;
        Object RPAREN156_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:334:2: ( WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:334:4: WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            WHILE154=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE154);

            LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN155);

            pushFollow(FOLLOW_logicalExp_in_whileExp1599);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN156=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN156);

            pushFollow(FOLLOW_imperativeExp_in_whileExp1610);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


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
            // 335:24: -> ^( WHILE $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:335:27: ^( WHILE $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 48, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:338:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF157=null;
        Token ENDIF161=null;
        IoclParser.altExp_return altExp158 = null;

        IoclParser.elifExp_return elifExp159 = null;

        IoclParser.elseExp_return elseExp160 = null;


        Object IF157_tree=null;
        Object ENDIF161_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF157=(Token)match(input,IF,FOLLOW_IF_in_ifExp1633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF157);

            pushFollow(FOLLOW_altExp_in_ifExp1635);
            altExp158=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp158.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:14: ( elifExp )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ELIF) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred69_Iocl()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1638);
            	    elifExp159=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp159.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:25: ( elseExp )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ELSE) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred70_Iocl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1643);
                    elseExp160=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp160.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:36: ( ENDIF )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ENDIF) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred71_Iocl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF161=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF161);


                    }
                    break;

            }



            // AST REWRITE
            // elements: altExp, elseExp, elifExp, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 339:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:67: ( elseExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 49, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:342:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF162=null;
        IoclParser.altExp_return altExp163 = null;


        Object ELIF162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:343:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF162=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1673); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1676);
            altExp163=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp163.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:346:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE164=null;
        IoclParser.oclExpression_return oclExpression165 = null;


        Object ELSE164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:347:2: ( ELSE oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:347:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE164=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1688); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1691);
            oclExpression165=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression165.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:1: altExp : LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN166=null;
        Token RPAREN167=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object LPAREN166_tree=null;
        Object RPAREN167_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:351:2: ( LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:351:4: LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            LPAREN166=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN166);

            pushFollow(FOLLOW_logicalExp_in_altExp1710);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN167=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1712); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN167);

            pushFollow(FOLLOW_imperativeExp_in_altExp1719);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


            // AST REWRITE
            // elements: body, condition
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
            // 351:63: -> ^( ALT_EXP $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:351:66: ^( ALT_EXP $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 52, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:354:1: tryExp : TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY168=null;
        Token LCURLY169=null;
        Token RCURLY171=null;
        IoclParser.imperativeExp_return imperativeExp170 = null;

        IoclParser.except_return except172 = null;


        Object TRY168_tree=null;
        Object LCURLY169_tree=null;
        Object RCURLY171_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:2: ( TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:4: TRY LCURLY ( imperativeExp )* RCURLY except
            {
            TRY168=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY168);

            LCURLY169=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY169);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:15: ( imperativeExp )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BREAK||(LA43_0>=COMPUTE && LA43_0<=DO)||LA43_0==IF||(LA43_0>=LCURLY && LA43_0<=LPAREN)||LA43_0==NEW||LA43_0==RAISE||LA43_0==RETURN||LA43_0==SELF||(LA43_0>=TRY && LA43_0<=VAR)||LA43_0==WHILE||(LA43_0>=COLLECTION_TYPE_LITERAL && LA43_0<=IDENTIFIER)||LA43_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_tryExp1746);
            	    imperativeExp170=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp170.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            RCURLY171=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY171);

            pushFollow(FOLLOW_except_in_tryExp1751);
            except172=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except172.getTree());


            // AST REWRITE
            // elements: except, imperativeExp, TRY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 355:44: -> ^( TRY ( imperativeExp )* except )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:47: ^( TRY ( imperativeExp )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:355:53: ( imperativeExp )*
                while ( stream_imperativeExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_imperativeExp.nextTree());

                }
                stream_imperativeExp.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 53, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:358:1: except : EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT173=null;
        Token LPAREN174=null;
        Token RPAREN176=null;
        Token LCURLY177=null;
        Token RCURLY179=null;
        IoclParser.type_return type175 = null;

        IoclParser.imperativeExp_return imperativeExp178 = null;


        Object EXCEPT173_tree=null;
        Object LPAREN174_tree=null;
        Object RPAREN176_tree=null;
        Object LCURLY177_tree=null;
        Object RCURLY179_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:2: ( EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:4: EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY
            {
            EXCEPT173=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1773); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT173);

            LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1775); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN174);

            pushFollow(FOLLOW_type_in_except1777);
            type175=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type175.getTree());
            RPAREN176=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN176);

            LCURLY177=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY177);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:37: ( imperativeExp )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==BREAK||(LA44_0>=COMPUTE && LA44_0<=DO)||LA44_0==IF||(LA44_0>=LCURLY && LA44_0<=LPAREN)||LA44_0==NEW||LA44_0==RAISE||LA44_0==RETURN||LA44_0==SELF||(LA44_0>=TRY && LA44_0<=VAR)||LA44_0==WHILE||(LA44_0>=COLLECTION_TYPE_LITERAL && LA44_0<=IDENTIFIER)||LA44_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_except1783);
            	    imperativeExp178=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp178.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            RCURLY179=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY179);



            // AST REWRITE
            // elements: imperativeExp, type, EXCEPT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 359:59: -> ^( EXCEPT type ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:62: ^( EXCEPT type ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:359:76: ( imperativeExp )*
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

        catch (RecognitionException e) {
            throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW181=null;
        Token FOR_NAME182=null;
        Token LPAREN183=null;
        Token char_literal185=null;
        Token RPAREN186=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;

        IoclParser.oclExp_return oclExp180 = null;

        IoclParser.iteratorList_return iteratorList184 = null;


        Object ARROW181_tree=null;
        Object FOR_NAME182_tree=null;
        Object LPAREN183_tree=null;
        Object char_literal185_tree=null;
        Object RPAREN186_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:363:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:363:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression
            {
            pushFollow(FOLLOW_oclExp_in_forExp1809);
            oclExp180=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp180.getTree());
            ARROW181=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW181);

            FOR_NAME182=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME182);

            LPAREN183=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN183);

            pushFollow(FOLLOW_iteratorList_in_forExp1817);
            iteratorList184=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList184.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:363:46: ( '|' condition= oclExpression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==75) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:363:47: '|' condition= oclExpression
                    {
                    char_literal185=(Token)match(input,75,FOLLOW_75_in_forExp1820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(char_literal185);

                    pushFollow(FOLLOW_oclExpression_in_forExp1826);
                    condition=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());

                    }
                    break;

            }

            RPAREN186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN186);

            pushFollow(FOLLOW_oclExpression_in_forExp1836);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: oclExp, body, FOR_NAME, condition, iteratorList
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
            // 364:3: -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:364:6: ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:364:41: ( $condition)?
                if ( stream_condition.hasNext() ) {
                    adaptor.addChild(root_1, stream_condition.nextTree());

                }
                stream_condition.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 55, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:367:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal188=null;
        IoclParser.variableDeclaration_return variableDeclaration187 = null;

        IoclParser.variableDeclaration_return variableDeclaration189 = null;


        Object char_literal188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1868);
            variableDeclaration187=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration187.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:24: ( ',' variableDeclaration )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==74) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:368:25: ',' variableDeclaration
            	    {
            	    char_literal188=(Token)match(input,74,FOLLOW_74_in_iteratorList1871); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1874);
            	    variableDeclaration189=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration189.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
            if ( state.backtracking>0 ) { memoize(input, 56, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    public static class instantiationExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instantiationExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:371:1: instantiationExp : NEW pathName '(' ( arguments )? ')' ;
    public final IoclParser.instantiationExp_return instantiationExp() throws RecognitionException {
        IoclParser.instantiationExp_return retval = new IoclParser.instantiationExp_return();
        retval.start = input.LT(1);
        int instantiationExp_StartIndex = input.index();
        Object root_0 = null;

        Token NEW190=null;
        Token char_literal192=null;
        Token char_literal194=null;
        IoclParser.pathName_return pathName191 = null;

        IoclParser.arguments_return arguments193 = null;


        Object NEW190_tree=null;
        Object char_literal192_tree=null;
        Object char_literal194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:2: ( NEW pathName '(' ( arguments )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:4: NEW pathName '(' ( arguments )? ')'
            {
            root_0 = (Object)adaptor.nil();

            NEW190=(Token)match(input,NEW,FOLLOW_NEW_in_instantiationExp1887); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEW190_tree = (Object)adaptor.create(NEW190);
            root_0 = (Object)adaptor.becomeRoot(NEW190_tree, root_0);
            }
            pushFollow(FOLLOW_pathName_in_instantiationExp1890);
            pathName191=pathName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName191.getTree());
            char_literal192=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_instantiationExp1892); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:372:23: ( arguments )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==BREAK||(LA47_0>=COMPUTE && LA47_0<=DO)||LA47_0==IF||(LA47_0>=LCURLY && LA47_0<=LPAREN)||(LA47_0>=MINUS && LA47_0<=NOT)||LA47_0==RAISE||LA47_0==RETURN||LA47_0==SELF||(LA47_0>=TRY && LA47_0<=VAR)||LA47_0==WHILE||(LA47_0>=COLLECTION_TYPE_LITERAL && LA47_0<=IDENTIFIER)||LA47_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_instantiationExp1895);
                    arguments193=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments193.getTree());

                    }
                    break;

            }

            char_literal194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_instantiationExp1898); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 57, instantiationExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instantiationExp"

    public static class imperativeOperationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeOperationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:375:1: imperativeOperationCallExp : dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) ;
    public final IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp() throws RecognitionException {
        IoclParser.imperativeOperationCallExp_return retval = new IoclParser.imperativeOperationCallExp_return();
        retval.start = input.LT(1);
        int imperativeOperationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON196=null;
        IoclParser.dotArrowExp_return dotArrowExp195 = null;


        Object SEMICOLON196_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_dotArrowExp=new RewriteRuleSubtreeStream(adaptor,"rule dotArrowExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:2: ( dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:4: dotArrowExp SEMICOLON
            {
            pushFollow(FOLLOW_dotArrowExp_in_imperativeOperationCallExp1910);
            dotArrowExp195=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotArrowExp.add(dotArrowExp195.getTree());
            SEMICOLON196=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_imperativeOperationCallExp1912); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON196);



            // AST REWRITE
            // elements: dotArrowExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 376:26: -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:376:29: ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPERATIVE_OPERATION_CALL, "IMPERATIVE_OPERATION_CALL"), root_1);

                adaptor.addChild(root_1, stream_dotArrowExp.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, imperativeOperationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeOperationCallExp"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:4: ( imperativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl399);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred18_Iocl
    public final void synpred18_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:4: ( oclExp ( propertyCallExp )+ )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:4: oclExp ( propertyCallExp )+
        {
        pushFollow(FOLLOW_oclExp_in_synpred18_Iocl578);
        oclExp();

        state._fsp--;
        if (state.failed) return ;
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:142:26: ( propertyCallExp )+
        int cnt48=0;
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ARROW||LA48_0==DOT) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
        	    {
        	    pushFollow(FOLLOW_propertyCallExp_in_synpred18_Iocl580);
        	    propertyCallExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt48 >= 1 ) break loop48;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(48, input);
                    throw eee;
            }
            cnt48++;
        } while (true);


        }
    }
    // $ANTLR end synpred18_Iocl

    // $ANTLR start synpred21_Iocl
    public final void synpred21_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:4: ( operationCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:4: operationCallExp
        {
        pushFollow(FOLLOW_operationCallExp_in_synpred21_Iocl626);
        operationCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Iocl

    // $ANTLR start synpred26_Iocl
    public final void synpred26_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: ( variableExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:166:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred26_Iocl716);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Iocl

    // $ANTLR start synpred27_Iocl
    public final void synpred27_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:167:4: ( type )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:167:4: type
        {
        pushFollow(FOLLOW_type_in_synpred27_Iocl721);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Iocl

    // $ANTLR start synpred31_Iocl
    public final void synpred31_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:27: ( ',' collectionLiteralParts )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:190:27: ',' collectionLiteralParts
        {
        match(input,74,FOLLOW_74_in_synpred31_Iocl833); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred31_Iocl836);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Iocl

    // $ANTLR start synpred37_Iocl
    public final void synpred37_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:27: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:27: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred37_Iocl1002);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,74,FOLLOW_74_in_synpred37_Iocl1004); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Iocl

    // $ANTLR start synpred38_Iocl
    public final void synpred38_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:26: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:26: (v1= variableDeclaration ',' )?
        int alt50=2;
        int LA50_0 = input.LA(1);

        if ( (LA50_0==IDENTIFIER) ) {
            int LA50_1 = input.LA(2);

            if ( (synpred37_Iocl()) ) {
                alt50=1;
            }
        }
        switch (alt50) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:234:27: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred38_Iocl1002);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,74,FOLLOW_74_in_synpred38_Iocl1004); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred38_Iocl1012);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,75,FOLLOW_75_in_synpred38_Iocl1014); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Iocl

    // $ANTLR start synpred39_Iocl
    public final void synpred39_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:20: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:20: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred39_Iocl1061);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred39_Iocl1063); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Iocl

    // $ANTLR start synpred53_Iocl
    public final void synpred53_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:283:4: ( assignExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:283:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred53_Iocl1303);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Iocl

    // $ANTLR start synpred58_Iocl
    public final void synpred58_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:4: ( forExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:4: forExp
        {
        pushFollow(FOLLOW_forExp_in_synpred58_Iocl1328);
        forExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Iocl

    // $ANTLR start synpred69_Iocl
    public final void synpred69_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:15: ( elifExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred69_Iocl1638);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Iocl

    // $ANTLR start synpred70_Iocl
    public final void synpred70_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:26: ( elseExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred70_Iocl1643);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Iocl

    // $ANTLR start synpred71_Iocl
    public final void synpred71_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:36: ( ENDIF )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:339:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred71_Iocl1647); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_Iocl

    // Delegated rules

    public final boolean synpred58_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred38_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred26_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred53_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Iocl_fragment(); // can never throw exception
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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\12\7\uffff\11\0\6\uffff";
    static final String DFA1_maxS =
        "\1\102\7\uffff\11\0\6\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\24\uffff\1\2";
    static final String DFA1_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\3\1\13\uffff\1\1\4\uffff\1\1\1\20\2\uffff\1\26"+
            "\1\1\1\26\6\uffff\1\1\1\uffff\1\1\2\uffff\1\16\1\uffff\2\1\1"+
            "\uffff\1\1\2\uffff\1\11\1\14\1\15\1\12\1\13\1\10\1\uffff\1\17",
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
            return "111:1: oclExpression : ( imperativeExp | logicalExp );";
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
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\42\11\0\2\uffff";
    static final String DFA9_maxS =
        "\1\102\11\0\2\uffff";
    static final String DFA9_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\11\20\uffff\1\7\7\uffff\1\2\1\5\1\6\1\3\1\4\1\1\1\uffff\1"+
            "\10",
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
            return "141:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_Iocl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
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
    static final String DFA24_eotS =
        "\30\uffff";
    static final String DFA24_eofS =
        "\30\uffff";
    static final String DFA24_minS =
        "\1\12\1\0\26\uffff";
    static final String DFA24_maxS =
        "\1\102\1\0\26\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\3\uffff\3\2\13\uffff\1\2\4\uffff\2\2\2\uffff\3\2\6\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\5\2\1\1\1\uffff\1\2",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "234:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\31\uffff";
    static final String DFA31_eofS =
        "\31\uffff";
    static final String DFA31_minS =
        "\1\12\7\uffff\11\0\10\uffff";
    static final String DFA31_maxS =
        "\1\102\7\uffff\11\0\10\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\11\uffff\1\10\1\11\1\12"+
        "\1\13\1\15\1\7\1\14\1\16";
    static final String DFA31_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\10\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\3\3\uffff\1\4\1\5\1\1\13\uffff\1\23\4\uffff\1\1\1\20\3\uffff"+
            "\1\25\7\uffff\1\21\1\uffff\1\6\2\uffff\1\16\1\uffff\1\24\1\7"+
            "\1\uffff\1\22\2\uffff\1\11\1\14\1\15\1\12\1\13\1\10\1\uffff"+
            "\1\17",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "276:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | instantiationExp | imperativeOperationCallExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_Iocl()) ) {s = 22;}

                        else if ( (synpred58_Iocl()) ) {s = 23;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp415 = new BitSet(new long[]{0x0200080000000022L});
    public static final BitSet FOLLOW_set_in_logicalExp418 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp431 = new BitSet(new long[]{0x0200080000000022L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp444 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_set_in_equalityExp447 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp456 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp469 = new BitSet(new long[]{0x000000180C000002L});
    public static final BitSet FOLLOW_set_in_relationalExp472 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp489 = new BitSet(new long[]{0x000000180C000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp502 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_set_in_additiveExp505 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp514 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp527 = new BitSet(new long[]{0x0000020000020002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp530 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp540 = new BitSet(new long[]{0x0000020000020002L});
    public static final BitSet FOLLOW_set_in_unaryExp553 = new BitSet(new long[]{0xF80800A400000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp578 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp580 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyCallExp598 = new BitSet(new long[]{0x0408000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_propertyCallExp612 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeCallExp_in_modelPropertyCallExp631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp642 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp644 = new BitSet(new long[]{0xF96B40E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp646 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp663 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp665 = new BitSet(new long[]{0xF96B40E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp667 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp726 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_oclExp728 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerationLiteralExp_in_literalExp767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp790 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp792 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp794 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_collectionLiteralParts833 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp946 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_enumerationLiteralExp949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp951 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp992 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp994 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iteratorExp1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_iteratorExp1014 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp1018 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp1052 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1061 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_iterateExp1074 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1076 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1107 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1110 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1112 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1117 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arguments1149 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1193 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1195 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_type_in_collectionType1197 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1242 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1247 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiationExp_in_imperativeExp1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeOperationCallExp_in_imperativeExp1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1349 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1352 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_imperativeExp_in_blockExp1354 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1377 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1391 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1395 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1397 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1420 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1434 = new BitSet(new long[]{0xF97940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_logicalExp_in_returnExp1436 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1462 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_imperativeVarDeclarations1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1497 = new BitSet(new long[]{0x0000000100802002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1500 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1502 = new BitSet(new long[]{0x0000000100800002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1508 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1512 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_logicalExp_in_imperativeVarDeclaration1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_assignExp1543 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_set_in_assignExp1545 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_logicalExp_in_assignExp1554 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1568 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_type_in_raiseExp1572 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1576 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1593 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_logicalExp_in_whileExp1599 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1601 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_imperativeExp_in_whileExp1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1633 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1635 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1638 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1643 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1673 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1688 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1704 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_logicalExp_in_altExp1710 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1712 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_imperativeExp_in_altExp1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1742 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1744 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_imperativeExp_in_tryExp1746 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1749 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_except_in_tryExp1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1773 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1775 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_type_in_except1777 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1779 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1781 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_imperativeExp_in_except1783 = new BitSet(new long[]{0xF969C0E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_RCURLY_in_except1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1809 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1813 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1817 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_forExp1820 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1826 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1830 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iteratorList1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_NEW_in_instantiationExp1887 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_pathName_in_instantiationExp1890 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LPAREN_in_instantiationExp1892 = new BitSet(new long[]{0xF96B40E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_arguments_in_instantiationExp1895 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_instantiationExp1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_imperativeOperationCallExp1910 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_imperativeOperationCallExp1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_synpred18_Iocl578 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred18_Iocl580 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_operationCallExp_in_synpred21_Iocl626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred26_Iocl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred27_Iocl721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred31_Iocl833 = new BitSet(new long[]{0xF96940E61001C400L,0x0000000000000005L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred31_Iocl836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred37_Iocl1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred37_Iocl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred38_Iocl1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred38_Iocl1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred38_Iocl1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred38_Iocl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred39_Iocl1061 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred39_Iocl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred53_Iocl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_synpred58_Iocl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred69_Iocl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred70_Iocl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred71_Iocl1647 = new BitSet(new long[]{0x0000000000000002L});

}