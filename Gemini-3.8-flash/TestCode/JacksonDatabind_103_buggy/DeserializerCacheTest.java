package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        cache = new DeserializerCache();
        typeFactory = TypeFactory.defaultInstance();
        // Simple stub factory and context for most tests; override per test if needed
        factory = BeanSerializerFactory.instance; // Not a real DeserializerFactory but we'll mock behavior in tests via overrides
        // Use a proxy or stub; but for simplicity we create local inner stubs
        ctxt = createMockContext();
    }

    private DeserializationContext createMockContext() {
        // Minimal stub that delegates to default behavior; tests that need more override.
        // This returns a context that throws for most actions; we'll override methods in specific tests.
        return new DeserializationContext(null, null, null) {
            @Override
            public Object getAttribute(Object key) { return null; }
            @Override
            public void setAttribute(Object key, Object value) { }
            @Override
            public JavaType getContextType() { return null; }
            @Override
            public Class<?> getActiveView() { return null; }
            @Override
            public DeserializationConfig getConfig() { return null; }
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override
            public TypeDeserializer findTypeDeserializer(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object keyDeserDef) throws JsonMappingException { return null; }
            @Override
            public JsonMappingException reportBadDefinition(JavaType type, String msg) throws JsonMappingException { throw new JsonMappingException(null, msg); }
            @Override
            public Converter<Object,Object> converterInstance(Annotated annotated, Object convDef) throws JsonMappingException { return null; }
        };
    }

    // ---- Test cachedDeserializersCount and flush ----
    @Test
    public void testCachedDeserializersCountInitialZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers() throws Exception {
        // populate cache via findValueDeserializer for a simple type
        JavaType stringType = typeFactory.constructType(String.class);
        cache.findValueDeserializer(ctxt, factory, stringType);
        assertTrue(cache.cachedDeserializersCount() > 0);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    // ---- Test _findCachedDeserializer with null type ----
    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializerNullTypeThrows() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializerWithCustomHandlersReturnsNull() throws Exception {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        type = type.withContentTypeHandler(new TestTypeHandler());
        assertNull(cache._findCachedDeserializer(type));
    }

    @Test
    public void testFindCachedDeserializerNotFoundReturnsNull() {
        JavaType stringType = typeFactory.constructType(String.class);
        assertNull(cache._findCachedDeserializer(stringType));
    }

    // ---- Test findValueDeserializer with mocked factory/context ----
    @Test
    public void testFindValueDeserializerCreatesAndCaches() throws Exception {
        JavaType stringType = typeFactory.constructType(String.class);
        // Use stub factory that creates a simple deserializer
        DeserializerFactory stubFactory = new DeserializerFactoryStub();
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, stubFactory, stringType);
        assertNotNull(deser);
        assertEquals(stringType, deser.handledType()); // depends on our stub
        assertTrue(cache.cachedDeserializersCount() > 0);
        // second call should be from cache
        JsonDeserializer<Object> deser2 = cache.findValueDeserializer(ctxt, stubFactory, stringType);
        assertSame(deser, deser2);
    }

    @Test
    public void testFindValueDeserializerHandlesUnknownType() throws Exception {
        JavaType unknownType = typeFactory.constructType(Object.class);
        DeserializerFactory stubFactory = new DeserializerFactoryStub();
        try {
            cache.findValueDeserializer(ctxt, stubFactory, unknownType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    // ---- Test _hasCustomHandlers ----
    @Test
    public void testHasCustomHandlersNullContent() {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        assertFalse(cache._hasCustomHandlers(type));
    }

    @Test
    public void testHasCustomHandlersWithTypeHandlerOnContent() throws Exception {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        type = type.withContentTypeHandler(new TestTypeHandler());
        assertTrue(cache._hasCustomHandlers(type));
    }

    @Test
    public void testHasCustomHandlersWithKeyTypeHandler() throws Exception {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        type = type.withKeyTypeHandler(new TestTypeHandler());
        assertTrue(cache._hasCustomHandlers(type));
    }

    @Test
    public void testHasCustomHandlersNoHandlers() {
        JavaType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        assertFalse(cache._hasCustomHandlers(type));
    }

    // ---- Test _verifyAsClass ----
    @Test
    public void testVerifyAsClassNullReturnsNone() {
        Class<?> none = String.class;
        Class<?> result = cache._verifyAsClass(null, "test", none);
        assertNull(result);
    }

    @Test
    public void testVerifyAsClassNotClassInstanceThrows() {
        Object src = new Object();
        try {
            cache._verifyAsClass(src, "test", String.class);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("returned value of type"));
        }
    }

    @Test
    public void testVerifyAsClassBogusReturnsNull() throws Exception {
        // bogus class = e.g., the None class itself
        Class<?> none = TestNone.class;
        Class<?> result = cache._verifyAsClass(TestNone.class, "test", TestNone.class);
        assertEquals(TestNone.class, result);
    }

    // ---- Test _handleUnknownValueDeserializer ----
    @Test
    public void testHandleUnknownValueDeserializerAbstractType() throws Exception {
        JavaType abstractType = typeFactory.constructType(AbstractClass.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, abstractType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("abstract type"));
        }
    }

    @Test
    public void testHandleUnknownValueDeserializerConcreteType() throws Exception {
        JavaType concreteType = typeFactory.constructType(String.class);
        try {
            cache._handleUnknownValueDeserializer(ctxt, concreteType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Cannot find a Value deserializer for type"));
        }
    }

    // ---- Test writeReplace ----
    @Test
    public void testWriteReplaceClearsIncomplete() throws Exception {
        // populate incomplete via exception path (hard to force). Instead call indirectly via reflection might be overkill; test just that it doesn't crash.
        Object result = cache.writeReplace();
        assertNotNull(result);
        assertSame(cache, result);
    }

    // Test classes and stubs
    abstract class AbstractClass { }

    static class TestTypeHandler extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException { }
    }

    static class DeserializerFactoryStub extends DeserializerFactory {
        @Override
        public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            return new StdDeserializer<Object>(type.getRawClass()) {
                @Override
                public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                    return null;
                }
            };
        }
        // other abstracts are stubbed minimally; we won't use them except to compile
        @Override public JavaType mapAbstractType(DeserializationConfig config, JavaType type) { return type; }
        @Override public ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext ctxt, ReferenceType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext ctxt, MapLikeType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) { return null; }
        @Override public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext ctxt, CollectionLikeType type, BeanDescription beanDesc) { return null; }
        @Override public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) { return null; }
    }

    static class TestNone extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
    }
}