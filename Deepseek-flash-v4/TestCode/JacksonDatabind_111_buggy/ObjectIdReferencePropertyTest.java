package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.PropertyReferring;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;

public class ObjectIdReferencePropertyTest {

    private SettableBeanProperty forward;
    private ObjectIdInfo objectIdInfo;
    private JsonDeserializer<Object> deser;
    private NullValueProvider nullProvider;
    private ObjectIdReferenceProperty property;

    @Before
    public void setUp() {
        forward = mock(SettableBeanProperty.class);
        objectIdInfo = mock(ObjectIdInfo.class);
        deser = mock(JsonDeserializer.class);
        nullProvider = mock(NullValueProvider.class);
        property = new ObjectIdReferenceProperty(forward, objectIdInfo);
    }

    @Test
    public void testConstructorWithForwardAndObjectIdInfo() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        assertNotNull(prop);
    }

    @Test
    public void testConstructorWithDeserializer() {
        ObjectIdReferenceProperty src = new ObjectIdReferenceProperty(forward, objectIdInfo);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(src, deser, nullProvider);
        assertNotNull(prop);
    }

    @Test
    public void testConstructorWithName() {
        ObjectIdReferenceProperty src = new ObjectIdReferenceProperty(forward, objectIdInfo);
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(src, new PropertyName("test"));
        assertNotNull(prop);
    }

    @Test
    public void testWithName() {
        ObjectIdReferenceProperty result = (ObjectIdReferenceProperty) property.withName(new PropertyName("newName"));
        assertNotNull(result);
    }

    @Test
    public void testWithValueDeserializer() {
        ObjectIdReferenceProperty result = (ObjectIdReferenceProperty) property.withValueDeserializer(deser);
        assertNotNull(result);
    }

    @Test
    public void testWithValueDeserializerSameInstance() {
        ObjectIdReferenceProperty result = (ObjectIdReferenceProperty) property.withValueDeserializer(property._valueDeserializer);
        assertSame(property, result);
    }

    @Test
    public void testWithNullProvider() {
        ObjectIdReferenceProperty result = (ObjectIdReferenceProperty) property.withNullProvider(nullProvider);
        assertNotNull(result);
    }

    @Test
    public void testFixAccess() {
        DeserializationConfig config = mock(DeserializationConfig.class);
        property.fixAccess(config);
        verify(forward).fixAccess(config);
    }

    @Test
    public void testGetAnnotation() {
        Annotation annotation = mock(Annotation.class);
        when(forward.getAnnotation(annotation.annotationType())).thenReturn(annotation);
        assertEquals(annotation, property.getAnnotation(annotation.annotationType()));
    }

    @Test
    public void testGetMember() {
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(forward.getMember()).thenReturn(member);
        assertEquals(member, property.getMember());
    }

    @Test
    public void testGetCreatorIndex() {
        when(forward.getCreatorIndex()).thenReturn(42);
        assertEquals(42, property.getCreatorIndex());
    }

    @Test
    public void testDeserializeAndSet() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        when(property.deserialize(p, ctxt)).thenReturn(new Object());
        property.deserializeAndSet(p, ctxt, instance);
        verify(forward).set(eq(instance), any());
    }

    @Test
    public void testDeserializeSetAndReturnNoIdentityInfo() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, null);
        when(prop.deserialize(p, ctxt)).thenThrow(new UnresolvedForwardReference("ref", p));
        when(ctxt.getConfig()).thenReturn(mock(DeserializationConfig.class));
        try {
            prop.deserializeSetAndReturn(p, ctxt, instance);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testDeserializeSetAndReturnWithIdentityInfo() throws IOException {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        UnresolvedForwardReference reference = new UnresolvedForwardReference("ref", p);
        ReadableObjectId.Reading reading = mock(ReadableObjectId.Reading.class);
        when(reference.getRoid()).thenReturn(reading);
        when(prop.deserialize(p, ctxt)).thenThrow(reference);
        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);
        assertNull(result);
        verify(reading).appendReferring(any(PropertyReferring.class));
    }

    @Test
    public void testSet() throws IOException {
        Object instance = new Object();
        Object value = new Object();
        property.set(instance, value);
        verify(forward).set(instance, value);
    }

    @Test
    public void testSetAndReturn() throws IOException {
        Object instance = new Object();
        Object value = new Object();
        when(forward.setAndReturn(instance, value)).thenReturn(value);
        assertEquals(value, property.setAndReturn(instance, value));
    }

    @Test
    public void testPropertyReferringHandleResolvedForwardReference() throws IOException {
        ObjectIdReferenceProperty parent = mock(ObjectIdReferenceProperty.class);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        Class<?> type = Object.class;
        Object pojo = new Object();
        PropertyReferring referring = new PropertyReferring(parent, ref, type, pojo);
        Object id = new Object();
        Object value = new Object();
        when(ref.hasId(id)).thenReturn(true);
        referring.handleResolvedForwardReference(id, value);
        verify(parent).set(pojo, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyReferringHandleResolvedForwardReferenceInvalidId() throws IOException {
        ObjectIdReferenceProperty parent = mock(ObjectIdReferenceProperty.class);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        Class<?> type = Object.class;
        Object pojo = new Object();
        PropertyReferring referring = new PropertyReferring(parent, ref, type, pojo);
        Object id = new Object();
        when(ref.hasId(id)).thenReturn(false);
        referring.handleResolvedForwardReference(id, new Object());
    }
}