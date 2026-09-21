package com.fasterxml.jackson.databind.ser.impl;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class WritableObjectIdTest {

    private ObjectIdGenerator<?> generatorMock;
    private JsonGenerator genMock;
    private SerializerProvider providerMock;
    private JsonSerializer<Object> serializerMock;
    private WritableObjectId woid;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        generatorMock = mock(ObjectIdGenerator.class);
        genMock = mock(JsonGenerator.class);
        providerMock = mock(SerializerProvider.class);
        serializerMock = mock(JsonSerializer.class);
        woid = new WritableObjectId(generatorMock);
    }

    @Test
    public void testConstructor() {
        assertSame(generatorMock, woid.generator);
        assertNull(woid.id);
        assertFalse(woid.idWritten);
    }

    @Test
    public void testGenerateId() {
        Object pojo = new Object();
        Object generated = "gen-id-1";
        when(((ObjectIdGenerator<Object>) generatorMock).generateId(pojo)).thenReturn(generated);

        Object result = woid.generateId(pojo);

        assertEquals(generated, result);
        assertEquals(generated, woid.id);
        verify(generatorMock, times(1)).generateId(pojo);
    }

    @Test
    public void testGenerateId_MultipleCalls_LastOneWins() {
        Object pojo1 = new Object();
        Object pojo2 = new Object();
        when(((ObjectIdGenerator<Object>) generatorMock).generateId(pojo1)).thenReturn("first-id");
        when(((ObjectIdGenerator<Object>) generatorMock).generateId(pojo2)).thenReturn("second-id");

        woid.generateId(pojo1);
        Object result = woid.generateId(pojo2);

        assertEquals("second-id", result);
        assertEquals("second-id", woid.id);
        verify(generatorMock, times(1)).generateId(pojo1);
        verify(generatorMock, times(1)).generateId(pojo2);
    }

    @Test
    public void testWriteAsId_NullId_ReturnsFalse() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, false, serializerMock);
        woid.id = null;

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertFalse(result);
        verifyNoMoreInteractions(genMock);
        verifyNoMoreInteractions(serializerMock);
    }

    @Test
    public void testWriteAsId_NullId_IdWrittenTrue_ReturnsFalse() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, false, serializerMock);
        woid.id = null;
        woid.idWritten = true;

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertFalse(result);
        verifyNoMoreInteractions(genMock);
        verifyNoMoreInteractions(serializerMock);
    }

    @Test
    public void testWriteAsId_IdPresent_NotWrittenNotAlwaysAsId_ReturnsFalse() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, false, serializerMock);
        woid.id = "abc";
        // idWritten default false, alwaysAsId false

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertFalse(result);
        verifyNoMoreInteractions(genMock);
        verifyNoMoreInteractions(serializerMock);
    }

    @Test
    public void testWriteAsId_NativeObjectId_ReturnsTrue() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, true, serializerMock);
        woid.id = "abc123";
        when(genMock.canWriteObjectId()).thenReturn(true);

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertTrue(result);
        verify(genMock, times(1)).writeObjectRef("abc123");
        verify(serializerMock, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testWriteAsId_NonNativeObjectId_UsesSerializer() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, true, serializerMock);
        woid.id = "abc123";
        when(genMock.canWriteObjectId()).thenReturn(false);

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertTrue(result);
        verify(serializerMock, times(1)).serialize(eq("abc123"), eq(genMock), eq(providerMock));
        verify(genMock, never()).writeObjectRef(anyString());
    }

    @Test
    public void testWriteAsId_IdWrittenTrue_AlwaysAsIdFalse_ReturnsTrue() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, false, serializerMock);
        woid.id = "xyz";
        woid.idWritten = true;
        when(genMock.canWriteObjectId()).thenReturn(true);

        boolean result = woid.writeAsId(genMock, providerMock, w);

        assertTrue(result);
        verify(genMock, times(1)).writeObjectRef("xyz");
    }

    @Test
    public void testWriteAsField_NativeObjectId() throws IOException {
        ObjectIdWriter w = ObjectIdWriter.forBeanProperty(null, new SerializedString("id"), generatorMock, false, serializerMock);
        woid.id = "id-1";
        when(genMock.canWriteObjectId()).thenReturn(true);

        woid.writeAsField(genMock, providerMock, w);

        assertTrue(woid.idWritten);
        verify(genMock, times(1)).writeObjectId("id-1");
        verify(genMock, never()).write