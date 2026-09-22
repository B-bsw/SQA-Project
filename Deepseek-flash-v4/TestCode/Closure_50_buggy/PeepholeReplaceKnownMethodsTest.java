package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class PeepholeReplaceKnownMethodsTest {

  private PeepholeReplaceKnownMethods peephole;
  private Node node;

  @Before
  public void setUp() {
    peephole = new PeepholeReplaceKnownMethods();
    node = new Node(Token.CALL);
  }

  @Test
  public void testOptimizeSubtreeNotCall() {
    Node notCall = new Node(Token.NAME);
    Node result = peephole.optimizeSubtree(notCall);
    assertEquals(notCall, result);
  }

  @Test
  public void testOptimizeSubtreeCall() {
    Node call = new Node(Token.CALL);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(call, result);
  }

  @Test
  public void testTryFoldArrayJoinWithEmptyArray() {
    Node array = new Node(Token.ARRAYLIT);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    // call with no arguments; should use default separator ","
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithSingleEmptyString() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newString(""));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithStrings() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newString("a"));
    array.addChildToBack(Node.newString("b"));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("a,b", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithSeparator() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newString("a"));
    array.addChildToBack(Node.newString("b"));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    call.addChildToBack(Node.newString("-"));
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("a-b", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithNumbers() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newNumber(1.0));
    array.addChildToBack(Node.newNumber(2.0));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("1,2", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithMixedTypes() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newString("a"));
    array.addChildToBack(Node.newNumber(1.0));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("a,1", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinWithNestedArrays() {
    Node array = new Node(Token.ARRAYLIT);
    Node nested = new Node(Token.ARRAYLIT);
    nested.addChildToBack(Node.newString("a"));
    nested.addChildToBack(Node.newString("b"));
    array.addChildToBack(nested);
    array.addChildToBack(Node.newString("c"));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    // Cannot fold nested arrays, should return original call
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(call, result);
  }

  @Test
  public void testTryFoldArrayJoinWithNoArgs() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newString("a"));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("a", result.getString());
  }

  @Test
  public void testTryFoldStringToLowerCase() {
    Node string = Node.newString("HELLO");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("toLowerCase"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("hello", result.getString());
  }

  @Test
  public void testTryFoldStringToUpperCase() {
    Node string = Node.newString("hello");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("toUpperCase"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("HELLO", result.getString());
  }

  @Test
  public void testTryFoldStringIndexOf() {
    Node string = Node.newString("hello world");
    Node firstArg = Node.newString("world");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("indexOf"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(6.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldStringIndexOfNotFound() {
    Node string = Node.newString("hello world");
    Node firstArg = Node.newString("xyz");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("indexOf"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(-1.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldStringSubstring() {
    Node string = Node.newString("hello world");
    Node firstArg = Node.newNumber(6.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("substring"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("world", result.getString());
  }

  @Test
  public void testTryFoldStringSubstr() {
    Node string = Node.newString("hello world");
    Node firstArg = Node.newNumber(6.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("substr"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("world", result.getString());
  }

  @Test
  public void testTryFoldParseNumberWithRadix() {
    Node call = new Node(Token.CALL);
    Node name = Node.newString("parseInt");
    name.putProp(Node.ORIGINALNAME_PROP, "parseInt");
    call.addChildToBack(name);
    call.addChildToBack(Node.newString("10"));
    call.addChildToBack(Node.newNumber(2.0));
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(2.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldParseFloat() {
    Node call = new Node(Token.CALL);
    Node name = Node.newString("parseFloat");
    name.putProp(Node.ORIGINALNAME_PROP, "parseFloat");
    call.addChildToBack(name);
    call.addChildToBack(Node.newString("3.14"));
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(3.14, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldParseFloatWithNonStringFirstArg() {
    Node call = new Node(Token.CALL);
    Node name = Node.newString("parseFloat");
    name.putProp(Node.ORIGINALNAME_PROP, "parseFloat");
    call.addChildToBack(name);
    call.addChildToBack(Node.newNumber(1.0));
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(1.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldStringCharAtValidIndex() {
    Node string = Node.newString("hello");
    Node firstArg = Node.newNumber(1.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("charAt"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("e", result.getString());
  }

  @Test
  public void testTryFoldStringCharAtOutOfBounds() {
    Node string = Node.newString("hello");
    Node firstArg = Node.newNumber(10.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("charAt"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertEquals(call, result);
  }

  @Test
  public void testTryFoldStringCharCodeAtValidIndex() {
    Node string = Node.newString("hello");
    Node firstArg = Node.newNumber(0.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("charCodeAt"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(104.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldStringLastIndexOf() {
    Node string = Node.newString("hello world world");
    Node firstArg = Node.newString("world");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("lastIndexOf"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(12.0, result.getDouble(), 0.0);
  }

  @Test
  public void testTryFoldStringSubstringWithBothArgs() {
    Node string = Node.newString("hello world");
    Node firstArg = Node.newNumber(0.0);
    Node secondArg = Node.newNumber(5.0);
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("substring"));
    call.addChildToBack(getProp);
    call.addChildToBack(firstArg);
    call.addChildToBack(secondArg);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("hello", result.getString());
  }

  @Test
  public void testParseIntWithInvalidString() {
    Node call = new Node(Token.CALL);
    Node name = Node.newString("parseInt");
    name.putProp(Node.ORIGINALNAME_PROP, "parseInt");
    call.addChildToBack(name);
    call.addChildToBack(Node.newString("abc"));
    Node result = peephole.optimizeSubtree(call);
    assertEquals(call, result);
  }

  @Test
  public void testParseFloatWithInvalidString() {
    Node call = new Node(Token.CALL);
    Node name = Node.newString("parseFloat");
    name.putProp(Node.ORIGINALNAME_PROP, "parseFloat");
    call.addChildToBack(name);
    call.addChildToBack(Node.newString("abc"));
    Node result = peephole.optimizeSubtree(call);
    assertEquals(call, result);
  }

  @Test
  public void testTryFoldArrayJoinWithNullElement() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(new Node(Token.NULL));
    array.addChildToBack(Node.newString("a"));
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(array);
    getProp.addChildToBack(Node.newString("join"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals(",a", result.getString());
  }

  @Test
  public void testTryFoldStringToLowerCaseWithLocale() {
    Node string = Node.newString("ÄBC");
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToBack(string);
    getProp.addChildToBack(Node.newString("toLowerCase"));
    call.addChildToBack(getProp);
    Node result = peephole.optimizeSubtree(call);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("äbc", result.getString());
  }
}