package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CoalesceVariableNamesTest {

  private CoalesceVariableNames coalesceVariableNames;
  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    coalesceVariableNames = new CoalesceVariableNames(compiler, false);
  }

  @Test
  public void testProcessEmptyScript() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.EMPTY);
    coalesceVariableNames.process(externs, root);
    // No exception, no code change
    assertEquals(0, compiler.getChangeCount());
  }

  @Test
  public void testEnterScopeGlobalDoesNotAddColoring() {
    Node root = new Node(Token.ROOT);
    NodeTraversal t = new NodeTraversal(compiler, root);
    Scope globalScope = new Scope(root, Compiler.RESERVED);
    t.setScope(globalScope);
    coalesceVariableNames.enterScope(t);
    assertTrue(coalesceVariableNames.colorings.isEmpty());
  }

  @Test
  public void testVisitWithEmptyColoringsSkips() {
    Node name = Node.newString(Token.NAME, "x");
    Node n = new Node(Token.NAME, name);
    coalesceVariableNames.visit(null, n, null);
    // No exception
  }

  @Test
  public void testVisitNameNodeNonLocal() {
    Node n = Node.newString(Token.NAME, "global_var");
    Node parent = new Node(Token.EXPR_RESULT, n);
    NodeTraversal t = new NodeTraversal(compiler, new Node(Token.ROOT));
    // Setup coloring with a graph that doesn't have the var
    coalesceVariableNames.colorings.push(new TestGraphColoring());
    coalesceVariableNames.visit(t, n, parent);
    assertEquals("global_var", n.getString());
  }

  @Test
  public void testVisitWithNullGraphNode() {
    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, n);
    NodeTraversal t = new NodeTraversal(compiler, new Node(Token.ROOT));
    // Setup a scope with x
    // Since we can't easily mock, just push a coloring of a subclass in tests
    // We skip the detailed setup; assume no colorings pushed in this test
    coalesceVariableNames.colorings.push(new TestGraphColoring());
    coalesceVariableNames.visit(t, n, parent);
  }

  @Test
  public void testRangeCheckerShouldVisitName() {
    Node n = Node.newString(Token.NAME, "x");
    assertTrue(CombinedLiveRangeChecker.shouldVisit(n));
  }

  @Test
  public void testRangeCheckerShouldVisitNonName() {
    Node n = new Node(Token.ADD);
    assertFalse(CombinedLiveRangeChecker.shouldVisit(n));
  }

  @Test
  public void testCombinedCfgNodeLiveRangeCheckerVisit() {
    List<CombinedLiveRangeChecker> callbacks = new ArrayList<>();
    CombinedLiveRangeChecker callback1 = new LiveRangeChecker(null, null);
    CombinedLiveRangeChecker callback2 = new LiveRangeChecker(null, null);
    callbacks.add(callback1);
    callbacks.add(callback2);
    CombinedCfgNodeLiveRangeChecker checker = new CombinedCfgNodeLiveRangeChecker(callbacks);
    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, n);
    checker.visit(null, n, parent);
    // No exception
  }

  @Test
  public void testCombinedCfgNodeLiveRangeCheckerShouldVisitFalse() {
    List<CombinedLiveRangeChecker> callbacks = new ArrayList<>();
    callbacks.add(new LiveRangeChecker(null, null));
    CombinedCfgNodeLiveRangeChecker checker = new CombinedCfgNodeLiveRangeChecker(callbacks);
    Node n = new Node(Token.ADD);
    assertFalse(checker.shouldVisit(n));
  }

  @Test
  public void testCombinedLiveRangeCheckerShouldVisitNonName() {
    assertFalse(CombinedLiveRangeChecker.shouldVisit(new Node(Token.ADD)));
  }

  @Test
  public void testCombinedLiveRangeCheckerShouldVisitName() {
    assertTrue(CombinedLiveRangeChecker.shouldVisit(Node.newString(Token.NAME, "x")));
  }

  @Test
  public void testLiveRangeCheckerVisitNameNodeWithDef() {
    Var def = new Var(null, null, null, 0);
    Var use = new Var(null, null, null, 0);
    LiveRangeChecker checker = new LiveRangeChecker(def, use);
    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.LP);
    checker.visit(null, n, parent);
    // No assertion of state, just doesn't throw
  }

  @Test
  public void testLiveRangeCheckerVisitNonName() {
    LiveRangeChecker checker = new LiveRangeChecker(null, null);
    Node n = new Node(Token.ADD);
    checker.visit(null, n, null);
    // No exception
  }

  @Test
  public void testLiveRangeCheckerVisitWithUse() {
    Var def = new Var(null, null, null, 0);
    Var use = new Var(null, null, null, 0);
    LiveRangeChecker checker = new LiveRangeChecker(def, use);
    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.NAME);  // not LP, not VAR
    checker.visit(null, n, parent);
    // No exception
  }

  @Test
  public void testEnterExitScopeWorkflow() {
    Node root = new Node(Token.ROOT);
    NodeTraversal t = new NodeTraversal(compiler, root);
    Scope scope = new Scope(root, Compiler.RESERVED);
    t.setScope(scope);
    t.setControlFlowGraph(new ControlFlowGraph<>(new Node(Token.ROOT)));
    coalesceVariableNames.enterScope(t);
    coalesceVariableNames.exitScope(t);
    // No exception
  }

  private static class TestGraphColoring extends GraphColoring<Var, Void> {
    TestGraphColoring() {
      super(new LinkedUndirectedGraph<Var, Void>(), null);
    }

    @Override
    public void color() {}

    @Override
    public Var getPartitionSuperNode(Var node) {
      return null;
    }

    @Override
    public void validate() {}

    @Override
    public boolean isOptimimal() {
      return true;
    }

    @Override
    public Var createNode(Var value) {
      return value;
    }

    @Override
    public DiGraphNode<Var, Void> getGraphNode(Var n) {
      return null;
    }
  }
}