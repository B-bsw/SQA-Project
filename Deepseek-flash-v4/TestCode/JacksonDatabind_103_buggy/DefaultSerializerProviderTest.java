package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerFactory;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty;

import static org.junit.Assert.*;

public class DefaultSerializerProviderTest {

    private DefaultSerializerProvider provider;
    private DefaultSerializerProvider.Impl impl;

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory factory = mapper.getSerializerFactory();
        impl = new DefaultSerializerProvider.Impl();
        provider = impl.createInstance(mapper.getSerializationConfig(), factory);
    }

    @After
    public void tearDown() {
        provider = null;
        impl = null;
    }

    @Test
    public void testCreateInstance() {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory factory = mapper.getSerializerFactory();
        DefaultSerializerProvider.Impl newImpl = (DefaultSerializerProvider.Impl) impl.createInstance(mapper.getSerializationConfig(), factory);
        assertNotNull(newImpl);
        assertNotSame(impl, newImpl);
    }

    @Test
    public void testCopyImpl() {
        DefaultSerializerProvider.Impl copy = (DefaultSerializerProvider.Impl) impl.copy();
        assertNotNull(copy);
        assertNotSame(impl, copy);
    }

    @Test
    public void testCopySubClass() {
        DefaultSerializerProvider sub = new DefaultSerializerProvider() {
            private static final long serialVersionUID = 1L;

            @Override
            public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
                return new DefaultSerializerProvider.Impl(this, config, jsf);
            }
        };
        try {
            sub.copy();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("DefaultSerializerProvider sub-class not overriding copy()", e.getMessage());
        }
    }

    @Test
    public void testSerializerInstanceNull() throws JsonMappingException {
        assertNull(provider.serializerInstance(null, null));
    }

    @Test
    public void testSerializerInstanceJsonSerializer() throws JsonMappingException {
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {};
        assertSame(ser, provider.serializerInstance(null, ser));
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstanceInvalidType() throws JsonMappingException {
        provider.serializerInstance(new Annotated() {
            private static final long serialVersionUID = 1L;

            @Override
            public com.fasterxml.jackson.databind.JavaType getType() {
                return com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
            }

            @Override
            public String getName() {
                return "test";
            }
        }, "notASerializer");
    }

    @Test
    public void testIncludeFilterInstanceNull() throws JsonMappingException {
        assertNull(provider.includeFilterInstance(null, null));
    }

    @Test
    public void testIncludeFilterInstanceValid() throws JsonMappingException {
        Object filter = provider.includeFilterInstance(null, MyFilter.class);
        assertNotNull(filter);
        assertTrue(filter instanceof MyFilter);
    }

    @Test
    public void testIncludeFilterSuppressNulls() throws JsonMappingException {
        assertTrue(provider.includeFilterSuppressNulls(new MyFilter()));
    }

    @Test
    public void testIncludeFilterSuppressNullsWithException() {
        try {
            provider.includeFilterSuppressNulls(new Object() {
                @Override
                public boolean equals(Object obj) {
                    throw new RuntimeException("test");
                }
            });
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Problem determining whether filter of type 'java.lang.Object' should filter out `null` values: (java.lang.RuntimeException) test", e.getMessage());
        }
    }

    @Test
    public void testFindObjectIdFirstTime() {
        Object pojo = new Object();
        WritableObjectId oid = provider.findObjectId(pojo, new MyObjectIdGenerator());
        assertNotNull(oid);
        assertEquals(pojo, oid.id);
    }

    @Test
    public void testFindObjectIdCached() {
        Object pojo = new Object();
        WritableObjectId oid1 = provider.findObjectId(pojo, new MyObjectIdGenerator());
        WritableObjectId oid2 = provider.findObjectId(pojo, new MyObjectIdGenerator());
        assertSame(oid1, oid2);
    }

    @Test
    public void testFindObjectIdWithEquality() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID);
        DefaultSerializerProvider.Impl newImpl = new DefaultSerializerProvider.Impl();
        SerializerFactory factory = mapper.getSerializerFactory();
        DefaultSerializerProvider prov = newImpl.createInstance(mapper.getSerializationConfig(), factory);
        String pojo1 = new String("test");
        String pojo2 = new String("test");
        WritableObjectId oid1 = prov.findObjectId(pojo1, new MyObjectIdGenerator());
        WritableObjectId oid2 = prov.findObjectId(pojo2, new MyObjectIdGenerator());
        assertSame(oid1, oid2);
    }

    @Test
    public void testHasSerializerForObjectClass() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        DefaultSerializerProvider.Impl newImpl = new DefaultSerializerProvider.Impl();
        SerializerFactory factory = mapper.getSerializerFactory();
        DefaultSerializerProvider prov = newImpl.createInstance(mapper.getSerializationConfig(), factory);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(prov.hasSerializerFor(Object.class, cause));
        assertNull(cause.get());
    }

    @Test
    public void testHasSerializerForNonObjectClass() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertFalse(provider.hasSerializerFor(String.class, cause));
        assertNull(cause.get());
    }

    @Test
    public void testHasSerializerForWithError() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertFalse(provider.hasSerializerFor(Throwable.class, cause));
        assertNotNull(cause.get());
    }

    @Test
    public void testGetGeneratorInitiallyNull() {
        assertNull(provider.getGenerator());
    }

    @Test
    public void testSerializeValueNull() throws IOException {
        JsonGenerator gen = new ObjectMapper().getFactory().createGenerator(new java.io.StringWriter());
        provider.serializeValue(gen, null, null, null);
        gen.flush();
    }

    @Test
    public void testSerializeValueWithRootType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        String value = "test";
        JavaType rootType = mapper.constructType(String.class);
        provider.serializeValue(gen, value, rootType, null);
        gen.flush();
        gen.close();
    }

    @Test
    public void testSerializeValueWithExplicitRootName() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        String value = "test";
        JavaType rootType = mapper.constructType(String.class);
        provider.serializeValue(gen, value, rootType, null);
        gen.flush();
        gen.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitorNullType() {
        provider.acceptJsonFormatVisitor(null, null);
    }

    @Test
    public void testGenerateJsonSchema() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider.Impl newImpl = new DefaultSerializerProvider.Impl();
        SerializerFactory factory = mapper.getSerializerFactory();
        DefaultSerializerProvider prov = newImpl.createInstance(mapper.getSerializationConfig(), factory);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema schema = prov.generateJsonSchema(String.class);
        assertNotNull(schema);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateJsonSchemaNonObjectNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        DefaultSerializerProvider.Impl newImpl = new DefaultSerializerProvider.Impl();
        SerializerFactory factory = mapper.getSerializerFactory();
        DefaultSerializerProvider prov = newImpl.createInstance(mapper.getSerializationConfig(), factory);
        prov.generateJsonSchema(String.class);
    }

    @Test
    public void testCachedSerializersCountInitial() {
        assertEquals(0, provider.cachedSerializersCount());
    }

    @Test
    public void testFlushCachedSerializers() {
        provider.flushCachedSerializers();
        assertEquals(0, provider.cachedSerializersCount());
    }

    private static class MyFilter {
    }

    private static class MyObjectIdGenerator extends ObjectIdGenerator<String> {
        private static final long serialVersionUID = 1L;

        @Override
        public Class<?> getScope() {
            return Object.class;
        }

        @Override
        public boolean canUseFor(ObjectIdGenerator<?> gen) {
            return gen.getClass() == MyObjectIdGenerator.class;
        }

        @Override
        public ObjectIdGenerator<String> forScope(Class<?> scope) {
            return this;
        }

        @Override
        public ObjectIdGenerator<String> newForSerialization(Object context) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey key(Object key) {
            return new IdKey(getClass(), null, key);
        }

        @Override
        public String generateId(Object forPojo) {
            return "test";
        }
    }
}