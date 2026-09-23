package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class GlobalNamespaceTest {

  private AbstractCompiler compiler;
  private GlobalNamespace namespace;

  @Before
  public void setUp() {
    compiler = new FakeCompiler();
  }

  @Test
  public void testGetNameForest_EmptyRoot() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> result = namespace.getNameForest();
    assertNotNull(result);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_NullRoot_Throws() {
    new GlobalNamespace(compiler, null, null);
  }

  @Test
  public void testGetNameForest_SingleGlobalName() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    namespace = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> forest = namespace.getNameForest();
    assertEquals(1, forest.size());
    assertEquals("foo", forest.get(0).fullName());
  }

  @Test
  public void testGetNameForest_NoGlobalNames_ReturnsEmpty() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> forest = namespace.getNameForest();
    assertTrue(forest.isEmpty());
  }

  @Test
  public void testGetNameIndex_EmptyRoot() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
    assertNotNull(index);
    assertTrue(index.isEmpty());
  }

  @Test
  public void testScanNewNodes_WithMatchingNode() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    namespace = new GlobalNamespace(compiler, root);
    namespace.getNameForest();
    Set<Node> newNodes = new HashSet<Node>();
    newNodes.add(root);
    namespace.scanNewNodes(new Scope(compiler, new Node(Token.ROOT), null), newNodes);
    assertEquals(1, namespace.getNameIndex().size());
  }

  @Test
  public void testScanNewNodes_WithIrrelevantNode() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    namespace.getNameForest();
    Set<Node> newNodes = new HashSet<Node>();
    newNodes.add(new Node(Token.NAME, "foo"));
    namespace.scanNewNodes(new Scope(compiler, new Node(Token.ROOT), null), newNodes);
    assertEquals(0, namespace.getNameIndex().size());
  }

  @Test
  public void testName_GetSetFromGlobal_RefMarks() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    namespace = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> forest = namespace.getNameForest();
    GlobalNamespace.Name foo = forest.get(0);
    assertNotNull(foo);
    assertTrue(foo.getRefs().size() >= 1);
    assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, foo.getRefs().get(0).type);
  }

  @Test
  public void testName_GetFromGlobal_DirectReference() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> forest = ns.getNameForest();
    GlobalNamespace.Name foo = forest.get(0);
    assertEquals(1, foo.getRefs().size());
  }

  @Test
  public void testMaybeHandlePrototypePrefix() {
    Node root = new Node(Token.ROOT);
    Node expr = new Node(Token.EXPR_RESULT);
    Node getprop = Node.newString(Token.GETPROP, "foo");
    Node proto = Node.newString(Token.GETPROP, "prototype");
    Node name = Node.newString(Token.NAME, "bar");
    getprop.addChildToFront(proto);
    getprop.addChildToFront(name);
    expr.addChildToFront(getprop);
    root.addChildToFront(expr);
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    List<GlobalNamespace.Name> forest = ns.getNameForest();
    GlobalNamespace.Name foo = forest.get(0);
    assertNotNull(foo);
    assertEquals(1, foo.getRefs().size());
  }

  @Test
  public void testHandleGet_ReadFromGlobal_AddsGetRef() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    namespace = new GlobalNamespace(compiler, root);
    namespace.getNameForest();
    Node get = newNode(Token.GETPROP, "foo");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToFront(get);
    namespace.handleGet(null, get, parent, "foo", GlobalNamespace.Ref.Type.DIRECT_GET);
  }

  @Test
  public void testIsGlobalNameReference_WithLocalVar() {
    Node root = new Node(Token.ROOT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    name.addChildToFront(new Node(Token.NUMBER, 1));
    var.addChildToFront(name);
    root.addChildToFront(var);
    namespace = new GlobalNamespace(compiler, root);
    Scope scope = new Scope(compiler, new Node(Token.ROOT), null);
    assertFalse(namespace.isGlobalNameReference("foo", scope));
  }

  @Test
  public void testIsGlobalNameReference_NullName() {
    namespace = new GlobalNamespace(compiler, new Node(Token.ROOT));
    Scope scope = new Scope(compiler, new Node(Token.ROOT), null);
    assertFalse(namespace.isGlobalNameReference(null, scope));
  }

  @Test
  public void testGetTopVarName_NoDot() {
    namespace = new GlobalNamespace(compiler, new Node(Token.ROOT));
    assertEquals("foo", namespace.getTopVarName("foo"));
  }

  @Test
  public void testGetTopVarName_WithDots() {
    namespace = new GlobalNamespace(compiler, new Node(Token.ROOT));
    assertEquals("foo", namespace.getTopVarName("foo.bar.baz"));
  }

  @Test
  public void testIsGlobalVarReference_NotInScope() {
    namespace = new GlobalNamespace(compiler, new Node(Token.ROOT));
    Scope scope = new Scope(compiler, new Node(Token.ROOT), null);
    assertFalse(namespace.isGlobalVarReference("foo", scope));
  }

  @Test
  public void testIsGlobalVarReference_InExterns() {
    Node externs = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, externs, new Node(Token.ROOT));
    assertFalse(namespace.isGlobalVarReference("foo", new Scope(compiler, new Node(Token.ROOT), null)));
  }

  @Test
  public void testGetValueType_ObjectLit() {
    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, GlobalNamespace.getNameType(objLit));
  }

  @Test
  public void testGetValueType_FunctionLit() {
    Node function = new Node(Token.FUNCTION);
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, GlobalNamespace.getNameType(function));
  }

  @Test
  public void testGetValueType_ReturnOtherForNumber() {
    Node number = new Node(Token.NUMBER);
    assertEquals(GlobalNamespace.Name.Type.OTHER, GlobalNamespace.getNameType(number));
  }

  @Test
  public void testRef_CreateRefs_WithNullNode() {
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.SET_FROM_GLOBAL);
    assertNotNull(ref);
    assertNull(ref.node);
  }

  @Test
  public void testName_AddRef_RejectsNull() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    try {
      nameObj.addRef(null);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  public void testName_AddRef_TwinCreation() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.SET_FROM_GLOBAL);
    nameObj.addRef(ref);
    GlobalNamespace.Ref twin = ref.twin();
    assertNotNull(twin);
    assertTrue(twin.type == Ref.Type.SET_FROM_GLOBAL);
  }

  @Test
  public void testName_AddRef_ReferenceMarking() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.SET_FROM_LOCAL);
    nameObj.addRef(ref);
    assertEquals(1, nameObj.getRefs().size());
  }

  @Test
  public void testName_IsNonGlobal_AfterClear() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    nameObj.markNonGlobal();
    assertFalse(nameObj.isGlobal());
  }

  @Test
  public void testName_IsAliasing_WhenAliasingGets() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    for (int i = 0; i < GlobalNamespace.Name.ALIASING_GET_THRESHOLD + 1; i++) {
      GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.ALIASING_GET);
      nameObj.addRef(ref);
    }
    assertTrue(nameObj.isAliasing());
  }

  @Test
  public void testName_IsAliasing_BelowThreshold() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    for (int i = 0; i < GlobalNamespace.Name.ALIASING_GET_THRESHOLD; i++) {
      GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.ALIASING_GET);
      nameObj.addRef(ref);
    }
    assertFalse(nameObj.isAliasing());
  }

  @Test
  public void testName_CanCollapse_WithZeroGlobalSets() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    assertFalse(nameObj.canCollapse());
  }

  @Test
  public void testName_CanCollapse_WithOneGlobalSetAndNoLocal() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    GlobalNamespace.Ref set = new GlobalNamespace.Ref(Ref.Type.SET_FROM_GLOBAL);
    nameObj.addRef(set);
    assertTrue(nameObj.canCollapse());
  }

  @Test
  public void testName_CanCollapse_WithLocalSet() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    GlobalNamespace.Ref set = new GlobalNamespace.Ref(Ref.Type.SET_FROM_LOCAL);
    nameObj.addRef(set);
    assertFalse(nameObj.canCollapse());
  }

  @Test
  public void testName_IsClassOrEnum_WithConstructor() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    Node function = new Node(Token.FUNCTION);
    JSDocInfo info = new JSDocInfo();
    info.setConstructor(true);
    function.getProps();
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(Ref.Type.SET_FROM_GLOBAL);
    assertFalse(namespace.isClassOrEnumDeclaration(function, new Node(Token.VAR)));
  }

  @Test
  public void testHandleGet_WithHookType() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    Node hook = new Node(Token.HOOK);
    Node first = new Node(Token.NAME, "foo");
    Node second = new Node(Token.NAME, "bar");
    Node third = new Node(Token.NAME, "baz");
    hook.addChildToFront(first);
    hook.addChildToFront(second);
    hook.addChildToFront(third);
    assertEquals(GlobalNamespace.Name.Type.OTHER, GlobalNamespace.getNameType(hook));
  }

  @Test
  public void testHandleGet_WithOrType() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    Node or = new Node(Token.OR);
    Node first = new Node(Token.NAME, "foo");
    Node second = new Node(Token.NAME, "bar");
    or.addChildToFront(first);
    or.addChildToFront(second);
    assertEquals(GlobalNamespace.Name.Type.OTHER, GlobalNamespace.getNameType(or));
  }

  @Test
  public void testEveryNode_WithObjectLit_ReturnsObjectLit() {
    Node objLit = new Node(Token.OBJECTLIT);
    assertEquals("OBJECTLIT", objLit.toString());
  }

  @Test
  public void testName_Ref_GetSourceName() {
    Node root = new Node(Token.ROOT);
    namespace = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameObj = namespace.getOrCreateName("foo");
    nameObj.addRef(new GlobalNamespace.Ref(Ref.Type.SET_FROM_GLOBAL));
    GlobalNamespace.Ref ref = nameObj.getRefs().get(0);
    assertEquals("source", ref.getSourceName());
  }

  private Node newNode(int type, String name) {
    Node node = Node.newString(type, name);
    return node;
  }

  private class FakeCompiler extends AbstractCompiler {
    @Override
    public void process(SourceFile... inputs) {
    }
  }
}