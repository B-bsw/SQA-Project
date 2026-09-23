package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.List;

@RunWith(JUnit4.class)
public class ScopedAliasesTest {

  private static class TestCompiler extends AbstractCompiler {
    private final ErrorManager errorManager = new ErrorManager();

    @Override
    public ErrorManager getErrorManager() {
      return errorManager;
    }

    private static class ErrorManager implements com.google.javascript.jscomp.ErrorManager {
      private boolean hasErrors = false;

      @Override
      public void report(CheckLevel level, JSError error) {}

      @Override
      public void throwException() {
        if (hasErrors) {
          throw new RuntimeException("Compilation errors");
        }
      }

      @Override
      public void report(CheckLevel level, JSError error) {}

      @Override
      public void report(CheckLevel level, JSError error) {}

      @Override
      public void report(CheckLevel level, JSError error) {}
      // ... other required ErrorManager methods (can be overridden with empty impl)
    }

    @Override
    public void report(com.google.javascript.jscomp.JSError error) {}

    @Override
    public void setOnChange(com.google.javascript.jscomp.CodeChangeHandler handler) {}

    @Override
    public void setOnScopeChange(com.google.javascript.jscomp.ScopeChangeHandler handler) {}

    @Override
    public ScopeCreator getScopeCreator() {
      return null;
    }

    @Override
    public void reportCodeChange() {}
  }

  private TestCompiler compiler;
  private ScopedAliases scopedAliases;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    scopedAliases = new ScopedAliases(compiler, null, new AliasTransformationHandler() {
      @Override
      public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position) {
        return new AliasTransformation() {
          @Override
          public void addAlias(String alias, String originalName) {
            // no-op
          }
        };
      }
    });
  }

  @Test
  public void testProcess_NoScopeCalls() {
    Node root = new Node(Token.SCRIPT);
    root.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.NAME, "foo")));
    scopedAliases.process(null, root);
    assertFalse(scopedAliases.traversal.hasErrors());
    assertEquals(0, scopedAliases.traversal.getScopeCalls().size());
    assertEquals(0, scopedAliases.traversal.getAliasDefinitionsInOrder().size());
    assertEquals(0, scopedAliases.traversal.getAliasUsages().size());
  }

  @Test
  public void testProcess_InvalidGoogScopeCall() {
    Node root = new Node(Token.SCRIPT);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node call = new Node(Token.CALL, new Node(Token.NAME, "goog.scope"));
    Node param = new Node(Token.NUMBER, 1);
    call.addChildToBack(param);
    exprResult.addChildToBack(call);
    root.addChildToBack(exprResult);

    scopedAliases.process(null, root);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testVisit_NonAliasLocalVariable() {
    Node root = new Node(Token.SCRIPT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "localVar");
    name.addChildToBack(new Node(Token.NUMBER, 1));
    var.addChildToBack(name);
    root.addChildToBack(var);

    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, name, var);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testVisit_AliasDefinition() {
    Node root = new Node(Token.SCRIPT);
    Node var = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "foo");
    Node call = new Node(Token.CALL, new Node(Token.NAME, "goog.dom"));
    var.addChildToBack(name);
    name.addChildToBack(call);
    root.addChildToBack(var);

    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, name, var);
    assertFalse(scopedAliases.traversal.hasErrors());
    assertEquals(1, scopedAliases.traversal.getAliasDefinitionsInOrder().size());
  }

  @Test
  public void testVisit_AliasRedefined() {
    Node root = new Node(Token.SCRIPT);
    Node var1 = new Node(Token.VAR);
    Node name1 = new Node(Token.NAME, "foo");
    var1.addChildToBack(name1);
    root.addChildToBack(var1);

    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, name1, var1);

    Node var2 = new Node(Token.VAR);
    Node name2 = new Node(Token.NAME, "foo");
    var2.addChildToBack(name2);
    root.addChildToBack(var2);

    t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, name2, var2);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testVisit_ReturnInScope() {
    Node root = new Node(Token.SCRIPT);
    Node ret = new Node(Token.RETURN);
    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, ret, null);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testVisit_ThisInScope() {
    Node thisNode = new Node(Token.THIS);
    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, thisNode, null);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testVisit_ThrowInScope() {
    Node throwNode = new Node(Token.THROW);
    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.enterScope(t);
    scopedAliases.traversal.visit(t, throwNode, null);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testIsCallToScopeMethod_ValidCall() {
    Node call = new Node(Token.CALL, new Node(Token.NAME, "goog.scope"));
    assertTrue(scopedAliases.traversal.isCallToScopeMethod(call));
  }

  @Test
  public void testIsCallToScopeMethod_InvalidCall() {
    Node call = new Node(Token.CALL, new Node(Token.NAME, "other.call"));
    assertFalse(scopedAliases.traversal.isCallToScopeMethod(call));
  }

  @Test
  public void testValidateScopeCall_WrongChildCount() {
    Node n = new Node(Token.CALL);
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(n);
    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    scopedAliases.traversal.validateScopeCall(t, n, parent);
    assertTrue(scopedAliases.traversal.hasErrors());
  }

  @Test
  public void testShouldTraverse_NestedScopePrevented() {
    Node n = new Node(Token.FUNCTION);
    NodeTraversal t = new NodeTraversal(compiler, scopedAliases.traversal);
    assertFalse(scopedAliases.traversal.shouldTraverse(t, n, null));
  }

  @Test
  public void testGetSourceRegion_NullNext() {
    Node n = new Node(Token.NAME, "foo");
    n.setLineno(10);
    n.setCharno(5);
    SourcePosition<AliasTransformation> pos = scopedAliases.traversal.getSourceRegion(n);
    assertNotNull(pos);
    assertEquals(10, pos.getStartLine());
    assertEquals(5, pos.getPositionChar());
  }
}