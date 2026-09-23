package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

public class NumberSerializerTest {

    private JsonGenerator g;
    private SerializerProvider provider;
    private NumberSerializer serializer;

    @Before
    public void setUp() throws Exception {
        g = mock(JsonGenerator.class);
        provider = mock(SerializerProvider.class);
        serializer = new NumberSerializer(Number.class);
    }

    @Test
    public void testConstructorForBigInteger() {
        assertTrue(new NumberSerializer(BigInteger.class)._isInt);
    }

    @Test
    public void testConstructorForNumberNotBigInteger() {
        assertFalse(new NumberSerializer(Number.class)._isInt);
        assertFalse(new NumberSerializer(BigDecimal.class)._isInt);
    }

    @Test
    public void testCreateContextualWithNullFormat() throws Exception {
        NumberSerializer ns = new NumberSerializer(Number.class);
        JsonSerializer<?> result = ns.createContextual(provider, mock(BeanProperty.class));
        assertSame(ns, result);
    }

    @Test
    public void testCreateContextualWithStringShape() throws Exception {
        NumberSerializer ns = new NumberSerializer(Number.class);
        BeanProperty property = mock(BeanProperty.class);
        when(provider.findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class)))
                .thenReturn(com.fasterxml.jackson.annotation.JsonFormat.Value.forShape(com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING));
        JsonSerializer<?> result = ns.createContextual(provider, property);
        assertSame(ToStringSerializer.instance, result);
    }

    @Test
    public void testCreateContextualWithOtherShape() throws Exception {
        NumberSerializer ns = new NumberSerializer(Number.class);
        BeanProperty property = mock(BeanProperty.class);
        when(provider.findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class)))
                .thenReturn(com.fasterxml.jackson.annotation.JsonFormat.Value.forShape(com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER));
        JsonSerializer<?> result = ns.createContextual(provider, property);
        assertSame(ns, result);
    }

    @Test
    public void testCreateContextualWithFormatOverridesReturningNull() throws Exception {
        NumberSerializer ns = new NumberSerializer(Number.class);
        BeanProperty property = mock(BeanProperty.class);
        when(provider.findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class)))
                .thenReturn(null);
        JsonSerializer<?> result = ns.createContextual(provider, property);
        assertSame(ns, result);
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        BigDecimal val = new BigDecimal("123.456");
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(val);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        BigInteger val = new BigInteger("123456789");
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(val);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeLong() throws Exception {
        Long val = 42L;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(42L);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeDouble() throws Exception {
        Double val = 3.14159;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(3.14159);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        Float val = 2.5f;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(2.5f);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeInteger() throws Exception {
        Integer val = 7;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(7);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeByte() throws Exception {
        Byte val = 10;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(10);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeShort() throws Exception {
        Short val = 15;
        serializer.serialize(val, g, provider);
        verify(g).writeNumber(15);
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeCustomNumber() throws Exception {
        // Use a custom Number subclass as fallback
        Number custom = new Number() {
            private static final long serialVersionUID = 1L;
            @Override
            public int intValue() { return 99; }
            @Override
            public long longValue() { return 99L; }
            @Override
            public float floatValue() { return 99.0f; }
            @Override
            public double doubleValue() { return 99.0; }
            @Override
            public String toString() { return "customNumber"; }
        };
        serializer.serialize(custom, g, provider);
        verify(g).writeNumber("customNumber");
        verifyNoMoreInteractions(g);
    }

    @Test
    public void testSerializeNull() throws Exception {
        serializer.serialize(null, g, provider);
        // Should not throw - just verify no writes
        verifyNoInteractions(g);
    }

    @Test
    public void testGetSchemaForBigIntegerType() {
        NumberSerializer ns = new NumberSerializer(BigInteger.class);
        JsonNode schema = ns.getSchema(provider, BigInteger.class);
        assertTrue(schema.isObject());
        ObjectNode obj = (ObjectNode) schema;
        assertEquals("integer", obj.get("type").asText());
        assertTrue(obj.get("optional").asBoolean());
    }

    @Test
    public void testGetSchemaForNonBigIntegerType() {
        JsonNode schema = serializer.getSchema(provider, BigDecimal.class);
        assertTrue(schema.isObject());
        ObjectNode obj = (ObjectNode) schema;
        assertEquals("number", obj.get("type").asText());
        assertTrue(obj.get("optional").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigInteger() throws Exception {
        NumberSerializer ns = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonIntegerFormatVisitor intVisitor = mock(JsonIntegerFormatVisitor.class);
        when(visitor.expectIntegerFormat(any(JavaType.class))).thenReturn(intVisitor);
        ns.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectIntegerFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigDecimal() throws Exception {
        NumberSerializer ns = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonNumberFormatVisitor numVisitor = mock(JsonNumberFormatVisitor.class);
        when(visitor.expectNumberFormat(any(JavaType.class))).thenReturn(numVisitor);
        ns.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitorForCustomNumber() throws Exception {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonNumberFormatVisitor numVisitor = mock(JsonNumberFormatVisitor.class);
        when(visitor.expectNumberFormat(any(JavaType.class))).thenReturn(numVisitor);
        serializer.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectNumberFormat(any(JavaType.class));
    }

    @Test
    public void testAcceptJsonFormatVisitorForLong() throws Exception {
        NumberSerializer ns = new NumberSerializer(Long.class);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonIntegerFormatVisitor intVisitor = mock(JsonIntegerFormatVisitor.class);
        when(visitor.expectIntegerFormat(any(JavaType.class))).thenReturn(intVisitor);
        ns.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectIntegerFormat(any(JavaType.class));
    }

    @Test
    public void testSerializeTypicalValues() throws Exception {
        // Test with actual values to ensure correct routing
        serializer.serialize(new BigDecimal("0.0"), g, provider);
        verify(g).writeNumber(new BigDecimal("0.0"));

        serializer.serialize(BigInteger.ZERO, g, provider);
        verify(g).writeNumber(BigInteger.ZERO);

        serializer.serialize(0L, g, provider);
        verify(g).writeNumber(0L);

        serializer.serialize(0.0, g, provider);
        verify(g).writeNumber(0.0);

        serializer.serialize(0.0f, g, provider);
        verify(g).writeNumber(0.0f);

        serializer.serialize(0, g, provider);
        verify(g).writeNumber(0);

        serializer.serialize((byte)0, g, provider);
        verify(g).writeNumber(0);

        serializer.serialize((short)0, g, provider);
        verify(g).writeNumber(0);
    }

    @Test
    public void testSerializeBoundaryValues() throws Exception {
        // Test max/min values
        serializer.serialize(Long.MAX_VALUE, g, provider);
        verify(g).writeNumber(Long.MAX_VALUE);

        serializer.serialize(Long.MIN_VALUE, g, provider);
        verify(g).writeNumber(Long.MIN_VALUE);

        serializer.serialize(Double.MAX_VALUE, g, provider);
        verify(g).writeNumber(Double.MAX_VALUE);

        serializer.serialize(Double.MIN_VALUE, g, provider);
        verify(g).writeNumber(Double.MIN_VALUE);

        serializer.serialize(Float.MAX_VALUE, g, provider);
        verify(g).writeNumber(Float.MAX_VALUE);

        serializer.serialize(Float.MIN_VALUE, g, provider);
        verify(g).writeNumber(Float.MIN_VALUE);

        serializer.serialize(Integer.MAX_VALUE, g, provider);
        verify(g).writeNumber(Integer.MAX_VALUE);

        serializer.serialize(Integer.MIN_VALUE, g, provider);
        verify(g).writeNumber(Integer.MIN_VALUE);
    }

    @Test
    public void testSerializeMixedTypes() throws Exception {
        // Verify sequential calls work properly
        serializer.serialize(new BigDecimal("1.5"), g, provider);
        serializer.serialize(new BigInteger("2"), g, provider);
        serializer.serialize(3L, g, provider);
        serializer.serialize(4.0, g, provider);
        serializer.serialize(5.0f, g, provider);
        serializer.serialize(6, g, provider);
        serializer.serialize((byte)7, g, provider);
        serializer.serialize((short)8, g, provider);

        verify(g).writeNumber(new BigDecimal("1.5"));
        verify(g).writeNumber(new BigInteger("2"));
        verify(g).writeNumber(3L);
        verify(g).writeNumber(4.0);
        verify(g).writeNumber(5.0f);
        verify(g).writeNumber(6);
        verify(g).writeNumber(7);
        verify(g).writeNumber(8);
    }

    @Test
    public void testContextualSerializationWithBigDecimal() throws Exception {
        NumberSerializer ns = new NumberSerializer(BigDecimal.class);
        BeanProperty property = mock(BeanProperty.class);
        when(provider.findFormatOverrides(any(SerializerProvider.class), any(BeanProperty.class), any(Class.class)))
                .thenReturn(com.fasterxml.jackson.annotation.JsonFormat.Value.forShape(com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING));
        JsonSerializer<?> result = ns.createContextual(provider, property);
        assertSame(ToStringSerializer.instance, result);
    }

    @Test
    public void testSchemaConsistency() {
        JsonNode schema1 = serializer.getSchema(provider, Number.class);
        JsonNode schema2 = serializer.getSchema(provider, BigDecimal.class);
        assertEquals(schema1, schema2);
    }

    @Test
    public void testHandledType() throws Exception {
        assertEquals(Number.class, serializer.handledType());
    }
}