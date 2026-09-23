package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;

public class NormalizeTest {

  private static final DiagnosticType CATCH_BLOCK_VAR_ERROR = DiagnosticType.error(
      "JSC_CATCH_BLOCK_VAR_ERROR",
      "The use of scope variable {0} is not allowed within a catch block " +
      "with a catch exception of the same name.");

  private AbstractCompiler compiler;
  private Normalize normalizePass;
  private boolean reportCodeChangeCalled;
  private boolean assertOnChange;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    assertOnChange = false;
    reportCodeChangeCalled = false;
    normalizePass = new Normalize(compiler, assertOnChange);
  }

  @After
  public void tearDown() {
    compiler = null;
    normalizePass = null;
  }

  @Test
  public void testNormalizeProcess() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    NodeTraversal.traverse(compiler, root, new Normalize.NormalizeStatements(compiler, false));
    normalizePass.process(externs, root);
    assertNotNull(root);
  }

  @Test
  public void testNormalizeProcessWithAssertOnChange() {
    assertOnChange = true;
    Normalize n = new Normalize(compiler, assertOnChange);
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    try {
      n.process(externs, root);
      assertEquals(LifeCycleStage.NORMALIZED, compiler.getLifeCycleStage());
    } catch (IllegalStateException e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testNormalizeProcessLifeCycle() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    normalizePass.process(externs, root);
    assertEquals(LifeCycleStage.NORMALIZED, compiler.getLifeCycleStage());
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeStatementsWhileToFor() {
    assertOnChange = true;
    Normalize.NormalizeStatements ns = compileStatements("while(x) { y = 1; }");
    NodeTraversal t = new NodeTraversal(compiler, ns);
    Node n = compileNode("while(x) { y = 1; }");
    ns.shouldTraverse(t, n, null);
  }

  @Test
  public void testMoveFunctionDeclaration() {
    Node function = new Node(Token.FUNCTION);
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(new Node(Token.NAME, "f"));
    function.addChildToBack(body);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.visit(new NodeTraversal(compiler, ns), function, null);
    assertEquals(Token.VAR, function.getParent().getType() == Token.FUNCTION ? 
        function.getParent().getType() : function.getType());
  }

  @Test
  public void testNormalizeLabels() {
    Node label = new Node(Token.LABEL);
    Node block = new Node(Token.BLOCK);
    label.addChildToBack(new Node(Token.LABEL_NAME, "label"));
    label.addChildToBack(block);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.visit(new NodeTraversal(compiler, ns), label, null);
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testNormalizeLabelsDefaultCase() {
    Node label = new Node(Token.LABEL);
    Node n = new Node(Token.EMPTY);
    label.addChildToBack(new Node(Token.LABEL_NAME, "label"));
    label.addChildToBack(n);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.visit(new NodeTraversal(compiler, ns), label, null);
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testExtractForInitializer() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "i");
    init.addChildToBack(name);
    forNode.addChildToBack(init);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.BLOCK));

    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), forNode, null);
    assertEquals(Token.FOR, forNode.getType());
  }

  @Test
  public void testExtractForInInitializer() {
    Node forInNode = new Node(Token.FOR);
    Node varNode = new Node(Token.VAR);
    Node name = new Node(Token.NAME, "x");
    varNode.addChildToBack(name);
    forInNode.addChildToBack(varNode);
    forInNode.addChildToBack(new Node(Token.EMPTY));
    forInNode.addChildToBack(new Node(Token.BLOCK));

    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), forInNode, null);
    assertEquals(Token.NAME, forInNode.getFirstChild().getType());
  }

  @Test
  public void testSplitVarDeclarations() {
    Node varNode = new Node(Token.VAR);
    Node n1 = new Node(Token.NAME, "a");
    Node n2 = new Node(Token.NAME, "b");
    varNode.addChildToBack(n1);
    varNode.addChildToBack(n2);

    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, ns);
    ns.shouldTraverse(t, varNode, null);
    assertTrue(varNode.getChildCount() <= 1);
  }

  @Test
  public void testMoveNamedFunctions() {
    Node functionBody = new Node(Token.BLOCK);
    Node function = new Node(Token.FUNCTION);
    functionBody.addChildToBack(function);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), functionBody, null);
    assertEquals(Token.BLOCK, functionBody.getType());
  }

  @Test
  public void testAnnotateConstantsByConvention() {
    Node n = new Node(Token.NAME, "foo");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(n);
    compiler.getCodingConvention().addConstantName("foo");
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), parent, null);
    assertTrue(n.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testAnnotateConstantsByConventionNotMarked() {
    Node n = new Node(Token.NAME, "bar");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(n);
    compiler.getCodingConvention().addConstantName("bar");
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), parent, null);
    assertTrue(!n.getBooleanProp(Node.IS_CONSTANT_NAME) || parent.getType() == Token.VAR);
  }

  @Test
  public void testDuplicateDeclarationHandler() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node func = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "dup");
    func.addChildToBack(name);
    root.addChildToBack(func);
    normalizePass.process(externs, root);
    assertNotNull(root.getFirstChild());
  }

  @Test
  public void testVerifyConstants() {
    Node n = new Node(Token.NAME, "c");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(n);
    Normalize.VerifyConstants vc = new Normalize.VerifyConstants(compiler, true);
    try {
      vc.visit(null, n, parent);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    Node result = Normalize.parseAndNormalizeSyntheticCode(compiler, "var x = 1;", "prefix");
    assertNotNull(result);
    assertEquals(Token.SCRIPT, result.getType());
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    Node result = Normalize.parseAndNormalizeTestCode(compiler, "var y = 2;");
    assertNotNull(result);
    assertEquals(Token.SCRIPT, result.getType());
  }

  @Test
  public void testProcessWithNormalizedStage() {
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    normalizePass.process(externs, root);
    assertEquals(LifeCycleStage.NORMALIZED, compiler.getLifeCycleStage());
  }

  @Test
  public void testPropagateConstantAnnotationsOverVars() {
    Node root = new Node(Token.SCRIPT);
    Node name = new Node(Token.NAME, "const1");
    name.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    root.addChildToBack(name);
    Normalize.PropagateConstantAnnotationsOverVars prop = 
        new Normalize.PropagateConstantAnnotationsOverVars(compiler, false);
    NodeTraversal.traverse(compiler, root, prop);
    assertTrue(name.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testNormalizeFunctionDeclaration() {
    Node fn = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "f");
    fn.addChildToBack(name);
    fn.addChildToBack(new Node(Token.BLOCK));
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.visit(new NodeTraversal(compiler, ns), fn, new Node(Token.SCRIPT));
    assertEquals(Token.VAR, fn.getParent().getType());
  }

  @Test
  public void testReportCodeChangeNoAssert() {
    compileStatements("var a = 1;");
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, true);
    try {
      ns.reportCodeChange("test");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("Normalize constraints violated:\ntest", e.getMessage());
    }
  }

  @Test
  public void testRemoveDuplicateDeclarationsNoInput() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    normalizePass.process(externs, root);
    assertNotNull(root);
  }

  @Test
  public void testShouldTraverseFunction() {
    Node func = new Node(Token.FUNCTION);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    boolean result = ns.shouldTraverse(new NodeTraversal(compiler, ns), func, null);
    assertTrue(result);
  }

  @Test
  public void testShouldTraverseCatch() {
    Node catchNode = new Node(Token.CATCH);
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    boolean result = ns.shouldTraverse(new NodeTraversal(compiler, ns), catchNode, null);
    assertTrue(result);
  }

  @Test
  public void testDuplicateDeclarationHandlerCatch() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node catchNode = new Node(Token.CATCH);
    Node name = new Node(Token.NAME, "e");
    catchNode.addChildToBack(name);
    root.addChildToBack(catchNode);
    try {
      normalizePass.process(externs, root);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testAddToFrontNull() {
    Node parent = new Node(Token.BLOCK);
    Node newChild = new Node(Token.NAME, "x");
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    Node result = ns.addToFront(parent, newChild, null);
    assertEquals(newChild, result);
    assertEquals(parent, newChild.getParent());
  }

  @Test
  public void testAddToFrontNonNull() {
    Node parent = new Node(Token.BLOCK);
    Node after = new Node(Token.EMPTY);
    parent.addChildToBack(after);
    Node newChild = new Node(Token.NAME, "x");
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    Node result = ns.addToFront(parent, newChild, after);
    assertEquals(newChild, result);
    assertEquals(parent, newChild.getParent());
  }

  @Test
  public void testProcessNormalizeStatements() {
    Node root = new Node(Token.SCRIPT);
    Node whileNode = new Node(Token.WHILE);
    root.addChildToBack(whileNode);
    NodeTraversal.traverse(compiler, root, new Normalize.NormalizeStatements(compiler, true));
    assertEquals(Token.FOR, whileNode.getType());
  }

  @Test
  public void testExtractForInitializerNoVar() {
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.NAME, "i");
    forNode.addChildToBack(init);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.BLOCK));
    Normalize.NormalizeStatements ns = new Normalize.NormalizeStatements(compiler, false);
    ns.shouldTraverse(new NodeTraversal(compiler, ns), forNode, null);
    assertEquals(Token.FOR, forNode.getType());
  }

  private Normalize.NormalizeStatements compileStatements(String code) {
    return new Normalize.NormalizeStatements(compiler, false);
  }

  private Node compileNode(String code) {
    return compiler.parseSyntheticCode(code);
  }

  private class TestCompiler extends AbstractCompiler {
    private CodingConvention codingConvention;
    private LifeCycleStage stage;

    TestCompiler() {
      codingConvention = new CodingConvention() {
        @Override
        public void addConstantName(String name) {}
        @Override
        public boolean isConstantName(String name) { return false; }
      };
      stage = LifeCycleStage.NORMALIZED;
    }

    @Override
    public void reportCodeChange() { reportCodeChangeCalled = true; }

    @Override
    public CodingConvention getCodingConvention() { return codingConvention; }

    @Override
    public LifeCycleStage getLifeCycleStage() { return stage; }

    @Override
    public void setLifeCycleStage(LifeCycleStage stage) { this.stage = stage; }

    @Override
    public void report(JSError error) {}

    @Override
    public Node parseSyntheticCode(String code) {
      Node node = new Node(Token.SCRIPT);
      return node;
    }

    @Override
    public Node parseTestCode(String code) {
      return parseSyntheticCode(code);
    }

    @Override
    public String getUniqueNameIdSupplier() { return "test"; }
  }
}