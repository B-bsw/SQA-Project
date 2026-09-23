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

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ScopedAliasesTest {

  private AbstractCompiler compiler;
  private ScopedAliases scopedAliases;
  private AliasTransformationHandler transformationHandler;
  private PreprocessorSymbolTable preprocessorSymbolTable;

  private static class TestCompiler extends AbstractCompiler {
    private boolean codeChange;
    private DiagnosticType lastError;
    private Node lastErrorNode;
    private int errorCount;

    TestCompiler() {
      super();
    }

    @Override
    public void reportCodeChange() {
      codeChange = true;
    }

    @Override
    public void report(JSError error) {
      lastError = error.getType();
      lastErrorNode = error.getNode();
      errorCount++;
    }

    @Override
    public void report(NodeTraversal t, DiagnosticType error, Node n, String... arguments) {
      lastError = error;
      lastErrorNode = n;
      errorCount++;
    }

    public boolean hasCodeChange() {
      return codeChange;
    }

    public DiagnosticType getLastError() {
      return lastError;
    }

    public int getErrorCount() {
      return errorCount;
    }
  }

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    private AliasTransformation transformation;

    @Override
    public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position) {
      transformation = new AliasTransformation() {
        @Override
        public void addAlias(String alias, String definition) {
          // no-op
        }
      };
      return transformation;
    }
  }

  @Before
  public void setUp() {
    TestCompiler testCompiler = new TestCompiler();
    this.compiler = testCompiler;
    this.preprocessorSymbolTable = null;
    this.transformationHandler = new TestAliasTransformationHandler();
    this.scopedAliases = new ScopedAliases(compiler, preprocessorSymbolTable, transformationHandler);
  }

  @Test
  public void testProcessWithNoErrors() {
    // Create a simple goog.scope call
    Node scopeCall = new Node(Token.CALL);
    Node scopeFunction = new Node(Token.FUNCTION);
    Node scopeName = new Node(Token.NAME, "goog.scope");
    scopeName.setQualifiedName("goog.scope");
    scopeCall.addChildToBack(scopeName);
    scopeCall.addChildToBack(scopeFunction);

    // Create a body for the function
    Node functionBlock = new Node(Token.BLOCK);
    scopeFunction.addChildToBack(new Node(Token.NAME, ""));
    scopeFunction.addChildToBack(functionBlock);

    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(scopeCall);
    Node scriptRoot = new Node(Token.SCRIPT);
    scriptRoot.addChildToBack(exprResult);

    NodeTraversal t = new NodeTraversal(compiler, scriptRoot);
    scopedAliases.process(null, scriptRoot);
    assertTrue(t.hasScope());
  }

  @Test
  public void testIsCallToScopeMethod() throws Exception {
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    call.addChildToBack(getProp);

    java.lang.reflect.Method method = ScopedAliases.class.getDeclaredMethod("isCallToScopeMethod", Node.class);
    method.setAccessible(true);
    Boolean result = (Boolean) method.invoke(scopedAliases, call);
    assertTrue(result);
    
    // Test with wrong method name
    Node call2 = new Node(Token.CALL);
    Node getProp2 = new Node(Token.GETPROP);
    getProp2.setQualifiedName("goog.nonScope");
    call2.addChildToBack(getProp2);
    Boolean result2 = (Boolean) method.invoke(scopedAliases, call2);
    assertFalse(result2);
  }

  @Test
  public void testEnterScopeWithCallToScopeMethod() {
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    call.addChildToBack(getProp);
    Node function = new Node(Token.FUNCTION);
    call.addChildToBack(function);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);

    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(call);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(exprResult);

    NodeTraversal t = new NodeTraversal(compiler, script);
    scopedAliases.enterScope(t);
    assertNotNull(scopedAliases.transformation);
  }

  @Test
  public void testExitScope() {
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    call.addChildToBack(getProp);
    Node function = new Node(Token.FUNCTION);
    call.addChildToBack(function);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);

    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(call);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(exprResult);

    NodeTraversal t = new NodeTraversal(compiler, script);
    scopedAliases.getScopeCalls().add(call);
    scopedAliases.enterScope(t);
    scopedAliases.exitScope(t);
    assertNull(scopedAliases.aliases);
  }

  @Test
  public void testGetSourceRegion() throws Exception {
    Node n = new Node(Token.NAME, "test");
    n.setLineno(10);
    n.setCharno(5);
    n.setSourceFileName("test.js");
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(n);
    script.putProp(Node.SOURCE_FILE_PROP, "test.js");

    java.lang.reflect.Method method = ScopedAliases.class.getDeclaredMethod("getSourceRegion", Node.class);
    method.setAccessible(true);
    Object result = method.invoke(scopedAliases, n);
    assertNotNull(result);
  }

  @Test
  public void testReportErrors() {
    Node n = new Node(Token.NAME);
    n.setLineno(10);
    n.setCharno(5);
    
    TestCompiler testCompiler = (TestCompiler) compiler;
    NodeTraversal t = new NodeTraversal(compiler, n);
    scopedAliases.report(t, n, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
    assertEquals(1, testCompiler.getErrorCount());
  }

  @Test
  public void testGoogScopeUsedImproperly() {
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    call.addChildToBack(getProp);
    Node function = new Node(Token.FUNCTION);
    call.addChildToBack(function);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);

    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(call);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(exprResult);

    // Simulate that global scope has other nodes
    NodeTraversal t = new NodeTraversal(compiler, script);
    scopedAliases.process(null, script);
    
    // Verify no errors for improper usage
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testShouldTraverseWithCallToScopeMethod() {
    Node call = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    call.addChildToBack(getProp);
    Node function = new Node(Token.FUNCTION);
    call.addChildToBack(function);
    
    NodeTraversal t = new NodeTraversal(compiler, null);
    boolean should = scopedAliases.shouldTraverse(t, function, null);
    // In global scope, it should traverse
    assertTrue(should);
  }

  @Test
  public void testShouldTraverseWithNonScopeFunction() {
    Node function = new Node(Token.FUNCTION);
    NodeTraversal t = new NodeTraversal(compiler, null);
    boolean should = scopedAliases.shouldTraverse(t, function, null);
    assertFalse(should);
  }

  @Test
  public void testNamespaceShadowDetection() {
    Node scopeVar = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "goog");
    name.addChildToBack(new Node(Token.NAME));
    scopeVar.addChildToBack(name);
    
    NodeTraversal t = new NodeTraversal(compiler, scopeVar);
    scopedAliases.forbiddenLocals.add("goog");
    scopedAliases.findNamespaceShadows(t);
    assertTrue(scopedAliases.hasNamespaceShadows);
  }

  @Test
  public void testRenameNamespaceShadows() {
    Node script = new Node(Token.SCRIPT);
    NodeTraversal t = new NodeTraversal(compiler, script);
    scopedAliases.hasNamespaceShadows = true;
    scopedAliases.forbiddenLocals.add("goog");
    scopedAliases.renameNamespaceShadows(t);
    // Should not throw any exceptions
    assertTrue(true);
  }

  @Test
  public void testAliasedNodeApplyAlias() throws Exception {
    Node aliasRef = new Node(Token.NAME, "aliasName");
    Node aliasDef = new Node(Token.NAME, "goog.namespace");
    Node parent = new Node(Token.NAME);
    aliasRef.setParent(parent);
    aliasDef.setParent(parent);
    
    ScopedAliases.AliasedNode aliasedNode = scopedAliases.new AliasedNode(aliasRef, aliasDef);
    aliasedNode.applyAlias();
    
    assertNull(aliasRef.getParent());
  }

  @Test
  public void testAliasedTypeNodeApplyAlias() {
    Node typeRef = new Node(Token.STRING);
    String aliasName = "testAlias";
    ScopedAliases.AliasedTypeNode aliasedTypeNode = scopedAliases.new AliasedTypeNode(typeRef, aliasName);
    aliasedTypeNode.applyAlias();
    assertEquals(aliasName, typeRef.getString());
  }

  @Test
  public void testProcessWithEmptyRoot() {
    Node root = new Node(Token.SCRIPT);
    scopedAliases.process(null, root);
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testProcessWithScopeCallsButNoAliases() {
    Node scopeCall = new Node(Token.CALL);
    Node getProp = new Node(Token.GETPROP);
    getProp.setQualifiedName("goog.scope");
    scopeCall.addChildToBack(getProp);
    Node function = new Node(Token.FUNCTION);
    scopeCall.addChildToBack(function);
    Node block = new Node(Token.BLOCK);
    function.addChildToBack(block);

    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(scopeCall);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(exprResult);

    scopedAliases.process(null, script);
    assertFalse(scopedAliases.hasErrors());
  }

  @Test
  public void testAliasDefinitionsInOrderInitialState() {
    assertNotNull(scopedAliases.getAliasDefinitionsInOrder());
    assertTrue(scopedAliases.getAliasDefinitionsInOrder().isEmpty());
  }

  @Test
  public void testGetScopeCallsInitialState() {
    assertNotNull(scopedAliases.getScopeCalls());
    assertTrue(scopedAliases.getScopeCalls().isEmpty());
  }

  @Test
  public void testHasErrorsInitialState() {
    assertFalse(scopedAliases.hasErrors());
  }
}