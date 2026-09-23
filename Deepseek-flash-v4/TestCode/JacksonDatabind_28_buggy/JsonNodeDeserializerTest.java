package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import java.io.IOException;
import java.math.BigInteger;
import java.math.BigDecimal;

public class JsonNodeDeserializerTest {

    private JsonNodeDeserializer deserializer;
    private JsonNodeFactory nodeFactory;
    private JsonParser parser;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        deserializer = new JsonNodeDeserializer();
        nodeFactory = JsonNodeFactory.instance;
        // minimal stubs for parser and context
        parser = new com.fasterxml.jackson.core.json.ReaderReadContext(JsonParser.Feature.AUTO_CLOSE_SOURCE,
                JsonParser.Feature.AUTO_CLOSE_TARGET, JsonParser.Feature.STRICT_DUPLICATE_DETECTION,
                JsonParser.Feature.IGNORE_UNDEFINED, JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_YAML_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,
                JsonParser.Feature.ALLOW_SINGLE_QUOTES, JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS,
                JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS,
                JsonParser.Feature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS, JsonParser.Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS,
                JsonParser.Feature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS, JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS,
                JsonParser.Feature.ALLOW_MISSING_VALUES, JsonParser.Feature.ALLOW_TRAILING_COMMA) {
            // anonymous subclass for test
        };
        ctxt = new DeserializationContext(parser, null, null, null, null, null) {};
    }

    @After
    public void tearDown() {
        deserializer = null;
        nodeFactory = null;
        parser = null;
        ctxt = null;
    }

    @Test
    public void testGetDeserializer() {
        assertNotNull(JsonNodeDeserializer.getDeserializer(ObjectNode.class));
        assertNotNull(JsonNodeDeserializer.getDeserializer(ArrayNode.class));
        assertNotNull(JsonNodeDeserializer.getDeserializer(JsonNode.class));
        assertNotNull(JsonNodeDeserializer.getDeserializer(TextNode.class));
        assertSame(JsonNodeDeserializer.getDeserializer(ObjectNode.class), JsonNodeDeserializer.getDeserializer(ObjectNode.class));
    }

    @Test
    public void testGetNullValue() {
        assertNotNull(deserializer.getNullValue(ctxt));
        assertTrue(deserializer.getNullValue(ctxt) instanceof NullNode);
    }

    @Test
    public void testDeserializeNull() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NULL, null);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof NullNode);
    }

    @Test
    public void testDeserializeBooleanTrue() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_TRUE, null);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof BooleanNode);
        assertTrue(node.booleanValue());
    }

    @Test
    public void testDeserializeBooleanFalse() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_FALSE, null);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof BooleanNode);
        assertFalse(node.booleanValue());
    }

    @Test
    public void testDeserializeString() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_STRING, "test");
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertEquals("test", node.asText());
    }

    @Test
    public void testDeserializeInt() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NUMBER_INT, null);
        p.setNumberValue(123);
        p.setNumberType(JsonParser.NumberType.INT);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertEquals(123, node.asInt());
    }

    @Test
    public void testFromIntBigIntegerCoercion() throws Exception {
        DeserializationContext c = new DeserializationContext(parser, null, null, null, null, null) {
            @Override
            public boolean isEnabled(DeserializationFeature f) {
                return true;
            }
        };
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NUMBER_INT, null);
        p.setNumberValue(123);
        p.setNumberType(JsonParser.NumberType.BIG_INTEGER);
        JsonNode node = deserializer.deserialize(p, c);
        assertNotNull(node);
        assertEquals(123, node.asInt());
    }

    @Test
    public void testFromIntLongCoercion() throws Exception {
        DeserializationContext c = new DeserializationContext(parser, null, null, null, null, null) {
            @Override
            public boolean isEnabled(DeserializationFeature f) {
                return f == DeserializationFeature.USE_LONG_FOR_INTS;
            }
        };
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NUMBER_INT, null);
        p.setNumberValue(123L);
        p.setNumberType(JsonParser.NumberType.LONG);
        JsonNode node = deserializer.deserialize(p, c);
        assertNotNull(node);
        assertEquals(123L, node.asLong());
    }

    @Test
    public void testDeserializeFloat() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NUMBER_FLOAT, null);
        p.setNumberValue(12.5d);
        p.setNumberType(JsonParser.NumberType.DOUBLE);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertEquals(12.5d, node.asDouble(), 0.001);
    }

    @Test
    public void testDeserializeObject() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.START_OBJECT, null);
        // Simulate an empty object
        p.nextToken(); // move to END_OBJECT
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof ObjectNode);
        assertEquals(0, node.size());
    }

    @Test
    public void testDeserializeArray() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.START_ARRAY, null);
        // Simulate an empty array
        p.nextToken(); // move to END_ARRAY
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof ArrayNode);
        assertEquals(0, node.size());
    }

    @Test
    public void testDeserializeEmbedded() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_EMBEDDED_OBJECT, null);
        p.setEmbeddedObject("embedded");
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertTrue(node instanceof POJONode);
        assertEquals("embedded", node.asText());
    }

    @Test
    public void testFromEmbeddedWithNull() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_EMBEDDED_OBJECT, null);
        p.setEmbeddedObject(null);
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeAny() throws Exception {
        JsonParser p = new TestJsonParser(null, JsonToken.VALUE_NUMBER_INT, null);
        p.setNumberValue(42);
        p.setNumberType(JsonParser.NumberType.INT);
        JsonNode node = deserializer.deserialize(p, ctxt);
        assertNotNull(node);
        assertEquals(42, node.asInt());
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        // Should delegate to typeDeserializer
        JsonParser p = new TestJsonParser(null, JsonToken.START_OBJECT, null);
        try {
            deserializer.deserializeWithType(p, ctxt, null);
            fail("Expected NPE");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIsCachable() {
        assertTrue(deserializer.isCachable());
    }
}