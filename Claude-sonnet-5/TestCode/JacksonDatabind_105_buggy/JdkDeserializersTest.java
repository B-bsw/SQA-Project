package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonDeserializer;

public class JdkDeserializersTest
{
    // ---- Normal cases: known special-cased types ----

    @Test
    public void testFindUUID()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof UUIDDeserializer);
    }

    @Test
    public void testFindAtomicBoolean()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void testFindStackTraceElement()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof StackTraceElementDeserializer);
    }

    @Test
    public void testFindByteBuffer()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof ByteBufferDeserializer);
    }

    // ---- Normal case: type coming from FromStringDeserializer.types() ----

    @Test
    public void testFindFromStringDeserializerType()
    {
        // File is one of the types registered via FromStringDeserializer.types()
        JsonDeserializer<?> deser = JdkDeserializers.find(File.class, File.class.getName());
        assertNotNull(deser);
    }

    // ---- Boundary / edge cases ----

    @Test
    public void testFindWithUnknownClassName()
    {
        // Not present in the registered class-name set at all -> should return null
        JsonDeserializer<?> deser = JdkDeserializers.find(Integer.class, Integer.class.getName());
        assertNull(deser);
    }

    @Test
    public void testFindWithEmptyClassName()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(UUID.class, "");
        assertNull(deser);
    }

    @Test
    public void testFindWithNullClassName()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(UUID.class, null);
        assertNull(deser);
    }

    // ---- Exception / mismatch path: clsName matches set but rawType does not correspond ----

    @Test
    public void testFindWithMismatchedRawTypeAndClassName()
    {
        // clsName matches one of the registered names (UUID), but rawType is unrelated (String)
        // FromStringDeserializer.findDeserializer(String.class) should return null,
        // and none of the rawType == X.class checks will match, so overall result is null.
        JsonDeserializer<?> deser = JdkDeserializers.find(String.class, UUID.class.getName());
        assertNull(deser);
    }

    @Test
    public void testFindWithMismatchedRawTypeAtomicBoolean()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(Object.class, AtomicBoolean.class.getName());
        assertNull(deser);
    }

    @Test
    public void testFindWithMismatchedRawTypeStackTraceElement()
    {
        JsonDeserializer<?> deser = JdkDeserializers.find(Object.class, StackTraceElement.class.getName());
        assertNull(deser);
    }

    @