package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonWriterTest {

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullWriter_shouldThrowNullPointerException() {
    new JsonWriter(null);
  }

  @Test
  public void setIndent_givenEmptyString_shouldCompactOutput() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setIndent("");

    jsonWriter.beginObject();
    jsonWriter.name("key").value("value");
    jsonWriter.endObject();

    assertEquals("{\"key\":\"value\"}", stringWriter.toString());
  }

  @Test
  public void setIndent_givenWhitespace_shouldPrettyPrint() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setIndent("  ");

    jsonWriter.beginObject();
    jsonWriter.name("key").value("value");
    jsonWriter.endObject();

    assertEquals("{\n  \"key\": \"value\"\n}", stringWriter.toString());
  }

  @Test
  public void isLenient_whenDefaultsAndChanges_shouldReflectState() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    assertFalse(jsonWriter.isLenient());
    jsonWriter.setLenient(true);
    assertTrue(jsonWriter.isLenient());
  }

  @Test
  public void isHtmlSafe_whenDefaultsAndChanges_shouldReflectState() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    assertFalse(jsonWriter.isHtmlSafe());
    jsonWriter.setHtmlSafe(true);
    assertTrue(jsonWriter.isHtmlSafe());
  }

  @Test
  public void getSerializeNulls_whenDefaultsAndChanges_shouldReflectState() {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    assertTrue(jsonWriter.getSerializeNulls());
    jsonWriter.setSerializeNulls(false);
    assertFalse(jsonWriter.getSerializeNulls());
  }

  @Test
  public void emptyArray_shouldProduceSquareBrackets() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginArray();
    jsonWriter.endArray();

    assertEquals("[]", stringWriter.toString());
  }

  @Test
  public void emptyObject_shouldProduceCurlyBraces() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginObject();
    jsonWriter.endObject();

    assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void array_givenMultipleElements_shouldSeparateWithCommas() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginArray();
    jsonWriter.value(1L);
    jsonWriter.value(2L);
    jsonWriter.value(3L);
    jsonWriter.endArray();

    assertEquals("[1,2,3]", stringWriter.toString());
  }

  @Test
  public void object_givenMultipleProperties_shouldSeparateWithCommas() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginObject();
    jsonWriter.name("a").value(1L);
    jsonWriter.name("b").value(2L);
    jsonWriter.endObject();

    assertEquals("{\"a\":1,\"b\":2}", stringWriter.toString());
  }

  @Test
  public void nestedStructure_withIndentation_shouldFormatCorrectly() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setIndent("  ");

    jsonWriter.beginArray();
    jsonWriter.beginObject();
    jsonWriter.name("name").value("test");
    jsonWriter.endObject();
    jsonWriter.endArray();

    assertEquals("[\n  {\n    \"name\": \"test\"\n  }\n]", stringWriter.toString());
  }

  @Test
  public void name_givenNull_shouldThrowNullPointerException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();

    try {
      jsonWriter.name(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      assertEquals("name == null", expected.getMessage());
    }
  }

  @Test
  public void name_whenCalledTwiceConsecutively_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("first");

    try {
      jsonWriter.name("second");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
    }
  }

  @Test
  public void name_whenWriterClosed_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.endObject();
    jsonWriter.close();

    try {
      jsonWriter.name("key");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("JsonWriter is closed.", expected.getMessage());
    }
  }

  @Test
  public void name_whenNotInObject_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.name("key");

    try {
      jsonWriter.value("value");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Nesting problem.", expected.getMessage());
    }
  }

  @Test
  public void value_whenValueCalledInObjectWithoutName_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();

    try {
      jsonWriter.value("valueWithoutName");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Nesting problem.", expected.getMessage());
    }
  }

  @Test
  public void endArray_whenInObject_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();

    try {
      jsonWriter.endArray();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Nesting problem.", expected.getMessage());
    }
  }

  @Test
  public void endObject_whenInArray_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    try {
      jsonWriter.endObject();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Nesting problem.", expected.getMessage());
    }
  }

  @Test
  public void endObject_whenDanglingName_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("dangling");

    try {
      jsonWriter.endObject();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Dangling name: dangling", expected.getMessage());
    }
  }

  @Test
  public void multipleTopLevelValues_whenStrict_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value("first");

    try {
      jsonWriter.value("second");
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("JSON must have only one top-level value.", expected.getMessage());
    }
  }

  @Test
  public void multipleTopLevelValues_whenLenient_shouldSucceed() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);

    jsonWriter.value("first");
    jsonWriter.value("second");

    assertEquals("\"first\"\"second\"", stringWriter.toString());
  }

  @Test
  public void valueString_givenNull_whenSerializeNullsTrue_shouldWriteNull() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(true);

    jsonWriter.beginObject();
    jsonWriter.name("key").value((String) null);
    jsonWriter.endObject();

    assertEquals("{\"key\":null}", stringWriter.toString());
  }

  @Test
  public void valueString_givenNull_whenSerializeNullsFalse_shouldOmitProperty() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(false);

    jsonWriter.beginObject();
    jsonWriter.name("omitted").value((String) null);
    jsonWriter.name("retained").value("present");
    jsonWriter.endObject();

    assertEquals("{\"retained\":\"present\"}", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenRawJson_shouldAppendWithoutQuotes() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginObject();
    jsonWriter.name("raw").jsonValue("{\"nested\":true}");
    jsonWriter.endObject();

    assertEquals("{\"raw\":{\"nested\":true}}", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenNull_shouldWriteNullLiteral() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginArray();
    jsonWriter.jsonValue(null);
    jsonWriter.endArray();

    assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void valueBoolean_shouldWriteLiteralTrueAndFalse() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginArray();
    jsonWriter.value(true);
    jsonWriter.value(false);
    jsonWriter.endArray();

    assertEquals("[true,false]", stringWriter.toString());
  }

  @Test
  public void valueDouble_givenFiniteDouble_shouldWriteLiteral() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.value(123.456d);

    assertEquals("123.456", stringWriter.toString());
  }

  @Test
  public void valueDouble_givenNaN_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.NaN);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was NaN", expected.getMessage());
    }
  }

  @Test
  public void valueDouble_givenPositiveInfinity_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.POSITIVE_INFINITY);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was Infinity", expected.getMessage());
    }
  }

  @Test
  public void valueDouble_givenNegativeInfinity_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.NEGATIVE_INFINITY);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was -Infinity", expected.getMessage());
    }
  }

  @Test
  public void valueLong_shouldWriteLiteral() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.value(9876543210L);

    assertEquals("9876543210", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenNull_shouldWriteNull() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.value((Number) null);

    assertEquals("null", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenValidNumber_shouldWriteLiteral() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.beginArray();
    jsonWriter.value(new BigDecimal("12345.6789"));
    jsonWriter.value(new BigInteger("999999999999999999"));
    jsonWriter.endArray();

    assertEquals("[12345.6789,999999999999999999]", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenNaN_whenStrict_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.valueOf(Double.NaN));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was NaN", expected.getMessage());
    }
  }

  @Test
  public void valueNumber_givenPositiveInfinity_whenStrict_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was Infinity", expected.getMessage());
    }
  }

  @Test
  public void valueNumber_givenNegativeInfinity_whenStrict_shouldThrowIllegalArgumentException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      assertEquals("Numeric values must be finite, but was -Infinity", expected.getMessage());
    }
  }

  @Test
  public void valueNumber_givenNonFiniteNumber_whenLenient_shouldWriteValue() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);

    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.NaN));
    jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
    jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    jsonWriter.endArray();

    assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
  }

  @Test
  public void escapeCharacters_whenHtmlSafeFalse_shouldEscapeControlCharsAndQuotes() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setHtmlSafe(false);

    String input = "\"\\\t\b\n\r\f\u0000\u001f<>&='";
    jsonWriter.value(input);

    assertEquals("\"\\\"\\\\\\t\\b\\n\\r\\f\\u0000\\u001f<>&='\"", stringWriter.toString());
  }

  @Test
  public void escapeCharacters_whenHtmlSafeTrue_shouldEscapeHtmlSymbols() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setHtmlSafe(true);

    String input = "<>&='";
    jsonWriter.value(input);

    assertEquals("\"\\u003c\\u003e\\u0026\\u003d\\u0027\"", stringWriter.toString());
  }

  @Test
  public void escapeCharacters_givenUnicodeLineSeparators_shouldEscapeHex() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.value("a\u2028b\u2029c");

    assertEquals("\"a\\u2028b\\u2029c\"", stringWriter.toString());
  }

  @Test
  public void escapeCharacters_givenMixedPlainAndEscapedChars_shouldPreservePlainSegments() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    jsonWriter.value("plainPrefix\"plainMiddle\\plainSuffix");

    assertEquals("\"plainPrefix\\\"plainMiddle\\\\plainSuffix\"", stringWriter.toString());
  }

  @Test
  public void stack_whenNestingExceedsDefaultCapacity_shouldGrowAndSucceed() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    int depth = 40;
    for (int i = 0; i < depth; i++) {
      jsonWriter.beginArray();
    }
    jsonWriter.value("deepValue");
    for (int i = 0; i < depth; i++) {
      jsonWriter.endArray();
    }

    StringBuilder expected = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      expected.append("[");
    }
    expected.append("\"deepValue\"");
    for (int i = 0; i < depth; i++) {
      expected.append("]");
    }

    assertEquals(expected.toString(), stringWriter.toString());
  }

  @Test
  public void flush_whenOpen_shouldFlushUnderlyingWriter() throws IOException {
    final boolean[] flushed = new boolean[1];
    Writer mockWriter = new Writer() {
      public void write(char[] cbuf, int off, int len) {
      }
      public void flush() {
        flushed[0] = true;
      }
      public void close() {
      }
    };

    JsonWriter jsonWriter = new JsonWriter(mockWriter);
    jsonWriter.value("test");
    jsonWriter.flush();

    assertTrue(flushed[0]);
  }

  @Test
  public void flush_whenClosed_shouldThrowIllegalStateException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.value("test");
    jsonWriter.close();

    try {
      jsonWriter.flush();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("JsonWriter is closed.", expected.getMessage());
    }
  }

  @Test
  public void close_whenDocumentIncompleteUnclosedArray_shouldThrowIOException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    try {
      jsonWriter.close();
      fail("Expected IOException");
    } catch (IOException expected) {
      assertEquals("Incomplete document", expected.getMessage());
    }
  }

  @Test
  public void close_whenEmptyDocument_shouldThrowIOException() throws IOException {
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    try {
      jsonWriter.close();
      fail("Expected IOException");
    } catch (IOException expected) {
      assertEquals("Incomplete document", expected.getMessage());
    }
  }

  @Test
  public void close_whenDocumentComplete_shouldSucceedAndCloseWriter() throws IOException {
    final boolean[] closed = new boolean[1];
    Writer mockWriter = new Writer() {
      public void write(char[] cbuf, int off, int len) {
      }
      public void flush() {
      }
      public void close() {
        closed[0] = true;
      }
    };

    JsonWriter jsonWriter = new JsonWriter(mockWriter);
    jsonWriter.value("complete");
    jsonWriter.close();

    assertTrue(closed[0]);
  }
}