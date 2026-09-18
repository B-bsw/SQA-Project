package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CommandLineRunnerTest {

  private ByteArrayOutputStream outStream;
  private ByteArrayOutputStream errStream;
  private PrintStream outPrintStream;
  private PrintStream errPrintStream;
  private List<File> tempFilesToDelete;

  private static class TestableCommandLineRunner extends CommandLineRunner {
    TestableCommandLineRunner(String[] args) {
      super(args);
    }

    TestableCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
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
    public List<SourceFile> createExterns() throws FlagUsageException, IOException {
      return super.createExterns();
    }
  }

  @Before
  public void setUp() {
    outStream = new ByteArrayOutputStream();
    errStream = new ByteArrayOutputStream();
    outPrintStream = new PrintStream(outStream);
    errPrintStream = new PrintStream(errStream);
    tempFilesToDelete = new ArrayList<File>();
  }

  @After
  public void tearDown() {
    for (int i = 0; i < tempFilesToDelete.size(); i++) {
      File file = tempFilesToDelete.get(i);
      if (file != null && file.exists()) {
        file.delete();
      }
    }
    tempFilesToDelete.clear();
  }

  private File createTempFile(String prefix, String suffix, String content) throws IOException {
    File tempFile = File.createTempFile(prefix, suffix);
    tempFilesToDelete.add(tempFile);
    FileWriter writer = new FileWriter(tempFile);
    try {
      writer.write(content);
    } finally {
      writer.close();
    }
    return tempFile;
  }

  @Test
  public void constructor_givenEmptyArgs_shouldBeValidAndReadyToRun() {
    // Arrange
    String[] args = new String[] {};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void constructor_givenStandardConstructor_shouldInitializeProperly() {
    // Arrange
    String[] args = new String[] {};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void constructor_givenUnknownFlag_shouldFailAndPrintUsage() {
    // Arrange
    String[] args = new String[] {"--unknown_flag_for_test"};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("is not a valid option"));
  }

  @Test
  public void initConfigFromFlags_givenHelpFlag_shouldSetInvalidAndPrintUsage() {
    // Arrange
    String[] args = new String[] {"--help"};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("--help"));
    Assert.assertTrue(errOutput.contains("Displays this message"));
  }

  @Test
  public void initConfigFromFlags_givenVersionFlag_shouldPrintVersionInfo() {
    // Arrange
    String[] args = new String[] {"--version"};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("Closure Compiler"));
    Assert.assertTrue(errOutput.contains("Version:"));
  }

  @Test
  public void initConfigFromFlags_givenProcessArgsWithQuotes_shouldUnquoteProperly() {
    // Arrange
    String[] args = new String[] {
        "--js_output_file='out_single.js'",
        "--variable_map_input_file=\"out_double.js\""
    };

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
    Assert.assertEquals("out_single.js", runner.getCommandLineConfig().jsOutputFile);
    Assert.assertEquals("out_double.js", runner.getCommandLineConfig().variableMapInputFile);
  }

  @Test
  public void initConfigFromFlags_givenProcessCommonJsModulesWithoutEntryModule_shouldSetInvalid() {
    // Arrange
    String[] args = new String[] {"--process_common_js_modules"};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("Please specify --common_js_entry_module."));
  }

  @Test
  public void initConfigFromFlags_givenProcessCommonJsModulesWithEntryModule_shouldConfigureProperly() {
    // Arrange
    String[] args = new String[] {
        "--process_common_js_modules",
        "--common_js_entry_module=main.js"
    };

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void initConfigFromFlags_givenFlagFileValid_shouldReadAndApplyFlags() throws IOException {
    // Arrange
    File tempFlagFile = createTempFile("flags", ".txt", "--debug --jscomp_off=checkTypes");
    String[] args = new String[] {"--flagfile=" + tempFlagFile.getAbsolutePath()};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void initConfigFromFlags_givenFlagFileWithNestedFlagFile_shouldSetInvalidAndPrintError() throws IOException {
    // Arrange
    File nestedFlagFile = createTempFile("nested_flags", ".txt", "--flagfile=other.txt");
    String[] args = new String[] {"--flagfile=" + nestedFlagFile.getAbsolutePath()};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("ERROR - Arguments in the file cannot contain --flagfile option."));
  }

  @Test
  public void initConfigFromFlags_givenNonExistentFlagFile_shouldCatchIOExceptionAndSetInvalid() {
    // Arrange
    String nonExistentPath = "non_existent_file_flag_12345.txt";
    String[] args = new String[] {"--flagfile=" + nonExistentPath};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertFalse(runner.shouldRunCompiler());
    String errOutput = errStream.toString();
    Assert.assertTrue(errOutput.contains("read error."));
  }

  @Test
  public void initConfigFromFlags_givenBooleanFlagVariations_shouldParseCorrectly() {
    // Arrange
    String[] argsTrue = new String[] {"--debug=true", "--debug=on", "--debug=yes", "--debug=1"};
    for (int i = 0; i < argsTrue.length; i++) {
      TestableCommandLineRunner runner = new TestableCommandLineRunner(
          new String[] {argsTrue[i]}, outPrintStream, errPrintStream);
      Assert.assertTrue("Failed on arg: " + argsTrue[i], runner.shouldRunCompiler());
    }

    String[] argsFalse = new String[] {"--debug=false", "--debug=off", "--debug=no", "--debug=0"};
    for (int i = 0; i < argsFalse.length; i++) {
      TestableCommandLineRunner runner = new TestableCommandLineRunner(
          new String[] {argsFalse[i]}, outPrintStream, errPrintStream);
      Assert.assertTrue("Failed on arg: " + argsFalse[i], runner.shouldRunCompiler());
    }

    String[] argsImplicit = new String[] {"--debug"};
    TestableCommandLineRunner runnerImplicit = new TestableCommandLineRunner(
        argsImplicit, outPrintStream, errPrintStream);
    Assert.assertTrue(runnerImplicit.shouldRunCompiler());
  }

  @Test
  public void initConfigFromFlags_givenBooleanFlagWithUnrecognizedParam_shouldDefaultToTrue() {
    // Arrange
    String[] args = new String[] {"--debug", "someOtherNonBooleanToken"};

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void initConfigFromFlags_givenWarningGuards_shouldAcceptErrorWarningAndOff() {
    // Arrange
    String[] args = new String[] {
        "--jscomp_error=checkVars",
        "--jscomp_warning=checkTypes",
        "--jscomp_off=deprecated"
    };

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void initConfigFromFlags_givenCodingConventions_shouldConfigureCorrectConvention() {
    // Case 1: thirdParty
    TestableCommandLineRunner runnerThirdParty = new TestableCommandLineRunner(
        new String[] {"--third_party"}, outPrintStream, errPrintStream);
    Assert.assertTrue(runnerThirdParty.shouldRunCompiler());

    // Case 2: jquery primitives
    TestableCommandLineRunner runnerJquery = new TestableCommandLineRunner(
        new String[] {"--process_jquery_primitives"}, outPrintStream, errPrintStream);
    Assert.assertTrue(runnerJquery.shouldRunCompiler());

    // Case 3: default closure
    TestableCommandLineRunner runnerDefault = new TestableCommandLineRunner(
        new String[] {}, outPrintStream, errPrintStream);
    Assert.assertTrue(runnerDefault.shouldRunCompiler());
  }

  @Test
  public void createOptions_givenDefaultFlags_shouldReturnConfiguredOptions() {
    // Arrange
    String[] args = new String[] {};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    CompilerOptions options = runner.createOptions();

    // Assert
    Assert.assertNotNull(options);
    Assert.assertTrue(options.closurePass);
    Assert.assertFalse(options.jqueryPass);
    Assert.assertFalse(options.angularPass);
  }

  @Test
  public void createOptions_givenDebugAndAdvancedOptimization_shouldConfigureCorrectly() {
    // Arrange
    String[] args = new String[] {
        "--compilation_level=ADVANCED_OPTIMIZATIONS",
        "--debug",
        "--use_types_for_optimization",
        "--generate_exports",
        "--angular_pass",
        "--process_jquery_primitives"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    CompilerOptions options = runner.createOptions();

    // Assert
    Assert.assertNotNull(options);
    Assert.assertTrue(options.jqueryPass);
    Assert.assertTrue(options.angularPass);
    Assert.assertNotNull(options.messageBundle);
  }

  @Test
  public void createOptions_givenFormattingOptions_shouldApplyAllFormatting() {
    // Arrange
    String[] args = new String[] {
        "--formatting=PRETTY_PRINT",
        "--formatting=PRINT_INPUT_DELIMITER",
        "--formatting=SINGLE_QUOTES"
    };
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    CompilerOptions options = runner.createOptions();

    // Assert
    Assert.assertNotNull(options);
    Assert.assertTrue(options.prettyPrint);
    Assert.assertTrue(options.printInputDelimiter);
    Assert.assertTrue(options.getPreferSingleQuotes());
  }

  @Test(expected = RuntimeException.class)
  public void createOptions_givenNonExistentTranslationsFile_shouldThrowRuntimeException() {
    // Arrange
    String[] args = new String[] {"--translations_file=non_existent_xtb_12345.xtb"};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    runner.createOptions();
  }

  @Test
  public void createOptions_givenWarningLevels_shouldConfigureOptions() {
    // Arrange & Act & Assert
    String[] levels = new String[] {"QUIET", "DEFAULT", "VERBOSE"};
    for (int i = 0; i < levels.length; i++) {
      TestableCommandLineRunner runner = new TestableCommandLineRunner(
          new String[] {"--warning_level=" + levels[i]}, outPrintStream, errPrintStream);
      CompilerOptions options = runner.createOptions();
      Assert.assertNotNull(options);
    }
  }

  @Test
  public void createCompiler_givenValidRunner_shouldInstantiateCompilerInstance() {
    // Arrange
    String[] args = new String[] {};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    Compiler compiler = runner.createCompiler();

    // Assert
    Assert.assertNotNull(compiler);
  }

  @Test
  public void createExterns_givenUseOnlyCustomExterns_shouldReturnEmptyOrCustomOnly() throws Exception {
    // Arrange
    String[] args = new String[] {"--use_only_custom_externs"};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Act
    List<SourceFile> externs = runner.createExterns();

    // Assert
    Assert.assertNotNull(externs);
    Assert.assertTrue(externs.isEmpty());
  }

  @Test
  public void createExterns_givenInTestMode_shouldReturnCustomExternsOnly() throws Exception {
    // Arrange
    String[] args = new String[] {};
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);
    runner.enableTestMode(
        new ArrayList<SourceFile>(),
        new ArrayList<SourceFile>(),
        new ArrayList<JSModule>(),
        false);

    // Act
    List<SourceFile> externs = runner.createExterns();

    // Assert
    Assert.assertNotNull(externs);
    Assert.assertTrue(externs.isEmpty());
  }

  @Test
  public void initConfigFromFlags_givenAllMiscellaneousFlags_shouldStoreInCommandLineConfig() {
    // Arrange
    String[] args = new String[] {
        "--print_tree",
        "--print_ast",
        "--print_pass_graph",
        "--jscomp_dev_mode=OFF",
        "--logging_level=INFO",
        "--externs=extern.js",
        "--js=test.js",
        "--js_output_file=out.js",
        "--variable_map_input_file=v_in.txt",
        "--property_map_input_file=p_in.txt",
        "--variable_map_output_file=v_out.txt",
        "--create_name_map_files",
        "--property_map_output_file=p_out.txt",
        "--summary_detail_level=2",
        "--output_wrapper=%output%",
        "--module_wrapper=mod:%s",
        "--module_output_path_prefix=./dist/",
        "--create_source_map=map.out",
        "--source_map_format=V3",
        "--define=FLAG=true",
        "--charset=UTF-8",
        "--manage_closure_dependencies",
        "--only_closure_dependencies",
        "--closure_entry_point=myApp",
        "--output_manifest=manifest.txt",
        "--output_module_dependencies=deps.json",
        "--accept_const_keyword",
        "--language_in=ECMASCRIPT5",
        "--warnings_whitelist_file=whitelist.txt",
        "--tracer_mode=TIMING_ONLY",
        "extra_file.js"
    };

    // Act
    TestableCommandLineRunner runner = new TestableCommandLineRunner(args, outPrintStream, errPrintStream);

    // Assert
    Assert.assertTrue(runner.shouldRunCompiler());
    CommandLineConfig config = runner.getCommandLineConfig();
    Assert.assertTrue(config.printTree);
    Assert.assertTrue(config.printAst);
    Assert.assertTrue(config.printPassGraph);
    Assert.assertEquals(CompilerOptions.DevMode.OFF, config.jscompDevMode);
    Assert.assertEquals("INFO", config.loggingLevel);
    Assert.assertEquals("out.js", config.jsOutputFile);
    Assert.assertTrue(config.createNameMapFiles);
    Assert.assertEquals(2, config.summaryDetailLevel);
    Assert.assertEquals("%output%", config.outputWrapper);
    Assert.assertEquals("./dist/", config.moduleOutputPathPrefix);
    Assert.assertEquals("map.out", config.createSourceMap);
    Assert.assertEquals(SourceMap.Format.V3, config.sourceMapFormat);
    Assert.assertEquals("UTF-8", config.charset);
    Assert.assertTrue(config.manageClosureDependencies);
    Assert.assertTrue(config.onlyClosureDependencies);
    Assert.assertTrue(config.acceptConstKeyword);
    Assert.assertEquals("ECMASCRIPT5", config.languageIn);
    Assert.assertEquals("whitelist.txt", config.warningsWhitelistFile);
    Assert.assertEquals(CompilerOptions.TracerMode.TIMING_ONLY, config.tracerMode);
    Assert.assertTrue(config.js.contains("test.js"));
    Assert.assertTrue(config.js.contains("extra_file.js"));
  }
}