package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;

public class CheckGlobalThisTest {

  private MockCompiler compiler;
  private NodeTraversal traversal;
  private CheckGlobalThis callback;

  private static class MockCompiler extends AbstractCompiler {
    private final List<JSError> reportedErrors = new ArrayList<JSError>();

    public void report(JSError error) {
      reportedErrors.add(error);
    }

    public List<JSError> getReportedErrors() {
      return reportedErrors;
    }

    // Minimal dummy implementations to satisfy AbstractCompiler abstract methods
    public CompilerOptions getOptions() {
      return null;
    }

    public void setNormalized() {
    }

    public boolean isNormalized() {
      return false;
    }

    public void setLifeCycleStage(LifeCycleStage stage) {
    }

    public LifeCycleStage getLifeCycleStage() {
      return null;
    }

    public Node parseSyntheticCode(String js) {
      return null;
    }

    public Node parseSyntheticCode(String fileName, String js) {
      return null;
    }

    public Node parseTestCode(String js) {
      return null;
    }

    public void setErrorInterface(ErrorReporter errorReporter) {
    }

    public ErrorReporter getErrorReporter() {
      return null;
    }

    public Scope getTopScope() {
      return null;
    }

    public CodingConvention getCodingConvention() {
      return new DefaultCodingConvention();
    }

    public void reportCodeChange() {
    }

    public boolean hasHaltingErrors() {
      return false;
    }
  }

  @Before
  public void setUp() {
    compiler = new MockCompiler();
    callback = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    traversal = new NodeTraversal(compiler, callback);
  }

