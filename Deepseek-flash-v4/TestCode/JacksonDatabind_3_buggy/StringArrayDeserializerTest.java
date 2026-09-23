package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class StringArrayDeserializerTest {

    private StringArrayDeserializer deserializer;
    private JsonParser jp;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        deserializer = new StringArrayDeserializer();
        jp = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);
    }

    @Test
    public void testDeserialize_NormalCase_DefaultDeserializer() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn("a", "b", null);
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testDeserialize_WithNullElements() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_NULL, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn(null, "a", null);
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);
        when(ctxt.getConfig()).thenReturn(mock(com.fasterxml.jackson.databind.DeserializationConfig.class));

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{null, "a"}, result);
    }

    @Test
    public void testDeserialize_WithChunkExpansion() throws Exception {
        // Setup - Simulate multiple chunks
        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn("a", "b", "c", "d", "e", "f", null);
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);

        String[] result = deserializer.deserialize(jp, ctxt);

        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"}, result);
    }

    @Test
    public void testDeserialize_NotArray_WithFeatureEnabled() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(false);
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getText()).thenReturn("single");
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)).thenReturn(false);

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{"single"}, result);
    }

    @Test
    public void testDeserialize_NotArray_WithFeatureDisabled() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(false);
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getText()).thenReturn("single");
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)).thenReturn(false);
        when(ctxt.mappingException(String[].class)).thenReturn(new JsonMappingException("Mapping error"));

        // Execute & Verify Exception
        try {
            deserializer.deserialize(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testDeserialize_EmptyStringAsNullObject() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(false);
        when(jp.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(jp.getText()).thenReturn("");
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)).thenReturn(true);

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertNull(result);
    }

    @Test
    public void testDeserialize_CustomDeserializer() throws Exception {
        // Setup
        JsonDeserializer<String> customDeser = mock(JsonDeserializer.class);
        StringArrayDeserializer custom = new StringArrayDeserializer(customDeser);
        when(customDeser.getNullValue()).thenReturn("default");
        when(customDeser.deserialize(jp, ctxt)).thenReturn("custom");

        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.VALUE_NULL, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn("value", null, null);
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);

        // Execute
        String[] result = custom.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{"custom", "default"}, result);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        // Setup
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(typeDeser.deserializeTypedFromArray(jp, ctxt)).thenReturn(new String[]{"typed"});

        // Execute
        Object result = deserializer.deserializeWithType(jp, ctxt, typeDeser);

        // Verify
        assertArrayEquals(new String[]{"typed"}, (String[]) result);
    }

    @Test
    public void testCreateContextual_NoChange_WhenDefault() throws Exception {
        // Setup
        when(ctxt.constructType(String.class)).thenReturn(mock(com.fasterxml.jackson.databind.JavaType.class));
        when(ctxt.findContextualValueDeserializer(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);
        when(ctxt.handleSecondaryContextualization(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(null);

        // Execute
        JsonDeserializer<?> result = deserializer.createContextual(ctxt, null);

        // Verify - Since context is not finding any deserializer, it stays the same
        assertSame(deserializer, result);
    }

    @Test
    public void testCreateContextual_WithCustomDeserializer() throws Exception {
        // Setup
        JsonDeserializer<String> customDeser = mock(JsonDeserializer.class);
        when(ctxt.constructType(String.class)).thenReturn(mock(com.fasterxml.jackson.databind.JavaType.class));
        when(ctxt.findContextualValueDeserializer(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(customDeser);
        when(ctxt.handleSecondaryContextualization(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any())).thenReturn(customDeser);

        // Execute
        JsonDeserializer<?> result = deserializer.createContextual(ctxt, null);

        // Verify
        assertEquals(StringArrayDeserializer.class, result.getClass());
    }

    @Test
    public void testDeserialize_NullTokenInsideArray() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_NULL, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn(null, null);
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{null}, result);
    }

    @Test
    public void testDeserialize_NumberToken() throws Exception {
        // Setup
        when(jp.isExpectedStartArrayToken()).thenReturn(true);
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY);
        when(jp.getText()).thenReturn("123", null);
        when(jp.getValueAsString()).thenReturn("123");
        when(ctxt.leaseObjectBuffer()).thenReturn(new com.fasterxml.jackson.databind.util.ObjectBuffer());
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)).thenReturn(false);

        // Execute
        String[] result = deserializer.deserialize(jp, ctxt);

        // Verify
        assertArrayEquals(new String[]{"123"}, result);
    }
}