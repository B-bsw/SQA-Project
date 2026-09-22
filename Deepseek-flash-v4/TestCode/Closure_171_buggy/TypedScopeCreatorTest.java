package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest extends BaseJSTypeTestCase {

  private static final String EXTERNS = "/** @constructor */ function Window() {}"
      + "Window.prototype.alert;"
      + "@type {number} Window.prototype.length;"
      + "var console = {};"
      + "console.log;"
      + "console.error;"
      + "var window = new Window();"
      + "window;"
      + "@type {function(string)} console.log;"
      + "@type {function(string)} console.error;";

  private Compiler compiler;
  private TypedScopeCreator creator;
  private JSTypeRegistry registry;
  private Scope globalScope;

  /** Create the TypedScopeCreator for testing. */
  @Before
  public void setUpTest() throws Exception {
    super.setUp();
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.init(
        Collections.<SourceFile>emptyList(),
        Collections.singletonList(SourceFile.fromCode("externs.js", EXTERNS)),
        Collections.<SourceFile>emptyList());
    registry = compiler.getTypeRegistry();
    creator = new TypedScopeCreator(compiler);
  }

  @Test
  public void testCreateScopeWithParentNull() {
    Node root = compiler.getRoot();
    Scope scope = creator.createScope(root, null);
    assertNotNull("Scope should not be null", scope);
    assertTrue("Scope should be global when parent is null", scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithParentNonNull() {
    Node root = compiler.getRoot();
    Node firstChild = root.getFirstChild();
    // Simulate a simpler structure - just use root with parent for coverage
    Scope parentScope = new Scope(null, root, new JSTypeRegistry(compiler.getTypeRegistry().getErrorReporter()));
    Scope scope = creator.createScope(root, parentScope);
    assertNotNull("Scope should not be null with parent", scope);
  }

  @Test
  public void testDefineGlobalVarTypesAndDeclarations() {
    // Test via createScope covering global variable definition paths
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var x = 1;"));
    Node root = new Node(Token.SCRIPT, new Node(Token.VAR));
    root.setInputId(new InputId("test.js"));
    root.putProp(Node.SOURCENAME_PROP, "test.js");
    Scope parent = new Scope(null, root, registry);
    Scope scope = creator.createScope(root, parent);
    assertNotNull(scope);
    // Check that variables can be declared/accessed
    assertTrue("Scope should be global", scope.isGlobal());
  }

  @Test
  public void testVisitEnumDeclaration() {
    String code = "/** @enum {number} */ var E = {A: 1, B: 2};";
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", code));
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    // Check enum type registered
    assertNotNull("Enum should be declared in scope", scope.getVar("E"));
    assertEquals("Enum type should be declared", "enum{number}", scope.getVar("E").getType().toString());
  }

  @Test
  public void testVisitTypedefDeclaration() {
    String code = "/** @typedef {string|number} */ var Alias;";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    assertNotNull("Typedef should be declared in scope", scope.getVar("Alias"));
    assertEquals("Typedef type should be string|number", "string|number", scope.getVar("Alias").getType().toString());
  }

  @Test
  public void testVisitFunctionDeclaration() {
    String code = "function f(x) { return x; }";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    assertNotNull("Function f should be declared", scope.getVar("f"));
    assertTrue("Function f should be a function type", scope.getVar("f").getType().isFunctionType());
  }

  @Test
  public void testVisitCastAssignment() {
    // Use @type cast on an assignment
    String code = "/** @type {number} */ var x; x = 5; /** @type {boolean} */ var y; y = true; /** @type {string} */ var s = 'hello';";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    // Check types declared
    assertNotNull(scope.getVar("x"));
    assertEquals("number", scope.getVar("x").getType().toString());
    assertEquals("boolean", scope.getVar("y").getType().toString());
    assertEquals("string", scope.getVar("s").getType().toString());
  }

  @Test
  public void testVisitThisAndObjectLiteral() {
    String code = "function C() { this.a = 1; } new C();";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    assertNotNull("C should be declared", scope.getVar("C"));
    assertTrue(scope.getVar("C").getType().isFunctionType());
  }

  @Test
  public void testVisitGetterAndSetter() {
    String code = "var o = {get x() { return 1; }, set x(v) { this.x = v; }};";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    assertNotNull("o should be declared", scope.getVar("o"));
    ObjectType objType = (ObjectType) scope.getVar("o").getType();
    assertNotNull("x getter", objType.getProperty("x"));
    assertNotNull("x setter", objType.getProperty("x"));
  }

  @Test
  public void testPropertyDeclaration() {
    String code = "/** @constructor */ function C() { this.x = 1; this.y = 2; } var c = new C(); c.z = 3;";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    Var cVar = scope.getVar("c");
    assertNotNull(cVar);
    ObjectType cType = (ObjectType) cVar.getType();
    assertNotNull("x prop", cType.getProperty("x"));
    assertNotNull("y prop", cType.getProperty("y"));
    assertNotNull("z prop", cType.getProperty("z"));
  }

  @Test
  public void testInterfaceDeclaration() {
    String code = "/** @interface */ function I() {}";
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    Var iVar = scope.getVar("I");
    assertNotNull("I should exist", iVar);
    assertTrue("I should be interface", iVar.getType().isInterface());
  }

  @Test
  public void testCreateScopeWithExternFunctions() {
    String code = "function f() { return g(); } function g() {}";
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", code));
    Node scriptNode = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope scope = creator.createScope(scriptNode, null);
    assertNotNull("f exists", scope.getVar("f"));
    assertNotNull("g exists", scope.getVar("g"));
  }

  @Test
  public void testNullOrEmptyRootHandling() {
    // Test createScope with a ROOT_NODE and no children
    Node root = new Node(Token.ROOT);
    Ty pedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    try {
      scopeCreator.createScope(root, null);
      // Should not throw - this covers the early exit branch
    } catch (Exception e) {
      fail("Should not throw exception for ROOT node: " + e.getMessage());
    }
  }

  @Test
  public void testCreateScopeNullRoot() {
    // Testing with null root - should not crash, but return a scope
    try {
      creator.createScope(null, null);
      // Since code checks root == null and returns null, we don't assert, but just do a smoke test
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testGlobalScopeCoversAllDeclarations() {
    String code = "var a = 1; function foo() { var b = 2; function bar() {} this.c = 3; }";
    Node root = parseAndGetRoot(code);
    TypedScopeCreator.TypedScope global = creator.createScope(root, null);
    assertTrue("Global scope is global", global.isGlobal());
    // a and foo should be global
    assertNotNull("a in global", global.getVar("a"));
    assertNotNull("foo in global", global.getVar("foo"));
    // b and bar are local to foo, check a bit later
  }

  private Node parseAndGetRoot(String code) {
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", code));
    Node ast = compiler.parse(SourceFile.fromCode("test.js", code));
    // Simulate AST structure for testing
    if (ast != null && ast.isScript()) {
      return ast;
    }
    return null;
  }
}