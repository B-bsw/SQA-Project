package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NodeTraversalTest {

  private AbstractCompiler compiler;
  private Node root;
  private NodeTraversal traversal;
  private TestCallback callback;

  private static class TestCallback implements NodeTraversal.Callback {
    int visitCount = 0;
    int shouldTraverseCount = 0;
    Node lastVisited;
    Node lastParent;
    StringBuilder visited = new StringBuilder();

    @Override
    public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
      shouldTraverseCount++;
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      visitCount++;
      lastVisited = n;
      lastParent = parent;
      visited.append(n.getType()).append(",");
    }
  }

  private static class TestScopedCallback extends TestCallback implements NodeTraversal.ScopedCallback {
    int enterScopeCount = 0;
    int exitScopeCount = 0;

    @Override
    public void enterScope(NodeTraversal t) {
      enterScopeCount++;
    }

    @Override
    public void exitScope(NodeTraversal t) {
      exitScopeCount++;
    }
  }

  private static class TestCompiler extends AbstractCompiler {
    private CompilerInput input;
    private String sourceFile;
    private String sourceCode;

    TestCompiler() {
      super(null);
    }

    @Override
    public CompilerInput getInput(InputId i) {
      return input;
    }

    @Override
    public CompilerInput getInput(String fileName) {
      return input;
    }

    @Override
    public void setSourceFile(String fileName, String code) {
      this.sourceFile = fileName;
      this.sourceCode = code;
    }

    @Override
    public String getSourceFile(String fileName) {
      return sourceFile;
    }

    @Override
    public String getSourceLine(String sourceName, int lineNumber) {
      if (sourceName == null || sourceName.isEmpty()) {
        return null;
      }
      String[] lines = sourceCode.split("\n");
      if (lineNumber > 0 && lineNumber <= lines.length) {
        return lines[lineNumber - 1];
      }
      return null;
    }

    @Override
    void throwInternalError(String message, Exception e) {
      throw new RuntimeException(message, e);
    }

    @Override
    public void halt(int x) {
      throw new RuntimeException("halt(" + x + ")");
    }
  }

  private Node createScript(int numberOfStatements) {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    for (int i = 0; i < numberOfStatements; i++) {
      script.addChildToBack(new Node(Token.EXPR_RESULT));
    }
    return script;
  }

  private Node createFunction(String name) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node paramList = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node function = new Node(Token.FUNCTION, nameNode, paramList, body);
    return function;
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    callback = new TestCallback();
    root = createScript(3);
  }

  @Test
  public void testTraverse_EmptyRoot() {
    Node emptyRoot = new Node(Token.SCRIPT);
    TestCallback cb = new TestCallback();
    NodeTraversal.traverse(compiler, emptyRoot, cb);
    assertEquals(1, cb.visitCount);
    assertEquals(1, cb.shouldTraverseCount);
    assertSame(emptyRoot, cb.lastVisited);
  }

  @Test
  public void testTraverse_WithChildNodes() {
    NodeTraversal.traverse(compiler, root, callback);
    assertEquals(4, callback.visitCount);
    assertEquals(4, callback.shouldTraverseCount);
    assertSame(root, callback.lastVisited);
    assertNull(callback.lastParent);
  }

  @Test
  public void testTraverse_NullCallback() {
    try {
      NodeTraversal.traverse(compiler, root, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testTraverse_NullRoot() {
    try {
      NodeTraversal.traverse(compiler, null, callback);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testTraverse_WithScope() {
    TestScopedCallback scopedCallback = new TestScopedCallback();
    NodeTraversal.traverse(compiler, root, scopedCallback);
    assertTrue(scopedCallback.enterScopeCount >= 1);
    assertTrue(scopedCallback.exitScopeCount >= 1);
    assertEquals(scopedCallback.enterScopeCount, scopedCallback.exitScopeCount);
  }

  @Test
  public void testTraverseRoots_EmptyList() {
    NodeTraversal.traverseRoots(compiler, Arrays.<Node>asList(), callback);
    assertEquals(0, callback.visitCount);
    assertEquals(0, callback.shouldTraverseCount);
  }

  @Test
  public void testTraverseRoots_SingleRoot() {
    Node singleRoot = createScript(1);
    NodeTraversal.traverseRoots(compiler, Arrays.asList(singleRoot), callback);
    assertEquals(2, callback.visitCount);
    assertSame(singleRoot, callback.lastVisited);
  }

  @Test
  public void testTraverseRoots_MultipleRoots() {
    Node firstRoot = createScript(1);
    Node secondRoot = createScript(2);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToFront(firstRoot);
    parent.addChildToBack(secondRoot);

    NodeTraversal.traverseRoots(compiler, Arrays.asList(firstRoot, secondRoot), callback);
    assertEquals(3, callback.visitCount);
    assertSame(secondRoot, callback.lastVisited);
  }

  @Test
  public void testTraverseBranch_SimpleChildren() {
    Node parent = new Node(Token.EXPR_RESULT);
    Node child1 = new Node(Token.NAME, "a");
    Node child2 = new Node(Token.NAME, "b");
    parent.addChildToBack(child1);
    parent.addChildToBack(child2);

    NodeTraversal.traverse(compiler, parent, callback);
    assertEquals(3, callback.visitCount);
    assertSame(parent, callback.lastVisited);
  }

  @Test
  public void testTraverseBranch_ShouldTraverseFalse() {
    NodeTraversal.Callback cb = new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return n.getType() != Token.EXPR_RESULT;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        callback.visit(t, n, parent);
      }
    };

    NodeTraversal.traverse(compiler, root, cb);
    assertTrue(callback.visitCount > 0);
    assertTrue(callback.visitCount < 4);
  }

  @Test
  public void testGetEnclosingFunction_NoFunction() {
    traversal = new NodeTraversal(compiler, callback);
    traversal.traverse(root);
    assertNull(traversal.getEnclosingFunction());
  }

  @Test
  public void testGetEnclosingFunction_InsideFunction() {
    TestCallback cb = new TestCallback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.getType() == Token.NAME) {
          assertNotNull(t.getEnclosingFunction());
        } else {
          super.visit(t, n, parent);
        }
      }
    };

    Node function = createFunction("foo");
    function.addChildToBack(new Node(Token.NAME, "x"));
    NodeTraversal.traverse(compiler, function, cb);
  }

  @Test
  public void testGetCurrentNode() {
    final NodeTraversal[] capturedTraversal = new NodeTraversal[1];
    NodeTraversal.Callback cb = new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        capturedTraversal[0] = nodeTraversal;
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };

    NodeTraversal.traverse(compiler, root, cb);
    assertNotNull(capturedTraversal[0]);
    assertSame(root, capturedTraversal[0].getCurrentNode());
  }

  @Test
  public void testTraverseWithScope_InsideFunction() {
    Node function = createFunction("bar");
    Node nameNode = function.getFirstChild();
    Node paramList = nameNode.getNext();
    Node bodyNode = paramList.getNext();
    bodyNode.addChildToBack(new Node(Token.EXPR_RESULT));

    final TestScopedCallback scopedCallback = new TestScopedCallback();
    NodeTraversal.traverse(compiler, function, scopedCallback);
    assertTrue(scopedCallback.enterScopeCount >= 1);
    assertTrue(scopedCallback.exitScopeCount >= 1);
  }

  @Test
  public void testGetSourceName_AfterTraverse() {
    traversal = new NodeTraversal(compiler, callback);
    traversal.traverse(root);
    assertEquals("", traversal.getSourceName());
  }

  @Test
  public void testGetSourceName_WithInput() {
    TestCompiler testCompiler = new TestCompiler();
    testCompiler.setSourceFile("test.js", "var x=1;");
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    NodeTraversal.traverse(testCompiler, script, callback);
    assertEquals("", testCompiler.getSourceLine("test.js", 1).trim());
  }

  @Test
  public void testGetLineNumber_NoNode() {
    traversal = new NodeTraversal(compiler, callback);
    assertEquals(0, traversal.getLineNumber());
  }

  @Test
  public void testGetLineNumber_WithNode() {
    Node n = new Node(Token.NAME, "test");
    n.setLineno(5);
    n.setCharno(10);
    traversal = new NodeTraversal(compiler, callback);
    traversal.traverse(n);
    assertEquals(5, traversal.getLineNumber());
  }

  @Test
  public void testGetModule_Null() {
    traversal = new NodeTraversal(compiler, callback);
    assertNull(traversal.getModule());
  }

  @Test
  public void testGetScope_Null() {
    traversal = new NodeTraversal(compiler, callback);
    assertNull(traversal.getScope());
  }

  @Test
  public void testGetControlFlowGraph_Null() {
    traversal = new NodeTraversal(compiler, callback);
    assertNull(traversal.getControlFlowGraph());
  }

  @Test
  public void testHasScope_Initial() {
    traversal = new NodeTraversal(compiler, callback);
    assertFalse(traversal.hasScope());
  }

  @Test
  public void testGetScopeDepth_Initial() {
    traversal = new NodeTraversal(compiler, callback);
    assertEquals(0, traversal.getScopeDepth());
  }

  @Test
  public void testMakeError_WithArguments() {
    traversal = new NodeTraversal(compiler, callback);
    JSError error = traversal.makeError(root, CheckLevel.ERROR, NodeTraversal.NODE_TRAVERSAL_ERROR, "test");
    assertNotNull(error);
    assertEquals(NodeTraversal.NODE_TRAVERSAL_ERROR, error.getType());
  }

  @Test
  public void testReport_WithException() {
    final NodeTraversal.Callback badCallback = new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        throw new RuntimeException("boom");
      }
    };

    TestCompiler testCompiler = new TestCompiler();
    testCompiler.setSourceFile("test.js", "function foo() { bar(); }");
    try {
      NodeTraversal.traverse(testCompiler, root, badCallback);
      fail("Expected RuntimeException");
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof RuntimeException);
      assertEquals("boom", e.getCause().getMessage());
    }
  }

  @Test
  public void testGetEnclosingFunction_RootLevel() {
    Node program = new Node(Token.SCRIPT);
    program.addChildToBack(new Node(Token.EXPR_RESULT));
    final NodeTraversal[] traversalRef = new NodeTraversal[1];
    NodeTraversal.Callback cb = new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
        traversalRef[0] = nodeTraversal;
        return true;
      }

      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };
    NodeTraversal.traverse(compiler, program, cb);
    assertNull(traversalRef[0].getEnclosingFunction());
  }

  @Test
  public void testAbstractPostOrderCallback() {
    NodeTraversal.AbstractPostOrderCallback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };
    assertTrue(cb.shouldTraverse(null, null, null));
  }

  @Test
  public void testAbstractScopedCallback() {
    NodeTraversal.AbstractScopedCallback cb = new NodeTraversal.AbstractScopedCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };
    assertTrue(cb.shouldTraverse(null, null, null));
    cb.enterScope(null);
    cb.exitScope(null);
  }

  @Test
  public void testAbstractShallowCallback() {
    NodeTraversal.AbstractShallowCallback cb = new NodeTraversal.AbstractShallowCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };
    Node n = new Node(Token.NAME, "x");
    assertTrue(cb.shouldTraverse(null, n, null));
    assertTrue(cb.shouldTraverse(null, n, new Node(Token.EXPR_RESULT)));
    Node func = createFunction("f");
    assertFalse(cb.shouldTraverse(null, func.getFirstChild().getNext(), func));
  }

  @Test
  public void testAbstractShallowStatementCallback() {
    NodeTraversal.AbstractShallowStatementCallback cb = new NodeTraversal.AbstractShallowStatementCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    };
    Node stmt = new Node(Token.EXPR_RESULT);
    assertTrue(cb.shouldTraverse(null, stmt, null));
    assertTrue(cb.shouldTraverse(null, stmt, new Node(Token.BLOCK)));
    NodeUtil util = new NodeUtil();
    assertFalse(cb.shouldTraverse(null, new Node(Token.NAME, "x"), new Node(Token.NAME, "y")));
  }

  @Test
  public void testAbstractNodeTypePruningCallback() {
    Set<Integer> types = new HashSet<Integer>(Arrays.asList(Token.NAME));
    NodeTraversal.AbstractNodeTypePruningCallback cb = new NodeTraversal.AbstractNodeTypePruningCallback(types, true);
    assertTrue(cb.shouldTraverse(null, new Node(Token.NAME, "x"), null));
    assertFalse(cb.shouldTraverse(null, new Node(Token.STRING, "y"), null));

    cb = new NodeTraversal.AbstractNodeTypePruningCallback(types, false);
    assertFalse(cb.shouldTraverse(null, new Node(Token.NAME, "x"), null));
    assertTrue(cb.shouldTraverse(null, new Node(Token.STRING, "y"), null));
  }

  @Test
  public void testTraverseAtScope() {
    Node function = createFunction("outer");
    TestScopedCallback scopedCallback = new TestScopedCallback();
    NodeTraversal traversal = new NodeTraversal(compiler, scopedCallback);
    traversal.traverseAtScope(function);
  }

  @Test
  public void testTraverseWithScope() {
    Node script = createScript(0);
    Node block = new Node(Token.BLOCK);
    script.addChildToBack(block);
    TestCallback cb = new TestCallback();
    NodeTraversal traversal = new NodeTraversal(compiler, cb);
    traversal.traverseWithScope(script.getFirstChild(), null);
  }

  @Test
  public void testFormatNodePosition_NullNode() {
    traversal = new NodeTraversal(compiler, callback);
    Node n = null;
    assertEquals("  Node: NULL", traversal.formatNodePosition("Node", n));
  }
}