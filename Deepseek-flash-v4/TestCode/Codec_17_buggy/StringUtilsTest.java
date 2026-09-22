package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.junit.Test;

public class StringUtilsTest {

    private static final String TEST_STRING = "Hello World";
    private static final byte[] TEST_STRING_UTF8 = TEST_STRING.getBytes(Charsets.UTF_8);
    private static final byte[] TEST_STRING_UTF16 = TEST_STRING.getBytes(Charsets.UTF_16);

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
        assertTrue(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abc")));
        assertFalse(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abcd")));
        assertTrue(StringUtils.equals("", ""));
    }

    @Test
    public void testGetByteBufferUtf8() {
        assertNull(StringUtils.getByteBufferUtf8(null));
        ByteBuffer result = StringUtils.getByteBufferUtf8(TEST_STRING);
        assertEquals(TEST_STRING_UTF8.length, result.remaining());
        byte[] bytes = new byte[result.remaining()];
        result.get(bytes);
        assertArrayEquals(TEST_STRING_UTF8, bytes);
    }

    @Test
    public void testGetBytesIso8859_1() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        String input = "H\u00e9llo";
        byte[] result = StringUtils.getBytesIso8859_1(input);
        assertEquals(6, result.length);
        assertEquals((byte)0x48, result[0]);
        assertEquals((byte)0xe9, result[1]);
    }

    @Test
    public void testGetBytesUtf16() {
        assertNull(StringUtils.getBytesUtf16(null));
        byte[] result = StringUtils.getBytesUtf16(TEST_STRING);
        assertArrayEquals(TEST_STRING_UTF16, result);
        assertArrayEquals(TEST_STRING.getBytes(Charsets.UTF_16), result);
    }

    @Test
    public void testGetBytesUtf16Be() {
        assertNull(StringUtils.getBytesUtf16Be(null));
        byte[] result = StringUtils.getBytesUtf16Be(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(Charsets.UTF_16BE), result);
    }

    @Test
    public void testGetBytesUtf16Le() {
        assertNull(StringUtils.getBytesUtf16Le(null));
        byte[] result = StringUtils.getBytesUtf16Le(TEST_STRING);
        assertArrayEquals(TEST_STRING.getBytes(Charsets.UTF_16LE), result);
    }

    @Test
    public void testGetBytesUtf8() {
        assertNull(StringUtils.getBytesUtf8(null));
        byte[] result = StringUtils.getBytesUtf8(TEST_STRING);
        assertArrayEquals(TEST_STRING_UTF8, result);
        assertArrayEquals(TEST_STRING.getBytes(Charsets.UTF_8), result);
    }

    @Test
    public void testNewStringIso8859_1() {
        assertNull(StringUtils.newStringIso8859_1(null));
        String expected = "H\u00e9llo";
        byte[] input = new byte[] {(byte)0x48, (byte)0xe9, (byte)0x6c, (byte)0x6c, (byte)0x6f};
        assertEquals(expected, StringUtils.newStringIso8859_1(input));
    }

    @Test
    public void testNewStringUsAscii() {
        assertNull(StringUtils.newStringUsAscii(null));
        byte[] input = new byte[] {(byte)0x48, (byte)0x65, (byte)0x6c, (byte)0x6c, (byte)0x6f};
        assertEquals("Hello", StringUtils.newStringUsAscii(input));
    }

    @Test
    public void testNewStringUtf16() {
        assertNull(StringUtils.newStringUtf16(null));
        assertEquals(TEST_STRING, StringUtils.newStringUtf16(TEST_STRING_UTF16));
    }

    @Test
    public void testNewStringUtf16Be() {
        assertNull(StringUtils.newStringUtf16Be(null));
        byte[] input = TEST_STRING.getBytes(Charsets.UTF_16BE);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Be(input));
    }

    @Test
    public void testNewStringUtf16Le() {
        assertNull(StringUtils.newStringUtf16Le(null));
        byte[] input = TEST_STRING.getBytes(Charsets.UTF_16LE);
        assertEquals(TEST_STRING, StringUtils.newStringUtf16Le(input));
    }

    @Test
    public void testNewStringUtf8() {
        assertNull(StringUtils.newStringUtf8(null));
        assertEquals(TEST_STRING, StringUtils.newStringUtf8(TEST_STRING_UTF8));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedWithInvalidCharset() {
        StringUtils.getBytesUnchecked("test", "INVALID_CHARSET");
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringWithInvalidCharset() {
        StringUtils.newString("test".getBytes(), "INVALID_CHARSET");
    }

    @Test
    public void testNewStringWithNullBytes() {
        assertNull(StringUtils.newString(null, Charsets.UTF_8));
    }

    @Test
    public void testGetByteBufferWithNullString() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }
}