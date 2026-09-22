package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerTest {
    private Compiler compiler;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        compiler = new Compiler();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(compiler);
        assertNull(compiler.getErrorManager());
        assertNull(compiler.getRoot());
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testCompilerWithPrintStream() {
        Compiler c = new Compiler(new PrintStream(outContent));
        assertNotNull(c);
    }

    @Test
    public void testCompilerWithErrorManager() {
        ErrorManager em = new ErrorManager() {
            @Override public void report(CheckLevel level, JSError error) {}
            @Override public void report(CheckLevel level, JSError[] errors) {}
            @Override public JSError[] getErrors() { return new JSError[0]; }
            @Override public JSError[] getWarnings() { return new JSError[0]; }
            @Override public void setThrowOnError(boolean throwOnError) {}
            @Override public void setThrowOnWarning(boolean throwOnWarning) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public void generateReport() {}
            @Override public void setErrorLevel(String sourceName, DiagnosticType type, CheckLevel level) {}
        };
        Compiler c = new Compiler(em);
        assertNotNull(c);
        assertSame(em, c.getErrorManager());
    }

    @Test
    public void testInitOptions() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertSame(options, compiler.options);
    }

    @Test
    public void testInitWithNullErrorManager() {
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testInitOptionsWithNullOptions() {
        compiler.initOptions(null);
        assertNull(compiler.options);
    }

    @Test
    public void testGetResultEmpty() {
        compiler.initOptions(new CompilerOptions());
        Result result = compiler.getResult();
        assertNotNull(result);
        assertNotNull(result.errors);
        assertNotNull(result.warnings);
    }

    @Test
    public void testGetErrorsEmpty() {
        assertNotNull(compiler.getErrors());
        assertEquals(0, compiler.getErrors().length);
    }

    @Test
    public void testGetWarningsEmpty() {
        assertNotNull(compiler.getWarnings());
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testGetRootNull() {
        assertNull(compiler.getRoot());
    }

    @Test
    public void testGetSourceMapNull() {
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testUniqueNameIdIncrement() {
        int first = compiler.nextUniqueNameId();
        int second = compiler.nextUniqueNameId();
        assertEquals(first + 1, second);
    }

    @Test
    public void testUniqueNameSupplier() {
        int first = compiler.nextUniqueNameId();
        int second = Integer.parseInt(compiler.getUniqueNameSupplier().get());
        assertEquals(first + 1, second);
    }

    @Test
    public void testGetAstRootWhenNull() {
        Node result = compiler.getAstRoot(null);
        assertNull(result);
    }

    @Test
    public void testToSourceEmpty() {
        String result = compiler.toSource();
        assertNotNull(result);
        assertEquals("", result.trim());
    }

    @Test
    public void testToSourceArrayEmpty() {
        String[] result = compiler.toSourceArray();
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testToSourceNullModule() {
        String result = compiler.toSource((JSModule) null);
        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void testToSourceArrayNullModule() {
        String[] result = compiler.toSourceArray((JSModule) null);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testParseSimpleInput() {
        compiler.initOptions(new CompilerOptions());
        Node node = compiler.parse("test.js", "var x = 1;");
        assertNotNull(node);
    }

    @Test
    public void testIsTypeCheckingEnabledDefault() {
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testIsTypeCheckingEnabledTrue() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testGetErrorCountDefault() {
        compiler.initOptions(new CompilerOptions());
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetWarningCountDefault() {
        compiler.initOptions(new CompilerOptions());
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testGetInputNonExistent() {
        assertNull(compiler.getInput("nonexistent"));
    }

    @Test
    public void testGetSourceFileByNameNonExistent() {
        assertNull(compiler.getSourceFileByName("nonexistent"));
    }

    @Test
    public void testGetSourceLineNegativeLineNumber() {
        assertNull(compiler.getSourceLine("test", -1));
    }

    @Test
    public void testGetSourceLineNonExistentInput() {
        assertNull(compiler.getSourceLine("nonexistent", 1));
    }

    @Test
    public void testNewExternInput() {
        compiler.initOptions(new CompilerOptions());
        CompilerInput input = compiler.newExternInput("extern1");
        assertNotNull(input);
        assertNotNull(compiler.getInput("extern1"));
    }

    @Test
    public void testNewExternInputDuplicate() {
        compiler.initOptions(new CompilerOptions());
        CompilerInput first = compiler.newExternInput("extern1");
        CompilerInput second = compiler.newExternInput("extern1");
        assertNotNull(first);
        assertNotNull(second);
    }

    @Test
    public void testHasErrorsDefault() {
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testHasHaltingErrorsDefault() {
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.hasHaltingErrors());
    }

    @Test
    public void testIsIdeModeDefault() {
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.isIdeMode());
    }

    @Test
    public void testIsIdeModeTrue() {
        CompilerOptions options = new CompilerOptions();
        options.ideMode = true;
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testCodeBuilder() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        assertEquals(0, cb.getLength());
        assertEquals(0, cb.getLineCount());
        cb.append("hello");
        assertEquals(5, cb.getLength());
        assertEquals("hello", cb.toString());
        cb.append(" world");
        assertEquals(11, cb.getLength());
        assertEquals("hello world", cb.toString());
        assertTrue(cb.endsWith("world"));
        assertFalse(cb.endsWith("hello"));
    }

    @Test
    public void testCodeBuilderAppendEmpty() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("");
        assertEquals(0, cb.getLength());
        assertEquals(1, cb.getLineCount());
    }

    @Test
    public void testCodeBuilderNewline() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("a\nb");
        assertEquals(2, cb.getLineCount());
    }

    @Test
    public void testCodeBuilderSuffixLengthLessThanString() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("abcdef");
        assertTrue(cb.endsWith("def"));
        assertFalse(cb.endsWith("x"));
    }

    @Test
    public void testGetRootWhenNull() {
        assertNull(compiler.getRoot());
    }

    @Test
    public void testGetResolvedInputsWhenNull() {
        assertNull(compiler.getResolvedInputs());
    }

    @Test
    public void testGetResolvedInputsEmpty() {
        compiler.initOptions(new CompilerOptions());
        List<CompilerInput> result = compiler.getResolvedInputs();
        assertNotNull(result);
    }

    @Test
    public void testGetTypeRegistryInitialized() {
        assertNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetTypeRegistryAfterInit() {
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetMessage() {
        assertEquals(0, compiler.getMessage().length());
    }

    @Test
    public void testParseWithEmptySource() {
        compiler.initOptions(new CompilerOptions());
        Node node = compiler.parse("empty.js", "");
        assertNotNull(node);
    }

    @Test
    public void testToSourceArrayWithNullModule() {
        String[] result = compiler.toSourceArray(null);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testIntermediateState() {
        Compiler.IntermediateState state = new Compiler.IntermediateState();
        assertNotNull(state);
        Compiler.IntermediateState state2 = new Compiler.IntermediateState();
        compiler.setState(state2);
        Compiler.IntermediateState result = compiler.getState();
        assertNotNull(result);
    }

    @Test
    public void testGetStateNull() {
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getState());
    }

    @Test
    public void testInvalidGetLineNumber() {
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getSourceLine("test", 0));
    }
}