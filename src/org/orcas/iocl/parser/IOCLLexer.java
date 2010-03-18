// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-03-18 00:07:09

package org.orcas.iocl.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IOCLLexer extends Lexer {
    public static final int BOOLEAN_LITERAL=5;
    public static final int EXPONENT=10;
    public static final int STRING_LITERAL=4;
    public static final int ESC_SEQ=9;
    public static final int WS=8;
    public static final int REAL_LITERAL=7;
    public static final int INTEGER_LITERAL=6;
    public static final int UNICODE_ESC=14;
    public static final int OCTAL_ESC=15;
    public static final int CHAR=12;
    public static final int HEX_DIGIT=13;
    public static final int ID=11;
    public static final int EOF=-1;

    // delegates
    // delegators

    public IOCLLexer() {;} 
    public IOCLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IOCLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "IOCL.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:72:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // IOCL.g:72:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:80:2: ( 'true' | 'false' )
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
                    // IOCL.g:80:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // IOCL.g:80:13: 'false'
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

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:84:2: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\\'' )
            // IOCL.g:84:5: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\\''
            {
            match('\''); 
            // IOCL.g:84:10: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( ((LA2_1>='\u0000' && LA2_1<='!')||(LA2_1>='#' && LA2_1<='\uFFFF')) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // IOCL.g:84:12: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // IOCL.g:84:22: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:88:2: ( ( '0' .. '9' )+ )
            // IOCL.g:88:4: ( '0' .. '9' )+
            {
            // IOCL.g:88:4: ( '0' .. '9' )+
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
            	    // IOCL.g:88:4: '0' .. '9'
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
            // IOCL.g:92:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // IOCL.g:92:6: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // IOCL.g:92:6: ( '0' .. '9' )+
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
                    	    // IOCL.g:92:7: '0' .. '9'
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
                    // IOCL.g:92:22: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // IOCL.g:92:23: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // IOCL.g:92:34: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // IOCL.g:92:34: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:93:6: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // IOCL.g:93:10: ( '0' .. '9' )+
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
                    	    // IOCL.g:93:11: '0' .. '9'
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

                    // IOCL.g:93:22: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // IOCL.g:93:22: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:94:6: ( '0' .. '9' )+ EXPONENT
                    {
                    // IOCL.g:94:6: ( '0' .. '9' )+
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
                    	    // IOCL.g:94:7: '0' .. '9'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:97:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // IOCL.g:97:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:97:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // IOCL.g:
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
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:100:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // IOCL.g:100:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // IOCL.g:100:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                alt12=1;
            }
            else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // IOCL.g:100:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // IOCL.g:100:25: ~ ( '\\'' | '\\\\' )
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

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // IOCL.g:104:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // IOCL.g:104:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:104:22: ( '+' | '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='+'||LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // IOCL.g:
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

            // IOCL.g:104:33: ( '0' .. '9' )+
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
            	    // IOCL.g:104:34: '0' .. '9'
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
            // IOCL.g:107:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // IOCL.g:107:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // IOCL.g:111:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // IOCL.g:111:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // IOCL.g:112:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // IOCL.g:113:9: OCTAL_ESC
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
            // IOCL.g:118:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // IOCL.g:118:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:118:14: ( '0' .. '3' )
                    // IOCL.g:118:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // IOCL.g:118:25: ( '0' .. '7' )
                    // IOCL.g:118:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // IOCL.g:118:36: ( '0' .. '7' )
                    // IOCL.g:118:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:119:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:119:14: ( '0' .. '7' )
                    // IOCL.g:119:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // IOCL.g:119:25: ( '0' .. '7' )
                    // IOCL.g:119:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:120:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:120:14: ( '0' .. '7' )
                    // IOCL.g:120:15: '0' .. '7'
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
            // IOCL.g:125:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // IOCL.g:125:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // IOCL.g:1:8: ( WS | BOOLEAN_LITERAL | STRING_LITERAL | INTEGER_LITERAL | REAL_LITERAL | ID | CHAR )
        int alt17=7;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // IOCL.g:1:10: WS
                {
                mWS(); 

                }
                break;
            case 2 :
                // IOCL.g:1:13: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 

                }
                break;
            case 3 :
                // IOCL.g:1:29: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 4 :
                // IOCL.g:1:44: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 5 :
                // IOCL.g:1:60: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 6 :
                // IOCL.g:1:73: ID
                {
                mID(); 

                }
                break;
            case 7 :
                // IOCL.g:1:76: CHAR
                {
                mCHAR(); 

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
            return "91:1: REAL_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA17_eotS =
        "\2\uffff\2\7\1\uffff\1\16\2\uffff\2\7\5\uffff\2\7\5\uffff\1\33\1"+
        "\7\4\uffff\1\33\4\uffff";
    static final String DFA17_eofS =
        "\41\uffff";
    static final String DFA17_minS =
        "\1\11\1\uffff\1\162\1\141\1\0\1\56\2\uffff\1\165\1\154\1\42\1\uffff"+
        "\1\0\2\uffff\1\145\1\163\1\0\1\60\2\0\1\uffff\1\60\1\145\1\60\2"+
        "\0\1\uffff\2\60\1\0\1\60\1\0";
    static final String DFA17_maxS =
        "\1\172\1\uffff\1\162\1\141\1\uffff\1\145\2\uffff\1\165\1\154\1\165"+
        "\1\uffff\1\uffff\2\uffff\1\145\1\163\1\uffff\1\146\2\uffff\1\uffff"+
        "\1\172\1\145\1\146\2\uffff\1\uffff\1\172\1\146\1\uffff\1\146\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\4\uffff\1\5\1\6\3\uffff\1\3\1\uffff\1\7\1\4\6\uffff"+
        "\1\3\5\uffff\1\2\5\uffff";
    static final String DFA17_specialS =
        "\4\uffff\1\10\7\uffff\1\4\4\uffff\1\0\1\uffff\1\1\1\3\4\uffff\1"+
        "\6\1\2\3\uffff\1\7\1\uffff\1\5}>";
    static final String[] DFA17_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\6\uffff\1\4\6\uffff\1\6\1\uffff"+
            "\12\5\7\uffff\32\7\4\uffff\1\7\1\uffff\5\7\1\3\15\7\1\2\6\7",
            "",
            "\1\10",
            "\1\11",
            "\42\14\1\15\4\14\1\13\64\14\1\12\uffa3\14",
            "\1\6\1\uffff\12\5\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21\4\uffff\1\21\10\uffff\4\23\4\24\44\uffff\1\21\5\uffff"+
            "\1\21\3\uffff\1\21\7\uffff\1\21\3\uffff\1\21\1\uffff\1\21\1"+
            "\22",
            "",
            "\42\13\1\uffff\4\13\1\25\uffd8\13",
            "",
            "",
            "\1\26",
            "\1\27",
            "\42\13\1\uffff\4\13\1\25\uffd8\13",
            "\12\30\7\uffff\6\30\32\uffff\6\30",
            "\42\13\1\uffff\4\13\1\25\10\13\10\31\uffc8\13",
            "\42\13\1\uffff\4\13\1\25\10\13\10\32\uffc8\13",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\34",
            "\12\35\7\uffff\6\35\32\uffff\6\35",
            "\42\13\1\uffff\4\13\1\25\10\13\10\36\uffc8\13",
            "\42\13\1\uffff\4\13\1\25\uffd8\13",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\12\37\7\uffff\6\37\32\uffff\6\37",
            "\42\13\1\uffff\4\13\1\25\uffd8\13",
            "\12\40\7\uffff\6\40\32\uffff\6\40",
            "\42\13\1\uffff\4\13\1\25\uffd8\13"
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
            return "1:1: Tokens : ( WS | BOOLEAN_LITERAL | STRING_LITERAL | INTEGER_LITERAL | REAL_LITERAL | ID | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( (LA17_17=='\'') ) {s = 21;}

                        else if ( ((LA17_17>='\u0000' && LA17_17<='!')||(LA17_17>='#' && LA17_17<='&')||(LA17_17>='(' && LA17_17<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_19 = input.LA(1);

                        s = -1;
                        if ( ((LA17_19>='0' && LA17_19<='7')) ) {s = 25;}

                        else if ( (LA17_19=='\'') ) {s = 21;}

                        else if ( ((LA17_19>='\u0000' && LA17_19<='!')||(LA17_19>='#' && LA17_19<='&')||(LA17_19>='(' && LA17_19<='/')||(LA17_19>='8' && LA17_19<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( (LA17_26=='\'') ) {s = 21;}

                        else if ( ((LA17_26>='\u0000' && LA17_26<='!')||(LA17_26>='#' && LA17_26<='&')||(LA17_26>='(' && LA17_26<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_20 = input.LA(1);

                        s = -1;
                        if ( ((LA17_20>='0' && LA17_20<='7')) ) {s = 26;}

                        else if ( (LA17_20=='\'') ) {s = 21;}

                        else if ( ((LA17_20>='\u0000' && LA17_20<='!')||(LA17_20>='#' && LA17_20<='&')||(LA17_20>='(' && LA17_20<='/')||(LA17_20>='8' && LA17_20<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_12 = input.LA(1);

                        s = -1;
                        if ( (LA17_12=='\'') ) {s = 21;}

                        else if ( ((LA17_12>='\u0000' && LA17_12<='!')||(LA17_12>='#' && LA17_12<='&')||(LA17_12>='(' && LA17_12<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( (LA17_32=='\'') ) {s = 21;}

                        else if ( ((LA17_32>='\u0000' && LA17_32<='!')||(LA17_32>='#' && LA17_32<='&')||(LA17_32>='(' && LA17_32<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( (LA17_25=='\'') ) {s = 21;}

                        else if ( ((LA17_25>='\u0000' && LA17_25<='!')||(LA17_25>='#' && LA17_25<='&')||(LA17_25>='(' && LA17_25<='/')||(LA17_25>='8' && LA17_25<='\uFFFF')) ) {s = 11;}

                        else if ( ((LA17_25>='0' && LA17_25<='7')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( (LA17_30=='\'') ) {s = 21;}

                        else if ( ((LA17_30>='\u0000' && LA17_30<='!')||(LA17_30>='#' && LA17_30<='&')||(LA17_30>='(' && LA17_30<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_4 = input.LA(1);

                        s = -1;
                        if ( (LA17_4=='\\') ) {s = 10;}

                        else if ( (LA17_4=='\'') ) {s = 11;}

                        else if ( ((LA17_4>='\u0000' && LA17_4<='!')||(LA17_4>='#' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='[')||(LA17_4>=']' && LA17_4<='\uFFFF')) ) {s = 12;}

                        else if ( (LA17_4=='\"') ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}