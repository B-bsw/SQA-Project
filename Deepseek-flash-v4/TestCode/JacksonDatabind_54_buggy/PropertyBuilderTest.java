package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyBuilderTest {

    private ObjectMapper mapper;
    private ObjectMapper noEmptyArraysMapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        noEmptyArraysMapper = new ObjectMapper();
        noEmptyArraysMapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
    }

    private SerializationConfig serializationConfig(ObjectMapper m) {
        return m.getSerializationConfig();
    }

    private BeanDescription introspect(ObjectMapper m, Class<?> cls) {
        return serializationConfig(m).introspect(serializationConfig(m).constructType(cls));
    }

    private JavaType type(ObjectMapper m, Class<?> cls) {
        return serializationConfig(m).constructType(cls);
    }

    private TestablePropertyBuilder testableBuilder(ObjectMapper m, Class<?> cls) {
        return new TestablePropertyBuilder(serializationConfig(m), introspect(m, cls));
    }

    private BeanPropertyDefinition findProperty(ObjectMapper m, Class<?> cls, String name) {
        BeanDescription desc = introspect(m, cls);
        for (BeanPropertyDefinition p : desc.findProperties()) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        throw new IllegalArgumentException("Cannot find property " + name + " in " + cls.getName());
    }

    private AnnotatedMember findMember(ObjectMapper m, Class<?> cls, String name) {
        BeanPropertyDefinition p = findProperty(m, cls, name);
        AnnotatedMember member = p.getPrimaryMember();
        if (member == null) {
            member = p.getField();
        }
        if (member == null) {
            member = p.getGetter();
        }
        if (member == null) {
            throw new IllegalArgumentException("No member for property " + name);
        }
        return member;
    }

    private BeanPropertyWriter writeProperty(ObjectMapper m, Class<?> cls, String property, JavaType propertyType) throws Exception {
        TestablePropertyBuilder builder = testableBuilder(m, cls);
        BeanPropertyDefinition def = findProperty(m, cls, property);
        AnnotatedMember member = findMember(m, cls, property);
        return builder.buildWriter(null, def, propertyType, NOOP_SERIALIZER, null, null, member, false);
    }

    @Test
    public void testGetClassAnnotationsReturnsNonNull() {
        PropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultBeanUsesDefaultConstructor() {
        Object defaultBean = testableBuilder(mapper, DefaultBean.class).getDefaultBean();
        assertNotNull(defaultBean);
        assertTrue(defaultBean instanceof DefaultBean);
    }

    @Test
    public void testGetDefaultBeanReturnsNullWithoutDefaultConstructor() {
        assertNull(testableBuilder(mapper, NoDefaultCtor.class).getDefaultBean());
    }

    @Test
    public void testGetDefaultValue() {
        TestablePropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        assertEquals(Integer.valueOf(0), builder.getDefaultValue(type(mapper, int.class)));
        assertEquals(Integer.valueOf(0), builder.getDefaultValue(type(mapper, Integer.class)));
        assertEquals("", builder.getDefaultValue(type(mapper, String.class)));
        assertSame(JsonInclude.Include.NON_EMPTY, builder.getDefaultValue(type(mapper, List.class)));
        assertNull(builder.getDefaultValue(type(mapper, Object.class)));
    }

    @Test
    public void testGetPropertyDefaultValueUsesDefaultBean() throws Exception {
        TestablePropertyBuilder builder = testableBuilder(mapper, DefaultBean.class);
        AnnotatedMember member = findMember(mapper, DefaultBean.class, "number");
        Object value = builder.getPropertyDefaultValue("number", member, type(mapper, int.class));
        assertEquals(42, ((Number) value).intValue());
    }

    @Test
    public void testGetPropertyDefaultValueFallsBackToTypeDefault() throws Exception {
        TestablePropertyBuilder builder = testableBuilder(mapper, NoDefaultCtor.class);
        AnnotatedMember member = findMember(mapper, NoDefaultCtor.class, "val");
        Object value = builder.getPropertyDefaultValue("val", member, type(mapper, int.class));
        assertEquals(0, ((Number) value).intValue());
    }

    @Test
    public void testFindSerializationTypeReturnsNullWithoutStaticTyping() throws Exception {
        TestablePropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        AnnotatedMember member = findMember(mapper, PlainBean.class, "name");
        assertNull(builder.findSerializationType(member, false, type(mapper, String.class)));
    }

    @Test
    public void testFindSerializationTypeUsesStaticTyping() throws Exception {
        TestablePropertyBuilder builder = testableBuilder(mapper, StaticTypingBean.class);
        AnnotatedMember member = findMember(mapper, StaticTypingBean.class, "value");
        JavaType result = builder.findSerializationType(member, false, type(mapper, Object.class));
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationTypeRejectsUnrelatedType() throws Exception {
        TestablePropertyBuilder builder = testableBuilder(mapper, BadTypeBean.class);
        AnnotatedMember member = findMember(mapper, BadTypeBean.class, "value");
        builder.findSerializationType(member, false, type(mapper, Integer.class));
    }

    @Test
    public void testThrowWrappedUnwrapsRuntimeException() {
        TestablePropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        try {
            builder.throwWrapped(new Exception(new IllegalStateException("runtime")), "x", new Object());
            fail("Should have thrown RuntimeException");
        } catch (IllegalStateException ex) {
            assertEquals("runtime", ex.getMessage());
        }
    }

    @Test
    public void testThrowWrappedUnwrapsError() {
        TestablePropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        try {
            builder.throwWrapped(new Exception(new AssertionError("error")), "x", new Object());
            fail("Should have thrown Error");
        } catch (AssertionError ex) {
            assertEquals("error", ex.getMessage());
        }
    }

    @Test
    public void testThrowWrappedWrapsCheckedException() {
        TestablePropertyBuilder builder = testableBuilder(mapper, PlainBean.class);
        try {
            builder.throwWrapped(new Exception("checked"), "prop", new DefaultBean());
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("prop"));
            assertTrue(ex.getMessage().contains(DefaultBean.class.getName()));
        }
    }

    @Test
    public void testBuildWriterDefaultInclusion() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, PlainBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertFalse(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonNull() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, NonNullBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonEmpty() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, NonEmptyBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonAbsent() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, NonAbsentBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonDefault() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, NonDefaultBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertFalse(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonDefaultNullValueSuppressesNull() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, NonDefaultNullBean.class, "name", type(mapper, String.class));
        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterContainerWithEmptyArrayFeatureEnabled() throws Exception {
        BeanPropertyWriter writer = writeProperty(mapper, ContainerBean.class, "items", type(mapper, List.class));
        assertNotNull(writer);
        assertFalse(writer.willSuppressNulls());
    }

    @Test
    public void testBuildWriterContainerWithEmptyArrayFeatureDisabled() throws Exception {
        BeanPropertyWriter writer = writeProperty(noEmptyArraysMapper, ContainerBean.class, "items", type(noEmptyArraysMapper, List.class));
        assertNotNull(writer);
        assertFalse(writer.willSuppressNulls());
    }

    public static class PlainBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class NonNullBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class NonEmptyBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public static class NonAbsentBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NonDefaultBean {
        public String name = "default";
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NonDefaultNullBean {
        public String name;
    }

    public static class ContainerBean {
        public List<String> items;
    }

    public static class DefaultBean {
        public int number = 42;
        public String text = "text";
    }

    public static class NoDefaultCtor {
        private final int val;
        public NoDefaultCtor(int val) {
            this.val = val;
        }
        public int getVal() {
            return val;
        }
    }

    public static class StaticTypingBean {
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Object value;
    }

    public static class BadTypeBean {
        @JsonSerialize(as = String.class)
        public Integer value;
    }

    private static final JsonSerializer<Object> NOOP_SERIALIZER = new JsonSerializer<Object>() {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            // no-op
        }
    };

    private static class TestablePropertyBuilder extends PropertyBuilder {
        TestablePropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
        }

        @Override
        public Object getDefaultBean() {
            return super.getDefaultBean();
        }

        @Override
        public Object getDefaultValue(JavaType type) {
            return super.getDefaultValue(type);
        }

        @Override
        public Object getPropertyDefaultValue(String name, AnnotatedMember member, JavaType type) {
            return super.getPropertyDefaultValue(name, member, type);
        }

        @Override
        public JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType)
                throws JsonMappingException {
            return super.findSerializationType(a, useStaticTyping, declaredType);
        }

        @Override
        public BeanPropertyWriter buildWriter(SerializerProvider prov,
                BeanPropertyDefinition propDef, JavaType declaredType, JsonSerializer<?> ser,
                TypeSerializer typeSer, TypeSerializer contentTypeSer,
                AnnotatedMember am, boolean defaultUseStaticTyping)
                throws JsonMappingException {
            return super.buildWriter(prov, propDef, declaredType, ser, typeSer,
                    contentTypeSer, am, defaultUseStaticTyping);
        }

        Object throwWrapped(Exception e, String propName, Object defaultBean) {
            return _throwWrapped(e, propName, defaultBean);
        }
    }
}