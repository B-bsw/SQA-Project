package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BuilderBasedDeserializerTest {

    private static class ExposedObjectMapper extends ObjectMapper {
        DeserializationContext createContext(JsonParser p, DeserializationConfig cfg) {
            return createDeserializationContext(p, cfg);
        }
    }

    private ExposedObjectMapper mapper;
    private DeserializationConfig config;
    private BeanDescription beanDesc;
    private AnnotatedMethod buildMethod;
    private BeanPropertyMap emptyProps;

    @Before
    public void setUp() throws Exception {
        mapper = new ExposedObjectMapper();
        config = mapper.getDeserializationConfig();
        beanDesc = config.introspect(mapper.constructType(SimpleBuilder.class));
        buildMethod = beanDesc.findMethod("build", new Class<?>[0]);
        emptyProps = new BeanPropertyMap(false, Collections.<SettableBeanProperty>emptyList());
    }

    private BuilderBasedDeserializer createDeserializer(boolean withBuildMethod) {
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(beanDesc, config);
        if (withBuildMethod) {
            if (buildMethod == null) {
                throw new IllegalStateException("build method not found");
            }
            builder.setBuildMethod(buildMethod);
        }
        return new BuilderBasedDeserializer(builder, beanDesc, emptyProps,
                Collections.<String, SettableBeanProperty>emptyMap(), null, false, false);
    }

    private JsonParser parser(String json) throws IOException {
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken();
        return p;
    }

    private DeserializationContext context(JsonParser p) {
        return mapper.createContext(p, config);
    }

    @Test
    public void testDeserializeEmptyObjectWithBuildMethod() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        try (JsonParser p = parser("{}")) {
            Object result = deser.deserialize(p, context(p));
            assertTrue(result instanceof Built);
        }
    }

    @Test
    public void testDeserializeEmptyObjectWithoutBuildMethod() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(false);
        try (JsonParser p = parser("{}")) {
            Object result = deser.deserialize(p, context(p));
            assertTrue(result instanceof SimpleBuilder);
        }
    }

    @Test
    public void testDeserializeWithBuilderAndBuildMethod() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        SimpleBuilder builder = new SimpleBuilder();
        try (JsonParser p = parser("{}")) {
            Object result = deser.deserialize(p, context(p), builder);
            assertTrue(result instanceof Built);
        }
    }

    @Test
    public void testDeserializeWithBuilderWithoutBuildMethod() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(false);
        SimpleBuilder builder = new SimpleBuilder();
        try (JsonParser p = parser("{}")) {
            Object result = deser.deserialize(p, context(p), builder);
            assertSame(builder, result);
        }
    }

    @Test
    public void testDeserializeNullTokenFails() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(false);
        try (JsonParser p = parser("")) {
            deser.deserialize(p, context(p));
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeUnknownPropertyFails() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        try (JsonParser p = parser("{\"unknown\":1}")) {
            try {
                deser.deserialize(p, context(p));
                fail("Expected JsonMappingException");
            } catch (JsonMappingException e) {
                assertTrue(e.getMessage().contains("unknown"));
            }
        }
    }

    @Test
    public void testDeserializeStartArrayFails() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        try (JsonParser p = parser("[]")) {
            try {
                deser.deserialize(p, context(p));
                fail("Expected JsonMappingException");
            } catch (JsonMappingException e) {
                assertNotNull(e.getMessage());
            }
        }
    }

    @Test
    public void testWithIgnorablePropertiesSkipsUnknown() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        BuilderBasedDeserializer ignorable = (BuilderBasedDeserializer) deser.withIgnorableProperties(
                Collections.singleton("unknown"));
        try (JsonParser p = parser("{\"unknown\":1}")) {
            Object result = ignorable.deserialize(p, context(p));
            assertTrue(result instanceof Built);
        }
    }

    @Test
    public void testUnwrappingDeserializerReturnsCopy() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        BuilderBasedDeserializer copy = (BuilderBasedDeserializer) deser.unwrappingDeserializer(NameTransformer.NOP);
        assertNotSame(deser, copy);
        assertSame(deser._buildMethod, copy._buildMethod);
    }

    @Test
    public void testWithBeanPropertiesReturnsCopy() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        BuilderBasedDeserializer copy = (BuilderBasedDeserializer) deser.withBeanProperties(emptyProps);
        assertNotSame(deser, copy);
        assertSame(deser._buildMethod, copy._buildMethod);
    }

    @Test
    public void testWithObjectIdReaderReturnsCopy() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        BuilderBasedDeserializer copy = (BuilderBasedDeserializer) deser.withObjectIdReader(null);
        assertNotSame(deser, copy);
        assertSame(deser._buildMethod, copy._buildMethod);
    }

    @Test
    public void testAsArrayDeserializer() throws Exception {
        BuilderBasedDeserializer deser = createDeserializer(true);
        BeanDeserializerBase arrayDeser = deser.asArrayDeserializer();
        assertNotNull(arrayDeser);
        assertEquals("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer",
                arrayDeser.getClass().getName());
    }

    public static class SimpleBuilder {
        public SimpleBuilder() { }
        public Built build() {
            return new Built();
        }
    }

    public static class Built {
    }
}