package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AbstractCommandLineRunnerTest {

    private static class TestCompiler extends Compiler {
        @Override
        public CompilerOptions getOptions() { return new CompilerOptions(); }
        
        @Override
        public void initOptions(CompilerOptions options) {
            super.initOptions(options);
        }
    }

    private static class TestCommandLineRunner extends AbstractCommandLineRunner<TestCompiler, CompilerOptions> {
        TestCommandLineRunner(PrintStream out, PrintStream err) {
            super(out, err);
            getCommandLineConfig().jsOutputFile = "test.js";
            getCommandLineConfig().createSourceMap = "test.map";
        }

        @Override
        protected TestCompiler createCompiler() { return new TestCompiler(); }

        @Override
        protected CompilerOptions createOptions() { return new CompilerOptions(); }

        @Override
        protected void initOptionsFromFlags(CompilerOptions options) {
            super.initOptionsFromFlags(options);
        }

        public void setFlagUsageException(String message) {
            throw new FlagUsageException(message);
        }

        public void testParseModuleWrappers() throws Exception {
            JSModule[] modules = new JSModule[] { new JSModule("mod1"), new JSModule("mod2") };
            Map<String, String> result = parseModuleWrappers(
                Arrays.asList("mod1:%s", "mod2:prefix%s"), modules);
            assertEquals("%s", result.get("mod1"));
            assertEquals("prefix%s", result.get("mod2"));
        }

        public int testDoRun() throws Exception {
            return doRun();
        }
    }

    private TestCommandLineRunner runner;
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;

    @Before
    public void setUp() throws Exception {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        runner = new TestCommandLineRunner(
            new PrintStream(outContent), new PrintStream(errContent));
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testGetCommandLineConfig() {
        assertNotNull(runner.getCommandLineConfig());
        assertEquals("test.js", runner.getCommandLineConfig().jsOutputFile);
        assertEquals("test.map", runner.getCommandLineConfig().createSourceMap);
    }

    @Test
    public void testCreateCompilerReturnsInstance() {
        assertNotNull(runner.createCompiler());
        assertTrue(runner.createCompiler() instanceof Compiler);
    }

    @Test
    public void testCreateOptionsReturnsCompilerOptions() {
        assertNotNull(runner.createOptions());
        assertTrue(runner.createOptions() instanceof CompilerOptions);
    }

    @Test(expected = FlagUsageException.class)
    public void testFlagUsageExceptionIsThrown() {
        runner.setFlagUsageException("test exception");
    }

    @Test
    public void testParseModuleWrappersEmptySpecs() throws Exception {
        JSModule[] modules = new JSModule[] { new JSModule("mod1") };
        Map<String, String> result = parseModuleWrappers(Collections.emptyList(), modules);
        assertNotNull(result);
        assertEquals("", result.get("mod1"));
    }

    @Test
    public void testWriteOutputWithWrapperAndCodePlaceholder() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        
        writeOutput(printStream, null, "code", "prefix:%s:suffix", "%s");
        String result = new String(output.toByteArray(), "UTF-8");
        assertTrue(result.contains("code"));
        printStream.flush();
        
        printStream.close();
    }

    @Test
    public void testCreateInputsEmptyList() throws Exception {
        List<JSSourceFile> result = createInputs(Collections.emptyList(), false);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testCreateInputsSingleFile() throws Exception {
        List<String> files = Arrays.asList("test.js");
        inputCharset = Charsets.UTF_8;
        List<JSSourceFile> result = createInputs(files, false);
        assertEquals(1, result.size());
        assertEquals("test.js", result.get(0).getName());
    }

    @Test
    public void testCreateSourceInputsWithStdinAllowed() throws Exception {
        List<JSSourceFile> result = createSourceInputs(Arrays.asList("-"));
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("stdin", result.get(0).getName());
    }

    @Test(expected = FlagUsageException.class)
    public void testCreateInputsWithStdinNotAllowed() throws Exception {
        createInputs(Arrays.asList("-"), false);
    }

    @Test(expected = FlagUsageException.class)
    public void testCreateInputsStdinTwice() throws Exception {
        createInputs(Arrays.asList("-", "-"), true);
    }

    @Test
    public void testCreateExternInputsEmptyList() throws Exception {
        List<JSSourceFile> result = createExternInputs(Collections.emptyList());
        assertEquals(1, result.size());
        assertEquals("/dev/null", result.get(0).getName());
    }

    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesWithEmptySpecs() throws Exception {
        createJsModules(Collections.emptyList(), Arrays.asList("a.js"));
    }

    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesWithNullSpecs() throws Exception {
        createJsModules(null, Arrays.asList("a.js"));
    }

    @Test
    public void testParseModuleWrappersWithUnknownModule() throws Exception {
        JSModule[] modules = new JSModule[] { new JSModule("mod1") };
        try {
            parseModuleWrappers(Arrays.asList("unknown:%s"), modules);
            fail("Expected FlagUsageException for unknown module");
        } catch (FlagUsageException e) {
            assertTrue(e.getMessage().contains("Unknown module"));
        }
    }

    @Test
    public void testParseModuleWrappersWithMissingPlaceholder() throws Exception {
        JSModule[] modules = new JSModule[] { new JSModule("mod1"), new JSModule("mod2") };
        try {
            parseModuleWrappers(Arrays.asList("mod1:noPlaceholder", "mod2:%s"), modules);
            fail("Expected FlagUsageException for missing placeholder");
        } catch (FlagUsageException e) {
            assertTrue(e.getMessage().contains("No %s placeholder"));
        }
    }

    @Test
    public void testGetErrorPrintStream() {
        assertNotNull(runner.getErrorPrintStream());
        assertEquals(System.err, runner.getErrorPrintStream());
    }
}