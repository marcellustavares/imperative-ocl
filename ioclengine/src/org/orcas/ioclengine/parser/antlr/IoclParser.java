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


import org.antlr.runtime.*;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class IoclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_EXP", "AND", "APPEND", "ARROW", "ATTRIBUTE_CALL", "BLOCK", "BREAK", "COLLECTION_LITERAL", "COLLECTION_TYPE", "COLON", "COMPUTE", "CONTINUE", "DO", "DIV", "DOT", "ENDIF", "ENUM_LITERAL", "ELIF", "ELSE", "EQUAL", "EXCEPT", "FOR", "GT", "GTE", "IF", "IMPERATIVE_OPERATION_CALL", "ITERATE", "ITERATOR", "IS", "LOG", "LCURLY", "LPAREN", "LT", "LTE", "MINUS", "NEW", "NOT", "NOT_EQUAL", "MULT", "OPERATION_CALL", "OR", "PATH_NAME", "PLUS", "RAISE", "RCURLY", "RETURN", "RPAREN", "SCOPE", "SELF", "SEMICOLON", "TRY", "VAR", "VARIABLE", "WHILE", "XOR", "NUMERIC_OPERATION", "COLLECTION_TYPE_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", "IDENTIFIER", "ITERATOR_NAME", "PRIMITIVE_TYPE_LITERAL", "FOR_NAME", "EXPONENT", "ESC_SEQ", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "','", "'|'"
    };
    public static final int ITERATOR_NAME=67;
    public static final int APPEND=6;
    public static final int EXPONENT=70;
    public static final int LT=36;
    public static final int WHILE=57;
    public static final int PRIMITIVE_TYPE_LITERAL=68;
    public static final int COMPUTE=14;
    public static final int IMPERATIVE_OPERATION_CALL=29;
    public static final int LOG=33;
    public static final int GTE=27;
    public static final int OCTAL_ESC=75;
    public static final int NEW=39;
    public static final int DO=16;
    public static final int FOR=25;
    public static final int NOT=40;
    public static final int AND=5;
    public static final int EXCEPT=24;
    public static final int EOF=-1;
    public static final int LTE=37;
    public static final int BREAK=10;
    public static final int LPAREN=35;
    public static final int IF=28;
    public static final int RPAREN=50;
    public static final int ESC_SEQ=71;
    public static final int STRING_LITERAL=62;
    public static final int REAL_LITERAL=65;
    public static final int SCOPE=51;
    public static final int COLLECTION_TYPE_LITERAL=60;
    public static final int CONTINUE=15;
    public static final int NOT_EQUAL=41;
    public static final int IS=32;
    public static final int IDENTIFIER=66;
    public static final int ITERATOR=31;
    public static final int EQUAL=23;
    public static final int RETURN=49;
    public static final int ENDIF=19;
    public static final int ENUM_LITERAL=20;
    public static final int PLUS=46;
    public static final int VAR=55;
    public static final int RAISE=47;
    public static final int DOT=18;
    public static final int PATH_NAME=45;
    public static final int COLLECTION_LITERAL=11;
    public static final int FOR_NAME=69;
    public static final int XOR=58;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int UNICODE_ESC=74;
    public static final int NUMERIC_OPERATION=59;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=73;
    public static final int LCURLY=34;
    public static final int NULL_LITERAL=61;
    public static final int SEMICOLON=53;
    public static final int MULT=42;
    public static final int MINUS=38;
    public static final int TRY=54;
    public static final int BOOLEAN_LITERAL=63;
    public static final int COLON=13;
    public static final int ALT_EXP=4;
    public static final int ELIF=21;
    public static final int ITERATE=30;
    public static final int WS=72;
    public static final int VARIABLE=56;
    public static final int INTEGER_LITERAL=64;
    public static final int BLOCK=9;
    public static final int RCURLY=48;
    public static final int OR=44;
    public static final int ARROW=7;
    public static final int GT=26;
    public static final int OPERATION_CALL=43;
    public static final int DIV=17;
    public static final int T__76=76;
    public static final int SELF=52;
    public static final int T__77=77;

    // delegates
    // delegators


        public IoclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IoclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[140+1];
             
             
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:112:1: oclExpression : ( imperativeExp | logicalExp );
    public final IoclParser.oclExpression_return oclExpression() throws RecognitionException {
        IoclParser.oclExpression_return retval = new IoclParser.oclExpression_return();
        retval.start = input.LT(1);
        int oclExpression_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.imperativeExp_return imperativeExp1 = null;

        IoclParser.logicalExp_return logicalExp2 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:2: ( imperativeExp | logicalExp )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:4: imperativeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeExp_in_oclExpression406);
                    imperativeExp1=imperativeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeExp1.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:114:4: logicalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logicalExp_in_oclExpression411);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:117:1: logicalExp : equalityExp ( ( AND | OR | XOR ) equalityExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:118:2: ( equalityExp ( ( AND | OR | XOR ) equalityExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:118:4: equalityExp ( ( AND | OR | XOR ) equalityExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExp_in_logicalExp422);
            equalityExp3=equalityExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExp3.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:118:16: ( ( AND | OR | XOR ) equalityExp )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||LA2_0==XOR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:118:17: ( AND | OR | XOR ) equalityExp
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

            	    pushFollow(FOLLOW_equalityExp_in_logicalExp438);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:121:1: equalityExp : relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:122:2: ( relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:122:4: relationalExp ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExp_in_equalityExp451);
            relationalExp6=relationalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExp6.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:122:18: ( ( EQUAL | NOT_EQUAL ) relationalExp )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:122:19: ( EQUAL | NOT_EQUAL ) relationalExp
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

            	    pushFollow(FOLLOW_relationalExp_in_equalityExp463);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:125:1: relationalExp : additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:126:2: ( additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:126:4: additiveExp ( ( LT | LTE | GT | GTE ) additiveExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExp_in_relationalExp476);
            additiveExp9=additiveExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExp9.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:126:16: ( ( LT | LTE | GT | GTE ) additiveExp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=GT && LA4_0<=GTE)||(LA4_0>=LT && LA4_0<=LTE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:126:17: ( LT | LTE | GT | GTE ) additiveExp
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

            	    pushFollow(FOLLOW_additiveExp_in_relationalExp496);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:129:1: additiveExp : multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:130:2: ( multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:130:4: multiplicativeExp ( ( PLUS | MINUS ) multiplicativeExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExp_in_additiveExp509);
            multiplicativeExp12=multiplicativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExp12.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:130:22: ( ( PLUS | MINUS ) multiplicativeExp )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:130:23: ( PLUS | MINUS ) multiplicativeExp
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

            	    pushFollow(FOLLOW_multiplicativeExp_in_additiveExp521);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:133:1: multiplicativeExp : unaryExp ( ( MULT | DIV ) unaryExp )* ;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:134:2: ( unaryExp ( ( MULT | DIV ) unaryExp )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:134:4: unaryExp ( ( MULT | DIV ) unaryExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExp_in_multiplicativeExp534);
            unaryExp15=unaryExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp15.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:134:13: ( ( MULT | DIV ) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||LA6_0==MULT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:134:14: ( MULT | DIV ) unaryExp
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

            	    pushFollow(FOLLOW_unaryExp_in_multiplicativeExp547);
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
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:137:1: unaryExp : ( ( MINUS | NOT ) unaryExp | instantiationExp | dotArrowExp );
    public final IoclParser.unaryExp_return unaryExp() throws RecognitionException {
        IoclParser.unaryExp_return retval = new IoclParser.unaryExp_return();
        retval.start = input.LT(1);
        int unaryExp_StartIndex = input.index();
        Object root_0 = null;

        Token set18=null;
        IoclParser.unaryExp_return unaryExp19 = null;

        IoclParser.instantiationExp_return instantiationExp20 = null;

        IoclParser.dotArrowExp_return dotArrowExp21 = null;


        Object set18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:138:2: ( ( MINUS | NOT ) unaryExp | instantiationExp | dotArrowExp )
            int alt7=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case NOT:
                {
                alt7=1;
                }
                break;
            case NEW:
                {
                alt7=2;
                }
                break;
            case LPAREN:
            case SELF:
            case COLLECTION_TYPE_LITERAL:
            case NULL_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
            case IDENTIFIER:
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:138:4: ( MINUS | NOT ) unaryExp
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

                    pushFollow(FOLLOW_unaryExp_in_unaryExp569);
                    unaryExp19=unaryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExp19.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:139:4: instantiationExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instantiationExp_in_unaryExp574);
                    instantiationExp20=instantiationExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instantiationExp20.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:140:4: dotArrowExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotArrowExp_in_unaryExp579);
                    dotArrowExp21=dotArrowExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotArrowExp21.getTree());

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

    public static class instantiationExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instantiationExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:143:1: instantiationExp : NEW pathName '(' ( arguments )? ')' ;
    public final IoclParser.instantiationExp_return instantiationExp() throws RecognitionException {
        IoclParser.instantiationExp_return retval = new IoclParser.instantiationExp_return();
        retval.start = input.LT(1);
        int instantiationExp_StartIndex = input.index();
        Object root_0 = null;

        Token NEW22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        IoclParser.pathName_return pathName23 = null;

        IoclParser.arguments_return arguments25 = null;


        Object NEW22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:144:2: ( NEW pathName '(' ( arguments )? ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:144:4: NEW pathName '(' ( arguments )? ')'
            {
            root_0 = (Object)adaptor.nil();

            NEW22=(Token)match(input,NEW,FOLLOW_NEW_in_instantiationExp590); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEW22_tree = (Object)adaptor.create(NEW22);
            root_0 = (Object)adaptor.becomeRoot(NEW22_tree, root_0);
            }
            pushFollow(FOLLOW_pathName_in_instantiationExp593);
            pathName23=pathName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName23.getTree());
            char_literal24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_instantiationExp595); if (state.failed) return retval;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:144:23: ( arguments )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BREAK||(LA8_0>=COMPUTE && LA8_0<=DO)||LA8_0==IF||(LA8_0>=LOG && LA8_0<=LPAREN)||(LA8_0>=MINUS && LA8_0<=NOT)||LA8_0==RAISE||LA8_0==RETURN||LA8_0==SELF||(LA8_0>=TRY && LA8_0<=VAR)||LA8_0==WHILE||(LA8_0>=COLLECTION_TYPE_LITERAL && LA8_0<=IDENTIFIER)||LA8_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_instantiationExp598);
                    arguments25=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments25.getTree());

                    }
                    break;

            }

            char_literal26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_instantiationExp601); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 8, instantiationExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instantiationExp"

    public static class dotArrowExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotArrowExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:147:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );
    public final IoclParser.dotArrowExp_return dotArrowExp() throws RecognitionException {
        IoclParser.dotArrowExp_return retval = new IoclParser.dotArrowExp_return();
        retval.start = input.LT(1);
        int dotArrowExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExp_return oclExp27 = null;

        IoclParser.propertyCallExp_return propertyCallExp28 = null;

        IoclParser.oclExp_return oclExp29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:2: ( oclExp ( propertyCallExp )+ | oclExp )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:4: oclExp ( propertyCallExp )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp613);
                    oclExp27=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp27.getTree());
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:26: ( propertyCallExp )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ARROW||LA9_0==DOT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
                    	    {
                    	    pushFollow(FOLLOW_propertyCallExp_in_dotArrowExp615);
                    	    propertyCallExp28=propertyCallExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(propertyCallExp28.getTree(), root_0);

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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:149:4: oclExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_oclExp_in_dotArrowExp622);
                    oclExp29=oclExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExp29.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, dotArrowExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotArrowExp"

    public static class propertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:152:1: propertyCallExp : ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp );
    public final IoclParser.propertyCallExp_return propertyCallExp() throws RecognitionException {
        IoclParser.propertyCallExp_return retval = new IoclParser.propertyCallExp_return();
        retval.start = input.LT(1);
        int propertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token set30=null;
        Token ARROW32=null;
        IoclParser.modelPropertyCallExp_return modelPropertyCallExp31 = null;

        IoclParser.loopExp_return loopExp33 = null;


        Object set30_tree=null;
        Object ARROW32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:153:2: ( ( DOT | ARROW ) modelPropertyCallExp | ARROW loopExp )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARROW) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==SELF||LA11_1==NUMERIC_OPERATION||LA11_1==IDENTIFIER) ) {
                    alt11=1;
                }
                else if ( (LA11_1==ITERATE||LA11_1==ITERATOR_NAME) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==DOT) ) {
                alt11=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:153:4: ( DOT | ARROW ) modelPropertyCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    set30=(Token)input.LT(1);
                    if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_modelPropertyCallExp_in_propertyCallExp642);
                    modelPropertyCallExp31=modelPropertyCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modelPropertyCallExp31.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:154:4: ARROW loopExp
                    {
                    root_0 = (Object)adaptor.nil();

                    ARROW32=(Token)match(input,ARROW,FOLLOW_ARROW_in_propertyCallExp647); if (state.failed) return retval;
                    pushFollow(FOLLOW_loopExp_in_propertyCallExp650);
                    loopExp33=loopExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopExp33.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, propertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propertyCallExp"

    public static class modelPropertyCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modelPropertyCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:157:1: modelPropertyCallExp : ( operationCallExp | attributeCallExp );
    public final IoclParser.modelPropertyCallExp_return modelPropertyCallExp() throws RecognitionException {
        IoclParser.modelPropertyCallExp_return retval = new IoclParser.modelPropertyCallExp_return();
        retval.start = input.LT(1);
        int modelPropertyCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.operationCallExp_return operationCallExp34 = null;

        IoclParser.attributeCallExp_return attributeCallExp35 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:2: ( operationCallExp | attributeCallExp )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NUMERIC_OPERATION) ) {
                alt12=1;
            }
            else if ( (LA12_0==SELF||LA12_0==IDENTIFIER) ) {
                int LA12_2 = input.LA(2);

                if ( (synpred23_Iocl()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:4: operationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operationCallExp_in_modelPropertyCallExp661);
                    operationCallExp34=operationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operationCallExp34.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:159:4: attributeCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeCallExp_in_modelPropertyCallExp666);
                    attributeCallExp35=attributeCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeCallExp35.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, modelPropertyCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modelPropertyCallExp"

    public static class operationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:162:1: operationCallExp : ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) );
    public final IoclParser.operationCallExp_return operationCallExp() throws RecognitionException {
        IoclParser.operationCallExp_return retval = new IoclParser.operationCallExp_return();
        retval.start = input.LT(1);
        int operationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token NUMERIC_OPERATION36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        IoclParser.arguments_return arguments38 = null;

        IoclParser.simpleName_return simpleName40 = null;

        IoclParser.arguments_return arguments42 = null;


        Object NUMERIC_OPERATION36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NUMERIC_OPERATION=new RewriteRuleTokenStream(adaptor,"token NUMERIC_OPERATION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:2: ( NUMERIC_OPERATION '(' ( arguments )? ')' -> ^( NUMERIC_OPERATION ( arguments )? ) | simpleName '(' ( arguments )? ')' -> ^( OPERATION_CALL simpleName ( arguments )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NUMERIC_OPERATION) ) {
                alt15=1;
            }
            else if ( (LA15_0==SELF||LA15_0==IDENTIFIER) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:4: NUMERIC_OPERATION '(' ( arguments )? ')'
                    {
                    NUMERIC_OPERATION36=(Token)match(input,NUMERIC_OPERATION,FOLLOW_NUMERIC_OPERATION_in_operationCallExp677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMERIC_OPERATION.add(NUMERIC_OPERATION36);

                    char_literal37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal37);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:26: ( arguments )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==BREAK||(LA13_0>=COMPUTE && LA13_0<=DO)||LA13_0==IF||(LA13_0>=LOG && LA13_0<=LPAREN)||(LA13_0>=MINUS && LA13_0<=NOT)||LA13_0==RAISE||LA13_0==RETURN||LA13_0==SELF||(LA13_0>=TRY && LA13_0<=VAR)||LA13_0==WHILE||(LA13_0>=COLLECTION_TYPE_LITERAL && LA13_0<=IDENTIFIER)||LA13_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp681);
                            arguments38=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments38.getTree());

                            }
                            break;

                    }

                    char_literal39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal39);



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
                    // 163:41: -> ^( NUMERIC_OPERATION ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:44: ^( NUMERIC_OPERATION ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NUMERIC_OPERATION.nextNode(), root_1);

                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:163:64: ( arguments )?
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:4: simpleName '(' ( arguments )? ')'
                    {
                    pushFollow(FOLLOW_simpleName_in_operationCallExp698);
                    simpleName40=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleName.add(simpleName40.getTree());
                    char_literal41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operationCallExp700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal41);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:19: ( arguments )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==BREAK||(LA14_0>=COMPUTE && LA14_0<=DO)||LA14_0==IF||(LA14_0>=LOG && LA14_0<=LPAREN)||(LA14_0>=MINUS && LA14_0<=NOT)||LA14_0==RAISE||LA14_0==RETURN||LA14_0==SELF||(LA14_0>=TRY && LA14_0<=VAR)||LA14_0==WHILE||(LA14_0>=COLLECTION_TYPE_LITERAL && LA14_0<=IDENTIFIER)||LA14_0==PRIMITIVE_TYPE_LITERAL) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_operationCallExp702);
                            arguments42=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_arguments.add(arguments42.getTree());

                            }
                            break;

                    }

                    char_literal43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operationCallExp705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal43);



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
                    // 164:34: -> ^( OPERATION_CALL simpleName ( arguments )? )
                    {
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:37: ^( OPERATION_CALL simpleName ( arguments )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATION_CALL, "OPERATION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_simpleName.nextTree());
                        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:164:65: ( arguments )?
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
            if ( state.backtracking>0 ) { memoize(input, 12, operationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "operationCallExp"

    public static class attributeCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:167:1: attributeCallExp : simpleName -> ^( ATTRIBUTE_CALL simpleName ) ;
    public final IoclParser.attributeCallExp_return attributeCallExp() throws RecognitionException {
        IoclParser.attributeCallExp_return retval = new IoclParser.attributeCallExp_return();
        retval.start = input.LT(1);
        int attributeCallExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName44 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:168:2: ( simpleName -> ^( ATTRIBUTE_CALL simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:168:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_attributeCallExp727);
            simpleName44=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName44.getTree());


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
            // 168:15: -> ^( ATTRIBUTE_CALL simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:168:18: ^( ATTRIBUTE_CALL simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 13, attributeCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "attributeCallExp"

    public static class oclExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oclExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:170:1: oclExp : ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression );
    public final IoclParser.oclExp_return oclExp() throws RecognitionException {
        IoclParser.oclExp_return retval = new IoclParser.oclExp_return();
        retval.start = input.LT(1);
        int oclExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        IoclParser.literalExp_return literalExp45 = null;

        IoclParser.variableExp_return variableExp46 = null;

        IoclParser.type_return type47 = null;

        IoclParser.oclExpression_return oclExpression49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:2: ( literalExp | variableExp | type | '(' oclExpression ')' -> oclExpression )
            int alt16=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==SCOPE) ) {
                    alt16=1;
                }
                else if ( (synpred28_Iocl()) ) {
                    alt16=2;
                }
                else if ( (synpred29_Iocl()) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==LPAREN) ) {
                    alt16=3;
                }
                else if ( (LA16_2==LCURLY) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case NULL_LITERAL:
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt16=1;
                }
                break;
            case SELF:
                {
                alt16=2;
                }
                break;
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt16=3;
                }
                break;
            case LPAREN:
                {
                alt16=4;
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:171:4: literalExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literalExp_in_oclExp745);
                    literalExp45=literalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literalExp45.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: variableExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExp_in_oclExp751);
                    variableExp46=variableExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp46.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_oclExp756);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type47.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:174:4: '(' oclExpression ')'
                    {
                    char_literal48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oclExp761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(char_literal48);

                    pushFollow(FOLLOW_oclExpression_in_oclExp763);
                    oclExpression49=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression49.getTree());
                    char_literal50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oclExp765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(char_literal50);



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
                    // 174:26: -> oclExpression
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
            if ( state.backtracking>0 ) { memoize(input, 14, oclExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oclExp"

    public static class variableExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:177:1: variableExp : simpleName -> ^( VARIABLE simpleName ) ;
    public final IoclParser.variableExp_return variableExp() throws RecognitionException {
        IoclParser.variableExp_return retval = new IoclParser.variableExp_return();
        retval.start = input.LT(1);
        int variableExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.simpleName_return simpleName51 = null;


        RewriteRuleSubtreeStream stream_simpleName=new RewriteRuleSubtreeStream(adaptor,"rule simpleName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:178:2: ( simpleName -> ^( VARIABLE simpleName ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:178:4: simpleName
            {
            pushFollow(FOLLOW_simpleName_in_variableExp783);
            simpleName51=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleName.add(simpleName51.getTree());


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
            // 178:15: -> ^( VARIABLE simpleName )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:178:18: ^( VARIABLE simpleName )
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
            if ( state.backtracking>0 ) { memoize(input, 15, variableExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExp"

    public static class literalExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:181:1: literalExp : ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp | nullLiteralExp );
    public final IoclParser.literalExp_return literalExp() throws RecognitionException {
        IoclParser.literalExp_return retval = new IoclParser.literalExp_return();
        retval.start = input.LT(1);
        int literalExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.enumerationLiteralExp_return enumerationLiteralExp52 = null;

        IoclParser.collectionLiteralExp_return collectionLiteralExp53 = null;

        IoclParser.primitiveLiteralExp_return primitiveLiteralExp54 = null;

        IoclParser.nullLiteralExp_return nullLiteralExp55 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:2: ( enumerationLiteralExp | collectionLiteralExp | primitiveLiteralExp | nullLiteralExp )
            int alt17=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt17=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt17=2;
                }
                break;
            case STRING_LITERAL:
            case BOOLEAN_LITERAL:
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt17=3;
                }
                break;
            case NULL_LITERAL:
                {
                alt17=4;
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:182:4: enumerationLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumerationLiteralExp_in_literalExp802);
                    enumerationLiteralExp52=enumerationLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationLiteralExp52.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:183:4: collectionLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionLiteralExp_in_literalExp807);
                    collectionLiteralExp53=collectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralExp53.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:184:4: primitiveLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLiteralExp_in_literalExp813);
                    primitiveLiteralExp54=primitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLiteralExp54.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:185:4: nullLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nullLiteralExp_in_literalExp818);
                    nullLiteralExp55=nullLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLiteralExp55.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, literalExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literalExp"

    public static class collectionLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:188:1: collectionLiteralExp : collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) ;
    public final IoclParser.collectionLiteralExp_return collectionLiteralExp() throws RecognitionException {
        IoclParser.collectionLiteralExp_return retval = new IoclParser.collectionLiteralExp_return();
        retval.start = input.LT(1);
        int collectionLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal57=null;
        Token char_literal59=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier56 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts58 = null;


        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_collectionLiteralParts=new RewriteRuleSubtreeStream(adaptor,"rule collectionLiteralParts");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:2: ( collectionTypeIdentifier '{' ( collectionLiteralParts )? '}' -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:4: collectionTypeIdentifier '{' ( collectionLiteralParts )? '}'
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp829);
            collectionTypeIdentifier56=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier56.getTree());
            char_literal57=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_collectionLiteralExp831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(char_literal57);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:33: ( collectionLiteralParts )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BREAK||(LA18_0>=COMPUTE && LA18_0<=DO)||LA18_0==IF||(LA18_0>=LOG && LA18_0<=LPAREN)||(LA18_0>=MINUS && LA18_0<=NOT)||LA18_0==RAISE||LA18_0==RETURN||LA18_0==SELF||(LA18_0>=TRY && LA18_0<=VAR)||LA18_0==WHILE||(LA18_0>=COLLECTION_TYPE_LITERAL && LA18_0<=IDENTIFIER)||LA18_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: collectionLiteralParts
                    {
                    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralExp833);
                    collectionLiteralParts58=collectionLiteralParts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_collectionLiteralParts.add(collectionLiteralParts58.getTree());

                    }
                    break;

            }

            char_literal59=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_collectionLiteralExp836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(char_literal59);



            // AST REWRITE
            // elements: collectionLiteralParts, collectionTypeIdentifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:61: -> ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:64: ^( COLLECTION_LITERAL collectionTypeIdentifier ( collectionLiteralParts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_LITERAL, "COLLECTION_LITERAL"), root_1);

                adaptor.addChild(root_1, stream_collectionTypeIdentifier.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:189:110: ( collectionLiteralParts )?
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
            if ( state.backtracking>0 ) { memoize(input, 17, collectionLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralExp"

    public static class collectionTypeIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionTypeIdentifier"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:192:1: collectionTypeIdentifier : COLLECTION_TYPE_LITERAL ;
    public final IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier() throws RecognitionException {
        IoclParser.collectionTypeIdentifier_return retval = new IoclParser.collectionTypeIdentifier_return();
        retval.start = input.LT(1);
        int collectionTypeIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token COLLECTION_TYPE_LITERAL60=null;

        Object COLLECTION_TYPE_LITERAL60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:2: ( COLLECTION_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:193:4: COLLECTION_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            COLLECTION_TYPE_LITERAL60=(Token)match(input,COLLECTION_TYPE_LITERAL,FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier858); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLLECTION_TYPE_LITERAL60_tree = (Object)adaptor.create(COLLECTION_TYPE_LITERAL60);
            adaptor.addChild(root_0, COLLECTION_TYPE_LITERAL60_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, collectionTypeIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionTypeIdentifier"

    public static class collectionLiteralParts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralParts"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:196:1: collectionLiteralParts : collectionLiteralPart ( ',' collectionLiteralParts )* ;
    public final IoclParser.collectionLiteralParts_return collectionLiteralParts() throws RecognitionException {
        IoclParser.collectionLiteralParts_return retval = new IoclParser.collectionLiteralParts_return();
        retval.start = input.LT(1);
        int collectionLiteralParts_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal62=null;
        IoclParser.collectionLiteralPart_return collectionLiteralPart61 = null;

        IoclParser.collectionLiteralParts_return collectionLiteralParts63 = null;


        Object char_literal62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:2: ( collectionLiteralPart ( ',' collectionLiteralParts )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:4: collectionLiteralPart ( ',' collectionLiteralParts )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_collectionLiteralPart_in_collectionLiteralParts869);
            collectionLiteralPart61=collectionLiteralPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralPart61.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:26: ( ',' collectionLiteralParts )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==76) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred34_Iocl()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:27: ',' collectionLiteralParts
            	    {
            	    char_literal62=(Token)match(input,76,FOLLOW_76_in_collectionLiteralParts872); if (state.failed) return retval;
            	    pushFollow(FOLLOW_collectionLiteralParts_in_collectionLiteralParts875);
            	    collectionLiteralParts63=collectionLiteralParts();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionLiteralParts63.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            if ( state.backtracking>0 ) { memoize(input, 19, collectionLiteralParts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralParts"

    public static class collectionLiteralPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionLiteralPart"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:200:1: collectionLiteralPart : oclExpression ;
    public final IoclParser.collectionLiteralPart_return collectionLiteralPart() throws RecognitionException {
        IoclParser.collectionLiteralPart_return retval = new IoclParser.collectionLiteralPart_return();
        retval.start = input.LT(1);
        int collectionLiteralPart_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.oclExpression_return oclExpression64 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:201:2: ( oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:201:4: oclExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_collectionLiteralPart888);
            oclExpression64=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression64.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, collectionLiteralPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionLiteralPart"

    public static class primitiveLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:204:1: primitiveLiteralExp : ( numericLiteralExp | stringLiteralExp | booleanLiteralExp );
    public final IoclParser.primitiveLiteralExp_return primitiveLiteralExp() throws RecognitionException {
        IoclParser.primitiveLiteralExp_return retval = new IoclParser.primitiveLiteralExp_return();
        retval.start = input.LT(1);
        int primitiveLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.numericLiteralExp_return numericLiteralExp65 = null;

        IoclParser.stringLiteralExp_return stringLiteralExp66 = null;

        IoclParser.booleanLiteralExp_return booleanLiteralExp67 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:205:2: ( numericLiteralExp | stringLiteralExp | booleanLiteralExp )
            int alt20=3;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
            case REAL_LITERAL:
                {
                alt20=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt20=2;
                }
                break;
            case BOOLEAN_LITERAL:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:205:4: numericLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralExp_in_primitiveLiteralExp899);
                    numericLiteralExp65=numericLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteralExp65.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:206:4: stringLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteralExp_in_primitiveLiteralExp904);
                    stringLiteralExp66=stringLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralExp66.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:207:4: booleanLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteralExp_in_primitiveLiteralExp909);
                    booleanLiteralExp67=booleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteralExp67.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, primitiveLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLiteralExp"

    public static class nullLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nullLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:210:1: nullLiteralExp : NULL_LITERAL ;
    public final IoclParser.nullLiteralExp_return nullLiteralExp() throws RecognitionException {
        IoclParser.nullLiteralExp_return retval = new IoclParser.nullLiteralExp_return();
        retval.start = input.LT(1);
        int nullLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token NULL_LITERAL68=null;

        Object NULL_LITERAL68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:211:2: ( NULL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:211:4: NULL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            NULL_LITERAL68=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_nullLiteralExp920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NULL_LITERAL68_tree = (Object)adaptor.create(NULL_LITERAL68);
            adaptor.addChild(root_0, NULL_LITERAL68_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, nullLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nullLiteralExp"

    public static class numericLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:214:1: numericLiteralExp : ( integerLiteralExp | realLiteralExp );
    public final IoclParser.numericLiteralExp_return numericLiteralExp() throws RecognitionException {
        IoclParser.numericLiteralExp_return retval = new IoclParser.numericLiteralExp_return();
        retval.start = input.LT(1);
        int numericLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.integerLiteralExp_return integerLiteralExp69 = null;

        IoclParser.realLiteralExp_return realLiteralExp70 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:215:2: ( integerLiteralExp | realLiteralExp )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INTEGER_LITERAL) ) {
                alt21=1;
            }
            else if ( (LA21_0==REAL_LITERAL) ) {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:215:4: integerLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteralExp_in_numericLiteralExp931);
                    integerLiteralExp69=integerLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteralExp69.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:216:4: realLiteralExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_realLiteralExp_in_numericLiteralExp936);
                    realLiteralExp70=realLiteralExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, realLiteralExp70.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 23, numericLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numericLiteralExp"

    public static class stringLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:219:1: stringLiteralExp : STRING_LITERAL ;
    public final IoclParser.stringLiteralExp_return stringLiteralExp() throws RecognitionException {
        IoclParser.stringLiteralExp_return retval = new IoclParser.stringLiteralExp_return();
        retval.start = input.LT(1);
        int stringLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token STRING_LITERAL71=null;

        Object STRING_LITERAL71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:2: ( STRING_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:220:4: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            STRING_LITERAL71=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteralExp951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL71_tree = (Object)adaptor.create(STRING_LITERAL71);
            adaptor.addChild(root_0, STRING_LITERAL71_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 24, stringLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stringLiteralExp"

    public static class booleanLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:223:1: booleanLiteralExp : BOOLEAN_LITERAL ;
    public final IoclParser.booleanLiteralExp_return booleanLiteralExp() throws RecognitionException {
        IoclParser.booleanLiteralExp_return retval = new IoclParser.booleanLiteralExp_return();
        retval.start = input.LT(1);
        int booleanLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token BOOLEAN_LITERAL72=null;

        Object BOOLEAN_LITERAL72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:2: ( BOOLEAN_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:224:4: BOOLEAN_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            BOOLEAN_LITERAL72=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN_LITERAL72_tree = (Object)adaptor.create(BOOLEAN_LITERAL72);
            adaptor.addChild(root_0, BOOLEAN_LITERAL72_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, booleanLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "booleanLiteralExp"

    public static class integerLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:227:1: integerLiteralExp : INTEGER_LITERAL ;
    public final IoclParser.integerLiteralExp_return integerLiteralExp() throws RecognitionException {
        IoclParser.integerLiteralExp_return retval = new IoclParser.integerLiteralExp_return();
        retval.start = input.LT(1);
        int integerLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER_LITERAL73=null;

        Object INTEGER_LITERAL73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:2: ( INTEGER_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:228:4: INTEGER_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            INTEGER_LITERAL73=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integerLiteralExp973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER_LITERAL73_tree = (Object)adaptor.create(INTEGER_LITERAL73);
            adaptor.addChild(root_0, INTEGER_LITERAL73_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 26, integerLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteralExp"

    public static class realLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:231:1: realLiteralExp : REAL_LITERAL ;
    public final IoclParser.realLiteralExp_return realLiteralExp() throws RecognitionException {
        IoclParser.realLiteralExp_return retval = new IoclParser.realLiteralExp_return();
        retval.start = input.LT(1);
        int realLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token REAL_LITERAL74=null;

        Object REAL_LITERAL74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:232:2: ( REAL_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:232:4: REAL_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            REAL_LITERAL74=(Token)match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_realLiteralExp985); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LITERAL74_tree = (Object)adaptor.create(REAL_LITERAL74);
            adaptor.addChild(root_0, REAL_LITERAL74_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 27, realLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "realLiteralExp"

    public static class enumerationLiteralExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumerationLiteralExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:235:1: enumerationLiteralExp : IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) ;
    public final IoclParser.enumerationLiteralExp_return enumerationLiteralExp() throws RecognitionException {
        IoclParser.enumerationLiteralExp_return retval = new IoclParser.enumerationLiteralExp_return();
        retval.start = input.LT(1);
        int enumerationLiteralExp_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER75=null;
        Token SCOPE76=null;
        Token IDENTIFIER77=null;

        Object IDENTIFIER75_tree=null;
        Object SCOPE76_tree=null;
        Object IDENTIFIER77_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:2: ( IDENTIFIER ( SCOPE IDENTIFIER )+ -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:4: IDENTIFIER ( SCOPE IDENTIFIER )+
            {
            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER75);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:15: ( SCOPE IDENTIFIER )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SCOPE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE76=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_enumerationLiteralExp999); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE76);

            	    IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerationLiteralExp1001); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER77);


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // 236:35: -> ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:236:38: ^( ENUM_LITERAL IDENTIFIER ( IDENTIFIER )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 28, enumerationLiteralExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumerationLiteralExp"

    public static class loopExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:239:1: loopExp : ( iteratorExp | iterateExp );
    public final IoclParser.loopExp_return loopExp() throws RecognitionException {
        IoclParser.loopExp_return retval = new IoclParser.loopExp_return();
        retval.start = input.LT(1);
        int loopExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.iteratorExp_return iteratorExp78 = null;

        IoclParser.iterateExp_return iterateExp79 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:240:2: ( iteratorExp | iterateExp )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ITERATOR_NAME) ) {
                alt23=1;
            }
            else if ( (LA23_0==ITERATE) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:240:4: iteratorExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iteratorExp_in_loopExp1026);
                    iteratorExp78=iteratorExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteratorExp78.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:241:4: iterateExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterateExp_in_loopExp1031);
                    iterateExp79=iterateExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterateExp79.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, loopExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loopExp"

    public static class iteratorExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:244:1: iteratorExp : ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) ;
    public final IoclParser.iteratorExp_return iteratorExp() throws RecognitionException {
        IoclParser.iteratorExp_return retval = new IoclParser.iteratorExp_return();
        retval.start = input.LT(1);
        int iteratorExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATOR_NAME80=null;
        Token LPAREN81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token RPAREN85=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression84 = null;


        Object ITERATOR_NAME80_tree=null;
        Object LPAREN81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object RPAREN85_tree=null;
        RewriteRuleTokenStream stream_ITERATOR_NAME=new RewriteRuleTokenStream(adaptor,"token ITERATOR_NAME");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:2: ( ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:4: ITERATOR_NAME LPAREN ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )? oclExpression RPAREN
            {
            ITERATOR_NAME80=(Token)match(input,ITERATOR_NAME,FOLLOW_ITERATOR_NAME_in_iteratorExp1042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATOR_NAME.add(ITERATOR_NAME80);

            LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iteratorExp1044); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN81);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:26: (v1= variableDeclaration ',' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred40_Iocl()) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:27: v1= variableDeclaration ','
                            {
                            pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1052);
                            v1=variableDeclaration();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                            char_literal82=(Token)match(input,76,FOLLOW_76_in_iteratorExp1054); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_76.add(char_literal82);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_variableDeclaration_in_iteratorExp1062);
                    v2=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
                    char_literal83=(Token)match(input,77,FOLLOW_77_in_iteratorExp1064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal83);


                    }
                    break;

            }

            pushFollow(FOLLOW_oclExpression_in_iteratorExp1068);
            oclExpression84=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression84.getTree());
            RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iteratorExp1070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN85);



            // AST REWRITE
            // elements: v1, oclExpression, ITERATOR_NAME, v2
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
            // 246:3: -> ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:6: ^( ITERATOR ITERATOR_NAME ( $v1)? ( $v2)? oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITERATOR, "ITERATOR"), root_1);

                adaptor.addChild(root_1, stream_ITERATOR_NAME.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:31: ( $v1)?
                if ( stream_v1.hasNext() ) {
                    adaptor.addChild(root_1, stream_v1.nextTree());

                }
                stream_v1.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:246:36: ( $v2)?
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
            if ( state.backtracking>0 ) { memoize(input, 30, iteratorExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorExp"

    public static class iterateExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterateExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:249:1: iterateExp : ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) ;
    public final IoclParser.iterateExp_return iterateExp() throws RecognitionException {
        IoclParser.iterateExp_return retval = new IoclParser.iterateExp_return();
        retval.start = input.LT(1);
        int iterateExp_StartIndex = input.index();
        Object root_0 = null;

        Token ITERATE86=null;
        Token LPAREN87=null;
        Token SEMICOLON88=null;
        Token char_literal89=null;
        Token RPAREN91=null;
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;

        IoclParser.oclExpression_return oclExpression90 = null;


        Object ITERATE86_tree=null;
        Object LPAREN87_tree=null;
        Object SEMICOLON88_tree=null;
        Object char_literal89_tree=null;
        Object RPAREN91_tree=null;
        RewriteRuleTokenStream stream_ITERATE=new RewriteRuleTokenStream(adaptor,"token ITERATE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:2: ( ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN -> ^( ITERATE ( $v1)? $v2 oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:4: ITERATE LPAREN (v1= variableDeclaration SEMICOLON )? v2= variableDeclaration '|' oclExpression RPAREN
            {
            ITERATE86=(Token)match(input,ITERATE,FOLLOW_ITERATE_in_iterateExp1102); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ITERATE.add(ITERATE86);

            LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_iterateExp1104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:19: (v1= variableDeclaration SEMICOLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENTIFIER) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred42_Iocl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:20: v1= variableDeclaration SEMICOLON
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_iterateExp1111);
                    v1=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclaration.add(v1.getTree());
                    SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_iterateExp1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON88);


                    }
                    break;

            }

            pushFollow(FOLLOW_variableDeclaration_in_iterateExp1121);
            v2=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(v2.getTree());
            char_literal89=(Token)match(input,77,FOLLOW_77_in_iterateExp1124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(char_literal89);

            pushFollow(FOLLOW_oclExpression_in_iterateExp1126);
            oclExpression90=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression90.getTree());
            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_iterateExp1128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);



            // AST REWRITE
            // elements: ITERATE, v2, v1, oclExpression
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
            // 251:3: -> ^( ITERATE ( $v1)? $v2 oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:6: ^( ITERATE ( $v1)? $v2 oclExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ITERATE.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:251:16: ( $v1)?
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
            if ( state.backtracking>0 ) { memoize(input, 31, iterateExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterateExp"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:254:1: variableDeclaration : IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) ;
    public final IoclParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        IoclParser.variableDeclaration_return retval = new IoclParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        IoclParser.type_return type94 = null;

        IoclParser.oclExpression_return oclExpression96 = null;


        Object IDENTIFIER92_tree=null;
        Object char_literal93_tree=null;
        Object char_literal95_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:2: ( IDENTIFIER ( ':' type )? ( '=' oclExpression )? -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:4: IDENTIFIER ( ':' type )? ( '=' oclExpression )?
            {
            IDENTIFIER92=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclaration1157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER92);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:15: ( ':' type )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:16: ':' type
                    {
                    char_literal93=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal93);

                    pushFollow(FOLLOW_type_in_variableDeclaration1162);
                    type94=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type94.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:27: ( '=' oclExpression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EQUAL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:28: '=' oclExpression
                    {
                    char_literal95=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclaration1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal95);

                    pushFollow(FOLLOW_oclExpression_in_variableDeclaration1169);
                    oclExpression96=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression96.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, oclExpression, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:48: -> ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:51: ^( VARIABLE IDENTIFIER ( type )? ( oclExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:73: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:255:79: ( oclExpression )?
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
            if ( state.backtracking>0 ) { memoize(input, 32, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:258:1: arguments : oclExpression ( ',' oclExpression )* ;
    public final IoclParser.arguments_return arguments() throws RecognitionException {
        IoclParser.arguments_return retval = new IoclParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal98=null;
        IoclParser.oclExpression_return oclExpression97 = null;

        IoclParser.oclExpression_return oclExpression99 = null;


        Object char_literal98_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:2: ( oclExpression ( ',' oclExpression )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:4: oclExpression ( ',' oclExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_oclExpression_in_arguments1196);
            oclExpression97=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression97.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:18: ( ',' oclExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==76) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:259:19: ',' oclExpression
            	    {
            	    char_literal98=(Token)match(input,76,FOLLOW_76_in_arguments1199); if (state.failed) return retval;
            	    pushFollow(FOLLOW_oclExpression_in_arguments1202);
            	    oclExpression99=oclExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression99.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
            if ( state.backtracking>0 ) { memoize(input, 33, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:262:1: simpleName : ( SELF | IDENTIFIER );
    public final IoclParser.simpleName_return simpleName() throws RecognitionException {
        IoclParser.simpleName_return retval = new IoclParser.simpleName_return();
        retval.start = input.LT(1);
        int simpleName_StartIndex = input.index();
        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:263:2: ( SELF | IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( input.LA(1)==SELF||input.LA(1)==IDENTIFIER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set100));
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
            if ( state.backtracking>0 ) { memoize(input, 34, simpleName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:267:1: primitiveType : PRIMITIVE_TYPE_LITERAL ;
    public final IoclParser.primitiveType_return primitiveType() throws RecognitionException {
        IoclParser.primitiveType_return retval = new IoclParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        Object root_0 = null;

        Token PRIMITIVE_TYPE_LITERAL101=null;

        Object PRIMITIVE_TYPE_LITERAL101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:268:2: ( PRIMITIVE_TYPE_LITERAL )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:268:4: PRIMITIVE_TYPE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            PRIMITIVE_TYPE_LITERAL101=(Token)match(input,PRIMITIVE_TYPE_LITERAL,FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIMITIVE_TYPE_LITERAL101_tree = (Object)adaptor.create(PRIMITIVE_TYPE_LITERAL101);
            adaptor.addChild(root_0, PRIMITIVE_TYPE_LITERAL101_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 35, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "collectionType"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:271:1: collectionType : collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) ;
    public final IoclParser.collectionType_return collectionType() throws RecognitionException {
        IoclParser.collectionType_return retval = new IoclParser.collectionType_return();
        retval.start = input.LT(1);
        int collectionType_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN103=null;
        Token RPAREN105=null;
        IoclParser.collectionTypeIdentifier_return collectionTypeIdentifier102 = null;

        IoclParser.type_return type104 = null;


        Object LPAREN103_tree=null;
        Object RPAREN105_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_collectionTypeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule collectionTypeIdentifier");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:272:2: ( collectionTypeIdentifier LPAREN type RPAREN -> ^( COLLECTION_TYPE collectionTypeIdentifier type ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:272:4: collectionTypeIdentifier LPAREN type RPAREN
            {
            pushFollow(FOLLOW_collectionTypeIdentifier_in_collectionType1243);
            collectionTypeIdentifier102=collectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_collectionTypeIdentifier.add(collectionTypeIdentifier102.getTree());
            LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collectionType1245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);

            pushFollow(FOLLOW_type_in_collectionType1247);
            type104=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type104.getTree());
            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collectionType1249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);



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
            // 272:48: -> ^( COLLECTION_TYPE collectionTypeIdentifier type )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:272:51: ^( COLLECTION_TYPE collectionTypeIdentifier type )
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
            if ( state.backtracking>0 ) { memoize(input, 36, collectionType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "collectionType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:275:1: type : ( primitiveType | collectionType | pathName );
    public final IoclParser.type_return type() throws RecognitionException {
        IoclParser.type_return retval = new IoclParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.primitiveType_return primitiveType106 = null;

        IoclParser.collectionType_return collectionType107 = null;

        IoclParser.pathName_return pathName108 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:2: ( primitiveType | collectionType | pathName )
            int alt30=3;
            switch ( input.LA(1) ) {
            case PRIMITIVE_TYPE_LITERAL:
                {
                alt30=1;
                }
                break;
            case COLLECTION_TYPE_LITERAL:
                {
                alt30=2;
                }
                break;
            case IDENTIFIER:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:276:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type1271);
                    primitiveType106=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType106.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:277:4: collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_collectionType_in_type1276);
                    collectionType107=collectionType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, collectionType107.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:278:4: pathName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pathName_in_type1281);
                    pathName108=pathName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathName108.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class pathName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathName"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:281:1: pathName : IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) ;
    public final IoclParser.pathName_return pathName() throws RecognitionException {
        IoclParser.pathName_return retval = new IoclParser.pathName_return();
        retval.start = input.LT(1);
        int pathName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER109=null;
        Token SCOPE110=null;
        Token IDENTIFIER111=null;

        Object IDENTIFIER109_tree=null;
        Object SCOPE110_tree=null;
        Object IDENTIFIER111_tree=null;
        RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:2: ( IDENTIFIER ( SCOPE IDENTIFIER )* -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:4: IDENTIFIER ( SCOPE IDENTIFIER )*
            {
            IDENTIFIER109=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER109);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:15: ( SCOPE IDENTIFIER )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==SCOPE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:16: SCOPE IDENTIFIER
            	    {
            	    SCOPE110=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_pathName1295); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SCOPE.add(SCOPE110);

            	    IDENTIFIER111=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pathName1297); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER111);


            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 282:35: -> ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:38: ^( PATH_NAME IDENTIFIER ( IDENTIFIER )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_NAME, "PATH_NAME"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:282:61: ( IDENTIFIER )*
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
            if ( state.backtracking>0 ) { memoize(input, 38, pathName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pathName"

    public static class imperativeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:287:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp );
    public final IoclParser.imperativeExp_return imperativeExp() throws RecognitionException {
        IoclParser.imperativeExp_return retval = new IoclParser.imperativeExp_return();
        retval.start = input.LT(1);
        int imperativeExp_StartIndex = input.index();
        Object root_0 = null;

        IoclParser.blockExp_return blockExp112 = null;

        IoclParser.breakExp_return breakExp113 = null;

        IoclParser.computeExp_return computeExp114 = null;

        IoclParser.continueExp_return continueExp115 = null;

        IoclParser.returnExp_return returnExp116 = null;

        IoclParser.variableInitExp_return variableInitExp117 = null;

        IoclParser.assignExp_return assignExp118 = null;

        IoclParser.raiseExp_return raiseExp119 = null;

        IoclParser.whileExp_return whileExp120 = null;

        IoclParser.ifExp_return ifExp121 = null;

        IoclParser.tryExp_return tryExp122 = null;

        IoclParser.forExp_return forExp123 = null;

        IoclParser.logExp_return logExp124 = null;

        IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp125 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:2: ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp )
            int alt32=14;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:288:4: blockExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExp_in_imperativeExp1323);
                    blockExp112=blockExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExp112.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:289:4: breakExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakExp_in_imperativeExp1328);
                    breakExp113=breakExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakExp113.getTree());

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:290:4: computeExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_computeExp_in_imperativeExp1333);
                    computeExp114=computeExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, computeExp114.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:291:4: continueExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueExp_in_imperativeExp1338);
                    continueExp115=continueExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueExp115.getTree());

                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:292:4: returnExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnExp_in_imperativeExp1343);
                    returnExp116=returnExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnExp116.getTree());

                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:293:4: variableInitExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableInitExp_in_imperativeExp1348);
                    variableInitExp117=variableInitExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitExp117.getTree());

                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: assignExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExp_in_imperativeExp1353);
                    assignExp118=assignExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExp118.getTree());

                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:295:4: raiseExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raiseExp_in_imperativeExp1358);
                    raiseExp119=raiseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raiseExp119.getTree());

                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:296:4: whileExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileExp_in_imperativeExp1363);
                    whileExp120=whileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileExp120.getTree());

                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:297:4: ifExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExp_in_imperativeExp1368);
                    ifExp121=ifExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExp121.getTree());

                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:298:4: tryExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryExp_in_imperativeExp1373);
                    tryExp122=tryExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryExp122.getTree());

                    }
                    break;
                case 12 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:299:4: forExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forExp_in_imperativeExp1378);
                    forExp123=forExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forExp123.getTree());

                    }
                    break;
                case 13 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:300:4: logExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logExp_in_imperativeExp1383);
                    logExp124=logExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logExp124.getTree());

                    }
                    break;
                case 14 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:301:4: imperativeOperationCallExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_imperativeOperationCallExp_in_imperativeExp1388);
                    imperativeOperationCallExp125=imperativeOperationCallExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeOperationCallExp125.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, imperativeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeExp"

    public static class blockExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:304:1: blockExp : ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) ;
    public final IoclParser.blockExp_return blockExp() throws RecognitionException {
        IoclParser.blockExp_return retval = new IoclParser.blockExp_return();
        retval.start = input.LT(1);
        int blockExp_StartIndex = input.index();
        Object root_0 = null;

        Token DO126=null;
        Token LCURLY127=null;
        Token RCURLY129=null;
        IoclParser.imperativeExp_return imperativeExp128 = null;


        Object DO126_tree=null;
        Object LCURLY127_tree=null;
        Object RCURLY129_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:2: ( ( DO )? LCURLY ( imperativeExp )* RCURLY -> ^( BLOCK ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:4: ( DO )? LCURLY ( imperativeExp )* RCURLY
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:4: ( DO )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DO) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: DO
                    {
                    DO126=(Token)match(input,DO,FOLLOW_DO_in_blockExp1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO126);


                    }
                    break;

            }

            LCURLY127=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_blockExp1402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY127);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:15: ( imperativeExp )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==BREAK||(LA34_0>=COMPUTE && LA34_0<=DO)||LA34_0==IF||(LA34_0>=LOG && LA34_0<=LPAREN)||LA34_0==RAISE||LA34_0==RETURN||LA34_0==SELF||(LA34_0>=TRY && LA34_0<=VAR)||LA34_0==WHILE||(LA34_0>=COLLECTION_TYPE_LITERAL && LA34_0<=IDENTIFIER)||LA34_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_blockExp1404);
            	    imperativeExp128=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp128.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            RCURLY129=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_blockExp1407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY129);



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
            // 305:37: -> ^( BLOCK ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:40: ^( BLOCK ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:305:48: ( imperativeExp )*
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
            if ( state.backtracking>0 ) { memoize(input, 40, blockExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExp"

    public static class breakExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:308:1: breakExp : BREAK SEMICOLON ;
    public final IoclParser.breakExp_return breakExp() throws RecognitionException {
        IoclParser.breakExp_return retval = new IoclParser.breakExp_return();
        retval.start = input.LT(1);
        int breakExp_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK130=null;
        Token SEMICOLON131=null;

        Object BREAK130_tree=null;
        Object SEMICOLON131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:309:2: ( BREAK SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:309:4: BREAK SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            BREAK130=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakExp1427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK130_tree = (Object)adaptor.create(BREAK130);
            root_0 = (Object)adaptor.becomeRoot(BREAK130_tree, root_0);
            }
            SEMICOLON131=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_breakExp1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON131_tree = (Object)adaptor.create(SEMICOLON131);
            adaptor.addChild(root_0, SEMICOLON131_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 41, breakExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakExp"

    public static class computeExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "computeExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:312:1: computeExp : COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) ;
    public final IoclParser.computeExp_return computeExp() throws RecognitionException {
        IoclParser.computeExp_return retval = new IoclParser.computeExp_return();
        retval.start = input.LT(1);
        int computeExp_StartIndex = input.index();
        Object root_0 = null;

        Token COMPUTE132=null;
        Token LPAREN133=null;
        Token RPAREN135=null;
        IoclParser.variableDeclaration_return variableDeclaration134 = null;

        IoclParser.oclExpression_return oclExpression136 = null;


        Object COMPUTE132_tree=null;
        Object LPAREN133_tree=null;
        Object RPAREN135_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMPUTE=new RewriteRuleTokenStream(adaptor,"token COMPUTE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:313:2: ( COMPUTE LPAREN variableDeclaration RPAREN oclExpression -> ^( COMPUTE variableDeclaration oclExpression ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:313:4: COMPUTE LPAREN variableDeclaration RPAREN oclExpression
            {
            COMPUTE132=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_computeExp1441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMPUTE.add(COMPUTE132);

            LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computeExp1443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN133);

            pushFollow(FOLLOW_variableDeclaration_in_computeExp1445);
            variableDeclaration134=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration134.getTree());
            RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computeExp1447); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN135);

            pushFollow(FOLLOW_oclExpression_in_computeExp1449);
            oclExpression136=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(oclExpression136.getTree());


            // AST REWRITE
            // elements: COMPUTE, variableDeclaration, oclExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:60: -> ^( COMPUTE variableDeclaration oclExpression )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:313:63: ^( COMPUTE variableDeclaration oclExpression )
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
            if ( state.backtracking>0 ) { memoize(input, 42, computeExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "computeExp"

    public static class continueExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:316:1: continueExp : CONTINUE SEMICOLON ;
    public final IoclParser.continueExp_return continueExp() throws RecognitionException {
        IoclParser.continueExp_return retval = new IoclParser.continueExp_return();
        retval.start = input.LT(1);
        int continueExp_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE137=null;
        Token SEMICOLON138=null;

        Object CONTINUE137_tree=null;
        Object SEMICOLON138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:317:2: ( CONTINUE SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:317:4: CONTINUE SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE137=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueExp1470); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE137_tree = (Object)adaptor.create(CONTINUE137);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE137_tree, root_0);
            }
            SEMICOLON138=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_continueExp1473); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMICOLON138_tree = (Object)adaptor.create(SEMICOLON138);
            adaptor.addChild(root_0, SEMICOLON138_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 43, continueExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueExp"

    public static class returnExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:320:1: returnExp : RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) ;
    public final IoclParser.returnExp_return returnExp() throws RecognitionException {
        IoclParser.returnExp_return retval = new IoclParser.returnExp_return();
        retval.start = input.LT(1);
        int returnExp_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN139=null;
        Token SEMICOLON141=null;
        IoclParser.logicalExp_return logicalExp140 = null;


        Object RETURN139_tree=null;
        Object SEMICOLON141_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:2: ( RETURN ( logicalExp )? SEMICOLON -> ^( RETURN ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:4: RETURN ( logicalExp )? SEMICOLON
            {
            RETURN139=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnExp1484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN139);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:11: ( logicalExp )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LPAREN||(LA35_0>=MINUS && LA35_0<=NOT)||LA35_0==SELF||(LA35_0>=COLLECTION_TYPE_LITERAL && LA35_0<=IDENTIFIER)||LA35_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: logicalExp
                    {
                    pushFollow(FOLLOW_logicalExp_in_returnExp1486);
                    logicalExp140=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp140.getTree());

                    }
                    break;

            }

            SEMICOLON141=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnExp1489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON141);



            // AST REWRITE
            // elements: RETURN, logicalExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 321:33: -> ^( RETURN ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:36: ^( RETURN ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:321:45: ( logicalExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 44, returnExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnExp"

    public static class variableInitExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:324:1: variableInitExp : VAR imperativeVarDeclarations SEMICOLON ;
    public final IoclParser.variableInitExp_return variableInitExp() throws RecognitionException {
        IoclParser.variableInitExp_return retval = new IoclParser.variableInitExp_return();
        retval.start = input.LT(1);
        int variableInitExp_StartIndex = input.index();
        Object root_0 = null;

        Token VAR142=null;
        Token SEMICOLON144=null;
        IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations143 = null;


        Object VAR142_tree=null;
        Object SEMICOLON144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:325:2: ( VAR imperativeVarDeclarations SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:325:4: VAR imperativeVarDeclarations SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            VAR142=(Token)match(input,VAR,FOLLOW_VAR_in_variableInitExp1509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR142_tree = (Object)adaptor.create(VAR142);
            root_0 = (Object)adaptor.becomeRoot(VAR142_tree, root_0);
            }
            pushFollow(FOLLOW_imperativeVarDeclarations_in_variableInitExp1512);
            imperativeVarDeclarations143=imperativeVarDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclarations143.getTree());
            SEMICOLON144=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableInitExp1514); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 45, variableInitExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitExp"

    public static class imperativeVarDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclarations"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:328:1: imperativeVarDeclarations : imperativeVarDeclaration ( ',' imperativeVarDeclaration )* ;
    public final IoclParser.imperativeVarDeclarations_return imperativeVarDeclarations() throws RecognitionException {
        IoclParser.imperativeVarDeclarations_return retval = new IoclParser.imperativeVarDeclarations_return();
        retval.start = input.LT(1);
        int imperativeVarDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal146=null;
        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration145 = null;

        IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration147 = null;


        Object char_literal146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:329:2: ( imperativeVarDeclaration ( ',' imperativeVarDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:329:4: imperativeVarDeclaration ( ',' imperativeVarDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1527);
            imperativeVarDeclaration145=imperativeVarDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration145.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:329:29: ( ',' imperativeVarDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==76) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:329:30: ',' imperativeVarDeclaration
            	    {
            	    char_literal146=(Token)match(input,76,FOLLOW_76_in_imperativeVarDeclarations1530); if (state.failed) return retval;
            	    pushFollow(FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1533);
            	    imperativeVarDeclaration147=imperativeVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, imperativeVarDeclaration147.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
            if ( state.backtracking>0 ) { memoize(input, 46, imperativeVarDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclarations"

    public static class imperativeVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeVarDeclaration"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:332:1: imperativeVarDeclaration : IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) ;
    public final IoclParser.imperativeVarDeclaration_return imperativeVarDeclaration() throws RecognitionException {
        IoclParser.imperativeVarDeclaration_return retval = new IoclParser.imperativeVarDeclaration_return();
        retval.start = input.LT(1);
        int imperativeVarDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER148=null;
        Token char_literal149=null;
        Token EQUAL151=null;
        Token IS152=null;
        IoclParser.type_return type150 = null;

        IoclParser.logicalExp_return logicalExp153 = null;


        Object IDENTIFIER148_tree=null;
        Object char_literal149_tree=null;
        Object EQUAL151_tree=null;
        Object IS152_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:2: ( IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )? -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:4: IDENTIFIER ( ':' type )? ( ( EQUAL | IS ) logicalExp )?
            {
            IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:15: ( ':' type )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==COLON) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:16: ':' type
                    {
                    char_literal149=(Token)match(input,COLON,FOLLOW_COLON_in_imperativeVarDeclaration1550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal149);

                    pushFollow(FOLLOW_type_in_imperativeVarDeclaration1552);
                    type150=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type150.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:27: ( ( EQUAL | IS ) logicalExp )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EQUAL||LA39_0==IS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:28: ( EQUAL | IS ) logicalExp
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:28: ( EQUAL | IS )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==EQUAL) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==IS) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:29: EQUAL
                            {
                            EQUAL151=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_imperativeVarDeclaration1558); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL151);


                            }
                            break;
                        case 2 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:37: IS
                            {
                            IS152=(Token)match(input,IS,FOLLOW_IS_in_imperativeVarDeclaration1562); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS152);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_logicalExp_in_imperativeVarDeclaration1566);
                    logicalExp153=logicalExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalExp.add(logicalExp153.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, IDENTIFIER, logicalExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:55: -> ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:58: ^( VARIABLE IDENTIFIER ( type )? ( logicalExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:80: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:333:86: ( logicalExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 47, imperativeVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeVarDeclaration"

    public static class assignExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:336:1: assignExp : variableExp ( IS | APPEND ) logicalExp SEMICOLON ;
    public final IoclParser.assignExp_return assignExp() throws RecognitionException {
        IoclParser.assignExp_return retval = new IoclParser.assignExp_return();
        retval.start = input.LT(1);
        int assignExp_StartIndex = input.index();
        Object root_0 = null;

        Token set155=null;
        Token SEMICOLON157=null;
        IoclParser.variableExp_return variableExp154 = null;

        IoclParser.logicalExp_return logicalExp156 = null;


        Object set155_tree=null;
        Object SEMICOLON157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:2: ( variableExp ( IS | APPEND ) logicalExp SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:337:4: variableExp ( IS | APPEND ) logicalExp SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableExp_in_assignExp1593);
            variableExp154=variableExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExp154.getTree());
            set155=(Token)input.LT(1);
            set155=(Token)input.LT(1);
            if ( input.LA(1)==APPEND||input.LA(1)==IS ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set155), root_0);
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_logicalExp_in_assignExp1604);
            logicalExp156=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExp156.getTree());
            SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignExp1606); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 48, assignExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExp"

    public static class raiseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "raiseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:340:1: raiseExp : RAISE ( type | STRING_LITERAL ) SEMICOLON ;
    public final IoclParser.raiseExp_return raiseExp() throws RecognitionException {
        IoclParser.raiseExp_return retval = new IoclParser.raiseExp_return();
        retval.start = input.LT(1);
        int raiseExp_StartIndex = input.index();
        Object root_0 = null;

        Token RAISE158=null;
        Token STRING_LITERAL160=null;
        Token SEMICOLON161=null;
        IoclParser.type_return type159 = null;


        Object RAISE158_tree=null;
        Object STRING_LITERAL160_tree=null;
        Object SEMICOLON161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:2: ( RAISE ( type | STRING_LITERAL ) SEMICOLON )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:4: RAISE ( type | STRING_LITERAL ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            RAISE158=(Token)match(input,RAISE,FOLLOW_RAISE_in_raiseExp1618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RAISE158_tree = (Object)adaptor.create(RAISE158);
            root_0 = (Object)adaptor.becomeRoot(RAISE158_tree, root_0);
            }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:11: ( type | STRING_LITERAL )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==COLLECTION_TYPE_LITERAL||LA40_0==IDENTIFIER||LA40_0==PRIMITIVE_TYPE_LITERAL) ) {
                alt40=1;
            }
            else if ( (LA40_0==STRING_LITERAL) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:12: type
                    {
                    pushFollow(FOLLOW_type_in_raiseExp1622);
                    type159=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type159.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:341:19: STRING_LITERAL
                    {
                    STRING_LITERAL160=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_raiseExp1626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING_LITERAL160_tree = (Object)adaptor.create(STRING_LITERAL160);
                    adaptor.addChild(root_0, STRING_LITERAL160_tree);
                    }

                    }
                    break;

            }

            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_raiseExp1629); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 49, raiseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "raiseExp"

    public static class whileExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:344:1: whileExp : WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) ;
    public final IoclParser.whileExp_return whileExp() throws RecognitionException {
        IoclParser.whileExp_return retval = new IoclParser.whileExp_return();
        retval.start = input.LT(1);
        int whileExp_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE162=null;
        Token LPAREN163=null;
        Token RPAREN164=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object WHILE162_tree=null;
        Object LPAREN163_tree=null;
        Object RPAREN164_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:345:2: ( WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( WHILE $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:345:4: WHILE LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            WHILE162=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExp1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE162);

            LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileExp1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN163);

            pushFollow(FOLLOW_logicalExp_in_whileExp1649);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN164=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileExp1651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN164);

            pushFollow(FOLLOW_imperativeExp_in_whileExp1660);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


            // AST REWRITE
            // elements: WHILE, body, condition
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
            // 346:24: -> ^( WHILE $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:346:27: ^( WHILE $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 50, whileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileExp"

    public static class ifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:349:1: ifExp : IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) ;
    public final IoclParser.ifExp_return ifExp() throws RecognitionException {
        IoclParser.ifExp_return retval = new IoclParser.ifExp_return();
        retval.start = input.LT(1);
        int ifExp_StartIndex = input.index();
        Object root_0 = null;

        Token IF165=null;
        Token ENDIF169=null;
        IoclParser.altExp_return altExp166 = null;

        IoclParser.elifExp_return elifExp167 = null;

        IoclParser.elseExp_return elseExp168 = null;


        Object IF165_tree=null;
        Object ENDIF169_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elifExp=new RewriteRuleSubtreeStream(adaptor,"rule elifExp");
        RewriteRuleSubtreeStream stream_altExp=new RewriteRuleSubtreeStream(adaptor,"rule altExp");
        RewriteRuleSubtreeStream stream_elseExp=new RewriteRuleSubtreeStream(adaptor,"rule elseExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:2: ( IF altExp ( elifExp )* ( elseExp )? ( ENDIF )? -> ^( IF altExp ( elifExp )* ( elseExp )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:4: IF altExp ( elifExp )* ( elseExp )? ( ENDIF )?
            {
            IF165=(Token)match(input,IF,FOLLOW_IF_in_ifExp1683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF165);

            pushFollow(FOLLOW_altExp_in_ifExp1685);
            altExp166=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_altExp.add(altExp166.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:14: ( elifExp )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ELIF) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred72_Iocl()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:15: elifExp
            	    {
            	    pushFollow(FOLLOW_elifExp_in_ifExp1688);
            	    elifExp167=elifExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elifExp.add(elifExp167.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:25: ( elseExp )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ELSE) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred73_Iocl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:26: elseExp
                    {
                    pushFollow(FOLLOW_elseExp_in_ifExp1693);
                    elseExp168=elseExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseExp.add(elseExp168.getTree());

                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:36: ( ENDIF )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ENDIF) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred74_Iocl()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: ENDIF
                    {
                    ENDIF169=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExp1697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF169);


                    }
                    break;

            }



            // AST REWRITE
            // elements: altExp, IF, elifExp, elseExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 350:43: -> ^( IF altExp ( elifExp )* ( elseExp )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:46: ^( IF altExp ( elifExp )* ( elseExp )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_altExp.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:58: ( elifExp )*
                while ( stream_elifExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_elifExp.nextTree());

                }
                stream_elifExp.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:67: ( elseExp )?
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
            if ( state.backtracking>0 ) { memoize(input, 51, ifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExp"

    public static class elifExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elifExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:353:1: elifExp : ELIF altExp ;
    public final IoclParser.elifExp_return elifExp() throws RecognitionException {
        IoclParser.elifExp_return retval = new IoclParser.elifExp_return();
        retval.start = input.LT(1);
        int elifExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELIF170=null;
        IoclParser.altExp_return altExp171 = null;


        Object ELIF170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:354:2: ( ELIF altExp )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:354:4: ELIF altExp
            {
            root_0 = (Object)adaptor.nil();

            ELIF170=(Token)match(input,ELIF,FOLLOW_ELIF_in_elifExp1723); if (state.failed) return retval;
            pushFollow(FOLLOW_altExp_in_elifExp1726);
            altExp171=altExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, altExp171.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, elifExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elifExp"

    public static class elseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:357:1: elseExp : ELSE oclExpression ;
    public final IoclParser.elseExp_return elseExp() throws RecognitionException {
        IoclParser.elseExp_return retval = new IoclParser.elseExp_return();
        retval.start = input.LT(1);
        int elseExp_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE172=null;
        IoclParser.oclExpression_return oclExpression173 = null;


        Object ELSE172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:358:2: ( ELSE oclExpression )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:358:4: ELSE oclExpression
            {
            root_0 = (Object)adaptor.nil();

            ELSE172=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseExp1738); if (state.failed) return retval;
            pushFollow(FOLLOW_oclExpression_in_elseExp1741);
            oclExpression173=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oclExpression173.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, elseExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseExp"

    public static class altExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:361:1: altExp : LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) ;
    public final IoclParser.altExp_return altExp() throws RecognitionException {
        IoclParser.altExp_return retval = new IoclParser.altExp_return();
        retval.start = input.LT(1);
        int altExp_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN174=null;
        Token RPAREN175=null;
        IoclParser.logicalExp_return condition = null;

        IoclParser.imperativeExp_return body = null;


        Object LPAREN174_tree=null;
        Object RPAREN175_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_logicalExp=new RewriteRuleSubtreeStream(adaptor,"rule logicalExp");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:2: ( LPAREN condition= logicalExp RPAREN body= imperativeExp -> ^( ALT_EXP $condition $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:4: LPAREN condition= logicalExp RPAREN body= imperativeExp
            {
            LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_altExp1754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN174);

            pushFollow(FOLLOW_logicalExp_in_altExp1760);
            condition=logicalExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalExp.add(condition.getTree());
            RPAREN175=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_altExp1762); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN175);

            pushFollow(FOLLOW_imperativeExp_in_altExp1769);
            body=imperativeExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imperativeExp.add(body.getTree());


            // AST REWRITE
            // elements: condition, body
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
            // 362:63: -> ^( ALT_EXP $condition $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:362:66: ^( ALT_EXP $condition $body)
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
            if ( state.backtracking>0 ) { memoize(input, 54, altExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "altExp"

    public static class tryExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:365:1: tryExp : TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) ;
    public final IoclParser.tryExp_return tryExp() throws RecognitionException {
        IoclParser.tryExp_return retval = new IoclParser.tryExp_return();
        retval.start = input.LT(1);
        int tryExp_StartIndex = input.index();
        Object root_0 = null;

        Token TRY176=null;
        Token LCURLY177=null;
        Token RCURLY179=null;
        IoclParser.imperativeExp_return imperativeExp178 = null;

        IoclParser.except_return except180 = null;


        Object TRY176_tree=null;
        Object LCURLY177_tree=null;
        Object RCURLY179_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_except=new RewriteRuleSubtreeStream(adaptor,"rule except");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:2: ( TRY LCURLY ( imperativeExp )* RCURLY except -> ^( TRY ( imperativeExp )* except ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:4: TRY LCURLY ( imperativeExp )* RCURLY except
            {
            TRY176=(Token)match(input,TRY,FOLLOW_TRY_in_tryExp1792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY176);

            LCURLY177=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_tryExp1794); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY177);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:15: ( imperativeExp )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==BREAK||(LA44_0>=COMPUTE && LA44_0<=DO)||LA44_0==IF||(LA44_0>=LOG && LA44_0<=LPAREN)||LA44_0==RAISE||LA44_0==RETURN||LA44_0==SELF||(LA44_0>=TRY && LA44_0<=VAR)||LA44_0==WHILE||(LA44_0>=COLLECTION_TYPE_LITERAL && LA44_0<=IDENTIFIER)||LA44_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_tryExp1796);
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

            RCURLY179=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_tryExp1799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY179);

            pushFollow(FOLLOW_except_in_tryExp1801);
            except180=except();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_except.add(except180.getTree());


            // AST REWRITE
            // elements: TRY, except, imperativeExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:44: -> ^( TRY ( imperativeExp )* except )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:47: ^( TRY ( imperativeExp )* except )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:366:53: ( imperativeExp )*
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
            if ( state.backtracking>0 ) { memoize(input, 55, tryExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryExp"

    public static class except_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "except"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:369:1: except : EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) ;
    public final IoclParser.except_return except() throws RecognitionException {
        IoclParser.except_return retval = new IoclParser.except_return();
        retval.start = input.LT(1);
        int except_StartIndex = input.index();
        Object root_0 = null;

        Token EXCEPT181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        Token LCURLY185=null;
        Token RCURLY187=null;
        IoclParser.type_return type183 = null;

        IoclParser.imperativeExp_return imperativeExp186 = null;


        Object EXCEPT181_tree=null;
        Object LPAREN182_tree=null;
        Object RPAREN184_tree=null;
        Object LCURLY185_tree=null;
        Object RCURLY187_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_EXCEPT=new RewriteRuleTokenStream(adaptor,"token EXCEPT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleSubtreeStream stream_imperativeExp=new RewriteRuleSubtreeStream(adaptor,"rule imperativeExp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:2: ( EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY -> ^( EXCEPT type ( imperativeExp )* ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:4: EXCEPT LPAREN type RPAREN LCURLY ( imperativeExp )* RCURLY
            {
            EXCEPT181=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_except1823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXCEPT.add(EXCEPT181);

            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_except1825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_type_in_except1827);
            type183=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type183.getTree());
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_except1829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            LCURLY185=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_except1831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY185);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:37: ( imperativeExp )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BREAK||(LA45_0>=COMPUTE && LA45_0<=DO)||LA45_0==IF||(LA45_0>=LOG && LA45_0<=LPAREN)||LA45_0==RAISE||LA45_0==RETURN||LA45_0==SELF||(LA45_0>=TRY && LA45_0<=VAR)||LA45_0==WHILE||(LA45_0>=COLLECTION_TYPE_LITERAL && LA45_0<=IDENTIFIER)||LA45_0==PRIMITIVE_TYPE_LITERAL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: imperativeExp
            	    {
            	    pushFollow(FOLLOW_imperativeExp_in_except1833);
            	    imperativeExp186=imperativeExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imperativeExp.add(imperativeExp186.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            RCURLY187=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_except1836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY187);



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
            // 370:59: -> ^( EXCEPT type ( imperativeExp )* )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:62: ^( EXCEPT type ( imperativeExp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXCEPT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:370:76: ( imperativeExp )*
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
            if ( state.backtracking>0 ) { memoize(input, 56, except_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "except"

    public static class forExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:373:1: forExp : oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) ;
    public final IoclParser.forExp_return forExp() throws RecognitionException {
        IoclParser.forExp_return retval = new IoclParser.forExp_return();
        retval.start = input.LT(1);
        int forExp_StartIndex = input.index();
        Object root_0 = null;

        Token ARROW189=null;
        Token FOR_NAME190=null;
        Token LPAREN191=null;
        Token char_literal193=null;
        Token RPAREN194=null;
        IoclParser.oclExpression_return condition = null;

        IoclParser.oclExpression_return body = null;

        IoclParser.oclExp_return oclExp188 = null;

        IoclParser.iteratorList_return iteratorList192 = null;


        Object ARROW189_tree=null;
        Object FOR_NAME190_tree=null;
        Object LPAREN191_tree=null;
        Object char_literal193_tree=null;
        Object RPAREN194_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_FOR_NAME=new RewriteRuleTokenStream(adaptor,"token FOR_NAME");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_oclExp=new RewriteRuleSubtreeStream(adaptor,"rule oclExp");
        RewriteRuleSubtreeStream stream_oclExpression=new RewriteRuleSubtreeStream(adaptor,"rule oclExpression");
        RewriteRuleSubtreeStream stream_iteratorList=new RewriteRuleSubtreeStream(adaptor,"rule iteratorList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:374:2: ( oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:374:4: oclExp ARROW FOR_NAME LPAREN iteratorList ( '|' condition= oclExpression )? RPAREN body= oclExpression
            {
            pushFollow(FOLLOW_oclExp_in_forExp1859);
            oclExp188=oclExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExp.add(oclExp188.getTree());
            ARROW189=(Token)match(input,ARROW,FOLLOW_ARROW_in_forExp1861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW189);

            FOR_NAME190=(Token)match(input,FOR_NAME,FOLLOW_FOR_NAME_in_forExp1863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR_NAME.add(FOR_NAME190);

            LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forExp1865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN191);

            pushFollow(FOLLOW_iteratorList_in_forExp1867);
            iteratorList192=iteratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteratorList.add(iteratorList192.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:374:46: ( '|' condition= oclExpression )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==77) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:374:47: '|' condition= oclExpression
                    {
                    char_literal193=(Token)match(input,77,FOLLOW_77_in_forExp1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal193);

                    pushFollow(FOLLOW_oclExpression_in_forExp1876);
                    condition=oclExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_oclExpression.add(condition.getTree());

                    }
                    break;

            }

            RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forExp1880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN194);

            pushFollow(FOLLOW_oclExpression_in_forExp1886);
            body=oclExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_oclExpression.add(body.getTree());


            // AST REWRITE
            // elements: condition, oclExp, body, iteratorList, FOR_NAME
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
            // 375:3: -> ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:375:6: ^( FOR FOR_NAME oclExp iteratorList ( $condition)? $body)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_FOR_NAME.nextNode());
                adaptor.addChild(root_1, stream_oclExp.nextTree());
                adaptor.addChild(root_1, stream_iteratorList.nextTree());
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:375:41: ( $condition)?
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
            if ( state.backtracking>0 ) { memoize(input, 57, forExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forExp"

    public static class iteratorList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteratorList"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:378:1: iteratorList : variableDeclaration ( ',' variableDeclaration )* ;
    public final IoclParser.iteratorList_return iteratorList() throws RecognitionException {
        IoclParser.iteratorList_return retval = new IoclParser.iteratorList_return();
        retval.start = input.LT(1);
        int iteratorList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal196=null;
        IoclParser.variableDeclaration_return variableDeclaration195 = null;

        IoclParser.variableDeclaration_return variableDeclaration197 = null;


        Object char_literal196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:379:2: ( variableDeclaration ( ',' variableDeclaration )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:379:4: variableDeclaration ( ',' variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variableDeclaration_in_iteratorList1918);
            variableDeclaration195=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration195.getTree());
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:379:24: ( ',' variableDeclaration )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==76) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:379:25: ',' variableDeclaration
            	    {
            	    char_literal196=(Token)match(input,76,FOLLOW_76_in_iteratorList1921); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclaration_in_iteratorList1924);
            	    variableDeclaration197=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration197.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
            if ( state.backtracking>0 ) { memoize(input, 58, iteratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iteratorList"

    public static class logExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:382:1: logExp : LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? ) ;
    public final IoclParser.logExp_return logExp() throws RecognitionException {
        IoclParser.logExp_return retval = new IoclParser.logExp_return();
        retval.start = input.LT(1);
        int logExp_StartIndex = input.index();
        Object root_0 = null;

        Token LOG198=null;
        Token LPAREN199=null;
        Token STRING_LITERAL200=null;
        Token char_literal201=null;
        Token IDENTIFIER202=null;
        Token char_literal203=null;
        Token INTEGER_LITERAL204=null;
        Token RPAREN205=null;
        Token SEMICOLON206=null;

        Object LOG198_tree=null;
        Object LPAREN199_tree=null;
        Object STRING_LITERAL200_tree=null;
        Object char_literal201_tree=null;
        Object IDENTIFIER202_tree=null;
        Object char_literal203_tree=null;
        Object INTEGER_LITERAL204_tree=null;
        Object RPAREN205_tree=null;
        Object SEMICOLON206_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_LOG=new RewriteRuleTokenStream(adaptor,"token LOG");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:2: ( LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:4: LOG LPAREN STRING_LITERAL ( ',' IDENTIFIER )? ( ',' INTEGER_LITERAL )? RPAREN SEMICOLON
            {
            LOG198=(Token)match(input,LOG,FOLLOW_LOG_in_logExp1937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LOG.add(LOG198);

            LPAREN199=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_logExp1939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN199);

            STRING_LITERAL200=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_logExp1941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL200);

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:30: ( ',' IDENTIFIER )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==76) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==IDENTIFIER) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:31: ',' IDENTIFIER
                    {
                    char_literal201=(Token)match(input,76,FOLLOW_76_in_logExp1944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(char_literal201);

                    IDENTIFIER202=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logExp1946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER202);


                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:48: ( ',' INTEGER_LITERAL )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:49: ',' INTEGER_LITERAL
                    {
                    char_literal203=(Token)match(input,76,FOLLOW_76_in_logExp1951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(char_literal203);

                    INTEGER_LITERAL204=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_logExp1953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTEGER_LITERAL.add(INTEGER_LITERAL204);


                    }
                    break;

            }

            RPAREN205=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_logExp1957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN205);

            SEMICOLON206=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_logExp1959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON206);



            // AST REWRITE
            // elements: INTEGER_LITERAL, STRING_LITERAL, LOG
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 383:88: -> ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:91: ^( LOG ( STRING_LITERAL )? ( INTEGER_LITERAL )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOG.nextNode(), root_1);

                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:97: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                }
                stream_STRING_LITERAL.reset();
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:383:113: ( INTEGER_LITERAL )?
                if ( stream_INTEGER_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_INTEGER_LITERAL.nextNode());

                }
                stream_INTEGER_LITERAL.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 59, logExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logExp"

    public static class imperativeOperationCallExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imperativeOperationCallExp"
    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:386:1: imperativeOperationCallExp : dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) ;
    public final IoclParser.imperativeOperationCallExp_return imperativeOperationCallExp() throws RecognitionException {
        IoclParser.imperativeOperationCallExp_return retval = new IoclParser.imperativeOperationCallExp_return();
        retval.start = input.LT(1);
        int imperativeOperationCallExp_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON208=null;
        IoclParser.dotArrowExp_return dotArrowExp207 = null;


        Object SEMICOLON208_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_dotArrowExp=new RewriteRuleSubtreeStream(adaptor,"rule dotArrowExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:387:2: ( dotArrowExp SEMICOLON -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:387:4: dotArrowExp SEMICOLON
            {
            pushFollow(FOLLOW_dotArrowExp_in_imperativeOperationCallExp1982);
            dotArrowExp207=dotArrowExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotArrowExp.add(dotArrowExp207.getTree());
            SEMICOLON208=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_imperativeOperationCallExp1984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON208);



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
            // 387:26: -> ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
            {
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:387:29: ^( IMPERATIVE_OPERATION_CALL dotArrowExp )
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
            if ( state.backtracking>0 ) { memoize(input, 60, imperativeOperationCallExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "imperativeOperationCallExp"

    // $ANTLR start synpred1_Iocl
    public final void synpred1_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:4: ( imperativeExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:113:4: imperativeExp
        {
        pushFollow(FOLLOW_imperativeExp_in_synpred1_Iocl406);
        imperativeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Iocl

    // $ANTLR start synpred20_Iocl
    public final void synpred20_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:4: ( oclExp ( propertyCallExp )+ )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:4: oclExp ( propertyCallExp )+
        {
        pushFollow(FOLLOW_oclExp_in_synpred20_Iocl613);
        oclExp();

        state._fsp--;
        if (state.failed) return ;
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:148:26: ( propertyCallExp )+
        int cnt50=0;
        loop50:
        do {
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ARROW||LA50_0==DOT) ) {
                alt50=1;
            }


            switch (alt50) {
        	case 1 :
        	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:0:0: propertyCallExp
        	    {
        	    pushFollow(FOLLOW_propertyCallExp_in_synpred20_Iocl615);
        	    propertyCallExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt50 >= 1 ) break loop50;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(50, input);
                    throw eee;
            }
            cnt50++;
        } while (true);


        }
    }
    // $ANTLR end synpred20_Iocl

    // $ANTLR start synpred23_Iocl
    public final void synpred23_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:4: ( operationCallExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:158:4: operationCallExp
        {
        pushFollow(FOLLOW_operationCallExp_in_synpred23_Iocl661);
        operationCallExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Iocl

    // $ANTLR start synpred28_Iocl
    public final void synpred28_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: ( variableExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:172:4: variableExp
        {
        pushFollow(FOLLOW_variableExp_in_synpred28_Iocl751);
        variableExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Iocl

    // $ANTLR start synpred29_Iocl
    public final void synpred29_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: ( type )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:173:4: type
        {
        pushFollow(FOLLOW_type_in_synpred29_Iocl756);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Iocl

    // $ANTLR start synpred34_Iocl
    public final void synpred34_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:27: ( ',' collectionLiteralParts )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:197:27: ',' collectionLiteralParts
        {
        match(input,76,FOLLOW_76_in_synpred34_Iocl872); if (state.failed) return ;
        pushFollow(FOLLOW_collectionLiteralParts_in_synpred34_Iocl875);
        collectionLiteralParts();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Iocl

    // $ANTLR start synpred40_Iocl
    public final void synpred40_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:27: (v1= variableDeclaration ',' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:27: v1= variableDeclaration ','
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred40_Iocl1052);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,76,FOLLOW_76_in_synpred40_Iocl1054); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_Iocl

    // $ANTLR start synpred41_Iocl
    public final void synpred41_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;

        IoclParser.variableDeclaration_return v2 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:26: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:26: (v1= variableDeclaration ',' )? v2= variableDeclaration '|'
        {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:26: (v1= variableDeclaration ',' )?
        int alt52=2;
        int LA52_0 = input.LA(1);

        if ( (LA52_0==IDENTIFIER) ) {
            int LA52_1 = input.LA(2);

            if ( (synpred40_Iocl()) ) {
                alt52=1;
            }
        }
        switch (alt52) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:245:27: v1= variableDeclaration ','
                {
                pushFollow(FOLLOW_variableDeclaration_in_synpred41_Iocl1052);
                v1=variableDeclaration();

                state._fsp--;
                if (state.failed) return ;
                match(input,76,FOLLOW_76_in_synpred41_Iocl1054); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_variableDeclaration_in_synpred41_Iocl1062);
        v2=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,77,FOLLOW_77_in_synpred41_Iocl1064); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Iocl

    // $ANTLR start synpred42_Iocl
    public final void synpred42_Iocl_fragment() throws RecognitionException {   
        IoclParser.variableDeclaration_return v1 = null;


        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:20: (v1= variableDeclaration SEMICOLON )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:250:20: v1= variableDeclaration SEMICOLON
        {
        pushFollow(FOLLOW_variableDeclaration_in_synpred42_Iocl1111);
        v1=variableDeclaration();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred42_Iocl1113); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Iocl

    // $ANTLR start synpred56_Iocl
    public final void synpred56_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: ( assignExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:294:4: assignExp
        {
        pushFollow(FOLLOW_assignExp_in_synpred56_Iocl1353);
        assignExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Iocl

    // $ANTLR start synpred61_Iocl
    public final void synpred61_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:299:4: ( forExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:299:4: forExp
        {
        pushFollow(FOLLOW_forExp_in_synpred61_Iocl1378);
        forExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Iocl

    // $ANTLR start synpred72_Iocl
    public final void synpred72_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:15: ( elifExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:15: elifExp
        {
        pushFollow(FOLLOW_elifExp_in_synpred72_Iocl1688);
        elifExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Iocl

    // $ANTLR start synpred73_Iocl
    public final void synpred73_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:26: ( elseExp )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:26: elseExp
        {
        pushFollow(FOLLOW_elseExp_in_synpred73_Iocl1693);
        elseExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Iocl

    // $ANTLR start synpred74_Iocl
    public final void synpred74_Iocl_fragment() throws RecognitionException {   
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:36: ( ENDIF )
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:350:36: ENDIF
        {
        match(input,ENDIF,FOLLOW_ENDIF_in_synpred74_Iocl1697); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_Iocl

    // Delegated rules

    public final boolean synpred42_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred34_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Iocl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_Iocl_fragment(); // can never throw exception
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
    public final boolean synpred23_Iocl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Iocl_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA1_eotS =
        "\31\uffff";
    static final String DFA1_eofS =
        "\31\uffff";
    static final String DFA1_minS =
        "\1\12\7\uffff\1\0\4\uffff\11\0\3\uffff";
    static final String DFA1_maxS =
        "\1\104\7\uffff\1\0\4\uffff\11\0\3\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\25\uffff\1\2\1\uffff";
    static final String DFA1_specialS =
        "\10\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\3\1\13\uffff\1\1\4\uffff\2\1\1\25\2\uffff\3\27"+
            "\6\uffff\1\1\1\uffff\1\1\2\uffff\1\15\1\uffff\2\1\1\uffff\1"+
            "\1\2\uffff\1\16\1\23\1\21\1\22\1\17\1\20\1\10\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            return "112:1: oclExpression : ( imperativeExp | logicalExp );";
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

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Iocl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index1_21);
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
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\43\12\0\2\uffff";
    static final String DFA10_maxS =
        "\1\104\12\0\2\uffff";
    static final String DFA10_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\12\20\uffff\1\10\7\uffff\1\2\1\7\1\5\1\6\1\3\1\4\1\1\1\uffff"+
            "\1\11",
            "\1\uffff",
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
            return "147:1: dotArrowExp : ( oclExp ( propertyCallExp )+ | oclExp );";
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
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_Iocl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index10_10);
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
    static final String DFA25_eotS =
        "\32\uffff";
    static final String DFA25_eofS =
        "\32\uffff";
    static final String DFA25_minS =
        "\1\12\1\0\30\uffff";
    static final String DFA25_maxS =
        "\1\104\1\0\30\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\26\uffff\1\1";
    static final String DFA25_specialS =
        "\1\uffff\1\0\30\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\3\uffff\3\2\13\uffff\1\2\4\uffff\3\2\2\uffff\3\2\6\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\2\2\uffff"+
            "\6\2\1\1\1\uffff\1\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "245:25: ( (v1= variableDeclaration ',' )? v2= variableDeclaration '|' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_Iocl()) ) {s = 25;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\32\uffff";
    static final String DFA32_eofS =
        "\32\uffff";
    static final String DFA32_minS =
        "\1\12\7\uffff\1\0\4\uffff\11\0\4\uffff";
    static final String DFA32_maxS =
        "\1\104\7\uffff\1\0\4\uffff\11\0\4\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12"+
        "\1\13\11\uffff\1\15\1\7\1\14\1\16";
    static final String DFA32_specialS =
        "\10\uffff\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\4\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\3\uffff\1\4\1\5\1\1\13\uffff\1\13\4\uffff\1\26\1\1\1\25"+
            "\13\uffff\1\11\1\uffff\1\6\2\uffff\1\15\1\uffff\1\14\1\7\1\uffff"+
            "\1\12\2\uffff\1\16\1\23\1\21\1\22\1\17\1\20\1\10\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "287:1: imperativeExp : ( blockExp | breakExp | computeExp | continueExp | returnExp | variableInitExp | assignExp | raiseExp | whileExp | ifExp | tryExp | forExp | logExp | imperativeOperationCallExp );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_Iocl()) ) {s = 23;}

                        else if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_Iocl()) ) {s = 23;}

                        else if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_15 = input.LA(1);

                         
                        int index32_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_18 = input.LA(1);

                         
                        int index32_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_19 = input.LA(1);

                         
                        int index32_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_20 = input.LA(1);

                         
                        int index32_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_21 = input.LA(1);

                         
                        int index32_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Iocl()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index32_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_imperativeExp_in_oclExpression406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalExp_in_oclExpression411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp422 = new BitSet(new long[]{0x0400100000000022L});
    public static final BitSet FOLLOW_set_in_logicalExp425 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_equalityExp_in_logicalExp438 = new BitSet(new long[]{0x0400100000000022L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp451 = new BitSet(new long[]{0x0000020000800002L});
    public static final BitSet FOLLOW_set_in_equalityExp454 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_relationalExp_in_equalityExp463 = new BitSet(new long[]{0x0000020000800002L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp476 = new BitSet(new long[]{0x000000300C000002L});
    public static final BitSet FOLLOW_set_in_relationalExp479 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_additiveExp_in_relationalExp496 = new BitSet(new long[]{0x000000300C000002L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp509 = new BitSet(new long[]{0x0000404000000002L});
    public static final BitSet FOLLOW_set_in_additiveExp512 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_multiplicativeExp_in_additiveExp521 = new BitSet(new long[]{0x0000404000000002L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp534 = new BitSet(new long[]{0x0000040000020002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExp537 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_unaryExp_in_multiplicativeExp547 = new BitSet(new long[]{0x0000040000020002L});
    public static final BitSet FOLLOW_set_in_unaryExp560 = new BitSet(new long[]{0xF01001C800000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_unaryExp_in_unaryExp569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiationExp_in_unaryExp574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_unaryExp579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_instantiationExp590 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_pathName_in_instantiationExp593 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_instantiationExp595 = new BitSet(new long[]{0xF2D681CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_arguments_in_instantiationExp598 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_instantiationExp601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp613 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_dotArrowExp615 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_oclExp_in_dotArrowExp622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propertyCallExp633 = new BitSet(new long[]{0x0810000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_modelPropertyCallExp_in_propertyCallExp642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_propertyCallExp647 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_loopExp_in_propertyCallExp650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationCallExp_in_modelPropertyCallExp661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeCallExp_in_modelPropertyCallExp666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_OPERATION_in_operationCallExp677 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp679 = new BitSet(new long[]{0xF2D681CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp681 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_operationCallExp698 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_operationCallExp700 = new BitSet(new long[]{0xF2D681CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_arguments_in_operationCallExp702 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_operationCallExp705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_attributeCallExp727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_oclExp745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_oclExp751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_oclExp756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_oclExp761 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_oclExp763 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_oclExp765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleName_in_variableExp783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerationLiteralExp_in_literalExp802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralExp_in_literalExp807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLiteralExp_in_literalExp813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteralExp_in_literalExp818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionLiteralExp829 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_collectionLiteralExp831 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralExp833 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RCURLY_in_collectionLiteralExp836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_TYPE_LITERAL_in_collectionTypeIdentifier858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteralPart_in_collectionLiteralParts869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_collectionLiteralParts872 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_collectionLiteralParts875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_oclExpression_in_collectionLiteralPart888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralExp_in_primitiveLiteralExp899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteralExp_in_primitiveLiteralExp904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteralExp_in_primitiveLiteralExp909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_nullLiteralExp920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteralExp_in_numericLiteralExp931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realLiteralExp_in_numericLiteralExp936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteralExp951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_booleanLiteralExp962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integerLiteralExp973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_realLiteralExp985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp996 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_enumerationLiteralExp999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerationLiteralExp1001 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_iteratorExp_in_loopExp1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExp_in_loopExp1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATOR_NAME_in_iteratorExp1042 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_iteratorExp1044 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iteratorExp1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorExp1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_iteratorExp1064 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_iteratorExp1068 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iteratorExp1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITERATE_in_iterateExp1102 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExp1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1111 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_iterateExp1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_iterateExp1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_iterateExp1124 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_iterateExp1126 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExp1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclaration1157 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1160 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1162 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclaration1167 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_variableDeclaration1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_arguments1199 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_arguments1202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_simpleName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_LITERAL_in_primitiveType1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionTypeIdentifier_in_collectionType1243 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType1245 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_type_in_collectionType1247 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathName_in_type1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1292 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_pathName1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pathName1297 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_blockExp_in_imperativeExp1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakExp_in_imperativeExp1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computeExp_in_imperativeExp1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueExp_in_imperativeExp1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnExp_in_imperativeExp1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableInitExp_in_imperativeExp1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_imperativeExp1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raiseExp_in_imperativeExp1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExp_in_imperativeExp1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExp_in_imperativeExp1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryExp_in_imperativeExp1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_imperativeExp1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logExp_in_imperativeExp1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeOperationCallExp_in_imperativeExp1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_blockExp1399 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_blockExp1402 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_imperativeExp_in_blockExp1404 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_RCURLY_in_blockExp1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakExp1427 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_breakExp1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTE_in_computeExp1441 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_computeExp1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_computeExp1445 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_computeExp1447 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_computeExp1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueExp1470 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_continueExp1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnExp1484 = new BitSet(new long[]{0xF2F281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_logicalExp_in_returnExp1486 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnExp1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableInitExp1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_imperativeVarDeclarations_in_variableInitExp1512 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variableInitExp1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_imperativeVarDeclarations1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_imperativeVarDeclaration_in_imperativeVarDeclarations1533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_imperativeVarDeclaration1547 = new BitSet(new long[]{0x0000000100802002L});
    public static final BitSet FOLLOW_COLON_in_imperativeVarDeclaration1550 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_type_in_imperativeVarDeclaration1552 = new BitSet(new long[]{0x0000000100800002L});
    public static final BitSet FOLLOW_EQUAL_in_imperativeVarDeclaration1558 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_IS_in_imperativeVarDeclaration1562 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_logicalExp_in_imperativeVarDeclaration1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_assignExp1593 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_set_in_assignExp1595 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_logicalExp_in_assignExp1604 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignExp1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raiseExp1618 = new BitSet(new long[]{0x5000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_type_in_raiseExp1622 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_raiseExp1626 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_raiseExp1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileExp1641 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileExp1643 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_logicalExp_in_whileExp1649 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_whileExp1651 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_imperativeExp_in_whileExp1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExp1683 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_altExp_in_ifExp1685 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elifExp_in_ifExp1688 = new BitSet(new long[]{0x0000000000680002L});
    public static final BitSet FOLLOW_elseExp_in_ifExp1693 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ENDIF_in_ifExp1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elifExp1723 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_altExp_in_elifExp1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseExp1738 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_elseExp1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_altExp1754 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_logicalExp_in_altExp1760 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_altExp1762 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_imperativeExp_in_altExp1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryExp1792 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_tryExp1794 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_imperativeExp_in_tryExp1796 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_RCURLY_in_tryExp1799 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_except_in_tryExp1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_except1823 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_except1825 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_type_in_except1827 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_except1829 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LCURLY_in_except1831 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_imperativeExp_in_except1833 = new BitSet(new long[]{0xF2D381CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_RCURLY_in_except1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_forExp1859 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARROW_in_forExp1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FOR_NAME_in_forExp1863 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_forExp1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_iteratorList_in_forExp1867 = new BitSet(new long[]{0x0004000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_forExp1870 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1876 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_forExp1880 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_oclExpression_in_forExp1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iteratorList1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_iteratorList1924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LOG_in_logExp1937 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_logExp1939 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_logExp1941 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_logExp1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_logExp1946 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_logExp1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_logExp1953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_logExp1957 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_logExp1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotArrowExp_in_imperativeOperationCallExp1982 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_imperativeOperationCallExp1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imperativeExp_in_synpred1_Iocl406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExp_in_synpred20_Iocl613 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_propertyCallExp_in_synpred20_Iocl615 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_operationCallExp_in_synpred23_Iocl661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExp_in_synpred28_Iocl751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred29_Iocl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred34_Iocl872 = new BitSet(new long[]{0xF2D281CE1001C400L,0x0000000000000017L});
    public static final BitSet FOLLOW_collectionLiteralParts_in_synpred34_Iocl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred40_Iocl1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_synpred40_Iocl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred41_Iocl1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_synpred41_Iocl1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred41_Iocl1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_synpred41_Iocl1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred42_Iocl1111 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred42_Iocl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_synpred56_Iocl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExp_in_synpred61_Iocl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elifExp_in_synpred72_Iocl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseExp_in_synpred73_Iocl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_synpred74_Iocl1697 = new BitSet(new long[]{0x0000000000000002L});

}