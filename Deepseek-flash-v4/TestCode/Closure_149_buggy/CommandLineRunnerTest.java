package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@RunWith(JUnit4.class)
public class CommandLineRunnerTest {

  private static final String EXTERNS_ZIP_CONTENT = "var extern1;\nvar extern2;\n";
  
  private ByteArrayOutputStream errOut;
  private PrintStream errPrintStream;

  @Before
  public void setUp() throws Exception {
    errOut = new ByteArrayOutputStream();
    errPrintStream = new PrintStream(errOut);
  }

  @Test
  public void testConstructor_NullArgs_ThrowsNullPointer() {
    try {
      new CommandLineRunner(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
    }
  }

  @Test
  public void testConstructor_EmptyArgs_ConfigValid() {
    String[] args = new String[] {};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_HelpFlag_ReturnsConfigInvalid() {
    String[] args = new String[] {"--help"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_InvalidFlag_ReturnsConfigInvalid() {
    String[] args = new String[] {"--nonexistent_flag"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testConstructor_UnknownModuleError_ConfigInvalid() {
    String[] args = new String[] {"--module", "modA:1", "--js", "a.js", "--module", "modB:1:modA"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertNotNull(runner);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testGetDefaultExterns_ReturnsNonEmptyList() throws IOException {
    List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
  }

  @Test
  public void testGetDefaultExterns_ContainsExpectedExterns() throws IOException {
    List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    List<String> names = new java.util.ArrayList<>();
    for (JSSourceFile file : externs) {
      names.add(file.getName());
    }
    assertTrue(names.contains("es3.js"));
    assertTrue(names.contains("es5.js"));
  }

  @Test
  public void testBooleanOptionHandler_ParseTrueValue() throws Exception {
    CommandLineRunner.BooleanOptionHandler handler = 
        new CommandLineRunner.BooleanOptionHandler(
            new org.kohsuke.args4j.CmdLineParser(new Object()), 
            new OptionDef("--test", true, "", "", true, false, 1, 1, 1, "", null),
            new Setter<Boolean>() {
              @Override
              public void addValue(Boolean value) {
                assertEquals(Boolean.TRUE, value);
              }
              @Override
              public void setValue(Boolean value) {
                addValue(value);
              }
              @Override
              public Class<Boolean> getType() {
                return Boolean.class;
              }
            });
    String[] args = new String[] {"--test", "true"};
    org.kohsuke.args4j.spi.Parameters params = new org.kohsuke.args4j.spi.Parameters() {
      @Override
      public String getParameter(int idx) {
        return (idx == 0) ? "true" : null;
      }
      @Override
      public int size() {
        return 1;
      }
    };
    int result = handler.parseArguments(params);
    assertEquals(1, result);
  }

  @Test
  public void testBooleanOptionHandler_ReturnsZeroOnNullParam() throws Exception {
    CommandLineRunner.BooleanOptionHandler handler = 
        new CommandLineRunner.BooleanOptionHandler(
            new org.kohsuke.args4j.CmdLineParser(new Object()), 
            new OptionDef("--test", true, "", "", true, false, 1, 1, 1, "", null),
            new Setter<Boolean>() {
              @Override
              public void addValue(Boolean value) {
              }
              @Override
              public void setValue(Boolean value) {
              }
              @Override
              public Class<Boolean> getType() {
                return Boolean.class;
              }
            });
    String[] args = new String[] {"--test"};
    org.kohsuke.args4j.spi.Parameters params = new org.kohsuke.args4j.spi.Parameters() {
      @Override
      public String getParameter(int idx) {
        return null;
      }
      @Override
      public int size() {
        return 1;
      }
    };
    int result = handler.parseArguments(params);
    assertEquals(0, result);
  }

  @Test
  public void testBooleanOptionHandler_IllegalValue() throws Exception {
    CommandLineRunner.BooleanOptionHandler handler = 
        new CommandLineRunner.BooleanOptionHandler(
            new org.kohsuke.args4j.CmdLineParser(new Object()), 
            new OptionDef("--test", true, "", "", true, false, 1, 1, 1, "", null),
            new Setter<Boolean>() {
              @Override
              public void addValue(Boolean value) {
                fail("Should not add value on illegal input");
              }
              @Override
              public void setValue(Boolean value) {
              }
              @Override
              public Class<Boolean> getType() {
                return Boolean.class;
              }
            });
    String[] args = new String[] {"--test", "invalidValue"};
    org.kohsuke.args4j.spi.Parameters params = new org.kohsuke.args4j.spi.Parameters() {
      @Override
      public String getParameter(int idx) {
        return "invalidValue";
      }
      @Override
      public int size() {
        return 1;
      }
    };
    try {
      handler.parseArguments(params);
      fail("Expected CmdLineException");
    } catch (CmdLineException expected) {
    }
  }

  @Test
  public void testBooleanOptionHandler_CaseInsensitiveTrue() throws Exception {
    CommandLineRunner.BooleanOptionHandler handler = 
        new CommandLineRunner.BooleanOptionHandler(
            new org.kohsuke.args4j.CmdLineParser(new Object()), 
            new OptionDef("--test", true, "", "", true, false, 1, 1, 1, "", null),
            new Setter<Boolean>() {
              @Override
              public void addValue(Boolean value) {
                assertEquals(Boolean.TRUE, value);
              }
              @Override
              public void setValue(Boolean value) {
                addValue(value);
              }
              @Override
              public Class<Boolean> getType() {
                return Boolean.class;
              }
            });
    org.kohsuke.args4j.spi.Parameters params = new org.kohsuke.args4j.spi.Parameters() {
      @Override
      public String getParameter(int idx) {
        return "TRUE";
      }
      @Override
      public int size() {
        return 1;
      }
    };
    int result = handler.parseArguments(params);
    assertEquals(1, result);
  }

  @Test
  public void testGetDefaultExterns_WithExpensiveZipContent() throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (ZipOutputStream zos = new ZipOutputStream(baos)) {
      ZipEntry entry = new ZipEntry("es3.js");
      zos.putNextEntry(entry);
      zos.write("var es3 = 1;".getBytes());
      zos.closeEntry();
      entry = new ZipEntry("es5.js");
      zos.putNextEntry(entry);
      zos.write("var es5 = 1;".getBytes());
      zos.closeEntry();
    }
    InputStream oldStream = System.in;
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    try {
      System.setIn(bais);
      // This test is limited in scope; just ensures no exceptions for basic flow
      List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
      assertNotNull(externs);
    } finally {
      System.setIn(oldStream);
    }
  }
}