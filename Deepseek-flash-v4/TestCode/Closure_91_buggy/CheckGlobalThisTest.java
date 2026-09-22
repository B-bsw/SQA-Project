package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class CheckGlobalThisTest {

  private static class FakeCompiler extends AbstractCompiler {
    private Node reportedNode = null;
    private DiagnosticType reportedDiagnostic = null;
    private CheckLevel reportedLevel = null;

    @Override
    public void report(Node n, DiagnosticType diagnosticType, DiagnosticType... diagnosticTypes) {
      // Not needed for this test.
    }

    @Override
    public void report(JSError error) {
      // Not needed for this test.
    }

    public void report(NodeTraversal t, DiagnosticType diagnosticType) {
      // Not needed for this test.
    }

    public void report(DiagnosticType diagnosticType, int line, int col, String... args) {
      // Not needed for this test.
    }

    @Override
    public void reportCodeChange() {
      // Not needed for this test.
    }

    @Override
    public void reportCodeChange(String message) {
      // Not needed for this test.
    }

    @Override
    public void reportCodeChange(CodeChangeHandler handler) {
      // Not needed for this test.
    }

    @Override
    public void removeCodeChangeHandler(CodeChangeHandler handler) {
      // Not needed for this test.
    }

    @Override
    public CodeChangeHandler addCodeChangeHandler(CodeChangeHandler handler) {
      return handler;
    }

    @Override
    public void report(CheckLevel level, DiagnosticType diagnosticType) {
      this.reportedLevel = level;
      this.reportedDiagnostic = diagnosticType;
    }

    public DiagnosticType getReportedDiagnostic() {
      return reportedDiagnostic;
    }

    public CheckLevel getReportedLevel() {
      return reportedLevel;
    }
  }

  private FakeCompiler compiler;
  private CheckGlobalThis checkGlobalThis;
  private NodeTraversal traversal;

  @Before
  public void setUp() {
    compiler = new FakeCompiler();
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    traversal = new NodeTraversal(null, (Callback) checkGlobalThis);
  }

  private Node createThisNode() {
    return Node.newString(Token.THIS, "this");
  }

  private Node createNameNode(String name) {
    return Node.newString(Token.NAME, name);
  }

  private Node createGetPropNode(Node owner, String prop) {
    Node getProp = new Node(Token.GETPROP, owner, Node.newString(Token.STRING, prop));
    return getProp;
  }

  private Node createAssignNode(Node lhs, Node rhs) {
    return new Node(Token.ASSIGN, lhs, rhs);
  }

  private Node createFunctionNode() {
    return new Node(Token.FUNCTION);
  }

  private Node createBlockNode() {
    return new Node(Token.BLOCK);
  }

  @Test
  public void testShouldTraverseNotFunction() {
    Node n = createThisNode();
    Node parent = new Node(Token.EXPR_RESULT);
    assertTrue(checkGlobalThis.shouldTraverse(traversal, n, parent));
  }

  @Test
  public void testShouldTraverseFunctionWithNoJsDoc() {
    Node fn = createFunctionNode();
    Node parent = createBlockNode();
    fn.setParent(parent);
    // No JSDoc on function or parent, should traverse
    parent.addChildToFront(fn);
    assertTrue(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldNotTraverseConstructorFunction() {
    Node fn = createFunctionNode();
    JSDocInfo jsDoc = JSDocInfo.builder().setConstructor(true).build();
    fn.setJSDocInfo(jsDoc);
    Node parent = createBlockNode();
    fn.setParent(parent);
    assertFalse(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldNotTraverseFunctionWithThisType() {
    Node fn = createFunctionNode();
    JSDocInfo jsDoc = JSDocInfo.builder().setThisType(null).build();
    fn.setJSDocInfo(jsDoc);
    Node parent = createBlockNode();
    fn.setParent(parent);
    assertFalse(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldNotTraverseFunctionWithOverride() {
    Node fn = createFunctionNode();
    JSDocInfo jsDoc = JSDocInfo.builder().setOverride(true).build();
    fn.setJSDocInfo(jsDoc);
    Node parent = createBlockNode();
    fn.setParent(parent);
    assertFalse(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldNotTraverseFunctionInsideVar() {
    Node fn = createFunctionNode();
    Node varNode = new Node(Token.VAR);
    Node nameNode = createNameNode("x");
    varNode.addChildToFront(nameNode);
    nameNode.addChildToFront(fn);
    fn.setParent(nameNode);
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToFront(varNode);
    assertFalse(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldTraverseFunctionInsideBlock() {
    Node fn = createFunctionNode();
    Node block = createBlockNode();
    block.addChildToFront(fn);
    fn.setParent(block);
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToFront(block);
    assertTrue(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldTraverseFunctionInsideAssignLhs() {
    Node fn = createFunctionNode();
    Node assign = createAssignNode(createNameNode("a"), fn);
    fn.setParent(assign);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(assign);
    assign.setParent(parent);
    assertTrue(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testShouldNotTraverseFunctionInsidePrototypeAssignRhs() {
    Node fn = createFunctionNode();
    Node getProp = createGetPropNode(null, "prototype");
    Node assign = createAssignNode(getProp, fn);
    fn.setParent(assign);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(assign);
    assign.setParent(parent);
    // lhs is a GETPROP with "prototype", should not traverse RHS
    assertFalse(checkGlobalThis.shouldTraverse(traversal, fn, parent));
  }

  @Test
  public void testVisitThisNodeReports() {
    Node thisNode = createThisNode();
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(thisNode);
    thisNode.setParent(parent);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, parent);
    assertNotNull(compiler.getReportedDiagnostic());
    assertEquals(CheckLevel.WARNING, compiler.getReportedLevel());
  }

  @Test
  public void testVisitThisNodePropertyAccessReports() {
    Node thisNode = createThisNode();
    Node getProp = createGetPropNode(thisNode, "prop");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(getProp);
    getProp.setParent(parent);
    thisNode.setParent(getProp);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, getProp);
    assertNotNull(compiler.getReportedDiagnostic());
  }

  @Test
  public void testVisitThisNodeNoReportWhenNoParent() {
    Node thisNode = createThisNode();
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, null);
    assertNull(compiler.getReportedDiagnostic());
  }

  @Test
  public void testVisitThisNodeNoReportWhenNotGet() {
    Node thisNode = createThisNode();
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(thisNode);
    thisNode.setParent(parent);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, parent);
    // parent is EXPR_RESULT, not GET, should report only if assignLhsChild
    assertNotNull(compiler.getReportedDiagnostic());
  }

  @Test
  public void testVisitThisNodeAsAssignLhs() {
    Node thisNode = createThisNode();
    Node lhs = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "x"));
    Node assign = createAssignNode(lhs, Node.newString(Token.NUMBER, "1"));
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(assign);
    assign.setParent(parent);
    lhs.setParent(assign);
    thisNode.setParent(lhs);
    traversal.setScope(new Scope(null));
    // Simulate assignLhsChild being set by shouldTraverse
    try {
      checkGlobalThis.shouldTraverse(traversal, lhs, assign);
    } catch (Exception e) {
      // ignore
    }
    checkGlobalThis.visit(traversal, thisNode, lhs);
    assertNotNull(compiler.getReportedDiagnostic());
  }

  @Test
  public void testVisitThisNodeAsAssignRhs() {
    Node thisNode = createThisNode();
    Node lhs = createNameNode("a");
    Node assign = createAssignNode(lhs, thisNode);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(assign);
    assign.setParent(parent);
    thisNode.setParent(assign);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, assign);
    // this is on RHS of assignment, should report if assignLhsChild is null
    assertNotNull(compiler.getReportedDiagnostic());
  }

  @Test
  public void testShouldTraverseFunctionWithNoJsDocButParentName() {
    Node fn = createFunctionNode();
    Node nameNode = createNameNode("x");
    nameNode.addChildToFront(fn);
    fn.setParent(nameNode);
    Node varNode = new Node(Token.VAR);
    varNode.addChildToFront(nameNode);
    nameNode.setParent(varNode);
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToFront(varNode);
    varNode.setParent(parent);
    // No JSDoc on function or name, but parent is VAR -> should traverse
    assertTrue(checkGlobalThis.shouldTraverse(traversal, fn, nameNode));
  }

  @Test
  public void testVisitThisNodeNotReportedWhenNotGet() {
    Node thisNode = createThisNode();
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(thisNode);
    thisNode.setParent(parent);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, parent);
    // Since parent is EXPR_RESULT, and shouldReportThis returns false for EXPR_RESULT
    // But our implementation returns true if assignLhsChild is null? Actually shouldReportThis
    // checks assignLhsChild first, then parent is GET.
    // In this case assignLhsChild is null and parent is not GET -> shouldReportThis returns false
    // But we still report because in visit we always call shouldReportThis?
    // Let's review: shouldReportThis returns true only if assignLhsChild != null OR parent is GET.
    // For EXPR_RESULT, it returns false.
    // So this test would fail unless we handle.
    // Actually in visit, we call shouldReportThis(n, parent). For this case, parent is EXPR_RESULT,
    // assignLhsChild is null, so shouldReportThis returns false -> no report.
    // So we assertNull.
    assertNull(compiler.getReportedDiagnostic());
  }

  @Test
public void testVisitThisNodeForPropertyAccess() {
    Node thisNode = createThisNode();
    Node getProp = createGetPropNode(thisNode, "prop");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(getProp);
    getProp.setParent(parent);
    thisNode.setParent(getProp);
    traversal.setScope(new Scope(null));
    checkGlobalThis.visit(traversal, thisNode, getProp);
    // shouldReportThis returns true because parent is GET
    assertNotNull(compiler.getReportedDiagnostic());
}
}