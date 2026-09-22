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

import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticScope;

public class GlobalNamespaceTest {

  private AbstractCompiler compiler;
  private Node root;
  private Node externsRoot;
  private GlobalNamespace namespace;

  @Before
  public void setUp() {
    compiler = new Compiler();
    root = new Node(Token.BLOCK);
    externsRoot = new Node(Token.BLOCK);
    namespace = new GlobalNamespace(compiler, externsRoot, root);
  }

  @Test
  public void testConstructorWithNullExternsRoot() {
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertNotNull(ns);
    assertFalse(ns.hasExternsRoot());
  }

  @Test
  public void testHasExternsRootWhenNotNull() {
    assertTrue(namespace.hasExternsRoot());
  }

  @Test
  public void testGetRootNodeReturnsParentOfRoot() {
    Node parent = new Node(Token.BLOCK);
    root.addChildToFront(new Node(Token.EMPTY));
    parent.addChildToFront(root);
    assertEquals(parent, namespace.getRootNode());
  }

  @Test
  public void testGetParentScopeReturnsNull() {
    assertNull(namespace.getParentScope());
  }

  @Test
  public void testGetSlotAndGetOwnSlotWithEmptyNameMap() {
    assertNull(namespace.getSlot("nonexistent"));
    assertNull(namespace.getOwnSlot("nonexistent"));
  }

  @Test
  public void testGetTypeOfThis() {
    JSType type = namespace.getTypeOfThis();
    assertNotNull(type);
  }

  @Test
  public void testGetReferencesAndGetScopeForEmptySlot() {
    Name name = new Name("test", null, false, false);
    assertNotNull(namespace.getScope(name));
    assertTrue(namespace.getReferences(name).iterator().hasNext() == false);
  }

  @Test
  public void testGetAllSymbolsInitiallyEmpty() {
    Iterable<Name> symbols = namespace.getAllSymbols();
    assertNotNull(symbols);
    assertFalse(symbols.iterator().hasNext());
  }

  @Test
  public void testProcessWithEmptyRoots() {
    namespace.process();
    assertTrue(namespace.getNameForest().isEmpty());
  }

  @Test
  public void testIsGlobalNameReference() {
    Scope scope = new Scope(null, null);
    scope.declare("globalVar", new Node(Token.NAME, "globalVar"), null);
    assertFalse(namespace.isGlobalNameReference("globalVar", scope));
    assertFalse(namespace.isGlobalNameReference("globalVar.prop", scope));
  }

  @Test
  public void testGetTopVarName() {
    assertEquals("a", namespace.getTopVarName("a.b.c"));
    assertEquals("a", namespace.getTopVarName("a"));
  }

  @Test
  public void testIsGlobalVarReferenceWithNullVar() {
    Scope scope = new Scope(null, null);
    assertFalse(namespace.isGlobalVarReference("undefined", scope));
  }

  @Test
  public void testIsGlobalScope() {
    Scope globalScope = new Scope(null, null);
    assertTrue(namespace.isGlobalScope(globalScope));
    Scope localScope = new Scope(null, null);
    Scope parent = new Scope(null, null);
    localScope.setParent(parent);
    assertFalse(namespace.isGlobalScope(localScope));
  }

  @Test(expected = IllegalStateException.class)
  public void testScanNewNodesWithIllegalNodeType() {
    ArrayList<GlobalNamespace.AstChange> changes = new ArrayList<>();
    Node badNode = new Node(Token.NUMBER, 1);
    changes.add(new GlobalNamespace.AstChange(null, null, badNode));
    namespace.scanNewNodes(changes);
  }

  @Test
  public void testScanNewNodesWithNameNodeNoParent() {
    ArrayList<GlobalNamespace.AstChange> changes = new ArrayList<>();
    Node nameNode = new Node(Token.NAME, "x");
    changes.add(new GlobalNamespace.AstChange(null, null, nameNode));
    namespace.scanNewNodes(changes);
    assertTrue(namespace.getNameForest().isEmpty());
  }

