package com.google.gson.internal;

import com.google.gson.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsonReaderTest {
    private JsonReader reader;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                // Ignore
            }
        }
    }

    @Test
    public void testConstructorWithNullReader() {
        try {
            new JsonReader(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testIsLenientDefault() {
        reader = new JsonReader(new StringReader("[]"));
        assertFalse(reader.isLenient());
    }

    @Test
    public void testSetLenientTrue() {
        reader = new JsonReader(new StringReader("[]"));
        reader.setLenient(true);
        assertTrue(reader.isLenient());
    }

    @Test
    public void testBeginArrayEmpty() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals(JsonToken.END_ARRAY, reader.peek());
    }

    @Test
    public void testBeginArrayWithElement() throws IOException {
        reader = new JsonReader(new StringReader("[1]"));
        reader.beginArray();
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(1, reader.nextInt());
        assertEquals(JsonToken.END_ARRAY, reader.peek());
    }

    @Test
    public void testBeginArrayUnexpectedToken() {
        reader = new JsonReader(new StringReader("{}"));
        try {
            reader.beginArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException | IOException e) {
            // Expected
        }
    }

    @Test
    public void testEndArrayMismatch() {
        reader = new JsonReader(new StringReader("[}");
        try {
            reader.beginArray();
            reader.endArray();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testBeginObjectEmpty() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.beginObject();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
    }

    @Test
    public void testBeginObjectWithProperties() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("key", reader.nextName());
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("value", reader.nextString());
        assertEquals(JsonToken.END_OBJECT, reader.peek());
    }

    @Test
    public void testEndObjectMismatch() {
        reader = new JsonReader(new StringReader("{]"));
        try {
            reader.beginObject();
            reader.endObject();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testHasNextInArray() throws IOException {
        reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals(1, reader.nextInt());
        assertTrue(reader.hasNext());
        assertEquals(2, reader.nextInt());
        assertEquals(3, reader.nextInt());
        assertFalse(reader.hasNext());
    }

    @Test
    public void testPeekTypes() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertTrue(reader.nextBoolean());

        reader = new JsonReader(new StringReader("null"));
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();

        reader = new JsonReader(new StringReader("123"));
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(123, reader.nextInt());
    }

    @Test
    public void testNextNameUnquoted() throws IOException {
        reader = new JsonReader(new StringReader("{name:value}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
    }

    @Test
    public void testNextNameSingleQuoted() throws IOException {
        reader = new JsonReader(new StringReader("{'name':'value'}"));
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
    }

    @Test
    public void testNextNameInvalid() {
        reader = new JsonReader(new StringReader("{123}"));
        try {
            reader.beginObject();
            reader.nextName();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNextStringFromNumber() throws IOException {
        reader = new JsonReader(new StringReader("123"));
        assertEquals("123", reader.nextString());
    }

    @Test
    public void testNextStringFromBoolean() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        assertEquals("true", reader.nextString());
    }

    @Test
    public void testNextStringFromNull() throws IOException {
        reader = new JsonReader(new StringReader("null"));
        try {
            reader.nextString();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNextBooleanTrue() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        assertTrue(reader.nextBoolean());
    }

    @Test
    public void testNextBooleanFalse() throws IOException {
        reader = new JsonReader(new StringReader("false"));
        assertFalse(reader.nextBoolean());
    }

    @Test
    public void testNextBooleanInvalid() {
        reader = new JsonReader(new StringReader("123"));
        try {
            reader.nextBoolean();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNextNullValid() throws IOException {
        reader = new JsonReader(new StringReader("null"));
        reader.nextNull();
    }

    @Test
    public void testNextNullInvalid() {
        reader = new JsonReader(new StringReader("123"));
        try {
            reader.nextNull();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNextDoubleFromLong() throws IOException {
        reader = new JsonReader(new StringReader("123"));
        assertEquals(123.0, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextDoubleFromNumber() throws IOException {
        reader = new JsonReader(new StringReader("1.5"));
        assertEquals(1.5, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextDoubleFromString() throws IOException {
        reader = new JsonReader(new StringReader("\"1.5\""));
        assertEquals(1.5, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextDoubleInvalid() {
        reader = new JsonReader(new StringReader("["));
        try {
            reader.nextDouble();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNextIntFromLong() throws IOException {
        reader = new JsonReader(new StringReader("123"));
        assertEquals(123, reader.nextInt());
    }

    @Test
    public void testNextIntTooLarge() {
        reader = new JsonReader(new StringReader("3000000000"));
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (IOException | NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testNextIntInvalidType() {
        reader = new JsonReader(new StringReader("true"));
        try {
            reader.nextInt();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testSkipValueArray() throws IOException {
        reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.skipValue();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testSkipValueObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        reader.skipValue();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testSkipValuePrimitive() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        reader.skipValue();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testClose() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.close();
        try {
            reader.peek();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testGetPathInArray() throws IOException {
        reader = new JsonReader(new StringReader("[1,2]"));
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        reader.nextInt();
        assertEquals("$[1]", reader.getPath());
    }

    @Test
    public void testGetPathInObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        reader.beginObject();
        reader.nextName();
        assertEquals("$.key", reader.getPath());
    }

    @Test
    public void testToString() {
        reader = new JsonReader(new StringReader("[]"));
        assertEquals("JsonReader", reader.toString());
    }

    @Test
    public void testComments() throws IOException {
        reader = new JsonReader(new StringReader("// comment\n[1]"));
        reader.setLenient(true);
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    }

    @Test
    public void testBlockComment() throws IOException {
        reader = new JsonReader(new StringReader("/* comment */[1]"));
        reader.setLenient(true);
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    }

    @Test
    public void testHashComment() throws IOException {
        reader = new JsonReader(new StringReader("# comment\n[1]"));
        reader.setLenient(true);
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
    }

    @Test
    public void testUnterminatedBlockComment() {
        reader = new JsonReader(new StringReader("/* comment"));
        reader.setLenient(true);
        try {
            reader.peek();
            fail("Expected EOFException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testPromoteNameToValueObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":true}"));
        reader.setLenient(true);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("key", reader.nextString());
    }

    @Test
    public void testPromoteNameToValueArray() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        reader.setLenient(true);
        try {
            reader.promoteNameToValue();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeCharacters() throws IOException {
        reader = new JsonReader(new StringReader("\"\\t\\n\\r\\b\\f\\\"\\\\\""));
        assertEquals("\t\n\r\b\f\"\\", reader.nextString());
    }

    @Test
    public void testUnicodeEscape() throws IOException {
        reader = new JsonReader(new StringReader("\"\\u0041\""));
        assertEquals("A", reader.nextString());
    }

    @Test
    public void testInvalidEscape() {
        reader = new JsonReader(new StringReader("\"\\x\""));
        try {
            reader.nextString();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testNextLongBoundary() throws IOException {
        reader = new JsonReader(new StringReader(String.valueOf(Long.MAX_VALUE)));
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testNextLongOverflow() {
        reader = new JsonReader(new StringReader("9223372036854775808"));
        try {
            reader.nextLong();
            fail("Expected NumberFormatException");
        } catch (IOException | NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testMultipleValuesInArray() throws IOException {
        reader = new JsonReader(new StringReader("[\"a\",\"b\",\"c\"]"));
        reader.beginArray();
        assertEquals("a", reader.nextString());
        assertEquals("b", reader.nextString());
        assertEquals("c", reader.nextString());
        assertEquals(JsonToken.END_ARRAY, reader.peek());
    }

    @Test
    public void testNestedStructures() throws IOException {
        reader = new JsonReader(new StringReader("{\"array\":[1,{\"key\":2}]}"));
        reader.beginObject();
        assertEquals("array", reader.nextName());
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        reader.beginObject();
        assertEquals("key", reader.nextName());
        assertEquals(2, reader.nextInt());
        reader.endObject();
        reader.endArray();
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }
}