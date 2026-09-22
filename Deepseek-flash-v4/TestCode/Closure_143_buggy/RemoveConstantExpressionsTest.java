package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RemoveConstantExpressionsTest {

  private RemoveConstantExpressions pass;
  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    pass = new RemoveConstantExpressions(compiler);
  }

  @Test
  public void testProcessWithNoSideEffects() {
    Node root = parse("var a = 1;");
    pass.process(null, root);
  }

  @Test
  public void testRemoveConstantExpression() {
    Node root = parse("1 + foo() + 2;");
    Node original = root.getFirstChild().getFirstChild(); 
    pass.process(null, root);
    assertTrue(compiler.changed);
  }

  @Test
  public void testTrySimplifyWithConstExpr() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node exprResult = new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 1));
    callback.visit(null, exprResult, exprResult.getParent());
  }

  @Test
  public void testTrySimplifyWithSideEffects() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node call = new Node(Token.CALL, new Node(Token.NAME, "foo"));
    Node exprResult = new Node(Token.EXPR_RESULT, call);
    callback.visit(null, exprResult, exprResult.getParent());
  }

  @Test
  public void testGetSideEffectNodesWithPureExpression() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node pureNode = new Node(Token.NUMBER, 1);
    assertEquals(0, callback.getSideEffectNodes(pureNode).size());
  }

  @Test
  public void testGetSideEffectNodesWithSideEffect() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    Node call = new Node(Token.CALL, new Node(Token.NAME, "foo"));
    assertEquals(1, callback.getSideEffectNodes(call).size());
  }

  @Test
  public void testResultInitiallyUnchanged() {
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    assertFalse(callback.getResult().changed);
  }

  @Test
  public void testNodeRemovedSetsChanged() {
    RemoveConstantExpressions.ReportCodeHasChangedListener listener =
        new RemoveConstantExpressions.ReportCodeHasChangedListener(
            new RemoveConstantExpressions.RemoveConstantRValuesCallback().getResult());
    Node node = new Node(Token.NAME, "x");
    listener.nodeRemoved(node);
    assertTrue(new RemoveConstantExpressions.RemoveConstantRValuesCallback().getResult().changed);
  }

  @Test
  public void testProcessWithNullExterns() {
    Node root = parse("function f() { return 1; }");
    pass.process(null, root);
  }

  @Test
  public void testProcessWithEmptyRoot() {
    Node root = new Node(Token.ROOT);
    pass.process(null, root);
  }

  @Test
  public void testExpressionStatementWithNoSideEffects() {
    Node expr = new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 42));
    RemoveConstantExpressions.RemoveConstantRValuesCallback callback =
        new RemoveConstantExpressions.RemoveConstantRValuesCallback();
    callback.visit(null, expr, null);
  }

  private Node parse(String code) {
    return com.google.javascript.rhino.testing.TestErrorReporter.parse(code, "");
  }

  private static class TestCompiler implements AbstractCompiler {
    private boolean changed = false;

    @Override
    public void reportCodeChange() {
      changed = true;
    }
  }
}