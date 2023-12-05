// Generated from expr.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		INTEGERCONSTANT=46, STRINGCONSTANT=47, ID=48, BOPERATOR=49, WS=50;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_rulelse = 2, RULE_expr0 = 3, RULE_expr0bis = 4, 
		RULE_expr1 = 5, RULE_expr1bis = 6, RULE_expr2 = 7, RULE_expr2bis = 8, 
		RULE_expr3 = 9, RULE_expr3bis = 10, RULE_expr4 = 11, RULE_expr4bis = 12, 
		RULE_expr5 = 13, RULE_function = 14, RULE_types = 15, RULE_exprnegation = 16, 
		RULE_commentaire = 17, RULE_exprseq = 18, RULE_exprseqbis = 19, RULE_exprlist = 20, 
		RULE_exprlistbis = 21, RULE_fieldlist = 22, RULE_field = 23, RULE_fieldlistbis = 24, 
		RULE_idcall = 25, RULE_lvaluebis = 26, RULE_declaration = 27, RULE_typedeclaration = 28, 
		RULE_type = 29, RULE_typefields = 30, RULE_typefieldsbis = 31, RULE_typefield = 32, 
		RULE_typepredefined = 33, RULE_typeid = 34, RULE_variabledeclaration = 35, 
		RULE_variabledeclarationbis = 36, RULE_functiondeclaration = 37, RULE_functiondeclarationbis = 38, 
		RULE_print = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "rulelse", "expr0", "expr0bis", "expr1", "expr1bis", 
			"expr2", "expr2bis", "expr3", "expr3bis", "expr4", "expr4bis", "expr5", 
			"function", "types", "exprnegation", "commentaire", "exprseq", "exprseqbis", 
			"exprlist", "exprlistbis", "fieldlist", "field", "fieldlistbis", "idcall", 
			"lvaluebis", "declaration", "typedeclaration", "type", "typefields", 
			"typefieldsbis", "typefield", "typepredefined", "typeid", "variabledeclaration", 
			"variabledeclarationbis", "functiondeclaration", "functiondeclarationbis", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'do'", "'for'", "':='", "'to'", "'break'", 
			"'let'", "'in'", "'end'", "'else'", "'|'", "'&'", "'='", "'<>'", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'nil'", "'('", "')'", 
			"'['", "']'", "'of'", "'{'", "'}'", "'/*'", "'*/'", "';'", "','", "'.'", 
			"'type'", "'array of'", "':'", "'int'", "'string'", "'var'", "'function'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INTEGERCONSTANT", 
			"STRINGCONSTANT", "ID", "BOPERATOR", "WS"
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
	public String getGrammarFileName() { return "expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RulelseContext rulelse() {
			return getRuleContext(RulelseContext.class,0);
		}
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public CommentaireContext commentaire() {
			return getRuleContext(CommentaireContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__24:
			case T__25:
			case T__37:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expr0();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__0);
				setState(84);
				expr();
				setState(85);
				match(T__1);
				setState(86);
				expr();
				setState(87);
				rulelse();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__2);
				setState(90);
				expr();
				setState(91);
				match(T__3);
				setState(92);
				expr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				expr();
				setState(98);
				match(T__6);
				setState(99);
				expr();
				setState(100);
				match(T__3);
				setState(101);
				expr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(T__8);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					declaration();
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__42) | (1L << T__43))) != 0) );
				setState(110);
				match(T__9);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__32) | (1L << T__37) | (1L << T__44) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
					{
					setState(111);
					exprseq();
					}
				}

				setState(114);
				match(T__10);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				commentaire();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				print();
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

	public static class RulelseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RulelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulelse; }
	}

	public final RulelseContext rulelse() throws RecognitionException {
		RulelseContext _localctx = new RulelseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rulelse);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__11);
				setState(121);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr0bisContext expr0bis() {
			return getRuleContext(Expr0bisContext.class,0);
		}
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			expr1();
			setState(126);
			expr0bis();
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

	public static class Expr0bisContext extends ParserRuleContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Expr0bisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0bis; }
	}

	public final Expr0bisContext expr0bis() throws RecognitionException {
		Expr0bisContext _localctx = new Expr0bisContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr0bis);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__12);
				setState(129);
				expr0();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1bisContext expr1bis() {
			return getRuleContext(Expr1bisContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expr2();
			setState(134);
			expr1bis();
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

	public static class Expr1bisContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1bisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1bis; }
	}

	public final Expr1bisContext expr1bis() throws RecognitionException {
		Expr1bisContext _localctx = new Expr1bisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr1bis);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__13);
				setState(137);
				expr1();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr2bisContext expr2bis() {
			return getRuleContext(Expr2bisContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expr3();
			setState(142);
			expr2bis();
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

	public static class Expr2bisContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2bisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2bis; }
	}

	public final Expr2bisContext expr2bis() throws RecognitionException {
		Expr2bisContext _localctx = new Expr2bisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr2bis);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				expr2();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr3Context extends ParserRuleContext {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Expr3bisContext expr3bis() {
			return getRuleContext(Expr3bisContext.class,0);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expr4();
			setState(150);
			expr3bis();
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

	public static class Expr3bisContext extends ParserRuleContext {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr3bisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3bis; }
	}

	public final Expr3bisContext expr3bis() throws RecognitionException {
		Expr3bisContext _localctx = new Expr3bisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr3bis);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				expr3();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr4Context extends ParserRuleContext {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr4bisContext expr4bis() {
			return getRuleContext(Expr4bisContext.class,0);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expr5();
			setState(158);
			expr4bis();
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

	public static class Expr4bisContext extends ParserRuleContext {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Expr4bisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4bis; }
	}

	public final Expr4bisContext expr4bis() throws RecognitionException {
		Expr4bisContext _localctx = new Expr4bisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr4bis);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				expr4();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr5Context extends ParserRuleContext {
		public IdcallContext idcall() {
			return getRuleContext(IdcallContext.class,0);
		}
		public TerminalNode STRINGCONSTANT() { return getToken(exprParser.STRINGCONSTANT, 0); }
		public TerminalNode INTEGERCONSTANT() { return getToken(exprParser.INTEGERCONSTANT, 0); }
		public ExprnegationContext exprnegation() {
			return getRuleContext(ExprnegationContext.class,0);
		}
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr5);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				idcall();
				}
				break;
			case STRINGCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(STRINGCONSTANT);
				}
				break;
			case INTEGERCONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(INTEGERCONSTANT);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__24);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				exprnegation();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				typedeclaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(T__25);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__32) | (1L << T__37) | (1L << T__44) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
					{
					setState(172);
					exprseq();
					}
				}

				setState(175);
				match(T__26);
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

	public static class FunctionContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__25);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__32) | (1L << T__37) | (1L << T__44) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
				{
				setState(179);
				exprlist();
				}
			}

			setState(182);
			match(T__26);
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

	public static class TypesContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			typeid();
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(185);
				match(T__27);
				setState(186);
				expr();
				setState(187);
				match(T__28);
				setState(188);
				match(T__29);
				setState(189);
				expr();
				}
				break;
			case T__30:
				{
				setState(191);
				match(T__30);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(192);
					fieldlist();
					}
				}

				setState(195);
				match(T__31);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprnegationContext extends ParserRuleContext {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public ExprnegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprnegation; }
	}

	public final ExprnegationContext exprnegation() throws RecognitionException {
		ExprnegationContext _localctx = new ExprnegationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprnegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__21);
			setState(199);
			expr5();
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

	public static class CommentaireContext extends ParserRuleContext {
		public List<TerminalNode> STRINGCONSTANT() { return getTokens(exprParser.STRINGCONSTANT); }
		public TerminalNode STRINGCONSTANT(int i) {
			return getToken(exprParser.STRINGCONSTANT, i);
		}
		public CommentaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentaire; }
	}

	public final CommentaireContext commentaire() throws RecognitionException {
		CommentaireContext _localctx = new CommentaireContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commentaire);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__32);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGCONSTANT) {
				{
				{
				setState(202);
				match(STRINGCONSTANT);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(T__33);
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

	public static class ExprseqContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprseqbisContext exprseqbis() {
			return getRuleContext(ExprseqbisContext.class,0);
		}
		public ExprseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprseq; }
	}

	public final ExprseqContext exprseq() throws RecognitionException {
		ExprseqContext _localctx = new ExprseqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expr();
			setState(211);
			exprseqbis();
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

	public static class ExprseqbisContext extends ParserRuleContext {
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public ExprseqbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprseqbis; }
	}

	public final ExprseqbisContext exprseqbis() throws RecognitionException {
		ExprseqbisContext _localctx = new ExprseqbisContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprseqbis);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__34);
				setState(214);
				exprseq();
				}
				break;
			case T__10:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprlistContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlistbisContext exprlistbis() {
			return getRuleContext(ExprlistbisContext.class,0);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expr();
			setState(219);
			exprlistbis();
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

	public static class ExprlistbisContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlistbisContext exprlistbis() {
			return getRuleContext(ExprlistbisContext.class,0);
		}
		public ExprlistbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlistbis; }
	}

	public final ExprlistbisContext exprlistbis() throws RecognitionException {
		ExprlistbisContext _localctx = new ExprlistbisContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprlistbis);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__35);
				setState(222);
				expr();
				setState(223);
				exprlistbis();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FieldlistContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldlistbisContext fieldlistbis() {
			return getRuleContext(FieldlistbisContext.class,0);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fieldlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			field();
			setState(229);
			fieldlistbis();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			setState(232);
			match(T__14);
			setState(233);
			expr();
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

	public static class FieldlistbisContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldlistbisContext fieldlistbis() {
			return getRuleContext(FieldlistbisContext.class,0);
		}
		public FieldlistbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlistbis; }
	}

	public final FieldlistbisContext fieldlistbis() throws RecognitionException {
		FieldlistbisContext _localctx = new FieldlistbisContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldlistbis);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__35);
				setState(236);
				field();
				setState(237);
				fieldlistbis();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public LvaluebisContext lvaluebis() {
			return getRuleContext(LvaluebisContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IdcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idcall; }
	}

	public final IdcallContext idcall() throws RecognitionException {
		IdcallContext _localctx = new IdcallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__27:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__42:
			case T__43:
				{
				setState(243);
				lvaluebis();
				}
				break;
			case T__25:
				{
				setState(244);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LvaluebisContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public LvaluebisContext lvaluebis() {
			return getRuleContext(LvaluebisContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LvaluebisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvaluebis; }
	}

	public final LvaluebisContext lvaluebis() throws RecognitionException {
		LvaluebisContext _localctx = new LvaluebisContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lvaluebis);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__36);
				setState(248);
				match(ID);
				setState(249);
				lvaluebis();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__27);
				setState(251);
				expr();
				setState(252);
				match(T__28);
				setState(253);
				lvaluebis();
				}
				break;
			case EOF:
			case T__1:
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__28:
			case T__31:
			case T__34:
			case T__35:
			case T__37:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				typedeclaration();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				variabledeclaration();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				functiondeclaration();
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

	public static class TypedeclarationContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclaration; }
	}

	public final TypedeclarationContext typedeclaration() throws RecognitionException {
		TypedeclarationContext _localctx = new TypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__37);
			setState(264);
			typeid();
			setState(265);
			match(T__14);
			setState(266);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				typeid();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__30);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(270);
					typefields();
					}
				}

				setState(273);
				match(T__31);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__38);
				setState(275);
				typeid();
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

	public static class TypefieldsContext extends ParserRuleContext {
		public TypefieldContext typefield() {
			return getRuleContext(TypefieldContext.class,0);
		}
		public TypefieldsbisContext typefieldsbis() {
			return getRuleContext(TypefieldsbisContext.class,0);
		}
		public TypefieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefields; }
	}

	public final TypefieldsContext typefields() throws RecognitionException {
		TypefieldsContext _localctx = new TypefieldsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typefields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			typefield();
			setState(279);
			typefieldsbis();
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

	public static class TypefieldsbisContext extends ParserRuleContext {
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypefieldsbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefieldsbis; }
	}

	public final TypefieldsbisContext typefieldsbis() throws RecognitionException {
		TypefieldsbisContext _localctx = new TypefieldsbisContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typefieldsbis);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__35);
				setState(282);
				typefields();
				}
				break;
			case T__26:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypefieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefield; }
	}

	public final TypefieldContext typefield() throws RecognitionException {
		TypefieldContext _localctx = new TypefieldContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			match(T__39);
			setState(288);
			typeid();
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

	public static class TypepredefinedContext extends ParserRuleContext {
		public TypepredefinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typepredefined; }
	}

	public final TypepredefinedContext typepredefined() throws RecognitionException {
		TypepredefinedContext _localctx = new TypepredefinedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typepredefined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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

	public static class TypeidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TypepredefinedContext typepredefined() {
			return getRuleContext(TypepredefinedContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeid);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(ID);
				}
				break;
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				typepredefined();
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public VariabledeclarationbisContext variabledeclarationbis() {
			return getRuleContext(VariabledeclarationbisContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__42);
			setState(297);
			match(ID);
			setState(298);
			variabledeclarationbis();
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

	public static class VariabledeclarationbisContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariabledeclarationbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarationbis; }
	}

	public final VariabledeclarationbisContext variabledeclarationbis() throws RecognitionException {
		VariabledeclarationbisContext _localctx = new VariabledeclarationbisContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variabledeclarationbis);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__39);
				setState(301);
				typeid();
				setState(302);
				match(T__5);
				setState(303);
				expr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__5);
				setState(306);
				expr();
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public FunctiondeclarationbisContext functiondeclarationbis() {
			return getRuleContext(FunctiondeclarationbisContext.class,0);
		}
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__43);
			setState(310);
			match(ID);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(311);
				match(T__25);
				setState(312);
				typefields();
				setState(313);
				match(T__26);
				}
			}

			setState(317);
			functiondeclarationbis();
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

	public static class FunctiondeclarationbisContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FunctiondeclarationbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclarationbis; }
	}

	public final FunctiondeclarationbisContext functiondeclarationbis() throws RecognitionException {
		FunctiondeclarationbisContext _localctx = new FunctiondeclarationbisContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functiondeclarationbis);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__14);
				setState(320);
				expr();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__39);
				setState(322);
				typeid();
				setState(323);
				match(T__14);
				setState(324);
				expr();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode INTEGERCONSTANT() { return getToken(exprParser.INTEGERCONSTANT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__44);
			setState(329);
			match(T__25);
			setState(330);
			match(INTEGERCONSTANT);
			setState(331);
			match(T__26);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3m\n\3\r\3\16\3n\3\3\3\3\5\3s\n\3\3\3\3\3\3\3\3"+
		"\3\5\3y\n\3\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u0086\n\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0096"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\u00a6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0"+
		"\n\17\3\17\5\17\u00b3\n\17\3\20\3\20\5\20\u00b7\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\21\5\21\u00c7"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00db\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00e5\n\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00f3\n\32\3\33\3\33\3\33\5\33\u00f8"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0103\n\34\3\35"+
		"\3\35\3\35\5\35\u0108\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u0112\n\37\3\37\3\37\3\37\5\37\u0117\n\37\3 \3 \3 \3!\3!\3!\5!\u011f"+
		"\n!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\5$\u0129\n$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0136\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u013e\n\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u0149\n(\3)\3)\3)\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\6\3\2\21\26"+
		"\3\2\27\30\3\2\31\32\3\2+,\2\u0151\2R\3\2\2\2\4x\3\2\2\2\6}\3\2\2\2\b"+
		"\177\3\2\2\2\n\u0085\3\2\2\2\f\u0087\3\2\2\2\16\u008d\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3"+
		"\2\2\2\32\u00a5\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4\3\2\2\2 \u00ba\3\2\2"+
		"\2\"\u00c8\3\2\2\2$\u00cb\3\2\2\2&\u00d4\3\2\2\2(\u00da\3\2\2\2*\u00dc"+
		"\3\2\2\2,\u00e4\3\2\2\2.\u00e6\3\2\2\2\60\u00e9\3\2\2\2\62\u00f2\3\2\2"+
		"\2\64\u00f4\3\2\2\2\66\u0102\3\2\2\28\u0107\3\2\2\2:\u0109\3\2\2\2<\u0116"+
		"\3\2\2\2>\u0118\3\2\2\2@\u011e\3\2\2\2B\u0120\3\2\2\2D\u0124\3\2\2\2F"+
		"\u0128\3\2\2\2H\u012a\3\2\2\2J\u0135\3\2\2\2L\u0137\3\2\2\2N\u0148\3\2"+
		"\2\2P\u014a\3\2\2\2RS\5\4\3\2S\3\3\2\2\2Ty\5\b\5\2UV\7\3\2\2VW\5\4\3\2"+
		"WX\7\4\2\2XY\5\4\3\2YZ\5\6\4\2Zy\3\2\2\2[\\\7\5\2\2\\]\5\4\3\2]^\7\6\2"+
		"\2^_\5\4\3\2_y\3\2\2\2`a\7\7\2\2ab\7\62\2\2bc\7\b\2\2cd\5\4\3\2de\7\t"+
		"\2\2ef\5\4\3\2fg\7\6\2\2gh\5\4\3\2hy\3\2\2\2iy\7\n\2\2jl\7\13\2\2km\5"+
		"8\35\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\f\2\2qs\5"+
		"&\24\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\r\2\2uy\3\2\2\2vy\5$\23\2wy\5"+
		"P)\2xT\3\2\2\2xU\3\2\2\2x[\3\2\2\2x`\3\2\2\2xi\3\2\2\2xj\3\2\2\2xv\3\2"+
		"\2\2xw\3\2\2\2y\5\3\2\2\2z{\7\16\2\2{~\5\4\3\2|~\3\2\2\2}z\3\2\2\2}|\3"+
		"\2\2\2~\7\3\2\2\2\177\u0080\5\f\7\2\u0080\u0081\5\n\6\2\u0081\t\3\2\2"+
		"\2\u0082\u0083\7\17\2\2\u0083\u0086\5\b\5\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0084\3\2\2\2\u0086\13\3\2\2\2\u0087\u0088\5\20\t"+
		"\2\u0088\u0089\5\16\b\2\u0089\r\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008e"+
		"\5\f\7\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\17\3\2\2\2\u008f\u0090\5\24\13\2\u0090\u0091\5\22\n\2\u0091\21\3\2\2"+
		"\2\u0092\u0093\t\2\2\2\u0093\u0096\5\20\t\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\5\30\r"+
		"\2\u0098\u0099\5\26\f\2\u0099\25\3\2\2\2\u009a\u009b\t\3\2\2\u009b\u009e"+
		"\5\24\13\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\27\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\5\32\16\2\u00a1\31"+
		"\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a6\5\30\r\2\u00a4\u00a6\3\2\2\2"+
		"\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00b3"+
		"\5\64\33\2\u00a8\u00b3\7\61\2\2\u00a9\u00b3\7\60\2\2\u00aa\u00b3\7\33"+
		"\2\2\u00ab\u00b3\5\"\22\2\u00ac\u00b3\5:\36\2\u00ad\u00af\7\34\2\2\u00ae"+
		"\u00b0\5&\24\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\7\35\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b6\7\34\2\2\u00b5\u00b7"+
		"\5*\26\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\7\35\2\2\u00b9\37\3\2\2\2\u00ba\u00c6\5F$\2\u00bb\u00bc\7\36\2"+
		"\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\37\2\2\u00be\u00bf\7 \2\2\u00bf\u00c0"+
		"\5\4\3\2\u00c0\u00c7\3\2\2\2\u00c1\u00c3\7!\2\2\u00c2\u00c4\5.\30\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\""+
		"\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9"+
		"\7\30\2\2\u00c9\u00ca\5\34\17\2\u00ca#\3\2\2\2\u00cb\u00cf\7#\2\2\u00cc"+
		"\u00ce\7\61\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7$\2\2\u00d3%\3\2\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\5(\25\2\u00d6"+
		"\'\3\2\2\2\u00d7\u00d8\7%\2\2\u00d8\u00db\5&\24\2\u00d9\u00db\3\2\2\2"+
		"\u00da\u00d7\3\2\2\2\u00da\u00d9\3\2\2\2\u00db)\3\2\2\2\u00dc\u00dd\5"+
		"\4\3\2\u00dd\u00de\5,\27\2\u00de+\3\2\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1"+
		"\5\4\3\2\u00e1\u00e2\5,\27\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5-\3\2\2\2\u00e6\u00e7\5\60\31"+
		"\2\u00e7\u00e8\5\62\32\2\u00e8/\3\2\2\2\u00e9\u00ea\7\62\2\2\u00ea\u00eb"+
		"\7\21\2\2\u00eb\u00ec\5\4\3\2\u00ec\61\3\2\2\2\u00ed\u00ee\7&\2\2\u00ee"+
		"\u00ef\5\60\31\2\u00ef\u00f0\5\62\32\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\63\3\2\2\2\u00f4"+
		"\u00f7\7\62\2\2\u00f5\u00f8\5\66\34\2\u00f6\u00f8\5\36\20\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\65\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa"+
		"\u00fb\7\62\2\2\u00fb\u0103\5\66\34\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe"+
		"\5\4\3\2\u00fe\u00ff\7\37\2\2\u00ff\u0100\5\66\34\2\u0100\u0103\3\2\2"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\67\3\2\2\2\u0104\u0108\5:\36\2\u0105\u0108\5H%\2\u0106"+
		"\u0108\5L\'\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u01089\3\2\2\2\u0109\u010a\7(\2\2\u010a\u010b\5F$\2\u010b\u010c\7"+
		"\21\2\2\u010c\u010d\5<\37\2\u010d;\3\2\2\2\u010e\u0117\5F$\2\u010f\u0111"+
		"\7!\2\2\u0110\u0112\5> \2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0117\7\"\2\2\u0114\u0115\7)\2\2\u0115\u0117\5F$"+
		"\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0114\3\2\2\2\u0117="+
		"\3\2\2\2\u0118\u0119\5B\"\2\u0119\u011a\5@!\2\u011a?\3\2\2\2\u011b\u011c"+
		"\7&\2\2\u011c\u011f\5> \2\u011d\u011f\3\2\2\2\u011e\u011b\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011fA\3\2\2\2\u0120\u0121\7\62\2\2\u0121\u0122\7*\2\2"+
		"\u0122\u0123\5F$\2\u0123C\3\2\2\2\u0124\u0125\t\5\2\2\u0125E\3\2\2\2\u0126"+
		"\u0129\7\62\2\2\u0127\u0129\5D#\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129G\3\2\2\2\u012a\u012b\7-\2\2\u012b\u012c\7\62\2\2\u012c\u012d"+
		"\5J&\2\u012dI\3\2\2\2\u012e\u012f\7*\2\2\u012f\u0130\5F$\2\u0130\u0131"+
		"\7\b\2\2\u0131\u0132\5\4\3\2\u0132\u0136\3\2\2\2\u0133\u0134\7\b\2\2\u0134"+
		"\u0136\5\4\3\2\u0135\u012e\3\2\2\2\u0135\u0133\3\2\2\2\u0136K\3\2\2\2"+
		"\u0137\u0138\7.\2\2\u0138\u013d\7\62\2\2\u0139\u013a\7\34\2\2\u013a\u013b"+
		"\5> \2\u013b\u013c\7\35\2\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5N(\2\u0140M\3\2\2\2\u0141"+
		"\u0142\7\21\2\2\u0142\u0149\5\4\3\2\u0143\u0144\7*\2\2\u0144\u0145\5F"+
		"$\2\u0145\u0146\7\21\2\2\u0146\u0147\5\4\3\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0141\3\2\2\2\u0148\u0143\3\2\2\2\u0149O\3\2\2\2\u014a\u014b\7/\2\2\u014b"+
		"\u014c\7\34\2\2\u014c\u014d\7\60\2\2\u014d\u014e\7\35\2\2\u014eQ\3\2\2"+
		"\2\36nrx}\u0085\u008d\u0095\u009d\u00a5\u00af\u00b2\u00b6\u00c3\u00c6"+
		"\u00cf\u00da\u00e4\u00f2\u00f7\u0102\u0107\u0111\u0116\u011e\u0128\u0135"+
		"\u013d\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}