  @Test
  public void testIsGlobalScopeForNullParent() {
    Scope scope = new Scope(null, null);
    assertTrue(namespace.isGlobalScope(scope));
  }

  @Test
  public void testIsGlobalScopeWithNonNullParent() {
    Scope child = new Scope(null, null);
    Scope parent = new Scope(null, null);
    child.setParent(parent);
    assertFalse(namespace.isGlobalScope(child));
  }

  @Test
  public void testNameCreationAndProperties() {
    Name name = new Name("testName", null, false, false);
    assertEquals("testName", name.getName());
    assertEquals("testName", name.getFullName());
    assertNull(name.getDeclaration());
    assertFalse(name.isTypeInferred());
  }

  @Test
  public void testNameWithGetOrSetDefinition() {
    Name name = new Name("test", null, false, true);
    assertTrue(name.isGetOrSetDefinition());
  }

  @Test
  public void testNameWithoutGetOrSetDefinition() {
    Name name = new Name("test", null, false, false);
    assertFalse(name.isGetOrSetDefinition());
  }

  @Test
  public void testNameIsTypeInferred() {
    Name name = new Name("test", null, true, false);
    assertTrue(name.isTypeInferred());
  }

  @Test
  public void testNameGetTypeInferredWithNoType() {
    Name name = new Name("test", null, true, false);
    assertNull(name.getType());
  }

  @Test
  public void testNameSetType() {
    Name name = new Name("test", null, false, false);
    JSType testType = new JSType(compiler.getTypeRegistry());
    name.setType(testType);
    assertSame(testType, name.getType());
  }

