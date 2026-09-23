package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import org.junit.Before;
import org.junit.Test;

public class JsDocInfoParserTest {

  private JsDocInfoParser parser;
  private ErrorReporter errorReporter;
  private JsDocInfoParser.SimpleErrorReporter simpleErrorReporter;

  @Before
  public void setUp() {
    errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
      }
    };
    simpleErrorReporter = new JsDocInfoParser.SimpleErrorReporter();
  }

  @Test
  public void testParseTypeStringSimpleName() {
    Node typeNode = JsDocInfoParser.parseTypeString("string");
    assertNotNull(typeNode);
    assertEquals(Token.STRING, typeNode.getToken());
    assertEquals("string", typeNode.getString());
  }

  @Test
  public void testParseTypeStringQualifiedName() {
    Node typeNode = JsDocInfoParser.parseTypeString("goog.ui.Button");
    assertNotNull(typeNode);
    assertEquals(Token.GETPROP, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringUnionType() {
    Node typeNode = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(typeNode);
    assertEquals(Token.PIPE, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringFunctionType() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(string): number");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringFunctionVarArgs() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(...[string]): void");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringArrayType() {
    Node typeNode = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(typeNode);
  }

  @Test
  public void testParseTypeStringRecordType() {
    Node typeNode = JsDocInfoParser.parseTypeString("{key: string}");
    assertNotNull(typeNode);
    assertEquals(Token.LC, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringUnionWithAlternate() {
    Node typeNode = JsDocInfoParser.parseTypeString("(string|number)");
    assertNotNull(typeNode);
    assertEquals(Token.PIPE, typeNode.getToken());
    assertEquals(2, typeNode.getChildCount());
  }

  @Test
  public void testParseTypeStringSingleUnionMember() {
    Node typeNode = JsDocInfoParser.parseTypeString("(string)");
    assertNotNull(typeNode);
    assertEquals(Token.STRING, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringSimpleTypeExpression() {
    Node typeNode = JsDocInfoParser.parseTypeString("?");
    assertNotNull(typeNode);
    assertEquals(Token.QMARK, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringBangTypeExpression() {
    Node typeNode = JsDocInfoParser.parseTypeString("!Object");
    assertNotNull(typeNode);
    assertEquals(Token.BANG, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringEllipsisTypeExpression() {
    Node typeNode = JsDocInfoParser.parseTypeString("...string");
    assertNotNull(typeNode);
    assertEquals(Token.ELLIPSIS, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringNullLiteral() {
    Node typeNode = JsDocInfoParser.parseTypeString("null");
    assertNotNull(typeNode);
    assertEquals(Token.STRING, typeNode.getToken());
    assertEquals("null", typeNode.getString());
  }

  @Test
  public void testParseTypeStringInvalidType() {
    assertNull(JsDocInfoParser.parseTypeString(""));
  }

  @Test(expected = IllegalStateException.class)
  public void testParseTypeStringMissingLP() {
    JsDocInfoParser.parseTypeString("function string): number");
  }

  @Test(expected = IllegalStateException.class)
  public void testParseTypeStringMissingGT() {
    JsDocInfoParser.parseTypeString("Array.<string");
  }

  @Test(expected = IllegalStateException.class)
  public void testParseTypeStringMissingRB() {
    JsDocInfoParser.parseTypeString("Array.<string");
  }

  @Test
  public void testParseTypeStringVoid() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(): void");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringUnknownType() {
    Node typeNode = JsDocInfoParser.parseTypeString("?");
    assertNotNull(typeNode);
  }

  @Test
  public void testParseTypeStringEmptyFunctionType() {
    Node typeNode = JsDocInfoParser.parseTypeString("function()");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringFunctionWithParameters() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(string, number)");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringArrowFunction() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(string): number");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringNestedFunction() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(string): function(number): boolean");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringFunctionThis() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(this:Object): void");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }

  @Test
  public void testParseTypeStringFunctionNew() {
    Node typeNode = JsDocInfoParser.parseTypeString("function(new:Object): void");
    assertNotNull(typeNode);
    assertEquals(Token.FUNCTION, typeNode.getToken());
  }
}