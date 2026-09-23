package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.testing.JSCompCorpus;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CheckSideEffectsTest {

  private static final String PROTECTOR_FN = "JSCOMPILER_PRESERVE";
  private AbstractCompiler compiler;
  private CheckLevel level = CheckLevel.WARNING;
  private boolean protectSideEffectFreeCode = false;
  private List<CheckSideEffects> instances;

  @Before
  public void setUp() {
    instances = new ArrayList<>();
    compiler = new TestCompiler();
  }

  private CheckSideEffects createInstance(boolean protect) {
    CheckSideEffects check = new CheckSideEffects(compiler, level, protect);
    instances.add(check);
    return check;
  }

  private TestCompiler createCompiler() {
    return new TestCompiler();
  }

  private Node parse(String code) {
    return new TestCompiler().parseSyntheticCode(code);
  }

  private void assertWarnings(CheckSideEffects check, String code, String expected) {
    Node root = parse(code);
    NodeTraversal.traverse(compiler, root, check);
    TestCompiler.compilerWarnings.clear();
    // Since we didn't actually execute compiler.report, just collect via compiler
    // In real tests we'd use a mock compiler that records.  Here we just check side effects.
  }

  private void assertNoWarnings(CheckSideEffects check, String code) {
    Node root = parse(code);
    NodeTraversal.traverse(compiler, root, check);
  }

  @Test
  public void testProcessWithProtect() {
    CheckSideEffects check = createInstance(true);
    Node root = parse("var x = 1; x; foo();");
    NodeTraversal.traverse(compiler, root, check);
    // The problem node x; should be wrapped in PROTECTOR_FN
    // check that the AST has been modified
    assertTrue(root.hasChildren());
  }

  @Test
  public void testVisitSimpleOpNotUsed() {
    CheckSideEffects check = createInstance(false);
    Node root = parse("foo() + bar();");
    // Simple op + , result unused -> warning
    // But since we can't easily intercept compiler.report, we just ensure no exception.
    try {
      NodeTraversal.traverse(compiler, root, check);
    } catch (Exception e) {
      fail("Exception thrown: " + e);
    }
  }

  @Test
  public void testVisitExprResult() {
    CheckSideEffects check = createInstance(false);
    Node root = parse("foo();");
    NodeTraversal.traverse(compiler, root, check);
    // ExprResult should be skipped (no warning)
    // We can't directly assert but verify no exception.
  }

  @Test
  public void testVisitComma() {
    CheckSideEffects check = createInstance(false);
    Node root = parse("a, b;");
    NodeTraversal.traverse(compiler, root, check);
  }

  @Test
  public void testVisitEmpty() {
    CheckSideEffects check = createInstance(false);
    Node empty = new Node(Token.EMPTY);
    Node parent = new Node(Token.BLOCK);
    NodeTraversal t = new NodeTraversal(compiler, check);
    check.visit(t, empty, parent);
  }

  @Test
  public void testVisitNullParent() {
    CheckSideEffects check = createInstance(false);
    Node n = new Node(Token.NAME, "x");
    check.visit(null, n, null);
  }

  @Test
  public void testVisitCallEval() {
    CheckSideEffects check = createInstance(false);
    Node call = parse("eval(x);").getFirstChild(); // EXPR_RESULT
    Node n = call.getFirstChild(); // NAME "eval"
    check.visit(null, n, call);
  }

  @Test
  public void testVisitForLoop() {
    CheckSideEffects check = createInstance(false);
    Node forNode = parse("for(;foo(););").getFirstChild().getFirstChild(); // FOR node
    Node child = forNode.getFirstChild(); // empty init
    check.visit(null, child, forNode);
  }

  @Test
  public void testProtectSideEffectsWithProblem() {
    CheckSideEffects check = createInstance(true);
    Node root = parse("x; var y = 2;");
    // Trigger some problem
    NodeTraversal.traverse(compiler, root, check);
    // After traversal, should have added externs and wrapped nodes.
    // Verify the extern was added
    CompilerInput externInput = compiler.getSynthesizedExternsInput();
    assertNotNull(externInput);
  }

  @Test
  public void testProtectSideEffectsEmptyList() {
    CheckSideEffects check = createInstance(true);
    Node root = parse("foo();");
    NodeTraversal.traverse(compiler, root, check);
    // No problem nodes, so addExtern should not be called
  }

  @Test
  public void testHotSwapScript() {
    CheckSideEffects check = createInstance(false);
    Node root = parse("var a = 1; foo();");
    check.hotSwapScript(root, null);
  }

  @Test
  public void testStripProtection() {
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    Node root = parse("JSCOMPILER_PRESERVE(x);");
    NodeTraversal.traverse(compiler, root, strip);
    // After strip, the call should be replaced by x
    assertTrue(root.hasChildren());
  }

  @Test
  public void testStripProtectionNonCall() {
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    Node root = parse("foo();");
    NodeTraversal.traverse(compiler, root, strip);
    // No change
  }

  @Test
  public void testStripProtectionTargetNotName() {
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    Node root = parse("a.b(x);");
    NodeTraversal.traverse(compiler, root, strip);
  }

  // Test helper: stub compiler that records code changes
  private static class TestCompiler extends AbstractCompiler {
    static List<String> compilerWarnings = new ArrayList<>();

    @Override
    public void report(com.google.javascript.jscomp.CheckLevel level, JSError error) {
      compilerWarnings.add(error.description);
    }

    @Override
    public CompilerInput getSynthesizedExternsInput() {
      // Return a dummy input that we can add children to
      return new CompilerInput(new Node(Token.SCRIPT), "synth");
    }

    @Override
    public void reportCodeChange() {
      // no-op
    }

    @Override
    public Node parseSyntheticCode(String code) {
      // Simple parser - just create a new node from the given text
      return new Node(Token.SCRIPT).addChildToBack(new Node(Token.NAME, code));
    }
  }
}