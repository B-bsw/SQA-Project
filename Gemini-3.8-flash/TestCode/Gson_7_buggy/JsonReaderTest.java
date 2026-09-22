package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import org.junit.Assert;
import org.junit.Test;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class JsonReaderTest {

  @Test(expected = NullPointerException.class)
  public void constructor_givenNullReader_shouldThrowNullPointerException() {
    new JsonReader(null);
  }

  @Test
  public void setLenient_givenTrueOrFalse_shouldUpdateLenientFlag() {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    Assert.assertFalse(reader.isLenient());
    reader.setLenient(true);
    Assert.assertTrue(reader.isLenient());
    reader.setLenient(false);
    Assert.assertFalse(reader.isLenient());
  }

  @Test
  public void emptyArray_givenEmptyArrayJson_shouldReadSuccessfully() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginArray();
    Assert.assertFalse(reader.hasNext());
    reader.endArray();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void emptyObject_givenEmptyObjectJson_shouldReadSuccessfully() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginObject();
    Assert.assertFalse(reader.hasNext());
    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void simpleObject_givenKeyValuePairs_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"name\":\"test\",\"age\":30,\"valid\":true,\"note\":null}"));
    reader.beginObject();
    Assert.assertTrue(reader.hasNext());
    Assert.assertEquals("name", reader.nextName());
    Assert.assertEquals("test", reader.nextString());

    Assert.assertEquals("age", reader.nextName());
    Assert.assertEquals(30, reader.nextInt());

    Assert.assertEquals("valid", reader.nextName());
    Assert.assertTrue(reader.nextBoolean());

    Assert.assertEquals("note", reader.nextName());
    reader.nextNull();

    reader.endObject();
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test(expected = IllegalStateException.class)
  public void beginArray_givenObjectToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.beginArray();
  }

  @Test(expected = IllegalStateException.class)
  public void endArray_givenOpenArray_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1"));
    reader.beginArray();
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void beginObject_givenArrayToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[]"));
    reader.beginObject();
  }

  @Test(expected = IllegalStateException.class)
  public void endObject_givenOpenObject_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1"));
    reader.beginObject();
    reader.endObject();
  }

  @Test
  public void nextBoolean_givenBooleans_shouldReturnCorrectValues() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true, false, TRUE, FALSE]"));
    reader.beginArray();
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    reader.endArray();
  }

  @Test(expected = IllegalStateException.class)
  public void nextBoolean_givenNumber_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    reader.nextBoolean();
  }

  @Test(expected = IllegalStateException.class)
  public void nextNull_givenNonNull_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123]"));
    reader.beginArray();
    reader.nextNull();
  }

  @Test
  public void nextDouble_givenVariousFormats_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0.0, -0.5, 123, 1.2e3, -1.2E-3, \"3.1415\", '2.718']"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-0.5, reader.nextDouble(), 0.0001);
    Assert.assertEquals(123.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(1200.0, reader.nextDouble(), 0.0001);
    Assert.assertEquals(-0.0012, reader.nextDouble(), 0.000001);
    Assert.assertEquals(3.1415, reader.nextDouble(), 0.0001);
    Assert.assertEquals(2.718, reader.nextDouble(), 0.0001);
    reader.endArray();
  }

  @Test
  public void nextDouble_givenUnquotedStringInLenient_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[NaN, Infinity, -Infinity]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertTrue(Double.isNaN(reader.nextDouble()));
    Assert.assertEquals(Double.POSITIVE_INFINITY, reader.nextDouble(), 0.0);
    Assert.assertEquals(Double.NEGATIVE_INFINITY, reader.nextDouble(), 0.0);
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void nextDouble_givenNaNInNonLenient_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[NaN]"));
    reader.beginArray();
    reader.nextDouble();
  }

  @Test(expected = IllegalStateException.class)
  public void nextDouble_givenBoolean_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[true]"));
    reader.beginArray();
    reader.nextDouble();
  }

  @Test
  public void nextLong_givenBoundaryLongs_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0, -0, 9223372036854775807, -9223372036854775808, \"12345\", '67890', \"1e2\"]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(0L, reader.nextLong());
    Assert.assertEquals(Long.MAX_VALUE, reader.nextLong());
    Assert.assertEquals(Long.MIN_VALUE, reader.nextLong());
    Assert.assertEquals(12345L, reader.nextLong());
    Assert.assertEquals(67890L, reader.nextLong());
    Assert.assertEquals(100L, reader.nextLong());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void nextLong_givenFractionDoubleString_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"123.45\"]"));
    reader.beginArray();
    reader.nextLong();
  }

  @Test(expected = IllegalStateException.class)
  public void nextLong_givenObject_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[{}]"));
    reader.beginArray();
    reader.nextLong();
  }

  @Test
  public void nextInt_givenValidValues_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[0, -2147483648, 2147483647, \"123\", '456', \"2.0e1\"]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(0, reader.nextInt());
    Assert.assertEquals(Integer.MIN_VALUE, reader.nextInt());
    Assert.assertEquals(Integer.MAX_VALUE, reader.nextInt());
    Assert.assertEquals(123, reader.nextInt());
    Assert.assertEquals(456, reader.nextInt());
    Assert.assertEquals(20, reader.nextInt());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void nextInt_givenOverflowLong_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[2147483648]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = NumberFormatException.class)
  public void nextInt_givenFractionString_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"12.34\"]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test(expected = IllegalStateException.class)
  public void nextInt_givenNull_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[null]"));
    reader.beginArray();
    reader.nextInt();
  }

  @Test
  public void nextString_givenNumbersAndBooleans_shouldConvertToString() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[123456789012345, 12.5, true, false, null]"));
    reader.beginArray();
    Assert.assertEquals("123456789012345", reader.nextString());
    Assert.assertEquals("12.5", reader.nextString());
    Assert.assertEquals(JsonToken.BOOLEAN, reader.peek());
    Assert.assertTrue(reader.nextBoolean());
    Assert.assertFalse(reader.nextBoolean());
    reader.nextNull();
    reader.endArray();
  }

  @Test
  public void nextString_givenQuotedAndUnquoted_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"double\", 'single', unquoted]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals("double", reader.nextString());
    Assert.assertEquals("single", reader.nextString());
    Assert.assertEquals("unquoted", reader.nextString());
    reader.endArray();
  }

  @Test
  public void nextString_givenEscapeCharacters_shouldUnescapeProperly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\u0041\\t\\b\\n\\r\\f\\\'\\\"\\\\\"]"));
    reader.beginArray();
    Assert.assertEquals("A\t\b\n\r\f\'\"\\", reader.nextString());
    reader.endArray();
  }

  @Test(expected = NumberFormatException.class)
  public void nextString_givenInvalidHexEscape_shouldThrowNumberFormatException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\u004G\"]"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void nextString_givenUnterminatedEscape_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"\\"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = MalformedJsonException.class)
  public void nextString_givenUnterminatedString_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"unterminated"));
    reader.beginArray();
    reader.nextString();
  }

  @Test(expected = IllegalStateException.class)
  public void nextString_givenObjectToken_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{}"));
    reader.nextString();
  }

  @Test
  public void nextName_givenSingleQuotedAndUnquotedInLenient_shouldParseCorrectly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{'a':1, b:2, \"c\":3}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals(2, reader.nextInt());
    Assert.assertEquals("c", reader.nextName());
    Assert.assertEquals(3, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void nextName_whenNotPeekingName_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
    reader.beginObject();
    reader.nextName();
    reader.nextName();
  }

  @Test
  public void skipValue_givenComplexStructure_shouldSkipCompletely() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"skip\": [1, 2, {\"nested\": 'val', unquoted: 123}], \"keep\": 42}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("skip", reader.nextName());
    reader.skipValue();
    Assert.assertEquals("keep", reader.nextName());
    Assert.assertEquals(42, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void skipValue_givenSimpleTokens_shouldSkip() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[\"str\", 'str2', 123, unq, true, false, null]"));
    reader.setLenient(true);
    reader.beginArray();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.skipValue();
    reader.endArray();
  }

  @Test
  public void getPath_givenNestedArraysAndObjects_shouldReflectStateAccurately() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\": [1, {\"b\": 2}], \"c\": 3}"));
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
    reader.nextInt();
    reader.endObject();
    Assert.assertEquals("$.a[2]", reader.getPath());
    reader.endArray();
    reader.nextName();
    Assert.assertEquals("$.c", reader.getPath());
    reader.nextInt();
    reader.endObject();
    Assert.assertEquals("$", reader.getPath());
  }

  @Test
  public void close_whenCalled_subsequentOperationsShouldFail() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1, 2]"));
    reader.beginArray();
    reader.close();
    try {
      reader.peek();
      Assert.fail("Expected IllegalStateException after close");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void comments_givenLenient_shouldBeIgnored() throws IOException {
    String json = "// comment line\n"
        + "/* block comment */\n"
        + "# hash comment\n"
        + "{\"key\": /* comment */ \"value\" // end\n"
        + "}";
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals("value", reader.nextString());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void comments_givenNonLenient_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("// comment\n{}"));
    reader.beginObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void comments_givenUnterminatedBlockComment_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("/* comment"));
    reader.setLenient(true);
    reader.peek();
  }

  @Test
  public void nonExecutePrefix_givenLenient_shouldBeIgnored() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(")]}'\n{\"key\": 1}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void bom_givenUtf8BOM_shouldBeIgnored() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("\ufeff{\"key\": 1}"));
    reader.beginObject();
    Assert.assertEquals("key", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    reader.endObject();
  }

  @Test
  public void nameSeparators_givenLenient_shouldSupportEqualsAndArrow() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\" = 1, \"b\" => 2}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals(2, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void nameSeparators_givenMissingColon_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\" 1}"));
    reader.beginObject();
    reader.nextName();
  }

  @Test
  public void arraySeparators_givenSemicolonAndTrailingCommaInLenient_shouldParse() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1; 2,]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals(2, reader.nextInt());
    reader.nextNull();
    reader.endArray();
  }

  @Test(expected = MalformedJsonException.class)
  public void arraySeparators_givenUnterminatedArray_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1 2]"));
    reader.beginArray();
    reader.nextInt();
    reader.nextInt();
  }

  @Test
  public void objectSeparators_givenSemicolonInLenient_shouldParse() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1; \"b\":2}"));
    reader.setLenient(true);
    reader.beginObject();
    Assert.assertEquals("a", reader.nextName());
    Assert.assertEquals(1, reader.nextInt());
    Assert.assertEquals("b", reader.nextName());
    Assert.assertEquals(2, reader.nextInt());
    reader.endObject();
  }

  @Test(expected = MalformedJsonException.class)
  public void objectSeparators_givenUnterminatedObject_shouldThrowMalformedJsonException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"a\":1 \"b\":2}"));
    reader.beginObject();
    reader.nextName();
    reader.nextInt();
    reader.nextName();
  }

  @Test
  public void toString_shouldIncludeClassLineAndColumn() {
    JsonReader reader = new JsonReader(new StringReader("   {}"));
    String str = reader.toString();
    Assert.assertTrue(str.startsWith("JsonReader at line 1 column "));
  }

  @Test(expected = EOFException.class)
  public void emptyDocument_whenPeeking_shouldThrowEOFException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(""));
    reader.peek();
  }

  @Test
  public void stackGrowth_givenDeepNesting_shouldResizeStackWithoutError() throws IOException {
    int depth = 40;
    char[] openBrackets = new char[depth];
    char[] closeBrackets = new char[depth];
    Arrays.fill(openBrackets, '[');
    Arrays.fill(closeBrackets, ']');
    String json = new String(openBrackets) + "1" + new String(closeBrackets);

    JsonReader reader = new JsonReader(new StringReader(json));
    for (int i = 0; i < depth; i++) {
      reader.beginArray();
    }
    Assert.assertEquals(1, reader.nextInt());
    for (int i = 0; i < depth; i++) {
      reader.endArray();
    }
    Assert.assertEquals(JsonToken.END_DOCUMENT, reader.peek());
  }

  @Test
  public void bufferBoundary_givenVeryLongUnquotedString_shouldReadAcrossBuffers() throws IOException {
    char[] chars = new char[2048];
    Arrays.fill(chars, 'a');
    String bigUnquoted = new String(chars);

    JsonReader reader = new JsonReader(new StringReader(bigUnquoted));
    reader.setLenient(true);
    Assert.assertEquals(bigUnquoted, reader.nextString());
  }

  @Test
  public void bufferBoundary_givenVeryLongQuotedString_shouldReadAcrossBuffers() throws IOException {
    char[] chars = new char[2048];
    Arrays.fill(chars, 'x');
    String bigQuoted = "\"" + new String(chars) + "\"";

    JsonReader reader = new JsonReader(new StringReader(bigQuoted));
    Assert.assertEquals(new String(chars), reader.nextString());
  }

  @Test
  public void bufferBoundary_givenLongComments_shouldSkipAcrossBuffers() throws IOException {
    char[] chars = new char[2048];
    Arrays.fill(chars, 'c');
    String longComment = "/*" + new String(chars) + "*/ 123";

    JsonReader reader = new JsonReader(new StringReader(longComment));
    reader.setLenient(true);
    Assert.assertEquals(123, reader.nextInt());
  }

  @Test
  public void numbers_givenSignsAndExponents_shouldParseProperly() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[+0, -0, 1e+2, 2E-3, -3e4]"));
    reader.setLenient(true);
    reader.beginArray();
    Assert.assertEquals("0", reader.nextString());
    Assert.assertEquals("0", reader.nextString());
    Assert.assertEquals("1e+2", reader.nextString());
    Assert.assertEquals("2E-3", reader.nextString());
    Assert.assertEquals("-3e4", reader.nextString());
    reader.endArray();
  }

  @Test
  public void promoteNameToValue_givenNameTokens_shouldPromoteToValue() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("{\"quoted\":1, 'single':2, unquoted:3}"));
    reader.setLenient(true);
    reader.beginObject();

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("quoted", reader.nextString());
    Assert.assertEquals(1, reader.nextInt());

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("single", reader.nextString());
    Assert.assertEquals(2, reader.nextInt());

    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
    Assert.assertEquals(JsonToken.STRING, reader.peek());
    Assert.assertEquals("unquoted", reader.nextString());
    Assert.assertEquals(3, reader.nextInt());

    reader.endObject();
  }

  @Test(expected = IllegalStateException.class)
  public void promoteNameToValue_givenNonName_shouldThrowIllegalStateException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader("[1]"));
    reader.beginArray();
    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(reader);
  }
}