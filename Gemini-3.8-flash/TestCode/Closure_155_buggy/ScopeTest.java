package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ScopeTest {

  private static class TestCompiler extends AbstractCompiler {
    private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

    TestCompiler() {
      this.registry = new com.google.javascript.rhino.jstype.JSTypeRegistry();
    }

    @Override
    public com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry() {
      return registry;
    }

    @Override
    public CompilerInput getInput(String id) {
      return null;
    }

    @Override
    public CompilerInput newInput(String id, String source) {
      return null;
    }

    @Override
    public Node parseSyntheticCode(String code) {
      return null;
    }

    @Override
    public Node parseSyntheticCode(String code, String sourceName) {
      return null;
    }

    @Override
    public Node parseSyntheticCode(String code, String sourceName, boolean includeShebang) {
      return null;
    }

    @Override
    public Node parseSyntheticCode(String code, String sourceName, boolean includeShebang, boolean strictMode) {
      return null;
    }

    @Override
    public void report(com.google.javascript.jscomp.CheckLevel level, JSError error) {
    }
  }

  private Scope globalScope;
  private Scope localScope;
  private Node globalRoot;
  private Node functionRoot;
  private ObjectType thisType;
  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    globalRoot = new Node(Token.BLOCK);
    globalScope = new Scope(globalRoot, compiler);
    functionRoot = new Node(Token.FUNCTION);
    thisType = compiler.getTypeRegistry().getNativeObjectType(
        com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    localScope = new Scope(globalScope, functionRoot);
  }

  @Test
  public void testGlobalScopeInitialState() {
    assertNull(globalScope.getParent());
    assertTrue(globalScope.isGlobal());
    assertFalse(globalScope.isLocal());
    assertEquals(0, globalScope.getDepth());
    assertNotNull(globalScope.getTypeOfThis());
    assertEquals(0, globalScope.getVarCount());
    assertFalse(globalScope.isBottom());
    assertSame(globalRoot, globalScope.getRootNode());
    assertSame(globalScope, globalScope.getGlobalScope());
    assertNull(globalScope.getVar("nonexistent"));
    assertFalse(globalScope.isDeclared("nonexistent", true));
    assertFalse(globalScope.isDeclared("nonexistent", false));
  }

  @Test
  public void testLocalScopeInitialState() {
    assertSame(globalScope, localScope.getParent());
    assertFalse(localScope.isGlobal());
    assertTrue(localScope.isLocal());
    assertEquals(1, localScope.getDepth());
    assertNotNull(localScope.getTypeOfThis());
    assertEquals(0, localScope.getVarCount());
    assertFalse(localScope.isBottom());
    assertSame(functionRoot, localScope.getRootNode());
    assertSame(globalScope, localScope.getGlobalScope());
  }

  @Test
  public void testDeclareVariableNormal() {
    Node nameNode = new Node(Token.NAME, "x");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("x", nameNode, type, null);
    assertNotNull(var);
    assertEquals("x", var.getName());
    assertSame(type, var.getType());
    assertTrue(var.isTypeInferred());
    assertFalse(var.isDefine());
    assertFalse(var.isConst());
    assertFalse(var.isExtern());
    assertFalse(var.isGlobal());
    assertTrue(var.isLocal());
    assertFalse(var.isNoShadow());
    assertFalse(var.isBleedingFunction());
    assertSame(localScope, var.getScope());
    assertSame(nameNode, var.getNameNode());
    assertSame(nameNode.getParent(), var.getParentNode());
    assertEquals(1, localScope.getVarCount());
    assertSame(var, localScope.getVar("x"));
    assertSame(var, localScope.getSlot("x"));
    assertSame(var, localScope.getOwnSlot("x"));
    assertTrue(localScope.isDeclared("x", true));
    assertTrue(localScope.isDeclared("x", false));
  }

  @Test
  public void testDeclareVariableWithExplicitInferredFalse() {
    Node nameNode = new Node(Token.NAME, "y");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    Scope.Var var = localScope.declare("y", nameNode, type, null, false);
    assertFalse(var.isTypeInferred());
  }

  @Test
  public void testDeclareVariableWithNullNameNode() {
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
    Scope.Var var = localScope.declare("z", null, type, null);
    assertNull(var.getParentNode());
    assertNull(var.getInitialValue());
    assertNotNull(var.getNameNode());
  }

  @Test
  public void testDeclareVariableWithDefineInfo() {
    Node nameNode = new Node(Token.NAME, "defineVar");
    JSDocInfo info = new JSDocInfo();
    info.setDefine(true);
    NodeUtil.setInfoForNameNode(nameNode, info);
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
    Scope.Var var = localScope.declare("defineVar", nameNode, type, null);
    assertTrue(var.isDefine());
  }

  @Test
  public void testDeclareDuplicateVariableThrows() {
    Node nameNode = new Node(Token.NAME, "dup");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    localScope.declare("dup", nameNode, type, null);
    try {
      localScope.declare("dup", new Node(Token.NAME, "dup"), type, null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testDeclareEmptyNameThrows() {
    try {
      localScope.declare("", new Node(Token.NAME, ""), null, null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testDeclareNullNameThrows() {
    try {
      localScope.declare(null, new Node(Token.NAME, "asdf"), null, null);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testVarGetInitialValueFunction() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "fn");
    fnNode.addChildToFront(nameNode);
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_TYPE);
    Scope.Var var = localScope.declare("fn", nameNode, type, null);
    assertSame(fnNode, var.getInitialValue());
  }

  @Test
  public void testVarGetInitialValueAssign() {
    Node assignNode = new Node(Token.ASSIGN);
    Node nameNode = new Node(Token.NAME, "a");
    Node value = new Node(Token.NUMBER, 1.0);
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToBack(value);
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("a", nameNode, type, null);
    assertSame(value, var.getInitialValue());
  }

  @Test
  public void testVarGetInitialValueVar() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "v");
    Node value = new Node(Token.STRING, "hello");
    nameNode.addChildToFront(value);
    varNode.addChildToFront(nameNode);
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    Scope.Var var = localScope.declare("v", nameNode, type, null);
    assertSame(value, var.getInitialValue());
  }

  @Test
  public void testVarGetInitialValueNoMatch() {
    Node nameNode = new Node(Token.NAME, "other");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("other", nameNode, type, null);
    assertNull(var.getInitialValue());
  }

  @Test
  public void testVarIsBleedingFunction() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "bf");
    fnNode.addChildToFront(nameNode);
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_TYPE);
    Scope.Var var = localScope.declare("bf", nameNode, type, null);
    assertTrue(var.isBleedingFunction());
  }

  @Test
  public void testVarIsNotBleedingFunction() {
    Node nameNode = new Node(Token.NAME, "regular");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("regular", nameNode, type, null);
    assertFalse(var.isBleedingFunction());
  }

  @Test
  public void testUndeclare() {
    Node nameNode = new Node(Token.NAME, "temp");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("temp", nameNode, type, null);
    assertEquals(1, localScope.getVarCount());
    localScope.undeclare(var);
    assertEquals(0, localScope.getVarCount());
    assertNull(localScope.getOwnSlot("temp"));
  }

  @Test
  public void testUndeclareWrongScope() {
    Node nameNode = new Node(Token.NAME, "temp2");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = globalScope.declare("temp2", nameNode, type, null);
    try {
      localScope.undeclare(var);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testGetVarInParentScope() {
    Node nameNode = new Node(Token.NAME, "global");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = globalScope.declare("global", nameNode, type, null);
    Scope.Var found = localScope.getVar("global");
    assertSame(var, found);
    assertSame(var, localScope.getSlot("global"));
    assertNull(localScope.getOwnSlot("global"));
  }

  @Test
  public void testIsDeclaredRecurseTrue() {
    globalScope.declare("shared", new Node(Token.NAME, "shared"), null, null);
    assertTrue(localScope.isDeclared("shared", true));
    assertFalse(localScope.isDeclared("shared", false));
  }

  @Test
  public void testGetVarsIterator() {
    globalScope.declare("a", new Node(Token.NAME, "a"), null, null);
    globalScope.declare("b", new Node(Token.NAME, "b"), null, null);
    int count = 0;
    for (Scope.Var var : globalScope.getVars()) {
      assertNotNull(var);
      count++;
    }
    assertEquals(2, count);
  }

  @Test
  public void testGetVarsIteratorEmpty() {
    int count = 0;
    for (Scope.Var var : globalScope.getVars()) {
      count++;
    }
    assertEquals(0, count);
  }

  @Test
  public void testVarEquals() {
    Node nameNode = new Node(Token.NAME, "eq");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var1 = localScope.declare("eq", nameNode, type, null);
    Scope.Var var2 = localScope.getVar("eq");
    assertEquals(var1, var2);
    assertEquals(var1.hashCode(), var2.hashCode());
    assertEquals("Scope.Var eq", var1.toString());
  }

  @Test
  public void testVarNotEquals() {
    Node nameNode1 = new Node(Token.NAME, "ne1");
    Node nameNode2 = new Node(Token.NAME, "ne2");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var1 = localScope.declare("ne1", nameNode1, type, null);
    Scope.Var var2 = localScope.declare("ne2", nameNode2, type, null);
    assertFalse(var1.equals(var2));
    assertFalse(var1.equals(new Object()));
  }

  @Test
  public void testScopeEquals() {
    Scope otherLocal = new Scope(globalScope, new Node(Token.FUNCTION));
    assertTrue(localScope.equals(localScope));
    assertFalse(localScope.equals(otherLocal));
    assertFalse(localScope.equals(null));
    assertFalse(localScope.equals(new Object()));
  }

  @Test
  public void testDeclareVariableWithInput() {
    CompilerInput input = new CompilerInput(null);
    Scope.Var var = localScope.declare("withInput", new Node(Token.NAME, "withInput"), null, input);
    assertNotNull(var.getInputName());
  }

  @Test
  public void testVarGetInputNameNoInput() {
    Scope.Var var = localScope.declare("noInput", new Node(Token.NAME, "noInput"), null, null);
    assertEquals("<non-file>", var.getInputName());
  }

  @Test
  public void testVarIsExtern() {
    CompilerInput input = new CompilerInput(null);
    Scope.Var var = localScope.declare("ext", new Node(Token.NAME, "ext"), null, input);
    assertTrue(var.isExtern());
  }

  @Test
  public void testVarResolveType() {
    Node nameNode = new Node(Token.NAME, "resolved");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    final Scope.Var var = localScope.declare("resolved", nameNode, type, null);
    var.resolveType(new com.google.javascript.rhino.ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
      }
    });
    assertNotNull(var.getType());
  }

  @Test
  public void testVarSetTypeThrowsWhenNotInferred() {
    Node nameNode = new Node(Token.NAME, "declaredType");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("declaredType", nameNode, type, null, false);
    try {
      var.setType(compiler.getTypeRegistry().getNativeType(
          com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testVarSetTypeWorksWhenInferred() {
    Node nameNode = new Node(Token.NAME, "inferredType");
    JSType type = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    Scope.Var var = localScope.declare("inferredType", nameNode, type, null, true);
    var.setType(compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
    assertEquals(compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), var.getType());
  }

  @Test
  public void testBottomScopeCreation() {
    Node root = new Node(Token.BLOCK);
    ObjectType objType = compiler.getTypeRegistry().getNativeObjectType(
        com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    Scope bottom = new Scope(root, objType);
    assertTrue(bottom.isBottom());
    assertNotNull(bottom.getTypeOfThis());
  }

  @Test
  public void testLocalScopeConstructorWithFunctionType() {
    Node fnNode = new Node(Token.FUNCTION);
    JSType fnType = compiler.getTypeRegistry().getNativeType(
        com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_TYPE);
    fnNode.setJSType(fnType);
    Scope s = new Scope(globalScope, fnNode);
    assertNotNull(s.getTypeOfThis());
  }
}