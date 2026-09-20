package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
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
  private int idCounter;

  @Before
  public void setUp() {
    compiler = new Compiler();
    idCounter = 0;
    idSupplier = new Supplier<String>() {
      public String get() {
        return "id_" + (idCounter++);
      }
    };
  }

  private FunctionInjector createInjector(
      boolean allowDecomposition,
      boolean assumeStrictThis,
      boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler, idSupplier, allowDecomposition, assumeStrictThis, assumeMinimumCapture);
  }

  private Node createFunctionNode(String name, Node params, Node body) {
    Node nameNode = Node.newString(Token.NAME, name);
    return new Node(Token.FUNCTION, nameNode, params, body);
  }

  private Node createCallNode(String fnName) {
    return new Node(Token.CALL, Node.newString(Token.NAME, fnName));
  }

  // --------------------------------------------------------------------------
  // Constructor Tests
  // --------------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void constructor_nullCompiler_shouldThrowException() {
    new FunctionInjector(null, idSupplier, true, true, true);
  }

  @Test(expected = NullPointerException.class)
  public void constructor_nullSupplier_shouldThrowException() {
    new FunctionInjector(compiler, null, true, true, true);
  }

  @Test
  public void constructor_validParameters_shouldInstantiate() {
    FunctionInjector injector = createInjector(true, true, true);
    Assert.assertNotNull(injector);
  }

  // --------------------------------------------------------------------------
  // setKnownConstants Tests
  // --------------------------------------------------------------------------

  @Test
  public void setKnownConstants_emptyInitially_shouldSucceed() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants = new HashSet<String>();
    constants.add("CONST_A");
    injector.setKnownConstants(constants);
  }

  @Test(expected = IllegalStateException.class)
  public void setKnownConstants_calledTwiceWithNonEmpty_shouldThrowException() {
    FunctionInjector injector = createInjector(true, true, true);
    Set<String> constants1 = new HashSet<String>();
    constants1.add("CONST_A");
    injector.setKnownConstants(constants1);

    Set<String> constants2 = new HashSet<String>();
    constants2.add("CONST_B");
    injector.setKnownConstants(constants2);
  }

  // --------------------------------------------------------------------------
  // isDirectCallNodeReplacementPossible Tests
  // --------------------------------------------------------------------------

  @Test
  public void isDirectCallNodeReplacementPossible_emptyBody_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node body = new Node(Token.BLOCK);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.isDirectCallNodeReplacementPossible(fn);
    Assert.assertTrue(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_singleReturnWithChild_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(42.0));
    Node body = new Node(Token.BLOCK, returnNode);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.isDirectCallNodeReplacementPossible(fn);
    Assert.assertTrue(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_singleReturnWithoutChild_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node returnNode = new Node(Token.RETURN);
    Node body = new Node(Token.BLOCK, returnNode);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.isDirectCallNodeReplacementPossible(fn);
    Assert.assertFalse(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_multipleStatements_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node stmt1 = new Node(Token.EXPR_RESULT, Node.newNumber(1.0));
    Node stmt2 = new Node(Token.RETURN, Node.newNumber(2.0));
    Node body = new Node(Token.BLOCK, stmt1, stmt2);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.isDirectCallNodeReplacementPossible(fn);
    Assert.assertFalse(result);
  }

  @Test
  public void isDirectCallNodeReplacementPossible_singleNonReturnStmt_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node stmt1 = new Node(Token.EXPR_RESULT, Node.newNumber(1.0));
    Node body = new Node(Token.BLOCK, stmt1);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.isDirectCallNodeReplacementPossible(fn);
    Assert.assertFalse(result);
  }

  // --------------------------------------------------------------------------
  // doesFunctionMeetMinimumRequirements Tests
  // --------------------------------------------------------------------------

  @Test
  public void doesFunctionMeetMinimumRequirements_normalFunction_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node returnNode = new Node(Token.RETURN, Node.newString(Token.NAME, "x"));
    Node body = new Node(Token.BLOCK, returnNode);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fn);
    Assert.assertTrue(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_referencesArguments_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node returnNode = new Node(Token.RETURN, Node.newString(Token.NAME, "arguments"));
    Node body = new Node(Token.BLOCK, returnNode);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fn);
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_referencesEval_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"));
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, callEval));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fn);
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_recursiveCallByName_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node recursiveCall = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, recursiveCall));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fn);
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_recursiveCallByInnerName_shouldReturnFalse() {
    FunctionInjector injector = createInjector(true, true, true);
    Node recursiveCall = new Node(Token.CALL, Node.newString(Token.NAME, "innerName"));
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, recursiveCall));
    Node fn = createFunctionNode("innerName", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("outerAlias", fn);
    Assert.assertFalse(result);
  }

  @Test
  public void doesFunctionMeetMinimumRequirements_emptyFnName_shouldNotMatchEmpty() {
    FunctionInjector injector = createInjector(true, true, true);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(10.0));
    Node body = new Node(Token.BLOCK, returnNode);
    Node fn = createFunctionNode("", new Node(Token.PARAM_LIST), body);

    boolean result = injector.doesFunctionMeetMinimumRequirements("", fn);
    Assert.assertTrue(result);
  }

  // --------------------------------------------------------------------------
  // inliningLowersCost Tests
  // --------------------------------------------------------------------------

  @Test
  public void inliningLowersCost_emptyReferences_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    List<Reference> refs = Collections.emptyList();

    boolean result = injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), false, false);
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_singleDirectRemovableRef_shouldReturnTrue() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node call = createCallNode("foo");
    List<Reference> refs = new ArrayList<Reference>();
    refs.add(new Reference(call, null, InliningMode.DIRECT));

    boolean result = injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), true, false);
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_singleDirectNonRemovableRef_shouldCalculateCost() {
    FunctionInjector injector = createInjector(true, true, true);
    Node retNode = new Node(Token.RETURN, Node.newNumber(1.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));
    Node call = createCallNode("foo");
    List<Reference> refs = new ArrayList<Reference>();
    refs.add(new Reference(call, null, InliningMode.DIRECT));

    boolean result = injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), false, false);
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_blockInliningWithReturnAndAliases() {
    FunctionInjector injector = createInjector(true, true, true);
    Node retNode = new Node(Token.RETURN, Node.newNumber(1.0));
    Node fn = createFunctionNode(
        "foo",
        new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b")),
        new Node(Token.BLOCK, retNode));
    Node call = createCallNode("foo");
    List<Reference> refs = new ArrayList<Reference>();
    refs.add(new Reference(call, null, InliningMode.BLOCK));

    Set<String> aliases = Sets.newHashSet("a", "b");
    boolean result = injector.inliningLowersCost(
        null, fn, refs, aliases, true, true);
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_blockInliningEmptyBody_shouldCalculateProperly() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node call = createCallNode("foo");
    List<Reference> refs = new ArrayList<Reference>();
    refs.add(new Reference(call, null, InliningMode.BLOCK));

    boolean result = injector.inliningLowersCost(
        null, fn, refs, Sets.<String>newHashSet(), false, false);
    Assert.assertTrue(result);
  }

  @Test
  public void inliningLowersCost_crossModuleDependency_shouldHandleModules() {
    FunctionInjector injector = createInjector(true, true, true);
    JSModule mod1 = new JSModule("m1");
    JSModule mod2 = new JSModule("m2");
    JSModule[] modules = new JSModule[] { mod1, mod2 };
    JSModuleGraph graph = new JSModuleGraph(modules);
    compiler = new Compiler();
    compiler.initModules(java.util.Arrays.asList(modules), Collections.<SourceFile>emptyList(), new CompilerOptions());

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node call = createCallNode("foo");
    List<Reference> refs = new ArrayList<Reference>();
    refs.add(new Reference(call, mod2, InliningMode.DIRECT));

    FunctionInjector injectorWithGraph = new FunctionInjector(
        compiler, idSupplier, true, true, true);
    boolean result = injectorWithGraph.inliningLowersCost(
        mod1, fn, refs, Sets.<String>newHashSet(), true, false);
    Assert.assertTrue(result);
  }

  // --------------------------------------------------------------------------
  // canInlineReferenceToFunction Tests
  // --------------------------------------------------------------------------

  @Test
  public void canInlineReferenceToFunction_applyCall_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node fnProp = NodeUtil.newQualifiedNameNode(
        compiler.getCodingConvention(), "foo.apply", 0, 0);
    Node callNode = new Node(Token.CALL, fnProp, Node.newString(Token.NAME, "this"));

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_callObjectNonStrictWithoutThis_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, false, false);
    Node fnProp = NodeUtil.newQualifiedNameNode(
        compiler.getCodingConvention(), "foo.call", 0, 0);
    Node callNode = new Node(Token.CALL, fnProp, Node.newNumber(1.0));

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_callObjectNonStrictWithThis_shouldProceed() {
    FunctionInjector injector = createInjector(true, false, false);
    Node fnProp = NodeUtil.newQualifiedNameNode(
        compiler.getCodingConvention(), "foo.call", 0, 0);
    Node callNode = new Node(Token.CALL, fnProp, new Node(Token.THIS));

    Node retNode = new Node(Token.RETURN, Node.newNumber(1.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void canInlineReferenceToFunction_containsFunctionsNonGlobalScope_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, false);
    Node callNode = createCallNode("foo");
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

    Node callerFn = createFunctionNode("caller", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);
    t.traverse(callerFn);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_containsFunctionsInsideLoop_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    Node loop = new Node(Token.WHILE, Node.newNumber(1.0), new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, callNode)));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_referencesThisNotFunctionCall_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, true, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_directModeSideEffectArgs_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node incArg = new Node(Token.INC, Node.newString(Token.NAME, "i"));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"), incArg);

    Node retNode = new Node(Token.RETURN, Node.newNumber(1.0));
    Node fn = createFunctionNode(
        "foo",
        new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "p")),
        new Node(Token.BLOCK, retNode));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_directModeMutableStateMultiRef_shouldReturnNo() {
    FunctionInjector injector = createInjector(true, true, true);
    Node objLitArg = new Node(Token.OBJECTLIT);
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"), objLitArg);

    Node addNode = new Node(Token.ADD, Node.newString(Token.NAME, "p"), Node.newString(Token.NAME, "p"));
    Node retNode = new Node(Token.RETURN, addNode);
    Node fn = createFunctionNode(
        "foo",
        new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "p")),
        new Node(Token.BLOCK, retNode));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void canInlineReferenceToFunction_blockModeSimpleCall_shouldReturnYes() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);
    Node block = new Node(Token.BLOCK, exprResult);

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void canInlineReferenceToFunction_blockModeUnsupportedCallSite_shouldReturnNo() {
    FunctionInjector injector = createInjector(false, true, true);
    Node callNode = createCallNode("foo");
    Node add = new Node(Token.ADD, callNode, Node.newNumber(1.0));

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    NodeTraversal t = new NodeTraversal(compiler, null);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, callNode, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    Assert.assertEquals(CanInlineResult.NO, result);
  }

  // --------------------------------------------------------------------------
  // inline & inlineReturnValue & inlineFunction Tests
  // --------------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void inline_notNormalized_shouldThrowIllegalStateException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

    compiler.setLifeCycleStage(LifeCycleStage.RAW_INFERENCE);
    injector.inline(callNode, "foo", fn, InliningMode.DIRECT);
  }

  @Test
  public void inline_directModeEmptyBody_shouldReplaceWithUndefined() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node callNode = createCallNode("foo");
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);

    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(NodeUtil.isUndefined(inlined));
    Assert.assertEquals(inlined, exprResult.getFirstChild());
  }

  @Test
  public void inline_directModeReturnExpr_shouldReplaceWithReturnValue() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node callNode = createCallNode("foo");
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);

    Node retNode = new Node(Token.RETURN, Node.newNumber(123.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));

    Node inlined = injector.inline(callNode, "foo", fn, InliningMode.DIRECT);
    Assert.assertNotNull(inlined);
    Assert.assertTrue(inlined.isNumber());
    Assert.assertEquals(123.0, inlined.getDouble(), 0.0);
  }

  @Test
  public void inline_blockModeSimpleCall_shouldMutateAndReplace() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node callNode = createCallNode("foo");
    Node exprResult = new Node(Token.EXPR_RESULT, callNode);
    Node script = new Node(Token.SCRIPT, exprResult);

    Node retNode = new Node(Token.RETURN, Node.newNumber(1.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));

    Node newBlock = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(newBlock);
    Assert.assertTrue(newBlock.isBlock());
    Assert.assertEquals(newBlock, script.getFirstChild());
  }

  @Test
  public void inline_blockModeSimpleAssignment_shouldMutateAndReplace() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node callNode = createCallNode("foo");
    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), callNode);
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    Node script = new Node(Token.SCRIPT, exprResult);

    Node retNode = new Node(Token.RETURN, Node.newNumber(42.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));

    Node newBlock = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(newBlock);
    Assert.assertTrue(newBlock.isBlock());
    Assert.assertEquals(newBlock, script.getFirstChild());
  }

  @Test
  public void inline_blockModeVarDeclAssignment_shouldMutateAndInsertAfter() {
    FunctionInjector injector = createInjector(true, true, true);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    Node callNode = createCallNode("foo");
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToFront(callNode);
    Node varNode = new Node(Token.VAR, nameNode);
    Node script = new Node(Token.SCRIPT, varNode);

    Node retNode = new Node(Token.RETURN, Node.newNumber(99.0));
    Node fn = createFunctionNode("foo", new Node(Token.PARAM_LIST), new Node(Token.BLOCK, retNode));

    Node newBlock = injector.inline(callNode, "foo", fn, InliningMode.BLOCK);
    Assert.assertNotNull(newBlock);
    Assert.assertTrue(newBlock.isBlock());
    Assert.assertEquals(varNode, script.getFirstChild());
    Assert.assertEquals(newBlock, varNode.getNext());
  }

  // --------------------------------------------------------------------------
  // maybePrepareCall Tests
  // --------------------------------------------------------------------------

  @Test
  public void maybePrepareCall_simpleCall_shouldNoOp() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    Node expr = new Node(Token.EXPR_RESULT, callNode);
    Node script = new Node(Token.SCRIPT, expr);

    injector.maybePrepareCall(callNode);
    Assert.assertEquals(callNode, expr.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void maybePrepareCall_unsupportedCallSite_shouldThrowException() {
    FunctionInjector injector = createInjector(true, true, true);
    Node callNode = createCallNode("foo");
    // Call node without any valid structure for decomposition
    injector.maybePrepareCall(callNode);
  }
}