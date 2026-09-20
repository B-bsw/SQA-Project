package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JUnit4 test suite for {@link RemoveConstantExpressions}.
 *
 * These tests exercise the pass end-to-end by parsing small JavaScript
 * snippets, running the pass, and comparing the resulting source code.
 */
public class RemoveConstantExpressionsTest {

  /**
   * Compiles the given JS source using the RemoveConstantExpressions pass
   * and returns the resulting source code.
   */
  private String process(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setPrettyPrint(false);
    options.setLineLengthThreshold(Integer.MAX_VALUE);

    List<SourceFile> externs = new ArrayList<SourceFile>();
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    compiler.parse();

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();

    RemoveConstantExpressions pass = new RemoveConstantExpressions(compiler);
    pass.process(externsRoot, mainRoot);

    return compiler.toSource(mainRoot);
  }

  /**
   * Normal case: a statement with no side effects at all should be
   * completely removed (loop executes 0 times for side-effect nodes).
   */
  @Test
  public void testConstantNumberIsRemoved() {
    String result = process("1;");
    assertEquals("", result.trim());