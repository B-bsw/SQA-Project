package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ScopedAliasesTest {
  private static class DummyCompiler extends AbstractCompiler {
    @Override
    CompilerOptions getOptions() { return new CompilerOptions(); }

    @Override
    void report(JSError error) {}

    @Override
    void reportCodeChange() {}

    @Override
    void setScopeCreator(ScopeCreator scopeCreator) {}

    @Override
    void setTypeValidator(AbstractCompiler.TypeValidator typeValidator) {}
  }

  private ScopedAliases scopedAliases;
  private Node root;

  @Before
  public void setUp() {
    scopedAliases = new ScopedAliases(null, null, null);
    root = new Node(Token.ROOT);
  }

  @Test
  public void testEmptyScript() {
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testHotSwapScriptWithNullRoot() {
    scopedAliases.hotSwapScript(root, null);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testSimpleScopeRemoval() {
    Node scopeCall = createScopeCall("goog.scope", "var a = foo.bar;");
    Node expr = new Node(Token.EXPR_RESULT, scopeCall);
    root.addChildToBack(expr);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testScopeCallsCollected() {
    Node scopeCall1 = createScopeCall("goog.scope", "var a = foo.bar;");
    Node scopeCall2 = createScopeCall("goog.scope", "var b = baz.qux;");
    root.addChildToBack(new Node(Token.EXPR_RESULT, scopeCall1));
    root.addChildToBack(new Node(Token.EXPR_RESULT, scopeCall2));
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testNonScopeFunctionNotRemoved() {
    Node func = new Node(Token.FUNCTION);
    root.addChildToBack(func);
    scopedAliases.process(null, root);
    assertEquals(1, root.getChildCount());
  }

  @Test
  public void testNoScopeNoErrors() {
    scopedAliases.process(null, root);
    assertEquals(0, scopedAliases.getErrors());
  }

  @Test
  public void testEnterExitScopeDepthTwo() {
    NodeTraversal t = new NodeTraversal(null, root);
    scopedAliases.enterScope(t);
    scopedAliases.exitScope(t);
  }

  @Test
  public void testEnterExitScopeDepthOne() {
    NodeTraversal t = new NodeTraversal(null, root);
    t.inGlobalScope();
    scopedAliases.enterScope(t);
    scopedAliases.exitScope(t);
  }

  @Test
  public void testShouldTraverseFunctionInGlobalScope() {
    NodeTraversal t = new NodeTraversal(null, root);
    Node func = new Node(Token.FUNCTION);
    root.addChildToBack(func);
    func.setParent(new Node(Token.EXPR_RESULT));
    assertFalse(scopedAliases.shouldTraverse(t, func, null));
  }

  @Test
  public void testAliasUsageApply() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node rootNode = new Node(Token.ROOT, parent);
    scopedAliases.new AliasedNode(null, nameNode).applyAlias();
  }

  @Test
  public void testAliasTypeNodeApplyWithNullAliasDef() {
    Node nameNode = new Node(Token.NAME, "a");
    try {
      scopedAliases.new AliasedTypeNode(null, nameNode);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  private Node createScopeCall(String methodName, String body) {
    Node target = new Node(Token.NAME, "goog");
    Node prop = new Node(Token.GETPROP, target, new Node(Token.STRING, "scope"));
    Node call = new Node(Token.CALL, prop);
    Node func = new Node(Token.FUNCTION);
    func.setChildCount(3);
    Node block = new Node(Token.BLOCK);
    func.addChildToBack(block);
    call.addChildToBack(func);
    return call;
  }

  private static class NodeTraversal {
    private int scopeDepth;
    private boolean inGlobal;

    NodeTraversal(AbstractCompiler compiler, Node root) {}

    void inGlobalScope() { this.inGlobal = true; }

    int getScopeDepth() { return scopeDepth; }

    boolean isGlobalScope() { return inGlobal; }
  }

  private static class AbstractCompiler {
    void report(JSError error) {}
    void reportCodeChange() {}
    void setScopeCreator(ScopeCreator scopeCreator) {}
    void setTypeValidator(AbstractCompiler.TypeValidator typeValidator) {}
  }

  private static class JSError {}

  private static class ScopeCreator {}

  private static class CompilerOptions {
    AliasTransformationHandler getAliasTransformationHandler() { return null; }
  }

  private static class AliasTransformationHandler {
    void onAliasUsage(AliasTransformation transformation) {}
  }

  private static class AliasTransformation {
    void alias(String aliasName, String aliasedName) {}
  }
}