package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import java.io.IOException;

public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;
    private Node externsRoot;
    private Node jsRoot;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
        externsRoot = new Node(Token.EMPTY);
        jsRoot = new Node(Token.EMPTY);
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(new Compiler());
        assertNotNull(new Compiler(System.out));
        assertNotNull(new Compiler((ErrorManager) null));
    }

    @Test
    public void testCompileWithEmptyInputs() {
        Compiler c = new Compiler();
        c.disableThreads();
        Result result = c.compile(Collections.<SourceFile>emptyList(), Collections.<SourceFile>emptyList(), options);
        assertNotNull(result);
        assertFalse(c.hasErrors());
    }

    @Test
    public void testCompileWithNullExterns() {
        Compiler c = new Compiler();
        c.disableThreads();
        Result result = c.compile((SourceFile) null, SourceFile.fromCode("input.js", ""), options);
        assertNotNull(result);
    }

    @Test
    public void testCompileWithNullOptions() {
        Compiler c = new Compiler();
        c.disableThreads();
        try {
            c.compile(Collections.<SourceFile>emptyList(), Collections.<SourceFile>emptyList(), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testGetErrorCountAndWarningCount() {
        Compiler c = new Compiler();
        c.disableThreads();
        c.initOptions(new CompilerOptions());
        c.setErrorManager(new BasicErrorManager() {
            @Override
            public void report(CheckLevel level, JSError error) {}
            @Override
            public JSError[] getErrors() { return new JSError[0]; }
            @Override
            public JSError[] getWarnings() { return new JSError[0]; }
        });
        assertEquals(0, c.getErrorCount());
        assertEquals(0, c.getWarningCount());
        assertFalse(c.hasErrors());
    }

    @Test
    public void testIsTypeCheckingEnabled() {
        CompilerOptions opts = new CompilerOptions();
        opts.checkTypes = true;
        compiler.initOptions(opts);
        assertTrue(compiler.isTypeCheckingEnabled());

        opts.checkTypes = false;
        compiler.initOptions(opts);
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testLanguageMode() {
        CompilerOptions opts = new CompilerOptions();
        opts.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        compiler.initOptions(opts);
        assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5, compiler.languageMode());
    }

    @Test
    public void testAcceptEcmaScript5() {
        CompilerOptions opts = new CompilerOptions();
        opts.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        compiler.initOptions(opts);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testAcceptConstKeyword() {
        CompilerOptions opts = new CompilerOptions();
        opts.acceptConstKeyword = true;
        compiler.initOptions(opts);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testGetWarningsGuard() {
        assertNotNull(compiler.getWarningsGuard());
    }

    @Test
    public void testGetTopScope() {
        assertNull(compiler.getTopScope());
    }

    @Test
    public void testGetTypeRegistry() {
        assertNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetPassConfig() {
        assertNull(compiler.getPassConfig());
    }

    @Test
    public void testGetAstRoot() {
        assertNull(compiler.getAstRoot(new Node(Token.EMPTY)));
    }

    @Test
    public void testGetSourceLine() {
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceRegion() {
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceFileByName() {
        assertNull(compiler.getSourceFileByName("nonexistent.js"));
    }

    @Test
    public void testGetSourceFileByPath() {
        assertNull(compiler.getSourceFileByPath("nonexistent.js"));
    }

    @Test
    public void testGetRoot() {
        assertNull(compiler.getRoot());
    }

    @Test
    public void testGetState() {
        assertNotNull(compiler.getState());
        assertNotNull(compiler.getState().externs);
        assertNotNull(compiler.getState().externsRoot);
    }

    @Test
    public void testGetErrorManager() {
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testGetWarnings() {
        assertArrayEquals(new JSError[0], compiler.getWarnings());
    }

    @Test
    public void testGetMessages() {
        assertArrayEquals(new JSError[0], compiler.getMessages());
    }

    @Test
    public void testGetScriptNode() {
        assertNull(compiler.getScriptNode());
    }

    @Test
    public void testGetSourceMap() {
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testGetOptions() {
        CompilerOptions defaultValue = compiler.getOptions();
        assertNotNull(defaultValue);

        CompilerOptions custom = new CompilerOptions();
        compiler.initOptions(custom);
        assertSame(custom, compiler.getOptions());
    }

    @Test
    public void testGetErrors() {
        assertArrayEquals(new JSError[0], compiler.getErrors());
    }

    @Test
    public void testGetIdentifierSeed() {
        assertEquals(0, compiler.getIdentifierSeed());
        assertEquals(1, compiler.getIdentifierSeed());
    }

    @Test
    public void testGetUniqueNameIdSupplier() {
        assertEquals(0, compiler.getUniqueNameIdSupplier().get().hashCode());
    }

    @Test
    public void testGetUniqueNameId() {
        assertEquals(0, compiler.getUniqueNameId());
        assertEquals(1, compiler.getUniqueNameId());
    }

    @Test
    public void testGetJsRoot() {
        assertNull(compiler.getJsRoot());
    }

    @Test
    public void testGetExternsRoot() {
        assertNull(compiler.getExternsRoot());
    }

    @Test
    public void testGetModuleGraph() {
        assertNull(compiler.getModuleGraph());
    }

    @Test
    public void testGetModuleForInput() {
        assertNull(compiler.getModuleForInput(new CompilerInput(new Node(Token.EMPTY))));
    }

    @Test
    public void testGetInput() {
        assertNull(compiler.getInput(new InputId("")));
    }

    @Test
    public void testGetInputById() {
        assertNull(compiler.getInputById(new InputId("no")));
    }

    @Test
    public void testGetInputByIdWithRealId() {
        CompilerInput input = new CompilerInput(new Node(Token.EMPTY), null, false);
        input.setCompiler(compiler);
        compiler.putCompilerInput(input.getInputId(), input);
        assertSame(input, compiler.getInput(input.getInputId()));
    }

    @Test
    public void testGetInputByName() {
        assertNull(compiler.getInput("nonexistent"));
    }

    @Test
    public void testPutCompilerInput() {
        CompilerInput input = new CompilerInput(new Node(Token.EMPTY), null, false);
        assertSame(input, compiler.putCompilerInput(input.getInputId(), input));
        assertSame(input, compiler.getInput(input.getInputId()));
    }

    @Test
    public void testGetNumInputs() {
        assertEquals(0, compiler.getNumInputs());
    }

    @Test
    public void testGetNumExterns() {
        assertEquals(0, compiler.getNumExterns());
    }

    @Test
    public void testHasRegExpGlobalReferences() {
        assertFalse(compiler.hasRegExpGlobalReferences());
    }

    @Test
    public void testGetGlobalRefMap() {
        assertNull(compiler.getGlobalRefMap());
    }

    @Test
    public void testGetSynthesizedExternsInput() {
        assertNull(compiler.getSynthesizedExternsInput());
    }

    @Test
    public void testGetSynthesizedCode() {
        assertNull(compiler.getSynthesizedCode());
    }

    @Test
    public void testGetProgress() {
        assertEquals(0.0, compiler.getProgress(), 0.0);
        compiler.setProgress(0.5);
        assertEquals(0.5, compiler.getProgress(), 0.001);
        compiler.setProgress(1.5);
        assertEquals(1.0, compiler.getProgress(), 0.0);
        compiler.setProgress(-1.0);
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testGetLineNumber() {
        assertNull(compiler.getLineNumber("foo", 1));
    }

    @Test
    public void testGetLine() {
        assertNull(compiler.getLine("foo", 1));
    }

    @Test
    public void testToSource() {
        assertEquals("", compiler.toSource());
    }

    @Test
    public void testToSourceArray() {
        assertArrayEquals(new String[0], compiler.toSourceArray());
    }

    @Test
    public void testToSourceArrayWithNoInputs() {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertArrayEquals(new String[0], c.toSourceArray());
    }

    @Test
    public void testCodeBuilderAppend() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("test");
        assertEquals("test", cb.toString());
        assertEquals(4, cb.getLength());
        assertEquals(0, cb.getLineCount());
        assertEquals(4, cb.getColumn());
        cb.append('\n');
        assertEquals(1, cb.getLineCount());
        assertEquals(0, cb.getColumn());
    }

    @Test
    public void testCodeBuilderAppendChar() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append('a');
        assertEquals("a", cb.toString());
        assertEquals(1, cb.getLength());
    }

    @Test
    public void testCodeBuilderAppendString() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("abc");
        assertEquals("abc", cb.toString());
    }

    @Test
    public void testCodeBuilderEmpty() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        assertEquals("", cb.toString());
        assertEquals(0, cb.getLength());
        assertEquals(0, cb.getLineCount());
        assertEquals(0, cb.getColumn());
    }
}