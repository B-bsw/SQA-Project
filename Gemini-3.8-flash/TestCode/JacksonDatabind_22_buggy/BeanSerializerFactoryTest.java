package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;

    @Before
    public void setUp() {
        factory = BeanSerializerFactory.instance;
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testInstanceNotNull() {
        assertNotNull(factory);
    }

    @Test
    public void testWithConfigSameConfigReturnsThis() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        assertSame(factory, factory.withConfig(config));
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigDifferentConfigSubtypeThrows() {
        BeanSerializerFactory subtype = new BeanSerializerFactory(null) {
            private static final long serialVersionUID = 1L;
        };
        subtype.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testWithConfigDifferentConfigReturnsNewInstance() {
        SerializerFactoryConfig config = new SerializerFactoryConfig();
        assertNotSame(factory, factory.withConfig(config));
    }

    @Test
    public void testFindBeanPropertiesNullProperties() throws Exception {
        BeanDescription desc = mockBeanDescription(Object.class);
        assertNull(factory.findBeanProperties(null, desc, null));
    }

    private BeanDescription mockBeanDescription(Class<?> cls) {
        return new BasicBeanDescription(null, null, null, null);
    }

    @Test
    public void testConstructBeanSerializerBuilder() {
        BeanDescription desc = mockBeanDescription(Object.class);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(desc);
        assertNotNull(builder);
    }

    @Test
    public void testIsPotentialBeanTypeValid() {
        assertTrue(factory.isPotentialBeanType(String.class));
        assertFalse(factory.isPotentialBeanType(int[].class));
        assertFalse(factory.isPotentialBeanType(null));
    }

    @Test
    public void testFindPropertyTypeSerializerWithNullResolver() throws Exception {
        SerializationConfig config = mock(SerializationConfig.class);
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        when(config.getAnnotationIntrospector()).thenReturn(ai);
        when(ai.findPropertyTypeResolver(any(), any(), any())).thenReturn(null);
        factory.findPropertyTypeSerializer(null, config, null);
    }

    @Test
    public void testFindPropertyContentTypeSerializerWithNullResolver() throws Exception {
        SerializationConfig config = mock(SerializationConfig.class);
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        when(config.getAnnotationIntrospector()).thenReturn(ai);
        when(ai.findPropertyContentTypeResolver(any(), any(), any())).thenReturn(null);
        factory.findPropertyContentTypeSerializer(null, null, config, null);
    }

    @Test
    public void testConstructObjectIdHandlerNoObjectIdInfo() throws Exception {
        BeanDescription desc = mock(BeanDescription.class);
        when(desc.getObjectIdInfo()).thenReturn(null);
        assertNull(factory.constructObjectIdHandler(null, desc, new ArrayList<>()));
    }

    @Test
    public void testConstructObjectIdHandlerBadPropertyName() throws Exception {
        BeanDescription desc = mock(BeanDescription.class);
        ObjectIdInfo oid = new ObjectIdInfo(PropertyName.construct("id"), null, null, ObjectIdGenerators.PropertyGenerator.class);
        when(desc.getObjectIdInfo()).thenReturn(oid);
        when(desc.getBeanClass()).thenReturn(Object.class);
        BeanPropertyWriter prop = mock(BeanPropertyWriter.class);
        when(prop.getName()).thenReturn("notId");
        List<BeanPropertyWriter> props = new ArrayList<>();
        props.add(prop);
        try {
            factory.constructObjectIdHandler(null, desc, props);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructObjectIdHandlerValid() throws Exception {
        BeanDescription desc = mock(BeanDescription.class);
        ObjectIdInfo oid = new ObjectIdInfo(PropertyName.construct("id"), null, null, ObjectIdGenerators.PropertyGenerator.class);
        when(desc.getObjectIdInfo()).thenReturn(oid);
        when(desc.getBeanClass()).thenReturn(Object.class);
        BeanPropertyWriter prop = mock(BeanPropertyWriter.class);
        when(prop.getName()).thenReturn("id");
        when(prop.getType()).thenReturn(TypeFactory.defaultInstance().constructType(String.class));
        List<BeanPropertyWriter> props = new ArrayList<>();
        props.add(prop);
        ObjectIdWriter writer = factory.constructObjectIdHandler(null, desc, props);
        assertNotNull(writer);
        assertNotNull(writer.generator);
    }

    @Test
    public void testConstructFilteredBeanWriter() throws Exception {
        BeanPropertyWriter writer = mock(BeanPropertyWriter.class);
        Class<?>[] views = new Class<?>[]{Object.class};
        BeanPropertyWriter result = factory.constructFilteredBeanWriter(writer, views);
        assertNotNull(result);
    }

    private static class TestSerializationConfig extends SerializationConfig {
        public TestSerializationConfig() {
            super(Base64Variants.getDefaultVariant(), null, null, null);
        }
    }

    private static class TestSerializerProvider extends SerializerProvider {
        protected TestSerializerProvider() {
            super(null, null, null);
        }
    }

    private static class TestBeanPropertyWriter extends BeanPropertyWriter {
        public TestBeanPropertyWriter() {
            super(null);
        }
    }

    private static class TestBeanSerializerBuilder extends BeanSerializerBuilder {
        public TestBeanSerializerBuilder(BeanDescription desc) {
            super(desc);
        }
    }

    private static class TestTypeSerializer extends TypeSerializer {
        @Override
        public JsonSerializer<?> getTypeSerializer() { return null; }
        @Override
        public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws java.io.IOException {}
        @Override
        public void writeTypePrefixForObject(Object value, JsonGenerator g) throws java.io.IOException {}
        @Override
        public void writeTypePrefixForArray(Object value, JsonGenerator g) throws java.io.IOException {}
        @Override
        public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws java.io.IOException {}
        @Override
        public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws java.io.IOException {}
        @Override
        public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws java.io.IOException {}
        @Override
        public void writeTypeSuffix(JsonGenerator g, String type) throws java.io.IOException {}
        @Override
        public String getTypeName() { return null; }
        @Override
        public TypeSerializer forProperty(BeanProperty prop) { return this; }
    }

    @Test
    public void testFindBeanPropertiesEmptyList() throws Exception {
        BeanDescription desc = mock(BeanDescription.class);
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        when(desc.findProperties()).thenReturn(Collections.emptyList());
        when(desc.getObjectIdInfo()).thenReturn(null);
        when(desc.getBeanClass()).thenReturn(Object.class);
        SerializationConfig config = new TestSerializationConfig();
        when(desc.getClassInfo()).thenReturn(null);
        List<BeanPropertyWriter> result = factory.findBeanProperties(null, desc, new BeanSerializerBuilder(desc));
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testFindBeanPropertiesWithIgnored() throws Exception {
        BeanDescription desc = mock(BeanDescription.class);
        BeanPropertyDefinition propDef = mock(BeanPropertyDefinition.class);
        when(propDef.getName()).thenReturn("ignored");
        when(propDef.getAccessor()).thenReturn(null);
        when(desc.findProperties()).thenReturn(Collections.singletonList(propDef));
        when(desc.getObjectIdInfo()).thenReturn(null);
        when(desc.getBeanClass()).thenReturn(Object.class);
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        when(ai.findPropertiesToIgnore(any())).thenReturn(new String[]{"ignored"});
        try {
            factory.findBeanProperties(null, desc, new BeanSerializerBuilder(desc));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }
}