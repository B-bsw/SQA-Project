package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testEqualsBasic() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsSameInstance() {
        String s = "hello";
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEqualsDifferentTypes() {
        StringBuilder sb = new StringBuilder("hello");
        String s = "hello";
        // Following should still return true because regionMatches is used
        assertTrue(StringUtils.equals(s, sb));
    }

    @Test
    public void testGetByteBufferUtf8() {
        String test = "Hello World";
        ByteBuffer result = StringUtils.getByteBufferUtf8(test);
        assertNotNull(result);
        byte[] expected = test.getBytes(Charsets.UTF_8);
        byte[] actual = new byte[result.remaining()];
        result.get(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesIso8859_1() {
        String test = "Héllo";
        byte[] result = StringUtils.getBytesIso8859_1(test);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals((byte)0xE9, result[1]); // é in ISO-8859-1
    }

    @Test
    public void testGetBytesUtf8() {
        String test = "Test String";
        byte[] result = StringUtils.getBytesUtf8(test);
        assertNotNull(result);
        assertArrayEquals(test.getBytes(Charsets.UTF_8), result);
    }

    @Test
    public void testGetBytesUtf16() {
        String test = "Test";
        byte[] result = StringUtils.getBytesUtf16(test);
        assertNotNull(result);
        // UTF-16 BOM is FF FE or FE FF
        assertEquals(result.length % 2, 0);
    }

    @Test
    public void testGetBytesUtf16Be() {
        String test = "Test";
        byte[] result = StringUtils.getBytesUtf16Be(test);
        assertNotNull(result);
        // Test with known string
        String hex = "0041"; // "A" in UTF-16BE
        assertEquals(hex, bytesToHex(new byte[]{result[0], result[1]}));
    }

    @Test
    public void testGetBytesUtf16Le() {
        String test = "A";
        byte[] result = StringUtils.getBytesUtf16Le(test);
        assertNotNull(result);
        assertEquals((byte)0x41, result[0]);
        assertEquals((byte)0x00, result[1]);
    }

    @Test
    public void testGetBytesUnchecked() {
        String test = "Test";
        byte[] result = StringUtils.getBytesUnchecked(test, "UTF-8");
        assertNotNull(result);
        assertArrayEquals(test.getBytes(java.nio.charset.StandardCharsets.UTF_8), result);
    }

    @Test
    public void testGetBytesUncheckedInvalidCharset() {
        try {
            StringUtils.getBytesUnchecked("test", "INVALID_CHARSET");
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testNewStringIso8859_1() {
        byte[] bytes = new byte[] { (byte)0x48, (byte)0xE9, (byte)0x6C, (byte)0x6C, (byte)0x6F };
        String result = StringUtils.newStringIso8859_1(bytes);
        assertEquals("Héllo", result);
    }

    @Test
    public void testNewStringUsAscii() {
        byte[] bytes = "Hello".getBytes();
        String result = StringUtils.newStringUsAscii(bytes);
        assertEquals("Hello", result);
    }

    @Test
    public void testNewStringUtf16() {
        byte[] bytes = new byte[] { (byte)0x00, (byte)0x48, (byte)0x00, (byte)0x69 };
        String result = StringUtils.newStringUtf16(bytes);
        assertEquals("Hi", result);
    }

    @Test
    public void testNewStringUtf16Be() {
        byte[] bytes = new byte[] { (byte)0x00, (byte)0x41, (byte)0x00, (byte)0x42 };
        String result = StringUtils.newStringUtf16Be(bytes);
        assertEquals("AB", result);
    }

    @Test
    public void testNewStringUtf16Le() {
        byte[] bytes = new byte[] { (byte)0x41, (byte)0x00, (byte)0x42, (byte)0x00 };
        String result = StringUtils.newStringUtf16Le(bytes);
        assertEquals("AB", result);
    }

    @Test
    public void testNewStringUtf8() {
        byte[] bytes = new byte[] { (byte)0x48, (byte)0x65, (byte)0x6C, (byte)0x6C, (byte)0x6F };
        String result = StringUtils.newStringUtf8(bytes);
        assertEquals("Hello", result);
    }

    @Test
    public void testNewStringNullBytes() {
        assertNull(StringUtils.newStringIso8859_1(null));
        assertNull(StringUtils.newStringUsAscii(null));
        assertNull(StringUtils.newStringUtf16(null));
        assertNull(StringUtils.newStringUtf16Be(null));
        assertNull(StringUtils.newStringUtf16Le(null));
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testGetBytesNullString() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        assertNull(StringUtils.getBytesUsAscii(null));
        assertNull(StringUtils.getBytesUtf16(null));
        assertNull(StringUtils.getBytesUtf16Be(null));
        assertNull(StringUtils.getBytesUtf16Le(null));
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8NullString() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testEqualsEmptyStrings() {
        assertTrue(StringUtils.equals("", ""));
        assertFalse(StringUtils.equals("", "a"));
        assertFalse(StringUtils.equals("a", ""));
    }

    @Test
    public void testNewStringUnsupportedCharset() {
        try {
            StringUtils.newString(new byte[] {1, 2}, "INVALID_CHARSET");
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}