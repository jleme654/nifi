// $ANTLR 3.5.2 org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g 2018-01-29 23:44:49

	package org.apache.nifi.attribute.expression.language.antlr;
	import org.apache.nifi.attribute.expression.language.exception.AttributeExpressionLanguageParsingException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AttributeExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL_ATTRIBUTES", "ALL_DELINEATED_VALUES", 
		"ALL_MATCHING_ATTRIBUTES", "AND", "ANY_ATTRIBUTE", "ANY_DELINEATED_VALUE", 
		"ANY_MATCHING_ATTRIBUTE", "APPEND", "ATTRIBUTE_NAME", "BASE64_DECODE", 
		"BASE64_ENCODE", "COLON", "COMMA", "COMMENT", "CONTAINS", "COUNT", "DECIMAL", 
		"DIVIDE", "DOLLAR", "DOT", "ENDS_WITH", "EQUALS", "EQUALS_IGNORE_CASE", 
		"ESC", "ESCAPE_CSV", "ESCAPE_HTML3", "ESCAPE_HTML4", "ESCAPE_JSON", "ESCAPE_XML", 
		"EXP", "FALSE", "FIND", "FORMAT", "FROM_RADIX", "GET_DELIMITED_FIELD", 
		"GET_STATE_VALUE", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "HOSTNAME", 
		"IF_ELSE", "IN", "INDEX_OF", "IP", "IS_EMPTY", "IS_NULL", "JOIN", "JSON_PATH", 
		"LAST_INDEX_OF", "LBRACE", "LENGTH", "LESS_THAN", "LESS_THAN_OR_EQUAL", 
		"LPAREN", "MATCHES", "MATH", "MINUS", "MOD", "MULTIPLY", "NEXT_INT", "NOT", 
		"NOT_NULL", "NOW", "OP", "OR", "PLUS", "PREPEND", "RANDOM", "RBRACE", 
		"REPLACE", "REPLACE_ALL", "REPLACE_EMPTY", "REPLACE_FIRST", "REPLACE_NULL", 
		"RPAREN", "SEMICOLON", "STARTS_WITH", "STRING_LITERAL", "SUBSTRING", "SUBSTRING_AFTER", 
		"SUBSTRING_AFTER_LAST", "SUBSTRING_BEFORE", "SUBSTRING_BEFORE_LAST", "TO_DATE", 
		"TO_DECIMAL", "TO_LITERAL", "TO_LOWER", "TO_NUMBER", "TO_RADIX", "TO_STRING", 
		"TO_UPPER", "TRIM", "TRUE", "UNESCAPE_CSV", "UNESCAPE_HTML3", "UNESCAPE_HTML4", 
		"UNESCAPE_JSON", "UNESCAPE_XML", "URL_DECODE", "URL_ENCODE", "UUID", "WHITESPACE", 
		"WHOLE_NUMBER", "ATTRIBUTE_REFERENCE", "ATTR_NAME", "EXPRESSION", "FUNCTION_CALL", 
		"MULTI_ATTRIBUTE_REFERENCE", "QUERY", "QUOTED_ATTR_NAME"
	};
	public static final int EOF=-1;
	public static final int ALL_ATTRIBUTES=4;
	public static final int ALL_DELINEATED_VALUES=5;
	public static final int ALL_MATCHING_ATTRIBUTES=6;
	public static final int AND=7;
	public static final int ANY_ATTRIBUTE=8;
	public static final int ANY_DELINEATED_VALUE=9;
	public static final int ANY_MATCHING_ATTRIBUTE=10;
	public static final int APPEND=11;
	public static final int ATTRIBUTE_NAME=12;
	public static final int BASE64_DECODE=13;
	public static final int BASE64_ENCODE=14;
	public static final int COLON=15;
	public static final int COMMA=16;
	public static final int COMMENT=17;
	public static final int CONTAINS=18;
	public static final int COUNT=19;
	public static final int DECIMAL=20;
	public static final int DIVIDE=21;
	public static final int DOLLAR=22;
	public static final int DOT=23;
	public static final int ENDS_WITH=24;
	public static final int EQUALS=25;
	public static final int EQUALS_IGNORE_CASE=26;
	public static final int ESC=27;
	public static final int ESCAPE_CSV=28;
	public static final int ESCAPE_HTML3=29;
	public static final int ESCAPE_HTML4=30;
	public static final int ESCAPE_JSON=31;
	public static final int ESCAPE_XML=32;
	public static final int EXP=33;
	public static final int FALSE=34;
	public static final int FIND=35;
	public static final int FORMAT=36;
	public static final int FROM_RADIX=37;
	public static final int GET_DELIMITED_FIELD=38;
	public static final int GET_STATE_VALUE=39;
	public static final int GREATER_THAN=40;
	public static final int GREATER_THAN_OR_EQUAL=41;
	public static final int HOSTNAME=42;
	public static final int IF_ELSE=43;
	public static final int IN=44;
	public static final int INDEX_OF=45;
	public static final int IP=46;
	public static final int IS_EMPTY=47;
	public static final int IS_NULL=48;
	public static final int JOIN=49;
	public static final int JSON_PATH=50;
	public static final int LAST_INDEX_OF=51;
	public static final int LBRACE=52;
	public static final int LENGTH=53;
	public static final int LESS_THAN=54;
	public static final int LESS_THAN_OR_EQUAL=55;
	public static final int LPAREN=56;
	public static final int MATCHES=57;
	public static final int MATH=58;
	public static final int MINUS=59;
	public static final int MOD=60;
	public static final int MULTIPLY=61;
	public static final int NEXT_INT=62;
	public static final int NOT=63;
	public static final int NOT_NULL=64;
	public static final int NOW=65;
	public static final int OP=66;
	public static final int OR=67;
	public static final int PLUS=68;
	public static final int PREPEND=69;
	public static final int RANDOM=70;
	public static final int RBRACE=71;
	public static final int REPLACE=72;
	public static final int REPLACE_ALL=73;
	public static final int REPLACE_EMPTY=74;
	public static final int REPLACE_FIRST=75;
	public static final int REPLACE_NULL=76;
	public static final int RPAREN=77;
	public static final int SEMICOLON=78;
	public static final int STARTS_WITH=79;
	public static final int STRING_LITERAL=80;
	public static final int SUBSTRING=81;
	public static final int SUBSTRING_AFTER=82;
	public static final int SUBSTRING_AFTER_LAST=83;
	public static final int SUBSTRING_BEFORE=84;
	public static final int SUBSTRING_BEFORE_LAST=85;
	public static final int TO_DATE=86;
	public static final int TO_DECIMAL=87;
	public static final int TO_LITERAL=88;
	public static final int TO_LOWER=89;
	public static final int TO_NUMBER=90;
	public static final int TO_RADIX=91;
	public static final int TO_STRING=92;
	public static final int TO_UPPER=93;
	public static final int TRIM=94;
	public static final int TRUE=95;
	public static final int UNESCAPE_CSV=96;
	public static final int UNESCAPE_HTML3=97;
	public static final int UNESCAPE_HTML4=98;
	public static final int UNESCAPE_JSON=99;
	public static final int UNESCAPE_XML=100;
	public static final int URL_DECODE=101;
	public static final int URL_ENCODE=102;
	public static final int UUID=103;
	public static final int WHITESPACE=104;
	public static final int WHOLE_NUMBER=105;
	public static final int ATTRIBUTE_REFERENCE=106;
	public static final int ATTR_NAME=107;
	public static final int EXPRESSION=108;
	public static final int FUNCTION_CALL=109;
	public static final int MULTI_ATTRIBUTE_REFERENCE=110;
	public static final int QUERY=111;
	public static final int QUOTED_ATTR_NAME=112;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AttributeExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AttributeExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AttributeExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g"; }


	  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  }

	  public void recover(final RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  }


	public static class zeroArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:1: zeroArgString : ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgString_return zeroArgString() throws RecognitionException {
		AttributeExpressionParser.zeroArgString_return retval = new AttributeExpressionParser.zeroArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;
		Token LPAREN2=null;
		Token RPAREN3=null;

		Object set1_tree=null;
		Object LPAREN2_tree=null;
		Object RPAREN3_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:15: ( ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:76:17: ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set1=input.LT(1);
			if ( (input.LA(1) >= BASE64_DECODE && input.LA(1) <= BASE64_ENCODE)||(input.LA(1) >= ESCAPE_CSV && input.LA(1) <= ESCAPE_XML)||input.LA(1)==TO_LOWER||(input.LA(1) >= TO_STRING && input.LA(1) <= TRIM)||(input.LA(1) >= UNESCAPE_CSV && input.LA(1) <= URL_ENCODE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set1));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgString150); 
			RPAREN3=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgString153); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgString"


	public static class oneArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:1: oneArgString : ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | FROM_RADIX ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.oneArgString_return oneArgString() throws RecognitionException {
		AttributeExpressionParser.oneArgString_return retval = new AttributeExpressionParser.oneArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set4=null;
		Token LPAREN5=null;
		Token RPAREN7=null;
		Token TO_RADIX8=null;
		Token LPAREN9=null;
		Token COMMA11=null;
		Token RPAREN13=null;
		ParserRuleReturnScope anyArg6 =null;
		ParserRuleReturnScope anyArg10 =null;
		ParserRuleReturnScope anyArg12 =null;

		Object set4_tree=null;
		Object LPAREN5_tree=null;
		Object RPAREN7_tree=null;
		Object TO_RADIX8_tree=null;
		Object LPAREN9_tree=null;
		Object COMMA11_tree=null;
		Object RPAREN13_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:14: ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | FROM_RADIX ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==APPEND||LA2_0==CONTAINS||LA2_0==ENDS_WITH||LA2_0==FROM_RADIX||(LA2_0 >= JOIN && LA2_0 <= JSON_PATH)||LA2_0==PREPEND||LA2_0==REPLACE_EMPTY||LA2_0==REPLACE_NULL||LA2_0==STARTS_WITH||(LA2_0 >= SUBSTRING_AFTER && LA2_0 <= SUBSTRING_BEFORE_LAST)) ) {
				alt2=1;
			}
			else if ( (LA2_0==TO_RADIX) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | FROM_RADIX ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | FROM_RADIX ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:77:17: ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | FROM_RADIX ) LPAREN ! anyArg RPAREN !
					{
					set4=input.LT(1);
					if ( input.LA(1)==APPEND||input.LA(1)==CONTAINS||input.LA(1)==ENDS_WITH||input.LA(1)==FROM_RADIX||(input.LA(1) >= JOIN && input.LA(1) <= JSON_PATH)||input.LA(1)==PREPEND||input.LA(1)==REPLACE_EMPTY||input.LA(1)==REPLACE_NULL||input.LA(1)==STARTS_WITH||(input.LA(1) >= SUBSTRING_AFTER && input.LA(1) <= SUBSTRING_BEFORE_LAST) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set4));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN5=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString222); 
					pushFollow(FOLLOW_anyArg_in_oneArgString225);
					anyArg6=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg6.getTree());

					RPAREN7=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString227); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:8: TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					TO_RADIX8=(Token)match(input,TO_RADIX,FOLLOW_TO_RADIX_in_oneArgString240); 
					TO_RADIX8_tree = (Object)adaptor.create(TO_RADIX8);
					adaptor.addChild(root_0, TO_RADIX8_tree);

					LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString242); 
					pushFollow(FOLLOW_anyArg_in_oneArgString245);
					anyArg10=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg10.getTree());

					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:32: ( COMMA ! anyArg )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COMMA) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:79:33: COMMA ! anyArg
							{
							COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_oneArgString248); 
							pushFollow(FOLLOW_anyArg_in_oneArgString251);
							anyArg12=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg12.getTree());

							}
							break;

					}

					RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString255); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgString"


	public static class twoArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "twoArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:1: twoArgString : ( ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( ( SUBSTRING | FORMAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.twoArgString_return twoArgString() throws RecognitionException {
		AttributeExpressionParser.twoArgString_return retval = new AttributeExpressionParser.twoArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;
		Token LPAREN15=null;
		Token COMMA17=null;
		Token RPAREN19=null;
		Token set20=null;
		Token LPAREN21=null;
		Token COMMA23=null;
		Token RPAREN25=null;
		ParserRuleReturnScope anyArg16 =null;
		ParserRuleReturnScope anyArg18 =null;
		ParserRuleReturnScope anyArg22 =null;
		ParserRuleReturnScope anyArg24 =null;

		Object set14_tree=null;
		Object LPAREN15_tree=null;
		Object COMMA17_tree=null;
		Object RPAREN19_tree=null;
		Object set20_tree=null;
		Object LPAREN21_tree=null;
		Object COMMA23_tree=null;
		Object RPAREN25_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:14: ( ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( ( SUBSTRING | FORMAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF_ELSE||(LA4_0 >= REPLACE && LA4_0 <= REPLACE_ALL)||LA4_0==REPLACE_FIRST) ) {
				alt4=1;
			}
			else if ( (LA4_0==FORMAT||LA4_0==SUBSTRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:16: ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:16: ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:80:17: ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE ) LPAREN ! anyArg COMMA ! anyArg RPAREN !
					{
					set14=input.LT(1);
					if ( input.LA(1)==IF_ELSE||(input.LA(1) >= REPLACE && input.LA(1) <= REPLACE_ALL)||input.LA(1)==REPLACE_FIRST ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set14));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString281); 
					pushFollow(FOLLOW_anyArg_in_twoArgString284);
					anyArg16=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg16.getTree());

					COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString286); 
					pushFollow(FOLLOW_anyArg_in_twoArgString289);
					anyArg18=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg18.getTree());

					RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString291); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:7: ( ( SUBSTRING | FORMAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:7: ( ( SUBSTRING | FORMAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:8: ( SUBSTRING | FORMAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					set20=input.LT(1);
					if ( input.LA(1)==FORMAT||input.LA(1)==SUBSTRING ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set20));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString312); 
					pushFollow(FOLLOW_anyArg_in_twoArgString315);
					anyArg22=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg22.getTree());

					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:44: ( COMMA ! anyArg )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==COMMA) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:81:45: COMMA ! anyArg
							{
							COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString318); 
							pushFollow(FOLLOW_anyArg_in_twoArgString321);
							anyArg24=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg24.getTree());

							}
							break;

					}

					RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString325); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "twoArgString"


	public static class fiveArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fiveArgString"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:1: fiveArgString : GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !;
	public final AttributeExpressionParser.fiveArgString_return fiveArgString() throws RecognitionException {
		AttributeExpressionParser.fiveArgString_return retval = new AttributeExpressionParser.fiveArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GET_DELIMITED_FIELD26=null;
		Token LPAREN27=null;
		Token COMMA29=null;
		Token COMMA31=null;
		Token COMMA33=null;
		Token COMMA35=null;
		Token RPAREN37=null;
		ParserRuleReturnScope anyArg28 =null;
		ParserRuleReturnScope anyArg30 =null;
		ParserRuleReturnScope anyArg32 =null;
		ParserRuleReturnScope anyArg34 =null;
		ParserRuleReturnScope anyArg36 =null;

		Object GET_DELIMITED_FIELD26_tree=null;
		Object LPAREN27_tree=null;
		Object COMMA29_tree=null;
		Object COMMA31_tree=null;
		Object COMMA33_tree=null;
		Object COMMA35_tree=null;
		Object RPAREN37_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:15: ( GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:17: GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			GET_DELIMITED_FIELD26=(Token)match(input,GET_DELIMITED_FIELD,FOLLOW_GET_DELIMITED_FIELD_in_fiveArgString334); 
			GET_DELIMITED_FIELD26_tree = (Object)adaptor.create(GET_DELIMITED_FIELD26);
			adaptor.addChild(root_0, GET_DELIMITED_FIELD26_tree);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fiveArgString336); 
			pushFollow(FOLLOW_anyArg_in_fiveArgString339);
			anyArg28=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg28.getTree());

			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:52: ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==COMMA) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:53: COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )?
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString342); 
					pushFollow(FOLLOW_anyArg_in_fiveArgString345);
					anyArg30=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg30.getTree());

					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:67: ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COMMA) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:68: COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )?
							{
							COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString348); 
							pushFollow(FOLLOW_anyArg_in_fiveArgString351);
							anyArg32=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg32.getTree());

							// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:82: ( COMMA ! anyArg ( COMMA ! anyArg )? )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==COMMA) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:83: COMMA ! anyArg ( COMMA ! anyArg )?
									{
									COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString354); 
									pushFollow(FOLLOW_anyArg_in_fiveArgString357);
									anyArg34=anyArg();
									state._fsp--;

									adaptor.addChild(root_0, anyArg34.getTree());

									// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:97: ( COMMA ! anyArg )?
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==COMMA) ) {
										alt5=1;
									}
									switch (alt5) {
										case 1 :
											// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:82:98: COMMA ! anyArg
											{
											COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString360); 
											pushFollow(FOLLOW_anyArg_in_fiveArgString363);
											anyArg36=anyArg();
											state._fsp--;

											adaptor.addChild(root_0, anyArg36.getTree());

											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fiveArgString373); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fiveArgString"


	public static class zeroArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgBool"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:1: zeroArgBool : ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgBool_return zeroArgBool() throws RecognitionException {
		AttributeExpressionParser.zeroArgBool_return retval = new AttributeExpressionParser.zeroArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set38=null;
		Token LPAREN39=null;
		Token RPAREN40=null;

		Object set38_tree=null;
		Object LPAREN39_tree=null;
		Object RPAREN40_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:13: ( ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:85:15: ( IS_NULL | NOT_NULL | IS_EMPTY | NOT ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set38=input.LT(1);
			if ( (input.LA(1) >= IS_EMPTY && input.LA(1) <= IS_NULL)||(input.LA(1) >= NOT && input.LA(1) <= NOT_NULL) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set38));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgBool399); 
			RPAREN40=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgBool402); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgBool"


	public static class oneArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgBool"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:1: oneArgBool : ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !);
	public final AttributeExpressionParser.oneArgBool_return oneArgBool() throws RecognitionException {
		AttributeExpressionParser.oneArgBool_return retval = new AttributeExpressionParser.oneArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set41=null;
		Token LPAREN42=null;
		Token RPAREN44=null;
		Token set45=null;
		Token LPAREN46=null;
		Token RPAREN48=null;
		Token EQUALS49=null;
		Token LPAREN50=null;
		Token RPAREN52=null;
		Token set53=null;
		Token LPAREN54=null;
		Token RPAREN56=null;
		ParserRuleReturnScope anyArg43 =null;
		ParserRuleReturnScope anyArg47 =null;
		ParserRuleReturnScope anyArg51 =null;
		ParserRuleReturnScope anyArg55 =null;

		Object set41_tree=null;
		Object LPAREN42_tree=null;
		Object RPAREN44_tree=null;
		Object set45_tree=null;
		Object LPAREN46_tree=null;
		Object RPAREN48_tree=null;
		Object EQUALS49_tree=null;
		Object LPAREN50_tree=null;
		Object RPAREN52_tree=null;
		Object set53_tree=null;
		Object LPAREN54_tree=null;
		Object RPAREN56_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:12: ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !)
			int alt9=4;
			switch ( input.LA(1) ) {
			case EQUALS_IGNORE_CASE:
			case FIND:
			case MATCHES:
				{
				alt9=1;
				}
				break;
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
				{
				alt9=2;
				}
				break;
			case EQUALS:
				{
				alt9=3;
				}
				break;
			case AND:
			case OR:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:86:15: ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !
					{
					set41=input.LT(1);
					if ( input.LA(1)==EQUALS_IGNORE_CASE||input.LA(1)==FIND||input.LA(1)==MATCHES ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set41));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool423); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool426);
					anyArg43=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg43.getTree());

					RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool428); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:87:6: ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set45=input.LT(1);
					if ( (input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_OR_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LESS_THAN_OR_EQUAL) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set45));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool455); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool458);
					anyArg47=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg47.getTree());

					RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool460); 
					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:6: ( EQUALS ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:6: ( EQUALS )
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:88:7: EQUALS
					{
					EQUALS49=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_oneArgBool471); 
					EQUALS49_tree = (Object)adaptor.create(EQUALS49);
					adaptor.addChild(root_0, EQUALS49_tree);

					}

					LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool474); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool477);
					anyArg51=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg51.getTree());

					RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool479); 
					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:89:6: ( AND | OR ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set53=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set53));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN54=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool497); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool500);
					anyArg55=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg55.getTree());

					RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool502); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgBool"


	public static class multiArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiArgBool"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:1: multiArgBool : ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !;
	public final AttributeExpressionParser.multiArgBool_return multiArgBool() throws RecognitionException {
		AttributeExpressionParser.multiArgBool_return retval = new AttributeExpressionParser.multiArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IN57=null;
		Token LPAREN58=null;
		Token COMMA60=null;
		Token RPAREN62=null;
		ParserRuleReturnScope anyArg59 =null;
		ParserRuleReturnScope anyArg61 =null;

		Object IN57_tree=null;
		Object LPAREN58_tree=null;
		Object COMMA60_tree=null;
		Object RPAREN62_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:14: ( ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:16: ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:16: ( IN )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:17: IN
			{
			IN57=(Token)match(input,IN,FOLLOW_IN_in_multiArgBool511); 
			IN57_tree = (Object)adaptor.create(IN57);
			adaptor.addChild(root_0, IN57_tree);

			}

			LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_multiArgBool514); 
			pushFollow(FOLLOW_anyArg_in_multiArgBool517);
			anyArg59=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg59.getTree());

			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:36: ( COMMA ! anyArg )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:90:37: COMMA ! anyArg
					{
					COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiArgBool520); 
					pushFollow(FOLLOW_anyArg_in_multiArgBool523);
					anyArg61=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg61.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_multiArgBool527); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiArgBool"


	public static class zeroArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:1: zeroArgNum : ( LENGTH | TO_NUMBER | TO_DECIMAL | COUNT ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgNum_return zeroArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroArgNum_return retval = new AttributeExpressionParser.zeroArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;
		Token LPAREN64=null;
		Token RPAREN65=null;

		Object set63_tree=null;
		Object LPAREN64_tree=null;
		Object RPAREN65_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:12: ( ( LENGTH | TO_NUMBER | TO_DECIMAL | COUNT ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:94:14: ( LENGTH | TO_NUMBER | TO_DECIMAL | COUNT ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==COUNT||input.LA(1)==LENGTH||input.LA(1)==TO_DECIMAL||input.LA(1)==TO_NUMBER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set63));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgNum554); 
			RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgNum557); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgNum"


	public static class oneArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:1: oneArgNum : ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) );
	public final AttributeExpressionParser.oneArgNum_return oneArgNum() throws RecognitionException {
		AttributeExpressionParser.oneArgNum_return retval = new AttributeExpressionParser.oneArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set66=null;
		Token LPAREN67=null;
		Token RPAREN69=null;
		Token set70=null;
		Token LPAREN71=null;
		Token RPAREN73=null;
		ParserRuleReturnScope anyArg68 =null;
		ParserRuleReturnScope anyArg72 =null;

		Object set66_tree=null;
		Object LPAREN67_tree=null;
		Object RPAREN69_tree=null;
		Object set70_tree=null;
		Object LPAREN71_tree=null;
		Object RPAREN73_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:11: ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INDEX_OF||LA11_0==LAST_INDEX_OF) ) {
				alt11=1;
			}
			else if ( (LA11_0==DIVIDE||(LA11_0 >= MINUS && LA11_0 <= MULTIPLY)||LA11_0==PLUS) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:95:14: ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !
					{
					set66=input.LT(1);
					if ( input.LA(1)==INDEX_OF||input.LA(1)==LAST_INDEX_OF ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set66));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum574); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum577);
					anyArg68=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg68.getTree());

					RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum579); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:96:7: ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !
					{
					set70=input.LT(1);
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MINUS && input.LA(1) <= MULTIPLY)||input.LA(1)==PLUS ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set70));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum611); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum614);
					anyArg72=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg72.getTree());

					RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum616); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgNum"


	public static class oneOrTwoArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneOrTwoArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:97:1: oneOrTwoArgNum : MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !;
	public final AttributeExpressionParser.oneOrTwoArgNum_return oneOrTwoArgNum() throws RecognitionException {
		AttributeExpressionParser.oneOrTwoArgNum_return retval = new AttributeExpressionParser.oneOrTwoArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MATH74=null;
		Token LPAREN75=null;
		Token COMMA77=null;
		Token RPAREN79=null;
		ParserRuleReturnScope anyArg76 =null;
		ParserRuleReturnScope anyArg78 =null;

		Object MATH74_tree=null;
		Object LPAREN75_tree=null;
		Object COMMA77_tree=null;
		Object RPAREN79_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:97:16: ( MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:97:18: MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			MATH74=(Token)match(input,MATH,FOLLOW_MATH_in_oneOrTwoArgNum625); 
			MATH74_tree = (Object)adaptor.create(MATH74);
			adaptor.addChild(root_0, MATH74_tree);

			LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneOrTwoArgNum627); 
			pushFollow(FOLLOW_anyArg_in_oneOrTwoArgNum630);
			anyArg76=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg76.getTree());

			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:97:38: ( COMMA ! anyArg )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:97:39: COMMA ! anyArg
					{
					COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_oneOrTwoArgNum633); 
					pushFollow(FOLLOW_anyArg_in_oneOrTwoArgNum636);
					anyArg78=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg78.getTree());

					}
					break;

			}

			RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneOrTwoArgNum640); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneOrTwoArgNum"


	public static class zeroOrOneOrTwoArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroOrOneOrTwoArgNum"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:1: zeroOrOneOrTwoArgNum : TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !;
	public final AttributeExpressionParser.zeroOrOneOrTwoArgNum_return zeroOrOneOrTwoArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroOrOneOrTwoArgNum_return retval = new AttributeExpressionParser.zeroOrOneOrTwoArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO_DATE80=null;
		Token LPAREN81=null;
		Token COMMA83=null;
		Token RPAREN85=null;
		ParserRuleReturnScope anyArg82 =null;
		ParserRuleReturnScope anyArg84 =null;

		Object TO_DATE80_tree=null;
		Object LPAREN81_tree=null;
		Object COMMA83_tree=null;
		Object RPAREN85_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:22: ( TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:24: TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			TO_DATE80=(Token)match(input,TO_DATE,FOLLOW_TO_DATE_in_zeroOrOneOrTwoArgNum648); 
			TO_DATE80_tree = (Object)adaptor.create(TO_DATE80);
			adaptor.addChild(root_0, TO_DATE80_tree);

			LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroOrOneOrTwoArgNum650); 
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:40: ( anyArg )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND||LA13_0==APPEND||(LA13_0 >= BASE64_DECODE && LA13_0 <= BASE64_ENCODE)||(LA13_0 >= CONTAINS && LA13_0 <= DOLLAR)||(LA13_0 >= ENDS_WITH && LA13_0 <= EQUALS_IGNORE_CASE)||(LA13_0 >= ESCAPE_CSV && LA13_0 <= ESCAPE_XML)||(LA13_0 >= FALSE && LA13_0 <= GET_DELIMITED_FIELD)||(LA13_0 >= GREATER_THAN && LA13_0 <= GREATER_THAN_OR_EQUAL)||(LA13_0 >= IF_ELSE && LA13_0 <= INDEX_OF)||(LA13_0 >= IS_EMPTY && LA13_0 <= LAST_INDEX_OF)||(LA13_0 >= LENGTH && LA13_0 <= LESS_THAN_OR_EQUAL)||(LA13_0 >= MATCHES && LA13_0 <= MULTIPLY)||(LA13_0 >= NOT && LA13_0 <= NOT_NULL)||(LA13_0 >= OR && LA13_0 <= PREPEND)||(LA13_0 >= REPLACE && LA13_0 <= REPLACE_NULL)||(LA13_0 >= STARTS_WITH && LA13_0 <= TO_DECIMAL)||(LA13_0 >= TO_LOWER && LA13_0 <= URL_ENCODE)||LA13_0==WHOLE_NUMBER) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:40: anyArg
					{
					pushFollow(FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum653);
					anyArg82=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg82.getTree());

					}
					break;

			}

			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:48: ( COMMA ! anyArg )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==COMMA) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:98:49: COMMA ! anyArg
					{
					COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_zeroOrOneOrTwoArgNum657); 
					pushFollow(FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum660);
					anyArg84=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg84.getTree());

					}
					break;

			}

			RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroOrOneOrTwoArgNum664); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroOrOneOrTwoArgNum"


	public static class stringFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:1: stringFunctionRef : ( zeroArgString | oneArgString | twoArgString | fiveArgString );
	public final AttributeExpressionParser.stringFunctionRef_return stringFunctionRef() throws RecognitionException {
		AttributeExpressionParser.stringFunctionRef_return retval = new AttributeExpressionParser.stringFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgString86 =null;
		ParserRuleReturnScope oneArgString87 =null;
		ParserRuleReturnScope twoArgString88 =null;
		ParserRuleReturnScope fiveArgString89 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:19: ( zeroArgString | oneArgString | twoArgString | fiveArgString )
			int alt15=4;
			switch ( input.LA(1) ) {
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt15=1;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case JOIN:
			case JSON_PATH:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt15=2;
				}
				break;
			case FORMAT:
			case IF_ELSE:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt15=3;
				}
				break;
			case GET_DELIMITED_FIELD:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:21: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringFunctionRef673);
					zeroArgString86=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString86.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:37: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringFunctionRef677);
					oneArgString87=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString87.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:52: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringFunctionRef681);
					twoArgString88=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString88.getTree());

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:100:67: fiveArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fiveArgString_in_stringFunctionRef685);
					fiveArgString89=fiveArgString();
					state._fsp--;

					adaptor.addChild(root_0, fiveArgString89.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringFunctionRef"


	public static class booleanFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:101:1: booleanFunctionRef : ( zeroArgBool | oneArgBool | multiArgBool );
	public final AttributeExpressionParser.booleanFunctionRef_return booleanFunctionRef() throws RecognitionException {
		AttributeExpressionParser.booleanFunctionRef_return retval = new AttributeExpressionParser.booleanFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgBool90 =null;
		ParserRuleReturnScope oneArgBool91 =null;
		ParserRuleReturnScope multiArgBool92 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:101:20: ( zeroArgBool | oneArgBool | multiArgBool )
			int alt16=3;
			switch ( input.LA(1) ) {
			case IS_EMPTY:
			case IS_NULL:
			case NOT:
			case NOT_NULL:
				{
				alt16=1;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case OR:
				{
				alt16=2;
				}
				break;
			case IN:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:101:22: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_booleanFunctionRef692);
					zeroArgBool90=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool90.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:101:36: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_booleanFunctionRef696);
					oneArgBool91=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool91.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:101:49: multiArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiArgBool_in_booleanFunctionRef700);
					multiArgBool92=multiArgBool();
					state._fsp--;

					adaptor.addChild(root_0, multiArgBool92.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanFunctionRef"


	public static class numberFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numberFunctionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:1: numberFunctionRef : ( zeroArgNum | oneArgNum | oneOrTwoArgNum | zeroOrOneOrTwoArgNum );
	public final AttributeExpressionParser.numberFunctionRef_return numberFunctionRef() throws RecognitionException {
		AttributeExpressionParser.numberFunctionRef_return retval = new AttributeExpressionParser.numberFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgNum93 =null;
		ParserRuleReturnScope oneArgNum94 =null;
		ParserRuleReturnScope oneOrTwoArgNum95 =null;
		ParserRuleReturnScope zeroOrOneOrTwoArgNum96 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:19: ( zeroArgNum | oneArgNum | oneOrTwoArgNum | zeroOrOneOrTwoArgNum )
			int alt17=4;
			switch ( input.LA(1) ) {
			case COUNT:
			case LENGTH:
			case TO_DECIMAL:
			case TO_NUMBER:
				{
				alt17=1;
				}
				break;
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
				{
				alt17=2;
				}
				break;
			case MATH:
				{
				alt17=3;
				}
				break;
			case TO_DATE:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:21: zeroArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgNum_in_numberFunctionRef707);
					zeroArgNum93=zeroArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgNum93.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:34: oneArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgNum_in_numberFunctionRef711);
					oneArgNum94=oneArgNum();
					state._fsp--;

					adaptor.addChild(root_0, oneArgNum94.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:46: oneOrTwoArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneOrTwoArgNum_in_numberFunctionRef715);
					oneOrTwoArgNum95=oneOrTwoArgNum();
					state._fsp--;

					adaptor.addChild(root_0, oneOrTwoArgNum95.getTree());

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:102:63: zeroOrOneOrTwoArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroOrOneOrTwoArgNum_in_numberFunctionRef719);
					zeroOrOneOrTwoArgNum96=zeroOrOneOrTwoArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroOrOneOrTwoArgNum96.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numberFunctionRef"


	public static class anyArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "anyArg"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:1: anyArg : ( WHOLE_NUMBER | DECIMAL | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | fiveArgString | booleanLiteral | zeroArgBool | oneArgBool | multiArgBool | expression );
	public final AttributeExpressionParser.anyArg_return anyArg() throws RecognitionException {
		AttributeExpressionParser.anyArg_return retval = new AttributeExpressionParser.anyArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHOLE_NUMBER97=null;
		Token DECIMAL98=null;
		Token STRING_LITERAL100=null;
		ParserRuleReturnScope numberFunctionRef99 =null;
		ParserRuleReturnScope zeroArgString101 =null;
		ParserRuleReturnScope oneArgString102 =null;
		ParserRuleReturnScope twoArgString103 =null;
		ParserRuleReturnScope fiveArgString104 =null;
		ParserRuleReturnScope booleanLiteral105 =null;
		ParserRuleReturnScope zeroArgBool106 =null;
		ParserRuleReturnScope oneArgBool107 =null;
		ParserRuleReturnScope multiArgBool108 =null;
		ParserRuleReturnScope expression109 =null;

		Object WHOLE_NUMBER97_tree=null;
		Object DECIMAL98_tree=null;
		Object STRING_LITERAL100_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:8: ( WHOLE_NUMBER | DECIMAL | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | fiveArgString | booleanLiteral | zeroArgBool | oneArgBool | multiArgBool | expression )
			int alt18=13;
			switch ( input.LA(1) ) {
			case WHOLE_NUMBER:
				{
				alt18=1;
				}
				break;
			case DECIMAL:
				{
				alt18=2;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MATH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_DECIMAL:
			case TO_NUMBER:
				{
				alt18=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt18=4;
				}
				break;
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt18=5;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case JOIN:
			case JSON_PATH:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt18=6;
				}
				break;
			case FORMAT:
			case IF_ELSE:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt18=7;
				}
				break;
			case GET_DELIMITED_FIELD:
				{
				alt18=8;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt18=9;
				}
				break;
			case IS_EMPTY:
			case IS_NULL:
			case NOT:
			case NOT_NULL:
				{
				alt18=10;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case OR:
				{
				alt18=11;
				}
				break;
			case IN:
				{
				alt18=12;
				}
				break;
			case DOLLAR:
				{
				alt18=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:10: WHOLE_NUMBER
					{
					root_0 = (Object)adaptor.nil();


					WHOLE_NUMBER97=(Token)match(input,WHOLE_NUMBER,FOLLOW_WHOLE_NUMBER_in_anyArg727); 
					WHOLE_NUMBER97_tree = (Object)adaptor.create(WHOLE_NUMBER97);
					adaptor.addChild(root_0, WHOLE_NUMBER97_tree);

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:25: DECIMAL
					{
					root_0 = (Object)adaptor.nil();


					DECIMAL98=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_anyArg731); 
					DECIMAL98_tree = (Object)adaptor.create(DECIMAL98);
					adaptor.addChild(root_0, DECIMAL98_tree);

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:35: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_anyArg735);
					numberFunctionRef99=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef99.getTree());

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:55: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL100=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_anyArg739); 
					STRING_LITERAL100_tree = (Object)adaptor.create(STRING_LITERAL100);
					adaptor.addChild(root_0, STRING_LITERAL100_tree);

					}
					break;
				case 5 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:72: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_anyArg743);
					zeroArgString101=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString101.getTree());

					}
					break;
				case 6 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:88: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_anyArg747);
					oneArgString102=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString102.getTree());

					}
					break;
				case 7 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:103: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_anyArg751);
					twoArgString103=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString103.getTree());

					}
					break;
				case 8 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:118: fiveArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fiveArgString_in_anyArg755);
					fiveArgString104=fiveArgString();
					state._fsp--;

					adaptor.addChild(root_0, fiveArgString104.getTree());

					}
					break;
				case 9 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:134: booleanLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_anyArg759);
					booleanLiteral105=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral105.getTree());

					}
					break;
				case 10 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:151: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_anyArg763);
					zeroArgBool106=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool106.getTree());

					}
					break;
				case 11 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:165: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_anyArg767);
					oneArgBool107=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool107.getTree());

					}
					break;
				case 12 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:178: multiArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiArgBool_in_anyArg771);
					multiArgBool108=multiArgBool();
					state._fsp--;

					adaptor.addChild(root_0, multiArgBool108.getTree());

					}
					break;
				case 13 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:104:193: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_anyArg775);
					expression109=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression109.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "anyArg"


	public static class stringArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringArg"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:1: stringArg : ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression );
	public final AttributeExpressionParser.stringArg_return stringArg() throws RecognitionException {
		AttributeExpressionParser.stringArg_return retval = new AttributeExpressionParser.stringArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL110=null;
		ParserRuleReturnScope zeroArgString111 =null;
		ParserRuleReturnScope oneArgString112 =null;
		ParserRuleReturnScope twoArgString113 =null;
		ParserRuleReturnScope expression114 =null;

		Object STRING_LITERAL110_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:11: ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression )
			int alt19=5;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt19=1;
				}
				break;
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt19=2;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case JOIN:
			case JSON_PATH:
			case PREPEND:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
				{
				alt19=3;
				}
				break;
			case FORMAT:
			case IF_ELSE:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt19=4;
				}
				break;
			case DOLLAR:
				{
				alt19=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:13: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL110=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringArg782); 
					STRING_LITERAL110_tree = (Object)adaptor.create(STRING_LITERAL110);
					adaptor.addChild(root_0, STRING_LITERAL110_tree);

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:30: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringArg786);
					zeroArgString111=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString111.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:46: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringArg790);
					oneArgString112=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString112.getTree());

					}
					break;
				case 4 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:61: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringArg794);
					twoArgString113=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString113.getTree());

					}
					break;
				case 5 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:105:76: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_stringArg798);
					expression114=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression114.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringArg"


	public static class functionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:106:1: functionRef : ( stringFunctionRef | booleanFunctionRef | numberFunctionRef );
	public final AttributeExpressionParser.functionRef_return functionRef() throws RecognitionException {
		AttributeExpressionParser.functionRef_return retval = new AttributeExpressionParser.functionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stringFunctionRef115 =null;
		ParserRuleReturnScope booleanFunctionRef116 =null;
		ParserRuleReturnScope numberFunctionRef117 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:106:13: ( stringFunctionRef | booleanFunctionRef | numberFunctionRef )
			int alt20=3;
			switch ( input.LA(1) ) {
			case APPEND:
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case CONTAINS:
			case ENDS_WITH:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case FORMAT:
			case FROM_RADIX:
			case GET_DELIMITED_FIELD:
			case IF_ELSE:
			case JOIN:
			case JSON_PATH:
			case PREPEND:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_EMPTY:
			case REPLACE_FIRST:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_LOWER:
			case TO_RADIX:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt20=1;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case IN:
			case IS_EMPTY:
			case IS_NULL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case NOT:
			case NOT_NULL:
			case OR:
				{
				alt20=2;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MATH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_DECIMAL:
			case TO_NUMBER:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:106:15: stringFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_stringFunctionRef_in_functionRef805);
					stringFunctionRef115=stringFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, stringFunctionRef115.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:106:35: booleanFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanFunctionRef_in_functionRef809);
					booleanFunctionRef116=booleanFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, booleanFunctionRef116.getTree());

					}
					break;
				case 3 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:106:56: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_functionRef813);
					numberFunctionRef117=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef117.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionRef"


	public static class subject_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subject"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:111:1: subject : ( attrName | expression );
	public final AttributeExpressionParser.subject_return subject() throws RecognitionException {
		AttributeExpressionParser.subject_return retval = new AttributeExpressionParser.subject_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attrName118 =null;
		ParserRuleReturnScope expression119 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:111:9: ( attrName | expression )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= ALL_ATTRIBUTES && LA21_0 <= ALL_MATCHING_ATTRIBUTES)||(LA21_0 >= ANY_ATTRIBUTE && LA21_0 <= ANY_MATCHING_ATTRIBUTE)||LA21_0==ATTRIBUTE_NAME||LA21_0==STRING_LITERAL) ) {
				alt21=1;
			}
			else if ( (LA21_0==DOLLAR) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:111:11: attrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attrName_in_subject824);
					attrName118=attrName();
					state._fsp--;

					adaptor.addChild(root_0, attrName118.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:111:22: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_subject828);
					expression119=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression119.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subject"


	public static class attrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:1: attrName : ( singleAttrName | multiAttrName );
	public final AttributeExpressionParser.attrName_return attrName() throws RecognitionException {
		AttributeExpressionParser.attrName_return retval = new AttributeExpressionParser.attrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrName120 =null;
		ParserRuleReturnScope multiAttrName121 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:10: ( singleAttrName | multiAttrName )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ATTRIBUTE_NAME||LA22_0==STRING_LITERAL) ) {
				alt22=1;
			}
			else if ( ((LA22_0 >= ALL_ATTRIBUTES && LA22_0 <= ALL_MATCHING_ATTRIBUTES)||(LA22_0 >= ANY_ATTRIBUTE && LA22_0 <= ANY_MATCHING_ATTRIBUTE)) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:12: singleAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_singleAttrName_in_attrName835);
					singleAttrName120=singleAttrName();
					state._fsp--;

					adaptor.addChild(root_0, singleAttrName120.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:112:29: multiAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiAttrName_in_attrName839);
					multiAttrName121=multiAttrName();
					state._fsp--;

					adaptor.addChild(root_0, multiAttrName121.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrName"


	public static class singleAttrRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:114:1: singleAttrRef : ( ATTRIBUTE_NAME | STRING_LITERAL );
	public final AttributeExpressionParser.singleAttrRef_return singleAttrRef() throws RecognitionException {
		AttributeExpressionParser.singleAttrRef_return retval = new AttributeExpressionParser.singleAttrRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set122=null;

		Object set122_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:114:15: ( ATTRIBUTE_NAME | STRING_LITERAL )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set122=input.LT(1);
			if ( input.LA(1)==ATTRIBUTE_NAME||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set122));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrRef"


	public static class singleAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:115:1: singleAttrName : singleAttrRef -> ^( ATTR_NAME singleAttrRef ) ;
	public final AttributeExpressionParser.singleAttrName_return singleAttrName() throws RecognitionException {
		AttributeExpressionParser.singleAttrName_return retval = new AttributeExpressionParser.singleAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrRef123 =null;

		RewriteRuleSubtreeStream stream_singleAttrRef=new RewriteRuleSubtreeStream(adaptor,"rule singleAttrRef");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:115:16: ( singleAttrRef -> ^( ATTR_NAME singleAttrRef ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:115:18: singleAttrRef
			{
			pushFollow(FOLLOW_singleAttrRef_in_singleAttrName858);
			singleAttrRef123=singleAttrRef();
			state._fsp--;

			stream_singleAttrRef.add(singleAttrRef123.getTree());
			// AST REWRITE
			// elements: singleAttrRef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:32: -> ^( ATTR_NAME singleAttrRef )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:116:2: ^( ATTR_NAME singleAttrRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTR_NAME, "ATTR_NAME"), root_1);
				adaptor.addChild(root_1, stream_singleAttrRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrName"


	public static class multiAttrFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:119:1: multiAttrFunction : ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES );
	public final AttributeExpressionParser.multiAttrFunction_return multiAttrFunction() throws RecognitionException {
		AttributeExpressionParser.multiAttrFunction_return retval = new AttributeExpressionParser.multiAttrFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set124=null;

		Object set124_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:119:19: ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set124=input.LT(1);
			if ( (input.LA(1) >= ALL_ATTRIBUTES && input.LA(1) <= ALL_MATCHING_ATTRIBUTES)||(input.LA(1) >= ANY_ATTRIBUTE && input.LA(1) <= ANY_MATCHING_ATTRIBUTE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set124));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrFunction"


	public static class multiAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrName"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:120:1: multiAttrName : multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) ;
	public final AttributeExpressionParser.multiAttrName_return multiAttrName() throws RecognitionException {
		AttributeExpressionParser.multiAttrName_return retval = new AttributeExpressionParser.multiAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN126=null;
		Token COMMA128=null;
		Token RPAREN130=null;
		ParserRuleReturnScope multiAttrFunction125 =null;
		ParserRuleReturnScope stringArg127 =null;
		ParserRuleReturnScope stringArg129 =null;

		Object LPAREN126_tree=null;
		Object COMMA128_tree=null;
		Object RPAREN130_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_multiAttrFunction=new RewriteRuleSubtreeStream(adaptor,"rule multiAttrFunction");
		RewriteRuleSubtreeStream stream_stringArg=new RewriteRuleSubtreeStream(adaptor,"rule stringArg");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:120:15: ( multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:120:17: multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN
			{
			pushFollow(FOLLOW_multiAttrFunction_in_multiAttrName903);
			multiAttrFunction125=multiAttrFunction();
			state._fsp--;

			stream_multiAttrFunction.add(multiAttrFunction125.getTree());
			LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_multiAttrName905);  
			stream_LPAREN.add(LPAREN126);

			pushFollow(FOLLOW_stringArg_in_multiAttrName907);
			stringArg127=stringArg();
			state._fsp--;

			stream_stringArg.add(stringArg127.getTree());
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:120:52: ( COMMA stringArg )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:120:53: COMMA stringArg
					{
					COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiAttrName910);  
					stream_COMMA.add(COMMA128);

					pushFollow(FOLLOW_stringArg_in_multiAttrName912);
					stringArg129=stringArg();
					state._fsp--;

					stream_stringArg.add(stringArg129.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_multiAttrName916);  
			stream_RPAREN.add(RPAREN130);

			// AST REWRITE
			// elements: stringArg, multiAttrFunction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 120:78: -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:121:2: ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTI_ATTRIBUTE_REFERENCE, "MULTI_ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_multiAttrFunction.nextTree());
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:121:48: ( stringArg )*
				while ( stream_stringArg.hasNext() ) {
					adaptor.addChild(root_1, stream_stringArg.nextTree());
				}
				stream_stringArg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrName"


	public static class attributeRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRef"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:123:1: attributeRef : subject -> ^( ATTRIBUTE_REFERENCE subject ) ;
	public final AttributeExpressionParser.attributeRef_return attributeRef() throws RecognitionException {
		AttributeExpressionParser.attributeRef_return retval = new AttributeExpressionParser.attributeRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope subject131 =null;

		RewriteRuleSubtreeStream stream_subject=new RewriteRuleSubtreeStream(adaptor,"rule subject");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:123:14: ( subject -> ^( ATTRIBUTE_REFERENCE subject ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:123:16: subject
			{
			pushFollow(FOLLOW_subject_in_attributeRef936);
			subject131=subject();
			state._fsp--;

			stream_subject.add(subject131.getTree());
			// AST REWRITE
			// elements: subject
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 123:24: -> ^( ATTRIBUTE_REFERENCE subject )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:124:2: ^( ATTRIBUTE_REFERENCE subject )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_REFERENCE, "ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_subject.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRef"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:127:1: functionCall : functionRef -> ^( FUNCTION_CALL functionRef ) ;
	public final AttributeExpressionParser.functionCall_return functionCall() throws RecognitionException {
		AttributeExpressionParser.functionCall_return retval = new AttributeExpressionParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope functionRef132 =null;

		RewriteRuleSubtreeStream stream_functionRef=new RewriteRuleSubtreeStream(adaptor,"rule functionRef");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:127:14: ( functionRef -> ^( FUNCTION_CALL functionRef ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:127:16: functionRef
			{
			pushFollow(FOLLOW_functionRef_in_functionCall954);
			functionRef132=functionRef();
			state._fsp--;

			stream_functionRef.add(functionRef132.getTree());
			// AST REWRITE
			// elements: functionRef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 127:28: -> ^( FUNCTION_CALL functionRef )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:128:2: ^( FUNCTION_CALL functionRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);
				adaptor.addChild(root_1, stream_functionRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:1: booleanLiteral : ( TRUE | FALSE );
	public final AttributeExpressionParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		AttributeExpressionParser.booleanLiteral_return retval = new AttributeExpressionParser.booleanLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set133=null;

		Object set133_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:130:16: ( TRUE | FALSE )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set133=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set133));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class zeroArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgStandaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:1: zeroArgStandaloneFunction : ( IP | UUID | NOW | NEXT_INT | HOSTNAME | RANDOM ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgStandaloneFunction_return zeroArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.zeroArgStandaloneFunction_return retval = new AttributeExpressionParser.zeroArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set134=null;
		Token LPAREN135=null;
		Token RPAREN136=null;

		Object set134_tree=null;
		Object LPAREN135_tree=null;
		Object RPAREN136_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:27: ( ( IP | UUID | NOW | NEXT_INT | HOSTNAME | RANDOM ) LPAREN ! RPAREN !)
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:131:29: ( IP | UUID | NOW | NEXT_INT | HOSTNAME | RANDOM ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set134=input.LT(1);
			if ( input.LA(1)==HOSTNAME||input.LA(1)==IP||input.LA(1)==NEXT_INT||input.LA(1)==NOW||input.LA(1)==RANDOM||input.LA(1)==UUID ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set134));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgStandaloneFunction1006); 
			RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgStandaloneFunction1009); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgStandaloneFunction"


	public static class oneArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgStandaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:1: oneArgStandaloneFunction : ( ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) );
	public final AttributeExpressionParser.oneArgStandaloneFunction_return oneArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.oneArgStandaloneFunction_return retval = new AttributeExpressionParser.oneArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set137=null;
		Token LPAREN138=null;
		Token RPAREN140=null;
		Token HOSTNAME141=null;
		Token LPAREN142=null;
		Token RPAREN144=null;
		ParserRuleReturnScope anyArg139 =null;
		ParserRuleReturnScope booleanLiteral143 =null;

		Object set137_tree=null;
		Object LPAREN138_tree=null;
		Object RPAREN140_tree=null;
		Object HOSTNAME141_tree=null;
		Object LPAREN142_tree=null;
		Object RPAREN144_tree=null;

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:26: ( ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==GET_STATE_VALUE||LA24_0==MATH||LA24_0==TO_LITERAL) ) {
				alt24=1;
			}
			else if ( (LA24_0==HOSTNAME) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:28: ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:28: ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:132:29: ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !
					{
					set137=input.LT(1);
					set137=input.LT(1);
					if ( input.LA(1)==GET_STATE_VALUE||input.LA(1)==MATH||input.LA(1)==TO_LITERAL ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set137), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction1031); 
					pushFollow(FOLLOW_anyArg_in_oneArgStandaloneFunction1034);
					anyArg139=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg139.getTree());

					RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction1036); 
					}

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:133:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:133:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:133:29: HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !
					{
					HOSTNAME141=(Token)match(input,HOSTNAME,FOLLOW_HOSTNAME_in_oneArgStandaloneFunction1070); 
					HOSTNAME141_tree = (Object)adaptor.create(HOSTNAME141);
					root_0 = (Object)adaptor.becomeRoot(HOSTNAME141_tree, root_0);

					LPAREN142=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction1073); 
					pushFollow(FOLLOW_booleanLiteral_in_oneArgStandaloneFunction1076);
					booleanLiteral143=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral143.getTree());

					RPAREN144=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction1078); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgStandaloneFunction"


	public static class standaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "standaloneFunction"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:1: standaloneFunction : ( zeroArgStandaloneFunction | oneArgStandaloneFunction );
	public final AttributeExpressionParser.standaloneFunction_return standaloneFunction() throws RecognitionException {
		AttributeExpressionParser.standaloneFunction_return retval = new AttributeExpressionParser.standaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgStandaloneFunction145 =null;
		ParserRuleReturnScope oneArgStandaloneFunction146 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:20: ( zeroArgStandaloneFunction | oneArgStandaloneFunction )
			int alt25=2;
			switch ( input.LA(1) ) {
			case HOSTNAME:
				{
				int LA25_1 = input.LA(2);
				if ( (LA25_1==LPAREN) ) {
					int LA25_4 = input.LA(3);
					if ( (LA25_4==RPAREN) ) {
						alt25=1;
					}
					else if ( (LA25_4==FALSE||LA25_4==TRUE) ) {
						alt25=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GET_STATE_VALUE:
			case MATH:
			case TO_LITERAL:
				{
				alt25=2;
				}
				break;
			case IP:
			case NEXT_INT:
			case NOW:
			case RANDOM:
			case UUID:
				{
				alt25=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:22: zeroArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction1087);
					zeroArgStandaloneFunction145=zeroArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgStandaloneFunction145.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:134:50: oneArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgStandaloneFunction_in_standaloneFunction1091);
					oneArgStandaloneFunction146=oneArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, oneArgStandaloneFunction146.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "standaloneFunction"


	public static class attributeRefOrFunctionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRefOrFunctionCall"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:1: attributeRefOrFunctionCall : ( attributeRef | standaloneFunction ) ;
	public final AttributeExpressionParser.attributeRefOrFunctionCall_return attributeRefOrFunctionCall() throws RecognitionException {
		AttributeExpressionParser.attributeRefOrFunctionCall_return retval = new AttributeExpressionParser.attributeRefOrFunctionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attributeRef147 =null;
		ParserRuleReturnScope standaloneFunction148 =null;


		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:28: ( ( attributeRef | standaloneFunction ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:30: ( attributeRef | standaloneFunction )
			{
			root_0 = (Object)adaptor.nil();


			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:30: ( attributeRef | standaloneFunction )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= ALL_ATTRIBUTES && LA26_0 <= ALL_MATCHING_ATTRIBUTES)||(LA26_0 >= ANY_ATTRIBUTE && LA26_0 <= ANY_MATCHING_ATTRIBUTE)||LA26_0==ATTRIBUTE_NAME||LA26_0==DOLLAR||LA26_0==STRING_LITERAL) ) {
				alt26=1;
			}
			else if ( (LA26_0==GET_STATE_VALUE||LA26_0==HOSTNAME||LA26_0==IP||LA26_0==MATH||LA26_0==NEXT_INT||LA26_0==NOW||LA26_0==RANDOM||LA26_0==TO_LITERAL||LA26_0==UUID) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:31: attributeRef
					{
					pushFollow(FOLLOW_attributeRef_in_attributeRefOrFunctionCall1100);
					attributeRef147=attributeRef();
					state._fsp--;

					adaptor.addChild(root_0, attributeRef147.getTree());

					}
					break;
				case 2 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:136:46: standaloneFunction
					{
					pushFollow(FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall1104);
					standaloneFunction148=standaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, standaloneFunction148.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRefOrFunctionCall"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:138:1: expression : DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) ;
	public final AttributeExpressionParser.expression_return expression() throws RecognitionException {
		AttributeExpressionParser.expression_return retval = new AttributeExpressionParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOLLAR149=null;
		Token LBRACE150=null;
		Token COLON152=null;
		Token RBRACE154=null;
		ParserRuleReturnScope attributeRefOrFunctionCall151 =null;
		ParserRuleReturnScope functionCall153 =null;

		Object DOLLAR149_tree=null;
		Object LBRACE150_tree=null;
		Object COLON152_tree=null;
		Object RBRACE154_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_attributeRefOrFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule attributeRefOrFunctionCall");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:138:12: ( DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:138:14: DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE
			{
			DOLLAR149=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_expression1113);  
			stream_DOLLAR.add(DOLLAR149);

			LBRACE150=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_expression1115);  
			stream_LBRACE.add(LBRACE150);

			pushFollow(FOLLOW_attributeRefOrFunctionCall_in_expression1117);
			attributeRefOrFunctionCall151=attributeRefOrFunctionCall();
			state._fsp--;

			stream_attributeRefOrFunctionCall.add(attributeRefOrFunctionCall151.getTree());
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:138:55: ( COLON functionCall )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==COLON) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:138:56: COLON functionCall
					{
					COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_expression1120);  
					stream_COLON.add(COLON152);

					pushFollow(FOLLOW_functionCall_in_expression1122);
					functionCall153=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall153.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			RBRACE154=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_expression1126);  
			stream_RBRACE.add(RBRACE154);

			// AST REWRITE
			// elements: attributeRefOrFunctionCall, functionCall
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 138:84: -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:139:2: ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_attributeRefOrFunctionCall.nextTree());
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:139:42: ( functionCall )*
				while ( stream_functionCall.hasNext() ) {
					adaptor.addChild(root_1, stream_functionCall.nextTree());
				}
				stream_functionCall.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:141:1: query : expression EOF -> ^( QUERY expression ) ;
	public final AttributeExpressionParser.query_return query() throws RecognitionException {
		AttributeExpressionParser.query_return retval = new AttributeExpressionParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF156=null;
		ParserRuleReturnScope expression155 =null;

		Object EOF156_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:141:7: ( expression EOF -> ^( QUERY expression ) )
			// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:141:9: expression EOF
			{
			pushFollow(FOLLOW_expression_in_query1146);
			expression155=expression();
			state._fsp--;

			stream_expression.add(expression155.getTree());
			EOF156=(Token)match(input,EOF,FOLLOW_EOF_in_query1148);  
			stream_EOF.add(EOF156);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 141:24: -> ^( QUERY expression )
			{
				// org\\apache\\nifi\\attribute\\expression\\language\\antlr\\AttributeExpressionParser.g:142:2: ^( QUERY expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_zeroArgString77 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgString150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgString153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgString162 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString222 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgString225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_RADIX_in_oneArgString240 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString242 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgString245 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_oneArgString248 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgString251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_twoArgString265 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString281 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_twoArgString284 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString286 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_twoArgString289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_twoArgString304 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString312 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_twoArgString315 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString318 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_twoArgString321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_DELIMITED_FIELD_in_fiveArgString334 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_fiveArgString336 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString339 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString342 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString345 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString348 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString351 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString354 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString357 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString360 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_fiveArgString373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgBool383 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgBool399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgBool402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool411 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool423 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool439 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool455 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_oneArgBool471 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool474 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool489 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool497 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_multiArgBool511 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_multiArgBool514 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_multiArgBool517 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_multiArgBool520 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_multiArgBool523 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_multiArgBool527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgNum538 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgNum554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgNum557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum566 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum574 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum591 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum611 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MATH_in_oneOrTwoArgNum625 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneOrTwoArgNum627 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneOrTwoArgNum630 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_oneOrTwoArgNum633 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneOrTwoArgNum636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneOrTwoArgNum640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_DATE_in_zeroOrOneOrTwoArgNum648 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroOrOneOrTwoArgNum650 = new BitSet(new long[]{0xBEEFBB7DF77D6880L,0x0000027FFEFFBF39L});
	public static final BitSet FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum653 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_zeroOrOneOrTwoArgNum657 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroOrOneOrTwoArgNum664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringFunctionRef673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringFunctionRef677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringFunctionRef681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveArgString_in_stringFunctionRef685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_booleanFunctionRef692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_booleanFunctionRef696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiArgBool_in_booleanFunctionRef700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgNum_in_numberFunctionRef707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgNum_in_numberFunctionRef711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneOrTwoArgNum_in_numberFunctionRef715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroOrOneOrTwoArgNum_in_numberFunctionRef719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHOLE_NUMBER_in_anyArg727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_anyArg731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_anyArg735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_anyArg739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_anyArg743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_anyArg747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_anyArg751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveArgString_in_anyArg755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_anyArg759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_anyArg763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_anyArg767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiArgBool_in_anyArg771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_anyArg775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_stringArg782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringArg786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringArg790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringArg794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stringArg798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringFunctionRef_in_functionRef805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanFunctionRef_in_functionRef809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_functionRef813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrName_in_subject824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_subject828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrName_in_attrName835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrName_in_attrName839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrRef_in_singleAttrName858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrFunction_in_multiAttrName903 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_multiAttrName905 = new BitSet(new long[]{0x00060831F1446800L,0x0000007F7A3F9F20L});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName907 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_multiAttrName910 = new BitSet(new long[]{0x00060831F1446800L,0x0000007F7A3F9F20L});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName912 = new BitSet(new long[]{0x0000000000010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_multiAttrName916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subject_in_attributeRef936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionRef_in_functionCall954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgStandaloneFunction982 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgStandaloneFunction1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgStandaloneFunction1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgStandaloneFunction1018 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction1031 = new BitSet(new long[]{0xBEEFBB7DF77C6880L,0x0000027FFEFF9F39L});
	public static final BitSet FOLLOW_anyArg_in_oneArgStandaloneFunction1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOSTNAME_in_oneArgStandaloneFunction1070 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction1073 = new BitSet(new long[]{0x0000000400000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_booleanLiteral_in_oneArgStandaloneFunction1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgStandaloneFunction_in_standaloneFunction1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeRef_in_attributeRefOrFunctionCall1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_in_expression1113 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LBRACE_in_expression1115 = new BitSet(new long[]{0x4400448000401770L,0x0000008001010042L});
	public static final BitSet FOLLOW_attributeRefOrFunctionCall_in_expression1117 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_expression1120 = new BitSet(new long[]{0xBEEFBB79F72C6880L,0x0000007F7EFE9F39L});
	public static final BitSet FOLLOW_functionCall_in_expression1122 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RBRACE_in_expression1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_query1146 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_query1148 = new BitSet(new long[]{0x0000000000000002L});
}
