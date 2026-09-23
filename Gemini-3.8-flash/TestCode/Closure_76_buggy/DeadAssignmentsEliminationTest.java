package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.DeadAssignmentsElimination.VariableLiveness;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DeadAssignmentsEliminationTest {
  private DeadAssignmentsElimination eliminator;
  private AbstractCompiler compiler;

  private static class TestCompiler extends AbstractCompiler {
    private int changeCount = 0;

    @Override
    public void reportCodeChange() {
      changeCount++;
    }

    @Override
    public void reportChange() {
      reportCodeChange();
    }

    public int getChangeCount() {
      return changeCount;
    }
  }

  private static class TestNode extends Node {
    public TestNode(int type) { super(type); }
    public TestNode(int type, Node child) { super(type, child); }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    eliminator = new DeadAssignmentsElimination(compiler);
  }

  @Test
  public void testProcessNullExterns() {
    try {
      eliminator.process(null, new Node(Token.EMPTY));
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessNullRoot() {
    try {
      eliminator.process(new Node(Token.EMPTY), null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testGlobalScopeReturnsEarly() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "f");
    fnNode.addChildToFront(name);
    root.addChildToFront(fnNode);

    eliminator.process(externs, root);
  }

  @Test
  public void testEnterScopeWithGlobalScope() {
    NodeTraversal t = new NodeTraversal(compiler, new Node(Token.EMPTY));
    // Simulate global scope
    Scope scope = new Scope(null, null);
    eliminator.enterScope(t);
  }

  @Test
  public void testTryRemoveAssignmentWithNonAssignment() {
    Node rhs = new Node(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, rhs);
    Node exprRoot = new Node(Token.EXPR_RESULT);
    FlowState<LiveVariableLattice> state = new FlowState<LiveVariableLattice>() {
      @Override
      public LiveVariableLattice getIn() { return new LiveVariableLattice(); }
      @Override
      public LiveVariableLattice getOut() { return new LiveVariableLattice(); }
      @Override
      public void setIn(LiveVariableLattice in) {}
      @Override
      public void setOut(LiveVariableLattice out) {}
      @Override
      public boolean isForward() { return true; }
      @Override
      public Iterable<DiGraphNode<Node, Branch>> getDeps() { return null; }
    };

    eliminator.tryRemoveAssignment(null, rhs, exprRoot, state);
  }

  @Test
  public void testTryRemoveAssignmentWithAssignmentOp() {
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NUMBER, "1");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Node parent = new Node(Token.EXPR_RESULT, assign);

    // Create a simple liveness state
    LiveVariableLattice in = new LiveVariableLattice();
    LiveVariableLattice out = new LiveVariableLattice();

    FlowState<LiveVariableLattice> state = new FlowState<LiveVariableLattice>() {
      @Override
      public LiveVariableLattice getIn() { return in; }
      @Override
      public LiveVariableLattice getOut() { return out; }
      @Override
      public void setIn(LiveVariableLattice in) {}
      @Override
      public void setOut(LiveVariableLattice out) {}
      @Override
      public boolean isForward() { return true; }
      @Override
      public Iterable<DiGraphNode<Node, Branch>> getDeps() { return null; }
    };

    eliminator.tryRemoveAssignment(null, assign, assign, state);
  }

  @Test
  public void testIsVariableReadBeforeKillWithSimpleName() {
    Node n = new Node(Token.NAME, "x");
    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(n, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithAssign() {
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NUMBER, "1");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(assign, variable);
    assertNotNull(result);
  }

  @Test
  public void testCheckHookBranchReadBeforeKillWithBothKill() {
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.NAME, "c");
    Node trueBranch = new Node(Token.NAME, "x");
    Node falseBranch = new Node(Token.NUMBER, "1");
    hook.addChildToBack(cond);
    hook.addChildToBack(trueBranch);
    hook.addChildToBack(falseBranch);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(hook, variable);
    assertNotNull(result);
  }

  @Test
  public void testCheckHookBranchReadBeforeKillWithBothRead() {
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.NAME, "c");
    Node trueBranch = new Node(Token.NAME, "x");
    Node falseBranch = new Node(Token.NAME, "x");
    hook.addChildToBack(cond);
    hook.addChildToBack(trueBranch);
    hook.addChildToBack(falseBranch);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(hook, variable);
    assertNotNull(result);
  }

  @Test
  public void testCheckHookBranchWithMixedStates() {
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.NAME, "c");
    Node trueBranch = new Node(Token.NAME, "x");
    Node falseBranch = new Node(Token.EMPTY);
    hook.addChildToBack(cond);
    hook.addChildToBack(trueBranch);
    hook.addChildToBack(falseBranch);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(hook, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithOrExpression() {
    Node or = new Node(Token.OR);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NUMBER, "1");
    or.addChildToBack(left);
    or.addChildToBack(right);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(or, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithAndExpression() {
    Node and = new Node(Token.AND);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NUMBER, "1");
    and.addChildToBack(left);
    and.addChildToBack(right);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(and, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithCommaExpression() {
    Node comma = new Node(Token.COMMA);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NUMBER, "1");
    comma.addChildToBack(left);
    comma.addChildToBack(right);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(comma, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithIncr() {
    Node incr = new Node(Token.INC);
    Node name = new Node(Token.NAME, "x");
    incr.addChildToBack(name);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(incr, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithDecr() {
    Node decr = new Node(Token.DEC);
    Node name = new Node(Token.NAME, "x");
    decr.addChildToBack(name);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(decr, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithNestedExpression() {
    Node add = new Node(Token.ADD);
    Node left = new Node(Token.NAME, "x");
    Node right = new Node(Token.NUMBER, "1");
    add.addChildToBack(left);
    add.addChildToBack(right);

    Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "y"), add);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(assign, variable);
    assertNotNull(result);
  }

  @Test
  public void testIsVariableReadBeforeKillWithFunctionCall() {
    Node fnName = new Node(Token.NAME, "f");
    Node fnExpr = new Node(Token.FUNCTION, fnName);
    Node arg = new Node(Token.NAME, "x");
    Node call = new Node(Token.CALL, fnExpr, arg);

    String variable = "x";
    eliminator.scope = new Scope(null, null);
    VariableLiveness result = eliminator.isVariableReadBeforeKill(call, variable);
    assertNotNull(result);
  }

  @Test
  public void testEnterScopeWithInnerFunction() {
    Node function = new Node(Token.FUNCTION);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(new Node(Token.NAME));
    function.addChildToBack(block);

    eliminator.enterScope(null);
  }

  @Test
  public void testTryRemoveAssignmentWithIncExpression() {
    Node inc = new Node(Token.INC);
    Node name = new Node(Token.NAME, "x");
    inc.addChildToBack(name);
    Node parent = new Node(Token.EXPR_RESULT, inc);

    LiveVariableLattice in = new LiveVariableLattice();
    LiveVariableLattice out = new LiveVariableLattice();

    FlowState<LiveVariableLattice> state = new FlowState<LiveVariableLattice>() {
      @Override
      public LiveVariableLattice getIn() { return in; }
      @Override
      public LiveVariableLattice getOut() { return out; }
      @Override
      public void setIn(LiveVariableLattice in) {}
      @Override
      public void setOut(LiveVariableLattice out) {}
      @Override
      public boolean isForward() { return true; }
      @Override
      public Iterable<DiGraphNode<Node, Branch>> getDeps() { return null; }
    };

    eliminator.tryRemoveAssignment(null, inc, inc, state);
  }
}