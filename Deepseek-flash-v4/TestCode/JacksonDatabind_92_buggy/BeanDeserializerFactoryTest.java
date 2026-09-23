package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.BeanDescription;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;
    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    @Before
    public void setUp() throws Exception {
        factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        mapper = new ObjectMapper();
        DefaultDeserializerProvider provider = new DefaultDeserializerProvider(factory);
        ctxt = provider.createDeserializationContext(mapper.getDeserializationConfig(), null, null);
    }

    @Test
    public void testStaticInstanceNotNull() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    @Test
    public void testWithConfigReturnsSameForSameConfig() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory f = new BeanDeserializerFactory(config);
        assertSame(f, f.withConfig(config));
    }

    @Test
    public void testWithConfigReturnsNewFactoryForDifferentConfig() {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        BeanDeserializerFactory f = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        BeanDeserializerFactory result = (BeanDeserializerFactory) f.withConfig(newConfig);
        assertNotSame(f, result);
        assertSame(newConfig, result._factoryConfig);
    }

    @Test
    public void testWithConfigNullConfigReturnsNewFactory() {
        BeanDeserializerFactory f = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        BeanDeserializerFactory result = (BeanDeserializerFactory) f.withConfig(null);
        assertNotSame(f, result);
        assertNull(result._factoryConfig);
    }

    @Test
    public void testWithConfigOnSubtypeThrowsIllegalState() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory sub = new BeanDeserializerFactory(config) { };
        try {
            sub.withConfig(new DeserializerFactoryConfig());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testCreateBeanDeserializerForSimpleBean() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deser);
        assertEquals(SimpleBean.class, deser.handledType());
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        JavaType type = mapper.constructType(IOException.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        JavaType valueType = mapper.constructType(SimpleBean.class);
        JsonDeserializer<Object> deser = factory.createBuilderBasedDeserializer(
                ctxt, valueType, null, SimpleBeanBuilder.class);
        assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializer() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt, type, beanDesc);
        assertNotNull(deser);
        assertEquals(SimpleBean.class, deser.handledType());
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        JavaType type = mapper.constructType(IOException.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<Object> deser = factory.buildThrowableDeserializer(ctxt, type, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testFindStdDeserializerForString() throws Exception {
        JavaType type = mapper.constructType(String.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        JsonDeserializer<?> deser = factory.findStdDeserializer(ctxt, type, beanDesc);
        assertNotNull(deser);
        assertEquals(String.class, deser.handledType());
    }

    @Test
    public void testCheckIllegalTypesAllowsNormal() throws Exception {
        JavaType type = mapper.constructType(String.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        factory.checkIllegalTypes(ctxt, type, beanDesc);
    }

    @Test
    public void testCheckIllegalTypesRejectsConfiguredIllegalType() throws Exception {
        BeanDeserializerFactory f = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        f._cfgIllegalClassNames = Collections.singleton("java.lang.String");
        JavaType type = mapper.constructType(String.class);
        BeanDescription beanDesc = ctxt.getConfig().introspect(type);
        try {
            f.checkIllegalTypes(ctxt, type, beanDesc);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Illegal type"));
        }
    }

    @Test
    public void testIsPotentialBeanTypeAllowsNormal() {
        assertTrue(factory.isPotentialBeanType(String.class));
    }

    @Test
    public void testIsPotentialBeanTypeRejectsArray() {
        try {
            factory.isPotentialBeanType(int[].class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public static class SimpleBean {
        private String value;

        public SimpleBean() { }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
    public static class SimpleBeanBuilder {
        private String value;

        public SimpleBeanBuilder() { }

        public SimpleBeanBuilder withValue(String value) {
            this.value = value;
            return this;
        }

        public SimpleBean build() {
            SimpleBean bean = new SimpleBean();
            bean.setValue(value);
            return bean;
        }
    }
}