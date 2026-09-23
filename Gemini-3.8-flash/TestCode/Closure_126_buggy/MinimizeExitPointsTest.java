package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MinimizeExitPointsTest {

  private AbstractCompiler compiler;
  private MinimizeExitPoints minimizeExitPoints;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    minimizeExitPoints = new MinimizeExitPoints(compiler);
  }

  @Test
  public void testProcessWithLabeledBreak() {
    Node root = IR.block();
    Node label = IR.label(IR.name("outer"), IR.block(IR.breakNode()));
    root.addChildToBack(label);
    minimizeExitPoints.process(null, root);
    assertFalse(label.hasChildren());
  }

  @Test
  public void testProcessWithWhileAndContinue() {
    Node root = IR.block();
    Node whileNode = IR.whileNode(IR.trueNode(), IR.block(IR.continueNode()));
    root.addChildToBack(whileNode);
    minimizeExitPoints.process(null, root);
    assertEquals(Token.EMPTY, whileNode.getChildAtIndex(1).getType());
  }

  @Test
  public void testProcessWithDoWhileFalseCondition() {
    Node root = IR.block();
    Node doNode = IR.doNode(IR.block(IR.breakNode()), IR.falseNode());
    root.addChildToBack(doNode);
    minimizeExitPoints.process(null, root);
    assertEquals(1, doNode.getChildCount());
  }

  @Test
  public void testProcessWithFunctionAndReturn() {
    Node root = IR.block();
    Node function = IR.function(IR.name("f"), IR.paramList(), IR.block(IR.returnNode()));
    root.addChildToBack(function);
    minimizeExitPoints.process(null, root);
    assertEquals(Token.EMPTY, function.getLastChild().getType());
  }

  @Test
  public void testTryMinimizeExitsWithSimpleReturn() {
    Node block = IR.block();
    Node returnNode = IR.returnNode();
    block.addChildToBack(returnNode);
    minimizeExitPoints.tryMinimizeExits(block, Token.RETURN, null);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testTryMinimizeExitsWithIfElseReturn() {
    Node block = IR.block();
    Node ifNode = IR.ifNode(IR.trueNode(), IR.block(IR.returnNode()), IR.block(IR.empty()));
    block.addChildToBack(ifNode);
    minimizeExitPoints.tryMinimizeExits(block, Token.RETURN, null);
    assertEquals(1, block.getChildCount());
    assertTrue(block.getFirstChild().isIf());
  }

  @Test
  public void testTryMinimizeExitsWithLabeledBreak() {
    Node block = IR.block();
    Node label = IR.label(IR.name("outer"), IR.block(IR.breakNode(IR.name("outer"))));
    block.addChildToBack(label);
    minimizeExitPoints.tryMinimizeExits(block, Token.BREAK, "outer");
    assertFalse(label.getLastChild().hasChildren());
  }

  @Test
  public void testTryMinimizeExitsWithContinueInLoop() {
    Node block = IR.block();
    Node continueNode = IR.continueNode();
    block.addChildToBack(continueNode);
    minimizeExitPoints.tryMinimizeExits(block, Token.CONTINUE, null);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testTryMinimizeExitsWithNonMatchingExit() {
    Node block = IR.block();
    Node ifNode = IR.ifNode(IR.trueNode(), IR.block(IR.empty()));
    block.addChildToBack(ifNode);
    minimizeExitPoints.tryMinimizeExits(block, Token.RETURN, null);
    assertTrue(block.hasChildren());
  }

  @Test
  public void testTryMinimizeExitsWithEmptyBlock() {
    Node block = IR.block();
    minimizeExitPoints.tryMinimizeExits(block, Token.RETURN, null);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testTryMinimizeExitsWithTryCatch() {
    Node block = IR.block();
    Node tryNode = IR.tryNode(IR.block(IR.returnNode()), IR.catchNode(IR.name("e"), IR.block(IR.empty())), IR.block());
    block.addChildToBack(tryNode);
    minimizeExitPoints.tryMinimizeExits(block, Token.RETURN, null);
    assertFalse(tryNode.getFirstChild().hasChildren());
  }

  @Test
  public void testMatchingExitNodeReturnWithChildren() {
    Node returnNode = IR.returnNode(IR.name("x"));
    assertFalse(minimizeExitPoints.matchingExitNode(returnNode, Token.RETURN, null));
  }

  @Test
  public void testMatchingExitNodeReturnWithoutChildren() {
    Node returnNode = IR.returnNode();
    assertTrue(minimizeExitPoints.matchingExitNode(returnNode, Token.RETURN, null));
  }

  @Test
  public void testMatchingExitNodeLabeledBreakWithName() {
    Node breakNode = IR.breakNode(IR.name("outer"));
    assertTrue(minimizeExitPoints.matchingExitNode(breakNode, Token.BREAK, "outer"));
  }

  @Test
  public void testMatchingExitNodeLabeledBreakWithoutName() {
    Node breakNode = IR.breakNode();
    assertFalse(minimizeExitPoints.matchingExitNode(breakNode, Token.BREAK, "outer"));
  }

  @Test
  public void testMatchingExitNodeContinueWithoutName() {
    Node continueNode = IR.continueNode();
    assertTrue(minimizeExitPoints.matchingExitNode(continueNode, Token.CONTINUE, null));
  }

  @Test
  public void testMatchingExitNodeWrongType() {
    Node ifNode = IR.ifNode(IR.trueNode(), IR.block());
    assertFalse(minimizeExitPoints.matchingExitNode(ifNode, Token.RETURN, null));
  }

  @Test
  public void testMoveAllFollowingWithFunctionDeclaration() {
    Node srcParent = IR.block();
    Node destParent = IR.block();
    Node start = IR.empty();
    Node funcDecl = IR.function(IR.name("f"), IR.paramList(), IR.block());
    srcParent.addChildToBack(start);
    srcParent.addChildToBack(funcDecl);
    MinimizeExitPoints.moveAllFollowing(start, srcParent, destParent);
    assertEquals(2, destParent.getChildCount());
    assertTrue(destParent.getFirstChild().isFunction());
  }

  @Test
  public void testMoveAllFollowingWithNonFunction() {
    Node srcParent = IR.block();
    Node destParent = IR.block();
    Node start = IR.empty();
    Node expr = IR.exprResult(IR.name("x"));
    srcParent.addChildToBack(start);
    srcParent.addChildToBack(expr);
    MinimizeExitPoints.moveAllFollowing(start, srcParent, destParent);
    assertEquals(1, destParent.getChildCount());
    assertEquals(Token.EXPR_RESULT, destParent.getFirstChild().getType());
  }

  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void reportCodeChange() {
      // no-op
    }
  }
}