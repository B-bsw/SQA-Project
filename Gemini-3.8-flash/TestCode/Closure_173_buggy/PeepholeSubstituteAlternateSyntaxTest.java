package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PeepholeSubstituteAlternateSyntaxTest {

  private PeepholeSubstituteAlternateSyntax lateOptimizer;
  private PeepholeSubstituteAlternateSyntax earlyOptimizer;
  private static final String[] STANDARD_CONSTRUCTORS = {"Object", "Array", "RegExp", "Error"};

  @Before
  public void setUp() {
    lateOptimizer = new PeepholeSubstituteAlternateSyntax(true);
    earlyOptimizer = new PeepholeSubstituteAlternateSyntax(false);
  }

  @Test
  public void testOptimizeSubtree_trueNode() {
    Node trueNode = IR.trueNode();
    Node result = lateOptimizer.optimizeSubtree(trueNode);
    assertNotNull(result);
    assertEquals(Token.FALSE, result.getType());
  }

  @Test
  public void testOptimizeSubtree_falseNode() {
    Node falseNode = IR.falseNode();
    Node result = lateOptimizer.optimizeSubtree(falseNode);
    assertNotNull(result);
    assertEquals(Token.TRUE, result.getType());
  }

  @Test
  public void testOptimizeSubtree_newObject_noArgs_normalized() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node newObject = IR.newNode(Token.NEW, IR.name("Object"));
    Node result = lateOptimizer.optimizeSubtree(newObject);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testOptimizeSubtree_newObject_withArgs_normalized() {
    Node newObject = IR.newNode(Token.NEW, IR.name("Object"), IR.string("a"));
    Node result = lateOptimizer.optimizeSubtree(newObject);
    assertEquals(Token.NEW, result.getType());
    assertEquals("Object", result.getFirstChild().getString());
  }

  @Test
  public void testTryFoldLiteralConstructor_newArray_empty() {
    Node newArray = IR.newNode(Token.NEW, IR.name("Array"));
    Node result = lateOptimizer.optimizeSubtree(newArray);
    assertEquals(Token.ARRAYLIT, result.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_newArray_withArgs() {
    Node newArray = IR.newNode(Token.NEW, IR.name("Array"), IR.number(1.0));
    Node result = lateOptimizer.optimizeSubtree(newArray);
    assertEquals(Token.ARRAYLIT, result.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_newArray_singleZero() {
    Node zero = IR.number(0.0);
    zero.putBooleanProp(Node.EMPTY_ARRAY_LIT, false);
    Node newArray = IR.newNode(Token.NEW, IR.name("Array"), zero);
    Node result = lateOptimizer.optimizeSubtree(newArray);
    assertEquals(Token.ARRAYLIT, result.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_newRegExp_validflags() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node name = IR.name("RegExp");
    Node flags = IR.string("ig");
    Node pattern = IR.string("a");
    Node regExpNode = IR.newNode(Token.NEW, name, pattern, flags);
    regExpNode.putBooleanProp(Node.REGEXP_FLAGS, true);
    Node result = lateOptimizer.optimizeSubtree(regExpNode);
    assertNotNull(result);
    assertEquals(Token.REGEXP, result.getType());
  }

  @Test
  public void testTryFoldLiteralConstructor_newRegExp_invalidFlags() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node name = IR.name("RegExp");
    Node flags = IR.string("z");
    Node pattern = IR.string("a");
    Node regExpNode = IR.newNode(Token.NEW, name, pattern, flags);
    regExpNode.putBooleanProp(Node.REGEXP_FLAGS, true);
    Node result = lateOptimizer.optimizeSubtree(regExpNode);
    assertNotNull(result);
    assertEquals(regExpNode, result);
  }

  @Test
  public void testTryFoldSimpleFunctionCall_stringWithImmutable() {
    Node name = IR.name("String");
    Node value = IR.string("abc");
    Node call = IR.call(name, value);
    Node result = lateOptimizer.optimizeSubtree(call);
    assertEquals(Token.ADD, result.getType());
    assertEquals(Token.STRING, result.getFirstChild().getType());
  }

  @Test
  public void testTryFoldSimpleFunctionCall_stringWithNonImmutable() {
    Node name = IR.name("String");
    Node value = IR.name("a");
    Node call = IR.call(name, value);
    Node result = lateOptimizer.optimizeSubtree(call);
    assertSame(call, result);
  }

  @Test
  public void testTryFoldImmediateCallToBoundFunction_withThis() {
    Node boundFn = IR.name("fn");
    Node thisValue = IR.name("thisValue");
    Node callTarget = IR.getprop(boundFn.cloneTree(), IR.string("bind"));
    Node call = IR.call(callTarget, thisValue, IR.name("a"));
    call.putBooleanProp(Node.FREE_CALL, true);
    Node result = lateOptimizer.optimizeSubtree(call);
    assertNotNull(result);
  }

  @Test
  public void testTrySplitComma_late() {
    Node comma = IR.comma(IR.name("a"), IR.name("b"));
    Node exprResult = IR.exprResult(comma);
    Node parent = IR.block(exprResult);
    Node result = lateOptimizer.optimizeSubtree(exprResult);
    assertNotNull(result);
  }

  @Test
  public void testTryReplaceUndefined_normalized() {
    Node undefinedNode = IR.name("undefined");
    undefinedNode.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node parent = IR.exprResult(undefinedNode);
    lateOptimizer.optimizeSubtree(parent);
    assertEquals(Token.VOID, parent.getFirstChild().getType());
  }

  @Test
  public void testTryReduceReturn_undefinedName() {
    Node undefinedNode = IR.name("undefined");
    Node ret = IR.returnNode(undefinedNode);
    Node result = lateOptimizer.optimizeSubtree(ret);
    assertEquals(Token.RETURN, result.getType());
    assertNull(result.getFirstChild());
  }

  @Test
  public void testTryReduceReturn_voidNode() {
    Node voidNode = IR.voidNode(IR.number(1.0));
    Node ret = IR.returnNode(voidNode);
    Node result = lateOptimizer.optimizeSubtree(ret);
    assertEquals(Token.RETURN, result.getType());
  }

  @Test
  public void testTryReduceReturn_normalValue() {
    Node ret = IR.returnNode(IR.number(5.0));
    Node result = lateOptimizer.optimizeSubtree(ret);
    assertEquals(Token.RETURN, result.getType());
    assertNotNull(result.getFirstChild());
  }

  @Test
  public void testTryMinimizeArrayLiteral_emptyString() {
    Node arr = IR.arraylit(IR.string(""));
    Node result = lateOptimizer.optimizeSubtree(arr);
    assertNotNull(result);
    assertEquals(Token.ARRAYLIT, result.getType());
  }

  @Test
  public void testTryMinimizeArrayLiteral_notAllStrings() {
    Node arr = IR.arraylit(IR.number(1.0), IR.string("a"));
    Node result = lateOptimizer.optimizeSubtree(arr);
    assertNotNull(result);
  }

  @Test
  public void testOptimizeSubtree_newRegExp_foldsWithUnicodeEscape() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node name = IR.name("RegExp");
    Node pattern = IR.string("\\u0061");
    Node regExpNode = IR.newNode(Token.NEW, name, pattern);
    regExpNode.putBooleanProp(Node.REGEXP_FLAGS, true);
    Node result = lateOptimizer.optimizeSubtree(regExpNode);
    assertNotNull(result);
    assertEquals(Token.REGEXP, result.getType());
  }

  @Test
  public void testOptimizeSubtree_areValidRegexpFlags_multipleFlags() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node name = IR.name("RegExp");
    Node pattern = IR.string("a");
    Node flags = IR.string("igm");
    Node regExpNode = IR.newNode(Token.NEW, name, pattern, flags);
    regExpNode.putBooleanProp(Node.REGEXP_FLAGS, true);
    Node result = lateOptimizer.optimizeSubtree(regExpNode);
    assertNotNull(result);
    // Folding should be safe with g flag on since not late
    assertEquals(Token.REGEXP, result.getType());
  }

  @Test
  public void testOptimizeSubtree_areValidRegexpFlags_invalidFlag() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setNormalized(true);
    Node name = IR.name("RegExp");
    Node pattern = IR.string("a");
    Node flags = IR.string("x");
    Node regExpNode = IR.newNode(Token.NEW, name, pattern, flags);
    regExpNode.putBooleanProp(Node.REGEXP_FLAGS, true);
    Node result = lateOptimizer.optimizeSubtree(regExpNode);
    assertSame(regExpNode, result);
  }
}