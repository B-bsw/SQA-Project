package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GlobalNamespaceTest {

  @Test
  public void testName_basicPropertiesAndHierarchy() {
    GlobalNamespace.Name rootName = new GlobalNamespace.Name("a", null, false);
    Assert.assertEquals("a", rootName.getBaseName());
    Assert.assertEquals("a", rootName.getName());
    Assert.assertEquals("a", rootName.getFullName());
    Assert.assertTrue(rootName.isSimpleName());
    Assert.assertFalse(rootName.inExterns);
    Assert.assertNull(rootName.getType());
    Assert.assertFalse(rootName.isTypeInferred());
    Assert.assertNull(rootName.getDeclaration());
    Assert.assertNull(rootName.getJSDocInfo());
    Assert.assertTrue(rootName.getRefs().isEmpty());

    GlobalNamespace.Name child = rootName.addProperty("b", false);
    Assert.assertEquals("b", child.getBaseName());
    Assert.assertEquals("a.b", child.getName());
    Assert.assertEquals("a.b", child.getFullName());
    Assert.assertFalse(child.isSimpleName());
    Assert.assertSame(rootName, child.parent);
    Assert.assertNotNull(rootName.props);
    Assert.assertEquals(1, rootName.props.size());

    GlobalNamespace.Name grandChild = child.addProperty("c", true);
    Assert.assertEquals("c", grandChild.getBaseName());
    Assert.assertEquals("a.b.c", grandChild.getFullName());
    Assert.assertTrue(grandChild.inExterns);
  }

  @Test
  public void testName_addAndRemoveRefs_allRefTypes() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("testVar", null, false);

    GlobalNamespace.Ref refGlobalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(refGlobalSet);
    Assert.assertEquals(1, name.globalSets);
    Assert.assertSame(refGlobalSet, name.getDeclaration());

    GlobalNamespace.Ref refLocalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    name.addRef(refLocalSet);
    Assert.assertEquals(1, name.localSets);

    GlobalNamespace.Ref refProtoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);
    name.addRef(refProtoGet);
    Assert.assertEquals(1, name.totalGets);

    GlobalNamespace.Ref refDirectGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    name.addRef(refDirectGet);
    Assert.assertEquals(2, name.totalGets);

    GlobalNamespace.Ref refAliasGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    name.addRef(refAliasGet);
    Assert.assertEquals(1, name.aliasingGets);
    Assert.assertEquals(3, name.totalGets);

    GlobalNamespace.Ref refCallGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    name.addRef(refCallGet);
    Assert.assertEquals(1, name.callGets);
    Assert.assertEquals(4, name.totalGets);

    GlobalNamespace.Ref refDelete = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DELETE_PROP);
    name.addRef(refDelete);
    Assert.assertEquals(1, name.deleteProps);

    Assert.assertEquals(7, name.getRefs().size());

    name.removeRef(refDelete);
    Assert.assertEquals(0, name.deleteProps);

    name.removeRef(refCallGet);
    Assert.assertEquals(0, name.callGets);
    Assert.assertEquals(3, name.totalGets);

    name.removeRef(refAliasGet);
    Assert.assertEquals(0, name.aliasingGets);
    Assert.assertEquals(2, name.totalGets);

    name.removeRef(refDirectGet);
    Assert.assertEquals(1, name.totalGets);

    name.removeRef(refProtoGet);
    Assert.assertEquals(0, name.totalGets);

    name.removeRef(refLocalSet);
    Assert.assertEquals(0, name.localSets);

    GlobalNamespace.Ref refSecondGlobalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(refSecondGlobalSet);
    Assert.assertEquals(2, name.globalSets);
    Assert.assertSame(refGlobalSet, name.getDeclaration());

    name.removeRef(refGlobalSet);
    Assert.assertEquals(1, name.globalSets);
    Assert.assertSame(refSecondGlobalSet, name.getDeclaration());

    name.removeRef(refSecondGlobalSet);
    Assert.assertEquals(0, name.globalSets);
    Assert.assertNull(name.getDeclaration());

    GlobalNamespace.Ref unaddedRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    name.removeRef(unaddedRef);
  }

  @Test
  public void testName_declaredTypeAndNamespaceHierarchy() {
    GlobalNamespace.Name root = new GlobalNamespace.Name("ns", null, false);
    GlobalNamespace.Name sub = root.addProperty("sub", false);
    GlobalNamespace.Name leaf = sub.addProperty("leaf", false);

    Assert.assertFalse(leaf.isDeclaredType());
    Assert.assertFalse(root.isNamespace());

    leaf.setDeclaredType();
    Assert.assertTrue(leaf.isDeclaredType());
    Assert.assertFalse(root.isNamespace());

    root.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Assert.assertTrue(root.isNamespace());
  }

  @Test
  public void testName_canCollapseAndUnannotatedChildren() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("myObj", null, false);
    name.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Assert.assertFalse(name.canCollapse());

    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "myObj");
    varNode.addChildToBack(nameNode);
    GlobalNamespace.Ref decl = new GlobalNamespace.Ref(null, null, nameNode, name, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
    name.addRef(decl);

    Assert.assertTrue(name.canCollapse());
    Assert.assertTrue(name.canCollapseUnannotatedChildNames());

    name.type = GlobalNamespace.Name.Type.GET;
    Assert.assertTrue(name.isGetOrSetDefinition());
    Assert.assertFalse(name.canCollapse());
    Assert.assertFalse(name.canCollapseUnannotatedChildNames());

    name.type = GlobalNamespace.Name.Type.SET;
    Assert.assertTrue(name.isGetOrSetDefinition());
    Assert.assertFalse(name.canCollapse());

    name.type = GlobalNamespace.Name.Type.OTHER;
    Assert.assertFalse(name.canCollapseUnannotatedChildNames());

    name.type = GlobalNamespace.Name.Type.OBJECTLIT;
    name.aliasingGets = 1;
    Assert.assertFalse(name.canCollapseUnannotatedChildNames());
    Assert.assertTrue(name.shouldKeepKeys());

    name.aliasingGets = 0;
    Assert.assertFalse(name.shouldKeepKeys());

    GlobalNamespace.Ref twin1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref twin2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref.markTwins(twin1, twin2);
    name.removeRef(decl);
    name.addRef(twin1);
    Assert.assertFalse(name.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testName_canEliminate() {
    GlobalNamespace.Name root = new GlobalNamespace.Name("root", null, false);
    root.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Node varNode = new Node(Token.VAR);
    Node n = Node.newString(Token.NAME, "root");
    varNode.addChildToBack(n);
    GlobalNamespace.Ref decl = new GlobalNamespace.Ref(null, null, n, root, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
    root.addRef(decl);

    Assert.assertTrue(root.canEliminate());

    root.totalGets = 1;
    Assert.assertFalse(root.canEliminate());
    root.totalGets = 0;

    GlobalNamespace.Name child = root.addProperty("child", false);
    child.type = GlobalNamespace.Name.Type.OTHER;
    Assert.assertFalse(root.canEliminate());

    child.type = GlobalNamespace.Name.Type.FUNCTION;
    Node fnNameNode = Node.newString(Token.NAME, "child");
    GlobalNamespace.Ref childDecl = new GlobalNamespace.Ref(null, null, fnNameNode, child, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 1);
    child.addRef(childDecl);
    Assert.assertTrue(root.canEliminate());
  }

  @Test
  public void testName_isSimpleStubDeclaration() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("stub", null, false);
    Assert.assertFalse(name.isSimpleStubDeclaration());

    Node exprNode = new Node(Token.EXPR_RESULT);
    Node nameNode = Node.newString(Token.NAME, "stub");
    exprNode.addChildToBack(nameNode);
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, nameNode, name, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
    name.addRef(ref);

    Assert.assertTrue(name.isSimpleStubDeclaration());

    GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    name.addRef(ref2);
    Assert.assertFalse(name.isSimpleStubDeclaration());
  }

  @Test
  public void testName_needsToBeStubbed() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("stubbed", null, false);
    Assert.assertFalse(name.needsToBeStubbed());

    name.localSets = 1;
    name.globalSets = 0;
    Assert.assertTrue(name.needsToBeStubbed());

    name.globalSets = 1;
    Assert.assertFalse(name.needsToBeStubbed());
  }

  @Test
  public void testName_docInfoExtraction() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("test doc");
    JSDocInfo info = builder.build(null);

    Node assign = new Node(Token.ASSIGN);
    assign.setJSDocInfo(info);
    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = new Node(Token.OBJECTLIT);
    assign.addChildToBack(lhs);
    assign.addChildToBack(rhs);

    GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, lhs, name, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
    name.addRef(ref);

    Assert.assertSame(info, name.getJSDocInfo());

    Node fnNode = new Node(Token.FUNCTION);
    fnNode.setJSDocInfo(info);
    Node fnName = Node.newString(Token.NAME, "myFn");
    fnNode.addChildToBack(fnName);
    GlobalNamespace.Name fnSymbol = new GlobalNamespace.Name("myFn", null, false);
    GlobalNamespace.Ref fnRef = new GlobalNamespace.Ref(null, null, fnName, fnSymbol, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 1);
    fnSymbol.addRef(fnRef);

    Assert.assertSame(info, fnSymbol.getJSDocInfo());
  }

  @Test
  public void testName_toString() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("foo", null, false);
    name.type = GlobalNamespace.Name.Type.FUNCTION;
    name.globalSets = 1;
    name.localSets = 2;
    name.totalGets = 3;
    name.aliasingGets = 4;
    name.callGets = 5;

    String str = name.toString();
    Assert.assertTrue(str.indexOf("foo") != -1);
    Assert.assertTrue(str.indexOf("FUNCTION") != -1);
    Assert.assertTrue(str.indexOf("globalSets=1") != -1);
    Assert.assertTrue(str.indexOf("localSets=2") != -1);
    Assert.assertTrue(str.indexOf("totalGets=3") != -1);
    Assert.assertTrue(str.indexOf("aliasingGets=4") != -1);
    Assert.assertTrue(str.indexOf("callGets=5") != -1);
  }

  @Test
  public void testRef_methodsAndProperties() {
    Node node = Node.newString(Token.NAME, "v");
    GlobalNamespace.Name name = new GlobalNamespace.Name("v", null, false);
    GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, node, name, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 42);

    Assert.assertSame(node, ref.getNode());
    Assert.assertNull(ref.getSourceFile());
    Assert.assertSame(name, ref.getSymbol());
    Assert.assertNull(ref.getModule());
    Assert.assertEquals("", ref.getSourceName());
    Assert.assertEquals(42, ref.preOrderIndex);
    Assert.assertTrue(ref.isSet());

    GlobalNamespace.Ref localSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    Assert.assertTrue(localSet.isSet());

    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    Assert.assertFalse(directGet.isSet());

    GlobalNamespace.Ref cloned = ref.cloneAndReclassify(GlobalNamespace.Ref.Type.ALIASING_GET);
    Assert.assertSame(ref.getNode(), cloned.getNode());
    Assert.assertSame(ref.getSymbol(), cloned.getSymbol());
    Assert.assertEquals(GlobalNamespace.Ref.Type.ALIASING_GET, cloned.type);
    Assert.assertEquals(ref.preOrderIndex, cloned.preOrderIndex);
  }

  @Test
  public void testRef_markTwins_success() {
    GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref getRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

    Assert.assertNull(setRef.getTwin());
    Assert.assertNull(getRef.getTwin());

    GlobalNamespace.Ref.markTwins(setRef, getRef);
    Assert.assertSame(getRef, setRef.getTwin());
    Assert.assertSame(setRef, getRef.getTwin());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRef_markTwins_invalidPair_throwsException() {
    GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    GlobalNamespace.Ref.markTwins(ref1, ref2);
  }

  @Test
  public void testGlobalNamespace_scopeInterfaceMethods() {
    Compiler compiler = new Compiler();
    Node scriptNode = new Node(Token.SCRIPT);
    Node rootNode = new Node(Token.BLOCK);
    rootNode.addChildToBack(scriptNode);

    GlobalNamespace gn = new GlobalNamespace(compiler, scriptNode);
    Assert.assertFalse(gn.hasExternsRoot());
    Assert.assertSame(rootNode, gn.getRootNode());
    Assert.assertNull(gn.getParentScope());

    JSTypeRegistry registry = compiler.getTypeRegistry();
    ObjectType globalThis = registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS);
    Assert.assertEquals(globalThis, gn.getTypeOfThis());

    Assert.assertNull(gn.getSlot("nonexistent"));
    Assert.assertNull(gn.getOwnSlot("nonexistent"));
    Assert.assertSame(gn, gn.getScope(null));
    Assert.assertNotNull(gn.getAllSymbols());
    Assert.assertTrue(gn.getNameForest().isEmpty());
    Assert.assertTrue(gn.getNameIndex().isEmpty());
  }

  @Test
  public void testGlobalNamespace_astChangeScanning_ignoredNodes() {
    Compiler compiler = new Compiler();
    Node scriptNode = new Node(Token.SCRIPT);
    Node rootNode = new Node(Token.BLOCK);
    rootNode.addChildToBack(scriptNode);

    GlobalNamespace gn = new GlobalNamespace(compiler, scriptNode);

    Node numNode = Node.newNumber(123);
    GlobalNamespace.AstChange change = new GlobalNamespace.AstChange(null, null, numNode);
    List<GlobalNamespace.AstChange> list = new ArrayList<GlobalNamespace.AstChange>();
    list.add(change);

    gn.scanNewNodes(list);
    Assert.assertTrue(gn.getNameIndex().isEmpty());
  }

  @Test
  public void testGlobalNamespace_astChangeScanning_validNodes() {
    Compiler compiler = new Compiler();
    Node scriptNode = new Node(Token.SCRIPT);
    Node rootNode = new Node(Token.BLOCK);
    rootNode.addChildToBack(scriptNode);

    GlobalNamespace gn = new GlobalNamespace(compiler, scriptNode);

    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "myNewVar");
    varNode.addChildToBack(nameNode);
    scriptNode.addChildToBack(varNode);

    Scope globalScope = Scope.createGlobalScope(rootNode);

    GlobalNamespace.AstChange change = new GlobalNamespace.AstChange(null, globalScope, nameNode);
    List<GlobalNamespace.AstChange> list = new ArrayList<GlobalNamespace.AstChange>();
    list.add(change);

    gn.scanNewNodes(list);
    Assert.assertTrue(gn.getNameIndex().containsKey("myNewVar"));
    GlobalNamespace.Name nameObj = gn.getOwnSlot("myNewVar");
    Assert.assertNotNull(nameObj);
    Assert.assertEquals(1, nameObj.getRefs().size());
  }

  @Test
  public void testGlobalNamespace_buildGlobalNamespace_processingScript() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String js = "var x = {}; x.y = 10; function fn() { return x.y; } fn();";
    Node script = compiler.parseTestCode(js);
    Node root = new Node(Token.BLOCK, script);

    GlobalNamespace gn = new GlobalNamespace(compiler, script);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertTrue(index.containsKey("x"));
    Assert.assertTrue(index.containsKey("x.y"));
    Assert.assertTrue(index.containsKey("fn"));

    GlobalNamespace.Name xName = index.get("x");
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, xName.type);
    Assert.assertEquals(1, xName.globalSets);

    GlobalNamespace.Name fnName = index.get("fn");
    Assert.assertEquals(GlobalNamespace.Name.Type.FUNCTION, fnName.type);
    Assert.assertTrue(fnName.callGets > 0);

    Iterable<GlobalNamespace.Ref> refs = gn.getReferences(xName);
    Assert.assertNotNull(refs);
    Assert.assertTrue(refs.iterator().hasNext());

    Iterable<GlobalNamespace.Name> allSymbols = gn.getAllSymbols();
    int count = 0;
    Iterator<GlobalNamespace.Name> it = allSymbols.iterator();
    while (it.hasNext()) {
      it.next();
      count++;
    }
    Assert.assertTrue(count >= 3);
  }

  @Test
  public void testGlobalNamespace_withExternsRoot() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String externsJs = "var extVar;";
    String codeJs = "extVar = 1;";

    Node externsScript = compiler.parseTestCode(externsJs);
    Node codeScript = compiler.parseTestCode(codeJs);
    Node externsBlock = new Node(Token.BLOCK, externsScript);
    Node codeBlock = new Node(Token.BLOCK, codeScript);

    GlobalNamespace gn = new GlobalNamespace(compiler, externsScript, codeScript);
    Assert.assertTrue(gn.hasExternsRoot());

    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
    Assert.assertTrue(index.containsKey("extVar"));
    GlobalNamespace.Name ext = index.get("extVar");
    Assert.assertNotNull(ext);
  }

  @Test
  public void testTracker_processLogsOutput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    Predicate<String> predicate = new Predicate<String>() {
      @Override
      public boolean apply(String input) {
        return input != null && input.startsWith("target");
      }
    };

    GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(compiler, ps, predicate);

    String js1 = "var targetOne = 1;";
    Node script1 = compiler.parseTestCode(js1);
    Node root1 = new Node(Token.BLOCK, script1);
    tracker.process(null, script1);

    String output1 = out.toString();
    Assert.assertTrue(output1.indexOf("targetOne: Added by") != -1);

    out.reset();
    String js2 = "var notTarget = 2;";
    Node script2 = compiler.parseTestCode(js2);
    Node root2 = new Node(Token.BLOCK, script2);
    tracker.process(null, script2);

    String output2 = out.toString();
    Assert.assertTrue(output2.indexOf("targetOne: Removed by") != -1);
  }
}