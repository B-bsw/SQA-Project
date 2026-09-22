package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnreachableCodeEliminationTest {
  private UnreachableCodeElimination eliminator;
  private AbstractCompiler compiler;
  private Node root;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    eliminator = new UnreachableCodeElimination(compiler, true);
  }

  @Test
  public void testProcessNullRoot() {
    eliminator.process(null, null);
    // Should not throw exception
  }

  @Test
  public void testVisitParentNull() {
    Node n = new Node(Token.EXPR_RESULT);
    eliminator.visit(null, n, null);
    // No-op, no exception
  }

  @Test
  public void testVisitFunctionNode() {
    Node n = new Node(Token.FUNCTION);
    Node parent = new Node(Token.BLOCK);
    eliminator.visit(null, n, parent);
    // No-op
  }

  @Test
  public void testVisitScriptNode() {
    Node n = new Node(Token.SCRIPT);
    Node parent = new Node(Token.BLOCK);
    eliminator.visit(null, n, parent);
    // No-op
  }

  @Test
  public void testVisitNodeNotInCfg() {
    Node n = new Node(Token.EXPR_RESULT);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    // No CFG setup - getDirectedGraphNode returns null
    eliminator.visit(null, n, parent);
    // Should return safely
  }

  @Test
  public void testVisitReachableNode() {
    Node n = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(n);
    // Force gNode null path
    eliminator.visit(null, n, parent);
  }

  @Test
  public void testTryRemoveUnconditionalBranchingNullNode() {
    Node result = eliminator.tryRemoveUnconditionalBranching(null);
    assertNull(result);
  }

  @Test
  public void testTryRemoveUnconditionalBranchingNoParent() {
    Node n = new Node(Token.BREAK);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(n);
    // Test with node not in CFG
    Node result = eliminator.tryRemoveUnconditionalBranching(n);
    assertEquals(n, result);
  }

  @Test
  public void testRemoveDeadExprStatementSafelyEmptyNode() {
    Node n = new Node(Token.EMPTY);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // No exception
  }

  @Test
  public void testRemoveDeadExprStatementSafelyBlockNoChildren() {
    Node n = new Node(Token.BLOCK);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // No exception
  }

  @Test
  public void testRemoveDeadExprStatementSafelyDoNode() {
    Node n = new Node(Token.DO);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // No exception
  }

  @Test
  public void testRemoveDeadExprStatementSafelyBlockInTry() {
    Node n = new Node(Token.BLOCK);
    Node parent = new Node(Token.TRY);
    parent.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // No exception
  }

  @Test
  public void testRemoveDeadExprStatementSafelyCatch() {
    Node n = new Node(Token.CATCH);
    Node parent = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY);
    parent.addChildToBack(tryNode);
    tryNode.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // No exception
  }

  @Test
  public void testRemoveDeadExprStatementSafelyNormal() {
    Node n = new Node(Token.EXPR_RESULT);
    n.addChildToFront(Node.newString(Token.NAME, "x"));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    eliminator.removeDeadExprStatementSafely(n);
    // Check that code change was reported
    assertTrue(((TestCompiler) compiler).codeChanged);
  }

  @Test
  public void testTryRemoveUnconditionalBranchingWithBlockChild() {
    Node n = new Node(Token.BLOCK);
    n.addChildToFront(new Node(Token.EXPR_RESULT));
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(null);
    eliminator.curCfg = cfg;
    Node result = eliminator.tryRemoveUnconditionalBranching(n);
    assertNotNull(result);
  }

  @Test
  public void testTryRemoveUnconditionalBranchingWithSingleEdge() {
    Node n = new Node(Token.BREAK);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(null);
    eliminator.curCfg = cfg;
    // Create a destination node
    Node destNode = new Node(Token.EMPTY);
    DiGraphNode<Node, Branch> gNode = cfg.createNode(n);
    DiGraphNode<Node, Branch> gDest = cfg.createNode(destNode);
    cfg.connect(gNode, Branch.UNCOND, gDest);
    Node result = eliminator.tryRemoveUnconditionalBranching(n);
    assertEquals(n, result);
  }

  @Test
  public void testVisitWithReachableNode() {
    Node n = new Node(Token.EXPR_RESULT);
    n.addChildToFront(Node.newString(Token.NAME, "x"));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(null);
    eliminator.curCfg = cfg;
    DiGraphNode<Node, Branch> gNode = cfg.createNode(n);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    eliminator.visit(null, n, parent);
  }

  @Test
  public void testVisitWithUnreachableNode() {
    Node n = new Node(Token.EXPR_RESULT);
    n.addChildToFront(Node.newString(Token.NAME, "x"));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(null);
    eliminator.curCfg = cfg;
    DiGraphNode<Node, Branch> gNode = cfg.createNode(n);
    gNode.setAnnotation(GraphReachability.UNREACHABLE);
    eliminator.visit(null, n, parent);
  }

  @Test
  public void testVisitWithNoSideEffectsRemoval() {
    Node n = new Node(Token.EXPR_RESULT);
    n.addChildToFront(Node.newString(Token.STRING, "test"));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(n);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(null);
    eliminator.curCfg = cfg;
    DiGraphNode<Node, Branch> gNode = cfg.createNode(n);
    gNode.setAnnotation(GraphReachability.REACHABLE);
    eliminator.visit(null, n, parent);
    assertTrue(((TestCompiler) compiler).codeChanged);
  }

  @Test
  public void testEnterExitScope() {
    NodeTraversal t = null;
    eliminator.enterScope(t);
    eliminator.exitScope(t);
    // Should not throw
  }

  @Test
  public void testProcess() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    eliminator.process(externs, root);
    // Should not throw
  }

  private static class TestCompiler extends AbstractCompiler {
    boolean codeChanged = false;

    @Override
    public void reportCodeChange() {
      codeChanged = true;
    }

    @Override
    public String getSourceFile() {
      return null;
    }

    @Override
    public void reportError(JSError error) {
      // No-op
    }

    @Override
    public void reportWarning(JSError warning) {
      // No-op
    }

    @Override
    public Node getRoot() {
      return null;
    }

    @Override
    public void setRoot(Node root) {
      // No-op
    }
  }
}