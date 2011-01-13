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
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class IoclLexer extends Lexer {
    public static final int ITERATOR_NAME=67;
    public static final int APPEND=6;
    public static final int EXPONENT=70;
    public static final int LT=36;
    public static final int WHILE=57;
    public static final int PRIMITIVE_TYPE_LITERAL=68;
    public static final int COMPUTE=14;
    public static final int LOG=33;
    public static final int IMPERATIVE_OPERATION_CALL=29;
    public static final int GTE=27;
    public static final int OCTAL_ESC=75;
    public static final int NEW=39;
    public static final int FOR=25;
    public static final int DO=16;
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
    public static final int XOR=58;
    public static final int FOR_NAME=69;
    public static final int COLLECTION_TYPE=12;
    public static final int ATTRIBUTE_CALL=8;
    public static final int NUMERIC_OPERATION=59;
    public static final int UNICODE_ESC=74;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=73;
    public static final int LCURLY=34;
    public static final int SEMICOLON=53;
    public static final int NULL_LITERAL=61;
    public static final int MINUS=38;
    public static final int MULT=42;
    public static final int TRY=54;
    public static final int COLON=13;
    public static final int BOOLEAN_LITERAL=63;
    public static final int ALT_EXP=4;
    public static final int ITERATE=30;
    public static final int ELIF=21;
    public static final int WS=72;
    public static final int VARIABLE=56;
    public static final int INTEGER_LITERAL=64;
    public static final int BLOCK=9;
    public static final int OR=44;
    public static final int RCURLY=48;
    public static final int GT=26;
    public static final int ARROW=7;
    public static final int OPERATION_CALL=43;
    public static final int DIV=17;
    public static final int T__76=76;
    public static final int SELF=52;
    public static final int T__77=77;

    // delegates
    // delegators

    public IoclLexer() {;} 
    public IoclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IoclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:7:5: ( 'and' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:7:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "APPEND"
    public final void mAPPEND() throws RecognitionException {
        try {
            int _type = APPEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:8:8: ( '+=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:8:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPEND"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:9:7: ( '->' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:9:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:10:7: ( 'break' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:10:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:11:7: ( ':' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMPUTE"
    public final void mCOMPUTE() throws RecognitionException {
        try {
            int _type = COMPUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:12:9: ( 'compute' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:12:11: 'compute'
            {
            match("compute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPUTE"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:13:10: ( 'continue' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:13:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:14:4: ( 'do' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:14:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:15:5: ( '/' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:15:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:16:5: ( '.' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:16:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:17:7: ( 'endif' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:17:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:18:6: ( 'elif' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:18:8: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:19:6: ( 'else' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:19:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:20:7: ( '=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:21:8: ( 'except' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:21:10: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:22:5: ( 'for' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:22:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:23:4: ( '>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:23:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:24:5: ( '>=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:24:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:25:4: ( 'if' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:25:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ITERATE"
    public final void mITERATE() throws RecognitionException {
        try {
            int _type = ITERATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:26:9: ( 'iterate' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:26:11: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ITERATE"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:27:4: ( ':=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:27:6: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LOG"
    public final void mLOG() throws RecognitionException {
        try {
            int _type = LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:28:5: ( 'log' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:28:7: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOG"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:29:8: ( '{' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:29:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:30:8: ( '(' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:30:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:31:4: ( '<' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:31:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:32:5: ( '<=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:32:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:33:7: ( '-' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:33:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:34:5: ( 'new' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:34:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:35:5: ( 'not' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:35:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:36:11: ( '<>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:36:13: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:37:6: ( '*' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:37:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:38:4: ( 'or' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:38:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:39:6: ( '+' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:39:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:40:7: ( 'raise' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:40:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:41:8: ( '}' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:41:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:42:8: ( 'return' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:42:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:43:8: ( ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:43:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SCOPE"
    public final void mSCOPE() throws RecognitionException {
        try {
            int _type = SCOPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:44:7: ( '::' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:44:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCOPE"

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:45:6: ( 'self' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:45:8: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:46:11: ( ';' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:46:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:47:5: ( 'try' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:47:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:48:5: ( 'var' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:48:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:49:7: ( 'while' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:49:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:50:5: ( 'xor' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:50:7: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:51:7: ( ',' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:51:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:52:7: ( '|' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:52:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:391:2: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:391:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:392:4: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN_LITERAL"

    // $ANTLR start "COLLECTION_TYPE_LITERAL"
    public final void mCOLLECTION_TYPE_LITERAL() throws RecognitionException {
        try {
            int _type = COLLECTION_TYPE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:396:2: ( 'Bag' | 'Collection' | 'OrderedSet' | 'Sequence' | 'Set' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'B':
                {
                alt2=1;
                }
                break;
            case 'C':
                {
                alt2=2;
                }
                break;
            case 'O':
                {
                alt2=3;
                }
                break;
            case 'S':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='e') ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5=='q') ) {
                        alt2=4;
                    }
                    else if ( (LA2_5=='t') ) {
                        alt2=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:396:4: 'Bag'
                    {
                    match("Bag"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:397:4: 'Collection'
                    {
                    match("Collection"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:398:4: 'OrderedSet'
                    {
                    match("OrderedSet"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:399:4: 'Sequence'
                    {
                    match("Sequence"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:400:4: 'Set'
                    {
                    match("Set"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECTION_TYPE_LITERAL"

    // $ANTLR start "PRIMITIVE_TYPE_LITERAL"
    public final void mPRIMITIVE_TYPE_LITERAL() throws RecognitionException {
        try {
            int _type = PRIMITIVE_TYPE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:404:2: ( 'Integer' | 'String' | 'Real' | 'Boolean' | 'OclAny' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'I':
                {
                alt3=1;
                }
                break;
            case 'S':
                {
                alt3=2;
                }
                break;
            case 'R':
                {
                alt3=3;
                }
                break;
            case 'B':
                {
                alt3=4;
                }
                break;
            case 'O':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:404:4: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:405:4: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:406:4: 'Real'
                    {
                    match("Real"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:407:4: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:408:4: 'OclAny'
                    {
                    match("OclAny"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMITIVE_TYPE_LITERAL"

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:412:2: ( ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:412:4: ( '0' .. '9' )+
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:412:4: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:412:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_LITERAL"

    // $ANTLR start "REAL_LITERAL"
    public final void mREAL_LITERAL() throws RecognitionException {
        try {
            int _type = REAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:4: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:20: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:32: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:416:32: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:417:4: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:417:8: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:417:9: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:417:20: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:417:20: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:418:4: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:418:4: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:418:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:422:2: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:422:4: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:422:9: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    alt12=1;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:422:11: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:422:21: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "NULL_LITERAL"
    public final void mNULL_LITERAL() throws RecognitionException {
        try {
            int _type = NULL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:426:2: ( 'null' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:426:4: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL_LITERAL"

    // $ANTLR start "ITERATOR_NAME"
    public final void mITERATOR_NAME() throws RecognitionException {
        try {
            int _type = ITERATOR_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:430:2: ( 'any' | 'closure' | 'collect' | 'collectNested' | 'exists' | 'forAll' | 'isUnique' | 'one' | 'select' | 'sortedBy' | 'reject' )
            int alt13=11;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:430:4: 'any'
                    {
                    match("any"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:431:4: 'closure'
                    {
                    match("closure"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:432:4: 'collect'
                    {
                    match("collect"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:433:4: 'collectNested'
                    {
                    match("collectNested"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:434:4: 'exists'
                    {
                    match("exists"); 


                    }
                    break;
                case 6 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:435:4: 'forAll'
                    {
                    match("forAll"); 


                    }
                    break;
                case 7 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:436:4: 'isUnique'
                    {
                    match("isUnique"); 


                    }
                    break;
                case 8 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:437:4: 'one'
                    {
                    match("one"); 


                    }
                    break;
                case 9 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:438:4: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 10 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:439:4: 'sortedBy'
                    {
                    match("sortedBy"); 


                    }
                    break;
                case 11 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:440:4: 'reject'
                    {
                    match("reject"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ITERATOR_NAME"

    // $ANTLR start "FOR_NAME"
    public final void mFOR_NAME() throws RecognitionException {
        try {
            int _type = FOR_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:444:2: ( 'forEach' | 'forOne' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='f') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='o') ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2=='r') ) {
                        int LA14_3 = input.LA(4);

                        if ( (LA14_3=='E') ) {
                            alt14=1;
                        }
                        else if ( (LA14_3=='O') ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:444:4: 'forEach'
                    {
                    match("forEach"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:445:4: 'forOne'
                    {
                    match("forOne"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR_NAME"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:449:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:449:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:449:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NUMERIC_OPERATION"
    public final void mNUMERIC_OPERATION() throws RecognitionException {
        try {
            int _type = NUMERIC_OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:453:2: ( INTEGER_LITERAL '.' IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:453:4: INTEGER_LITERAL '.' IDENTIFIER
            {
            mINTEGER_LITERAL(); 
            match('.'); 
            mIDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERIC_OPERATION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:457:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:457:4: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:466:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:466:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:466:14: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:466:25: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:466:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:471:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:471:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:475:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:475:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:476:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:477:4: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_5 = input.LA(4);

                        if ( ((LA19_5>='0' && LA19_5<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:9: ( '0' .. '3' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:10: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:31: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:482:32: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:483:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:483:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:483:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:483:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:483:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:484:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:484:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:484:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:489:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:489:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:8: ( AND | APPEND | ARROW | BREAK | COLON | COMPUTE | CONTINUE | DO | DIV | DOT | ENDIF | ELIF | ELSE | EQUAL | EXCEPT | FOR | GT | GTE | IF | ITERATE | IS | LOG | LCURLY | LPAREN | LT | LTE | MINUS | NEW | NOT | NOT_EQUAL | MULT | OR | PLUS | RAISE | RCURLY | RETURN | RPAREN | SCOPE | SELF | SEMICOLON | TRY | VAR | WHILE | XOR | T__76 | T__77 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | PRIMITIVE_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | NULL_LITERAL | ITERATOR_NAME | FOR_NAME | IDENTIFIER | NUMERIC_OPERATION | WS )
        int alt20=58;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:10: AND
                {
                mAND(); 

                }
                break;
            case 2 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:14: APPEND
                {
                mAPPEND(); 

                }
                break;
            case 3 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:21: ARROW
                {
                mARROW(); 

                }
                break;
            case 4 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:27: BREAK
                {
                mBREAK(); 

                }
                break;
            case 5 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:33: COLON
                {
                mCOLON(); 

                }
                break;
            case 6 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:39: COMPUTE
                {
                mCOMPUTE(); 

                }
                break;
            case 7 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:47: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 8 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:56: DO
                {
                mDO(); 

                }
                break;
            case 9 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:59: DIV
                {
                mDIV(); 

                }
                break;
            case 10 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:63: DOT
                {
                mDOT(); 

                }
                break;
            case 11 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:67: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 12 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:73: ELIF
                {
                mELIF(); 

                }
                break;
            case 13 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:78: ELSE
                {
                mELSE(); 

                }
                break;
            case 14 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:83: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 15 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:89: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 16 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:96: FOR
                {
                mFOR(); 

                }
                break;
            case 17 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:100: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:103: GTE
                {
                mGTE(); 

                }
                break;
            case 19 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:107: IF
                {
                mIF(); 

                }
                break;
            case 20 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:110: ITERATE
                {
                mITERATE(); 

                }
                break;
            case 21 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:118: IS
                {
                mIS(); 

                }
                break;
            case 22 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:121: LOG
                {
                mLOG(); 

                }
                break;
            case 23 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:125: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 24 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:132: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 25 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:139: LT
                {
                mLT(); 

                }
                break;
            case 26 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:142: LTE
                {
                mLTE(); 

                }
                break;
            case 27 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:146: MINUS
                {
                mMINUS(); 

                }
                break;
            case 28 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:152: NEW
                {
                mNEW(); 

                }
                break;
            case 29 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:156: NOT
                {
                mNOT(); 

                }
                break;
            case 30 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:160: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 31 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:170: MULT
                {
                mMULT(); 

                }
                break;
            case 32 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:175: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:178: PLUS
                {
                mPLUS(); 

                }
                break;
            case 34 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:183: RAISE
                {
                mRAISE(); 

                }
                break;
            case 35 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:189: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 36 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:196: RETURN
                {
                mRETURN(); 

                }
                break;
            case 37 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:203: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 38 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:210: SCOPE
                {
                mSCOPE(); 

                }
                break;
            case 39 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:216: SELF
                {
                mSELF(); 

                }
                break;
            case 40 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:221: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 41 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:231: TRY
                {
                mTRY(); 

                }
                break;
            case 42 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:235: VAR
                {
                mVAR(); 

                }
                break;
            case 43 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:239: WHILE
                {
                mWHILE(); 

                }
                break;
            case 44 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:245: XOR
                {
                mXOR(); 

                }
                break;
            case 45 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:249: T__76
                {
                mT__76(); 

                }
                break;
            case 46 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:255: T__77
                {
                mT__77(); 

                }
                break;
            case 47 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:261: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 

                }
                break;
            case 48 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:277: COLLECTION_TYPE_LITERAL
                {
                mCOLLECTION_TYPE_LITERAL(); 

                }
                break;
            case 49 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:301: PRIMITIVE_TYPE_LITERAL
                {
                mPRIMITIVE_TYPE_LITERAL(); 

                }
                break;
            case 50 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:324: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 51 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:340: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 52 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:353: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 53 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:368: NULL_LITERAL
                {
                mNULL_LITERAL(); 

                }
                break;
            case 54 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:381: ITERATOR_NAME
                {
                mITERATOR_NAME(); 

                }
                break;
            case 55 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:395: FOR_NAME
                {
                mFOR_NAME(); 

                }
                break;
            case 56 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:404: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 57 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:415: NUMERIC_OPERATION
                {
                mNUMERIC_OPERATION(); 

                }
                break;
            case 58 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/imperative-ocl/ioclengine/src/org/orcas/ioclengine/parser/antlr/Iocl.g:1:433: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "415:1: REAL_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA13_eotS =
        "\21\uffff\1\23\2\uffff";
    static final String DFA13_eofS =
        "\24\uffff";
    static final String DFA13_minS =
        "\1\141\1\uffff\1\154\4\uffff\1\145\2\uffff\1\154\2\uffff\1\154\1"+
        "\145\1\143\1\164\1\116\2\uffff";
    static final String DFA13_maxS =
        "\1\163\1\uffff\1\157\4\uffff\1\157\2\uffff\1\154\2\uffff\1\154\1"+
        "\145\1\143\1\164\1\116\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\5\1\6\1\7\1\10\1\uffff\1\13\1\2\1\uffff\1"+
        "\11\1\12\5\uffff\1\4\1\3";
    static final String DFA13_specialS =
        "\24\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\2\uffff\1\5\5\uffff\1\6\2\uffff"+
            "\1\10\1\7",
            "",
            "\1\11\2\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\13\11\uffff\1\14",
            "",
            "",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "429:1: ITERATOR_NAME : ( 'any' | 'closure' | 'collect' | 'collectNested' | 'exists' | 'forAll' | 'isUnique' | 'one' | 'select' | 'sortedBy' | 'reject' );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\51\1\55\1\57\1\51\1\63\2\51\1\uffff\1\67\1\51\1\uffff"+
        "\1\51\1\77\2\51\2\uffff\1\106\1\51\1\uffff\2\51\2\uffff\1\51\1\uffff"+
        "\4\51\2\uffff\6\51\1\135\3\uffff\1\51\4\uffff\1\51\3\uffff\2\51"+
        "\1\146\2\uffff\5\51\2\uffff\1\156\3\51\3\uffff\3\51\1\165\22\51"+
        "\2\uffff\1\u008c\1\u008d\5\51\1\uffff\5\51\1\u009b\1\51\1\uffff"+
        "\2\51\1\u009f\1\u00a0\1\u00a1\1\51\1\uffff\1\u008d\5\51\1\u00a9"+
        "\1\51\1\u00ab\1\51\1\u00ad\1\u00ae\5\51\1\u00ae\3\51\3\uffff\6\51"+
        "\1\u00bd\1\u00be\5\51\1\uffff\3\51\3\uffff\1\u00c7\3\51\1\u00cb"+
        "\2\51\1\uffff\1\u00ce\1\uffff\1\51\2\uffff\7\51\1\u00d7\1\u00d8"+
        "\4\51\1\u00dd\2\uffff\5\51\1\u00ce\2\51\1\uffff\1\u00e5\2\51\1\uffff"+
        "\2\51\1\uffff\1\u00ea\7\51\2\uffff\4\51\1\uffff\1\u00f6\2\u008d"+
        "\1\51\1\u00f8\2\51\1\uffff\1\u00fb\2\u008d\1\51\1\uffff\3\51\1\u00d7"+
        "\1\51\1\u00d7\1\51\1\u0102\1\51\2\u008d\1\uffff\1\u00f8\1\uffff"+
        "\1\u0105\1\51\1\uffff\1\51\1\u00d7\3\51\1\u00d7\1\uffff\1\u010b"+
        "\1\51\1\uffff\2\u008d\2\51\1\u00ae\1\uffff\4\51\2\u00ae\2\51\1\u008d";
    static final String DFA20_eofS =
        "\u0115\uffff";
    static final String DFA20_minS =
        "\1\11\1\156\1\75\1\76\1\162\1\72\1\154\1\157\1\uffff\1\60\1\154"+
        "\1\uffff\1\141\1\75\1\146\1\157\2\uffff\1\75\1\145\1\uffff\1\156"+
        "\1\141\2\uffff\1\145\1\uffff\1\162\1\141\1\150\1\157\2\uffff\1\141"+
        "\1\157\1\143\1\145\1\156\1\145\1\56\3\uffff\1\144\4\uffff\1\145"+
        "\3\uffff\1\154\1\157\1\60\2\uffff\1\144\1\151\1\143\1\162\1\154"+
        "\2\uffff\1\60\1\145\1\125\1\147\3\uffff\1\167\1\164\1\154\1\60\1"+
        "\145\1\151\1\152\1\154\1\162\1\165\1\162\1\151\1\162\1\147\1\157"+
        "\1\154\1\144\1\154\1\161\1\162\1\164\1\141\1\uffff\3\60\1\141\1"+
        "\160\1\164\1\154\1\163\1\uffff\1\151\1\146\2\145\1\163\1\60\1\163"+
        "\1\uffff\1\162\1\156\3\60\1\154\1\uffff\1\60\1\163\1\165\2\145\1"+
        "\164\1\60\1\145\1\60\1\154\2\60\2\154\1\145\1\101\1\165\1\60\1\151"+
        "\1\145\1\154\3\uffff\1\153\1\165\1\151\1\145\1\165\1\146\2\60\1"+
        "\160\1\164\1\154\1\141\1\156\1\uffff\1\145\1\141\1\151\3\uffff\1"+
        "\60\1\145\1\162\1\143\1\60\1\143\1\145\1\uffff\1\60\1\uffff\1\145"+
        "\2\uffff\2\145\1\162\1\156\1\145\1\156\1\147\2\60\1\164\1\156\1"+
        "\143\1\162\1\60\2\uffff\1\164\1\163\1\154\1\143\1\145\1\60\1\164"+
        "\1\161\1\uffff\1\60\1\156\1\164\1\uffff\1\164\1\144\1\uffff\1\60"+
        "\1\141\1\143\1\145\1\171\1\156\1\147\1\145\2\uffff\1\145\1\165\1"+
        "\164\1\145\1\uffff\3\60\1\150\1\60\1\145\1\165\1\uffff\3\60\1\102"+
        "\1\uffff\1\156\1\164\1\144\1\60\1\143\1\60\1\162\1\60\1\145\2\60"+
        "\1\uffff\1\60\1\uffff\1\60\1\145\1\uffff\1\171\1\60\1\151\1\123"+
        "\1\145\1\60\1\uffff\1\60\1\145\1\uffff\2\60\1\157\1\145\1\60\1\uffff"+
        "\1\163\1\156\2\164\2\60\1\145\1\144\1\60";
    static final String DFA20_maxS =
        "\1\175\1\156\1\75\1\76\1\162\1\75\2\157\1\uffff\1\71\1\170\1\uffff"+
        "\1\157\1\75\1\164\1\157\2\uffff\1\76\1\165\1\uffff\1\162\1\145\2"+
        "\uffff\1\157\1\uffff\1\162\1\141\1\150\1\157\2\uffff\2\157\1\162"+
        "\1\164\1\156\2\145\3\uffff\1\171\4\uffff\1\145\3\uffff\1\156\1\157"+
        "\1\172\2\uffff\1\144\1\163\1\151\1\162\1\154\2\uffff\1\172\1\145"+
        "\1\125\1\147\3\uffff\1\167\1\164\1\154\1\172\1\145\1\151\1\164\1"+
        "\154\1\162\1\171\1\162\1\151\1\162\1\147\1\157\1\154\1\144\1\154"+
        "\1\164\1\162\1\164\1\141\1\uffff\3\172\1\141\1\160\1\164\1\154\1"+
        "\163\1\uffff\1\151\1\146\2\145\1\163\1\172\1\163\1\uffff\1\162\1"+
        "\156\3\172\1\154\1\uffff\1\172\1\163\1\165\1\145\1\146\1\164\1\172"+
        "\1\145\1\172\1\154\2\172\2\154\1\145\1\101\1\165\1\172\1\151\1\145"+
        "\1\154\3\uffff\1\153\1\165\1\151\1\145\1\165\1\146\2\172\1\160\1"+
        "\164\1\154\1\141\1\156\1\uffff\1\145\1\141\1\151\3\uffff\1\172\1"+
        "\145\1\162\1\143\1\172\1\143\1\145\1\uffff\1\172\1\uffff\1\145\2"+
        "\uffff\2\145\1\162\1\156\1\145\1\156\1\147\2\172\1\164\1\156\1\143"+
        "\1\162\1\172\2\uffff\1\164\1\163\1\154\1\143\1\145\1\172\1\164\1"+
        "\161\1\uffff\1\172\1\156\1\164\1\uffff\1\164\1\144\1\uffff\1\172"+
        "\1\141\1\143\1\145\1\171\1\156\1\147\1\145\2\uffff\1\145\1\165\1"+
        "\164\1\145\1\uffff\3\172\1\150\1\172\1\145\1\165\1\uffff\3\172\1"+
        "\102\1\uffff\1\156\1\164\1\144\1\172\1\143\1\172\1\162\1\172\1\145"+
        "\2\172\1\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\171\1\172\1\151"+
        "\1\123\1\145\1\172\1\uffff\1\172\1\145\1\uffff\2\172\1\157\1\145"+
        "\1\172\1\uffff\1\163\1\156\2\164\2\172\1\145\1\144\1\172";
    static final String DFA20_acceptS =
        "\10\uffff\1\11\2\uffff\1\16\4\uffff\1\27\1\30\2\uffff\1\37\2\uffff"+
        "\1\43\1\45\1\uffff\1\50\4\uffff\1\55\1\56\7\uffff\1\64\1\70\1\72"+
        "\1\uffff\1\2\1\41\1\3\1\33\1\uffff\1\25\1\46\1\5\3\uffff\1\12\1"+
        "\63\5\uffff\1\22\1\21\4\uffff\1\32\1\36\1\31\26\uffff\1\62\10\uffff"+
        "\1\10\7\uffff\1\23\6\uffff\1\40\25\uffff\1\71\1\1\1\66\15\uffff"+
        "\1\20\3\uffff\1\26\1\34\1\35\7\uffff\1\51\1\uffff\1\52\1\uffff\1"+
        "\54\1\60\16\uffff\1\14\1\15\10\uffff\1\65\3\uffff\1\47\2\uffff\1"+
        "\57\10\uffff\1\61\1\4\4\uffff\1\13\7\uffff\1\42\4\uffff\1\53\13"+
        "\uffff\1\17\1\uffff\1\67\2\uffff\1\44\6\uffff\1\6\2\uffff\1\24\5"+
        "\uffff\1\7\11\uffff";
    static final String DFA20_specialS =
        "\u0115\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\6\uffff\1\50\1\21\1\30\1\24"+
            "\1\2\1\37\1\3\1\11\1\10\12\47\1\5\1\32\1\22\1\13\1\15\2\uffff"+
            "\1\51\1\41\1\42\5\51\1\45\5\51\1\43\2\51\1\46\1\44\7\51\4\uffff"+
            "\1\51\1\uffff\1\1\1\4\1\6\1\7\1\12\1\14\2\51\1\16\2\51\1\17"+
            "\1\51\1\23\1\25\2\51\1\26\1\31\1\33\1\51\1\34\1\35\1\36\2\51"+
            "\1\20\1\40\1\27",
            "\1\53",
            "\1\54",
            "\1\56",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "\1\65\2\uffff\1\64",
            "\1\66",
            "",
            "\12\70",
            "\1\72\1\uffff\1\71\11\uffff\1\73",
            "",
            "\1\75\15\uffff\1\74",
            "\1\76",
            "\1\100\14\uffff\1\102\1\101",
            "\1\103",
            "",
            "",
            "\1\104\1\105",
            "\1\107\11\uffff\1\110\5\uffff\1\111",
            "",
            "\1\113\3\uffff\1\112",
            "\1\114\3\uffff\1\115",
            "",
            "",
            "\1\116\11\uffff\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124\15\uffff\1\125",
            "\1\126",
            "\1\130\16\uffff\1\127",
            "\1\131\16\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\136\1\uffff\12\47\13\uffff\1\70\37\uffff\1\70",
            "",
            "",
            "",
            "\1\137\24\uffff\1\140",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "\1\144\1\142\1\143",
            "\1\145",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\147",
            "\1\150\11\uffff\1\151",
            "\1\152\5\uffff\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\166",
            "\1\167",
            "\1\171\11\uffff\1\170",
            "\1\172",
            "\1\173",
            "\1\175\3\uffff\1\174",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\2\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\70\7\uffff\32\u008b\4\uffff\1\u008b\1\uffff\32\u008b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\51\7\uffff\1\u0098\3\51\1\u0099\11\51\1\u009a\13\51\4\uffff"+
            "\1\51\1\uffff\32\51",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a2",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\1\u00a6",
            "\1\u00a8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00aa",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ac",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0100",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0101",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0103",
            "\12\51\7\uffff\15\51\1\u0104\14\51\4\uffff\1\51\1\uffff\32"+
            "\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0106",
            "",
            "\1\u0107",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010c",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010d",
            "\1\u010e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0113",
            "\1\u0114",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | APPEND | ARROW | BREAK | COLON | COMPUTE | CONTINUE | DO | DIV | DOT | ENDIF | ELIF | ELSE | EQUAL | EXCEPT | FOR | GT | GTE | IF | ITERATE | IS | LOG | LCURLY | LPAREN | LT | LTE | MINUS | NEW | NOT | NOT_EQUAL | MULT | OR | PLUS | RAISE | RCURLY | RETURN | RPAREN | SCOPE | SELF | SEMICOLON | TRY | VAR | WHILE | XOR | T__76 | T__77 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | PRIMITIVE_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | NULL_LITERAL | ITERATOR_NAME | FOR_NAME | IDENTIFIER | NUMERIC_OPERATION | WS );";
        }
    }
 

}