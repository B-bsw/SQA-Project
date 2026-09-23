package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CompilerTest {

  private Compiler compiler;
  private CompilerOptions options;
  private JSSourceFile[] externs;
  private JSSourceFile[] inputs;
  private ErrorManager errorManager;

  @Before
  public void setUp() {
    errorManager = new BasicErrorManager();
    compiler = new Compiler(errorManager);
    options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    externs = new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "var window;") };
    inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 1;") };
  }

  @Test
  public void testCompileSuccess() {
    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
    assertFalse(compiler.hasErrors());
    assertNotNull(result.root);
  }

  @Test
  public void testCompileWithNullExterns() {
    try {
      compiler.compile(null, inputs, options);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testCompileWithNullInputs() {
    try {
      compiler.compile(externs, null, options);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testCompileWithNullOptions() {
    try {
      compiler.compile(externs, inputs, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testCompileMultipleInputs() {
    inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input1.js", "var a = 1;"),
        JSSourceFile.fromCode("input2.js", "var b = 2;")
    };
    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEmptyInputs() {
    compiler.compile(externs, new JSSourceFile[0], options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testCompileWithSyntaxError() {
    inputs = new JSSourceFile[] { JSSourceFile.fromCode("bad.js", "var x = ;") };
    compiler.compile(externs, inputs, options);
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testGetErrorCount() {
    assertEquals(0, compiler.getErrorCount());
    compiler.report(JSError.make("test.js", 1, "MY_ERROR", "Test error"));
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testGetWarningCount() {
    assertEquals(0, compiler.getWarningCount());
    JSError warning = JSError.make("test.js", 1, "MY_WARNING", "Test warning");
    warning.setType(CheckLevel.WARNING);
    compiler.report(warning);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testHasErrorsAfterCompile() {
    compiler.compile(externs, new JSSourceFile[] { JSSourceFile.fromCode("bad.js", "var") }, options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testToSource() {
    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    String source = compiler.toSource();
    assertTrue(source.contains("var x"));
  }

  @Test
  public void testToSourceArray() {
    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    String[] sources = compiler.toSourceArray();
    assertEquals(1, sources.length);
    assertTrue(sources[0].contains("var x"));
  }

  @Test
  public void testToSourceArrayEmptyModule() {
    JSModule module = new JSModule("empty");
    String result = compiler.toSource(module);
    assertEquals("", result);
    String[] sources = compiler.toSourceArray(module);
    assertEquals(0, sources.length);
  }

  @Test
  public void testGetSourceLineOutOfBounds() {
    assertNull(compiler.getSourceLine("nonexistent.js", 1));
    compiler.compile(externs, inputs, options);
    assertNull(compiler.getSourceLine("input.js", 0));
    assertNotNull(compiler.getSourceLine("input.js", 1));
  }

  @Test
  public void testParseWithNullInput() {
    assertNull(compiler.parse(JSSourceFile.fromCode("null.js", null)));
  }

  @Test
  public void testGetInputNonExistent() {
    assertNull(compiler.getInput("nonexistent"));
  }

  @Test
  public void testGetInputExisting() {
    compiler.compile(externs, inputs, options);
    CompilerInput input = compiler.getInput("input.js");
    assertNotNull(input);
  }

  @Test
  public void testNewExternInput() {
    compiler.initOptions(options);
    CompilerInput input = compiler.newExternInput("newExtern.js");
    assertNotNull(input);
    assertTrue(input.isExtern());
  }

  @Test
  public void testNewExternInputDuplicate() {
    compiler.initOptions(options);
    compiler.newExternInput("ext.js");
    try {
      compiler.newExternInput("ext.js");
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  @Test
  public void testReplaceInputWithNonexistentInput() {
    compiler.initOptions(options);
    assertFalse(compiler.replaceInput(JSSourceFile.fromCode("nonexistent.js", "var a;")));
  }

  @Test
  public void testReplaceInputExisting() {
    compiler.initOptions(options);
    JSSourceFile file = JSSourceFile.fromCode("repl.js", "var a;");
    assertTrue(compiler.replaceInput(file));
  }

  @Test
  public void testLanguageMode() {
    assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
    compiler.initOptions(options);
    assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
  }

  @Test
  public void testAcceptEcmaScript5() {
    options.setLanguageIn(LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    assertFalse(compiler.acceptEcmaScript5());
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptConstKeyword() {
    options.setLanguageIn(LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    assertFalse(compiler.acceptConstKeyword());
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    assertTrue(compiler.acceptConstKeyword());
  }

  @Test
  public void testIsTypeCheckingEnabled() {
    assertFalse(compiler.isTypeCheckingEnabled());
    options.checkTypes = true;
    compiler.initOptions(options);
    assertTrue(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testGetWarningsGuard() {
    assertNotNull(compiler.getWarningsGuard());
  }

  @Test
  public void testReport() {
    compiler.report(JSError.make("test.js", 0, "TEST_ERROR", "Test"));
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testGetErrorsAndWarnings() {
    compiler.compile(externs, new JSSourceFile[] { JSSourceFile.fromCode("bad.js", "var") }, options);
    JSError[] errors = compiler.getErrors();
    assertNotNull(errors);
    assertEquals(compiler.getErrorCount(), errors.length);
    JSError[] warnings = compiler.getWarnings();
    assertNotNull(warnings);
  }

  @Test
  public void testGetResult() {
    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    Result result2 = compiler.getResult();
    assertNotNull(result2);
    assertEquals(result, result2);
  }

  @Test
  public void testGetRoot() {
    assertNull(compiler.getRoot());
    compiler.compile(externs, inputs, options);
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testGetTypeRegistry() {
    assertNotNull(compiler.getTypeRegistry());
    compiler.compile(externs, inputs, options);
    assertNotNull(compiler.getTypeRegistry());
  }

  @Test
  public void testGetTopScope() {
    assertNull(compiler.getTopScope());
    compiler.compile(externs, inputs, options);
    assertNotNull(compiler.getTopScope());
  }

  @Test
  public void testGetCodingConvention() {
    assertNotNull(compiler.getCodingConvention());
  }

  @Test
  public void testIsIdeMode() {
    assertFalse(compiler.isIdeMode());
    options.ideMode = true;
    compiler.initOptions(options);
    assertTrue(compiler.isIdeMode());
  }

  @Test
  public void testOptionsSetters() {
    compiler.initOptions(options);
    assertNotNull(compiler.getOptions());
  }

  @Test
  public void testGetStateAndSetState() throws Exception {
    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);
    byte[] serializedState = state.toBytes();
    Compiler.IntermediateState result = Compiler.IntermediateState.fromBytes(serializedState);
    assertNotNull(result);
  }

  @Test
  public void testGetStateSerialization() {
    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);
    byte[] bytes = state.toBytes();
    assertNotNull(bytes);
    assertTrue(bytes.length > 0);
  }

  @Test
  public void testIntermediateStateSetter() {
    Compiler.IntermediateState state = new Compiler.IntermediateState();
    byte[] bytes = state.toBytes();
    assertNull(bytes);
  }

  @Test
  public void testGetAstDotGraph() throws IOException {
    compiler.compile(externs, inputs, options);
    String dotGraph = compiler.getAstDotGraph();
    assertNotNull(dotGraph);
    assertEquals("", dotGraph);
  }

  @Test
  public void testGetGlobalRefMap() {
    assertNull(compiler.getGlobalRefMap());
    compiler.compile(externs, inputs, options);
    assertNull(compiler.getGlobalRefMap());
  }

  @Test
  public void testGetSymbolTable() {
    assertNull(compiler.getSymbolTable());
    compiler.compile(externs, inputs, options);
    assertNotNull(compiler.getSymbolTable());
  }

  @Test
  public void testToSourceWithModule() {
    JSModule module = new JSModule("test");
    module.add(JSSourceFile.fromCode("mod.js", "var m = 2;"));
    compiler.compile(externs, new JSSourceFile[] { JSSourceFile.fromCode("mod.js", "var m = 2;") }, options);
    String source = compiler.toSource(module);
    assertNotNull(source);
  }

  @Test
  public void testToSourceArrayWithModule() {
    JSModule module = new JSModule("test");
    module.add(JSSourceFile.fromCode("mod.js", "var m = 2;"));
    compiler.compile(externs, new JSSourceFile[] { JSSourceFile.fromCode("mod.js", "var m = 2;") }, options);
    String[] sources = compiler.toSourceArray(module);
    assertNotNull(sources);
  }

  @Test
  public void testToSourceWithNoInputs() {
    assertEquals("", compiler.toSource(new JSModule("empty")));
  }

  @Test
  public void testToSourceArrayWithNoInputs() {
    String[] sources = compiler.toSourceArray(new JSModule("empty"));
    assertEquals(0, sources.length);
  }

  @Test
  public void testSetErrorManager() {
    ErrorManager em = new BasicErrorManager();
    compiler.setErrorManager(em);
    assertSame(em, compiler.getErrorManager());
  }

  @Test
  public void testGetErrorManager() {
    assertSame(errorManager, compiler.getErrorManager());
  }

  @Test
  public void testHasHaltingErrors() {
    assertFalse(compiler.hasHaltingErrors());
    compiler.report(JSError.make("test.js", 0, "ERR", "Test"));
    assertTrue(compiler.hasHaltingErrors());
  }

  @Test
  public void testHasErrorsWithNoInputs() {
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testGetWarningCountInitial() {
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testGetErrorCountInitial() {
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testGetSourceLineWithNegativeLineNumber() {
    assertNull(compiler.getSourceLine("test.js", -1));
  }

  @Test
  public void testGetSourceLineWithNullFile() {
    assertNull(compiler.getSourceLine(null, 1));
  }

  @Test
  public void testCompileWithNonExistentInput() {
    inputs = new JSSourceFile[] { JSSourceFile.fromCode("missing.js", "var x;") };
    compiler.compile(externs, inputs, options);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testCompileWithClosureDependencies() {
    options.manageClosureDependencies = true;
    inputs = new JSSourceFile[] { JSSourceFile.fromCode("a.js", "goog.provide('a');") };
    compiler.compile(externs, inputs, options);
  }

  @Test
  public void testCompileWithCircularDependencies() {
    options.manageClosureDependencies = true;
    inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("a.js", "goog.provide('a'); goog.require('b');"),
        JSSourceFile.fromCode("b.js", "goog.provide('b'); goog.require('a');")
    };
    compiler.compile(externs, inputs, options);
    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrors().length);
  }

  @Test
  public void testCompileWithDuplicateInputs() {
    inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("dup.js", "var a = 1;"),
        JSSourceFile.fromCode("dup.js", "var b = 2;")
    };
    compiler.compile(externs, inputs, options);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testCompileWithDuplicateExterns() {
    externs = new JSSourceFile[] {
        JSSourceFile.fromCode("ext.js", "var ext;"),
        JSSourceFile.fromCode("ext.js", "var ext2;")
    };
    compiler.compile(externs, inputs, options);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testGetRightSourceFile() {
    compiler.compile(externs, inputs, options);
    assertNotNull(compiler.getSourceLine("input.js", 1));
  }

  @Test
  public void testGetSourceLineOutOfFile() {
    compiler.compile(externs, inputs, options);
    assertNull(compiler.getSourceLine("input.js", 100));
  }

  @Test
  public void testInitializeOptionsWithNull() {
    compiler.initOptions(null);
  }

  @Test
  public void testCompileWithNullSourceFile() {
    try {
      compiler.compile(null, new JSSourceFile[] { null }, options);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  public void testCompileWithNullExternSourceFile() {
    try {
      compiler.compile(new JSSourceFile[] { null }, inputs, options);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
    }
  }
}