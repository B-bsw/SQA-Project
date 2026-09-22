package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NormalizeTest {

  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void reportCodeChange() {}
  }

  private TestCompiler compiler;
  private Normalize normalize;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    normalize = new Normalize(compiler, true);
  }

  @Test
  public void testSplitVarDeclarationsWithMultipleChildren() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "a");
    Node name2 = new Node(Token.NAME, "b");
    varNode.addChildToBack(name1);
    varNode.addChildToBack(name2);
    script.addChildToBack(varNode);
    script.addChildToBack(new Node(Token.EMPTY));

    normalize.splitVarDeclarations(script);

    assertEquals(2, script.getChildCount());
    assertEquals(1, script.getFirstChild().getChildCount());
    assertEquals(1, script.getLastChild().getChildCount());
    assertEquals(Token.VAR, script.getFirstChild().getType());
    assertEquals(Token.VAR, script.getLastChild().getType());
  }

  @Test
  public void testSplitVarDeclarationsWithSingleChild() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "a");
    varNode.addChildToBack(name1);
    script.addChildToBack(varNode);

    normalize.splitVarDeclarations(script);

    assertEquals(1, script.getChildCount());
    assertEquals(1, script.getFirstChild().getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarDeclarationsAssertionFails() {
    Node script = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    script.addChildToBack(varNode);
    normalize.splitVarDeclarations(script);
  }

  @Test
  public void testExtractForInitializerWithVar() {
    Node forNode = new Node(Token.FOR);
    Node varNode = new Node(Token.VAR);
    Node init = new Node(Token.NAME, "i");
    varNode.addChildToBack(init);
    forNode.addChildToBack(varNode);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));

    Node before = new Node(Token.EMPTY);
    Node beforeParent = new Node(Token.SCRIPT);
    beforeParent.addChildToBack(before);

    normalize.extractForInitializer(forNode, before, beforeParent);

    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    assertEquals(Token.VAR, beforeParent.getFirstChild().getType());
  }

  @Test
  public void testExtractForInitializerWithExpr() {
    Node forNode = new Node(Token.FOR);
    Node exprNode = new Node(Token.EXPR_RESULT);
    Node init = new Node(Token.NAME, "a");
    exprNode.addChildToBack(init);
    forNode.addChildToBack(exprNode);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));

    Node before = new Node(Token.EMPTY);
    Node beforeParent = new Node(Token.SCRIPT);
    beforeParent.addChildToBack(before);

    normalize.extractForInitializer(forNode, before, beforeParent);

    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    assertNotNull(beforeParent.getFirstChild());
  }

  @Test
  public void testExtractForInitializerWithEmptyVar() {
    Node forNode = new Node(Token.FOR);
    Node varNode = new Node(Token.VAR);
    forNode.addChildToBack(varNode);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));

    Node before = new Node(Token.EMPTY);
    Node beforeParent = new Node(Token.SCRIPT);
    beforeParent.addChildToBack(before);

    normalize.extractForInitializer(forNode, before, beforeParent);

    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithLabelChild() {
    Node labelNode = new Node(Token.LABEL);
    Node blockNode = new Node(Token.BLOCK);
    labelNode.addChildToBack(blockNode);

    normalize.normalizeLabels(labelNode);

    assertEquals(Token.LABEL, labelNode.getType());
    assertNotNull(labelNode.getFirstChild());
  }

  @Test
  public void testNormalizeLabelsWithBlockChild() {
    Node labelNode = new Node(Token.LABEL);
    Node blockNode = new Node(Token.BLOCK);
    Node innerBlock = new Node(Token.BLOCK);
    blockNode.addChildToBack(innerBlock);
    labelNode.addChildToBack(blockNode);

    normalize.normalizeLabels(labelNode);

    assertEquals(Token.LABEL, labelNode.getType());
    assertNotNull(labelNode.getLastChild());
    assertEquals(Token.BLOCK, labelNode.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithForChild() {
    Node labelNode = new Node(Token.LABEL);
    Node forNode = new Node(Token.FOR);
    labelNode.addChildToBack(forNode);

    normalize.normalizeLabels(labelNode);

    assertEquals(Token.LABEL, labelNode.getType());
    assertEquals(Token.FOR, labelNode.getFirstChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithDoChild() {
    Node labelNode = new Node(Token.LABEL);
    Node doNode = new Node(Token.DO);
    labelNode.addChildToBack(doNode);

    normalize.normalizeLabels(labelNode);

    assertEquals(Token.LABEL, labelNode.getType());
    assertEquals(Token.DO, labelNode.getFirstChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithDefaultChild() {
    Node labelNode = new Node(Token.LABEL);
    Node exprNode = new Node(Token.EXPR_RESULT);
    labelNode.addChildToBack(exprNode);

    normalize.normalizeLabels(labelNode);

    assertEquals(Token.LABEL, labelNode.getType());
    Node parent = labelNode.getFirstChild();
    assertEquals(Token.BLOCK, parent.getType());
    assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
  }

  @Test
  public void testShouldTraverse() {
    NodeTraversal t = new NodeTraversal(compiler, normalize);
    Node n = new Node(Token.SCRIPT);
    assertTrue(normalize.shouldTraverse(t, n, null));
  }

  @Test
  public void testPropogateConstantAnnotationsWithConstName() {
    Node n = new Node(Token.NAME, "CONSTANT_NAME");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    NodeTraversal.traverse(compiler, n, new Normalize.PropogateConstantAnnotations(compiler, true));
    assertTrue(n.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testPropogateConstantAnnotationsWithNoJSDoc() {
    Node n = new Node(Token.NAME, "nonConstant");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    NodeTraversal.traverse(compiler, n, new Normalize.PropogateConstantAnnotations(compiler, false));
    assertEquals(false, n.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testNormalizeProcess() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    normalize.process(externs, root);
    assertNotNull(root);
  }

  @Test
  public void testAddToFrontWithNullAfter() {
    Node parent = new Node(Token.BLOCK);
    Node newChild = new Node(Token.NAME, "x");
    Node result = normalize.addToFront(parent, newChild, null);
    assertEquals(newChild, result);
    assertEquals(newChild, parent.getFirstChild());
  }

  @Test
  public void testAddToFrontWithNonNullAfter() {
    Node parent = new Node(Token.BLOCK);
    Node after = new Node(Token.NAME, "a");
    parent.addChildToBack(after);
    Node newChild = new Node(Token.NAME, "b");
    Node result = normalize.addToFront(parent, newChild, after);
    assertEquals(newChild, result);
    assertEquals(newChild, after.getNext());
  }
}