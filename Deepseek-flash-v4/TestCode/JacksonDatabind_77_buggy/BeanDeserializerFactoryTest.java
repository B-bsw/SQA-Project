package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest {

    private BeanDeserializerFactory newFactory() {
        return new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    private DeserializationContext capturedContext() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CtxtCapturingDeserializer capturing = new CtxtCapturingDeserializer();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(CtxtCaptureSource.class, capturing);
        mapper.registerModule(module);
        mapper.readValue("{}", CtxtCaptureSource.class);
        return capturing.ctxt;
    }

    @Test
    public void withConfigReturnsSameForSameConfig() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void withConfigReturnsNewForDifferentConfig() {
        BeanDeserializerFactory factory = newFactory();
        DeserializerFactoryConfig other = new DeserializerFactoryConfig();
        BeanDeserializerFactory result = (BeanDeserializerFactory) factory.withConfig(other);
        assertNotSame(factory, result);
        assertSame(result, result.withConfig(other));
    }

    @Test
    public void withConfigRejectsUnhandledSubtype() {
        BeanDeserializerFactory subtype = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
        };
        try {
            subtype.withConfig(new DeserializerFactoryConfig());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("Subtype"));
        }
    }

    @Test
    public void isPotentialBeanTypeAcceptsPlainType() {
        assertTrue(newFactory().isPotentialBeanType(String.class));
    }

    @Test
    public void isPotentialBeanTypeRejectsLocalType() {
        class LocalBean {
        }
        try {
            newFactory().isPotentialBeanType(LocalBean.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("local"));
        }
    }

    @Test
    public void createAndBuildBeanDeserializerForSimpleBean() throws Exception {
        DeserializationContext ctxt = capturedContext();
        BeanDeserializerFactory factory = newFactory();
        JavaType type = ctxt.constructType(SimpleBean.class);
        BeanDescription desc = ctxt.getConfig().introspect(type);

        assertNotNull(factory.createBeanDeserializer(ctxt, type, desc));
        assertNotNull(factory.buildBeanDeserializer(ctxt, type, desc));
    }

    @Test
    public void createBeanDeserializerReturnsStdForString() throws Exception {
        DeserializationContext ctxt = capturedContext();
        JavaType type = ctxt.constructType(String.class);
        BeanDescription desc = ctxt.getConfig().introspect(type);

        assertNotNull(newFactory().createBeanDeserializer(ctxt, type, desc));
    }

    @Test
    public void createBeanDeserializerHandlesAbstractType() throws Exception {
        DeserializationContext ctxt = capturedContext();
        JavaType type = ctxt.constructType(AbstractSimpleBean.class);
        BeanDescription desc = ctxt.getConfig().introspect(type);

        assertNotNull(newFactory().createBeanDeserializer(ctxt, type, desc));
    }

    @Test
    public void createThrowableDeserializerReturnsThrowableDeserializer() throws Exception {
        DeserializationContext ctxt = capturedContext();
        BeanDeserializerFactory factory = newFactory();
        JavaType type = ctxt.constructType(SimpleThrowable.class);
        BeanDescription desc = ctxt.getConfig().introspect(type);

        JsonDeserializer<Object> deserializer = factory.createBeanDeserializer(ctxt, type, desc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void buildThrowableDeserializerBuildsForThrowable() throws Exception {
        DeserializationContext ctxt = capturedContext();
        JavaType type = ctxt.constructType(SimpleThrowable.class);
        BeanDescription desc = ctxt.getConfig().introspect(type);

        assertNotNull(newFactory().buildThrowableDeserializer(ctxt, type, desc));
    }

    @Test
    public void createBuilderBasedDeserializerBuildsForBuilder() throws Exception {
        DeserializationContext ctxt = capturedContext();
        BeanDeserializerFactory factory = newFactory();
        JavaType valueType = ctxt.constructType(BuildableBean.class);
        BeanDescription valueDesc = ctxt.getConfig().introspect(valueType);

        JsonDeserializer<Object> deserializer = factory.createBuilderBasedDeserializer(
                ctxt, valueType, valueDesc, BuildableBeanBuilder.class);
        assertNotNull(deserializer);
    }

    public static class CtxtCaptureSource {
        public String name;
    }

    public static class CtxtCapturingDeserializer extends JsonDeserializer<CtxtCaptureSource> {
        DeserializationContext ctxt;

        @Override
        public CtxtCaptureSource deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            this.ctxt = ctxt;
            while (p.nextToken() != JsonToken.END_OBJECT) {
            }
            return new CtxtCaptureSource();
        }
    }

    public static class SimpleBean {
        public String name;
        public int value;
    }

    public abstract static class AbstractSimpleBean {
        public String name;
    }

    public static class SimpleThrowable extends Throwable {
        public String detail;
    }

    public static class BuildableBean {
        public String name;
    }

    @JsonPOJOBuilder
    public static class BuildableBeanBuilder {
        private String name;

        public BuildableBeanBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BuildableBean build() {
            BuildableBean bean = new BuildableBean();
            bean.name = name;
            return bean;
        }
    }
}