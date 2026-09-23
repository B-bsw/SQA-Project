package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class TokenBufferTest {

    private TokenBuffer buffer;
    private ObjectCodec objectCodec;

    @Before
    public void setUp() {
        objectCodec = new ObjectCodec() {
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T extends TreeNode> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public <T extends TreeNode> T valueToTree(Object fromValue) { return null; }
            @Override
            public JsonNode readTree(JsonParser p) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.databind.JavaType valueType) throws IOException { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException {
                if (value == null) {
                    g.writeNull();
                } else {
                    g.writeObject(value);
                }
            }
            @Override
            public void writeTree(JsonGenerator g, TreeNode rootNode) throws IOException { }
        };
        buffer = new TokenBuffer(objectCodec);
    }

    @After
    public void tearDown() {
        buffer = null;
    }

    @Test
    public void testConstructorWithNullCodec() {
        TokenBuffer b = new TokenBuffer((ObjectCodec) null);
        assertNotNull(b);
        assertEquals(0, b.getOutputContext().getCurrentIndex());
    }

    @Test
    public void testFirstTokenEmpty() {
        assertNull(buffer.firstToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws IOException {
        buffer.writeStartObject();
        assertEquals(JsonToken.START_OBJECT, buffer.firstToken());
    }

    @Test
    public void testWriteAndReadSimpleValues() throws IOException {
        buffer.writeString("value");
        buffer.writeNumber(42);
        buffer.writeBoolean(true);
        buffer.writeNull();
        buffer.writeEndArray();

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        assertToken(JsonToken.VALUE_TRUE, p.nextToken());
        assertToken(JsonToken.VALUE_NULL, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNestedStructure() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("array");
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeNumber(2);
        buffer.writeEndArray();
        buffer.writeFieldName("obj");
        buffer.writeStartObject();
        buffer.writeEndObject();
        buffer.writeEndObject();

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("array", p.getCurrentName());
        assertToken(JsonToken.START_ARRAY, p.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertToken(JsonToken.END_ARRAY, p.nextToken());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("obj", p.getCurrentName());
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertToken(JsonToken.END_OBJECT, p.nextToken());
        assertToken(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteNumberVariants() throws IOException {
        buffer.writeNumber((short) 5);
        buffer.writeNumber(5);
        buffer.writeNumber(5L);
        buffer.writeNumber(5.5f);
        buffer.writeNumber(5.5d);
        buffer.writeNumber(new BigDecimal("5.5"));
        buffer.writeNumber(new BigInteger("12345678901234567890"));

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(5, p.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(5, p.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(5L, p.getLongValue());
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(5.5f, p.getFloatValue(), 0.001);
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(5.5d, p.getDoubleValue(), 0.001);
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(new BigDecimal("5.5"), p.getDecimalValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(new BigInteger("12345678901234567890"), p.getBigIntegerValue());
    }

    @Test
    public void testWriteNullAndEmbeddedObject() throws IOException {
        buffer.writeNull();
        buffer.writeObject(new byte[]{1, 2, 3});
        buffer.writeObject(new RawValue("raw"));

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NULL, p.nextToken());
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) p.getEmbeddedObject());
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals("raw", ((RawValue) p.getEmbeddedObject()).toString());
    }

    @Test
    public void testWriteObjectIdAndTypeId() throws IOException {
        TokenBuffer b = new TokenBuffer(objectCodec);
        b.writeStartObject();
        b.writeFieldName("id");
        b.writeObjectId("objectId123");
        b.writeNumber(42);
        b.writeFieldName("type");
        b.writeTypeId("typeId456");
        b.writeString("value");
        b.writeEndObject();

        JsonParser p = b.asParser();
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("id", p.getCurrentName());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("objectId123", p.getObjectId());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("type", p.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("typeId456", p.getTypeId());
        assertToken(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testWriteRawValues() throws IOException {
        buffer.writeRawValue(JsonToken.VALUE_NUMBER_INT.ordinal(), 123);
        buffer.writeRawValue(JsonToken.VALUE_STRING.ordinal(), "raw");

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("raw", p.getText());
    }

    @Test
    public void testParserReadBinary() throws IOException {
        buffer.writeBinary(new byte[]{10, 20, 30});
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[]{10, 20, 30}, p.getBinaryValue());
    }

    @Test
    public void testParserNumberAccessors() throws IOException {
        buffer.writeNumber(42);
        buffer.writeNumber("123.45");
        buffer.writeNumber(new BigDecimal("77.7"));

        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        assertEquals(42L, p.getLongValue());
        assertEquals(42.0, p.getDoubleValue(), 0.001);
        assertEquals(NumberType.INT, p.getNumberType());
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals("123.45", p.getText());
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(NumberType.BIG_DECIMAL, p.getNumberType());
        assertEquals(new BigDecimal("77.7"), p.getDecimalValue());
    }

    @Test
    public void testParserTextWithNonString() throws IOException {
        buffer.writeNumber(123);
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("123", p.getText());
    }

    @Test
    public void testParserGetTextCharacters() throws IOException {
        buffer.writeString("hello");
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        char[] chars = p.getTextCharacters();
        assertEquals("hello", new String(chars, p.getTextOffset(), p.getTextLength()));
    }

    @Test
    public void testParserGetCurrentNameWithContext() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("field");
        buffer.writeString("val");
        buffer.writeEndObject();

        JsonParser p = buffer.asParser();
        p.nextToken();
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("field", p.getCurrentName());
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("field", p.getCurrentName());
    }

    @Test
    public void testParserNextFieldName() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeNumber(1);
        buffer.writeFieldName("b");
        buffer.writeNumber(2);
        buffer.writeEndObject();

        JsonParser p = buffer.asParser();
        p.nextToken();
        assertEquals("a", p.nextFieldName());
        assertEquals("a", p.nextFieldName());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("b", p.nextFieldName());
        assertEquals("b", p.nextFieldName());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
    }

    @Test
    public void testParserGetCurrentLocation() throws IOException {
        buffer.writeString("test");
        JsonParser p = buffer.asParser();
        p.nextToken();
        assertEquals(JsonLocation.NA, p.getCurrentLocation());
    }

    @Test
    public void testParserGetNumberValueNumericString() throws IOException {
        buffer.writeString("123.45");
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(123.45, p.getNumberValue().doubleValue(), 0.001);
    }

    @Test
    public void testParserGetNumberValueNonNumeric() throws IOException {
        buffer.writeBoolean(true);
        JsonParser p = buffer.asParser();
        p.nextToken();
        try {
            p.getNumberValue();
            fail("Expected JsonParseException for non-numeric token");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testParserEmbeddedObjectAsByteArray() throws IOException {
        byte[] data = {1, 2, 3};
        buffer.writeObject(data);
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(data, p.getEmbeddedObject());
    }

    @Test
    public void testParserEmbeddedObjectWhenNotEmbedded() throws IOException {
        buffer.writeNumber(1);
        JsonParser p = buffer.asParser();
        p.nextToken();
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testParserNextTokenAfterEnd() throws IOException {
        buffer.writeString("a");
        JsonParser p = buffer.asParser();
        assertNotNull(p.nextToken());
        assertNull(p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testParserClosedCheck() throws IOException {
        JsonParser p = buffer.asParser();
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.nextToken());
    }

    @Test
    public void testGetOutputContext() {
        JsonStreamContext context = buffer.getOutputContext();
        assertNotNull(context);
        assertEquals(0, context.getCurrentIndex());
    }

    @Test
    public void testVersion() {
        assertNotNull(buffer.version());
        assertTrue(buffer.version().getMajorVersion() >= 0);
    }

    @Test
    public void testFeatureFlags() {
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        int mask = buffer.getFeatureMask();
        buffer.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        buffer.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        buffer.setFeatureMask(mask);
        assertEquals(mask, buffer.getFeatureMask());
    }

    @Test
    public void testCanWriteBinaryAndNativeIds() {
        assertTrue(buffer.canWriteBinaryNatively());
        assertFalse(buffer.canWriteObjectId());
        assertFalse(buffer.canWriteTypeId());
    }

    @Test
    public void testWriteObjectWithNull() throws IOException {
        buffer.writeObject(null);
        JsonParser p = buffer.asParser();
        assertToken(JsonToken.VALUE_NULL, p.nextToken());
    }

    @Test
    public void testAppendWithManyTokensUsesMultipleSegments() throws IOException {
        for (int i = 0; i < 1000; i++) {
            buffer.writeNumber(i);
        }
        JsonParser p = buffer.asParser();
        for (int i = 0; i < 1000; i++) {
            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
    }

    @Test
    public void testCopyCurrentEventWithObjectInfo() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("x");
        buffer.writeString("y");
        buffer.writeEndObject();

        TokenBuffer other = new TokenBuffer(objectCodec);
        JsonParser p = buffer.asParser();
        p.nextToken();
        JsonParser p2 = other.asParser();
        p2.copyCurrentEvent(p);
        assertToken(JsonToken.START_OBJECT, p2.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("arr");
        buffer.writeStartArray();
        buffer.writeNumber(1);
        buffer.writeEndArray();
        buffer.writeEndObject();

        TokenBuffer other = new TokenBuffer(objectCodec);
        JsonParser p = buffer.asParser();
        p.nextToken();
        other.copyCurrentStructure(p);
        JsonParser p2 = other.asParser();
        assertToken(JsonToken.START_OBJECT, p2.nextToken());
        assertToken(JsonToken.FIELD_NAME, p2.nextToken());
        assertToken(JsonToken.START_ARRAY, p2.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, p2.nextToken());
        assertToken(JsonToken.END_ARRAY, p2.nextToken());
        assertToken(JsonToken.END_OBJECT, p2.nextToken());
    }

    @Test
    public void testToStringEmptyBuffer() {
        assertEquals("", buffer.toString());
    }

    @Test
    public void testToStringWithContent() throws IOException {
        buffer.writeStartObject();
        buffer.writeFieldName("key");
        buffer.writeString("value");
        buffer.writeEndObject();
        String result = buffer.toString();
        assertTrue(result.length() > 0);
    }

    @Test
    public void testWriteTypeIdAndObjectIdWhenNativeIdsDisabled() {
        try {
            buffer.writeTypeId("type");
            fail("Expected JsonGenerationException");
        } catch (IOException e) {
            assertEquals("Jackson NOT support native type ids", e.getMessage());
        }
        try {
            buffer.writeObjectId("obj");
            fail("Expected JsonGenerationException");
        } catch (IOException e) {
            assertEquals("Jackson NOT support native object ids", e.getMessage());
        }
    }

    @Test
    public void testAfterTeardown() {
        buffer = null;
    }

    private void assertToken(JsonToken expected, JsonToken actual) {
        assertEquals(expected, actual);
    }
}