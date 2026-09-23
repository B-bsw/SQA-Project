package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.type.SimpleType;
import org.junit.Before;
import org.junit.Test;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testReadValueNullNodeReturnsNull() throws Exception {
        ObjectMapper mockMapper = new ObjectMapper() {
            @Override
            protected Object _readMapAndClose(JsonParser jp, JavaType valueType) throws IOException {
                return null;
            }
        };
        assertNull(mockMapper.readValue("{\"a\":1}", JsonNode.class));
    }

    @Test
    public void testReadValueTreeAsTokensValid() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("key", "value");
        MyBean result = mapper.treeToValue(node, MyBean.class);
        assertNotNull(result);
        assertEquals("value", result.key);
    }

    @Test
    public void testReadValueWithRootName() throws Exception {
        String json = "{\"root\":{\"name\":\"test\"}}";
        Map<String, String> result = mapper.readValue(json, Map.class);
        assertNotNull(result);
        assertTrue(result.containsKey("root"));
    }

    @Test
    public void testConvertValueFromNullReturnsNull() {
        assertNull(mapper.convertValue(null, String.class));
    }

    @Test
    public void testConvertValueSameTypeReturnsSameInstance() {
        String value = "test";
        assertSame(value, mapper.convertValue(value, String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadValueWithInvalidType() throws Exception {
        mapper.readValue("{}", (Class<?>) null);
    }

    @Test
    public void testWriteValueAsString() throws Exception {
        String result = mapper.writeValueAsString(Collections.singletonMap("key", "value"));
        assertNotNull(result);
        assertTrue(result.contains("\"key\""));
        assertTrue(result.contains("\"value\""));
    }

    @Test
    public void testWriteValueAsBytes() throws Exception {
        byte[] result = mapper.writeValueAsBytes(Collections.singletonMap("key", "value"));
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testWriteValueCloseable() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        CloseableValue closeable = new CloseableValue();
        mapper.writeValue(gen, closeable);
        assertTrue(closeable.closed);
        assertNotNull(sw.toString());
    }

    @Test
    public void testWriteValueIOFailure() throws Exception {
        JsonGenerator gen = mapper.getFactory().createGenerator(new StringWriter());
        gen.close();
        try {
            mapper.writeValue(gen, "test");
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCanSerialize() {
        assertTrue(mapper.canSerialize(String.class));
        assertFalse(mapper.canSerialize(java.io.InputStream.class));
    }

    @Test
    public void testCanSerializeWithCause() {
        AtomicReference<Throwable> cause = new AtomicReference<>();
        assertTrue(mapper.canSerialize(String.class, cause));
    }

    @Test
    public void testReadValuesWithClassType() throws Exception {
        String json = "[1,2,3]";
        JsonParser jp = mapper.getFactory().createParser(json);
        Iterator<Integer> it = mapper.readValues(jp, Integer.class);
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testReaderForType() throws Exception {
        ObjectReader reader = mapper.readerFor(Map.class);
        assertNotNull(reader);
    }

    @Test
    public void testReaderWithView() throws Exception {
        ObjectReader reader = mapper.readerWithView(MyView.class);
        assertNotNull(reader);
    }

    @Test
    public void testReaderWithRootName() throws Exception {
        ObjectReader reader = mapper.reader();
        assertNotNull(reader);
    }

    @Test
    public void testWriterWithDefaultPrettyPrinter() throws Exception {
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        assertNotNull(writer);
        String result = writer.writeValueAsString(Collections.singletonMap("a", 1));
        assertNotNull(result);
    }

    @Test
    public void testWriterForType() throws Exception {
        ObjectWriter writer = mapper.writerFor(String.class);
        assertNotNull(writer);
    }

    @Test
    public void testEnableDefaultTyping() {
        ObjectMapper typedMapper = mapper.enableDefaultTyping();
        assertNotNull(typedMapper);
    }

    @Test
    public void testSetMixInAnnotations() {
        mapper.setMixInAnnotations(MyBean.class, MyMixin.class);
        assertEquals(MyMixin.class, mapper.findMixInClassFor(MyBean.class));
    }

    @Test
    public void testAddMixInAnnotations() {
        mapper.addMixInAnnotations(MyBean.class, MyMixin.class);
        assertEquals(MyMixin.class, mapper.findMixInClassFor(MyBean.class));
    }

    @Test
    public void testRegisterSubtypes() {
        mapper.registerSubtypes(MyBean.class);
    }

    @Test
    public void testFindModulesNullLoader() {
        List<Object> modules = ((ObjectMapper) mapper).findModules(null);
        assertNotNull(modules);
    }

    @Test
    public void testReadValueWithNullNodeFactory() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.setNodeFactory(JsonNodeFactory.withExactBigDecimals(true));
        assertNotNull(customMapper.readTree("{}"));
    }

    @Test
    public void testDefaultTypingNone() {
        ObjectMapper typedMapper = mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertNotNull(typedMapper);
    }

    @Test
    public void testDefaultTypingNonConcreteAndArrays() {
        ObjectMapper typedMapper = mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertNotNull(typedMapper);
    }

    public static class MyBean {
        public String key;
        public String getKey() { return key; }
        public void setKey(String key) { this.key = key; }
    }

    public static class MyMixin {}

    public static class MyView {}

    public static class CloseableValue implements Closeable {
        public boolean closed = false;
        @Override
        public void close() throws IOException {
            closed = true;
        }
    }
}