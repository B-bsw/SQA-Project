package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.InputId;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.DiagnosticGroups;
import com.google.javascript.jscomp.testing.JSCompCornerCases;
import com.google.javascript.jscomp.testing.JSCompCornerCases.CornerCase;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;
    private ByteArrayOutputStream outStream;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        options.setLanguageOut(CompilerOptions.LanguageMode.ECMASCRIPT5);
        outStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(new Compiler());
    }

    @Test
    public void testConstructorWithPrintStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Compiler c = new Compiler(new PrintStream(baos));
        assertNotNull(c);
    }

    @Test
    public void testConstructorWithErrorManager() {
        ErrorManager em = new ThreadSafeErrorManager();
        Compiler c = new Compiler(em);
        assertNotNull(c);
        assertEquals(em, c.getErrorManager());
    }

    @Test
    public void testConstructorWithNullErrorManager() {
        try {
            new Compiler((ErrorManager) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCompileSimpleScript() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        Result result = c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(result);
        assertTrue(result.success);
        assertEquals(0, c.getErrorCount());
    }

    @Test
    public void testCompileWithSyntaxError() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        Result result = c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = ;"), opts);
        assertNotNull(result);
        assertFalse(result.success);
        assertTrue(c.getErrorCount() > 0);
    }

    @Test
    public void testCompileWithNullInput() {
        try {
            compiler.compile((List<SourceFile>) null, (List<SourceFile>) null, options);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCompileWithEmptyInputs() {
        List<SourceFile> externs = new ArrayList<>();
        List<SourceFile> inputs = new ArrayList<>();
        Result result = compiler.compile(externs, inputs, options);
        assertNotNull(result);
        assertFalse(result.success);
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testCompileSingleFileWithInvalidSyntax() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        SourceFile extern = SourceFile.fromCode("externs.js", "");
        SourceFile input = SourceFile.fromCode("input.js", "function() {");
        Result result = c.compile(extern, input, opts);
        assertNotNull(result);
        assertFalse(result.success);
        assertTrue(c.getErrorCount() > 0);
    }

    @Test
    public void testCompileMultipleInputs() {
        List<SourceFile> externs = new ArrayList<>();
        List<SourceFile> inputs = new ArrayList<>();
        externs.add(SourceFile.fromCode("externs.js", ""));
        inputs.add(SourceFile.fromCode("a.js", "var a = 1;"));
        inputs.add(SourceFile.fromCode("b.js", "var b = 2;"));
        Result result = compiler.compile(externs, inputs, options);
        assertNotNull(result);
        assertTrue(result.success);
    }

    @Test
    public void testToSource() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        String source = c.toSource();
        assertNotNull(source);
        assertTrue(source.contains("x"));
    }

    @Test
    public void testToSourceWithNoInputs() {
        try {
            compiler.toSource();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testToSourceArray() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1; var y = 2;"), opts);
        String[] sources = c.toSourceArray();
        assertNotNull(sources);
        assertEquals(1, sources.length);
        assertEquals("var x=1;var y=2;", sources[0]);
    }

    @Test
    public void testToSourceArrayEmpty() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", ";"), opts);
        String[] sources = c.toSourceArray();
        assertNotNull(sources);
        assertEquals(0, sources.length);
    }

    @Test
    public void testGetWarnings() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        opts.setWarningLevel(DiagnosticGroups.UNDEFINED_VARIABLES, CheckLevel.WARNING);
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "x = 1;"), opts);
        JSError[] warnings = c.getWarnings();
        assertNotNull(warnings);
        assertTrue(warnings.length > 0);
    }

    @Test
    public void testGetErrors() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = ;"), opts);
        JSError[] errors = c.getErrors();
        assertNotNull(errors);
        assertTrue(errors.length > 0);
    }

    @Test
    public void testHasErrors() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertFalse(c.hasErrors());
    }

    @Test
    public void testHasErrorsWithSyntaxError() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = ;"), opts);
        assertTrue(c.hasErrors());
    }

    @Test
    public void testNullErrorManager() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler(new ThreadSafeErrorManager());
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testGetProgress() {
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testGetOptions() {
        assertNotNull(compiler.getOptions());
    }

    @Test
    public void testGetTypeRegistry() {
        assertNotNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetTopScope() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(c.getTopScope());
    }

    @Test
    public void testGetAstRoot() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        Node node = c.getAstRoot(c.getInput(new InputId("input.js")));
        assertNotNull(node);
    }

    @Test
    public void testGetRoot() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        Node root = c.getRoot();
        assertNotNull(root);
    }

    @Test
    public void testGetCodingConvention() {
        assertNotNull(compiler.getCodingConvention());
    }

    @Test
    public void testGetSourceMap() {
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testGetWarningsGuard() {
        assertNotNull(compiler.getWarningsGuard());
    }

    @Test
    public void testGetErrorCount() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = ;"), opts);
        assertTrue(c.getErrorCount() > 0);
    }

    @Test
    public void testGetWarningCount() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        opts.setWarningLevel(DiagnosticGroups.UNDEFINED_VARIABLES, CheckLevel.WARNING);
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "x = 1;"), opts);
        assertTrue(c.getWarningCount() > 0);
    }

    @Test
    public void testGetInput() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        CompilerInput input = c.getInput(new InputId("input.js"));
        assertNotNull(input);
    }

    @Test
    public void testGetInputNonExistent() {
        assertNull(compiler.getInput(new InputId("nonexistent")));
    }

    @Test
    public void testNewExternInput() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.initOptions(opts);
        CompilerInput input = c.newExternInput("test_extern");
        assertNotNull(input);
        assertTrue(input.isExtern());
    }

    @Test
    public void testGetSynthesizedExternsInput() {
        assertNotNull(compiler.getSynthesizedExternsInput());
    }

    @Test
    public void testGetTypeValidator() {
        assertNotNull(compiler.getTypeValidator());
    }

    @Test
    public void testGetPassConfig() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.initOptions(opts);
        assertNotNull(c.getPassConfig());
    }

    @Test
    public void testGetDefaultErrorReporter() {
        assertNotNull(compiler.getDefaultErrorReporter());
    }

    @Test
    public void testGetAstDotGraph() throws Exception {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        String dot = c.getAstDotGraph();
        assertNotNull(dot);
        assertTrue(dot.contains("digraph"));
    }

    @Test
    public void testGetIntermediateState() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(c.getState());
    }

    @Test
    public void testGetExternsRoot() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(c.getExternsRoot());
    }

    @Test
    public void testGetJsRoot() {
        CompilerOptions opts = new CompilerOptions();
        Compiler c = new Compiler();
        c.compile(SourceFile.fromCode("externs.js", ""), SourceFile.fromCode("input.js", "var x = 1;"), opts);
        assertNotNull(c.getJsRoot());
    }

    @Test
    public void testGetUniqueNameId() {
        assertTrue(compiler.getUniqueNameId("test") >= 0);
    }
}