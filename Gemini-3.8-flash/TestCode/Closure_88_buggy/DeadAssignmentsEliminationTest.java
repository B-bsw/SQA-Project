package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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

  private DeadAssignmentsElimination deadAssignmentsElimination;
  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
  }

  @Test
  public void testIsVariableReadBeforeKill_readBeforeKill() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x");
  }

  @Test
  public void testIsVariableReadBeforeKill_readInSibling() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.READ,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_killInSibling() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.KILL,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testTryRemoveAssignment_deadVariable() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    deadAssignmentsElimination.tryRemoveAssignment(assign, exprRoot, null);
  }

  @Test
  public void testTryRemoveAssignment_deadVariableWithRead() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    deadAssignmentsElimination.tryRemoveAssignment(assign, exprRoot, null);
  }

  @Test
  public void testIsVariableReadBeforeKill_nullVariable() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.MAYBE_LIVE,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "y"));
  }

  @Test
  public void testIsVariableReadBeforeKill_rhsRead() {
    Node name = Node.newString(Token.NAME, "x");
    Node rhs = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, rhs);
    Node exprRoot = assign;
    assertEquals(VariableLiveness.READ,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_lhsRead() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.KILL,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_noReference() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.MAYBE_LIVE,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "z"));
  }

  @Test
  public void testIsVariableReadBeforeKill_nestedExpression() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node add = new Node(Token.ADD, assign, Node.newString(Token.NAME, "x"));
    Node exprRoot = add;
    assertEquals(VariableLiveness.READ,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_nestedExpressionKill() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node add = new Node(Token.ADD, Node.newString(Token.NAME, "x"), assign);
    Node exprRoot = add;
    assertEquals(VariableLiveness.KILL,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_multipleSiblings() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    Node read = Node.newString(Token.NAME, "x");
    Node add = new Node(Token.ADD, assign, read);
    Node exprRoot = add;
    assertEquals(VariableLiveness.READ,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "x"));
  }

  @Test
  public void testProcess_nullExterns() {
    try {
      deadAssignmentsElimination.process(null, new Node(Token.SCRIPT));
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testProcess_nullRoot() {
    try {
      deadAssignmentsElimination.process(new Node(Token.SCRIPT), null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testTryRemoveAssignment_incDecExpression() {
    Node name = Node.newString(Token.NAME, "x");
    Node inc = new Node(Token.INC, name);
    Node exprRoot = inc;
    deadAssignmentsElimination.tryRemoveAssignment(inc, exprRoot, null);
  }

  @Test
  public void testIsVariableReadBeforeKill_emptyExpression() {
    Node name = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
    assertEquals(VariableLiveness.MAYBE_LIVE,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, assign, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_incDec() {
    Node name = Node.newString(Token.NAME, "x");
    Node inc = new Node(Token.INC, name);
    Node name2 = Node.newString(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN, name2, inc);
    assertEquals(VariableLiveness.READ,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, assign, "x"));
  }

  @Test
  public void testIsVariableReadBeforeKill_assignLhsIsNotName() {
    Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("prop"));
    Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
    Node exprRoot = assign;
    assertEquals(VariableLiveness.MAYBE_LIVE,
        deadAssignmentsElimination.isVariableReadBeforeKill(assign, exprRoot, "a"));
  }

  private static class TestCompiler extends AbstractCompiler {
    @Override
    protected CompilerOptions newCompilerOptions() {
      return new CompilerOptions();
    }
  }
}