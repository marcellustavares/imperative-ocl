// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g 2010-05-23 15:31:59

package org.orcas.iocl.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IoclLexer extends Lexer {
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int LT=13;
    public static final int EXPONENT=29;
    public static final int XOR=21;
    public static final int UNICODE_ESC=33;
    public static final int NUMERIC_OPERATION=22;
    public static final int GTE=12;
    public static final int OCTAL_ESC=34;
    public static final int COLLECTION_LITERAL_PARTS=7;
    public static final int HEX_DIGIT=32;
    public static final int NOT=16;
    public static final int MULT=18;
    public static final int MINUS=15;
    public static final int AND=4;
    public static final int EOF=-1;
    public static final int LTE=14;
    public static final int BOOLEAN_LITERAL=25;
    public static final int STRING_LITERAL=24;
    public static final int ESC_SEQ=30;
    public static final int WS=31;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int REAL_LITERAL=27;
    public static final int T__37=37;
    public static final int COLLECTION_TYPE_LITERAL=23;
    public static final int T__38=38;
    public static final int NOT_EQUAL=17;
    public static final int T__39=39;
    public static final int INTEGER_LITERAL=26;
    public static final int IDENTIFIER=28;
    public static final int EQUAL=10;
    public static final int OR=19;
    public static final int GT=11;
    public static final int ARROW=5;
    public static final int PLUS=20;
    public static final int DIV=8;
    public static final int DOT=9;
    public static final int COLLECTION_LITERAL=6;

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

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:9:5: ( '/' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:9:7: '/'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:10:5: ( '.' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:10:7: '.'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:11:7: ( '=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:11:9: '='
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:12:4: ( '>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:12:6: '>'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:13:5: ( '>=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:13:7: '>='
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

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:14:4: ( '<' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:14:6: '<'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:15:5: ( '<=' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:15:7: '<='
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:16:7: ( '-' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:16:9: '-'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:17:5: ( 'not' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:17:7: 'not'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:18:11: ( '<>' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:18:13: '<>'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:19:6: ( '*' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:19:8: '*'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:20:4: ( 'or' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:20:6: 'or'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:21:6: ( '+' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:21:8: '+'
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

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:22:5: ( 'xor' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:22:7: 'xor'
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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:23:7: ( '(' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:24:7: ( ')' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:25:7: ( '{' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:26:7: ( '}' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:27:7: ( ',' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:28:7: ( 'self' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:28:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:29:7: ( 'Integer' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:29:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:2: ( 'true' | 'false' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:153:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:154:4: 'false'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:2: ( 'Bag' | 'Collection' | 'OrderedSet' | 'Sequence' | 'Set' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:158:4: 'Bag'
                    {
                    match("Bag"); 


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:159:4: 'Collection'
                    {
                    match("Collection"); 


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:160:4: 'OrderedSet'
                    {
                    match("OrderedSet"); 


                    }
                    break;
                case 4 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:161:4: 'Sequence'
                    {
                    match("Sequence"); 


                    }
                    break;
                case 5 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:162:4: 'Set'
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

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:2: ( ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:4: ( '0' .. '9' )+
            {
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:4: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:166:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:4: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:5: '0' .. '9'
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

                    match('.'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:20: ( '0' .. '9' )+
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
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:21: '0' .. '9'
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

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:32: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:170:32: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:4: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:8: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:9: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:20: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:171:20: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:172:4: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:172:4: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:172:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:2: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:4: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:9: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:11: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:176:21: ~ ( '\\\\' | '\\'' )
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
            	    break loop11;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:180:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:2: ( INTEGER_LITERAL '.' IDENTIFIER )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:184:4: INTEGER_LITERAL '.' IDENTIFIER
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:188:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:14: ( '+' | '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='+'||LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
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

            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:25: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:197:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:202:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:202:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
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
                    alt15=1;
                    }
                    break;
                case 'u':
                    {
                    alt15=2;
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
                    alt15=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:206:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:207:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:208:4: OCTAL_ESC
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='3')) ) {
                    int LA16_2 = input.LA(3);

                    if ( ((LA16_2>='0' && LA16_2<='7')) ) {
                        int LA16_5 = input.LA(4);

                        if ( ((LA16_5>='0' && LA16_5<='7')) ) {
                            alt16=1;
                        }
                        else {
                            alt16=2;}
                    }
                    else {
                        alt16=3;}
                }
                else if ( ((LA16_1>='4' && LA16_1<='7')) ) {
                    int LA16_3 = input.LA(3);

                    if ( ((LA16_3>='0' && LA16_3<='7')) ) {
                        alt16=2;
                    }
                    else {
                        alt16=3;}
                }
                else {
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
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:9: ( '0' .. '3' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:10: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:31: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:213:32: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:20: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:214:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:9: ( '0' .. '7' )
                    // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:215:10: '0' .. '7'
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
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:220:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:8: ( AND | ARROW | DIV | DOT | EQUAL | GT | GTE | LT | LTE | MINUS | NOT | NOT_EQUAL | MULT | OR | PLUS | XOR | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | NUMERIC_OPERATION | WS )
        int alt17=31;
        alt17 = dfa17.predict(input);
        switch (alt17) {
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
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:20: DIV
                {
                mDIV(); 

                }
                break;
            case 4 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:24: DOT
                {
                mDOT(); 

                }
                break;
            case 5 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:28: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 6 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:34: GT
                {
                mGT(); 

                }
                break;
            case 7 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:37: GTE
                {
                mGTE(); 

                }
                break;
            case 8 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:41: LT
                {
                mLT(); 

                }
                break;
            case 9 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:44: LTE
                {
                mLTE(); 

                }
                break;
            case 10 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:48: MINUS
                {
                mMINUS(); 

                }
                break;
            case 11 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:54: NOT
                {
                mNOT(); 

                }
                break;
            case 12 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:58: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 13 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:68: MULT
                {
                mMULT(); 

                }
                break;
            case 14 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:73: OR
                {
                mOR(); 

                }
                break;
            case 15 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:76: PLUS
                {
                mPLUS(); 

                }
                break;
            case 16 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:81: XOR
                {
                mXOR(); 

                }
                break;
            case 17 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:85: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:91: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:97: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:103: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:109: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:115: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:121: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:127: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 

                }
                break;
            case 25 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:143: COLLECTION_TYPE_LITERAL
                {
                mCOLLECTION_TYPE_LITERAL(); 

                }
                break;
            case 26 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:167: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 27 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:183: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 28 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:196: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 29 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:211: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 30 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:222: NUMERIC_OPERATION
                {
                mNUMERIC_OPERATION(); 

                }
                break;
            case 31 :
                // /Volumes/Macintosh HD 2/Users/Marcellus/Documents/UFPE/MSc/workspace/org.orcas.iocl/src/org/orcas/iocl/parser/antlr/Iocl.g:1:240: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
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
            return "169:1: REAL_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\1\34\1\40\1\uffff\1\42\1\uffff\1\44\1\47\1\34\1\uffff\1"+
        "\34\1\uffff\1\34\5\uffff\10\34\1\64\3\uffff\1\34\11\uffff\1\34\1"+
        "\67\11\34\2\uffff\1\103\1\104\1\uffff\1\105\4\34\1\112\3\34\1\112"+
        "\4\uffff\1\116\1\34\1\120\1\34\1\uffff\3\34\1\uffff\1\34\1\uffff"+
        "\1\120\7\34\1\135\3\34\1\uffff\2\34\1\112\2\34\2\112";
    static final String DFA17_eofS =
        "\145\uffff";
    static final String DFA17_minS =
        "\1\11\1\156\1\76\1\uffff\1\60\1\uffff\2\75\1\157\1\uffff\1\162\1"+
        "\uffff\1\157\5\uffff\1\145\1\156\1\162\2\141\1\157\1\162\1\145\1"+
        "\56\3\uffff\1\144\11\uffff\1\164\1\60\1\162\1\154\1\164\1\165\1"+
        "\154\1\147\1\154\1\144\1\161\1\60\1\uffff\2\60\1\uffff\1\60\1\146"+
        "\2\145\1\163\1\60\1\154\1\145\1\165\1\60\4\uffff\1\60\1\147\1\60"+
        "\1\145\1\uffff\1\145\1\162\1\145\1\uffff\1\145\1\uffff\1\60\1\143"+
        "\1\145\1\156\1\162\1\164\1\144\1\143\1\60\1\151\1\123\1\145\1\uffff"+
        "\1\157\1\145\1\60\1\156\1\164\2\60";
    static final String DFA17_maxS =
        "\1\175\1\156\1\76\1\uffff\1\71\1\uffff\1\75\1\76\1\157\1\uffff\1"+
        "\162\1\uffff\1\157\5\uffff\1\145\1\156\1\162\2\141\1\157\1\162\2"+
        "\145\3\uffff\1\144\11\uffff\1\164\1\172\1\162\1\154\1\164\1\165"+
        "\1\154\1\147\1\154\1\144\1\164\1\172\1\uffff\2\172\1\uffff\1\172"+
        "\1\146\2\145\1\163\1\172\1\154\1\145\1\165\1\172\4\uffff\1\172\1"+
        "\147\1\172\1\145\1\uffff\1\145\1\162\1\145\1\uffff\1\145\1\uffff"+
        "\1\172\1\143\1\145\1\156\1\162\1\164\1\144\1\143\1\172\1\151\1\123"+
        "\1\145\1\uffff\1\157\1\145\1\172\1\156\1\164\2\172";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\3\uffff\1\15\1\uffff\1\17\1\uffff\1\21"+
        "\1\22\1\23\1\24\1\25\11\uffff\1\34\1\35\1\37\1\uffff\1\2\1\12\1"+
        "\33\1\4\1\7\1\6\1\11\1\14\1\10\14\uffff\1\32\2\uffff\1\16\12\uffff"+
        "\1\36\1\1\1\13\1\20\4\uffff\1\31\3\uffff\1\26\1\uffff\1\30\14\uffff"+
        "\1\27\7\uffff";
    static final String DFA17_specialS =
        "\145\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\6\uffff\1\33\1\15\1\16\1\11"+
            "\1\13\1\21\1\2\1\4\1\3\12\32\2\uffff\1\7\1\5\1\6\2\uffff\1\34"+
            "\1\26\1\27\5\34\1\23\5\34\1\30\3\34\1\31\7\34\4\uffff\1\34\1"+
            "\uffff\1\1\4\34\1\25\7\34\1\10\1\12\3\34\1\22\1\24\3\34\1\14"+
            "\2\34\1\17\1\uffff\1\20",
            "\1\36",
            "\1\37",
            "",
            "\12\41",
            "",
            "\1\43",
            "\1\45\1\46",
            "\1\50",
            "",
            "\1\51",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63\1\uffff\12\32\13\uffff\1\41\37\uffff\1\41",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\2\uffff\1\101",
            "\12\41\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\117",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\143",
            "\1\144",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ARROW | DIV | DOT | EQUAL | GT | GTE | LT | LTE | MINUS | NOT | NOT_EQUAL | MULT | OR | PLUS | XOR | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | NUMERIC_OPERATION | WS );";
        }
    }
 

}