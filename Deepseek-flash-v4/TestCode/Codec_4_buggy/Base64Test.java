package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class Base64Test {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String SAMPLE_STRING = "Hello World";
    private static final byte[] SAMPLE_BYTES = SAMPLE_STRING.getBytes();
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testDefaultConstructor() {
        Base64 base64 = new Base64();
        assertFalse(base64.isUrlSafe());
    }
    
    @Test
    public void testUrlSafeConstructor() {
        Base64 base64 = new Base64(true);
        assertTrue(base64.isUrlSafe());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        new Base64(76, new byte[]{'A'});
    }
    
    @Test
    public void testEncodeBasic() {
        byte[] result = Base64.encodeBase64(SAMPLE_BYTES);
        String encoded = new String(result);
        assertEquals("SGVsbG8gV29ybGQ=", encoded);
    }
    
    @Test
    public void testEncodeEmptyArray() {
        byte[] result = Base64.encodeBase64(EMPTY_BYTE_ARRAY);
        assertArrayEquals(EMPTY_BYTE_ARRAY, result);
    }
    
    @Test
    public void testEncodeNull() {
        byte[] result = Base64.encodeBase64(null);
        assertNull(result);
    }
    
    @Test
    public void testEncodeDecodeRoundTrip() {
        byte[] encoded = Base64.encodeBase64(SAMPLE_BYTES);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(SAMPLE_BYTES, decoded);
    }
    
    @Test
    public void testDecodeString() {
        byte[] decoded = Base64.decodeBase64("SGVsbG8gV29ybGQ=");
        assertArrayEquals(SAMPLE_BYTES, decoded);
    }
    
    @Test
    public void testDecodeEmptyString() {
        byte[] result = Base64.decodeBase64((String) "");
        assertArrayEquals(EMPTY_BYTE_ARRAY, result);
    }
    
    @Test
    public void testEncodeDecodeChunked() {
        byte[] binaryData = new byte[100];
        for (int i = 0; i < binaryData.length; i++) {
            binaryData[i] = (byte) i;
        }
        byte[] encodedChunked = Base64.encodeBase64Chunked(binaryData);
        byte[] decoded = Base64.decodeBase64(encodedChunked);
        assertArrayEquals(binaryData, decoded);
    }
    
    @Test
    public void testEncodeBase64URLSafe() {
        byte[] result = Base64.encodeBase64URLSafe(SAMPLE_BYTES);
        String encoded = new String(result);
        assertFalse(encoded.contains("+"));
        assertFalse(encoded.contains("/"));
    }
    
    @Test
    public void testDecodeWithWhitespace() {
        String encoded = "SGVsbG8g\nV29y\r\nbGQ=";
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(SAMPLE_BYTES, decoded);
    }
    
    @Test
    public void testEncodeDecodeInteger() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);
    }
    
    @Test
    public void testEncodeNullInteger() {
        byte[] result = Base64.encodeInteger(null);
        assertNull(result);
    }
    
    @Test
    public void testDecodeNullByteArray() {
        byte[] result = Base64.decodeBase64((byte[]) null);
        assertNull(result);
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
        assertFalse(Base64.isBase64((byte) 0));
    }
    
    @Test
    public void testIsArrayBase64() {
        byte[] validInput = "SGVsbG8=".getBytes();
        assertTrue(Base64.isArrayByteBase64(validInput));
        
        byte[] invalidInput = "Hello!World".getBytes();
        assertFalse(Base64.isArrayByteBase64(invalidInput));
        
        byte[] emptyArray = new byte[0];
        assertTrue(Base64.isArrayByteBase64(emptyArray));
    }
    
    @Test
    public void testEncodeWithUrlSafeTable() {
        byte[] binaryData = { (byte) 0xfb, (byte) 0xff };
        byte[] urlSafeEncoded = Base64.encodeBase64URLSafe(binaryData);
        String encoded = new String(urlSafeEncoded);
        assertTrue(encoded.indexOf('-') != -1 || encoded.indexOf('_') != -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEncodeTooLargeInput() {
        byte[] largeData = new byte[1];
        Base64.encodeBase64(largeData, true, false, 10);
    }
    
    @Test
    public void testDecodeWithPaddingAndNoPadding() {
        String padded = "SGVsbG8=";
        String unpadded = "SGVsbG8";
        
        byte[] decodedPadded = Base64.decodeBase64(padded);
        byte[] decodedUnpadded = Base64.decodeBase64(unpadded);
        
        assertArrayEquals(decodedPadded, decodedUnpadded);
        assertArrayEquals(SAMPLE_BYTES, decodedPadded);
    }
    
    @Test
    public void testObjectEncode() throws Exception {
        Base64 encoder = new Base64();
        Object result = encoder.encode(SAMPLE_BYTES);
        assertTrue(result instanceof byte[]);
        
        String encoded = new String((byte[]) result);
        assertEquals("SGVsbG8gV29ybGQ=", encoded);
    }
    
    @Test(expected = EncoderException.class)
    public void testObjectEncodeWithInvalidType() throws Exception {
        Base64 encoder = new Base64();
        encoder.encode(new Integer(123));
    }
    
    @Test
    public void testObjectDecode() throws Exception {
        Base64 decoder = new Base64();
        Object result = decoder.decode("SGVsbG8=");
        assertTrue(result instanceof byte[]);
        assertArrayEquals(SAMPLE_BYTES, (byte[]) result);
    }
    
    @Test
    public void testDecodeObjectWithByteArray() throws Exception {
        Base64 decoder = new Base64();
        Object input = "SGVsbG8=".getBytes();
        Object result = decoder.decode(input);
        assertArrayEquals(SAMPLE_BYTES, (byte[]) result);
    }
    
    @Test(expected = DecoderException.class)
    public void testDecodeObjectWithInvalidType() throws Exception {
        Base64 decoder = new Base64();
        decoder.decode(new Integer(123));
    }
    
    @Test
    public void testEncodeBase64String() {
        String encoded = Base64.encodeBase64String(SAMPLE_BYTES);
        assertEquals("SGVsbG8gV29ybGQ=", encoded);
    }
    
    @Test
    public void testEdgeCaseSingleByteEncoding() {
        byte[] singleByte = { (byte) 0x41 };
        String encoded = Base64.encodeBase64String(singleByte);
        assertEquals("QQ==", encoded);
    }
    
    @Test
    public void testEdgeCaseTwoByteEncoding() {
        byte[] twoBytes = { (byte) 0x41, (byte) 0x42 };
        String encoded = Base64.encodeBase64String(twoBytes);
        assertEquals("QUI=", encoded);
    }
    
    @Test
    public void testLargeInputEncoding() {
        byte[] largeInput = new byte[1000];
        for (int i = 0; i < largeInput.length; i++) {
            largeInput[i] = (byte) (i % 256);
        }
        
        byte[] encoded = Base64.encodeBase64(largeInput);
        byte[] decoded = Base64.decodeBase64(encoded);
        
        assertArrayEquals(largeInput, decoded);
    }
}