package com.google.gson.internal;

import com.google.gson.stream.JsonToken;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.*;

public class JsonReaderTest {
    private JsonReader reader;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    @Test
    public void testConstructorWithNullReader() {
        try {
            new JsonReader(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testLenientDefaultFalse() {
        reader = new JsonReader(new StringReader("{}"));
        assertFalse(reader.isLenient());
    }

    @Test
    public void testSetLenientAndIsLenient() {
        reader = new JsonReader(new StringReader("{}"));
        reader.setLenient(true);
        assertTrue(reader.isLenient());
        reader.setLenient(false);
        assertFalse(reader.isLenient());
    }

    @Test
    public void testPeekEmptyDocument() throws IOException {
        reader = new JsonReader(new StringReader(""));
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testBeginArrayAndPeek() throws IOException {
        reader = new JsonReader(new StringReader("[1,2,3]"));
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals(JsonToken.NUMBER, reader.peek());
        reader.nextDouble();
        reader.nextDouble();
        reader.nextDouble();
        assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
    }

    @Test
    public void testEndArrayWithNoBegin() throws IOException {
        reader = new JsonReader(new StringReader("]"));
        try {
            reader.endArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testBeginObjectAndEndObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":\"value\"}"));
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.nextName();
        assertEquals(JsonToken.STRING, reader.peek());
        reader.nextString();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
    }

    @Test
    public void testEndObjectWithNoBegin() throws IOException {
        reader = new JsonReader(new StringReader("}"));
        try {
            reader.endObject();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testHasNextInArray() throws IOException {
        reader = new JsonReader(new StringReader("[1,2]"));
        reader.beginArray();
        assertTrue(reader.hasNext());
        reader.nextDouble();
        assertTrue(reader.hasNext());
        reader.nextDouble();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testNextNameUnquoted() throws IOException {
        reader = new JsonReader(new StringReader("{name:value}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testNextNameDoubleQuoted() throws IOException {
        reader = new JsonReader(new StringReader("{\"name\":\"value\"}"));
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testNextNameSingleQuoted() throws IOException {
        reader = new JsonReader(new StringReader("{'name':'value'}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testNextNameInvalid() throws IOException {
        reader = new JsonReader(new StringReader("{\"name\"}"));
        reader.beginObject();
        try {
            reader.nextName();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextStringUnquoted() throws IOException {
        reader = new JsonReader(new StringReader("hello"));
        reader.setLenient(true);
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextStringDoubleQuotedWithEscapes() throws IOException {
        reader = new JsonReader(new StringReader("\"line1\\nline2\\t\\b\\r\\f\\\\\\/\\\"\""));
        assertEquals("line1\nline2\t\b\r\f\\/\"" , reader.nextString());
    }

    @Test
    public void testNextStringDoubleQuotedUnicode() throws IOException {
        reader = new JsonReader(new StringReader("\"\\u0041\\u0042\""));
        assertEquals("AB", reader.nextString());
    }

    @Test
    public void testNextStringInvalid() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        try {
            reader.nextString();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
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
    public void testNextBooleanInvalid() throws IOException {
        reader = new JsonReader(new StringReader("1"));
        try {
            reader.nextBoolean();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextNullValid() throws IOException {
        reader = new JsonReader(new StringReader("null"));
        reader.nextNull();
    }

    @Test
    public void testNextNullInvalid() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        try {
            reader.nextNull();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextDoubleLongValue() throws IOException {
        reader = new JsonReader(new StringReader("123"));
        assertEquals(123.0, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextDoubleNumberValue() throws IOException {
        reader = new JsonReader(new StringReader("123.45"));
        assertEquals(123.45, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDoubleStringValue() throws IOException {
        reader = new JsonReader(new StringReader("\"123.45\""));
        assertEquals(123.45, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDoubleInvalid() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        try {
            reader.nextDouble();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextLongLongValue() throws IOException {
        reader = new JsonReader(new StringReader("123456789"));
        assertEquals(123456789L, reader.nextLong());
    }

    @Test
    public void testNextLongDoubleValue() throws IOException {
        reader = new JsonReader(new StringReader("123.0"));
        try {
            reader.nextLong();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testNextLongTooLarge() throws IOException {
        reader = new JsonReader(new StringReader("9223372036854775808"));
        try {
            reader.nextLong();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testNextLongInvalidType() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        try {
            reader.nextLong();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextIntIntValue() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testNextIntTooLarge() throws IOException {
        reader = new JsonReader(new StringReader("2147483648"));
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testNextIntLongValue() throws IOException {
        reader = new JsonReader(new StringReader("2147483648"));
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
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
        reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.skipValue();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testSkipValueUnquoted() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        reader.setLenient(true);
        reader.skipValue();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testGetPathNested() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":[1,2]}"));
        reader.beginObject();
        reader.nextName();
        assertEquals("$.a", reader.getPath());
        reader.beginArray();
        reader.nextDouble();
        assertEquals("$.a[0]", reader.getPath());
        reader.nextDouble();
        assertEquals("$.a[1]", reader.getPath());
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testGetPathRoot() throws IOException {
        reader = new JsonReader(new StringReader("1"));
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testNextNameAfterEndObject() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.beginObject();
        reader.endObject();
        try {
            reader.nextName();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNextStringAfterEndArray() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        reader.endArray();
        try {
            reader.nextString();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }
}