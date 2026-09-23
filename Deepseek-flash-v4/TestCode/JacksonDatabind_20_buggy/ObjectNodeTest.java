package com.fasterxml.jackson.databind.node;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import static org.junit.Assert.*;

public class ObjectNodeTest {
    private ObjectNode objectNode;
    private JsonNodeFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new JsonNodeFactory(true);
        objectNode = new ObjectNode(factory);
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, objectNode.size());
        assertEquals(JsonNodeType.OBJECT, objectNode.getNodeType());
        assertEquals(JsonToken.START_OBJECT, objectNode.asToken());
    }

    @Test
    public void testConstructorWithMap() {
        Map<String, JsonNode> kids = new LinkedHashMap<String, JsonNode>();
        kids.put("key", factory.textNode("value"));
        ObjectNode node = new ObjectNode(factory, kids);
        assertEquals(1, node.size());
        assertNotNull(node.get("key"));
    }

    @Test
    public void testDeepCopy() {
        objectNode.put("key1", 10);
        objectNode.put("key2", "test");
        ObjectNode copy = objectNode.deepCopy();
        assertNotSame(objectNode, copy);
        assertEquals(objectNode.size(), copy.size());
        assertEquals(objectNode.get("key1"), copy.get("key1"));
        objectNode.put("key1", 999);
        assertEquals(10, copy.get("key1").asInt());
    }

    @Test
    public void testSizeAndElements() {
        assertEquals(0, objectNode.size());
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        assertEquals(2, objectNode.size());
        Iterator<JsonNode> elements = objectNode.elements();
        assertTrue(elements.hasNext());
        assertEquals(1, elements.next().asInt());
        assertTrue(elements.hasNext());
        assertEquals(2, elements.next().asInt());
        assertFalse(elements.hasNext());
    }

    @Test
    public void testGet() {
        assertNull(objectNode.get("nonexistent"));
        objectNode.put("key", 123);
        assertNotNull(objectNode.get("key"));
        assertEquals(123, objectNode.get("key").asInt());
        assertNull(objectNode.get(123));
    }

    @Test
    public void testGetWithStringFieldName() {
        objectNode.put("name", "john");
        assertEquals("john", objectNode.get("name").asText());
        assertNull(objectNode.get("missing"));
    }

    @Test
    public void testFieldNames() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        Iterator<String> names = objectNode.fieldNames();
        assertTrue(names.hasNext());
        assertEquals("a", names.next());
        assertTrue(names.hasNext());
        assertEquals("b", names.next());
        assertFalse(names.hasNext());
    }

    @Test
    public void testPathWithIntAndString() {
        assertEquals(MissingNode.getInstance(), objectNode.path(0));
        assertEquals(MissingNode.getInstance(), objectNode.path("nonexistent"));
        objectNode.put("key", 123);
        assertEquals(123, objectNode.path("key").asInt());
    }

    @Test
    public void testFields() {
        objectNode.put("a", 1);
        Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
        assertTrue(fields.hasNext());
        Map.Entry<String, JsonNode> entry = fields.next();
        assertEquals("a", entry.getKey());
        assertEquals(1, entry.getValue().asInt());
        assertFalse(fields.hasNext());
    }

    @Test
    public void testWithExistingObjectNode() {
        ObjectNode child = objectNode.putObject("child");
        ObjectNode result = objectNode.with("child");
        assertSame(child, result);
    }

    @Test
    public void testWithNewObjectNode() {
        assertNull(objectNode.get("newField"));
        ObjectNode result = objectNode.with("newField");
        assertNotNull(result);
        assertEquals(0, result.size());
        assertSame(result, objectNode.get("newField"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithNonObjectValue() {
        objectNode.put("str", "hello");
        objectNode.with("str");
    }

    @Test
    public void testWithArrayExisting() {
        ArrayNode array = objectNode.putArray("arr");
        ArrayNode result = objectNode.withArray("arr");
        assertSame(array, result);
    }

    @Test
    public void testWithArrayNew() {
        ArrayNode result = objectNode.withArray("newArr");
        assertNotNull(result);
        assertEquals(0, result.size());
        assertSame(result, objectNode.get("newArr"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithArrayOnNonArray() {
        objectNode.put("obj", factory.objectNode());
        objectNode.withArray("obj");
    }

    @Test
    public void testFindValue() {
        objectNode.put("root", "value");
        ObjectNode nested = objectNode.putObject("nested");
        nested.put("target", 42);
        assertEquals("value", objectNode.findValue("root").asText());
        assertEquals(42, objectNode.findValue("target").asInt());
        assertNull(objectNode.findValue("missing"));
    }

    @Test
    public void testFindValuesWithExistingList() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        objectNode.put("c", 3);
        List<JsonNode> find = new ArrayList<JsonNode>();
        List<JsonNode> result = objectNode.findValues("b", find);
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).asInt());
        assertEquals(find, result);
        List<JsonNode> missingList = objectNode.findValues("nonexistent", new ArrayList<JsonNode>());
        assertEquals(0, missingList.size());
    }

    @Test
    public void testFindValuesAsText() {
        objectNode.put("name", "Alice");
        objectNode.put("name", "Bob");
        List<String> result = objectNode.findValuesAsText("name", null);
        assertEquals(1, result.size());
        assertEquals("Bob", result.get(0));
        List<String> emptyResult = objectNode.findValuesAsText("nonexistent", new ArrayList<String>());
        assertEquals(0, emptyResult.size());
    }

    @Test
    public void testFindParent() {
        assertNull(objectNode.findParent("nonexistent"));
        ObjectNode child = objectNode.putObject("child");
        child.put("key", 123);
        assertEquals(objectNode, child.findParent("child"));
        assertNull(objectNode.findParent("child"));
    }

    @Test
    public void testFindParents() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        List<JsonNode> result = objectNode.findParents("b", new ArrayList<JsonNode>());
        assertEquals(0, result.size());
        ObjectNode child = objectNode.putObject("child");
        child.put("key", 123);
        List<JsonNode> parents = objectNode.findParents("child", new ArrayList<JsonNode>());
        assertEquals(1, parents.size());
        assertEquals(objectNode, parents.get(0));
        List<JsonNode> emptyParents = objectNode.findParents("nonexistent", new ArrayList<JsonNode>());
        assertEquals(0, emptyParents.size());
    }

    @Test
    public void testSetWithNullValue() throws Exception {
        objectNode.set("nullField", null);
        assertNotNull(objectNode.get("nullField"));
        assertEquals(JsonNodeType.NULL, objectNode.get("nullField").getNodeType());
    }

    @Test
    public void testSetWithExistingValue() {
        objectNode.set("field", factory.textNode("old"));
        objectNode.set("field", factory.textNode("new"));
        assertEquals("new", objectNode.get("field").asText());
    }

    @Test
    public void testSetAllWithMap() {
        Map<String, JsonNode> map = new HashMap<String, JsonNode>();
        map.put("a", factory.numberNode(1));
        map.put("b", factory.textNode("value"));
        objectNode.setAll(map);
        assertEquals(2, objectNode.size());
        assertEquals(1, objectNode.get("a").asInt());
        assertEquals("value", objectNode.get("b").asText());
    }

    @Test
    public void testSetAllWithObjectNode() {
        ObjectNode other = new ObjectNode(factory);
        other.put("x", 100);
        other.put("y", "hello");
        objectNode.setAll(other);
        assertEquals(2, objectNode.size());
        assertEquals(100, objectNode.get("x").asInt());
        assertEquals("hello", objectNode.get("y").asText());
    }

    @Test
    public void testReplace() {
        objectNode.put("a", 1);
        JsonNode old = objectNode.replace("a", factory.numberNode(2));
        assertNotNull(old);
        assertEquals(1, old.asInt());
        assertEquals(2, objectNode.get("a").asInt());
        JsonNode nonexistent = objectNode.replace("b", factory.textNode("test"));
        assertNull(nonexistent);
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testWithoutUsingString() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        ObjectNode result = objectNode.without("a");
        assertSame(objectNode, result);
        assertNull(objectNode.get("a"));
        assertNotNull(objectNode.get("b"));
        assertEquals(1, objectNode.size());
    }

    @Test
    public void testWithoutUsingCollection() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        objectNode.put("c", 3);
        List<String> toRemove = new ArrayList<String>();
        toRemove.add("a");
        toRemove.add("c");
        ObjectNode result = objectNode.without(toRemove);
        assertSame(objectNode, result);
        assertEquals(1, objectNode.size());
        assertNull(objectNode.get("a"));
        assertNull(objectNode.get("c"));
        assertNotNull(objectNode.get("b"));
    }

    @Test
    public void testRemoveWithString() {
        assertNull(objectNode.remove("nonexistent"));
        objectNode.put("a", 1);
        JsonNode removed = objectNode.remove("a");
        assertEquals(1, removed.asInt());
        assertNull(objectNode.get("a"));
        assertEquals(0, objectNode.size());
    }

    @Test
    public void testRemoveAll() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        objectNode.removeAll();
        assertEquals(0, objectNode.size());
        assertNull(objectNode.get("a"));
    }

    @Test
    public void testPutWithNullOrphanValues() {
        ObjectNode result = objectNode.put("key", (String) null);
        assertSame(objectNode, result);
        assertNotNull(objectNode.get("key"));
        assertEquals(JsonNodeType.NULL, objectNode.get("key").getNodeType());
    }

    @Test
    public void testPutWithIntValue() {
        objectNode.put("int", 1);
        assertEquals(1, objectNode.get("int").asInt());
        objectNode.put("int", 2);
        assertEquals(2, objectNode.get("int").asInt());
        assertEquals(1, objectNode.size());
    }

    @Test
    public void testPutWithLongValue() {
        objectNode.put("long", 1L);
        assertEquals(1L, objectNode.get("long").asLong());
        objectNode.put("long2", 2L);
        assertEquals(2L, objectNode.get("long2").asLong());
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutWithFloatValue() {
        objectNode.put("float", 1.5f);
        assertEquals(1.5f, objectNode.get("float").floatValue(), 0.01);
        objectNode.put("float2", 2.5f);
        assertEquals(2.5f, objectNode.get("float2").floatValue(), 0.01);
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutWithDoubleValue() {
        objectNode.put("double", 1.7);
        assertEquals(1.7, objectNode.get("double").doubleValue(), 0.01);
        objectNode.put("double2", 2.9);
        assertEquals(2.9, objectNode.get("double2").doubleValue(), 0.01);
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutWithBigDecimal() {
        BigDecimal bd = new BigDecimal("123.45");
        objectNode.put("decimal", bd);
        assertEquals(bd, objectNode.get("decimal").decimalValue());
        objectNode.put("decimal2", new BigDecimal("678.9"));
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutStringValue() {
        objectNode.put("string", "hello");
        assertEquals("hello", objectNode.get("string").asText());
        objectNode.put("string2", "world");
        assertEquals("world", objectNode.get("string2").asText());
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutBoolean() {
        objectNode.put("bool1", true);
        objectNode.put("bool2", false);
        assertTrue(objectNode.get("bool1").asBoolean());
        assertFalse(objectNode.get("bool2").asBoolean());
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutBooleanWrapper() {
        objectNode.put("bool", Boolean.TRUE);
        assertTrue(objectNode.get("bool").asBoolean());
        objectNode.put("bool2", Boolean.FALSE);
        assertFalse(objectNode.get("bool2").asBoolean());
        objectNode.put("nullBool", (Boolean) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("nullBool").getNodeType());
    }

    @Test
    public void testPutNull() {
        objectNode.putNull("nullable");
        assertEquals(JsonNodeType.NULL, objectNode.get("nullable").getNodeType());
        objectNode.putNull("other");
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutArray() {
        ArrayNode array = objectNode.putArray("numbers");
        assertNotNull(array);
        assertSame(array, objectNode.get("numbers"));
        array.add(1);
        array.add(2);
        assertEquals(2, array.size());
        assertEquals(1, objectNode.size());
    }

    @Test
    public void testPutObject() {
        ObjectNode obj = objectNode.putObject("nested");
        assertNotNull(obj);
        assertSame(obj, objectNode.get("nested"));
        obj.put("a", 1);
        assertEquals(1, obj.get("a").asInt());
        assertEquals(1, objectNode.size());
    }

    @Test
    public void testPutPOJO() {
        objectNode.putPOJO("pojo", new Object());
        assertNotNull(objectNode.get("pojo"));
        assertEquals(JsonNodeType.POJO, objectNode.get("pojo").getNodeType());
    }

    @Test
    public void testPutShort() {
        objectNode.put("short", (short) 12);
        assertEquals(12, objectNode.get("short").asInt());
        objectNode.put("short2", (short) 34);
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutShortWrapper() {
        objectNode.put("short1", Short.valueOf((short) 5));
        assertEquals(5, objectNode.get("short1").asInt());
        objectNode.put("shortNull", (Short) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("shortNull").getNodeType());
        objectNode.put("short2", Short.valueOf((short) 6));
        assertEquals(3, objectNode.size());
    }

    @Test
    public void testPutIntegerWrapper() {
        objectNode.put("int1", Integer.valueOf(10));
        assertEquals(10, objectNode.get("int1").asInt());
        objectNode.put("intNull", (Integer) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("intNull").getNodeType());
        objectNode.put("int2", Integer.valueOf(20));
        assertEquals(3, objectNode.size());
    }

    @Test
    public void testPutLongWrapper() {
        objectNode.put("long1", Long.valueOf(100L));
        assertEquals(100L, objectNode.get("long1").asLong());
        objectNode.put("longNull", (Long) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("longNull").getNodeType());
        objectNode.put("long2", Long.valueOf(200L));
        assertEquals(3, objectNode.size());
    }

    @Test
    public void testPutFloatWrapper() {
        objectNode.put("float1", Float.valueOf(1.5f));
        assertEquals(1.5f, objectNode.get("float1").floatValue(), 0.01);
        objectNode.put("floatNull", (Float) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("floatNull").getNodeType());
        objectNode.put("float2", Float.valueOf(2.5f));
        assertEquals(3, objectNode.size());
    }

    @Test
    public void testPutDoubleWrapper() {
        objectNode.put("double1", Double.valueOf(1.7));
        assertEquals(1.7, objectNode.get("double1").doubleValue(), 0.01);
        objectNode.put("doubleNull", (Double) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("doubleNull").getNodeType());
        objectNode.put("double2", Double.valueOf(2.9));
        assertEquals(3, objectNode.size());
    }

    @Test
    public void testPutBigDecimalWrapper() {
        BigDecimal bd = new BigDecimal("33.3");
        objectNode.put("decimal", bd);
        assertEquals(bd, objectNode.get("decimal").decimalValue());
        objectNode.put("decimalNull", (BigDecimal) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("decimalNull").getNodeType());
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutByteWrapper() {
        objectNode.put("byte1", Byte.valueOf((byte) 1));
        assertEquals(1, objectNode.get("byte1").asInt());
        objectNode.put("byteNull", (Byte) null);
        assertEquals(JsonNodeType.NULL, objectNode.get("byteNull").getNodeType());
        assertEquals(2, objectNode.size());
    }

    @Test
    public void testPutByteRange() {
        objectNode.put("byte1", Byte.MAX_VALUE);
        objectNode.put("byte2", Byte.MIN_VALUE);
        objectNode.put("byte3", (byte) 0);
        assertEquals(3, objectNode.size());
        assertEquals(127, objectNode.get("byte1").asInt());
        assertEquals(-128, objectNode.get("byte2").asInt());
        assertEquals(0, objectNode.get("byte3").asInt());
    }

    @Test
    public void testPutBooleanRange() {
        objectNode.put("true", true);
        objectNode.put("false", false);
        assertEquals(2, objectNode.size());
        assertTrue(objectNode.get("true").asBoolean());
        assertFalse(objectNode.get("false").asBoolean());
    }

    @Test
    public void testPutReplacesValue() {
        objectNode.put("a", 1);
        objectNode.put("a", 2);
        assertEquals(1, objectNode.size());
        assertEquals(2, objectNode.get("a").asInt());
    }

    @Test
    public void testPutArrayReplacesNullNode() {
        objectNode.putNull("a");
        ArrayNode arr = objectNode.putArray("a");
        assertNotNull(arr);
        assertSame(arr, objectNode.get("a"));
    }

    @Test
    public void testPutObjectReplacesExisting() {
        objectNode.put("a", 1);
        ObjectNode obj = objectNode.putObject("a");
        assertNotNull(obj);
        assertSame(obj, objectNode.get("a"));
        assertEquals(0, obj.size());
    }

    @Test
    public void testToString() {
        objectNode.put("a", 1);
        objectNode.put("b", "text");
        String result = objectNode.toString();
        assertTrue(result.contains("\"a\":1"));
        assertTrue(result.contains("\"b\":\"text\""));
    }

    @Test
    public void testToStringWithEmpty() {
        assertEquals("{}", objectNode.toString());
    }

    @Test
    public void testEquals() {
        ObjectNode a1 = new ObjectNode(factory);
        ObjectNode a2 = new ObjectNode(factory);
        assertTrue(a1.equals(a2));
        a1.put("key", 1);
        assertFalse(a1.equals(a2));
        a2.put("key", 1);
        assertTrue(a1.equals(a2));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("string"));
        assertTrue(a1.equals(a1));
    }

    @Test
    public void testHashCode() {
        ObjectNode a1 = new ObjectNode(factory);
        ObjectNode a2 = new ObjectNode(factory);
        assertEquals(a1.hashCode(), a2.hashCode());
        a1.put("k", 1);
        a1.put("k2", 2);
        a2.put("k2", 2);
        a2.put("k", 1);
        assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void testSerialization() throws Exception {
        objectNode.put("a", 1);
        objectNode.put("b", "text");
        String json = objectNode.toString();
        assertTrue(json.contains("\"a\""));
        assertTrue(json.contains("\"b\""));
        assertTrue(json.contains("1"));
        assertTrue(json.contains("\"text\""));
    }

    @Test
    public void testRemoveCollectionFieldNames() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        objectNode.put("c", 3);
        List<String> keysToRemove = new ArrayList<String>();
        keysToRemove.add("a");
        keysToRemove.add("b");
        objectNode.without(keysToRemove);
        assertNull(objectNode.get("a"));
        assertNull(objectNode.get("b"));
        assertNotNull(objectNode.get("c"));
        assertEquals(1, objectNode.size());
    }

    @Test
    public void testRetainCollection() {
        objectNode.put("a", 1);
        objectNode.put("b", 2);
        objectNode.put("c", 3);
        List<String> keysToRetain = new ArrayList<String>();
        keysToRetain.add("a");
        keysToRetain.add("c");
        objectNode.retain(keysToRetain);
        assertEquals(2, objectNode.size());
        assertNotNull(objectNode.get("a"));
        assertNotNull(objectNode.get("c"));
        assertNull(objectNode.get("b"));
    }

    @Test
    public void testRetainWithExcludeAllFields() {
        List<String> fields = new ArrayList<String>();
        fields.add("a");
        objectNode.put("b", 2);
        objectNode.retain(fields);
        assertEquals(0, objectNode.size());
    }
}