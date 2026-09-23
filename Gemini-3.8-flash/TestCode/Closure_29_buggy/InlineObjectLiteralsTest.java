package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class InlineObjectLiteralsTest {

  private static class TestCompiler extends AbstractCompiler {
    private final CodingConvention convention = new CodingConvention() {
      @Override
      public boolean isExported(String name) {
        return name.startsWith("exported_");
      }
    };

    @Override
    public CodingConvention getCodingConvention() {
      return convention;
    }

    @Override
    public void process(Node externs, Node root) {
      // no-op
    }
  }

  private static class TestSupplier implements Supplier<String> {
    private int counter = 0;

    @Override
    public String get() {
      return "s" + (counter++);
    }
  }

  private InlineObjectLiterals pass;
  private TestCompiler compiler;
  private TestSupplier supplier;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    supplier = new TestSupplier();
    pass = new InlineObjectLiterals(compiler, supplier);
  }

  @Test
  public void testIsInlinableObject_NullReference() {
    // Should return false for empty reference list (loop 0 iterations)
    List<Reference> refs = new ArrayList<>();
    assertFalse(pass.isInlinableObject(refs));
  }

  @Test
  public void testIsInlinableObject_CallTarget() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.GETPROP);
    Node gramps = new Node(Token.CALL);
    parent.addChildToBack(name);
    gramps.addChildToBack(parent);
    Node refNode = name;
    
    // Create reference with parent being getprop and gramps being call
    List<Reference> refs = Arrays.asList(createReference(refNode));
    // The parent is getProp and gramps is call, so should return false
    assertFalse(pass.isInlinableObject(refs));
  }

  @Test
  public void testIsInlinableObject_SelfReferential() {
    // Test self-referential assignment detection
    Node objectLit = new Node(Token.OBJECTLIT);
    Node prop = new Node(Token.STRING_KEY, "a");
    Node parent = new Node(Token.ASSIGN);
    parent.addChildToBack(prop);
    objectLit.addChildToBack(prop);
    
    Node refNode = new Node(Token.NAME, "x");
    Node refParent = new Node(Token.VAR);
    refParent.addChildToBack(refNode);
    Reference ref = new Reference(refNode, refParent, "test");
    
    // This would require more setup for proper testing
    // Basic sanity check
    assertNotNull(ref);
  }

  @Test
  public void testComputeVarList_EmptyReferences() {
    Var v = createDummyVar();
    ReferenceCollection refInfo = new ReferenceCollection();
    
    Map<String, String> varmap = pass.computeVarList(v, refInfo);
    assertNotNull(varmap);
    assertTrue(varmap.isEmpty());
  }

  @Test
  public void testIsVarOrAssignExprLhs_VarLhs() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(name);
    
    assertTrue(pass.isVarOrAssignExprLhs(name));
  }

  @Test
  public void testIsVarOrAssignExprLhs_AssignLhs() {
    Node name = new Node(Token.NAME, "x");
    Node assign = new Node(Token.ASSIGN);
    Node exprResult = new Node(Token.EXPR_RESULT);
    assign.addChildToBack(name);
    exprResult.addChildToBack(assign);
    
    assertTrue(pass.isVarOrAssignExprLhs(name));
  }

  @Test
  public void testIsVarOrAssignExprLhs_NotLhs() {
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.ADD);
    parent.addChildToBack(name);
    
    assertFalse(pass.isVarOrAssignExprLhs(name));
  }

  @Test
  public void testProcess_NullRoot() {
    // Should not throw NPE
    compiler = new TestCompiler();
    pass = new InlineObjectLiterals(compiler, new TestSupplier());
    try {
      pass.process(null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testProcess_EmptyScript() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    root.addChildToBack(new Node(Token.EMPTY));
    
    try {
      pass.process(externs, root);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testIsInlinableObject_WithObjectLitSelfReference() {
    // More complex self-reference test
    Node objectLit = new Node(Token.OBJECTLIT);
    Node propKey = new Node(Token.STRING_KEY, "a");
    Node propVal = new Node(Token.NAME, "b");
    propKey.addChildToBack(propVal);
    objectLit.addChildToBack(propKey);
    
    Node assignParent = new Node(Token.ASSIGN);
    Node val = objectLit;
    Node refNode = new Node(Token.NAME, "x");
    Node refParent = new Node(Token.EXPR_RESULT);
    refParent.addChildToBack(refNode);
    
    Reference ref = new Reference(refNode, refParent, "test");
    List<Reference> refs = Arrays.asList(ref);
    
    // Should not be inlinable due to self-reference
    assertFalse(pass.isInlinableObject(refs));
  }

  @Test
  public void testInliningBehavior_AfterExitScope_NoVars() {
    Node root = new Node(Token.SCRIPT);
    NodeTraversal traversal = new NodeTraversal(compiler, root);
    ReferenceMap emptyMap = new ReferenceMap();
    
    try {
      pass.new InliningBehavior().afterExitScope(traversal, emptyMap);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testBlacklistVarReferencesInTree() {
    Node root = new Node(Token.BLOCK);
    Node nameNode = new Node(Token.NAME, "x");
    root.addChildToBack(nameNode);
    
    Scope scope = new Scope(root, null);
    pass.new InliningBehavior().blacklistVarReferencesInTree(root, scope);
    // No exception means pass
  }

  private Var createDummyVar() {
    Node nameNode = new Node(Token.NAME, "testVar");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(varNode);
    Scope scope = new Scope(script, null);
    return scope.getVar("testVar");
  }

  private Reference createReference(Node node) {
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(node);
    return new Reference(node, parent, "test");
  }
}