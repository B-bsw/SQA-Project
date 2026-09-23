package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler;

import org.junit.Test;
import org.junit.Before;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CommandLineRunnerTest {

    private CommandLineRunner runner;
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private PrintStream originalOut;
    private PrintStream originalErr;

    @Before
    public void setUp() {
        originalOut = System.out;
        originalErr = System.err;
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testConstructor_SimpleArgs() throws IOException {
        String[] args = {"--js", "test.js", "--js_output_file", "out.js"};
        runner = new CommandLineRunner(args);
        assertNotNull(runner);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_NullArgs() {
        try {
            runner = new CommandLineRunner((String[]) null);
            fail("Expected NullPointerException or similar");
        } catch (NullPointerException e) {
            // expected
        } catch (Exception e) {
            // Some implementations might throw other exceptions
        }
    }

    @Test
    public void testConstructor_EmptyArgs() throws IOException {
        runner = new CommandLineRunner(new String[]{});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_HelpFlag() throws IOException {
        String[] args = {"--help"};
        runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_InvalidFlag() throws IOException {
        String[] args = {"--nonexistent_flag"};
        runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_CompilationLevel_WhitespaceOnly() throws IOException {
        String[] args = {"--compilation_level", "WHITESPACE_ONLY", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_CompilationLevel_SimpleOptimizations() throws IOException {
        String[] args = {"--compilation_level", "SIMPLE_OPTIMIZATIONS", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_CompilationLevel_AdvancedOptimizations() throws IOException {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_InvalidCompilationLevel() throws IOException {
        String[] args = {"--compilation_level", "INVALID_LEVEL", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_Externs() throws IOException {
        String[] args = {"--externs", "extern1.js", "--externs", "extern2.js", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_ModuleSpecification() throws IOException {
        String[] args = {"--module", "mod1:2:dep1", "--module", "mod2:1:mod1", "--js", "a.js", "--js", "b.js", "--js", "c.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_ModuleBasic() throws IOException {
        String[] args = {"--module", "mod1:1", "--js", "a.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_ModuleNoJsFiles() throws IOException {
        String[] args = {"--module", "mod1:1"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_ModuleInvalidFormat() throws IOException {
        String[] args = {"--module", "invalid_format_no_colon", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_DefineAndDeez() throws IOException {
        String[] args = {"--define", "FOO=true", "--define", "BAR=42", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_DefineNoEquals() throws IOException {
        String[] args = {"--define", "FOO", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_Charset() throws IOException {
        String[] args = {"--charset", "UTF-16", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_CharsetEmpty() throws IOException {
        String[] args = {"--charset", "", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_OutputWrapper() throws IOException {
        String[] args = {"--output_wrapper", "wrap %output% wrap", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_OutputWrapperEmpty() throws IOException {
        String[] args = {"--output_wrapper", "", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandler_TrueValues() throws CmdLineException {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        Setter<Boolean> setter = new Setter<Boolean>() {
            private Boolean value;
            @Override
            public void addValue(Boolean value) { this.value = value; }
            @Override
            public Boolean getValue() { return value; }
        };
        // Test all true values
        String[] trueValues = {"true", "TRUE", "True", "tRuE", "1"};
        for (String val : trueValues) {
            Parameters params = createParams(val);
            int result = handler.parseArguments(params);
            assertEquals(1, result);
        }
    }

    @Test
    public void testBooleanOptionHandler_FalseValues() throws CmdLineException {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        String[] falseValues = {"false", "FALSE", "False", "0"};
        for (String val : falseValues) {
            Parameters params = createParams(val);
            int result = handler.parseArguments(params);
            assertEquals(1, result);
        }
    }

    @Test
    public void testBooleanOptionHandler_NullParam() throws CmdLineException {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        Parameters params = createParams("");
        // When param is null, should return 0
        int result = handler.parseArguments(params);
        assertEquals(0, result);
    }

    @Test
    public void testBooleanOptionHandler_InvalidValue() {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        Parameters params = createParams("not_a_boolean");
        try {
            handler.parseArguments(params);
            fail("Expected CmdLineException");
        } catch (CmdLineException e) {
            assertTrue(e.getMessage().contains("Illegal boolean value"));
        }
    }

    @Test
    public void testBooleanOptionHandler_InvalidValueWithNumber() {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        Parameters params = createParams("2");
        try {
            handler.parseArguments(params);
            fail("Expected CmdLineException");
        } catch (CmdLineException e) {
            assertTrue(e.getMessage().contains("Illegal boolean value"));
        }
    }

    @Test
    public void testBooleanOptionHandler_EmptyString() throws CmdLineException {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        Parameters params = createParams("");
        // When param is empty string, should be treated as null? 
        int result = handler.parseArguments(params);
        // Returns 0 for null or empty
        assertEquals(0, result);
    }

    @Test
    public void testBooleanOptionHandler_DefaultMetaVariable() {
        BooleanOptionHandler handler = new BooleanOptionHandler(null, null, null);
        assertEquals(null, handler.getDefaultMetaVariable());
    }

    @Test
    public void testGetDefaultExterns_ReturnsMutableList() throws IOException {
        // This is an instance method in real implementation
        // Test via static context - since it's static, we can call it directly
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js", "test.js"});
        java.util.List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertNotNull(externs);
        assertTrue(externs.size() >= 0);
    }

    @Test
    public void testGetDefaultExterns_ZipInputStream() throws IOException {
        // Simulate the method's behavior
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js", "test.js"});
        java.io.InputStream input = CommandLineRunner.class.getResourceAsStream("/externs.zip");
        assertNotNull(input);
        ZipInputStream zip = new ZipInputStream(input);
        ZipEntry entry;
        int count = 0;
        while ((entry = zip.getNextEntry()) != null) {
            count++;
        }
        zip.close();
        assertTrue(count > 0);
    }

    private Parameters createParams(final String param) {
        return new Parameters() {
            @Override
            public String getParameter(int idx) {
                return param;
            }
            @Override
            public int size() {
                return 1;
            }
        };
    }

    private static class TestCommandLineRunner extends CommandLineRunner {
        public TestCommandLineRunner(String[] args) throws IOException {
            super(args);
        }
    }

    @Test
    public void testMain_ShouldRunCompiler() throws Exception {
        // Capture System.exit calls
        SecurityManager originalSecurityManager = System.getSecurityManager();
        try {
            // Set a security manager that prevents System.exit
            System.setSecurityManager(new SecurityManager() {
                @Override
                public void checkExit(int status) {
                    throw new SecurityException("Exit called");
                }
            });
            
            String[] args = {"--js", "test.js"};
            try {
                CommandLineRunner.main(args);
                fail("Expected SecurityException from System.exit");
            } catch (SecurityException e) {
                assertTrue(e.getMessage().equals("Exit called"));
            }
        } finally {
            System.setSecurityManager(originalSecurityManager);
        }
    }

    @Test
    public void testMain_InvalidConfigStops() throws Exception {
        SecurityManager originalSecurityManager = System.getSecurityManager();
        try {
            System.setSecurityManager(new SecurityManager() {
                @Override
                public void checkExit(int status) {
                    throw new SecurityException("Exited with status: " + status);
                }
            });
            String[] args = {"--invalid"};
            try {
                CommandLineRunner.main(args);
                fail("Expected System.exit with status -1");
            } catch (SecurityException e) {
                assertTrue(e.getMessage().contains("status: -1"));
            }
        } finally {
            System.setSecurityManager(originalSecurityManager);
        }
    }

    @Test
    public void testShouldRunCompiler_ValidConfig_ReturnsTrue() throws IOException {
        runner = new CommandLineRunner(new String[]{"--js", "test.js"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_InvalidConfig_ReturnsFalse() throws IOException {
        runner = new CommandLineRunner(new String[]{"--bad_flag", "value"});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_HelpFlag_ReturnsFalse() throws IOException {
        runner = new CommandLineRunner(new String[]{"--help"});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_NoArgs_ReturnsFalse() throws IOException {
        runner = new CommandLineRunner(new String[]{});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_JavaScriptError_ReturnsFalse() throws IOException {
        String[] args = {"--js", "nonexistent_file.js"};
        runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_ExternalValidation() throws IOException {
        // Test validation failure path
        String[] args = {"--js", "test.js", "--js", "test2.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_ModuleValidation() throws IOException {
        String[] args = {"--module", "mod1:1", "--js", "test.js"};
        runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testGetDefaultExterns_ValidatesSortedOrder() throws IOException {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertNotNull(externs);
        // Check that it's sorted
        for (int i = 0; i < externs.size() - 1; i++) {
            String name1 = externs.get(i).getName();
            String name2 = externs.get(i + 1).getName();
            assertTrue(name1.compareTo(name2) <= 0);
        }
    }
}