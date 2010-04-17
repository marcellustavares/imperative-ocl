// $ANTLR 3.2 Sep 23, 2009 12:02:23 IOCL.g 2010-04-17 19:19:09

package org.orcas.iocl.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IOCLLexer extends Lexer {
    public static final int EXPONENT=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int UNICODE_ESC=15;
    public static final int T__20=20;
    public static final int OCTAL_ESC=16;
    public static final int HEX_DIGIT=14;
    public static final int BINARY_OPERATOR=9;
    public static final int EOF=-1;
    public static final int BOOLEAN_LITERAL=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int STRING_LITERAL=5;
    public static final int ESC_SEQ=12;
    public static final int WS=13;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int REAL_LITERAL=8;
    public static final int COLLECTION_TYPE_LITERAL=4;
    public static final int INTEGER_LITERAL=7;
    public static final int IDENTIFIER=10;

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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:7:7: ( 'and' )
            // IOCL.g:7:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:8:7: ( 'or' )
            // IOCL.g:8:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:9:7: ( 'xor' )
            // IOCL.g:9:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:10:7: ( '+' )
            // IOCL.g:10:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:11:7: ( '-' )
            // IOCL.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:12:7: ( '*' )
            // IOCL.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:13:7: ( '/' )
            // IOCL.g:13:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:14:7: ( 'not' )
            // IOCL.g:14:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:15:7: ( '{' )
            // IOCL.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:16:7: ( '}' )
            // IOCL.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:17:7: ( ',' )
            // IOCL.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:18:7: ( '->' )
            // IOCL.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:19:7: ( '.' )
            // IOCL.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:20:7: ( '(' )
            // IOCL.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:21:7: ( ')' )
            // IOCL.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:22:7: ( 'self' )
            // IOCL.g:22:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:23:7: ( 'Integer' )
            // IOCL.g:23:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "BINARY_OPERATOR"
    public final void mBINARY_OPERATOR() throws RecognitionException {
        try {
            int _type = BINARY_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:178:2: ()
            // IOCL.g:179:2: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINARY_OPERATOR"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:182:2: ( 'true' | 'false' )
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
                    // IOCL.g:182:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // IOCL.g:183:4: 'false'
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
            // IOCL.g:187:2: ( 'Bag' | 'Collection' | 'OrderedSet' | 'Sequence' | 'Set' )
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
                    // IOCL.g:187:4: 'Bag'
                    {
                    match("Bag"); 


                    }
                    break;
                case 2 :
                    // IOCL.g:188:4: 'Collection'
                    {
                    match("Collection"); 


                    }
                    break;
                case 3 :
                    // IOCL.g:189:4: 'OrderedSet'
                    {
                    match("OrderedSet"); 


                    }
                    break;
                case 4 :
                    // IOCL.g:190:4: 'Sequence'
                    {
                    match("Sequence"); 


                    }
                    break;
                case 5 :
                    // IOCL.g:191:4: 'Set'
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
            // IOCL.g:195:2: ( ( '0' .. '9' )+ )
            // IOCL.g:195:4: ( '0' .. '9' )+
            {
            // IOCL.g:195:4: ( '0' .. '9' )+
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
            	    // IOCL.g:195:4: '0' .. '9'
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
            // IOCL.g:199:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // IOCL.g:199:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // IOCL.g:199:4: ( '0' .. '9' )+
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
                    	    // IOCL.g:199:5: '0' .. '9'
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
                    // IOCL.g:199:20: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // IOCL.g:199:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // IOCL.g:199:32: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // IOCL.g:199:32: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:200:4: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // IOCL.g:200:8: ( '0' .. '9' )+
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
                    	    // IOCL.g:200:9: '0' .. '9'
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

                    // IOCL.g:200:20: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // IOCL.g:200:20: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:201:4: ( '0' .. '9' )+ EXPONENT
                    {
                    // IOCL.g:201:4: ( '0' .. '9' )+
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
                    	    // IOCL.g:201:5: '0' .. '9'
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
            // IOCL.g:205:2: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            // IOCL.g:205:4: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 
            // IOCL.g:205:9: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
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
            	    // IOCL.g:205:11: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // IOCL.g:205:21: ~ ( '\\\\' | '\\'' )
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
            // IOCL.g:209:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // IOCL.g:209:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:209:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // IOCL.g:213:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // IOCL.g:213:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // IOCL.g:222:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // IOCL.g:222:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // IOCL.g:222:14: ( '+' | '-' )?
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

            // IOCL.g:222:25: ( '0' .. '9' )+
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
            	    // IOCL.g:222:26: '0' .. '9'
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
            // IOCL.g:227:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // IOCL.g:227:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // IOCL.g:231:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // IOCL.g:231:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // IOCL.g:232:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // IOCL.g:233:4: OCTAL_ESC
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
            // IOCL.g:238:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // IOCL.g:238:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:238:9: ( '0' .. '3' )
                    // IOCL.g:238:10: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // IOCL.g:238:20: ( '0' .. '7' )
                    // IOCL.g:238:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // IOCL.g:238:31: ( '0' .. '7' )
                    // IOCL.g:238:32: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // IOCL.g:239:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:239:9: ( '0' .. '7' )
                    // IOCL.g:239:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // IOCL.g:239:20: ( '0' .. '7' )
                    // IOCL.g:239:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // IOCL.g:240:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // IOCL.g:240:9: ( '0' .. '7' )
                    // IOCL.g:240:10: '0' .. '7'
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
            // IOCL.g:245:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // IOCL.g:245:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // IOCL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | BINARY_OPERATOR | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | WS )
        int alt17=25;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // IOCL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // IOCL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // IOCL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // IOCL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // IOCL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // IOCL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // IOCL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // IOCL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // IOCL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // IOCL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // IOCL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // IOCL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // IOCL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // IOCL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // IOCL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // IOCL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // IOCL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // IOCL.g:1:112: BINARY_OPERATOR
                {
                mBINARY_OPERATOR(); 

                }
                break;
            case 19 :
                // IOCL.g:1:128: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 

                }
                break;
            case 20 :
                // IOCL.g:1:144: COLLECTION_TYPE_LITERAL
                {
                mCOLLECTION_TYPE_LITERAL(); 

                }
                break;
            case 21 :
                // IOCL.g:1:168: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 22 :
                // IOCL.g:1:184: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 23 :
                // IOCL.g:1:197: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 24 :
                // IOCL.g:1:212: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 25 :
                // IOCL.g:1:223: WS
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
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
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
            return "198:1: REAL_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA17_eotS =
        "\1\21\3\32\1\uffff\1\40\2\uffff\1\32\3\uffff\1\43\2\uffff\2\32\1"+
        "\uffff\6\32\1\54\3\uffff\1\32\1\56\1\32\2\uffff\1\32\2\uffff\10"+
        "\32\1\uffff\1\72\1\uffff\1\73\1\74\4\32\1\101\3\32\1\101\3\uffff"+
        "\1\105\1\32\1\107\1\32\1\uffff\3\32\1\uffff\1\32\1\uffff\1\107\7"+
        "\32\1\124\3\32\1\uffff\2\32\1\101\2\32\2\101";
    static final String DFA17_eofS =
        "\134\uffff";
    static final String DFA17_minS =
        "\1\11\1\156\1\162\1\157\1\uffff\1\76\2\uffff\1\157\3\uffff\1\60"+
        "\2\uffff\1\145\1\156\1\uffff\1\162\2\141\1\157\1\162\1\145\1\56"+
        "\3\uffff\1\144\1\60\1\162\2\uffff\1\164\2\uffff\1\154\1\164\1\165"+
        "\1\154\1\147\1\154\1\144\1\161\1\uffff\1\60\1\uffff\2\60\1\146\2"+
        "\145\1\163\1\60\1\154\1\145\1\165\1\60\3\uffff\1\60\1\147\1\60\1"+
        "\145\1\uffff\1\145\1\162\1\145\1\uffff\1\145\1\uffff\1\60\1\143"+
        "\1\145\1\156\1\162\1\164\1\144\1\143\1\60\1\151\1\123\1\145\1\uffff"+
        "\1\157\1\145\1\60\1\156\1\164\2\60";
    static final String DFA17_maxS =
        "\1\175\1\156\1\162\1\157\1\uffff\1\76\2\uffff\1\157\3\uffff\1\71"+
        "\2\uffff\1\145\1\156\1\uffff\1\162\2\141\1\157\1\162\2\145\3\uffff"+
        "\1\144\1\172\1\162\2\uffff\1\164\2\uffff\1\154\1\164\1\165\1\154"+
        "\1\147\1\154\1\144\1\164\1\uffff\1\172\1\uffff\2\172\1\146\2\145"+
        "\1\163\1\172\1\154\1\145\1\165\1\172\3\uffff\1\172\1\147\1\172\1"+
        "\145\1\uffff\1\145\1\162\1\145\1\uffff\1\145\1\uffff\1\172\1\143"+
        "\1\145\1\156\1\162\1\164\1\144\1\143\1\172\1\151\1\123\1\145\1\uffff"+
        "\1\157\1\145\1\172\1\156\1\164\2\172";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\13\1\uffff\1\16"+
        "\1\17\2\uffff\1\22\7\uffff\1\27\1\30\1\31\3\uffff\1\14\1\5\1\uffff"+
        "\1\26\1\15\10\uffff\1\25\1\uffff\1\2\13\uffff\1\1\1\3\1\10\4\uffff"+
        "\1\24\3\uffff\1\20\1\uffff\1\23\14\uffff\1\21\7\uffff";
    static final String DFA17_specialS =
        "\134\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\6\uffff\1\31\1\15\1\16\1\6"+
            "\1\4\1\13\1\5\1\14\1\7\12\30\7\uffff\1\32\1\24\1\25\5\32\1\20"+
            "\5\32\1\26\3\32\1\27\7\32\4\uffff\1\32\1\uffff\1\1\4\32\1\23"+
            "\7\32\1\10\1\2\3\32\1\17\1\22\3\32\1\3\2\32\1\11\1\uffff\1\12",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "",
            "",
            "\1\41",
            "",
            "",
            "",
            "\12\42",
            "",
            "",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\42\1\uffff\12\30\13\uffff\1\42\37\uffff\1\42",
            "",
            "",
            "",
            "\1\55",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\57",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\2\uffff\1\71",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\106",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "\1\133",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32"
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | BINARY_OPERATOR | BOOLEAN_LITERAL | COLLECTION_TYPE_LITERAL | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | IDENTIFIER | WS );";
        }
    }
 

}