package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory factory;

    @Before
    public void setUp() {
        factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    @Test
    public void testWithConfigSameConfigReturnsThis() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory f = new BeanDeserializerFactory(config);
        assertSame(f, f.withConfig(config));
    }

    @Test
    public void testWithConfigDifferentConfigReturnsNewInstance() {
        BeanDeserializerFactory f = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result = f.withConfig(new DeserializerFactoryConfig());
        assertNotSame(f, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigSubtypeThrowsIllegalState() {
        BeanDeserializerFactory sub = new BeanDeserializerFactory(new DeserializerFactoryConfig()) { };
        try {
            sub.withConfig(new DeserializerFactoryConfig());
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("not properly overridden"));
        }
    }

    @Test
    public void testIsPotentialBeanTypeAcceptsNormalClass() {
        assertTrue(factory.isPotentialBeanType(String.class));
    }

    @Test
    public void testIsPotentialBeanTypeRejectsPrimitive() {
        try {
            factory.isPotentialBeanType(int.class);
            fail("Should throw IllegalArgumentException for primitive");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class int"));
        }
    }

    @Test
    public void testIsPotentialBeanTypeRejectsLocalType() {
        class LocalBean { }
        try {
            factory.isPotentialBeanType(LocalBean.class);
            fail("Should throw IllegalArgumentException for local type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("local"));
        }
    }

    public static class SimpleBean {
        public String name;
        public int count;
    }

    @Test
    public void testReadSimpleBeanUsesBeanDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"name\":\"a\",\"count\":3}", SimpleBean.class);
        assertEquals("a", bean.name);
        assertEquals(3, bean.count);
    }

    @Test
    public void testReadStringUsesStdDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("x", mapper.readValue("\"x\"", String.class));
    }

    public static class CustomBean {
        public int value;
    }

    public static class CustomDeserializer extends JsonDeserializer<CustomBean> {
        @Override
        public CustomBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            while (p.nextToken() != JsonToken.END_OBJECT) {
                // consume tokens until end object
            }
            CustomBean bean = new CustomBean();
            bean.value = 42;
            return bean;
        }
    }

    @Test
    public void testCustomBeanDeserializerIsReturned() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(CustomBean.class, new CustomDeserializer());
        mapper.registerModule(module);
        CustomBean bean = mapper.readValue("{}", CustomBean.class);
        assertEquals(42, bean.value);
    }

    public abstract static class Animal {
        public String name;
    }

    public static class Dog extends Animal {
    }

    @Test
    public void testAbstractTypeIsMaterialized() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addAbstractTypeMapping(Animal.class, Dog.class);
        mapper.registerModule(module);
        Animal animal = mapper.readValue("{\"name\":\"Rex\"}", Animal.class);
        assertTrue(animal instanceof Dog);
        assertEquals("Rex", animal.name);
    }

    public static class ThrowableBean extends Throwable {
        public String extra;
    }

    @Test
    public void testThrowableDeserializerBuildsThrowable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ThrowableBean ex = mapper.readValue("{\"message\":\"boom\",\"extra\":\"x\"}", ThrowableBean.class);
        assertEquals("boom", ex.getMessage());
        assertEquals("x", ex.extra);
    }

    public static class InspectingModifier extends BeanDeserializerModifier {
        boolean called = false;

        @Override
        public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            called = true;
            return deserializer;
        }
    }

    @Test
    public void testDeserializerModifierIsApplied() throws Exception {
        InspectingModifier mod = new InspectingModifier();
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(mod);
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);
        SimpleBean bean = mapper.readValue("{\"name\":\"a\"}", SimpleBean.class);
        assertEquals("a", bean.name);
        assertTrue(mod.called);
    }

    @JsonDeserialize(builder = BuildableBean.Builder.class)
    public static class BuildableBean {
        public int value;

        public static class Builder {
            private int value;

            @JsonProperty("value")
            public Builder withValue(int value) {
                this.value = value;
                return this;
            }

            public BuildableBean build() {
                BuildableBean bean = new BuildableBean();
                bean.value = value;
                return bean;
            }
        }
    }

    @Test
    public void testBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuildableBean bean = mapper.readValue("{\"value\":7}", BuildableBean.class);
        assertEquals(7, bean.value);
    }
}