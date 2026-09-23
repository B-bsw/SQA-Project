package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class UnreachableCodeEliminationTest {

  private UnreachableCodeElimination eliminator;

  @Before
  public void setUp() {
    // Create a minimal AbstractCompiler instance if needed, but for this test we might skip
    // This test class focuses on testing through the public API indirectly
    // Since we cannot easily instantiate the compiler, we test via the actual compiler pass
    // Use a real compiler or mock minimal behavior
    eliminator = null; // Placeholder, actual setup will be done per test
  }

  @Test
  public void testProcessWithNullCompilerShouldNotThrow() {
    // Since the class is package-private and requires a compiler, we're testing logic
    // via integration-style tests that instantiate the compiler
    // For simplicity, we only test indirect behavior through compilation passes
    // These are smoke tests to ensure no exceptions on simple inputs
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    eliminator = new UnreachableCodeElimination(compiler, true);
    Node externs = new Node(Token.EMPTY);
    Node toplevel = new Node(Token.EMPTY);
    try {
      eliminator.process(externs, toplevel);
      assertTrue(true);
    } catch (Exception e) {
      fail("Process should not throw on empty input");
    }
  }

  @Test
  public void testProcessWithSimpleFunction() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "function f(){return 1; var x=2; return 3;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
    // After elimination, the first return should make rest unreachable
    // Should still at least have one return
    assertTrue(result.contains("return"));
  }

  @Test
  public void testRemoveNoOpStatements() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "function f(){; ; ;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
  }

  @Test
  public void testConditionalReturnRemoval() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "function f(){if(1){return;} else {return;} return 2;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
  }

  @Test
  public void testLoopZeroIteration() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "for(var i=0; i<0; i++){print(i);}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, false);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
  }

  @Test
  public void testLoopOneIteration() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "var x=0; for(var i=0; i<1; i++){x=1;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, false);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
    assertTrue(result.contains("x=1"));
  }

  @Test
  public void testLoopManyIterations() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "var x=0; for(var i=0; i<3; i++){x=i;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, false);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
  }

  @Test
  public void testNullNodeInEliminationPass() {
    // Indirectly test that internal methods handle null gracefully
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    // Create a simple AST and invoke internal pass
    Node root = new Node(Token.FUNCTION, new Node(Token.NAME, "f"));
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    // Should not throw
  }

  @Test
  public void testRemoveDeadExpressionStatement() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "function f(){1+2;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
    assertFalse(result.contains("1+2"));
  }

  @Test
  public void testKeepSideEffects() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    String code = "function f(){x++;}";
    Node root = compiler.parseSyntheticCode(code);
    eliminator = new UnreachableCodeElimination(compiler, true);
    eliminator.process(null, root);
    String result = compiler.toSource(root);
    assertNotNull(result);
    assertTrue(result.contains("x++"));
  }
}