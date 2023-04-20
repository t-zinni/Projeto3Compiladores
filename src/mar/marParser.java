// Generated from java-escape by ANTLR 4.11.1
package mar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BOOL=3, NIL=4, STRING=5, LPA=6, RPA=7, DIV=8, MINUS=9, 
		MULT=10, ADD=11, INT=12, FLOAT=13, MAIOR=14, MAIORIG=15, MENOR=16, MENORIG=17, 
		IGUAL=18, DIFERENTE=19, AND=20, OR=21, NOT=22, WS=23;
	public static final int
		RULE_prog = 0, RULE_printExp = 1, RULE_exp = 2, RULE_number = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "printExp", "exp", "number"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public marParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<PrintExpContext> printExp() {
			return getRuleContexts(PrintExpContext.class);
		}
		public PrintExpContext printExp(int i) {
			return getRuleContext(PrintExpContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				printExp();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpContext printExp() throws RecognitionException {
		PrintExpContext _localctx = new PrintExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(T__0);
			setState(14);
			exp(0);
			setState(15);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PAREContext extends ExpContext {
		public TerminalNode LPA() { return getToken(marParser.LPA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPA() { return getToken(marParser.RPA, 0); }
		public PAREContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterPARE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitPARE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitPARE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ADDContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADD() { return getToken(marParser.ADD, 0); }
		public ADDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(marParser.OR, 0); }
		public ORContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NUMContext extends ExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NUMContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNUM(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UNARContext extends ExpContext {
		public Token UNAR;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(marParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(marParser.NOT, 0); }
		public UNARContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterUNAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitUNAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitUNAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MINUSContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(marParser.MINUS, 0); }
		public MINUSContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NILContext extends ExpContext {
		public TerminalNode NIL() { return getToken(marParser.NIL, 0); }
		public NILContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNIL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COMPContext extends ExpContext {
		public Token COMP;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(marParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(marParser.DIFERENTE, 0); }
		public COMPContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterCOMP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitCOMP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitCOMP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOOLContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(marParser.BOOL, 0); }
		public BOOLContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBOOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitBOOL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANDContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(marParser.AND, 0); }
		public ANDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DIVMULTContext extends ExpContext {
		public Token OPERADOR;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(marParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(marParser.MULT, 0); }
		public DIVMULTContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterDIVMULT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitDIVMULT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitDIVMULT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RELContext extends ExpContext {
		public Token RELACIONAL;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MAIOR() { return getToken(marParser.MAIOR, 0); }
		public TerminalNode MAIORIG() { return getToken(marParser.MAIORIG, 0); }
		public TerminalNode MENOR() { return getToken(marParser.MENOR, 0); }
		public TerminalNode MENORIG() { return getToken(marParser.MENORIG, 0); }
		public RELContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterREL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitREL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitREL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRINGContext extends ExpContext {
		public TerminalNode STRING() { return getToken(marParser.STRING, 0); }
		public STRINGContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPA:
				{
				_localctx = new PAREContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(LPA);
				setState(19);
				exp(0);
				setState(20);
				match(RPA);
				}
				break;
			case MINUS:
			case NOT:
				{
				_localctx = new UNARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				((UNARContext)_localctx).UNAR = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((UNARContext)_localctx).UNAR = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(23);
				exp(12);
				}
				break;
			case STRING:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(STRING);
				}
				break;
			case INT:
			case FLOAT:
				{
				_localctx = new NUMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				number();
				}
				break;
			case BOOL:
				{
				_localctx = new BOOLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(BOOL);
				}
				break;
			case NIL:
				{
				_localctx = new NILContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new DIVMULTContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(30);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(31);
						((DIVMULTContext)_localctx).OPERADOR = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MULT) ) {
							((DIVMULTContext)_localctx).OPERADOR = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(32);
						exp(12);
						}
						break;
					case 2:
						{
						_localctx = new MINUSContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(33);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(34);
						match(MINUS);
						setState(35);
						exp(11);
						}
						break;
					case 3:
						{
						_localctx = new ADDContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(36);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(37);
						match(ADD);
						setState(38);
						exp(10);
						}
						break;
					case 4:
						{
						_localctx = new RELContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(39);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(40);
						((RELContext)_localctx).RELACIONAL = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
							((RELContext)_localctx).RELACIONAL = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						exp(9);
						}
						break;
					case 5:
						{
						_localctx = new COMPContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(42);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(43);
						((COMPContext)_localctx).COMP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFERENTE) ) {
							((COMPContext)_localctx).COMP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						exp(8);
						}
						break;
					case 6:
						{
						_localctx = new ANDContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(45);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(46);
						match(AND);
						setState(47);
						exp(7);
						}
						break;
					case 7:
						{
						_localctx = new ORContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49);
						match(OR);
						setState(50);
						exp(6);
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(marParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(marParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u001d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b"+
		"\u0002\n\u0002\f\u00027\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000"+
		"\u0001\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u0005\u0002\u0000\t\t"+
		"\u0016\u0016\u0002\u0000\b\b\n\n\u0001\u0000\u000e\u0011\u0001\u0000\u0012"+
		"\u0013\u0001\u0000\f\rC\u0000\t\u0001\u0000\u0000\u0000\u0002\r\u0001"+
		"\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u00068\u0001\u0000"+
		"\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n"+
		"\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f"+
		"\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0005"+
		"\u0001\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0005"+
		"\u0002\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0006"+
		"\u0002\uffff\uffff\u0000\u0012\u0013\u0005\u0006\u0000\u0000\u0013\u0014"+
		"\u0003\u0004\u0002\u0000\u0014\u0015\u0005\u0007\u0000\u0000\u0015\u001d"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0007\u0000\u0000\u0000\u0017\u001d"+
		"\u0003\u0004\u0002\f\u0018\u001d\u0005\u0005\u0000\u0000\u0019\u001d\u0003"+
		"\u0006\u0003\u0000\u001a\u001d\u0005\u0003\u0000\u0000\u001b\u001d\u0005"+
		"\u0004\u0000\u0000\u001c\u0011\u0001\u0000\u0000\u0000\u001c\u0016\u0001"+
		"\u0000\u0000\u0000\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d5\u0001\u0000\u0000\u0000\u001e\u001f\n\u000b"+
		"\u0000\u0000\u001f \u0007\u0001\u0000\u0000 4\u0003\u0004\u0002\f!\"\n"+
		"\n\u0000\u0000\"#\u0005\t\u0000\u0000#4\u0003\u0004\u0002\u000b$%\n\t"+
		"\u0000\u0000%&\u0005\u000b\u0000\u0000&4\u0003\u0004\u0002\n\'(\n\b\u0000"+
		"\u0000()\u0007\u0002\u0000\u0000)4\u0003\u0004\u0002\t*+\n\u0007\u0000"+
		"\u0000+,\u0007\u0003\u0000\u0000,4\u0003\u0004\u0002\b-.\n\u0006\u0000"+
		"\u0000./\u0005\u0014\u0000\u0000/4\u0003\u0004\u0002\u000701\n\u0005\u0000"+
		"\u000012\u0005\u0015\u0000\u000024\u0003\u0004\u0002\u00063\u001e\u0001"+
		"\u0000\u0000\u00003!\u0001\u0000\u0000\u00003$\u0001\u0000\u0000\u0000"+
		"3\'\u0001\u0000\u0000\u00003*\u0001\u0000\u0000\u00003-\u0001\u0000\u0000"+
		"\u000030\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0007\u0004\u0000\u00009\u0007\u0001\u0000"+
		"\u0000\u0000\u0004\u000b\u001c35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}