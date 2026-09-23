package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.ObjectCodec;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class TokenBufferTest {

    private TokenBuffer buffer;
    private ObjectCodec codec;

    @Before
    public void setUp() {
        codec = new ObjectCodec() {
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public JsonNode readTree(JsonParser p) { return null; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.databind.JavaType valueType) { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException {
                if (value instanceof String) {
                    g.writeString((String) value);
                } else if (value instanceof Integer) {
                    g.writeNumber((Integer) value);
                } else {
                    throw new IOException("Unsupported type: " + value.getClass());
                }
            }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException { return null; }
            @Override
            public JsonNode valueToTree(Object value) { return null; }
            @Override
            public boolean canOverrideAccessModifiers() { return false; }
            @Override
            public Class<?> getDefaultJavaType(Class<?> cls) { return null; }
            @Override
            public JsonNode missingNode() { return null; }
            @Override
            public JsonNode nullNode() { return null; }
        };
        buffer = new TokenBuffer(codec);
    }

    @Test
    public void testFirstTokenInitiallyNull() {
        assertNull(buffer.firstToken());
    }

    @Test
    public void testAppendAndFirstToken() throws IOException {
        buffer.writeStartArray();
        buffer.writeString("test");
        buffer.writeEndArray();
        assertEquals(JsonToken.START_ARRAY, buffer.firstToken());
    }

    @Test
    public void testAppendOtherBuffer() throws IOException {
        TokenBuffer other = new TokenBuffer(codec);
        other.writeStartObject();
        other.writeString("key");
        other.writeString("value");
        other.writeEndObject();

        buffer.writeStartArray();
        buffer.writeString("item");
        buffer.writeEndArray();
        buffer.append(other);

        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("item", parser.getText());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testAsParserWithObjectCodec() throws IOException {
        buffer.writeStartObject();
        buffer.writeString("name");
        buffer.writeString("John");
        buffer.writeEndObject();

        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("John", parser.getText());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testAsParserWithSource() throws IOException {
        buffer.writeStartObject();
        buffer.writeString("age");
        buffer.writeNumber(25);
        buffer.writeEndObject();

        JsonParser src = new ParserMinimalBase() {
            @Override
            public JsonToken nextToken() { return null; }
            @Override
            public JsonLocation getCurrentLocation() { return null; }
            @Override
            public String getCurrentName() { return null; }
            @Override
            public void overrideCurrentName(String name) {}
            @Override
            public void close() {}
            @Override
            public boolean isClosed() { return false; }
            @Override
            public JsonStreamContext getParsingContext() { return null; }
        };

        JsonParser parser = buffer.asParser(src);
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("age", parser.getCurrentName());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(25, parser.getIntValue());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSerializeJsonGenerator() throws IOException {
        JsonFactory factory = new JsonFactory();
        ByteArrayBuilder out = new ByteArrayBuilder();
        JsonGenerator gen = factory.createGenerator(out);
        gen.writeStartArray();
        gen.writeString("hello");
        gen.writeNumber(42);
        gen.writeEndArray();
        gen.close();

        buffer.writeStartArray();
        buffer.writeString("hello");
        buffer.writeNumber(42);
        buffer.writeEndArray();

        ByteArrayBuilder out2 = new ByteArrayBuilder();
        JsonGenerator gen2 = factory.createGenerator(out2);
        buffer.serialize(gen2);
        gen2.close();

        String expected = out.toString().replace("\"", "");
        String actual = out2.toString().replace("\"", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testWriteStartAndEndArray() throws IOException {
        buffer.writeStartArray();
        assertEquals(JsonToken.START_ARRAY, buffer.getCurrentToken());
        buffer.writeEndArray();
        assertEquals(JsonToken.END_ARRAY, buffer.getCurrentToken());
    }

    @Test
    public void testWriteStartEndObject() throws IOException {
        buffer.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buffer.getCurrentToken());
        buffer.writeEndObject();
        assertEquals(JsonToken.END_OBJECT, buffer.getCurrentToken());
    }

    @Test
    public void testWriteFieldNameString() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("name");
        buffer.writeString("value");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName(new SerializableString() {
            @Override
            public String getValue() { return "key"; }
            @Override
            public int charLength() { return 3; }
            @Override
            public char[] asQuotedChars() { return new char[]{'k', 'e', 'y'}; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[]{'k', 'e', 'y'}; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[]{'k', 'e', 'y'}; }
            @Override
            public String toString() { return "key"; }
        });
        buffer.writeString("val");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
    }

    @Test
    public void testWriteNumberValues() throws IOException {
        buffer.writeStartArray();
        buffer.writeNumber(123);
        buffer.writeNumber(123L);
        buffer.writeNumber((short) 42);
        buffer.writeNumber(3.14);
        buffer.writeNumber(2.5f);
        buffer.writeNumber(BigDecimal.valueOf(4.56));
        buffer.writeNumber(BigInteger.valueOf(789));
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123L, parser.getLongValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.5f, parser.getFloatValue(), 0.0001);
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0, new BigDecimal("4.56").compareTo(parser.getDecimalValue()));
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(BigInteger.valueOf(789), parser.getBigIntegerValue());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testWriteBooleanAndNull() throws IOException {
        buffer.writeStartArray();
        buffer.writeBoolean(true);
        buffer.writeBoolean(false);
        buffer.writeNull();
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.VALUE_TRUE, parser.nextToken());
        assertToken(JsonToken.VALUE_FALSE, parser.nextToken());
        assertToken(JsonToken.VALUE_NULL, parser.nextToken());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testWriteObjectAndEmbeddedObject() throws IOException {
        buffer.writeStartArray();
        buffer.writeObject("hello");
        byte[] data = new byte[]{1, 2, 3};
        buffer.writeObject(data);
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("hello", parser.getEmbeddedObject());
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testGetOutputContext() {
        assertEquals(JsonWriteContext.createRootContext(null).getCurrentIndex(), buffer.getOutputContext().getCurrentIndex());
    }

    @Test
    public void testCanWriteBinaryNativelyTrue() {
        assertTrue(buffer.canWriteBinaryNatively());
    }

    @Test
    public void testFlushAndClose() throws IOException {
        buffer.writeStartArray();
        buffer.flush();
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testIsEnabled() {
        assertEquals(0, buffer.getFeatureMask());
    }

    @Test
    public void testEnableDisableFeatures() {
        buffer.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        buffer.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test(expected = IOException.class)
    public void testWriteObjectWithInvalidType() throws IOException {
        buffer.writeStartArray();
        buffer.writeObject(new Object() {});
        buffer.writeEndArray();
    }

    @Test
    public void testAppendWithNativeIds() throws IOException {
        TokenBuffer bufferWithIds = new TokenBuffer(codec, true);
        bufferWithIds.writeStartObject();
        bufferWithIds.writeFieldName("id");
        bufferWithIds.writeNumber(1);
        bufferWithIds.writeEndObject();

        TokenBuffer bufferWithoutIds = new TokenBuffer(codec);
        bufferWithoutIds.writeStartArray();
        bufferWithoutIds.append(bufferWithIds);
        bufferWithoutIds.writeEndArray();

        JsonParser parser = bufferWithoutIds.asParser();
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testCopyCurrentEvent() throws IOException {
        TokenBuffer src = new TokenBuffer(codec);
        src.writeStartObject();
        src.writeString("key");
        src.writeString("value");
        src.writeEndObject();

        JsonParser parser = src.asParser();
        parser.nextToken();
        buffer.writeStartObject();
        buffer.copyCurrentEvent(parser);
        buffer.writeEndObject();

        JsonParser result = buffer.asParser();
        assertToken(JsonToken.START_OBJECT, result.nextToken());
        assertToken(JsonToken.FIELD_NAME, result.nextToken());
        assertEquals("key", result.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, result.nextToken());
        assertEquals("value", result.getText());
        assertToken(JsonToken.END_OBJECT, result.nextToken());
    }

    @Test
    public void testNumberTypeDetection() throws IOException {
        buffer.writeNumber(5);
        buffer.writeNumber(5L);
        buffer.writeNumber(3.5);
        buffer.writeNumber(new BigDecimal("2.5"));
        buffer.writeNumber(new BigInteger("123"));
        buffer.writeNumber(1.5f);
        buffer.writeNumber((short) 2);

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(NumberType.INT, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.LONG, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.DOUBLE, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.BIG_DECIMAL, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.BIG_INTEGER, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.FLOAT, parser.getNumberType());
        parser.nextToken();
        assertEquals(NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetTextWithDifferentTokenTypes() throws IOException {
        buffer.writeStartArray();
        buffer.writeString("text");
        buffer.writeNumber(42);
        buffer.writeBoolean(true);
        buffer.writeEndArray();

        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals("START_ARRAY", parser.getText());
        parser.nextToken();
        assertEquals("text", parser.getText());
        parser.nextToken();
        assertEquals("42", parser.getText());
        parser.nextToken();
        assertEquals("true", parser.getText());
    }

    @Test
    public void testGetBinaryValue() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        buffer.writeObject(data);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertArrayEquals(data, parser.getBinaryValue());
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        buffer.writeStartArray();
        assertNotNull(buffer.asParser().getCurrentLocation());
    }

    @Test
    public void testGetTokenLocation() throws IOException {
        buffer.writeStartArray();
        assertNotNull(buffer.asParser().getTokenLocation());
    }

    @Test
    public void testCanReadObjectIdAndTypeId() throws IOException {
        TokenBuffer bufferWithIds = new TokenBuffer(codec, true);
        bufferWithIds.writeStartObject();
        bufferWithIds.writeObjectId("obj-1");
        bufferWithIds.writeTypeId("type-1");
        bufferWithIds.writeString("value");
        bufferWithIds.writeEndObject();

        TokenBuffer withoutIds = new TokenBuffer(codec);
        assertFalse(withoutIds.canReadObjectId());
        assertFalse(withoutIds.canReadTypeId());
    }

    @Test
    public void testGetObjectIdAndTypeId() throws IOException {
        TokenBuffer bufferWithIds = new TokenBuffer(codec, true);
        bufferWithIds.writeStartObject();
        bufferWithIds.writeObjectId("obj-1");
        bufferWithIds.writeTypeId("type-1");
        bufferWithIds.writeString("value");
        bufferWithIds.writeEndObject();

        JsonParser parser = bufferWithIds.asParser();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals("obj-1", parser.getObjectId());
        assertEquals("type-1", parser.getTypeId());
    }

    @Test
    public void testGetCurrentNameWithParsingContext() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("field");
        buffer.writeString("value");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.nextToken();
        assertEquals("field", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("field");
        buffer.writeString("value");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.nextToken();
        parser.overrideCurrentName("newField");
        assertEquals("newField", parser.getCurrentName());
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals("hello", new String(parser.getTextCharacters()));
    }

    @Test
    public void testGetTextLength() throws IOException {
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testHasTextCharacters() throws IOException {
        buffer.writeString("hello");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        buffer.writeNumber(new BigInteger("1234567890"));
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(new BigInteger("1234567890"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        buffer.writeNumber(new BigDecimal("3.14"));
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(new BigDecimal("3.14"), parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws IOException {
        buffer.writeNumber(2.25);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(2.25, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetFloatValue() throws IOException {
        buffer.writeNumber(1.5f);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(1.5f, parser.getFloatValue(), 0.0001);
    }

    @Test
    public void testGetIntValue() throws IOException {
        buffer.writeNumber(42);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws IOException {
        buffer.writeNumber(123456789L);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(123456789L, parser.getLongValue());
    }

    @Test
    public void testGetNumberTypeFromObject() throws IOException {
        buffer.writeNumber(42);
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberValueWithString() throws IOException {
        buffer.writeString("3.14");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
    }

    @Test(expected = JsonParseException.class)
    public void testGetNumberValueWithInvalidString() throws IOException {
        buffer.writeString("abc");
        JsonParser parser = buffer.asParser();
        parser.nextToken();
        parser.getIntValue();
    }

    @Test
    public void testGetCurrentTokenWhenClosed() throws IOException {
        buffer.writeStartArray();
        buffer.close();
        JsonParser parser = buffer.asParser();
        parser.close();
        assertNull(parser.nextToken());
    }

    @Test
    public void testSegmentAppendAndSetters() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        assertEquals(0, segment.rawType(0));
        segment.append(0, JsonToken.START_OBJECT, null);
        assertEquals(JsonToken.START_OBJECT, segment.type(0));
    }

    @Test
    public void testSegmentAppendWithIds() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        segment.append(0, JsonToken.VALUE_STRING, "value", "objId", "typeId");
        assertEquals("objId", segment.findObjectId(0));
        assertEquals("typeId", segment.findTypeId(0));
    }

    @Test
    public void testSegmentAppendRaw() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        segment.appendRaw(0, JsonToken.VALUE_STRING.asNativeType(), "value");
        assertEquals(JsonToken.VALUE_STRING, segment.type(0));
    }

    @Test
    public void testSegmentNext() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        assertNull(segment.next());
    }

    @Test
    public void testSegmentHasIds() {
        TokenBuffer.Segment segment = new TokenBuffer.Segment();
        assertFalse(segment.hasIds());
    }
}