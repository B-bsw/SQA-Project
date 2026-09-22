package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonTreeWriterTest {
    private JsonTreeWriter writer;

    @Before
    public void setUp() {
        writer = new JsonTreeWriter();
    }

    @After
    public void tearDown() {
        writer = null;
    }

    @Test
    public void testInitialState() {
        assertTrue(writer.isLenient() == false);
        assertTrue(writer.getSerializeNulls() == false);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testGetWithNonEmptyStack() {
        try {
            writer.beginArray();
            writer.get();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Expected one JSON element but was [[" + "]]", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testBeginArrayAndEndArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        assertEquals(new JsonArray(), writer.get());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayWithPendingName() throws IOException {
        writer.beginObject();
        writer.name("name");
        writer.beginArray();
    }

    @Test
    public void testBeginObjectAndEndObject() throws IOException {
        writer.beginObject();
        writer.name("key");
        writer.value("value");
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.addProperty("key", "value");
        assertEquals(expected, writer.get());
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayOnEmptyStack() throws IOException {
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectOnEmptyStack() throws IOException {
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testNameOnEmptyStack() throws IOException {
        writer.name("key");
    }

    @Test(expected = IllegalStateException.class)
    public void testNameInsideArray() throws IOException {
        writer.beginArray();
        writer.name("key");
    }

    @Test
    public void testNullValueAtRoot() throws IOException {
        writer.nullValue();
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testValueNullString() throws IOException {
        writer.value((String) null);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testValueBoolean() throws IOException {
        writer.value(true);
        assertEquals(new JsonPrimitive(true), writer.get());
        writer.value(false);
        assertEquals(new JsonPrimitive(false), writer.get());
    }

    @Test
    public void testValueDouble() throws IOException {
        writer.value(1.5);
        assertEquals(new JsonPrimitive(1.5), writer.get());
    }

    @Test
    public void testValueDoubleNaNNonLenient() {
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("JSON forbids NaN and infinities: NaN", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testValueDoubleInfiniteNonLenient() {
        try {
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("JSON forbids NaN and infinities: Infinity", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testValueDoubleNaNLenient() throws IOException {
        writer.setLenient(true);
        writer.value(Double.NaN);
        assertEquals(new JsonPrimitive(Double.NaN), writer.get());
    }

    @Test
    public void testValueLong() throws IOException {
        writer.value(123L);
        assertEquals(new JsonPrimitive(123L), writer.get());
    }

    @Test
    public void testValueNumber() throws IOException {
        writer.value(new Integer(42));
        assertEquals(new JsonPrimitive(42), writer.get());
    }

    @Test
    public void testValueNullNumber() throws IOException {
        writer.value((Number) null);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testValueNumberNaNNonLenient() {
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("JSON forbids NaN and infinities: NaN", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testMultipleValuesInArray() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(1));
        expected.add(new JsonPrimitive(2));
        expected.add(new JsonPrimitive(3));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNestedStructures() throws IOException {
        writer.beginObject();
        writer.name("array");
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        writer.name("object");
        writer.beginObject();
        writer.name("key");
        writer.value("value");
        writer.endObject();
        writer.endObject();
        
        JsonObject expected = new JsonObject();
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        array.add(new JsonPrimitive(2));
        expected.add("array", array);
        JsonObject innerObject = new JsonObject();
        innerObject.addProperty("key", "value");
        expected.add("object", innerObject);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNullValueInObject() throws IOException {
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.add("key", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testSerializeNullsFalse() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        assertEquals(new JsonObject(), writer.get());
    }

    @Test
    public void testSerializeNullsTrue() throws IOException {
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.add("key", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueNullStringInArray() throws IOException {
        writer.beginArray();
        writer.value((String) null);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueBooleanInArray() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(true));
        expected.add(new JsonPrimitive(false));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueDoubleInArray() throws IOException {
        writer.beginArray();
        writer.value(1.5);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(1.5));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueLongInArray() throws IOException {
        writer.beginArray();
        writer.value(100L);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(100L));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueNumberInArray() throws IOException {
        writer.beginArray();
        writer.value(42);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(42));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueNumberNullInArray() throws IOException {
        writer.beginArray();
        writer.value((Number) null);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueNaNInArrayNonLenient() throws IOException {
        writer.beginArray();
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("JSON forbids NaN and infinities: NaN", e.getMessage());
        }
        writer.endArray();
    }

    @Test
    public void testValueInfinityInArrayNonLenient() throws IOException {
        writer.beginArray();
        try {
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("JSON forbids NaN and infinities: Infinity", e.getMessage());
        }
        writer.endArray();
    }

    @Test
    public void testValueNaNInArrayLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(Double.NaN));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testValueInfinityInArrayLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(new JsonPrimitive(Double.POSITIVE_INFINITY));
        assertEquals(expected, writer.get());
    }

    @Test
    public void testEndArrayWithPendingName() throws IOException {
        writer.beginObject();
        writer.name("key");
        try {
            writer.endArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testEndObjectWithPendingName() throws IOException {
        writer.beginObject();
        writer.name("key");
        try {
            writer.endObject();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testCloseWithEmptyStack() throws IOException {
        writer.close();
        assertEquals(JsonNull.INSTANCE, writer.get());
        // After close, operations should fail
        try {
            writer.beginArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testCloseWithNonEmptyStack() {
        try {
            writer.beginArray();
            writer.close();
            fail("Expected IOException");
        } catch (IllegalStateException e) {
            // expected
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testFlushDoesNotThrow() throws IOException {
        writer.flush();
    }

    @Test
    public void testUnwritableWriterOperations() {
        try {
            JsonTreeWriter.UnwritableWriterTestHelper.testWrite();
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            // expected
        }
        try {
            JsonTreeWriter.UnwritableWriterTestHelper.testFlush();
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            // expected
        }
        try {
            JsonTreeWriter.UnwritableWriterTestHelper.testClose();
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            // expected
        }
    }

    @Test
    public void testMixedValuesInObject() throws IOException {
        writer.beginObject();
        writer.name("string");
        writer.value("test");
        writer.name("number");
        writer.value(123);
        writer.name("bool");
        writer.value(true);
        writer.name("null");
        writer.nullValue();
        writer.endObject();
        
        JsonObject expected = new JsonObject();
        expected.addProperty("string", "test");
        expected.addProperty("number", 123);
        expected.addProperty("bool", true);
        expected.add("null", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNameWithNullValueInObject() throws IOException {
        writer.beginObject();
        writer.name("nullValue");
        writer.value((String) null);
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.add("nullValue", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNameWithNullNumberInObject() throws IOException {
        writer.beginObject();
        writer.name("nullNumber");
        writer.value((Number) null);
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.add("nullNumber", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }
}