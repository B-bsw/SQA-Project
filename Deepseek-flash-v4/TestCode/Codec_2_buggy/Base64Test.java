package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class Base64Test {
    private Base64 base64;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    @After
    public void tearDown() {
        base64 = null;
    }

    @Test
    public void testEncodeNull() {
        byte[] result = Base64.encodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testEncodeEmpty() {
        byte[] result = Base64.encodeBase64(EMPTY_BYTE_ARRAY);
        assertArrayEquals(EMPTY_BYTE_ARRAY, result);
    }

    @Test
    public void testEncodeBase64NoChunking() {
        byte[] input = "Hello World".getBytes();
        byte[] expected = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] result = Base64.encodeBase64(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] result = Base64.encodeBase64Chunked(input);
        assertTrue(result.length > 0);
        assertTrue(result.length > 100);
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] input = "Hello World".getBytes();
        byte[] result = Base64.encodeBase64URLSafe(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testDecodeBase64() {
        byte[] encoded = "SGVsbG8gV29ybGQ=".getBytes();
        byte[] result = Base64.decodeBase64(encoded);
        assertArrayEquals("Hello World".getBytes(), result);
    }

    @Test
    public void testDecodeNull() {
        byte[] result = Base64.decodeBase64(null);
        assertNull(result);
    }

    @Test
    public void testDecodeEmpty() {
        byte[] result = Base64.decodeBase64(EMPTY_BYTE_ARRAY);
        assertArrayEquals(EMPTY_BYTE_ARRAY, result);
    }

    @Test
    public void testDecodeWithLineSeparators() {
        byte[] input = "SGVsbG8\r\nV29ybGQ=\r\n".getBytes();
        byte[] result = Base64.decodeBase64(input);
        assertArrayEquals("Hello World".getBytes(), result);
    }

    @Test
    public void testDecodeWithPadding() {
        byte[] result = Base64.decodeBase64("SGVsbG8=".getBytes());
        assertArrayEquals("Hello".getBytes(), result);
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '!'));
        assertFalse(Base64.isBase64((byte) '#'));
    }

    @Test
    public void testIsArrayByteBase64() {
        byte[] valid = "Hello".getBytes();
        assertTrue(Base64.isArrayByteBase64(valid));
        byte[] validWithSpace = "SGVsbG8 g".getBytes();
        assertTrue(Base64.isArrayByteBase64(validWithSpace));
        byte[] invalid = { 'A', '!', 'B' };
        assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test
    public void testEncodeInteger() {
        BigInteger bigInt = new BigInteger("123456789");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testDecodeInteger() {
        byte[] encoded = Base64.encodeInteger(new BigInteger("123456789"));
        BigInteger result = Base64.decodeInteger(encoded);
        assertEquals(new BigInteger("123456789"), result);
    }

    @Test
    public void testEncodeIntegerZero() {
        BigInteger bigInt = BigInteger.ZERO;
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testDecodeIntegerZero() {
        byte[] encoded = Base64.encodeInteger(BigInteger.ZERO);
        BigInteger result = Base64.decodeInteger(encoded);
        assertEquals(BigInteger.ZERO, result);
    }

    @Test
    public void testEncodeIntegerOneByte() {
        BigInteger bigInt = new BigInteger("1");
        byte[] result = Base64.encodeInteger(bigInt);
        assertNotNull(result);
    }

    @Test
    public void testDecodeIntegerOneByte() {
        byte[] encoded = Base64.encodeInteger(new BigInteger("1"));
        BigInteger result = Base64.decodeInteger(encoded);
        assertEquals(new BigInteger("1"), result);
    }

    @Test
    public void testIsUrlSafeDefault() {
        Base64 b64 = new Base64();
        assertFalse(b64.isUrlSafe());
    }

    @Test
    public void testIsUrlSafeTrue() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testDecodeObject() throws Exception {
        byte[] input = "SGVsbG8=".getBytes();
        Object result = base64.decode((Object) input);
        assertArrayEquals("Hello".getBytes(), (byte[]) result);
    }

    @Test(expected = org.apache.commons.codec.DecoderException.class)
    public void testDecodeObjectInvalidType() throws Exception {
        base64.decode((Object) "Not a byte array");
    }

    @Test
    public void testEncodeObject() throws Exception {
        byte[] input = "Hello World".getBytes();
        Object result = base64.encode((Object) input);
        assertArrayEquals("SGVsbG8gV29ybGQ=".getBytes(), (byte[]) result);
    }

    @Test
    public void testEncodeWithChunkSeparator() {
        Base64 b64 = new Base64(10, new byte[] {'\n'});
        byte[] input = new byte[20];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] result = b64.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testEncodeLineSeparatorContainsBase64Char() {
        try {
            new Base64(10, new byte[] {'A'});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}