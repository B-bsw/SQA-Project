package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveConstantExpressionsTest {

  private TestCompiler compiler;
  private RemoveConstantExpressions pass;

  private static class TestCompiler extends Compiler {
    private int codeChangeCount = 0;

    @Override
    public void reportCodeChange() {
      this.codeChangeCount++;
    }

    public int getCodeChangeCount() {
      return this.codeChangeCount;
    }
  }

  @Before
  public void setUp() {
    this.compiler = new TestCompiler();
    this.pass = new RemoveConstantExpressions(this.compiler);
  }

  @Test
  public void process_givenConstantExpression_shouldRemoveAndNotifyCompiler() {
    // Arrange
    Node root = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(Node.newNumber(42.0));
    root.addChildToBack(expr);

    Node externs = new Node(Token.SCRIPT);

    // Act
    this.pass.process(externs, root);

    // Assert
    Assert.assertEquals(0, root.getChildCount());
    Assert.assertTrue(this.compiler.getCodeChangeCount() > 0);
  }

  @Test
  public void process_givenSideEffectExpression_shouldRetainAndNotNotifyCompiler() {
    // Arrange
    Node root = new Node(Token.SCRIPT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(Node.newString(Token.NAME, "foo"));
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(call);
    root.addChildToBack(expr);

    Node externs = new Node(Token.SCRIPT);

    // Act
    this.pass.process(externs, root);

    // Assert
    Assert.assertEquals(1, root.getChildCount());
    Assert.assertSame(expr, root.getFirstChild());
    Assert.assertEquals(0, this.compiler.getCodeChangeCount());
  }

  @Test
  public void visit_givenNonExprResultNode_shouldDoNothing() {
    // Arrange
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    parent.addChildToBack(varNode);

    // Act
    callback.visit(null, varNode, parent);

    // Assert
    Assert.assertEquals(1, parent.getChildCount());
    Assert.assertSame(varNode, parent.getFirstChild());
    Assert.assertFalse(callback.getResult().changed);
  }

  @Test
  public void visit_givenPureConstantExprResult_shouldRemoveNode() {
    // Arrange
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(Node.newString(Token.NAME, "x"));
    parent.addChildToBack(expr);

    // Act
    callback.visit(null, expr, parent);

    // Assert
    Assert.assertEquals(0, parent.getChildCount());
    Assert.assertTrue(callback.getResult().changed);
  }

  @Test
  public void visit_givenExprResultWithSideEffectChild_shouldNotRemoveNode() {
    // Arrange
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.BLOCK);
    Node call = new Node(Token.CALL);
    call.addChildToBack(Node.newString(Token.NAME, "execute"));
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(call);
    parent.addChildToBack(expr);

    // Act
    callback.visit(null, expr, parent);

    // Assert
    Assert.assertEquals(1, parent.getChildCount());
    Assert.assertSame(expr, parent.getFirstChild());
    Assert.assertFalse(callback.getResult().changed);
  }

  @Test
  public void visit_givenExprResultWithBinarySideEffect_shouldReplaceWithSideEffectOnly() {
    // Arrange: 1 + foo()
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.BLOCK);

    Node call = new Node(Token.CALL);
    call.addChildToBack(Node.newString(Token.NAME, "foo"));

    Node add = new Node(Token.ADD);
    add.addChildToBack(Node.newNumber(1.0));
    add.addChildToBack(call);

    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(add);
    parent.addChildToBack(expr);

    // Act
    callback.visit(null, expr, parent);

    // Assert
    Assert.assertEquals(1, parent.getChildCount());
    Node replacementExpr = parent.getFirstChild();
    Assert.assertEquals(Token.EXPR_RESULT, replacementExpr.getType());
    Assert.assertEquals(Token.CALL, replacementExpr.getFirstChild().getType());
    Assert.assertTrue(callback.getResult().changed);
  }

  @Test
  public void visit_givenExprResultWithMultipleSideEffects_shouldReplaceWithAllSideEffects() {
    // Arrange: foo() + bar()
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node parent = new Node(Token.BLOCK);

    Node call1 = new Node(Token.CALL);
    call1.addChildToBack(Node.newString(Token.NAME, "foo"));

    Node call2 = new Node(Token.CALL);
    call2.addChildToBack(Node.newString(Token.NAME, "bar"));

    Node add = new Node(Token.ADD);
    add.addChildToBack(call1);
    add.addChildToBack(call2);

    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(add);
    parent.addChildToBack(expr);

    // Act
    callback.visit(null, expr, parent);

    // Assert
    Assert.assertEquals(2, parent.getChildCount());
    Node first = parent.getFirstChild();
    Node second = first.getNext();

    Assert.assertEquals(Token.EXPR_RESULT, first.getType());
    Assert.assertEquals(Token.CALL, first.getFirstChild().getType());
    Assert.assertEquals("foo", first.getFirstChild().getFirstChild().getString());

    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
    Assert.assertEquals(Token.CALL, second.getFirstChild().getType());
    Assert.assertEquals("bar", second.getFirstChild().getFirstChild().getString());

    Assert.assertTrue(callback.getResult().changed);
  }

  @Test
  public void getResult_givenNewCallback_shouldReturnNonNullResultWithChangedFalse() {
    // Arrange & Act
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();

    // Assert
    Assert.assertNotNull(callback.getResult());
    Assert.assertFalse(callback.getResult().changed);
  }

  @Test
  public void process_givenEmptyRoot_shouldNotFailAndNotNotifyCompiler() {
    // Arrange
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.SCRIPT);

    // Act
    this.pass.process(externs, root);

    // Assert
    Assert.assertEquals(0, root.getChildCount());
    Assert.assertEquals(0, this.compiler.getCodeChangeCount());
  }

  @Test
  public void process_givenMultipleMixedExpressions_shouldSimplifyOnlyPureExpressions() {
    // Arrange
    Node root = new Node(Token.SCRIPT);

    Node constantExpr = new Node(Token.EXPR_RESULT);
    constantExpr.addChildToBack(Node.newNumber(100.0));

    Node sideEffectExpr = new Node(Token.EXPR_RESULT);
    Node call = new Node(Token.CALL);
    call.addChildToBack(Node.newString(Token.NAME, "alert"));
    sideEffectExpr.addChildToBack(call);

    root.addChildToBack(constantExpr);
    root.addChildToBack(sideEffectExpr);

    Node externs = new Node(Token.SCRIPT);

    // Act
    this.pass.process(externs, root);

    // Assert
    Assert.assertEquals(1, root.getChildCount());
    Assert.assertSame(sideEffectExpr, root.getFirstChild());
    Assert.assertEquals(1, this.compiler.getCodeChangeCount());
  }
}