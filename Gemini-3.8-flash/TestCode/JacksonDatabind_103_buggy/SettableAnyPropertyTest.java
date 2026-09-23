package com.fasterxml.jackson.databind.deser;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class SettableAnyPropertyTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWithValueDeserializerReturnsNewInstance() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        JsonDeserializer<Object> newDeser = mock(JsonDeserializer.class);
        SettableAnyProperty result = sap.withValueDeserializer(newDeser);

        assertNotNull(result);
        assertNotSame(sap, result);
        assertEquals(newDeser, result._valueDeserializer);
        assertEquals(sap._property, result._property);
        assertEquals(sap._setter, result._setter);
        assertEquals(sap._type, result._type);
        assertEquals(sap._keyDeserializer, result._keyDeserializer);
    }

    @Test
    public void testHasValueDeserializerReturnsTrueWhenPresent() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        assertTrue(sap.hasValueDeserializer());
    }

    @Test
    public void testHasValueDeserializerReturnsFalseWhenNull() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, null, null);

        assertFalse(sap.hasValueDeserializer());
    }

    @Test
    public void testGetType() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        assertEquals(type, sap.getType());
    }

    @Test
    public void testGetProperty() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        assertEquals(property, sap.getProperty());
    }

    @Test
    public void testDeserializeAndSetWithFieldSetter() throws Exception {
        Map<Object, Object> map = new HashMap<>();
        AnnotatedField field = mock(AnnotatedField.class);
        when(field.getValue(any())).thenReturn(map);
        when(field.getDeclaringClass()).thenReturn(Object.class);
        when(field.getAnnotated()).thenReturn(Object.class);

        BeanProperty property = mock(BeanProperty.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object value = new Object();
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn(value);

        SettableAnyProperty sap = new SettableAnyProperty(property, field, type, null, deser, null);

        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        String propName = "prop";

        sap.deserializeAndSet(parser, ctxt, instance, propName);

        assertEquals(value, map.get(propName));
    }

    @Test
    public void testDeserializeAndSetWithMethodSetter() throws Exception {
        AnnotatedMethod method = mock(AnnotatedMethod.class);
        when(method.getDeclaringClass()).thenReturn(Object.class);
        when(method.getAnnotated()).thenReturn(Object.class);

        BeanProperty property = mock(BeanProperty.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object value = new Object();
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn(value);

        SettableAnyProperty sap = new SettableAnyProperty(property, method, type, null, deser, null);

        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object instance = new Object();
        String propName = "prop";

        sap.deserializeAndSet(parser, ctxt, instance, propName);

        verify(method).callOnWith(instance, propName, value);
    }

    @Test
    public void testDeserializeReturnsNullForNullToken() throws Exception {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object nullValue = new Object();
        when(deser.getNullValue(any(DeserializationContext.class))).thenReturn(nullValue);

        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        assertEquals(nullValue, sap.deserialize(parser, ctxt));
    }

    @Test
    public void testDeserializeWithValueTypeDeserializer() throws Exception {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        Object value = new Object();
        when(deser.deserializeWithType(any(JsonParser.class), any(DeserializationContext.class), any(TypeDeserializer.class))).thenReturn(value);

        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, null, deser, typeDeser);

        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        assertEquals(value, sap.deserialize(parser, ctxt));
        verify(deser).deserializeWithType(parser, ctxt, typeDeser);
    }

    @Test
    public void testDeserializeSimple() throws Exception {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMethod.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        Object value = new Object();
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenReturn(value);

        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        JsonParser parser = mock(JsonParser.class);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        assertEquals(value, sap.deserialize(parser, ctxt));
    }

    @Test
    public void testFixAccess() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMember.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        DeserializationConfig config = mock(DeserializationConfig.class);
        when(config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)).thenReturn(true);
        sap.fixAccess(config);

        verify(setter).fixAccess(true);
    }

    @Test
    public void testReadResolveWithValidSetter() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMember.class);
        when(setter.getAnnotated()).thenReturn(Object.class);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        assertEquals(sap, sap.readResolve());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolveWithMissingSetter() {
        BeanProperty property = mock(BeanProperty.class);
        AnnotatedMember setter = mock(AnnotatedMember.class);
        when(setter.getAnnotated()).thenReturn(null);
        JavaType type = mock(JavaType.class);
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        SettableAnyProperty sap = new SettableAnyProperty(property, setter, type, deser, null);

        sap.readResolve();
    }
}