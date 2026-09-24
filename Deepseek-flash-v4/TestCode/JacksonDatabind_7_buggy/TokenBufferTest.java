package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.ObjectCodec;

public class TokenBufferTest {

    @Test
    public void testInitialStateAndClose() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        assertNull(buf.firstToken());
        assertFalse(buf.isClosed());
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
        assertNotNull(buf.getOutputContext());
        assertNotNull(buf.version());
        assertSame(buf, buf.useDefaultPrettyPrinter());
        assertSame(buf, buf.setCodec(null));
        assertNull(buf.getCodec());
        buf.flush();
        assertTrue(buf.canWriteBinaryNatively());
        assertFalse(buf.isClosed());
        buf.close();
        assertTrue(buf.isClosed());
    }

    @Test
    public void testConstructorWithNativeIds() {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, true);
        assertTrue(buf.canWriteTypeId());
        assertTrue(buf.canWriteObjectId());

        TokenBuffer buf2 = new TokenBuffer((ObjectCodec) null, false);
        assertFalse(buf2.canWriteTypeId());
        assertFalse(buf2.canWriteObjectId());
    }

    @Test
    public void testFeatureMethods() {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        JsonGenerator.Feature f = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        int originalMask = buf.getFeatureMask();

        assertSame(buf, buf.enable(f));
        assertTrue(buf.isEnabled(f));
        assertTrue((buf.getFeatureMask() & f.getMask()) != 0);

        assertSame(buf, buf.disable(f));
        assertFalse(buf.isEnabled(f));
        assertFalse((buf.getFeatureMask() & f.getMask()) != 0);

        assertSame(buf, buf.setFeatureMask(originalMask));
        assertEquals(originalMask, buf.getFeatureMask());
    }

    @Test
    public void testSimpleObjectRoundTrip() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeFieldName("name");
        buf.writeString("value");
        buf.writeFieldName("num");
        buf.writeNumber(42);
        buf.writeFieldName("bool");
        buf.writeBoolean(true);
        buf.writeFieldName("nothing");
        buf.writeNull();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("num", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("bool", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("nothing", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNumberRoundTrip() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeNumber((short) 12);
        buf.writeNumber(1234567890123L);
        buf.writeNumber(new BigInteger("123456789012345678901234567890"));
        buf.writeNumber(1.25d);
        buf.writeNumber(2.5f);
        buf.writeNumber(new BigDecimal("123.456"));
        buf.writeNumber("9.99");

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(12, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1234567890123L, p.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(new BigInteger("123456789012345678901234567890"), p.getBigIntegerValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.25, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2.5f, p.getFloatValue(), 0.0f);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0, new BigDecimal("123.456").compareTo(p.getDecimalValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(9.99, p.getDoubleValue(), 0.0);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNullWrites() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeString((String) null);
        buf.writeNumber((BigDecimal) null);
        buf.writeNumber((BigInteger) null);
        buf.writeObject(null);
        buf.writeTree(null);

        JsonParser p = buf.asParser();
        for (int i = 0; i < 5; i++) {
            assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        }
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWriteObjectWithoutCodec() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        byte[] bytes = new byte[] {1, 2, 3};
        buf.writeObject(bytes);
        buf.writeObject("plain");

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(bytes, (byte[]) p.getEmbeddedObject());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals("plain", p.getEmbeddedObject());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWriteBinary() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        byte[] data = new byte[] {10, 20, 30};
        buf.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.getDefaultVariant()));
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSegmentOverflow() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        int count = 40;
        for (int i = 0; i < count; i++) {
            buf.writeNumber(i);
        }

        JsonParser p = buf.asParser();
        for (int i = 0; i < count; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testAppend() throws Exception {
        TokenBuffer base = new TokenBuffer((ObjectCodec) null);
        base.writeStartObject();
        base.writeFieldName("a");
        base.writeNumber(1);
        base.writeEndObject();

        TokenBuffer other = new TokenBuffer((ObjectCodec) null);
        other.writeStartArray();
        other.writeBoolean(true);
        other.writeEndArray();

        assertSame(base, base.append(other));

        JsonParser p = base.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSerialize() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null);
        src.writeStartArray();
        src.writeStartObject();
        src.writeFieldName(new SerializedString("ser"));
        src.writeString(new SerializedString("str"));
        src.writeFieldName("plain");
        src.writeNumber(1);
        src.writeEndObject();
        src.writeNumber((short) 2);
        src.writeNumber(1.5d);
        src.writeNumber(2.5f);
        src.writeBoolean(false);
        src.writeNull();
        src.writeObject(new byte[] {7, 8});
        src.writeEndArray();

        TokenBuffer dst = new TokenBuffer((ObjectCodec) null);
        src.serialize(dst);

        JsonParser p = dst.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("ser", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("str", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("plain", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2.5f, p.getFloatValue(), 0.0f);
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[] {7, 8}, (byte[]) p.getEmbeddedObject());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNativeIds() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null, true);
        src.writeStartObject();
        src.writeFieldName("a");
        src.writeTypeId("type-1");
        src.writeObjectId("obj-1");
        src.writeString("value");
        src.writeEndObject();

        JsonParser p = src.asParser();
        assertTrue(p.canReadTypeId());
        assertTrue(p.canReadObjectId());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals("type-1", p.getTypeId());
        assertEquals("obj-1", p.getObjectId());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();

        TokenBuffer dst = new TokenBuffer((ObjectCodec) null, true);
        src.serialize(dst);

        JsonParser p2 = dst.asParser();
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("a", p2.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p2.nextToken());
        assertEquals("value", p2.getText());
        assertEquals("type-1", p2.getTypeId());
        assertEquals("obj-1", p2.getObjectId());
        assertEquals(JsonToken.END_OBJECT, p2.nextToken());
        assertNull(p2.nextToken());
        p2.close();
    }

    @Test
    public void testToString() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        assertEquals("[TokenBuffer: ]", buf.toString());

        buf.writeStartObject();
        buf.writeFieldName("a");
        buf.writeString("x");
        buf.writeEndObject();

        String s = buf.toString();
        assertTrue(s.contains("START_OBJECT"));
        assertTrue(s.contains("FIELD_NAME(a)"));
        assertTrue(s.contains("VALUE_STRING"));
        assertTrue(s.contains("END_OBJECT"));
    }

    @Test
    public void testToStringTruncation() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        for (int i = 0; i < 105; i++) {
            buf.writeNull();
        }
        String s = buf.toString();
        assertTrue(s.contains(" ... (truncated 5 entries)"));
    }

    @Test
    public void testFirstToken() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        assertNull(buf.firstToken());
        buf.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buf.firstToken());
    }

    @Test
    public void testCopyCurrentEvent() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null);
        src.writeStartArray();
        src.writeStartObject();
        src.writeFieldName("f");
        src.writeNumber(1);
        src.writeEndObject();
        src.writeString("two");
        src.writeBinary(Base64Variants.getDefaultVariant(), new byte[] {1, 2}, 0, 2);
        src.writeBoolean(false);
        src.writeNull();
        src.writeEndArray();

        TokenBuffer dst = new TokenBuffer((ObjectCodec) null);
        JsonParser p = src.asParser();
        while (p.nextToken() != null) {
            dst.copyCurrentEvent(p);
        }
        p.close();

        JsonParser p2 = dst.asParser();
        assertEquals(JsonToken.START_ARRAY, p2.nextToken());
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("f", p2.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals(1, p2.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p2.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p2.nextToken());
        assertEquals("two", p2.getText());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p2.nextToken());
        assertArrayEquals(new byte[] {1, 2}, (byte[]) p2.getEmbeddedObject());
        assertEquals(JsonToken.VALUE_FALSE, p2.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p2.nextToken());
        assertEquals(JsonToken.END_ARRAY, p2.nextToken());
        assertNull(p2.nextToken());
        p2.close();
    }

    @Test
    public void testCopyCurrentStructure() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null);
        src.writeStartObject();
        src.writeFieldName("x");
        src.writeStartArray();
        src.writeNumber(1);
        src.writeString("a");
        src.writeEndArray();
        src.writeFieldName("y");
        src.writeBoolean(true);
        src.writeEndObject();

        JsonParser p = src.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        TokenBuffer dst = new TokenBuffer((ObjectCodec) null);
        dst.copyCurrentStructure(p);
        p.close();

        JsonParser p2 = dst.asParser();
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("x", p2.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p2.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertEquals(1, p2.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, p2.nextToken());
        assertEquals("a", p2.getText());
        assertEquals(JsonToken.END_ARRAY, p2.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p2.nextToken());
        assertEquals("y", p2.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p2.nextToken());
        assertEquals(JsonToken.END_OBJECT, p2.nextToken());
        assertNull(p2.nextToken());
        p2.close();
    }

    @Test
    public void testCopyEmptyStructure() throws Exception {
        TokenBuffer src = new TokenBuffer((ObjectCodec) null);
        src.writeStartObject();
        src.writeEndObject();

        JsonParser p = src.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        TokenBuffer dst = new TokenBuffer((ObjectCodec) null);
        dst.copyCurrentStructure(p);
        p.close();

        JsonParser p2 = dst.asParser();
        assertEquals(JsonToken.START_OBJECT, p2.nextToken());
        assertEquals(JsonToken.END_OBJECT, p2.nextToken());
        assertNull(p2.nextToken());
        p2.close();
    }

    @Test
    public void testPeekNextToken() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeNumber(1);
        buf.writeNumber(2);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.peekNextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.peekNextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertNull(p.peekNextToken());
        assertNull(p.nextToken());
        p.close();

        assertNull(p.peekNextToken());
    }

    @Test
    public void testParserCurrentNameOverride() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeFieldName("orig");
        buf.writeNumber(1);
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("orig", p.getCurrentName());
        p.overrideCurrentName("changed");
        assertEquals("changed", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testParserNumberAccessOnNonNumericFails() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();

        JsonParser p = buf.asParser();
        p.nextToken();
        p.getIntValue();
        p.close();
    }

    @Test
    public void testUnsupportedOperations() throws Exception {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);

        try {
            buf.writeRaw("x");
            fail("writeRaw should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        try {
            buf.writeRawValue("x");
            fail("writeRawValue should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        try {
            buf.writeUTF8String(new byte[] {'a'}, 0, 1);
            fail("writeUTF8String should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        try {
            buf.writeBinary(null, (InputStream) null, 0);
            fail("writeBinary(InputStream) should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}