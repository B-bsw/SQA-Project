package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.testing.TestCompiler;
import com.google.javascript.jscomp.testing.TestCompilerPass;
import com.google.javascript.jscomp.testing.JSCompTestUtils;

public class ScopedAliasesTest {

  private Compiler compiler;
  private ScopedAliases pass;
  private Node root;
  private Node externs;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    pass = null;
    root = null;
    externs = null;
  }

  @After
  public void tearDown() throws Exception {
    compiler = null;
    pass = null;
    root = null;
    externs = null;
  }

  @Test
  public void testProcess_NoCallToGoogScope_NoAliases() {
    // Test that process with no goog.scope calls doesn't report errors
    String code = "var x = 1; var y = x + 2;";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    // Verify no errors are reported
    assertFalse(pass.hasErrors());
    // Verify code is unchanged
    String expected = "var x = 1; var y = x + 2;";
    String actual = compiler.toSource();
    assertEquals(expected, actual);
  }

  @Test
  public void testProcess_InvalidScopeCall_ImproperUse() {
    // Test non-expression statement goog.scope call
    String code = "if (true) goog.scope(function() {});";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_MissingParameters_NoArgs() {
    String code = "goog.scope();";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_TooManyParameters() {
    String code = "goog.scope(function() {}, function() {});";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_ReferenceToThis_Error() {
    String code = "goog.scope(function() { var x = this; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_ReturnStatement_Error() {
    String code = "goog.scope(function() { return 5; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_ThrowStatement_Error() {
    String code = "goog.scope(function() { throw new Error(); });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_ValidAlias_SimpleCase() {
    String code = "goog.scope(function() { var dom = goog.dom; var div = dom.createElement('DIV'); });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertFalse(pass.hasErrors());
  }

  @Test
  public void testProcess_AliasMultipleScopes() {
    String code = "goog.scope(function() { var dom = goog.dom; });" +
                  "goog.scope(function() { var x = foo.bar; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertFalse(pass.hasErrors());
  }

  @Test
  public void testProcess_AliasWithNamespaceShadowing() {
    String code = "var goog = {a: 1}; goog.scope(function() { var dom = goog.dom; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_AliasUsage_TransitiveReferences() {
    String code = "goog.scope(function() { var a = foo.bar; var b = a.baz; use(b); });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertFalse(pass.hasErrors());
  }

  @Test
  public void testProcess_AliasCycle_Detected() {
    String code = "goog.scope(function() { var x = y; var y = x; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_LocalVariableShadowsNamespace() {
    String code = "goog.scope(function() { var $jscomp = 5; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testTraversal_VisitNonScopeNode() {
    String code = "var x = 1;";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root.getFirstChild(), null);  // Visit vara declaration
    assertFalse(pass.hasErrors());
  }

  @Test
  public void testTraversal_VisitScopeCallAtDepthLessThan2() {
    String code = "goog.scope(function() {});";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root.getFirstChild(), null);
    assertTrue(pass.hasErrors());
  }

  @Test
  public void testProcess_ApplyAliasNoChildren() {
    String code = "goog.scope(function() { var a = b.c.d; });";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertFalse(pass.hasErrors());
  }

  @Test
  public void testProcess_AliasWithQualifiedName() {
    String code = "goog.scope(function() { var a = b; });" +
                  "use(a.c);";
    root = parseCode(code);
    ScopedAliases.Traversal traversal = pass.new Traversal();
    traversal.visit(compiler, root, null);
    assertFalse(pass.hasErrors());
  }

  private Node parseCode(String code) {
    CompilerOptions options = new CompilerOptions();
    options.setAliasTransformationHandler(CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    compiler.init(new Node(Token.EMPTY), new Node(Token.EMPTY), options);
    root = compiler.parseSyntheticCode("test.js", code);
    externs = new Node(Token.EMPTY);
    pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    return root;
  }
}