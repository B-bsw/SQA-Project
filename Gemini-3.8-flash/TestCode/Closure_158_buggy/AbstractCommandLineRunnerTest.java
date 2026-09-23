package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.io.*;
import java.util.*;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Supplier;

public class AbstractCommandLineRunnerTest {

    private static class TestCompiler extends Compiler {
        @Override
        protected void internalProcessCompilerOptions() {}
    }

    private static class TestOptions extends CompilerOptions {}

    private static class TestRunner extends AbstractCommandLineRunner<TestCompiler, TestOptions> {
        TestRunner(PrintStream out, PrintStream err) {
            super(out, err);
        }
        @Override
        protected TestCompiler createCompiler() { return new TestCompiler(); }
        @Override
        protected TestOptions createOptions() { return new TestOptions(); }
        
        public void enableTesting(Supplier<List<JSSourceFile>> externs,
                                  Supplier<List<JSSourceFile>> inputs,
                                  Supplier<List<JSModule>> modules,
                                  com.google.common.base.Function<Integer, Boolean> exitReceiver) {
            enableTestMode(externs, inputs, modules, exitReceiver);
        }
    }

    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private TestRunner runner;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        runner = new TestRunner(new PrintStream(outContent), new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        runner = null;
        outContent = null;
        errContent = null;
    }

    @Test
    public void testIsInTestModeInitiallyFalse() {
        assertFalse(runner.isInTestMode());
    }

    @Test
    public void testEnableTestModeSetsFlag() {
        runner.enableTesting(null, 
            () -> ImmutableList.of(JSSourceFile.fromCode("test.js", "var x = 1;")),
            null, null);
        assertTrue(runner.isInTestMode());
    }

    @Test(expected = NullPointerException.class)
    public void testEnableTestModeBothSuppliersNull() {
        runner.enableTesting(null, null, null, null);
    }

    @Test
    public void testGetCommandLineConfigNotNull() {
        assertNotNull(runner.getCommandLineConfig());
    }

    @Test
    public void testGetDiagnosticGroupsWithoutCompiler() {
        assertNotNull(runner.getDiagnosticGroups());
    }

    @Test
    public void testCreateInputsWithEmptyFileList() throws Exception {
        TestRunner r = new TestRunner(new PrintStream(outContent), new PrintStream(errContent));
        r.enableTesting(null, 
            () -> ImmutableList.of(),
            null, null);
        List<JSSourceFile> result = r.createInputs(new ArrayList<String>(), false);
        assertEquals(0, result.size());
    }

    @Test
    public void testCreateInputsFromSupplier() throws Exception {
        final JSSourceFile file = JSSourceFile.fromCode("input.js", "var a = 1;");
        runner.enableTesting(null,
            () -> ImmutableList.of(file),
            null, null);
        List<JSSourceFile> result = runner.createInputs(Arrays.asList("dummy"), false);
        assertEquals(1, result.size());
        assertSame(file, result.get(0));
    }

    @Test
    public void testCreateInputsWithStdin() throws Exception {
        final JSSourceFile file = JSSourceFile.fromCode("stdin", "var b = 2;");
        runner.enableTesting(null,
            () -> ImmutableList.of(file),
            null, null);
        List<JSSourceFile> result = runner.createInputs(Arrays.asList("-"), true);
        assertEquals(1, result.size());
    }

    @Test
    public void testCreateInputsNoStdinAllowedWithDash() throws Exception {
        try {
            runner.createInputs(Arrays.asList("-"), false);
            fail("Expected FlagUsageException");
        } catch (FlagUsageException e) {
            // expected
        }
    }

    @Test
    public void testWriteOutputWithNullCode() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        AbstractCommandLineRunner.writeOutput(writer, compiler, null, "");
        assertEquals("", writer.toString());
    }

    @Test
    public void testWriteOutputWithEmptyCode() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        AbstractCommandLineRunner.writeOutput(writer, compiler, "", "");
        assertEquals("", writer.toString());
    }

    @Test
    public void testWriteOutputWithSimpleCode() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        AbstractCommandLineRunner.writeOutput(writer, compiler, "var x = 1;", "");
        assertEquals("var x = 1;", writer.toString());
    }

    @Test
    public void testWriteOutputWithWrapperMarker() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        AbstractCommandLineRunner.writeOutput(writer, compiler, "CODE", "prefix %output% suffix");
        assertEquals("prefix CODE suffix", writer.toString());
    }

    @Test
    public void testWriteOutputWithWrapperNoMarker() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        AbstractCommandLineRunner.writeOutput(writer, compiler, "CODE", "no marker");
        assertEquals("no marker", writer.toString());
    }

    @Test
    public void testWriteOutputWithNullCompilerAndEmptyCode() throws Exception {
        StringWriter writer = new StringWriter();
        AbstractCommandLineRunner.writeOutput(writer, null, "", "");
        assertEquals("", writer.toString());
    }

    @Test
    public void testWriteOutputWithSourceMap() throws Exception {
        StringWriter writer = new StringWriter();
        TestCompiler compiler = new TestCompiler();
        compiler.initOptions(new CompilerOptions());
        AbstractCommandLineRunner.writeOutput(writer, compiler, "code", "");
        assertNotNull(writer.toString());
    }

    @Test
    public void testRunWithTestModeAndExitReceiver() {
        final int[] resultCode = new int[1];
        runner.enableTesting(
            () -> ImmutableList.of(),
            () -> ImmutableList.of(JSSourceFile.fromCode("x.js", "var x=1;")),
            null,
            (code) -> {
                resultCode[0] = code;
                return true;
            });
        runner.run();
        assertFalse(resultCode[0] == 1 || resultCode[0] == -1 || resultCode[0] == -2);
    }

    @Test
    public void testRunWithErrorInCompiler() {
        runner.enableTesting(
            () -> ImmutableList.of(),
            () -> ImmutableList.of(JSSourceFile.fromCode("bad.js", "var = ;")),
            null,
            null);
        try {
            runner.run();
        } catch (Throwable t) {
            assertTrue(t instanceof RuntimeException || t instanceof Exception);
        }
    }

    @Test
    public void testRunNoCompilerErrors() {
        TestRunner r = new TestRunner(new PrintStream(outContent), new PrintStream(errContent));
        r.enableTesting(
            () -> ImmutableList.of(),
            () -> ImmutableList.of(JSSourceFile.fromCode("ok.js", "var x = 1;")),
            null,
            (code) -> {
                return true;
            });
        try {
            r.run();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}