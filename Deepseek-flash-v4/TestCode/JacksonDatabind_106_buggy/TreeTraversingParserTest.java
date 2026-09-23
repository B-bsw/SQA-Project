package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonNode;

public class TreeTraversingParserTest {

    private ObjectCodec objectCodec;
    private Base64Variant base64Variant;

    @Before
    public void setUp() {
        objectCodec = new ObjectCodec() {
            @Override
            public JsonNode readTree(com.fasterxml.jackson.core.JsonParser p) throws IOException { return null; }
            @Override
            public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public com.fasterxml.jackson.core.JsonParser treeAsTokens(JsonNode n) { return null; }
            @Override
            public <T> T treeToValue(JsonNode n, Class<T> valueType) { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public void writeTree(com.fasterxml.jackson.core.JsonGenerator g, JsonNode rootNode) throws IOException {}
            @Override
            public void writeValue(com.fasterxml.jackson.core.JsonGenerator g, Object value) throws IOException {}
        };
        base64Variant = new Base64Variant("test", "abcd", true, '=', 64, new byte[256]);
    }

    @After
    public void tearDown() {
        objectCodec = null;
        base64Variant = null;
    }

    @Test
    public void testConstructorWithArrayNode() {
        ArrayNode arrayNode = new ArrayNode(null);
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode, objectCodec);
        Assert.assertNotNull(parser);
        Assert.assertFalse(parser.isClosed());
    }

    @Test
    public void testConstructorWithObjectNode() {
        ObjectNode objectNode = new ObjectNode(null);
        TreeTraversingParser parser = new TreeTraversingParser(objectNode, objectCodec);
        Assert.assertNotNull(parser);
        Assert.assertFalse(parser.isClosed());
    }

    @Test
    public void testConstructorWithValueNode() {
        IntNode intNode = new IntNode(42);
        TreeTraversingParser parser = new TreeTraversingParser(intNode, objectCodec);
        Assert.assertNotNull(parser);
        Assert.assertFalse(parser.isClosed());
    }

    @Test
    public void testSetCodecAndGetCodec() {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.setCodec(objectCodec);
        Assert.assertSame(objectCodec, parser.getCodec());
    }

    @Test
    public void testVersion() {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        Version version = parser.version();
        Assert.assertNotNull(version);
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        Assert.assertFalse(parser.isClosed());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        parser.close(); // second close should not throw
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testCloseSetsCurrTokenToNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.nextToken();
        Assert.assertNotNull(parser.getCurrentToken());
        parser.close();
        Assert.assertNull(parser.getCurrentToken());
    }

