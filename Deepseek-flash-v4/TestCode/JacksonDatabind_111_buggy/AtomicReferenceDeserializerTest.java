package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDeserializerTest {
    private JavaType fullType;
    private ValueInstantiator instantiator;
    private TypeDeserializer typeDeserializer;
    private JsonDeserializer<Object> valueDeserializer;
    private DeserializationContext context;
    private DeserializationConfig config;
    private AtomicReferenceDeserializer deserializer;

    @Before
    public void setUp() {
        fullType = null;
        instantiator = null;
        typeDeserializer = null;
        valueDeserializer = null;
        context = null;
        config = null;
        deserializer = new AtomicReferenceDeserializer(fullType, instantiator, typeDeserializer, valueDeserializer);
    }

    @Test
    public void testWithResolved() {
        AtomicReferenceDeserializer result = deserializer.withResolved(typeDeserializer, valueDeserializer);
        assertNotNull(result);
        assertTrue(result instanceof AtomicReferenceDeserializer);
    }

    @Test
    public void testGetNullValue() throws JsonMappingException {
        AtomicReference<Object> result = deserializer.getNullValue(context);
        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testGetEmptyValue() {
        AtomicReference<Object> result = deserializer.getEmptyValue(context);
        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testReferenceValueWithContent() {
        Object content = new Object();
        AtomicReference<Object> result = deserializer.referenceValue(content);
        assertNotNull(result);
        assertSame(content, result.get());
    }

    @Test
    public void testReferenceValueWithNullContent() {
        AtomicReference<Object> result = deserializer.referenceValue(null);
        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testGetReferenced() {
        Object content = new Object();
        AtomicReference<Object> reference = new AtomicReference<>(content);
        assertSame(content, deserializer.getReferenced(reference));
    }

    @Test
    public void testGetReferencedWithNullReference() {
        assertNull(deserializer.getReferenced(null));
    }

    @Test
    public void testUpdateReference() {
        Object content = new Object();
        AtomicReference<Object> reference = new AtomicReference<>();
        AtomicReference<Object> result = deserializer.updateReference(reference, content);
        assertSame(content, result.get());
    }

    @Test
    public void testUpdateReferenceWithNullContent() {
        AtomicReference<Object> reference = new AtomicReference<>();
        AtomicReference<Object> result = deserializer.updateReference(reference, null);
        assertNull(result.get());
    }

    @Test
    public void testSupportsUpdate() {
        Boolean result = deserializer.supportsUpdate(config);
        assertTrue(result.booleanValue());
    }

    @Test
    public void testAllMethodsWithNonNullValues() {
        Object content1 = new Object();
        Object content2 = new Object();
        
        AtomicReference<Object> ref = deserializer.referenceValue(content1);
        assertSame(content1, deserializer.getReferenced(ref));
        
        deserializer.updateReference(ref, content2);
        assertSame(content2, deserializer.getReferenced(ref));
        
        AtomicReference<Object> nullValue = deserializer.getNullValue(null);
        assertNull(nullValue.get());
        
        assertNotNull(deserializer.supportsUpdate(null));
    }

    @Test
    public void testImmutableBehavior() {
        assertEquals(Boolean.TRUE, deserializer.supportsUpdate(config));
        
        Object content = new Object();
        AtomicReference<Object> ref = new AtomicReference<>(content);
        assertSame(content, ref.get());
        
        Object newContent = new Object();
        ref.set(newContent);
        assertSame(newContent, ref.get());
    }
}