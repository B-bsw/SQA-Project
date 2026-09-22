package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream _out;
    private UTF8JsonGenerator _gen;
    private IOContext _ctxt;

    private void setUpGen(int features) throws IOException {
        _out = new ByteArrayOutputStream();
        _ctxt = new IOContext(IOContext.AuxValues.empty(), null, null, null, null, 0);
        _gen = new UTF8JsonGenerator(_ctxt, features, null, _out);
    }

    @Test
    public void testWriteFieldNameSimple() throws Exception {
        setUpGen(0);
        _gen.writeStartObject();
        _gen.writeFieldName("foo");
        assertEquals("{\"foo\"", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteFieldNameUnquoted() throws Exception {
        setUpGen(JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        _gen.writeStartObject();
        _gen.writeFieldName("foo");
        assertEquals("{foo", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteStringBasic() throws Exception {
        setUpGen(0);
        _gen.writeStartArray();
        _gen.writeString("abc");
        _gen.writeEndArray();
        assertEquals("[\"abc\"]", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteStringWithQuoteAndEscape() throws Exception {
        setUpGen(0);
        _gen.writeString("a\"b\\c");
        assertEquals("\"a\\\"b\\\\c\"", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        setUpGen(0);
        _gen.writeNumber(123);
        assertEquals("123", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        setUpGen(0);
        _gen.writeNumber(1234567890123L);
        assertEquals("1234567890123", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        setUpGen(0);
        _gen.writeNumber(new BigInteger("12345678901234567890"));
        assertEquals("12345678901234567890", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        setUpGen(0);
        _gen.writeNumber(1.25);
        assertEquals("1.25", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        setUpGen(0);
        _gen.writeNumber(new BigDecimal("123.456"));
        assertEquals("123.456", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberStringAsString() throws Exception {
        setUpGen(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
        _gen.writeNumber(123);
        assertEquals("\"123\"", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteBoolean() throws Exception {
        setUpGen(0);
        _gen.writeBoolean(true);
        assertEquals("true", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNull() throws Exception {
        setUpGen(0);
        _gen.writeNull();
        assertEquals("null", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test(expected = IOException.class)
    public void testWriteNullInArray() throws Exception {
        setUpGen(0);
        _gen.writeStartArray();
        _gen.writeString(null);
        _gen.writeEndArray();
    }

    @Test
    public void testWriteRawString() throws Exception {
        setUpGen(0);
        _gen.writeRaw("abc");
        assertEquals("abc", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteRawChar() throws Exception {
        setUpGen(0);
        _gen.writeRaw('a');
        assertEquals("a", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteRawCharArray() throws Exception {
        setUpGen(0);
        _gen.writeRaw(new char[]{'a','b','c'}, 0, 3);
        assertEquals("abc", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteFieldNameSerializableString() throws Exception {
        setUpGen(0);
        _gen.writeStartObject();
        _gen.writeFieldName(new SerializedString("bar"));
        _gen.writeEndObject();
        assertEquals("{\"bar\"}", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteStringSerializableString() throws Exception {
        setUpGen(0);
        _gen.writeString(new SerializedString("xyz"));
        assertEquals("\"xyz\"", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteRawUTF8String() throws Exception {
        setUpGen(0);
        byte[] bytes = "abc".getBytes("UTF-8");
        _gen.writeRawUTF8String(bytes, 0, bytes.length);
        assertEquals("abc", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteBinary() throws Exception {
        setUpGen(0);
        byte[] data = {1,2,3};
        _gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        _gen.flush();
        String encoded = _out.toString("UTF-8");
        assertEquals(Base64Variants.getDefaultVariant().encode(data), encoded);
        _gen.close();
    }

    @Test
    public void testFlush() throws Exception {
        setUpGen(0);
        _gen.writeString("abc");
        _gen.flush();
        assertEquals("\"abc\"", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testClose() throws Exception {
        setUpGen(0);
        _gen.writeStartObject();
        _gen.writeEndObject();
        _gen.close();
        assertEquals("{}", _out.toString("UTF-8"));
    }

    @Test
    public void testGetOutputBuffered() throws Exception {
        setUpGen(0);
        assertEquals(0, _gen.getOutputBuffered());
        _gen.writeStartObject();
        _gen.writeEndObject();
        assertTrue(_gen.getOutputBuffered() > 0);
        _gen.close();
    }

    @Test
    public void testGetOutputTarget() throws Exception {
        setUpGen(0);
        assertSame(_out, _gen.getOutputTarget());
        _gen.close();
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        setUpGen(0);
        _gen.writeNumber((float)1.25);
        assertEquals("1.25", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteNumberNullString() throws Exception {
        setUpGen(0);
        _gen.writeNumber((String)null);
        _gen.flush();
        assertEquals("", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteRawSerializableString() throws Exception {
        setUpGen(0);
        _gen.writeRaw(new SerializedString("abc"));
        assertEquals("abc", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteStartArray() throws Exception {
        setUpGen(0);
        _gen.writeStartArray();
        assertEquals("[", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteEndArray() throws Exception {
        setUpGen(0);
        _gen.writeStartArray();
        _gen.writeEndArray();
        assertEquals("[]", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteStartObject() throws Exception {
        setUpGen(0);
        _gen.writeStartObject();
        assertEquals("{", _out.toString("UTF-8"));
        _gen.close();
    }

    @Test
    public void testWriteEndObject() throws Exception {
        setUpGen(0);
        _gen.writeStartObject();
        _gen.writeEndObject();
        assertEquals("{}", _out.toString("UTF-8"));
        _gen.close();
    }
}