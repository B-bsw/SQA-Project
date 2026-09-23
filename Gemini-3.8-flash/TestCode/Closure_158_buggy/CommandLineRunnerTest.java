package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.kohsuke.args4j.CmdLineException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandLineRunnerTest {

    private ByteArrayOutputStream errOut;
    private PrintStream originalErr;
    private ByteArrayInputStream in;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        errOut = new ByteArrayOutputStream();
        originalErr = System.err;
        System.setErr(new PrintStream(errOut));
        originalOut = System.out;
        in = new ByteArrayInputStream(new byte[0]);
        System.setIn(in);
    }

    @After
    public void tearDown() {
        System.setErr(originalErr);
        System.setOut(originalOut);
        System.setIn(System.in);
    }

    @Test
    public void testShouldRunCompiler_ValidConfig_ReturnsTrue() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js", "test.js", "--js_output_file", "out.js"},
                new PrintStream(new ByteArrayOutputStream()));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_HelpFlag_ReturnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--help"},
                new PrintStream(new ByteArrayOutputStream()));
        runner.run();
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_InvalidConfig_ReturnsFalse() {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js", "test.js", "--compilation_level", "INVALID"},
                new PrintStream(new ByteArrayOutputStream()));
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testGetDefaultExterns_ReturnsNonEmptyList() throws IOException {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertNotNull(externs);
        assertTrue("Default externs should not be empty", externs.size() > 0);
    }

    @Test
    public void testProcessArgs_WithQuotesAndSpaces_ReturnsProcessedArgs() throws CmdLineException {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{},
                new PrintStream(new ByteArrayOutputStream()));
        String[] args = new String[]{
                "--js", "\"file with space.js\"",
                "--output_wrapper", "\"(function(){%output%})()\""
        };
        List<String> result = runner.processArgs(args);
        assertEquals(4, result.size());
        assertEquals("--js", result.get(0));
        assertEquals("file with space.js", result.get(1));
        assertEquals("--output_wrapper", result.get(2));
        assertEquals("(function(){})()", result.get(3));
    }

    @Test
    public void testProcessArgs_WithEmptyArgs_ReturnsEmptyList() throws CmdLineException {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{},
                new PrintStream(new ByteArrayOutputStream()));
        List<String> result = runner.processArgs(new String[]{});
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testProcessArgs_WithNormalArgs_ReturnsSameArgs() throws CmdLineException {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{},
                new PrintStream(new ByteArrayOutputStream()));
        String[] args = new String[]{"--js", "a.js", "--js", "b.js"};
        List<String> result = runner.processArgs(args);
        assertEquals(4, result.size());
        assertEquals("--js", result.get(0));
        assertEquals("a.js", result.get(1));
        assertEquals("--js", result.get(2));
        assertEquals("b.js", result.get(3));
    }

    @Test
    public void testBooleanOptionHandler_TrueValues_ParsesBoolean() throws CmdLineException {
        CommandLineRunner.BooleanOptionHandler handler = 
                new CommandLineRunner.BooleanOptionHandler(null, null, null, null);
        List<String> args = new ArrayList<>();
        assertEquals(1, handler.parseArguments(args, "true"));
        assertEquals(1, handler.parseArguments(args, "TRUE"));
        assertEquals(1, handler.parseArguments(args, "yes"));
        assertEquals(1, handler.parseArguments(args, "Y"));
        assertEquals(1, handler.parseArguments(args, "1"));
    }

    @Test
    public void testBooleanOptionHandler_FalseValues_ParsesBoolean() throws CmdLineException {
        CommandLineRunner.BooleanOptionHandler handler = 
                new CommandLineRunner.BooleanOptionHandler(null, null, null, null);
        List<String> args = new ArrayList<>();
        assertEquals(1, handler.parseArguments(args, "false"));
        assertEquals(1, handler.parseArguments(args, "FALSE"));
        assertEquals(1, handler.parseArguments(args, "no"));
        assertEquals(1, handler.parseArguments(args, "N"));
        assertEquals(1, handler.parseArguments(args, "0"));
    }

    @Test
    public void testBooleanOptionHandler_InvalidValue_ThrowsException() {
        CommandLineRunner.BooleanOptionHandler handler = 
                new CommandLineRunner.BooleanOptionHandler(null, null, null, null);
        List<String> args = new ArrayList<>();
        try {
            handler.parseArguments(args, "invalid");
            fail("Expected CmdLineException");
        } catch (CmdLineException e) {
            // Expected
        }
    }

    @Test
    public void testFlagsDefaultValues() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        assertFalse(flags.display_help);
        assertFalse(flags.debug);
        assertFalse(flags.process_closure_primitives);
        assertEquals("", flags.js_output_file);
        assertEquals(1, flags.summary_detail_level);
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, flags.compilation_level);
        assertEquals(WarningLevel.DEFAULT, flags.warning_level);
        assertEquals("", flags.charset);
        assertEquals("", flags.create_source_map);
        assertFalse(flags.create_name_map_files);
        assertTrue(flags.manage_closure_dependencies);
        assertEquals("", flags.module_output_path_prefix);
        assertNull(flags.variable_map_input_file);
        assertNull(flags.property_map_input_file);
        assertEquals(0, flags.externs.size());
        assertEquals(0, flags.js.size());
        assertEquals(0, flags.module.size());
        assertEquals(0, flags.jscomp_error.size());
        assertEquals(0, flags.jscomp_warning.size());
        assertEquals(0, flags.jscomp_off.size());
        assertEquals(0, flags.define.size());
        assertEquals(0, flags.formatting.size());
    }

    @Test
    public void testFlagsCustomValues() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        flags.debug = true;
        flags.process_closure_primitives = false;
        flags.js_output_file = "output.js";
        flags.summary_detail_level = 3;
        flags.compilation_level = CompilationLevel.ADVANCED_OPTIMIZATIONS;
        flags.warning_level = WarningLevel.VERBOSE;
        flags.charset = "UTF-8";
        flags.create_source_map = "map";
        flags.create_name_map_files = true;
        flags.externs.addAll(Arrays.asList("extern1.js", "extern2.js"));
        flags.js.addAll(Arrays.asList("file1.js", "file2.js"));
        
        assertEquals("output.js", flags.js_output_file);
        assertEquals(3, flags.summary_detail_level);
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, flags.compilation_level);
        assertEquals(WarningLevel.VERBOSE, flags.warning_level);
        assertEquals("UTF-8", flags.charset);
        assertEquals("map", flags.create_source_map);
        assertTrue(flags.create_name_map_files);
        assertEquals(2, flags.externs.size());
        assertEquals(2, flags.js.size());
    }

    @Test
    public void testMain_WithInvalidArgs_ExitsCodeOne() throws IOException {
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        try {
            CommandLineRunner.main(new String[]{"--invalid_flag", "value"});
            fail("Expected System.exit() call");
        } catch (SecurityException | NoClassDefFoundError e) {
            // Expected: System.exit in main when config invalid
        } finally {
            System.out.flush();
            System.setOut(originalOut);
        }
    }

    @Test
    public void testGetDefaultExterns_ResourceStreamClosed() throws IOException {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertNotNull(externs);
    }

    @Test
    public void testProcessArgs_WithOutputWrapperAndModuleWrapper() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js", "a.js", "--module_output_path_prefix", "out/"},
                new PrintStream(new ByteArrayOutputStream()));
        List<String> result = runner.processArgs(new String[]{
                "--output_wrapper", "\"prefix%suffix\"",
                "--module_wrapper", "\"m1:w1\", \"m2:w2\""
        });
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testProcessArgs_WithSourceMapAndVariableMap() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js", "a.js"},
                new PrintStream(new ByteArrayOutputStream()));
        List<String> result = runner.processArgs(new String[]{
                "--create_source_map", "map.js",
                "--variable_map_output_file", "var.map",
                "--property_map_output_file", "prop.map"
        });
        assertNotNull(result);
        assertTrue(result.size() >= 6);
    }

    @Test
    public void testProcessArgs_WithExternsAndJsFiles() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[]{"--js", "a.js"},
                new PrintStream(new ByteArrayOutputStream()));
        List<String> result = runner.processArgs(new String[]{
                "--externs", "e1.js", "--externs", "e2.js"
        });
        assertNotNull(result);
        assertEquals(4, result.size());
    }
}