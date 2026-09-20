package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class NumberSerializerTest {

    private static class RecordingGenerator extends TokenBuffer {
        private String writtenType;
        private Object writtenValue;

        public RecordingGenerator() {
            super((ObjectCodec) null);
        }

        @Override
        public void writeNumber(int v) {
            this.writtenType = "int";
            this.writtenValue = new Integer(v);
        }

        @Override
        public void writeNumber(long v) {
            this.writtenType = "long";
            this.writtenValue = new Long(v);
        }

        @Override
        public void writeNumber(double v) {
            this.writtenType = "double";
            this.writtenValue = new Double(v);
        }

        @Override
        public void writeNumber(float v) {
            this.writtenType = "float";
            this.writtenValue = new Float(v);
        }

        @Override
        public void writeNumber(BigDecimal v) {
            this.writtenType = "BigDecimal";
            this.writtenValue = v;
        }

        @Override
        public void writeNumber(BigInteger v) {
            this.writtenType = "BigInteger";
            this.writtenValue = v;
        }

        @Override
        public void writeNumber(String v) {
            this.writtenType = "String";
            this.writtenValue = v;
        }

        public String getWrittenType() {
            return writtenType;
        }

        public Object getWrittenValue() {
            return writtenValue;
        }
    }

    private static class RecordingVisitor extends JsonFormatVisitorWrapper.Base {
        private boolean intFormatVisited = false;
        private boolean numberFormatVisited = false;
        private boolean floatFormatVisited = false;
        private JsonParser.NumberType recordedNumberType = null;
        private final boolean returnNullSubVisitors;

        public RecordingVisitor() {
            this(false);
        }

        public RecordingVisitor(boolean returnNullSubVisitors) {
            this.returnNullSubVisitors = returnNullSubVisitors;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            this.intFormatVisited = true;
            if (returnNullSubVisitors) {
                return null;
            }
            return new JsonIntegerFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    recordedNumberType = type;
                }
            };
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            this.numberFormatVisited = true;
            if (returnNullSubVisitors) {
                return null;
            }
            return new JsonNumberFormatVisitor.Base() {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    floatFormatVisited = true;
                    recordedNumberType = type;
                }
            };
        }

        public boolean isIntFormatVisited() {
            return intFormatVisited;
        }

        public boolean isNumberFormatVisited() {
            return numberFormatVisited;
        }

        public boolean isFloatFormatVisited() {
            return floatFormatVisited;
        }

        public JsonParser.NumberType getRecordedNumberType() {
            return recordedNumberType;
        }
    }

    private static class CustomNumber extends Number {
        private static final long serialVersionUID = 1L;
        private final String representation;

        public CustomNumber(String representation) {
            this.representation = representation;
        }

        public int intValue() {
            return 0;
        }

        public long longValue() {
            return 0L;
        }

        public float floatValue() {
            return 0.0f;
        }

        public double doubleValue() {
            return 0.0;
        }

        public String toString() {
            return representation;
        }
    }

    // =========================================================================
    // Constructor & Instance Tests
    // =========================================================================

    @Test
    public void constructor_givenBigIntegerClass_shouldSetIsIntTrue() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        Assert.assertTrue(serializer._isInt);
        Assert.assertEquals(BigInteger.class, serializer.handledType());
    }

    @Test
    public void constructor_givenBigDecimalClass_shouldSetIsIntFalse() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        Assert.assertFalse(serializer._isInt);
        Assert.assertEquals(BigDecimal.class, serializer.handledType());
    }

    @Test
    public void constructor_givenNumberClass_shouldSetIsIntFalse() {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        Assert.assertFalse(serializer._isInt);
        Assert.assertEquals(Number.class, serializer.handledType());
    }

    @Test
    public void staticInstance_shouldBeConfiguredForNumberClass() {
        Assert.assertNotNull(NumberSerializer.instance);
        Assert.assertEquals(Number.class, NumberSerializer.instance.handledType());
        Assert.assertFalse(NumberSerializer.instance._isInt);
    }

    // =========================================================================
    // Serialization Happy Path Tests
    // =========================================================================

    @Test
    public void serialize_givenBigDecimal_shouldCallWriteNumberBigDecimal() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        BigDecimal value = new BigDecimal("12345.6789");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("BigDecimal", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenBigInteger_shouldCallWriteNumberBigInteger() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        BigInteger value = new BigInteger("98765432109876543210");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("BigInteger", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenInteger_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Integer value = new Integer(42);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenLong_shouldCallWriteNumberLong() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Long value = new Long(9876543210L);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("long", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenDouble_shouldCallWriteNumberDouble() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Double value = new Double(3.1415926535);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("double", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenFloat_shouldCallWriteNumberFloat() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Float value = new Float(2.71828f);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("float", gen.getWrittenType());
        Assert.assertEquals(value, gen.getWrittenValue());
    }

    @Test
    public void serialize_givenByte_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Byte value = new Byte((byte) 127);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.getWrittenType());
        Assert.assertEquals(new Integer(127), gen.getWrittenValue());
    }

    @Test
    public void serialize_givenShort_shouldCallWriteNumberInt() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        Short value = new Short((short) 32767);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("int", gen.getWrittenType());
        Assert.assertEquals(new Integer(32767), gen.getWrittenValue());
    }

    // =========================================================================
    // Serialization Boundary & Fallback Tests
    // =========================================================================

    @Test
    public void serialize_givenCustomNumberFallback_shouldCallWriteNumberString() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        CustomNumber value = new CustomNumber("1e+1000");

        serializer.serialize(value, gen, null);

        Assert.assertEquals("String", gen.getWrittenType());
        Assert.assertEquals("1e+1000", gen.getWrittenValue());
    }

    @Test
    public void serialize_givenAtomicIntegerFallback_shouldCallWriteNumberString() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();
        AtomicInteger value = new AtomicInteger(999);

        serializer.serialize(value, gen, null);

        Assert.assertEquals("String", gen.getWrittenType());
        Assert.assertEquals("999", gen.getWrittenValue());
    }

    @Test(expected = NullPointerException.class)
    public void serialize_givenNullValue_shouldThrowNullPointerException() throws IOException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingGenerator gen = new RecordingGenerator();

        serializer.serialize(null, gen, null);
    }

    // =========================================================================
    // Schema Tests
    // =========================================================================

    @Test
    public void getSchema_givenBigIntegerSerializer_shouldReturnIntegerType() {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);

        JsonNode schemaNode = serializer.getSchema(null, null);

        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("integer", schemaNode.get("type").asText());
    }

    @Test
    public void getSchema_givenBigDecimalSerializer_shouldReturnNumberType() {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);

        JsonNode schemaNode = serializer.getSchema(null, null);

        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("number", schemaNode.get("type").asText());
    }

    @Test
    public void getSchema_givenDefaultInstance_shouldReturnNumberType() {
        NumberSerializer serializer = NumberSerializer.instance;

        JsonNode schemaNode = serializer.getSchema(null, null);

        Assert.assertNotNull(schemaNode);
        Assert.assertEquals("number", schemaNode.get("type").asText());
    }

    // =========================================================================
    // Format Visitor Tests
    // =========================================================================

    @Test
    public void acceptJsonFormatVisitor_givenBigIntegerSerializer_shouldVisitIntFormat() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        RecordingVisitor visitor = new RecordingVisitor();
        JavaType javaType = TypeFactory.defaultInstance().constructType(BigInteger.class);

        serializer.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitor.isIntFormatVisited());
        Assert.assertFalse(visitor.isNumberFormatVisited());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, visitor.getRecordedNumberType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenBigDecimalSerializer_shouldVisitFloatFormat() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        RecordingVisitor visitor = new RecordingVisitor();
        JavaType javaType = TypeFactory.defaultInstance().constructType(BigDecimal.class);

        serializer.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertFalse(visitor.isIntFormatVisited());
        Assert.assertTrue(visitor.isNumberFormatVisited());
        Assert.assertTrue(visitor.isFloatFormatVisited());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, visitor.getRecordedNumberType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenGeneralNumberSerializer_shouldVisitNumberFormat() throws JsonMappingException {
        NumberSerializer serializer = NumberSerializer.instance;
        RecordingVisitor visitor = new RecordingVisitor();
        JavaType javaType = TypeFactory.defaultInstance().constructType(Number.class);

        serializer.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertFalse(visitor.isIntFormatVisited());
        Assert.assertTrue(visitor.isNumberFormatVisited());
        Assert.assertFalse(visitor.isFloatFormatVisited());
        Assert.assertNull(visitor.getRecordedNumberType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenBigIntegerSerializerWithNullSubVisitor_shouldNotThrowException() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        RecordingVisitor visitor = new RecordingVisitor(true);
        JavaType javaType = TypeFactory.defaultInstance().constructType(BigInteger.class);

        serializer.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitor.isIntFormatVisited());
        Assert.assertNull(visitor.getRecordedNumberType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenBigDecimalSerializerWithNullSubVisitor_shouldNotThrowException() throws JsonMappingException {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        RecordingVisitor visitor = new RecordingVisitor(true);
        JavaType javaType = TypeFactory.defaultInstance().constructType(BigDecimal.class);

        serializer.acceptJsonFormatVisitor(visitor, javaType);

        Assert.assertTrue(visitor.isNumberFormatVisited());
        Assert.assertNull(visitor.getRecordedNumberType());
    }
}