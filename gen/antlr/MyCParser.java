// Generated from /home/az/IdeaProjects/TYaP_ANTLR/src/main/java/antlr/MyC.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50;
	public static final int
		RULE_prog = 0, RULE_one_desc = 1, RULE_classStr = 2, RULE_desc_class = 3, 
		RULE_type = 4, RULE_id = 5, RULE_letter = 6, RULE_endL = 7, RULE_num = 8, 
		RULE_many_num = 9, RULE_many_num1 = 10, RULE_data = 11, RULE_list = 12, 
		RULE_list1 = 13, RULE_variable = 14, RULE_size_array = 15, RULE_array_size_num = 16, 
		RULE_may_assign = 17, RULE_expression = 18, RULE_many_expression = 19, 
		RULE_many_expression1 = 20, RULE_constStr = 21, RULE_a1 = 22, RULE_a1_ = 23, 
		RULE_a2 = 24, RULE_a2_ = 25, RULE_a3 = 26, RULE_a3_ = 27, RULE_a4 = 28, 
		RULE_a4_ = 29, RULE_a5 = 30, RULE_desc_fun = 31, RULE_content_desc = 32, 
		RULE_desc = 33, RULE_operator = 34, RULE_assign = 35, RULE_id_intern_elem = 36, 
		RULE_id_intern_elem1 = 37, RULE_elem_array = 38, RULE_if = 39, RULE_may_else = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "one_desc", "classStr", "desc_class", "type", "id", "letter", 
			"endL", "num", "many_num", "many_num1", "data", "list", "list1", "variable", 
			"size_array", "array_size_num", "may_assign", "expression", "many_expression", 
			"many_expression1", "constStr", "a1", "a1_", "a2", "a2_", "a3", "a3_", 
			"a4", "a4_", "a5", "desc_fun", "content_desc", "desc", "operator", "assign", 
			"id_intern_elem", "id_intern_elem1", "elem_array", "if", "may_else"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void main() '", "'class '", "' {'", "'};'", "'int '", "'char '", 
			"' '", "'a'", "'b'", "'c'", "'d'", "'A'", "'B'", "'C'", "'D'", "'0'", 
			"'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "';'", 
			"','", "'['", "']'", "'='", "'{'", "'}'", "'const'", "'||'", "'&&'", 
			"'=='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'('", "')'", "'.'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "MyC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public One_descContext one_desc() {
			return getRuleContext(One_descContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				one_desc();
				setState(83);
				prog();
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

	public static class One_descContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ClassStrContext classStr() {
			return getRuleContext(ClassStrContext.class,0);
		}
		public Desc_funContext desc_fun() {
			return getRuleContext(Desc_funContext.class,0);
		}
		public ConstStrContext constStr() {
			return getRuleContext(ConstStrContext.class,0);
		}
		public One_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterOne_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitOne_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitOne_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_descContext one_desc() throws RecognitionException {
		One_descContext _localctx = new One_descContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_one_desc);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				data();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				classStr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__0);
				setState(91);
				desc_fun();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				constStr();
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

	public static class ClassStrContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Desc_classContext desc_class() {
			return getRuleContext(Desc_classContext.class,0);
		}
		public ClassStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterClassStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitClassStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitClassStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStrContext classStr() throws RecognitionException {
		ClassStrContext _localctx = new ClassStrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
			id();
			setState(97);
			match(T__2);
			setState(98);
			desc_class();
			setState(99);
			match(T__3);
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

	public static class Desc_classContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Desc_classContext desc_class() {
			return getRuleContext(Desc_classContext.class,0);
		}
		public Desc_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterDesc_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitDesc_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitDesc_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desc_classContext desc_class() throws RecognitionException {
		Desc_classContext _localctx = new Desc_classContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_desc_class);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				data();
				setState(102);
				desc_class();
				}
				break;
			case T__3:
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

	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__5);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				id();
				setState(110);
				match(T__6);
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

	public static class IdContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public EndLContext endL() {
			return getRuleContext(EndLContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			letter();
			setState(115);
			endL();
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

	public static class LetterContext extends ParserRuleContext {
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class EndLContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public EndLContext endL() {
			return getRuleContext(EndLContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public EndLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterEndL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitEndL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitEndL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndLContext endL() throws RecognitionException {
		EndLContext _localctx = new EndLContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endL);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				letter();
				setState(120);
				endL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				num();
				setState(123);
				endL();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class Many_numContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Many_num1Context many_num1() {
			return getRuleContext(Many_num1Context.class,0);
		}
		public Many_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMany_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMany_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMany_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Many_numContext many_num() throws RecognitionException {
		Many_numContext _localctx = new Many_numContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_many_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			num();
			setState(131);
			many_num1();
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

	public static class Many_num1Context extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Many_num1Context many_num1() {
			return getRuleContext(Many_num1Context.class,0);
		}
		public Many_num1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many_num1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMany_num1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMany_num1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMany_num1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Many_num1Context many_num1() throws RecognitionException {
		Many_num1Context _localctx = new Many_num1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_many_num1);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				num();
				setState(134);
				many_num1();
				}
				break;
			case T__25:
			case T__26:
			case T__28:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
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

	public static class DataContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			type();
			setState(140);
			list();
			setState(141);
			match(T__25);
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

	public static class ListContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List1Context list1() {
			return getRuleContext(List1Context.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			variable();
			setState(144);
			list1();
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

	public static class List1Context extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List1Context list1() {
			return getRuleContext(List1Context.class,0);
		}
		public List1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterList1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitList1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitList1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List1Context list1() throws RecognitionException {
		List1Context _localctx = new List1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_list1);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__26);
				setState(147);
				variable();
				setState(148);
				list1();
				}
				break;
			case T__25:
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

	public static class VariableContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Size_arrayContext size_array() {
			return getRuleContext(Size_arrayContext.class,0);
		}
		public May_assignContext may_assign() {
			return getRuleContext(May_assignContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			id();
			setState(154);
			size_array();
			setState(155);
			may_assign();
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

	public static class Size_arrayContext extends ParserRuleContext {
		public Array_size_numContext array_size_num() {
			return getRuleContext(Array_size_numContext.class,0);
		}
		public Size_arrayContext size_array() {
			return getRuleContext(Size_arrayContext.class,0);
		}
		public Size_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterSize_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitSize_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitSize_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size_arrayContext size_array() throws RecognitionException {
		Size_arrayContext _localctx = new Size_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_size_array);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__27);
				setState(158);
				array_size_num();
				setState(159);
				match(T__28);
				setState(160);
				size_array();
				}
				break;
			case T__25:
			case T__26:
			case T__29:
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

	public static class Array_size_numContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Array_size_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterArray_size_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitArray_size_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitArray_size_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_size_numContext array_size_num() throws RecognitionException {
		Array_size_numContext _localctx = new Array_size_numContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_size_num);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				id();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				num();
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

	public static class May_assignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public May_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_may_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMay_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMay_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMay_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final May_assignContext may_assign() throws RecognitionException {
		May_assignContext _localctx = new May_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_may_assign);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__29);
				setState(170);
				expression();
				}
				break;
			case T__25:
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

	public static class ExpressionContext extends ParserRuleContext {
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public Many_expressionContext many_expression() {
			return getRuleContext(Many_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
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
			case T__24:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				a1();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__30);
				setState(176);
				many_expression();
				setState(177);
				match(T__31);
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

	public static class Many_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Many_expression1Context many_expression1() {
			return getRuleContext(Many_expression1Context.class,0);
		}
		public Many_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMany_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMany_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMany_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Many_expressionContext many_expression() throws RecognitionException {
		Many_expressionContext _localctx = new Many_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_many_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expression();
			setState(182);
			many_expression1();
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

	public static class Many_expression1Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Many_expression1Context many_expression1() {
			return getRuleContext(Many_expression1Context.class,0);
		}
		public Many_expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMany_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMany_expression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMany_expression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Many_expression1Context many_expression1() throws RecognitionException {
		Many_expression1Context _localctx = new Many_expression1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_many_expression1);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__26);
				setState(185);
				expression();
				setState(186);
				many_expression1();
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

	public static class ConstStrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ConstStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterConstStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitConstStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitConstStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStrContext constStr() throws RecognitionException {
		ConstStrContext _localctx = new ConstStrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__32);
			setState(192);
			type();
			setState(193);
			id();
			setState(194);
			match(T__29);
			setState(195);
			num();
			setState(196);
			match(T__25);
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

	public static class A1Context extends ParserRuleContext {
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public A1_Context a1_() {
			return getRuleContext(A1_Context.class,0);
		}
		public A1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A1Context a1() throws RecognitionException {
		A1Context _localctx = new A1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_a1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			a2();
			setState(199);
			a1_();
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

	public static class A1_Context extends ParserRuleContext {
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public A1_Context a1_() {
			return getRuleContext(A1_Context.class,0);
		}
		public A1_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a1_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA1_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA1_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA1_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A1_Context a1_() throws RecognitionException {
		A1_Context _localctx = new A1_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_a1_);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__33);
				setState(202);
				a2();
				setState(203);
				a1_();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__34);
				setState(206);
				a2();
				setState(207);
				a1_();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__35);
				setState(210);
				a2();
				setState(211);
				a1_();
				}
				break;
			case T__25:
			case T__26:
			case T__28:
			case T__31:
			case T__46:
				enterOuterAlt(_localctx, 4);
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

	public static class A2Context extends ParserRuleContext {
		public A3Context a3() {
			return getRuleContext(A3Context.class,0);
		}
		public A2_Context a2_() {
			return getRuleContext(A2_Context.class,0);
		}
		public A2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A2Context a2() throws RecognitionException {
		A2Context _localctx = new A2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_a2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			a3();
			setState(217);
			a2_();
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

	public static class A2_Context extends ParserRuleContext {
		public A3Context a3() {
			return getRuleContext(A3Context.class,0);
		}
		public A2_Context a2_() {
			return getRuleContext(A2_Context.class,0);
		}
		public A2_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA2_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA2_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA2_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A2_Context a2_() throws RecognitionException {
		A2_Context _localctx = new A2_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_a2_);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__36);
				setState(220);
				a3();
				setState(221);
				a2_();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__37);
				setState(224);
				a3();
				setState(225);
				a2_();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__38);
				setState(228);
				a3();
				setState(229);
				a2_();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(T__39);
				setState(232);
				a3();
				setState(233);
				a2_();
				}
				break;
			case T__25:
			case T__26:
			case T__28:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__46:
				enterOuterAlt(_localctx, 5);
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

	public static class A3Context extends ParserRuleContext {
		public A4Context a4() {
			return getRuleContext(A4Context.class,0);
		}
		public A3_Context a3_() {
			return getRuleContext(A3_Context.class,0);
		}
		public A3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A3Context a3() throws RecognitionException {
		A3Context _localctx = new A3Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_a3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			a4();
			setState(239);
			a3_();
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

	public static class A3_Context extends ParserRuleContext {
		public A4Context a4() {
			return getRuleContext(A4Context.class,0);
		}
		public A3_Context a3_() {
			return getRuleContext(A3_Context.class,0);
		}
		public A3_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA3_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA3_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA3_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A3_Context a3_() throws RecognitionException {
		A3_Context _localctx = new A3_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_a3_);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__40);
				setState(242);
				a4();
				setState(243);
				a3_();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__41);
				setState(246);
				a4();
				setState(247);
				a3_();
				}
				break;
			case T__25:
			case T__26:
			case T__28:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__46:
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

	public static class A4Context extends ParserRuleContext {
		public A5Context a5() {
			return getRuleContext(A5Context.class,0);
		}
		public A4_Context a4_() {
			return getRuleContext(A4_Context.class,0);
		}
		public A4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A4Context a4() throws RecognitionException {
		A4Context _localctx = new A4Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_a4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			a5();
			setState(253);
			a4_();
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

	public static class A4_Context extends ParserRuleContext {
		public A5Context a5() {
			return getRuleContext(A5Context.class,0);
		}
		public A4_Context a4_() {
			return getRuleContext(A4_Context.class,0);
		}
		public A4_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a4_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA4_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA4_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA4_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A4_Context a4_() throws RecognitionException {
		A4_Context _localctx = new A4_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_a4_);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__42);
				setState(256);
				a5();
				setState(257);
				a4_();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__43);
				setState(260);
				a5();
				setState(261);
				a4_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(T__44);
				setState(264);
				a5();
				setState(265);
				a4_();
				}
				break;
			case T__25:
			case T__26:
			case T__28:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__46:
				enterOuterAlt(_localctx, 4);
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

	public static class A5Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Many_numContext many_num() {
			return getRuleContext(Many_numContext.class,0);
		}
		public Id_intern_elemContext id_intern_elem() {
			return getRuleContext(Id_intern_elemContext.class,0);
		}
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public A5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterA5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitA5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitA5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A5Context a5() throws RecognitionException {
		A5Context _localctx = new A5Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_a5);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				many_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				id_intern_elem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(T__45);
				setState(274);
				a1();
				setState(275);
				match(T__46);
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

	public static class Desc_funContext extends ParserRuleContext {
		public Content_descContext content_desc() {
			return getRuleContext(Content_descContext.class,0);
		}
		public Desc_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterDesc_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitDesc_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitDesc_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desc_funContext desc_fun() throws RecognitionException {
		Desc_funContext _localctx = new Desc_funContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_desc_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__30);
			setState(280);
			content_desc();
			setState(281);
			match(T__31);
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

	public static class Content_descContext extends ParserRuleContext {
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public Content_descContext content_desc() {
			return getRuleContext(Content_descContext.class,0);
		}
		public Content_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterContent_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitContent_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitContent_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Content_descContext content_desc() throws RecognitionException {
		Content_descContext _localctx = new Content_descContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_content_desc);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__30:
			case T__32:
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				desc();
				setState(284);
				content_desc();
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

	public static class DescContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ConstStrContext constStr() {
			return getRuleContext(ConstStrContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_desc);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				constStr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public Desc_funContext desc_fun() {
			return getRuleContext(Desc_funContext.class,0);
		}
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operator);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				desc_fun();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				if();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				assign();
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

	public static class AssignContext extends ParserRuleContext {
		public Id_intern_elemContext id_intern_elem() {
			return getRuleContext(Id_intern_elemContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assign);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				id_intern_elem();
				setState(300);
				match(T__29);
				setState(301);
				expression();
				setState(302);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				id();
				setState(305);
				match(T__29);
				setState(306);
				expression();
				setState(307);
				match(T__25);
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

	public static class Id_intern_elemContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Id_intern_elem1Context id_intern_elem1() {
			return getRuleContext(Id_intern_elem1Context.class,0);
		}
		public Id_intern_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_intern_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterId_intern_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitId_intern_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitId_intern_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_intern_elemContext id_intern_elem() throws RecognitionException {
		Id_intern_elemContext _localctx = new Id_intern_elemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_id_intern_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			id();
			setState(312);
			elem_array();
			setState(313);
			id_intern_elem1();
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

	public static class Id_intern_elem1Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Id_intern_elem1Context id_intern_elem1() {
			return getRuleContext(Id_intern_elem1Context.class,0);
		}
		public Id_intern_elem1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_intern_elem1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterId_intern_elem1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitId_intern_elem1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitId_intern_elem1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_intern_elem1Context id_intern_elem1() throws RecognitionException {
		Id_intern_elem1Context _localctx = new Id_intern_elem1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_id_intern_elem1);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__47);
				setState(316);
				id();
				setState(317);
				elem_array();
				setState(318);
				id_intern_elem1();
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
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

	public static class Elem_arrayContext extends ParserRuleContext {
		public Id_intern_elemContext id_intern_elem() {
			return getRuleContext(Id_intern_elemContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Elem_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterElem_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitElem_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitElem_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_arrayContext elem_array() throws RecognitionException {
		Elem_arrayContext _localctx = new Elem_arrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elem_array);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				id_intern_elem();
				setState(324);
				match(T__27);
				setState(325);
				expression();
				setState(326);
				match(T__28);
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
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

	public static class IfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public May_elseContext may_else() {
			return getRuleContext(May_elseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__48);
			setState(332);
			match(T__45);
			setState(333);
			expression();
			setState(334);
			match(T__46);
			setState(335);
			operator();
			setState(336);
			may_else();
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

	public static class May_elseContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public May_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_may_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).enterMay_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyCListener ) ((MyCListener)listener).exitMay_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyCVisitor ) return ((MyCVisitor<? extends T>)visitor).visitMay_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final May_elseContext may_else() throws RecognitionException {
		May_elseContext _localctx = new May_elseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_may_else);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__49);
				setState(339);
				operator();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u015a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\5\2Y\n\2\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\5\22\u00aa\n\22\3\23\3\23\3\23\5"+
		"\23\u00af\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00b6\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00c0\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00d9\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ef"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00fd\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u010f\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0118\n "+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0122\n\"\3#\3#\3#\5#\u0127\n#\3$\3$"+
		"\3$\5$\u012c\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0138\n%\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0144\n\'\3(\3(\3(\3(\3(\3(\5(\u014c\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u0158\n*\3*\2\2+\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\4\3\2\n\21\3\2"+
		"\22\33\2\u0158\2X\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bk\3\2\2\2\nr\3\2\2\2"+
		"\ft\3\2\2\2\16w\3\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2\2\2\24\u0084\3\2"+
		"\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u0091\3\2\2\2\34\u0099\3\2\2"+
		"\2\36\u009b\3\2\2\2 \u00a5\3\2\2\2\"\u00a9\3\2\2\2$\u00ae\3\2\2\2&\u00b5"+
		"\3\2\2\2(\u00b7\3\2\2\2*\u00bf\3\2\2\2,\u00c1\3\2\2\2.\u00c8\3\2\2\2\60"+
		"\u00d8\3\2\2\2\62\u00da\3\2\2\2\64\u00ee\3\2\2\2\66\u00f0\3\2\2\28\u00fc"+
		"\3\2\2\2:\u00fe\3\2\2\2<\u010e\3\2\2\2>\u0117\3\2\2\2@\u0119\3\2\2\2B"+
		"\u0121\3\2\2\2D\u0126\3\2\2\2F\u012b\3\2\2\2H\u0137\3\2\2\2J\u0139\3\2"+
		"\2\2L\u0143\3\2\2\2N\u014b\3\2\2\2P\u014d\3\2\2\2R\u0157\3\2\2\2TU\5\4"+
		"\3\2UV\5\2\2\2VY\3\2\2\2WY\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\3\3\2\2\2Z`\5"+
		"\30\r\2[`\5\6\4\2\\]\7\3\2\2]`\5@!\2^`\5,\27\2_Z\3\2\2\2_[\3\2\2\2_\\"+
		"\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\7\4\2\2bc\5\f\7\2cd\7\5\2\2de\5\b\5\2"+
		"ef\7\6\2\2f\7\3\2\2\2gh\5\30\r\2hi\5\b\5\2il\3\2\2\2jl\3\2\2\2kg\3\2\2"+
		"\2kj\3\2\2\2l\t\3\2\2\2ms\7\7\2\2ns\7\b\2\2op\5\f\7\2pq\7\t\2\2qs\3\2"+
		"\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2s\13\3\2\2\2tu\5\16\b\2uv\5\20\t\2v"+
		"\r\3\2\2\2wx\t\2\2\2x\17\3\2\2\2yz\5\16\b\2z{\5\20\t\2{\u0081\3\2\2\2"+
		"|}\5\22\n\2}~\5\20\t\2~\u0081\3\2\2\2\177\u0081\3\2\2\2\u0080y\3\2\2\2"+
		"\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0083\t\3\2\2"+
		"\u0083\23\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0086\5\26\f\2\u0086\25\3"+
		"\2\2\2\u0087\u0088\5\22\n\2\u0088\u0089\5\26\f\2\u0089\u008c\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c\27\3\2\2"+
		"\2\u008d\u008e\5\n\6\2\u008e\u008f\5\32\16\2\u008f\u0090\7\34\2\2\u0090"+
		"\31\3\2\2\2\u0091\u0092\5\36\20\2\u0092\u0093\5\34\17\2\u0093\33\3\2\2"+
		"\2\u0094\u0095\7\35\2\2\u0095\u0096\5\36\20\2\u0096\u0097\5\34\17\2\u0097"+
		"\u009a\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\35\3\2\2\2\u009b\u009c\5\f\7\2\u009c\u009d\5 \21\2\u009d\u009e"+
		"\5$\23\2\u009e\37\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\5\"\22\2\u00a1"+
		"\u00a2\7\37\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00aa"+
		"\5\f\7\2\u00a8\u00aa\5\22\n\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa#\3\2\2\2\u00ab\u00ac\7 \2\2\u00ac\u00af\5&\24\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af%\3\2\2\2\u00b0\u00b6"+
		"\5.\30\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\7\"\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\'\3\2\2\2"+
		"\u00b7\u00b8\5&\24\2\u00b8\u00b9\5*\26\2\u00b9)\3\2\2\2\u00ba\u00bb\7"+
		"\35\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\5*\26\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0+\3\2\2\2"+
		"\u00c1\u00c2\7#\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5"+
		"\7 \2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7\34\2\2\u00c7-\3\2\2\2\u00c8"+
		"\u00c9\5\62\32\2\u00c9\u00ca\5\60\31\2\u00ca/\3\2\2\2\u00cb\u00cc\7$\2"+
		"\2\u00cc\u00cd\5\62\32\2\u00cd\u00ce\5\60\31\2\u00ce\u00d9\3\2\2\2\u00cf"+
		"\u00d0\7%\2\2\u00d0\u00d1\5\62\32\2\u00d1\u00d2\5\60\31\2\u00d2\u00d9"+
		"\3\2\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\5\62\32\2\u00d5\u00d6\5\60\31"+
		"\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00cf"+
		"\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\61\3\2\2\2\u00da"+
		"\u00db\5\66\34\2\u00db\u00dc\5\64\33\2\u00dc\63\3\2\2\2\u00dd\u00de\7"+
		"\'\2\2\u00de\u00df\5\66\34\2\u00df\u00e0\5\64\33\2\u00e0\u00ef\3\2\2\2"+
		"\u00e1\u00e2\7(\2\2\u00e2\u00e3\5\66\34\2\u00e3\u00e4\5\64\33\2\u00e4"+
		"\u00ef\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7\5\66\34\2\u00e7\u00e8\5"+
		"\64\33\2\u00e8\u00ef\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\5\66\34\2"+
		"\u00eb\u00ec\5\64\33\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00dd"+
		"\3\2\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\65\3\2\2\2\u00f0\u00f1\5:\36\2\u00f1\u00f2\58\35"+
		"\2\u00f2\67\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\5:\36\2\u00f5\u00f6"+
		"\58\35\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\5:\36\2\u00f9"+
		"\u00fa\58\35\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f3\3\2"+
		"\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd9\3\2\2\2\u00fe\u00ff"+
		"\5> \2\u00ff\u0100\5<\37\2\u0100;\3\2\2\2\u0101\u0102\7-\2\2\u0102\u0103"+
		"\5> \2\u0103\u0104\5<\37\2\u0104\u010f\3\2\2\2\u0105\u0106\7.\2\2\u0106"+
		"\u0107\5> \2\u0107\u0108\5<\37\2\u0108\u010f\3\2\2\2\u0109\u010a\7/\2"+
		"\2\u010a\u010b\5> \2\u010b\u010c\5<\37\2\u010c\u010f\3\2\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0101\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0109\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f=\3\2\2\2\u0110\u0118\5\f\7\2\u0111\u0118\5\24\13"+
		"\2\u0112\u0118\5J&\2\u0113\u0114\7\60\2\2\u0114\u0115\5.\30\2\u0115\u0116"+
		"\7\61\2\2\u0116\u0118\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0111\3\2\2\2"+
		"\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0118?\3\2\2\2\u0119\u011a\7"+
		"!\2\2\u011a\u011b\5B\"\2\u011b\u011c\7\"\2\2\u011cA\3\2\2\2\u011d\u011e"+
		"\5D#\2\u011e\u011f\5B\"\2\u011f\u0122\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011d\3\2\2\2\u0121\u0120\3\2\2\2\u0122C\3\2\2\2\u0123\u0127\5\30\r\2"+
		"\u0124\u0127\5,\27\2\u0125\u0127\5F$\2\u0126\u0123\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127E\3\2\2\2\u0128\u012c\5@!\2\u0129\u012c"+
		"\5P)\2\u012a\u012c\5H%\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012cG\3\2\2\2\u012d\u012e\5J&\2\u012e\u012f\7 \2\2\u012f"+
		"\u0130\5&\24\2\u0130\u0131\7\34\2\2\u0131\u0138\3\2\2\2\u0132\u0133\5"+
		"\f\7\2\u0133\u0134\7 \2\2\u0134\u0135\5&\24\2\u0135\u0136\7\34\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u0132\3\2\2\2\u0138I\3\2\2\2"+
		"\u0139\u013a\5\f\7\2\u013a\u013b\5N(\2\u013b\u013c\5L\'\2\u013cK\3\2\2"+
		"\2\u013d\u013e\7\62\2\2\u013e\u013f\5\f\7\2\u013f\u0140\5N(\2\u0140\u0141"+
		"\5L\'\2\u0141\u0144\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013d\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144M\3\2\2\2\u0145\u0146\5J&\2\u0146\u0147\7\36\2\2\u0147"+
		"\u0148\5&\24\2\u0148\u0149\7\37\2\2\u0149\u014c\3\2\2\2\u014a\u014c\3"+
		"\2\2\2\u014b\u0145\3\2\2\2\u014b\u014a\3\2\2\2\u014cO\3\2\2\2\u014d\u014e"+
		"\7\63\2\2\u014e\u014f\7\60\2\2\u014f\u0150\5&\24\2\u0150\u0151\7\61\2"+
		"\2\u0151\u0152\5F$\2\u0152\u0153\5R*\2\u0153Q\3\2\2\2\u0154\u0155\7\64"+
		"\2\2\u0155\u0158\5F$\2\u0156\u0158\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0156"+
		"\3\2\2\2\u0158S\3\2\2\2\32X_kr\u0080\u008b\u0099\u00a5\u00a9\u00ae\u00b5"+
		"\u00bf\u00d8\u00ee\u00fc\u010e\u0117\u0121\u0126\u012b\u0137\u0143\u014b"+
		"\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}