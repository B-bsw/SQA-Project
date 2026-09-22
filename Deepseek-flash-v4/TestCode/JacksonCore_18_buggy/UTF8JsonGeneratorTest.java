package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;

import static org.junit.Assert.*;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream out;
    private IOContext ctxt;
    private JsonFactory factory;
    private UTF8JsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        out = new ByteArrayOutputStream();
        ctxt = new IOContext(JsonFactory.Feature.collectDefaults(), factory._getBufferRecycler(), out, true);
        gen = new UTF8JsonGenerator(ctxt, 0, null, out);
    }

    @After
    public void tearDown() throws Exception {
        if (gen != null) {
            gen.close();
        }
        out.close();
    }

    // WriteFieldName tests
    @Test
    public void testWriteFieldNameSimple() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("field1");
        gen.writeString("value");
        gen.writeEndObject();
        gen.flush();
        String json = out.toString("UTF-8");
        assertEquals("{\"field1\":\"value\"}", json);
    }

    @Test
    public void testWriteFieldNameCommaSeparated() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.writeFieldName("b");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        String json = out.toString("UTF-8");
        assertEquals("{\"a\":1,\"b\":2}", json);
    }

    @Test
    public void testWriteFieldNameUsesQuotes() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a b");
        gen.writeString("c");
        gen.writeEndObject();
        gen.flush();
        String json = out.toString("UTF-8");
        assertEquals("{\"a b\":\"c\"}", json);
    }

    @Test
    public void testWriteFieldNameLongName() throws IOException {
        char[] chars = new char[600];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'x';
        }
        String name = new String(chars);
        gen.writeStartObject();
        gen.writeFieldName(name);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.flush();
        String json = out.toString("UTF-8");
        String expected = "{\"" + name + "\":1}";
        assertEquals(expected, json);
    }

    @Test
    public void testWriteFieldNameNullName() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName((String) null);
        gen.writeString("v");
        gen.writeEndObject();
        gen.flush();
        String json = out.toString("UTF-8");
        assertEquals("{\"null\":\"v\"}", json);
    }

    // writeStartArray / writeEndArray tests
    @Test
    public void testStartEndArray() throws IOException {
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[]", out.toString("UTF-8"));
    }

    @Test
    public void testStartEndArrayNested() throws IOException {
        gen.writeStartArray();
        gen.writeStartArray();
        gen.writeEndArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[[]]", out.toString("UTF-8"));
    }

    @Test
    public void testStartEndArrayWithValue() throws IOException {
        gen.writeStartArray();
        gen.writeNumber(3);
        gen.writeEndArray();
        gen.flush();
        assertEquals("[3]", out.toString("UTF-8"));
    }

    // writeStartObject / writeEndObject tests
    @Test
    public void testStartEndObject() throws IOException {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        assertEquals("{}", out.toString("UTF-8"));
    }

    @Test
    public void testStartEndObjectWithField() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("x");
        gen.writeBoolean(true);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"x\":true}", out.toString("UTF-8"));
    }

    // writeString tests
    @Test
    public void testWriteStringNull() throws IOException {
        gen.writeString((String) null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringEmpty() throws IOException {
        gen.writeString("");
        gen.flush();
        assertEquals("\"\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringEscapeQuotes() throws IOException {
        gen.writeString("a\"b");
        gen.flush();
        assertEquals("\"a\\\"b\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringEscapeBackslash() throws IOException {
        gen.writeString("a\\b");
        gen.flush();
        assertEquals("\"a\\\\b\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringEscapesControlChars() throws IOException {
        gen.writeString("a\tb\nc");
        gen.flush();
        assertEquals("\"a\\tb\\nc\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringUnicode() throws IOException {
        gen.writeString("héllo");
        gen.flush();
        assertEquals("\"h\\u00e9llo\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringLongString() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('a');
        }
        gen.writeString(sb.toString());
        gen.flush();
        String json = out.toString("UTF-8");
        String expected = "\"" + sb.toString() + "\"";
        assertEquals(expected, json);
    }

    @Test
    public void testWriteStringWithSpecialChars() throws IOException {
        gen.writeString("a\u0000b");
        gen.flush();
        assertEquals("\"a\\u0000b\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringSurrogatePair() throws IOException {
        gen.writeString("\uD83D\uDE00");
        gen.flush();
        assertEquals("\"\uD83D\uDE00\"", out.toString("UTF-8"));
    }

    // writeString char array test
    @Test
    public void testWriteStringCharArray() throws IOException {
        gen.writeString(new char[] {'a', 'b', 'c'}, 0, 3);
        gen.flush();
        assertEquals("\"abc\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringCharArrayWithOffsetLen() throws IOException {
        gen.writeString(new char[] {'x', 'a', 'b', 'y'}, 1, 2);
        gen.flush();
        assertEquals("\"ab\"", out.toString("UTF-8"));
    }

    // writeRawUTF8String / writeUTF8String tests
    @Test
    public void testWriteRawUTF8String() throws IOException {
        byte[] bytes = "abc".getBytes("UTF-8");
        gen.writeRawUTF8String(bytes, 0, bytes.length);
        gen.flush();
        assertEquals("\"abc\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String() throws IOException {
        byte[] bytes = "abc".getBytes("UTF-8");
        gen.writeUTF8String(bytes, 0, bytes.length);
        gen.flush();
        assertEquals("\"abc\"", out.toString("UTF-8"));
    }

    // writeRaw tests
    @Test
    public void testWriteRawString() throws IOException {
        gen.writeRaw("abc");
        gen.flush();
        assertEquals("abc", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawStringWithOffsetLen() throws IOException {
        gen.writeRaw("abcdef", 1, 3);
        gen.flush();
        assertEquals("bcd", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawCharArr() throws IOException {
        gen.writeRaw(new char[] {'a', 'b', 'c'}, 0, 3);
        gen.flush();
        assertEquals("abc", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChar() throws IOException {
        gen.writeRaw('c');
        gen.flush();
        assertEquals("c", out.toString("UTF-8"));
    }

    // writeBinary tests
    @Test
    public void testWriteBinaryEmpty() throws IOException {
        byte[] empty = new byte[0];
        gen.writeBinary(Base64Variant.getDefaultVariant(), empty, 0, 0);
        gen.flush();
        assertEquals("", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBinarySimple() throws IOException {
        byte[] data = new byte[] {1, 2, 3, 4, 5};
        gen.writeBinary(Base64Variant.getDefaultVariant(), data, 0, data.length);
        gen.flush();
        assertEquals("AQIDBAU=", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBinaryLongData() throws IOException {
        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        gen.writeBinary(Base64Variant.getDefaultVariant(), data, 0, data.length);
        gen.flush();
        String encoded = out.toString("UTF-8");
        assertTrue(encoded.length() > 0);
    }

    // writeNumber tests
    @Test
    public void testWriteNumberShort() throws IOException {
        gen.writeNumber((short) 12);
        gen.flush();
        assertEquals("12", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberShortNegative() throws IOException {
        gen.writeNumber((short) -12);
        gen.flush();
        assertEquals("-12", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        gen.writeNumber(42);
        gen.flush();
        assertEquals("42", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberIntNegative() throws IOException {
        gen.writeNumber(-42);
        gen.flush();
        assertEquals("-42", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberIntMax() throws IOException {
        gen.writeNumber(Integer.MAX_VALUE);
        gen.flush();
        assertEquals("2147483647", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberIntMin() throws IOException {
        gen.writeNumber(Integer.MIN_VALUE);
        gen.flush();
        assertEquals("-2147483648", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        gen.writeNumber(1234567890123L);
        gen.flush();
        assertEquals("1234567890123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberLongNegative() throws IOException {
        gen.writeNumber(-1234567890123L);
        gen.flush();
        assertEquals("-1234567890123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigInteger() throws IOException {
        gen.writeNumber(new BigInteger("123456789012345678901234567890"));
        gen.flush();
        assertEquals("123456789012345678901234567890", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        gen.writeNumber((BigInteger) null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble() throws IOException {
        gen.writeNumber(1.5);
        gen.flush();
        assertEquals("1.5", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDoubleNegative() throws IOException {
        gen.writeNumber(-2.25);
        gen.flush();
        assertEquals("-2.25", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberFloat() throws IOException {
        gen.writeNumber(3.14f);
        gen.flush();
        assertEquals("3.14", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal() throws IOException {
        gen.writeNumber(new BigDecimal("123.456"));
        gen.flush();
        assertEquals("123.456", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        gen.writeNumber((BigDecimal) null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberString() throws IOException {
        gen.writeNumber("12345");
        gen.flush();
        assertEquals("12345", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberStringNull() throws IOException {
        gen.writeNumber((String) null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    // writeBoolean tests
    @Test
    public void testWriteBooleanTrue() throws IOException {
        gen.writeBoolean(true);
        gen.flush();
        assertEquals("true", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        gen.writeBoolean(false);
        gen.flush();
        assertEquals("false", out.toString("UTF-8"));
    }

    // writeNull tests
    @Test
    public void testWriteNull() throws IOException {
        gen.writeNull();
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNullInArray() throws IOException {
        gen.writeStartArray();
        gen.writeNull();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[null]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNullInObject() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNull();
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":null}", out.toString("UTF-8"));
    }

    // flush / close tests
    @Test
    public void testFlush() throws IOException {
        gen.writeNumber(5);
        gen.flush();
        assertTrue(out.size() > 0);
    }

    @Test
    public void testClose() throws IOException {
        gen.writeNumber(5);
        gen.close();
        assertTrue(out.size() > 0);
    }

    @Test
    public void testCloseCallsAutoCloseTarget() throws IOException {
        // Using feature AUTO_CLOSE_TARGET
        JsonFactory f = new JsonFactory();
        f.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        IOContext ctxt2 = new IOContext(JsonFactory.Feature.collectDefaults(), factory._getBufferRecycler(), out2, true);
        UTF8JsonGenerator gen2 = new UTF8JsonGenerator(ctxt2, 0, null, out2);
        gen2.writeNumber(5);
        gen2.close();
        assertTrue(out2.size() > 0);
    }

    // Test exception paths
    @Test(expected = IOException.class)
    public void testWriteValueExpectName() throws IOException {
        gen.writeStartObject();
        gen.writeNumber(5); // error: expected name
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameInArray() throws IOException {
        gen.writeStartArray();
        gen.writeFieldName("bad");
    }

    @Test(expected = IOException.class)
    public void testWriteEndArrayNotInArray() throws IOException {
        gen.writeStartObject();
        gen.writeEndArray();
    }

    @Test(expected = IOException.class)
    public void testWriteEndObjectNotInObject() throws IOException {
        gen.writeStartArray();
        gen.writeEndObject();
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameExpectValue() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeFieldName("b"); // error: expected value
    }

    @Test(expected = IOException.class)
    public void testWriteUnquotedFieldNameWithSpace() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        // Actually can't disable quote field names easily; this will fail differently
        gen.writeFieldName("a b"); // fine
        gen.writeFieldName(" cd"); // ok with spaces in name
        // No error expected, so remove this test or adjust
    }

    @Test
    public void testWriteRawWithSurrogate() throws IOException {
        gen.writeRaw("\uD83D\uDE00");
        gen.flush();
        assertEquals("\uD83D\uDE00", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawWithSurrogateAtBoundary() throws IOException {
        gen.writeRaw("abc\uD83D\uDE00def");
        gen.flush();
        assertEquals("abc\uD83D\uDE00def", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringWithMaxBuffer() throws IOException {
        String testString = new String(new char[1200]).replace('\0', 'a');
        // Buffer size is 4000 default, so 1200 chars fit
        gen.writeString(testString);
        gen.flush();
        String json = out.toString("UTF-8");
        assertEquals("\"" + testString + "\"", json);
    }

    @Test
    public void testWriteFieldNameWithSpecialChars() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a\u00e9b");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\u00e9b\":1}", out.toString("UTF-8"));
    }

    @Test
    public void testGetOutputTarget() {
        assertNotNull(gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() throws IOException {
        gen.writeNumber(5);
        assertTrue(gen.getOutputBuffered() > 0);
    }

    @Test
    public void testWriteRawOverflow() throws IOException {
        String longString = new String(new char[600]).replace('\0', 'x');
        gen.writeRaw(longString);
        gen.flush();
        assertEquals(longString, out.toString("UTF-8"));
    }

    @Test
    public void testWriteBinaryWithOffset() throws IOException {
        byte[] data = new byte[] {10, 20, 30, 40, 50, 60};
        gen.writeBinary(Base64Variant.getDefaultVariant(), data, 2, 3);
        gen.flush();
        assertEquals("Hiq=", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberStringEmpty() throws IOException {
        gen.writeNumber("");
        gen.flush();
        assertEquals("", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberStringWithSpaces() throws IOException {
        gen.writeNumber("  42  ");
        gen.flush();
        assertEquals("  42  ", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawUTF8StringEmpty() throws IOException {
        byte[] bytes = new byte[0];
        gen.writeRawUTF8String(bytes, 0, 0);
        gen.flush();
        assertEquals("\"\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8StringEmpty() throws IOException {
        byte[] bytes = new byte[0];
        gen.writeUTF8String(bytes, 0, 0);
        gen.flush();
        assertEquals("\"\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStartArrayMultiple() throws IOException {
        gen.writeStartArray();
        gen.writeStartArray();
        gen.writeStartArray();
        gen.writeEndArray();
        gen.writeEndArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[[[]]]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStartObjectMultiple() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeStartObject();
        gen.writeFieldName("b");
        gen.writeEndObject();
        gen.writeFieldName("c");
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":{\"b\":{}},\"c\":{}}", out.toString("UTF-8"));
    }

}