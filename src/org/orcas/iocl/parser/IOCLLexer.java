// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-03-13 11:31:11

package org.orcas.iocl.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IOCLLexer extends Lexer {
    public static final int EXPONENT=7;
    public static final int ESC_SEQ=10;
    public static final int WS=9;
    public static final int STRING_LITERAL=4;
    public static final int UNICODE_ESC=13;
    public static final int OCTAL_ESC=14;
    public static final int CHAR=11;
    public static final int HEX_DIGIT=12;
    public static final int INT=6;
    public static final int FLOAT=8;
    public static final int ID=5;
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:48:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // IOCL.g:48:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:48:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
                    break loop1;
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:51:5: ( ( '0' .. '9' )+ )
            // IOCL.g:51:7: ( '0' .. '9' )+
            {
            // IOCL.g:51:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // IOCL.g:51:7: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:55:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // IOCL.g:55:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // IOCL.g:55:9: ( '0' .. '9' )+
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
                            // IOCL.g:55:10: '0' .. '9'
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

                    match('.');
                    // IOCL.g:55:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // IOCL.g:55:26: '0' .. '9'
                            {
                            matchRange('0','9');

                            }
                            break;

                        default :
                            break loop4;
                        }
                    } while (true);

                    // IOCL.g:55:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // IOCL.g:55:37: EXPONENT
                            {
                            mEXPONENT();

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:56:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.');
                    // IOCL.g:56:13: ( '0' .. '9' )+
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
                            // IOCL.g:56:14: '0' .. '9'
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

                    // IOCL.g:56:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // IOCL.g:56:25: EXPONENT
                            {
                            mEXPONENT();

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:57:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // IOCL.g:57:9: ( '0' .. '9' )+
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
                            // IOCL.g:57:10: '0' .. '9'
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
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:60:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // IOCL.g:60:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:68:5: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\\'' )
            // IOCL.g:68:8: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\\''
            {
            match('\'');
            // IOCL.g:68:13: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>='\u0000' && LA10_1<='!')||(LA10_1>='#' && LA10_1<='\uFFFF')) ) {
                        alt10=2;
                    }


                }
                else if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
                case 1 :
                    // IOCL.g:68:15: ESC_SEQ
                    {
                    mESC_SEQ();

                    }
                    break;
                case 2 :
                    // IOCL.g:68:25: ~ ( '\\\\' | '\"' )
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
                    break loop10;
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

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:71:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // IOCL.g:71:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\'');
            // IOCL.g:71:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // IOCL.g:71:15: ESC_SEQ
                    {
                    mESC_SEQ();

                    }
                    break;
                case 2 :
                    // IOCL.g:71:25: ~ ( '\\'' | '\\\\' )
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
            // IOCL.g:75:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // IOCL.g:75:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:75:22: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
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

            // IOCL.g:75:33: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // IOCL.g:75:34: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // IOCL.g:78:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // IOCL.g:78:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // IOCL.g:82:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
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
                    alt14=1;
                    }
                    break;
                case 'u':
                    {
                    alt14=2;
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
                    alt14=3;
                    }
                    break;
                default:
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
                    // IOCL.g:82:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // IOCL.g:83:9: UNICODE_ESC
                    {
                    mUNICODE_ESC();

                    }
                    break;
                case 3 :
                    // IOCL.g:84:9: OCTAL_ESC
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
            // IOCL.g:89:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>='0' && LA15_1<='3')) ) {
                    int LA15_2 = input.LA(3);

                    if ( ((LA15_2>='0' && LA15_2<='7')) ) {
                        int LA15_5 = input.LA(4);

                        if ( ((LA15_5>='0' && LA15_5<='7')) ) {
                            alt15=1;
                        }
                        else {
                            alt15=2;}
                    }
                    else {
                        alt15=3;}
                }
                else if ( ((LA15_1>='4' && LA15_1<='7')) ) {
                    int LA15_3 = input.LA(3);

                    if ( ((LA15_3>='0' && LA15_3<='7')) ) {
                        alt15=2;
                    }
                    else {
                        alt15=3;}
                }
                else {
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
                    // IOCL.g:89:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\');
                    // IOCL.g:89:14: ( '0' .. '3' )
                    // IOCL.g:89:15: '0' .. '3'
                    {
                    matchRange('0','3');

                    }

                    // IOCL.g:89:25: ( '0' .. '7' )
                    // IOCL.g:89:26: '0' .. '7'
                    {
                    matchRange('0','7');

                    }

                    // IOCL.g:89:36: ( '0' .. '7' )
                    // IOCL.g:89:37: '0' .. '7'
                    {
                    matchRange('0','7');

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:90:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\');
                    // IOCL.g:90:14: ( '0' .. '7' )
                    // IOCL.g:90:15: '0' .. '7'
                    {
                    matchRange('0','7');

                    }

                    // IOCL.g:90:25: ( '0' .. '7' )
                    // IOCL.g:90:26: '0' .. '7'
                    {
                    matchRange('0','7');

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:91:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\');
                    // IOCL.g:91:14: ( '0' .. '7' )
                    // IOCL.g:91:15: '0' .. '7'
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
            // IOCL.g:96:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // IOCL.g:96:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // IOCL.g:1:8: ( ID | INT | FLOAT | WS | STRING_LITERAL | CHAR )
        int alt16=6;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // IOCL.g:1:10: ID
                {
                mID();

                }
                break;
            case 2 :
                // IOCL.g:1:13: INT
                {
                mINT();

                }
                break;
            case 3 :
                // IOCL.g:1:17: FLOAT
                {
                mFLOAT();

                }
                break;
            case 4 :
                // IOCL.g:1:23: WS
                {
                mWS();

                }
                break;
            case 5 :
                // IOCL.g:1:26: STRING_LITERAL
                {
                mSTRING_LITERAL();

                }
                break;
            case 6 :
                // IOCL.g:1:41: CHAR
                {
                mCHAR();

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
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
            return "54:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA16_eotS =
        "\2\uffff\1\6\24\uffff";
    static final String DFA16_eofS =
        "\27\uffff";
    static final String DFA16_minS =
        "\1\11\1\uffff\1\56\2\uffff\1\0\1\uffff\1\42\1\0\2\uffff\1\0\1\60"+
        "\2\0\1\uffff\1\60\2\0\1\60\1\0\1\60\1\0";
    static final String DFA16_maxS =
        "\1\172\1\uffff\1\145\2\uffff\1\uffff\1\uffff\1\165\1\uffff\2\uffff"+
        "\1\uffff\1\146\2\uffff\1\uffff\1\146\2\uffff\1\146\1\uffff\1\146"+
        "\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\2\2\uffff\1\6\1\5\4\uffff"+
        "\1\5\7\uffff";
    static final String DFA16_specialS =
        "\5\uffff\1\7\2\uffff\1\10\2\uffff\1\1\1\uffff\1\5\1\0\2\uffff\1"+
        "\4\1\6\1\uffff\1\3\1\uffff\1\2}>";
    static final String[] DFA16_transitionS = {
            "\2\4\2\uffff\1\4\22\uffff\1\4\6\uffff\1\5\6\uffff\1\3\1\uffff"+
            "\12\2\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
            "",
            "\1\3\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            "\42\10\1\11\4\10\1\12\64\10\1\7\uffa3\10",
            "",
            "\1\13\4\uffff\1\13\10\uffff\4\15\4\16\44\uffff\1\13\5\uffff"+
            "\1\13\3\uffff\1\13\7\uffff\1\13\3\uffff\1\13\1\uffff\1\13\1"+
            "\14",
            "\42\12\1\uffff\4\12\1\17\uffd8\12",
            "",
            "",
            "\42\12\1\uffff\4\12\1\17\uffd8\12",
            "\12\20\7\uffff\6\20\32\uffff\6\20",
            "\42\12\1\uffff\4\12\1\17\10\12\10\21\uffc8\12",
            "\42\12\1\uffff\4\12\1\17\10\12\10\22\uffc8\12",
            "",
            "\12\23\7\uffff\6\23\32\uffff\6\23",
            "\42\12\1\uffff\4\12\1\17\10\12\10\24\uffc8\12",
            "\42\12\1\uffff\4\12\1\17\uffd8\12",
            "\12\25\7\uffff\6\25\32\uffff\6\25",
            "\42\12\1\uffff\4\12\1\17\uffd8\12",
            "\12\26\7\uffff\6\26\32\uffff\6\26",
            "\42\12\1\uffff\4\12\1\17\uffd8\12"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ID | INT | FLOAT | WS | STRING_LITERAL | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA16_14 = input.LA(1);

                        s = -1;
                        if ( (LA16_14=='\'') ) {s = 15;}

                        else if ( ((LA16_14>='0' && LA16_14<='7')) ) {s = 18;}

                        else if ( ((LA16_14>='\u0000' && LA16_14<='!')||(LA16_14>='#' && LA16_14<='&')||(LA16_14>='(' && LA16_14<='/')||(LA16_14>='8' && LA16_14<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA16_11 = input.LA(1);

                        s = -1;
                        if ( (LA16_11=='\'') ) {s = 15;}

                        else if ( ((LA16_11>='\u0000' && LA16_11<='!')||(LA16_11>='#' && LA16_11<='&')||(LA16_11>='(' && LA16_11<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( (LA16_22=='\'') ) {s = 15;}

                        else if ( ((LA16_22>='\u0000' && LA16_22<='!')||(LA16_22>='#' && LA16_22<='&')||(LA16_22>='(' && LA16_22<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA16_20 = input.LA(1);

                        s = -1;
                        if ( (LA16_20=='\'') ) {s = 15;}

                        else if ( ((LA16_20>='\u0000' && LA16_20<='!')||(LA16_20>='#' && LA16_20<='&')||(LA16_20>='(' && LA16_20<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA16_17 = input.LA(1);

                        s = -1;
                        if ( ((LA16_17>='0' && LA16_17<='7')) ) {s = 20;}

                        else if ( (LA16_17=='\'') ) {s = 15;}

                        else if ( ((LA16_17>='\u0000' && LA16_17<='!')||(LA16_17>='#' && LA16_17<='&')||(LA16_17>='(' && LA16_17<='/')||(LA16_17>='8' && LA16_17<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA16_13 = input.LA(1);

                        s = -1;
                        if ( (LA16_13=='\'') ) {s = 15;}

                        else if ( ((LA16_13>='0' && LA16_13<='7')) ) {s = 17;}

                        else if ( ((LA16_13>='\u0000' && LA16_13<='!')||(LA16_13>='#' && LA16_13<='&')||(LA16_13>='(' && LA16_13<='/')||(LA16_13>='8' && LA16_13<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( (LA16_18=='\'') ) {s = 15;}

                        else if ( ((LA16_18>='\u0000' && LA16_18<='!')||(LA16_18>='#' && LA16_18<='&')||(LA16_18>='(' && LA16_18<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA16_5 = input.LA(1);

                        s = -1;
                        if ( (LA16_5=='\\') ) {s = 7;}

                        else if ( ((LA16_5>='\u0000' && LA16_5<='!')||(LA16_5>='#' && LA16_5<='&')||(LA16_5>='(' && LA16_5<='[')||(LA16_5>=']' && LA16_5<='\uFFFF')) ) {s = 8;}

                        else if ( (LA16_5=='\"') ) {s = 9;}

                        else if ( (LA16_5=='\'') ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA16_8 = input.LA(1);

                        s = -1;
                        if ( (LA16_8=='\'') ) {s = 15;}

                        else if ( ((LA16_8>='\u0000' && LA16_8<='!')||(LA16_8>='#' && LA16_8<='&')||(LA16_8>='(' && LA16_8<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}