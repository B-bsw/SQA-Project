package com.google.gson.stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.io.IOException;
import java.io.StringWriter;
import static org.junit.Assert.*;

public class JsonWriterTest {

    private StringWriter stringWriter;
    private JsonWriter writer;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }

    @Test
    public void testConstructorWithNullWriter() {
        try {
            new JsonWriter(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testBeginArrayAndEndArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testBeginObjectAndEndObject() throws IOException {
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testBeginArrayWithName() throws IOException {
        writer.beginObject();
        writer.name("arr").beginArray();
        writer.value(1);
        writer.endArray();
        writer.endObject();
        assertEquals("{\"arr\":[1]}", stringWriter.toString());
    }

    @Test
    public void testNestedArrays() throws IOException {
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        assertEquals("[[[]]]", stringWriter.toString());
    }

    @Test
    public void testValueString() throws IOException {
        writer.beginArray();
        writer.value("hello");
        writer.endArray();
        assertEquals("[\"hello\"]", stringWriter.toString());
    }

    @Test
    public void testValueNull() throws IOException {
        writer.beginArray();
        writer.value((String) null);
        writer.endArray();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testValueNullWithSerializeNullsFalse() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("key").value((String) null);
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testValueNumber() throws IOException {
        writer.beginArray();
        writer.value(42);
        writer.endArray();
        assertEquals("[42]", stringWriter.toString());
    }

    @Test
    public void testValueDouble() throws IOException {
        writer.beginArray();
        writer.value(3.14);
        writer.endArray();
        assertEquals("[3.14]", stringWriter.toString());
    }

    @Test
    public void testValueDoubleNaN() {
        writer.beginArray();
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testValueDoubleInfinity() {
        writer.beginArray();
        try {
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testValueBoolean() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.endArray();
        assertEquals("[true]", stringWriter.toString());
    }

    @Test
    public void testNameNull() throws IOException {
        writer.beginObject();
        try {
            writer.name(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testNameAfterValue() throws IOException {
        writer.beginObject();
        writer.value(1);
        try {
            writer.name("key");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNameNonEmptyObject() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.value(1);
        writer.name("b");
        writer.value(2);
        writer.endObject();
        assertEquals("{\"a\":1,\"b\":2}", stringWriter.toString());
    }

    @Test
    public void testEndArrayWithWrongContext() throws IOException {
        writer.beginObject();
        try {
            writer.endArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testCloseEmptyDocument() throws IOException {
        writer.close();
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testCloseNonEmptyDocument() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testFlush() throws IOException {
        writer.beginObject();
        writer.flush();
        // Flush should not throw
    }

    @Test
    public void testSetIndentEmpty() throws IOException {
        writer.setIndent("");
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testSetIndentNonEmpty() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a");
        writer.value(1);
        writer.endObject();
        assertEquals("{\n  \"a\": 1\n}", stringWriter.toString());
    }

    @Test
    public void testSetLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        assertEquals("[1,2]", stringWriter.toString());
    }

    @Test
    public void testIsLenient() throws IOException {
        assertFalse(writer.isLenient());
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    @Test
    public void testSetHtmlSafe() throws IOException {
        writer.setHtmlSafe(true);
        writer.value("<>&=");
        writer.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("\\u003c"));
        assertTrue(output.contains("\\u003e"));
        assertTrue(output.contains("\\u0026"));
        assertTrue(output.contains("\\u003d"));
    }

    @Test
    public void testIsHtmlSafe() throws IOException {
        assertTrue(writer.isHtmlSafe());
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testSetSerializeNulls() throws IOException {
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("a").value((String) null);
        writer.endObject();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testGetSerializeNulls() throws IOException {
        assertTrue(writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    @Test
    public void testJsonValueEscaping() throws IOException {
        writer.beginObject();
        writer.name("key").value("\u0000\u001f\"\\\n\r\t\b\f");
        writer.endObject();
        String output = stringWriter.toString();
        assertTrue(output.contains("\\u0000"));
        assertTrue(output.contains("\\u001f"));
        assertTrue(output.contains("\\\""));
        assertTrue(output.contains("\\\\"));
        assertTrue(output.contains("\\n"));
        assertTrue(output.contains("\\r"));
        assertTrue(output.contains("\\t"));
        assertTrue(output.contains("\\b"));
        assertTrue(output.contains("\\f"));
    }

    @Test
    public void testJsonValueSpecials() throws IOException {
        writer.beginArray();
        writer.value("\u2028");
        writer.endArray();
        assertEquals("[\"\\u2028\"]", stringWriter.toString());
    }

    @Test
    public void testValueLong() throws IOException {
        writer.beginArray();
        writer.value(1234567890123L);
        writer.endArray();
        assertEquals("[1234567890123]", stringWriter.toString());
    }

    @Test
    public void testValueDoubleExponential() throws IOException {
        writer.beginArray();
        writer.value(1.0E10);
        writer.endArray();
        assertEquals("[1.0E10]", stringWriter.toString());
    }

    @Test
    public void testBeginArrayAfterClose() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        try {
            writer.beginArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testJsonValue() throws IOException {
        writer.beginArray();
        writer.jsonValue("{\"k\":true}");
        writer.endArray();
        assertEquals("[{\"k\":true}]", stringWriter.toString());
    }

    @Test
    public void testJsonValueWithNull() throws IOException {
        writer.beginArray();
        try {
            writer.jsonValue(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
}