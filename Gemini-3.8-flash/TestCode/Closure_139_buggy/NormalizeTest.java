package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class NormalizeTest {

  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @Test
  public void testProcess() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
  }

  @Test
  public void testPropogateConstantAnnotations() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    Normalize.PropogateConstantAnnotations prop = new Normalize.PropogateConstantAnnotations(compiler, false);
    prop.process(externs, root);
  }

  @Test
  public void testVerifyConstants() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    Normalize.VerifyConstants verify = new Normalize.VerifyConstants(compiler, true);
    verify.process(externs, root);
  }

  @Test
  public void testNormalizeStatementsShouldTraverse() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.WHILE);
    Node parent = new Node(Token.BLOCK);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    assertTrue(statements.shouldTraverse(t, n, parent));
  }

  @Test
  public void testDoStatementNormalizationsWithLabel() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.LABEL);
    Node parent = new Node(Token.BLOCK);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.doStatementNormalizations(t, n, parent);
  }

  @Test
  public void testNormalizeLabels() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.LABEL);
    Node last = new Node(Token.BLOCK);
    n.addChildToBack(last);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.normalizeLabels(n);
    assertNotNull(n.getLastChild());
    assertEquals(Token.BLOCK, n.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsWithLoop() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.LABEL);
    Node last = new Node(Token.FOR);
    n.addChildToBack(last);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.normalizeLabels(n);
    assertNotNull(n.getLastChild());
  }

  @Test
  public void testDuplicatedAnnotationCheck() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    Normalize.VerifyConstants verify = new Normalize.VerifyConstants(compiler, true);
    verify.process(externs, root);
  }

  @Test
  public void testNormalizeStatementsWithForIn() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.VAR);
    Node parent = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR);
    parent.addChildToBack(forNode);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.doStatementNormalizations(t, n, parent);
  }

  @Test
  public void testMoveNamedFunctions() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node block = new Node(Token.BLOCK);
    Node function = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "f");
    function.addChildToBack(name);
    block.addChildToBack(function);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.moveNamedFunctions(block);
  }

  @Test
  public void testExtractForInitializer() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    Node expr = new Node(Token.EXPR_RESULT);
    Node child = new Node(Token.EMPTY);
    init.addChildToBack(child);
    forNode.addChildToBack(init);
    forNode.addChildToBack(expr);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.extractForInitializer(forNode, null, null);
  }

  @Test
  public void testAddToFront() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node parent = new Node(Token.BLOCK);
    Node newChild = new Node(Token.EMPTY);
    Node after = new Node(Token.EMPTY);
    parent.addChildToBack(after);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    Node result = statements.addToFront(parent, newChild, after);
    assertNotNull(result);
    assertEquals(parent.getFirstChild(), newChild);
  }

  @Test
  public void testSplitVarDeclarations() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node block = new Node(Token.BLOCK);
    Node var = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "a");
    Node value1 = Node.newNumber(0);
    name1.addChildToBack(value1);
    Node name2 = Node.newString(Token.NAME, "b");
    var.addChildToBack(name1);
    var.addChildToBack(name2);
    block.addChildToBack(var);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    statements.splitVarDeclarations(block);
  }

  @Test
  public void testRemoveDuplicateDeclarations() {
    Node root = new Node(Token.BLOCK);
    Node name = Node.newString(Token.NAME, "a");
    name.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    root.addChildToBack(name);
    Normalize normalize = new Normalize(compiler, false);
    normalize.removeDuplicateDeclarations(root);
  }

  @Test
  public void testDuplicateDeclarationHandler() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = Node.newString(Token.NAME, "a");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(n);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    Normalize.DuplicateDeclarationHandler handler = statements.new DuplicateDeclarationHandler();
    handler.onRedeclaration(n, parent, n.getString());
  }

  @Test
  public void testVisitConstNameCase() {
    Node n = Node.newString(Token.NAME, "a");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Normalize.PropogateConstantAnnotations prop = new Normalize.PropogateConstantAnnotations(compiler, false);
    prop.visit(null, n, null);
  }

  @Test
  public void testVisitNonConstNameCase() {
    Node n = Node.newString(Token.NAME, "a");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    Normalize.PropogateConstantAnnotations prop = new Normalize.PropogateConstantAnnotations(compiler, false);
    prop.visit(null, n, null);
  }

  @Test
  public void testVisitNameWithJSDocConstant() {
    Node n = Node.newString(Token.NAME, "x");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    Normalize.PropogateConstantAnnotations prop = new Normalize.PropogateConstantAnnotations(compiler, false);
    prop.visit(null, n, null);
  }

  @Test
  public void testShouldTraverseWithFunction() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    Node n = new Node(Token.FUNCTION);
    Node parent = new Node(Token.BLOCK);
    Normalize.NormalizeStatements statements = new Normalize.NormalizeStatements(compiler, false);
    assertTrue(statements.shouldTraverse(t, n, parent));
  }

  @Test
  public void testExitScopeTickling() {
    Normalize.ScopeTicklingCallback callback = new Normalize().new ScopeTicklingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);
    callback.exitScope(t);
  }

  @Test
  public void testEnterScopeTickling() {
    Normalize.ScopeTicklingCallback callback = new Normalize().new ScopeTicklingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);
    callback.enterScope(t);
  }
}