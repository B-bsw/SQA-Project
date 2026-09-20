package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;

public class LightweightMessageFormatterTest {

  private static class SimpleRegion implements Region {
    private final String source;
    private final int beginningLine;
    private final int endingLine;

    public SimpleRegion(int beginningLine, int endingLine, String source) {
      this.beginningLine = beginningLine;
      this.endingLine = endingLine;
      this.source = source;
    }

    public String getSourceExcerpt() {
      return this.source;
    }

    public int getBeginningLineNumber() {
      return this.beginningLine;
    }

    public int getEndingLineNumber() {
      return this.endingLine;
    }
  }

  private static class MockSourceExcerptProvider implements SourceExcerptProvider {
    private final String sourceLine;
    private final Region region;

    public MockSourceExcerptProvider(String sourceLine, Region region) {
      this.sourceLine = sourceLine;
      this.region = region;
    }

    public String getSourceLine(String sourceName, int lineNumber) {
      return this.sourceLine;
    }

    public Region getSourceRegion(String sourceName, int lineNumber) {
      return this.region;
    }
  }

  private static final DiagnosticType TEST_TYPE =
      DiagnosticType.error("TEST_FOO", "{0}");

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullSourceExcerptProvider_shouldThrowNullPointerException() {
    new LightweightMessageFormatter(null);
  }

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullSourceExcerptProviderWithExcerpt_shouldThrowNullPointerException() {
    new LightweightMessageFormatter(null, SourceExcerpt.LINE);
  }

  @Test
  public void formatError_givenWithoutSourceInstance_shouldFormatBasicErrorMessage() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", 10, 5, TEST_TYPE, "Syntax error");

    String result = formatter.formatError(error);

    String expected = "test.js:10: ERROR - Syntax error\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatWarning_givenWithoutSourceInstance_shouldFormatBasicWarningMessage() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError warning = JSError.make("test.js", 10, 5, TEST_TYPE, "Deprecated syntax");

    String result = formatter.formatWarning(warning);

    String expected = "test.js:10: WARNING - Deprecated syntax\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenNullSourceName_shouldOmitSourceNameAndLineNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make(null, 10, 5, TEST_TYPE, "Global error");

    String result = formatter.formatError(error);

    String expected = "ERROR - Global error\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenZeroLineNumber_shouldOmitLineNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", 0, -1, TEST_TYPE, "File level error");

    String result = formatter.formatError(error);

    String expected = "test.js: ERROR - File level error\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenNegativeLineNumber_shouldOmitLineNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = JSError.make("test.js", -1, -1, TEST_TYPE, "Negative line error");

    String result = formatter.formatError(error);

    String expected = "test.js: ERROR - Negative line error\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenValidSourceLineAndCharno_shouldIncludeSourceAndCaret() {
    String sourceLine = "var a = 1;";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 4, TEST_TYPE, "Invalid variable");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Invalid variable\n"
                    + "var a = 1;\n"
                    + "    ^\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenSourceLineWithWhitespaceCharacters_shouldPreserveWhitespaceForCaret() {
    String sourceLine = "\t var  x = 10;";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 7, TEST_TYPE, "Unexpected token");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Unexpected token\n"
                    + "\t var  x = 10;\n"
                    + "\t    ^\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenCharnoZero_shouldPlaceCaretAtBeginning() {
    String sourceLine = "alert(1);";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 0, TEST_TYPE, "Illegal call");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Illegal call\n"
                    + "alert(1);\n"
                    + "^\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenCharnoEqualsLineLength_shouldNotRenderCaret() {
    String sourceLine = "alert(1);";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, sourceLine.length(), TEST_TYPE, "Missing semicolon");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Missing semicolon\n"
                    + "alert(1);\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenCharnoGreaterThanLineLength_shouldNotRenderCaret() {
    String sourceLine = "alert(1);";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 100, TEST_TYPE, "Out of bounds error");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Out of bounds error\n"
                    + "alert(1);\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenNegativeCharno_shouldNotRenderCaret() {
    String sourceLine = "alert(1);";
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(sourceLine, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, -1, TEST_TYPE, "Unknown charno");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Unknown charno\n"
                    + "alert(1);\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenProviderReturnsNullExcerpt_shouldNotIncludeSourceOrCaret() {
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(null, null);
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    JSError error = JSError.make("test.js", 1, 0, TEST_TYPE, "File not readable");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - File not readable\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void formatError_givenRegionExcerptSource_shouldIncludeFormattedRegionWithoutCaret() {
    String regionCode = "line1\nline2";
    SimpleRegion region = new SimpleRegion(1, 2, regionCode);
    MockSourceExcerptProvider provider = new MockSourceExcerptProvider(null, region);
    LightweightMessageFormatter formatter =
        new LightweightMessageFormatter(provider, SourceExcerpt.REGION);
    JSError error = JSError.make("test.js", 1, 2, TEST_TYPE, "Region issue");

    String result = formatter.formatError(error);

    String expected = "test.js:1: ERROR - Region issue\n"
                    + "  1| line1\n"
                    + "  2| line2\n";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void lineNumberingFormatter_formatLine_shouldReturnLineUnchanged() {
    ExcerptFormatter formatter = new LightweightMessageFormatter.LineNumberingFormatter();
    String line = "function test() {}";

    String result = formatter.formatLine(line, 5);

    Assert.assertEquals(line, result);
  }

  @Test
  public void lineNumberingFormatter_formatRegion_givenNullRegion_shouldReturnNull() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();

    String result = formatter.formatRegion(null);

    Assert.assertNull(result);
  }

  @Test
  public void lineNumberingFormatter_formatRegion_givenEmptyRegionCode_shouldReturnNull() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    SimpleRegion region = new SimpleRegion(1, 1, "");

    String result = formatter.formatRegion(region);

    Assert.assertNull(result);
  }

  @Test
  public void lineNumberingFormatter_formatRegion_givenSingleLineWithoutNewline_shouldFormatCorrectly() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    SimpleRegion region = new SimpleRegion(1, 1, "var a = 1;");

    String result = formatter.formatRegion(region);

    String expected = "  1| var a = 1;";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void lineNumberingFormatter_formatRegion_givenCodeEndingWithNewline_shouldTrimTrailingNewline() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    SimpleRegion region = new SimpleRegion(1, 2, "var a = 1;\n");

    String result = formatter.formatRegion(region);

    String expected = "   1| var a = 1;";
    Assert.assertEquals(expected, result);
  }

  @Test
  public void lineNumberingFormatter_formatRegion_givenMultipleLinesAcrossDigitLengths_shouldPadLineNumbers() {
    LightweightMessageFormatter.LineNumberingFormatter formatter =
        new LightweightMessageFormatter.LineNumberingFormatter();
    String code = "line9\nline10\nline11";
    SimpleRegion region = new SimpleRegion(9, 11, code);

    String result = formatter.formatRegion(region);

    String expected = "   9| line9\n"
                    + "  10| line10\n"
                    + "  11| line11";
    Assert.assertEquals(expected, result);
  }
}