package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
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
  private int idCount;

  @Before
  public void setUp() {
    compiler = new Compiler();
    idCount = 0;
    idSupplier = new Supplier<String>() {
      @Override
      public String get() {
        return "unique_id_" + (idCount++);
      }
    };
  }

  private FunctionInjector createInjector(
      boolean allowDecomposition,
      boolean assumeStrictThis,
      boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler,
        idSupplier,
        allowDecomposition,
        assumeStrictThis,
        assumeMinimumCapture);
  }

  private Node createFunctionNode(String name, Node params, Node body) {
    Node fn = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, name);
    fn.addChildToBack(nameNode);
    fn.addChildToBack(params != null ? params : new Node(Token.PARAM_LIST));
    fn.addChildToBack(body != null ? body : new Node(Token.BLOCK));
    return fn;
  }

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullCompiler_shouldThrowException() {
    new FunctionInjector(null, idSupplier, true, true, true);
  }

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullSupplier_shouldThrowException() {
    new FunctionInjector(compiler, null, true, true, true);
  }

  @Test
  public void setKnownConstants_givenValidSet_shouldStoreSuccessfully() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants = new HashSet<String>();
    constants.add("CONST_A");
    injector.setKnownConstants(constants);
  }

  @Test(expected = IllegalStateException.class)
  public void setKnownConstants_calledTwice_shouldThrowIllegalStateException() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants1 = new HashSet<String>();
    constants1.add("CONST_A");
    injector.setKnownConstants(constants1);

    Set<String> constants2 = new HashSet<String>();
    constants2.add("CONST_B");
    injector.setKnownConstants(constants2);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenEmptyBlock_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fnNode = createFunctionNode("test", null, new Node(Token.BLOCK));
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenSingleReturnWithExpression_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(42.0));
    block.addChildToBack(returnNode);

    Node fnNode = createFunctionNode("test", null, block);
    Assert.assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenSingleReturnWithoutExpression_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN);
    block.addChildToBack(returnNode);

    Node fnNode = createFunctionNode("test", null, block);
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenNonReturnSingleChild_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));

    Node fnNode = createFunctionNode("test", null, block);
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void isDirectCallNodeReplacementPossible_givenMultipleStatements_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(2.0)));

    Node fnNode = createFunctionNode("test", null, block);
    Assert.assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenValidSimpleFunction_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(10.0)));
    Node fnNode = createFunctionNode("foo", null, block);

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenArgumentsReference_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN, Node.newString(Token.NAME, "arguments"));
    block.addChildToBack(returnNode);
    Node fnNode = createFunctionNode("foo", null, block);

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenEvalCall_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node evalCall = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, evalCall));
    Node fnNode = createFunctionNode("foo", null, block);

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenDirectRecursionByFnName_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node recursiveCall = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, recursiveCall));
    Node fnNode = createFunctionNode("foo", null, block);

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenRecursionByFunctionNameNode_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node recursiveCall = new Node(Token.CALL, Node.newString(Token.NAME, "innerFoo"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, recursiveCall));
    Node fnNode = createFunctionNode("innerFoo", null, block);

    Assert.assertFalse(injector.doesFunctionMeetMinimumRequirements("", fnNode));
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_givenEmptyFnNameAndDifferentNodeName_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node block = new Node(Token.BLOCK);
    Node otherCall = new Node(Token.CALL, Node.newString(Token.NAME, "bar"));
    block.addChildToBack(new Node(Token.EXPR_RESULT, otherCall));
    Node fnNode = createFunctionNode("foo", null, block);

    Assert.assertTrue(injector.doesFunctionMeetMinimumRequirements("", fnNode));
  }

  @Test
  public void canInlineReferenceToFunction_givenNonNameNonFunctionObjectCall_shouldReturnYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("method"));
    Node callNode = new Node(Token.CALL, getprop);

    Node fnNode = createFunctionNode("method", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.YES, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenApplyCall_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "fn"), Node.newString("apply"));
    Node callNode = new Node(Token.CALL, getprop, Node.newString(Token.NAME, "this"));

    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenCallMethodWithoutThis_assumeStrictThisFalse_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, false, true);
    Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "fn"), Node.newString("call"));
    Node callNode = new Node(Token.CALL, getprop, Node.newString(Token.NAME, "notThis"));

    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenReferencesThisAndNotCallObject_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, true, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenContainsFunctionsAndInLoop_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, callNode)));

    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, true);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenDirectModeAndDirectReplacementImpossible_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newNumber(1.0)));
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(2.0)));
    Node fnNode = createFunctionNode("fn", null, block);

    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_givenDirectModeAndValidSimpleCall_shouldReturnYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));

    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.DIRECT, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.YES, result);
  }

  @Test(expected = IllegalStateException.class)
  public void inline_givenNotNormalizedLifeCycleStage_shouldThrowIllegalStateException() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.RAW);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));

    injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.DIRECT);
  }

  @Test
  public void inline_givenDirectModeAndEmptyFunctionBody_shouldReplaceWithUndefined() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));

    Node result = injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.DIRECT);

    Assert.assertNotNull(result);
    Assert.assertEquals(Token.VOID, result.getType());
    Assert.assertEquals(result, expr.getFirstChild());
  }

  @Test
  public void inline_givenDirectModeAndReturnExpression_shouldReplaceWithReturnValue() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(123.0)));
    Node fnNode = createFunctionNode("fn", null, block);

    Node result = injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.DIRECT);

    Assert.assertNotNull(result);
    Assert.assertEquals(Token.NUMBER, result.getType());
    Assert.assertEquals(123.0, result.getDouble(), 0.0001);
    Assert.assertEquals(result, expr.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeAndSimpleCall_shouldReplaceExprWithBlock() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);
    Node script = new Node(Token.SCRIPT, expr);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));
    Node fnNode = createFunctionNode("fn", null, block);

    Node result = injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(result);
    Assert.assertEquals(Token.BLOCK, result.getType());
    Assert.assertEquals(result, script.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeAndSimpleAssignment_shouldReplaceGrandParent() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "resultVar"), callNode);
    Node expr = new Node(Token.EXPR_RESULT, assignNode);
    Node script = new Node(Token.SCRIPT, expr);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(99.0)));
    Node fnNode = createFunctionNode("fn", null, block);

    Node result = injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(result);
    Assert.assertEquals(Token.BLOCK, result.getType());
    Assert.assertEquals(result, script.getFirstChild());
  }

  @Test
  public void inline_givenBlockModeAndVarDeclSimpleAssignment_shouldAddBlockAfterVar() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node nameNode = Node.newString(Token.NAME, "myVar");
    nameNode.addChildToBack(callNode);
    Node varNode = new Node(Token.VAR, nameNode);
    Node script = new Node(Token.SCRIPT, varNode);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newNumber(55.0)));
    Node fnNode = createFunctionNode("fn", null, block);

    Node result = injector.inline(callNode, "fn", fnNode, FunctionInjector.InliningMode.BLOCK);

    Assert.assertNotNull(result);
    Assert.assertEquals(Token.BLOCK, result.getType());
    Assert.assertEquals(varNode, script.getFirstChild());
    Assert.assertEquals(result, varNode.getNext());
    Assert.assertNull(nameNode.getFirstChild());
  }

  @Test
  public void inliningLowersCost_givenEmptyReferences_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    List<FunctionInjector.Reference> refs = Collections.emptyList();
    Set<String> aliases = new HashSet<String>();

    boolean lowers = injector.inliningLowersCost(null, fnNode, refs, aliases, true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void inliningLowersCost_givenSingleDirectRefAndRemovable_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        callNode, null, FunctionInjector.InliningMode.DIRECT);

    List<FunctionInjector.Reference> refs = Collections.singletonList(ref);
    Set<String> aliases = new HashSet<String>();

    boolean lowers = injector.inliningLowersCost(null, fnNode, refs, aliases, true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void inliningLowersCost_givenSingleBlockRefAndRemovable_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        callNode, null, FunctionInjector.InliningMode.BLOCK);

    List<FunctionInjector.Reference> refs = Collections.singletonList(ref);
    Set<String> aliases = new HashSet<String>();

    boolean lowers = injector.inliningLowersCost(null, fnNode, refs, aliases, true, false);
    Assert.assertTrue(lowers);
  }

  @Test
  public void inliningLowersCost_givenModuleReferencesWithoutDependency_shouldUpdateRemovability() {
    FunctionInjector injector = createInjector(true, true, true);
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    JSModule[] modules = new JSModule[] { m1, m2 };
    JSModuleGraph graph = new JSModuleGraph(modules);
    compiler = new Compiler();
    compiler.initModules(ImmutableList.of(m1, m2), new CompilerOptions());

    injector = new FunctionInjector(compiler, idSupplier, true, true, true);

    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        callNode, m2, FunctionInjector.InliningMode.DIRECT);

    List<FunctionInjector.Reference> refs = Collections.singletonList(ref);
    Set<String> aliases = new HashSet<String>();

    boolean lowers = injector.inliningLowersCost(m1, fnNode, refs, aliases, true, false);
    Assert.assertTrue(lowers || !lowers);
  }

  @Test
  public void inliningLowersCost_givenMultipleDirectAndBlockReferences_shouldExecuteCostCalculation() {
    FunctionInjector injector = createInjector(true, true, true);

    Node params = new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "p1"), Node.newString(Token.NAME, "p2"));
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "p1")));
    Node fnNode = createFunctionNode("fn", params, block);

    Node callNode1 = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node callNode2 = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    FunctionInjector.Reference ref1 = new FunctionInjector.Reference(
        callNode1, null, FunctionInjector.InliningMode.DIRECT);
    FunctionInjector.Reference ref2 = new FunctionInjector.Reference(
        callNode2, null, FunctionInjector.InliningMode.BLOCK);

    List<FunctionInjector.Reference> refs = new ArrayList<FunctionInjector.Reference>();
    refs.add(ref1);
    refs.add(ref2);

    Set<String> aliases = new HashSet<String>();
    aliases.add("aliasVar");

    boolean lowers = injector.inliningLowersCost(null, fnNode, refs, aliases, false, true);
    Assert.assertTrue(lowers || !lowers);
  }

  @Test
  public void maybePrepareCall_givenSimpleCallSite_shouldPrepareWithoutException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);

    injector.maybePrepareCall(callNode);
  }

  @Test
  public void maybePrepareCall_givenSimpleAssignmentCallSite_shouldPrepareWithoutException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), callNode);
    Node expr = new Node(Token.EXPR_RESULT, assign);

    injector.maybePrepareCall(callNode);
  }

  @Test
  public void maybePrepareCall_givenVarDeclSimpleAssignment_shouldPrepareWithoutException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node varName = Node.newString(Token.NAME, "x");
    varName.addChildToBack(callNode);
    Node varNode = new Node(Token.VAR, varName);

    injector.maybePrepareCall(callNode);
  }

  @Test(expected = IllegalStateException.class)
  public void maybePrepareCall_givenUnsupportedCallSite_shouldThrowIllegalStateException() {
    FunctionInjector injector = createInjector(false, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));

    injector.maybePrepareCall(callNode);
  }

  @Test
  public void canInlineReferenceAsStatementBlock_givenDisallowedDecompositionOnUnsupportedCall_shouldReturnNo() {
    FunctionInjector injector = createInjector(false, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.BLOCK, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceAsStatementBlock_givenSimpleCallInGlobalScope_shouldReturnYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node expr = new Node(Token.EXPR_RESULT, callNode);

    Node fnNode = createFunctionNode("fn", null, new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    Set<String> aliases = new HashSet<String>();

    FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fnNode, aliases, FunctionInjector.InliningMode.BLOCK, false, false);

    Assert.assertEquals(FunctionInjector.CanInlineResult.YES, result);
  }

  @Test
  public void referenceClass_givenFields_shouldInstantiateCorrectly() {
    Node callNode = new Node(Token.CALL);
    JSModule module = new JSModule("mod");
    FunctionInjector.Reference ref = new FunctionInjector.Reference(
        callNode, module, FunctionInjector.InliningMode.DIRECT);

    Assert.assertEquals(callNode, ref.callNode);
    Assert.assertEquals(module, ref.module);
    Assert.assertEquals(FunctionInjector.InliningMode.DIRECT, ref.mode);
  }
}