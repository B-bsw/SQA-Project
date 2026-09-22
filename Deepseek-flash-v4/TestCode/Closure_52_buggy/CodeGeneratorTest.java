package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CodeGeneratorTest {

  private CodeGenerator generator;
  private TestCodeConsumer consumer;
  private Charset ASCII;
  private Charset UTF8;

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = new CodeGenerator(consumer, null);
    ASCII = Charset.forName("US-ASCII");
    UTF8 = Charset.forName("UTF-8");
  }

  @Test
  public void testConstructorWithNullCharset() {
    generator = new CodeGenerator(consumer, null);
    assertNotNull(generator);
  }

  @Test
  public void testConstructorWithAsciiCharset() {
    generator = new CodeGenerator(consumer, ASCII);
    assertNotNull(generator);
  }

  @Test
  public void testAddString() {
    generator.add("hello");
    assertEquals("hello", consumer.getCode());
  }

  @Test
  public void testTagAsStrict() {
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.getCode());
  }

  @Test
  public void testAddIdentifier() {
    generator.addIdentifier("foo");
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAddNodeNumber() {
    Node num = Node.newNumber(42.5);
    generator.add(num);
    assertEquals("42.5", consumer.getCode());
  }

  @Test
  public void testAddNodeNegativeNumber() {
    Node neg = new Node(Token.NEG);
    neg.addChildToFront(Node.newNumber(5));
    generator.add(neg);
    assertEquals("-5", consumer.getCode());
  }

  @Test
  public void testAddNodeString() {
    Node str = Node.newString("test");
    generator.add(str);
    assertEquals("\"test\"", consumer.getCode());
  }

  @Test
  public void testAddNodeNullString() {
    Node str = Node.newString("");
    generator.add(str);
    assertEquals("\"\"", consumer.getCode());
  }

  @Test
  public void testAddNodeBooleanTrue() {
    Node boolTrue = new Node(Token.TRUE);
    generator.add(boolTrue);
    assertEquals("true", consumer.getCode());
  }

  @Test
  public void testAddNodeBooleanFalse() {
    Node boolFalse = new Node(Token.FALSE);
    generator.add(boolFalse);
    assertEquals("false", consumer.getCode());
  }

  @Test
  public void testAddNodeNull() {
    Node nullNode = new Node(Token.NULL);
    generator.add(nullNode);
    assertEquals("null", consumer.getCode());
  }

  @Test
  public void testAddNodeThis() {
    Node thisNode = new Node(Token.THIS);
    generator.add(thisNode);
    assertEquals("this", consumer.getCode());
  }

  @Test
  public void testAddNodeName() {
    Node name = Node.newString(Token.NAME, "foo");
    generator.add(name);
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAddNodeNameWithAssignment() {
    Node name = Node.newString(Token.NAME, "foo");
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToFront(name);
    Node empty = new Node(Token.EMPTY);
    assign.addChildToFront(empty);
    generator.add(name);
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAddNodeCommaExpression() {
    Node comma = new Node(Token.COMMA);
    Node a = Node.newString(Token.NAME, "a");
    Node b = Node.newString(Token.NAME, "b");
    comma.addChildToFront(a);
    comma.addChildToFront(b);
    generator.add(comma);
    assertEquals("a,b", consumer.getCode());
  }

  @Test
  public void testAddNodeArrayLit() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToFront(Node.newString("a"));
    array.addChildToFront(Node.newNumber(1));
    generator.add(array);
    assertEquals("[\"a\",1]", consumer.getCode());
  }

  @Test
  public void testAddNodeLP() {
    Node lp = new Node(Token.LP);
    lp.addChildToFront(Node.newString(Token.NAME, "a"));
    lp.addChildToFront(Node.newString(Token.NAME, "b"));
    generator.add(lp);
    assertEquals("(a,b)", consumer.getCode());
  }

  @Test
  public void testAddNodeReturnNoChild() {
    Node ret = new Node(Token.RETURN);
    generator.add(ret);
    assertEquals("return", consumer.getCode());
  }

  @Test
  public void testAddNodeReturnWithChild() {
    Node ret = new Node(Token.RETURN);
    ret.addChildToFront(Node.newNumber(1));
    generator.add(ret);
    assertEquals("return 1", consumer.getCode());
  }

  @Test
  public void testAddNodeThrow() {
    Node th = new Node(Token.THROW);
    th.addChildToFront(Node.newString("error"));
    generator.add(th);
    assertEquals("throw \"error\";", consumer.getCode());
  }

  @Test
  public void testAddNodeVarNoChild() {
    Node var = new Node(Token.VAR);
    generator.add(var);
    assertEquals("", consumer.getCode());
  }

  @Test
  public void testAddNodeVarWithChild() {
    Node var = new Node(Token.VAR);
    Node name = Node.newString(Token.NAME, "x");
    var.addChildToFront(name);
    generator.add(var);
    assertEquals("var x", consumer.getCode());
  }

  @Test
  public void testAddNodeLabel() {
    Node label = new Node(Token.LABEL);
    Node name = Node.newString(Token.LABEL_NAME, "foo");
    Node stmt = new Node(Token.EXPR_RESULT);
    stmt.addChildToFront(Node.newNumber(1));
    label.addChildToFront(name);
    label.addChildToFront(stmt);
    generator.add(label);
    assertEquals("foo:1;", consumer.getCode());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddNodeBadGetProp() {
    Node getprop = new Node(Token.GETPROP);
    getprop.addChildToFront(Node.newString(Token.NAME, "a"));
    generator.add(getprop);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddNodeBadGetElem() {
    Node getelem = new Node(Token.GETELEM);
    getelem.addChildToFront(Node.newString(Token.NAME, "a"));
    generator.add(getelem);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddNodeTryWithInvalidCatch() {
    Node tryNode = new Node(Token.TRY);
    Node block = new Node(Token.BLOCK);
    tryNode.addChildToFront(block);
    generator.add(tryNode);
  }

  @Test
  public void testAddNodeFunctionWithNoName() {
    Node func = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "");
    func.addChildToFront(name);
    Node params = new Node(Token.LP);
    func.addChildToFront(params);
    Node body = new Node(Token.BLOCK);
    func.addChildToFront(body);
    generator.add(func);
    assertEquals("function()", consumer.getCode());
  }

  @Test
  public void testAddNodeObjectLitEmpty() {
    Node obj = new Node(Token.OBJECTLIT);
    generator.add(obj);
    assertEquals("{}", consumer.getCode());
  }

  @Test
  public void testAddNodeObjectLitWithProperty() {
    Node obj = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING, "a");
    Node value = Node.newNumber(1);
    obj.addChildToFront(key);
    obj.addChildToFront(value);
    generator.add(obj);
    assertEquals("a:1", consumer.getCode());
  }

  @Test
  public void testAddNodeIfWithElse() {
    Node ifNode = new Node(Token.IF);
    Node cond = Node.newNumber(1);
    Node thenBlock = new Node(Token.BLOCK);
    Node elseBlock = new Node(Token.BLOCK);
    thenBlock.addChildToFront(new Node(Token.EMPTY));
    ifNode.addChildToFront(cond);
    ifNode.addChildToFront(thenBlock);
    ifNode.addChildToFront(elseBlock);
    generator.add(ifNode);
    assertEquals("if(1){}else{}", consumer.getCode());
  }

  @Test
  public void testAddNodeSwitch() {
    Node switchNode = new Node(Token.SWITCH);
    switchNode.addChildToFront(Node.newNumber(1));
    Node caseNode = new Node(Token.CASE);
    caseNode.addChildToFront(Node.newNumber(1));
    switchNode.addChildToFront(caseNode);
    generator.add(switchNode);
    assertTrue(consumer.getCode().contains("switch"));
  }

  @Test
  public void testAddNodeThrowWithNullChild() {
    Node th = new Node(Token.THROW);
    try {
      generator.add(th);
      fail("Expected exception");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testGetSimpleNumber() {
    assertEquals(123.0, generator.getSimpleNumber("123"), 0.0);
    assertEquals(Double.NaN, generator.getSimpleNumber("abc"), 0.0);
    assertEquals(1.5, generator.getSimpleNumber("1.5"), 0.0);
  }

  @Test
  public void testIsSimpleNumber() {
    assertTrue(generator.isSimpleNumber("123"));
    assertTrue(generator.isSimpleNumber("0"));
    assertTrue(generator.isSimpleNumber("1.5"));
    assertFalse(generator.isSimpleNumber(""));
    assertFalse(generator.isSimpleNumber("abc"));
  }

  @Test
  public void testGetContextForNoInOperator() {
    assertEquals(Context.OTHER, generator.getContextForNoInOperator(Context.OTHER));
    assertEquals(Context.IN_FOR_INIT_CLAUSE,
        generator.getContextForNoInOperator(Context.IN_FOR_INIT_CLAUSE));
    assertEquals(Context.BEFORE_DANGLING_ELSE,
        generator.getContextForNoInOperator(Context.BEFORE_DANGLING_ELSE));
  }

  @Test
  public void testIsOneExactlyFunctionOrDo() {
    Node one = new Node(Token.EXPR_RESULT);
    one.addChildToFront(new Node(Token.FUNCTION));
    assertTrue(generator.isOneExactlyFunctionOrDo(one));
    Node two = new Node(Token.EXPR_RESULT);
    two.addChildToFront(new Node(Token.NUMBER));
    assertFalse(generator.isOneExactlyFunctionOrDo(two));
  }

  @Test
  public void testGetEmptyChildCount() {
    Node block = new Node(Token.BLOCK);
    block.addChildToFront(new Node(Token.EMPTY));
    block.addChildToFront(new Node(Token.EMPTY));
    block.addChildToFront(new Node(Token.NUMBER));
    assertEquals(0, generator.getEmptyChildCount(block, 2));
  }

  @Test
  public void testGetFirstNonEmptyChild() {
    Node block = new Node(Token.BLOCK);
    Node empty = new Node(Token.EMPTY);
    block.addChildToFront(empty);
    block.addChildToFront(new Node(Token.NUMBER));
    assertEquals(1, generator.getFirstNonEmptyChild(block, 2, empty).getInt());
  }

  @Test
  public void testIsLatin() {
    assertTrue(generator.isLatin("abc"));
    assertFalse(generator.isLatin("abc\u1234"));
    assertTrue(generator.isLatin(""));
  }

  @Test
  public void testSwitchQuote() {
    assertEquals('"', generator.switchQuote("\"", 0));
    assertEquals('\'', generator.switchQuote("'", 0));
  }

  @Test
  public void testStrEscapeWithAscii() {
    String result = generator.strEscape("a\nb", '"', "\\\"", "'", "\\\\", null);
    assertEquals("a\\nb", result);
  }

  @Test
  public void testStrEscapeWithUnicode() {
    String result = generator.strEscape("a\u00e9b", '"', "\\\"", "'", "\\\\", null);
    assertEquals("a\\u00e9b", result);
  }

  @Test
  public void testStrEscapeWithControlChars() {
    String result = generator.strEscape("\0\n\r\t\\\"\'", '"', "\\\"", "'", "\\\\", null);
    assertEquals("\\0\\n\\r\\t\\\\\\\"'", result);
  }

  @Test
  public void testRegexpEscape() {
    String result = generator.regexpEscape("a/b", null);
    assertEquals("a\\/b", result);
  }

  @Test
  public void testIdentifierEscape() {
    assertEquals("foo", generator.identifierEscape("foo"));
    assertEquals("\\u1234", generator.identifierEscape("\u1234"));
  }

  @Test
  public void testPatternEscape() {
    assertEquals("a\\*b", generator.patternEscape("a*b"));
    assertEquals("a/b", generator.patternEscape("a/b"));
  }

  @Test
  public void testIsIndirectEval() {
    Node name = Node.newString(Token.NAME, "eval");
    assertTrue(generator.isIndirectEval(name));
    Node other = Node.newString(Token.NAME, "foo");
    assertFalse(generator.isIndirectEval(other));
  }

  @Test
  public void testAddWithException() {
    consumer.setException(new IOException("test"));
    try {
      generator.add("test");
      fail("Expected exception");
    } catch (RuntimeException e) {
      // expected
    }
  }

  @Test
  public void testAddNodeWithEval() {
    Node call = new Node(Token.CALL);
    Node eval = Node.newString(Token.NAME, "eval");
    call.addChildToFront(eval);
    generator.add(call, Context.OTHER);
    assertEquals("eval", consumer.getCode());
  }

  @Test
  public void testAddNodeWithUnquotedString() {
    Node str = Node.newString("foo");
    str.setQuotedString();
    generator.add(str);
    assertEquals("foo", consumer.getCode());
  }

  @Test
  public void testAddNodeWithGetSet() {
    Node obj = new Node(Token.OBJECTLIT);
    Node getNode = new Node(Token.GET);
    Node name = Node.newString(Token.STRING, "foo");
    getNode.addChildToFront(new Node(Token.FUNCTION));
    obj.addChildToFront(getNode);
    getNode.addChildToFront(name);
    generator.add(obj);
    assertEquals("get foo", consumer.getCode());
  }

  @Test
  public void testAddNodeWithGetSetNonEmptyFunction() {
    Node obj = new Node(Token.OBJECTLIT);
    Node setNode = new Node(Token.SET);
    Node name = Node.newString(Token.STRING, "foo");
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToFront(new Node(Token.NAME, ""));
    fn.addChildToFront(new Node(Token.PARAM_LIST));
    fn.addChildToFront(new Node(Token.BLOCK));
    setNode.addChildToFront(fn);
    setNode.addChildToFront(name);
    obj.addChildToFront(setNode);
    generator.add(obj);
    assertEquals("set foo", consumer.getCode().trim());
  }

  private static class TestCodeConsumer implements CodeConsumer {
    private final StringBuilder code = new StringBuilder();
    private IOException exception;

    void setException(IOException exception) {
      this.exception = exception;
    }

    @Override
    public void add(String str) {
      if (exception != null) {
        throw new RuntimeException(exception);
      }
      code.append(str);
    }

    @Override
    public void addIdentifier(String identifier) {
      add(identifier);
    }

    @Override
    public void addOp(String op, boolean bin) {
      add(op);
    }

    @Override
    public void addNumber(double number) {
      add(String.valueOf(number));
    }

    @Override
    public void addNumber(int number) {
      add(String.valueOf(number));
    }

    @Override
    public void addNumber(double number, int radix) {
      add(String.valueOf(number));
    }

    @Override
    public void addNumber(int number, int radix) {
      add(String.valueOf(number));
    }

    @Override
    public void endStatement() {
      add(";");
    }

    @Override
    public void endStatement(boolean attachToNext) {
      add(";");
    }

    @Override
    public void endFunction(boolean statement) {
      add(")");
    }

    @Override
    public void startSourceMapping(Node node) {
    }

    @Override
    public void endSourceMapping(Node node) {
    }

    @Override
    public void beginLine() {
    }

    @Override
    public void endLine() {
    }

    @Override
    public void notePreferredLineBreak() {
    }

    @Override
    public boolean continueProcessing() {
      return exception == null;
    }

    @Override
    public void addToComment(String comment) {
      add(comment);
    }

    @Override
    public boolean shouldPreserveExtraBlocks() {
      return false;
    }

    @Override
    public boolean breakAfterBlockFor(Node n, boolean isStatementContext) {
      return false;
    }

    @Override
    public boolean breakAfterBlock(Node n, boolean isStatementContext) {
      return false;
    }

    @Override
    public boolean breakAfterBlock(int type, boolean isStatementContext) {
      return false;
    }

    @Override
    public boolean breakAfterBlock(int type, boolean isStatementContext, int childCount) {
      return false;
    }

    @Override
    public void blockEnd() {
    }

    @Override
    public void beginCaseBody() {
    }

    @Override
    public void endCaseBody() {
    }

    String getCode() {
      return code.toString();
    }
  }

  private static class TestCodeGenerator extends CodeGenerator {
    TestCodeGenerator(CodeConsumer consumer) {
      super(consumer);
    }
  }
}