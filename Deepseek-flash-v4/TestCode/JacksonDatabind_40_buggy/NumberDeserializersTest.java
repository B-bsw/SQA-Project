package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NumberDeserializersTest {

    private JsonFactory factory;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        factory = new JsonFactory();
        mapper = new ObjectMapper();
    }

    @Test
    public void testFindPrimitiveInteger() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Integer.TYPE, "int");
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.IntegerDeserializer);
        assertSame(NumberDeserializers.IntegerDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperInteger() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Integer.class, "java.lang.Integer");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.IntegerDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveBoolean() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Boolean.TYPE, "boolean");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.BooleanDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperBoolean() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Boolean.class, "java.lang.Boolean");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.BooleanDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveLong() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Long.TYPE, "long");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.LongDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperLong() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Long.class, "java.lang.Long");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.LongDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveDouble() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Double.TYPE, "double");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.DoubleDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperDouble() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Double.class, "java.lang.Double");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.DoubleDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveCharacter() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Character.TYPE, "char");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.CharacterDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperCharacter() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Character.class, "java.lang.Character");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.CharacterDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveByte() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Byte.TYPE, "byte");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.ByteDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperByte() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Byte.class, "java.lang.Byte");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.ByteDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveShort() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Short.TYPE, "short");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.ShortDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperShort() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Short.class, "java.lang.Short");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.ShortDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindPrimitiveFloat() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Float.TYPE, "float");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.FloatDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperFloat() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Float.class, "java.lang.Float");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.FloatDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testFindNumber() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Number.class, "java.lang.Number");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.NumberDeserializer.instance, deserializer);
    }

    @Test
    public void testFindBigDecimal() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(BigDecimal.class, "java.math.BigDecimal");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.BigDecimalDeserializer.instance, deserializer);
    }

    @Test
    public void testFindBigInteger() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(BigInteger.class, "java.math.BigInteger");
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.BigIntegerDeserializer.instance, deserializer);
    }

    @Test
    public void testFindUnknownTypeReturnsNull() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(String.class, "java.lang.String");
        assertNull(deserializer);
    }

    @Test
    public void testFindPrimitiveIntegerWithNullName() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Integer.TYPE, null);
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.IntegerDeserializer.primitiveInstance, deserializer);
    }

    @Test
    public void testFindWrapperIntegerWithNullName() {
        JsonDeserializer<?> deserializer = NumberDeserializers.find(Integer.class, null);
        assertNotNull(deserializer);
        assertSame(NumberDeserializers.IntegerDeserializer.wrapperInstance, deserializer);
    }

    @Test
    public void testBooleanDeserializerPrimitive() throws Exception {
        JsonParser p = factory.createParser("true");
        p.nextToken();
        NumberDeserializers.BooleanDeserializer deserializer = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        assertEquals(Boolean.TRUE, deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testBooleanDeserializerWrapper() throws Exception {
        JsonParser p = factory.createParser("false");
        p.nextToken();
        NumberDeserializers.BooleanDeserializer deserializer = NumberDeserializers.BooleanDeserializer.wrapperInstance;
        assertEquals(Boolean.FALSE, deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializer() throws Exception {
        JsonParser p = factory.createParser("42");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(42), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializerFromString() throws Exception {
        JsonParser p = factory.createParser("\"42\"");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(42), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializerFromLongValue() throws Exception {
        JsonParser p = factory.createParser("2147483648");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(2147483647), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializerFromLongValueOverflow() throws Exception {
        JsonParser p = factory.createParser("4294967296");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(-2147483648), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializerFromStringTooLarge() throws Exception {
        JsonParser p = factory.createParser("\"4294967296\"");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(-2147483648), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testIntegerDeserializerFromStringInvalid() throws Exception {
        JsonParser p = factory.createParser("\"abc\"");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        try {
            deserializer.deserialize(p, createDeserializationContext());
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testLongDeserializer() throws Exception {
        JsonParser p = factory.createParser("1234567890123456789");
        p.nextToken();
        NumberDeserializers.LongDeserializer deserializer = new NumberDeserializers.LongDeserializer(Long.class, null);
        assertEquals(Long.valueOf(1234567890123456789L), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testLongDeserializerFromString() throws Exception {
        JsonParser p = factory.createParser("\"1234567890123456789\"");
        p.nextToken();
        NumberDeserializers.LongDeserializer deserializer = new NumberDeserializers.LongDeserializer(Long.class, null);
        assertEquals(Long.valueOf(1234567890123456789L), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testDoubleDeserializer() throws Exception {
        JsonParser p = factory.createParser("3.14");
        p.nextToken();
        NumberDeserializers.DoubleDeserializer deserializer = new NumberDeserializers.DoubleDeserializer(Double.class, null);
        assertEquals(Double.valueOf(3.14), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testDoubleDeserializerFromString() throws Exception {
        JsonParser p = factory.createParser("\"3.14\"");
        p.nextToken();
        NumberDeserializers.DoubleDeserializer deserializer = new NumberDeserializers.DoubleDeserializer(Double.class, null);
        assertEquals(Double.valueOf(3.14), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testCharacterDeserializerNumber() throws Exception {
        JsonParser p = factory.createParser("65");
        p.nextToken();
        NumberDeserializers.CharacterDeserializer deserializer = new NumberDeserializers.CharacterDeserializer(Character.class, null);
        assertEquals(Character.valueOf('A'), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testCharacterDeserializerString() throws Exception {
        JsonParser p = factory.createParser("\"A\"");
        p.nextToken();
        NumberDeserializers.CharacterDeserializer deserializer = new NumberDeserializers.CharacterDeserializer(Character.class, null);
        assertEquals(Character.valueOf('A'), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testCharacterDeserializerEmptyString() throws Exception {
        JsonParser p = factory.createParser("\"\"");
        p.nextToken();
        NumberDeserializers.CharacterDeserializer deserializer = new NumberDeserializers.CharacterDeserializer(Character.class, null);
        assertNull(deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testCharacterDeserializerInvalidNumber() throws Exception {
        JsonParser p = factory.createParser("70000");
        p.nextToken();
        NumberDeserializers.CharacterDeserializer deserializer = new NumberDeserializers.CharacterDeserializer(Character.class, null);
        try {
            deserializer.deserialize(p, createDeserializationContext());
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testByteDeserializer() throws Exception {
        JsonParser p = factory.createParser("127");
        p.nextToken();
        NumberDeserializers.ByteDeserializer deserializer = new NumberDeserializers.ByteDeserializer(Byte.class, null);
        assertEquals(Byte.valueOf((byte) 127), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testShortDeserializer() throws Exception {
        JsonParser p = factory.createParser("32767");
        p.nextToken();
        NumberDeserializers.ShortDeserializer deserializer = new NumberDeserializers.ShortDeserializer(Short.class, null);
        assertEquals(Short.valueOf((short) 32767), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testFloatDeserializer() throws Exception {
        JsonParser p = factory.createParser("3.14f");
        p.nextToken();
        NumberDeserializers.FloatDeserializer deserializer = new NumberDeserializers.FloatDeserializer(Float.class, null);
        assertEquals(Float.valueOf(3.14f), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testBigIntegerDeserializer() throws Exception {
        JsonParser p = factory.createParser("123456789012345678901234567890");
        p.nextToken();
        NumberDeserializers.BigIntegerDeserializer deserializer = NumberDeserializers.BigIntegerDeserializer.instance;
        assertEquals(new BigInteger("123456789012345678901234567890"), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testBigIntegerDeserializerFloat() throws Exception {
        JsonParser p = factory.createParser("1.5");
        p.nextToken();
        NumberDeserializers.BigIntegerDeserializer deserializer = NumberDeserializers.BigIntegerDeserializer.instance;
        DeserializationContext ctxt = createDeserializationContext();
        try {
            deserializer.deserialize(p, ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testBigIntegerDeserializerFromString() throws Exception {
        JsonParser p = factory.createParser("\"123456789012345678901234567890\"");
        p.nextToken();
        NumberDeserializers.BigIntegerDeserializer deserializer = NumberDeserializers.BigIntegerDeserializer.instance;
        assertEquals(new BigInteger("123456789012345678901234567890"), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializer() throws Exception {
        JsonParser p = factory.createParser("42");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Integer.valueOf(42), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerDouble() throws Exception {
        JsonParser p = factory.createParser("3.14");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Double.valueOf(3.14), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerBigDecimal() throws Exception {
        JsonParser p = factory.createParser("1.5");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        DeserializationContext ctxt = createDeserializationContext();
        ctxt.setAttribute(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, Boolean.TRUE);
        assertEquals(new BigDecimal("1.5"), deserializer.deserialize(p, ctxt));
    }

    @Test
    public void testNumberDeserializerStringInt() throws Exception {
        JsonParser p = factory.createParser("\"42\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Integer.valueOf(42), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerStringDouble() throws Exception {
        JsonParser p = factory.createParser("\"3.14\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Double.valueOf(3.14), deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerStringBigInteger() throws Exception {
        JsonParser p = factory.createParser("\"123456789012345678901234567890\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        DeserializationContext ctxt = createDeserializationContext();
        assertEquals(new BigInteger("123456789012345678901234567890"), deserializer.deserialize(p, ctxt));
    }

    @Test
    public void testNumberDeserializerStringInfinity() throws Exception {
        JsonParser p = factory.createParser("\"Infinity\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Double.POSITIVE_INFINITY, deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerStringNegativeInfinity() throws Exception {
        JsonParser p = factory.createParser("\"-Infinity\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Double.NEGATIVE_INFINITY, deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerStringNaN() throws Exception {
        JsonParser p = factory.createParser("\"NaN\"");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertEquals(Double.NaN, deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testNumberDeserializerNull() throws Exception {
        JsonParser p = factory.createParser("null");
        p.nextToken();
        NumberDeserializers.NumberDeserializer deserializer = NumberDeserializers.NumberDeserializer.instance;
        assertNull(deserializer.deserialize(p, createDeserializationContext()));
    }

    @Test
    public void testGetNullValuePrimitiveBoolean() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        assertNotNull(deserializer.getNullValue(createDeserializationContext()));
    }

    @Test
    public void testGetNullValueWrapperBoolean() throws Exception {
        NumberDeserializers.BooleanDeserializer deserializer = NumberDeserializers.BooleanDeserializer.wrapperInstance;
        assertNull(deserializer.getNullValue(createDeserializationContext()));
    }

    @Test
    public void testGetNullValuePrimitiveIntegerFailOnNull() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
        DeserializationContext ctxt = createDeserializationContext();
        ctxt.setAttribute(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, Boolean.TRUE);
        try {
            deserializer.getNullValue(ctxt);
            fail("Expected JsonMappingException");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testGetNullValuePrimitiveInteger() throws Exception {
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
        assertEquals(Integer.valueOf(0), deserializer.getNullValue(createDeserializationContext()));
    }

    @Test
    public void testDeserializeWithTypeBoolean() throws Exception {
        JsonParser p = factory.createParser("true");
        p.nextToken();
        NumberDeserializers.BooleanDeserializer deserializer = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        assertEquals(Boolean.TRUE, deserializer.deserializeWithType(p, createDeserializationContext(), null));
    }

    @Test
    public void testDeserializeWithTypeInteger() throws Exception {
        JsonParser p = factory.createParser("42");
        p.nextToken();
        NumberDeserializers.IntegerDeserializer deserializer = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
        assertEquals(Integer.valueOf(42), deserializer.deserializeWithType(p, createDeserializationContext(), null));
    }

    private DeserializationContext createDeserializationContext() {
        return mapper.getDeserializationContext();
    }
}