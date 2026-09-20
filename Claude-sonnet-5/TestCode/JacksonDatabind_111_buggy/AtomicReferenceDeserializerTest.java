package com.fasterxml.jackson.databind.deser.std;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

import static org.junit.Assert.*;

public class AtomicReferenceDeserializerTest {

    private JavaType fullType;
    private AtomicReferenceDeserializer deserializer;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType contentType = tf.constructType(Object.class);
        fullType = tf.constructReferenceType(AtomicReference.class, contentType);
        deserializer = new AtomicReferenceDeserializer(fullType, null, null, null);
    }

    @Test
    public void testConstructorStoresFullType() {
        assertEquals(fullType, deserializer._fullType);
        assertNull(deserializer._valueInstantiator);
    }

    @Test
    public void testWithResolvedReturnsNewInstanceWithSameFullType() {
        ValueInstantiator inst = null;
        TypeDeserializer typeDeser = null;
        JsonDeserializer<?> valueDeser = null;

        AtomicReferenceDeserializer resolved = deserializer.withResolved(typeDeser, valueDeser);

        assertNotNull(resolved);
        assertNotSame(deserializer, resolved);
        assertEquals(fullType, resolved._fullType);
        assertNull(resolved._valueInstantiator);
    }

    @Test
    public void testGetNullValueReturnsEmptyAtomicReference() throws Exception {
        DeserializationContext ctxt = null;
        AtomicReference<Object> result = deserializer.getNullValue(ctxt);

        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testGetEmptyValueReturnsAtomicReferenceInstance() {
        DeserializationContext ctxt = null;
        Object result = deserializer.getEmptyValue(ctxt);

        assertNotNull(result);
        assertTrue(result instanceof AtomicReference);
        AtomicReference<?> ref = (AtomicReference<?>) result;
        assertNull(ref.get());
    }

    @Test
    public void testReferenceValueWithNonNullContent() {
        String content = "hello";
        AtomicReference<Object> ref = deserializer.referenceValue(content);

        assertNotNull(ref);
        assertEquals(content, ref.get());
    }

    @Test
    public void testReferenceValueWithNullContent() {
        AtomicReference<Object> ref = deserializer.referenceValue(null);

        assertNotNull(ref);
        assertNull(ref.get());
    }

    @Test
    public void testGetReferencedWithNonNullValue() {
        AtomicReference<Object> ref = new AtomicReference<Object>