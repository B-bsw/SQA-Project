package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ObjectIdValuePropertyTest {

    private ObjectIdReader objectIdReader;
    private PropertyMetadata metadata;
    private JsonDeserializer<?> valueDeserializer;
    private ObjectIdValueProperty property;

    @Before
    public void setUp() {
        metadata = PropertyMetadata.STD_REQUIRED;
        valueDeserializer = createMockDeserializer();
        objectIdReader = createMockObjectIdReader();
        property = new ObjectIdValueProperty(objectIdReader, metadata);
    }

    private JsonDeserializer<?> createMockDeserializer() {
        return new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };
    }

    private ObjectIdReader createMockObjectIdReader() {
        try {
            PropertyName propertyName = new PropertyName("id");
            com.fasterxml.jackson.databind.JavaType idType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
            JsonDeserializer<Object> deser = createMockDeserializer();
            ObjectIdGenerator<?> generator = createMockGenerator();
            ObjectIdResolver resolver = createMockResolver();
            return ObjectIdReader.construct(propertyName, idType, deser, generator, resolver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ObjectIdGenerator<?> createMockGenerator() throws IOException {
        return new ObjectIdGenerator<Object>() {
            @Override
            public Class<?> getScope() { return Object.class; }

            @Override
            public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }

            @Override
            public ObjectIdGenerator<Object> forScope(Class<?> scope) { return this; }

            @Override
            public ObjectIdGenerator<Object> forId(Object id) { return this; }

            @Override
            public Object newForId(Object id) { return id; }

            @Override
            public Object generateId(Object forPojo) { return "generated-id"; }

            @Override
            public com.fasterxml.jackson.databind.deser.impl.ObjectIdGeneratorId key(Object key) { return null; }
        };
    }

    private ObjectIdResolver createMockResolver() {
        return new ObjectIdResolver() {
            @Override
            public void bindItem(com.fasterxml.jackson.databind.deser.impl.ReadableObjectId roid, Object ob) {}

            @Override
            public Object resolveId(Object id) { return null; }

            @Override
            public ObjectIdResolver newForDeserialization(DeserializationContext ctxt) { return this; }

            @Override
            public boolean canUseFor(ObjectIdResolver resolver) { return true; }
        };
    }

    @Test
    public void testWithName() {
        PropertyName newName = new PropertyName("newName");
        ObjectIdValueProperty result = property.withName(newName);
        assertNotNull(result);
        assertEquals(newName, result.getFullPropertyName());
    }

    @Test
    public void testWithValueDeserializer() {
        JsonDeserializer<?> newDeser = createMockDeserializer();
        ObjectIdValueProperty result = property.withValueDeserializer(newDeser);
        assertNotNull(result);
        assertSame(newDeser, result.getValueDeserializer());
    }

    @Test
    public void testGetAnnotation_returnsNull() {
        assertNull(property.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember_returnsNull() {
        assertNull(property.getMember());
    }

    @Test
    public void testDeserializeAndSet_WithValidId() throws Exception {
        JsonParser p = createMockParser("12345");
        DeserializationContext ctxt = createMockDeserializationContext();
        Object instance = new Object();
        property.deserializeAndSet(p, ctxt, instance);
    }

    @Test
    public void testDeserializeSetAndReturn_ValidIdWithIdProperty() throws Exception {
        JsonParser p = createMockParser("valid-id");
        DeserializationContext ctxt = createMockDeserializationContext();
        SettableBeanProperty idProp = createMockSettableBeanProperty();
        objectIdReader = createMockObjectIdReaderWithIdProperty(idProp);
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        Object result = property.deserializeSetAndReturn(p, ctxt, instance);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeSetAndReturn_NullId_returnsNull() throws Exception {
        JsonParser p = createMockParser("null-id");
        DeserializationContext ctxt = createMockDeserializationContext();
        SettableBeanProperty idProp = createMockSettableBeanProperty();
        objectIdReader = createMockObjectIdReaderWithIdProperty(idProp);
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        Object result = property.deserializeSetAndReturn(p, ctxt, instance);
        assertNull(result);
    }

    @Test
    public void testDeserializeSetAndReturn_WithIdPropertyNull_returnsInstance() throws Exception {
        JsonParser p = createMockParser("valid-id");
        DeserializationContext ctxt = createMockDeserializationContext();
        objectIdReader = createMockObjectIdReaderWithoutIdProperty();
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        Object result = property.deserializeSetAndReturn(p, ctxt, instance);
        assertSame(instance, result);
    }

    @Test
    public void testSetAndReturn_WithIdProperty() throws Exception {
        SettableBeanProperty idProp = createMockSettableBeanProperty();
        objectIdReader = createMockObjectIdReaderWithIdProperty(idProp);
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        Object value = "id-value";
        Object result = property.setAndReturn(instance, value);
        assertEquals(value, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_WithoutIdProperty_throws() throws Exception {
        objectIdReader = createMockObjectIdReaderWithoutIdProperty();
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        property.setAndReturn(new Object(), "value");
    }

    @Test
    public void testSet_WithIdProperty() throws Exception {
        SettableBeanProperty idProp = createMockSettableBeanProperty();
        objectIdReader = createMockObjectIdReaderWithIdProperty(idProp);
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        property.set(instance, "value");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_WithoutIdProperty_throws() throws Exception {
        objectIdReader = createMockObjectIdReaderWithoutIdProperty();
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        property.set(new Object(), "value");
    }

    @Test
    public void testDeserializeSetAndReturn_WithNullValue_returnsNull() throws Exception {
        JsonParser p = createMockParser(null);
        DeserializationContext ctxt = createMockDeserializationContext();
        objectIdReader = createMockObjectIdReaderWithoutIdProperty();
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object result = property.deserializeSetAndReturn(p, ctxt, new Object());
        assertNull(result);
    }

    @Test
    public void testDeserializeSetAndReturn_WithValidIdAndBindsItem() throws Exception {
        JsonParser p = createMockParser("some-id");
        DeserializationContext ctxt = createMockDeserializationContext();
        SettableBeanProperty idProp = createMockSettableBeanProperty();
        objectIdReader = createMockObjectIdReaderWithIdProperty(idProp);
        property = new ObjectIdValueProperty(objectIdReader, metadata);
        Object instance = new Object();
        Object result = property.deserializeSetAndReturn(p, ctxt, instance);
        assertEquals("some-id", result);
    }

    private JsonParser createMockParser(final String text) throws IOException {
        return new JsonParser() {
            @Override
            public Object getEmbeddedObject() { return null; }

            @Override
            public boolean hasToken(com.fasterxml.jackson.core.JsonToken t) { return false; }

            @Override
            public com.fasterxml.jackson.core.JsonToken nextToken() throws IOException { return null; }

            @Override
            public void close() throws IOException {}

            @Override
            public String getText() throws IOException { return text; }

            @Override
            public com.fasterxml.jackson.core.JsonLocation getCurrentLocation() { return null; }

            @Override
            public com.fasterxml.jackson.core.JsonLocation getTokenLocation() { return null; }

            @Override
            public int getCurrentTokenId() { return 0; }

            @Override
            public com.fasterxml.jackson.core.JsonParser skipChildren() throws IOException { return this; }

            @Override
            public boolean isClosed() { return false; }

            @Override
            public void clearCurrentToken() {}

            @Override
            public com.fasterxml.jackson.core.JsonToken getCurrentToken() { return null; }

            @Override
            public void setCurrentToken(com.fasterxml.jackson.core.JsonToken t) {}

            @Override
            public int getCurrentName() { return 0; }
        };
    }

    private DeserializationContext createMockDeserializationContext() {
        return new DeserializationContext(DeserializationConfig.getDefaultConfig(), null, null) {
            @Override
            public Object findInjectableValue(Object valueId, com.fasterxml.jackson.databind.BeanProperty forProperty, Object beanInstance) { return null; }

            @Override
            public com.fasterxml.jackson.databind.deser.impl.ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> gen, ObjectIdResolver resolverType) {
                return new com.fasterxml.jackson.databind.deser.impl.ReadableObjectId(id);
            }
        };
    }

    private SettableBeanProperty createMockSettableBeanProperty() {
        return new SettableBeanProperty(new PropertyName("id"), com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class), null, createMockDeserializer(), null) {
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }

            @Override
            public SettableBeanProperty withName(PropertyName newName) { return this; }

            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return p.getText(); }

            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}

            @Override
            public void set(Object instance, Object value) throws IOException {}

            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException { return value; }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }

            @Override
            public AnnotatedMember getMember() { return null; }
        };
    }

    private ObjectIdReader createMockObjectIdReaderWithIdProperty(SettableBeanProperty idProp) {
        try {
            PropertyName propertyName = new PropertyName("id");
            com.fasterxml.jackson.databind.JavaType idType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
            JsonDeserializer<Object> deser = createMockDeserializer();
            ObjectIdGenerator<?> generator = createMockGenerator();
            ObjectIdResolver resolver = createMockResolver();
            return ObjectIdReader.construct(propertyName, idType, deser, generator, resolver, idProp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ObjectIdReader createMockObjectIdReaderWithoutIdProperty() {
        try {
            PropertyName propertyName = new PropertyName("id");
            com.fasterxml.jackson.databind.JavaType idType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
            JsonDeserializer<Object> deser = createMockDeserializer();
            ObjectIdGenerator<?> generator = createMockGenerator();
            ObjectIdResolver resolver = createMockResolver();
            return ObjectIdReader.construct(propertyName, idType, deser, generator, resolver, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}