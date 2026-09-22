package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.Map;
import static org.junit.Assert.*;

public class JsonTreeReaderTest {

    private JsonTreeReader reader;

    @Before
    public void setUp() {
        // Initialization if needed, default null
    }

    @After
    public void tearDown() {
        reader = null;
    }

    @Test
    public void testBeginArrayAndEndArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add("value1");
        array.add(123);
        reader = new JsonTreeReader(array);
        
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("value1", reader.nextString());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(123, reader.nextInt());
        assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testBeginObjectAndEndObject() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        reader = new JsonTreeReader(object);
        
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("key", reader.nextName());
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("value", reader.nextString());
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testHasNextWithNullElement() throws IOException {
        JsonObject object = new JsonObject();
        object.add("key", JsonNull.INSTANCE);
        reader = new JsonTreeReader(object);
        
        assertTrue(reader.hasNext());
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals("key", reader.nextName());
        reader.nextNull();
        assertFalse(reader.hasNext());
        reader.endObject();
        assertFalse(reader.hasNext());
    }

    @Test
    public void testNextStringWithNumberAndString() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive("test");
        reader = new JsonTreeReader(primitive);
        assertEquals("test", reader.nextString());
        
        JsonPrimitive number = new JsonPrimitive(123);
        reader = new JsonTreeReader(number);
        assertEquals("123", reader.nextString());
    }

    @Test
    public void testNextBoolean() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(true);
        reader = new JsonTreeReader(primitive);
        assertTrue(reader.nextBoolean());
        
        primitive = new JsonPrimitive(false);
        reader = new JsonTreeReader(primitive);
        assertFalse(reader.nextBoolean());
    }

    @Test
    public void testNextNullNormalElement() throws IOException {
        reader = new JsonTreeReader(JsonNull.INSTANCE);
        assertNull(reader.peek());
        reader.nextNull();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextDoubleWithInvalidToken() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("not-a-number"));
        reader.nextDouble();
    }

    @Test
    public void testNextDoubleWithNumber() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(3.14);
        reader = new JsonTreeReader(primitive);
        assertEquals(3.14, reader.nextDouble(), 0.0001);
    }

    @Test
    public void testNextDoubleWithStringNumber() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive("42.5");
        reader = new JsonTreeReader(primitive);
        assertEquals(42.5, reader.nextDouble(), 0.0001);
    }

    @Test(expected = IllegalStateException.class)
    public void testNextIntWithInvalidToken() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("not-a-number"));
        reader.nextInt();
    }

    @Test
    public void testNextIntWithNumber() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(42);
        reader = new JsonTreeReader(primitive);
        assertEquals(42, reader.nextInt());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextLongWithInvalidToken() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("invalid"));
        reader.nextLong();
    }

    @Test
    public void testNextLongWithNumber() throws IOException {
        JsonPrimitive primitive = new JsonPrimitive(Long.MAX_VALUE);
        reader = new JsonTreeReader(primitive);
        assertEquals(Long.MAX_VALUE, reader.nextLong());
    }

    @Test
    public void testClose() throws IOException {
        reader = new JsonTreeReader(JsonNull.INSTANCE);
        reader.close();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekAfterClose() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("test"));
        reader.close();
        reader.peek(); // Should throw IllegalStateException
    }

    @Test
    public void testSkipValueWithName() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.skipValue();
        assertEquals("null", reader.peek()); // out of scope, but expected
        reader.skipValue();
        reader.endObject();
    }

    @Test
    public void testGetPath() throws IOException {
        JsonObject object = new JsonObject();
        JsonArray array = new JsonArray();
        array.add("item");
        object.add("items", array);
        reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.nextName();
        reader.beginArray();
        assertEquals("$.items[0]", reader.getPath());
        reader.nextString();
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue() throws IOException {
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        reader = new JsonTreeReader(object);
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals("key", reader.nextString());
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("value", reader.nextString());
        reader.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testExpectMismatch() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("2020-01-01"));
        reader.beginArray(); // Should throw because object not array
    }

    @Test
    public void testPeekWithNumberPrimitive() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive(123));
        assertEquals(JsonToken.NUMBER, reader.peek());
    }

    @Test
    public void testPeekWithBooleanPrimitive() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive(true));
        assertEquals(JsonToken.BOOLEAN, reader.peek());
    }

    @Test
    public void testPeekWithNullPrimitive() throws IOException {
        reader = new JsonTreeReader(JsonNull.INSTANCE);
        assertEquals(JsonToken.NULL, reader.peek());
    }

    @Test(expected = AssertionError.class)
    public void testPeekWithUnknownType() throws IOException {
        reader = new JsonTreeReader(new JsonPrimitive("test") {
            // override to create unknown type
        }).peek();
    }
}