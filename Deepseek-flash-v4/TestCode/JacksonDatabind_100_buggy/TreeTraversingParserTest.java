package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParserTest {

    private ObjectCodec codec;
    private JsonNode arrayNode;
    private JsonNode objectNode;
    private JsonNode valueNode;
    private JsonNode pojoNode;
    private JsonNode binaryNode;
    private JsonNode textNode;

    @Before
    public void setUp() {
        codec = new ObjectCodec() {};
        arrayNode = new ArrayNode(null);
        objectNode = new ObjectNode(null);
        valueNode = new IntNode(42);
        pojoNode = new POJONode(new Object());
        binaryNode = new BinaryNode(new byte[]{1, 2, 3});
        textNode = new TextNode("hello");
    }

    @Test
    public void testConstructorArrayNode() {
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode);
        assertNotNull(parser);
    }

    @Test
    public void testConstructorObjectNode() {
        TreeTraversingParser parser = new TreeTraversingParser(objectNode);
        assertNotNull(parser);
    }

    @Test
    public void testConstructorValueNode() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertNotNull(parser);
    }

    @Test
    public void testSetGetCodec() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testVersion() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertNotNull(parser.version());
    }

    @Test
    public void testClose() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testNextTokenStartArray() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenStartObject() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(objectNode);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyArray() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(objectNode);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenNested() throws IOException {
        ArrayNode nested = new ArrayNode(null);
        nested.add(new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenNestedObject() throws IOException {
        ObjectNode nested = new ObjectNode(null);
        nested.put("key", new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testSkipChildrenObject() throws IOException {
        ObjectNode nested = new ObjectNode(null);
        nested.put("key", new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        parser.nextToken(); // START_OBJECT
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenArray() throws IOException {
        ArrayNode nested = new ArrayNode(null);
        nested.add(new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        parser.nextToken(); // START_ARRAY
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testIsClosedInitial() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertFalse(parser.isClosed());
    }

    @Test
    public void testGetCurrentNameNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertEquals("", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        ObjectNode nested = new ObjectNode(null);
        nested.put("key", new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.overrideCurrentName("test");
        assertEquals("test", parser.getCurrentName());
    }

    @Test
    public void testGetParsingContext() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetTokenLocation() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
    }

    @Test
    public void testGetCurrentLocation() {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
    }

    @Test
    public void testGetTextFieldName() throws IOException {
        ObjectNode nested = new ObjectNode(null);
        nested.put("key", new IntNode(1));
        TreeTraversingParser parser = new TreeTraversingParser(nested);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("key", parser.getText());
    }

    @Test
    public void testGetTextValueString() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextIntValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertEquals("42", parser.getText());
    }

    @Test
    public void testGetTextBinaryValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode);
        parser.nextToken();
        assertEquals("AQID", parser.getText()); // base64 of {1,2,3}
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals("hello", new String(chars));
    }

    @Test
    public void testGetTextLength() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testHasTextCharacters() {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetNumberType() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        assertEquals(null, parser.getNumberType());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new BigIntegerNode(new BigInteger("123456789012345678901234567890")));
        parser.nextToken();
        assertEquals(new BigInteger("123456789012345678901234567890"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new DecimalNode(new BigDecimal("123.456")));
        parser.nextToken();
        assertEquals(new BigDecimal("123.456"), parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new DoubleNode(123.456));
        parser.nextToken();
        assertEquals(123.456, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetFloatValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new DoubleNode(123.456));
        parser.nextToken();
        assertEquals(123.456f, parser.getFloatValue(), 0.0001);
    }

    @Test
    public void testGetLongValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new LongNode(123456789L));
        parser.nextToken();
        assertEquals(123456789L, parser.getLongValue());
    }

    @Test
    public void testGetIntValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testGetNumberValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertEquals(42, parser.getNumberValue().intValue());
    }

    @Test
    public void testGetEmbeddedObjectPojo() throws IOException {
        Object obj = new Object();
        TreeTraversingParser parser = new TreeTraversingParser(new POJONode(obj));
        parser.nextToken();
        assertSame(obj, parser.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectBinary() throws IOException {
        byte[] data = new byte[]{1, 2, 3};
        TreeTraversingParser parser = new TreeTraversingParser(new BinaryNode(data));
        parser.nextToken();
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testIsNaN() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new DoubleNode(Double.NaN));
        parser.nextToken();
        assertTrue(parser.isNaN());
    }

    @Test
    public void testIsNaNFalse() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.nextToken();
        assertFalse(parser.isNaN());
    }

    @Test
    public void testGetBinaryValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode);
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[]{1, 2, 3}, result);
    }

    @Test
    public void testGetBinaryValueNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        assertNull(parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode);
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int length = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(3, length);
        assertArrayEquals(new byte[]{1, 2, 3}, out.toByteArray());
    }

    @Test
    public void testReadBinaryValueZeroLength() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, parser.readBinaryValue(Base64Variants.getDefaultVariant(), out));
    }

    @Test
    public void testCurrentNodeAfterClose() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(valueNode);
        parser.close();
        assertNull(parser.currentNode());
    }

    @Test
    public void testCurrentNumericNodeNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        try {
            parser.getIntValue();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }
}