package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit Test Suite for RemoveUnusedVars.
 * Compatibility: Java 1.4 / Java 7 syntax (no diamonds, no lambdas).
 * Covers Happy Path, Boundary & Edge Cases, and Error / Exception Branches.
 */
public class RemoveUnusedVarsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
  }

  private Node parseAndNormalize(String js) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return root;
  }

  private void runPass(Node root, boolean removeGlobals, boolean preserveFnExprNames, boolean modifyCallSites) {
    Node externs = IR.root();
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, removeGlobals, preserveFnExprNames, modifyCallSites);
    pass.process(externs, root);
  }

  // =========================================================================
  // Phase 1: Error & Exception Branches
  // =========================================================================

  @Test(expected = IllegalStateException.class)
  public void process_givenNotNormalizedLifeCycleStage_shouldThrowIllegalStateException() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.RAW);
    Node root = parseAndNormalize("var x = 1;");
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
    pass.process(IR.root(), root);
  }

  @Test(expected = NullPointerException.class)
  public void process_givenNullDefFinderWhenModifyCallSitesTrue_shouldThrowNullPointerException() {
    Node root = parseAndNormalize("var x = 1;");
    RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, true);
    pass.process(IR.root(), root, null);
  }

  // =========================================================================
  // Phase 2: Happy Path - Basic Variable & Function Removal
  // =========================================================================

  @Test
  public void process_givenUnusedLocalVar_shouldRemoveVar() {
    String js = "function f() { var unused = 1; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("unused"));
  }

  @Test
  public void process_givenReferencedLocalVar_shouldKeepVar() {
    String js = "function f() { var used = 1; return used; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("used"));
  }

  @Test
  public void process_givenUnusedGlobalVar_whenRemoveGlobalsFalse_shouldKeepGlobalVar() {
    String js = "var unusedGlobal = 1;";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("unusedGlobal"));
  }

  @Test
  public void process_givenUnusedGlobalVar_whenRemoveGlobalsTrue_shouldRemoveGlobalVar() {
    String js = "var unusedGlobal = 1;";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("unusedGlobal"));
  }

  @Test
  public void process_givenUnusedGlobalFunction_whenRemoveGlobalsTrue_shouldRemoveFunction() {
    String js = "function unusedFn() { return 42; }";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("unusedFn"));
  }

  @Test
  public void process_givenUnusedLocalFunction_shouldRemoveFunction() {
    String js = "function outer() { function inner() {} return 1; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("inner"));
  }

  // =========================================================================
  // Phase 3: Function Arguments & Signature Modification
  // =========================================================================

  @Test
  public void process_givenUnusedTrailingFunctionArg_shouldRemoveTrailingArg() {
    String js = "function f(a, unusedLast) { return a; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("function f(a)"));
    Assert.assertFalse(result.contains("unusedLast"));
  }

  @Test
  public void process_givenUnusedLeadingArgWithoutModifyCallSites_shouldRetainLeadingArg() {
    String js = "function f(unusedFirst, b) { return b; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("unusedFirst"));
  }

  @Test
  public void process_givenArgumentsIdentifierInFunction_shouldRetainAllArgs() {
    String js = "function f(a, b) { return arguments[0]; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("a"));
    Assert.assertTrue(result.contains("b"));
  }

  // =========================================================================
  // Phase 4: Function Expression Names Preservation
  // =========================================================================

  @Test
  public void process_givenNamedFunctionExpression_whenPreserveNamesFalse_shouldStripName() {
    String js = "var f = function fnName() {};";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("fnName"));
  }

  @Test
  public void process_givenNamedFunctionExpression_whenPreserveNamesTrue_shouldKeepName() {
    String js = "var f = function fnName() {};";
    Node root = parseAndNormalize(js);

    runPass(root, false, true, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("fnName"));
  }

  // =========================================================================
  // Phase 5: Side Effects & Multiple Declarations
  // =========================================================================

  @Test
  public void process_givenUnusedVarWithSideEffectInitialValue_shouldPreserveSideEffect() {
    String js = "function f() { var x = sideEffect(); }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("var x"));
    Assert.assertTrue(result.contains("sideEffect()"));
  }

  @Test
  public void process_givenMultiVarDeclarationWithUnusedVar_shouldRemoveOnlyUnused() {
    String js = "function f() { var x = 1, y = 2; return x; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("x"));
    Assert.assertFalse(result.contains("y"));
  }

  @Test
  public void process_givenForInLoopVariable_shouldNotBeRemoved() {
    String js = "function f(obj) { var prop; for (prop in obj) {} }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("prop"));
  }

  // =========================================================================
  // Phase 6: Assignments, Properties, and Secondary Side Effects
  // =========================================================================

  @Test
  public void process_givenUnusedVarWithSimpleAssign_shouldRemoveAssign() {
    String js = "function f() { var x; x = 1; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("x"));
  }

  @Test
  public void process_givenUnusedVarWithPropertyAssignOnEscapedVar_shouldMarkReferenced() {
    String js = "function f(unknown) { var x = unknown; x.prop = 123; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("x"));
    Assert.assertTrue(result.contains("x.prop = 123"));
  }

  @Test
  public void process_givenUnusedVarWithAliasedAssign_shouldRetainAssignmentExpression() {
    String js = "function f() { var x; var y = (x = 2); return y; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("var x"));
    Assert.assertTrue(result.contains("var y = 2"));
  }

  @Test
  public void process_givenUnusedVarWithElementAssignSideEffect_shouldPreserveElementEvaluation() {
    String js = "function f() { var x = {}; x[sideEffect()] = 1; }";
    Node root = parseAndNormalize(js);

    runPass(root, false, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("sideEffect()"));
  }

  // =========================================================================
  // Phase 7: Optimization With ModifyCallSites Enabled
  // =========================================================================

  @Test
  public void process_givenModifyCallSites_shouldOptimizeUnusedArguments() {
    String js = "function f(a, b) { return a; } f(1, 2);";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, true);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("b"));
    Assert.assertTrue(result.contains("f(1)"));
  }

  @Test
  public void process_givenModifyCallSitesWithSideEffectArg_shouldPreserveArgOrReplace() {
    String js = "function f(a, b) { return a; } f(1, sideEffect());";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, true);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("sideEffect()"));
  }

  @Test
  public void process_givenModifyCallSitesAndUnusedMiddleArg_shouldReplaceUnusedArgWithZero() {
    String js = "function f(a, b, c) { return a + c; } f(1, 2, 3);";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, true);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("f(1, 0, 3)") || result.contains("f(1,0,3)"));
  }

  // =========================================================================
  // Phase 8: Coding Convention & Class Defining Calls
  // =========================================================================

  @Test
  public void process_givenInheritsCallForUnusedClass_whenRemoveGlobalsTrue_shouldRemoveCallAndClass() {
    String js = "function SuperClass() {} function SubClass() {} goog.inherits(SubClass, SuperClass);";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, false);

    String result = compiler.toSource(root);
    Assert.assertFalse(result.contains("SubClass"));
    Assert.assertFalse(result.contains("goog.inherits"));
  }

  @Test
  public void process_givenExportedSymbol_shouldNotBeRemoved() {
    String js = "var _exportedVar = 10;";
    Node root = parseAndNormalize(js);

    runPass(root, true, false, false);

    String result = compiler.toSource(root);
    Assert.assertTrue(result.contains("_exportedVar"));
  }

  @Test
  public void process_givenEmptyRootNode_shouldCompleteWithoutError() {
    Node root = parseAndNormalize("");
    runPass(root, true, true, true);
    Assert.assertNotNull(root);
  }
}