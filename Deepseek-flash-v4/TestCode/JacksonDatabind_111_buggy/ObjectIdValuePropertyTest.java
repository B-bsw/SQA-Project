package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NullValueProvider;
import com.fasterxml.jackson.databind.util.ValueBuffer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectIdValuePropertyTest {
    private static final ObjectIdReader createObjectIdReader(JsonDeserializer<Object> deser) {
        return ObjectIdReader.construct(
            PropertyName.construct("id"),
            TypeFactory.defaultInstance().constructType(Object.class),
            deser,
            null,
            null
        );
    }

    private static class TestDeserializer extends JsonDeserializer<Object> {
        private final Object value;
        public TestDeserializer(Object v) { this.value = v; }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            p.nextToken(); // consume
            p.getValueAsString();
            return value;
        }
    }

    @Test
    public void testConstructorAndWithMethods() {
        ObjectIdReader oidReader = createObjectIdReader(new TestDeserializer("test"));
        ObjectIdValueProperty prop = new ObjectIdValueProperty(oidReader, PropertyMetadata.STD_REQUIRED);
        assertNotNull(prop);
        assertEquals(oidReader.propertyName, prop.getFullName());
        assertEquals("id", prop.getName());
        
        // Test withName
        SettableBeanProperty renamed = prop.withName(PropertyName.construct("new"));
        assertEquals("new", renamed.getName());
        assertNotSame(prop, renamed);
        
        // Test withValueDeserializer - same instance -> same
        assertSame(prop, prop.withValueDeserializer(prop._valueDeserializer));
        
        // Test withValueDeserializer - different
        JsonDeserializer<Object> newDeser = new TestDeserializer("new");
        SettableBeanProperty changed = prop.withValueDeserializer(newDeser);
        assertNotSame(prop, changed);
        assertEquals(newDeser, changed._valueDeserializer);
        
        // Test withNullProvider
        SettableBeanProperty withNVP = prop.withNullProvider(null);
        assertNotNull(withNVP);
        assertNotSame(prop, withNVP);
    }

    @Test
    public void testSetAndReturn() throws IOException {
        ObjectIdReader oidReader = createObjectIdReader(new TestDeserializer("test"));
        // No idProperty -> should throw
        ObjectIdValueProperty prop = new ObjectIdValueProperty(oidReader, PropertyMetadata.STD_REQUIRED);
        try {
            prop.setAndReturn(new Object(), "id");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        
        // With idProperty
        ObjectIdReader oidReader2 = ObjectIdReader.construct(
            PropertyName.construct("id"),
            TypeFactory.defaultInstance().constructType(Object.class),
            new TestDeserializer("test"),
            null,
            PropertyBasedObjectIdGenerator.class == null ? null : null
        );
        // Can't easily construct with idProperty without actual property; test in deserializeSetAndReturn
    }

    @Test
    public void testDeserializeAndSet() throws IOException {
        ObjectIdReader oidReader = createObjectIdReader(new TestDeserializer("test"));
        ObjectIdValueProperty prop = new ObjectIdValueProperty(oidReader, PropertyMetadata.STD_REQUIRED);
        
        // Mock JsonParser and DeserializationContext
        JsonParser p = new JsonParser() {
            @Override
            public Object getCodec() { return null; }
            @Override
            public void setCodec(com.fasterxml.jackson.core.ObjectCodec c) {}
            @Override
            public Object getEmbeddedObject() { return null; }
            @Override
            public com.fasterxml.jackson.core.Version version() { return null; }
            @Override
            public void close() throws IOException {}
            @Override
            public boolean isClosed() { return true; }
            @Override
            public JsonToken currentToken() { return JsonToken.VALUE_NULL; }
            @Override
            public JsonToken nextToken() throws IOException { return null; }
            @Override
            public JsonToken getCurrentToken() { return JsonToken.VALUE_NULL; }
            @Override
            public boolean hasToken(JsonToken t) { return t == JsonToken.VALUE_NULL; }
            @Override
            public String getCurrentName() throws IOException { return "id"; }
            @Override
            public String getText() throws IOException { return null; }
            @Override
            public String getValueAsString() throws IOException { return null; }
            @Override
            public String getValueAsString(String defaultValue) throws IOException { return null; }
            @Override
            public void skipChildren() throws IOException {}
        };
        
        DeserializationContext ctxt = new DeserializationContext(
                new com.fasterxml.jackson.databind.cfg.DeserializationConfig(null, null, null, null, null, null, null, null, null),
                null, null, null) {
            @Override
            public Object findInjectableValue(Object valueId, com.fasterxml.jackson.databind.BeanProperty forProperty,
                    Object beanInstance) { return null; }
            @Override
            public ReadableObjectId findObjectId(Object id, com.fasterxml.jackson.annotation.ObjectIdGenerator<?> gen,
                    com.fasterxml.jackson.annotation.ObjectIdResolver resolver) {
                return new ReadableObjectId(new SimpleObjectIdGenerator());
            }
            @Override
            public Class<?> handleUnknownProperty(JsonParser p2, com.fasterxml.jackson.databind.BeanProperty prop2,
                    Object instance, String propName) throws IOException { return null; }
            @Override
            public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) { return null; }
            @Override
            public JsonDeserializer<Object> findValueDeserializer(JavaType type) { return null; }
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type,
                    com.fasterxml.jackson.databind.BeanProperty prop) { return null; }
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type, com.fasterxml.jackson.databind.BeanProperty prop) { return null; }
            @Override
            public JsonParser getParser() { return p; }
        };
        
        // Test null value - returns null
        Object result = prop.deserializeSetAndReturn(p, ctxt, new Object());
        assertNull(result);
        
        // Test non-null but no idProperty - should return instance
        JsonParser p2 = new JsonParser() {
            @Override
            public Object getCodec() { return null; }
            @Override
            public void setCodec(com.fasterxml.jackson.core.ObjectCodec c) {}
            @Override
            public Object getEmbeddedObject() { return null; }
            @Override
            public com.fasterxml.jackson.core.Version version() { return null; }
            @Override
            public void close() throws IOException {}
            @Override
            public boolean isClosed() { return true; }
            @Override
            public JsonToken currentToken() { return JsonToken.VALUE_STRING; }
            @Override
            public JsonToken nextToken() throws IOException { return JsonToken.VALUE_STRING; }
            @Override
            public JsonToken getCurrentToken() { return JsonToken.VALUE_STRING; }
            @Override
            public boolean hasToken(JsonToken t) { return t == JsonToken.VALUE_STRING; }
            @Override
            public void skipChildren() throws IOException {}
        };
        
        ObjectIdValueProperty prop2 = new ObjectIdValueProperty(oidReader, PropertyMetadata.STD_REQUIRED);
        assertSame(new Object(), prop2.deserializeSetAndReturn(p2, ctxt, new Object()));
    }

    @Test
    public void testGettersAndAnnotations() {
        ObjectIdReader oidReader = createObjectIdReader(new TestDeserializer("test"));
        ObjectIdValueProperty prop = new ObjectIdValueProperty(oidReader, PropertyMetadata.STD_REQUIRED);
        assertNull(prop.getAnnotation(Deprecated.class));
        assertNull(prop.getMember());
    }

    private static class SimpleObjectIdGenerator extends com.fasterxml.jackson.annotation.ObjectIdGenerator<Object> {
        @Override
        public Class<?> getScope() { return null; }
        @Override
        public boolean canUseFor(com.fasterxml.jackson.annotation.ObjectIdGenerator<?> gen) { return true; }
        @Override
        public com.fasterxml.jackson.annotation.ObjectIdGenerator<Object> forScope(Class<?> scope) { return this; }
        @Override
        public com.fasterxml.jackson.annotation.ObjectIdGenerator<Object> newForSerialization(Object context) { return this; }
        @Override
        public IdKey key(Object key) { return new IdKey(getClass(), null, key); }
        @Override
        public Object generateId(Object forObject) { return "id"; }
    }
}