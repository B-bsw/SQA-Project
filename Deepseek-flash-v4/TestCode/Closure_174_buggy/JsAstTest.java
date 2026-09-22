```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class JsAstTest {
  private static final String SRC_NAME = "test.js";
  private static final String SRC_CONTENT = "var x = 1;";

  private class TestCompiler extends AbstractCompiler {
    private ParserRunner.Config config = new ParserRunner.Config();
    private boolean hasErrors = false;
    private Node lastOldAst = null;
    private String lastPrepareAstSource;
    private String lastSetOldParseTreeSource;
    private Node lastSetOldParseTreeAst;
    private boolean prepareAstCalled = false;

    @Override
    ParserRunner.Config getParserConfig() {
      config.setLanguageMode(ParserRunner.LanguageMode.ECMASCRIPT5);
      return config;
    }

    @Override
    void setOldParseTree(String sourceName, Node ast) {
      this.lastSetOldParseTreeSource = sourceName;
      this.lastSetOldParseTreeAst = ast;
    }

    @Override
    void prepareAst(Node root) {
      this.lastPrepareAstSource = root.getSourceFileName();
      this.prepareAstCalled = true;
    }

    @Override
    void report(JSError error) {
      this.hasErrors = true;
    }

    @Override
    boolean hasHaltingErrors() {
      return this.hasErrors;
    }
  }

  private static class TestSourceFile extends SourceFile {
    private final String name;
    private final String content;
    private boolean clearCachedSourceCalled = false;

    TestSourceFile(String name, String content) {
      super(name);
      this.name = name;
      this.content = content;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public String getCode() throws IOException {
      return content;
    }

    @Override
    public void clearCachedSource() {
      this.clearCachedSourceCalled = true;
      super.clearCachedSource();
    }

    @Override
    public String toString() {
      return "TestSourceFile{" + name + "}";
    }
  }

  private TestCompiler compiler;
  private TestSourceFile sourceFile;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    sourceFile = new TestSourceFile(SRC_NAME, SRC_CONTENT);
  }

  @Test
  public void testConstructorAndGetters() {
    JsAst ast = new JsAst(sourceFile);
    assertNotNull(ast.getInputId());
    assertEquals(new InputId(SRC_NAME), ast.getInputId());
    assertSame(sourceFile, ast.getSourceFile());
  }

  @Test
  public void testConstructorWithNullSourceFile() {
    try {
      new JsAst(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testGetAstRootFirstCall() {
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
    assertEquals(SRC_NAME, root.getSourceFileName());
    assertSame(root, ast.getAstRoot(compiler));
  }

  @Test
  public void testGetAstRootSetsInputId() {
    JsAst ast = new JsAst(sourceFile);
    Node root = ast.getAstRoot(compiler);
    assertEquals(new InputId(SRC_NAME), root.getInputId());
  }

  @Test
  public void testGetAstRootWithNullCompiler() {
    JsAst ast = new JsAst(sourceFile);
    try {
      ast.getAstRoot(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testClearAstResetsRoot() {
    JsAst ast = new JsAst(sourceFile);
    Node first = ast.getAstRoot(compiler);
    assertNotNull(first);
    ast.clearAst();
    assertNull(ast.root);
  }

  @Test
  public void testClearAstCallsSourceClearCachedSource() {
    JsAst ast = new JsAst(sourceFile);
    ast.getAstRoot(compiler);
    assertFalse(sourceFile.clearCachedSourceCalled);
    ast.clearAst();
    assertTrue(sourceFile.clearCachedSourceCalled);
  }

  @Test
  public void testGetInputIdWithNullInputId() {
    JsAst ast = new JsAst(sourceFile);
    ast.inputId = null;
    assertNull(ast.getInputId());
  }

  @Test
  public void testGetSourceFileAfterSet() {
    JsAst ast = new JsAst(sourceFile);
    TestSourceFile newFile = new TestSourceFile(SRC_NAME, "var y=1;");
    ast.setSourceFile(newFile);
    assertSame(newFile, ast.getSourceFile());
  }

  @Test
  public void testSetSourceFileWithMismatchedName() {
    JsAst ast = new JsAst(sourceFile);
    TestSourceFile newFile = new TestSourceFile("different.js", "var z=1;");
    try {
      ast.setSourceFile(newFile);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testSetSourceFileWithNull() {
    JsAst ast = new JsAst(sourceFile);
    try {
      ast.setSourceFile(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testParseIOException() {
    TestSourceFile throwingFile = new TestSourceFile(SRC_NAME, "var x=1;") {
      @Override
      public String getCode() throws IOException {
        throw new IOException("boom");
      }
    };
    JsAst ast = new JsAst(throwingFile);
    TestCompiler mockCompiler = new TestCompiler();
    Node root = ast.getAstRoot(mockCompiler);
    assertNotNull(root);
    assertEquals(0, root.getChildCount());
    assertTrue(mockCompiler.hasErrors);
  }

  @Test
  public void testParseWithHaltingErrors() {
    TestSourceFile haltingFile = new TestSourceFile(SRC_NAME, "var x=1;") {
      @Override
      public String getCode() throws IOException {
        compiler.hasErrors = true;
        return "var x=1;";
      }
    };
    JsAst ast = new JsAst(haltingFile);
    TestCompiler mockCompiler = new TestCompiler();
    Node root = ast.getAstRoot(mockCompiler);
    assertNotNull(root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testParseSuccessful() {
    JsAst ast = new JsAst(sourceFile);
    TestCompiler mockCompiler = new TestCompiler();
    Node root = ast.getAstRoot(mockCompiler);
    assertNotNull(root);
    assertEquals(SRC_NAME, root.getSourceFileName());
    assertTrue(mockCompiler.prepareAstCalled);
    assertEquals(SRC_NAME, mockCompiler.lastPrepareAstSource);
    assertEquals(SRC_NAME, mockCompiler.lastSetOldParseTreeSource);
    assertNotNull(mockCompiler.lastSetOldParseTreeAst);
  }

  @Test
  public void testParseWithNullSourceFileContent() {
    TestSourceFile nullContentFile = new TestSourceFile(SRC_NAME, null) {
      @Override
      public String getCode() throws IOException {
        return null;
      }
    };
    JsAst ast = new JsAst(nullContentFile);
    TestCompiler mockCompiler = new TestCompiler();
    Node root = ast.getAstRoot(mockCompiler);
    assertNotNull(root);
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testGetAstRootSetsInputIdOnCachedRoot() {
    JsAst ast = new JsAst(sourceFile);
    ast.getAstRoot(compiler);
    Node secondRoot = ast.getAstRoot(compiler);
    assertSame(ast.root, secondRoot);
  }

  @Test
  public void testParseWithZeroLoops() {
    JsAst ast = new JsAst(new TestSourceFile("empty.js", ""));
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
    assertEquals("", root.getSourceFileName());
  }

  @Test
  public void testParseWithManyLoops() {
    String code = "for(var i=0;i<100;i++) { }";
    JsAst ast = new JsAst(new TestSourceFile("loop.js", code));
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
  }

  @Test
  public void testCompileNormalCase() {
    JsAst ast = new JsAst(sourceFile);
    TestCompiler mockCompiler = new TestCompiler();
    Node root = ast.getAstRoot(mockCompiler);
    assertNotNull(root);
    assertEquals(1, root.getChildCount());
    assertFalse(mockCompiler.hasErrors);
  }

  @Test
  public void testClearAstWithNoCachedSource() {
    JsAst ast = new JsAst(sourceFile);
    ast.clearAst();
    assertNull(ast.root);
  }
  
}