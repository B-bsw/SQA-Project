package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;

public class CompilerTest {

    private Compiler compiler;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;
    private CompilerOptions options;
    private ErrorManager errorManager;

    @Before
    public void setUp() {
        compiler = new Compiler();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        options = new CompilerOptions();
        errorManager = new BasicErrorManager();
        compiler.setErrorManager(errorManager);
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testDefaultConstructor() {
        Compiler c = new Compiler();
        assertNotNull(c);
        assertNotNull(c.getErrorManager());
        assertNotNull(c.getErrors());
        assertEquals(0, c.getErrorCount());
        assertEquals(0, c.getWarningCount());
    }

    @Test
    public void testConstructorWithPrintStream() {
        Compiler c = new Compiler(new PrintStream(outContent));
        assertNotNull(c);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testConstructorWithErrorManager() {
        Compiler c = new Compiler(errorManager);
        assertNotNull(c);
        assertSame(errorManager, c.getErrorManager());
    }

    @Test
    public void testInitOptionsWithNullErrorManager() {
        Compiler c = new Compiler((ErrorManager) null);
        c.initOptions(new CompilerOptions());
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testInitOptionsWithCheckTypesEnabled() {
        options.setCheckTypes(true);
        options.setCheckGlobalThisLevel(CheckLevel.WARNING);
        compiler.initOptions(options);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testInitOptionsWithCheckSymbolsDisabled() {
        options.setCheckSymbols(false);
        options.setCheckGlobalThisLevel(CheckLevel.OFF);
        compiler.initOptions(options);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testEmptyModuleList() {
        List<JSModule> modules = Collections.emptyList();
        compiler.initModules(modules);
        assertTrue(compiler.getErrorCount() > 0);
        assertEquals(1, compiler.getErrors().length);
        assertEquals(Compiler.EMPTY_MODULE_LIST_ERROR.key, compiler.getErrors()[0].getType().key);
    }

    @Test
    public void testEmptyRootModule() {
        JSModule module1 = new JSModule("m1");
        JSModule module2 = new JSModule("m2");
        module2.add(new JSSourceFile("file2.js", "var x = 1;"));
        List<JSModule> modules = Arrays.asList(module1, module2);
        compiler.initModules(modules);
        assertTrue(compiler.getErrorCount() > 0);
        assertEquals(1, compiler.getErrors().length);
        assertEquals(Compiler.EMPTY_ROOT_MODULE_ERROR.key, compiler.getErrors()[0].getType().key);
    }

    @Test
    public void testValidModules() {
        JSModule module1 = new JSModule("m1");
        module1.add(new JSSourceFile("file1.js", "var a = 1;"));
        JSModule module2 = new JSModule("m2");
        module2.add(new JSSourceFile("file2.js", "var b = 2;"));
        List<JSModule> modules = Arrays.asList(module1, module2);
        compiler.initModules(modules);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testEmptyExternsAndInputs() {
        Result result = compiler.compile(
                new JSSourceFile[] {}, 
                new JSSourceFile[] {}, 
                options);
        assertNotNull(result);
        assertTrue(result.success || result.errors.length > 0);
    }

    @Test
    public void testCompileWithEmptyInput() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        Result result = compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile[] { new JSSourceFile("input.js", "") },
                options);
        assertNotNull(result);
        assertTrue(result.success);
    }

    @Test
    public void testCompileWithNullInput() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        Result result = compiler.compile(
                new JSSourceFile[] {},
                (JSSourceFile) null,
                options);
        assertNotNull(result);
        assertFalse(result.success);
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testCompileWithSimpleCode() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        Result result = compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile("input.js", "var x = 1;"),
                options);
        assertEquals(0, result.errors.length);
        assertTrue(result.success);
    }

    @Test
    public void testCompileWithDuplicateExterns() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        JSSourceFile extern = new JSSourceFile("extern.js", "var x;");
        Result result = compiler.compile(
                new JSSourceFile[] { extern, extern },
                new JSSourceFile[] { new JSSourceFile("input.js", "") },
                options);
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testCompileWithDuplicateInputs() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        JSSourceFile input = new JSSourceFile("input.js", "var y;");
        Result result = compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile[] { input, input },
                options);
        assertTrue(compiler.getErrorCount() > 0);
        assertEquals(1, compiler.getErrors().length);
        assertEquals(Compiler.DUPLICATE_INPUT.key, compiler.getErrors()[0].getType().key);
    }

    @Test
    public void testGetSourceFileByName() {
        JSSourceFile file = new JSSourceFile("test.js", "var a = 10;");
        compiler.initOptions(options);
        compiler.getInput("test.js");
        assertNotNull(compiler.getInput("test.js"));
    }

    @Test
    public void testToSourceWithNullScript() {
        Node node = new Node(Token.SCRIPT);
        compiler.initOptions(options);
        compiler.setExternsRoot(new Node(Token.EMPTY));
        compiler.setJsRoot(node);
        String source = compiler.toSource();
        assertEquals("", source);
    }

    @Test
    public void testToSourceWithSimpleScript() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile("input.js", "var x = 1;"),
                options);
        String source = compiler.toSource();
        assertNotNull(source);
        assertTrue(source.length() > 0);
    }

    @Test
    public void testGetAstDotGraph() throws Exception {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile("input.js", "var x = 1;"),
                options);
        try {
            String graph = compiler.getAstDotGraph();
            assertNotNull(graph);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testReportCodeChange() {
        compiler.reportCodeChange();
        assertTrue(compiler.hasChanged());
    }

    @Test
    public void testIsIdeMode() {
        options.setIdeMode(true);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testAcceptEcmaScript5() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageModeECMASCRIPT3() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());
    }

    @Test
    public void testIsTypeCheckingEnabled() {
        options.setCheckTypes(true);
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testIsTypeCheckingDisabled() {
        options.setCheckTypes(false);
        compiler.initOptions(options);
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testGetErrorManager() {
        assertSame(errorManager, compiler.getErrorManager());
    }

    @Test
    public void testGetErrorsWhenEmpty() {
        assertEquals(0, compiler.getErrors().length);
    }

    @Test
    public void testGetWarningsWhenEmpty() {
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testGetRoot() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        compiler.compile(
                new JSSourceFile[] {},
                new JSSourceFile("input.js", "var q = 1;"),
                options);
        Node root = compiler.getRoot();
        assertNotNull(root);
    }

    @Test
    public void testGetDefaultErrorReporter() {
        assertNotNull(compiler.getDefaultErrorReporter());
    }

    @Test
    public void testGetCodingConvention() {
        assertNotNull(compiler.getCodingConvention());
    }

    @Test
    public void testGetPassConfig() {
        assertNotNull(compiler.getPassConfig());
    }

    @Test
    public void testHasErrorsWhenNoErrors() {
        errorManager = new BasicErrorManager();
        compiler.setErrorManager(errorManager);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testHasErrorsWithErrors() {
        JSError error = JSError.make("test.js", 1, "TYPE", "Test error", CheckLevel.ERROR);
        errorManager.report(error);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testGetStateNotNull() {
        assertNotNull(compiler.getState());
    }
}