  @Test
  public void shouldTraverse_givenFunctionWithConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.markAsConstructor();
    fnNode.setJSDocInfo(docInfo);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, null);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithThisTypeJsDoc_shouldReturnFalse() {
    // Arrange
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.setThisType(new Node(Token.NAME, "MyType"));
    fnNode.setJSDocInfo(docInfo);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, null);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithoutJsDoc_shouldReturnTrue() {
    // Arrange
    Node scriptNode = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    scriptNode.addChildToFront(fnNode);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, scriptNode);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenAssignLhsChild_shouldSetAssignLhsChildAndReturnTrue() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NUMBER);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    // Act
    boolean result = callback.shouldTraverse(traversal, lhs, assignNode);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenAssignLhsChildAlreadySet_shouldNotOverrideAssignLhsChild() {
    // Arrange
    Node outerAssign = new Node(Token.ASSIGN);
    Node innerAssign = new Node(Token.ASSIGN);
    Node rhsOuter = new Node(Token.NAME, "c");
    outerAssign.addChildToBack(innerAssign);
    outerAssign.addChildToBack(rhsOuter);

    Node lhsInner = new Node(Token.NAME, "a");
    Node rhsInner = new Node(Token.THIS);
    innerAssign.addChildToBack(lhsInner);
    innerAssign.addChildToBack(rhsInner);

    // Act
    boolean outerRes = callback.shouldTraverse(traversal, innerAssign, outerAssign);
    boolean innerRes = callback.shouldTraverse(traversal, lhsInner, innerAssign);

    // Assert
    Assert.assertTrue(outerRes);
    Assert.assertTrue(innerRes);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithPrototypeLastChild_shouldReturnFalse() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.GETPROP);
    Node objNode = new Node(Token.NAME, "Foo");
    Node propNode = Node.newString("prototype");
    lhs.addChildToBack(objNode);
    lhs.addChildToBack(propNode);

    Node rhs = new Node(Token.FUNCTION);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    // Act
    boolean result = callback.shouldTraverse(traversal, rhs, assignNode);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithQualifiedPrototypeSubproperty_shouldReturnFalse() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node foo = new Node(Token.NAME, "Foo");
    Node proto = Node.newString("prototype");
    Node fooProto = new Node(Token.GETPROP, foo, proto);
    Node bar = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, fooProto, bar);

    Node rhs = new Node(Token.FUNCTION);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    // Act
    boolean result = callback.shouldTraverse(traversal, rhs, assignNode);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithoutPrototypeInLhs_shouldReturnTrue() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node foo = new Node(Token.NAME, "Foo");
    Node bar = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, foo, bar);

    Node rhs = new Node(Token.FUNCTION);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    // Act
    boolean result = callback.shouldTraverse(traversal, rhs, assignNode);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWhenLhsIsNotGetProp_shouldReturnTrue() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.FUNCTION);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    // Act
    boolean result = callback.shouldTraverse(traversal, rhs, assignNode);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void visit_givenThisUnderAssignLhsChild_shouldReportErrorAndResetAssignLhsChild() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.THIS);
    Node rhs = new Node(Token.NUMBER);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    callback.shouldTraverse(traversal, lhs, assignNode);

    // Act
    callback.visit(traversal, lhs, assignNode);

    // Assert
    Assert.assertEquals(1, compiler.getReportedErrors().size());
    JSError error = compiler.getReportedErrors().get(0);
    Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, error.getType());

    // Verify assignLhsChild was reset to null
    Node anotherThis = new Node(Token.THIS);
    callback.visit(traversal, anotherThis, null);
    Assert.assertEquals(1, compiler.getReportedErrors().size());
  }

  @Test
  public void visit_givenThisWithoutAssignLhsChild_shouldNotReportError() {
    // Arrange
    Node thisNode = new Node(Token.THIS);

    // Act
    callback.visit(traversal, thisNode, null);

    // Assert
    Assert.assertEquals(0, compiler.getReportedErrors().size());
  }

  @Test
  public void visit_givenNonThisNodeMatchingAssignLhsChild_shouldClearAssignLhsChild() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NUMBER);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(rhs);

    callback.shouldTraverse(traversal, lhs, assignNode);

    // Act
    callback.visit(traversal, lhs, assignNode);

    // Assert
    Node thisNode = new Node(Token.THIS);
    callback.visit(traversal, thisNode, null);
    Assert.assertEquals(0, compiler.getReportedErrors().size());
  }

  @Test
  public void shouldTraverse_givenFunctionParentIsNameWithConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node nameNode = new Node(Token.NAME, "Foo");
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.markAsConstructor();
    nameNode.setJSDocInfo(docInfo);

    Node fnNode = new Node(Token.FUNCTION);
    nameNode.addChildToBack(fnNode);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, nameNode);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionParentIsAssignWithConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node assignNode = new Node(Token.ASSIGN);
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.markAsConstructor();
    assignNode.setJSDocInfo(docInfo);

    Node lhs = new Node(Token.NAME, "Foo");
    Node fnNode = new Node(Token.FUNCTION);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(fnNode);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, assignNode);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionGrandparentIsVarWithConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node varNode = new Node(Token.VAR);
    JSDocInfo docInfo = new JSDocInfo();
    docInfo.markAsConstructor();
    varNode.setJSDocInfo(docInfo);

    Node nameNode = new Node(Token.NAME, "Foo");
    varNode.addChildToBack(nameNode);

    Node fnNode = new Node(Token.FUNCTION);
    nameNode.addChildToBack(fnNode);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, nameNode);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionGrandparentNotVar_shouldReturnTrue() {
    // Arrange
    Node exprNode = new Node(Token.EXPR_RESULT);
    Node nameNode = new Node(Token.NAME, "Foo");
    exprNode.addChildToBack(nameNode);

    Node fnNode = new Node(Token.FUNCTION);
    nameNode.addChildToBack(fnNode);

    // Act
    boolean result = callback.shouldTraverse(traversal, fnNode, nameNode);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenNonFunctionAndNonAssign_shouldReturnTrue() {
    // Arrange
    Node n = new Node(Token.NUMBER);
    Node parent = new Node(Token.EXPR_RESULT);

    // Act
    boolean result = callback.shouldTraverse(traversal, n, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenNullParent_shouldReturnTrue() {
    // Arrange
    Node n = new Node(Token.NUMBER);

    // Act
    boolean result = callback.shouldTraverse(traversal, n, null);

    // Assert
    Assert.assertTrue(result);
  }
}