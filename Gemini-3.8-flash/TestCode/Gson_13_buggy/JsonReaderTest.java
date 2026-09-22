package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.Assert;
import org.junit.Test;

public class JsonReaderTest {

  @Test
  public void constructor_givenNullReader_shouldThrowNullPointerException() {
    try {
      new JsonReader(null);
      Assert.fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      Assert.assertEquals("in == null", expected.getMessage());
    }
  }

  @Test
  public void isLenient_givenDefault_shouldReturnFalse() {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    Assert.assertFalse(reader.isLenient());
  }

  @Test
  public void setLenient_givenTrue_shouldUpdateLenient() {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.setLenient(true);
    Assert.assertTrue(reader.isLenient());
  }

  @Test
  public void beginArray_endArray_givenEmptyArray_shouldParseSuccessfully() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void beginArray_givenObjectToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    try {
      reader.beginArray();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected BEGIN_ARRAY but was BEGIN_OBJECT") != -1);
    }
  }

  @Test
  public void endArray_givenDocumentStart_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    try {
      reader.endArray();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected END_ARRAY but was BEGIN_ARRAY") != -1);
    }
  }

  @Test
  public void beginObject_endObject_givenEmptyObject_shouldParseSuccessfully() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
    Assert.assertFalse(reader.hasNext());
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void beginObject_givenArrayToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    try {
      reader.beginObject();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected BEGIN_OBJECT but was BEGIN_ARRAY") != -1);
    }
  }

  @Test
  public void endObject_givenArray_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    try {
      reader.endObject();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected END_OBJECT but was END_ARRAY") != -1);
    }
  }

  @Test
  public void hasNext_givenEmptyAndNonEmptyContainers_shouldReturnAccurately() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
  }

  @Test
  public void peek_givenVariousTokens_shouldReturnCorrectTypes() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":[true,false,null,1,\"str\"]}"));
    Assert.assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    reader.beginObject();
    Assert.assertEquals(JsonToken.NAME, reader.peek());
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    reader.beginArray();
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertFalse(reader.nextBoolean());
    Assert.assertEquals(JsonToken.NULL, reader.peek());
    reader.nextNull();
    Assert.assertEquals(JsonToken.NUMBER, reader.peek());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("str", reader.nextString());
    Assert.assertEquals(JsonToken.END_ARRAY, reader.peek());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_OBJECT, reader.peek());
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void nextBoolean_givenNonBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"true\""));
    try {
      reader.nextBoolean();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a boolean but was STRING") != -1);
    }
  }

  @Test
  public void nextNull_givenNonNull_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("123"));
    try {
      reader.nextNull();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected null but was NUMBER") != -1);
    }
  }

  @Test
  public void nextNull_givenUpperAndLowerCase_shouldConsume() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[null, NULL]"));
    reader.beginArray();
    reader.nextNull();
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void nextName_givenDoubleQuoted_shouldReturnName() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void nextName_givenSingleQuotedLenient_shouldReturnName() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{'key':'value'}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void nextName_givenUnquotedLenient_shouldReturnName() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{key:value}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void nextName_givenNotAName_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"value\"]"));
    reader.beginArray();
    try {
      reader.nextName();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a name but was STRING") != -1);
    }
  }

  @Test
  public void nextString_givenQuotedAndUnquoted_shouldParseStrings() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"hello\",'world',unquoted]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals("hello", reader.nextString());
    Assert.assertEquals("world", reader.nextString());
    Assert.assertEquals("unquoted", reader.nextString());
    reader.endArray();
  }

  @Test
  public void nextString_givenNumbersAndLongs_shouldReturnStringRepresentation() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[12345678901234, 12.34]"));
    reader.beginArray();
    Assert.assertEquals("12345678901234", reader.nextString());
    Assert.assertEquals("12.34", reader.nextString());
    reader.endArray();
  }

  @Test
  public void nextString_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    try {
      reader.nextString();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a string but was BEGIN_ARRAY") != -1);
    }
  }

  @Test
  public void nextString_givenEscapedCharacters_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"\\\"\\\\\\/\\b\\f\\n\\r\\t\\u0041\""));
    Assert.assertEquals("\"\\/\b\f\n\r\tA", reader.nextString());
  }

  @Test
  public void nextString_givenInvalidEscape_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"\\q\""));
    try {
      reader.nextString();
      Assert.fail("Expected MalformedJsonException");
    } catch (MalformedJsonException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Invalid escape sequence") != -1);
    }
  }

  @Test
  public void nextString_givenInvalidUnicodeEscape_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"\\u12G4\""));
    try {
      reader.nextString();
      Assert.fail("Expected NumberFormatException");
    } catch (NumberFormatException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("\\u12G4") != -1);
    }
  }

  @Test
  public void nextString_givenUnterminatedString_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\"unterminated"));
    try {
      reader.nextString();
      Assert.fail("Expected MalformedJsonException");
    } catch (MalformedJsonException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Unterminated string") != -1);
    }
  }

  @Test
  public void nextDouble_givenValidRepresentations_shouldReturnDouble() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123, 12.5, -0.5, 1e2, \"3.14\", '2.71']"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(123.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(12.5, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-0.5, reader.nextDouble(), 0.0001);
    Assert.assertEquals(100.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(3.14, reader.nextDouble(), 0.0001);
    Assert.assertEquals(2.71, reader.nextDouble(), 0.0001);
    reader.endArray();
  }

  @Test
  public void nextDouble_givenNaNStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("NaN"));
    try {
      reader.nextDouble();
      Assert.fail("Expected MalformedJsonException");
    } catch (MalformedJsonException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("JSON forbids NaN and infinities") != -1);
    }
  }

  @Test
  public void nextDouble_givenNaNLenient_shouldReturnNaN() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("NaN"));
    reader.setLenient(true);
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
  }

  @Test
  public void nextDouble_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    try {
      reader.nextDouble();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a double but was BEGIN_ARRAY") != -1);
    }
  }

  @Test
  public void nextLong_givenValidValues_shouldReturnLong() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0, -1, 9223372036854775807, -9223372036854775808, \"100\", '200']"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(-1L, reader.nextLong());
    Assert.assertEquals(9223372036854775807L, reader.nextLong());
    Assert.assertEquals(-9223372036854775808L, reader.nextLong());
    Assert.assertEquals(100L, reader.nextLong());
    Assert.assertEquals(200L, reader.nextLong());
    reader.endArray();
  }

  @Test
  public void nextLong_givenDoubleValue_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("12.34"));
    try {
      reader.nextLong();
      Assert.fail("Expected NumberFormatException");
    } catch (NumberFormatException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a long but was 12.34") != -1);
    }
  }

  @Test
  public void nextLong_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    try {
      reader.nextLong();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a long but was BEGIN_OBJECT") != -1);
    }
  }

  @Test
  public void nextInt_givenValidValues_shouldReturnInt() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0, -1, 2147483647, -2147483648, \"50\", '60', 70.0]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(-1, reader.nextInt());
    Assert.assertEquals(2147483647, reader.nextInt());
    Assert.assertEquals(-2147483648, reader.nextInt());
    Assert.assertEquals(50, reader.nextInt());
    Assert.assertEquals(60, reader.nextInt());
    Assert.assertEquals(70, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void nextInt_givenOutOfRangeLong_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("2147483648"));
    try {
      reader.nextInt();
      Assert.fail("Expected NumberFormatException");
    } catch (NumberFormatException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected an int but was 2147483648") != -1);
    }
  }

  @Test
  public void nextInt_givenFractionDouble_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("12.34"));
    try {
      reader.nextInt();
      Assert.fail("Expected NumberFormatException");
    } catch (NumberFormatException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected an int but was 12.34") != -1);
    }
  }

  @Test
  public void nextInt_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("null"));
    try {
      reader.nextInt();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected an int but was NULL") != -1);
    }
  }

  @Test
  public void close_givenOpenReader_shouldCloseReaderAndDisallowOperations() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.close();
    try {
      reader.peek();
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertEquals("JsonReader is closed", expected.getMessage());
    }
  }

  @Test
  public void skipValue_givenNestedData_shouldSkipCompletely() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":[1,2,{\"b\":true}],\"c\":\"skip\"}"));
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("c", reader.nextName());
    Assert.assertEquals("skip", reader.nextString());
    reader.endObject();
  }

  @Test
  public void skipValue_givenVariousLiteralsLenient_shouldSkipCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[unquoted, 'single', \"double\", 12345]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.endArray();
  }

  @Test
  public void push_givenNestingOverInitialCapacity_shouldResizeStackProperly() throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 40; i++) {
      sb.append("[");
    }
    for (int i = 0; i < 40; i++) {
      sb.append("]");
    }
    JsonReader reader = new JsonReader(new StringReader(sb.toString()));
    for (int i = 0; i < 40; i++) {
      reader.beginArray();
    }
    for (int i = 0; i < 40; i++) {
      reader.endArray();
    }
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void bom_givenUtf8BomAtDocumentStart_shouldIgnoreBom() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\ufeff{\"key\":1}"));
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void comments_givenLenient_shouldIgnoreSlashSlashAndSlashStarAndHash() throws IOException {
    String json = "// comment 1\n"
        + "# comment 2\r\n"
        + "/* comment 3 */\n"
        + "{\"key\": /* comment 4 */ \"value\"}";
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void comments_givenStrict_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("/* comment */ {}"));
    try {
      reader.beginObject();
      Assert.fail("Expected MalformedJsonException");
    } catch (MalformedJsonException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Use JsonReader.setLenient(true)") != -1);
    }
  }

  @Test
  public void comments_givenUnterminatedBlockComment_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("/* comment"));
    reader.setLenient(true);
    try {
      reader.peek();
      Assert.fail("Expected MalformedJsonException");
    } catch (MalformedJsonException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Unterminated comment") != -1);
    }
  }

  @Test
  public void nonExecutePrefix_givenLenient_shouldStripPrefix() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(")]}'\n{\"key\":\"value\"}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test
  public void delimiter_givenLenientSemicolonAndEquals_shouldAllow() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"k1\" = \"v1\"; \"k2\" => \"v2\"}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("k1", reader.nextName());
    Assert.assertEquals("v1", reader.nextString());
    Assert.assertEquals("k2", reader.nextName());
    Assert.assertEquals("v2", reader.nextString());
    reader.endObject();
  }

  @Test
  public void delimiter_givenLenientArraySeparators_shouldAllow() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1; 2, 3]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals(3, reader.nextInt());
    reader.endArray();
  }

  @Test
  public void delimiter_givenLenientTrailingOrEmptyCommas_shouldReturnNull() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[,1,]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.nextNull();
    Assert.assertEquals(1, reader.nextInt());
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void getPath_givenVariousPositions_shouldReturnCorrectJsonPath() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":[10,{\"b\":true}]}"));
    Assert.assertEquals("$", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.", reader.getPath());
    reader.nextName();
    Assert.assertEquals("$.a", reader.getPath());
    reader.beginArray();
    Assert.assertEquals("$.a[0]", reader.getPath());
    reader.nextInt();
    Assert.assertEquals("$.a[1]", reader.getPath());
    reader.beginObject();
    Assert.assertEquals("$.a[1].", reader.getPath());
    reader.nextName();
    Assert.assertEquals("$.a[1].b", reader.getPath());
    reader.nextBoolean();
    Assert.assertEquals("$.a[1].b", reader.getPath());
    reader.endObject();
    Assert.assertEquals("$.a[2]", reader.getPath());
    reader.endArray();
    Assert.assertEquals("$.a", reader.getPath());
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
  }

  @Test
  public void toString_givenReader_shouldReturnClassNameAndLocation() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    String str = reader.toString();
    Assert.assertTrue(str.indexOf("JsonReader at line 1 column 2 path $[0]") != -1);
  }

  @Test
  public void promoteNameToValue_givenNameToken_shouldPromoteToValue() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"name\":1}"));
    reader.beginObject();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("name", reader.nextString());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void promoteNameToValue_givenInvalidToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    try {
      JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expected a name") != -1);
    }
  }

  @Test
  public void numberParsing_givenEdgeCases_shouldParseAccurately() throws IOException {
    String json = "[0, -0, 1.0e-2, 2.5E+2, -128, -9223372036854775808, 9223372036854775807]";
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(0.01, reader.nextDouble(), 0.0001);
    Assert.assertEquals(250.0, reader.nextDouble(), 0.000