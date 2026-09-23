package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Type;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StdDelegatingSerializerTest {

    private Converter<Object, Object> mockConverter;
    private JsonGenerator mockGen;
    private SerializerProvider mockProvider;
    private JavaType mockDelegateType;
    private JsonSerializer<Object> mockDelegateSerializer;
    private StdDelegatingSerializer serializer;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        mockConverter = (Converter<Object, Object>) Mockito.mock(Converter.class);
        mockGen = Mockito.mock(JsonGenerator.class);
        mockProvider = Mockito.mock(SerializerProvider.class);
        mockDelegateType = Mockito.mock(JavaType.class);
        mockDelegateSerializer = (JsonSerializer<Object>) Mockito.mock(JsonSerializer.class);
        serializer = new StdDelegatingSerializer(mockConverter, mockDelegateType, mockDelegateSerializer);
    }

    @Test
    public void testConstructorWithConverterOnly() {
        StdDelegatingSerializer s = new StdDelegatingSerializer(mockConverter);
        assertNotNull(s.getConverter());
        assertNull(s.getDelegatee());
    }

    @Test
    public void testConstructorWithClassAndConverter() {
        Converter<?, ?> conv = Mockito.mock(Converter.class);
        @SuppressWarnings("unchecked")
        StdDelegatingSerializer s = new StdDelegatingSerializer((Class<Object>) Object.class, conv);
        assertNotNull(s.getConverter());
    }

    @Test
    public void testConstructorWithAllParams() {
        assertNotNull(serializer.getConverter());
        assertSame(mockDelegateSerializer, serializer.getDelegatee());
    }

    @Test
    public void testWithDelegateSubclassThrowsIllegalState() {
        StdDelegatingSerializer sub = new StdDelegatingSerializer(mockConverter, mockDelegateType, mockDelegateSerializer) {
            // anonymous subclass
        };
        try {
            sub.withDelegate(mockConverter, mockDelegateType, mockDelegateSerializer);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testWithDelegateReturnsNewInstance() {
        JsonSerializer<?> newSer = Mockito.mock(JsonSerializer.class);
        StdDelegatingSerializer result = serializer.withDelegate(mockConverter, mockDelegateType, newSer);
        assertNotNull(result);
        assertNotSame(serializer, result);
        assertSame(newSer, result.getDelegatee());
    }

    @Test
    public void testResolveWhenDelegateIsResolvable() throws Exception {
        ResolvableSerializer resolvable = Mockito.mock(ResolvableSerializer.class);
        when(mockDelegateSerializer instanceof ResolvableSerializer).thenReturn(true);
        // Note: can't easily mock 'instanceof', so use spy or wrapper
        StdDelegatingSerializer wrapper = new StdDelegatingSerializer(mockConverter, mockDelegateType,
                (JsonSerializer<Object>) resolvable);
        wrapper.resolve(mockProvider);
        verify((ResolvableSerializer) wrapper.getDelegatee()).resolve(mockProvider);
    }

    @Test
    public void testResolveWhenDelegateNotResolvable() throws Exception {
        serializer.resolve(mockProvider);
        // no exception expected, nothing happens
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testCreateContextualWhenDelegateNull() throws Exception {
        StdDelegatingSerializer s = new StdDelegatingSerializer(mockConverter, null, null);
        JsonSerializer<Object> newSer = Mockito.mock(JsonSerializer.class);
        when(mockConverter.getOutputType(any(TypeFactory.class))).thenReturn(mockDelegateType);
        when(mockProvider.findValueSerializer(mockDelegateType)).thenReturn(newSer);
        when(mockProvider.handleSecondaryContextualization(newSer, null)).thenReturn(newSer);

        JsonSerializer<?> result = s.createContextual(mockProvider, null);
        assertNotNull(result);
        assertNotSame(s, result);
        verify(mockConverter).getOutputType(any(TypeFactory.class));
        verify(mockProvider).handleSecondaryContextualization(newSer, null);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testCreateContextualWhenDelegateNotNullContextual() throws Exception {
        ContextualSerializer contextual = Mockito.mock(ContextualSerializer.class);
        JsonSerializer<Object> newSer = Mockito.mock(JsonSerializer.class);
        when(contextual instanceof ContextualSerializer).thenReturn(true);
        // wrap
        JsonSerializer<Object> contextualWrapper = (JsonSerializer<Object>) contextual;
        StdDelegatingSerializer s = new StdDelegatingSerializer(mockConverter, mockDelegateType, contextualWrapper);
        when(mockProvider.handleSecondaryContextualization(eq(contextualWrapper), isNull())).thenReturn(newSer);

        JsonSerializer<?> result = s.createContextual(mockProvider, null);
        assertSame(newSer, result);
        verify(mockProvider).handleSecondaryContextualization(contextualWrapper, null);
    }

    @Test
    public void testSerializeWithNonNullDelegate() throws Exception {
        Object value = new Object();
        Object converted = "converted";
        when(mockConverter.convert(value)).thenReturn(converted);
        when(mockDelegateSerializer.isEmpty(converted)).thenReturn(false);
        serializer.serialize(value, mockGen, mockProvider);
        verify(mockDelegateSerializer).serialize(converted, mockGen, mockProvider);
    }

    @Test
    public void testSerializeWithNullDelegate() throws Exception {
        Object value = new Object();
        when(mockConverter.convert(value)).thenReturn(null);
        serializer.serialize(value, mockGen, mockProvider);
        verify(mockProvider).defaultSerializeNull(mockGen);
    }

    @Test
    public void testSerializeWithNullValue() throws Exception {
        Object value = null;
        when(mockConverter.convert(value)).thenReturn(null);
        serializer.serialize(value, mockGen, mockProvider);
        verify(mockProvider).defaultSerializeNull(mockGen);
    }

    @Test
    public void testSerializeWithType() throws Exception {
        Object value = new Object();
        Object converted = "converted";
        TypeSerializer typeSer = Mockito.mock(TypeSerializer.class);
        when(mockConverter.convert(value)).thenReturn(converted);
        serializer.serializeWithType(value, mockGen, mockProvider, typeSer);
        verify(mockDelegateSerializer).serializeWithType(converted, mockGen, mockProvider, typeSer);
    }

    @Test
    public void testIsEmptyDeprecated() {
        Object value = new Object();
        Object converted = "data";
        when(mockConverter.convert(value)).thenReturn(converted);
        when(mockDelegateSerializer.isEmpty(converted)).thenReturn(true);
        assertTrue(serializer.isEmpty(value));
    }

    @Test
    public void testIsEmptyNotDeprecated() {
        Object value = new Object();
        Object converted = "data";
        when(mockConverter.convert(value)).thenReturn(converted);
        when(mockDelegateSerializer.isEmpty(mockProvider, converted)).thenReturn(false);
        assertFalse(serializer.isEmpty(mockProvider, value));
    }

    @Test
    public void testGetSchemaWhenDelegateSchemaAware() throws Exception {
        SchemaAware aware = Mockito.mock(SchemaAware.class);
        ObjectNode expected = JsonNodeFactory.instance.objectNode();
        when(aware.getSchema(mockProvider, null)).thenReturn(expected);
        StdDelegatingSerializer s = new StdDelegatingSerializer(mockConverter, mockDelegateType, (JsonSerializer<Object>) aware);
        JsonNode result = s.getSchema(mockProvider, null);
        assertSame(expected, result);
    }

    @Test
    public void testGetSchemaWhenDelegateNotSchemaAware() throws Exception {
        JsonNode result = serializer.getSchema(mockProvider, null);
        assertNotNull(result);
        assertTrue(result.isObject());
    }

    @Test
    public void testGetSchemaWithOptionalWhenDelegateSchemaAware() throws Exception {
        SchemaAware aware = Mockito.mock(SchemaAware.class);
        ObjectNode expected = JsonNodeFactory.instance.objectNode();
        Type typeHint = Mockito.mock(Type.class);
        when(aware.getSchema(mockProvider, typeHint, true)).thenReturn(expected);
        StdDelegatingSerializer s = new StdDelegatingSerializer(mockConverter, mockDelegateType, (JsonSerializer<Object>) aware);
        JsonNode result = s.getSchema(mockProvider, typeHint, true);
        assertSame(expected, result);
    }

    @Test
    public void testGetSchemaWithOptionalWhenDelegateNotSchemaAware() throws Exception {
        JsonNode result = serializer.getSchema(mockProvider, null, false);
        assertNotNull(result);
        assertTrue(result.isObject());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        JsonFormatVisitorWrapper visitor = Mockito.mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = Mockito.mock(JavaType.class);
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        verify(mockDelegateSerializer).acceptJsonFormatVisitor(visitor, typeHint);
    }

    @Test
    public void testConvertValue() {
        Object source = new Object();
        Object converted = "result";
        when(mockConverter.convert(source)).thenReturn(converted);
        assertEquals(converted, serializer.convertValue(source));
    }

    @Test
    public void testGetConverter() {
        assertSame(mockConverter, serializer.getConverter());
    }
}