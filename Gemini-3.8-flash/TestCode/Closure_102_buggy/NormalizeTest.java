package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NormalizeTest {

  private static class RecordingCompiler extends Compiler {
    private int codeChangeCount = 0;

    @Override
    public void reportCodeChange() {
      this.codeChangeCount++;
    }

    public int getCodeChangeCount() {
      return this.codeChangeCount;
    }
  }

  private RecordingCompiler compiler;

  @Before
  public void setUp() {
    compiler = new RecordingCompiler();
  }

  @Test
  public void visit_givenWhileNode_shouldConvertToForNode() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node whileNode = new Node(Token.WHILE);
    Node condition = new Node(Token.TRUE);
    Node body = new Node(Token.BLOCK);
    whileNode.addChildToBack(condition);
    whileNode.addChildToBack(body);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.visit(traversal, whileNode, null);

    // Assert
    Assert.assertEquals(Token.FOR, whileNode.getType());
    Assert.assertEquals(4, whileNode.getChildCount());
    Assert.assertEquals(Token.EMPTY, whileNode.getFirstChild().getType());
    Assert.assertEquals(condition, whileNode.getFirstChild().getNext());
    Assert.assertEquals(Token.EMPTY, whileNode.getFirstChild().getNext().getNext().getType());
    Assert.assertEquals(body, whileNode.getLastChild());
    Assert.assertTrue(compiler.getCodeChangeCount() > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void visit_givenWhileNodeAndAssertOnChangeTrue_shouldThrowIllegalStateException() {
    // Arrange
    Normalize normalize = new Normalize(compiler, true);
    Node whileNode = new Node(Token.WHILE);
    whileNode.addChildToBack(new Node(Token.TRUE));
    whileNode.addChildToBack(new Node(Token.BLOCK));
    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.visit(traversal, whileNode, null);
  }

  @Test
  public void shouldTraverse_givenLabelWithExpression_shouldWrapInBlock() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node labelNode = new Node(Token.LABEL);
    Node labelName = Node.newString(Token.NAME, "myLabel");
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "foo"));
    labelNode.addChildToBack(labelName);
    labelNode.addChildToBack(exprResult);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    boolean shouldTraverse = normalize.shouldTraverse(traversal, labelNode, null);

    // Assert
    Assert.assertTrue(shouldTraverse);
    Node lastChild = labelNode.getLastChild();
    Assert.assertEquals(Token.BLOCK, lastChild.getType());
    Assert.assertEquals(exprResult, lastChild.getFirstChild());
    Assert.assertTrue(compiler.getCodeChangeCount() > 0);
  }

  @Test
  public void shouldTraverse_givenLabelWithAllowedLoopsAndBlocks_shouldNotWrapInBlock() {
    // Arrange
    int[] allowedChildTypes = new int[] {
        Token.LABEL, Token.BLOCK, Token.FOR, Token.WHILE, Token.DO
    };

    for (int i = 0; i < allowedChildTypes.length; i++) {
      int childType = allowedChildTypes[i];
      RecordingCompiler currentCompiler = new RecordingCompiler();
      Normalize normalize = new Normalize(currentCompiler, false);
      Node labelNode = new Node(Token.LABEL);
      labelNode.addChildToBack(Node.newString(Token.NAME, "lbl"));
      Node loopOrBlock = new Node(childType);
      labelNode.addChildToBack(loopOrBlock);
      NodeTraversal traversal = new NodeTraversal(currentCompiler, normalize);

      // Act
      normalize.shouldTraverse(traversal, labelNode, null);

      // Assert
      Assert.assertEquals(loopOrBlock, labelNode.getLastChild());
      Assert.assertEquals(0, currentCompiler.getCodeChangeCount());
    }
  }

  @Test
  public void shouldTraverse_givenMultipleVarDeclarationInBlock_shouldSplitIntoSeparateVars() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node scriptBlock = new Node(Token.BLOCK);
    Node varNode = new Node(Token.VAR);
    Node varA = Node.newString(Token.NAME, "a");
    Node varB = Node.newString(Token.NAME, "b");
    Node varC = Node.newString(Token.NAME, "c");
    varNode.addChildToBack(varA);
    varNode.addChildToBack(varB);
    varNode.addChildToBack(varC);
    scriptBlock.addChildToBack(varNode);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, scriptBlock, null);

    // Assert
    Assert.assertEquals(3, scriptBlock.getChildCount());
    Node first = scriptBlock.getFirstChild();
    Node second = first.getNext();
    Node third = second.getNext();

    Assert.assertEquals(Token.VAR, first.getType());
    Assert.assertEquals("a", first.getFirstChild().getString());
    Assert.assertEquals(Token.VAR, second.getType());
    Assert.assertEquals("b", second.getFirstChild().getString());
    Assert.assertEquals(Token.VAR, third.getType());
    Assert.assertEquals("c", third.getFirstChild().getString());
    Assert.assertTrue(compiler.getCodeChangeCount() >= 2);
  }

  @Test(expected = IllegalStateException.class)
  public void shouldTraverse_givenEmptyVarWithAssertOnChange_shouldThrowIllegalStateException() {
    // Arrange
    Normalize normalize = new Normalize(compiler, true);
    Node block = new Node(Token.BLOCK);
    Node emptyVar = new Node(Token.VAR);
    block.addChildToBack(emptyVar);
    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, block, null);
  }

  @Test
  public void shouldTraverse_givenForLoopWithVarInit_shouldExtractInitializer() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node block = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR);
    Node varInit = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node condition = new Node(Token.TRUE);
    Node increment = Node.newString(Token.NAME, "inc");
    Node body = new Node(Token.BLOCK);

    forNode.addChildToBack(varInit);
    forNode.addChildToBack(condition);
    forNode.addChildToBack(increment);
    forNode.addChildToBack(body);
    block.addChildToBack(forNode);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, block, null);

    // Assert
    Assert.assertEquals(2, block.getChildCount());
    Assert.assertEquals(varInit, block.getFirstChild());
    Assert.assertEquals(forNode, block.getLastChild());
    Assert.assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void shouldTraverse_givenForLoopWithExprInit_shouldExtractAsExprResult() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node block = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR);
    Node exprInit = new Node(Token.ASSIGN, Node.newString(Token.NAME, "i"), Node.newNumber(0));
    Node condition = new Node(Token.TRUE);
    Node increment = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);

    forNode.addChildToBack(exprInit);
    forNode.addChildToBack(condition);
    forNode.addChildToBack(increment);
    forNode.addChildToBack(body);
    block.addChildToBack(forNode);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, block, null);

    // Assert
    Assert.assertEquals(2, block.getChildCount());
    Node extracted = block.getFirstChild();
    Assert.assertEquals(Token.EXPR_RESULT, extracted.getType());
    Assert.assertEquals(exprInit, extracted.getFirstChild());
    Assert.assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void shouldTraverse_givenLabeledForLoop_shouldExtractInitializerBeforeLabel() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node block = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL);
    labelNode.addChildToBack(Node.newString(Token.NAME, "loopLabel"));

    Node forNode = new Node(Token.FOR);
    Node varInit = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    forNode.addChildToBack(varInit);
    forNode.addChildToBack(new Node(Token.TRUE));
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.BLOCK));

    labelNode.addChildToBack(forNode);
    block.addChildToBack(labelNode);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, block, null);

    // Assert
    Assert.assertEquals(2, block.getChildCount());
    Assert.assertEquals(varInit, block.getFirstChild());
    Assert.assertEquals(labelNode, block.getLastChild());
    Assert.assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void shouldTraverse_givenFunctionWithMisplacedFunctionDeclaration_shouldHoistToFront() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(Node.newString(Token.NAME, "outer"));
    functionNode.addChildToBack(new Node(Token.LP));

    Node functionBody = new Node(Token.BLOCK);
    Node exprStatement = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "statement1"));
    Node innerFunc = new Node(Token.FUNCTION);
    innerFunc.addChildToBack(Node.newString(Token.NAME, "inner"));
    innerFunc.addChildToBack(new Node(Token.LP));
    innerFunc.addChildToBack(new Node(Token.BLOCK));

    functionBody.addChildToBack(exprStatement);
    functionBody.addChildToBack(innerFunc);
    functionNode.addChildToBack(functionBody);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, functionNode, null);

    // Assert
    Assert.assertEquals(innerFunc, functionBody.getFirstChild());
    Assert.assertEquals(exprStatement, functionBody.getLastChild());
  }

  @Test
  public void shouldTraverse_givenFunctionWithDeclarationAlreadyAtFront_shouldRetainOrder() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(Node.newString(Token.NAME, "outer"));
    functionNode.addChildToBack(new Node(Token.LP));

    Node functionBody = new Node(Token.BLOCK);
    Node innerFunc1 = new Node(Token.FUNCTION);
    innerFunc1.addChildToBack(Node.newString(Token.NAME, "inner1"));
    innerFunc1.addChildToBack(new Node(Token.LP));
    innerFunc1.addChildToBack(new Node(Token.BLOCK));

    Node innerFunc2 = new Node(Token.FUNCTION);
    innerFunc2.addChildToBack(Node.newString(Token.NAME, "inner2"));
    innerFunc2.addChildToBack(new Node(Token.LP));
    innerFunc2.addChildToBack(new Node(Token.BLOCK));

    functionBody.addChildToBack(innerFunc1);
    functionBody.addChildToBack(innerFunc2);
    functionNode.addChildToBack(functionBody);

    NodeTraversal traversal = new NodeTraversal(compiler, normalize);

    // Act
    normalize.shouldTraverse(traversal, functionNode, null);

    // Assert
    Assert.assertEquals(innerFunc1, functionBody.getFirstChild());
    Assert.assertEquals(innerFunc2, innerFunc1.getNext());
  }

  @Test
  public void propagateConstantAnnotations_givenEmptyName_shouldReturnEarly() {
    // Arrange
    Normalize.PropogateConstantAnnotations propagator =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    Node emptyName = Node.newString(Token.NAME, "");
    NodeTraversal traversal = new NodeTraversal(compiler, propagator);

    // Act
    propagator.visit(traversal, emptyName, null);

    // Assert
    Assert.assertFalse(emptyName.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void propagateConstantAnnotations_givenConstantVarInScope_shouldSetConstantProperty() {
    // Arrange
    Normalize.PropogateConstantAnnotations propagator =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "MY_CONST");

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(varNode);
    varNode.setJSDocInfo(info);

    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    // Act
    propagator.process(new Node(Token.SCRIPT), root);

    // Assert
    Assert.assertTrue(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test(expected = IllegalStateException.class)
  public void propagateConstantAnnotations_givenConstantVarAndAssertOnChangeTrue_shouldThrowIllegalStateException() {
    // Arrange
    Normalize.PropogateConstantAnnotations propagator =
        new Normalize.PropogateConstantAnnotations(compiler, true);
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "MY_CONST");

    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstancy();
    JSDocInfo info = builder.build(varNode);
    varNode.setJSDocInfo(info);

    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    // Act
    propagator.process(new Node(Token.SCRIPT), root);
  }

  @Test(expected = IllegalStateException.class)
  public void verifyConstants_givenRootWithoutParent_shouldThrowIllegalStateException() {
    // Arrange
    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // Act
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void verifyConstants_givenParentNotContainingExterns_shouldThrowIllegalStateException() {
    // Arrange
    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    parent.addChildToBack(root);

    // Act
    verifier.process(externs, root);
  }

  @Test
  public void verifyConstants_givenEmptyName_shouldReturnEarly() {
    // Arrange
    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    Node emptyName = Node.newString(Token.NAME, "");
    NodeTraversal traversal = new NodeTraversal(compiler, verifier);

    // Act
    verifier.visit(traversal, emptyName, null);

    // Assert: No exception thrown
  }

  @Test(expected = IllegalStateException.class)
  public void verifyConstants_givenInconsistentConstantAnnotations_shouldThrowIllegalStateException() {
    // Arrange
    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
    Node name1 = Node.newString(Token.NAME, "foo");
    name1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node name2 = Node.newString(Token.NAME, "foo");
    name2.putBooleanProp(Node.IS_CONSTANT_NAME, false);

    NodeTraversal traversal = new NodeTraversal(compiler, verifier);

    // Act
    verifier.visit(traversal, name1, null);
    verifier.visit(traversal, name2, null);
  }

  @Test(expected = IllegalStateException.class)
  public void verifyConstants_givenNonConstantAnnotatedAsConstant_shouldThrowIllegalStateException() {
    // Arrange
    Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
    Node name = Node.newString(Token.NAME, "normalVar");
    name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node root = new Node(Token.SCRIPT, new Node(Token.VAR, name));

    NodeTraversal traversal = new NodeTraversal(compiler, verifier);
    traversal.traverse(root);
  }

  @Test
  public void process_givenCompleteAST_shouldNormalizeWithoutErrors() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(Node.newString(Token.NAME, "a"));
    varNode.addChildToBack(Node.newString(Token.NAME, "b"));
    root.addChildToBack(varNode);

    Node whileNode = new Node(Token.WHILE);
    whileNode.addChildToBack(new Node(Token.TRUE));
    whileNode.addChildToBack(new Node(Token.BLOCK));
    root.addChildToBack(whileNode);

    // Act
    normalize.process(externs, root);

    // Assert
    Assert.assertTrue(compiler.getCodeChangeCount() > 0);
    Assert.assertEquals(3, root.getChildCount());
    Assert.assertEquals(Token.VAR, root.getFirstChild().getType());
    Assert.assertEquals(Token.VAR, root.getFirstChild().getNext().getType());
    Assert.assertEquals(Token.FOR, root.getLastChild().getType());
  }

  @Test
  public void process_givenDuplicateVarDeclarationsInBlock_shouldDeduplicate() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    // First: var x = 1;
    Node var1 = new Node(Token.VAR);
    Node x1 = Node.newString(Token.NAME, "x");
    x1.addChildToBack(Node.newNumber(1));
    var1.addChildToBack(x1);

    // Second: var x; (uninitialized duplicate)
    Node var2 = new Node(Token.VAR);
    Node x2 = Node.newString(Token.NAME, "x");
    var2.addChildToBack(x2);

    // Third: var x = 2; (initialized duplicate)
    Node var3 = new Node(Token.VAR);
    Node x3 = Node.newString(Token.NAME, "x");
    x3.addChildToBack(Node.newNumber(2));
    var3.addChildToBack(x3);

    root.addChildToBack(var1);
    root.addChildToBack(var2);
    root.addChildToBack(var3);

    // Act
    normalize.process(externs, root);

    // Assert: var2 removed; var3 converted to EXPR_RESULT with ASSIGN
    Assert.assertEquals(2, root.getChildCount());
    Node first = root.getFirstChild();
    Node second = root.getLastChild();

    Assert.assertEquals(Token.VAR, first.getType());
    Assert.assertEquals(Token.EXPR_RESULT, second.getType());
    Assert.assertEquals(Token.ASSIGN, second.getFirstChild().getType());
  }

  @Test
  public void process_givenDuplicateVarInForInLoop_shouldReplaceWithVarName() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    Node firstVar = new Node(Token.VAR, Node.newString(Token.NAME, "item"));
    root.addChildToBack(firstVar);

    Node forIn = new Node(Token.FOR);
    Node duplicateVar = new Node(Token.VAR, Node.newString(Token.NAME, "item"));
    forIn.addChildToBack(duplicateVar);
    forIn.addChildToBack(Node.newString(Token.NAME, "collection"));
    forIn.addChildToBack(new Node(Token.BLOCK));
    root.addChildToBack(forIn);

    // Act
    normalize.process(externs, root);

    // Assert: duplicateVar replaced by NAME "item"
    Assert.assertEquals(Token.NAME, forIn.getFirstChild().getType());
    Assert.assertEquals("item", forIn.getFirstChild().getString());
  }

  @Test
  public void process_givenDuplicateVarInLabel_shouldReplaceWithEmpty() {
    // Arrange
    Normalize normalize = new Normalize(compiler, false);
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);

    Node firstVar = new Node(Token.VAR, Node.newString(Token.NAME, "z"));
    root.addChildToBack(firstVar);

    Node label = new Node(Token.LABEL);
    label.addChildToBack(Node.newString(Token.NAME, "myLbl"));
    Node duplicateVar = new Node(Token.VAR, Node.newString(Token.NAME, "z"));
    label.addChildToBack(duplicateVar);
    root.addChildToBack(label);

    // Act
    normalize.process(externs, root);

    // Assert: duplicateVar under label replaced with EMPTY (or wrapped BLOCK with EMPTY)
    Node lastChild = label.getLastChild();
    if (lastChild.getType() == Token.BLOCK) {
      Assert.assertEquals(Token.EMPTY, lastChild.getFirstChild().getType());
    } else {
      Assert.assertEquals(Token.EMPTY, lastChild.getType());
    }
  }
}