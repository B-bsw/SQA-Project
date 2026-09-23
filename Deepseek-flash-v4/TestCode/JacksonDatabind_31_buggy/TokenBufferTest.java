package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBufferTest {
    private TokenBuffer buffer;

    @Before
    public void setUp() {
        buffer = new TokenBuffer(null);
    }

    @Test
    public void testInitialState() {
        assertNull(buffer.firstToken());
        assertFalse(buffer.isClosed());
        assertNotNull(buffer.getOutputContext());
        assertEquals(buffer.getCodec(), null);
        assertFalse(buffer.canWriteTypeId());
        assertFalse(buffer.canWriteObjectId());
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertEquals(0, buffer.getFeatureMask());
    }

    @Test
    public void testForceUseOfBigDecimal() {
        TokenBuffer result = buffer.forceUseOfBigDecimal(true);
        assertSame(buffer, result);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testWriteAndReadSimpleTokens() throws IOException {
        buffer.writeStartObject();
        buffer.writeNumberField("num", 42);
        buffer.writeStringField("str", "hello");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("num", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("str", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testWriteNullValue() throws IOException {
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteBooleanValues() throws IOException {
        buffer.writeBoolean(true);
        buffer.writeBoolean(false);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testWriteNumbers() throws IOException {
        buffer.writeNumber((short) 100);
        buffer.writeNumber(1000);
        buffer.writeNumber(100000L);
        buffer.writeNumber(1.5d);
        buffer.writeNumber(2.5f);
        buffer.writeNumber(new BigDecimal("3.14159"));
        buffer.writeNumber(new BigInteger("123456789"));

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(100, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1000, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(100000L, parser.getLongValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5d, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.5f, parser.getFloatValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0, new BigDecimal("3.14159").compareTo(parser.getDecimalValue()));

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, new BigInteger("123456789").compareTo(parser.getBigIntegerValue()));
    }

    @Test
    public void testWriteNumbersAsStrings() throws IOException {
        buffer.writeNumber("123");
        buffer.writeNumber("3.14");

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testWriteNullNumber() throws IOException {
        buffer.writeNumber((String) null);
        buffer.writeNumber((BigDecimal) null);
        buffer.writeNumber((BigInteger) null);

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteRawValue() throws IOException {
        buffer.writeRawValue("test");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertNotNull(parser.getEmbeddedObject());
    }

    @Test
    public void testWriteObjectNull() throws IOException {
        buffer.writeObject(null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testWriteBytes() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        buffer.writeBinary(data);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, parser.getBinaryValue());
    }

    @Test
    public void testWriteEmbeddedObject() throws IOException {
        Object obj = new Object();
        buffer.writeEmbeddedObject(obj);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(obj, parser.getEmbeddedObject());
    }

    @Test
    public void testWriteArray() throws IOException {
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testWriteNestedStructures() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("array");
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeStartObject();
        buffer.writeStringField("key", "value");
        buffer.writeEndObject();
        buffer.writeEndArray();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParserNextFieldName() throws IOException {
        buffer.writeStartObject();
        buffer.writeStringField("field1", "value1");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertTrue(parser.nextFieldName());
        assertEquals("field1", parser.getCurrentName());
    }

    @Test
    public void testParserNextTokenWithMultipleValues() throws IOException {
        buffer.writeString("test");
        buffer.writeNumber(42);
        buffer.writeBoolean(true);

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("test", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
    }

    @Test
    public void testParserGetCurrentName() throws IOException {
        buffer.writeStartObject();
        buffer.writeStringField("name", "value");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
    }

    @Test
    public void testParserGetTextWithCurrentToken() throws IOException {
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testParserGetNumberType() throws IOException {
        buffer.writeNumber(42);
        buffer.writeNumber(3.14);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        parser.nextToken();
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testParserGetNumberValue() throws IOException {
        buffer.writeNumber(42);
        buffer.writeNumber(3.14);
        buffer.writeNumber("123.456");

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(42, parser.getNumberValue().intValue());

        parser.nextToken();
        assertEquals(3.14, parser.getNumberValue().doubleValue(), 0.0001);

        parser.nextToken();
        assertEquals(123.456, parser.getNumberValue().doubleValue(), 0.0001);
    }

    @Test
    public void testParserGetIntValue() throws IOException {
        buffer.writeNumber(42);
        buffer.writeNumber("100");

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(100, parser.getIntValue());
    }

    @Test
    public void testParserGetLongValue() throws IOException {
        buffer.writeNumber(42L);
        buffer.writeNumber("10000000000");

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42L, parser.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10000000000L, parser.getLongValue());
    }

    @Test
    public void testParserGetDoubleValue() throws IOException {
        buffer.writeNumber(3.14);
        buffer.writeNumber("2.718");

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.718, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testParserGetEmbeddedObject() throws IOException {
        Object obj = new Object();
        buffer.writeEmbeddedObject(obj);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(obj, parser.getEmbeddedObject());
    }

    @Test
    public void testParserGetBinaryValue() throws IOException {
        byte[] data = {10, 20, 30};
        buffer.writeBinary(data);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, parser.getBinaryValue());
    }

    @Test
    public void testParserSkipChildren() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("f");
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeNumber(2);
        buffer.writeEndArray();
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParserSetLocation() throws IOException {
        buffer.writeString("test");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.setLocation(JsonLocation.NA);
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
    }

    @Test
    public void testParserOverrideCurrentName() throws IOException {
        buffer.writeStartObject();
        buffer.writeStringField("old", "value");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.nextToken();
        parser.overrideCurrentName("newName");
        assertEquals("newName", parser.getCurrentName());
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameOutsideObject() throws IOException {
        buffer.writeFieldName("test");
    }

    @Test(expected = IOException.class)
    public void testParserGetBinaryValueNotBinary() throws IOException {
        buffer.writeString("test");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.getBinaryValue();
    }

    @Test
    public void testToStringWithContent() throws IOException {
        buffer.writeString("test");
        String result = buffer.toString();
        assertTrue(result.contains("test"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEmbeddedObjectNotEmbedded() throws IOException {
        buffer.writeString("test");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.getEmbeddedObject();
    }

    @Test
    public void testParserGetParsingContext() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("f");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertNotNull(parser.getParsingContext());
        parser.nextToken();
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testParserGetTextCharacters() throws IOException {
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertNotNull(parser.getTextCharacters());
        assertEquals("hello", new String(parser.getTextCharacters(), 0, parser.getTextLength()));
        assertEquals(0, parser.getTextOffset());
        assertTrue(parser.hasTextCharacters());
    }

    @Test
    public void testParserClose() throws IOException {
        buffer.writeString("test");
        JsonParser parser = buffer.asParser();
        parser.close();
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppendToSegmentGrowth() throws IOException {
        for (int i = 0; i < 100; i++) {
            buffer.writeNumber(i);
        }
        JsonParser parser = buffer.asParser();
        for (int i = 0; i < 100; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(i, parser.getIntValue());
        }
    }
}