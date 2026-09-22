package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import com.google.javascript.jscomp.CommandLineRunner.WarningGuardSpec;

public class CommandLineRunnerTest {

    private CommandLineRunner runner;

    @Before
    public void setUp() {
        runner = new CommandLineRunner(new String[]{"--js", "test.js"});
    }

    @Test
    public void testWarningGuardSpecAddGuard() {
        WarningGuardSpec spec = new WarningGuardSpec();
        spec.addGuard("deprecated", CheckLevel.ERROR);
        assertEquals(1, spec.guardLevels.size());
        assertEquals("deprecated", spec.guardLevels.get(0).name);
        assertEquals(CheckLevel.ERROR, spec.guardLevels.get(0).level);
    }

    @Test
    public void testWarningGuardSpecAddGuardFromComment() {
        WarningGuardSpec spec = new WarningGuardSpec();
        spec.addGuardFromComment("  , warning  , SOME_GROUP");
        assertEquals(2, spec.guardLevels.size());
        assertEquals("warning", spec.guardLevels.get(0).name);
        assertEquals("SOME_GROUP", spec.guardLevels.get(1).name);
    }

    @Test
    public void testWarningGuardSpecAddGuardFromCommentEmptyText() {
        WarningGuardSpec spec = new WarningGuardSpec();
        spec.addGuardFromComment("");
        assertEquals(0, spec.guardLevels.size());
    }

    @Test
    public void testWarningGuardSpecAddGuardFromCommentNull() {
        WarningGuardSpec spec = new WarningGuardSpec();
        spec.addGuardFromComment(null);
        assertEquals(0, spec.guardLevels.size());
    }

    @Test
    public void testGetWarningGuardSpec_WithValidGroups() {
        WarningGuardSpec spec = CommandLineRunner.getWarningGuardSpec();
        assertNotNull(spec);
        assertTrue(spec.toString().contains("deprecated"));
    }

    @Test
    public void testCommandLineRunnerWithHelpFlag() {
        CommandLineRunner runnerWithHelp = new CommandLineRunner(new String[]{"--help"});
        // should not throw exception and should return false for shouldRunCompiler
        assertFalse(runnerWithHelp.shouldRunCompiler());
    }

    @Test
    public void testCommandLineRunnerWithJsFile() {
        CommandLineRunner runnerWithJs = new CommandLineRunner(new String[]{"--js", "test.js"});
        assertTrue(runnerWithJs.shouldRunCompiler());
    }

    @Test
    public void testCommandLineRunnerWithoutJs() {
        CommandLineRunner runnerWithoutJs = new CommandLineRunner(new String[]{"--externs", "ext.js"});
        // No js file, should not run compiler
        assertFalse(runnerWithoutJs.shouldRunCompiler());
    }

    @Test
    public void testConfigWithJsAndNoOptions() {
        CommandLineRunner runnerOpt = new CommandLineRunner(new String[]{"--js", "file1.js", "--js", "file2.js"});
        assertTrue(runnerOpt.shouldRunCompiler());
    }

    @Test
    public void testConfigWithInvalidFlags() {
        String[] args = new String[]{"--js", "file1.js", "--invalidFlag", "value"};
        CommandLineRunner runnerInvalid = new CommandLineRunner(args);
        // Invalid flags should set isConfigValid to false
        assertFalse(runnerInvalid.shouldRunCompiler());
    }

    @Test
    public void testConfigWithProcessCommonJS() {
        CommandLineRunner runnerCJS = new CommandLineRunner(new String[]{"--js", "file.js", "--process_common_js_modules"});
        assertFalse(runnerCJS.shouldRunCompiler());
    }

    @Test
    public void testConfigWithCommonJSEntryPoint() {
        String[] args = new String[]{"--js", "file.js", "--process_common_js_modules", "--common_js_entry_module", "main.js"};
        CommandLineRunner runnerCJSEntry = new CommandLineRunner(args);
        assertFalse(runnerCJSEntry.shouldRunCompiler());
    }

    @Test
    public void testConfigWithNoJSButThirdParty() {
        CommandLineRunner runnerTP = new CommandLineRunner(new String[]{"--third_party"});
        assertFalse(runnerTP.shouldRunCompiler());
    }

    @Test
    public void testConfigWithSingleQuotes() {
        String[] args = new String[]{"--js", "file.js", "--third_party"};
        CommandLineRunner runnerSQ = new CommandLineRunner(args);
        assertFalse(runnerSQ.shouldRunCompiler());
    }

    @Test
    public void testConfigWithVersion() {
        CommandLineRunner runnerV = new CommandLineRunner(new String[]{"--version"});
        assertFalse(runnerV.shouldRunCompiler());
    }

    @Test
    public void testConfigWithExternsOnly() {
        CommandLineRunner runnerE = new CommandLineRunner(new String[]{"--externs", "ext.js"});
        assertFalse(runnerE.shouldRunCompiler());
    }

    @Test
    public void testConfigWithJSError() {
        String[] args = new String[]{"--js", "file.js", "--jscomp_error", "deprecated"};
        CommandLineRunner runnerErr = new CommandLineRunner(args);
        assertFalse(runnerErr.shouldRunCompiler());
    }

    @Test
    public void testConfigWithWarning() {
        String[] args = new String[]{"--js", "file.js", "--jscomp_warning", "deprecated"};
        CommandLineRunner runnerWarn = new CommandLineRunner(args);
        assertFalse(runnerWarn.shouldRunCompiler());
    }

    @Test
    public void testConfigWithOff() {
        String[] args = new String[]{"--js", "file.js", "--jscomp_off", "deprecated"};
        CommandLineRunner runnerOff = new CommandLineRunner(args);
        assertFalse(runnerOff.shouldRunCompiler());
    }

    @Test
    public void testConfigWithVarMapInput() {
        String[] args = new String[]{"--js", "file.js", "--variable_map_input_file", "map.txt"};
        CommandLineRunner runnerMap = new CommandLineRunner(args);
        assertFalse(runnerMap.shouldRunCompiler());
    }
}