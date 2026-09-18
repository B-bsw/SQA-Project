package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private JsonGenerator jgen;
    private SerializerProvider provider;

    @Before
    public void setUp() {
        serializer = new StdKeySerializer();
        jgen = mock(JsonGenerator.class);
        provider = mock(SerializerProvider.class);
    }

    // ---------- serialize() tests ----------

    @Test
    public void testSerialize_StringValue_NormalCase() throws IOException {
        serializer.serialize("hello", jgen, provider);
        verify(jgen, times(1)).writeFieldName("hello");
        verify(provider, never()).defaultSerializeDateKey(any(Date.class), any(JsonGenerator.class));
    }

    @Test
    public void testSerialize_IntegerValue_ToStringConversion() throws IOException {
        Integer value = Integer.valueOf(123);
        serializer.serialize(value, jgen, provider);
        verify(jgen, times(1)).writeFieldName("123");
    }

    @Test
    public void testSerialize_EmptyStringValue_BoundaryCase() throws IOException {
        serializer.serialize("", jgen, provider);
        verify(jgen, times(1)).writeFieldName("");
    }

    @Test
    public void testSerialize_DateValue_DelegatesToProvider() throws IOException {
        Date dateValue = new Date(0L);
        serializer.serialize(dateValue, jgen, provider);

        verify(provider, times(1)).defaultSerializeDateKey(eq(dateValue), eq(jgen));
        verify(jgen, never()).writeFieldName(anyString());
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_NullValue_ThrowsException() throws IOException {
        serializer.serialize(null, jgen, provider);
    }

    @Test
    public void testSerialize_CustomObjectValue_UsesToString() throws IOException {
        Object customObject = new Object() {
            @Override
            public String toString() {
                return "customToString";
            }
        };
        serializer.serialize(customObject, jgen, provider);
        verify(jgen, times(1)).writeFieldName("customToString");
    }

    // ---------- getSchema() tests ----------

    @Test
    public void testGetSchema_ReturnsStringTypeNode() throws JsonMappingException {
        JsonNode node = serializer.getSchema(provider, null);
        assertNotNull(node);
        assertTrue(node.has("type"));
        assertEquals("string", node.get("type").asText());
    }

    @Test
    public void testGetSchema_WithTypeHint_StillReturnsStringNode() throws JsonMappingException {
        JsonNode node = serializer.getSchema(provider, String.class);
        assertNotNull(node);
        assertEquals("string", node.get("type").asText());
    }

    // ---------- acceptJsonFormatVisitor() tests ----------

    @Test
    public void testAcceptJsonFormatVisitor_CallsExpectStringFormat() throws JsonMappingException {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);

        serializer.acceptJsonFormatVisitor(visitor, typeHint);

        verify(visitor, times(1)).expectStringFormat(typeHint);
    }

    @Test
    public void testAcceptJsonFormatVisitor_NullTypeHint() throws JsonMappingException {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);

        serializer.acceptJsonFormatVisitor(visitor, null);

        verify(visitor, times(1)).expectStringFormat(null);
    }
}