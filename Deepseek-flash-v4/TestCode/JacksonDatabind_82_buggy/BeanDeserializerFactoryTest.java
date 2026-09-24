package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanDescription;

public class BeanDeserializerFactoryTest {

    private ObjectMapper mapper;
    private BeanDeserializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    private DeserializationContext ctxt() {
        DeserializationContext c = mapper.getDeserializationContext();
        assertNotNull("DeserializationContext should be available", c);
        return c;
    }

    private JavaType type(Class<?> cls) {
        return mapper.getTypeFactory().constructType(cls);
    }

    private BeanDescription beanDesc(JavaType type) {
        return mapper.getDeserializationConfig().introspect(type);
    }

    @Test
    public void testStaticInstanceAndConfigHandling() {
        assertNotNull(BeanDeserializerFactory.instance);
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory f = new BeanDeserializerFactory(config);
        assertSame(config, f._factoryConfig);
        assertSame(f, f.withConfig(config));
        BeanDeserializerFactory copy = f.withConfig(new DeserializerFactoryConfig());
        assertNotNull(copy);
        assertNotSame(f, copy);
    }

    @Test
    public void testWithConfigFromSubtypeRequiresOverride() {
        BeanDeserializerFactory subtype = new SubtypeFactory(new DeserializerFactoryConfig());
        try {
            subtype.withConfig(new DeserializerFactoryConfig());
            fail("Expected IllegalStateException for subtype without override");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Subtype"));
        }
    }

    @Test
    public void testDefaultIllegalClassNamesAreSecurityBlacklist() {
        Set<String> illegal = BeanDeserializerFactory.instance._cfgIllegalClassNames;
        assertTrue(illegal.contains("org.apache.commons.collections.functors.InvokerTransformer"));
        assertTrue(illegal.contains("org.springframework.beans.factory.ObjectFactory"));
        try {
            illegal.add("other");
            fail("Blacklist should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testIsPotentialBeanTypeAcceptsPojo() {
        assertTrue(factory.isPotentialBeanType(Person.class));
    }

    @Test
    public void testIsPotentialBeanTypeRejectsLocalType() {
        class LocalBean {
        }
        try {
            factory.isPotentialBeanType(LocalBean.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCheckIllegalTypesRejectsConfiguredType() throws Exception {
        Set<String> old = factory._cfgIllegalClassNames;
        factory._cfgIllegalClassNames = Collections.singleton(String.class.getName());
        try {
            JavaType stringType = type(String.class);
            BeanDescription stringDesc = beanDesc(stringType);
            try {
                factory.checkIllegalTypes(ctxt(), stringType, stringDesc);
                fail("Expected JsonMappingException for illegal type");
            } catch (JsonMappingException e) {
                assertTrue(e.getMessage().contains("Illegal type"));
            }
        } finally {
            factory._cfgIllegalClassNames = old;
        }
    }

    @Test
    public void testCreateBeanDeserializerForStringUsesStdDeserializer() throws Exception {
        JavaType stringType = type(String.class);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt(), stringType, beanDesc(stringType));
        assertNotNull(deser);
        assertTrue(deser.getClass().getName().contains("StringDeserializer"));
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        JavaType throwableType = type(IllegalStateException.class);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt(), throwableType, beanDesc(throwableType));
        assertNotNull(deser);
        assertTrue(deser instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBeanDeserializerForPojo() throws Exception {
        JavaType pojoType = type(Person.class);
        JsonDeserializer<Object> deser = factory.createBeanDeserializer(ctxt(), pojoType, beanDesc(pojoType));
        assertNotNull(deser);
        assertTrue(deser instanceof BeanDeserializer);
    }

    @Test
    public void testBuildBeanDeserializerReturnsBeanDeserializer() throws Exception {
        JavaType pojoType = type(Person.class);
        JsonDeserializer<Object> deser = factory.buildBeanDeserializer(ctxt(), pojoType, beanDesc(pojoType));
        assertNotNull(deser);
        assertTrue(deser instanceof BeanDeserializer);
    }

    @Test
    public void testCreateBuilderBasedDeserializerForBuilder() throws Exception {
        JavaType valueType = type(Value.class);
        JsonDeserializer<Object> deser = factory.createBuilderBasedDeserializer(
                ctxt(), valueType, beanDesc(valueType), ValueBuilder.class);
        assertNotNull(deser);
        assertTrue(deser instanceof BuilderBasedDeserializer);
    }

    public static class Person {
        private String name;

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Value {
        private int value;

        public Value() {
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "with")
    public static class ValueBuilder {
        private int value;

        public ValueBuilder() {
        }

        public ValueBuilder withValue(int value) {
            this.value = value;
            return this;
        }

        public Value build() {
            Value result = new Value();
            result.setValue(value);
            return result;
        }
    }

    private static class SubtypeFactory extends BeanDeserializerFactory {
        private static final long serialVersionUID = 1L;

        SubtypeFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }
}