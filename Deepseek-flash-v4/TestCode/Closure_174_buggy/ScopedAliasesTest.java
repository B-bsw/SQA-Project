package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ScopedAliasesTest {

  private static class TestCompiler extends AbstractCompiler {
    private final List<JSError> errors = new java.util.ArrayList<>();
    private final Node root;

    TestCompiler(Node root) {
      this.root = root;
    }

    @Override
    public void report(JSError error) {
      errors.add(error);
    }

    @Override
    public void reportCodeChange() {
      // do nothing
    }

    @Override
    public Node getRoot() {
      return root;
    }
  }

  private Node createScopeMethod() {
    Node call = new Node(Token.CALL);
    Node target = Node.newString("goog.scope");
    target.setQualifiedName("goog.scope");
    call.addChildToFront(target);
    return call;
  }

  private Node createVarAlias(String aliasName, Node qualifiedName) {
    Node var = new Node(Token.VAR);
    Node name = Node.newString(Token.NAME, aliasName);
    name.addChildToBack(qualifiedName.cloneTree());
    var.addChildToBack(name);
    return var;
  }

  private Node createQualifiedName(String name) {
    Node node = Node.newString(Token.NAME, name);
    node.setQualifiedName(name);
    return node;
  }

  private Node createFunction() {
    Node function = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "");
    function.addChildToFront(name);
    Node params = new Node(Token.PARAM_LIST);
    function.addChildToBack(params);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);
    return function;
  }

  private static class TestAliasTransformationHandlerFactory {
    static AliasTransformationHandler getTestHandler() {
      return new AliasTransformationHandler() {
        @Override
        public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<com.google.javascript.rhino.Node> position) {
          return new AliasTransformation() {
            @Override
            public void addAlias(String alias, String definition) {
              // no-op for test
            }
          };
        }
      };
    }
  }

  private ScopedAliases scopedAliases;

  @Before
  public void setUp() {
    Node root = new Node(Token.ROOT);
    // Create a minimal root structure
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);
    scopedAliases = new ScopedAliases(
        new TestCompiler(root),
        null,
        TestAliasTransformationHandlerFactory.getTestHandler());
  }

  @Test
  public void testIsCallToScopeMethodWithNullParent() {
    Node call = new Node(Token.EXPR_RESULT);
    assertFalse(scopedAliases.isCallToScopeMethod(call));
  }

  @Test
  public void testIsCallToScopeMethodWithName() {
    Node call = createScopeMethod();
    assertTrue(scopedAliases.isCallToScopeMethod(call));
  }

  @Test
  public void testIsCallToScopeMethodWithNonScopeMethod() {
    Node call = new Node(Token.CALL);
    Node target = Node.newString("foo");
    target.setQualifiedName("foo");
    call.addChildToFront(target);
    assertFalse(scopedAliases.isCallToScopeMethod(call));
  }

  @Test
  public void testEnterScopeWithNonScopeMethod() {
    Node n = new Node(Token.NAME, "foo");
    Node parent = new Node(Token.EXPR_RESULT, n);
    scopedAliases.enterScope(new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public Node getCurrentNode() {
        return n;
      }
    });
    // Should not throw, no errors expected
    assertFalse(scopedAliases.hasErrors());
    assertEquals(0, scopedAliases.getScopeCalls().size());
  }

  @Test
  public void testEnterScopeWithScopeMethodButInvalidParent() {
    Node n = new Node(Token.NAME, "goog");
    n.setQualifiedName("goog.scope");
    Node call = new Node(Token.CALL, n);
    Node parent = new Node(Token.EXPR_RESULT, call);
    scopedAliases.enterScope(new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public Node getCurrentNode() {
        return call;
      }
    });
    assertTrue(scopedAliases.hasErrors());
  }

  @Test
  public void testGetAliasUsagesReturnsList() {
    List<AliasUsage> usages = scopedAliases.getAliasUsages();
    assertNotNull(usages);
    assertEquals(0, usages.size());
  }

  @Test
  public void testGetAliasDefinitionsInOrderReturnsList() {
    Collection<Node> defs = scopedAliases.getAliasDefinitionsInOrder();
    assertNotNull(defs);
    assertEquals(0, defs.size());
  }

  @Test
  public void testHasErrorsInitiallyFalse() {
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testScopedAliasesConstructorWithNullSymbolTable() {
    Node root = new Node(Token.ROOT);
    ScopedAliases scoped = new ScopedAliases(
        new TestCompiler(root),
        null,
        TestAliasTransformationHandlerFactory.getTestHandler());
    assertNotNull(scoped);
  }

  @Test
  public void testScopedAliasesConstructorWithSymbolTable() {
    Node root = new Node(Token.ROOT);
    PreprocessorSymbolTable symbolTable = new PreprocessorSymbolTable();
    ScopedAliases scoped = new ScopedAliases(
        new TestCompiler(root),
        symbolTable,
        TestAliasTransformationHandlerFactory.getTestHandler());
    assertNotNull(scoped);
  }

  @Test
  public void testProcessWithSimpleScope() {
    Node root = new Node(Token.ROOT);
    Node script = new Node(Token.SCRIPT);
    
    // goog.scope(function() { var x = goog.foo; });
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node call = createScopeMethod();
    Node function = createFunction();
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);
    call.addChildToBack(function);
    exprResult.addChildToBack(call);
    script.addChildToBack(exprResult);
    root.addChildToBack(script);
    
    TestCompiler compiler = new TestCompiler(root);
    ScopedAliases scoped = new ScopedAliases(
        compiler,
        null,
        TestAliasTransformationHandlerFactory.getTestHandler());
    
    scoped.process(null, root);
    assertEquals(0, compiler.getRoot().getChildCount());
  }

  @Test
  public void testHotSwapScriptWithNullOriginal() {
    Node root = new Node(Token.ROOT);
    scopedAliases.hotSwapScript(root, null);
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testEnterScopeWithDepthLessThanTwo() {
    Node n = new Node(Token.NAME, "foo");
    Node call = createScopeMethod();
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(call);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(expr);
    call.addChildToBack(createFunction());
    
    scopedAliases.enterScope(createTraversalWithNode(call));
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testExitScopeWithDepthLessThanTwo() {
    scopedAliases.exitScope(new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public int getScopeDepth() {
        return 0;
      }
    });
    assertFalse(scopedAliases.hasErrors());
  }

  private NodeTraversal createTraversalWithNode(Node n) {
    return new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public Node getCurrentNode() {
        return n;
      }
      
      @Override
      public int getScopeDepth() {
        return 0;
      }
    };
  }

  @Test
  public void testAliasedNodeApplyAlias() {
    Node aliasDef = Node.newString("goog.dom");
    Var aliasVar = createVar("myAlias", aliasDef);
    Node aliasRef = Node.newString("myAlias");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(aliasRef);
    AliasUsage usage = new ScopedAliases.AliasedNode(aliasVar, aliasRef);
    usage.applyAlias();
  }

  @Test
  public void testAliasedTypeNodeApplyAlias() {
    Node aliasDef = Node.newString("goog.dom");
    Var aliasVar = createVar("myAlias", aliasDef);
    Node aliasRef = Node.newString("myAlias");
    aliasRef.setString("myAlias.TagName");
    AliasUsage usage = new ScopedAliases.AliasedTypeNode(aliasVar, aliasRef);
    usage.applyAlias();
  }

  @Test
  public void testReferencesOtherAliasWhenNotAlias() {
    Node aliasDef = Node.newString("goog.dom");
    Var aliasVar = createVar("myAlias", aliasDef);
    Node aliasRef = Node.newString("myAlias");
    AliasUsage usage = new ScopedAliases.AliasedNode(aliasVar, aliasRef);
    assertFalse(usage.referencesOtherAlias());
  }

  private Var createVar(String name, Node initialValue) {
    Node nameNode = Node.newString(Token.NAME, name);
    nameNode.addChildToBack(initialValue);
    return new Var(nameNode, null, null, 0);
  }

  @Test
  public void testGetScopeCallsReturnsList() {
    List<Node> calls = scopedAliases.getScopeCalls();
    assertNotNull(calls);
    assertEquals(0, calls.size());
  }

  @Test
  public void testGoogScopeUsedImproperly() {
    Node n = new Node(Token.NAME, "goog");
    n.setQualifiedName("goog.scope");
    Node call = new Node(Token.CALL, n);
    
    scopedAliases.enterScope(new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public Node getCurrentNode() {
        return call;
      }
    });
    assertTrue(scopedAliases.hasErrors());
  }

  @Test
  public void testTraversalShaowsHandled() {
    // Extended traversal test
    Node traversal = new NodeTraversal(new TestCompiler(new Node(Token.ROOT)), null, null) {
      @Override
      public Node getCurrentNode() {
        return null;
      }
    };
  }
}