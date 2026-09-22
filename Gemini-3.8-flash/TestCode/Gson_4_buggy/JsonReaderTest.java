package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JsonReaderTest {

  private JsonReader createReader(String json) {
    return new JsonReader(new StringReader(json));
  }

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullReader_shouldThrowNullPointerException() {
    new JsonReader(null);
  }

  @Test
  public void isLenient_givenDefault_shouldBeFalse() {
    JsonReader reader = createReader("{}");
    Assert.assertFalse(reader.isLenient());
  }

  @Test
  public void setLenient_givenTrue_shouldUpdateState() {
    JsonReader reader = createReader("{}");
    reader.setLenient(true);
    Assert.assertTrue(reader.isLenient());
  }

  @Test
  public void readEmptyObject_happyPath_shouldSucceed() throws IOException {
    JsonReader reader = createReader("{}");
    Assert.assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    reader.beginObject();
    Assert.assertFalse(reader.hasNext());
    Assert.assertEquals(JsonToken.END_OBJECT, reader.peek());
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void readEmptyArray_happyPath_shouldSucceed() throws IOException {
    JsonReader reader = createReader("[]");
    Assert.assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    reader.beginArray();
    Assert.assertFalse(reader.hasNext());
    Assert.assertEquals(JsonToken.END_ARRAY, reader.peek());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void readSimpleObject_happyPath_shouldReadProperties() throws IOException {
    JsonReader reader = createReader("{\"name\":\"Alice\",\"age\":30,\"active\":true,\"data\":null}");
    reader.beginObject();
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals("name", reader.nextName());
    Assert.assertEquals("Alice", reader.nextString());
    Assert.assertEquals("age", reader.nextName());
    Assert.assertEquals(30, reader.nextInt());
    Assert.assertEquals("active", reader.nextName());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertEquals("data", reader.nextName());
    reader.nextNull();
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void readArray_happyPath_shouldReadElements() throws IOException {
    JsonReader reader = createReader("[10, false, \"hello\"]");
    reader.beginArray();
    Assert.assertEquals(10L, reader.nextLong());
    Assert.assertFalse(reader.nextBoolean());
    Assert.assertEquals("hello", reader.nextString());
    reader.endArray();
  }

  @Test
  public void bom_givenUtf8Bom_shouldSkipBom() throws IOException {
    JsonReader reader = createReader("\ufeff{\"key\":\"val\"}");
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void nonExecutePrefix_givenLenient_shouldSkipPrefix() throws IOException {
    JsonReader reader = createReader(")]}'\n{\"key\":\"val\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void nonExecutePrefix_givenIncompletePrefix_shouldHandleGracefully() throws IOException {
    JsonReader reader = createReader(")]}");
    reader.setLenient(true);
    try {
      reader.peek();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void comments_givenLenientSlashSlash_shouldIgnoreComment() throws IOException {
    JsonReader reader = createReader("// comment\n{\"key\": /* block comment */ \"val\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void comments_givenLenientHash_shouldIgnoreComment() throws IOException {
    JsonReader reader = createReader("# comment\n{\"key\":\"val\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void comments_givenStrictComment_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("// strict comment\n{}");
    try {
      reader.peek();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void comments_givenUnterminatedBlockComment_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("/* unterminated\n{}");
    reader.setLenient(true);
    try {
      reader.peek();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void delimiters_givenSemicolonAndEquals_shouldWorkInLenient() throws IOException {
    JsonReader reader = createReader("{\"k1\" = \"v1\"; \"k2\" => \"v2\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("k1", reader.nextName());
    Assert.assertEquals("v1", reader.nextString());
    Assert.assertEquals("k2", reader.nextName());
    Assert.assertEquals("v2", reader.nextString());
    reader.endObject();
  }

  @Test
  public void unquotedNameAndValue_givenLenient_shouldParse() throws IOException {
    JsonReader reader = createReader("{key:value}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void singleQuotedStrings_givenLenient_shouldParse() throws IOException {
    JsonReader reader = createReader("{'key':'value'}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void escapeSequences_givenValidEscapes_shouldDecode() throws IOException {
    JsonReader reader = createReader("[\"\\\"\\\\\\/\\b\\f\\n\\r\\t\\u0041\"]");
    reader.beginArray();
    Assert.assertEquals("\"\\/\b\f\n\r\tA", reader.nextString());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void escapeSequences_givenInvalidHexInUnicode_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = createReader("[\"\\u004G\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void escapeSequences_givenShortUnicode_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("[\"\\u004\"]");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void escapeSequences_givenUnterminatedEscape_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("[\"\\");
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void string_givenUnterminatedString_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("[\"unterminated]");
    reader.beginArray();
    reader.nextString();
  }

  @Test
  public void numbers_givenIntegerLongDouble_shouldParseAccurately() throws IOException {
    JsonReader reader = createReader("[0, -0, 12345, -67890, 9223372036854775807, -9223372036854775808, 12.34, -5.6e2, 7E-1]");
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(12345, reader.nextInt());
    Assert.assertEquals(-67890L, reader.nextLong());
    Assert.assertEquals(Long.MAX_VALUE, reader.nextLong());
    Assert.assertEquals(Long.MIN_VALUE, reader.nextLong());
    Assert.assertEquals(12.34, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-560.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(0.7, reader.nextDouble(), 0.0001);
    reader.endArray();
  }

  @Test
  public void numbers_givenNumberStrings_shouldAllowCoercion() throws IOException {
    JsonReader reader = createReader("[\"123\", \"45678901234\", \"3.14\"]");
    reader.beginArray();
    Assert.assertEquals(123, reader.nextInt());
    Assert.assertEquals(45678901234L, reader.nextLong());
    Assert.assertEquals(3.14, reader.nextDouble(), 0.0001);
    reader.endArray();
  }

  @Test
  public void numbers_givenSingleQuotedNumber_shouldAllowCoercionInLenient() throws IOException {
    JsonReader reader = createReader("['123', '456']");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(123, reader.nextInt());
    Assert.assertEquals(456L, reader.nextLong());
    reader.endArray();
  }

  @Test
  public void numbers_givenDoubleAsInteger_whenExactFraction_shouldParse() throws IOException {
    JsonReader reader = createReader("[100.0, 50.0]");
    reader.beginArray();
    Assert.assertEquals(100, reader.nextInt());
    Assert.assertEquals(50L, reader.nextLong());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void numbers_givenFractionForNextInt_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = createReader("[100.5]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = NumberFormatException.class)
  public void numbers_givenFractionForNextLong_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = createReader("[100.5]");
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = NumberFormatException.class)
  public void numbers_givenOverflowForNextInt_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = createReader("[9223372036854775807]");
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void numbers_givenNaNAndInfinity_whenLenient_shouldParseDouble() throws IOException {
    JsonReader reader = createReader("[NaN, Infinity, -Infinity]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
    Assert.assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble(), 0.0);
    Assert.assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void numbers_givenNaN_whenStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("[NaN]");
    reader.beginArray();
    reader.nextDouble();
  }

  @Test
  public void booleans_givenCaseInsensitive_shouldParse() throws IOException {
    JsonReader reader = createReader("[true, False, TRUE, FALSE]");
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void booleans_givenNonBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[\"true\"]");
    reader.beginArray();
    reader.nextBoolean();
  }

  @Test(expected = IllegalStateException.class)
  public void nextNull_givenNonNull_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[123]");
    reader.beginArray();
    reader.nextNull();
  }

  @Test
  public void nextNull_givenEmptyArrayElementsInLenient_shouldReadNull() throws IOException {
    JsonReader reader = createReader("[,;]");
    reader.setLenient(true);
    reader.beginArray();
    reader.nextNull();
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void nextString_givenVariousTokens_shouldConvertToString() throws IOException {
    JsonReader reader = createReader("[123, 45.67, true, false]");
    reader.beginArray();
    Assert.assertEquals("123", reader.nextString());
    Assert.assertEquals("45.67", reader.nextString());
    Assert.assertEquals("true", reader.nextString());
    Assert.assertEquals("false", reader.nextString());
    reader.endArray();
  }

  @Test
  public void skipValue_givenNestedStructures_shouldSkipEntirely() throws IOException {
    JsonReader reader = createReader("{\"a\":[1,{\"b\":2},3],\"c\":'single',\"d\":unquoted,\"e\":\"val\"}");
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("c", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("d", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("e", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    reader.endObject();
  }

  @Test
  public void getPath_givenNestedLevels_shouldReturnAccuratePath() throws IOException {
    JsonReader reader = createReader("{\"a\":[{\"b\":1}],\"c\":2}");
    Assert.assertEquals("$", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.", reader.getPath());
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals("$.a", reader.getPath());
    reader.beginArray();
    Assert.assertEquals("$.a[0]", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.a[0].", reader.getPath());
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals("$.a[0].b", reader.getPath());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
    Assert.assertEquals("$.a[0]", reader.getPath());
    reader.endArray();
    Assert.assertEquals("$.a", reader.getPath());
    Assert.assertEquals("c", reader.nextName());
    Assert.assertEquals(2, reader.nextInt());
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
  }

  @Test
  public void deepNesting_stackResizing_shouldExpandStackGracefully() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 40; i++) {
      sb.append("[");
    }
    sb.append("1");
    for (int i = 0; i < 40; i++) {
      sb.append("]");
    }
    JsonReader reader = createReader(sb.toString());
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    Assert.assertEquals(1, reader.nextInt());
    for (int i = 0; i < 40; i++) {
      reader.endArray();
    }
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void beginArray_whenExpectedObject_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("{}");
    reader.beginArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_whenInObject_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("{}");
    reader.beginObject();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void beginObject_whenExpectedArray_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[]");
    reader.beginObject();
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_whenInArray_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[]");
    reader.beginArray();
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void nextName_whenAtValue_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[1]");
    reader.beginArray();
    reader.nextName();
  }

  @Test
  public void close_givenReader_shouldCloseUnderlyingAndThrowOnSubsequentCalls() throws IOException {
    JsonReader reader = createReader("[]");
    reader.close();
    try {
      reader.peek();
      Assert.fail();
    } catch (IllegalStateException expected) {
      Assert.assertEquals("JsonReader is closed", expected.getMessage());
    }
  }

  @Test
  public void toString_shouldIncludeClassAndPosition() throws IOException {
    JsonReader reader = createReader("[10]");
    reader.beginArray();
    String str = reader.toString();
    Assert.assertTrue(str.contains("JsonReader"));
    Assert.assertTrue(str.contains("line 1"));
    Assert.assertTrue(str.contains("column"));
  }

  @Test(expected = EOFException.class)
  public void emptyDocument_shouldThrowEofException() throws IOException {
    JsonReader reader = createReader("");
    reader.peek();
  }

  @Test
  public void multipleTopLevelValues_givenLenient_shouldReadConsecutiveValues() throws IOException {
    JsonReader reader = createReader("1 2");
    reader.setLenient(true);
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = MalformedJsonException.class)
  public void multipleTopLevelValues_givenStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("1 2");
    Assert.assertEquals(1, reader.nextInt());
    reader.peek();
  }

  @Test
  public void promoteNameToValue_givenDoubleQuotedName_shouldPromoteToString() throws IOException {
    JsonReader reader = createReader("{\"key\":\"value\"}");
    reader.beginObject();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("key", reader.nextString());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void promoteNameToValue_givenSingleQuotedName_shouldPromoteToString() throws IOException {
    JsonReader reader = createReader("{'key':'value'}");
    reader.setLenient(true);
    reader.beginObject();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("key", reader.nextString());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void promoteNameToValue_givenUnquotedName_shouldPromoteToString() throws IOException {
    JsonReader reader = createReader("{key:\"value\"}");
    reader.setLenient(true);
    reader.beginObject();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("key", reader.nextString());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void promoteNameToValue_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = createReader("[\"val\"]");
    reader.beginArray();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
  }

  @Test
  public void unterminatedObject_missingColon_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("{\"key\" \"val\"}");
    reader.beginObject();
    try {
      reader.nextName();
      reader.nextString();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void unterminatedObject_trailingComma_whenStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("{\"key\":\"val\",}");
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("val", reader.nextString());
    try {
      reader.hasNext();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void unterminatedArray_trailingComma_whenStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = createReader("[1,]");
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    try {
      reader.hasNext();
      Assert.fail();
    } catch (MalformedJsonException expected) {
    }
  }

  @Test
  public void largeUnquotedString_exceedingBuffer_shouldBufferAndConcatenate() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 2050; i++) {
      sb.append('a');
    }
    JsonReader reader = createReader(sb.toString());
    reader.setLenient(true);
    Assert.assertEquals(sb.toString(), reader.nextString());
  }

  @Test
  public void largeQuotedString_exceedingBuffer_shouldBufferAndConcatenate() throws IOException {
    StringBuilder sb = new StringBuilder("\"");
    for (int i = 0; i < 2050; i++) {
      sb.append('z');
    }
    sb.append("\"");
    JsonReader reader = createReader(sb.toString());
    Assert.assertEquals(sb.substring(1, sb.length() - 1), reader.nextString());
  }

  @Test
  public void largeSkipValue_exceedingBuffer_shouldSkipCorrectly() throws IOException {
    StringBuilder sb = new StringBuilder("[\"");
    for (int i = 0; i < 2050; i++) {
      sb.append('x');
    }
    sb.append("\", 42]");
    JsonReader reader = createReader(sb.toString());
    reader.beginArray();
    reader.skipValue();
    Assert.assertEquals(42, reader.nextInt());
    reader.endArray();
  }
}