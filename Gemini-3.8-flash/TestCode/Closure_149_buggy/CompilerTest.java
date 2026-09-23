package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerTest {
    private Compiler compiler;
    private CompilerOptions options;
    private JSSourceFile extern;
    private JSSourceFile input;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5);
        extern = JSSourceFile.fromCode("externs.js", "var window;");
        input = JSSourceFile.fromCode("input.js", "var x = 1;");
    }

    @Test
    public void testCompileEmptyInputs() {
        Compiler c = new Compiler();
        CompilerOptions opts = new CompilerOptions();
        JSSourceFile[] emptyExterns = new JSSourceFile[0];
        JSSourceFile[] emptyInputs = new JSSourceFile[0];
        Result result = c.compile(emptyExterns, emptyInputs, opts);
        assertEquals(0, result.errors.length);
        assertNull(result.astRoot);
    }

    @Test
    public void testCompileBasicInputs() {
        Result result = compiler.compile(extern, input, options);
        assertEquals(0, result.errors.length);
        assertNotNull(result.astRoot);
        assertEquals("var x=1;", compiler.toSource());
    }

    @Test
    public void testCompileWithExterns() {
        JSSourceFile extern2 = JSSourceFile.fromCode("extern2.js", "var alert;");
        JSSourceFile[] externs = new JSSourceFile[] { extern, extern2 };
        JSSourceFile[] inputs = new JSSourceFile[] { input };
        Result result = compiler.compile(externs, inputs, options);
        assertEquals(0, result.errors.length);
        assertNotNull(result.astRoot);
    }

    @Test
    public void testCompileModulesWithMultipleModules() {
        List<JSModule> modules = new ArrayList<>();
        JSModule module1 = new JSModule("m1");
        module1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
        modules.add(module1);
        JSModule module2 = new JSModule("m2");
        module2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
        modules.add(module2);
        
        compiler.initModules(Arrays.asList(extern), modules, options);
        Result result = compiler.compile();
        assertEquals(0, result.errors.length);
        assertNotNull(result.astRoot);
    }

    @Test
    public void testCompileModulesWithSingleModule() {
        List<JSModule> modules = new ArrayList<>();
        JSModule module1 = new JSModule("root");
        module1.add(JSSourceFile.fromCode("root.js", "var a = 1;"));
        modules.add(module1);
        
        compiler.initModules(Arrays.asList(extern), modules, options);
        Result result = compiler.compile();
        assertEquals(0, result.errors.length);
    }

    @Test
    public void testGetErrorsWithNoErrors() {
        compiler.compile(extern, input, options);
        assertEquals(0, compiler.getErrors().length);
    }

    @Test
    public void testGetWarningsWithNoWarnings() {
        compiler.compile(extern, input, options);
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testToSourceArray() {
        String[] sources = compiler.toSourceArray();
        assertNotNull(sources);
        assertEquals(0, sources.length);
    }

    @Test
    public void testToSourceWithNullModule() {
        assertEquals("", compiler.toSource((JSModule) null));
    }

    @Test
    public void testCompileWithIdeMode() {
        options.ideMode = true;
        JSSourceFile ideInput = JSSourceFile.fromCode("ide.js", "var ide = true;");
        Result result = compiler.compile(extern, ideInput, options);
        assertEquals(0, result.errors.length);
        assertNotNull(result.astRoot);
    }

    @Test
    public void testCompileWithParseTreeNormalization() {
        options.setParseTreeNormalizationEnabled(true);
        Result result = compiler.compile(extern, input, options);
        assertEquals(0, result.errors.length);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompileWithErrorInput() {
        JSSourceFile badInput = JSSourceFile.fromCode("bad.js", "var x = ;");
        Compiler c = new Compiler();
        c.disableThreads();
        Result result = c.compile(extern, badInput, options);
        assertTrue(result.errors.length > 0);
        fail("Should have thrown IllegalStateException");
    }

    @Test
    public void testGetSourceLine() {
        compiler.compile(extern, input, options);
        assertEquals("var x = 1;", compiler.getSourceLine("input.js", 1));
    }

    @Test
    public void testGetSourceLineWithInvalidLineNumber() {
        compiler.compile(extern, input, options);
        assertNull(compiler.getSourceLine("input.js", 0));
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceRegion() {
        compiler.compile(extern, input, options);
        Region region = compiler.getSourceRegion("input.js", 1);
        assertNotNull(region);
        assertEquals("var x = 1;", region.getSourceExcerpt());
    }

    @Test
    public void testGetInputByName() {
        compiler.compile(extern, input, options);
        assertNotNull(compiler.getInput("input.js"));
        assertNull(compiler.getInput("nonexistent.js"));
    }

    @Test
    public void testGetRoot() {
        compiler.compile(extern, input, options);
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testGetErrorsAfterNoCompile() {
        Compiler c = new Compiler();
        CompilerOptions opts = new CompilerOptions();
        c.initOptions(opts);
        JSSourceFile[] emptyExterns = new JSSourceFile[0];
        JSSourceFile[] emptyInputs = new JSSourceFile[0];
        c.compile(emptyExterns, emptyInputs, opts);
        assertEquals(0, c.getErrors().length);
    }

    @Test
    public void testGetWarningsAfterCompile() {
        Compiler c = new Compiler();
        CompilerOptions opts = new CompilerOptions();
        c.initOptions(opts);
        JSSourceFile externFile = JSSourceFile.fromCode("ext.js", "var ext;");
        JSSourceFile inputFile = JSSourceFile.fromCode("in.js", "var x = 1;");
        c.compile(externFile, inputFile, opts);
        assertEquals(0, c.getWarnings().length);
    }

    @Test
    public void testGetErrorCountAfterCleanCompile() {
        compiler.compile(extern, input, options);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetWarningCountAfterCleanCompile() {
        compiler.compile(extern, input, options);
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testToSourceArrayWithCompiledInputs() {
        compiler.compile(extern, input, options);
        String[] sources = compiler.toSourceArray();
        assertNotNull(sources);
        assertEquals(1, sources.length);
        assertTrue(sources[0].contains("var x"));
    }

    @Test
    public void testCompileWithExternsArray() {
        JSSourceFile[] externs = new JSSourceFile[] { extern };
        JSSourceFile[] inputs = new JSSourceFile[] { input };
        Result result = compiler.compile(externs, inputs, options);
        assertEquals(0, result.errors.length);
    }

    @Test
    public void testCompileWithModuleList() {
        List<JSSourceFile> externs = Arrays.asList(extern);
        List<JSSourceFile> inputs = Arrays.asList(input);
        Result result = compiler.compile(externs, inputs, options);
        assertEquals(0, result.errors.length);
    }

    @Test
    public void testDisableThreads() {
        compiler.disableThreads();
        compiler.compile(extern, input, options);
        assertTrue(compiler.getErrors().length == 0);
    }
}