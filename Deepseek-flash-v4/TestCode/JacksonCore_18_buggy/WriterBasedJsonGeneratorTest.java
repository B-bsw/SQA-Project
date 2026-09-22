package com.fasterxml.jackson.core.json;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class WriterBasedJsonGeneratorTest {
    private WriterBasedJsonGenerator gen;
    private StringWriter sw;

    @Before
    public void setUp() throws Exception {
        sw = new StringWriter();
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR, br, null, false);
        gen = new WriterBasedJsonGenerator(ctxt, 0, null, sw);
    }

    @Test
    public void testGetOutputTarget() {
        assertSame(sw, gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBufferedInitially() {
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testWriteFieldNameString() throws Exception {
        gen.writeStartObject();
        gen.writeFieldName("foo");
        gen.writeNumber(42);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"foo\":42}", sw.toString());
    }

    @Test
    public void testWriteFieldNameSerializableString() throws Exception {
        gen.writeStartObject();
        gen.writeFieldName((SerializableString) () -> "bar");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"bar\":1}", sw.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameInArray() throws Exception {
        gen.writeStartArray();
        gen.writeFieldName("x");
    }

    @Test
    public void testWriteStartArrayEndArray() throws Exception {
        gen.writeStartArray();
        gen.writeNumber(10);
        gen.writeEndArray();
        gen.flush();
        assertEquals("[10]", sw.toString());
    }

    @Test
    public void testWriteStartObjectEndObject() throws Exception {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testWriteString() throws Exception {
        gen.writeStartObject();
        gen.writeFieldName("msg");
        gen.writeString("hello");
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"msg\":\"hello\"}", sw.toString());
    }

    @Test
    public void testWriteStringNull() throws Exception {
        gen.writeStartObject();
        gen.writeFieldName("n");
        gen.writeString((String) null);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"n\":null}", sw.toString());
    }

    @Test
    public void testWriteStringCharArray() throws Exception {
        gen.writeStartArray();
        gen.writeString(new char[]{'a','b','c'}, 0, 3);
        gen.writeEndArray();
        gen.flush();
        assertEquals("[\"abc\"]", sw.toString());
    }

    @Test
    public void testWriteStringSerializableString() throws Exception {
        gen.writeString((SerializableString) () -> "text");
        gen.flush();
        assertEquals("\"text\"", sw.toString());
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        gen.writeNumber(12345);
        gen.flush();
        assertEquals("12345", sw.toString());
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        gen.writeNumber(9876543210L);
        gen.flush();
        assertEquals("9876543210", sw.toString());
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        gen.writeNumber(3.14);
        gen.flush();
        assertEquals("3.14", sw.toString());
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        gen.writeNumber(2.5f);
        gen.flush();
        assertEquals("2.5", sw.toString());
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        gen.writeNumber(new java.math.BigInteger("99999999999999999999"));
        gen.flush();
        assertEquals("99999999999999999999", sw.toString());
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        gen.writeNumber(new java.math.BigDecimal("123.456"));
        gen.flush();
        assertEquals("123.456", sw.toString());
    }

    @Test
    public void testWriteNumberEncodedValue() throws Exception {
        gen.writeNumber("1.5e10");
        gen.flush();
        assertEquals("1.5e10", sw.toString());
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        gen.writeBoolean(true);
        gen.flush();
        assertEquals("true", sw.toString());
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        gen.writeBoolean(false);
        gen.flush();
        assertEquals("false", sw.toString());
    }

    @Test
    public void testWriteNull() throws Exception {
        gen.writeNull();
        gen.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testWriteRawString() throws Exception {
        gen.writeRaw("raw");
        gen.flush();
        assertEquals("raw", sw.toString());
    }

    @Test
    public void testWriteRawChar() throws Exception {
        gen.writeRaw('x');
        gen.flush();
        assertEquals("x", sw.toString());
    }

    @Test
    public void testFlush() throws Exception {
        gen.writeNumber(100);
        gen.flush();
        assertEquals("100", sw.toString());
        // after flush, buffer should be empty
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testClose() throws Exception {
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeEndArray();
        gen.close();
        assertEquals("[1]", sw.toString());
        // after close, writer should be closed
        assertTrue(sw.toString().endsWith("[1]"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testValueAfterObjectStartExpectsFieldName() throws Exception {
        gen.writeStartObject();
        gen.writeNumber(5);
    }

    @Test
    public void testMultipleFieldNames() throws Exception {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.writeFieldName("b");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":1,\"b\":2}", sw.toString());
    }

    @Test
    public void testNestedArrays() throws Exception {
        gen.writeStartArray();
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeEndArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[[1]]", sw.toString());
    }
}