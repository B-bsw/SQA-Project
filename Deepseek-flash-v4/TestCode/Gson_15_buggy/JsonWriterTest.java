package com.google.gson.stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterTest {
    private StringWriter stringWriter;
    private JsonWriter writer;

    @Before
    public void setUp() throws Exception {
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() throws Exception {
        writer.close();
    }

    @Test
    public void testJsonWriterConstructorNullWriterThrows() {
        try {
            new JsonWriter(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testSetIndentEmptyStringNoPrettyPrint() throws IOException {
        writer.setIndent("");
        assertNull(writer.indent); // indirect check, indent should be null
        writer.beginObject().name("key").value("value").endObject();
        assertEquals("{\"key\":\"value\"}", stringWriter.toString());
    }

    @Test
    public void testSetIndentNonEmptyStringPrettyPrint() throws IOException {
        writer.setIndent("  ");
        writer.beginObject().name("key").value("value").endObject();
        String expected = "{\n  \"key\": \"value\"\n}";
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    public void testSetLenientAndIsLenient() {
        writer.setLenient(true);
        assertTrue(writer.isLenient());
        writer.setLenient(false);
        assertFalse(writer.isLenient());
    }

    @Test
    public void testSetHtmlSafeAndIsHtmlSafe() {
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testSetSerializeNullsAndGetSerializeNulls() {
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    @Test
    public void testBeginArrayAndEndArray() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        assertEquals("[1,2]", stringWriter.toString());
    }

    @Test
    public void testBeginObjectAndEndObjectEmpty() throws IOException {
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testBeginObjectWithNameAndValue() throws IOException {
        writer.beginObject();
        writer.name("key").value("value");
        writer.endObject();
        assertEquals("{\"key\":\"value\"}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayWhileInObjectThrows() throws IOException {
        writer.beginObject();
        writer.beginArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayWhenNotInArrayThrows() throws IOException {
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectWhenNotInObjectThrows() throws IOException {
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testNameInArrayContextThrows() throws IOException {
        writer.beginArray();
        writer.name("name");
    }

    @Test
    public void testValueStringNullCallsNullValue() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("key").value((String) null);
        writer.endObject();
        assertEquals("{\"key\":null}", stringWriter.toString());
    }

    @Test
    public void testValueStringEscaping() throws IOException {
        writer.beginArray();
        writer.value("a\"b\\c\nd\t");
        writer.endArray();
        assertEquals("[\"a\\\"b\\\\c\\nd\\t\"]", stringWriter.toString());
    }

    @Test
    public void testValueBooleanPrimitive() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        assertEquals("[true,false]", stringWriter.toString());
    }

    @Test
    public void testValueBooleanObject() throws IOException {
        writer.beginArray();
        writer.value(Boolean.TRUE);
        writer.value(Boolean.FALSE);
        writer.endArray();
        assertEquals("[true,false]", stringWriter.toString());
    }

    @Test
    public void testValueDoubleFinite() throws IOException {
        writer.beginArray();
        writer.value(1.5);
        writer.value(-2.25);
        writer.endArray();
        assertEquals("[1.5,-2.25]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDoubleNaNThrows() throws IOException {
        writer.beginArray();
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDoubleInfinityThrows() throws IOException {
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testValueLong() throws IOException {
        writer.beginArray();
        writer.value(123456789L);
        writer.endArray();
        assertEquals("[123456789]", stringWriter.toString());
    }

    @Test
    public void testValueNumberNull() throws IOException {
        try {
            writer.value((Number) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testValueNumber() throws IOException {
        writer.beginArray();
        writer.value(42);
        writer.endArray();
        assertEquals("[42]", stringWriter.toString());
    }

    @Test
    public void testJsonValue() throws IOException {
        writer.beginObject();
        writer.name("key").jsonValue("{\"nested\":true}");
        writer.endObject();
        assertEquals("{\"key\":{\"nested\":true}}", stringWriter.toString());
    }

    @Test
    public void testNullValueWithSerializeNullsTrue() throws IOException {
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("key").nullValue();
        writer.endObject();
        assertEquals("{\"key\":null}", stringWriter.toString());
    }

    @Test
    public void testNullValueWithSerializeNullsFalse() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("key").nullValue();
        writer.endObject();
        assertEquals("{\"key\":null}", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeEscaping() throws IOException {
        writer.setHtmlSafe(true);
        writer.beginArray();
        writer.value("<>&=");
        writer.endArray();
        assertEquals("[\"\\u003c\\u003e\\u0026\\u003d\"]", stringWriter.toString());
    }

    @Test
    public void testNonHtmlSafeEscaping() throws IOException {
        writer.setHtmlSafe(false);
        writer.beginArray();
        writer.value("<>&=");
        writer.endArray();
        assertEquals("[\"<>&=\"]", stringWriter.toString());
    }

    @Test
    public void testFlush() throws IOException {
        writer.beginArray();
        writer.flush();
        assertEquals("[", stringWriter.toString());
    }

    @Test
    public void testCloseIncompleteDocumentThrows() throws IOException {
        writer.close();
        try {
            writer.beginObject();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseWithMultipleTopLevelValuesThrows() throws IOException {
        writer.beginObject().endObject();
        writer.close();
        try {
            writer.beginArray();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testNestedArraysAndObjects() throws IOException {
        writer.beginObject();
        writer.name("array").beginArray().value(1).value(2).endArray();
        writer.name("object").beginObject().name("a").value(true).endObject();
        writer.endObject();
        assertEquals("{\"array\":[1,2],\"object\":{\"a\":true}}", stringWriter.toString());
    }

    @Test
    public void testMultipleRootValuesWithLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray().endArray();
        writer.beginArray().endArray();
        assertEquals("[][]", stringWriter.toString());
    }

    @Test
    public void testStackOverflow() {
        JsonWriter w = new JsonWriter(new StringWriter());
        try {
            for (int i = 0; i < 1000; i++) {
                w.beginArray();
            }
            fail("Expected StackOverflowError");
        } catch (StackOverflowError e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }
}