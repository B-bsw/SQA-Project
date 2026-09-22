package com.google.gson.stream;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonWriterTest {

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullWriter_shouldThrowNullPointerException() {
    // Arrange & Act
    new JsonWriter((Writer) null);
  }

  @Test
  public void writeTopLevelObject_givenSimpleProperties_shouldWriteValidJson() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginObject();
    writer.name("name").value("John Doe");
    writer.name("age").value(30);
    writer.name("score").value(95.5d);
    writer.name("active").value(true);
    writer.name("data").nullValue();
    writer.endObject();
    writer.close();

    // Assert
    Assert.assertEquals("{\"name\":\"John Doe\",\"age\":30,\"score\":95.5,\"active\":true,\"data\":null}", stringWriter.toString());
  }

  @Test
  public void writeTopLevelArray_givenMultipleValues_shouldWriteValidJson() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.value(10L);
    writer.value(false);
    writer.value("item");
    writer.nullValue();
    writer.endArray();
    writer.close();

    // Assert
    Assert.assertEquals("[10,false,\"item\",null]", stringWriter.toString());
  }

  @Test
  public void setIndent_givenNonEmptyString_shouldFormatWithIndentsAndSpaces() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setIndent("  ");

    // Act
    writer.beginObject();
    writer.name("a");
    writer.beginArray();
    writer.value(1);
    writer.endArray();
    writer.endObject();

    // Assert
    String expected = "{\n  \"a\": [\n    1\n  ]\n}";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void setIndent_givenEmptyString_shouldBeCompactWithoutSpaces() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setIndent("    ");
    writer.setIndent("");

    // Act
    writer.beginObject();
    writer.name("key").value("value");
    writer.endObject();

    // Assert
    Assert.assertEquals("{\"key\":\"value\"}", stringWriter.toString());
  }

  @Test
  public void isLenient_givenDefaultAndUpdated_shouldReturnCorrectState() {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act & Assert
    Assert.assertFalse(writer.isLenient());
    writer.setLenient(true);
    Assert.assertTrue(writer.isLenient());
    writer.setLenient(false);
    Assert.assertFalse(writer.isLenient());
  }

  @Test
  public void isHtmlSafe_givenDefaultAndUpdated_shouldReturnCorrectState() {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act & Assert
    Assert.assertFalse(writer.isHtmlSafe());
    writer.setHtmlSafe(true);
    Assert.assertTrue(writer.isHtmlSafe());
    writer.setHtmlSafe(false);
    Assert.assertFalse(writer.isHtmlSafe());
  }

  @Test
  public void getSerializeNulls_givenDefaultAndUpdated_shouldReturnCorrectState() {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act & Assert
    Assert.assertTrue(writer.getSerializeNulls());
    writer.setSerializeNulls(false);
    Assert.assertFalse(writer.getSerializeNulls());
    writer.setSerializeNulls(true);
    Assert.assertTrue(writer.getSerializeNulls());
  }

  @Test
  public void nullValue_whenSerializeNullsIsFalse_shouldOmitObjectProperty() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setSerializeNulls(false);

    // Act
    writer.beginObject();
    writer.name("omitted").nullValue();
    writer.name("present").value("yes");
    writer.endObject();

    // Assert
    Assert.assertEquals("{\"present\":\"yes\"}", stringWriter.toString());
  }

  @Test
  public void nullValue_whenSerializeNullsIsFalseInArray_shouldStillWriteNull() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setSerializeNulls(false);

    // Act
    writer.beginArray();
    writer.nullValue();
    writer.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void valueString_givenNull_shouldDelegateToNullValue() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.value((String) null);
    writer.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenNull_shouldDelegateToNullValue() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.jsonValue(null);
    writer.endArray();

    // Assert
    Assert.assertEquals("[null]", stringWriter.toString());
  }

  @Test
  public void jsonValue_givenRawJson_shouldWriteDirectlyWithoutEscaping() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginObject();
    writer.name("raw");
    writer.jsonValue("{\"nested\":[1,2,3]}");
    writer.endObject();

    // Assert
    Assert.assertEquals("{\"raw\":{\"nested\":[1,2,3]}}", stringWriter.toString());
  }

  @Test
  public void valueBooleanObject_givenNull_shouldWriteNull() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.value((Boolean) null);
    writer.value(Boolean.TRUE);
    writer.value(Boolean.FALSE);
    writer.endArray();

    // Assert
    Assert.assertEquals("[null,true,false]", stringWriter.toString());
  }

  @Test
  public void valueNumberObject_givenNull_shouldWriteNull() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.value((Number) null);
    writer.value(new BigInteger("12345678901234567890"));
    writer.value(new BigDecimal("99.99"));
    writer.endArray();

    // Assert
    Assert.assertEquals("[null,12345678901234567890,99.99]", stringWriter.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueDouble_givenNaN_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.NaN);
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueDouble_givenPositiveInfinity_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.POSITIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueDouble_givenNegativeInfinity_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.NEGATIVE_INFINITY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueNumber_givenNaNExtended_whenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.valueOf(Double.NaN));
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueNumber_givenPositiveInfinity_whenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
  }

  @Test(expected = IllegalArgumentException.class)
  public void valueNumber_givenNegativeInfinity_whenNotLenient_shouldThrowIllegalArgumentException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.value(Double.valueOf(Double.NEGATIVE_INFINITY));
  }

  @Test
  public void valueNumber_givenSpecialNumbers_whenLenient_shouldWriteThem() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setLenient(true);

    // Act
    writer.beginArray();
    writer.value(Double.valueOf(Double.NaN));
    writer.value(Double.valueOf(Double.POSITIVE_INFINITY));
    writer.value(Double.valueOf(Double.NEGATIVE_INFINITY));
    writer.endArray();

    // Assert
    Assert.assertEquals("[NaN,Infinity,-Infinity]", stringWriter.toString());
  }

  @Test
  public void stringEscaping_givenSpecialAndControlCharacters_shouldEscapeCorrectly() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginArray();
    writer.value("\"\\\t\b\n\r\f\u0000\u001f\u2028\u2029hello");
    writer.endArray();

    // Assert
    String expected = "[\"\\\"\\\\\\t\\b\\n\\r\\f\\u0000\\u001f\\u2028\\u2029hello\"]";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void stringEscaping_givenHtmlSafeEnabled_shouldEscapeHtmlCharacters() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setHtmlSafe(true);

    // Act
    writer.beginArray();
    writer.value("<tag> & 'quoted' = \"val\"");
    writer.endArray();

    // Assert
    String expected = "[\"\\u003ctag\\u003e \\u0026 \\u0027quoted\\u0027 \\u003d \\\"val\\\"\"]";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test
  public void stringEscaping_givenHtmlSafeDisabled_shouldNotEscapeHtmlCharacters() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setHtmlSafe(false);

    // Act
    writer.beginArray();
    writer.value("<a>&'=");
    writer.endArray();

    // Assert
    Assert.assertEquals("[\"<a>&'=\"]", stringWriter.toString());
  }

  @Test(expected = NullPointerException.class)
  public void name_givenNull_shouldThrowNullPointerException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginObject();
    writer.name(null);
  }

  @Test(expected = IllegalStateException.class)
  public void name_givenConsecutiveNameCalls_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginObject();
    writer.name("firstName");
    writer.name("secondName");
  }

  @Test(expected = IllegalStateException.class)
  public void name_whenWriterClosed_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray().endArray();
    writer.close();

    // Act
    writer.name("closedName");
  }

  @Test(expected = IllegalStateException.class)
  public void name_whenNotInObject_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.name("invalidName");
    writer.value(1);
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_whenInArray_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_whenInObject_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginObject();
    writer.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_withDanglingDeferredName_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginObject();
    writer.name("keyWithoutValue");
    writer.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void beforeValue_givenTopLevelMultipleValuesWhenStrict_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.value("first");
    writer.value("second");
  }

  @Test
  public void beforeValue_givenTopLevelMultipleValuesWhenLenient_shouldAllow() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    writer.setLenient(true);

    // Act
    writer.value("first");
    writer.value("second");

    // Assert
    Assert.assertEquals("\"first\"\"second\"", stringWriter.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void beforeValue_whenWriterIsClosed_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray().endArray();
    writer.close();

    // Act
    writer.value("valueAfterClose");
  }

  @Test
  public void stackExpansion_givenNestingDeeperThanDefaultCapacity_shouldResizeStackSuccessfully() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);
    int depth = 40;

    // Act
    for (int i = 0; i < depth; i++) {
      writer.beginArray();
    }
    writer.value("deep");
    for (int i = 0; i < depth; i++) {
      writer.endArray();
    }
    writer.close();

    // Assert
    String result = stringWriter.toString();
    Assert.assertTrue(result.startsWith("[[[["));
    Assert.assertTrue(result.contains("\"deep\""));
    Assert.assertTrue(result.endsWith("]]]]"));
  }

  @Test
  public void flush_givenOpenWriter_shouldFlushUnderlyingWriter() throws IOException {
    // Arrange
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
    JsonWriter writer = new JsonWriter(mockWriter);

    // Act
    writer.beginArray();
    writer.flush();

    // Assert
    Assert.assertTrue(flushed[0]);
  }

  @Test(expected = IllegalStateException.class)
  public void flush_givenClosedWriter_shouldThrowIllegalStateException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());
    writer.beginArray().endArray();
    writer.close();

    // Act
    writer.flush();
  }

  @Test(expected = IOException.class)
  public void close_givenIncompleteDocumentInArray_shouldThrowIOException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginArray();
    writer.close();
  }

  @Test(expected = IOException.class)
  public void close_givenIncompleteDocumentInObject_shouldThrowIOException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.beginObject();
    writer.close();
  }

  @Test(expected = IOException.class)
  public void close_givenEmptyDocument_shouldThrowIOException() throws IOException {
    // Arrange
    JsonWriter writer = new JsonWriter(new StringWriter());

    // Act
    writer.close();
  }

  @Test
  public void nestingObjectsAndArrays_givenComplexStructure_shouldWriteExpectedOutput() throws IOException {
    // Arrange
    StringWriter stringWriter = new StringWriter();
    JsonWriter writer = new JsonWriter(stringWriter);

    // Act
    writer.beginObject();
    writer.name("users");
    writer.beginArray();

    writer.beginObject();
    writer.name("id").value(1L);
    writer.name("name").value("Alice");
    writer.endObject();

    writer.beginObject();
    writer.name("id").value(2L);
    writer.name("name").value("Bob");
    writer.endObject();

    writer.endArray();
    writer.name("total").value(2);
    writer.endObject();
    writer.close();

    // Assert
    String expected = "{\"users\":[{\"id\":1,\"name\":\"Alice\"},{\"id\":2,\"name\":\"Bob\"}],\"total\":2}";
    Assert.assertEquals(expected, stringWriter.toString());
  }
}