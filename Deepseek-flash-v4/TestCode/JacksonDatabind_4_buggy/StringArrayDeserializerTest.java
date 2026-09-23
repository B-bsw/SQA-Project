package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StringArrayDeserializerTest {

    private StringArrayDeserializer deserializer;

    // Mock/Stub objects (Plain Java)
    private static class MockJsonParser implements JsonParser {
        private JsonToken currentToken;
        private JsonToken nextToken;
        private String textValue;
        private int nextTokenCount;

        @Override
        public JsonToken nextToken() throws IOException {
            if (nextTokenCount > 0) {
                nextTokenCount--;
                return nextToken;
            }
            return null;
        }

        @Override
        public JsonToken getCurrentToken() {
            return currentToken;
        }

        @Override
        public String getText() throws IOException {
            return textValue;
        }

        // Additional methods omitted for brevity (use only needed)
    }

    private static class MockDeserializationContext extends DeserializationContext {
        // Mock implementation (simplified)
        private final ObjectBuffer buffer = new ObjectBuffer();
        
        public MockDeserializationContext() {
            super(new DeserializationConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        @Override
        public ObjectBuffer leaseObjectBuffer() { return buffer; }

        @Override
        public void returnObjectBuffer(ObjectBuffer b) {}

        @Override
        public boolean isEnabled(DeserializationFeature feature) { return feature == DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY; }

        @Override
        public JsonMappingException mappingException(Class<?> valueClass) { return new JsonMappingException(null, "mapping"); }

        @Override
        public JsonDeserializer<?> findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType type, BeanProperty property) { return null; }

        @Override
        public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty property) { return deser; }

        @Override
        public JsonParser getParser() { return null; }
    }

    @Before
    public void setUp() {
        deserializer = new StringArrayDeserializer();
    }

    @Test
    public void testDeserializeNormal() throws Exception {
        MockJsonParser parser = new MockJsonParser();
        parser.currentToken = JsonToken.START_ARRAY;
        parser.nextToken = JsonToken.VALUE_STRING;
        parser.textValue = "abc";
        // Simulate nextToken() returning END_ARRAY after the string
        MockJsonParser innerParser = new MockJsonParser();
        innerParser.currentToken = JsonToken.VALUE_STRING;
        innerParser.textValue = "abc";

        // Simulate token sequence: START_ARRAY, VALUE_STRING, END_ARRAY
        // For simplicity, create a custom parser that responds appropriately
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(true);
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(mockParser.getText()).thenReturn("abc");

        MockDeserializationContext ctxt = new MockDeserializationContext();
        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("abc", result[0]);
        verify(mockParser, times(1)).isExpectedStartArrayToken();
        verify(mockParser, times(2)).nextToken();
        verify(mockParser, times(1)).getText();
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(true);
        when(mockParser.nextToken()).thenReturn(JsonToken.END_ARRAY);

        MockDeserializationContext ctxt = new MockDeserializationContext();
        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testDeserializeWithNulls() throws Exception {
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(true);
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_NULL, JsonToken.END_ARRAY);

        MockDeserializationContext ctxt = new MockDeserializationContext();
        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertNull(result[0]);
    }

    @Test
    public void testDeserializeNonArrayWithSingleValue() throws Exception {
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(false);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(mockParser.getText()).thenReturn("single");

        MockDeserializationContext ctxt = new MockDeserializationContext();
        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("single", result[0]);
    }

    @Test
    public void testDeserializeNonArrayNotAccepted() throws Exception {
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(false);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);

        // Create context that does NOT accept single value as array
        DeserializationContext ctxt = new MockDeserializationContext() {
            @Override
            public boolean isEnabled(DeserializationFeature feature) {
                return false;
            }
        };

        try {
            deserializer.deserialize(mockParser, ctxt);
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeCustom() throws Exception {
        deserializer = new StringArrayDeserializer(new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom";
            }

            @Override
            public String getNullValue() {
                return null;
            }
        });

        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.isExpectedStartArrayToken()).thenReturn(true);
        when(mockParser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(mockParser.getText()).thenReturn("orig");

        MockDeserializationContext ctxt = new MockDeserializationContext();
        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("custom", result[0]);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        StringArrayDeserializer d = new StringArrayDeserializer();
        JsonParser mockParser = mock(JsonParser.class);
        DeserializationContext ctxt = new MockDeserializationContext();
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);

        Object result = d.deserializeWithType(mockParser, ctxt, typeDeserializer);
        verify(typeDeserializer).deserializeTypedFromArray(mockParser, ctxt);
        assertNull(result);
    }

    @Test
    public void testCreateContextualWithDefaultDeserializer() throws Exception {
        StringArrayDeserializer d = new StringArrayDeserializer();
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findContextualValueDeserializer(any(), any())).thenReturn(null);
        when(ctxt.constructType(String.class)).thenReturn(null);

        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertNull(result);
    }

    @Test
    public void testCreateContextualWithCustomDeserializer() throws Exception {
        JsonDeserializer<String> custom = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom";
            }
        };

        StringArrayDeserializer d = new StringArrayDeserializer();
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.findContextualValueDeserializer(any(), any())).thenReturn(custom);
        
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertNotNull(result);
        assertTrue(result instanceof StringArrayDeserializer);
    }

    @Test
    public void testHandleNonArrayEmptyStringAsNull() throws Exception {
        JsonParser mockParser = mock(JsonParser.class);
        when(mockParser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(mockParser.getText()).thenReturn("");

        DeserializationContext ctxt = new MockDeserializationContext() {
            @Override
            public boolean isEnabled(DeserializationFeature feature) {
                return feature == DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
            }
        };

        String[] result = deserializer.deserialize(mockParser, ctxt);
        assertNull(result);
    }
}