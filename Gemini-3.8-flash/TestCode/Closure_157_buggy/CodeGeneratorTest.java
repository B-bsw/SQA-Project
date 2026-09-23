package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CodeGeneratorTest {

  private CodeGenerator generator;
  private TestCodeConsumer consumer;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, null);
  }

  @Test
  public void testTagAsStrict() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.getCode());
  }

  @Test
  public void testAddString() {
    generator.add("var x;");
    assertEquals("var x;", consumer.getCode());
  }

  @Test
  public void testAddNodeBinaryOp() {
    Node n = new Node(Token.ADD);
    Node left = Node.newString("a");
    Node right = Node.newString("b");
    n.addChildToFront(left);
    n.addChildToBack(right);
    generator.add(n);
    assertEquals("a+b", consumer.getCode());
  }

  @Test
  public void testAddNodeAssignOp() {
    Node n = new Node(Token.ASSIGN);
    Node name = Node.newString(Token.NAME, "x");
    Node num = Node.newNumber(1.0);
    n.addChildToFront(name);
    n.addChildToBack(num);
    generator.add(n);
    assertEquals("x=1", consumer.getCode());
  }

  @Test
  public void testAddNodeHook() {
    Node n = new Node(Token.HOOK);
    Node cond = Node.newNumber(1.0);
    Node then = Node.newString("a");
    Node other = Node.newString("b");
    n.addChildToFront(cond);
    then.addChildToBack(then);
    n.addChildToBack(then);
    other.addChildToBack(other);
    n.addChildToBack(other);
    generator.add(n);
    assertEquals("1?a:b", consumer.getCode());
  }

  @Test
  public void testAddNodeFunction() {
    Node fn = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "f");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    fn.addChildToFront(name);
    fn.addChildToBack(params);
    fn.addChildToBack(body);
    generator.add(fn);
    assertEquals("function f(){}", consumer.getCode());
  }

  @Test
  public void testAddNodeNumber() {
    Node num = Node.newNumber(42.5);
    generator.add(num);
    assertEquals("42.5", consumer.getCode());
  }

  @Test
  public void testAddNodeNameWithValue() {
    Node name = Node.newString(Token.NAME, "x");
    Node val = Node.newNumber(5.0);
    name.addChildToFront(val);
    generator.add(name);
    assertEquals("x=5", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeDoubleQuote() {
    Node str = Node.newString("a\"b");
    generator.add(str);
    assertEquals("\"a\\\"b\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeSingleQuote() {
    Node str = new Node(Token.STRING);
    str.setInputId(new com.google.javascript.rhino.InputId(""));
    str.setString("a'b");
    generator.add(str);
    // Should prefer single quotes if fewer escapes
    assertEquals("\"a'b\"", consumer.getCode());
  }

  @Test
  public void testAddNodeNull() {
    Node n = new Node(Token.NULL);
    generator.add(n);
    assertEquals("null", consumer.getCode());
  }

  @Test
  public void testAddNodeTrue() {
    Node n = new Node(Token.TRUE);
    generator.add(n);
    assertEquals("true", consumer.getCode());
  }

  @Test
  public void testAddNodeFalse() {
    Node n = new Node(Token.FALSE);
    generator.add(n);
    assertEquals("false", consumer.getCode());
  }

  @Test
  public void testAddNodeReturnNoChildren() {
    Node n = new Node(Token.RETURN);
    generator.add(n);
    assertEquals("return;", consumer.getCode());
  }

  @Test
  public void testAddNodeReturnWithChild() {
    Node n = new Node(Token.RETURN);
    Node val = Node.newNumber(1.0);
    n.addChildToFront(val);
    generator.add(n);
    assertEquals("return 1", consumer.getCode());
  }

  @Test
  public void testAddNodeThrow() {
    Node n = new Node(Token.THROW);
    Node val = Node.newString("e");
    n.addChildToFront(val);
    generator.add(n);
    assertEquals("throw e;", consumer.getCode());
  }

  @Test
  public void testAddNodeVar() {
    Node n = new Node(Token.VAR);
    Node name = Node.newString(Token.NAME, "x");
    name.addChildToFront(Node.newNumber(1.0));
    n.addChildToFront(name);
    generator.add(n);
    assertEquals("var x=1", consumer.getCode());
  }

  @Test
  public void testAddNodeGetProp() {
    Node n = new Node(Token.GETPROP);
    Node obj = Node.newString(Token.NAME, "a");
    Node prop = Node.newString(Token.STRING, "b");
    n.addChildToFront(obj);
    n.addChildToBack(prop);
    generator.add(n);
    assertEquals("a.b", consumer.getCode());
  }

  @Test
  public void testAddNodeGetElem() {
    Node n = new Node(Token.GETELEM);
    Node obj = Node.newString(Token.NAME, "a");
    Node idx = Node.newNumber(0.0);
    n.addChildToFront(obj);
    n.addChildToBack(idx);
    generator.add(n);
    assertEquals("a[0]", consumer.getCode());
  }

  @Test
  public void testAddNodeArrayLit() {
    Node n = new Node(Token.ARRAYLIT);
    Node a = Node.newString("a");
    Node b = Node.newNumber(1.0);
    n.addChildToFront(a);
    n.addChildToBack(b);
    generator.add(n);
    assertEquals("[\"a\",1]", consumer.getCode());
  }

  @Test
  public void testAddNodeNullOrThis() {
    Node n = new Node(Token.THIS);
    generator.add(n);
    assertEquals("this", consumer.getCode());
  }

  @Test
  public void testAddNodeNameWithNoChild() {
    Node n = Node.newString(Token.NAME, "x");
    generator.add(n);
    assertEquals("x", consumer.getCode());
  }

  @Test
  public void testAddNodeNameWithCommaChild() {
    Node n = Node.newString(Token.NAME, "x");
    Node comma = new Node(Token.COMMA);
    Node a = Node.newNumber(1.0);
    Node b = Node.newNumber(2.0);
    comma.addChildToFront(a);
    comma.addChildToBack(b);
    n.addChildToFront(comma);
    generator.add(n);
    assertEquals("x=1,2", consumer.getCode());
  }

  @Test
  public void testAddNodeIncPost() {
    Node n = new Node(Token.INC);
    Node name = Node.newString(Token.NAME, "x");
    n.addChildToFront(name);
    n.putBooleanProp(Node.INCRDECR_PROP, false);
    generator.add(n);
    assertEquals("x", consumer.getCode());
  }

  @Test
  public void testAddNodeIncPre() {
    Node n = new Node(Token.INC);
    Node name = Node.newString(Token.NAME, "x");
    n.addChildToFront(name);
    n.putBooleanProp(Node.INCRDECR_PROP, true);
    generator.add(n);
    assertEquals("++x", consumer.getCode());
  }

  @Test
  public void testAddNodeRegexp() {
    Node n = new Node(Token.REGEXP);
    Node pattern = Node.newString("a");
    Node flags = Node.newString("g");
    n.addChildToFront(pattern);
    n.addChildToBack(flags);
    generator.add(n);
    assertEquals("/a/g", consumer.getCode());
  }

  @Test
  public void testAddNodeRegexpNoFlags() {
    Node n = new Node(Token.REGEXP);
    Node pattern = Node.newString("a");
    n.addChildToFront(pattern);
    generator.add(n);
    assertEquals("/a/", consumer.getCode());
  }

  @Test
  public void testAddNodeNot() {
    Node n = new Node(Token.NOT);
    Node operand = Node.newString("x");
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("!x", consumer.getCode());
  }

  @Test
  public void testAddNodeBitNot() {
    Node n = new Node(Token.BITNOT);
    Node operand = Node.newNumber(1.0);
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("~1", consumer.getCode());
  }

  @Test
  public void testAddNodeTypeOf() {
    Node n = new Node(Token.TYPEOF);
    Node operand = Node.newString("x");
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("typeof x", consumer.getCode());
  }

  @Test
  public void testAddNodeVoid() {
    Node n = new Node(Token.VOID);
    Node operand = Node.newNumber(1.0);
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("void 1", consumer.getCode());
  }

  @Test
  public void testAddNodePos() {
    Node n = new Node(Token.POS);
    Node operand = Node.newNumber(1.0);
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("+1", consumer.getCode());
  }

  @Test
  public void testAddNodeNeg() {
    Node n = new Node(Token.NEG);
    Node operand = Node.newNumber(1.0);
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("-1", consumer.getCode());
  }

  @Test
  public void testAddNodeNegNumberOptimization() {
    Node n = new Node(Token.NEG);
    Node operand = Node.newNumber(1.0);
    n.addChildToFront(operand);
    generator.add(n);
    assertEquals("-1", consumer.getCode());
  }

  @Test
  public void testAddNodeGetWithChild() {
    Node n = new Node(Token.GET);
    Node fn = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "x");
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    fn.addChildToFront(name);
    fn.addChildToBack(params);
    fn.addChildToBack(body);
    n.addChildToFront(fn);
    generator.add(n);
    assertEquals("x", consumer.getCode());
  }

  @Test
  public void testAddNodeSetWithChild() {
    Node n = new Node(Token.SET);
    Node fn = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "x");
    Node params = new Node(Token.PARAM_LIST);
    params.addChildToBack(Node.newString(Token.NAME, "v"));
    Node body = new Node(Token.BLOCK);
    fn.addChildToFront(name);
    fn.addChildToBack(params);
    fn.addChildToBack(body);
    n.addChildToFront(fn);
    generator.add(n);
    assertEquals("x", consumer.getCode());
  }

  @Test
  public void testAddNodeLabelName() {
    Node n = Node.newString(Token.LABEL_NAME, "label");
    generator.add(n);
    assertEquals("label", consumer.getCode());
  }

  @Test
  public void testAddNodeLabel() {
    Node n = new Node(Token.LABEL);
    Node name = Node.newString(Token.LABEL_NAME, "l");
    Node stmt = new Node(Token.EXPR_RESULT);
    stmt.addChildToFront(Node.newNumber(1.0));
    n.addChildToFront(name);
    n.addChildToBack(stmt);
    generator.add(n);
    assertEquals("l:1", consumer.getCode());
  }

  @Test
  public void testAddNodeDoWhile() {
    Node n = new Node(Token.DO);
    Node body = new Node(Token.BLOCK);
    Node cond = Node.newString("x");
    n.addChildToFront(body);
    n.addChildToBack(cond);
    generator.add(n);
    assertEquals("do{}while(x)", consumer.getCode());
  }

  @Test
  public void testAddNodeWhile() {
    Node n = new Node(Token.WHILE);
    Node cond = Node.newString("x");
    Node body = new Node(Token.EMPTY);
    n.addChildToFront(cond);
    n.addChildToBack(body);
    generator.add(n);
    assertEquals("while(x);", consumer.getCode());
  }

  @Test
  public void testAddNodeScriptBlock() {
    Node n = new Node(Token.SCRIPT);
    n.addChildToFront(Node.newString("x"));
    generator.add(n);
    assertEquals("x", consumer.getCode());
  }

  @Test
  public void testAddNodeBlockPreserve() {
    Node n = new Node(Token.BLOCK);
    n.addChildToFront(Node.newString("x"));
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToFront(n);
    generator.add(n, CodeGenerator.Context.STATEMENT);
    assertEquals("{x}", consumer.getCode());
  }

  @Test
  public void testAddNodeBlockNoPreserve() {
    Node n = new Node(Token.BLOCK);
    Node child = new Node(Token.EXPR_RESULT);
    child.addChildToFront(Node.newNumber(1.0));
    n.addChildToFront(child);
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToFront(n);
    generator.add(n, CodeGenerator.Context.OTHER);
    assertEquals("1", consumer.getCode());
  }

  @Test
  public void testAddNodeEmpty() {
    Node n = new Node(Token.EMPTY);
    generator.add(n);
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAddNodeBreak() {
    Node n = new Node(Token.BREAK);
    generator.add(n);
    assertEquals("break;", consumer.getCode());
  }

  @Test
  public void testAddNodeContinue() {
    Node n = new Node(Token.CONTINUE);
    generator.add(n);
    assertEquals("continue;", consumer.getCode());
  }

  @Test
  public void testAddNodeBreakLabel() {
    Node n = new Node(Token.BREAK);
    Node label = Node.newString(Token.LABEL_NAME, "l");
    n.addChildToFront(label);
    generator.add(n);
    assertEquals("break l;", consumer.getCode());
  }

  @Test
  public void testAddNodeDebugger() {
    Node n = new Node(Token.DEBUGGER);
    generator.add(n);
    assertEquals("debugger;", consumer.getCode());
  }

  @Test
  public void testAddNodeWithCase() {
    Node n = new Node(Token.WITH);
    Node expr = Node.newString("x");
    Node body = new Node(Token.BLOCK);
    n.addChildToFront(expr);
    n.addChildToBack(body);
    generator.add(n);
    assertEquals("with(x){}", consumer.getCode());
  }

  @Test
  public void testAddNodeGetRef() {
    Node n = new Node(Token.GET_REF);
    Node name = Node.newString(Token.NAME, "x");
    n.addChildToFront(name);
    generator.add(n);
    assertEquals(".x", consumer.getCode());
  }

  @Test
  public void testAddNodeRefSpecial() {
    Node n = new Node(Token.REF_SPECIAL);
    Node name = Node.newString(Token.NAME, "x");
    n.addChildToFront(name);
    generator.add(n);
    assertEquals(".x", consumer.getCode());
  }

  @Test
  public void testAddNodeExprResult() {
    Node n = new Node(Token.EXPR_RESULT);
    n.addChildToFront(Node.newNumber(1.0));
    generator.add(n);
    assertEquals("1", consumer.getCode());
  }

  @Test
  public void testAddNodeExprVoid() {
    Node n = new Node(Token.EXPR_VOID);
    n.addChildToFront(Node.newNumber(1.0));
    generator.add(n);
    assertEquals("1", consumer.getCode());
  }

  @Test
  public void testAddNodeCall() {
    Node n = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "f");
    n.addChildToFront(name);
    n.addChildToBack(Node.newNumber(1.0));
    generator.add(n);
    assertEquals("f(1)", consumer.getCode());
  }

  @Test
  public void testAddNodeCallIndirectEval() {
    Node n = new Node(Token.CALL);
    Node name = Node.newString(Token.NAME, "eval");
    name.putBooleanProp(Node.IS_INDIRECT_CALL, true);
    n.addChildToFront(name);
    generator.add(n);
    assertEquals("(0,eval)()", consumer.getCode());
  }

  @Test
  public void testAddNodeNew() {
    Node n = new Node(Token.NEW);
    Node name = Node.newString(Token.NAME, "F");
    n.addChildToFront(name);
    n.addChildToBack(Node.newNumber(1.0));
    generator.add(n);
    assertEquals("new F(1)", consumer.getCode());
  }

  @Test
  public void testAddNodeNewNoArgs() {
    Node n = new Node(Token.NEW);
    Node name = Node.newString(Token.NAME, "F");
    n.addChildToFront(name);
    generator.add(n);
    assertEquals("new F", consumer.getCode());
  }

  @Test
  public void testAddNodeComma() {
    Node n = new Node(Token.COMMA);
    n.addChildToFront(Node.newNumber(1.0));
    n.addChildToBack(Node.newNumber(2.0));
    generator.add(n);
    assertEquals("1,2", consumer.getCode());
  }

  @Test
  public void testAddNodeObjectLit() {
    Node n = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING, "a");
    Node value = Node.newNumber(1.0);
    key.addChildToFront(value);
    n.addChildToFront(key);
    generator.add(n);
    assertEquals("{\"a\":1}", consumer.getCode());
  }

  @Test
  public void testAddNodeObjectLitEmpty() {
    Node n = new Node(Token.OBJECTLIT);
    generator.add(n);
    assertEquals("{}", consumer.getCode());
  }

  @Test
  public void testAddNodeGetPropInvalidChildCount() {
    Node n = new Node(Token.GETPROP);
    n.addChildToFront(Node.newString("a"));
    try {
      generator.add(n);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  public void testAddNodeGetElemInvalidChildCount() {
    Node n = new Node(Token.GETELEM);
    n.addChildToFront(Node.newString("a"));
    try {
      generator.add(n);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  public void testAddNodeHookInvalidChildCount() {
    Node n = new Node(Token.HOOK);
    n.addChildToFront(Node.newNumber(1.0));
    try {
      generator.add(n);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  public void testAddNodeStringEscapeNull() {
    Node str = Node.newString("a\0b");
    generator.add(str);
    assertEquals("\"a\\0b\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeNewline() {
    Node str = Node.newString("a\nb");
    generator.add(str);
    assertEquals("\"a\\nb\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeCarriageReturn() {
    Node str = Node.newString("a\rb");
    generator.add(str);
    assertEquals("\"a\\rb\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeTab() {
    Node str = Node.newString("a\tb");
    generator.add(str);
    assertEquals("\"a\\tb\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeBackslash() {
    Node str = Node.newString("a\\b");
    generator.add(str);
    assertEquals("\"a\\\\b\"", consumer.getCode());
  }

  @Test
  public void testAddNodeStringEscapeAll() {
    Node str = Node.newString("a\0\n\r\t\\\"'");
    generator.add(str);
    assertEquals("\"a\\0\\n\\r\\t\\\\\\\"'\"", consumer.getCode());
  }

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("abc"));
    assertTrue(NodeUtil.isLatin("abc123"));
    assertTrue(NodeUtil.isLatin("abc\u00E9"));
    assertTrue(NodeUtil.isLatin("abc\u00C0"));
  }

  @Test
  public void testJsString() {
    assertEquals("\"a\"", CodeGenerator.jsString("a", null));
    assertEquals("\"a\\\"b\"", CodeGenerator.jsString("a\"b", null));
    assertEquals("\"a\\nb\"", CodeGenerator.jsString("a\nb", null));
    assertEquals("\"a\\tb\"", CodeGenerator.jsString("a\tb", null));
    assertEquals("\"a\\\\b\"", CodeGenerator.jsString("a\\b", null));
    assertEquals("\"a\\0b\"", CodeGenerator.jsString("a\0b", null));
    assertEquals("\"a\\rb\"", CodeGenerator.jsString("a\rb", null));
    assertEquals("\"a\\u00e9b\"", CodeGenerator.jsString("a\u00e9b", null));
  }

  @Test
  public void testJsStringNonAscii() {
    assertEquals("\"\\u00e9\"", CodeGenerator.jsString("\u00e9", null));
  }

  @Test
  public void testRegexpEscape() {
    assertEquals("a\\/b", CodeGenerator.regexpEscape("a/b", null));
    assertEquals("a\\\\b", CodeGenerator.regexpEscape("a\\b", null));
    assertEquals("a\\nb", CodeGenerator.regexpEscape("a\nb", null));
    assertEquals("a\\rb", CodeGenerator.regexpEscape("a\rb", null));
    assertEquals("a\\tb", CodeGenerator.regexpEscape("a\tb", null));
    assertEquals("a\\bb", CodeGenerator.regexpEscape("a\bb", null));
    assertEquals("a\\fb", CodeGenerator.regexpEscape("a\fb", null));
    assertEquals("a\\0b", CodeGenerator.regexpEscape("a\0b", null));
    assertEquals("a[b", CodeGenerator.regexpEscape("a[b", null));
    assertEquals("a]b", CodeGenerator.regexpEscape("a]b", null));
    assertEquals("a.b", CodeGenerator.regexpEscape("a.b", null));
    assertEquals("a*b", CodeGenerator.regexpEscape("a*b", null));
    assertEquals("a+b", CodeGenerator.regexpEscape("a+b", null));
    assertEquals("a?b", CodeGenerator.regexpEscape("a?b", null));
    assertEquals("a^b", CodeGenerator.regexpEscape("a^b", null));
    assertEquals("a$b", CodeGenerator.regexpEscape("a$b", null));
    assertEquals("a{b", CodeGenerator.regexpEscape("a{b", null));
    assertEquals("a}b", CodeGenerator.regexpEscape("a}b", null));
    assertEquals("a|b", CodeGenerator.regexpEscape("a|b", null));
    assertEquals("a(b", CodeGenerator.regexpEscape("a(b", null));
    assertEquals("a)b", CodeGenerator.regexpEscape("a)b", null));
    assertEquals("a\\<b", CodeGenerator.regexpEscape("a<b", null));
    assertEquals("a\\>b", CodeGenerator.regexpEscape("a>b", null));
    assertEquals("a\\/b", CodeGenerator.regexpEscape("a/b", null));
  }

  @Test
  public void testAddIdentifier() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, null);
    generator.addIdentifier("abc");
    assertEquals("abc", consumer.getCode());
  }

  @Test
  public void testAddIdentifierNonLatin() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, null);
    generator.addIdentifier("ab\u00e9");
    assertEquals("$0", consumer.getCode());
  }

  @Test
  public void testAddIdentifierNonAscii() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, null);
    generator.addIdentifier("\u0080");
    assertEquals("$0", consumer.getCode());
  }

  @Test
  public void testCodeConsumerWithCharset() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, Charsets.UTF_8);
    generator.add(Node.newString("a"));
    assertTrue(consumer.getCode().contains("a"));
  }

  private class TestCodeConsumer extends CodeConsumer {
    private StringBuilder sb = new StringBuilder();

    @Override
    void add(String str) {
      sb.append(str);
    }

    @Override
    void addIdentifier(String identifier) {
      sb.append(identifier);
    }

    @Override
    void addOp(String op, boolean binr) {
      sb.append(op);
    }

    @Override
    void addNumber(double x) {
      sb.append(x);
    }

    @Override
    void endStatement() {
      sb.append(";");
    }

    @Override
    void endStatement(boolean isnHope) {
      sb.append(";");
    }

    @Override
    void beginBlock() {
      sb.append("{");
    }

    @Override
    void endBlock() {
      sb.append("}");
    }

    @Override
    void endFunction(boolean isStatement) {
      sb.append("}");
    }

    @Override
    void addBreak() {
      sb.append("break");
    }

    @Override
    void addContinue() {
      sb.append("continue");
    }

    @Override
    void addCase() {
      sb.append("case ");
    }

    @Override
    void addCaseExpr() {
    }

    @Override
    void addCaseDefault() {
      sb.append("default: ");
    }

    @Override
    void addColon() {
      sb.append(":");
    }

    @Override
    void addComma() {
      sb.append(",");
    }

    @Override
    void addDo() {
      sb.append("do");
    }

    @Override
    void addDot() {
      sb.append(".");
    }

    @Override
    void addElse() {
      sb.append("else ");
    }

    @Override
    void addFor() {
      sb.append("for");
    }

    @Override
    void addIf() {
      sb.append("if");
    }

    @Override
    void addLParen() {
      sb.append("(");
    }

    @Override
    void addRParen() {
      sb.append(")");
    }

    @Override
    void addLBrace() {
      sb.append("{");
    }

    @Override
    void addRBrace() {
      sb.append("}");
    }

    @Override
    void addNew() {
      sb.append("new ");
    }

    @Override
    void addNull() {
      sb.append("null");
    }

    @Override
    void addSemi() {
      sb.append(";");
    }

    @Override
    boolean continueProcessing() {
      return true;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return false;
    }

    @Override
    void startSourceMapping(Node node) {
    }

    @Override
    void endSourceMapping(Node node) {
    }

    @Override
    void addReturn() {
      sb.append("return");
    }

    @Override
    void addThrow() {
      sb.append("throw");
    }

    @Override
    void addVar() {
      sb.append("var ");
    }

    @Override
    void addWhile() {
      sb.append("while");
    }

    @Override
    void addWith() {
      sb.append("with");
    }

    @Override
    void addLabel() {
      sb.append("label");
    }

    @Override
    void addCase() {
      sb.append("case ");
    }

    @Override
    String getCode() {
      return sb.toString();
    }
  }
}