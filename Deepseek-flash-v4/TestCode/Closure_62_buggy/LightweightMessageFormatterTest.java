package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LightweightMessageFormatterTest {

  private static class FakeSourceExcerptProvider implements SourceExcerptProvider {
    private final String source;
    private final String line;

    FakeSourceExcerptProvider(String source, String line) {
      this.source = source;
      this.line = line;
    }

    @Override
    public String getSourceLine(String sourceName, int lineNumber) {
      return line;
    }

    @Override
    public Region getSourceRegion(String sourceName, int lineNumber) {
      return new Region() {
        @Override
        public int getBeginningLineNumber() {
          return lineNumber;
        }

        @Override
        public int getEndingLineNumber() {
          return lineNumber;
        }

        @Override
        public String getSourceExcerpt() {
          return source;
        }
      };
    }

    @Override
    public String getSourceName() {
      return "test.js";
    }
  }

  private LightweightMessageFormatter formatter;
  private JSError error;

  @Before
  public void setUp() {
    formatter = new LightweightMessageFormatter(new FakeSourceExcerptProvider("line1\nline2\nline3", "line2"));
    error = JSError.make("test.js", 2, CheckLevel.ERROR, "Test error", "error");
    error.setCharno(3);
  }

  @Test
  public void testFormatErrorWithSource() {
    String result = formatter.formatError(error);
    assertNotNull(result);
    assertTrue(result.contains("test.js:2: ERROR - Test error"));
    assertTrue(result.contains("line2"));
    assertTrue(result.contains("^"));
  }

  @Test
  public void testFormatWarningWithSource() {
    String result = formatter.formatWarning(error);
    assertNotNull(result);
    assertTrue(result.contains("WARNING"));
  }

  @Test
  public void testFormatErrorWithoutSource() {
    LightweightMessageFormatter noSource = LightweightMessageFormatter.withoutSource();
    JSError err = JSError.make("test.js", 2, CheckLevel.ERROR, "Error without source", "err");
    err.setCharno(2);
    String result = noSource.formatError(err);
    assertNotNull(result);
    assertTrue(result.contains("test.js:2: ERROR - Error without source"));
    assertTrue(!result.contains("\n^"));
  }

  @Test
  public void testFormatErrorWithNullSourceName() {
    JSError err = JSError.make(null, 1, CheckLevel.ERROR, "No source name", "e");
    err.setCharno(0);
    String result = formatter.formatError(err);
    assertNotNull(result);
    assertTrue(!result.contains(":"));
    assertTrue(result.contains("ERROR - No source name"));
  }

  @Test
  public void testFormatErrorWithLineNumberZero() {
    JSError err = JSError.make("test.js", 0, CheckLevel.ERROR, "No line", "e");
    err.setCharno(0);
    String result = formatter.formatError(err);
    assertNotNull(result);
    assertTrue(result.contains("test.js: ERROR - No line"));
  }

  @Test
  public void testFormatErrorWithNegativeCharno() {
    JSError err = JSError.make("test.js", 1, CheckLevel.ERROR, "Negative charno", "e");
    err.setCharno(-1);
    String result = formatter.formatError(err);
    assertNotNull(result);
    assertTrue(!result.contains("^"));
  }

  @Test
  public void testFormatErrorWithCharnoAtEndOfLine() {
    JSError err = JSError.make("test.js", 2, CheckLevel.ERROR, "End charno", "e");
    err.setCharno(4);
    String result = formatter.formatError(err);
    assertNotNull(result);
    assertTrue(result.contains("line2"));
    assertTrue(!result.contains("^"));
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullSource() {
    new LightweightMessageFormatter(null, SourceExcerptProvider.SourceExcerpt.LINE);
  }

  @Test
  public void testWithoutSourceConstructor() {
    LightweightMessageFormatter f = LightweightMessageFormatter.withoutSource();
    assertNotNull(f);
    JSError err = JSError.make("file", 1, CheckLevel.ERROR, "Message", "m");
    err.setCharno(0);
    String result = f.formatError(err);
    assertNotNull(result);
    assertTrue(result.contains("file:1: ERROR - Message"));
  }

  @Test
  public void testFormatErrorWithSourceExcerptNoNewline() {
    FakeSourceExcerptProvider provider = new FakeSourceExcerptProvider("single line", "single line") {
      @Override
      public String getSourceLine(String sourceName, int lineNumber) {
        return "single line";
      }

      @Override
      public Region getSourceRegion(String sourceName, int lineNumber) {
        return new Region() {
          @Override
          public int getBeginningLineNumber() {
            return 1;
          }

          @Override
          public int getEndingLineNumber() {
            return 1;
          }

          @Override
          public String getSourceExcerpt() {
            return "single line";
          }
        };
      }
    };
    LightweightMessageFormatter f = new LightweightMessageFormatter(provider);
    JSError err = JSError.make("test", 1, CheckLevel.ERROR, "Error", "e");
    err.setCharno(5);
    String result = f.formatError(err);
    assertNotNull(result);
    assertTrue(result.contains("single line"));
    assertTrue(result.contains("^"));
  }
}