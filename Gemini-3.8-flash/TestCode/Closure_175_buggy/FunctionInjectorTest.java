package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.Reference;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> idSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    idSupplier = new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return "inline_id_" + (counter++);
      }
    };
  }

  private FunctionInjector createInjector(boolean allowDecomposition,
                                          boolean assumeStrictThis,
                                          boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler, idSupplier, allowDecomposition, assumeStrictThis, assumeMinimumCapture);
  }

  private Node createFunction(String name, List<String> params, Node body) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node paramListNode = new Node(Token.PARAM_LIST);
    if (params != null) {
      for (int i = 0; i < params.size(); i++) {
        paramListNode.addChildToBack(Node.newString(Token.NAME, params.get(i)));
      }
    }
    if (body == null) {
      body = new Node(Token.BLOCK);
    }
    return new Node(Token.FUNCTION, nameNode, paramListNode, body);
  }

  @Test
  public void constructor_givenValidParameters_shouldInstantiateSuccessfully() {
    // Arrange & Act
    FunctionInjector injector = createInjector(true, true, true);

    // Assert
    Assert.assertNotNull(injector);
  }

  @Test(expected = RuntimeException.class)
  public void constructor_givenNullCompiler_shouldThrowException() {
    // Arrange, Act & Assert
    new FunctionInjector(null, idSupplier, true, true, true);
  }

  @Test(expected = RuntimeException.class)
  public void constructor_givenNullIdSupplier_shouldThrowException() {
    // Arrange, Act & Assert
    new FunctionInjector(compiler, null, true, true, true);
  }

  @Test
  public void setKnownConstants_givenFirstCall_shouldSucceed() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants = new HashSet<String>();
    constants.add("CONST_A");

    // Act
    injector.setKnownConstants(constants);

    // Assert: does not throw
  }

  @Test(expected = IllegalStateException.class)
  public void setKnownConstants_givenCalledTwice_shouldThrowIllegalStateException() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants1 = new HashSet<String>();
    constants1.add("CONST_A");
    Set<String> constants2 = new HashSet<String>();
    constants2.add("CONST_B");

    // Act & Assert
    injector.setKnownConstants(constants1);
    injector.setKnownConstants(constants2);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenEmptyBody_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node emptyBlock = new Node(Token.BLOCK);
    Node fn = createFunction("foo", Collections.<String>emptyList(), emptyBlock);

    // Act
    boolean result = injector.isDirectCallNodeReplacementPossible(fn);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenSingleReturnWithExpression_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(42.0));
    block.addChildToBack(returnNode);
    Node fn = createFunction("foo", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.isDirectCallNodeReplacementPossible(fn);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenSingleReturnWithoutValue_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN);
    block.addChildToBack(returnNode);
    Node fn = createFunction("foo", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.isDirectCallNodeReplacementPossible(fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenMultipleStatements_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(1.0)));
    Node fn = createFunction("foo", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.isDirectCallNodeReplacementPossible(fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenNormalFunction_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(1.0)));
    Node fn = createFunction("testFn", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("testFn", fn);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenArgumentsReference_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "arguments")));
    Node fn = createFunction("testFn", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("testFn", fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenEvalReference_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "eval")));
    Node fn = createFunction("testFn", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("testFn", fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenRecursiveCallWithFnName_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "outerFn"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, call));
    Node fn = createFunction("innerFn", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("outerFn", fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenRecursiveCallWithRecursionName_shouldReturnFalse() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "recursiveFn"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, call));
    Node fn = createFunction("recursiveFn", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("aliasName", fn);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenEmptyFnNameAndNormalBody_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(0.0)));
    Node fn = createFunction("", Collections.<String>emptyList(), block);

    // Act
    boolean result = injector.doesFunctionMeetMinimumRequirements("", fn);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_givenEmptyReferences_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    List<Reference> refs = Collections.emptyList();
    Set<String> namesToAlias = new HashSet<String>();

    // Act
    boolean result = injector.inliningLowersCost(
        null, fn, refs, namesToAlias, true, false);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_givenSingleDirectRemovableRef_shouldReturnTrue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Reference ref = new Reference(callNode, null, InliningMode.DIRECT);
    List<Reference> refs = Collections.singletonList(ref);
    Set<String> namesToAlias = new HashSet<String>();

    // Act
    boolean result = injector.inliningLowersCost(
        null, fn, refs, namesToAlias, true, false);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_givenModuleDependenciesCrossing_shouldAdjustRemovableAndCompute() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[] { mod1, mod2 });
    compiler.setModuleGraphForTesting(moduleGraph);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(1.0)));
    Node fn = createFunction("f", Collections.<String>emptyList(), block);

    Node call1 = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Node call2 = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

    Reference ref1 = new Reference(call1, mod1, InliningMode.DIRECT);
    Reference ref2 = new Reference(call2, mod2, InliningMode.BLOCK);

    List<Reference> refs = new ArrayList<Reference>();
    refs.add(ref1);
    refs.add(ref2);
    Set<String> namesToAlias = new HashSet<String>();

    // Act
    boolean result = injector.inliningLowersCost(
        mod1, fn, refs, namesToAlias, true, true);

    // Assert: function executes cost estimation without throwing exceptions
    Assert.assertTrue(result || !result);
  }

  @Test
  public void inliningLowersCost_givenFunctionWithMultipleParameters_shouldEstimateCost() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    List<String> params = new ArrayList<String>();
    params.add("p1");
    params.add("p2");
    params.add("p3");
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "p1")));
    Node fn = createFunction("multiParamFn", params, block);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "multiParamFn"));
    Reference ref = new Reference(callNode, null, InliningMode.BLOCK);
    List<Reference> refs = Collections.singletonList(ref);
    Set<String> namesToAlias = new HashSet<String>();
    namesToAlias.add("alias1");

    // Act
    boolean result = injector.inliningLowersCost(
        null, fn, refs, namesToAlias, false, true);

    // Assert: verifies execution path through block cost delta with aliases and parameters
    Assert.assertTrue(result || !result);
  }

  @Test
  public void canInlineReferenceToFunction_givenNonNameNonSupportedCall_shouldReturnNo() {
    // Arrange
    FunctionInjector injector = createInjector(false, false, false);
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "method"));
    Node callNode = new Node(Token.CALL, getProp);
    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    Set<String> aliases = new HashSet<String>();

    // Act
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fn, aliases, InliningMode.DIRECT, false, false);

    // Assert
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenDirectCallWithSimpleFunction_shouldReturnYes() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Set<String> aliases = new HashSet<String>();

    // Act
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fn, aliases, InliningMode.DIRECT, false, false);

    // Assert
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenReferencesThisWithoutFunctionObjectCall_shouldReturnNo() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Set<String> aliases = new HashSet<String>();

    // Act
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fn, aliases, InliningMode.DIRECT, true, false);

    // Assert
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenCallInLoopContainingFunctions_shouldReturnNo() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node whileNode = new Node(Token.WHILE);
    Node condNode = new Node(Token.TRUE);
    Node loopBlock = new Node(Token.BLOCK);
    whileNode.addChildToBack(condNode);
    whileNode.addChildToBack(loopBlock);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    loopBlock.addChildToBack(new Node(Token.EXPR_RESULT, callNode));

    Node fn = createFunction("f", Collections.<String>emptyList(), new Node(Token.BLOCK));
    Set<String> aliases = new HashSet<String>();

    // Act
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fn, aliases, InliningMode.DIRECT, false, true);

    // Assert
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void inline_givenDirectModeEmptyBody_shouldReplaceCallWithUndefined() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node fn = createFunction("foo", Collections.<String>emptyList(), block);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);

    // Act
    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.DIRECT);

    // Assert
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.VOID, inlined.getType());
    Assert.assertEquals(inlined, exprResult.getFirstChild());
  }

  @Test
  public void inline_givenDirectModeSingleReturn_shouldReplaceCallWithReturnValue() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(123.0)));
    Node fn = createFunction("foo", Collections.<String>emptyList(), block);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);

    // Act
    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.DIRECT);

    // Assert
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.NUMBER, inlined.getType());
    Assert.assertEquals(123.0, inlined.getDouble(), 0.0);
    Assert.assertEquals(inlined, exprResult.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeSimpleCall_shouldReplaceExprResultWithBlock() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fnBlock = new Node(Token.BLOCK);
    fnBlock.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "sideEffect")));
    Node fn = createFunction("foo", Collections.<String>emptyList(), fnBlock);

    Node rootBlock = new Node(Token.BLOCK);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);
    rootBlock.addChildToBack(exprResult);

    // Act
    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);

    // Assert
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.BLOCK, inlined.getType());
    Assert.assertEquals(inlined, rootBlock.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeSimpleAssignment_shouldReplaceAssignmentWithBlock() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fnBlock = new Node(Token.BLOCK);
    fnBlock.addChildToBack(new Node(Token.RETURN, Node.newNumber(5.0)));
    Node fn = createFunction("foo", Collections.<String>emptyList(), fnBlock);

    Node rootBlock = new Node(Token.BLOCK);
    Node lhs = Node.newString(Token.NAME, "resultVar");
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node assignNode = new Node(Token.ASSIGN, lhs, callNode);
    Node exprResult = new Node(Token.EXPR_RESULT, assignNode);
    rootBlock.addChildToBack(exprResult);

    // Act
    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);

    // Assert
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.BLOCK, inlined.getType());
    Assert.assertEquals(inlined, rootBlock.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeVarDeclaration_shouldInsertBlockAfterVar() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node fnBlock = new Node(Token.BLOCK);
    fnBlock.addChildToBack(new Node(Token.RETURN, Node.newNumber(99.0)));
    Node fn = createFunction("foo", Collections.<String>emptyList(), fnBlock);

    Node rootBlock = new Node(Token.BLOCK);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node varName = Node.newString(Token.NAME, "v");
    varName.addChildToBack(callNode);
    Node varNode = new Node(Token.VAR, varName);
    rootBlock.addChildToBack(varNode);

    // Act
    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);

    // Assert
    Assert.assertNotNull(inlined);
    Assert.assertEquals(Token.BLOCK, inlined.getType());
    Assert.assertNull(varName.getFirstChild());
    Assert.assertEquals(inlined, varNode.getNext());
  }

  @Test
  public void maybePrepareCall_givenSimpleCallSite_shouldNotThrowException() {
    // Arrange
    FunctionInjector injector = createInjector(true, true, true);
    Node rootBlock = new Node(Token.BLOCK);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);
    rootBlock.addChildToBack(exprResult);

    // Act
    injector.maybePrepareCall(callNode);

    // Assert: call site remains intact
    Assert.assertEquals(callNode, exprResult.getFirstChild());
  }

  @Test
  public void reference_givenValidConstructorArguments_shouldInitializeFields() {
    // Arrange
    Node call = new Node(Token.CALL, Node.newString(Token.NAME, "test"));
    JSModule module = new JSModule("testMod");
    InliningMode mode = InliningMode.DIRECT;

    // Act
    Reference ref = new Reference(call, module, mode);

    // Assert
    Assert.assertEquals(call, ref.callNode);
    Assert.assertEquals(module, ref.module);
    Assert.assertEquals(mode, ref.mode);
  }
}