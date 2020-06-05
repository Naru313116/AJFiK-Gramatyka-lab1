// Generated from StringOp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StringOpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LICZBA_DODATNIA=1, CIAG=2, ESC=3, KONKATENACJA=4, ROZNICA=5, WYLUSKIWANIE=6, 
		KAPITALIZACJA=7, DEKAPITALIZACJA=8, PRZESUNIECIE_PRAWO=9, PRZESUNIECIE_LEWO=10, 
		WhiteSpace=11, NewLine=12;
	public static final int
		RULE_wyrazenie = 0, RULE_prog = 1;
	public static final String[] ruleNames = {
		"wyrazenie", "prog"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'+'", "'-'", "'/'", "'^+'", "'^-'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LICZBA_DODATNIA", "CIAG", "ESC", "KONKATENACJA", "ROZNICA", "WYLUSKIWANIE", 
		"KAPITALIZACJA", "DEKAPITALIZACJA", "PRZESUNIECIE_PRAWO", "PRZESUNIECIE_LEWO", 
		"WhiteSpace", "NewLine"
	};
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
	public String getGrammarFileName() { return "StringOp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StringOpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
	 
		public WyrazenieContext() { }
		public void copyFrom(WyrazenieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CiagContext extends WyrazenieContext {
		public TerminalNode CIAG() { return getToken(StringOpParser.CIAG, 0); }
		public CiagContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterCiag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitCiag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitCiag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrzesunContext extends WyrazenieContext {
		public Token op;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode LICZBA_DODATNIA() { return getToken(StringOpParser.LICZBA_DODATNIA, 0); }
		public TerminalNode PRZESUNIECIE_PRAWO() { return getToken(StringOpParser.PRZESUNIECIE_PRAWO, 0); }
		public TerminalNode PRZESUNIECIE_LEWO() { return getToken(StringOpParser.PRZESUNIECIE_LEWO, 0); }
		public PrzesunContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterPrzesun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitPrzesun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitPrzesun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WielkoscContext extends WyrazenieContext {
		public Token op;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode KAPITALIZACJA() { return getToken(StringOpParser.KAPITALIZACJA, 0); }
		public TerminalNode DEKAPITALIZACJA() { return getToken(StringOpParser.DEKAPITALIZACJA, 0); }
		public WielkoscContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterWielkosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitWielkosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitWielkosc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyjmijContext extends WyrazenieContext {
		public Token op;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public List<TerminalNode> LICZBA_DODATNIA() { return getTokens(StringOpParser.LICZBA_DODATNIA); }
		public TerminalNode LICZBA_DODATNIA(int i) {
			return getToken(StringOpParser.LICZBA_DODATNIA, i);
		}
		public TerminalNode WYLUSKIWANIE() { return getToken(StringOpParser.WYLUSKIWANIE, 0); }
		public WyjmijContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterWyjmij(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitWyjmij(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitWyjmij(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperacjaContext extends WyrazenieContext {
		public Token op;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode KONKATENACJA() { return getToken(StringOpParser.KONKATENACJA, 0); }
		public TerminalNode ROZNICA() { return getToken(StringOpParser.ROZNICA, 0); }
		public OperacjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterOperacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitOperacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitOperacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wyrazenie);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KONKATENACJA:
			case ROZNICA:
				_localctx = new OperacjaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				((OperacjaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KONKATENACJA || _la==ROZNICA) ) {
					((OperacjaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(5);
				wyrazenie();
				setState(6);
				wyrazenie();
				}
				break;
			case PRZESUNIECIE_PRAWO:
			case PRZESUNIECIE_LEWO:
				_localctx = new PrzesunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				((PrzesunContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRZESUNIECIE_PRAWO || _la==PRZESUNIECIE_LEWO) ) {
					((PrzesunContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(9);
				wyrazenie();
				setState(10);
				match(LICZBA_DODATNIA);
				}
				break;
			case KAPITALIZACJA:
			case DEKAPITALIZACJA:
				_localctx = new WielkoscContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				((WielkoscContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KAPITALIZACJA || _la==DEKAPITALIZACJA) ) {
					((WielkoscContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(13);
				wyrazenie();
				}
				break;
			case WYLUSKIWANIE:
				_localctx = new WyjmijContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				((WyjmijContext)_localctx).op = match(WYLUSKIWANIE);
				setState(15);
				wyrazenie();
				setState(16);
				match(LICZBA_DODATNIA);
				setState(17);
				match(LICZBA_DODATNIA);
				}
				break;
			case CIAG:
				_localctx = new CiagContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(19);
				match(CIAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StringOpParser.EOF, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StringOpListener ) ((StringOpListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StringOpVisitor ) return ((StringOpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIAG) | (1L << KONKATENACJA) | (1L << ROZNICA) | (1L << WYLUSKIWANIE) | (1L << KAPITALIZACJA) | (1L << DEKAPITALIZACJA) | (1L << PRZESUNIECIE_PRAWO) | (1L << PRZESUNIECIE_LEWO))) != 0)) {
				{
				setState(22);
				wyrazenie();
				}
			}

			setState(25);
			match(EOF);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\36\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\27\n\2\3\3\5\3\32\n\3\3\3\3\3\3\3\2\2\4\2\4\2\5\3\2\6\7\3\2\13\f\3"+
		"\2\t\n\2 \2\26\3\2\2\2\4\31\3\2\2\2\6\7\t\2\2\2\7\b\5\2\2\2\b\t\5\2\2"+
		"\2\t\27\3\2\2\2\n\13\t\3\2\2\13\f\5\2\2\2\f\r\7\3\2\2\r\27\3\2\2\2\16"+
		"\17\t\4\2\2\17\27\5\2\2\2\20\21\7\b\2\2\21\22\5\2\2\2\22\23\7\3\2\2\23"+
		"\24\7\3\2\2\24\27\3\2\2\2\25\27\7\4\2\2\26\6\3\2\2\2\26\n\3\2\2\2\26\16"+
		"\3\2\2\2\26\20\3\2\2\2\26\25\3\2\2\2\27\3\3\2\2\2\30\32\5\2\2\2\31\30"+
		"\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\2\2\3\34\5\3\2\2\2\4\26\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}