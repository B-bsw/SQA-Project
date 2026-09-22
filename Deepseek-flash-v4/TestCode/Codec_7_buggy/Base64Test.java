package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class Base64Test {
    private Base64 base64;
    private Base64 urlSafeBase64;
    private Base64 chunkedBase64;

    @Before
    public void setUp() {
        base64 = new Base64();
        urlSafeBase64 = new Base64(true);
        chunkedBase64 = new Base64(Base64.MIME_CHUNK_SIZE, Base64.CHUNK_SEPARATOR);
    }

    @Test
    public void testEncodeEmptyArray() {
        byte[] input = new byte[0];
        byte[] result = base64.encode(input);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeNullArray() {
        byte[] result = base64.encode(null);
        assertNull(result);
    }

    @Test
    public void testEncodeSingleByte() {
        byte[] input = new byte[]{(byte) 0x41};
        byte[] result = base64.encode(input);
        assertEquals("QQ==", new String(result, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void testEncodeThreeBytes() {
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
        byte[] result = base64.encode(input);
        assertEquals("QUJD", new String(result, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void testEncodeThreeBytesWithPadding() {
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42};
        byte[] result = base64.encode(input);
        assertEquals("QUI=", new String(result, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void testEncodeWithChunking() {
        byte[] input = new byte[80];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] result = chunkedBase64.encode(input);
        String resultStr = new String(result, java.nio.charset.StandardCharsets.UTF_8);
        assertTrue(resultStr.contains("\r\n"));
        assertEquals(80, result.length - 2);
    }

    @Test
    public void testEncodeUrlSafe() {
        byte[] input = new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0xFD};
        byte[] result = urlSafeBase64.encode(input);
        String resultStr = new String(result, java.nio.charset.StandardCharsets.UTF_8);
        assertFalse(resultStr.contains("+"));
        assertFalse(resultStr.contains("/"));
        assertTrue(resultStr.length() == 4);
    }

    @Test
    public void testDecodeString() {
        String input = "QUJD";
        byte[] result = base64.decode(input);
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, result);
    }

    @Test
    public void testDecodeByteArray() {
        byte[] input = "QUJD".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        byte[] result = base64.decode(input);
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, result);
    }

    @Test
    public void testDecodeEmptyString() {
        byte[] result = base64.decode("");
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testDecodeNull() {
        byte[] result = base64.decode((byte[]) null);
        assertNull(result);
    }

    @Test
    public void testDecodeWithPadding() {
        String input = "QQ==";
        byte[] result = base64.decode(input);
        assertArrayEquals(new byte[]{(byte) 0x41}, result);
    }

    @Test
    public void testDecodeWithLineSeparators() {
        String input = "QU\nJD\r\n";
        byte[] result = base64.decode(input);
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, result);
    }

    @Test
    public void testDecodeObject() throws Exception {
        Object input = "QUJD";
        Object result = base64.decode(input);
        assertTrue(result instanceof byte[]);
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, (byte[]) result);
    }

    @Test
    public void testDecodeObjectInvalidType() {
        try {
            base64.decode(new Integer(123));
            fail("Expected DecoderException");
        } catch (Exception e) {
            assertTrue(e instanceof org.apache.commons.codec.DecoderException);
        }
    }

    @Test
    public void testEncodeObjectValidType() throws Exception {
        byte[] input = new byte[]{(byte) 0x41};
        Object result = base64.encode(input);
        assertTrue(result instanceof byte[]);
        assertArrayEquals("QQ==".getBytes(java.nio.charset.StandardCharsets.UTF_8), (byte[]) result);
    }

    @Test
    public void testEncodeObjectInvalidType() {
        try {
            base64.encode(new Integer(123));
            fail("Expected EncoderException");
        } catch (Exception e) {
            assertTrue(e instanceof org.apache.commons.codec.EncoderException);
        }
    }

    @Test
    public void testEncodeToString() {
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
        String result = base64.encodeToString(input);
        assertEquals("QUJD", result);
    }

    @Test
    public void testEncodeBase64() {
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
        byte[] result = Base64.encodeBase64(input);
        assertArrayEquals("QUJD".getBytes(java.nio.charset.StandardCharsets.UTF_8), result);
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[80];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] result = Base64.encodeBase64Chunked(input);
        String resultStr = new String(result, java.nio.charset.StandardCharsets.UTF_8);
        assertTrue(resultStr.contains("\r\n"));
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] input = new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0xFD};
        byte[] result = Base64.encodeBase64URLSafe(input);
        String resultStr = new String(result, java.nio.charset.StandardCharsets.UTF_8);
        assertFalse(resultStr.contains("+"));
        assertFalse(resultStr.contains("/"));
        assertFalse(resultStr.contains("="));
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        byte[] input = new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0xFD};
        String result = Base64.encodeBase64URLSafeString(input);
        assertFalse(result.contains("+"));
        assertFalse(result.contains("/"));
        assertFalse(result.contains("="));
    }

    @Test
    public void testDecodeBase64String() {
        byte[] result = Base64.decodeBase64("QUJD");
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, result);
    }

    @Test
    public void testDecodeBase64ByteArray() {
        byte[] result = Base64.decodeBase64("QUJD".getBytes(java.nio.charset.StandardCharsets.UTF_8));
        assertArrayEquals(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43}, result);
    }

    @Test
    public void testDecodeInteger() {
        byte[] input = new byte[]{(byte) 0x01, (byte) 0x02};
        BigInteger result = Base64.decodeInteger(input);
        assertNotNull(result);
        assertEquals(BigInteger.valueOf(258), result);
    }

    @Test
    public void testEncodeInteger() {
        BigInteger input = BigInteger.valueOf(258);
        byte[] result = Base64.encodeInteger(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) 0x01));
    }

    @Test
    public void testIsArrayByteBase64() {
        byte[] valid = "QUJD".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        assertTrue(Base64.isArrayByteBase64(valid));
        byte[] invalid = new byte[]{(byte) 0x01, (byte) 0x02};
        assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test
    public void testIsUrlSafe() {
        assertFalse(base64.isUrlSafe());
        assertTrue(urlSafeBase64.isUrlSafe());
    }

    @Test
    public void testHasData() {
        assertFalse(base64.hasData());
        base64.encode(new byte[]{(byte) 0x41});
        assertTrue(base64.hasData());
    }

    @Test
    public void testAvail() {
        assertEquals(0, base64.avail());
        base64.encode(new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43});
        assertFalse(base64.avail() == 0);
    }

    @Test
    public void testEncodeWithLineLengthZero() {
        Base64 noChunk = new Base64(0);
        byte[] input = new byte[80];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] result = noChunk.encode(input);
        String resultStr = new String(result, java.nio.charset.StandardCharsets.UTF_8);
        assertFalse(resultStr.contains("\r\n"));
    }

    @Test
    public void testEncodeWithInvalidLineLength() {
        Base64 invalidLength = new Base64(10);
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
        byte[] result = invalidLength.encode(input);
        assertEquals("QUJD", new String(result, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void testConstructorWithNullLineSeparator() {
        Base64 b64 = new Base64(76, null);
        byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
        byte[] result = b64.encode(input);
        assertEquals("QUJD", new String(result, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Test
    public void testConstructorWithBase64CharInSeparator() {
        try {
            new Base64(76, new byte[]{'A'});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("lineSeperator"));
        }
    }

    @Test
    public void testEncodeBase64MaxResultSizeExceeded() {
        byte[] input = new byte[100];
        try {
            Base64.encodeBase64(input, false, false, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Input array too big"));
        }
    }
}