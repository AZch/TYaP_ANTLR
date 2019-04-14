// Generated from /home/az/IdeaProjects/TYaP_ANTLR/src/main/java/antlr/MyC.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Ident=33, Decimal=34, StringLiteral=35, LineAfterPreprocessing=36, 
		LineDirective=37, PragmaDirective=38, Whitespace=39, Newline=40, LineComment=41, 
		BlockComment=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "Ident", 
			"Decimal", "Nondigit", "Digit", "NonZeroDigit", "EncodingPrefix", "SCharSequence", 
			"SChar", "SimpleEscapeSequence", "EscapeSequence", "StringLiteral", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "LineComment", 
			"BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void main() '", "'class '", "' {'", "'};'", "'int '", "'char '", 
			"' '", "';'", "','", "'['", "']'", "'='", "'{'", "'}'", "'const'", "'||'", 
			"'&&'", "'=='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'('", "')'", "'.'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Ident", "Decimal", 
			"StringLiteral", "LineAfterPreprocessing", "LineDirective", "PragmaDirective", 
			"Whitespace", "Newline", "LineComment", "BlockComment"
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


	public MyCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u00d1\n\"\f\"\16\"\u00d4\13\"\3#\3"+
		"#\7#\u00d8\n#\f#\16#\u00db\13#\3#\5#\u00de\n#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\5\'\u00e9\n\'\3(\6(\u00ec\n(\r(\16(\u00ed\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u00f7\n)\3*\3*\3*\3+\3+\3,\5,\u00ff\n,\3,\3,\5,\u0103\n,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3-\7-\u010e\n-\f-\16-\u0111\13-\3-\7-\u0114\n-\f-\16-"+
		"\u0117\13-\3-\3-\3.\3.\5.\u011d\n.\3.\3.\5.\u0121\n.\3.\3.\7.\u0125\n"+
		".\f.\16.\u0128\13.\3.\3.\3/\3/\5/\u012e\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\7/\u0139\n/\f/\16/\u013c\13/\3/\3/\3\60\6\60\u0141\n\60\r\60\16\60\u0142"+
		"\3\60\3\60\3\61\3\61\5\61\u0149\n\61\3\61\5\61\u014c\n\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\7\62\u0154\n\62\f\62\16\62\u0157\13\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\7\63\u015f\n\63\f\63\16\63\u0162\13\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\u0160\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q\2S\2U\2W%Y&[\']"+
		"(_)a*c+e,\3\2\n\5\2C\\aac|\3\2\62;\3\2\63;\5\2NNWWww\6\2\f\f\17\17$$^"+
		"^\f\2$$))AA^^cdhhppttvvxx\4\2\f\f\17\17\3\2\13\13\2\u0176\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g"+
		"\3\2\2\2\5t\3\2\2\2\7{\3\2\2\2\t~\3\2\2\2\13\u0081\3\2\2\2\r\u0086\3\2"+
		"\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2"+
		"\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3\2\2\2"+
		"\37\u009c\3\2\2\2!\u00a2\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c8\3\2\2\2C"+
		"\u00cd\3\2\2\2E\u00dd\3\2\2\2G\u00df\3\2\2\2I\u00e1\3\2\2\2K\u00e3\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u00eb\3\2\2\2Q\u00f6\3\2\2\2S\u00f8\3\2\2\2U\u00fb"+
		"\3\2\2\2W\u00fe\3\2\2\2Y\u0106\3\2\2\2[\u011a\3\2\2\2]\u012b\3\2\2\2_"+
		"\u0140\3\2\2\2a\u014b\3\2\2\2c\u014f\3\2\2\2e\u015a\3\2\2\2gh\7x\2\2h"+
		"i\7q\2\2ij\7k\2\2jk\7f\2\2kl\7\"\2\2lm\7o\2\2mn\7c\2\2no\7k\2\2op\7p\2"+
		"\2pq\7*\2\2qr\7+\2\2rs\7\"\2\2s\4\3\2\2\2tu\7e\2\2uv\7n\2\2vw\7c\2\2w"+
		"x\7u\2\2xy\7u\2\2yz\7\"\2\2z\6\3\2\2\2{|\7\"\2\2|}\7}\2\2}\b\3\2\2\2~"+
		"\177\7\177\2\2\177\u0080\7=\2\2\u0080\n\3\2\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7\"\2\2\u0085\f\3\2\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7j\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2"+
		"\u008a\u008b\7\"\2\2\u008b\16\3\2\2\2\u008c\u008d\7\"\2\2\u008d\20\3\2"+
		"\2\2\u008e\u008f\7=\2\2\u008f\22\3\2\2\2\u0090\u0091\7.\2\2\u0091\24\3"+
		"\2\2\2\u0092\u0093\7]\2\2\u0093\26\3\2\2\2\u0094\u0095\7_\2\2\u0095\30"+
		"\3\2\2\2\u0096\u0097\7?\2\2\u0097\32\3\2\2\2\u0098\u0099\7}\2\2\u0099"+
		"\34\3\2\2\2\u009a\u009b\7\177\2\2\u009b\36\3\2\2\2\u009c\u009d\7e\2\2"+
		"\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a4\7~\2\2\u00a4\"\3"+
		"\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7?\2\2\u00a9\u00aa\7?\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac(\3"+
		"\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7?\2\2\u00b4.\3"+
		"\2\2\2\u00b5\u00b6\7-\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\62"+
		"\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc"+
		"\66\3\2\2\2\u00bd\u00be\7\'\2\2\u00be8\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0"+
		":\3\2\2\2\u00c1\u00c2\7+\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7\60\2\2\u00c4"+
		">\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7h\2\2\u00c7@\3\2\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"B\3\2\2\2\u00cd\u00d2\5G$\2\u00ce\u00d1\5G$\2\u00cf\u00d1\5I%\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3D\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9"+
		"\5K&\2\u00d6\u00d8\5I%\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00de\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00de\7\62\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0H\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2"+
		"J\3\2\2\2\u00e3\u00e4\t\4\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e9\7:\2\2\u00e7\u00e9\t\5\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9N\3\2\2\2\u00ea\u00ec\5Q)\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeP\3\2\2\2\u00ef"+
		"\u00f7\n\6\2\2\u00f0\u00f7\5U+\2\u00f1\u00f2\7^\2\2\u00f2\u00f7\7\f\2"+
		"\2\u00f3\u00f4\7^\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f7\7\f\2\2\u00f6\u00ef"+
		"\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"R\3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fa\t\7\2\2\u00faT\3\2\2\2\u00fb"+
		"\u00fc\5S*\2\u00fcV\3\2\2\2\u00fd\u00ff\5M\'\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7$\2\2\u0101\u0103\5O("+
		"\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\7$\2\2\u0105X\3\2\2\2\u0106\u0107\7%\2\2\u0107\u0108\7n\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7g\2\2\u010b\u010f\3\2\2\2\u010c"+
		"\u010e\5_\60\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0115\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0114\n\b\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\b-\2\2\u0119Z\3\2\2\2\u011a\u011c\7%\2\2\u011b\u011d\5_\60\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\5E"+
		"#\2\u011f\u0121\5_\60\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0126\5W,\2\u0123\u0125\n\b\2\2\u0124\u0123\3\2\2"+
		"\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b.\2\2\u012a\\\3\2\2\2\u012b"+
		"\u012d\7%\2\2\u012c\u012e\5_\60\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7r\2\2\u0130\u0131\7t\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7i\2\2\u0133\u0134\7o\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u013a\5_\60\2\u0137\u0139\n\b\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b/\2\2\u013e^\3\2\2\2\u013f"+
		"\u0141\t\t\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\60\2\2\u0145"+
		"`\3\2\2\2\u0146\u0148\7\17\2\2\u0147\u0149\7p\2\2\u0148\u0147\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014c\7\f\2\2\u014b\u0146"+
		"\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\61\2\2"+
		"\u014eb\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7\61\2\2\u0151\u0155"+
		"\3\2\2\2\u0152\u0154\n\b\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u0159\b\62\2\2\u0159d\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c"+
		"\7,\2\2\u015c\u0160\3\2\2\2\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\b\63\2\2\u0167f\3\2\2\2\30\2\u00d0\u00d2\u00d9"+
		"\u00dd\u00e8\u00ed\u00f6\u00fe\u0102\u010f\u0115\u011c\u0120\u0126\u012d"+
		"\u013a\u0142\u0148\u014b\u0155\u0160\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}