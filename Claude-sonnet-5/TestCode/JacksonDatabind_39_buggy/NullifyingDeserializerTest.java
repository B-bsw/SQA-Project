package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NullifyingDeserializerTest {

    private JsonParser mockParser;
    private DeserializationContext mockContext;
    private TypeDeserializer mockTypeDeserializer;
    private NullifyingDeserializer deserializer;

    @Before
    public void setUp() {
        mockParser = mock(JsonParser.class);
        mockContext = mock(DeserializationContext.class);
        mockTypeDeserializer = mock(TypeDeserializer.class);
        deserializer = new NullifyingDeserializer();
    }

    // ---------------------------------------------------------
    // Tests for constructor / singleton instance
    // ---------------------------------------------------------

    @Test
    public void testHandledType_isObjectClass() {
        assertEquals(Object.class, deserializer.handledType());
    }

    @Test
    public void testStaticInstance_isNotNull() {
        assertNotNull(NullifyingDeserializer.instance);
    }

    @Test
    public void testStaticInstance_isSameTypeAsConstructedOne() {
        assertEquals(NullifyingDeserializer.instance.handledType(), deserializer.handledType());
    }

    // ---------------------------------------------------------
    // Tests for deserialize()
    // ---------------------------------------------------------

    @Test
    public void testDeserialize_returnsNull() throws IOException {
        Object result = deserializer.deserialize(mockParser, mockContext);
        assertNull(result);
    }

    @Test
    public void testDeserialize_callsSkipChildrenOnce() throws IOException {
        deserializer.deserialize(mockParser, mockContext);
        verify(mockParser, times(1)).skipChildren();
    }

    @Test
    public void testDeserialize_withMultipleCalls_skipChildrenCalledEachTime() throws IOException {
        deserializer.deserialize(mockParser, mockContext);
        deserializer.deserialize(mockParser, mockContext);
        deserializer.deserialize(mockParser, mockContext);
        verify(mockParser, times(3)).skipChildren();
    }

    @Test(expected = IOException.class)
    public void testDeserialize_propagatesIOExceptionFromSkipChildren() throws IOException {
        when(mockParser.skipChildren()).thenThrow(new IOException("boom"));
        deserializer.deserialize(mockParser, mockContext);
    }

    @Test
    public void testDeserialize_withNullContext_stillWorks() throws IOException {
        Object result = deserializer.deserialize(mockParser, null);
        assertNull(result);
        verify(mockParser, times(1)).skipChildren();
    }

    // ---------------------------------------------------------
    // Tests for deserializeWithType()
    // ---------------------------------------------------------

    @Test
    public void testDeserializeWithType_startArray_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_ARRAY);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertSame(expected, result);
        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
    }

    @Test
    public void testDeserializeWithType_startObject_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_START_OBJECT);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertSame(expected, result);
        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
    }

    @Test
    public void testDeserializeWithType_fieldName_delegatesToTypeDeserializer() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_FIELD_NAME);
        Object expected = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext)).thenReturn(expected);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertSame(expected, result);
        verify(mockTypeDeserializer, times(1)).deserializeTypedFromAny(mockParser, mockContext);
    }

    @Test
    public void testDeserializeWithType_defaultToken_returnsNullWithoutDelegating() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_STRING);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertNull(result);
        verify(mockTypeDeserializer, never()).deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserializeWithType_nullToken_returnsNullWithoutDelegating() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_NULL);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertNull(result);
        verify(mockTypeDeserializer, never()).deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserializeWithType_endObjectToken_returnsNullWithoutDelegating() throws IOException {
        when(mockParser.getCurrentTokenId()).thenReturn(JsonTokenId.ID_END_OBJECT);

        Object result = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertNull(result);
        verify(mockTypeDeserializer, never()).deserializeTypedFromAny(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserializeWithType_multipleCallsWithDifferentTokens() throws IOException {
        when(mockParser.getCurrentTokenId())
                .thenReturn(JsonTokenId.ID_START_ARRAY)
                .thenReturn(JsonTokenId.ID_STRING)
                .thenReturn(JsonTokenId.ID_FIELD_NAME);

        Object expected1 = new Object();
        Object expected3 = new Object();
        when(mockTypeDeserializer.deserializeTypedFromAny(mockParser, mockContext))
                .thenReturn(expected1)
                .thenReturn(expected3);

        Object result1 = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);
        Object result2 = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);
        Object result3 = deserializer.deserializeWithType(mockParser, mockContext, mockTypeDeserializer);

        assertSame(expected1, result1);
        assertNull(result2);
        assertSame(expected3, result3);

        verify(mockTypeDeserializer, times(2)).deserializeTypedFromAny(mockParser, mockContext);
    }
}