package com.google.javascript.jscomp;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class JsAstTest {

  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
  }

  @Test
  public void constructor_givenSourceFile_shouldInitializeFieldsCorrectly() {
    // Arrange
    String fileName = "sample.js";
    SourceFile sourceFile = SourceFile.fromCode(fileName, "var a = 10;");

    // Act
    JsAst jsAst = new JsAst(sourceFile);

    // Assert
    Assert.assertEquals(new InputId(fileName), jsAst.getInputId());
    Assert.assertSame(sourceFile, jsAst.getSourceFile());
  }

  @Test
  public void setSourceFile_givenMatchingFileName_shouldUpdateSourceFile() {
    // Arrange
    String fileName = "test.js";
    SourceFile originalFile = SourceFile.fromCode(fileName, "var x = 1;");
    SourceFile replacementFile = SourceFile.fromCode(fileName, "var x = 2;");
    JsAst jsAst = new JsAst(originalFile);

    // Act
    jsAst.setSourceFile(replacementFile);

    // Assert
    Assert.assertSame(replacementFile, jsAst.getSourceFile());
  }

  @Test
  public void setSourceFile_givenDifferentFileName_shouldThrowIllegalStateException() {
    // Arrange
    SourceFile originalFile = SourceFile.fromCode("original.js", "var x = 1;");
    SourceFile mismatchedFile = SourceFile.fromCode("different.js", "var x = 1;");
    JsAst jsAst = new JsAst(originalFile);

    // Act & Assert
    try {
      jsAst.setSourceFile(mismatchedFile);
      Assert.fail("Expected IllegalStateException due to mismatched file names");
    } catch (IllegalStateException e) {
      // Expected exception
      Assert.assertTrue(true);
    }
  }

  @Test
  public void getAstRoot_givenValidSource_shouldParseAndReturnRootNode() {
    // Arrange
    String fileName = "valid.js";
    SourceFile sourceFile = SourceFile.fromCode(fileName, "function test() { return 42; }");
    JsAst jsAst = new JsAst(sourceFile);

    // Act
    Node root = jsAst.getAstRoot(compiler);

    // Assert
    Assert.assertNotNull(root);
    Assert.assertTrue(root.isScript());
    Assert.assertEquals(jsAst.getInputId(), root.getInputId());
    Assert.assertSame(sourceFile, root.getStaticSourceFile());
    Assert.assertTrue(compiler.isPrepareAstCalled());
  }

  @Test
  public void getAstRoot_whenCalledMultipleTimes_shouldReturnCachedInstance() {
    // Arrange
    SourceFile sourceFile = SourceFile.fromCode("cached.js", "var x = 1;");
    JsAst jsAst = new JsAst(sourceFile);

    // Act
    Node firstRoot = jsAst.getAstRoot(compiler);
    compiler.resetPrepareAstCalled();
    Node secondRoot = jsAst.getAstRoot(compiler);

    // Assert
    Assert.assertSame(firstRoot, secondRoot);
    Assert.assertFalse(compiler.isPrepareAstCalled());
  }

  @Test
  public void clearAst_whenInvoked_shouldClearRootAndClearCachedSource() {
    // Arrange
    String fileName = "clearable.js";
    TrackingSourceFile sourceFile = new TrackingSourceFile(fileName, "var x = 1;");
    JsAst jsAst = new JsAst(sourceFile);

    Node initialRoot = jsAst.getAstRoot(compiler);
    Assert.assertNotNull(initialRoot);
    Assert.assertFalse(sourceFile.isClearCachedCalled());

    // Act
    jsAst.clearAst();

    // Assert
    Assert.assertTrue(sourceFile.isClearCachedCalled());
    Node reParsedRoot = jsAst.getAstRoot(compiler);
    Assert.assertNotNull(reParsedRoot);
    Assert.assertNotSame(initialRoot, reParsedRoot);
  }

  @Test
  public void getAstRoot_whenIOExceptionOccurs_shouldReportReadErrorAndReturnDummyScript() {
    // Arrange
    String fileName = "unreadable.js";
    ThrowingSourceFile throwingFile = new ThrowingSourceFile(fileName);
    JsAst jsAst = new JsAst(throwingFile);

    // Act
    Node root = jsAst.getAstRoot(compiler);

    // Assert
    Assert.assertNotNull(root);
    Assert.assertTrue(root.isScript());
    Assert.assertEquals(jsAst.getInputId(), root.getInputId());
    Assert.assertSame(throwingFile, root.getStaticSourceFile());
    Assert.assertNotNull(compiler.getLastReportedError());
    Assert.assertEquals(AbstractCompiler.READ_ERROR.key, compiler.getLastReportedError().getType().key);
  }

  @Test
  public void getAstRoot_whenCompilerHasHaltingErrors_shouldReturnDummyScriptWithoutPreparingAst() {
    // Arrange
    SourceFile sourceFile = SourceFile.fromCode("halting.js", "var a = 1;");
    JsAst jsAst = new JsAst(sourceFile);
    compiler.setHaltingErrors(true);

    // Act
    Node root = jsAst.getAstRoot(compiler);

    // Assert
    Assert.assertNotNull(root);
    Assert.assertTrue(root.isScript());
    Assert.assertFalse(compiler.isPrepareAstCalled());
    Assert.assertEquals(jsAst.getInputId(), root.getInputId());
    Assert.assertSame(sourceFile, root.getStaticSourceFile());
  }

  // --- Test Doubles & Helper Classes ---

  private static class TestCompiler extends Compiler {
    private boolean haltingErrors = false;
    private boolean prepareAstCalled = false;
    private JSError lastReportedError = null;

    public TestCompiler() {
      super();
      CompilerOptions options = new CompilerOptions();
      this.initOptions(options);
    }

    public void setHaltingErrors(boolean haltingErrors) {
      this.haltingErrors = haltingErrors;
    }

    public boolean isPrepareAstCalled() {
      return prepareAstCalled;
    }

    public void resetPrepareAstCalled() {
      this.prepareAstCalled = false;
    }

    public JSError getLastReportedError() {
      return lastReportedError;
    }

    @Override
    public boolean hasHaltingErrors() {
      return haltingErrors || super.hasHaltingErrors();
    }

    @Override
    public void prepareAst(Node root) {
      this.prepareAstCalled = true;
      super.prepareAst(root);
    }

    @Override
    public void report(JSError error) {
      this.lastReportedError = error;
      super.report(error);
    }
  }

  private static class TrackingSourceFile extends SourceFile {
    private static final long serialVersionUID = 1L;
    private boolean clearCachedCalled = false;
    private final String code;

    public TrackingSourceFile(String fileName, String code) {
      super(fileName);
      this.code = code;
    }

    public boolean isClearCachedCalled() {
      return clearCachedCalled;
    }

    @Override
    public String getCode() throws IOException {
      return this.code;
    }

    @Override
    public void clearCachedSource() {
      super.clearCachedSource();
      this.clearCachedCalled = true;
    }
  }

  private static class ThrowingSourceFile extends SourceFile {
    private static final long serialVersionUID = 1L;

    public ThrowingSourceFile(String fileName) {
      super(fileName);
    }

    @Override
    public String getCode() throws IOException {
      throw new IOException("Simulated I/O failure during file read");
    }
  }
}