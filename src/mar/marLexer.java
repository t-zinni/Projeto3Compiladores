// Generated from java-escape by ANTLR 4.11.1
package mar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOL=3, NIL=4, STRING=5, LPA=6, RPA=7, DIV=8, MINUS=9, 
		MULT=10, ADD=11, INT=12, FLOAT=13, MAIOR=14, MAIORIG=15, MENOR=16, MENORIG=17, 
		IGUAL=18, DIFERENTE=19, AND=20, OR=21, NOT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BOOL", "NIL", "STRING", "LPA", "RPA", "DIV", "MINUS", 
			"MULT", "ADD", "INT", "FLOAT", "MAIOR", "MAIORIG", "MENOR", "MENORIG", 
			"IGUAL", "DIFERENTE", "AND", "OR", "NOT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "';'", null, "'nil'", null, "'('", "')'", "'/'", "'-'", 
			"'*'", "'+'", null, null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
			"'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BOOL", "NIL", "STRING", "LPA", "RPA", "DIV", "MINUS", 
			"MULT", "ADD", "INT", "FLOAT", "MAIOR", "MAIORIG", "MENOR", "MENORIG", 
			"IGUAL", "DIFERENTE", "AND", "OR", "NOT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public marLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b_\b\u000b\u000b\u000b\f\u000b`\u0001\f\u0004\fd\b\f\u000b"+
		"\f\f\fe\u0001\f\u0001\f\u0004\fj\b\f\u000b\f\f\fk\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u008a\b\u0016\u000b\u0016\f\u0016\u008b"+
		"\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0003\u0001\u0000"+
		"\"\"\u0001\u000009\u0003\u0000\t\n\r\r  \u0095\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003"+
		"5\u0001\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007B\u0001"+
		"\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000"+
		"\u0000\rS\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011"+
		"W\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001"+
		"\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019c\u0001\u0000\u0000"+
		"\u0000\u001bm\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001f"+
		"r\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000"+
		"\u0000%z\u0001\u0000\u0000\u0000\'}\u0001\u0000\u0000\u0000)\u0081\u0001"+
		"\u0000\u0000\u0000+\u0084\u0001\u0000\u0000\u0000-\u0089\u0001\u0000\u0000"+
		"\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005i\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005t\u0000\u00004\u0002\u0001\u0000\u0000\u0000"+
		"56\u0005;\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005t\u0000\u0000"+
		"89\u0005r\u0000\u00009:\u0005u\u0000\u0000:A\u0005e\u0000\u0000;<\u0005"+
		"f\u0000\u0000<=\u0005a\u0000\u0000=>\u0005l\u0000\u0000>?\u0005s\u0000"+
		"\u0000?A\u0005e\u0000\u0000@7\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000"+
		"\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005n\u0000\u0000CD\u0005i\u0000"+
		"\u0000DE\u0005l\u0000\u0000E\b\u0001\u0000\u0000\u0000FL\u0005\"\u0000"+
		"\u0000GK\b\u0000\u0000\u0000HI\u0005\\\u0000\u0000IK\u0005\"\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\"\u0000\u0000P\n\u0001"+
		"\u0000\u0000\u0000QR\u0005(\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005"+
		")\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005/\u0000\u0000V\u0010"+
		"\u0001\u0000\u0000\u0000WX\u0005-\u0000\u0000X\u0012\u0001\u0000\u0000"+
		"\u0000YZ\u0005*\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005+\u0000"+
		"\u0000\\\u0016\u0001\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bd\u0007\u0001"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gi\u0005.\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u001a\u0001\u0000\u0000\u0000mn\u0005>\u0000\u0000n\u001c\u0001"+
		"\u0000\u0000\u0000op\u0005>\u0000\u0000pq\u0005=\u0000\u0000q\u001e\u0001"+
		"\u0000\u0000\u0000rs\u0005<\u0000\u0000s \u0001\u0000\u0000\u0000tu\u0005"+
		"<\u0000\u0000uv\u0005=\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005"+
		"=\u0000\u0000xy\u0005=\u0000\u0000y$\u0001\u0000\u0000\u0000z{\u0005!"+
		"\u0000\u0000{|\u0005=\u0000\u0000|&\u0001\u0000\u0000\u0000}~\u0005a\u0000"+
		"\u0000~\u007f\u0005n\u0000\u0000\u007f\u0080\u0005d\u0000\u0000\u0080"+
		"(\u0001\u0000\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083\u0005"+
		"r\u0000\u0000\u0083*\u0001\u0000\u0000\u0000\u0084\u0085\u0005n\u0000"+
		"\u0000\u0085\u0086\u0005o\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087"+
		",\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0002\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0006\u0016\u0000\u0000\u008e.\u0001"+
		"\u0000\u0000\u0000\b\u0000@JL`ek\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}