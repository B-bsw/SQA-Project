package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ReferenceCollectingCallbackTest {

  private static final class TestCompiler extends AbstractCompiler {
    @Override
    public void process(Node externs, Node root) {
      // no-op
    }
  }

  private static final class TestBehavior implements ReferenceCollectingCallback.Behavior {
    @Override
    public void afterExitScope(NodeTraversal t, Map<Scope.Var, ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
      // no-op
    }
  }

  private ReferenceCollectingCallback callback;
  private TestCompiler compiler;
  private Node root;
  private Node externs;
  private NodeTraversal traversal;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    callback = new ReferenceCollectingCallback(compiler, new TestBehavior());
    externs = new Node(Token.EMPTY);
    root = new Node(Token.SCRIPT);
  }

  @Test
  public void testProcessWithEmptyRoot() {
    callback.process(externs, root);
    assertNotNull(callback.getReferencedVariables());
    assertTrue(callback.getReferencedVariables().isEmpty());
  }

  @Test
  public void testVisitWithNameNodeAndNullScope() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT, name);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    callback.visit(t, name, parent);
    assertTrue(callback.getReferencedVariables().isEmpty());
  }

  @Test
  public void testEnterAndExitScopeUpdatesBlockStack() {
    Node rootNode = new Node(Token.SCRIPT);
    NodeTraversal t = new NodeTraversal(compiler, rootNode);
    callback.enterScope(t);
    callback.exitScope(t);
  }

  @Test
  public void testShouldTraverseReturnsTrue() {
    Node n = new Node(Token.NAME, "test");
    Node parent = new Node(Token.EXPR_RESULT, n);
    assertTrue(callback.shouldTraverse(null, n, parent));
  }

  @Test
  public void testIsBlockBoundaryWithNullParent() {
    assertFalse(ReferenceCollectingCallback.isBlockBoundary(new Node(Token.NAME), null));
  }

  @Test
  public void testIsBlockBoundaryWithForParent() {
    Node forNode = new Node(Token.FOR);
    Node child = new Node(Token.NAME);
    forNode.addChildToBack(child);
    assertFalse(ReferenceCollectingCallback.isBlockBoundary(child, forNode));
  }

  @Test
  public void testReferenceCreationAndGetters() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertEquals(nameNode, ref.getNameNode());
    assertEquals(parent, ref.getParent());
    assertEquals(grandparent, ref.getGrandparent());
  }

  @Test
  public void testReferenceIsVarDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertTrue(ref.isVarDeclaration());
  }

  @Test
  public void testReferenceIsNotVarDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.ASSIGN, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertFalse(ref.isVarDeclaration());
  }

  @Test
  public void testReferenceIsInitializingDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testReferenceIsInitializingAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node assign = new Node(Token.ASSIGN, nameNode, new Node(Token.NUMBER, 1));
    Node parent = new Node(Token.EXPR_RESULT, assign);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertFalse(ref.isInitializingAssignment());
  }

  @Test
  public void testReferenceIsDeclarationWithVarParent() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReferenceIsDeclarationWithFunctionParent() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.FUNCTION, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReferenceIsDeclarationWithCatchParent() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.CATCH, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertTrue(ref.isDeclaration());
  }

  @Test
  public void testReferenceIsNotLValue() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertFalse(ref.isLvalue());
  }

  @Test
  public void testReferenceGetBasicBlock() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.BasicBlock block = new ReferenceCollectingCallback.BasicBlock(null, grandparent);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, block);
    assertSame(block, ref.getBasicBlock());
  }

  @Test
  public void testReferenceGetScope() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertSame(t.getScope(), ref.getScope());
  }

  @Test
  public void testReferenceGetSourceName() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    assertEquals("test.js", ref.getSourceName());
  }

  @Test
  public void testNewBleedingFunction() {
    Node nameNode = new Node(Token.NAME, "a");
    Node func = new Node(Token.FUNCTION, nameNode);
    Node parent = new Node(Token.SCRIPT, func);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = ReferenceCollectingCallback.Reference.newBleedingFunction(t, null, func);
    assertNotNull(ref);
    assertEquals(nameNode, ref.getNameNode());
  }

  @Test
  public void testReferenceCollectionIsWellDefinedWithNoReferences() {
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    assertFalse(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollectionIsWellDefinedWithOneDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertTrue(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollectionIsWellDefinedWithDeclarationPlusAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);

    Node assignName = new Node(Token.NAME, "a");
    Node assign = new Node(Token.ASSIGN, assignName, new Node(Token.NUMBER, 1));
    Node assignParent = new Node(Token.EXPR_RESULT, assign);
    Node assignGrandparent = new Node(Token.SCRIPT, assignParent);
    ReferenceCollectingCallback.Reference assignRef = new ReferenceCollectingCallback.Reference(assignName, assignParent, t, null);
    collection.add(assignRef, t, null);

    assertTrue(collection.isWellDefined());
  }

  @Test
  public void testReferenceCollectionIsEscaped() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertFalse(collection.isEscaped());
  }

  @Test
  public void testGetInitializingReferenceWithJustDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertEquals(ref, collection.getInitializingReference());
  }

  @Test
  public void testGetInitializingReferenceWithDeclarationThenAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);

    Node assignName = new Node(Token.NAME, "a");
    Node assign = new Node(Token.ASSIGN, assignName, new Node(Token.NUMBER, 1));
    Node assignParent = new Node(Token.EXPR_RESULT, assign);
    Node assignGrandparent = new Node(Token.SCRIPT, assignParent);
    ReferenceCollectingCallback.Reference assignRef = new ReferenceCollectingCallback.Reference(assignName, assignParent, t, null);
    collection.add(assignRef, t, null);

    assertEquals(assignRef, collection.getInitializingReference());
  }

  @Test
  public void testGetInitializingReferenceForConstantsWithDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertEquals(ref, collection.getInitializingReferenceForConstants());
  }

  @Test
  public void testGetOneAndOnlyAssignmentWithSingleAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertEquals(ref, collection.getOneAndOnlyAssignment());
  }

  @Test
  public void testGetOneAndOnlyAssignmentWithNoAssignments() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.EXPR_RESULT, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertNull(collection.getOneAndOnlyAssignment());
  }

  @Test
  public void testIsAssignedOnceInLifetimeWithSingleAssignment() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertTrue(collection.isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetimeWithMultipleAssignments() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);

    Node assignName = new Node(Token.NAME, "a");
    Node assign = new Node(Token.ASSIGN, assignName, new Node(Token.NUMBER, 1));
    Node assignParent = new Node(Token.EXPR_RESULT, assign);
    Node assignGrandparent = new Node(Token.SCRIPT, assignParent);
    ReferenceCollectingCallback.Reference assignRef = new ReferenceCollectingCallback.Reference(assignName, assignParent, t, null);
    collection.add(assignRef, t, null);

    assertFalse(collection.isAssignedOnceInLifetime());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclaration() {
    Node nameNode = new Node(Token.NAME, "a");
    Node parent = new Node(Token.VAR, nameNode);
    Node grandparent = new Node(Token.SCRIPT, parent);
    NodeTraversal t = new NodeTraversal(compiler, null);
    ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, parent, t, null);
    ReferenceCollectingCallback.ReferenceCollection collection = new ReferenceCollectingCallback.ReferenceCollection();
    collection.add(ref, t, null);
    assertTrue(collection.isFirstReferenceIsAssigningDeclaration());
  }
}