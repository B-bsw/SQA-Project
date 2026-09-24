package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AsPropertyTypeDeserializerTest {

    static class ExposedObjectMapper extends ObjectMapper {
        public DeserializationContext createContext(JsonParser p) {
            return createDeserializationContext(p, getDeserializationConfig());
        }
    }

    static class FixedTypeIdResolver implements TypeIdResolver {
        private final JavaType _type;

        FixedTypeIdResolver(Class<?> cls) {
            _type = TypeFactory.defaultInstance().constructType(cls);
        }

        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) {
            return "sample";
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return "sample";
        }

        @Override
        public String idFromBaseType() {
            return "sample";
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            return _type;
        }

        @Override
        @Deprecated
        public JavaType typeFromId(String id) {
            return _type;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return "sample";
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }
    }

    public static class Sample {
        public String type;
        public String value;
        public int before;

        public Sample() { }
    }

    private AsPropertyTypeDeserializer createDeserializer(boolean typeIdVisible) {
        return createDeserializer(typeIdVisible, null);
    }

    private AsPropertyTypeDeserializer createDeserializer(boolean typeIdVisible, JavaType defaultImpl) {
        return new AsPropertyTypeDeserializer(
                TypeFactory.defaultInstance().constructType(Object.class),
                new FixedTypeIdResolver(Sample.class),
                "type", typeIdVisible, defaultImpl, As.PROPERTY);
    }

    @Test
    public void testGetTypeInclusionReturnsProperty() {
        assertSame(As.PROPERTY, createDeserializer(false).getTypeInclusion());
    }

    @Test
    public void testForPropertyWithNullPropertyReturnsThis() {
        assertSame(createDeserializer(false), createDeserializer(false).forProperty(null));
    }

    @Test
    public void testForPropertyWithNewPropertyReturnsCopy() {
        BeanProperty property = (BeanProperty) Proxy.newProxyInstance(
                BeanProperty.class.getClassLoader(),
                new Class<?>[] { BeanProperty.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        return null;
                    }
                });

        AsPropertyTypeDeserializer src = createDeserializer(false);
        AsPropertyTypeDeserializer copy = src.forProperty(property);

        assertNotNull(copy);
        assertNotSame(src, copy);
        assertSame(As.PROPERTY, copy.getTypeInclusion());
    }

    @Test
    public void testDeserializeTypedFromObjectWithTypePropertyFirst() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("{\"type\":\"sample\",\"value\":\"hello\"}")) {
            assertSame(JsonToken.START_OBJECT, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);

            Object result = createDeserializer(false).deserializeTypedFromObject(p, ctxt);

            assertTrue(result instanceof Sample);
            Sample sample = (Sample) result;
            assertEquals("hello", sample.value);
            assertNull(sample.type);
        }
    }

    @Test
    public void testDeserializeTypedFromObjectWithPrecedingPropertyAndVisibleTypeId() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("{\"before\":1,\"type\":\"sample\",\"value\":\"hello\"}")) {
            assertSame(JsonToken.START_OBJECT, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);

            Object result = createDeserializer(true).deserializeTypedFromObject(p, ctxt);

            assertTrue(result instanceof Sample);
            Sample sample = (Sample) result;
            assertEquals(1, sample.before);
            assertEquals("hello", sample.value);
            assertEquals("sample", sample.type);
        }
    }

    @Test
    public void testDeserializeTypedFromObjectWithDefaultImplWhenTypePropertyMissing() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("{\"value\":\"hello\"}")) {
            assertSame(JsonToken.START_OBJECT, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);
            AsPropertyTypeDeserializer deser = createDeserializer(false,
                    TypeFactory.defaultInstance().constructType(Sample.class));

            Object result = deser.deserializeTypedFromObject(p, ctxt);

            assertTrue(result instanceof Sample);
            assertEquals("hello", ((Sample) result).value);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeTypedFromObjectMissingTypePropertyThrows() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("{\"value\":\"hello\"}")) {
            assertSame(JsonToken.START_OBJECT, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);

            createDeserializer(false).deserializeTypedFromObject(p, ctxt);
        }
    }

    @Test
    public void testDeserializeTypedFromAnyWithArrayUsesWrapperArray() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("[\"sample\",{\"value\":\"hi\"}]")) {
            assertSame(JsonToken.START_ARRAY, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);

            Object result = createDeserializer(false).deserializeTypedFromAny(p, ctxt);

            assertTrue(result instanceof Sample);
            assertEquals("hi", ((Sample) result).value);
        }
    }

    @Test
    public void testDeserializeTypedFromAnyWithFieldNameDelegatesToObject() throws Exception {
        ExposedObjectMapper mapper = new ExposedObjectMapper();
        try (JsonParser p = mapper.getFactory().createParser("{\"type\":\"sample\",\"value\":\"hello\"}")) {
            p.nextToken();
            assertSame(JsonToken.FIELD_NAME, p.nextToken());
            DeserializationContext ctxt = mapper.createContext(p);

            Object result = createDeserializer(false).deserializeTypedFromAny(p, ctxt);

            assertTrue(result instanceof Sample);
            assertEquals("hello", ((Sample) result).value);
        }
    }
}