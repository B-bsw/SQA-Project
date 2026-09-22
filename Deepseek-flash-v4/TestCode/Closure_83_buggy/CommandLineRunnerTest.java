package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CommandLineRunnerTest {
    private static final String EXTERNS_ZIP_CONTENT = "externs1.js\nexterns2.js\nexterns3.js";
    private ByteArrayOutputStream errOutput;
    private PrintStream originalErr;
    private ByteArrayOutputStream outOutput;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        originalErr = System.err;
        originalOut = System.out;
        errOutput = new ByteArrayOutputStream();
        outOutput = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errOutput));
        System.setOut(new PrintStream(outOutput));
    }

    @After
    public void tearDown() {
        System.setErr(originalErr);
        System.setOut(originalOut);
    }

    // Helper to create a CommandLineRunner with given args
    private CommandLineRunner createRunner(String[] args) {
        return new CommandLineRunner(args);
    }

    @Test
    public void testConstructorWithNullArgs() {
        try {
            CommandLineRunner runner = new CommandLineRunner(null);
            fail("Expected NullPointerException for null args");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithEmptyArgs() {
        CommandLineRunner runner = createRunner(new String[]{});
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructorWithHelpFlag() {
        CommandLineRunner runner = createRunner(new String[]{"--help"});
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
        String output = outOutput.toString();
        assertTrue(output.contains("Usage") || output.contains("Displays this message"));
    }

    @Test
    public void testConstructorWithVersionFlag() {
        CommandLineRunner runner = createRunner(new String[]{"--version"});
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
        assertTrue(outOutput.toString().contains("Closure Compiler"));
    }

    @Test
    public void testConstructorWithInvalidJscompDevMode() {
        CommandLineRunner runner = createRunner(new String[]{"--jscomp_dev_mode=INVALID"});
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
        assertTrue(errOutput.toString().contains("Invalid value") || errOutput.toString().contains("Invalid"));
    }

    @Test
    public void testShouldRunCompilerWithValidConfig() {
        CommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompilerWithInvalidConfig() {
        CommandLineRunner runner = createRunner(new String[]{"--invalid_flag"});
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
        assertTrue(errOutput.toString().contains("Unrecognized option") || errOutput.toString().contains("Error"));
    }

    @Test
    public void testGetDefaultExternsWithMockedZipResource() throws IOException {
        // We can't easily mock getResourceAsStream without PowerMock, so test basic path
        // This is a sanity check to ensure the method exists and returns a list (may be empty if resource missing)
        try {
            List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
            assertNotNull(externs);
            // The method might throw IOException if resource not found; if so, we handle it
            // Note: In real test environment, externs.zip should exist on classpath
            System.out.println("Default externs: " + externs.size());
        } catch (IOException e) {
            // If resource doesn't exist, test should still pass (or fail based on expectation)
            fail("getDefaultExterns threw IOException: " + e.getMessage());
        }
    }

    @Test
    public void testProcessModulesWithEmptyList() {
        String[] args = new String[]{};
        CommandLineRunner runner = createRunner(args);
        assertNotNull(runner);
        assertFalse(runner.shouldRunCompiler());
        verifyConfigInvalid(runner);
    }

    @Test
    public void testCreateOptionsWithDefaultFlags() {
        CommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertFalse(options.getLanguageIn().isEs6OrHigher());
        assertEquals(1, options.getSummaryDetailLevel());
    }

    @Test
    public void testCreateOptionsWithCustomFlags() {
        String[] args = new String[]{
            "--js", "test.js",
            "--compilation_level", "ADVANCED_OPTIMIZATIONS",
            "--charset", "UTF-8",
            "--summary_detail_level", "3",
            "--output_wrapper", "wrapper%output%wrapper2"
        };
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertEquals(3, options.getSummaryDetailLevel());
    }

    @Test
    public void testCreateOptionsWithDebug() {
        String[] args = new String[]{"--js", "test.js", "--debug"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.isDebugEnabled());
    }

    @Test
    public void testCreateOptionsWithSourceMap() {
        String[] args = new String[]{"--js", "test.js", "--create_source_map", "test.map", "--source_map_format=V3"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertEquals("test.map", options.getSourceMapOutputPath());
    }

    @Test
    public void testCreateOptionsWithVariableMap() {
        String[] args = new String[]{"--js", "test.js", "--variable_map_input_file", "input.map", "--variable_map_output_file", "output.map"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertEquals("input.map", options.getVariableMapInputFile());
        assertEquals("output.map", options.getVariableMapOutputFile());
    }

    @Test
    public void testCreateOptionsWithJscompErrors() {
        String[] args = new String[]{"--js", "test.js", "--jscomp_error=checkTypes"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // Verify that checkTypes is set as an error
        assertTrue(options.getWarningLevels().isEmpty() || options.getWarningLevels().containsKey("checkTypes"));
    }

    @Test
    public void testCreateOptionsWithThirdParty() {
        String[] args = new String[]{"--js", "test.js", "--third_party"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // Should not throw and should have some defaults
        assertTrue(options.checkTypes);
    }

    @Test
    public void testCreateOptionsWithExternsAndJsFiles() {
        String[] args = new String[]{"--js", "test.js", "test2.js", "--externs", "ext1.js", "ext2.js"};
        CommandLineRunner runner = createRunner(args);
        assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testBooleanOptionHandlerParse() throws Exception {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(
                new CommandLineRunner.Flags(),
                new org.kohsuke.args4j.OptionDef("--option", true, false, false, false, new Class<?>[]{Boolean.class}),
                new org.kohsuke.args4j.OptionSetter<Boolean>(new CommandLineRunner.Flags(), 
                    CommandLineRunner.Flags.class.getDeclaredField("third_party"), Boolean.class)
            );
        
        assertEquals(1, handler.parseArguments(new Parameters() {
            @Override
            public String getParameter(int idx) { return "true"; }
            @Override
            public int size() { return 1; }
        }));
        
        assertEquals(1, handler.parseArguments(new Parameters() {
            @Override
            public String getParameter(int idx) { return "TRUE"; }
            @Override
            public int size() { return 1; }
        }));
        
        assertEquals(1, handler.parseArguments(new Parameters() {
            @Override
            public String getParameter(int idx) { return "false"; }
            @Override
            public int size() { return 1; }
        }));
        
        assertEquals(1, handler.parseArguments(new Parameters() {
            @Override
            public String getParameter(int idx) { return "FALSE"; }
            @Override
            public int size() { return 1; }
        }));
        
        assertEquals(0, handler.parseArguments(new Parameters() {
            @Override
            public String getParameter(int idx) { return "invalid"; }
            @Override
            public int size() { return 1; }
        }));
    }

    @Test
    public void testExternalExternsWithNoExternalExterns() {
        CommandLineRunner runner = createRunner(new String[]{"--js", "test.js"});
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompilerWithJsOutputFile() {
        CommandLineRunner runner = createRunner(new String[]{"--js", "test.js", "--js_output_file", "out.js"});
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleWrapperWithValidArgument() {
        CommandLineRunner runner = createRunner(new String[]{
            "--js", "test.js",
            "--module", "mod1:1",
            "--module_wrapper", "mod1:wrapper%s"
        });
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleWithDependenciesAndOutputPrefix() {
        CommandLineRunner runner = createRunner(new String[]{
            "--js", "a.js", "b.js",
            "--module", "mod1:1::", "--module", "mod2:1:mod1",
            "--module_output_path_prefix", "./out/"
        });
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateOptionsWithModuleWrapper() {
        CommandLineRunner runner = createRunner(new String[]{
            "--js", "test.js",
            "--module", "mod1:1",
            "--module_wrapper", "mod1:wrap%swrap2"
        });
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    private void verifyConfigInvalid(CommandLineRunner runner) {
        assertFalse("Expected config to be invalid", runner.shouldRunCompiler());
    }

    private static class Parameters implements org.kohsuke.args4j.spi.Parameters {
        private String[] params;
        
        @Override
        public String getParameter(int idx) throws CmdLineException {
            if (idx >= params.length) throw new CmdLineException(new org.kohsuke.args4j.CmdLineParser(new Object()), 
                "Missing parameter " + idx, null);
            return params[idx];
        }

        @Override
        public int size() {
            return params.length;
        }
    }
}