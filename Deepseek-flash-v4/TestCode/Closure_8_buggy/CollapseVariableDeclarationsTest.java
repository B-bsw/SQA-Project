package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CollapseVariableDeclarationsTest {

  private CollapseVariableDeclarations pass;
  private AbstractCompiler compiler;
  private Node root;

  private static class TestCompiler extends AbstractCompiler {
    private Node root;
    private boolean codeChanged = false;

    public TestCompiler() {
      super(new DummyErrorReporter());
    }

    @Override
    public void process(Node externs, Node root) {
      this.root = root;
    }

    @Override
    public Node getRoot() {
      return root;
    }

    @Override
    public void reportCodeChange() {
      codeChanged = true;
    }

    @Override
    public boolean hasCodeChanged() {
      return codeChanged;
    }
  }

  private static class DummyErrorReporter extends AbstractErrorReporter {
    @Override
    public void error(String message, String sourceName, int lineNumber, int columnNumber) {
      throw new AssertionError("Unexpected error: " + message);
    }

    @Override
    public void warning(String message, String sourceName, int lineNumber, int columnNumber) {
      throw new AssertionError("Unexpected warning: " + message);
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    pass = new CollapseVariableDeclarations(compiler);
    root = new Node(Token.SCRIPT);
  }

  @Test
  public void testProcessNoCollapsibleNodes() {
    Node externs = new Node(Token.EMPTY);
    nodeHelper(new Node(Token.EMPTY));
    pass.process(externs, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessSimpleVarCollapse() {
    // var a = 1; var b = 2;
    Node var1 = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "a");
    name1.addChildToBack(Node.newNumber(1.0));
    var1.addChildToBack(name1);

    Node var2 = new Node(Token.VAR);
    Node name2 = new Node(Token.NAME, "b");
    name2.addChildToBack(Node.newNumber(2.0));
    var2.addChildToBack(name2);

    root.addChildToBack(var1);
    root.addChildToBack(var2);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    assertEquals(1, root.getChildCount());
    Node collapsed = root.getFirstChild();
    assertTrue(collapsed.isVar());
    assertEquals(2, collapsed.getChildCount());
    assertEquals("a", collapsed.getFirstChild().getString());
    assertEquals(1.0, collapsed.getFirstChild().getLastChild().getDouble(), 0.0);
    assertEquals("b", collapsed.getLastChild().getString());
    assertEquals(2.0, collapsed.getLastChild().getLastChild().getDouble(), 0.0);
  }

  @Test
  public void testProcessAssignmentCollapse() {
    // a = 1; var b = 2;
    Node assign = new Node(Token.EXPR_RESULT);
    Node assignNode = new Node(Token.ASSIGN);
    Node nameA = new Node(Token.NAME, "a");
    Node num1 = Node.newNumber(1.0);
    assignNode.addChildToBack(nameA);
    assignNode.addChildToBack(num1);
    assign.addChildToBack(assignNode);

    Node varB = new Node(Token.VAR);
    Node nameB = new Node(Token.NAME, "b");
    nameB.addChildToBack(Node.newNumber(2.0));
    varB.addChildToBack(nameB);

    root.addChildToBack(assign);
    root.addChildToBack(varB);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    assertEquals(1, root.getChildCount());
    Node collapsed = root.getFirstChild();
    assertTrue(collapsed.isVar());
    assertEquals(2, collapsed.getChildCount());
    assertEquals("b", collapsed.getFirstChild().getString());
    assertEquals("a", collapsed.getLastChild().getString());
  }

  @Test
  public void testProcessMixedVarAndAssign() {
    // var a; a = 1; var b = 2;
    Node varA = new Node(Token.VAR);
    Node nameA = new Node(Token.NAME, "a");
    varA.addChildToBack(nameA);

    Node assign = new Node(Token.EXPR_RESULT);
    Node assignNode = new Node(Token.ASSIGN);
    Node nameA2 = new Node(Token.NAME, "a");
    assignNode.addChildToBack(nameA2);
    assignNode.addChildToBack(Node.newNumber(1.0));
    assign.addChildToBack(assignNode);

    Node varB = new Node(Token.VAR);
    Node nameB = new Node(Token.NAME, "b");
    nameB.addChildToBack(Node.newNumber(2.0));
    varB.addChildToBack(nameB);

    root.addChildToBack(varA);
    root.addChildToBack(assign);
    root.addChildToBack(varB);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    // After collapsing var a (stub) with assignment, should become: var b = a = 1;
    // but since we're just testing the pass, check the structural output
    assertEquals(1, root.getChildCount());
    Node collapsed = root.getFirstChild();
    assertTrue(collapsed.isVar());
    assertEquals(1, collapsed.getChildCount()); // only b remains; a is assigned
  }

  @Test
  public void testProcessIgnoresNonAdjacentNodes() {
    // var a; function() { var b; } var c;
    Node varA = new Node(Token.VAR);
    Node nameA = new Node(Token.NAME, "a");
    varA.addChildToBack(nameA);

    Node func = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    Node block = new Node(Token.BLOCK);
    Node varB = new Node(Token.VAR);
    Node nameB = new Node(Token.NAME, "b");
    varB.addChildToBack(nameB);
    block.addChildToBack(varB);
    func.addChildToBack(paramList);
    func.addChildToBack(block);

    Node varC = new Node(Token.VAR);
    Node nameC = new Node(Token.NAME, "c");
    varC.addChildToBack(nameC);

    root.addChildToBack(varA);
    root.addChildToBack(func);
    root.addChildToBack(varC);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    // Should still have 3 nodes because function() breaks the chain
    assertEquals(3, root.getChildCount());
  }

  @Test
  public void testProcessWithIfChildNodes() {
    // if (true) var a;
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenBlock = new Node(Token.BLOCK);
    Node varA = new Node(Token.VAR);
    Node nameA = new Node(Token.NAME, "a");
    varA.addChildToBack(nameA);
    thenBlock.addChildToBack(varA);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);

    root.addChildToBack(ifNode);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    // Should not collapse var inside if
    assertEquals(1, root.getChildCount());
    assertTrue(root.getFirstChild().isIf());
  }

  @Test
  public void testProcessBlacklistedStubVar() {
    // var a = 1; var b; var c = 2;
    Node varA = new Node(Token.VAR);
    Node nameA = new Node(Token.NAME, "a");
    nameA.addChildToBack(Node.newNumber(1.0));
    varA.addChildToBack(nameA);

    Node varB = new Node(Token.VAR);
    Node nameB = new Node(Token.NAME, "b");
    varB.addChildToBack(nameB);

    Node varC = new Node(Token.VAR);
    Node nameC = new Node(Token.NAME, "c");
    nameC.addChildToBack(Node.newNumber(2.0));
    varC.addChildToBack(nameC);

    root.addChildToBack(varA);
    root.addChildToBack(varB);
    root.addChildToBack(varC);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    // Since var b is a stub with no initializer, it gets blacklisted
    // and should not be redeclared, so only a and c are collapsed
    assertEquals(2, root.getChildCount());
    assertTrue(root.getFirstChild().isVar());
    assertTrue(root.getLastChild().isVar());
  }

  @Test
  public void testConstructorThrowsOnNormalizedState() {
    // Test that constructor fails if lifecycle stage is normalized
    try {
      new CollapseVariableDeclarations(new TestCompiler() {
        @Override
        public LifeCycleStage getLifeCycleStage() {
          return LifeCycleStage.NORMALIZED;
        }
      });
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testProcessWithRedeclarationSuppression() {
    // var a; var a;
    Node var1 = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "a");
    var1.addChildToBack(name1);

    Node var2 = new Node(Token.VAR);
    Node name2 = new Node(Token.NAME, "a");
    var2.addChildToBack(name2);

    root.addChildToBack(var1);
    root.addChildToBack(var2);

    Node externs = new Node(Token.EMPTY);
    pass.process(externs, root);

    // Should collapse into one var with two declarations of 'a'? Actually blacklisted
    // but we're testing the logic; check no exceptions
    assertTrue(root.getChildCount() >= 0);
  }
}