package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializerBaseTest {
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    static class EmptyBean { }
    static class TypeIdStringBean {
        public String getTypeIdValue() { return "abc"; }
    }
    static class TypeIdNullBean {
        public String getTypeIdValue() { return null; }
    }
    static class TypeIdNumberBean {
        public Object getTypeIdValue() { return Integer.valueOf(42); }
    }

    static class TestBeanSerializer extends BeanSerializerBase {
        TestBeanSerializer(JavaType type, BeanSerializerBuilder builder,
                BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(type, builder, properties, filteredProperties);
        }
        TestBeanSerializer(BeanSerializerBase src, BeanPropertyWriter[] properties,
                BeanPropertyWriter[] filteredProperties) {
            super(src, properties, filteredProperties);
        }
        TestBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter) {
            super(src, objectIdWriter);
        }
        TestBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter, Object filterId) {
            super(src, objectIdWriter, filterId);
        }
        TestBeanSerializer(BeanSerializerBase src, String[] toIgnore) {
            super(src, toIgnore);
        }
        TestBeanSerializer(BeanSerializerBase src) {
            super(src);
        }
        TestBeanSerializer(BeanSerializerBase src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new TestBeanSerializer(this, objectIdWriter);
        }

        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new TestBeanSerializer(this, toIgnore);
        }

        @Override
        protected BeanSerializerBase asArraySerializer() {
            return this;
        }

        @Override
        public BeanSerializerBase withFilterId(Object filterId) {
            return this;
        }

        @Override
        public void serialize(Object bean, JsonGenerator gen, SerializerProvider provider)
                throws IOException {
            gen.writeStartObject();
            gen.writeEndObject();
        }
    }

    private JavaType javaType(Class<?> cls) {
        return mapper.constructType(cls);
    }

    private BeanSerializerBuilder builder(Class<?> cls) {
        BeanDescription desc = mapper.getSerializationConfig().introspect(javaType(cls));
        return new BeanSerializerBuilder(desc);
    }

    private TestBeanSerializer serializer(Class<?> cls, BeanPropertyWriter[] properties,
            BeanPropertyWriter[] filteredProperties) {
        return new TestBeanSerializer(javaType(cls), builder(cls), properties, filteredProperties);
    }

    private SerializerProvider provider() {
        return mapper.getSerializerProvider();
    }

    private JsonGenerator generator() throws IOException {
        return new JsonFactory().createGenerator(new StringWriter());
    }

    private ObjectIdWriter simpleObjectIdWriter() {
        return ObjectIdWriter.construct(javaType(String.class), null,
                new ObjectIdGenerators.IntSequenceGenerator(), false);
    }

    private AnnotatedMember typeIdMember(Class<?> cls) {
        BeanDescription desc = mapper.getSerializationConfig().introspect(javaType(cls));
        List<BeanPropertyDefinition> props = desc.findProperties();
        return props.get(0).getAccessor();
    }

    private TestBeanSerializer serializerWithTypeId(Class<?> cls) {
        BeanSerializerBuilder b = builder(cls);
        b.setTypeId(typeIdMember(cls));
        return new TestBeanSerializer(javaType(cls), b, new BeanPropertyWriter[0], null);
    }

    @Test
    public void testPropertiesReturnsAllProperties() {
        BeanPropertyWriter[] props = new BeanPropertyWriter[2];
        TestBeanSerializer ser = serializer(EmptyBean.class, props, null);
        Iterator<PropertyWriter> it = ser.properties();
        assertTrue(it.hasNext());
        assertNull(it.next());
        assertTrue(it.hasNext());
        assertNull(it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testUsesObjectIdWithoutAndWithObjectIdWriter() {
        TestBeanSerializer noOid = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        assertFalse(noOid.usesObjectId());
        TestBeanSerializer withOid = new TestBeanSerializer(noOid, simpleObjectIdWriter());
        assertTrue(withOid.usesObjectId());
    }

    @Test
    public void testNullBuilderConstructor() {
        TestBeanSerializer ser = new TestBeanSerializer(javaType(EmptyBean.class), null,
                new BeanPropertyWriter[0], null);
        assertNotNull(ser);
        assertFalse(ser.usesObjectId());
    }

    @Test
    public void testCopyConstructors() {
        TestBeanSerializer base = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        TestBeanSerializer copy = new TestBeanSerializer(base);
        assertNotNull(copy);
        TestBeanSerializer copy2 = new TestBeanSerializer(base, new BeanPropertyWriter[0],
                new BeanPropertyWriter[0]);
        assertNotNull(copy2);
        TestBeanSerializer copy3 = new TestBeanSerializer(base, simpleObjectIdWriter(), "filter");
        assertTrue(copy3.usesObjectId());
    }

    @Test
    public void testToIgnoreConstructorWithEmptyProps() {
        TestBeanSerializer base = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        TestBeanSerializer filtered = new TestBeanSerializer(base, new String[]{"x"});
        assertNotNull(filtered);
        assertFalse(filtered.properties().hasNext());
    }

    @Test
    public void testNameTransformerConstructorBranches() {
        TestBeanSerializer base = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        TestBeanSerializer nop = new TestBeanSerializer(base, NameTransformer.NOP);
        assertNotNull(nop);
        BeanPropertyWriter[] nullProps = new BeanPropertyWriter[1];
        TestBeanSerializer baseWithNull = serializer(EmptyBean.class, nullProps, null);
        NameTransformer transformer = new NameTransformer() {
            @Override
            public String transform(String name) { return name + "_"; }
            @Override
            public String reverse(String name) { return name; }
        };
        TestBeanSerializer renamed = new TestBeanSerializer(baseWithNull, transformer);
        assertNotNull(renamed);
    }

    @Test
    public void testResolveWithEmptyProperties() throws Exception {
        TestBeanSerializer ser = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        ser.resolve(provider());
        assertNotNull(ser);
    }

    @Test
    public void testSerializeFieldsWithNullElementIsSkipped() throws Exception {
        BeanPropertyWriter[] props = new BeanPropertyWriter[1];
        TestBeanSerializer ser = serializer(EmptyBean.class, props, null);
        JsonGenerator gen = generator();
        try {
            ser.serializeFields("bean", gen, provider());
        } finally {
            gen.close();
        }
    }

    @Test
    public void testSerializeFieldsFilteredWithoutFilterProvider() throws Exception {
        TestBeanSerializer base = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        TestBeanSerializer ser = new TestBeanSerializer(base, null, "filter");
        JsonGenerator gen = generator();
        try {
            ser.serializeFieldsFiltered("bean", gen, provider());
        } finally {
            gen.close();
        }
    }

    @Test
    public void testGetSchemaForEmptyProperties() throws Exception {
        TestBeanSerializer ser = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        JsonNode schema = ser.getSchema(provider(), null);
        assertNotNull(schema);
        assertEquals("object", schema.path("type").asText());
        assertTrue(schema.path("properties").isObject());
    }

    @Test
    public void testAcceptJsonFormatVisitorWithNullVisitor() throws Exception {
        TestBeanSerializer ser = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        ser.acceptJsonFormatVisitor(null, javaType(EmptyBean.class));
    }

    @Test
    public void testCreateContextualWithoutObjectIdReturnsSame() throws Exception {
        TestBeanSerializer ser = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        JsonSerializer<?> contextual = ser.createContextual(provider(), null);
        assertSame(ser, contextual);
    }

    @Test
    public void testCreateContextualWithObjectIdAndNullProperty() throws Exception {
        TestBeanSerializer base = serializer(EmptyBean.class, new BeanPropertyWriter[0], null);
        TestBeanSerializer ser = new TestBeanSerializer(base, simpleObjectIdWriter());
        JsonSerializer<?> contextual = ser.createContextual(provider(), null);
        assertNotNull(contextual);
    }

    @Test
    public void testCustomTypeIdReturnsEmptyStringWhenValueNull() {
        TestBeanSerializer ser = serializerWithTypeId(TypeIdNullBean.class);
        assertEquals("", ser._customTypeId(new TypeIdNullBean()));
    }

    @Test
    public void testCustomTypeIdReturnsStringValue() {
        TestBeanSerializer ser = serializerWithTypeId(TypeIdStringBean.class);
        assertEquals("abc", ser._customTypeId(new TypeIdStringBean()));
    }

    @Test
    public void testCustomTypeIdUsesToStringForNonString() {
        TestBeanSerializer ser = serializerWithTypeId(TypeIdNumberBean.class);
        assertEquals("42", ser._customTypeId(new TypeIdNumberBean()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomTypeIdWithWrongBeanTypeThrows() {
        TestBeanSerializer ser = serializerWithTypeId(TypeIdStringBean.class);
        ser._customTypeId(new TypeIdNullBean());
    }
}