package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.StringWriter;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;

public class EnumSerializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private EnumSerializer createSerializer(Boolean serializeAsIndex) {
        SerializationConfig config = mapper.getSerializationConfig();
        EnumValues values = EnumValues.constructFromName(config, TestEnum.class);
        return new EnumSerializer(values, serializeAsIndex);
    }

    @Test
    public void testConstructWithNoFormat() {
        JavaType type = mapper.constructType(TestEnum.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        EnumSerializer ser = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), beanDesc, null);
        assertNotNull(ser);
        assertNotNull(ser.getEnumValues());
    }

    @Test
    public void testConstructWithNumericFormat() {
        JavaType type = mapper.constructType(TestEnum.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        JsonFormat.Value format = JsonFormat.Value.forShape(Shape.NUMBER);
        EnumSerializer ser = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), beanDesc, format);
        assertNotNull(ser);
        assertTrue(ser._serializeAsIndex(mapper.getSerializerProvider()));
    }

    @Test
    public void testGetEnumValues() {
        EnumSerializer ser = createSerializer(null);
        assertNotNull(ser.getEnumValues());
    }

    @Test
    public void testCreateContextualReturnsSameWhenPropertyNull() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.TRUE);
        assertSame(ser, ser.createContextual(mapper.getSerializerProvider(), null));
    }

    @Test
    public void testSerializeUsesIndexWhenFlagTrue() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.TRUE);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        ser.serialize(TestEnum.B, gen, mapper.getSerializerProvider());
        gen.close();
        assertEquals("1", writer.toString());
    }

    @Test
    public void testSerializeUsesToStringWhenFeatureEnabled() throws Exception {
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        EnumSerializer ser = createSerializer(null);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        ser.serialize(TestEnum.A, gen, mapper.getSerializerProvider());
        gen.close();
        assertEquals("\"custom-A\"", writer.toString());
    }

    @Test
    public void testSerializeUsesNameByDefault() throws Exception {
        EnumSerializer ser = createSerializer(null);
        StringWriter writer = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(writer);
        ser.serialize(TestEnum.C, gen, mapper.getSerializerProvider());
        gen.close();
        assertEquals("\"C\"", writer.toString());
    }

    @Test
    public void testGetSchemaStringWithEnums() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.FALSE);
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), TestEnum.class);
        assertTrue(schema.isObject());
        assertEquals("string", schema.get("type").asText());
        assertTrue(schema.has("enum"));
        ArrayNode enums = (ArrayNode) schema.get("enum");
        assertEquals(3, enums.size());
        assertEquals("A", enums.get(0).asText());
    }

    @Test
    public void testGetSchemaStringNoTypeHint() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.FALSE);
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), null);
        assertEquals("string", schema.get("type").asText());
        assertFalse(schema.has("enum"));
    }

    @Test
    public void testGetSchemaIntegerWhenFlagTrue() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.TRUE);
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), TestEnum.class);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testSerializeAsIndexUsesFeatureWhenNotSet() throws Exception {
        EnumSerializer ser = createSerializer(null);
        assertFalse(ser._serializeAsIndex(mapper.getSerializerProvider()));
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        assertTrue(ser._serializeAsIndex(mapper.getSerializerProvider()));
    }

    @Test
    public void testShapeResolution() {
        assertNull(EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, null, true));
        assertNull(EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.ANY), true));
        assertNull(EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.SCALAR), true));
        assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.STRING), true));
        assertEquals(Boolean.FALSE, EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.NATURAL), true));
        assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.NUMBER), true));
        assertEquals(Boolean.TRUE, EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.ARRAY), true));
        try {
            EnumSerializer._isShapeWrittenUsingIndex(TestEnum.class, JsonFormat.Value.forShape(Shape.OBJECT), true);
            fail("Should throw IllegalArgumentException for OBJECT shape");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testAcceptJsonFormatVisitorString() throws Exception {
        EnumSerializer ser = createSerializer(null);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(mapper.getSerializerProvider());
        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(TestEnum.class));
        assertNotNull(visitor.stringVisitor);
        assertNotNull(visitor.enumValues);
        assertEquals(3, visitor.enumValues.size());
    }

    @Test
    public void testAcceptJsonFormatVisitorStringToStringEnabled() throws Exception {
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        EnumSerializer ser = createSerializer(null);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(mapper.getSerializerProvider());
        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(TestEnum.class));
        assertNotNull(visitor.stringVisitor);
        assertTrue(visitor.enumValues.contains("custom-A"));
    }

    @Test
    public void testAcceptJsonFormatVisitorIndex() throws Exception {
        EnumSerializer ser = createSerializer(Boolean.TRUE);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(mapper.getSerializerProvider());
        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(TestEnum.class));
        assertTrue(visitor.integerVisited);
        assertNull(visitor.stringVisitor);
    }

    enum TestEnum {
        A, B, C;

        @Override
        public String toString() {
            return "custom-" + name();
        }
    }

    private static class TestJsonFormatVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        private final SerializerProvider provider;
        private JsonStringFormatVisitor stringVisitor;
        private Set<String> enumValues;
        private boolean integerVisited;

        TestJsonFormatVisitorWrapper(SerializerProvider p) {
            provider = p;
        }

        @Override
        public SerializerProvider getProvider() {
            return provider;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            stringVisitor = new JsonStringFormatVisitor() {
                @Override
                public void enumTypes(Set<String> enums) {
                    enumValues = enums;
                }

                @Override
                public void format(JsonValueFormat format) {
                }
            };
            return stringVisitor;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            integerVisited = true;
            return null;
        }
    }
}