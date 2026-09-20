package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.type.SimpleType;

public class NumberSerializerTest {

    private static class MockJsonGenerator extends JsonGenerator {
        String callType;
        Object callValue;

        @Override
        public void writeNumber(int v) {
            this.callType = "int";
            this.callValue = Integer.valueOf(v);
        }

        @Override
        public void writeNumber(long v) {
            this.callType = "long";
            this.callValue = Long.valueOf(v);
        }

        @Override
        public void writeNumber(BigInteger v) {
            this.callType = "BigInteger";
            this.callValue = v;
        }

        @Override
        public void writeNumber(double v) {
            this.callType = "double";
            this.callValue = Double.valueOf(v);
        }

        @Override
        public void writeNumber(float v) {
            this.callType = "float";
            this.callValue = Float.valueOf(v);
        }

        @Override
        public void writeNumber(BigDecimal v) {
            this.callType = "BigDecimal";
            this.callValue = v;
        }

        @Override
        public void writeNumber(String v) {
            this.callType = "String";
            this.callValue = v;
        }

        @Override
        public ObjectCodec getCodec() { return null; }
        @Override
        public void setCodec(ObjectCodec oc) {}
        @Override
        public Version version() { return Version.unknownVersion(); }
        @Override
        public JsonGenerator enable(Feature f) { return this; }
        @Override
        public JsonGenerator disable(Feature f) { return this; }
        @Override
        public boolean isEnabled(Feature f) { return false; }
        @Override
        public int getFeatureMask() { return 0; }
        @Override
        public JsonGenerator setFeatureMask(int values) { return this; }
        @Override
        public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override
        public void writeStartArray() {}
        @Override
        public void writeEndArray() {}
        @Override
        public void writeStartObject() {}
        @Override
        public void writeEndObject() {}
        @Override
        public void writeFieldName(String name) {}
        @Override
        public void writeFieldName(SerializableString name) {}
        @Override
        public void writeString(String text) {}
        @Override
        public void writeString(char[] text, int offset, int len) {}
        @Override
        public void writeString(SerializableString text) {}
        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) {}
        @Override
        public void writeUTF8String(byte[] text, int offset, int length) {}
        @Override
        public void writeRaw(String text) {}
        @Override
        public void writeRaw(String text, int offset, int len) {}
        @Override
        public void writeRaw(char[] text, int offset, int len) {}
        @Override
        public void writeRaw(char c) {}
        @Override
        public void writeRawValue(String text) {}
        @Override
        public void writeRawValue(String text, int offset, int len) {}
        @Override
        public void writeRawValue(char[] text, int offset, int len) {}
        @Override
        public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) {}
        @Override
        public int writeBinary(Base64Variant bv, InputStream data, int dataLength) { return 0; }
        @Override
        public void writeBoolean(boolean state) {}
        @Override
        public void writeNull() {}
        @Override
        public void writeObject(Object pojo) {}
        @Override
        public void writeTree(TreeNode rootNode) {}
        @Override
        public JsonStreamContext getOutputContext() { return null; }
        @Override
        public void flush() {}
        @Override
        public boolean isClosed() { return false; }
        @Override
        public void close() {}
    }

    private static class MockVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        String visitedMethod;
        JsonParser.NumberType recordedNumberType;

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            this.visitedMethod = "expectIntegerFormat";
            return new JsonIntegerFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    recordedNumberType = type;
                }
            };
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            this.visitedMethod = "expectNumberFormat";
            return new JsonNumberFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    recordedNumberType = type;
                }
            };
        }
    }

    private static class MockBeanProperty extends BeanProperty.Std {
        private final JsonFormat.Value format;

        public MockBeanProperty(JsonFormat.Value format) {
            super(PropertyName.construct("test"), SimpleType.constructUnsafe(Number.class), null, null, PropertyMetadata.STD_OPTIONAL);
            this.format = format;
        }

        @Override
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> config, Class<?> baseType) {
            return this.format;
        }
    }

    private static class CustomNumber extends Number {
        private final String textValue;

        public CustomNumber(String textValue) {
            this.textValue = textValue;
        }

        @Override
        public int intValue() { return 0; }
        @Override
        public long longValue() { return 0L; }
        @Override
        public float floatValue() { return 0.0f; }
        @Override
        public double doubleValue() { return 0.0d; }
        @Override
        public String toString() { return this.textValue; }
    }

    @Test
    public void instance_shouldBeConfiguredForNumberClass() {
        NumberSerializer serializer = NumberSerializer.instance;
        Assert.assertNotNull(serializer);
        Assert.assertEquals(Number.class, serializer.handledType());
        Assert.assertFalse(serializer._isInt);
    }

    @Test
    public void constructor_givenBigInteger_shouldSetIsIntToTrue() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        Assert.assertEquals(BigInteger.class, serializer.handledType());
        Assert.assertTrue(serializer._isInt);
    }

    @Test
    public void constructor_givenBigDecimal_shouldSetIsIntToFalse() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        Assert.assertEquals(BigDecimal.class, serializer.handledType());
        Assert.assertFalse(serializer._isInt);
    }

    @Test
    public void serialize_givenBigDecimal_shouldCallWriteNumberBigDecimal() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        BigDecimal value = new BigDecimal("12345.6789");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("BigDecimal", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenBigInteger_shouldCallWriteNumberBigInteger() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        BigInteger value = new BigInteger("9876543210123456789");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("BigInteger", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenLong_shouldCallWriteNumberLong() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Long value = Long.valueOf(1234567890123L);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("long", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenDouble_shouldCallWriteNumberDouble() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Double value = Double.valueOf(3.1415926535);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("double", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenFloat_shouldCallWriteNumberFloat() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Float value = Float.valueOf(2.71828f);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("float", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenInteger_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Integer value = Integer.valueOf(42);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.callType);
        Assert.assertEquals(value, gen.callValue);
    }

    @Test
    public void serialize_givenByte_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Byte value = Byte.valueOf((byte) 16);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.callType);
        Assert.assertEquals(Integer.valueOf(16), gen.callValue);
    }

    @Test
    public void serialize_givenShort_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        Short value = Short.valueOf((short) 1024);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.callType);
        Assert.assertEquals(Integer.valueOf(1024), gen.callValue);
    }

    @Test
    public void serialize_givenCustomNumberFallback_shouldCallWriteNumberString() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockJsonGenerator gen = new MockJsonGenerator();
        CustomNumber value = new CustomNumber("1e500");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("String", gen.callType);
        Assert.assertEquals("1e500", gen.callValue);
    }

    @Test
    public void getSchema_givenBigIntegerSerializer_shouldReturnIntegerSchema() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);

        JsonNode schema = serializer.getSchema(null, (Type) null);

        Assert.assertNotNull(schema);
        Assert.assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void getSchema_givenNonIntegerSerializer_shouldReturnNumberSchema() {
        NumberSerializer serializer = NumberSerializer.instance;

        JsonNode schema = serializer.getSchema(null, (Type) null);

        Assert.assertNotNull(schema);
        Assert.assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void acceptJsonFormatVisitor_givenBigInteger_shouldVisitIntFormatWithBigIntegerNumberType() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockVisitorWrapper visitor = new MockVisitorWrapper();
        JavaType typeHint = SimpleType.constructUnsafe(BigInteger.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        Assert.assertEquals("expectIntegerFormat", visitor.visitedMethod);
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, visitor.recordedNumberType);
    }

    @Test
    public void acceptJsonFormatVisitor_givenBigDecimal_shouldVisitFloatFormatWithBigDecimalNumberType() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        MockVisitorWrapper visitor = new MockVisitorWrapper();
        JavaType typeHint = SimpleType.constructUnsafe(BigDecimal.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        Assert.assertEquals("expectNumberFormat", visitor.visitedMethod);
        Assert.assertEquals(JsonParser.NumberType.BIG_DECIMAL, visitor.recordedNumberType);
    }

    @Test
    public void acceptJsonFormatVisitor_givenGeneralNumber_shouldVisitExpectNumberFormatWithoutSpecificNumberType() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        MockVisitorWrapper visitor = new MockVisitorWrapper();
        JavaType typeHint = SimpleType.constructUnsafe(Number.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        Assert.assertEquals("expectNumberFormat", visitor.visitedMethod);
        Assert.assertNull(visitor.recordedNumberType);
    }

    @Test
    public void createContextual_givenNullFormat_shouldReturnThis() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();

        JsonSerializer<?> result = serializer.createContextual(prov, null);

        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenShapeStringFormat_shouldReturnToStringSerializer() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        MockBeanProperty property = new MockBeanProperty(format);

        JsonSerializer<?> result = serializer.createContextual(prov, property);

        Assert.assertSame(ToStringSerializer.instance, result);
    }

    @Test
    public void createContextual_givenNonStringShapeFormat_shouldReturnThis() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER_INT);
        MockBeanProperty property = new MockBeanProperty(format);

        JsonSerializer<?> result = serializer.createContextual(prov, property);

        Assert.assertSame(serializer, result);
    }

    @Test
    public void createContextual_givenEmptyFormatOverride_shouldReturnThis() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProviderInstance();
        JsonFormat.Value format = JsonFormat.Value.empty();
        MockBeanProperty property = new MockBeanProperty(format);

        JsonSerializer<?> result = serializer.createContextual(prov, property);

        Assert.assertSame(serializer, result);
    }
}