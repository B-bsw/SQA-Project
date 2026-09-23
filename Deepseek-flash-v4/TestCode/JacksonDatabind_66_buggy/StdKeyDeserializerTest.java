package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import org.junit.Test;

public class StdKeyDeserializerTest {

    @Test
    public void testForTypeSupportedTypes() {
        assertNotNull(StdKeyDeserializer.forType(String.class));
        assertNotNull(StdKeyDeserializer.forType(Object.class));
        assertNotNull(StdKeyDeserializer.forType(Boolean.class));
        assertNotNull(StdKeyDeserializer.forType(Byte.class));
        assertNotNull(StdKeyDeserializer.forType(Short.class));
        assertNotNull(StdKeyDeserializer.forType(Character.class));
        assertNotNull(StdKeyDeserializer.forType(Integer.class));
        assertNotNull(StdKeyDeserializer.forType(Long.class));
        assertNotNull(StdKeyDeserializer.forType(Float.class));
        assertNotNull(StdKeyDeserializer.forType(Double.class));
        assertNotNull(StdKeyDeserializer.forType(UUID.class));
        assertNotNull(StdKeyDeserializer.forType(URI.class));
        assertNotNull(StdKeyDeserializer.forType(URL.class));
        assertNotNull(StdKeyDeserializer.forType(Date.class));
        assertNotNull(StdKeyDeserializer.forType(Calendar.class));
        assertNotNull(StdKeyDeserializer.forType(Class.class));
        assertNotNull(StdKeyDeserializer.forType(Locale.class));
        assertNotNull(StdKeyDeserializer.forType(Currency.class));
        assertNull(StdKeyDeserializer.forType(StringBuilder.class));
    }

    @Test
    public void testGetKeyClass() {
        assertSame(String.class, StdKeyDeserializer.forType(String.class).getKeyClass());
        assertSame(Integer.class, StdKeyDeserializer.forType(Integer.class).getKeyClass());
        assertSame(Locale.class, StdKeyDeserializer.forType(Locale.class).getKeyClass());
    }

    @Test
    public void testStringKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        assertEquals("plain", kd.deserializeKey("plain", null));
        assertEquals("", kd.deserializeKey("", null));
        assertNull(kd.deserializeKey(null, null));
        assertEquals("obj", StdKeyDeserializer.forType(Object.class).deserializeKey("obj", null));
    }

    @Test
    public void testIntegerKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertEquals(Integer.valueOf(0), kd.deserializeKey("0", null));
        assertEquals(Integer.valueOf(42), kd.deserializeKey("42", null));
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), kd.deserializeKey("-2147483648", null));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), kd.deserializeKey("2147483647", null));
    }

    @Test
    public void testIntegerKeyParseException() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        try {
            kd._parse("not-an-int", null);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testLongKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertEquals(Long.valueOf(0L), kd.deserializeKey("0", null));
        assertEquals(Long.valueOf(Long.MIN_VALUE), kd.deserializeKey("-9223372036854775808", null));
        assertEquals(Long.valueOf(Long.MAX_VALUE), kd.deserializeKey("9223372036854775807", null));
    }

    @Test
    public void testBooleanKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertEquals(Boolean.TRUE, kd.deserializeKey("true", null));
        assertEquals(Boolean.FALSE, kd.deserializeKey("false", null));
    }

    @Test
    public void testByteKeyDeserializationWithUnsignedSupport() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        assertEquals(Byte.valueOf((byte) 0), kd.deserializeKey("0", null));
        assertEquals(Byte.valueOf((byte) 127), kd.deserializeKey("127", null));
        assertEquals(Byte.valueOf((byte) 128), kd.deserializeKey("128", null));
        assertEquals(Byte.valueOf((byte) 255), kd.deserializeKey("255", null));
    }

    @Test
    public void testShortKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        assertEquals(Short.valueOf((short) -32768), kd.deserializeKey("-32768", null));
        assertEquals(Short.valueOf((short) 32767), kd.deserializeKey("32767", null));
    }

    @Test
    public void testCharacterKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('x'), kd.deserializeKey("x", null));
    }

    @Test
    public void testFloatKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertEquals(Float.valueOf(1.5f), kd.deserializeKey("1.5", null));
    }

    @Test
    public void testDoubleKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertEquals(Double.valueOf(-2.25), kd.deserializeKey("-2.25", null));
    }

    @Test
    public void testUriKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        assertEquals(URI.create("http://example.com/x"), kd.deserializeKey("http://example.com/x", null));
    }

    @Test
    public void testUrlKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        assertEquals(new URL("http://example.com/x"), kd.deserializeKey("http://example.com/x", null));
    }

    @Test
    public void testUuidKeyDeserialization() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        assertEquals(uuid, kd.deserializeKey(uuid.toString(), null));
    }

    @Test
    public void testNullKeyReturnsNullForNonString() throws Exception {
        assertNull(StdKeyDeserializer.forType(Integer.class).deserializeKey(null, null));
        assertNull(StdKeyDeserializer.forType(UUID.class).deserializeKey(null, null));
    }

    @Test
    public void testUnknownKindThrowsIllegalState() throws Exception {
        StdKeyDeserializer kd = new StdKeyDeserializer(999, String.class);
        try {
            kd._parse("x", null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Internal error: unknown key type class java.lang.String", e.getMessage());
        }
    }
}