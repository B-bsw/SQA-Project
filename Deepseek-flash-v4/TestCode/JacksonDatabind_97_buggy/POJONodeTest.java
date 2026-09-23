package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {

    private String writeValue(POJONode node) throws Exception {
        return new ObjectMapper().writeValueAsString(node);
    }

    @Test
    public void testNodeTypeAndToken() {
        POJONode node = new POJONode("x");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testBinaryValue() throws IOException {
        POJONode binary = new POJONode(new byte[] {1, 2, 3});
        assertArrayEquals(new byte[] {1, 2, 3}, binary.binaryValue());

        POJONode text = new POJONode("text");
        assertNull(text.binaryValue());

        assertNull(new POJONode(null).binaryValue());
    }

    @Test
    public void testAsText() {
        POJONode nullNode = new POJONode(null);
        POJONode textNode = new POJONode("value");

        assertEquals("null", nullNode.asText());
        assertEquals("value", textNode.asText());

        assertEquals("fallback", nullNode.asText("fallback"));
        assertEquals("value", textNode.asText("fallback"));
    }

    @Test
    public void testAsBoolean() {
        POJONode trueNode = new POJONode(Boolean.TRUE);
        POJONode falseNode = new POJONode(Boolean.FALSE);
        POJONode nonBoolean = new POJONode("text");

        assertTrue(trueNode.asBoolean(false));
        assertFalse(falseNode.asBoolean(true));
        assertTrue(nonBoolean.asBoolean(true));
        assertTrue(new POJONode(null).asBoolean(true));
    }

    @Test
    public void testAsNumericValues() {
        POJONode intNode = new POJONode(42);
        POJONode longNode = new POJONode(123L);
        POJONode doubleNode = new POJONode(3.25);
        POJONode nonNumber = new POJONode("text");

        assertEquals(42, intNode.asInt(0));
        assertEquals(123, longNode.asInt(0));
        assertEquals(7, nonNumber.asInt(7));
        assertEquals(7, new POJONode(null).asInt(7));

        assertEquals(42L, intNode.asLong(0L));
        assertEquals(123L, longNode.asLong(0L));
        assertEquals(7L, nonNumber.asLong(7L));
        assertEquals(7L, new POJONode(null).asLong(7L));

        assertEquals(3.25, doubleNode.asDouble(0.0), 0.0);
        assertEquals(42.0, intNode.asDouble(0.0), 0.0);
        assertEquals(7.0, nonNumber.asDouble(7.0), 0.0);
        assertEquals(7.0, new POJONode(null).asDouble(7.0), 0.0);
    }

    @Test
    public void testNumericBoundaries() {
        assertEquals(Integer.MAX_VALUE, new POJONode(Integer.MAX_VALUE).asInt(-1));
        assertEquals(Long.MAX_VALUE, new POJONode(Long.MAX_VALUE).asLong(-1L));
        assertEquals(Double.MAX_VALUE, new POJONode(Double.MAX_VALUE).asDouble(0.0), 0.0);
    }

    @Test
    public void testSerializeNull() throws Exception {
        assertEquals("null", writeValue(new POJONode(null)));
    }

    @Test
    public void testSerializeJsonSerializable() throws Exception {
        POJONode node = new POJONode(new JsonSerializableStub());
        assertEquals("{\"key\":\"value\"}", writeValue(node));
    }

    @Test
    public void testSerializePojo() throws Exception {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("x", 1);
        POJONode node = new POJONode(map);
        assertEquals("{\"x\":1}", writeValue(node));
    }

    @Test
    public void testGetPojo() {
        Object value = new Object();
        POJONode node = new POJONode(value);
        assertSame(value, node.getPojo());
        assertNull(new POJONode(null).getPojo());
    }

    @Test
    public void testEquals() {
        POJONode node = new POJONode("x");

        assertTrue(node.equals(node));
        assertFalse(node.equals(null));
        assertFalse(node.equals("x"));

        assertTrue(new POJONode("x").equals(new POJONode("x")));
        assertFalse(new POJONode("x").equals(new POJONode("y")));

        POJONode nullNode = new POJONode(null);
        assertTrue(nullNode.equals(new POJONode(null)));
        assertFalse(nullNode.equals(new POJONode("x")));
        assertFalse(new POJONode("x").equals(nullNode));
    }

    @Test
    public void testHashCode() {
        assertEquals(Integer.valueOf(42).hashCode(), new POJONode(42).hashCode());
    }

    @Test(expected = NullPointerException.class)
    public void testNullHashCodeThrowsNPE() {
        new POJONode(null).hashCode();
    }

    @Test
    public void testToString() {
        assertEquals("text", new POJONode("text").toString());
        assertEquals("null", new POJONode(null).toString());
        assertEquals("(binary value of 3 bytes)", new POJONode(new byte[] {1, 2, 3}).toString());
        assertEquals("(raw value 'abc')", new POJONode(new RawValue("abc")).toString());
    }

    private static class JsonSerializableStub implements JsonSerializable {

        @Override
        public void serialize(com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeStartObject();
            gen.writeStringField("key", "value");
            gen.writeEndObject();
        }

        @Override
        public void serializeWithType(com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider serializers,
                TypeSerializer typeSer) throws IOException {
            fail("Should not be called in this test");
        }
    }
}