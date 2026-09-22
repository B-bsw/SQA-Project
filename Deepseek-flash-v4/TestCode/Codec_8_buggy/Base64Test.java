package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class Base64Test {
    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    @After
    public void tearDown() {
        base64 = null;
    }

    @Test
    public void testEncodeDecodeEmptyByteArray() {
        byte[] empty = new byte[0];
        assertArrayEquals(empty, base64.encode(empty));
        assertArrayEquals(empty, base64.decode(empty));
    }

    @Test
    public void testEncodeDecodeSingleByte() {
        byte[] input = { (byte) 0x41 }; // 'A'
        byte[] encoded = base64.encode(input);
        assertEquals("QQ==", new String(encoded));
        assertArrayEquals(input, base64.decode(encoded));
    }

    @Test
    public void testEncodeDecodeTwoBytes() {
        byte[] input = { (byte) 0x41, (byte) 0x42 }; // "AB"
        byte[] encoded = base64.encode(input);
        assertEquals("QUI=", new String(encoded));
        assertArrayEquals(input, base64.decode(encoded));
    }

    @Test
    public void testEncodeDecodeThreeBytes() {
        byte[] input = { (byte) 0x41, (byte) 0x42, (byte) 0x43 }; // "ABC"
        byte[] encoded = base64.encode(input);
        assertEquals("QUJD", new String(encoded));
        assertArrayEquals(input, base64.decode(encoded));
    }

    @Test
    public void testEncodeDecodeMultipleBytes() {
        byte[] input = new byte[57]; // Multiple of 3, tests boundary
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] encoded = base64.encode(input);
        assertArrayEquals(input, base64.decode(encoded));
    }

    @Test
    public void testEncodeDecodeWithChunking() {
        byte[] input = new byte[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        Base64 chunked = new Base64(76, new byte[] {'\r', '\n'});
        byte[] encoded = chunked.encode(input);
        assertArrayEquals(input, chunked.decode(encoded));
    }

    @Test
    public void testEncodeDecodeUrlSafe() {
        Base64 urlSafe = new Base64(true);
        byte[] input = { (byte) 0xFB, (byte) 0xEF, (byte) 0xBE }; 
        byte[] encoded = urlSafe.encode(input);
        assertArrayEquals(input, urlSafe.decode(encoded));
        assertTrue(urlSafe.isUrlSafe());
    }

    @Test
    public void testDecodeBase64String() {
        String input = "SGVsbG9Xb3JsZA==";
        assertArrayEquals("HelloWorld".getBytes(), Base64.decodeBase64(input));
    }

    @Test
    public void testEncodeDecodeInteger() {
        BigInteger bigInt = new BigInteger("123456789");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertEquals(bigInt, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeIntegerNull() {
        assertNull(Base64.encodeInteger(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalLineSeparator() {
        new Base64(10, new byte[] {'A'});
    }

    @Test
    public void testDecodeInvalidEmptyString() {
        assertNotNull(Base64.decodeBase64(""));
        assertEquals(0, Base64.decodeBase64("").length);
    }

    @Test
    public void testDecodeNullByteArray() {
        assertNull(Base64.decodeBase64((byte[]) null));
    }

    @Test
    public void testEncodeNullByteArray() {
        assertNull(Base64.encodeBase64(null, false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeMaxResultSizeExceeded() {
        byte[] input = new byte[100];
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testEncodeToString() {
        byte[] input = "TestString".getBytes();
        String encoded = Base64.encodeBase64String(input);
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertFalse(Base64.isBase64((byte) '!'));
        assertFalse(Base64.isBase64((byte) 0x0F));
    }

    @Test
    public void testIsArrayByteBase64() {
        byte[] valid = "Hello".getBytes();
        assertTrue(Base64.isArrayByteBase64(valid));
        byte[] invalid = { (byte) 0x0A, (byte) 0xFF };
        assertFalse(Base64.isArrayByteBase64(invalid));
    }
}