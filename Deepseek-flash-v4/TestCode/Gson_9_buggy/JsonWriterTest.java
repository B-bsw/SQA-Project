package com.google.gson.stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Ignore;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class JsonWriterTest {

    private JsonWriter writer;
    private StringWriter stringWriter;

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
    public void testSetIndentEmptyString() throws Exception {
        writer.setIndent("");
        assertEquals("", writer.indent);
    }

    @Test
    public void testSetIndentNonEmpty() throws Exception {
        writer.setIndent("  ");
        assertEquals("  ", writer.indent);
    }

    @Test
    public void testIsLenientDefault() {
        assertFalse(writer.isLenient());
    }

    @Test
    public void testSetLenient() {
        writer.setLenient(true);
        assertTrue(writer.isLenient());
        writer.setLenient(false);
        assertFalse(writer.isLenient());
    }

    @Test
    public void testIsHtmlSafeDefault() {
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void testSetHtmlSafe() {
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void testGetSerializeNullsDefault() {
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testSetSerializeNulls() {
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testValueNullString() throws Exception {
        writer.setLenient(true);
        writer.beginArray();
        writer.value((String) null);
        writer.endArray();
        writer.close();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testValueNullStringSerializeNullsFalse() throws Exception {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("test");
        writer.value((String) null);
        writer.endObject();
        writer.close();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testValueNonNullString() throws Exception {
        writer.beginArray();
        writer.value("abc");
        writer.endArray();
        writer.close();
        assertEquals("[\"abc\"]", stringWriter.toString());
    }

    @Test
    public void testValueSpecialCharacters() throws Exception {
        writer.beginArray();
        writer.value("a\"b\\c\nd\te");
        writer.endArray();
        writer.close();
        assertEquals("[\"a\\\"b\\\\c\\nd\\te\"]", stringWriter.toString());
    }

    @Test
    public void testJsonValue() throws Exception {
        writer.beginArray();
        writer.jsonValue("{}");
        writer.endArray();
        writer.close();
        assertEquals("[{}]", stringWriter.toString());
    }

    @Test
    public void testNullValue() throws Exception {
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        writer.close();
        assertEquals("[null]", stringWriter.toString());
    }

    @Test
    public void testValueBoolean() throws Exception {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        writer.close();
        assertEquals("[true,false]", stringWriter.toString());
    }

    @Test
    public void testValueDoubleFinite() throws Exception {
        writer.beginArray();
        writer.value(1.5);
        writer.endArray();
        writer.close();
        assertEquals("[1.5]", stringWriter.toString());
    }

    @Test
    public void testValueDoubleNaN() {
        try {
            writer.beginArray();
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValueDoubleInfinity() {
        try {
            writer.beginArray();
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testValueLong() throws Exception {
        writer.beginArray();
        writer.value(42L);
        writer.endArray();
        writer.close();
        assertEquals("[42]", stringWriter.toString());
    }

    @Test
    public void testValueNumber() throws Exception {
        writer.beginArray();
        writer.value(new Integer(7));
        writer.endArray();
        writer.close();
        assertEquals("[7]", stringWriter.toString());
    }

    @Test
    public void testValueNumberNull() {
        try {
            writer.value((Number) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testBeginArray() throws Exception {
        writer.beginArray();
        writer.close();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testEndArray() throws Exception {
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        writer.close();
        assertEquals("[1]", stringWriter.toString());
    }

    @Test
    public void testBeginObject() throws Exception {
        writer.beginObject();
        writer.close();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testEndObject() throws Exception {
        writer.beginObject();
        writer.name("a");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testNameNull() {
        try {
            writer.beginObject();
            writer.name(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testNameAfterValue() {
        try {
            writer.beginObject();
            writer.value(1);
            writer.name("a");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testNameWithEscaping() throws Exception {
        writer.beginObject();
        writer.name("a\"b");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\\\"b\":1}", stringWriter.toString());
    }

    @Test
    public void testTopLevelMultipleValues() {
        try {
            writer.beginArray();
            writer.endArray();
            writer.beginArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testTopLevelValue() throws Exception {
        writer.value(1);
        writer.close();
        assertEquals("1", stringWriter.toString());
    }

    @Test
    public void testEmptyDocument() throws Exception {
        writer.close();
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeCharacters() throws Exception {
        writer.beginObject();
        writer.name("a");
        writer.value("<>&=");
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":\"\\u003c\\u003e\\u0026\\u003d\"}", stringWriter.toString());
    }

    @Test
    public void testHtmlUnsafeCharacters() throws Exception {
        writer.setHtmlSafe(false);
        writer.beginObject();
        writer.name("a");
        writer.value("<>&=");
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":\"<>&=\"}", stringWriter.toString());
    }

    @Test
    public void testFlush() throws Exception {
        writer.beginArray();
        writer.flush();
        assertEquals("[", stringWriter.toString());
    }

    @Test
    public void testClose() throws Exception {
        writer.beginArray();
        writer.close();
        try {
            writer.value(1);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseWithUnclosedObject() {
        try {
            writer.beginObject();
            writer.close();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testLenientMultipleTopLevelValues() throws Exception {
        writer.setLenient(true);
        writer.value(1);
        writer.value(2);
        writer.close();
        assertEquals("1 2", stringWriter.toString());
    }

    @Test
    public void testStrictMultipleTopLevelValues() {
        try {
            writer.value(1);
            writer.value(2);
            writer.close();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testStringControlCharacters() throws Exception {
        writer.beginArray();
        writer.value("a\u0001b");
        writer.endArray();
        writer.close();
        assertEquals("[\"a\\u0001b\"]", stringWriter.toString());
    }

    @Test
    public void testStringUnicodeCharacters() throws Exception {
        writer.beginArray();
        writer.value("abcéd世上");
        writer.endArray();
        writer.close();
        assertEquals("[\"abcéd世上\"]", stringWriter.toString());
    }

    @Test
    public void testU2028U2029Escaped() throws Exception {
        writer.beginArray();
        writer.value("a\u2028b\u2029c");
        writer.endArray();
        writer.close();
        assertEquals("[\"a\\u2028b\\u2029c\"]", stringWriter.toString());
    }

    @Test
    public void testEmptyName() throws Exception {
        writer.beginObject();
        writer.name("");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"\":1}", stringWriter.toString());
    }

    @Test
    public void testNestedArraysAndObjects() throws Exception {
        writer.beginObject();
        writer.name("arr");
        writer.beginArray();
        writer.value(1);
        writer.beginObject();
        writer.name("n");
        writer.value(true);
        writer.endObject();
        writer.endArray();
        writer.endObject();
        writer.close();
        assertEquals("{\"arr\":[1,{\"n\":true}]}", stringWriter.toString());
    }

    @Test
    public void testIndentation() throws Exception {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\n  \"a\": 1\n}", stringWriter.toString());
    }

    @Test
    public void testDeepNesting() throws Exception {
        for (int i = 0; i < 10; i++) {
            writer.beginArray();
        }
        for (int i = 0; i < 10; i++) {
            writer.endArray();
        }
        writer.close();
    }

    @Test(expected = IOException.class)
    public void testInvalidStateAfterClose() throws Exception {
        writer.close();
        writer.beginArray();
    }

    @Test
    public void testLenientNameValueSeparator() throws Exception {
        writer.setLenient(true);
        writer.beginObject();
        writer.name("a");
        writer.jsonValue("1 2");
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":1 2}", stringWriter.toString());
    }
}