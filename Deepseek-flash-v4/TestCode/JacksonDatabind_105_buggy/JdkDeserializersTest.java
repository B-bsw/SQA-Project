package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonDeserializer;

public class JdkDeserializersTest {

    @Test
    public void testFindWithKnownClassNameAndNonNullDeserializer() {
        JsonDeserializer<?> result = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull(result);
        assertTrue(result instanceof UUIDDeserializer);
    }

    @Test
    public void testFindWithKnownClassNameForAtomicBoolean() {
        JsonDeserializer<?> result = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(result);
        assertTrue(result instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void testFindWithKnownClassNameForByteBuffer() {
        JsonDeserializer<?> result = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(result);
        assertTrue(result instanceof ByteBufferDeserializer);
    }

    @Test
    public void testFindWithKnownClassNameForStackTraceElement() {
        JsonDeserializer<?> result = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(result);
        assertTrue(result instanceof StackTraceElementDeserializer);
    }

    @Test
    public void testFindWithKnownClassNameButNoSpecificDeserializer() {
        JsonDeserializer<?> result = JdkDeserializers.find(StackTraceElement.class, "java.lang.StackTraceElement");
        assertNotNull(result);
    }

    @Test
    public void testFindWithUnknownClassName() {
        JsonDeserializer<?> result = JdkDeserializers.find(String.class, "java.lang.String");
        assertNull(result);
    }

    @Test
    public void testFindWithNullClassAndNullName() {
        JsonDeserializer<?> result = JdkDeserializers.find(null, null);
        assertNull(result);
    }

    @Test
    public void testFindWithKnownClassButUnknownName() {
        JsonDeserializer<?> result = JdkDeserializers.find(UUID.class, "java.util.UUID");
        assertNull(result);
    }

    @Test
    public void testFindWithUUIDClassName() {
        JsonDeserializer<?> result = JdkDeserializers.find(UUID.class, "com.fasterxml.jackson.databind.deser.std.JdkDeserializersTest");
        assertNull(result);
    }
}