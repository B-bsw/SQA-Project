package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

public class NullifyingDeserializerTest {

    private final NullifyingDeserializer deserializer = new NullifyingDeserializer();

    @Test
    public void testDeserialize_ShouldReturnNull_ForAnyToken() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        assertNull(deserializer.deserialize(p, ctxt));
        verify(p).skipChildren();
    }

    @Test
    public void testDeserialize_ShouldReturnNull_WhenParserNull() throws IOException {
        DeserializationContext ctxt = mock(DeserializationContext.class);
        assertNull(deserializer.deserialize(null, ctxt));
    }

    @Test
    public void testDeserializeWithType_ForStartArray_ShouldDelegateToTypeDeserializer() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
        Object expected = new Object();

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_ARRAY);
        when(typeDeserializer.deserializeTypedFromAny(p, ctxt)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer).deserializeTypedFromAny(p, ctxt);
    }

    @Test
    public void testDeserializeWithType_ForStartObject_ShouldDelegateToTypeDeserializer() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
        Object expected = new Object();

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        when(typeDeserializer.deserializeTypedFromAny(p, ctxt)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer).deserializeTypedFromAny(p, ctxt);
    }

    @Test
    public void testDeserializeWithType_ForFieldName_ShouldDelegateToTypeDeserializer() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
        Object expected = new Object();

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_FIELD_NAME);
        when(typeDeserializer.deserializeTypedFromAny(p, ctxt)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer).deserializeTypedFromAny(p, ctxt);
    }

    @Test
    public void testDeserializeWithType_ForDefaultCase_ShouldReturnNull() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_ARRAY); // some other token

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertNull(result);
        verify(typeDeserializer, never()).deserializeTypedFromAny(any(), any());
    }

    @Test
    public void testDeserializeWithType_ForNullToken_ShouldReturnNull() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NULL);

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertNull(result);
        verify(typeDeserializer, never()).deserializeTypedFromAny(any(), any());
    }

    @Test
    public void testDeserializeWithType_ForIdNotMapped_ShouldReturnNull() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);

        when(p.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NOT_AVAILABLE);

        Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

        assertNull(result);
        verify(typeDeserializer, never()).deserializeTypedFromAny(any(), any());
    }

    @Test
    public void testInstance_ShouldBeSingleton() {
        assertSame(NullifyingDeserializer.instance, new NullifyingDeserializer());
    }

    @Test
    public void testDeserializeWithType_ShouldHandleAllSwitchCasesCombinedInLoop() throws IOException {
        for (int tokenId : new int[]{JsonTokenId.ID_START_ARRAY, JsonTokenId.ID_START_OBJECT, JsonTokenId.ID_FIELD_NAME}) {
            JsonParser p = mock(JsonParser.class);
            DeserializationContext ctxt = mock(DeserializationContext.class);
            TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
            Object expected = new Object();

            when(p.getCurrentTokenId()).thenReturn(tokenId);
            when(typeDeserializer.deserializeTypedFromAny(p, ctxt)).thenReturn(expected);

            Object result = deserializer.deserializeWithType(p, ctxt, typeDeserializer);

            assertSame(expected, result);
            verify(typeDeserializer).deserializeTypedFromAny(p, ctxt);
            reset(p, ctxt, typeDeserializer);
        }
    }
}