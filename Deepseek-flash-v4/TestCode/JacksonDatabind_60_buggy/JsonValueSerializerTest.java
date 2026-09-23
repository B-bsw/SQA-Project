package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JsonValueSerializerTest {

    private static final SerializationConfig SER_CONFIG = new ObjectMapper().getSerializationConfig();

    private TestAnnotatedMethod stringMethod;
    private StubJsonSerializer valueSerializer;
    private JsonValueSerializer serializer;
    private TestSerializerProvider provider;

    @Before
    public void setUp() throws Exception {
        stringMethod = new TestAnnotatedMethod(TestBean.class, "getValue", String.class, "abc");
        valueSerializer = new StubJsonSerializer();
        serializer = new JsonValueSerializer(stringMethod, valueSerializer);
        provider = new TestSerializerProvider(valueSerializer, false);
    }

    @Test
    public void testToStringContainsMethodName() {
        assertTrue(serializer.toString().contains("getValue"));
    }

    @Test
    public void testWithResolvedReturnsSameWhenUnchanged() {
        JsonValueSerializer resolved = serializer.withResolved(null, valueSerializer, true);
        assertSame(serializer, resolved);
    }

    @Test
    public void testWithResolvedReturnsNewWhenChanged() {
        JsonValueSerializer resolved = serializer.withResolved(null, valueSerializer, false);
        assertNotNull(resolved);
        assertNotSame(serializer, resolved);
    }

    @Test
    public void testCreateContextualUsesExistingSerializer() throws Exception {
        JsonValueSerializer result = (JsonValueSerializer) serializer.createContextual(provider, null);
        assertSame(serializer, result);
    }

    @Test
    public void testCreateContextualResolvesSerializerForFinalType() throws Exception {
        JsonValueSerializer s = new JsonValueSerializer(stringMethod, null);
        TestSerializerProvider prov = new TestSerializerProvider(valueSerializer, true);
        JsonValueSerializer result = (JsonValueSerializer) s.createContextual(prov, null);
        assertNotNull(result);
        assertNotSame(s, result);
    }

    @Test
    public void testCreateContextualReturnsThisForNonFinalTypeWithoutStaticTyping() throws Exception {
        TestAnnotatedMethod objectMethod = new TestAnnotatedMethod(TestBean.class, "getValue", Object.class, "x");
        JsonValueSerializer s = new JsonValueSerializer(objectMethod, null);
        TestSerializerProvider prov = new TestSerializerProvider(valueSerializer, false);
        assertSame(s, s.createContextual(prov, null));
    }

    @Test
    public void testSerializeUsesValueSerializer() throws Exception {
        serializer.serialize(new TestBean(), null, provider);
        assertTrue(valueSerializer.serialized);
        assertEquals("abc", valueSerializer.lastValue);
    }

    @Test
    public void testSerializeNullUsesDefaultNull() throws Exception {
        TestAnnotatedMethod nullMethod = new TestAnnotatedMethod(TestBean.class, "getNull", String.class, null);
        JsonValueSerializer s = new JsonValueSerializer(nullMethod, valueSerializer);
        s.serialize(new TestBean(), null, provider);
        assertTrue(provider.nullSerialized);
    }

    @Test
    public void testSerializeResolvesSerializerWhenNull() throws Exception {
        JsonValueSerializer s = new JsonValueSerializer(stringMethod, null);
        s.serialize(new TestBean(), null, provider);
        assertTrue(valueSerializer.serialized);
        assertEquals("abc", valueSerializer.lastValue);
    }

    @Test
    public void testSerializeWrapsInvocationTargetException() throws Exception {
        InvocationTargetException failure = new InvocationTargetException(new RuntimeException("root cause"));
        TestAnnotatedMethod throwingMethod = new TestAnnotatedMethod(
                TestBean.class, "getValue", String.class, null, failure);
        JsonValueSerializer s = new JsonValueSerializer(throwingMethod, valueSerializer);
        try {
            s.serialize(new TestBean(), null, provider);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("root cause"));
        }
    }

    @Test
    public void testSerializeWithTypeCallsSerializeWithType() throws Exception {
        JsonValueSerializer normal = serializer.withResolved(null, valueSerializer, false);
        normal.serializeWithType(new TestBean(), null, provider, new StubTypeSerializer());
        assertTrue(valueSerializer.serializeWithTypeCalled);
        assertEquals("abc", valueSerializer.lastValue);
    }

    @Test
    public void testSerializeWithTypeForceTypeInfoWritesPrefixSuffix() throws Exception {
        StubTypeSerializer typeSer = new StubTypeSerializer();
        serializer.serializeWithType(new TestBean(), null, provider, typeSer);
        assertTrue(typeSer.prefixCalled);
        assertTrue(typeSer.suffixCalled);
        assertTrue(valueSerializer.serialized);
        assertTrue(!valueSerializer.serializeWithTypeCalled);
    }

    @Test
    public void testSerializeWithTypeNullValue() throws Exception {
        TestAnnotatedMethod nullMethod = new TestAnnotatedMethod(TestBean.class, "getNull", String.class, null);
        JsonValueSerializer s = new JsonValueSerializer(nullMethod, valueSerializer);
        s.serializeWithType(new TestBean(), null, provider, new StubTypeSerializer());
        assertTrue(provider.nullSerialized);
    }

    @Test
    public void testGetSchemaDefault() throws Exception {
        assertNotNull(serializer.getSchema(provider, null));
    }

    @Test
    public void testGetSchemaWithSchemaAwareSerializer() throws Exception {
        SchemaAwareStub schemaSer = new SchemaAwareStub();
        JsonValueSerializer s = new JsonValueSerializer(stringMethod, schemaSer);
        assertSame(schemaSer.schemaNode, s.getSchema(provider, null));
    }

    @Test
    public void testAcceptJsonFormatVisitorDelegatesToValueSerializer() throws Exception {
        StubJsonFormatVisitorWrapper visitor = new StubJsonFormatVisitorWrapper(provider);
        serializer.acceptJsonFormatVisitor(visitor, null);
        assertTrue(valueSerializer.acceptVisitorCalled);
    }

    @Test
    public void testAcceptJsonFormatVisitorResolvesSerializerWhenNull() throws Exception {
        JsonValueSerializer s = new JsonValueSerializer(stringMethod, null);
        StubJsonFormatVisitorWrapper visitor = new StubJsonFormatVisitorWrapper(provider);
        s.acceptJsonFormatVisitor(visitor, null);
        assertTrue(valueSerializer.acceptVisitorCalled);
    }

    @Test
    public void testAcceptJsonFormatVisitorForEnum() throws Exception {
        TestAnnotatedMethod enumMethod = new TestAnnotatedMethod(TestEnum.class, "getValue", String.class, "v");
        JsonValueSerializer s = new JsonValueSerializer(enumMethod, null);
        StubJsonFormatVisitorWrapper visitor = new StubJsonFormatVisitorWrapper(provider);
        s.acceptJsonFormatVisitor(visitor, null);
        assertTrue(visitor.stringVisitor.enumTypesCalled);
        assertTrue(visitor.stringVisitor.values.contains("v"));
    }

    static class TestBean {
        public String getValue() {
            return "abc";
        }
    }

    enum TestEnum {
        A, B
    }

    static class TestAnnotatedMethod extends AnnotatedMethod {
        private final JavaType type;
        private final Object result;
        private final Class<?> declaringClass;
        private final String name;
        private final Exception failure;

        TestAnnotatedMethod(Class<?> declaringClass, String name, Class<?> returnType, Object result) {
            this(declaringClass, name, returnType, result, null);
        }

        TestAnnotatedMethod(Class<?> declaringClass, String name, Class<?> returnType,
                Object result, Exception failure) {
            super((AnnotatedMethod.TypeResolutionContext) null, null,
                    (AnnotationMap) null, (AnnotationMap[]) null);
            this.type = TypeFactory.defaultInstance().constructType(returnType);
            this.result = result;
            this.declaringClass = declaringClass;
            this.name = name;
            this.failure = failure;
        }

        @Override
        public JavaType getType() {
            return type;
        }

        @Override
        public Object getValue(Object pojo) throws Exception {
            if (failure != null) {
                throw failure;
            }
            return result;
        }

        @Override
        public Object callOn(Object pojo) throws Exception {
            if (failure != null) {
                throw failure;
            }
            return result;
        }

        @Override
        public Class<?> getDeclaringClass() {
            return declaringClass;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class StubJsonSerializer extends JsonSerializer<Object> {
        boolean serialized;
        boolean serializeWithTypeCalled;
        boolean acceptVisitorCalled;
        Object lastValue;

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {
            serialized = true;
            lastValue = value;
        }

        @Override
        public void serializeWithType(Object value, JsonGenerator gen, SerializerProvider serializers,
                TypeSerializer typeSer) {
            serializeWithTypeCalled = true;
            lastValue = value;
        }

        @Override
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) {
            acceptVisitorCalled = true;
        }
    }

    static class SchemaAwareStub extends StubJsonSerializer implements SchemaAware {
        final JsonNode schemaNode = JsonNodeFactory.instance.objectNode();

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
            return schemaNode;
        }
    }

    static class StubTypeSerializer extends TypeSerializer {
        boolean prefixCalled;
        boolean suffixCalled;

        @Override
        public JsonToken getPropertyName() {
            return JsonToken.VALUE_NULL;
        }

        @Override
        public TypeSerializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public void writeTypePrefixForScalar(Object value, JsonGenerator gen) {
            prefixCalled = true;
        }

        @Override
        public void writeTypePrefixForObject(Object value, JsonGenerator gen) {
            prefixCalled = true;
        }

        @Override
        public void writeTypePrefixForArray(Object value, JsonGenerator gen) {
            prefixCalled = true;
        }

        @Override
        public void writeTypeSuffixForScalar(Object value, JsonGenerator gen) {
            suffixCalled = true;
        }

        @Override
        public void writeTypeSuffixForObject(Object value, JsonGenerator gen) {
            suffixCalled = true;
        }

        @Override
        public void writeTypeSuffixForArray(Object value, JsonGenerator gen) {
            suffixCalled = true;
        }
    }

    static class TestSerializerProvider extends SerializerProvider {
        private final JsonSerializer<Object> serializer;
        private final boolean staticTyping;
        boolean nullSerialized;

        TestSerializerProvider(JsonSerializer<Object> serializer, boolean staticTyping) {
            super(SER_CONFIG);
            this.serializer = serializer;
            this.staticTyping = staticTyping;
        }

        @Override
        public SerializationConfig getConfig() {
            return SER_CONFIG;
        }

        @Override
        public boolean isEnabled(MapperFeature feature) {
            return staticTyping && feature == MapperFeature.USE_STATIC_TYPING;
        }

        @Override
        public boolean isEnabled(SerializationFeature feature) {
            return false;
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(JavaType valueType, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findTypedValueSerializer(Class<?> valueType, boolean cache, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findTypedValueSerializer(JavaType valueType, boolean cache, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findKeySerializer(JavaType keyType, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findKeySerializer(Class<?> keyType, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findNullKeySerializer(JavaType keyType, BeanProperty property) {
            return serializer;
        }

        @Override
        public JsonSerializer<Object> findNullValueSerializer(BeanProperty property) {
            return serializer;
        }

        @Override
        public void defaultSerializeNull(JsonGenerator gen) throws IOException {
            nullSerialized = true;
        }

        @Override
        public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> ser, BeanProperty property)
                throws JsonMappingException {
            return ser;
        }
    }

    static class StubStringFormatVisitor implements JsonStringFormatVisitor {
        boolean enumTypesCalled;
        Set<String> values;

        @Override
        public void enumTypes(Set<String> enums) throws JsonMappingException {
            enumTypesCalled = true;
            values = new LinkedHashSet<String>(enums);
        }

        @Override
        public void format(JsonValueFormat format) throws JsonMappingException {
        }
    }

    static class StubJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        final StubStringFormatVisitor stringVisitor = new StubStringFormatVisitor();
        private SerializerProvider provider;

        StubJsonFormatVisitorWrapper(SerializerProvider provider) {
            this.provider = provider;
        }

        @Override
        public SerializerProvider getProvider() {
            return provider;
        }

        @Override
        public void setProvider(SerializerProvider provider) {
            this.provider = provider;
        }

        @Override
        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            return stringVisitor;
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonMapFormatVisitor expectMapFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonNullFormatVisitor expectNullFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) {
            return null;
        }
    }
}