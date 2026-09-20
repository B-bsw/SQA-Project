package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckGlobalThisTest {

  private RecordingCompiler compiler;
  private CheckGlobalThis checkGlobalThis;
  private NodeTraversal traversal;

  private static class RecordingCompiler extends Compiler {
    private final List<JSError> reportedErrors = new ArrayList<JSError>();

    @Override
    public void report(JSError error) {
      reportedErrors.add(error);
    }

    public List<JSError> getReportedErrors() {
      return reportedErrors;
    }

    public int getErrorCount() {
      return reportedErrors.size();
    }
  }

  @Before
  public void setUp() {
    compiler = new RecordingCompiler();
    checkGlobalThis = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    traversal = new NodeTraversal(compiler, checkGlobalThis);
  }

  private JSDocInfo createJsDoc(boolean isConstructor, boolean isInterface, boolean hasThisType, boolean isOverride) {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    if (isConstructor) {
      builder.recordConstructor();
    }
    if (isInterface) {
      builder.recordInterface();
    }
    if (hasThisType) {
      builder.recordThisType(new JSTypeExpression(new Node(Token.STAR), "test"));
    }
    if (isOverride) {
      builder.recordOverride();
    }
    return builder.build(new Node(Token.SCRIPT));
  }

  // =========================================================================
  // Happy Path & Branch Coverage: shouldTraverse with Function Nodes
  // =========================================================================

  @Test
  public void shouldTraverse_givenFunctionWithConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(true, false, false, false));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithInterfaceJsDoc_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(false, true, false, false));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithThisTypeJsDoc_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(false, false, true, false));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithOverrideJsDoc_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(false, false, false, true));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithPlainJsDoc_shouldProceedToParentCheck() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(false, false, false, false));
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithScriptParent_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.SCRIPT);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithNameParent_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = Node.newString(Token.NAME, "a");
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithAssignParent_shouldReturnTrue() {
    // Arrange
    Node lhs = Node.newString(Token.NAME, "foo");
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.ASSIGN, lhs, functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithStringKeyParent_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = Node.newString("prop");
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithNumberKeyParent_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = Node.newNumber(1.0);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithUnsupportedParentType_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.CALL);
    parent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  // =========================================================================
  // JSDoc Inheritance Cases: getFunctionJsDocInfo
  // =========================================================================

  @Test
  public void shouldTraverse_givenFunctionInheritingConstructorFromAssignParent_shouldReturnFalse() {
    // Arrange
    Node lhs = Node.newString(Token.NAME, "myFunc");
    Node functionNode = new Node(Token.FUNCTION);
    Node parent = new Node(Token.ASSIGN, lhs, functionNode);
    parent.setJSDocInfo(createJsDoc(true, false, false, false));

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, parent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionInheritingConstructorFromNameParent_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node nameParent = Node.newString(Token.NAME, "myFunc");
    nameParent.setJSDocInfo(createJsDoc(true, false, false, false));
    nameParent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, nameParent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionInheritingConstructorFromVarGrandparent_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node nameParent = Node.newString(Token.NAME, "myFunc");
    Node varGrandparent = new Node(Token.VAR);
    varGrandparent.setJSDocInfo(createJsDoc(true, false, false, false));

    varGrandparent.addChildToBack(nameParent);
    nameParent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, nameParent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithNameParentAndVarGrandparentWithoutJsDoc_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node nameParent = Node.newString(Token.NAME, "myFunc");
    Node varGrandparent = new Node(Token.VAR);

    varGrandparent.addChildToBack(nameParent);
    nameParent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, nameParent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenFunctionWithNameParentAndNonVarGrandparent_shouldReturnTrue() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    Node nameParent = Node.newString(Token.NAME, "myFunc");
    Node exprGrandparent = new Node(Token.EXPR_RESULT);

    exprGrandparent.addChildToBack(nameParent);
    nameParent.addChildToBack(functionNode);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, nameParent);

    // Assert
    Assert.assertTrue(result);
  }

  // =========================================================================
  // ASSIGN Node Branches: LHS and RHS Handling
  // =========================================================================

  @Test
  public void shouldTraverse_givenAssignLhs_shouldTrackAssignLhsChildAndReturnTrue() {
    // Arrange
    Node lhs = Node.newString(Token.NAME, "a");
    Node rhs = Node.newNumber(42.0);
    Node assignParent = new Node(Token.ASSIGN, lhs, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, lhs, assignParent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenNestedAssignLhs_shouldRetainOuterAssignLhsChild() {
    // Arrange
    Node innerLhs = Node.newString(Token.NAME, "a");
    Node innerRhs = Node.newString(Token.NAME, "b");
    Node outerLhs = new Node(Token.ASSIGN, innerLhs, innerRhs);
    Node outerRhs = Node.newNumber(1.0);
    Node outerAssign = new Node(Token.ASSIGN, outerLhs, outerRhs);

    // Act
    boolean outerResult = checkGlobalThis.shouldTraverse(traversal, outerLhs, outerAssign);
    boolean innerResult = checkGlobalThis.shouldTraverse(traversal, innerLhs, outerLhs);

    // Assert
    Assert.assertTrue(outerResult);
    Assert.assertTrue(innerResult);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithPrototypeLhs_shouldReturnFalse() {
    // Arrange: Foo.prototype = rhs
    Node target = Node.newString(Token.NAME, "Foo");
    Node prop = Node.newString("prototype");
    Node lhsGetprop = new Node(Token.GETPROP, target, prop);
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, lhsGetprop, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithPrototypeSubpropertyLhs_shouldReturnFalse() {
    // Arrange: Foo.prototype.bar = rhs
    Node target = Node.newString(Token.NAME, "Foo");
    Node prototypeProp = Node.newString("prototype");
    Node innerGetprop = new Node(Token.GETPROP, target, prototypeProp);
    Node barProp = Node.newString("bar");
    Node outerGetprop = new Node(Token.GETPROP, innerGetprop, barProp);
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, outerGetprop, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithNonPrototypeGetPropLhs_shouldReturnTrue() {
    // Arrange: Foo.bar = rhs
    Node target = Node.newString(Token.NAME, "Foo");
    Node barProp = Node.newString("bar");
    Node lhsGetprop = new Node(Token.GETPROP, target, barProp);
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, lhsGetprop, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithNonGetLhs_shouldReturnTrue() {
    // Arrange: simpleVar = rhs
    Node lhs = Node.newString(Token.NAME, "simpleVar");
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, lhs, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithGetElemSubpropertyOfPrototype_shouldReturnFalse() {
    // Arrange: Foo.prototype['bar'] = rhs
    Node target = Node.newString(Token.NAME, "Foo");
    Node prototypeProp = Node.newString("prototype");
    Node innerGetprop = new Node(Token.GETPROP, target, prototypeProp);
    Node key = Node.newString("bar");
    Node lhsGetelem = new Node(Token.GETELEM, innerGetprop, key);
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, lhsGetelem, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void shouldTraverse_givenAssignRhsWithGetElemNonPrototype_shouldReturnTrue() {
    // Arrange: foo['bar'] = rhs
    Node target = Node.newString(Token.NAME, "foo");
    Node key = Node.newString("bar");
    Node lhsGetelem = new Node(Token.GETELEM, target, key);
    Node rhs = new Node(Token.FUNCTION);
    Node assignParent = new Node(Token.ASSIGN, lhsGetelem, rhs);

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, rhs, assignParent);

    // Assert
    Assert.assertTrue(result);
  }

  // =========================================================================
  // Visit & Report Diagnostics
  // =========================================================================

  @Test
  public void visit_givenThisInAssignLhs_shouldReportWarning() {
    // Arrange
    Node thisNode = new Node(Token.THIS);
    Node rhs = Node.newNumber(1.0);
    Node assignParent = new Node(Token.ASSIGN, thisNode, rhs);

    checkGlobalThis.shouldTraverse(traversal, thisNode, assignParent);

    // Act
    checkGlobalThis.visit(traversal, thisNode, assignParent);

    // Assert
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getReportedErrors().get(0).getType());
  }

  @Test
  public void visit_givenThisUnderGetProp_shouldReportWarning() {
    // Arrange: this.foo
    Node thisNode = new Node(Token.THIS);
    Node propNode = Node.newString("foo");
    Node getprop = new Node(Token.GETPROP, thisNode, propNode);

    // Act
    checkGlobalThis.visit(traversal, thisNode, getprop);

    // Assert
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getReportedErrors().get(0).getType());
  }

  @Test
  public void visit_givenThisUnderGetElem_shouldReportWarning() {
    // Arrange: this['foo']
    Node thisNode = new Node(Token.THIS);
    Node elemKey = Node.newString("foo");
    Node getelem = new Node(Token.GETELEM, thisNode, elemKey);

    // Act
    checkGlobalThis.visit(traversal, thisNode, getelem);

    // Assert
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getReportedErrors().get(0).getType());
  }

  @Test
  public void visit_givenThisUnderReturn_shouldNotReport() {
    // Arrange: return this;
    Node thisNode = new Node(Token.THIS);
    Node returnParent = new Node(Token.RETURN, thisNode);

    // Act
    checkGlobalThis.visit(traversal, thisNode, returnParent);

    // Assert
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void visit_givenThisWithNullParent_shouldNotReport() {
    // Arrange
    Node thisNode = new Node(Token.THIS);

    // Act
    checkGlobalThis.visit(traversal, thisNode, null);

    // Assert
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void visit_givenNonThisNode_shouldNotReport() {
    // Arrange
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);

    // Act
    checkGlobalThis.visit(traversal, nameNode, parent);

    // Assert
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void visit_givenAssignLhsChildVisited_shouldResetAssignLhsChild() {
    // Arrange
    Node thisNode = new Node(Token.THIS);
    Node rhs = Node.newNumber(10.0);
    Node assignParent = new Node(Token.ASSIGN, thisNode, rhs);

    checkGlobalThis.shouldTraverse(traversal, thisNode, assignParent);
    checkGlobalThis.visit(traversal, thisNode, assignParent);
    Assert.assertEquals(1, compiler.getErrorCount());

    // Subsequent THIS outside of LHS and not under GETPROP
    Node anotherThis = new Node(Token.THIS);
    Node returnNode = new Node(Token.RETURN, anotherThis);

    // Act
    checkGlobalThis.visit(traversal, anotherThis, returnNode);

    // Assert: still only 1 error because assignLhsChild was cleared
    Assert.assertEquals(1, compiler.getErrorCount());
  }

  // =========================================================================
  // Edge Cases & Exception Branches
  // =========================================================================

  @Test(expected = NullPointerException.class)
  public void shouldTraverse_givenFunctionWithNullParentAndNoJsDoc_shouldThrowNullPointerException() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);

    // Act
    checkGlobalThis.shouldTraverse(traversal, functionNode, null);
  }

  @Test
  public void shouldTraverse_givenFunctionWithNullParentAndConstructorJsDoc_shouldReturnFalse() {
    // Arrange
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(true, false, false, false));

    // Act
    boolean result = checkGlobalThis.shouldTraverse(traversal, functionNode, null);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void constructor_givenCustomCheckLevel_shouldInitializeProperly() {
    // Arrange & Act
    CheckGlobalThis customPass = new CheckGlobalThis(compiler, CheckLevel.ERROR);
    NodeTraversal customTraversal = new NodeTraversal(compiler, customPass);
    Node thisNode = new Node(Token.THIS);
    Node propNode = Node.newString("val");
    Node getprop = new Node(Token.GETPROP, thisNode, propNode);

    customPass.visit(customTraversal, thisNode, getprop);

    // Assert
    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(CheckLevel.ERROR, compiler.getReportedErrors().get(0).getDefaultLevel());
  }

  // =========================================================================
  // Full AST Traversal Integration
  // =========================================================================

  @Test
  public void traverse_givenGlobalThisPropertyAccess_shouldReportDiagnostic() {
    // Arrange: this.a = 1;
    Node script = new Node(Token.SCRIPT);
    Node thisNode = new Node(Token.THIS);
    Node propNode = Node.newString("a");
    Node getprop = new Node(Token.GETPROP, thisNode, propNode);
    Node value = Node.newNumber(1.0);
    Node assign = new Node(Token.ASSIGN, getprop, value);
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    script.addChildToBack(exprResult);

    // Act
    NodeTraversal.traverse(compiler, script, checkGlobalThis);

    // Assert
    Assert.assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void traverse_givenConstructorFunctionWithThis_shouldNotReportDiagnostic() {
    // Arrange:
    // /** @constructor */ function Foo() { this.a = 1; }
    Node script = new Node(Token.SCRIPT);
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.setJSDocInfo(createJsDoc(true, false, false, false));
    Node fnName = Node.newString(Token.NAME, "Foo");
    Node params = new Node(Token.LP);
    Node block = new Node(Token.BLOCK);

    Node thisNode = new Node(Token.THIS);
    Node propNode = Node.newString("a");
    Node getprop = new Node(Token.GETPROP, thisNode, propNode);
    Node value = Node.newNumber(1.0);
    Node assign = new Node(Token.ASSIGN, getprop, value);
    block.addChildToBack(new Node(Token.EXPR_RESULT, assign));

    functionNode.addChildToBack(fnName);
    functionNode.addChildToBack(params);
    functionNode.addChildToBack(block);
    script.addChildToBack(functionNode);

    // Act
    NodeTraversal.traverse(compiler, script, checkGlobalThis);

    // Assert
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void traverse_givenPrototypeMethodAssignmentWithThis_shouldNotReportDiagnostic() {
    // Arrange:
    // Foo.prototype.bar = function() { this.a = 1; };
    Node script = new Node(Token.SCRIPT);
    Node foo = Node.newString(Token.NAME, "Foo");
    Node proto = Node.newString("prototype");
    Node fooProto = new Node(Token.GETPROP, foo, proto);
    Node bar = Node.newString("bar");
    Node lhs = new Node(Token.GETPROP, fooProto, bar);

    Node rhsFunction = new Node(Token.FUNCTION);
    Node fnName = Node.newString(Token.NAME, "");
    Node params = new Node(Token.LP);
    Node block = new Node(Token.BLOCK);

    Node thisNode = new Node(Token.THIS);
    Node propNode = Node.newString("a");
    Node getprop = new Node(Token.GETPROP, thisNode, propNode);
    Node value = Node.newNumber(1.0);
    Node innerAssign = new Node(Token.ASSIGN, getprop, value);
    block.addChildToBack(new Node(Token.EXPR_RESULT, innerAssign));

    rhsFunction.addChildToBack(fnName);
    rhsFunction.addChildToBack(params);
    rhsFunction.addChildToBack(block);

    Node assign = new Node(Token.ASSIGN, lhs, rhsFunction);
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign));

    // Act
    NodeTraversal.traverse(compiler, script, checkGlobalThis);

    // Assert
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}