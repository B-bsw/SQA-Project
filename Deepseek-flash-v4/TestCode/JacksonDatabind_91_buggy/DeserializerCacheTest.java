package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.Converter;

public class DeserializerCacheTest {

    private DeserializationConfig config;
    private DeserializationContext ctxt;
    private DeserializerCache cache;
    private ConfigurableFactory factory;

    @Before
    public void setUp() {
        config = new ObjectMapper().getDeserializationConfig();
        ctxt = new TestContext(config);
        cache = new DeserializerCache();
        factory = new ConfigurableFactory();
    }

    private JavaType stringType() {
        return config.getTypeFactory().constructType(String.class);
    }

    @Test
    public void newCacheIsEmptyAndFlushClearsAddedEntries() {
        assertEquals(0, cache.cachedDeserializersCount());
        JavaType type = stringType();
        cache._cachedDeserializers.put(type, new FakeDeserializer(false));
        assertEquals(1, cache.cachedDeserializersCount());
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void findValueDeserializerReturnsCachedInstance() throws Exception {
        JavaType type = stringType();
        JsonDeserializer<Object> fake = new FakeDeserializer(false);
        cache._cachedDeserializers.put(type, fake);
        assertSame(fake, cache.findValueDeserializer(ctxt, factory, type));
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
    }

    @Test
    public void findValueDeserializerCreatesAndCachesCachableDeserializer() throws Exception {
        JavaType type = stringType();
        JsonDeserializer<Object> first = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(first);
        assertTrue(first.isCachable());
        assertEquals(1, cache.cachedDeserializersCount());
        assertSame(first, cache.findValueDeserializer(ctxt, factory, type));
    }

    @Test
    public void findValueDeserializerDoesNotCacheNonCachableDeserializer() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.cachable = false;
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, f, stringType());
        assertNotNull(deser);
        assertFalse(deser.isCachable());
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void findValueDeserializerReturnsIncompleteDeserializerWhenPresent() throws Exception {
        JavaType type = stringType();
        JsonDeserializer<Object> fake = new FakeDeserializer(false);
        cache._incompleteDeserializers.put(type, fake);
        assertSame(fake, cache.findValueDeserializer(ctxt, factory, type));
    }

    @Test
    public void findValueDeserializerResolvesResolvableDeserializer() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.resolvable = true;
        JsonDeserializer<Object> deser = cache.findValueDeserializer(ctxt, f, stringType());
        assertTrue(deser instanceof ResolvingFake);
        assertTrue(((ResolvingFake) deser).resolved);
        assertEquals(0, cache._incompleteDeserializers.size());
    }

    @Test
    public void findKeyDeserializerReturnsFactoryResult() throws Exception {
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, stringType());
        assertNotNull(kd);
        assertTrue(kd instanceof FakeKeyDeserializer);
    }

    @Test
    public void findKeyDeserializerResolvesResolvableKeyDeserializer() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.resolvableKey = true;
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, f, stringType());
        assertTrue(kd instanceof ResolvingKeyDeserializer);
        assertTrue(((ResolvingKeyDeserializer) kd).resolved);
    }

    @Test(expected = JsonMappingException.class)
    public void findValueDeserializerThrowsWhenFactoryReturnsNull() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.returnNullBean = true;
        cache.findValueDeserializer(ctxt, f, stringType());
    }

    @Test(expected = JsonMappingException.class)
    public void findKeyDeserializerThrowsWhenFactoryReturnsNull() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.returnNullKey = true;
        cache.findKeyDeserializer(ctxt, f, stringType());
    }

    @Test(expected = JsonMappingException.class)
    public void findValueDeserializerWrapsIllegalArgumentException() throws Exception {
        ConfigurableFactory f = new ConfigurableFactory();
        f.throwIAE = true;
        cache.findValueDeserializer(ctxt, f, stringType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void cachedLookupRejectsNullType() {
        cache._findCachedDeserializer(null);
    }

    @Test
    public void writeReplaceClearsIncompleteDeserializers() {
        JavaType type = stringType();
        cache._incompleteDeserializers.put(type, new FakeDeserializer(false));
        assertEquals(1, cache._incompleteDeserializers.size());
        assertSame(cache, cache.writeReplace());
        assertEquals(0, cache._incompleteDeserializers.size());
    }

    static class TestContext extends DeserializationContext {
        TestContext(DeserializationConfig config) {
            super(config, null, null);
        }

        @Override
        public void reportMappingException(String msg, Object... args) throws JsonMappingException {
            throw new JsonMappingException(null, String.format(msg, args));
        }

        @Override
        public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) {
            throw new UnsupportedOperationException();
        }

        @Override
        public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Class<?> deserClass) {
            throw new UnsupportedOperationException();
        }

        @Override
        public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object keyDeserDef) {
            throw new UnsupportedOperationException();
        }

        @Override
        public KeyDeserializer keyDeserializerInstance(Annotated annotated, Class<?> keyDeserClass) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Converter<Object,Object> converterInstance(Annotated annotated, Object converterDef) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Converter<Object,Object> converterInstance(Annotated annotated, Class<?> converterClass) {
            throw new UnsupportedOperationException();
        }
    }

    static class ConfigurableFactory extends BasicDeserializerFactory {
        boolean returnNullBean;
        boolean returnNullKey;
        boolean cachable = true;
        boolean resolvable;
        boolean resolvableKey;
        boolean throwIAE;

        ConfigurableFactory() {
            super(new DeserializerFactoryConfig());
        }

        @Override
        public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt,
                JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            if (throwIAE) {
                throw new IllegalArgumentException("fail");
            }
            if (returnNullBean) {
                return null;
            }
            if (resolvable) {
                return new ResolvingFake(cachable);
            }
            return new FakeDeserializer(cachable);
        }

        @Override
        public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt,
                JavaType type) throws JsonMappingException {
            if (returnNullKey) {
                return null;
            }
            if (resolvableKey) {
                return new ResolvingKeyDeserializer();
            }
            return new FakeKeyDeserializer();
        }
    }

    static class FakeDeserializer extends JsonDeserializer<Object> {
        private final boolean cachable;

        FakeDeserializer(boolean cachable) {
            this.cachable = cachable;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public boolean isCachable() {
            return cachable;
        }
    }

    static class ResolvingFake extends FakeDeserializer implements ResolvableDeserializer {
        boolean resolved;

        ResolvingFake(boolean cachable) {
            super(cachable);
        }

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            resolved = true;
        }
    }

    static class FakeKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    static class ResolvingKeyDeserializer extends FakeKeyDeserializer implements ResolvableDeserializer {
        boolean resolved;

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            resolved = true;
        }
    }
}