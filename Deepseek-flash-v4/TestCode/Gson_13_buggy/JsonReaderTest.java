package com.google.gson.internal;

import com.google.gson.stream.JsonToken;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.StringReader;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class JsonReaderTest {
    private JsonReader reader;

    @Before
    public void setUp() {
        // No explicit setup needed; each test creates its own reader
    }

    @After
    public void tearDown() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    private JsonReader createReader(String json) {
        return new JsonReader(new StringReader(json));
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
    public void testIsLenientDefaultFalse() {
        reader = createReader("{}");
        assertFalse(reader.isLenient());
    }

    @Test
    public void testSetLenientAndIsLenient() {
        reader = createReader("{}");
        reader.setLenient(true);
        assertTrue(reader.isLenient());
        reader.setLenient(false);
        assertFalse(reader.isLenient());
    }

    @Test
    public void testBeginArrayAndEndArray() throws IOException {
        reader = createReader("[1,2,3]");
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertEquals(JsonToken.NUMBER, reader.peek());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testBeginArrayThrowsOnObject() {
        reader = createReader("{\"a\":1}");
        try {
            reader.beginArray();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testBeginObjectAndEndObject() throws IOException {
        reader = createReader("{\"name\":\"value\"}");
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testHasNextWithArrayElements() throws IOException {
        reader = createReader("[1,2]");
        reader.beginArray();
        assertTrue(reader.hasNext());
        reader.nextInt();
        assertTrue(reader.hasNext());
        reader.nextInt();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testPeekReturnsJsonTokens() throws IOException {
        reader = createReader("true");
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertEquals(true, reader.nextBoolean());
    }

    @Test
    public void testNextNameWithUnquotedName() throws IOException {
        reader = createReader("{name:123}");
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("name", reader.nextName());
        assertEquals(123, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testNextStringWithUnquotedValue() throws IOException {
        reader = createReader("hello");
        reader.setLenient(true);
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextStringWithSingleQuotedValue() throws IOException {
        reader = createReader("'abc'");
        reader.setLenient(true);
        assertEquals("abc", reader.nextString());
    }

    @Test
    public void testNextBooleanTrueAndFalse() throws IOException {
        reader = createReader("true false");
        assertEquals(true, reader.nextBoolean());
        assertEquals(false, reader.nextBoolean());
    }

    @Test
    public void testNextBooleanThrowsOnNonBoolean() {
        reader = createReader("1");
        try {
            reader.nextBoolean();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNextNullWithNullValue() throws IOException {
        reader = createReader("null");
        reader.nextNull();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNextNullThrowsOnNonNull() {
        reader = createReader("5");
        try {
            reader.nextNull();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNextDoubleWithInteger() throws IOException {
        reader = createReader("42");
        assertEquals(42.0, reader.nextDouble(), 0.001);
    }

    @Test
    public void testNextDoubleWithFraction() throws IOException {
        reader = createReader("3.14");
        assertEquals(3.14, reader.nextDouble(), 0.001);
    }

    @Test
    public void testNextDoubleWithExponent() throws IOException {
        reader = createReader("1.5e2");
        assertEquals(150.0, reader.nextDouble(), 0.001);
    }

    @Test
    public void testNextLongWithInteger() throws IOException {
        reader = createReader("1234567890");
        assertEquals(1234567890L, reader.nextLong());
    }

    @Test
    public void testNextLongThrowsOnOverflow() {
        reader = createReader("999999999999999999999");
        try {
            reader.nextLong();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testNextIntWithValidValue() throws IOException {
        reader = createReader("-123");
        assertEquals(-123, reader.nextInt());
    }

    @Test
    public void testNextIntWithOverflow() {
        reader = createReader("2147483648");
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testSkipValueWithArray() throws IOException {
        reader = createReader("[[1,2],3]");
        reader.beginArray();
        reader.skipValue();
        assertEquals(3, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testSkipValueWithObject() throws IOException {
        reader = createReader("{\"a\":{\"b\":1},\"c\":2}");
        reader.beginObject();
        reader.nextName();
        reader.skipValue();
        assertEquals("c", reader.nextName());
        reader.endObject();
    }

    @Test
    public void testGetPathForNestedArrays() throws IOException {
        reader = createReader("[[1]]");
        reader.beginArray();
        reader.beginArray();
        reader.nextInt();
        assertTrue(reader.getPath().contains("$[0][0]"));
        reader.endArray();
        reader.endArray();
    }

    @Test
    public void testCloseOperation() throws IOException {
        reader = createReader("{}");
        reader.close();
        reader.close(); // double close should not throw
    }

    @Test
    public void testNextStringFromNumber() throws IOException {
        reader = createReader("123");
        assertEquals("123", reader.nextString());
    }

    @Test
    public void testNextStringOnBooleanThrows() {
        reader = createReader("true");
        try {
            reader.nextString();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testPeekAfterEndOfItem() throws IOException {
        reader = createReader("[] ");
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testLocationString() throws IOException {
        reader = createReader("\n  \"a\"");
        reader.nextString();
        String loc = reader.getPath();
        assertTrue(loc.startsWith("$"));
    }

    @Test
    public void testNextIntUsesPeekedLong() throws IOException {
        reader = createReader("5");
        assertEquals(5, reader.nextInt());
    }

    @Test
    public void testNextLongOnNumber() throws IOException {
        reader = createReader("1234567890123");
        assertEquals(1234567890123L, reader.nextLong());
    }

    @Test
    public void testSkipValueOnPrimitive() throws IOException {
        reader = createReader("true,false");
        reader.skipValue();
        // After skipping "true", next token should be comma then false
        assertTrue(reader.hasNext());
        assertEquals(false, reader.nextBoolean());
    }

    @Test
    public void testPeekWhilePeekedIsSet() throws IOException {
        reader = createReader("\"value\"");
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals(JsonToken.STRING, reader.peek()); // peeked remains
        reader.nextString();
    }

    @Test
    public void testNextNameOnPrimitiveThrows() throws IOException {
        reader = createReader("123");
        try {
            reader.nextName();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNextBooleanOnStringThrows() throws IOException {
        reader = createReader("\"true\"");
        try {
            reader.nextBoolean();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNextNullOnNullInput() throws IOException {
        reader = createReader("null");
        reader.nextNull();
        try {
            reader.nextNull();
            fail("Expected IllegalStateException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNextStringOnUnquotedNumber() throws IOException {
        reader = createReader("42");
        assertEquals("42", reader.nextString());
    }

    @Test
    public void testMultipleArrays() throws IOException {
        reader = createReader("[1][2]");
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        reader.endArray();
        reader.beginArray();
        assertEquals(2, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testObjectsInArray() throws IOException {
        reader = createReader("[{\"a\":1},{\"b\":2}]");
        reader.beginArray();
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.nextInt();
        reader.endObject();
        reader.beginObject();
        assertEquals("b", reader.nextName());
        reader.nextInt();
        reader.endObject();
        reader.endArray();
    }

    @Test
    public void testLenientCommaAllowedInArray() throws IOException {
        reader = createReader("[1,2,]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertEquals(2, reader.nextInt());
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testLenientCommentsInJson() throws IOException {
        reader = createReader("/* comment */ [1]");
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testSkipValueAtEndOfObject() throws IOException {
        reader = createReader("{\"a\":1}");
        reader.beginObject();
        reader.nextName();
        reader.skipValue(); // skip value 1
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
    }

    @Test
    public void testNextIntFitsLongButNotInt() throws IOException {
        reader = createReader("2147483648"); // > Integer.MAX_VALUE
        try {
            reader.nextInt();
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }
}