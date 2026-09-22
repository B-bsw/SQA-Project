package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckGlobalThisTest {

  private CheckGlobalThis checkGlobalThis;
  private AbstractCompiler compiler;
  private Node root;
  private Node functionNode;
  private Node thisNode;
  private Node assignNode;
  private Node getPropNode;

  @Before
  public void setUp() throws Exception {
    compiler = new TestCompiler();
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.ERROR);
    root = new Node(Token.SCRIPT);
    functionNode = new Node(Token.FUNCTION);
    thisNode = new Node(Token.THIS);
    assignNode = new Node(Token.ASSIGN);
    getPropNode = new Node(Token.GETPROP);
  }

  @Test
  public void testShouldTraverseSimpleFunction() {
    // Simple function declaration: function foo() {}
    Node parent = new Node(Token.BLOCK);
    functionNode.setJSDocInfo(null);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionWithConstructorJSDoc() {
    JSDocInfo jsDoc = new JSDocInfo();
    jsDoc.setConstructor(true);
    functionNode.setJSDocInfo(jsDoc);
    Node parent = new Node(Token.BLOCK);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionWithThisTypeJSDoc() {
    JSDocInfo jsDoc = new JSDocInfo();
    jsDoc.setThisType(Node.newString("this"));
    functionNode.setJSDocInfo(jsDoc);
    Node parent = new Node(Token.BLOCK);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionWithOverrideJSDoc() {
    JSDocInfo jsDoc = new JSDocInfo();
    jsDoc.setOverride(true);
    functionNode.setJSDocInfo(jsDoc);
    Node parent = new Node(Token.BLOCK);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, parent));
  }

  @Test
  public void testShouldTraverseFunctionInsideVar() {
    // var x = function() {};
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    nameNode.addChildToFront(functionNode);
    varNode.addChildToFront(nameNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, varNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideAssign() {
    // x = function() {};
    Node lhs = new Node(Token.NAME, "x");
    assignNode.addChildToFront(lhs);
    assignNode.addChildToFront(functionNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, assignNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideGetProp() {
    // a.b = function() {};
    Node a = new Node(Token.GETPROP);
    Node aFirst = new Node(Token.NAME, "a");
    Node aSecond = new Node(Token.STRING, "b");
    a.addChildToFront(aFirst);
    a.addChildToFront(aSecond);
    getPropNode.addChildToFront(functionNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, getPropNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideGetPropWithPrototype() {
    // a.protoype.method = function() {};
    Node a = new Node(Token.GETPROP);
    Node aFirst = new Node(Token.NAME, "a");
    Node aSecond = new Node(Token.STRING, "prototype");
    a.addChildToFront(aFirst);
    a.addChildToFront(aSecond);
    Node methodProp = new Node(Token.GETPROP);
    methodProp.addChildToFront(a);
    Node methodName = new Node(Token.STRING, "method");
    methodProp.addChildToFront(methodName);
    assignNode.addChildToFront(methodProp);
    assignNode.addChildToFront(functionNode);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, assignNode));
  }

  @Test
  public void testShouldTraverseWithinAssignLhs() {
    Node lhs = new Node(Token.NAME, "x");
    assignNode.addChildToFront(lhs);
    assignNode.addChildToFront(thisNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), thisNode, assignNode));
  }

  @Test
  public void testShouldTraverseWithinAssignRhs() {
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NAME, "y");
    assignNode.addChildToFront(lhs);
    assignNode.addChildToFront(rhs);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), rhs, assignNode));
  }

  @Test
  public void testShouldReportThisOnLeftSideOfAssign() {
    Node parent = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.THIS);
    parent.addChildToFront(lhs);
    // assignLhsChild should be set
    checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), lhs, parent);
    assertTrue(checkGlobalThis.visit(lhs, parent));
  }

  @Test
  public void testShouldReportThisWithGetProp() {
    Node parent = new Node(Token.GETPROP);
    parent.addChildToFront(thisNode);
    assertTrue(checkGlobalThis.visit(thisNode, parent));
  }

  @Test
  public void testShouldNotReportThisWithSimpleName() {
    Node parent = new Node(Token.NAME, "x");
    assertFalse(checkGlobalThis.visit(thisNode, parent));
  }

  @Test
  public void testShouldNotReportThisWhenAssignLhsChildNotSet() {
    Node parent = new Node(Token.ASSIGN);
    parent.addChildToFront(thisNode);
    assertFalse(checkGlobalThis.visit(thisNode, parent));
  }

  @Test
  public void testVisitClearsAssignLhsChild() {
    Node parent = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.THIS);
    parent.addChildToFront(lhs);
    checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), lhs, parent);
    checkGlobalThis.visit(lhs, parent);
    // After visit, assignLhsChild should be null, so this visit should not report
    assertFalse(checkGlobalThis.visit(lhs, parent));
  }

  @Test
  public void testShouldTraverseFunctionInsideGetPropWithSubprototype() {
    Node a = new Node(Token.GETPROP);
    Node aFirst = new Node(Token.NAME, "a");
    Node aSecond = new Node(Token.STRING, "prototype");
    a.addChildToFront(aFirst);
    a.addChildToFront(aSecond);
    Node subProp = new Node(Token.GETPROP);
    Node subFirst = new Node(Token.NAME, "b");
    Node subSecond = new Node(Token.STRING, "c");
    subProp.addChildToFront(subFirst);
    subProp.addChildToFront(subSecond);
    Node methodProp = new Node(Token.GETPROP);
    methodProp.addChildToFront(subProp);
    Node methodName = new Node(Token.STRING, "method");
    methodProp.addChildToFront(methodName);
    assignNode.addChildToFront(methodProp);
    assignNode.addChildToFront(functionNode);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, assignNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideGetPropWithSubprototypeAndNonGet() {
    Node a = new Node(Token.GETPROP);
    Node aFirst = new Node(Token.NAME, "a");
    Node aSecond = new Node(Token.STRING, "prototype");
    a.addChildToFront(aFirst);
    a.addChildToFront(aSecond);
    Node subProp = new Node(Token.GETPROP);
    Node subFirst = new Node(Token.NAME, "b");
    Node subSecond = new Node(Token.STRING, "c");
    subProp.addChildToFront(subFirst);
    subProp.addChildToFront(subSecond);
    Node methodProp = new Node(Token.GETPROP);
    methodProp.addChildToFront(subProp);
    Node methodName = new Node(Token.STRING, "method");
    methodProp.addChildToFront(methodName);
    assignNode.addChildToFront(methodProp);
    assignNode.addChildToFront(functionNode);
    assertFalse(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, assignNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideVarWithParentJSDoc() {
    Node varNode = new Node(Token.VAR);
    JSDocInfo varDoc = new JSDocInfo();
    varNode.setJSDocInfo(varDoc);
    Node nameNode = new Node(Token.NAME, "x");
    nameNode.addChildToFront(functionNode);
    varNode.addChildToFront(nameNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, varNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideAssignWithJSDoc() {
    Node assignDocNode = new Node(Token.ASSIGN);
    JSDocInfo assignDoc = new JSDocInfo();
    assignDocNode.setJSDocInfo(assignDoc);
    Node lhs = new Node(Token.NAME, "x");
    assignDocNode.addChildToFront(lhs);
    assignDocNode.addChildToFront(functionNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, assignDocNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideNameWithJSDoc() {
    Node nameNode = new Node(Token.NAME, "x");
    JSDocInfo nameDoc = new JSDocInfo();
    nameNode.setJSDocInfo(nameDoc);
    nameNode.addChildToFront(functionNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, nameNode));
  }

  @Test
  public void testShouldTraverseFunctionInsideVarWithJSDocOnFunction() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    JSDocInfo funcDoc = new JSDocInfo();
    functionNode.setJSDocInfo(funcDoc);
    nameNode.addChildToFront(functionNode);
    varNode.addChildToFront(nameNode);
    assertTrue(checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), functionNode, varNode));
  }

  @Test
  public void testVisitWithAssignLhsChildAndGetPropParent() {
    Node assign = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, "x");
    assign.addChildToFront(lhs);
    checkGlobalThis.shouldTraverse(new NodeTraversal(compiler), lhs, assign);
    Node getProp = new Node(Token.GETPROP);
    getProp.addChildToFront(new Node(Token.THIS));
    assertTrue(checkGlobalThis.visit(getProp.getFirstChild(), getProp));
  }
  
  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void report(CheckLevel level, DiagnosticType type, String... arguments) {}
  }
  
  private static class NodeTraversal {
    private final AbstractCompiler compiler;
    NodeTraversal(AbstractCompiler compiler) { this.compiler = compiler; }
    public Node makeError(Node n, CheckLevel level, DiagnosticType type) {
      return n;
    }
  }
  
  private abstract static class AbstractCompiler {
    public abstract void report(CheckLevel level, DiagnosticType type, String... arguments);
  }
}