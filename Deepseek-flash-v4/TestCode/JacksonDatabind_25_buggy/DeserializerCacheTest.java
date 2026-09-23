package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private JavaType simpleType;
    private JavaType stringType;
    private JavaType mapType;
    private JavaType collectionType;
    private JavaType arrayType;
    private JavaType abstractType;
    private JavaType enumType;

    @Before
    public void setUp() throws Exception {
        cache = new DeserializerCache();
        ctxt = mockContext();
        factory = mockFactory();
        simpleType = TypeFactory.defaultInstance().constructType(String.class);
        stringType = simpleType;
        mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Integer.class);
        collectionType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        arrayType = TypeFactory.defaultInstance().constructArrayType(String.class);
        abstractType = TypeFactory.defaultInstance().constructType(AbstractClass.class);
        enumType = TypeFactory.defaultInstance().constructType(TestEnum.class);
    }

    @Test
    public void testCachedDeserializersCount_Initial_ReturnsZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testCachedDeserializersCount_AfterFlush_ReturnsZero() {
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializers_ClearsAll() throws Exception {
        cache.findValueDeserializer(ctxt, factory, simpleType);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_SimpleType_CachesResult() throws Exception {
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, simpleType);
        assertNotNull(deser);
        assertEquals(1, cache.cachedDeserializersCount());
        assertSame(deser, cache.findValueDeserializer(ctxt, factory, simpleType));
    }

    @Test
    public void testFindValueDeserializer_CustomValueHandler_ReturnsNull() throws Exception {
        JavaType customType = TypeFactory.defaultInstance().constructType(String.class);
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType withHandler = tf.constructType(String.class);
        // Add custom handler
        withHandler = withHandler.withValueHandler(new Object());
        assertNull(cache.findValueDeserializer(ctxt, factory, withHandler));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCachedDeserializer_NullType_Throws() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void testFindCachedDeserializer_NonCachedType_ReturnsNull() throws Exception {
        assertNull(cache._findCachedDeserializer(simpleType));
    }

    @Test
    public void testFindCachedDeserializer_CachedType_ReturnsDeserializer() throws Exception {
        cache.findValueDeserializer(ctxt, factory, simpleType);
        assertNotNull(cache._findCachedDeserializer(simpleType));
    }

    @Test
    public void testHasValueDeserializerFor_ExistingType_ReturnsTrue() throws Exception {
        cache.findValueDeserializer(ctxt, factory, simpleType);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, simpleType));
    }

    @Test
    public void testHasValueDeserializerFor_NonExistingType_ReturnsFalse() throws Exception {
        assertFalse(cache.hasValueDeserializerFor(ctxt, factory, simpleType));
    }

    @Test
    public void testFindKeyDeserializer_ValidType_ReturnsDeserializer() throws Exception {
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, TypeFactory.defaultInstance().constructType(String.class));
        assertNotNull(kd);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindKeyDeserializer_UnknownType_Throws() throws Exception {
        JavaType unknownType = TypeFactory.defaultInstance().constructType(UnknownType.class);
        cache.findKeyDeserializer(ctxt, factory, unknownType);
    }

    @Test
    public void testCreateAndCacheValueDeserializer_NullBypass() throws Exception {
        JsonDeserializer<Object> deser = cache._createAndCacheValueDeserializer(ctxt, factory, simpleType);
        assertNotNull(deser);
    }

    @Test
    public void testCreateDeserializer_EnumType_ReturnsEnumDeserializer() throws Exception {
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, enumType);
        assertNotNull(deser);
    }

    @Test
    public void testCreateDeserializer_ArrayType_ReturnsArrayDeserializer() throws Exception {
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, arrayType);
        assertNotNull(deser);
    }

    @Test
    public void testCreateDeserializer_CollectionType_ReturnsCollectionDeserializer() throws Exception {
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, collectionType);
        assertNotNull(deser);
    }

    @Test
    public void testCreateDeserializer_MapType_ReturnsMapDeserializer() throws Exception {
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, factory, mapType);
        assertNotNull(deser);
    }

    @Test
    public void testCreateDeserializer_AbstractType_ThrowsJsonMappingException() {
        try {
            cache.findValueDeserializer(ctxt, factory, abstractType);
            fail("Expected JsonMappingException for abstract type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("abstract type"));
        }
    }

    @Test
    public void testWriteReplace_ClearsIncompleteDeserializers() throws Exception {
        cache.writeReplace();
        assertEquals(0, cache._incompleteDeserializers.size());
    }

    @Test
    public void testModifyTypeByAnnotation_NullSubclass_ReturnsOriginal() throws Exception {
        Annotated annotated = mockAnnotated(null);
        JavaType result = cache.modifyTypeByAnnotation(ctxt, annotated, simpleType);
        assertEquals(simpleType, result);
    }

    @Test
    public void testModifyTypeByAnnotation_Subclass_ReturnsNarrowedType() throws Exception {
        Annotated annotated = mockAnnotatedWithSubclass(StringBuilder.class);
        JavaType result = cache.modifyTypeByAnnotation(ctxt, annotated, simpleType);
        assertEquals(StringBuilder.class, result.getRawClass());
    }

    @Test
    public void testModifyTypeByAnnotation_NullKeyClass_ReturnsOriginal() throws Exception {
        Annotated annotated = mockAnnotatedWithKeySubclass(null);
        JavaType result = cache.modifyTypeByAnnotation(ctxt, annotated, mapType);
        assertEquals(mapType, result);
    }

    @Test
    public void testModifyTypeByAnnotation_KeyClass_ReturnsNarrowedKey() throws Exception {
        Annotated annotated = mockAnnotatedWithKeySubclass(Long.class);
        JavaType result = cache.modifyTypeByAnnotation(ctxt, annotated, mapType);
        assertEquals(Long.class, result.getKeyType().getRawClass());
    }

    @Test
    public void testHandleUnknownValueDeserializer_Concrete_ThrowsWithMessage() {
        try {
            cache._handleUnknownValueDeserializer(simpleType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Can not find"));
        }
    }

    @Test
    public void testHandleUnknownValueDeserializer_Abstract_ThrowsWithAbstractMessage() {
        try {
            cache._handleUnknownValueDeserializer(abstractType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("abstract type"));
        }
    }

    @Test
    public void testHandleUnknownKeyDeserializer_ThrowsWithMessage() {
        try {
            cache._handleUnknownKeyDeserializer(simpleType);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Key deserializer"));
        }
    }

    @Test
    public void testHasCustomValueHandler_NonContainer_False() {
        assertFalse(cache._hasCustomValueHandler(simpleType));
    }

    @Test
    public void testHasCustomValueHandler_ContainerNoHandler_False() throws Exception {
        assertFalse(cache._hasCustomValueHandler(mapType));
    }

    @Test
    public void testHasCustomValueHandler_ContainerWithHandler_True() {
        JavaType withHandler = mapType.withValueHandler(new String());
        assertTrue(cache._hasCustomValueHandler(withHandler));
    }

    @Test
    public void testVerifyAsClass_Null_ReturnsNull() {
        assertNull(cache._verifyAsClass(null, "method", Object.class));
    }

    @Test
    public void testVerifyAsClass_NotClass_Throws() {
        try {
            cache._verifyAsClass(new Object(), "method", Object.class);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("returned value of type"));
        }
    }

    @Test
    public void testVerifyAsClass_Class_ReturnsClass() {
        Class<?> result = cache._verifyAsClass(String.class, "method", Object.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testVerifyAsClass_Bogus_ReturnsNull() {
        assertNull(cache._verifyAsClass(Object.class, "method", Object.class));
    }

    @Test
    public void testFindConverter_NullAnnotation_ReturnsNull() throws Exception {
        Annotated annotated = mockAnnotatedWithConverter(null);
        assertNull(cache.findConverter(ctxt, annotated));
    }

    // Mock helper methods
    private DeserializationContext mockContext() {
        return mockContext(null);
    }

    private DeserializationContext mockContext(AnnotationIntrospector intr) {
        DeserializationContext ctx = new DeserializationContext(null, new DeserializationConfig(null, null, null, null)) {
            private static final long serialVersionUID = 1L;

            @Override
            public AnnotationIntrospector getAnnotationIntrospector() {
                if (intr != null) return intr;
                return super.getAnnotationIntrospector();
            }

            @Override
            public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserializer) {
                return new StdDeserializer<Object>(Object.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserializer) {
                return new KeyDeserializer() {
                    @Override
                    public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
                        return key;
                    }
                };
            }

            @Override
            public <T> Converter<T, T> converterInstance(Annotated annotated, Object converter) {
                return new Converter<T, T>() {
                    @Override
                    public T convert(T value) {
                        return value;
                    }

                    @Override
                    public JavaType getInputType(TypeFactory typeFactory) {
                        return typeFactory.constructType(Object.class);
                    }

                    @Override
                    public JavaType getOutputType(TypeFactory typeFactory) {
                        return typeFactory.constructType(Object.class);
                    }
                };
            }
        };
        return ctx;
    }

    private DeserializerFactory mockFactory() {
        return new DeserializerFactory() {
            @Override
            public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Object.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Enum.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Object[].class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Collection.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createCollectionLikeDeserializer(DeserializationContext ctxt, CollectionLikeType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Collection.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Map.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createMapLikeDeserializer(DeserializationContext ctxt, MapLikeType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(Map.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createTreeDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) {
                return new StdDeserializer<Object>(JsonNode.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builder) {
                return new StdDeserializer<Object>(Object.class) {
                    private static final long serialVersionUID = 1L;
                };
            }

            @Override
            public JavaType mapAbstractType(DeserializationConfig config, JavaType type) {
                return type;
            }

            @Override
            public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) {
                return new KeyDeserializer() {
                    @Override
                    public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
                        return key;
                    }
                };
            }
        };
    }

    private Annotated mockAnnotated(Object returnValue) {
        return new Annotated(null, null, null) {
            @Override
            public Class<?> getRawType() {
                return Object.class;
            }

            @Override
            public String getName() {
                return "test";
            }

            @Override
            public Annotated getParent() {
                return null;
            }

            @Override
            public int getModifiers() {
                return 0;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public boolean isFinal() {
                return false;
            }

            @Override
            public boolean isAbstract() {
                return false;
            }

            @Override
            public boolean isConcrete() {
                return true;
            }

            @Override
            public boolean isTransient() {
                return false;
            }

            @Override
            public boolean isVirtual() {
                return false;
            }

            @Override
            public boolean isField() {
                return false;
            }

            @Override
            public boolean isMethod() {
                return false;
            }

            @Override
            public boolean isConstructor() {
                return false;
            }

            @Override
            public boolean hasAnnotation(Class<? extends Annotation> acls) {
                return false;
            }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) {
                return null;
            }

            @Override
            public Iterable<Annotation> annotations() {
                return Collections.emptyList();
            }

            @SuppressWarnings("unchecked")
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls, boolean includeParents) {
                return null;
            }

            @Override
            public boolean isAbstractOrMissing() {
                return false;
            }

            @Override
            public int getMemberIndex() {
                return 0;
            }

            @Override
            public Class<?> getDeclaringClass() {
                return getClass();
            }
        };
    }

    private Annotated mockAnnotatedWithSubclass(Class<?> subclass) {
        return new Annotated(null, null, null) {
            @Override
            public Class<?> getRawType() {
                return Object.class;
            }

            @Override
            public String getName() {
                return "test";
            }

            @Override
            public Annotated getParent() {
                return null;
            }

            @Override
            public int getModifiers() {
                return 0;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public boolean isFinal() {
                return false;
            }

            @Override
            public boolean isAbstract() {
                return false;
            }

            @Override
            public boolean isConcrete() {
                return true;
            }

            @Override
            public boolean isTransient() {
                return false;
            }

            @Override
            public boolean isVirtual() {
                return false;
            }

            @Override
            public boolean isField() {
                return false;
            }

            @Override
            public boolean isMethod() {
                return false;
            }

            @Override
            public boolean isConstructor() {
                return false;
            }

            @Override
            public boolean hasAnnotation(Class<? extends Annotation> acls) {
                return false;
            }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) {
                return null;
            }

            @Override
            public Iterable<Annotation> annotations() {
                return Collections.emptyList();
            }

            @SuppressWarnings("unchecked")
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls, boolean includeParents) {
                return null;
            }

            @Override
            public AnnotationIntrospector.ReferenceProperty getReferenceProperty() {
                return null;
            }

            @Override
            public boolean isTypeId() {
                return false;
            }

            @Override
            public boolean hasGetter() {
                return false;
            }

            @Override
            public boolean hasSetter() {
                return false;
            }

            @Override
            public boolean hasField() {
                return false;
            }

            @Override
            public boolean isInjected() {
                return false;
            }

            @Override
            public String getAccessorName() {
                return null;
            }

            @Override
            public String getMutatorName() {
                return null;
            }

            @Override
            public Class<?> getType() {
                return Object.class;
            }

            @Override
            public Class<?> getRawTypeForReflection() {
                return Object.class;
            }

            @Override
            public Object getMember() {
                return null;
            }

            @Override
            public Class<?> getDeclaringClass() {
                return getClass();
            }

            @Override
            public int getAnnotationCount() {
                return 0;
            }
        };
    }

    private Annotated mockAnnotatedWithKeySubclass(Class<?> keyClass) {
        return new Annotated(null, null, null) {
            @Override
            public Class<?> getRawType() {
                return Object.class;
            }

            @Override
            public String getName() {
                return "test";
            }

            @Override
            public Annotated getParent() {
                return null;
            }

            @Override
            public int getModifiers() {
                return 0;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public boolean isFinal() {
                return false;
            }

            @Override
            public boolean isAbstract() {
                return false;
            }

            @Override
            public boolean isConcrete() {
                return true;
            }

            @Override
            public boolean isTransient() {
                return false;
            }

            @Override
            public boolean isVirtual() {
                return false;
            }

            @Override
            public boolean isField() {
                return false;
            }

            @Override
            public boolean isMethod() {
                return false;
            }

            @Override
            public boolean isConstructor() {
                return false;
            }

            @Override
            public boolean hasAnnotation(Class<? extends Annotation> acls) {
                return false;
            }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) {
                return null;
            }

            @Override
            public Iterable<Annotation> annotations() {
                return Collections.emptyList();
            }

            @SuppressWarnings("unchecked")
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls, boolean includeParents) {
                return null;
            }

            @Override
            public boolean isAbstractOrMissing() {
                return false;
            }

            @Override
            public int getMemberIndex() {
                return 0;
            }

            @Override
            public Class<?> getDeclaringClass() {
                return getClass();
            }
        };
    }

    private Annotated mockAnnotatedWithConverter(Object conv) {
        return new Annotated(null, null, null) {
            @Override
            public Class<?> getRawType() {
                return Object.class;
            }

            @Override
            public String getName() {
                return "test";
            }

            @Override
            public Annotated getParent() {
                return null;
            }

            @Override
            public int getModifiers() {
                return 0;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public boolean isFinal() {
                return false;
            }

            @Override
            public boolean isAbstract() {
                return false;
            }

            @Override
            public boolean isConcrete() {
                return true;
            }

            @Override
            public boolean isTransient() {
                return false;
            }

            @Override
            public boolean isVirtual() {
                return false;
            }

            @Override
            public boolean isField() {
                return false;
            }

            @Override
            public boolean isMethod() {
                return false;
            }

            @Override
            public boolean isConstructor() {
                return false;
            }

            @Override
            public boolean hasAnnotation(Class<? extends Annotation> acls) {
                return false;
            }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) {
                return null;
            }

            @Override
            public Iterable<Annotation> annotations() {
                return Collections.emptyList();
            }

            @Override
            public AnnotationIntrospector.ReferenceProperty getReferenceProperty() {
                return null;
            }

            @Override
            public boolean isTypeId() {
                return false;
            }

            @Override
            public boolean hasGetter() {
                return false;
            }

            @Override
            public boolean hasSetter() {
                return false;
            }

            @Override
            public boolean hasField() {
                return false;
            }

            @Override
            public boolean isInjected() {
                return false;
            }

            @Override
            public String getAccessorName() {
                return null;
            }

            @Override
            public String getMutatorName() {
                return null;
            }

            @Override
            public Class<?> getType() {
                return Object.class;
            }

            @Override
            public Class<?> getRawTypeForReflection() {
                return Object.class;
            }

            @Override
            public Object getMember() {
                return null;
            }

            @Override
            public Class<?> getDeclaringClass() {
                return getClass();
            }

            @Override
            public int getAnnotationCount() {
                return 0;
            }
        };
    }

    static class AbstractClass {
    }

    static class UnknownType {
    }

    enum TestEnum {
        A, B, C;
    }
}