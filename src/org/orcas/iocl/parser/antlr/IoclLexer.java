// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-05-23 18:28:11

package org.orcas.iocl.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IoclLexer extends Lexer {
    public static final int EXPONENT=44;
    public static final int LT=20;
    public static final int PRIMITIVE_TYPE_LITERAL=42;
    public static final int GTE=18;
    public static final int COLLECTION_LITERAL_PARTS=10;
    public static final int OCTAL_ESC=49;
    public static final int DO=13;
    public static final int NOT=23;
    public static final int AND=4;
    public static final int EOF=-1;
    public static final int LTE=21;
    public static final int BREAK=6;
    public static final int STRING_LITERAL=38;
    public static final int ESC_SEQ=45;
    public static final int REAL_LITERAL=41;
    public static final int COLLECTION_TYPE_LITERAL=37;
    public static final int CONTINUE=12;
    public static final int NOT_EQUAL=24;
    public static final int IS=19;
    public static final int IDENTIFIER=43;
    public static final int EQUAL=16;
    public static final int RETURN=30;
    public static final int PLUS=29;
    public static final int VAR=34;
    public static final int DOT=15;
    public static final int T__50=50;
    public static final int OPEN_CURLY_BRACE=25;
    public static final int CLOSE_CURLY_BRACE=7;
    public static final int COLLECTION_LITERAL=9;
    public static final int XOR=35;
    public static final int UNICODE_ESC=48;
    public static final int TYPE_SPECIFICATION=33;
    public static final int NUMERIC_OPERATION=36;
    public static final int HEX_DIGIT=47;
    public static final int SEMICOLON=32;
    public static final int MINUS=22;
    public static final int MULT=27;
    public static final int CLOSE_PARENTHESIS=8;
    public static final int COLON=11;
    public static final int BOOLEAN_LITERAL=39;
    public static final int WS=46;
    public static final int INTEGER_LITERAL=40;
    public static final int OR=28;
    public static final int ARROW=5;
    public static final int GT=17;
    public static final int DIV=14;
    public static final int SELF=31;
    public static final int OPEN_PARENTHESIS=26;

    // delegates
    // delegators

    public IoclLexer() {;} 
    public IoclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IoclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:7:5: ( 'and' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:7:7: 'and'
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

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:8:7: ( '->' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:8:9: '->'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:9:7: ( 'break' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:9:9: 'break'
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

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:10:19: ( '}' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:10:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "CLOSE_PARENTHESIS"
    public final void mCLOSE_PARENTHESIS() throws RecognitionException {
        try {
            int _type = CLOSE_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:11:19: ( ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:11:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_PARENTHESIS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:12:7: ( ':' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:12:9: ':'
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

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:13:10: ( 'continue' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:13:12: 'continue'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:14:4: ( 'do' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:14:6: 'do'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:15:5: ( '/' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:15:7: '/'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:16:5: ( '.' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:16:7: '.'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:17:7: ( '=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:17:9: '='
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

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:18:4: ( '>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:18:6: '>'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:19:5: ( '>=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:19:7: '>='
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

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:20:4: ( ':=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:20:6: ':='
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

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:21:4: ( '<' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:21:6: '<'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:22:5: ( '<=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:22:7: '<='
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:23:7: ( '-' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:23:9: '-'
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:24:5: ( 'not' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:24:7: 'not'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:25:11: ( '<>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:25:13: '<>'
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

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:26:18: ( '{' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:26:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "OPEN_PARENTHESIS"
    public final void mOPEN_PARENTHESIS() throws RecognitionException {
        try {
            int _type = OPEN_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:27:18: ( '(' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:27:20: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_PARENTHESIS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:28:6: ( '*' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:28:8: '*'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:29:4: ( 'or' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:29:6: 'or'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:30:6: ( '+' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:30:8: '+'
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

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:31:8: ( 'return' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:31:10: 'return'
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

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:32:6: ( 'self' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:32:8: 'self'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:33:11: ( ';' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:33:13: ';'
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

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:34:5: ( 'var' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:34:7: 'var'
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

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:35:5: ( 'xor' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:35:7: 'xor'
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

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:36:7: ( ',' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:2: ( 'true' | 'false' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:199:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:200:4: 'false'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:204:2: ( 'Bag' | 'Collection' | 'OrderedSet' | 'Sequence' | 'Set' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:204:4: 'Bag'
                    {
                    match("Bag"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:205:4: 'Collection'
                    {
                    match("Collection"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:4: 'OrderedSet'
                    {
                    match("OrderedSet"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:4: 'Sequence'
                    {
                    match("Sequence"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:208:4: 'Set'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:2: ( 'Integer' | 'String' | 'Real' | 'Boolean' | 'OclAny' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:212:4: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:4: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:4: 'Real'
                    {
                    match("Real"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:4: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:216:4: 'OclAny'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:2: ( ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:4: ( '0' .. '9' )+
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:4: ( '0' .. '9' )+
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
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:4: '0' .. '9'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:4: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:5: '0' .. '9'
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:20: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:21: '0' .. '9'
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

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:32: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:224:32: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:4: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:8: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:9: '0' .. '9'
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

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:20: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:225:20: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:4: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:4: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:226:5: '0' .. '9'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:2: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:4: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:9: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
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
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:11: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:230:21: ~ ( '\\\\' | '\\'' )
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:234:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:
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
            	    break loop13;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:2: ( INTEGER_LITERAL '.' IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:238:4: INTEGER_LITERAL '.' IDENTIFIER
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:242:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:14: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:
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

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:25: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:251:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:256:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:256:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:260:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
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
                    alt16=1;
                    }
                    break;
                case 'u':
                    {
                    alt16=2;
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
                    alt16=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:260:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:261:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:262:4: OCTAL_ESC
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>='0' && LA17_1<='3')) ) {
                    int LA17_2 = input.LA(3);

                    if ( ((LA17_2>='0' && LA17_2<='7')) ) {
                        int LA17_4 = input.LA(4);

                        if ( ((LA17_4>='0' && LA17_4<='7')) ) {
                            alt17=1;
                        }
                        else {
                            alt17=2;}
                    }
                    else {
                        alt17=3;}
                }
                else if ( ((LA17_1>='4' && LA17_1<='7')) ) {
                    int LA17_3 = input.LA(3);

                    if ( ((LA17_3>='0' && LA17_3<='7')) ) {
                        alt17=2;
                    }
                    else {
                        alt17=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:9: ( '0' .. '3' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:10: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:31: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:267:32: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:268:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:269:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:269:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:269:10: '0' .. '7'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:274:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:8: ( AND | ARROW | BREAK | CLOSE_CURLY_BRACE | CLOSE_PARENTHESIS | COLON | CONTINUE | DO | DIV | DOT | EQUAL | GT | GTE | IS | LT | LTE | MINUS | NOT | NOT_EQUAL | OPEN_CURLY_BRACE | OPEN_PARENTHESIS | MULT | OR | PLUS | RETURN | SELF | SEMICOLON | VAR | XOR | T__50 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | PRIMITIVE_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | NUMERIC_OPERATION | WS )
        int alt18=39;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:10: AND
                {
                mAND(); 

                }
                break;
            case 2 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:14: ARROW
                {
                mARROW(); 

                }
                break;
            case 3 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:20: BREAK
                {
                mBREAK(); 

                }
                break;
            case 4 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:26: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); 

                }
                break;
            case 5 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:44: CLOSE_PARENTHESIS
                {
                mCLOSE_PARENTHESIS(); 

                }
                break;
            case 6 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:62: COLON
                {
                mCOLON(); 

                }
                break;
            case 7 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:68: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 8 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:77: DO
                {
                mDO(); 

                }
                break;
            case 9 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:80: DIV
                {
                mDIV(); 

                }
                break;
            case 10 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:84: DOT
                {
                mDOT(); 

                }
                break;
            case 11 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:88: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 12 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:94: GT
                {
                mGT(); 

                }
                break;
            case 13 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:97: GTE
                {
                mGTE(); 

                }
                break;
            case 14 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:101: IS
                {
                mIS(); 

                }
                break;
            case 15 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:104: LT
                {
                mLT(); 

                }
                break;
            case 16 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:107: LTE
                {
                mLTE(); 

                }
                break;
            case 17 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:111: MINUS
                {
                mMINUS(); 

                }
                break;
            case 18 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:117: NOT
                {
                mNOT(); 

                }
                break;
            case 19 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:121: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 20 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:131: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); 

                }
                break;
            case 21 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:148: OPEN_PARENTHESIS
                {
                mOPEN_PARENTHESIS(); 

                }
                break;
            case 22 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:165: MULT
                {
                mMULT(); 

                }
                break;
            case 23 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:170: OR
                {
                mOR(); 

                }
                break;
            case 24 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:173: PLUS
                {
                mPLUS(); 

                }
                break;
            case 25 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:178: RETURN
                {
                mRETURN(); 

                }
                break;
            case 26 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:185: SELF
                {
                mSELF(); 

                }
                break;
            case 27 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:190: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 28 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:200: VAR
                {
                mVAR(); 

                }
                break;
            case 29 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:204: XOR
                {
                mXOR(); 

                }
                break;
            case 30 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:214: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 

                }
                break;
            case 32 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:230: COLLECTION_TYPE_LITERAL
                {
                mCOLLECTION_TYPE_LITERAL(); 

                }
                break;
            case 33 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:254: PRIMITIVE_TYPE_LITERAL
                {
                mPRIMITIVE_TYPE_LITERAL(); 

                }
                break;
            case 34 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:277: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 35 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:293: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 36 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:306: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 37 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:321: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 38 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:332: NUMERIC_OPERATION
                {
                mNUMERIC_OPERATION(); 

                }
                break;
            case 39 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:350: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
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
            return "223:1: REAL_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\44\1\50\1\44\2\uffff\1\53\2\44\1\uffff\1\57\1\uffff\1"+
        "\61\1\64\1\44\3\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\uffff\10"+
        "\44\1\106\3\uffff\1\44\2\uffff\1\44\2\uffff\1\44\1\113\7\uffff\1"+
        "\44\1\115\17\44\2\uffff\1\137\2\44\1\uffff\1\142\1\uffff\2\44\1"+
        "\145\1\146\2\44\1\151\5\44\1\151\3\44\2\uffff\2\44\1\uffff\1\44"+
        "\1\165\2\uffff\1\166\1\44\1\uffff\7\44\1\177\1\u0080\2\44\2\uffff"+
        "\1\166\7\44\2\uffff\1\44\1\u008b\3\44\1\177\1\44\1\177\2\44\1\uffff"+
        "\1\177\3\44\1\177\1\u0095\2\44\1\151\1\uffff\2\44\2\151";
    static final String DFA18_eofS =
        "\u009a\uffff";
    static final String DFA18_minS =
        "\1\11\1\156\1\76\1\162\2\uffff\1\75\2\157\1\uffff\1\60\1\uffff\2"+
        "\75\1\157\3\uffff\1\162\1\uffff\2\145\1\uffff\1\141\1\157\1\uffff"+
        "\1\162\2\141\1\157\1\143\1\145\1\156\1\145\1\56\3\uffff\1\144\2"+
        "\uffff\1\145\2\uffff\1\156\1\60\7\uffff\1\164\1\60\1\164\1\154\2"+
        "\162\1\165\1\154\1\147\1\157\1\154\1\144\1\154\1\161\1\162\1\164"+
        "\1\141\1\uffff\2\60\1\141\1\164\1\uffff\1\60\1\uffff\1\165\1\146"+
        "\2\60\1\145\1\163\1\60\2\154\1\145\1\101\1\165\1\60\1\151\1\145"+
        "\1\154\2\uffff\1\153\1\151\1\uffff\1\162\1\60\2\uffff\1\60\1\145"+
        "\1\uffff\2\145\1\162\1\156\1\145\1\156\1\147\2\60\2\156\2\uffff"+
        "\1\60\1\141\1\143\1\145\1\171\1\156\1\147\1\145\2\uffff\1\165\1"+
        "\60\1\156\1\164\1\144\1\60\1\143\1\60\1\162\1\145\1\uffff\1\60\1"+
        "\151\1\123\1\145\2\60\1\157\1\145\1\60\1\uffff\1\156\1\164\2\60";
    static final String DFA18_maxS =
        "\1\175\1\156\1\76\1\162\2\uffff\1\75\2\157\1\uffff\1\71\1\uffff"+
        "\1\75\1\76\1\157\3\uffff\1\162\1\uffff\2\145\1\uffff\1\141\1\157"+
        "\1\uffff\1\162\1\141\2\157\1\162\1\164\1\156\2\145\3\uffff\1\144"+
        "\2\uffff\1\145\2\uffff\1\156\1\172\7\uffff\1\164\1\172\1\164\1\154"+
        "\2\162\1\165\1\154\1\147\1\157\1\154\1\144\1\154\1\164\1\162\1\164"+
        "\1\141\1\uffff\2\172\1\141\1\164\1\uffff\1\172\1\uffff\1\165\1\146"+
        "\2\172\1\145\1\163\1\172\2\154\1\145\1\101\1\165\1\172\1\151\1\145"+
        "\1\154\2\uffff\1\153\1\151\1\uffff\1\162\1\172\2\uffff\1\172\1\145"+
        "\1\uffff\2\145\1\162\1\156\1\145\1\156\1\147\2\172\2\156\2\uffff"+
        "\1\172\1\141\1\143\1\145\1\171\1\156\1\147\1\145\2\uffff\1\165\1"+
        "\172\1\156\1\164\1\144\1\172\1\143\1\172\1\162\1\145\1\uffff\1\172"+
        "\1\151\1\123\1\145\2\172\1\157\1\145\1\172\1\uffff\1\156\1\164\2"+
        "\172";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\5\3\uffff\1\11\1\uffff\1\13\3\uffff\1\24\1\25\1\26"+
        "\1\uffff\1\30\2\uffff\1\33\2\uffff\1\36\11\uffff\1\44\1\45\1\47"+
        "\1\uffff\1\2\1\21\1\uffff\1\16\1\6\2\uffff\1\43\1\12\1\15\1\14\1"+
        "\20\1\23\1\17\21\uffff\1\42\4\uffff\1\10\1\uffff\1\27\20\uffff\1"+
        "\46\1\1\2\uffff\1\22\2\uffff\1\34\1\35\2\uffff\1\40\13\uffff\1\32"+
        "\1\37\10\uffff\1\41\1\3\12\uffff\1\31\11\uffff\1\7\4\uffff";
    static final String DFA18_specialS =
        "\u009a\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\6\uffff\1\43\1\20\1\5\1\21"+
            "\1\23\1\31\1\2\1\12\1\11\12\42\1\6\1\26\1\15\1\13\1\14\2\uffff"+
            "\1\44\1\34\1\35\5\44\1\40\5\44\1\36\2\44\1\41\1\37\7\44\4\uffff"+
            "\1\44\1\uffff\1\1\1\3\1\7\1\10\1\44\1\33\7\44\1\16\1\22\2\44"+
            "\1\24\1\25\1\32\1\44\1\27\1\44\1\30\2\44\1\17\1\uffff\1\4",
            "\1\46",
            "\1\47",
            "\1\51",
            "",
            "",
            "\1\52",
            "\1\54",
            "\1\55",
            "",
            "\12\56",
            "",
            "\1\60",
            "\1\62\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75\15\uffff\1\76",
            "\1\77",
            "\1\101\16\uffff\1\100",
            "\1\102\16\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\107\1\uffff\12\42\13\uffff\1\56\37\uffff\1\56",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\112",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\2\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\12\56\7\uffff\32\136\4\uffff\1\136\1\uffff\32\136",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\140",
            "\1\141",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\143",
            "\1\144",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\147",
            "\1\150",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008f",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0096",
            "\1\u0097",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ARROW | BREAK | CLOSE_CURLY_BRACE | CLOSE_PARENTHESIS | COLON | CONTINUE | DO | DIV | DOT | EQUAL | GT | GTE | IS | LT | LTE | MINUS | NOT | NOT_EQUAL | OPEN_CURLY_BRACE | OPEN_PARENTHESIS | MULT | OR | PLUS | RETURN | SELF | SEMICOLON | VAR | XOR | T__50 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | PRIMITIVE_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | NUMERIC_OPERATION | WS );";
        }
    }
 

}