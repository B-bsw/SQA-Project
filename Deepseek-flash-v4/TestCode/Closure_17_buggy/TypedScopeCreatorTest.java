package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder;
import com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.EnumType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private TypedScopeCreator creator;
  private JSTypeRegistry registry;
  private Node root;

  @Before
  public void setUp() {
    compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    creator = new TypedScopeCreator(compiler);
    root = new Node(Token.SCRIPT);
  }

  @Test
  public void testCreateScopeWithNullParent() {
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertEquals(scope.getRootNode(), root);
  }

  @Test
  public void testCreateScopeWithNonNullParent() {
    Scope parentScope = new Scope(root, Scope.Type.GLOBAL, null);
    Node childRoot = new Node(Token.SCRIPT);
    Scope childScope = creator.createScope(childRoot, parentScope);
    assertNotNull(childScope);
    assertSame(childScope.getParent(), parentScope);
  }

  @Test
  public void testCreateScopeWithTypeFunctionParent() {
    Node fnNode = new Node(Token.FUNCTION);
    Node parentScopeNode = new Node(Token.SCRIPT);
    Scope parentScope = new Scope(parentScopeNode, Scope.Type.GLOBAL, null);
    JSType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    fnNode.setJSType(fnType);
    parentScopeNode.addChildToFront(fnNode);
    Scope childScope = creator.createScope(fnNode, parentScope);
    assertNotNull(childScope);
    assertTrue(childScope.isFunctionScope());
  }

  @Test
  public void testCreateScopeWithUnknownThisType() {
    Node fnNode = new Node(Token.FUNCTION);
    Node parentScopeNode = new Node(Token.SCRIPT);
    Scope parentScope = new Scope(parentScopeNode, Scope.Type.GLOBAL, null);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    fnNode.setJSType(fnType);
    fnType.setReturnType(unknownType);
    Scope childScope = creator.createScope(fnNode, parentScope);
    assertNotNull(childScope);
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithEnum() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "MyEnum");
    Node assignNode = new Node(Token.ASSIGN);
    Node objectLit = new Node(Token.OBJECTLIT);
    objectLit.addChildToFront(new Node(Token.STRING_KEY, "A"));
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(objectLit);
    varNode.addChildToFront(assignNode);
    scriptNode.addChildToFront(varNode);

    JSType enumType = registry.createEnumType("MyEnum", objectLit, null);
    nameNode.setJSType(enumType);
    JSDocInfo info = new JSDocInfo();
    info.setEnumParameterType(enumType);
    nameNode.setJSDocInfo(info);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), scriptNode, null);
    assertNotNull(discoverer.getEnumNameIfExists(nameNode));
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithTypedef() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "MyType");
    Node assignNode = new Node(Token.ASSIGN);
    Node typeRef = new Node(Token.NAME, "string");
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(typeRef);
    varNode.addChildToFront(assignNode);
    scriptNode.addChildToFront(varNode);

    JSDocInfo info = new JSDocInfo();
    info.setTypedefType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    nameNode.setJSDocInfo(info);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), scriptNode, null);
    assertNotNull(discoverer.getTypedefNameIfExists(nameNode));
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithNoJSDoc() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "NoType");
    varNode.addChildToFront(nameNode);
    scriptNode.addChildToFront(varNode);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), scriptNode, null);
    assertNull(discoverer.getEnumNameIfExists(nameNode));
    assertNull(discoverer.getTypedefNameIfExists(nameNode));
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithNullNode() {
    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), null, null);
    assertNull(discoverer.getEnumNameIfExists(null));
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithExtern() {
    CompilerInput input = new CompilerInput();
    input.setIsExtern(true);
    Node scriptNode = new Node(Token.SCRIPT);
    scriptNode.setInputId(new InputId("extern"));
    scriptNode.putProp(Node.SOURCENAME_PROP, "extern.js");
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "ExternType");
    varNode.addChildToFront(nameNode);
    scriptNode.addChildToFront(varNode);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, input), scriptNode, null);
    assertNull(discoverer.getEnumNameIfExists(nameNode));
  }

  @Test
  public void testCreateScopeWithEmptyGlobal() {
    CompilerInput input = new CompilerInput();
    root.setInputId(new InputId("test"));
    root.putProp(Node.SOURCENAME_PROP, "test.js");
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
    assertEquals(scope.getRootNode(), root);
  }

  @Test
  public void testCreateScopeWithTypedefInScope() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "MyType");
    Node assignNode = new Node(Token.ASSIGN);
    Node typeRef = new Node(Token.STRING, "string");
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(typeRef);
    varNode.addChildToFront(assignNode);
    scriptNode.addChildToFront(varNode);

    JSDocInfo info = new JSDocInfo();
    info.setTypedefType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    nameNode.setJSDocInfo(info);

    CompilerInput input = new CompilerInput();
    input.setCode("var MyType;");
    scriptNode.setInputId(new InputId("test"));
    scriptNode.putProp(Node.SOURCENAME_PROP, "test.js");

    Scope scope = creator.createScope(scriptNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testLocalScopeBuilderWithFunctionParams() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "myFunc");
    Node paramsNode = new Node(Token.PARAM_LIST);
    Node param1 = new Node(Token.NAME, "a");
    Node param2 = new Node(Token.NAME, "b");
    paramsNode.addChildToFront(param1);
    paramsNode.addChildToFront(param2);
    fnNode.addChildToFront(nameNode);
    fnNode.addChildToFront(paramsNode);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToFront(body);

    CompilerInput input = new CompilerInput();
    input.setCode("function myFunc(a, b) {}");
    Scope globalScope = new Scope(null, Scope.Type.GLOBAL, null);
    LocalScopeBuilder builder = creator.new LocalScopeBuilder(globalScope);
    
    NodeTraversal t = new NodeTraversal(compiler, null);
    t.scope = globalScope;
    t.scopeDepth = 1;
    
    builder.visit(t, fnNode, null);
    assertNotNull(globalScope.getVar("a"));
    assertNotNull(globalScope.getVar("b"));
  }

  @Test
  public void testGlobalScopeBuilderWithVarDeclaration() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "myVar");
    varNode.addChildToFront(nameNode);
    scriptNode.addChildToFront(varNode);

    CompilerInput input = new CompilerInput();
    input.setCode("var myVar;");
    Scope globalScope = new Scope(scriptNode, Scope.Type.GLOBAL, null);
    GlobalScopeBuilder builder = creator.new GlobalScopeBuilder(globalScope);
    
    NodeTraversal t = new NodeTraversal(compiler, input);
    t.scope = globalScope;
    
    builder.visit(t, varNode, scriptNode);
    assertNotNull(globalScope.getVar("myVar"));
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithEnumAndMultipleKeys() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "Color");
    Node assignNode = new Node(Token.ASSIGN);
    Node objectLit = new Node(Token.OBJECTLIT);
    objectLit.addChildToFront(new Node(Token.STRING_KEY, "RED"));
    objectLit.addChildToFront(new Node(Token.STRING_KEY, "GREEN"));
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(objectLit);
    varNode.addChildToFront(assignNode);
    scriptNode.addChildToFront(varNode);

    JSType enumType = registry.createEnumType("Color", objectLit, null);
    nameNode.setJSType(enumType);
    JSDocInfo info = new JSDocInfo();
    info.setEnumParameterType(enumType);
    nameNode.setJSDocInfo(info);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), scriptNode, null);
    assertNotNull(discoverer.getEnumNameIfExists(nameNode));
  }

  @Test
  public void testCreateScopeWithLendsAnnotation() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node assignNode = new Node(Token.ASSIGN);
    Node objLit = new Node(Token.OBJECTLIT);
    Node nameNode = new Node(Token.NAME, "x");
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(objLit);
    exprResult.addChildToFront(assignNode);
    scriptNode.addChildToFront(exprResult);

    JSDocInfo info = new JSDocInfo();
    info.setLendsName("foo");
    objLit.setJSDocInfo(info);
    nameNode.setQualifiedName("x");

    CompilerInput input = new CompilerInput();
    input.setCode("x = {};");
    Scope scope = creator.createScope(scriptNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testCreateScopeWithCasting() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node castNode = new Node(Token.CAST);
    castNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    exprResult.addChildToFront(castNode);
    scriptNode.addChildToFront(exprResult);

    CompilerInput input = new CompilerInput();
    input.setCode("/** @type {number} */ (x);");
    Scope scope = creator.createScope(scriptNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithNoName() {
    Node scriptNode = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node assignNode = new Node(Token.ASSIGN);
    Node objLit = new Node(Token.OBJECTLIT);
    assignNode.addChildToFront(new Node(Token.NAME, ""));
    assignNode.addChildToFront(objLit);
    exprResult.addChildToFront(assignNode);
    scriptNode.addChildToFront(exprResult);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, null), scriptNode, null);
    assertNull(discoverer.getEnumNameIfExists(assignNode.getFirstChild()));
  }

  @Test
  public void testCreateScopeWithFunctionTypeDeclaration() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "MyFunc");
    Node paramsNode = new Node(Token.PARAM_LIST);
    fnNode.addChildToFront(nameNode);
    fnNode.addChildToFront(paramsNode);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToFront(body);

    JSDocInfo info = new JSDocInfo();
    info.setFunctionType(new FunctionParamBuilder(registry).build(),
        registry.getNativeType(JSTypeNative.VOID_TYPE));
    nameNode.setJSDocInfo(info);

    CompilerInput input = new CompilerInput();
    input.setCode("function MyFunc() {}");
    Scope scope = creator.createScope(fnNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testCreateScopeWithInferredFunctionType() {
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "MyFunc");
    Node paramsNode = new Node(Token.PARAM_LIST);
    fnNode.addChildToFront(nameNode);
    fnNode.addChildToFront(paramsNode);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToFront(body);

    CompilerInput input = new CompilerInput();
    input.setCode("function MyFunc() {}");
    Scope scope = creator.createScope(fnNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testCreateScopeWithEnumDeclaration() {
    Node enumNode = new Node(Token.OBJECTLIT);
    JSType enumType = registry.createEnumType("MyEnum", enumNode, null);
    enumNode.setJSType(enumType);
    Scope scope = creator.createScope(enumNode, null);
    assertNotNull(scope);
  }

  @Test
  public void testDiscoverEnumsAndTypedefsWithExternAndNoInfo() {
    CompilerInput input = new CompilerInput();
    input.setIsExtern(true);
    Node scriptNode = new Node(Token.SCRIPT);
    scriptNode.setInputId(new InputId("extern"));
    scriptNode.putProp(Node.SOURCENAME_PROP, "extern.js");
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "ExtVar");
    varNode.addChildToFront(nameNode);
    scriptNode.addChildToFront(varNode);

    TypedScopeCreator.DiscoverEnumsAndTypedefs discoverer = 
        creator.new DiscoverEnumsAndTypedefs(compiler);
    discoverer.visit(new NodeTraversal(compiler, input), scriptNode, null);
    assertNull(discoverer.getEnumNameIfExists(nameNode));
  }
}