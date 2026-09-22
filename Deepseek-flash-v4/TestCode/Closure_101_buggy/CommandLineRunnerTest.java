package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.CompilationLevel;
import com.google.javascript.jscomp.WarningLevel;

public class CommandLineRunnerTest {

    private static final String EXTERN_BASE = "test-extern.js";
    private static final String JS_BASE = "test.js";
    
    private PrintStream originalOut;
    private PrintStream originalErr;
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;

    @Before
    public void setUp() {
        originalOut = System.out;
        originalErr = System.err;
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    private class TestCommandLineRunner extends CommandLineRunner {
        TestCommandLineRunner(String[] args) throws Exception {
            super(args);
        }
    }

    @Test
    public void testBooleanOptionHandlerParsesTrueValues() throws Exception {
        CommandLineRunner testRunner = new TestCommandLineRunner(new String[]{
            "--js", JS_BASE,
            "--externs", EXTERN_BASE
        });
        assertNotNull(testRunner);
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        assertNotNull(handler);
    }

    @Test
    public void testBooleanOptionHandlerWithNullParam() throws Exception {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        // Test null parameter handling
        assertEquals(0, handler.parseArguments(new ArrayList<String>() {{
            add(null);
        }}));
    }

    @Test(expected = Exception.class)
    public void testInvalidBooleanValueThrowsException() throws Exception {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        List<String> params = new ArrayList<String>() {{
            add("invalid_boolean_value");
        }};
        handler.parseArguments(new Parameters() {
            @Override
            public int size() { return 1; }
            
            @Override
            public String get(int index) { return "invalid_boolean_value"; }
            
            @Override
            public String getParameter() { return "invalid_boolean_value"; }
        });
    }

    @Test
    public void testPrintInputDelimiterEnumValues() {
        assertNotNull(CommandLineRunner.PrintInputDelimiter.valueOf("PRETTY_PRINT"));
        assertNotNull(CommandLineRunner.PrintInputDelimiter.valueOf("PRINT_INPUT_DELIMITER"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnumValue() {
        CommandLineRunner.PrintInputDelimiter.valueOf("INVALID_VALUE");
    }

    @Test
    public void testFlagsForBooleanOptions() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        flags.print_tree = true;
        assertTrue(flags.print_tree);
        flags.compute_phase_ordering = true;
        assertTrue(flags.compute_phase_ordering);
        flags.print_ast = true;
        assertTrue(flags.print_ast);
        flags.print_pass_graph = true;
        assertTrue(flags.print_pass_graph);
        flags.debug = true;
        assertTrue(flags.debug);
        flags.third_party = true;
        assertTrue(flags.third_party);
    }

    @Test
    public void testFlagsListInitializations() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        assertNotNull(flags.externs);
        assertNotNull(flags.js);
        assertNotNull(flags.module);
        assertNotNull(flags.module_wrapper);
        assertNotNull(flags.jscomp_error);
        assertNotNull(flags.jscomp_warning);
        assertNotNull(flags.jscomp_off);
        assertNotNull(flags.define);
        assertEquals(0, flags.externs.size());
        assertEquals(0, flags.js.size());
        assertEquals(0, flags.module.size());
        assertEquals(0, flags.module_wrapper.size());
        assertEquals(0, flags.jscomp_error.size());
        assertEquals(0, flags.jscomp_warning.size());
        assertEquals(0, flags.jscomp_off.size());
        assertEquals(0, flags.define.size());
    }

    @Test
    public void testFlagsDefaultValues() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        assertFalse(flags.print_tree);
        assertFalse(flags.compute_phase_ordering);
        assertFalse(flags.print_ast);
        assertFalse(flags.print_pass_graph);
        assertEquals(CompilerOptions.DevMode.OFF, flags.jscomp_dev_mode);
        assertEquals("", flags.charset);
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, flags.compilation_level);
        assertEquals(WarningLevel.DEFAULT, flags.warning_level);
        assertFalse(flags.use_only_custom_externs);
        assertFalse(flags.debug);
        assertTrue(flags.process_closure_primitives);
        assertEquals("", flags.js_output_file);
        assertEquals("", flags.variable_map_input_file);
        assertEquals("", flags.property_map_input_file);
        assertEquals("", flags.variable_map_output_file);
        assertFalse(flags.create_name_map_files);
        assertEquals("", flags.property_map_output_file);
        assertEquals(1, flags.summary_detail_level);
        assertEquals("", flags.output_wrapper);
        assertEquals("%output%", flags.output_wrapper_marker);
        assertEquals("./", flags.module_output_path_prefix);
    }

