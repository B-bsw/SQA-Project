package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class JsAstTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  // ---- Normal case ----

  @Test
  public void testGetAstRootNormalCase() {
    SourceFile sourceFile = SourceFile.fromCode("normal.js", "var x = 1;");
    JsAst ast = new JsAst(sourceFile);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertEquals(com.google.javascript.rhino.Token.SCRIPT, root.getType());
    assertEquals(0, compiler.getErrorCount());
    assertNotNull(root.getInputId());
    assertEquals("normal.js", root.getInputId().getIdName());
  }

  @Test
  public void testGetAstRootCachesResult() {
    SourceFile sourceFile = SourceFile.fromCode("cache.js", "var y = 2;");
    JsAst ast = new JsAst(sourceFile);

    Node root1 = ast.getAstRoot(compiler);
    Node root2 = ast.getAstRoot(compiler);

    assertNotNull(root1);
    assertEquals(root1, root2);
    assertTrue(root1 == root2);
  }

  // ---- Boundary value: empty source code ----

  @Test
  public void testGetAstRootEmptySource() {
    SourceFile sourceFile = SourceFile.fromCode("empty.js", "");
    JsAst ast = new JsAst(sourceFile);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertEquals(com.google.javascript.rhino.Token.SCRIPT, root.getType());
    assertFalse(root.hasChildren());
  }

  // ---- Multiple statements (loop: multiple children) ----

  @Test
  public void testGetAstRootMultipleStatements() {
    SourceFile sourceFile = SourceFile.fromCode("multi.js",
        "var a = 1; var b = 2; var c = 3;");
    JsAst ast = new J