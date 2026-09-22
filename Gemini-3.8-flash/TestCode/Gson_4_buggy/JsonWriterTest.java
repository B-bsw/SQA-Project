package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonWriterTest {

  @Test
  public void constructor_givenNullWriter_shouldThrowNullPointerException() {
    // Arrange
    Writer nullWriter = null;

    // Act & Assert
    try {
      new JsonWriter(nullWriter);
      Assert.fail("Expected NullPointerException when writer is null");
    } catch (NullPointerException e) {
      Assert.assertEquals("out == null", e.getMessage());
    }
  }

  @Test
  public void setIndent_givenEmptyIndent_shouldUseCompactFormatting() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.setIndent("");
    jsonWriter.beginObject();
    jsonWriter.name("key").value("value");
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{\"key\":\"value\"}", stringWriter.toString());
  }

  @Test
  public void setIndent_givenNonEmptyIndent_shouldPrettyPrint() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.setIndent("  ");
    jsonWriter.beginObject();
    jsonWriter.name("key").value("value");
    jsonWriter.endObject();

    // Assert
    String expected = "{\n  \"key\": \"value\"\n}";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void setLenient_givenTrue_shouldReflectInIsLenient() {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    Assert.assertFalse(jsonWriter.isLenient());
    jsonWriter.setLenient(true);

    // Assert
    Assert.assertTrue(jsonWriter.isLenient());
  }

  @Test
  public void setHtmlSafe_givenTrue_shouldReflectInIsHtmlSafe() {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    Assert.assertFalse(jsonWriter.isHtmlSafe());
    jsonWriter.setHtmlSafe(true);

    // Assert
    Assert.assertTrue(jsonWriter.isHtmlSafe());
  }

  @Test
  public void setSerializeNulls_givenFalse_shouldReflectInGetSerializeNulls() {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    Assert.assertTrue(jsonWriter.getSerializeNulls());
    jsonWriter.setSerializeNulls(false);

    // Assert
    Assert.assertFalse(jsonWriter.getSerializeNulls());
  }

  @Test
  public void beginArray_givenEmptyArray_shouldWriteEmptyArray() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[]", stringWriter.toString());
  }

  @Test
  public void beginArray_givenMultipleElements_shouldSeparateWithComma() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(1L);
    jsonWriter.value(2L);
    jsonWriter.value(3L);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[1,2,3]", stringWriter.toString());
  }

  @Test
  public void endArray_givenNoMatchingBeginArray_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act & Assert
    try {
      jsonWriter.endArray();
      Assert.fail("Expected IllegalStateException when calling endArray without open array");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Nesting problem.", e.getMessage());
    }
  }

  @Test
  public void endArray_givenInsideObjectScope_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();

    // Act & Assert
    try {
      jsonWriter.endArray();
      Assert.fail("Expected IllegalStateException when calling endArray inside object");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Nesting problem.", e.getMessage());
    }
  }

  @Test
  public void beginObject_givenEmptyObject_shouldWriteEmptyObject() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginObject();
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{}", stringWriter.toString());
  }

  @Test
  public void beginObject_givenMultipleEntries_shouldSeparateWithComma() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginObject();
    jsonWriter.name("first").value(1L);
    jsonWriter.name("second").value(2L);
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{\"first\":1,\"second\":2}", stringWriter.toString());
  }

  @Test
  public void endObject_givenNoMatchingBeginObject_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act & Assert
    try {
      jsonWriter.endObject();
      Assert.fail("Expected IllegalStateException when calling endObject without open object");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Nesting problem.", e.getMessage());
    }
  }

  @Test
  public void endObject_givenInsideArrayScope_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.endObject();
      Assert.fail("Expected IllegalStateException when calling endObject inside array");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Nesting problem.", e.getMessage());
    }
  }

  @Test
  public void endObject_givenDanglingName_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("dangling");

    // Act & Assert
    try {
      jsonWriter.endObject();
      Assert.fail("Expected IllegalStateException for dangling name");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Dangling name: dangling", e.getMessage());
    }
  }

  @Test
  public void push_givenNestingExceedingInitialStackSize_shouldExpandStackSuccessfully() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act: Initial stack length is 32, push 35 nested arrays
    int depth = 35;
    for (int i = 0; i < depth; i++) {
      jsonWriter.beginArray();
    }
    jsonWriter.value("deep");
    for (int i = 0; i < depth; i++) {
      jsonWriter.endArray();
    }

    // Assert
    String result = stringWriter.toString();
    Assert.assertTrue(result.startsWith("[[[["));
    Assert.assertTrue(result.contains("\"deep\""));
    Assert.assertTrue(result.endsWith("]]]]"));
  }

  @Test
  public void name_givenNullName_shouldThrowNullPointerException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();

    // Act & Assert
    try {
      jsonWriter.name(null);
      Assert.fail("Expected NullPointerException when name is null");
    } catch (NullPointerException e) {
      Assert.assertEquals("name == null", e.getMessage());
    }
  }

  @Test
  public void name_givenConsecutiveCallsWithoutValue_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginObject();
    jsonWriter.name("first");

    // Act & Assert
    try {
      jsonWriter.name("second");
      Assert.fail("Expected IllegalStateException when consecutive name() called without value");
    } catch (IllegalStateException expected) {
      // Success
    }
  }

  @Test
  public void name_givenClosedWriter_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();

    // Act & Assert
    try {
      jsonWriter.name("key");
      Assert.fail("Expected IllegalStateException when writer is closed");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }

  @Test
  public void name_givenCallOutsideObject_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act
    jsonWriter.name("key");

    // Assert
    try {
      jsonWriter.value("value");
      Assert.fail("Expected IllegalStateException when writing name outside of object scope");
    } catch (IllegalStateException e) {
      Assert.assertEquals("Nesting problem.", e.getMessage());
    }
  }

  @Test
  public void valueString_givenNullValue_shouldWriteNullLiteral() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value((String) null);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void valueString_givenControlAndEscapedCharacters_shouldEscapeProperly() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value("quote: \" backslash: \\ tab: \t backspace: \b newline: \n return: \r formfeed: \f nullbyte: \u0000 custom: \u001f");
    jsonWriter.endArray();

    // Assert
    String expected = "[\"quote: \\\" backslash: \\\\ tab: \\t backspace: \\b newline: \\n return: \\r formfeed: \\f nullbyte: \\u0000 custom: \\u001f\"]";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void valueString_givenJavascriptNewlines_shouldEscapeU2028AndU2029() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value("u2028: \u2028 and u2029: \u2029");
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[\"u2028: \\u2028 and u2029: \\u2029\"]", stringWriter.toString());
  }

  @Test
  public void valueString_givenHtmlCharactersWhenHtmlSafeFalse_shouldNotEscapeHtmlChars() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setHtmlSafe(false);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value("<tag> & ' =");
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[\"<tag> & ' =\"]", stringWriter.toString());
  }

  @Test
  public void valueString_givenHtmlCharactersWhenHtmlSafeTrue_shouldEscapeHtmlChars() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setHtmlSafe(true);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value("<tag> & ' =");
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[\"\\u003ctag\\u003e \\u0026 \\u0027 \\u003d\"]", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenNull_shouldWriteNullLiteral() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.jsonValue(null);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenRawJsonString_shouldAppendDirectlyWithoutQuoting() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginObject();
    jsonWriter.name("raw");
    jsonWriter.jsonValue("{\"inner\":true}");
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{\"raw\":{\"inner\":true}}", stringWriter.toString());
  }

  @Test
  public void nullValue_givenSerializeNullsTrue_shouldWriteMemberWithNull() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(true);

    // Act
    jsonWriter.beginObject();
    jsonWriter.name("key").nullValue();
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{\"key\":null}", stringWriter.toString());
  }

  @Test
  public void nullValue_givenSerializeNullsFalse_shouldOmitMemberEntirely() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setSerializeNulls(false);

    // Act
    jsonWriter.beginObject();
    jsonWriter.name("key").nullValue();
    jsonWriter.name("kept").value("present");
    jsonWriter.endObject();

    // Assert
    Assert.assertEquals("{\"kept\":\"present\"}", stringWriter.toString());
  }

  @Test
  public void valueBoolean_givenBooleans_shouldWriteLiteralValues() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(true);
    jsonWriter.value(false);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[true,false]", stringWriter.toString());
  }

  @Test
  public void valueDouble_givenFiniteDouble_shouldWriteDoubleValue() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(123.456d);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[123.456]", stringWriter.toString());
  }

  @Test
  public void valueDouble_givenNaN_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.NaN);
      Assert.fail("Expected IllegalArgumentException for Double.NaN");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was NaN", e.getMessage());
    }
  }

  @Test
  public void valueDouble_givenPositiveInfinity_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.POSITIVE_INFINITY);
      Assert.fail("Expected IllegalArgumentException for POSITIVE_INFINITY");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was Infinity", e.getMessage());
    }
  }

  @Test
  public void valueDouble_givenNegativeInfinity_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.NEGATIVE_INFINITY);
      Assert.fail("Expected IllegalArgumentException for NEGATIVE_INFINITY");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was -Infinity", e.getMessage());
    }
  }

  @Test
  public void valueLong_givenLongValue_shouldWriteLongAsString() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(9223372036854775807L);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[9223372036854775807]", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenNullNumber_shouldWriteNull() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value((Number) null);
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenCustomNumberTypes_shouldAppendString() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(new BigDecimal("123456789.987654321"));
    jsonWriter.value(new BigInteger("98765432109876543210"));
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[123456789.987654321,98765432109876543210]", stringWriter.toString());
  }

  @Test
  public void valueNumber_givenNaNWhenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(false);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.valueOf(Double.NaN));
      Assert.fail("Expected IllegalArgumentException for NaN Number");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was NaN", e.getMessage());
    }
  }

  @Test
  public void valueNumber_givenInfinityWhenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(false);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
      Assert.fail("Expected IllegalArgumentException for Infinity Number");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was Infinity", e.getMessage());
    }
  }

  @Test
  public void valueNumber_givenNegativeInfinityWhenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(false);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
      Assert.fail("Expected IllegalArgumentException for -Infinity Number");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("Numeric values must be finite, but was -Infinity", e.getMessage());
    }
  }

  @Test
  public void valueNumber_givenNonFiniteWhenLenient_shouldWriteValue() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);

    // Act
    jsonWriter.beginArray();
    jsonWriter.value(Double.valueOf(Double.NaN));
    jsonWriter.value(Double.valueOf(Double.POSITIVE_INFINITY));
    jsonWriter.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    jsonWriter.endArray();

    // Assert
    Assert.assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
  }

  @Test
  public void beforeValue_givenTopLevelLiteralWhenNotLenient_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(false);

    // Act & Assert
    try {
      jsonWriter.value("literal");
      Assert.fail("Expected IllegalStateException for top level literal when not lenient");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JSON must start with an array or an object.", e.getMessage());
    }
  }

  @Test
  public void beforeValue_givenMultipleTopLevelValuesWhenNotLenient_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(false);
    jsonWriter.beginArray().endArray();

    // Act & Assert
    try {
      jsonWriter.beginArray();
      Assert.fail("Expected IllegalStateException for multiple top level values when not lenient");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JSON must have only one top-level value.", e.getMessage());
    }
  }

  @Test
  public void beforeValue_givenTopLevelValuesWhenLenient_shouldWriteSuccessfully() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.setLenient(true);

    // Act
    jsonWriter.value("first");
    jsonWriter.value("second");

    // Assert
    Assert.assertEquals("\"first\"\"second\"", stringWriter.toString());
  }

  @Test
  public void flush_givenActiveWriter_shouldFlushUnderlyingWriter() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act
    jsonWriter.flush();

    // Assert
    Assert.assertEquals("[", stringWriter.toString());
  }

  @Test
  public void flush_givenClosedWriter_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();

    // Act & Assert
    try {
      jsonWriter.flush();
      Assert.fail("Expected IllegalStateException when flushing a closed JsonWriter");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }

  @Test
  public void close_givenEmptyDocument_shouldThrowIOException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act & Assert
    try {
      jsonWriter.close();
      Assert.fail("Expected IOException on closing an empty document");
    } catch (IOException e) {
      Assert.assertEquals("Incomplete document", e.getMessage());
    }
  }

  @Test
  public void close_givenUnclosedArray_shouldThrowIOException() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    jsonWriter.beginArray();

    // Act & Assert
    try {
      jsonWriter.close();
      Assert.fail("Expected IOException on closing unclosed array");
    } catch (IOException e) {
      Assert.assertEquals("Incomplete document", e.getMessage());
    }
  }

  @Test
  public void close_givenCompleteDocument_shouldCloseAndPreventFurtherActions() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    // Act
    jsonWriter.beginArray();
    jsonWriter.endArray();
    jsonWriter.close();

    // Assert
    Assert.assertEquals("[]", stringWriter.toString());
    try {
      jsonWriter.beginObject();
      Assert.fail("Expected IllegalStateException when calling beginObject on closed writer");
    } catch (IllegalStateException e) {
      Assert.assertEquals("JsonWriter is closed.", e.getMessage());
    }
  }
}