package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testEquals() {
        assertSame(true, StringUtils.equals(null, null));
        assertSame(false, StringUtils.equals(null, "abc"));
        assertSame(false, StringUtils.equals("abc", null));
        assertSame(true, StringUtils.equals("abc", "abc"));
        assertSame(false, StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testGetBytesIso8859_1() {
        assertNull(StringUtils.getBytesIso8859_1(null));
        assertArrayEquals(new byte[] {(byte) 0x61, (byte) 0x62, (byte) 0x63}, StringUtils.getBytesIso8859_1("abc"));
    }

    @Test
    public void testGetBytesUsAscii() {
        assertNull(StringUtils.getBytesUsAscii(null));
        assertArrayEquals(new byte[] {0x61, 0x62, 0x63}, StringUtils.getBytesUsAscii("abc"));
    }

    @Test
    public void testGetBytesUtf16() {
        assertNull(StringUtils.getBytesUtf16(null));
        assertArrayEquals(new byte[] {(byte) 0xFE, (byte) 0xFF, 0x00, 0x61}, StringUtils.getBytesUtf16("a"));
    }

    @Test
    public void testGetBytesUtf16Be() {
        assertNull(StringUtils.getBytesUtf16Be(null));
        assertArrayEquals(new byte[] {0x00, 0x61}, StringUtils.getBytesUtf16Be("a"));
    }

    @Test
    public void testGetBytesUtf16Le() {
        assertNull(StringUtils.getBytesUtf16Le(null));
        assertArrayEquals(new byte[] {0x61, 0x00}, StringUtils.getBytesUtf16Le("a"));
    }

    @Test
    public void testGetBytesUtf8() {
        assertNull(StringUtils.getBytesUtf8(null));
        assertArrayEquals(new byte[] {0x61, (byte) 0xC3, (byte) 0xA9}, StringUtils.getBytesUtf8("aé"));
    }

    @Test
    public void testGetBytesUnchecked() {
        assertArrayEquals(new byte[] {0x61, 0x62, 0x63}, StringUtils.getBytesUnchecked("abc", "UTF-8"));
        try {
            StringUtils.getBytesUnchecked("abc", "INVALID_CHARSET");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        try {
            StringUtils.getBytesUnchecked(null, "UTF-8");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testNewStringIso8859_1() {
        assertNull(StringUtils.newStringIso8859_1(null));
        assertEquals("abc", StringUtils.newStringIso8859_1(new byte[] {0x61, 0x62, 0x63}));
    }

    @Test
    public void testNewStringUsAscii() {
        assertNull(StringUtils.newStringUsAscii(null));
        assertEquals("abc", StringUtils.newStringUsAscii(new byte[] {0x61, 0x62, 0x63}));
    }

    @Test
    public void testNewStringUtf16() {
        assertNull(StringUtils.newStringUtf16(null));
        assertEquals("a", StringUtils.newStringUtf16(new byte[] {(byte) 0xFE, (byte) 0xFF, 0x00, 0x61}));
    }

    @Test
    public void testNewStringUtf16Be() {
        assertNull(StringUtils.newStringUtf16Be(null));
        assertEquals("a", StringUtils.newStringUtf16Be(new byte[] {0x00, 0x61}));
    }

    @Test
    public void testNewStringUtf16Le() {
        assertNull(StringUtils.newStringUtf16Le(null));
        assertEquals("a", StringUtils.newStringUtf16Le(new byte[] {0x61, 0x00}));
    }

    @Test
    public void testNewStringUtf8() {
        assertNull(StringUtils.newStringUtf8(null));
        assertEquals("aé", StringUtils.newStringUtf8(new byte[] {0x61, (byte) 0xC3, (byte) 0xA9}));
    }

    @Test
    public void testNewString() {
        assertNull(StringUtils.newString(null, "UTF-8"));
        assertEquals("abc", StringUtils.newString(new byte[] {0x61, 0x62, 0x63}, "UTF-8"));
        try {
            StringUtils.newString(new byte[] {0x61}, "INVALID_CHARSET");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }
}