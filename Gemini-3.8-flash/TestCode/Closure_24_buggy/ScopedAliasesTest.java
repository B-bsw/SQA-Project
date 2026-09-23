package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ScopedAliasesTest {

  private Compiler compiler;
  private PreprocessorSymbolTable symbolTable;
  private AliasTransformationHandler transformationHandler;
  private ScopedAliases scopedAliases;

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      return new AliasTransformation() {
        @Override
        public void addAlias(String alias, String original) {
          // no-op
        }
      };
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    symbolTable = new PreprocessorSymbolTable();
    transformationHandler = new TestAliasTransformationHandler();
    scopedAliases = new ScopedAliases(compiler, symbolTable, transformationHandler);
  }

  @Test
  public void testProcessNoAliases() {
    String code = "var x = 1;";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessSimpleAlias() {
    String code = "goog.scope(function() { var dom = goog.dom; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    // After processing, the alias should be removed and scope collapsed.
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessAliasUsedInExpression() {
    String code = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessNestedAlias() {
    String code = "goog.scope(function() { var g = goog; var d = g.dom; d.createElement('div'); });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessMultipleAliases() {
    String code = "goog.scope(function() { var a = x; var b = y; use(a, b); });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessAliasRedefined() {
    String code = "goog.scope(function() { var a = x; var a = y; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessNonAliasLocal() {
    String code = "goog.scope(function() { var x = 1; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessReturnStatement() {
    String code = "goog.scope(function() { function f() { return 1; } });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessThisReference() {
    String code = "goog.scope(function() { var self = this; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessThrowStatement() {
    String code = "goog.scope(function() { throw new Error('x'); });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessBadScopeCallSyntax() {
    String code = "goog.scope(1);";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testProcessBadParameters() {
    String code = "goog.scope(function(x) { var a = x; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testHotSwapScript() {
    String code = "var x = 1;";
    Node root = parse(code);
    scopedAliases.hotSwapScript(root, null);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testEnterScopeNotScopeMethod() {
    // Not a scope method, should not be processed.
    String code = "function foo() { var x = 1; }";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testExitScopeDepthTwo() {
    String code = "goog.scope(function() { var a = x; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testIsCallToScopeMethod() throws Exception {
    String code = "function goog() {} goog.scope = function() {}; goog.scope(function() {});";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testGetSourceRegion() throws Exception {
    String code = "var x = 1;";
    Node root = parse(code);
    Node n = root.getFirstChild();
    scopedAliases.process(null, root);
    assertNotNull(n);
  }

  @Test
  public void testFixTypeNode() throws Exception {
    String code = "var x = 1;";
    Node root = parse(code);
    scopedAliases.process(null, root);
    // Should not throw.
  }

  @Test
  public void testFindAliasesWithQualifiedName() throws Exception {
    String code = "goog.scope(function() { var a = goog.b.c; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testVisitNameWithAlias() throws Exception {
    String code = "goog.scope(function() { var a = x; a.b; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testVisitNameWithoutAlias() throws Exception {
    String code = "var x = 1;";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testAliasedNodeGetQualifiedName() throws Exception {
    String code = "goog.scope(function() { var a = goog.b.c.d; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testTraversalShouldTraverseFunctionInGlobalScope() throws Exception {
    String code = "function foo() { var x = 1; }";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testTraversalShouldTraverseGoogScopeFunction() throws Exception {
    String code = "goog.scope(function() { var x = 1; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testValidateScopeCallWithPreprocessorSymbolTable() throws Exception {
    String code = "goog.scope(function() { var a = x; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    // Should not throw NPE.
  }

  @Test
  public void testApplyAliasWithAliasedNode() throws Exception {
    String code = "goog.scope(function() { var a = x; a.b; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testApplyAliasWithAliasedTypeNode() throws Exception {
    String code = "goog.scope(function() { var a = x; /** @type {a.b} */ var y; });";
    Node root = parse(code);
    scopedAliases.process(null, root);
    assertEquals(0, root.getChildCount());
  }

  private Node parse(String code) {
    compiler.init(new String[] {""}, new String[] {code});
    Node root = compiler.parseInputs();
    compiler.getErrors();
    return root;
  }
}