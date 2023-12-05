// Generated from Lexertiger.g4 by ANTLR 4.9.2

package lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexertiger extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POINT", "POINTV", "VIRG", "DPT", "PAOUV", "PAFER", "CROUV", "CRFER", 
			"CAOUV", "CAFER", "DIF", "EGAL", "DPTEG", "INFEG", "INF", "SUP", "SUPEG", 
			"PLUS", "NEG", "OU", "ET", "MUL", "DIV", "NIL", "BREAK", "FOR", "THEN", 
			"END", "IN", "LET", "VAR", "IF", "ELSE", "OF", "ARROF", "WHILE", "PRINT", 
			"DO", "TO", "TYPE", "FCT", "INT", "STR", "INTEGERCONSTANT", "STRINGCONSTANT", 
			"ID", "BOPERATOR", "WS", "COMMENT"
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


	public Lexertiger(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexertiger.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0132\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\6-\u00fa\n-\r-\16-\u00fb\3.\3.\7.\u0100\n.\f.\16.\u0103"+
		"\13.\3.\3.\3/\3/\7/\u0109\n/\f/\16/\u010c\13/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0117\n\60\3\61\3\61\3\61\3\61\3\61\3\61\6\61"+
		"\u011f\n\61\r\61\16\61\u0120\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0129"+
		"\n\62\f\62\16\62\u012c\13\62\3\62\3\62\3\62\3\62\3\62\3\u012a\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\t\t\2\"#.\60<=AAC\\"+
		"aac|\4\2C\\c|\6\2\62;C\\aac|\6\2,-//\61\61??\4\2>>@@\4\2((~~\4\2\f\f\""+
		"\"\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2"+
		"\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2"+
		"\2\27y\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0084\3\2\2"+
		"\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f"+
		"\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2"+
		"\63\u009b\3\2\2\2\65\u00a1\3\2\2\2\67\u00a5\3\2\2\29\u00aa\3\2\2\2;\u00ae"+
		"\3\2\2\2=\u00b1\3\2\2\2?\u00b5\3\2\2\2A\u00b9\3\2\2\2C\u00bc\3\2\2\2E"+
		"\u00c1\3\2\2\2G\u00c4\3\2\2\2I\u00cd\3\2\2\2K\u00d3\3\2\2\2M\u00d9\3\2"+
		"\2\2O\u00dc\3\2\2\2Q\u00df\3\2\2\2S\u00e4\3\2\2\2U\u00ed\3\2\2\2W\u00f1"+
		"\3\2\2\2Y\u00f9\3\2\2\2[\u00fd\3\2\2\2]\u0106\3\2\2\2_\u0116\3\2\2\2a"+
		"\u011e\3\2\2\2c\u0124\3\2\2\2ef\7\60\2\2f\4\3\2\2\2gh\7=\2\2h\6\3\2\2"+
		"\2ij\7.\2\2j\b\3\2\2\2kl\7<\2\2l\n\3\2\2\2mn\7*\2\2n\f\3\2\2\2op\7+\2"+
		"\2p\16\3\2\2\2qr\7}\2\2r\20\3\2\2\2st\7\177\2\2t\22\3\2\2\2uv\7]\2\2v"+
		"\24\3\2\2\2wx\7_\2\2x\26\3\2\2\2yz\7>\2\2z{\7@\2\2{\30\3\2\2\2|}\7?\2"+
		"\2}\32\3\2\2\2~\177\7<\2\2\177\u0080\7?\2\2\u0080\34\3\2\2\2\u0081\u0082"+
		"\7@\2\2\u0082\u0083\7?\2\2\u0083\36\3\2\2\2\u0084\u0085\7@\2\2\u0085 "+
		"\3\2\2\2\u0086\u0087\7>\2\2\u0087\"\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a"+
		"\7?\2\2\u008a$\3\2\2\2\u008b\u008c\7-\2\2\u008c&\3\2\2\2\u008d\u008e\7"+
		"/\2\2\u008e(\3\2\2\2\u008f\u0090\7~\2\2\u0090*\3\2\2\2\u0091\u0092\7("+
		"\2\2\u0092,\3\2\2\2\u0093\u0094\7,\2\2\u0094.\3\2\2\2\u0095\u0096\7\61"+
		"\2\2\u0096\60\3\2\2\2\u0097\u0098\7p\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7n\2\2\u009a\62\3\2\2\2\u009b\u009c\7d\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7m\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\66\3\2\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"8\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		":\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0<\3\2\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4>\3\2\2\2\u00b5\u00b6"+
		"\7x\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8@\3\2\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7h\2\2\u00bbB\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0D\3\2\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7h\2\2\u00c3F\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7{\2\2\u00c9"+
		"\u00ca\7\"\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7h\2\2\u00ccH\3\2\2\2\u00cd"+
		"\u00ce\7y\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8L\3\2"+
		"\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7q\2\2\u00dbN\3\2\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7q\2\2\u00deP\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7{\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7g\2\2\u00e3R\3\2\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7v\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7p\2\2"+
		"\u00ecT\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2"+
		"\2\u00f0V\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7"+
		"t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7X"+
		"\3\2\2\2\u00f8\u00fa\4\62;\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcZ\3\2\2\2\u00fd\u0101\7$\2\2\u00fe"+
		"\u0100\t\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\7$\2\2\u0105\\\3\2\2\2\u0106\u010a\t\3\2\2\u0107\u0109\t\4\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b^\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0117\t\5\2\2\u010e"+
		"\u010f\7>\2\2\u010f\u0117\7@\2\2\u0110\u0117\t\6\2\2\u0111\u0112\7@\2"+
		"\2\u0112\u0117\7?\2\2\u0113\u0114\7>\2\2\u0114\u0117\7?\2\2\u0115\u0117"+
		"\t\7\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0110\3\2\2\2\u0116"+
		"\u0111\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0115\3\2\2\2\u0117`\3\2\2\2"+
		"\u0118\u011f\t\b\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7\"\2\2\u011b\u011c"+
		"\7\"\2\2\u011c\u011f\7\"\2\2\u011d\u011f\7\13\2\2\u011e\u0118\3\2\2\2"+
		"\u011e\u0119\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\61\2\2"+
		"\u0123b\3\2\2\2\u0124\u0125\7\61\2\2\u0125\u0126\7,\2\2\u0126\u012a\3"+
		"\2\2\2\u0127\u0129\13\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\61\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b\62\2\2\u0131d\3\2\2\2\n\2\u00fb\u0101\u010a\u0116\u011e\u0120"+
		"\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}