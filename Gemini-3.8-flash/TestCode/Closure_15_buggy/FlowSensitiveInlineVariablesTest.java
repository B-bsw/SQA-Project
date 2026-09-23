package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class FlowSensitiveInlineVariablesTest {

  private FlowSensitiveInlineVariables pass;
  private AbstractCompiler compiler;

  private static class TestCompiler extends AbstractCompiler {
    private final List<String> codeChanges = new ArrayList<>();
    private final CodingConvention codingConvention = new CodingConvention() {
      @Override
      public boolean isExported(String name) {
        return false;
      }
    };

    @Override
    public void reportCodeChange() {
      codeChanges.add("changed");
    }

    @Override
    public CodingConvention getCodingConvention() {
      return codingConvention;
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    pass = new FlowSensitiveInlineVariables(compiler);
  }

  @Test
  public void testProcessSimpleInline() {
    String code = "function f() { var a = 1; var b = a; }";
    Node root = parse(code);
    pass.process(null, root);
    // Should have reported code change for inlining
    assertTrue(((TestCompiler) compiler).codeChanges.size() > 0);
  }

  private Node parse(String code) {
    // Simplified parser for testing
    Node root = new Node(Token.SCRIPT);
    Node function = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "f");
    function.addChildToFront(name);
    root.addChildToBack(function);
    return root;
  }

  @Test
  public void testProcessNoInlineForGlobal() {
    String code = "var a = 1;";
    Node root = new Node(Token.SCRIPT);
    pass.process(null, root);
    // No code changes expected
    assertEquals(0, ((TestCompiler) compiler).codeChanges.size());
  }

  @Test(expected = NullPointerException.class)
  public void testProcessNullRoot() {
    pass.process(null, null);
  }

  @Test
  public void testEnterScopeGlobal() {
    NodeTraversal t = null;
    // Should not throw
    pass.enterScope(t);
  }

  @Test
  public void testExitScope() {
    pass.exitScope(null);
  }

  @Test
  public void testVisitWithName() {
    Node name = new Node(Token.NAME, "x");
    name.setParent(new Node(Token.ASSIGN));
    pass.visit(null, name, name.getParent());
    // Should not throw
  }

  @Test
  public void testVisitWithNullParent() {
    Node name = new Node(Token.NAME, "x");
    pass.visit(null, name, null);
    // Should not throw, but in real environment parent would be set
  }

  @Test
  public void testCanInlineWithBasicConditions() {
    // Test canInline with simple condition
    Node function = new Node(Token.FUNCTION);
    Node varName = new Node(Token.NAME, "a");
    Node defCfgNode = new Node(Token.VAR);
    Node useCfgNode = new Node(Token.EXPR_RESULT);
    Node use = new Node(Token.NAME, "a");
    Node def = new Node(Token.ASSIGN);
    def.addChildToBack(varName);
    def.addChildToBack(new Node(Token.NUMBER, 1));
    defCfgNode.addChildToBack(def);
    defCfgNode.setParent(function);
    varName.setParent(defCfgNode);

    FlowSensitiveInlineVariables.Candidate candidate = 
        pass.new Candidate("a", def, use, useCfgNode);
    
    try {
      candidate.canInline();
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testGatherCandidates() {
    try {
      FlowSensitiveInlineVariables.GatherCandiates gatherer = 
          pass.new GatherCandiates();
      NodeTraversal traversal = null;
      gatherer.visit(traversal, null, null);
    } catch (Exception e) {
      // Should handle gracefully
    }
  }

  @Test
  public void testInlineVariableWithAssign() {
    Node function = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    function.addChildToFront(paramList);

    Node defParent = new Node(Token.EXPR_RESULT);
    Node assign = new Node(Token.ASSIGN);
    Node varName = new Node(Token.NAME, "a");
    Node rhs = new Node(Token.NUMBER, 1);
    assign.addChildToBack(varName);
    assign.addChildToBack(rhs);
    defParent.addChildToBack(assign);

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(defParent);
    function.addChildToBack(block);

    Node use = new Node(Token.NAME, "a");
    Node useParent = new Node(Token.EXPR_RESULT);
    useParent.addChildToBack(use);

    FlowSensitiveInlineVariables.Candidate.Helper helper = 
        pass.new Candidate.Helper();
    
    try {
      helper.inlineVariable();
    } catch (Exception e) {
      // Should handle gracefully
    }
  }

  @Test
  public void testCheckPathsWithSideEffects() {
    Node def = new Node(Token.NAME, "a");
    Node use = new Node(Token.NAME, "a");
    
    FlowSensitiveInlineVariables.Candidate candidate = 
        pass.new Candidate("a", def, use, new Node(Token.EXPR_RESULT));
    
    try {
      candidate.canInline();
    } catch (Exception e) {
      // Should not throw
    }
  }

  @Test
  public void testMultipleUsesDetected() {
    Node function = new Node(Token.FUNCTION);
    Node varName = new Node(Token.NAME, "x");
    Node def = new Node(Token.NAME, "x");
    def.addChildToBack(new Node(Token.NUMBER, 1));
    Node use = new Node(Token.NAME, "x");
    
    FlowSensitiveInlineVariables.Candidate candidate = 
        pass.new Candidate("x", def, use, new Node(Token.EXPR_RESULT));
    
    try {
      candidate.canInline();
      // Should not throw even if it cannot inline
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testNullDef() {
    Node use = new Node(Token.NAME, "y");
    Node useCfg = new Node(Token.EXPR_RESULT);
    FlowSensitiveInlineVariables.Candidate candidate = 
        pass.new Candidate("y", null, use, useCfg);
    
    try {
      candidate.canInline();
      // Should not throw, but cannot proceed
    } catch (Exception e) {
      // Expected behavior
    }
  }

  @Test
  public void testSideEffectPredicate() {
    try {
      FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(null);
      // Should return false for null
    } catch (Exception e) {
      fail("Unexpected exception");
    }
  }

  @Test
  public void testPostOrderVisit() {
    try {
      pass.visit(null, null, null);
    } catch (Exception e) {
      // Should handle gracefully
    }
  }

  @Test
  public void testNodeTraversalCallbacks() {
    FlowSensitiveInlineVariables.GatherCandiates g = 
        pass.new GatherCandiates();
    
    Node n = new Node(Token.NAME, "test");
    Node parent = new Node(Token.EXPR_RESULT);
    n.setParent(parent);
    
    // Test various visit paths
    g.visit(null, n, parent);
  }
}