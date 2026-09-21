package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;

public class NumberSerializerTest
{
    // ---------------------------------------------------------------
    // Helper: minimal JsonFormatVisitorWrapper to track invocations
    // ---------------------------------------------------------------
    static class TrackingVisitorWrapper implements JsonFormatVisitorWrapper
    {
        boolean integerFormatCalled = false;
        boolean numberFormatCalled = false;
        SerializerProvider provider;

        @Override
        public void setProvider(SerializerProvider provider) {
            this.provider = provider;
        }

        @Override
        public SerializerProvider getProvider() {
            return provider;
        }

        @Override
        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException {
            numberFormatCalled = true;
            return null;
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
            integerFormatCalled = true;
            return null;
        }

        @Override
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException {
            return null;
        }
    }

    // Custom Number subtype not matching any explicit instanceof branch
    static class CustomFallbackNumber extends Number
    {
        private static final long serialVersionUID = 1L;
        private final int val;

        CustomFallbackNumber(int v) { val = v; }

        @Override public int intValue() { return val; }
        @Override public long longValue() { return val; }
        @Override public float floatValue() { return val; }
        @Override public double doubleValue() { return val; }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    // Simple wrapper POJOs for full-pipeline createContextual tests
    static class StringShapeWrapper {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public BigInteger value = BigInteger.valueOf(123);
    }

    static class NumberShapeWrapper {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public BigInteger value = BigInteger.valueOf(456);
    }

    static class NoFormatWrapper {
        public BigInteger value = BigInteger.valueOf(789);
    }

    private final ObjectMapper MAPPER = new ObjectMapper();
    private final JsonFactory FACTORY = new JsonFactory();

    // ---------------------------------------------------------------
    // Helper method to serialize a Number directly via NumberSerializer
    // ---------------------------------------------------------------
    private String serializeDirect(NumberSerializer ser, Number value) throws Exception
    {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = FACTORY.createGenerator(sw);
        ser.serialize(value, gen, null);
        gen.flush();
        gen.close();
        return sw.toString();
    }

    // ---------------------------------------------------------------
    // Constructor / _isInt behavior via getSchema
    // ---------------------------------------------------------------
    @Test
    public void testConstructorBigIntegerIsIntTrue() {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonNode schema = ser.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testConstructorBigDecimalIsIntFalse() {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonNode schema = ser.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testConstructorGenericNumberIsIntFalse() {
        NumberSerializer ser = new NumberSerializer(Number.class);
        JsonNode schema = ser.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
    }

    // ---------------------------------------------------------------
    // serialize() branch coverage
    // ---------------------------------------------------------------
    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        String out = serializeDirect(ser, new BigDecimal("12.34"));
        assertEquals("12.34", out);
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        String out = serializeDirect(ser, BigInteger.valueOf(9999));
        assertEquals("9999", out);
    }

    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Long.valueOf(123456789L));
        assertEquals("123456789", out);
    }

    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Double.valueOf(3.14));
        assertEquals("3.14", out);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Float.valueOf(2.5f));
        assertEquals("2.5", out);
    }

    @Test
    public void testSerializeInteger() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Integer.valueOf(42));
        assertEquals("42", out);
    }

    @Test
    public void testSerializeByte() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Byte.valueOf((byte) 7));
        assertEquals("7", out);
    }

    @Test
    public void testSerializeShort() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, Short.valueOf((short) 99));
        assertEquals("99", out);
    }

    @Test
    public void testSerializeFallbackCustomNumber() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        String out = serializeDirect(ser, new CustomFallbackNumber(321));
        assertEquals("321", out);
    }

    @Test
    public void testSerializeFallbackAtomicInteger() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        AtomicInteger ai = new AtomicInteger(55);
        String out = serializeDirect(ser, ai);
        assertEquals("55", out);
    }

    @Test(expected = NullPointerException.class)
    public void testSerializeNullValueThrows() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        // value instanceof checks against null all return false,
        // falls to else branch calling value.toString() -> NPE
        serializeDirect(ser, null);
    }

    // ---------------------------------------------------------------
    // createContextual() branch coverage
    // ---------------------------------------------------------------
    @Test
    public void testCreateContextualNullPropertyReturnsSameInstance() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        SerializerProvider prov = MAPPER.getSerializerProviderInstance();
        BeanProperty property = null;
        JsonSerializer<?> result = ser.createContextual(prov, property);
        assertSame(ser, result);
    }

    @Test
    public void testCreateContextualStringShapeViaFullPipeline() throws Exception {
        String json = MAPPER.writeValueAsString(new StringShapeWrapper());
        // BigInteger with STRING shape should be serialized as a quoted string
        assertEquals("{\"value\":\"123\"}", json);
    }

    @Test
    public void testCreateContextualNumberShapeViaFullPipeline() throws Exception {
        String json = MAPPER.writeValueAsString(new NumberShapeWrapper());
        // default branch of switch -> falls through, returns "this", numeric output
        assertEquals("{\"value\":456}", json);
    }

    @Test
    public void testCreateContextualNoFormatViaFullPipeline() throws Exception {
        String json = MAPPER.writeValueAsString(new NoFormatWrapper());
        assertEquals("{\"value\":789}", json);
    }

    // ---------------------------------------------------------------
    // getSchema() coverage (already partly covered above, add explicit checks)
    // ---------------------------------------------------------------
    @Test
    public void testGetSchemaIntegerType() {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonNode node = ser.getSchema(null, null);
        assertTrue(node.has("type"));
        assertEquals("integer", node.get("type").asText());
    }

    @Test
    public void testGetSchemaNumberType() {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonNode node = ser.getSchema(null, null);
        assertTrue(node.has("type"));
        assertEquals("number", node.get("type").asText());
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor() branch coverage
    // ---------------------------------------------------------------
    @Test
    public void testAcceptJsonFormatVisitorIsIntBranch() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JavaType type = MAPPER.getTypeFactory().constructType(BigInteger.class);
        TrackingVisitorWrapper wrapper = new TrackingVisitorWrapper();
        ser.acceptJsonFormatVisitor(wrapper, type);
        assertTrue(wrapper.integerFormatCalled);
        assertFalse(wrapper.numberFormatCalled);
    }

    @Test
    public void testAcceptJsonFormatVisitorBigDecimalBranch() throws Exception {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JavaType type = MAPPER.getTypeFactory().constructType(BigDecimal.class);
        TrackingVisitorWrapper wrapper = new TrackingVisitorWrapper();
        ser.acceptJsonFormatVisitor(wrapper, type);
        assertTrue(wrapper.numberFormatCalled);
        assertFalse(wrapper.integerFormatCalled);
    }

    @Test
    public void testAcceptJsonFormatVisitorOtherNumberBranch() throws Exception {
        NumberSerializer ser = new NumberSerializer(Number.class);
        JavaType type = MAPPER.getTypeFactory().constructType(Number.class);
        TrackingVisitorWrapper wrapper = new TrackingVisitorWrapper();
        ser.acceptJsonFormatVisitor(wrapper, type);
        assertTrue(wrapper.numberFormatCalled);
        assertFalse(wrapper.integerFormatCalled);
    }

    // ---------------------------------------------------------------
    // Static instance sanity check
    // ---------------------------------------------------------------
    @Test
    public void testStaticInstanceExistsAndHandlesNumber() throws Exception {
        assertNotNull(NumberSerializer.instance);
        String out = serializeDirect(NumberSerializer.instance, Integer.valueOf(5));
        assertEquals("5", out);
    }
}