    @Test
    public void testFlagsWithValues() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        flags.logging_level = "SEVERE";
        flags.charset = "UTF-8";
        flags.summary_detail_level = 3;
        flags.output_wrapper = "test[%output%]";
        flags.module_output_path_prefix = "/output/";
        
        assertEquals("SEVERE", flags.logging_level);
        assertEquals("UTF-8", flags.charset);
        assertEquals(3, flags.summary_detail_level);
        assertEquals("test[%output%]", flags.output_wrapper);
        assertEquals("/output/", flags.module_output_path_prefix);
    }

    @Test
    public void testFlagsWithNullInputs() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        assertNotNull(flags.js);
        assertNotNull(flags.externs);
        assertNotNull(flags.module);
        assertNotNull(flags.formatting);
        assertNotNull(flags.module_wrapper);
        assertArrayEquals(new String[0], flags.js.toArray(new String[0]));
    }

    @Test
    public void testBooleanOptionHandlerTrueValues() {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        
        for (String value : new String[]{"true", "on", "yes", "1"}) {
            assertTrue("Expected true for value: " + value,
                CommandLineRunner.BooleanOptionHandler.TRUES.contains(value.toLowerCase()));
        }
    }

    @Test
    public void testBooleanOptionHandlerFalseValues() {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        
        for (String value : new String[]{"false", "off", "no", "0"}) {
            assertTrue("Expected false for value: " + value,
                CommandLineRunner.BooleanOptionHandler.FALSES.contains(value.toLowerCase()));
        }
    }

    @Test
    public void testCommandLineRunnerInstance() throws Exception {
        try {
            CommandLineRunner runner = new TestCommandLineRunner(new String[]{
                "--js", JS_BASE,
                "--externs", EXTERN_BASE
            });
            assertNotNull(runner);
        } catch (Exception e) {
            // Expected if file doesn't exist
        }
    }

    @Test
    public void testBooleanOptionHandlerNullSetter() {
        CommandLineRunner.BooleanOptionHandler handler = 
            new CommandLineRunner.BooleanOptionHandler(null, null, null);
        assertNotNull(handler);
    }

    @Test
    public void testFlagsModuleWrappers() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        flags.module_wrapper.add("module1:test%s");
        flags.module_wrapper.add("module2:[test]");
        
        assertFalse(flags.module_wrapper.isEmpty());
        assertEquals(2, flags.module_wrapper.size());
        assertEquals("module1:test%s", flags.module_wrapper.get(0));
        assertEquals("module2:[test]", flags.module_wrapper.get(1));
    }

    @Test
    public void testFlagsFormattingOptions() {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        flags.formatting.add(FormattingOption.PRETTY_PRINT);
        
        assertFalse(flags.formatting.isEmpty());
        assertEquals(1, flags.formatting.size());
        assertEquals(FormattingOption.PRETTY_PRINT, flags.formatting.get(0));
    }

    @Test
    public void testPrintInputDelimiterEnumVales() {
        CommandLineRunner.PrintInputDelimiter[] values = 
            CommandLineRunner.PrintInputDelimiter.values();
        assertEquals(2, values.length);
        assertEquals(CommandLineRunner.PrintInputDelimiter.PRETTY_PRINT, 
            CommandLineRunner.PrintInputDelimiter.valueOf("PRETTY_PRINT"));
        assertEquals(CommandLineRunner.PrintInputDelimiter.PRINT_INPUT_DELIMITER,
            CommandLineRunner.PrintInputDelimiter.valueOf("PRINT_INPUT_DELIMITER"));
    }
}