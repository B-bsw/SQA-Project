package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFloatFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.core.JsonParser;

import static org.junit.Assert.*;

public class NumberSerializerTest {

    private JsonGenerator g;
    private SerializerProvider provider;
    private JsonFormatVisitorWrapper visitor;
    private JavaType typeHint;

    @Before
    public void setUp() throws IOException {
        g = new MockJsonGenerator();
        provider = new MockSerializerProvider();
        typeHint = new MockJavaType();
        visitor = new MockJsonFormatVisitorWrapper();
    }

    @After
    public void tearDown() {
        g = null;
        provider = null;
        typeHint = null;
        visitor = null;
    }

    private static class MockJsonGenerator extends JsonGenerator {
        private Object written;
        private String stringWritten;

        @Override
        public void writeNumber(BigDecimal value) { written = value; }
        @Override
        public void writeNumber(BigInteger value) { written = value; }
        @Override
        public void writeNumber(int value) { written = value; }
        @Override
        public void writeNumber(long value) { written = value; }
        @Override
        public void writeNumber(double value) { written = value; }
        @Override
        public void writeNumber(float value) { written = value; }
        @Override
        public void writeNumber(String value) { stringWritten = value; }
        @Override
        public void writeString(String value) { stringWritten = value; }

        public Object getWritten() { 
            if (written != null) return written;
            if (stringWritten != null) return stringWritten;
            return null;
        }
    }

    private static class MockSerializerProvider extends SerializerProvider {
        public MockSerializerProvider() {
            super(new com.fasterxml.jackson.databind.BeanProperty.Std("test"));
        }
    }

    private static class MockJavaType extends JavaType {
        public MockJavaType() {
            super(Object.class, 0, null, null, true);
        }
    }

    private static class MockJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        private String format;
        private JsonParser.NumberType numberType;

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            format = "integer";
            return new JsonIntegerFormatVisitor() {
                @Override
                public void numberType(JsonParser.NumberType nt) { numberType = nt; }
                @Override
                public void format(Object value) {}
            };
        }

        @Override
        public JsonFloatFormatVisitor expectFloatFormat(JavaType type) {
            format = "float";
            return new JsonFloatFormatVisitor() {
                @Override
                public void numberType(JsonParser.NumberType nt) { numberType = nt; }
                @Override
                public void format(Object value) {}
            };
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            format = "number";
            return new JsonNumberFormatVisitor() {
                @Override
                public void numberType(JsonParser.NumberType nt) { numberType = nt; }
                @Override
                public void format(Object value) {}
            };
        }

        @Override
        public void expectObjectFormat(JavaType type) {}
        @Override
        public void expectArrayFormat(JavaType type) {}
        @Override
        public void expectStringFormat(JavaType type) {}
        @Override
        public void expectNullFormat(JavaType type) {}
        @Override
        public void expectBooleanFormat(JavaType type) {}

        public String getFormat() { return format; }
        public JsonParser.NumberType getNumberType() { return numberType; }
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        BigDecimal value = new BigDecimal("123.456");
        serializer.serialize(value, g, provider);
        assertEquals(value, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        BigInteger value = new BigInteger("123456789");
        serializer.serialize(value, g, provider);
        assertEquals(value, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Integer value = 42;
        serializer.serialize(value, g, provider);
        assertEquals(42, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Long value = 123456789L;
        serializer.serialize(value, g, provider);
        assertEquals(123456789L, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Double value = 3.14;
        serializer.serialize(value, g, provider);
        assertEquals(3.14, (Double) ((MockJsonGenerator) g).getWritten(), 0.0001);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Float value = 2.5f;
        serializer.serialize(value, g, provider);
        assertEquals(2.5f, (Float) ((MockJsonGenerator) g).getWritten(), 0.001f);
    }

    @Test
    public void testSerializeByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Byte value = 10;
        serializer.serialize(value, g, provider);
        assertEquals(10, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Short value = 20;
        serializer.serialize(value, g, provider);
        assertEquals(20, ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        class CustomNumber extends Number {
            @Override
            public int intValue() { return 99; }
            @Override
            public long longValue() { return 99L; }
            @Override
            public float floatValue() { return 99.0f; }
            @Override
            public double doubleValue() { return 99.0; }
            @Override
            public String toString() { return "custom"; }
        }
        CustomNumber custom = new CustomNumber();
        serializer.serialize(custom, g, provider);
        assertEquals("custom", ((MockJsonGenerator) g).getWritten());
    }

    @Test
    public void testSerializeNull() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        try {
            serializer.serialize(null, g, provider);
        } catch (NullPointerException e) {
            assertNotNull(e);
            assertEquals(NullPointerException.class, e.getClass());
        }
    }

    @Test
    public void testGetSchemaWithBigInteger() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
        assertTrue(schema.get("optional").asBoolean());
    }

    @Test
    public void testGetSchemaWithBigDecimal() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("optional").asBoolean());
    }

    @Test
    public void testGetSchemaWithOtherNumber() {
        NumberSerializer serializer = new NumberSerializer(Double.class);
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("optional").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitorWithBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertEquals("integer", ((MockJsonFormatVisitorWrapper) visitor).getFormat());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, ((MockJsonFormatVisitorWrapper) visitor).getNumberType());
    }

    @Test
    public void testAcceptJsonFormatVisitorWithBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertEquals("float", ((MockJsonFormatVisitorWrapper) visitor).getFormat());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, ((MockJsonFormatVisitorWrapper) visitor).getNumberType());
    }

    @Test
    public void testAcceptJsonFormatVisitorWithOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Double.class);
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertEquals("number", ((MockJsonFormatVisitorWrapper) visitor).getFormat());
    }

    @Test
    public void testStaticInstance() {
        assertNotNull(NumberSerializer.instance);
        assertTrue(NumberSerializer.instance.handledType() == Number.class);
        assertFalse(NumberSerializer.instance._isInt);
    }

    @Test
    public void testConstructorWithBigInteger() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertTrue(serializer._isInt);
        assertTrue(serializer.handledType() == BigInteger.class);
    }

    @Test
    public void testConstructorWithBigDecimal() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        assertFalse(serializer._isInt);
        assertTrue(serializer.handledType() == BigDecimal.class);
    }

    @Test
    public void testConstructorWithInteger() {
        NumberSerializer serializer = new NumberSerializer(Integer.class);
        assertFalse(serializer._isInt);
        assertTrue(serializer.handledType() == Integer.class);
    }
}