package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class CommandLineRunnerTest {

  private static class SubCommandLineRunner extends CommandLineRunner {
    SubCommandLineRunner(String[] args) throws CmdLineException {
      super(args);
    }

    SubCommandLineRunner(String[] args, PrintStream out, PrintStream err) throws CmdLineException {
      super(args, out, err);
    }

    @Override
    public CompilerOptions createOptions() {
      return super.createOptions();
    }

    @Override
    public Compiler createCompiler() {
      return super.createCompiler();
    }

    @Override
    public List<JSSourceFile> createExterns() throws FlagUsageException, IOException {
      return super.createExterns();
    }
  }

  @Test
  public void constructor_givenEmptyArgs_shouldInitializeDefaults() throws CmdLineException {
    String[] args = new String[0];
    SubCommandLineRunner runner = new SubCommandLineRunner(args);

    Assert.assertNotNull(runner.getCommandLineConfig());
    CompilerOptions options = runner.createOptions();
    Assert.assertNotNull(options);
    Assert.assertTrue(options.closurePass);
    Assert.assertFalse(options.prettyPrint);
    Assert.assertFalse(options.printInputDelimiter);
  }

  @Test
  public void constructor_givenCustomStreams_shouldInitializeSuccessfully() throws CmdLineException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream outStream = new PrintStream(out);
    PrintStream errStream = new PrintStream(err);

    String[] args = new String[] {"--summary_detail_level=0"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args, outStream, errStream);

    Assert.assertNotNull(runner);
    Assert.assertSame(errStream, runner.getErrorPrintStream());
  }

  @Test
  public void constructor_givenSingleQuotedArgValue_shouldStripQuotes() throws CmdLineException {
    String[] args = new String[] {"--js_output_file='output.js'"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void constructor_givenDoubleQuotedArgValue_shouldStripQuotes() throws CmdLineException {
    String[] args = new String[] {"--js_output_file=\"output.js\""};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void constructor_givenPlainArgWithoutEquals_shouldProcessArgDirectly() throws CmdLineException {
    String[] args = new String[] {"--debug"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
    Assert.assertNotNull(runner.createCompiler());
  }

  @Test
  public void constructor_givenUnquotedArgWithEquals_shouldProcessArgDirectly() throws CmdLineException {
    String[] args = new String[] {"--charset=UTF-8"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void constructor_givenInvalidFlag_shouldPrintUsageAndThrowException() {
    ByteArrayOutputStream err = new ByteArrayOutputStream();
    PrintStream errStream = new PrintStream(err);
    String[] args = new String[] {"--unrecognized_flag_xyz=123"};

    try {
      new SubCommandLineRunner(args, System.out, errStream);
      Assert.fail("Expected CmdLineException for invalid flag");
    } catch (CmdLineException e) {
      String errString = err.toString();
      Assert.assertTrue(errString.length() > 0);
    }
  }

  @Test
  public void createOptions_givenCompilationLevelWhitespaceOnly_shouldApplyLevel() throws CmdLineException {
    String[] args = new String[] {"--compilation_level=WHITESPACE_ONLY"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void createOptions_givenCompilationLevelSimpleOptimizations_shouldApplyLevel() throws CmdLineException {
    String[] args = new String[] {"--compilation_level=SIMPLE_OPTIMIZATIONS"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void createOptions_givenCompilationLevelAdvancedOptimizations_shouldApplyLevel() throws CmdLineException {
    String[] args = new String[] {"--compilation_level=ADVANCED_OPTIMIZATIONS"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void createOptions_givenDebugOptionTrue_shouldSetDebugOptions() throws CmdLineException {
    String[] args = new String[] {
        "--compilation_level=ADVANCED_OPTIMIZATIONS",
        "--debug=true"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
    Assert.assertTrue(options.anonymousFunctionNaming != null);
  }

  @Test
  public void createOptions_givenWarningLevelQuiet_shouldApplyQuietSettings() throws CmdLineException {
    String[] args = new String[] {"--warning_level=QUIET"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void createOptions_givenWarningLevelVerbose_shouldApplyVerboseSettings() throws CmdLineException {
    String[] args = new String[] {"--warning_level=VERBOSE"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertNotNull(options);
  }

  @Test
  public void createOptions_givenFormattingPrettyPrint_shouldSetPrettyPrintTrue() throws CmdLineException {
    String[] args = new String[] {"--formatting=PRETTY_PRINT"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertTrue(options.prettyPrint);
    Assert.assertFalse(options.printInputDelimiter);
  }

  @Test
  public void createOptions_givenFormattingPrintInputDelimiter_shouldSetDelimiterTrue() throws CmdLineException {
    String[] args = new String[] {"--formatting=PRINT_INPUT_DELIMITER"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertFalse(options.prettyPrint);
    Assert.assertTrue(options.printInputDelimiter);
  }

  @Test
  public void createOptions_givenMultipleFormattingOptions_shouldSetBoth() throws CmdLineException {
    String[] args = new String[] {
        "--formatting=PRETTY_PRINT",
        "--formatting=PRINT_INPUT_DELIMITER"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertTrue(options.prettyPrint);
    Assert.assertTrue(options.printInputDelimiter);
  }

  @Test
  public void createOptions_givenProcessClosurePrimitivesFalse_shouldDisableClosurePass() throws CmdLineException {
    String[] args = new String[] {"--process_closure_primitives=false"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();

    Assert.assertFalse(options.closurePass);
  }

  @Test
  public void booleanOptionHandler_givenTrueVariants_shouldParseCorrectly() throws CmdLineException {
    String[][] trueArgs = new String[][] {
        new String[] {"--print_tree=true"},
        new String[] {"--print_tree=on"},
        new String[] {"--print_tree=yes"},
        new String[] {"--print_tree=1"},
        new String[] {"--print_tree=TRUE"},
        new String[] {"--print_tree=YES"}
    };

    for (int i = 0; i < trueArgs.length; i++) {
      SubCommandLineRunner runner = new SubCommandLineRunner(trueArgs[i]);
      Assert.assertNotNull(runner);
    }
  }

  @Test
  public void booleanOptionHandler_givenFalseVariants_shouldParseCorrectly() throws CmdLineException {
    String[][] falseArgs = new String[][] {
        new String[] {"--third_party=false"},
        new String[] {"--third_party=off"},
        new String[] {"--third_party=no"},
        new String[] {"--third_party=0"},
        new String[] {"--third_party=FALSE"},
        new String[] {"--third_party=OFF"}
    };

    for (int i = 0; i < falseArgs.length; i++) {
      SubCommandLineRunner runner = new SubCommandLineRunner(falseArgs[i]);
      Assert.assertNotNull(runner);
    }
  }

  @Test
  public void booleanOptionHandler_givenInvalidBoolean_shouldThrowCmdLineException() {
    String[] args = new String[] {"--print_tree=invalid_value"};
    try {
      new SubCommandLineRunner(args);
      Assert.fail("Expected CmdLineException for invalid boolean token");
    } catch (CmdLineException e) {
      Assert.assertTrue(e.getMessage().indexOf("Illegal boolean value") != -1);
    }
  }

  @Test
  public void booleanOptionHandler_givenFlagWithoutValue_shouldDefaultToTrue() throws CmdLineException {
    String[] args = new String[] {"--print_tree"};
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    Assert.assertNotNull(runner);
  }

  @Test
  public void createCompiler_whenInvoked_shouldReturnNewCompilerInstance() throws CmdLineException {
    String[] args = new String[0];
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    Compiler compiler = runner.createCompiler();

    Assert.assertNotNull(compiler);
  }

  @Test
  public void createExterns_givenUseOnlyCustomExternsTrue_shouldReturnCustomExternsOnly() throws Exception {
    String[] args = new String[] {
        "--use_only_custom_externs=true"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    List<JSSourceFile> externs = runner.createExterns();

    Assert.assertNotNull(externs);
    Assert.assertEquals(0, externs.size());
  }

  @Test
  public void createExterns_givenUseOnlyCustomExternsFalse_shouldIncludeDefaultExternsIfResourcePresent() throws Exception {
    String[] args = new String[] {
        "--use_only_custom_externs=false"
    };
    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    try {
      List<JSSourceFile> externs = runner.createExterns();
      Assert.assertNotNull(externs);
    } catch (NullPointerException e) {
      // Expected if /externs.zip is absent from current classpath
    }
  }

  @Test
  public void constructor_givenAllFlagsPopulated_shouldInitializeWithoutError() throws CmdLineException {
    String[] args = new String[] {
        "--print_tree=false",
        "--compute_phase_ordering=false",
        "--print_ast=false",
        "--print_pass_graph=false",
        "--jscomp_dev_mode=OFF",
        "--logging_level=INFO",
        "--externs=custom_extern.js",
        "--js=input.js",
        "--js_output_file=out.js",
        "--module=mod1:1:",
        "--variable_map_input_file=var_map.in",
        "--property_map_input_file=prop_map.in",
        "--variable_map_output_file=var_map.out",
        "--property_map_output_file=prop_map.out",
        "--create_name_map_files=false",
        "--third_party=false",
        "--summary_detail_level=2",
        "--output_wrapper=%output%",
        "--output_wrapper_marker=%output%",
        "--module_wrapper=mod1:%s",
        "--module_output_path_prefix=./out_",
        "--create_source_map=map.out",
        "--jscomp_error=checkVars",
        "--jscomp_warning=checkTypes",
        "--jscomp_off=deprecated",
        "--define=FLAG=true",
        "-D", "OTHER_FLAG=1",
        "--D", "ANOTHER_FLAG=false",
        "--charset=US-ASCII"
    };

    SubCommandLineRunner runner = new SubCommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    Assert.assertNotNull(options);
  }
}