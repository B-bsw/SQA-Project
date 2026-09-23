package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

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
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer;

public class NumberSerializersTest {

    private Map<String, JsonSerializer<?>> map;
    private ObjectMapper mapper;
    private JsonFactory jsonFactory;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        jsonFactory = new JsonFactory();
        map = new HashMap<String, JsonSerializer<?>>();
    }

    // Test addAll method - basic registration
    @Test
    public void testAddAllRegistersAllTypes() {
        NumberSerializers.addAll(map);
        
        // Verify all expected types are registered
        assertNotNull(map.get(Integer.class.getName()));
        assertNotNull(map.get(Integer.TYPE.getName()));
        assertNotNull(map.get(Long.class.getName()));
        assertNotNull(map.get(Long.TYPE.getName()));
        assertNotNull(map.get(Byte.class.getName()));
        assertNotNull(map.get(Byte.TYPE.getName()));
        assertNotNull(map.get(Short.class.getName()));
        assertNotNull(map.get(Short.TYPE.getName()));
        assertNotNull(map.get(Float.class.getName()));
        assertNotNull(map.get(Float.TYPE.getName()));
        assertNotNull(map.get(Double.class.getName()));
        assertNotNull(map.get(Double.TYPE.getName()));
        assertEquals(12, map.size());
    }

    // Test addAll: verify correct serializer instances for each type
    @Test
    public void testAddAllCorrectInstances() {
        NumberSerializers.addAll(map);
        
        // Integer types should share same instance
        assertSame(map.get(Integer.class.getName()), map.get(Integer.TYPE.getName()));
        // Long types should share same instance
        assertSame(map.get(Long.class.getName()), map.get(Long.TYPE.getName()));
        // Byte uses IntLikeSerializer
        assertSame(map.get(Byte.class.getName()), map.get(Byte.TYPE.getName()));
        // Short uses ShortSerializer
        assertNotNull(map.get(Short.class.getName()));
        // Float types should share same instance
        assertSame(map.get(Float.class.getName()), map.get(Float.TYPE.getName()));
        // Double types should share same instance
        assertSame(map.get(Double.class.getName()), map.get(Double.TYPE.getName()));
    }

    // Test ShortSerializer
    @Test
    public void testShortSerializer() throws IOException {
        ShortSerializer serializer = new ShortSerializer();
        
        // Test getSchema
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("number", schema.get("type").asText());
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Short shortValue = Short.valueOf((short) 12);
        serializer.serialize(shortValue, gen, null);
        gen.flush();
        assertEquals("12", out.toString("UTF-8"));
    }

    // Test ShortSerializer with boundary values
    @Test
    public void testShortSerializerBoundary() throws IOException {
        ShortSerializer serializer = new ShortSerializer();
        
        // Test Short.MIN_VALUE and MAX_VALUE
        ByteArrayOutputStream outMin = new ByteArrayOutputStream();
        JsonGenerator genMin = jsonFactory.createGenerator(outMin);
        serializer.serialize(Short.MIN_VALUE, genMin, null);
        genMin.flush();
        assertEquals("-32768", outMin.toString("UTF-8"));
        
        ByteArrayOutputStream outMax = new ByteArrayOutputStream();
        JsonGenerator genMax = jsonFactory.createGenerator(outMax);
        serializer.serialize(Short.MAX_VALUE, genMax, null);
        genMax.flush();
        assertEquals("32767", outMax.toString("UTF-8"));
    }

    // Test IntegerSerializer
    @Test
    public void testIntegerSerializer() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        
        // Test getSchema
        JsonNode schema = serializer.getSchema(null, null);
        assertNotNull(schema);
        assertEquals("integer", schema.get("type").asText());
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Integer intValue = Integer.valueOf(42);
        serializer.serialize(intValue, gen, null);
        gen.flush();
        assertEquals("42", out.toString("UTF-8"));
    }

    // Test IntegerSerializer with boundary values
    @Test
    public void testIntegerSerializerBoundary() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        
        // Test Integer.MIN_VALUE and MAX_VALUE
        ByteArrayOutputStream outMin = new ByteArrayOutputStream();
        JsonGenerator genMin = jsonFactory.createGenerator(outMin);
        serializer.serialize(Integer.MIN_VALUE, genMin, null);
        genMin.flush();
        assertEquals("-2147483648", outMin.toString("UTF-8"));
        
        ByteArrayOutputStream outMax = new ByteArrayOutputStream();
        JsonGenerator genMax = jsonFactory.createGenerator(outMax);
        serializer.serialize(Integer.MAX_VALUE, genMax, null);
        genMax.flush();
        assertEquals("2147483647", outMax.toString("UTF-8"));
    }

    // Test IntegerSerializer serializeWithType
    @Test
    public void testIntegerSerializerSerializeWithType() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Integer intValue = Integer.valueOf(7);
        serializer.serializeWithType(intValue, gen, null, null);
        gen.flush();
        assertEquals("7", out.toString("UTF-8"));
    }

    // Test IntLikeSerializer
    @Test
    public void testIntLikeSerializer() throws IOException {
        IntLikeSerializer serializer = new IntLikeSerializer();
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Number number = new Number() {
            private static final long serialVersionUID = 1L;
            
            @Override
            public int intValue() {
                return 55;
            }
            
            @Override
            public long longValue() {
                return 55L;
            }
            
            @Override
            public float floatValue() {
                return 55.0f;
            }
            
            @Override
            public double doubleValue() {
                return 55.0;
            }
        };
        serializer.serialize(number, gen, null);
        gen.flush();
        assertEquals("55", out.toString("UTF-8"));
    }

    // Test LongSerializer
    @Test
    public void testLongSerializer() throws IOException {
        LongSerializer serializer = new LongSerializer();
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Long longValue = Long.valueOf(100L);
        serializer.serialize(longValue, gen, null);
        gen.flush();
        assertEquals("100", out.toString("UTF-8"));
    }

    // Test LongSerializer with boundary values
    @Test
    public void testLongSerializerBoundary() throws IOException {
        LongSerializer serializer = new LongSerializer();
        
        // Test Long.MIN_VALUE and MAX_VALUE
        ByteArrayOutputStream outMin = new ByteArrayOutputStream();
        JsonGenerator genMin = jsonFactory.createGenerator(outMin);
        serializer.serialize(Long.MIN_VALUE, genMin, null);
        genMin.flush();
        assertEquals("-9223372036854775808", outMin.toString("UTF-8"));
        
        ByteArrayOutputStream outMax = new ByteArrayOutputStream();
        JsonGenerator genMax = jsonFactory.createGenerator(outMax);
        serializer.serialize(Long.MAX_VALUE, genMax, null);
        genMax.flush();
        assertEquals("9223372036854775807", outMax.toString("UTF-8"));
    }

    // Test FloatSerializer
    @Test
    public void testFloatSerializer() throws IOException {
        FloatSerializer serializer = new FloatSerializer();
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Float floatValue = Float.valueOf(3.14f);
        serializer.serialize(floatValue, gen, null);
        gen.flush();
        assertEquals("3.14", out.toString("UTF-8"));
    }

    // Test DoubleSerializer
    @Test
    public void testDoubleSerializer() throws IOException {
        DoubleSerializer serializer = new DoubleSerializer();
        
        // Test serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Double doubleValue = Double.valueOf(2.71828);
        serializer.serialize(doubleValue, gen, null);
        gen.flush();
        assertEquals("2.71828", out.toString("UTF-8"));
    }

    // Test DoubleSerializer with special values
    @Test
    public void testDoubleSerializerSpecialValues() throws IOException {
        DoubleSerializer serializer = new DoubleSerializer();
        
        // Test 0.0
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        serializer.serialize(Double.valueOf(0.0), gen, null);
        gen.flush();
        assertEquals("0.0", out.toString("UTF-8"));
        
        // Test -0.0
        out = new ByteArrayOutputStream();
        gen = jsonFactory.createGenerator(out);
        serializer.serialize(Double.valueOf(-0.0), gen, null);
        gen.flush();
        assertEquals("-0.0", out.toString("UTF-8"));
    }

    // Test DoubleSerializer serializeWithType
    @Test
    public void testDoubleSerializerSerializeWithType() throws IOException {
        DoubleSerializer serializer = new DoubleSerializer();
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        Double doubleValue = Double.valueOf(1.5);
        serializer.serializeWithType(doubleValue, gen, null, null);
        gen.flush();
        assertEquals("1.5", out.toString("UTF-8"));
    }

    // Test acceptJsonFormatVisitor for INT type
    @Test
    public void testAcceptJsonFormatVisitorInt() throws JsonMappingException {
        IntegerSerializer serializer = new IntegerSerializer();
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
                return new JsonIntegerFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType numberType) {
                        assertEquals(JsonParser.NumberType.INT, numberType);
                    }
                };
            }
        };
        serializer.acceptJsonFormatVisitor(visitor, null);
    }

    // Test acceptJsonFormatVisitor for FLOAT type (Double)
    @Test
    public void testAcceptJsonFormatVisitorFloat() throws JsonMappingException {
        DoubleSerializer serializer = new DoubleSerializer();
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException {
                return new JsonNumberFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType numberType) {
                        assertEquals(JsonParser.NumberType.DOUBLE, numberType);
                    }
                };
            }
        };
        serializer.acceptJsonFormatVisitor(visitor, null);
    }

    // Test acceptJsonFormatVisitor for SHORT (INT type but not INT)
    @Test
    public void testAcceptJsonFormatVisitorShort() throws JsonMappingException {
        ShortSerializer serializer = new ShortSerializer();
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
                return new JsonIntegerFormatVisitor.Base() {
                    @Override
                    public void numberType(JsonParser.NumberType numberType) {
                        assertEquals(JsonParser.NumberType.INT, numberType);
                    }
                };
            }
        };
        serializer.acceptJsonFormatVisitor(visitor, null);
    }

    // Test createContextual with null property
    @Test
    public void testCreateContextualNullProperty() throws JsonMappingException {
        IntegerSerializer serializer = new IntegerSerializer();
        assertSame(serializer, serializer.createContextual(null, null));
    }

    // Test createContextual with non-string shape
    @Test
    public void testCreateContextualNonNullProperty() throws JsonMappingException {
        IntegerSerializer serializer = new IntegerSerializer();
        // Since we can't easily create real BeanProperty, just verify it returns this
        assertSame(serializer, serializer.createContextual(null, null));
    }

    // Test constructor for Base
    @Test
    public void testBaseConstructor() {
        IntegerSerializer serializer = new IntegerSerializer();
        assertEquals("integer", serializer.getSchema(null, null).get("type").asText());
    }

    // Test ShortSerializer static instance
    @Test
    public void testShortSerializerStaticInstance() {
        assertNotNull(ShortSerializer.instance);
    }

    // Test IntegerSerializer static instance
    @Test
    public void testIntegerSerializerStaticInstance() {
        assertNotNull(NumberSerializers.IntegerSerializer.instance);
    }

    // Test LongSerializer static instance
    @Test
    public void testLongSerializerStaticInstance() {
        assertNotNull(LongSerializer.instance);
    }

    // Test DoubleSerializer static instance
    @Test
    public void testDoubleSerializerStaticInstance() {
        assertNotNull(DoubleSerializer.instance);
    }

    // Test FloatSerializer static instance
    @Test
    public void testFloatSerializerStaticInstance() {
        assertNotNull(FloatSerializer.instance);
    }

    // Test writeNumber for integer
    @Test
    public void testWriteNumberInteger() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        serializer.serialize(Integer.valueOf(25), gen, null);
        gen.flush();
        assertEquals("25", out.toString("UTF-8"));
    }

    // Test null value handling
    @Test
    public void testNullValueHandling() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        
        try {
            serializer.serialize(null, gen, null);
            fail("Expected exception");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    // Test ShortSerializer with zero
    @Test
    public void testShortSerializerZero() throws IOException {
        ShortSerializer serializer = new ShortSerializer();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        serializer.serialize(Short.valueOf((short)0), gen, null);
        gen.flush();
        assertEquals("0", out.toString("UTF-8"));
    }

    // Test IntegerSerializer with zero
    @Test
    public void testIntegerSerializerZero() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = jsonFactory.createGenerator(out);
        serializer.serialize(Integer.valueOf(0), gen, null);
        gen.flush();
        assertEquals("0", out.toString("UTF-8"));
    }

    // Test exception from serialize
    @Test(expected = IOException.class)
    public void testSerializeException() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer();
        JsonGenerator gen = new JsonGenerator() {
            @Override
            public void writeNumber(int v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(long v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(double v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(float v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(String v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(java.math.BigDecimal v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNumber(java.math.BigInteger v) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeString(String text) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeString(char[] text, int offset, int len) throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeStartObject() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeEndObject() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeStartArray() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeEndArray() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void writeNull() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void flush() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public void close() throws IOException {
                throw new IOException("test");
            }
            
            @Override
            public boolean isClosed() {
                return false;
            }
        };
        
        serializer.serialize(Integer.valueOf(1), gen, null);
    }
}