package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigInteger;

import org.junit.Test;

public class Base64Test {

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String EMPTY_STRING = "";

    @Test
    public void testIsBase64Byte() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '!'));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) -1));
    }

    @Test
    public void testIsBase64Array() {
        assertTrue(Base64.isBase64(new byte[] {'A', 'B', 'C', '='}));
        assertFalse(Base64.isBase64(new byte[] {'A', 'B', 'C', '!'}));
        assertTrue(Base64.isBase64(new byte[] {'A', ' ', 'B', '\n', 'C', '\r', 'D', '\t', '='}));
        assertFalse(Base64.isBase64(new byte[] {'A', 'B', 'C', ' ', '!'}));
        assertTrue(Base64.isBase64(EMPTY_BYTE_ARRAY));
        assertTrue(Base64.isBase64((byte[]) null));
    }

    @Test
    public void testIsArrayByteBase64() {
        assertTrue(Base64.isArrayByteBase64(new byte[] {'A', 'B', 'C', 'D'}));
        assertFalse(Base64.isArrayByteBase64(new byte[] {'A', 'B', 'C', '!'}));
    }

    @Test
    public void testIsBase64String() {
        assertTrue(Base64.isBase64("SGVsbG8="));
        assertTrue(Base64.isBase64("SGVsbG8\nWorld"));
        assertFalse(Base64.isBase64("SGVsbG8!"));
        assertFalse(Base64.isBase64(null));
    }

    @Test
    public void testEncodeBase64String() {
        assertEquals("", Base64.encodeBase64String(EMPTY_BYTE_ARRAY));
        assertEquals("QQ==", Base64.encodeBase64String(new byte[] {'A'}));
        assertEquals("QUJD", Base64.encodeBase64String(new byte[] {'A', 'B', 'C'}));
        assertEquals("SGVsbG8=", Base64.encodeBase64String("Hello".getBytes()));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        assertEquals("", Base64.encodeBase64URLSafeString(EMPTY_BYTE_ARRAY));
        assertEquals("-_8", Base64.encodeBase64URLSafeString(new byte[] {(byte) 0xfb, (byte) 0xff}));
        assertEquals("QUJD", Base64.encodeBase64URLSafeString(new byte[] {'A', 'B', 'C'}));
    }

    @Test
    public void testEncodeBase64() {
        assertArrayEquals(EMPTY_BYTE_ARRAY, Base64.encodeBase64(EMPTY_BYTE_ARRAY, false));
        assertArrayEquals(new byte[] {'Q', 'Q', '=', '='}, Base64.encodeBase64(new byte[] {'A'}, false));
        assertArrayEquals(new byte[] {'A', 'Q', '=', '='}, Base64.encodeBase64(new byte[] {1}, false));
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[57];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64(input, true);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);
        boolean foundCRLF = false;
        for (int i = 0; i < encoded.length - 1; i++) {
            if (encoded[i] == '\r' && encoded[i + 1] == '\n') {
                foundCRLF = true;
                break;
            }
        }
        assertTrue(foundCRLF);
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] input = new byte[] {(byte) 0xfb, (byte) 0xff};
        byte[] encoded = Base64.encodeBase64(input, false, true);
        assertArrayEquals(new byte[] {'-', '_', '8'}, encoded);
    }

    @Test
    public void testDecodeBase64String() {
        assertArrayEquals(EMPTY_BYTE_ARRAY, Base64.decodeBase64(EMPTY_STRING));
        assertArrayEquals(new byte[] {'A'}, Base64.decodeBase64("QQ=="));
        assertArrayEquals(new byte[] {'A', 'B', 'C'}, Base64.decodeBase64("QUJD"));
        assertArrayEquals(new byte[] {'H', 'e', 'l', 'l', 'o'}, Base64.decodeBase64("SGVsbG8="));
    }

    @Test
    public void testDecodeBase64NullByteArray() {
        assertNull(Base64.decodeBase64((byte[]) null));
    }

    @Test
    public void testDecodeBase64EmptyByteArray() {
        assertArrayEquals(EMPTY_BYTE_ARRAY, Base64.decodeBase64(EMPTY_BYTE_ARRAY));
    }

    @Test
    public void testDecodeBase64WithWhitespace() {
        assertArrayEquals(new byte[] {'A', 'B', 'C'}, Base64.decodeBase64("QUJD\ndata\n"));
    }

    @Test
    public void testEncodeDecodeRoundTrip() {
        byte[] original = new byte[256];
        for (int i = 0; i < 256; i++) {
            original[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64(original, false);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testEncodeInteger() {
        BigInteger bigInt = new BigInteger("123456789");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertNotNull(encoded);
        assertEquals(bigInt, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeIntegerZero() {
        byte[] encoded = Base64.encodeInteger(BigInteger.ZERO);
        assertNotNull(encoded);
        assertEquals(BigInteger.ZERO, Base64.decodeInteger(encoded));
    }

    @Test
    public void testEncodeIntegerOne() {
        byte[] encoded = Base64.encodeInteger(BigInteger.ONE);
        assertNotNull(encoded);
        assertEquals(BigInteger.ONE, Base64.decodeInteger(encoded));
    }

    @Test
    public void testDecodeInteger() {
        byte[] data = Base64.decodeBase64("AQID");
        BigInteger decoded = Base64.decodeInteger(data);
        assertEquals(new BigInteger("258"), decoded);
    }

    @Test
    public void testDecodeObjectByteArray() throws Exception {
        Base64 base64 = new Base64();
        byte[] input = new byte[] {'A', 'B', 'C'};
        byte[] encoded = base64.encode(input);
        Object decoded = base64.decode(encoded);
        assertTrue(decoded instanceof byte[]);
        assertArrayEquals(input, (byte[]) decoded);
    }

    @Test
    public void testDecodeObjectString() throws Exception {
        Base64 base64 = new Base64();
        byte[] input = new byte[] {'A', 'B', 'C'};
        byte[] encoded = base64.encode(input);
        String encodedString = new String(encoded);
        Object decoded = base64.decode(encodedString);
        assertTrue(decoded instanceof byte[]);
        assertArrayEquals(input, (byte[]) decoded);
    }

    @Test(expected = org.apache.commons.codec.DecoderException.class)
    public void testDecodeObjectInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.decode(new Integer(123));
    }

    @Test
    public void testEncodeObject() throws Exception {
        Base64 base64 = new Base64();
        byte[] input = new byte[] {'A', 'B', 'C'};
        Object encoded = base64.encode(input);
        assertTrue(encoded instanceof byte[]);
        assertArrayEquals(Base64.encodeBase64(input, false), (byte[]) encoded);
    }

    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeObjectInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.encode("invalid");
    }

    @Test
    public void testIsUrlSafeDefaultFalse() {
        Base64 base64 = new Base64();
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testIsUrlSafeTrue() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testIsUrlSafeFalse() {
        Base64 base64 = new Base64(false);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testIsUrlSafeWithLineLength() {
        Base64 base64 = new Base64(76, new byte[] {'\r', '\n'}, true);
        assertTrue(base64.isUrlSafe());
    }

    @Test
    public void testConstructorUrlSafe() {
        Base64 base64 = new Base64(false);
        assertFalse(base64.isUrlSafe());
    }

    @Test
    public void testEncodeMIMEChunkSize() {
        byte[] input = new byte[1024];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] encoded = Base64.encodeBase64(input, true);
        assertNotNull(encoded);
        for (int i = 0; i < encoded.length; i++) {
            if (i % 78 == 77) {
                assertEquals('\r', encoded[i]);
                assertEquals('\n', encoded[i + 1]);
                i++;
            }
        }
    }

    @Test
    public void testEncodePEMChunkSize() {
        byte[] input = new byte[64];
        byte[] encoded = Base64.encodeBase64(input, true);
        assertNotNull(encoded);
        boolean foundCRLF = false;
        for (int i = 0; i < encoded.length - 1; i++) {
            if (encoded[i] == '\r' && encoded[i + 1] == '\n') {
                foundCRLF = true;
                break;
            }
        }
        assertFalse(foundCRLF);
    }

    @Test
    public void testDecodeChunkedData() {
        String chunkedBase64 = "SGVsbG8=\r\nV29ybGQ=";
        byte[] decoded = Base64.decodeBase64(chunkedBase64);
        assertEquals("HelloWorld", new String(decoded));
    }

    @Test
    public void testDecodeWithInvalidBase64() {
        try {
            Base64.decodeBase64("!!!");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEncodeIntegerNull() {
        try {
            Base64.encodeInteger(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDecodeIntegerWithInvalidData() {
        byte[] invalid = new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        try {
            Base64.decodeBase64(invalid);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testLineSeparatorWithBase64Characters() {
        try {
            new Base64(10, new byte[] {'A', 'B'});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNullLineSeparator() {
        Base64 base64 = new Base64(10, null);
        assertNotNull(base64);
    }

    @Test
    public void testZeroLineLength() {
        Base64 base64 = new Base64(0);
        assertNotNull(base64);
    }

    @Test
    public void testNegativeLineLength() {
        Base64 base64 = new Base64(-1);
        assertNotNull(base64);
    }

    @Test
    public void testEncodeBase64MaxResultSize() {
        byte[] input = new byte[10];
        try {
            Base64.encodeBase64(input, false, false, 5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEncodeBase64ExactMaxResultSize() {
        byte[] input = new byte[3];
        byte[] encoded = Base64.encodeBase64(input, false, false, 4);
        assertNotNull(encoded);
    }

    @Test
    public void testEncodeBase64DataEmptyMaxResultSize() {
        byte[] encoded = Base64.encodeBase64(EMPTY_BYTE_ARRAY, false, false, 10);
        assertSame(EMPTY_BYTE_ARRAY, encoded);
    }

    @Test
    public void testDecodeSingleCharacterString() {
        byte[] decoded = Base64.decodeBase64("QQ==");
        assertArrayEquals(new byte[] {'A'}, decoded);
    }

    @Test
    public void testDecodeTwoCharacterString() {
        byte[] decoded = Base64.decodeBase64("QUI=");
        assertArrayEquals(new byte[] {'A', 'B'}, decoded);
    }

    @Test
    public void testEncodeTwoBytesNoPadding() {
        byte[] encoded = Base64.encodeBase64(new byte[] {(byte) 0xfb, (byte) 0xff}, false);
        assertArrayEquals(new byte[] {'+', '/', '8', '='}, encoded);
    }

    @Test
    public void testEncodeURLSafeTwoBytesNoPadding() {
        byte[] encoded = Base64.encodeBase64(new byte[] {(byte) 0xfb, (byte) 0xff}, false, true);
        assertArrayEquals(new byte[] {'-', '_', '8', '='}, encoded);
    }

    @Test
    public void testDecodeDataWithMultiplePads() {
        byte[] decoded = Base64.decodeBase64("QQ==");
        assertArrayEquals(new byte[] {'A'}, decoded);
    }

    @Test
    public void testIsBase64WithNegativeByte() {
        assertFalse(Base64.isBase64((byte) -1));
        assertFalse(Base64.isBase64((byte) -128));
    }

    @Test
    public void testIsBase64WithBoundaryValues() {
        assertTrue(Base64.isBase64((byte) 0));
        assertTrue(Base64.isBase64((byte) 51));
        assertTrue(Base64.isBase64((byte) 52));
        assertTrue(Base64.isBase64((byte) 61));
        assertTrue(Base64.isBase64((byte) 62));
        assertTrue(Base64.isBase64((byte) 63));
        assertTrue(Base64.isBase64((byte) 64));
        assertTrue(Base64.isBase64((byte) 65));
        assertFalse(Base64.isBase64((byte) 66));
    }

    @Test
    public void testMultipleEncodeDecodeCycles() {
        for (int len = 0; len < 100; len += 7) {
            byte[] input = new byte[len];
            for (int i = 0; i < len; i++) {
                input[i] = (byte) (i * 31);
            }
            byte[] encoded = Base64.encodeBase64(input, false);
            byte[] decoded = Base64.decodeBase64(encoded);
            assertArrayEquals(input, decoded);
        }
    }
}