    @Test
    public void testNextTokenWithInitialValueNode() throws IOException {
        IntNode node = new IntNode(42);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        Assert.assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenWithArrayNode() throws IOException {
        ArrayNode arrayNode = new ArrayNode(null);
        arrayNode.add(1);
        arrayNode.add(2);
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        Assert.assertTrue(parser.isClosed());
    }

    @Test
    public void testNextTokenWithObjectNode() throws IOException {
        ObjectNode objectNode = new ObjectNode(null);
        objectNode.put("field", 1);
        TreeTraversingParser parser = new TreeTraversingParser(objectNode, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithNullAndNoChildren() throws IOException {
        NullNode nullNode = new NullNode();
        TreeTraversingParser parser = new TreeTraversingParser(nullNode, objectCodec);
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NULL, token);
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithEmptyArrayNode() throws IOException {
        ArrayNode arrayNode = new ArrayNode(null);
        TreeTraversingParser parser = new TreeTraversingParser(arrayNode, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithEmptyObjectNode() throws IOException {
        ObjectNode objectNode = new ObjectNode(null);
        TreeTraversingParser parser = new TreeTraversingParser(objectNode, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithNestedArrays() throws IOException {
        ArrayNode innerArray = new ArrayNode(null);
        innerArray.add(1);
        ArrayNode outerArray = new ArrayNode(null);
        outerArray.add(innerArray);
        TreeTraversingParser parser = new TreeTraversingParser(outerArray, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithMultipleNestedLevels() throws IOException {
        ArrayNode level1 = new ArrayNode(null);
        ArrayNode level2 = new ArrayNode(null);
        level2.add(1);
        level2.add(2);
        level1.add(level2);
        TreeTraversingParser parser = new TreeTraversingParser(level1, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithDeepNesting() throws IOException {
        ArrayNode node = new ArrayNode(null);
        ArrayNode current = node;
        for (int i = 0; i < 100; i++) {
            ArrayNode next = new ArrayNode(null);
            current.add(next);
            current = next;
        }
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        int depth = 0;
        while (parser.nextToken() != null) {
            if (parser.getCurrentToken() == JsonToken.START_ARRAY) {
                depth++;
            }
        }
        Assert.assertEquals(101, depth);
    }

    @Test
    public void testNextTokenWithOverlappingScopes() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        ArrayNode arr = new ArrayNode(null);
        obj.set("arr", arr);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithMultipleConsecutiveArrays() throws IOException {
        ArrayNode arr1 = new ArrayNode(null);
        arr1.add(1);
        ArrayNode arr2 = new ArrayNode(null);
        arr2.add(2);
        ArrayNode outer = new ArrayNode(null);
        outer.add(arr1);
        outer.add(arr2);
        TreeTraversingParser parser = new TreeTraversingParser(outer, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithMultipleConsecutiveObjects() throws IOException {
        ObjectNode obj1 = new ObjectNode(null);
        obj1.put("a", 1);
        ObjectNode obj2 = new ObjectNode(null);
        obj2.put("b", 2);
        ArrayNode outer = new ArrayNode(null);
        outer.add(obj1);
        outer.add(obj2);
        TreeTraversingParser parser = new TreeTraversingParser(outer, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithNestedObjectsAndArrays() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        ArrayNode arr = new ArrayNode(null);
        obj.set("arr", arr);
        ObjectNode innerObj = new ObjectNode(null);
        innerObj.put("field", "value");
        arr.add(innerObj);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithReservedFieldNames() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("START_OBJECT", 1);
        obj.put("END_OBJECT", 2);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("START_OBJECT", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("END_OBJECT", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithEscapedNames() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("field\n", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("field\n", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithUnicodeCharacters() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("ünïcødé", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("ünïcødé", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithWhitespaceInNames() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("field with spaces", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("field with spaces", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithEmptyNames() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithLargeObject() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        for (int i = 0; i < 1000; i++) {
            obj.set("field" + i, new IntNode(i));
        }
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        int count = 0;
        while (parser.nextToken() != null) {
            if (parser.getCurrentToken() == JsonToken.VALUE_NUMBER_INT) {
                count++;
            }
        }
        Assert.assertEquals(1000, count);
    }

    @Test
    public void testNextTokenWithLargeArray() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        int count = 0;
        while (parser.nextToken() != null) {
            if (parser.getCurrentToken() == JsonToken.VALUE_NUMBER_INT) {
                count++;
            }
        }
        Assert.assertEquals(10000, count);
    }

    @Test
    public void testNextTokenWithMultipleArraysAndObjectsMixed() throws IOException {
        ArrayNode outerArray = new ArrayNode(null);
        ObjectNode obj1 = new ObjectNode(null);
        obj1.put("a", 1);
        ArrayNode innerArray1 = new ArrayNode(null);
        innerArray1.add(2);
        obj1.set("b", innerArray1);
        outerArray.add(obj1);
        ObjectNode obj2 = new ObjectNode(null);
        obj2.put("c", 3);
        outerArray.add(obj2);
        TreeTraversingParser parser = new TreeTraversingParser(outerArray, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithTrailingNullNodes() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        arr.add(null);
        arr.add(2);
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithPojoNode() throws IOException {
        class TestPojo {
            public int getValue() { return 42; }
        }
        TestPojo pojo = new TestPojo();
        POJONode pojoNode = new POJONode(pojo);
        TreeTraversingParser parser = new TreeTraversingParser(pojoNode, objectCodec);
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, token);
        Assert.assertSame(pojo, parser.getEmbeddedObject());
    }

    @Test
    public void testNextTokenWithBinaryNode() throws IOException {
        byte[] data = new byte[] {1, 2, 3, 4};
        BinaryNode binaryNode = new BinaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(binaryNode, objectCodec);
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, token);
        Assert.assertArrayEquals(data, parser.getEmbeddedObject() != null ? (byte[]) parser.getEmbeddedObject() : null);
    }

    @Test
    public void testNextTokenWithNumericNode() throws IOException {
        IntNode intNode = new IntNode(123);
        TreeTraversingParser parser = new TreeTraversingParser(intNode, objectCodec);
        parser.nextToken();
        Assert.assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testNextTokenWithFloatNode() throws IOException {
        DoubleNode doubleNode = new DoubleNode(12.34);
        TreeTraversingParser parser = new TreeTraversingParser(doubleNode, objectCodec);
        parser.nextToken();
        Assert.assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testNextTokenWithBigIntegerNode() throws IOException {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        BigIntegerNode bigIntegerNode = new BigIntegerNode(bigInt);
        TreeTraversingParser parser = new TreeTraversingParser(bigIntegerNode, objectCodec);
        parser.nextToken();
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testNextTokenWithBigDecimalNode() throws IOException {
        BigDecimal bigDec = new BigDecimal("12345.6789");
        DecimalNode decimalNode = new DecimalNode(bigDec);
        TreeTraversingParser parser = new TreeTraversingParser(decimalNode, objectCodec);
        parser.nextToken();
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testNextTokenWithArrayOfIntegers() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextFieldName(null));
        // need to test properly
        parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }

    @Test
    public void testNextTokenWithArrayOfDoubles() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1.1);
        arr.add(2.2);
        arr.add(3.3);
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(1.1, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(2.2, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(3.3, parser.getDoubleValue(), 0.0001);
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenWithObjectOfMixedTypes() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("int", 1);
        obj.put("float", 2.2);
        obj.put("string", "test");
        obj.put("bool", true);
        obj.put("null", (JsonNode) null);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("int", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("float", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("string", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("bool", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("null", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenWithUnicodeEscapes() throws IOException {
        String text = "line1\\nline2\\t\\u0041";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        String value = parser.getText();
        Assert.assertTrue(value.contains("\\"));
        Assert.assertTrue(value.contains("u0041"));
    }

    @Test
    public void testNextTokenWithEscapedBackslash() throws IOException {
        String text = "path\\\\to\\\\file";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("path\\\\to\\\\file", parser.getText());
    }

    @Test
    public void testNextTokenWithNewlines() throws IOException {
        String text = "foo\\nbar\\r\\nbaz";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("foo\\nbar\\r\\nbaz", parser.getText());
    }

    @Test
    public void testNextTokenWithControlCharacters() throws IOException {
        String text = "\\u0001\\u0002";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\\u0001\\u0002", parser.getText());
    }

    @Test
    public void testNextTokenWithSurrogatePairs() throws IOException {
        String text = "\\uD834\\uDD1E";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\\uD834\\uDD1E", parser.getText());
    }

    @Test
    public void testNextTokenWithInvalidSurrogates() throws IOException {
        String text = "\\uD800";
        TextNode textNode = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(textNode, objectCodec);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\\uD800", parser.getText());
    }

    @Test
    public void testNextTokenWithMixedContent() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("array", new ArrayNode(null).add(1).add(2));
        obj.put("object", new ObjectNode(null).put("key", "value"));
        obj.put("string", "test");
        obj.put("int", 3);
        obj.put("float", 4.5);
        obj.put("bool", true);
        obj.put("null", (JsonNode) null);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("array", parser.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals("object", parser.nextFieldName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("key", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertEquals("string", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("int", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("float", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("bool", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("null", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testSkipChildrenWithObject() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("a", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenWithArray() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenWithNestedArray() throws IOException {
        ArrayNode outer = new ArrayNode(null);
        ArrayNode inner = new ArrayNode(null);
        inner.add(1);
        outer.add(inner);
        TreeTraversingParser parser = new TreeTraversingParser(outer, objectCodec);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenWithNestedObject() throws IOException {
        ObjectNode outer = new ObjectNode(null);
        ObjectNode inner = new ObjectNode(null);
        inner.put("a", 1);
        outer.set("inner", inner);
        TreeTraversingParser parser = new TreeTraversingParser(outer, objectCodec);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testGetTextAfterClose() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("test"));
        parser.nextToken();
        parser.close();
        Assert.assertNull(parser.getText());
    }

    @Test
    public void testGetTextWithFieldName() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("field", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        Assert.assertEquals("field", parser.getText());
    }

    @Test
    public void testGetTextWithValueString() throws IOException {
        TextNode node = new TextNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextWithNumber() throws IOException {
        IntNode node = new IntNode(17);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals("17", parser.getText());
    }

    @Test
    public void testGetTextWithFloat() throws IOException {
        DoubleNode node = new DoubleNode(3.14);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals("3.14", parser.getText());
    }

    @Test
    public void testGetTextWithPojoNode() throws IOException {
        class TestPojo {
            @Override
            public String toString() { return "Pojo"; }
        }
        POJONode node = new POJONode(new TestPojo());
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals("Pojo", parser.getText());
    }

    @Test
    public void testGetTextWithBinaryNode() throws IOException {
        byte[] data = new byte[] {1, 2, 3};
        BinaryNode node = new BinaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertTrue(parser.getText().length() > 0);
    }

    @Test
    public void testGetTextTokens() throws IOException {
        TextNode node = new TextNode("testGetTextTokens");
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        int len = parser.getTextLength();
        int offset = parser.getTextOffset();
        Assert.assertEquals("testGetTextTokens", new String(chars, offset, len));
        Assert.assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetNumberTypeWithoutNumberNode() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        Assert.assertNull(parser.getNumberType());
    }

    @Test
    public void testGetIntValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getIntValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetLongValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getLongValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetBigIntegerValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getBigIntegerValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetBigDecimalValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getDecimalValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetDoubleValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getDoubleValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetFloatValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getFloatValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetNumberValueWithNonNumeric() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no"), objectCodec);
        parser.nextToken();
        try {
            parser.getNumberValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testCurrentNodeWithNoContent() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        Assert.assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetBinaryValueWithNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.nextToken();
        Assert.assertNull(parser.getBinaryValue(base64Variant));
    }

    @Test
    public void testGetBinaryValueWithTextNode() throws IOException {
        String text = "SGVsbG8gV29ybGQ=";
        TextNode node = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        byte[] data = parser.getBinaryValue(base64Variant);
        Assert.assertNotNull(data);
        Assert.assertArrayEquals("Hello World".getBytes(), data);
    }

    @Test
    public void testReadBinaryValueToOutputStream() throws IOException {
        String text = "SGVsbG8gV29ybGQ=";
        TextNode node = new TextNode(text);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(base64Variant, baos);
        Assert.assertEquals("Hello World".getBytes().length, count);
        Assert.assertEquals("Hello World", new String(baos.toByteArray()));
    }

    @Test
    public void testReadBinaryValueWithNoData() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("no binary"), objectCodec);
        parser.nextToken();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(base64Variant, baos);
        Assert.assertEquals(0, count);
        Assert.assertEquals(0, baos.size());
    }

    @Test
    public void testGetEmbeddedObjectWithClosedParser() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.close();
        Assert.assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testIsNaNWithNonNumberNode() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new TextNode("not a number"), objectCodec);
        parser.nextToken();
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testIsNaNWithNumberNode() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1), objectCodec);
        parser.nextToken();
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testIsNaNWithFloatNaN() throws IOException {
        DoubleNode node = new DoubleNode(Double.NaN);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertTrue(parser.isNaN());
    }

    @Test
    public void testIsNaNWithFloatInfinity() throws IOException {
        DoubleNode node = new DoubleNode(Double.POSITIVE_INFINITY);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertFalse(parser.isNaN());
    }

    @Test
    public void testCurrentNameWithClosedParser() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.nextFieldName(null);
        parser.close();
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testCurrentNameWithFieldName() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("field", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        parser.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        Assert.assertNull(parser.getCurrentName());
        parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        Assert.assertEquals("field", parser.getCurrentName());
    }

    @Test
    public void testCurrentNameWithNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new NullNode(), objectCodec);
        parser.nextToken();
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testCurrentNameWithObject() throws IOException {
        ObjectNode outer = new ObjectNode(null);
        ObjectNode inner = new ObjectNode(null);
        inner.put("inner_field", 1);
        outer.set("outer_field", inner);
        TreeTraversingParser parser = new TreeTraversingParser(outer, objectCodec);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME outer_field
        Assert.assertEquals("outer_field", parser.getCurrentName());
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME inner_field
        Assert.assertEquals("inner_field", parser.getCurrentName());
        parser.nextToken(); // VALUE_NUMBER_INT
        parser.nextToken(); // END_OBJECT
        parser.nextToken(); // END_OBJECT
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("original", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME original
        parser.overrideCurrentName("changed");
        Assert.assertEquals("changed", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentNameWithClosedParser() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1));
        parser.close();
        parser.overrideCurrentName("x");
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testGetParsingContextWithArray() throws IOException {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        TreeTraversingParser parser = new TreeTraversingParser(arr, objectCodec);
        parser.nextToken();
        JsonStreamContext context = parser.getParsingContext();
        Assert.assertNotNull(context);
        Assert.assertEquals(JsonStreamContext.TYPE_ARRAY, context.getType());
    }

    @Test
    public void testGetParsingContextWithObject() throws IOException {
        ObjectNode obj = new ObjectNode(null);
        obj.put("field", 1);
        TreeTraversingParser parser = new TreeTraversingParser(obj, objectCodec);
        parser.nextToken();
        JsonStreamContext context = parser.getParsingContext();
        Assert.assertNotNull(context);
        Assert.assertEquals(JsonStreamContext.TYPE_OBJECT, context.getType());
    }

    @Test
    public void testGetParsingContextWithRootValue() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1), objectCodec);
        parser.nextToken();
        JsonStreamContext context = parser.getParsingContext();
        Assert.assertNotNull(context);
        Assert.assertEquals(JsonStreamContext.TYPE_ROOT, context.getType());
    }

    @Test
    public void testGetTokenLocation() {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1), objectCodec);
        JsonLocation loc = parser.getTokenLocation();
        Assert.assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() {
        TreeTraversingParser parser = new TreeTraversingParser(new IntNode(1), objectCodec);
        JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
    }

    @Test
    public void testGetNumberValueWithLong() throws IOException {
        LongNode node = new LongNode(123456789L);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals(123456789L, parser.getLongValue());
    }

    @Test
    public void testGetNumberValueWithDouble() throws IOException {
        DoubleNode node = new DoubleNode(1.23);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals(1.23, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetNumberValueWithBigInteger() throws IOException {
        BigInteger bigInt = new BigInteger("1234567890123456789012345678901234567890");
        BigIntegerNode node = new BigIntegerNode(bigInt);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals(bigInt, parser.getBigIntegerValue());
    }

    @Test
    public void testGetNumberValueWithBigDecimal() throws IOException {
        BigDecimal bigDec = new BigDecimal("1234567890.123456789");
        DecimalNode node = new DecimalNode(bigDec);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals(bigDec, parser.getDecimalValue());
    }

    @Test
    public void testGetNumberValueWithFloat() throws IOException {
        FloatNode node = new FloatNode(3.14f);
        TreeTraversingParser parser = new TreeTraversingParser(node, objectCodec);
        parser.nextToken();
        Assert.assertEquals(3.14f, parser.getFloatValue(), 0.0001f);
    }

    @Test
    public void testCurrentNumericNodeNull() throws IOException {
        TreeTraversingParser parser = new TreeTraversingParser(new NullNode(), objectCodec);
        parser.nextToken();
        try {
            parser.getIntValue();
            Assert.fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }
}