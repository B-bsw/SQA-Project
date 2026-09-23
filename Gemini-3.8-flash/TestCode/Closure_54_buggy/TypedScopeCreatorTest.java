package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TypedScopeCreatorTest extends BaseJSTypeTestCase {
  private static final String EXTERNS = "var window = {}; window.Math = {}; var Math = window.Math;";
  private static final String CODE = "var x = 1; function f() { return x + 1; } var y = f();";
  private static final String ENUM_CODE = "/** @enum {number} */ var Color = {RED: 1, GREEN: 2, BLUE: 3}; var c = Color.RED;";
  private static final String CONSTRUCTOR_CODE = "/** @constructor */ function Foo() {} var foo = new Foo();";
  private static final String INTERFACE_CODE = "/** @interface */ function Bar() {}";
  private static final String LENDS_CODE = "/** @lends {Foo.prototype} */ var x = {};";
  private static final String TYPEDEF_CODE = "/** @typedef {number|string} */ var MyType; var a = 1;";
  private static final String DELEGATE_CODE = "var Delegator = function() {}; Delegator.prototype.delegate = function() {}; var obj = new Delegator();";
  private static final String OBJECT_LITERAL_CODE = "var obj = {a: 1, b: 2};";
  private static final String FUNCTION_TYPE_CODE = "/** @type {function(number): string} */ var f; function g() { return f(1); }";

  private static final String EXTERNS_WITH_WINDOW = "var window = {}; window.Math = {}; var Math = window.Math;";
  private Compiler compiler;
  private TypedScopeCreator creator;
  private TestErrorReporter errorReporter;

  @Before
  public void setUp() {
    compiler = new Compiler();
    errorReporter = new TestErrorReporter(null, null);
    compiler.initOptions(new CompilerOptions());
    compiler.getOptions().setLanguageIn(LanguageMode.ECMASCRIPT3);
    compiler.getOptions().setIdeMode(true);
    creator = new TypedScopeCreator(compiler);
  }

  private Node parseAndGetRoot(String code) {
    return parseAndGetNode(code);
  }

  private Node parseAndGetNode(String code) {
    Node root = compiler.parseTestCode(code);
    if (root == null) {
      fail("Failed to parse code: " + code);
    }
    return root;
  }

  private void assertScopeForCode(String code, String externs) {
    Node root = parseAndGetNode(code);
    Node externsRoot = parseAndGetNode(externs);
    Scope globalScope = creator.createScope(externsRoot, null);
    assertNotNull(globalScope);
    assertTrue(globalScope.isGlobal());
  }

  private void assertScopeForCodeWithExterns(String code, String externs) {
    Node root = parseAndGetNode(externs + " " + code);
    Node externsRoot = parseAndGetNode(externs);
    Scope globalScope = creator.createScope(externsRoot, null);
    assertNotNull(globalScope);
    assertTrue(globalScope.isGlobal());
  }

  @Test
  public void testCreateScopeWithValidCode() {
    assertScopeForCode(CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithEnum() {
    assertScopeForCode(ENUM_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithConstructor() {
    assertScopeForCode(CONSTRUCTOR_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithInterface() {
    assertScopeForCode(INTERFACE_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithLends() {
    assertScopeForCode(LENDS_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithTypedef() {
    assertScopeForCode(TYPEDEF_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithDelegate() {
    assertScopeForCode(DELEGATE_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithObjectLiteral() {
    assertScopeForCode(OBJECT_LITERAL_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithFunctionType() {
    assertScopeForCode(FUNCTION_TYPE_CODE, EXTERNS);
  }

  @Test
  public void testCreateScopeWithExternsOnly() {
    assertScopeForCode("", EXTERNS);
  }

  @Test
  public void testCreateScopeWithNullParent() {
    Node root = parseAndGetNode(CODE);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithNonNullParent() {
    Node root = parseAndGetNode(CODE);
    Node externsRoot = parseAndGetNode(EXTERNS);
    Scope globalScope = creator.createScope(externsRoot, null);
    Scope localScope = creator.createScope(root, globalScope);
    assertNotNull(localScope);
    assertFalse(localScope.isGlobal());
  }

  @Test
  public void testCreateScopeWithEmptyCode() {
    assertScopeForCode("", EXTERNS);
  }

  @Test
  public void testCreateScopeWithNullCode() {
    try {
      creator.createScope(null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testCreateScopeWithVarDeclartion() {
    Node root = parseAndGetNode("var a;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithFunctionDeclartion() {
    Node root = parseAndGetNode("function f() {}");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithCatchBlock() {
    Node root = parseAndGetNode("try { throw 'x'; } catch (e) { var x = 1; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithThis() {
    Node root = parseAndGetNode("var x = this;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithGetProp() {
    Node root = parseAndGetNode("var x = this.foo;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithGlobalThis() {
    Node root = parseAndGetNode("var x = this;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("x"));
  }

  @Test
  public void testCreateScopeWithGetPropOnGlobalThis() {
    Node root = parseAndGetNode("this.foo = 1;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithCatchVar() {
    Node root = parseAndGetNode("try { throw 'x'; } catch (e) { var x; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertTrue(scope.isDeclared("e", false));
  }

  @Test
  public void testCreateScopeWithEnumInObjectLiteral() {
    Node root = parseAndGetNode("/** @enum {number} */ var E = {A: 1, B: 2}; var x = E.A;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithLendsOnObjectLiteral() {
    Node root = parseAndGetNode("/** @lends {Foo.prototype} */ var x = {bar: function(){}};");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithTypedefInObjectLiteral() {
    Node root = parseAndGetNode("/** @typedef {string} */ var T; var obj = {f: function(){}};");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithEnumType() {
    Node root = parseAndGetNode(ENUM_CODE);
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    Var colorVar = scope.getVar("Color");
    assertNotNull(colorVar);
    JSType type = colorVar.getType();
    assertNotNull(type);
    assertTrue(type instanceof EnumType);
  }

  @Test
  public void testCreateScopeWithConstructorType() {
    Node root = parseAndGetNode(CONSTRUCTOR_CODE);
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    Var fooVar = scope.getVar("Foo");
    assertNotNull(fooVar);
    JSType type = fooVar.getType();
    assertNotNull(type);
    assertTrue(type.isConstructor());
  }

  @Test
  public void testCreateScopeWithInterfaceType() {
    Node root = parseAndGetNode(INTERFACE_CODE);
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    Var barVar = scope.getVar("Bar");
    assertNotNull(barVar);
    JSType type = barVar.getType();
    assertNotNull(type);
    assertTrue(type.isInterface());
  }

  @Test
  public void testCreateScopeWithMultipleVarDeclarations() {
    Node root = parseAndGetNode("var a, b = 1, c = 2;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
  }

  @Test
  public void testCreateScopeWithNestedFunction() {
    Node root = parseAndGetNode("function outer() { function inner() {} }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithObjectLiteralNested() {
    Node root = parseAndGetNode("var obj = {a: {b: {c: 1}}};");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithArrayLiteral() {
    Node root = parseAndGetNode("var arr = [1, 2, 3];");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithRegExpLiteral() {
    Node root = parseAndGetNode("var re = /abc/;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithBooleanLiteral() {
    Node root = parseAndGetNode("var b = true;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithNullLiteral() {
    Node root = parseAndGetNode("var n = null;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithStringLiteral() {
    Node root = parseAndGetNode("var s = 'string';");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithNumberLiteral() {
    Node root = parseAndGetNode("var num = 123;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithFunctionCall() {
    Node root = parseAndGetNode("var f = function() { return 1; }; var x = f();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithNewExpression() {
    Node root = parseAndGetNode("var f = function() {}; var obj = new f();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithTypeCast() {
    Node root = parseAndGetNode("var x = /** @type {number} */ (1);");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithTemplateLit() {
    Node root = parseAndGetNode("var s = `hello ${'world'}`;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithArrowFunction() {
    Node root = parseAndGetNode("var f = (x) => x + 1; var y = f(1);");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithClassDeclaration() {
    Node root = parseAndGetNode("class Foo { constructor() {} } var foo = new Foo();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithComputedProp() {
    Node root = parseAndGetNode("var obj = { [computed]: 1 };");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithDefaultParam() {
    Node root = parseAndGetNode("function foo(a = 1) {} foo();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithRestParam() {
    Node root = parseAndGetNode("function foo(...args) {} foo();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithSpread() {
    Node root = parseAndGetNode("var arr = [1, 2, 3]; var x = [...arr];");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithAsyncFunction() {
    Node root = parseAndGetNode("async function foo() { return 1; } foo();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithAwait() {
    Node root = parseAndGetNode("async function foo() { await bar(); }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithGenerator() {
    Node root = parseAndGetNode("function* gen() { yield 1; } gen();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithYield() {
    Node root = parseAndGetNode("function* gen() { var x = yield 1; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithForOfLoop() {
    Node root = parseAndGetNode("var arr = [1, 2, 3]; for (var x of arr) { var y = x; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithForInLoop() {
    Node root = parseAndGetNode("var obj = {a: 1, b: 2}; for (var x in obj) { var y = x; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithWhileLoop() {
    Node root = parseAndGetNode("var i = 0; while (i < 10) { var x = i; i++; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithDoWhileLoop() {
    Node root = parseAndGetNode("var i = 0; do { var x = i; i++; } while (i < 10);");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithSwitchCase() {
    Node root = parseAndGetNode("var x = 1; switch (x) { case 1: var y = 2; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithTryCatchFinally() {
    Node root = parseAndGetNode("var x = 1; try { var y = 2; } catch (e) { var z = 3; } finally { var w = 4; }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithNestedLoops() {
    Node root = parseAndGetNode("for (var i = 0; i < 10; i++) { for (var j = 0; j < 10; j++) { var k = i + j; } }");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithExternedFunction() {
    Node root = parseAndGetNode("var x = foo();");
    Node externsRoot = parseAndGetNode("function foo() {}");
    Scope scope = creator.createScope(externsRoot, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithGlobalVarUsingWindow() {
    Node root = parseAndGetNode("var window = {}; window.foo = 1; var x = window.foo;");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateScopeWithDelegateInheritance() {
    Node root = parseAndGetNode("var Delegate = function() {}; Delegate.prototype.foo = function() {}; var Sub = function() {}; Sub.prototype = new Delegate(); var obj = new Sub(); obj.foo();");
    assertNotNull(root);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }
}