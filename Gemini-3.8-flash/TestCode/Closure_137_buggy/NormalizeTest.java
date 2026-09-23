package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class NormalizeTest {

  private static class TestCompiler extends AbstractCompiler {
    private boolean reportChangeCalled;

    @Override
    public void reportCodeChange() {
      reportChangeCalled = true;
    }

    @Override
    public void reportChange(String changeDescription) {
      reportChangeCalled = true;
    }
  }

  private TestCompiler compiler;
  private Normalize normalize;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    normalize = new Normalize(compiler, false);
  }

  @After
  public void tearDown() {
    compiler = null;
    normalize = null;
  }

  @Test
  public void testProcessNullExternsRootThrowsNPE() {
    try {
      normalize.process(null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessValidInputDoesNotThrow() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    root.addChildToFront(new Node(Token.EMPTY, new Node(Token.NAME, "a")));
    normalize.process(externs, root);
  }

  @Test
  public void testNormalizeLabelsHandlesLabelNode() {
    Node label = new Node(Token.LABEL);
    label.addChildToFront(new Node(Token.NAME, "labelName"));
    Node block = new Node(Token.BLOCK);
    label.addChildToBack(block);
    
    normalize.normalizeLabelsForTest(label);
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsHandlesForNode() {
    Node label = new Node(Token.LABEL);
    label.addChildToFront(new Node(Token.NAME, "labelName"));
    Node forNode = new Node(Token.FOR);
    label.addChildToBack(forNode);
    
    normalize.normalizeLabelsForTest(label);
    assertNotNull(label.getLastChild());
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsHandlesDefaultCase() {
    Node label = new Node(Token.LABEL);
    label.addChildToFront(new Node(Token.NAME, "labelName"));
    Node expr = new Node(Token.EXPR_RESULT);
    label.addChildToBack(expr);
    
    normalize.normalizeLabelsForTest(label);
    assertNotNull(label.getLastChild());
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithNullLastChild() {
    Node label = new Node(Token.LABEL);
    label.addChildToFront(new Node(Token.NAME, "labelName"));
    
    try {
      normalize.normalizeLabelsForTest(label);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testExtractForInitializerWithVarInitializer() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "i");
    init.addChildToFront(name);
    
    Node empty = new Node(Token.EMPTY);
    Node expr = new Node(Token.EMPTY);
    forNode.addChildToFront(init);
    
    normalize.extractForInitializerForTest(forNode, empty, forNode);
  }

  @Test
  public void testExtractForInitializerWithExpressionInitializer() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "i");
    init.addChildToFront(name);
    
    Node empty = new Node(Token.EMPTY);
    Node expr = new Node(Token.EMPTY);
    forNode.addChildToFront(init);
    
    normalize.extractForInitializerForTest(forNode, empty, forNode);
  }

  @Test
  public void testExtractForInitializerWithNullBeforeParent() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "i");
    init.addChildToFront(name);
    forNode.addChildToFront(init);
    
    normalize.extractForInitializerForTest(forNode, null, null);
  }

  @Test
  public void testDoStatementNormalizationsWithLabel() {
    Node label = new Node(Token.LABEL);
    label.addChildToFront(new Node(Token.NAME, "labelName"));
    Node block = new Node(Token.BLOCK);
    label.addChildToBack(block);
    
    normalize.doStatementNormalizationsForTest(label, null);
    assertEquals(Token.LABEL, label.getType());
  }

  @Test
  public void testDoStatementNormalizationsWithStatementBlock() {
    Node block = new Node(Token.BLOCK);
    Node var = new Node(Token.VAR);
    block.addChildToFront(var);
    
    normalize.doStatementNormalizationsForTest(block, null);
  }

  @Test
  public void testDoStatementNormalizationsWithFunction() {
    Node function = new Node(Token.FUNCTION);
    function.addChildToFront(new Node(Token.NAME, "funcName"));
    
    Node block = new Node(Token.BLOCK);
    block.addChildToFront(function);
    
    normalize.doStatementNormalizationsForTest(block, null);
  }

  @Test
  public void testShouldTraverseAlwaysReturnsTrue() {
    Node n = new Node(Token.EMPTY);
    assertEquals(true, normalize.shouldTraverseForTest(null, n, null));
  }

  @Test
  public void testPropogateConstantAnnotationsWithNullName() {
    Node name = new Node(Token.NAME, "");
    normalize.propogateConstantAnnotationsForTest(name, null);
  }

  @Test
  public void testPropogateConstantAnnotationsWithNoJSDocInfo() {
    Node name = new Node(Token.NAME, "x");
    name.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    normalize.propogateConstantAnnotationsForTest(name, null);
  }

  @Test
  public void testVerifyConstantsWithMismatchedConstants() {
    Node name = new Node(Token.NAME, "x");
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    
    try {
      normalize.verifyConstantsForTest(name);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testReportCodeChangeWithAssertOnChangeTrue() {
    Normalize n = new Normalize(compiler, true);
    try {
      n.reportCodeChangeForTest("Test change");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testReportCodeChangeWithAssertOnChangeFalse() {
    Normalize n = new Normalize(compiler, false);
    n.reportCodeChangeForTest("Test change");
  }

  @Test
  public void testMakeVarDeclarationsInLoop() {
    Node forNode = new Node(Token.FOR);
    Node var = new Node(Token.VAR);
    var.addChildToFront(new Node(Token.NAME, "i"));
    
    Node expr = new Node(Token.ASSIGN);
    expr.addChildToFront(new Node(Token.NAME, "i"));
    expr.addChildToBack(new Node(Token.NUMBER, 0));
    
    NodeUtil.newExpr(forNode);
    forNode.addChildToFront(expr);
    forNode.addChildToFront(var);
  }

  @Test
  public void testNormalizeProcessWithSimpleScript() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node var = new Node(Token.VAR);
    var.addChildToFront(new Node(Token.NAME, "a"));
    root.addChildToFront(var);
    
    normalize.process(externs, root);
  }
}