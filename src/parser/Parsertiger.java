// Generated from Parsertiger.g4 by ANTLR 4.9.2

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
public class Parsertiger extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			POINT=1, POINTV=2, VIRG=3, DPT=4, PAOUV=5, PAFER=6, CROUV=7, CRFER=8,
			CAOUV=9, CAFER=10, DIF=11, EGAL=12, DPTEG=13, INFEG=14, INF=15, SUP=16,
			SUPEG=17, PLUS=18, NEG=19, OU=20, ET=21, MUL=22, DIV=23, NIL=24, BREAK=25,
			FOR=26, THEN=27, END=28, IN=29, LET=30, VAR=31, IF=32, ELSE=33, OF=34,
			ARROF=35, WHILE=36, PRINT=37, DO=38, TO=39, TYPE=40, FCT=41, INT=42, STR=43,
			INTEGERCONSTANT=44, STRINGCONSTANT=45, ID=46, BOPERATOR=47, WS=48, COMMENT=49;
	public static final int
			RULE_program = 0, RULE_expr0 = 1, RULE_expr1 = 2, RULE_expr2 = 3, RULE_expr3 = 4,
			RULE_expr4 = 5, RULE_expr5 = 6, RULE_expr = 7, RULE_print = 8, RULE_rulelse = 9,
			RULE_declaration = 10, RULE_function = 11, RULE_functiondeclaration = 12,
			RULE_functiondeclarationbis = 13, RULE_exprnegation = 14, RULE_exprseq = 15,
			RULE_exprseqbis = 16, RULE_exprlist = 17, RULE_exprlistbis = 18, RULE_fieldlist = 19,
			RULE_field = 20, RULE_fieldlistbis = 21, RULE_idcall = 22, RULE_lvaluebis = 23,
			RULE_types = 24, RULE_typedeclaration = 25, RULE_type = 26, RULE_typefields = 27,
			RULE_typefieldsbis = 28, RULE_typefield = 29, RULE_typepredefined = 30,
			RULE_typeid = 31, RULE_variabledeclaration = 32, RULE_variabledeclarationbis = 33;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "expr0", "expr1", "expr2", "expr3", "expr4", "expr5", "expr",
				"print", "rulelse", "declaration", "function", "functiondeclaration",
				"functiondeclarationbis", "exprnegation", "exprseq", "exprseqbis", "exprlist",
				"exprlistbis", "fieldlist", "field", "fieldlistbis", "idcall", "lvaluebis",
				"types", "typedeclaration", "type", "typefields", "typefieldsbis", "typefield",
				"typepredefined", "typeid", "variabledeclaration", "variabledeclarationbis"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'.'", "';'", "','", "':'", "'('", "')'", "'{'", "'}'", "'['",
				"']'", "'<>'", "'='", "':='", "'>='", "'>'", "'<'", "'<='", "'+'", "'-'",
				"'|'", "'&'", "'*'", "'/'", "'nil'", "'break'", "'for'", "'then'", "'end'",
				"'in'", "'let'", "'var'", "'if'", "'else'", "'of'", "'array of'", "'while'",
				"'print'", "'do'", "'to'", "'type'", "'function'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "POINT", "POINTV", "VIRG", "DPT", "PAOUV", "PAFER", "CROUV", "CRFER",
				"CAOUV", "CAFER", "DIF", "EGAL", "DPTEG", "INFEG", "INF", "SUP", "SUPEG",
				"PLUS", "NEG", "OU", "ET", "MUL", "DIV", "NIL", "BREAK", "FOR", "THEN",
				"END", "IN", "LET", "VAR", "IF", "ELSE", "OF", "ARROF", "WHILE", "PRINT",
				"DO", "TO", "TYPE", "FCT", "INT", "STR", "INTEGERCONSTANT", "STRINGCONSTANT",
				"ID", "BOPERATOR", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Parsertiger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parsertiger(TokenStream input) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(68);
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

	public static class Expr0Context extends ParserRuleContext {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public List<TerminalNode> OU() { return getTokens(Parsertiger.OU); }
		public TerminalNode OU(int i) {
			return getToken(Parsertiger.OU, i);
		}
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExpr0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				expr1();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OU) {
					{
						{
							setState(71);
							match(OU);
							setState(72);
							expr1();
						}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expr1Context extends ParserRuleContext {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public List<TerminalNode> ET() { return getTokens(Parsertiger.ET); }
		public TerminalNode ET(int i) {
			return getToken(Parsertiger.ET, i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(78);
				expr2();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ET) {
					{
						{
							setState(79);
							match(ET);
							setState(80);
							expr2();
						}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expr2Context extends ParserRuleContext {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode EGAL() { return getToken(Parsertiger.EGAL, 0); }
		public TerminalNode DIF() { return getToken(Parsertiger.DIF, 0); }
		public TerminalNode INF() { return getToken(Parsertiger.INF, 0); }
		public TerminalNode SUP() { return getToken(Parsertiger.SUP, 0); }
		public TerminalNode INFEG() { return getToken(Parsertiger.INFEG, 0); }
		public TerminalNode SUPEG() { return getToken(Parsertiger.SUPEG, 0); }
		public TerminalNode DPTEG() { return getToken(Parsertiger.DPTEG, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(86);
				expr3();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIF) | (1L << EGAL) | (1L << DPTEG) | (1L << INFEG) | (1L << INF) | (1L << SUP) | (1L << SUPEG))) != 0)) {
					{
						setState(87);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIF) | (1L << EGAL) | (1L << DPTEG) | (1L << INFEG) | (1L << INF) | (1L << SUP) | (1L << SUPEG))) != 0)) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr3();
					}
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

	public static class Expr3Context extends ParserRuleContext {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Parsertiger.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Parsertiger.PLUS, i);
		}
		public List<TerminalNode> NEG() { return getTokens(Parsertiger.NEG); }
		public TerminalNode NEG(int i) {
			return getToken(Parsertiger.NEG, i);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				expr4();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==NEG) {
					{
						{
							setState(92);
							_la = _input.LA(1);
							if ( !(_la==PLUS || _la==NEG) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(93);
							expr4();
						}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expr4Context extends ParserRuleContext {
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(Parsertiger.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(Parsertiger.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Parsertiger.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Parsertiger.DIV, i);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				expr5();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL || _la==DIV) {
					{
						{
							setState(100);
							_la = _input.LA(1);
							if ( !(_la==MUL || _la==DIV) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(101);
							expr5();
						}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Expr5Context extends ParserRuleContext {
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }

		public Expr5Context() { }
		public void copyFrom(Expr5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdcalContext extends Expr5Context {
		public IdcallContext idcall() {
			return getRuleContext(IdcallContext.class,0);
		}
		public IdcalContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitIdcal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilContext extends Expr5Context {
		public TerminalNode NIL() { return getToken(Parsertiger.NIL, 0); }
		public NilContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegContext extends Expr5Context {
		public ExprnegationContext exprnegation() {
			return getRuleContext(ExprnegationContext.class,0);
		}
		public NegContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypDecContext extends Expr5Context {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public TypDecContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends Expr5Context {
		public TerminalNode INTEGERCONSTANT() { return getToken(Parsertiger.INTEGERCONSTANT, 0); }
		public InContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSeqContext extends Expr5Context {
		public TerminalNode PAOUV() { return getToken(Parsertiger.PAOUV, 0); }
		public TerminalNode PAFER() { return getToken(Parsertiger.PAFER, 0); }
		public ExprsContext exprseq() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ExprSeqContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrinContext extends Expr5Context {
		public TerminalNode STRINGCONSTANT() { return getToken(Parsertiger.STRINGCONSTANT, 0); }
		public StrinContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitStrin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr5);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					_localctx = new IdcalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(107);
					idcall();
				}
				break;
				case STRINGCONSTANT:
					_localctx = new StrinContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(108);
					match(STRINGCONSTANT);
				}
				break;
				case INTEGERCONSTANT:
					_localctx = new InContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(109);
					match(INTEGERCONSTANT);
				}
				break;
				case NIL:
					_localctx = new NilContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(110);
					match(NIL);
				}
				break;
				case NEG:
					_localctx = new NegContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(111);
					exprnegation();
				}
				break;
				case TYPE:
					_localctx = new TypDecContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(112);
					typedeclaration();
				}
				break;
				case PAOUV:
					_localctx = new ExprSeqContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(113);
					match(PAOUV);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAOUV) | (1L << NEG) | (1L << NIL) | (1L << BREAK) | (1L << FOR) | (1L << LET) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << TYPE) | (1L << INT) | (1L << STR) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
						{
							setState(114);
							exprseq();
						}
					}

					setState(117);
					match(PAFER);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrtContext extends ExprContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitPrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ExprContext {
		public TerminalNode FOR() { return getToken(Parsertiger.FOR, 0); }
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public TerminalNode DPTEG() { return getToken(Parsertiger.DPTEG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(Parsertiger.TO, 0); }
		public TerminalNode DO() { return getToken(Parsertiger.DO, 0); }
		public ForContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends ExprContext {
		public TerminalNode BREAK() { return getToken(Parsertiger.BREAK, 0); }
		public BreakContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCContext extends ExprContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ExprCContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExprContext {
		public TerminalNode LET() { return getToken(Parsertiger.LET, 0); }
		public TerminalNode IN() { return getToken(Parsertiger.IN, 0); }
		public TerminalNode END() { return getToken(Parsertiger.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ExprsContext exprseq() {
			return getRuleContext(ExprsContext.class,0);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypContext extends ExprContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTyp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(Parsertiger.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(Parsertiger.DO, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenContext extends ExprContext {
		public TerminalNode IF() { return getToken(Parsertiger.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Parsertiger.THEN, 0); }
		public RulelseContext rulelse() {
			return getRuleContext(RulelseContext.class,0);
		}
		public IfThenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					_localctx = new ExprCContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(120);
					expr0();
				}
				break;
				case 2:
					_localctx = new IfThenContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(121);
					match(IF);
					setState(122);
					expr();
					setState(123);
					match(THEN);
					setState(124);
					expr();
					setState(125);
					rulelse();
				}
				break;
				case 3:
					_localctx = new WhileContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(127);
					match(WHILE);
					setState(128);
					expr();
					setState(129);
					match(DO);
					setState(130);
					expr();
				}
				break;
				case 4:
					_localctx = new ForContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(132);
					match(FOR);
					setState(133);
					match(ID);
					setState(134);
					match(DPTEG);
					setState(135);
					expr();
					setState(136);
					match(TO);
					setState(137);
					expr();
					setState(138);
					match(DO);
					setState(139);
					expr();
				}
				break;
				case 5:
					_localctx = new BreakContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(141);
					match(BREAK);
				}
				break;
				case 6:
					_localctx = new LetContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(142);
					match(LET);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(143);
								declaration();
							}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TYPE) | (1L << FCT))) != 0) );
					setState(148);
					match(IN);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAOUV) | (1L << NEG) | (1L << NIL) | (1L << BREAK) | (1L << FOR) | (1L << LET) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << TYPE) | (1L << INT) | (1L << STR) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
						{
							setState(149);
							exprseq();
						}
					}

					setState(152);
					match(END);
				}
				break;
				case 7:
					_localctx = new PrtContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(154);
					print();
				}
				break;
				case 8:
					_localctx = new TypContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(155);
					types();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Parsertiger.PRINT, 0); }
		public TerminalNode PAOUV() { return getToken(Parsertiger.PAOUV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAFER() { return getToken(Parsertiger.PAFER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				match(PRINT);
				setState(159);
				match(PAOUV);
				setState(160);
				expr();
				setState(161);
				match(PAFER);
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
		public RulelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulelse; }

		public RulelseContext() { }
		public void copyFrom(RulelseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseContext extends RulelseContext {
		public TerminalNode ELSE() { return getToken(Parsertiger.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseContext(RulelseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VideContext extends RulelseContext {
		public VideContext(RulelseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulelseContext rulelse() throws RecognitionException {
		RulelseContext _localctx = new RulelseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rulelse);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					_localctx = new ElseContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(163);
					match(ELSE);
					setState(164);
					expr();
				}
				break;
				case 2:
					_localctx = new VideContext(_localctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }

		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeDecContext extends DeclarationContext {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public TypeDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypeDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecContext extends DeclarationContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public VarDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDecContext extends DeclarationContext {
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public FuncDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case TYPE:
					_localctx = new TypeDecContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(168);
					typedeclaration();
				}
				break;
				case VAR:
					_localctx = new VarDecContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(169);
					variabledeclaration();
				}
				break;
				case FCT:
					_localctx = new FuncDecContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(170);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }

		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctioContext extends FunctionContext {
		public TerminalNode PAOUV() { return getToken(Parsertiger.PAOUV, 0); }
		public TerminalNode PAFER() { return getToken(Parsertiger.PAFER, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public FunctioContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFunctio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			_localctx = new FunctioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				match(PAOUV);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAOUV) | (1L << NEG) | (1L << NIL) | (1L << BREAK) | (1L << FOR) | (1L << LET) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << TYPE) | (1L << INT) | (1L << STR) | (1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << ID))) != 0)) {
					{
						setState(174);
						exprlist();
					}
				}

				setState(177);
				match(PAFER);
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
		public TerminalNode FCT() { return getToken(Parsertiger.FCT, 0); }
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public TerminalNode PAOUV() { return getToken(Parsertiger.PAOUV, 0); }
		public TerminalNode PAFER() { return getToken(Parsertiger.PAFER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				match(FCT);
				setState(180);
				match(ID);
				setState(181);
				match(PAOUV);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
						setState(182);
						typefields();
					}
				}

				setState(185);
				match(PAFER);
				setState(186);
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
		public FunctiondeclarationbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclarationbis; }

		public FunctiondeclarationbisContext() { }
		public void copyFrom(FunctiondeclarationbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EgalContext extends FunctiondeclarationbisContext {
		public TerminalNode EGAL() { return getToken(Parsertiger.EGAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EgalContext(FunctiondeclarationbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitEgal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypegalContext extends FunctiondeclarationbisContext {
		public TerminalNode DPT() { return getToken(Parsertiger.DPT, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode EGAL() { return getToken(Parsertiger.EGAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypegalContext(FunctiondeclarationbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypegal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationbisContext functiondeclarationbis() throws RecognitionException {
		FunctiondeclarationbisContext _localctx = new FunctiondeclarationbisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functiondeclarationbis);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case EGAL:
					_localctx = new EgalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(188);
					match(EGAL);
					setState(189);
					expr();
				}
				break;
				case DPT:
					_localctx = new TypegalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(190);
					match(DPT);
					setState(191);
					typeid();
					setState(192);
					match(EGAL);
					setState(193);
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

	public static class ExprnegationContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(Parsertiger.NEG, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public ExprnegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprnegation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprnegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprnegationContext exprnegation() throws RecognitionException {
		ExprnegationContext _localctx = new ExprnegationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprnegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(197);
				match(NEG);
				setState(198);
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

	public static class ExprsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprseqbisContext exprseqbis() {
			return getRuleContext(ExprseqbisContext.class,0);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprseq() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(200);
				expr();
				setState(201);
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
		public ExprseqbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprseqbis; }

		public ExprseqbisContext() { }
		public void copyFrom(ExprseqbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PointexprContext extends ExprseqbisContext {
		public TerminalNode POINTV() { return getToken(Parsertiger.POINTV, 0); }
		public ExprsContext exprseq() {
			return getRuleContext(ExprsContext.class,0);
		}
		public PointexprContext(ExprseqbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitPointexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nul1Context extends ExprseqbisContext {
		public Nul1Context(ExprseqbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNul1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprseqbisContext exprseqbis() throws RecognitionException {
		ExprseqbisContext _localctx = new ExprseqbisContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprseqbis);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case POINTV:
					_localctx = new PointexprContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(203);
					match(POINTV);
					setState(204);
					exprseq();
				}
				break;
				case PAFER:
				case END:
					_localctx = new Nul1Context(_localctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(208);
				expr();
				setState(209);
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
		public ExprlistbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlistbis; }

		public ExprlistbisContext() { }
		public void copyFrom(ExprlistbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprlisbisContext extends ExprlistbisContext {
		public TerminalNode VIRG() { return getToken(Parsertiger.VIRG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlistbisContext exprlistbis() {
			return getRuleContext(ExprlistbisContext.class,0);
		}
		public ExprlisbisContext(ExprlistbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitExprlisbis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nul2Context extends ExprlistbisContext {
		public Nul2Context(ExprlistbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNul2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistbisContext exprlistbis() throws RecognitionException {
		ExprlistbisContext _localctx = new ExprlistbisContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprlistbis);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VIRG:
					_localctx = new ExprlisbisContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(211);
					match(VIRG);
					setState(212);
					expr();
					setState(213);
					exprlistbis();
				}
				break;
				case PAFER:
					_localctx = new Nul2Context(_localctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fieldlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(218);
				field();
				setState(219);
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
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public TerminalNode EGAL() { return getToken(Parsertiger.EGAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(221);
				match(ID);
				setState(222);
				match(EGAL);
				setState(223);
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
		public FieldlistbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlistbis; }

		public FieldlistbisContext() { }
		public void copyFrom(FieldlistbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldlisbisContext extends FieldlistbisContext {
		public TerminalNode VIRG() { return getToken(Parsertiger.VIRG, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldlistbisContext fieldlistbis() {
			return getRuleContext(FieldlistbisContext.class,0);
		}
		public FieldlisbisContext(FieldlistbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitFieldlisbis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nul3Context extends FieldlistbisContext {
		public Nul3Context(FieldlistbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNul3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistbisContext fieldlistbis() throws RecognitionException {
		FieldlistbisContext _localctx = new FieldlistbisContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldlistbis);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VIRG:
					_localctx = new FieldlisbisContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(225);
					match(VIRG);
					setState(226);
					field();
					setState(227);
					fieldlistbis();
				}
				break;
				case CRFER:
					_localctx = new Nul3Context(_localctx);
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
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitIdcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdcallContext idcall() throws RecognitionException {
		IdcallContext _localctx = new IdcallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(232);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case EOF:
					case POINT:
					case POINTV:
					case VIRG:
					case PAFER:
					case CRFER:
					case CAOUV:
					case CAFER:
					case DIF:
					case EGAL:
					case DPTEG:
					case INFEG:
					case INF:
					case SUP:
					case SUPEG:
					case PLUS:
					case NEG:
					case OU:
					case ET:
					case MUL:
					case DIV:
					case THEN:
					case END:
					case IN:
					case VAR:
					case ELSE:
					case DO:
					case TO:
					case TYPE:
					case FCT:
					{
						setState(233);
						lvaluebis();
					}
					break;
					case PAOUV:
					{
						setState(234);
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
		public LvaluebisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvaluebis; }

		public LvaluebisContext() { }
		public void copyFrom(LvaluebisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PointidContext extends LvaluebisContext {
		public TerminalNode POINT() { return getToken(Parsertiger.POINT, 0); }
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public LvaluebisContext lvaluebis() {
			return getRuleContext(LvaluebisContext.class,0);
		}
		public PointidContext(LvaluebisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitPointid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CroexprContext extends LvaluebisContext {
		public TerminalNode CAOUV() { return getToken(Parsertiger.CAOUV, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CAFER() { return getToken(Parsertiger.CAFER, 0); }
		public LvaluebisContext lvaluebis() {
			return getRuleContext(LvaluebisContext.class,0);
		}
		public CroexprContext(LvaluebisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitCroexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nul4Context extends LvaluebisContext {
		public Nul4Context(LvaluebisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNul4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvaluebisContext lvaluebis() throws RecognitionException {
		LvaluebisContext _localctx = new LvaluebisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lvaluebis);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case POINT:
					_localctx = new PointidContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(237);
					match(POINT);
					setState(238);
					match(ID);
					setState(239);
					lvaluebis();
				}
				break;
				case CAOUV:
					_localctx = new CroexprContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(240);
					match(CAOUV);
					setState(241);
					expr();
					setState(242);
					match(CAFER);
					setState(243);
					lvaluebis();
				}
				break;
				case EOF:
				case POINTV:
				case VIRG:
				case PAFER:
				case CRFER:
				case CAFER:
				case DIF:
				case EGAL:
				case DPTEG:
				case INFEG:
				case INF:
				case SUP:
				case SUPEG:
				case PLUS:
				case NEG:
				case OU:
				case ET:
				case MUL:
				case DIV:
				case THEN:
				case END:
				case IN:
				case VAR:
				case ELSE:
				case DO:
				case TO:
				case TYPE:
				case FCT:
					_localctx = new Nul4Context(_localctx);
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

	public static class TypesContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode CAOUV() { return getToken(Parsertiger.CAOUV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CAFER() { return getToken(Parsertiger.CAFER, 0); }
		public TerminalNode OF() { return getToken(Parsertiger.OF, 0); }
		public TerminalNode CROUV() { return getToken(Parsertiger.CROUV, 0); }
		public TerminalNode CRFER() { return getToken(Parsertiger.CRFER, 0); }
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(248);
				typeid();
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case CAOUV:
					{
						setState(249);
						match(CAOUV);
						setState(250);
						expr();
						setState(251);
						match(CAFER);
						setState(252);
						match(OF);
						setState(253);
						expr();
					}
					break;
					case CROUV:
					{
						setState(255);
						match(CROUV);
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ID) {
							{
								setState(256);
								fieldlist();
							}
						}

						setState(259);
						match(CRFER);
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

	public static class TypedeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Parsertiger.TYPE, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode EGAL() { return getToken(Parsertiger.EGAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclarationContext typedeclaration() throws RecognitionException {
		TypedeclarationContext _localctx = new TypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				match(TYPE);
				setState(263);
				typeid();
				setState(264);
				match(EGAL);
				setState(265);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }

		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypecroContext extends TypeContext {
		public TerminalNode CROUV() { return getToken(Parsertiger.CROUV, 0); }
		public TerminalNode CRFER() { return getToken(Parsertiger.CRFER, 0); }
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypecroContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypecro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrofContext extends TypeContext {
		public TerminalNode ARROF() { return getToken(Parsertiger.ARROF, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ArrofContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitArrof(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypetypeidContext extends TypeContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypetypeidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypetypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case INT:
				case STR:
				case ID:
					_localctx = new TypetypeidContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(267);
					typeid();
				}
				break;
				case CROUV:
					_localctx = new TypecroContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(268);
					match(CROUV);
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
							setState(269);
							typefields();
						}
					}

					setState(272);
					match(CRFER);
				}
				break;
				case ARROF:
					_localctx = new ArrofContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(273);
					match(ARROF);
					setState(274);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypefields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefieldsContext typefields() throws RecognitionException {
		TypefieldsContext _localctx = new TypefieldsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typefields);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(277);
				typefield();
				setState(278);
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
		public TypefieldsbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefieldsbis; }

		public TypefieldsbisContext() { }
		public void copyFrom(TypefieldsbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirgtypefieldContext extends TypefieldsbisContext {
		public TerminalNode VIRG() { return getToken(Parsertiger.VIRG, 0); }
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public VirgtypefieldContext(TypefieldsbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVirgtypefield(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nul5Context extends TypefieldsbisContext {
		public Nul5Context(TypefieldsbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitNul5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefieldsbisContext typefieldsbis() throws RecognitionException {
		TypefieldsbisContext _localctx = new TypefieldsbisContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typefieldsbis);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VIRG:
					_localctx = new VirgtypefieldContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(280);
					match(VIRG);
					setState(281);
					typefields();
				}
				break;
				case PAFER:
				case CRFER:
					_localctx = new Nul5Context(_localctx);
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
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public TerminalNode DPT() { return getToken(Parsertiger.DPT, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefield; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypefield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefieldContext typefield() throws RecognitionException {
		TypefieldContext _localctx = new TypefieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(285);
				match(ID);
				setState(286);
				match(DPT);
				setState(287);
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
		public TerminalNode INT() { return getToken(Parsertiger.INT, 0); }
		public TerminalNode STR() { return getToken(Parsertiger.STR, 0); }
		public TypepredefinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typepredefined; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypepredefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypepredefinedContext typepredefined() throws RecognitionException {
		TypepredefinedContext _localctx = new TypepredefinedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typepredefined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==STR) ) {
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
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }

		public TypeidContext() { }
		public void copyFrom(TypeidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeididContext extends TypeidContext {
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public TypeididContext(TypeidContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitTypeidid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredefinedContext extends TypeidContext {
		public TypepredefinedContext typepredefined() {
			return getRuleContext(TypepredefinedContext.class,0);
		}
		public PredefinedContext(TypeidContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitPredefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeid);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					_localctx = new TypeididContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(291);
					match(ID);
				}
				break;
				case INT:
				case STR:
					_localctx = new PredefinedContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(292);
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
		public TerminalNode VAR() { return getToken(Parsertiger.VAR, 0); }
		public TerminalNode ID() { return getToken(Parsertiger.ID, 0); }
		public VariabledeclarationbisContext variabledeclarationbis() {
			return getRuleContext(VariabledeclarationbisContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(295);
				match(VAR);
				setState(296);
				match(ID);
				setState(297);
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
		public VariabledeclarationbisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarationbis; }

		public VariabledeclarationbisContext() { }
		public void copyFrom(VariabledeclarationbisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Vardec1Context extends VariabledeclarationbisContext {
		public TerminalNode DPT() { return getToken(Parsertiger.DPT, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode DPTEG() { return getToken(Parsertiger.DPTEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Vardec1Context(VariabledeclarationbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVardec1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vardec2Context extends VariabledeclarationbisContext {
		public TerminalNode DPTEG() { return getToken(Parsertiger.DPTEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Vardec2Context(VariabledeclarationbisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsertigerVisitor ) return ((ParsertigerVisitor<? extends T>)visitor).visitVardec2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationbisContext variabledeclarationbis() throws RecognitionException {
		VariabledeclarationbisContext _localctx = new VariabledeclarationbisContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variabledeclarationbis);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DPT:
					_localctx = new Vardec1Context(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(299);
					match(DPT);
					setState(300);
					typeid();
					setState(301);
					match(DPTEG);
					setState(302);
					expr();
				}
				break;
				case DPTEG:
					_localctx = new Vardec2Context(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(304);
					match(DPTEG);
					setState(305);
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

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0137\4\2\t\2"+
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3\4"+
					"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\7\6a\n"+
					"\6\f\6\16\6d\13\6\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\3\b"+
					"\3\b\3\b\3\b\3\b\5\bv\n\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
					"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0093"+
					"\n\t\r\t\16\t\u0094\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\t\3\t\5\t\u009f\n"+
					"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\5\f"+
					"\u00ae\n\f\3\r\3\r\5\r\u00b2\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ba"+
					"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c6\n\17"+
					"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00d1\n\22\3\23\3\23"+
					"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00db\n\24\3\25\3\25\3\25\3\26\3\26"+
					"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\5\30"+
					"\u00ee\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f9\n"+
					"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0104\n\32\3\32"+
					"\5\32\u0107\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0111\n"+
					"\34\3\34\3\34\3\34\5\34\u0116\n\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36"+
					"\u011e\n\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\5!\u0128\n!\3\"\3\"\3\"\3"+
					"\"\3#\3#\3#\3#\3#\3#\3#\5#\u0135\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26"+
					"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\3\2\r\23\3\2\24\25\3\2\30"+
					"\31\3\2,-\2\u013d\2F\3\2\2\2\4H\3\2\2\2\6P\3\2\2\2\bX\3\2\2\2\n]\3\2\2"+
					"\2\fe\3\2\2\2\16x\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00a8\3"+
					"\2\2\2\26\u00ad\3\2\2\2\30\u00af\3\2\2\2\32\u00b5\3\2\2\2\34\u00c5\3\2"+
					"\2\2\36\u00c7\3\2\2\2 \u00ca\3\2\2\2\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00da"+
					"\3\2\2\2(\u00dc\3\2\2\2*\u00df\3\2\2\2,\u00e8\3\2\2\2.\u00ea\3\2\2\2\60"+
					"\u00f8\3\2\2\2\62\u00fa\3\2\2\2\64\u0108\3\2\2\2\66\u0115\3\2\2\28\u0117"+
					"\3\2\2\2:\u011d\3\2\2\2<\u011f\3\2\2\2>\u0123\3\2\2\2@\u0127\3\2\2\2B"+
					"\u0129\3\2\2\2D\u0134\3\2\2\2FG\5\20\t\2G\3\3\2\2\2HM\5\6\4\2IJ\7\26\2"+
					"\2JL\5\6\4\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2"+
					"\2\2PU\5\b\5\2QR\7\27\2\2RT\5\b\5\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3"+
					"\2\2\2V\7\3\2\2\2WU\3\2\2\2X[\5\n\6\2YZ\t\2\2\2Z\\\5\n\6\2[Y\3\2\2\2["+
					"\\\3\2\2\2\\\t\3\2\2\2]b\5\f\7\2^_\t\3\2\2_a\5\f\7\2`^\3\2\2\2ad\3\2\2"+
					"\2b`\3\2\2\2bc\3\2\2\2c\13\3\2\2\2db\3\2\2\2ej\5\16\b\2fg\t\4\2\2gi\5"+
					"\16\b\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2\2\2m"+
					"y\5.\30\2ny\7/\2\2oy\7.\2\2py\7\32\2\2qy\5\36\20\2ry\5\64\33\2su\7\7\2"+
					"\2tv\5 \21\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\b\2\2xm\3\2\2\2xn\3\2\2"+
					"\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2y\17\3\2\2\2z\u009f"+
					"\5\4\3\2{|\7\"\2\2|}\5\20\t\2}~\7\35\2\2~\177\5\20\t\2\177\u0080\5\24"+
					"\13\2\u0080\u009f\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0083\5\20\t\2\u0083"+
					"\u0084\7(\2\2\u0084\u0085\5\20\t\2\u0085\u009f\3\2\2\2\u0086\u0087\7\34"+
					"\2\2\u0087\u0088\7\60\2\2\u0088\u0089\7\17\2\2\u0089\u008a\5\20\t\2\u008a"+
					"\u008b\7)\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7(\2\2\u008d\u008e\5\20"+
					"\t\2\u008e\u009f\3\2\2\2\u008f\u009f\7\33\2\2\u0090\u0092\7 \2\2\u0091"+
					"\u0093\5\26\f\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3"+
					"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\37\2\2\u0097"+
					"\u0099\5 \21\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
					"\2\2\u009a\u009b\7\36\2\2\u009b\u009f\3\2\2\2\u009c\u009f\5\22\n\2\u009d"+
					"\u009f\5\62\32\2\u009ez\3\2\2\2\u009e{\3\2\2\2\u009e\u0081\3\2\2\2\u009e"+
					"\u0086\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u009c\3\2"+
					"\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1\u00a2"+
					"\7\7\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\7\b\2\2\u00a4\23\3\2\2\2\u00a5"+
					"\u00a6\7#\2\2\u00a6\u00a9\5\20\t\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2"+
					"\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ae\5\64\33\2\u00ab"+
					"\u00ae\5B\"\2\u00ac\u00ae\5\32\16\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3"+
					"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\27\3\2\2\2\u00af\u00b1\7\7\2\2\u00b0"+
					"\u00b2\5$\23\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
					"\2\2\u00b3\u00b4\7\b\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\u00b7"+
					"\7\60\2\2\u00b7\u00b9\7\7\2\2\u00b8\u00ba\58\35\2\u00b9\u00b8\3\2\2\2"+
					"\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd"+
					"\5\34\17\2\u00bd\33\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c6\5\20\t\2"+
					"\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5@!\2\u00c2\u00c3\7\16\2\2\u00c3\u00c4"+
					"\5\20\t\2\u00c4\u00c6\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c0\3\2\2\2"+
					"\u00c6\35\3\2\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5\16\b\2\u00c9\37\3"+
					"\2\2\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\5\"\22\2\u00cc!\3\2\2\2\u00cd"+
					"\u00ce\7\4\2\2\u00ce\u00d1\5 \21\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2"+
					"\2\2\u00d0\u00cf\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4"+
					"\5&\24\2\u00d4%\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5\20\t\2\u00d7"+
					"\u00d8\5&\24\2\u00d8\u00db\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3\2"+
					"\2\2\u00da\u00d9\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de"+
					"\5,\27\2\u00de)\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\7\16\2\2\u00e1"+
					"\u00e2\5\20\t\2\u00e2+\3\2\2\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5\5*\26\2"+
					"\u00e5\u00e6\5,\27\2\u00e6\u00e9\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3"+
					"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00ed\7\60\2\2\u00eb"+
					"\u00ee\5\60\31\2\u00ec\u00ee\5\30\r\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec"+
					"\3\2\2\2\u00ee/\3\2\2\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
					"\u00f9\5\60\31\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5"+
					"\7\f\2\2\u00f5\u00f6\5\60\31\2\u00f6\u00f9\3\2\2\2\u00f7\u00f9\3\2\2\2"+
					"\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\61"+
					"\3\2\2\2\u00fa\u0106\5@!\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\20\t\2\u00fd"+
					"\u00fe\7\f\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100\5\20\t\2\u0100\u0107\3\2"+
					"\2\2\u0101\u0103\7\t\2\2\u0102\u0104\5(\25\2\u0103\u0102\3\2\2\2\u0103"+
					"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\n\2\2\u0106\u00fb\3\2"+
					"\2\2\u0106\u0101\3\2\2\2\u0107\63\3\2\2\2\u0108\u0109\7*\2\2\u0109\u010a"+
					"\5@!\2\u010a\u010b\7\16\2\2\u010b\u010c\5\66\34\2\u010c\65\3\2\2\2\u010d"+
					"\u0116\5@!\2\u010e\u0110\7\t\2\2\u010f\u0111\58\35\2\u0110\u010f\3\2\2"+
					"\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\7\n\2\2\u0113\u0114"+
					"\7%\2\2\u0114\u0116\5@!\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115"+
					"\u0113\3\2\2\2\u0116\67\3\2\2\2\u0117\u0118\5<\37\2\u0118\u0119\5:\36"+
					"\2\u01199\3\2\2\2\u011a\u011b\7\5\2\2\u011b\u011e\58\35\2\u011c\u011e"+
					"\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011c\3\2\2\2\u011e;\3\2\2\2\u011f"+
					"\u0120\7\60\2\2\u0120\u0121\7\6\2\2\u0121\u0122\5@!\2\u0122=\3\2\2\2\u0123"+
					"\u0124\t\5\2\2\u0124?\3\2\2\2\u0125\u0128\7\60\2\2\u0126\u0128\5> \2\u0127"+
					"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128A\3\2\2\2\u0129\u012a\7!\2\2\u012a"+
					"\u012b\7\60\2\2\u012b\u012c\5D#\2\u012cC\3\2\2\2\u012d\u012e\7\6\2\2\u012e"+
					"\u012f\5@!\2\u012f\u0130\7\17\2\2\u0130\u0131\5\20\t\2\u0131\u0135\3\2"+
					"\2\2\u0132\u0133\7\17\2\2\u0133\u0135\5\20\t\2\u0134\u012d\3\2\2\2\u0134"+
					"\u0132\3\2\2\2\u0135E\3\2\2\2\35MU[bjux\u0094\u0098\u009e\u00a8\u00ad"+
					"\u00b1\u00b9\u00c5\u00d0\u00da\u00e8\u00ed\u00f8\u0103\u0106\u0110\u0115"+
					"\u011d\u0127\u0134";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}