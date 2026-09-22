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

import java.util.List;

@RunWith(JUnit4.class)
public class CheckSideEffectsTest {

  private CheckSideEffects checkSideEffects;
  private AbstractCompiler compiler;
  private Node externsRoot;
  private Node mainRoot;

  @Before
  public void setUp() {
    compiler = new Compiler();
    externsRoot = new Node(Token.EMPTY);
    mainRoot = new Node(Token.EMPTY);
  }

  @Test
  public void testVisitEmptyNodeDoesNothing() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node empty = new Node(Token.EMPTY);
    compiler.getRoot().addChildToBack(empty);
    checkSideEffects.process(externsRoot, compiler.getRoot());
    // No exception, no change - just verifies it returns early
  }

  @Test
  public void testVisitCommaNodeDoesNothing() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node comma = new Node(Token.COMMA);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(comma);
    compiler.getRoot().addChildToBack(parent);
    checkSideEffects.process(externsRoot, compiler.getRoot());
  }

  @Test
  public void testVisitWithNullParentDoesNothing() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    checkSideEffects.visit(null, new Node(Token.NAME), null);
  }

  @Test
  public void testVisitExprResultReturnsEarly() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(exprResult);
    checkSideEffects.visit(null, exprResult, parent);
    assertEquals(0, compiler.getErrors().length);
  }

  @Test
  public void testVisitQualifiedNameWithJSDocReturnsEarly() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node name = new Node(Token.NAME, "qname");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(name);
    name.setJSDocInfo(new JSDocInfoBuilder(false).build());
    checkSideEffects.visit(null, name, parent);
    assertEquals(0, compiler.getErrors().length);
  }

  @Test
  public void testVisitStringResultUsed() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node stringNode = new Node(Token.STRING, "test");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(stringNode);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(exprResult);
    mainRoot.addChildToBack(block);
    checkSideEffects.process(externsRoot, mainRoot);
    assertEquals(0, compiler.getErrors().length);
  }

  @Test
  public void testVisitStringResultUnusedReportsError() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node stringNode = new Node(Token.STRING, "test");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(stringNode);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(exprResult);
    mainRoot.addChildToBack(block);
    checkSideEffects.process(externsRoot, mainRoot);
    CheckLevel level = compiler.getLevel();
    assertEquals(CheckLevel.WARNING, level);
  }

  @Test
  public void testVisitSimpleOpUnusedReportsError() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    Node add = new Node(Token.ADD);
    Node name1 = new Node(Token.NAME, "a");
    Node name2 = new Node(Token.NAME, "b");
    add.addChildToBack(name1);
    add.addChildToBack(name2);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(add);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(exprResult);
    mainRoot.addChildToBack(block);
    checkSideEffects.process(externsRoot, mainRoot);
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testProtectSideEffectsWhenEnabled() {
    checkSideEffects = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    Node nameNode = new Node(Token.NAME, "foo");
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(nameNode);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(exprResult);
    mainRoot.addChildToBack(block);
    checkSideEffects.process(externsRoot, mainRoot);
    // Check that a protector function call was added
    List<Node> children = mainRoot.getChildren();
    boolean foundProtector = false;
    for (Node child : children) {
      if (child.isCall()) {
        Node target = child.getFirstChild();
        if (target.isName() && target.getString().equals(CheckSideEffects.PROTECTOR_FN)) {
          foundProtector = true;
          break;
        }
      }
    }
    assertTrue("Expected protector function call", foundProtector);
  }

  @Test
  public void testStripProtection() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    Node call = new Node(Token.CALL);
    Node name = new Node(Token.NAME, "JSCOMPILER_PRESERVE");
    call.addChildToBack(name);
    Node arg = new Node(Token.NAME, "x");
    call.addChildToBack(arg);
    root.addChildToBack(call);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(null, root);
    // After stripping, the call should be replaced by its argument
    assertEquals(1, root.getChildCount());
    Node replacement = root.getFirstChild();
    assertEquals(Token.NAME, replacement.getType());
    assertEquals("x", replacement.getString());
  }
}