  @Test
  public void testRefConstructorWithSource() {
    Node node = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ASSIGN);
    parent.addChildToFront(node);
    name = new Name("x", null, false, false);
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, parent, null, 0);
    assertNotNull(ref.getNode());
    assertNotNull(ref.getSourceFile());
    assertSame(name, ref.getSymbol());
  }

  @Test
  public void testRefGetSourceFileWhenNullSource() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, -1);
    assertNull(ref.getSourceFile());
  }

  @Test
  public void testRefGetSourceNameWhenSourceIsNull() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, -1);
    assertEquals("", ref.getSourceName());
  }

  @Test
  public void testRefGetTwinWhenNull() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, -1);
    assertNull(ref.getTwin());
  }

  @Test
  public void testRefSetAndGetTwin() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, -1);
    Ref twin = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, -1);
    ref.setTwin(twin);
    assertSame(twin, ref.getTwin());
  }

  @Test
  public void testRefIsSetFromGlobalOrLocal() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref globalRef = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, 0);
    Ref localRef = new Ref(name, Ref.Type.SET_FROM_LOCAL, node, node, null, 0);
    Ref getRef = new Ref(name, Ref.Type.DIRECT_GET, node, node, null, 0);
    assertTrue(globalRef.isSetFromGlobalOrLocal());
    assertTrue(localRef.isSetFromGlobalOrLocal());
    assertFalse(getRef.isSetFromGlobalOrLocal());
  }

  @Test
  public void testRefCloneWithSource() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    StaticSourceFile source = new SimpleSourceFile("file.js");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, source, 0);
    Ref clone = ref.cloneWithSource(source);
    assertEquals("file.js", clone.getSourceName());
  }

  @Test
  public void testRefCloneWithoutSource() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, 0);
    Ref clone = ref.cloneWithNewType(Ref.Type.DIRECT_GET);
    assertEquals(Ref.Type.DIRECT_GET, clone.getType());
  }

  @Test
  public void testGetNameForObjLitKeyWhenNullParent() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.STRING_KEY);
    name.type = Name.Type.OBJECTLIT;
    assertNull(name.getNameForObjLitKey(null, node));
  }

  @Test
  public void testGetNameForObjLitKeyWithStringKey() {
    Name name = new Name("test", null, false, false);
    Node key = new Node(Token.STRING_KEY, "key");
    Node objLit = new Node(Token.OBJECTLIT);
    objLit.addChildToBack(key);
    String result = name.getNameForObjLitKey(objLit, key);
    assertEquals("test.key", result);
  }

  @Test
  public void testGetNameForObjLitKeyWithNonString() {
    Name name = new Name("test", null, false, false);
    Node key = new Node(Token.STRING_KEY, "notAnIdentifier");
    Node objLit = new Node(Token.OBJECTLIT);
    objLit.addChildToBack(key);
    assertNull(name.getNameForObjLitKey(objLit, key));
  }

  @Test
  public void testGetValueTypeForObjectLit() {
    Name name = new Name("test", null, false, false);
    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals(Name.Type.OBJECTLIT, name.getValueType(objLit));
  }

  @Test
  public void testGetValueTypeForFunction() {
    Name name = new Name("test", null, false, false);
    Node function = new Node(Token.FUNCTION);
    assertEquals(Name.Type.FUNCTION, name.getValueType(function));
  }

  @Test
  public void testGetValueTypeForOr() {
    Name name = new Name("test", null, false, false);
    Node or = new Node(Token.OR);
    or.addChildToBack(new Node(Token.TRUE));
    or.addChildToBack(new Node(Token.FALSE));
    assertEquals(Name.Type.OTHER, name.getValueType(or));
  }

  @Test
  public void testGetValueTypeForHook() {
    Name name = new Name("test", null, false, false);
    Node hook = new Node(Token.HOOK);
    hook.addChildToBack(new Node(Token.TRUE));
    hook.addChildToBack(new Node(Token.STRING));
    hook.addChildToBack(new Node(Token.NUMBER));
    assertEquals(Name.Type.OTHER, name.getValueType(hook));
  }

  @Test
  public void testGetValueTypeForOtherNodes() {
    Name name = new Name("test", null, false, false);
    Node num = new Node(Token.NUMBER);
    assertEquals(Name.Type.OTHER, name.getValueType(num));
  }

  @Test
  public void testMaybeHandlePrototypePrefix() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.GETPROP);
    Node parent = new Node(Token.EXPR_RESULT);
    assertEquals(false, name.maybeHandlePrototypePrefix(null, null, n, parent, "test.prototype.x"));
  }

  @Test
  public void testMaybeHandlePrototypePrefixWithNullRef() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.GETPROP);
    Node parent = new Node(Token.EXPR_RESULT);
    n.setParent(parent);
    assertEquals(false, name.maybeHandlePrototypePrefix(null, null, n, parent, "test.x"));
  }

  @Test
  public void testIsTypeDeclarationWithNullParent() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.NAME, "x");
    assertFalse(name.isTypeDeclaration(n, null));
  }

  @Test
  public void testIsTypeDeclarationWithAssignParent() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToFront(n);
    assertEquals(false, name.isTypeDeclaration(n, assign));
  }

  @Test
  public void testIsTypeDeclarationWithTrue() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.NAME, "x");
    Node var = new Node(Token.VAR);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToFront(n);
    var.addChildToBack(assign);
    assertEquals(false, name.isTypeDeclaration(n, var));
  }

  @Test
  public void testIsTypeDeclarationWithJSDocInfo() {
    Name name = new Name("test", null, false, false);
    Node n = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR);
    parent.setJSDocInfo(new JSDocInfo());
    assertEquals(false, name.isTypeDeclaration(n, parent));
  }

  @Test
  public void testGetJSDocInfoWithNullNode() {
    Name name = new Name("test", null, false, false);
    assertNull(name.getJSDocInfo());
  }

  @Test
  public void testGetJSDocInfoWithRefNode() {
    Name name = new Name("test", null, false, false);
    Node node = new Node(Token.NAME, "x");
    Ref ref = new Ref(name, Ref.Type.SET_FROM_GLOBAL, node, node, null, 0);
    name.declaration = ref;
    assertNull(name.getJSDocInfo());
  }
}