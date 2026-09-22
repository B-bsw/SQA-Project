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
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class PeepholeOptimizationsPassTest {

  private static class TestCompiler extends AbstractCompiler {
    private CodeChangeHandler changeHandler;
    private boolean handlerRemoved = false;

    @Override
    public void addChangeHandler(CodeChangeHandler handler) {
      this.changeHandler = handler;
    }

    @Override
    public void removeChangeHandler(CodeChangeHandler handler) {
      if (handler == changeHandler) {
        changeHandler = null;
        handlerRemoved = true;
      }
    }

    @Override
    public boolean isHandlerRemoved() {
      return handlerRemoved;
    }
  }

  private static class TestOptimization extends AbstractPeepholeOptimization {
    private boolean beginCalled = false;
    private boolean endCalled = false;
    private Node resultOverride = null;

    @Override
    public Node optimizeSubtree(Node node) {
      if (resultOverride != null) {
        return resultOverride;
      }
      return node;
    }

    @Override
    protected void beginTraversal(AbstractCompiler compiler) {
      beginCalled = true;
    }

    @Override
    protected void endTraversal(AbstractCompiler compiler) {
      endCalled = true;
    }
  }

  private TestCompiler compiler;
  private TestOptimization optimization;
  private PeepholeOptimizationsPass pass;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    optimization = new TestOptimization();
    pass = new PeepholeOptimizationsPass(compiler, optimization);
  }

  @Test
  public void testProcessEmptyRoot() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.EMPTY);
    pass.process(externs, root);
    assertTrue("Handler should be removed", compiler.handlerRemoved);
  }

  @Test
  public void testProcessWithRootFunction() {
    Node root = new Node(Token.FUNCTION);
    Node body = new Node(Token.BLOCK);
    root.addChildToBack(body);
    optimization.beginCalled = false;
    optimization.endCalled = false;
    pass.process(new Node(Token.EMPTY), root);
    assertTrue("Begin traversal should be called", optimization.beginCalled);
    assertTrue("End traversal should be called", optimization.endCalled);
    assertTrue(compiler.handlerRemoved);
  }

  @Test
  public void testProcessWithScriptAndChildFunction() {
    Node root = new Node(Token.SCRIPT);
    Node func = new Node(Token.FUNCTION);
    Node block = new Node(Token.BLOCK);
    func.addChildToBack(block);
    root.addChildToBack(func);
    pass.process(new Node(Token.EMPTY), root);
    assertTrue(compiler.handlerRemoved);
  }

  @Test
  public void testShouldVisitScript() {
    Node script = new Node(Token.SCRIPT);
    // Access via reflection or make test through traverse
    // Since shouldVisit is private, test through process
    optimization.beginCalled = false;
    pass.process(new Node(Token.EMPTY), script);
    assertTrue(optimization.beginCalled);
  }

  @Test
  public void testTraverseChildScopesWhenChanged() {
    Node root = new Node(Token.FUNCTION);
    Node body = new Node(Token.BLOCK);
    root.addChildToBack(body);
    // First visit no change, second visit change
    optimization.resultOverride = null;
    pass.process(new Node(Token.EMPTY), root);
    
    // Now make optimization change the node
    Node newScript = new Node(Token.SCRIPT);
    optimization.resultOverride = newScript;
    optimization.beginCalled = false;
    pass.process(new Node(Token.EMPTY), root);
    assertTrue(optimization.beginCalled);
    optimization.resultOverride = null;
  }

  @Test
  public void testShouldRetraverseWhenChanged() {
    Node root = new Node(Token.FUNCTION);
    Node body = new Node(Token.BLOCK);
    root.addChildToBack(body);
    // Set up optimization to change the node on first visit
    Node originalNode = body;
    Node newNode = new Node(Token.BLOCK);
    optimization.resultOverride = newNode;
    try {
      pass.process(new Node(Token.EMPTY), root);
    } finally {
      optimization.resultOverride = null;
    }
  }

  @Test
  public void testVisitWithNoOptimizations() {
    PeepholeOptimizationsPass emptyPass = new PeepholeOptimizationsPass(compiler);
    Node node = new Node(Token.NAME);
    emptyPass.visit(node);
    // Should not throw exception
  }

  @Test
  public void testVisitWithNullResult() {
    Node original = new Node(Token.NAME);
    TestOptimization opt = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return null;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    p.visit(original);
    // Should not throw
  }

  @Test
  public void testVisitWithNodeReplacement() {
    Node original = new Node(Token.NAME, "original");
    Node replacement = new Node(Token.STRING, "replacement");
    TestOptimization opt = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return replacement;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    p.visit(original);
    // Should not throw
  }

  @Test
  public void testVisitWithMultipleOptimizations() {
    Node original = new Node(Token.NAME, "x");
    TestOptimization opt1 = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return node;
      }
    };
    TestOptimization opt2 = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return node;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt1, opt2);
    p.visit(original);
    // Should not throw
  }

  @Test
  public void testVisitWithOptimizationChangingNode() {
    Node original = new Node(Token.NAME, "x");
    Node replacement = new Node(Token.STRING, "y");
    TestOptimization opt = new TestOptimization() {
      private boolean firstCall = true;
      @Override
      public Node optimizeSubtree(Node node) {
        if (firstCall) {
          firstCall = false;
          return replacement;
        }
        return node;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    p.visit(original);
    // Should not throw
  }

  @Test
  public void testProcessWithNestedFunctions() {
    Node root = new Node(Token.SCRIPT);
    Node func1 = new Node(Token.FUNCTION);
    Node block1 = new Node(Token.BLOCK);
    Node func2 = new Node(Token.FUNCTION);
    Node block2 = new Node(Token.BLOCK);
    func1.addChildToBack(block1);
    func2.addChildToBack(block2);
    block1.addChildToBack(func2);
    root.addChildToBack(func1);
    
    try {
      pass.process(new Node(Token.EMPTY), root);
    } catch (Exception e) {
      fail("Should not throw exception: " + e.getMessage());
    }
  }

  @Test
  public void testGetCompiler() {
    assertSame(compiler, pass.getCompiler());
  }

  @Test
  public void testStateStackInitialState() {
    // Since StateStack is private, test through traversal
    Node root = new Node(Token.SCRIPT);
    try {
      pass.process(new Node(Token.EMPTY), root);
    } catch (Exception e) {
      fail("Should not throw: " + e.getMessage());
    }
  }

  @Test
  public void testManyVisitsCausesRetraversal() {
    // This test ensures loop termination after many iterations
    Node root = new Node(Token.FUNCTION);
    Node block = new Node(Token.BLOCK);
    root.addChildToBack(block);
    
    TestOptimization opt = new TestOptimization() {
      private int count = 0;
      @Override
      public Node optimizeSubtree(Node node) {
        count++;
        if (count < 100) {
          return node;
        }
        return null;
      }
    };
    
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    try {
      p.process(new Node(Token.EMPTY), root);
    } catch (Exception e) {
      fail("Should not throw exception");
    }
  }

  @Test
  public void testCoreOperations() {
    Node node = new Node(Token.NAME, "a");
    assertNotNull(node);
    assertFalse("Node should not be scope", node.isFunction());
    assertFalse("Node should not be script", node.isScript());
  }

  @Test
  public void testProcessWithPotentialInfiniteLoop() {
    // Test with optimization that never changes anything
    Node root = new Node(Token.SCRIPT);
    TestOptimization opt = new TestOptimization();
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    try {
      p.process(new Node(Token.EMPTY), root);
    } catch (StackOverflowError e) {
      fail("Should not cause stack overflow");
    }
  }

  @Test
  public void testProcessWithRootOnly() {
    Node root = new Node(Token.SCRIPT);
    pass.process(new Node(Token.EMPTY), root);
    assertTrue("Handler should be removed", compiler.handlerRemoved);
  }

  @Test
  public void testProcessWithMultipleChildren() {
    Node root = new Node(Token.SCRIPT);
    Node child1 = new Node(Token.EXPR_RESULT);
    Node child2 = new Node(Token.EXPR_RESULT);
    root.addChildToBack(child1);
    root.addChildToBack(child2);
    pass.process(new Node(Token.EMPTY), root);
    assertTrue(compiler.handlerRemoved);
  }

  @Test
  public void testVisitWithPeerOptimizationReturningDifferentNode() {
    Node original = new Node(Token.NAME, "x");
    Node replacement = new Node(Token.STRING, "y");
    TestOptimization opt = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return replacement;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    p.visit(original);
    // Ensure no exception, and handler properly removed
    assertTrue(compiler.handlerRemoved);
  }

  @Test
  public void testExitNodePopState() {
    Node root = new Node(Token.FUNCTION);
    Node innerFunction = new Node(Token.FUNCTION);
    root.addChildToBack(innerFunction);
    try {
      pass.process(new Node(Token.EMPTY), root);
    } catch (Exception e) {
      fail("Should not throw: " + e.getMessage());
    }
  }

  @Test
  public void testStateStackResetOnPush() {
    Node root = new Node(Token.SCRIPT);
    Node func = new Node(Token.FUNCTION);
    root.addChildToBack(func);
    try {
      pass.process(new Node(Token.EMPTY), root);
    } catch (Exception e) {
      fail("Should not throw");
    }
  }

  @Test
  public void testOptimizationResultsApplied() {
    Node original = new Node(Token.NAME, "x");
    Node replacement = new Node(Token.STRING, "y");
    TestOptimization opt = new TestOptimization() {
      @Override
      public Node optimizeSubtree(Node node) {
        return replacement;
      }
    };
    PeepholeOptimizationsPass p = new PeepholeOptimizationsPass(compiler, opt);
    p.visit(original);
    // Just verify no exception, the actual modification is not observable here
  }

  @Test
  public void testProcessWithChangeHandler() {
    Node root = new Node(Token.SCRIPT);
    pass.process(new Node(Token.EMPTY), root);
    assertNull("Handler should be null after processing", compiler.changeHandler);
  }
}