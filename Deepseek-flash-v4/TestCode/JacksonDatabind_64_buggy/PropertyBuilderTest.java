package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class PropertyBuilderTest {

    static class Fixture {
        final ObjectMapper mapper = new ObjectMapper();
        final SerializationConfig config;
        final BeanDescription desc;
        final PropertyBuilder builder;

        Fixture(Class<?> cls) {
            config = mapper.getSerializationConfig();
            desc = config.introspect(mapper.constructType(cls));
            builder = new PropertyBuilder(config, desc);
        }

        BeanPropertyDefinition prop(String name) {
            for (BeanPropertyDefinition p : desc.findProperties()) {
                if (name.equals(p.getName())) {
                    return p;
                }
            }
            throw new IllegalStateException("No property '" + name + "'");
        }
    }

    static class SimpleBean {
        public String name;
        public int count;
        public SimpleBean() { }
    }

    static class NoDefaultBean {
        public NoDefaultBean(String value) { }
    }

    static class NonNullBean {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String name;
    }

    static class StaticTypedBean {
        @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
        public Object value;
    }

    static class IllegalTypedBean {
        @JsonSerialize(as = String.class)
        public Integer value;
    }

    static class BadGetterBean {
        private int x;
        public int getX() {
            throw new IllegalStateException("bad");
        }
    }

    @Test
    public void testGetClassAnnotations() {
        Fixture f = new Fixture(SimpleBean.class);
        assertNotNull(f.builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultValue() {
        Fixture f = new Fixture(SimpleBean.class);
        assertEquals(Integer.valueOf(0),
                f.builder.getDefaultValue(f.config.getTypeFactory().constructType(int.class)));
        assertEquals(Integer.valueOf(0),
                f.builder.getDefaultValue(f.config.getTypeFactory().constructType(Integer.class)));
        assertEquals("",
                f.builder.getDefaultValue(f.config.getTypeFactory().constructType(String.class)));
        assertEquals(JsonInclude.Include.NON_EMPTY,
                f.builder.getDefaultValue(f.config.getTypeFactory().constructCollectionType(List.class, String.class)));
        assertNull(f.builder.getDefaultValue(f.config.getTypeFactory().constructType(Object.class)));
    }

    @Test
    public void testGetDefaultBeanWithDefaultConstructor() {
        Fixture f = new Fixture(SimpleBean.class);
        Object def = f.builder.getDefaultBean();
        assertNotNull(def);
        assertTrue(def instanceof SimpleBean);
    }

    @Test
    public void testGetDefaultBeanWithoutDefaultConstructor() {
        Fixture f = new Fixture(NoDefaultBean.class);
        assertNull(f.builder.getDefaultBean());
    }

    @Test
    public void testGetPropertyDefaultValueUsesDefaultBean() {
        Fixture f = new Fixture(SimpleBean.class);
        BeanPropertyDefinition count = f.prop("count");
        Object defaultValue = f.builder.getPropertyDefaultValue("count",
                count.getPrimaryMember(), count.getPrimaryType());
        assertEquals(Integer.valueOf(0), defaultValue);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetPropertyDefaultValuePropagatesRuntimeException() {
        Fixture f = new Fixture(BadGetterBean.class);
        BeanPropertyDefinition x = f.prop("x");
        f.builder.getPropertyDefaultValue("x", x.getGetter(), x.getPrimaryType());
    }

    @Test
    public void testFindSerializationTypeWithoutAnnotation() throws Exception {
        Fixture f = new Fixture(SimpleBean.class);
        BeanPropertyDefinition count = f.prop("count");
        assertNull(f.builder.findSerializationType(count.getPrimaryMember(), false, count.getPrimaryType()));
    }

    @Test
    public void testFindSerializationTypeWithStaticTyping() throws Exception {
        Fixture f = new Fixture(StaticTypedBean.class);
        BeanPropertyDefinition value = f.prop("value");
        JavaType result = f.builder.findSerializationType(value.getPrimaryMember(), false, value.getPrimaryType());
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationTypeWithIllegalAsAnnotation() throws Exception {
        Fixture f = new Fixture(IllegalTypedBean.class);
        BeanPropertyDefinition value = f.prop("value");
        f.builder.findSerializationType(value.getPrimaryMember(), false, value.getPrimaryType());
    }

    @Test
    public void testBuildWriterForNonNullProperty() throws Exception {
        Fixture f = new Fixture(NonNullBean.class);
        BeanPropertyDefinition name = f.prop("name");
        JavaType declaredType = name.getPrimaryType();
        SerializerProvider provider = f.mapper.getSerializerProvider();
        JsonSerializer<Object> ser = provider.findValueSerializer(declaredType);
        BeanPropertyWriter writer = f.builder.buildWriter(provider, name, declaredType, ser,
                null, null, name.getPrimaryMember(), false);
        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }
}