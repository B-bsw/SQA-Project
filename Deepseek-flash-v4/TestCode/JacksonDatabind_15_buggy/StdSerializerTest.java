package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.TestJsonFormatter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

import java.lang.reflect.Type;
import java.util.Collections;

public class StdSerializerTest {
    private static class TestSerializer extends StdSerializer<String> {
        public TestSerializer() {
            super(String.class);
        }

        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeString(value);
        }
    }

    private static class TestSerializerWithObjectNode extends StdSerializer<Integer> {
        public TestSerializerWithObjectNode() {
            super(Integer.class);
        }

        @Override
        public void serialize(Integer value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeNumber(value);
        }
    }

    private static class TestSerializerWithBoolean extends StdSerializer<Boolean> {
        public TestSerializerWithBoolean() {
            super(Boolean.class);
        }

        @Override
        public void serialize(Boolean value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeBoolean(value);
        }
    }

    private static class TestSerializerWithType extends StdSerializer<Object> {
        public TestSerializerWithType(Class<Object> t) {
            super(t);
        }

        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeObject(value);
        }
    }

    private static class TestJsonFormatVisitor implements JsonFormatVisitorWrapper {
        @Override
        public JsonFormatVisitable expectStringFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonFormatVisitable expectArrayFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonFormatVisitable expectObjectFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonFormatVisitable expectAnyFormat(JavaType type) throws JsonMappingException {
            return null;
        }
    }

    private TestSerializer serializer;
    private TestSerializerWithObjectNode objectNodeSerializer;
    private TestSerializerWithBoolean booleanSerializer;
    private SerializerProvider provider;

    @Before
    public void setUp() {
        serializer = new TestSerializer();
        objectNodeSerializer = new TestSerializerWithObjectNode();
        booleanSerializer = new TestSerializerWithBoolean();
        provider = new ObjectMapper().getSerializerProvider();
    }

    @After
    public void tearDown() {
        serializer = null;
        objectNodeSerializer = null;
        booleanSerializer = null;
        provider = null;
    }

    @Test
    public void testHandledType() {
        assertEquals(String.class, serializer.handledType());
        assertEquals(Integer.class, objectNodeSerializer.handledType());
        assertEquals(Boolean.class, booleanSerializer.handledType());
    }

    @Test
    public void testGetSchema() throws Exception {
        JsonNode schema = serializer.getSchema(provider, String.class);
        assertNotNull(schema);
        assertTrue(schema.isObject());
        assertEquals("string", schema.get("type").asText());

        schema = serializer.getSchema(provider, String.class, false);
        assertNotNull(schema);
        assertTrue(schema.has("required"));
        assertTrue(schema.get("required").asBoolean());

        schema = serializer.getSchema(provider, String.class, true);
        assertNotNull(schema);
        assertFalse(schema.has("required"));
    }

    @Test
    public void testCreateObjectNode() {
        ObjectNode node = serializer.createObjectNode();
        assertNotNull(node);
        assertTrue(node instanceof ObjectNode);
        assertEquals(0, node.size());
    }

    @Test
    public void testCreateSchemaNode() {
        ObjectNode node = serializer.createSchemaNode("integer");
        assertNotNull(node);
        assertEquals("integer", node.get("type").asText());

        node = serializer.createSchemaNode("integer", true);
        assertNotNull(node);
        assertEquals("integer", node.get("type").asText());
        assertFalse(node.has("required"));

        node = serializer.createSchemaNode("integer", false);
        assertNotNull(node);
        assertEquals("integer", node.get("type").asText());
        assertTrue(node.has("required"));
        assertTrue(node.get("required").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        JsonFormatVisitorWrapper visitor = new TestJsonFormatVisitor();
        serializer.acceptJsonFormatVisitor(visitor, provider.constructType(String.class));
    }

    @Test
    public void testWrapAndThrow_IOException() throws Exception {
        try {
            serializer.wrapAndThrow(provider, new IOException("test"), new Object(), "field");
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testWrapAndThrow_IOExceptionNoWrap() throws Exception {
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        p.getConfig().disable(SerializationFeature.WRAP_EXCEPTIONS);
        try {
            serializer.wrapAndThrow(p, new IOException("test"), new Object(), "field");
            fail("Expected IOException");
        } catch (IOException e) {
            assertFalse(e instanceof JsonMappingException);
            assertEquals("test", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_Error() throws Exception {
        try {
            serializer.wrapAndThrow(provider, new Error("test"), new Object(), "field");
            fail("Expected Error");
        } catch (Error e) {
            assertEquals("test", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_InvocationTarget() throws Exception {
        InvocationTargetException ite = new InvocationTargetException(new IOException("cause"));
        try {
            serializer.wrapAndThrow(provider, ite, new Object(), "field");
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("cause", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_InvocationTargetWithNested() throws Exception {
        InvocationTargetException inner = new InvocationTargetException(new IOException("nested"));
        InvocationTargetException outer = new InvocationTargetException(inner);
        try {
            serializer.wrapAndThrow(provider, outer, new Object(), "field");
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("nested", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_UnwrapNested() throws Exception {
        InvocationTargetException inner = new InvocationTargetException(new Error("deep error"));
        InvocationTargetException outer = new InvocationTargetException(inner);
        try {
            serializer.wrapAndThrow(provider, outer, new Object(), "field");
            fail("Expected Error");
        } catch (Error e) {
            assertEquals("deep error", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_UnwrapInvocationWithNullCause() throws Exception {
        InvocationTargetException ite = new InvocationTargetException(null);
        try {
            serializer.wrapAndThrow(provider, ite, new Object(), "field");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testWrapAndThrow_RuntimeExceptionWrap() throws Exception {
        try {
            serializer.wrapAndThrow(provider, new RuntimeException("runtime"), new Object(), "field");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testWrapAndThrow_RuntimeExceptionNoWrap() throws Exception {
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        p.getConfig().disable(SerializationFeature.WRAP_EXCEPTIONS);
        try {
            serializer.wrapAndThrow(p, new RuntimeException("runtime"), new Object(), "field");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("runtime", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_JsonMappingException() throws Exception {
        try {
            serializer.wrapAndThrow(provider, new JsonMappingException("mapping"), new Object(), "field");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testWrapAndThrow_NullProvider() throws Exception {
        try {
            serializer.wrapAndThrow(null, new IOException("null"), new Object(), "field");
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testWrapAndThrow_WithReference() throws Exception {
        try {
            serializer.wrapAndThrow(provider, new Throwable("cause"), new Object(), "field");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testIsDefaultSerializer() {
        assertTrue(ClassUtil.isJacksonStdImpl(TestJacksonStdImplSerializer.class));
        assertFalse(ClassUtil.isJacksonStdImpl(TestSerializer.class));
    }

    @JacksonStdImpl
    private static class TestJacksonStdImplSerializer extends StdSerializer<String> {
        public TestJacksonStdImplSerializer() {
            super(String.class);
        }

        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeString(value);
        }
    }

    @Test
    public void testFindConvertingContentSerializer() throws Exception {
        BeanProperty prop = new TestBeanProperty();
        JsonSerializer<?> existing = objectNodeSerializer;
        JsonSerializer<?> result = serializer.findConvertingContentSerializer(provider, prop, existing);
        assertNotNull(result);
        assertEquals(existing, result);
    }

    @Test
    public void testFindConvertingContentSerializerNull() throws Exception {
        JsonSerializer<?> existing = null;
        JsonSerializer<?> result = serializer.findConvertingContentSerializer(provider, null, existing);
        assertNull(result);
    }

    @Test
    public void testFindConvertingContentSerializerWithoutConverting() throws Exception {
        BeanProperty prop = new TestBeanProperty();
        JsonSerializer<?> existing = objectNodeSerializer;
        JsonSerializer<?> result = serializer.findConvertingContentSerializer(provider, prop, existing);
        assertNotNull(result);
    }

    @Test
    public void testFindPropertyFilter_WithFilterProvider() throws Exception {
        FilterProvider fp = new TestFilterProvider();
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        PropertyFilter filter = serializer.findPropertyFilter(p, "test", new Object());
        assertNull(filter);
    }

    @Test
    public void testFindPropertyFilter_NoFilterProvider() throws Exception {
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        try {
            serializer.findPropertyFilter(p, "test", new Object());
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testFindPropertyFilter_NoFilterProviderId() throws Exception {
        FilterProvider fp = new TestFilterProvider();
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        p.setFilterProvider(fp);
        PropertyFilter filter = serializer.findPropertyFilter(p, "unknown", new Object());
        assertNull(filter);
    }

    @Test
    public void testFindPropertyFilter_WithFilterProviderNoFilter() throws Exception {
        FilterProvider fp = new TestFilterProvider();
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        p.setFilterProvider(fp);
        PropertyFilter filter = serializer.findPropertyFilter(p, "filter1", new Object());
        assertNull(filter);
    }

    @Test
    public void testFindPropertyFilter_WithFilterProviderWithFilter() throws Exception {
        FilterProvider fp = new TestFilterProvider2();
        SerializerProvider p = new ObjectMapper().getSerializerProvider();
        p.setFilterProvider(fp);
        PropertyFilter filter = serializer.findPropertyFilter(p, "filter1", new Object());
        assertNotNull(filter);
    }

    @Test
    public void testSerialize_WriteString() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        serializer.serialize("test", gen, provider);
        gen.flush();
        assertEquals("\"test\"", sw.toString());
    }

    @Test
    public void testSerialize_WriteNumber() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        objectNodeSerializer.serialize(42, gen, provider);
        gen.flush();
        assertEquals("42", sw.toString());
    }

    @Test
    public void testSerialize_WriteBoolean() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        booleanSerializer.serialize(true, gen, provider);
        gen.flush();
        assertEquals("true", sw.toString());
    }

    @Test
    public void testSerialize_NullValue() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        try {
            serializer.serialize(null, gen, provider);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testSerialize_NullValueBoolean() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        try {
            booleanSerializer.serialize(null, gen, provider);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testSerialize_EmptyString() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        serializer.serialize("", gen, provider);
        gen.flush();
        assertEquals("\"\"", sw.toString());
    }

    @Test
    public void testSerialize_ObjectWithWhitespace() throws Exception {
        java.io.StringWriter sw = new java.io.StringWriter();
        JsonGenerator gen = new com.fasterxml.jackson.core.json.JsonFactory().createGenerator(sw);
        serializer.serialize("hello world", gen, provider);
        gen.flush();
        assertEquals("\"hello world\"", sw.toString());
    }

    private static class TestFilterProvider extends FilterProvider {
        @Override
        public PropertyFilter findPropertyFilter(Object filterId, Object valueToFilter) {
            return null;
        }
    }

    private static class TestFilterProvider2 extends FilterProvider {
        @Override
        public PropertyFilter findPropertyFilter(Object filterId, Object valueToFilter) {
            return new TestJsonPropertyFilter();
        }
    }

    private static class TestJsonPropertyFilter implements PropertyFilter {
        @Override
        public <T extends JsonSerializer<?>> T serializeAsProperty(Object pojo, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsField(Object pojo, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsElement(Object elementValue, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsBinary(Object elementValue, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsObject(Object pojo, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsArray(Object arrayValue, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsNonFiltered(Object pojo, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }

        @Override
        public <T extends JsonSerializer<?>> T serializeAsElementPart(Object elementValue, JsonGenerator jgen,
                SerializerProvider provider, BeanProperty property) throws Exception {
            return null;
        }
    }

    private static class TestBeanProperty implements BeanProperty {
        @Override
        public String getName() {
            return "test";
        }

        @Override
        public JavaType getType() {
            return new ObjectMapper().getTypeFactory().constructType(String.class);
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public Object getValue(Object pojo) {
            return null;
        }

        @Override
        public void setValue(Object pojo, Object value) {
            // No-op
        }

        @Override
        public boolean isRequired() {
            return false;
        }

        @Override
        public boolean hasSetter() {
            return false;
        }

        @Override
        public boolean hasGetter() {
            return false;
        }

        @Override
        public void depositSchemaProperty(JsonFormatVisitorWrapper visitor) throws JsonMappingException {
            // No-op
        }

        @Override
        public void setPropertyIndex(int index) {
            // No-op
        }

        @Override
        public int getPropertyIndex() {
            return 0;
        }

        @Override
        public void setVisible(boolean visible) {
            // No-op
        }

        @Override
        public boolean isVisible() {
            return true;
        }
    }
}