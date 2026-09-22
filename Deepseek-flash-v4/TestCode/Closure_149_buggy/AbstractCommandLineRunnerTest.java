package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;

public class AbstractCommandLineRunnerTest {

    private TestCommandLineRunner runner;
    private StringWriter outWriter;
    private StringWriter errWriter;
    private PrintStream outPrint;
    private PrintStream errPrint;

    @Before
    public void setUp() {
        outWriter = new StringWriter();
        errWriter = new StringWriter();
        outPrint = new PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) throws IOException {
                outWriter.write(b);
            }
        });
        errPrint = new PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) throws IOException {
                errWriter.write(b);
            }
        });
        runner = new TestCommandLineRunner(outPrint, errPrint);
    }

    @Test
    public void testConstructorInitializesConfig() {
        assertNotNull(runner.getCommandLineConfig());
        assertEquals("", runner.getCommandLineConfig().charset);
        assertEquals("", runner.getCommandLineConfig().jsOutputFile);
        assertEquals("", runner.getCommandLineConfig().createSourceMap);
        assertEquals("", runner.getCommandLineConfig().variableMapInputFile);
        assertEquals("", runner.getCommandLineConfig().propertyMapInputFile);
        assertEquals(false, runner.getCommandLineConfig().manageClosureDependencies);
        assertEquals(0, runner.getCommandLineConfig().summaryDetailLevel);
        assertEquals(new ArrayList<String>(), runner.getCommandLineConfig().externs);
        assertEquals(new ArrayList<String>(), runner.getCommandLineConfig().moduleWrapper);
        assertEquals("", runner.getCommandLineConfig().moduleOutputPathPrefix);
        assertEquals("", runner.getCommandLineConfig().outputManifest);
        assertEquals(0, runner.getCommandLineConfig().module.size());
        assertEquals(false, runner.getCommandLineConfig().printAst);
        assertEquals(false, runner.getCommandLineConfig().printTree);
        assertEquals(false, runner.getCommandLineConfig().printPassGraph);
        assertEquals(false, runner.getCommandLineConfig().computePhaseOrdering);
        assertEquals("", runner.getCommandLineConfig().jscompError);
        assertEquals("", runner.getCommandLineConfig().jscompWarning);
        assertEquals("", runner.getCommandLineConfig().jscompOff);
        assertEquals("", runner.getCommandLineConfig().charset);
        assertEquals("", runner.getCommandLineConfig().jsOutputFile);
        assertEquals("", runner.getCommandLineConfig().createSourceMap);
        assertEquals("", runner.getCommandLineConfig().variableMapInputFile);
        assertEquals("", runner.getCommandLineConfig().propertyMapInputFile);
        assertEquals("", runner.getCommandLineConfig().externExportsPath);
        assertEquals("", runner.getCommandLineConfig().codingConvention);
        assertEquals("", runner.getCommandLineConfig().moduleOutputPathPrefix);
        assertEquals("", runner.getCommandLineConfig().outputManifest);
        assertEquals(0, runner.getCommandLineConfig().summaryDetailLevel);
        assertNull(runner.getCommandLineConfig().variableMapOutputFile);
        assertNull(runner.getCommandLineConfig().propertyMapOutputFile);
        assertNull(runner.getCommandLineConfig().createInputSourceMap);
        assertEquals("", runner.getCommandLineConfig().outputWrapper);
        assertEquals("", runner.getCommandLineConfig().outputWrapperMarker);
        assertEquals("", runner.getCommandLineConfig().moduleWrapper[0]);
    }

    @Test
    public void testCreateInputsBasic() throws Exception {
        List<String> files = Arrays.asList("file1.js", "file2.js");
        List<JSSourceFile> result = runner.createInputsPublic(files, false);
        assertEquals(2, result.size());
        assertEquals("file1.js", result.get(0).getName());
        assertEquals("file2.js", result.get(1).getName());
    }

    @Test
    public void testCreateInputsEmptyList() throws Exception {
        List<String> files = new ArrayList<String>();
        List<JSSourceFile> result = runner.createInputsPublic(files, false);
        assertEquals(0, result.size());
    }

    @Test
    public void testCreateInputsStdinNotAllowed() throws Exception {
        List<String> files = Arrays.asList("-", "file1.js");
        try {
            runner.createInputsPublic(files, false);
            fail("Expected FlagUsageException for stdin when not allowed");
        } catch (AbstractCommandLineRunner.FlagUsageException e) {
            assertEquals("Can't specify stdin.", e.getMessage());
        }
    }

    @Test
    public void testCreateInputsStdinTwice() throws Exception {
        List<String> files = Arrays.asList("-", "-");
        try {
            runner.createInputsPublic(files, true);
            fail("Expected FlagUsageException for duplicate stdin");
        } catch (AbstractCommandLineRunner.FlagUsageException e) {
            assertEquals("Can't specify stdin twice.", e.getMessage());
        }
    }

    @Test
    public void testCreateInputsStdinAllowed() throws Exception {
        List<String> files = Arrays.asList("-", "file1.js");
        List<JSSourceFile> result = runner.createInputsPublic(files, true);
        assertEquals(2, result.size());
        assertEquals("stdin", result.get(0).getName());
        assertEquals("file1.js", result.get(1).getName());
    }

    @Test
    public void testCreateExternInputsEmpty() throws Exception {
        List<String> files = new ArrayList<String>();
        List<JSSourceFile> result = runner.createExternInputsPublic(files);
        assertEquals(0, result.size());
    }

    @Test
    public void testCreateExternInputsNullInput() throws Exception {
        try {
            runner.createExternInputsPublic(null);
            fail("Expected NullPointerException for null externs");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateJsModulesNullSpecs() throws Exception {
        try {
            AbstractCommandLineRunner.createJsModulesPublic(null, new ArrayList<String>());
            fail("Expected NullPointerException for null specs");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateJsModulesEmptySpecs() throws Exception {
        try {
            AbstractCommandLineRunner.createJsModulesPublic(new ArrayList<String>(), new ArrayList<String>());
            fail("Expected IllegalStateException for empty specs");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testCreateJsModulesInvalidFormat() throws Exception {
        List<String> specs = Arrays.asList("module1");
        List<String> jsFiles = Arrays.asList("file1.js");
        try {
            AbstractCommandLineRunner.createJsModulesPublic(specs, jsFiles);
            fail("Expected FlagUsageException for invalid module format");
        } catch (AbstractCommandLineRunner.FlagUsageException e) {
            assertTrue(e.getMessage().contains("Expected 2-4 colon-delimited parts"));
        }
    }

    @Test
    public void testCreateJsModulesInvalidName() throws Exception {
        List<String> specs = Arrays.asList("invalid-name:1");
        List<String> jsFiles = Arrays.asList("file1.js");
        try {
            AbstractCommandLineRunner.createJsModulesPublic(specs, jsFiles);
            fail("Expected FlagUsageException for invalid module name");
        } catch (AbstractCommandLineRunner.FlagUsageException e) {
            assertTrue(e.getMessage().contains("Invalid module name"));
        }
    }

    @Test
    public void testParseModuleWrappersEmptySpecs() throws Exception {
        JSModule[] modules = new JSModule[0];
        Map<String, String> result = AbstractCommandLineRunner.parseModuleWrappersPublic(new ArrayList<String>(), modules);
        assertEquals(0, result.size());
    }

    @Test
    public void testWriteOutputWithWrapperBasic() throws Exception {
        StringWriter target = new StringWriter();
        Compiler compiler = new TestCompiler();
        compiler.setCode("var x = 1;");
        AbstractCommandLineRunner.writeOutputPublic(target, compiler, "", "out.js", false, false, "outputPath");
        String result = target.toString();
        assertEquals("", result);
    }

    @Test
    public void testGetErrorPrintStream() {
        assertSame(errPrint, runner.getErrorPrintStream());
    }

    @Test
    public void testRunWithEmptyConfig() {
        runner.run();
        assertEquals("", outWriter.toString());
    }

    private static class TestCommandLineRunner extends AbstractCommandLineRunner<TestCompiler, CompilerOptions> {
        public TestCommandLineRunner(PrintStream out, PrintStream err) {
            super(out, err);
        }

        @Override
        protected TestCompiler createCompiler() {
            return new TestCompiler();
        }

        @Override
        protected CompilerOptions createOptions() {
            return new CompilerOptions();
        }

        @Override
        protected DiagnosticGroups getDiagnosticGroups() {
            return new DiagnosticGroups();
        }

        public List<JSSourceFile> createInputsPublic(List<String> files, boolean allowStdIn)
                throws AbstractCommandLineRunner.FlagUsageException, IOException {
            return createInputs(files, allowStdIn);
        }

        public List<JSSourceFile> createExternInputsPublic(List<String> files)
                throws AbstractCommandLineRunner.FlagUsageException, IOException {
            return createExternInputs(files);
        }

        public CommandLineConfig getConfig() {
            return config;
        }

        public void setOut(Appendable out) {
            this.out = out;
        }

        public void setCompiler(TestCompiler compiler) {
            this.compiler = compiler;
        }

        public int doRunPublic() throws Throwable {
            return doRun();
        }

        @Override
        protected int doRun() throws Throwable {
            return 0;
        }

        @Override
        protected int processExternExports(CompilerOptions options, List<JSSourceFile> externs)
                throws Exception {
            return 0;
        }

        @Override
        protected int processModules(CompilerOptions options, List<JSSourceFile> externs)
                throws Exception {
            return 0;
        }

        public void setInputCharset(java.nio.charset.Charset charset) {
            inputCharset = charset;
        }

        @Override
        protected void initOptionsFromFlags(CompilerOptions options) {
        }

        public void setCommandLineConfig(CommandLineConfig config) {
            this.config = config;
        }

        public void runPublic() {
            run();
        }
    }

    private static class TestCompiler extends Compiler {
        private Node root;
        private String code;

        public void setRoot(Node root) {
            this.root = root;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public Node getRoot() {
            return root;
        }

        @Override
        public Result compile(List<JSSourceFile> externs, List<JSSourceFile> inputs) {
            return new Result();
        }

        @Override
        public Result compileModules(List<JSModule> modules, List<JSSourceFile> externs) {
            return new Result();
        }

        @Override
        public String toSource() {
            return code != null ? code : "";
        }
    }

    private static class TestCompilerOptions extends CompilerOptions {
    }
}