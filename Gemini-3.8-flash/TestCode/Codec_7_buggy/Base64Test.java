package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        this.base64 = new Base64();
    }

    @Test
    public void encodeBase64_givenNullOrEmpty_shouldReturnNullOrEmpty() {
        // Arrange & Act & Assert
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertEquals(0, Base64.encodeBase64(new byte[0]).length);
    }

    @Test
    public void decodeBase64_givenNullOrEmpty_shouldReturnNullOrEmpty() {
        // Arrange & Act & Assert
        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertEquals(0, Base64.decodeBase64(new byte[0]).length);
    }

    @Test
    public void encodeAndDecode_givenBasicStrings_shouldRoundTripAccurately() throws Exception {
        // Arrange
        byte[] original = "Hello World!".getBytes("UTF-8");

        // Act
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);

        // Assert
        Assert.assertArrayEquals(original, decoded);
    }

    @Test
    public void encodeBase64_givenSingleByte_shouldPadTwoEquals() throws Exception {
        // Arrange
        byte[] input = new byte[] { 'A' };

        // Act
        byte[] encoded = Base64.encodeBase64(input);

        // Assert
        String encodedStr = new String(encoded, "UTF-8");
        Assert.assertEquals("QQ==", encodedStr);
    }

    @Test
    public void encodeBase64_givenTwoBytes_shouldPadOneEqual() throws Exception {
        // Arrange
        byte[] input = new byte[] { 'A', 'B' };

        // Act
        byte[] encoded = Base64.encodeBase64(input);

        // Assert
        String encodedStr = new String(encoded, "UTF-8");
        Assert.assertEquals("QUI=", encodedStr);
    }

    @Test
    public void encodeBase64_givenThreeBytes_shouldHaveNoPadding() throws Exception {
        // Arrange
        byte[] input = new byte[] { 'A', 'B', 'C' };

        // Act
        byte[] encoded = Base64.encodeBase64(input);

        // Assert
        String encodedStr = new String(encoded, "UTF-8");
        Assert.assertEquals("QUJD", encodedStr);
    }

    @Test
    public void isBase64_givenValidAndInvalidOctets_shouldIdentifyCorrectly() {
        // Arrange & Act & Assert
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) -1));
        Assert.assertFalse(Base64.isBase64((byte) ' '));
    }

    @Test
    public void isArrayByteBase64_givenArray_shouldValidateAccurately() {
        // Arrange & Act & Assert
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[] { 'A', 'B', 'C', '=' }));
        Assert.assertFalse(Base64.isArrayByteBase64(new byte[] { 'A', 'B', '%', '=' }));
    }

    @Test
    public void encodeBase64Chunked_givenData_shouldIncludeCrlf() throws Exception {
        // Arrange
        byte[] input = "01234567890123456789012345678901234567890123456789012345678901234567890123456789".getBytes("UTF-8");

        // Act
        byte[] encoded = Base64.encodeBase64Chunked(input);

        // Assert
        String result = new String(encoded, "UTF-8");
        Assert.assertTrue(result.contains("
"));
    }

    @Test
    public void encodeBase64URLSafe_givenData_shouldNotContainPlusOrSlash() {
        // Arrange
        byte[] input = new byte[] { (byte) 0xfb, (byte) 0xf0 };

        // Act
        byte[] encoded = Base64.encodeBase64URLSafe(input);

        // Assert
        for (int i = 0; i < encoded.length; i++) {
            Assert.assertFalse(encoded[i] == '+');
            Assert.assertFalse(encoded[i] == '/');
        }
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonByteArrayObject_shouldThrowEncoderException() throws Exception {
        // Arrange & Act & Assert
        this.base64.encode("Not a byte array");
    }

    @Test(expected = DecoderException.class)
    public void decode_givenNonByteArrayObject_shouldThrowDecoderException() throws Exception {
        // Arrange & Act & Assert
        this.base64.decode(new Integer(42));
    }

    @Test
    public void encodeIntegerAndDecodeInteger_givenBigInteger_shouldRoundTrip() {
        // Arrange
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");

        // Act
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);

        // Assert
        Assert.assertEquals(bigInt, decoded);
    }
}
