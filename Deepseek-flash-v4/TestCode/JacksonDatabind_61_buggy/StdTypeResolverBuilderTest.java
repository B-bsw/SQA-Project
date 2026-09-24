package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class StdTypeResolverBuilderTest {

    private ObjectMapper mapper;
    private JavaType baseType;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        baseType = mapper.getTypeFactory().constructType(Object.class);
    }

    @Test
    public void testNoTypeInfoBuilder() {
        StdTypeResolverBuilder builder = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNotNull(builder);
        assertNull(builder.buildTypeSerializer(mapper.getSerializationConfig(), baseType, null));
        assertNull(builder.buildTypeDeserializer(mapper.getDeserializationConfig(), baseType, null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitWithNullIdTypeThrows() {
        new StdTypeResolverBuilder().init(null, null);
    }

    @Test
    public void testInitSetsTypePropertyAndCustomResolver() {
        TypeIdResolver custom = dummyTypeIdResolver();
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.NAME, custom);
        assertSame(custom, builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false));
        assertEquals(JsonTypeInfo.Id.NAME.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInclusionWithNullThrows() {
        new StdTypeResolverBuilder().inclusion(null);
    }

    @Test
    public void testTypePropertyNullAndEmptyResetsToDefault() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.NAME, null);
        String defaultPropertyName = JsonTypeInfo.Id.NAME.getDefaultPropertyName();

        builder.typeProperty(null);
        assertEquals(defaultPropertyName, builder.getTypeProperty());

        builder.typeProperty("");
        assertEquals(defaultPropertyName, builder.getTypeProperty());

        builder.typeProperty("customTypeProperty");
        assertEquals("customTypeProperty", builder.getTypeProperty());
    }

    @Test
    public void testDefaultImplAndVisibility() {
        assertNull(builder.getDefaultImpl());
        assertFalse(builder.isTypeIdVisible());

        assertSame(builder, builder.defaultImpl(String.class));
        assertEquals(String.class, builder.getDefaultImpl());

        assertSame(builder, builder.typeIdVisibility(true));
        assertTrue(builder.isTypeIdVisible());

        builder.defaultImpl(null);
        assertNull(builder.getDefaultImpl());
    }

    @Test
    public void testBuildTypeSerializerForInclusionTypes() {
        assertTypeSerializer(JsonTypeInfo.As.WRAPPER_ARRAY, AsArrayTypeSerializer.class);
        assertTypeSerializer(JsonTypeInfo.As.PROPERTY, AsPropertyTypeSerializer.class);
        assertTypeSerializer(JsonTypeInfo.As.WRAPPER_OBJECT, AsWrapperTypeSerializer.class);
        assertTypeSerializer(JsonTypeInfo.As.EXTERNAL_PROPERTY, AsExternalTypeSerializer.class);
        assertTypeSerializer(JsonTypeInfo.As.EXISTING_PROPERTY, AsExistingPropertyTypeSerializer.class);
    }

    @Test
    public void testBuildTypeDeserializerForInclusionTypes() {
        assertTypeDeserializer(JsonTypeInfo.As.WRAPPER_ARRAY, AsArrayTypeDeserializer.class);
        assertTypeDeserializer(JsonTypeInfo.As.PROPERTY, AsPropertyTypeDeserializer.class);
        assertTypeDeserializer(JsonTypeInfo.As.EXISTING_PROPERTY, AsPropertyTypeDeserializer.class);
        assertTypeDeserializer(JsonTypeInfo.As.WRAPPER_OBJECT, AsWrapperTypeDeserializer.class);
        assertTypeDeserializer(JsonTypeInfo.As.EXTERNAL_PROPERTY, AsExternalTypeDeserializer.class);
    }

    @Test
    public void testBuildTypeDeserializerDefaultImplBranches() {
        assertNotNull(new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.PROPERTY)
                .buildTypeDeserializer(mapper.getDeserializationConfig(), baseType, null));

        assertNotNull(buildDeserializerWithDefaultImpl(Void.class));
        assertNotNull(buildDeserializerWithDefaultImpl(NoClass.class));
        assertNotNull(buildDeserializerWithDefaultImpl(String.class));
    }

    @Test
    public void testIdResolverWithoutInitThrows() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        try {
            builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false);
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testIdResolverStandardResolvers() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null);
        TypeIdResolver resolver = builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false);
        assertTrue(resolver instanceof ClassNameIdResolver);

        builder = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.MINIMAL_CLASS, null);
        resolver = builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false);
        assertTrue(resolver instanceof MinimalClassNameIdResolver);

        builder = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NAME, null);
        resolver = builder.idResolver(mapper.getSerializationConfig(), baseType,
                Collections.<NamedType>emptyList(), true, false);
        assertTrue(resolver instanceof TypeNameIdResolver);
    }

    @Test
    public void testIdResolverNoneReturnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.NONE, null);
        assertNull(builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false));
    }

    @Test
    public void testIdResolverCustomWithoutResolverThrows() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CUSTOM, null);
        try {
            builder.idResolver(mapper.getSerializationConfig(), baseType, null, true, false);
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    private void assertTypeSerializer(JsonTypeInfo.As inclusion, Class<?> expectedType) {
        TypeSerializer serializer = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(inclusion)
                .buildTypeSerializer(mapper.getSerializationConfig(), baseType, null);
        assertNotNull(serializer);
        assertTrue(inclusion + " should produce " + expectedType.getSimpleName(),
                expectedType.isInstance(serializer));
    }

    private void assertTypeDeserializer(JsonTypeInfo.As inclusion, Class<?> expectedType) {
        TypeDeserializer deserializer = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(inclusion)
                .buildTypeDeserializer(mapper.getDeserializationConfig(), baseType, null);
        assertNotNull(deserializer);
        assertTrue(inclusion + " should produce " + expectedType.getSimpleName(),
                expectedType.isInstance(deserializer));
    }

    private TypeDeserializer buildDeserializerWithDefaultImpl(Class<?> defaultImpl) {
        return new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.PROPERTY)
                .defaultImpl(defaultImpl)
                .buildTypeDeserializer(mapper.getDeserializationConfig(), baseType, null);
    }

    private TypeIdResolver dummyTypeIdResolver() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    if ("toString".equals(method.getName())) {
                        return "dummyTypeIdResolver";
                    }
                    if ("hashCode".equals(method.getName())) {
                        return System.identityHashCode(proxy);
                    }
                    if ("equals".equals(method.getName())) {
                        return proxy == args[0];
                    }
                }
                if (method.getReturnType() == String.class) {
                    return "dummy";
                }
                if (method.getReturnType() == JsonTypeInfo.Id.class) {
                    return JsonTypeInfo.Id.CUSTOM;
                }
                if (method.getReturnType() == boolean.class) {
                    return Boolean.FALSE;
                }
                return null;
            }
        };
        return (TypeIdResolver) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[] { TypeIdResolver.class },
                handler);
    }
}