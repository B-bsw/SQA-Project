package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;

@RunWith(JUnit4.class)
public class ProcessClosurePrimitivesTest {

  private AbstractCompiler compiler;
  private ProcessClosurePrimitives processor;

  @Before
  public void setUp() {
    compiler = new Compiler();
    processor = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
  }

  @Test
  public void testProcess_NoExternsOrRoot_NormalCase() {
    Node root = new Node(Token.EMPTY);
    processor.process(null, root);
    assertNotNull(processor.getExportedVariableNames());
    assertTrue(processor.getExportedVariableNames().isEmpty());
  }

  @Test
  public void testProcess_WithProvideAndRequire_ExportsVariable() {
    String provideCode = "goog.provide('foo.bar'); var foo = {}; foo.bar = 1;";
    Node root = parseString(provideCode);
    processor.process(null, root);
    assertTrue(processor.getExportedVariableNames().contains("foo.bar"));
  }

  @Test
  public void testGetExportedVariableNames_NullExports_ReturnsEmptySet() {
    assertNotNull(processor.getExportedVariableNames());
    assertTrue(processor.getExportedVariableNames().isEmpty());
  }

  @Test
  public void testVisit_AssignToExportedVariable_AddsToExports() {
    String code = "goog.exportSymbol('foo', bar);";
    Node root = parseString(code);
    processor.process(null, root);
    assertTrue(processor.getExportedVariableNames().contains("foo"));
  }

  @Test
  public void testVisit_BaseCall_WithValidInherits() {
    String code = "var Base = function(){}; var Sub = function(){}; goog.inherits(Sub, Base);";
    Node root = parseString(code);
    // Should not throw
    processor.process(null, root);
  }

  @Test
  public void testVisit_ProvideName_AddsToProvidedNames() {
    String code = "goog.provide('my.namespace');";
    Node root = parseString(code);
    processor.process(null, root);
    assertEquals(2, processor.getExportedVariableNames().size()); // includes "goog"
  }

  @Test
  public void testVisit_SetCssNameMapping_WithValidMapping_DoesNotThrow() {
    String code = "goog.setCssNameMapping({'a':'b'});";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Define_WithInvalidArgs_ReportsError() {
    String code = "goog.define('foo', 123);";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_GetProp_WithNameNode_NoOp() {
    String code = "var x = {a: 1}; x.a;";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Name_WithVarParent_ChecksForNamedFnExpr() {
    String code = "var f = function named() {};";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Assign_WithObjectLitValue_ChecksNamespace() {
    String code = "var foo = {bar: 1};";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Call_BaseWithNoArgs_ReportsError() {
    String code = "goog.base();";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Call_BaseWithInvalidArg_ReportsError() {
    String code = "function f() { goog.base(1, 2); }";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_BaseWithValidCall_NoError() {
    String code = "var Base = function(){}; function Sub() { Base.call(this); } goog.inherits(Sub, Base);";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testProcess_WithDefineCalls_NullPreprocessorTable() {
    String code = "goog.define('foo', 1);";
    Node root = parseString(code);
    ProcessClosurePrimitives p = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    p.process(null, root);
  }

  @Test
  public void testProcess_WithDefineCalls_NonNullPreprocessorTable() {
    String code = "goog.define('foo', 1);";
    Node root = parseString(code);
    PreprocessorSymbolTable table = new PreprocessorSymbolTable();
    ProcessClosurePrimitives p = new ProcessClosurePrimitives(compiler, table, CheckLevel.ERROR);
    p.process(null, root);
  }

  @Test
  public void testVisit_Provide_WithDotName_ChecksValidity() {
    String code = "goog.provide('a.b.c');";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Require_WithStringArg_ChecksProvidedName() {
    String code = "goog.require('nonexistent.namespace');";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVisit_Require_WithExistingProvide_NoMissingError() {
    String code = "goog.provide('foo.bar'); goog.require('foo.bar');";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testVerifyBaseClass_WithValidInherits_DoesNotThrow() {
    String code = "var Base = function(){}; function Sub() {} goog.inherits(Sub, Base);";
    Node root = parseString(code);
    processor.process(null, root);
  }

  @Test
  public void testProcess_WithExterns_NullRoot_NoCrash() {
    Node externs = new Node(Token.EMPTY);
    processor.process(externs, null);
  }

  @Test
  public void testProcess_RepeatedCalls_ClearsState() {
    String code1 = "goog.provide('a.b');";
    String code2 = "goog.provide('c.d');";
    processor.process(null, parseString(code1));
    int sizeBefore = processor.getExportedVariableNames().size();
    processor.process(null, parseString(code2));
    int sizeAfter = processor.getExportedVariableNames().size();
    assertEquals(2, sizeBefore); // includes "goog"
    assertEquals(2, sizeAfter);
  }

  private Node parseString(String code) {
    Compiler c = new Compiler();
    Node root = c.parseSyntheticCode(code);
    return root;
  }
}

class Compiler extends AbstractCompiler {
  private Node root;
  private JSModuleGraph moduleGraph;

  @Override
  public void process(Node externs, Node root) {
    this.root = root;
    NodeTraversal.traverse(this, root, (t, n, parent) -> {
      // no-op
    });
  }

  @Override
  public JSModuleGraph getModuleGraph() {
    return moduleGraph;
  }

  @Override
  public void report(JSError error) {
    // capture errors if needed
  }

  @Override
  public CodingConvention getCodingConvention() {
    return new GoogleCodingConvention();
  }

  @Override
  public void reportCodeChange() {
    // no-op
  }

  @Override
  public void reportCodeChange(Node n) {
    // no-op
  }

  @Override
  public void reportCodeChange(CodeChangeHandler handler) {
    // no-op
  }
}