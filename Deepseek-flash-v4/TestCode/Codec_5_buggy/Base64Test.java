package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Base64Test {
    private Base64 base64;
    private Base64 urlSafeBase64;
    private Base64 chunkedBase64;
    private Base64 customLineLengthBase64;

    @Before
    public void setUp() {
        base64 = new Base64();
        urlSafeBase64 = new Base64(true);
        chunkedBase64 = new Base64(76, new byte[]{'\r', '\n'});
        customLineLengthBase64 = new Base64(10, new byte[]{'\n'});
    }

    @Test
    public void testEncodeEmptyArray() {
        byte[] empty = new byte[0];
        byte[] result = base64.encode(empty);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeNullInput() {
        assertNull(base64.encode((byte[]) null));
    }

    @Test
    public void testEncodeBasic() {
        byte[] input = "Hello".getBytes();
        byte[] result = base64.encode(input);
        assertEquals("SGVsbG8=", new String(result));
    }

    @Test
    public void testEncodeModulus1() {
        byte[] input = "A".getBytes();
        byte[] result = base64.encode(input);
        assertEquals("QQ==", new String(result));
    }

    @Test
    public void testEncodeModulus2() {
        byte[] input = "AB".getBytes();
        byte[] result = base64.encode(input);
        assertEquals("QUI=", new String(result));
    }

    @Test
    public void testEncodeURLSafe() {
        byte[] input = new byte[]{(byte) 0xfb, (byte) 0xff};
        byte[] result = urlSafeBase64.encode(input);
        String encoded = new String(result);
        assertFalse(encoded.contains("+"));
        assertFalse(encoded.contains("/"));
        assertFalse(encoded.contains("="));
    }

    @Test
    public void testDecodeBasic() {
        byte[] input = "SGVsbG8=".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeNull() {
        assertNull(base64.decode((byte[]) null));
    }

    @Test
    public void testDecodeEmptyArray() {
        byte[] empty = new byte[0];
        assertSame(empty, base64.decode(empty));
    }

    @Test
    public void testDecodeWithWhitespace() {
        byte[] input = "SGVs\nbG8=\r\n".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeWithPadding() {
        byte[] input = "QQ==".getBytes();
        byte[] result = base64.decode(input);
        assertEquals("A", new String(result));
    }

    @Test
    public void testDecodeStringMethod() {
        String input = "SGVsbG8=";
        byte[] result = base64.decode(input);
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testDecodeObjectByteArray() throws Exception {
        Object input = "SGVsbG8=".getBytes();
        Object result = base64.decode(input);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test
    public void testDecodeObjectString() throws Exception {
        Object input = "SGVsbG8=";
        Object result = base64.decode(input);
        assertEquals("Hello", new String((byte[]) result));
    }

    @Test(expected = org.apache.commons.codec.DecoderException.class)
    public void testDecodeInvalidObject() throws Exception {
        Object input = new Integer(123);
        base64.decode(input);
    }

    @Test
    public void testEncodeBase64String() {
        String result = Base64.encodeBase64String("Hello".getBytes());
        assertEquals("SGVsbG8=", result);
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        String result = Base64.encodeBase64URLSafeString(new byte[]{(byte) 0xfb, (byte) 0xff});
        assertNotNull(result);
        assertFalse(result.contains("+"));
        assertFalse(result.contains("/"));
    }

    @Test
    public void testDecodeBase64String() {
        byte[] result = Base64.decodeBase64("SGVsbG8=");
        assertEquals("Hello", new String(result));
    }

    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) '9'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) ' '));
        assertFalse(Base64.isBase64((byte) 0));
    }

    @Test
    public void testIsArrayByteBase64() {
        assertTrue(Base64.isArrayByteBase64("SGVsbG8=".getBytes()));
        assertFalse(Base64.isArrayByteBase64("SGVsbG8$".getBytes()));
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] result = Base64.encodeBase64Chunked(input);
        assertNotNull(result);
        assertTrue(result.length > input.length);
        assertTrue(new String(result).contains(StringUtils.newStringUtf8(new byte[]{'\r', '\n'})));
    }

    @Test
    public void testDecodeInteger() {
        byte[] encoded = Base64.encodeInteger(new java.math.BigInteger("12345678901234567890"));
        java.math.BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(new java.math.BigInteger("12345678901234567890"), decoded);
    }

    @Test
    public void testEncodeIntegerWithNull() {
        assertNotNull(Base64.encodeInteger(null));
    }

    @Test
    public void testUrlSafeWithStandardDecode() {
        Base64 standard = new Base64(false);
        byte[] encoded = standard.encode(new byte[]{(byte) 0xfb, (byte) 0xff});
        byte[] decoded = standard.decode(encoded);
        assertArrayEquals(new byte[]{(byte) 0xfb, (byte) 0xff}, decoded);
    }

    @Test
    public void testCustomLineLengthEncoding() {
        byte[] input = "This is a test string for chunking".getBytes();
        byte[] result = customLineLengthBase64.encode(input);
        byte[] decoded = customLineLengthBase64.decode(result);
        assertEquals("This is a test string for chunking", new String(decoded));
    }

    @Test
    public void testChunkedBase64Encoding() {
        byte[] input = new byte[80];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i + 1);
        }
        byte[] result = chunkedBase64.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testDecodeWithInvalidData() throws Exception {
        try {
            base64.decode("!!!".getBytes());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testIsUrlSafe() {
        assertFalse(base64.isUrlSafe());
        assertTrue(urlSafeBase64.isUrlSafe());
        assertFalse(chunkedBase64.isUrlSafe());
    }

    @Test
    public void testEncodeObject() throws Exception {
        Object input = "Hello".getBytes();
        Object result = base64.encode(input);
        assertTrue(result instanceof byte[]);
        assertEquals("SGVsbG8=", new String((byte[]) result));
    }

    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeInvalidObject() throws Exception {
        base64.encode(new Integer(123));
    }

    @Test
    public void testAvailMethod() {
        assertEquals(0, base64.avail());
        byte[] input = "Hello".getBytes();
        byte[] buffer = new byte[1024];
        base64.encode(input, 0, input.length);
        assertTrue(base64.avail() > 0);
    }
}