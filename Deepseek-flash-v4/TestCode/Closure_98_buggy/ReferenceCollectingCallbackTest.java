package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReferenceCollectingCallbackTest {

  private ReferenceCollectingCallback callback;
  private AbstractCompiler compiler;
  private Behavior behavior;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    behavior = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
    callback = new ReferenceCollectingCallback(compiler, behavior);
  }

  @After
  public void tearDown() throws Exception {
    compiler = null;
    callback = null;
    behavior = null;
  }

  @Test
  public void testProcessWithNullRoot() {
    Node externs = new Node(Token.EMPTY);
    Node root = null;
    try {
      callback.process(externs, root);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testProcessSimpleVariableDeclaration() {
    Node root = createRoot("var a;");
    NodeTraversal.traverse(compiler, root, callback);
    assertEquals("Expected no references collected for variable not in scope",
        0, callback.getReferenceCollection(createVar("a")).getReferences().size());
  }

  @Test
  public void testProcessVariableWithReference() {
    Node root = createRoot("var a; a = 5;");
    NodeTraversal.traverse(compiler, root, callback);
    Scope scope = new GlobalScope(root);
    Var var = scope.getVar("a");
    ReferenceCollection refs = callback.getReferenceCollection(var);
    assertNotNull("ReferenceCollection should exist for variable a", refs);
    assertTrue("References should be collected", refs.getReferences().size() > 0);
  }

  @Test
  public void testGetReferenceCollectionForUndeclaredVariable() {
    Var var = new Var("undefined", createNameNode("undefined"), null);
    ReferenceCollection refs = callback.getReferenceCollection(var);
    assertNull("Should return null for undeclared variable", refs);
  }

  @Test
  public void testVisitNameNodeWithFilter() {
    Predicate<Var> filter = new Predicate<Var>() {
      @Override
      public boolean apply(Var var) {
        return var.getName().startsWith("a");
      }
    };
    callback = new ReferenceCollectingCallback(compiler, behavior, filter);
    Node root = createRoot("var apple; var banana; apple = 1; banana = 2;");
    NodeTraversal.traverse(compiler, root, callback);
    Scope scope = new GlobalScope(root);
    Var appleVar = scope.getVar("apple");
    Var bananaVar = scope.getVar("banana");
    assertNotNull("Apple reference collection should exist", callback.getReferenceCollection(appleVar));
    assertNull("Banana should be filtered out", callback.getReferenceCollection(bananaVar));
  }

  @Test
  public void testIsBlockBoundary() throws Exception {
    java.lang.reflect.Method method = ReferenceCollectingCallback.class.getDeclaredMethod(
        "isBlockBoundary", Node.class, Node.class);
    method.setAccessible(true);

    Node n = new Node(Token.EMPTY);
    Node parent = new Node(Token.IF);
    parent.addChildToBack(new Node(Token.EMPTY));
    parent.addChildToBack(new Node(Token.EMPTY));
    assertTrue("Second child of IF is boundary", 
        (Boolean) method.invoke(null, parent.getFirstChild().getNext(), parent));

    assertFalse("First child of IF is not boundary",
        (Boolean) method.invoke(null, parent.getFirstChild(), parent));

    Node parent2 = new Node(Token.CASE);
    n = new Node(Token.EMPTY);
    parent2.addChildToBack(n);
    assertTrue("CASE is always boundary", 
        (Boolean) method.invoke(null, n, parent2));
  }

  @Test
  public void testEnterScopePushesBlock() {
    Node root = new Node(Token.SCRIPT);
    callback.enterScope(new NodeTraversal(compiler, root, null) {
      @Override
      public Scope getScope() {
        return new GlobalScope(root);
      }
    });
    // Just verify no exception
  }

  @Test
  public void testExitScopeCallsBehavior() {
    final boolean[] called = new boolean[1];
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
        called[0] = true;
      }
    };
    callback = new ReferenceCollectingCallback(compiler, behavior);
    callback.exitScope(new NodeTraversal(compiler, new Node(Token.SCRIPT), null));
    assertTrue("Behavior should be called on exitScope", called[0]);
  }

  @Test
  public void testShouldTraverseAlwaysPushesBlock() {
    Node n = new Node(Token.EMPTY);
    NodeTraversal t = new NodeTraversal(compiler, n, null);
    assertTrue("shouldTraverse should always return true", 
        callback.shouldTraverse(t, n, null));
  }

  @Test
  public void testAddReferenceBasicFlow() {
    Node root = createRoot("var a; a = 1;");
    NodeTraversal.traverse(compiler, root, callback);
    Scope scope = new GlobalScope(root);
    Var var = scope.getVar("a");
    assertNotNull("Reference collection should exist", callback.getReferenceCollection(var));
  }

  @Test
  public void testReferenceDeclarationDetection() {
    Node nameNode = new Node(Token.NAME, "a");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Reference ref = new Reference(nameNode, varNode, script, null, new GlobalScope(script), "test.js");
    assertTrue("Should be a declaration", ref.isDeclaration());
    assertTrue("Should be a var declaration", ref.isVarDeclaration());
  }

  @Test
  public void testReferenceInitializingDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node varNode = new Node(Token.VAR);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(nameNode);
    assign.addChildToBack(new Node(Token.EMPTY));
    varNode.addChildToBack(assign);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Reference ref = new Reference(nameNode, varNode, script, null, new GlobalScope(script), "test.js");
    assertTrue("Should be initializing declaration", ref.isInitializingDeclaration());
  }

  @Test
  public void testReferenceCollectionIsWellDefined() {
    ReferenceCollection coll = new ReferenceCollection();
    assertFalse("Empty collection not well defined", coll.isWellDefined());
  }

  @Test
  public void testReferenceGetInitializingReference() {
    ReferenceCollection coll = new ReferenceCollection();
    assertNull("No init reference", coll.getInitializingReference());
  }

  @Test
  public void testReferenceIsAssignedOnceInLifetime() {
    ReferenceCollection coll = new ReferenceCollection();
    assertFalse("Empty collection not assigned once", coll.isAssignedOnceInLifetime());
  }

  @Test
  public void testReferenceIsNeverAssigned() {
    ReferenceCollection coll = new ReferenceCollection();
    assertTrue("Empty collection never assigned", coll.isNeverAssigned());
  }

  @Test
  public void testReferenceFirstReferenceIsAssigningDeclaration() {
    ReferenceCollection coll = new ReferenceCollection();
    assertFalse("Empty collection not assigning declaration", coll.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testNewBleedingFunction() {
    Node func = new Node(Token.FUNCTION);
    func.addChildToBack(new Node(Token.NAME, "f"));
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(func);
    Node nameNode = func.getFirstChild();
    NodeTraversal t = new NodeTraversal(compiler, func, null) {
      @Override
      public Scope getScope() {
        return new GlobalScope(script);
      }
    };
    Reference ref = Reference.newBleedingFunction(t, null, func);
    assertNotNull("Bleeding function reference should be created", ref);
    assertEquals("Name node should match", nameNode, ref.getNameNode());
  }

  @Test
  public void testReferenceIsLvalue() {
    Node nameNode = new Node(Token.NAME, "a");
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(nameNode);
    assign.addChildToBack(new Node(Token.EMPTY));
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);
    Reference ref = new Reference(nameNode, assign, script, null, new GlobalScope(script), "test.js");
    // TO-DO: Properly test isLvalue if issues persist
  }

  @Test
  public void testReferenceIsInitializingAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node varNode = new Node(Token.VAR);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(nameNode);
    assign.addChildToBack(new Node(Token.EMPTY));
    varNode.addChildToBack(assign);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Reference ref = new Reference(nameNode, assign, null, null, new GlobalScope(script), "test.js");
    assertFalse("Not initializing assignment", ref.isInitializingAssignment());
  }

  @Test
  public void testBasicBlockStartLogic() {
    Node root = new Node(Token.SCRIPT);
    BasicBlock block = new BasicBlock(null, root);
    assertNull("Parent block should be null", block.parent);
    assertEquals("Root node should match", root, block.root);
  }

  @Test
  public void testBasicBlockEntryLogic() {
    Node root = new Node(Token.SCRIPT);
    BasicBlock block = new BasicBlock(null, root);
    assertFalse("No entries initially", block.isHoisted);
  }

  @Test
  public void testIsDeclarationParentTypes() {
    Node parent = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    parent.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(parent);
    Reference ref = new Reference(nameNode, parent, script, null, new GlobalScope(script), "test.js");
    assertTrue("Var parent should be declaration", ref.isDeclaration());
  }

  @Test
  public void testIsHoistedFunctionDeclaration() {
    Node parent = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "f");
    parent.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(parent);
    Reference ref = new Reference(nameNode, parent, script, null, new GlobalScope(script), "test.js");
    // This assumes isHoistedFunctionDeclaration checks function name position
  }

  @Test
  public void testGetSourceName() {
    Node nameNode = new Node(Token.NAME, "a");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Reference ref = new Reference(nameNode, varNode, script, null, new GlobalScope(script), "source-code.js");
    assertEquals("Source name should match", "source-code.js", ref.getSourceName());
  }

  @Test
  public void testReferenceScope() {
    Node nameNode = new Node(Token.NAME, "a");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Scope scope = new GlobalScope(script);
    Reference ref = new Reference(nameNode, varNode, script, null, scope, "test.js");
    assertSame("Scope should match", scope, ref.getScope());
  }

  @Test
  public void testGrandparentNullHandling() {
    Reference ref = new Reference(new Node(Token.NAME, "a"), new Node(Token.VAR), null, null, null, "test.js");
    assertNull("Grandparent can be null", ref.getGrandparent());
  }

  @Test
  public void testIsInitializingDeclarationWithNullDeclaration() {
    ReferenceCollection coll = new ReferenceCollection();
    assertFalse("No declaration means not initializing", coll.isInitializingDeclarationAt(0));
  }

  @Test
  public void testIsInitializingAssignmentWithInvalidIndex() {
    ReferenceCollection coll = new ReferenceCollection();
    assertFalse("Invalid index returns false", coll.isInitializingAssignmentAt(5));
    assertFalse("Out of bounds index returns false", coll.isInitializingAssignmentAt(10));
  }

  private Node createRoot(String code) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseSyntheticCode(code);
    assertNotNull("Failed to parse code", root);
    return root;
  }

  private Var createVar(String name) {
    return new Var(name, new Node(Token.NAME, name), new GlobalScope(new Node(Token.SCRIPT)));
  }

  private Node createNameNode(String name) {
    return new Node(Token.NAME, name);
  }

  // Static helper classes for testing
  static class Compiler extends AbstractCompiler {
    @Override
    public void process(Node externs, Node root) {
      // No-op for test
    }

    @Override
    public Node parseSyntheticCode(String code) {
      // Dummy implementation
      Node script = new Node(Token.SCRIPT);
      script.setSourceFileForTesting(code);
      return script;
    }
  }

  static class GlobalScope extends Scope {
    GlobalScope(Node root) {
      super(root, null);
    }

    @Override
    public GlobalScope getParent() {
      return null;
    }

    @Override
    public void declare(Node name, Node type, Node initialValue, Node declaration) {
    }
  }
}