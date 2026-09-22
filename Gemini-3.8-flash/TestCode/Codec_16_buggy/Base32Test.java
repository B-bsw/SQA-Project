package org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base32Test {

    private Base32 base32;

    @Before
    public void setUp() {
        this.base32 = new Base32();
    }

    @Test
    public void encode_givenNullOrEmpty_shouldReturnNullOrEmpty() {
        // Arrange & Act & Assert
        Assert.assertNull(this.base32.encode(null));
        Assert.assertEquals(0, this.base32.encode(new byte[0]).length);
    }

    @Test
    public void decode_givenNullOrEmpty_shouldReturnNullOrEmpty() {
        // Arrange & Act & Assert
        Assert.assertNull(this.base32.decode((byte[]) null));
        Assert.assertEquals(0, this.base32.decode(new byte[0]).length);
    }

    @Test
    public void encodeAndDecode_givenBasicData_shouldRoundTrip() throws Exception {
        // Arrange
        byte[] original = "Hello Base32!".getBytes("UTF-8");

        // Act
        byte[] encoded = this.base32.encode(original);
        byte[] decoded = this.base32.decode(encoded);

        // Assert
        Assert.assertArrayEquals(original, decoded);
    }

    @Test
    public void encode_givenDifferentLengths_shouldPadWithEquals() throws Exception {
        // RFC 4648 test vectors
        Assert.assertEquals("MY======", new String(this.base32.encode("f".getBytes("UTF-8")), "UTF-8"));
        Assert.assertEquals("MZXQ====", new String(this.base32.encode("fo".getBytes("UTF-8")), "UTF-8"));
        Assert.assertEquals("MZXW6===", new String(this.base32.encode("foo".getBytes("UTF-8")), "UTF-8"));
        Assert.assertEquals("MZXW6YQ=", new String(this.base32.encode("foob".getBytes("UTF-8")), "UTF-8"));
        Assert.assertEquals("MZXW6YTB", new String(this.base32.encode("fooba".getBytes("UTF-8")), "UTF-8"));
    }

    @Test
    public void base32Hex_givenHexMode_shouldUseHexAlphabet() throws Exception {
        // Arrange
        Base32 base32Hex = new Base32(true);

        // Act
        byte[] encoded = base32Hex.encode("fooba".getBytes("UTF-8"));

        // Assert
        Assert.assertEquals("CPNMUOJ1", new String(encoded, "UTF-8"));
    }

    @Test
    public void isInAlphabet_givenValidAndInvalidBytes_shouldReturnExpected() {
        // Arrange & Act & Assert
        Assert.assertTrue(this.base32.isInAlphabet((byte) 'A'));
        Assert.assertTrue(this.base32.isInAlphabet((byte) '7'));
        Assert.assertFalse(this.base32.isInAlphabet((byte) '8'));
        Assert.assertFalse(this.base32.isInAlphabet((byte) '9'));
        Assert.assertFalse(this.base32.isInAlphabet((byte) -1));
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonByteArray_shouldThrowEncoderException() throws Exception {
        // Arrange & Act & Assert
        this.base32.encode("Not a byte array");
    }

    @Test(expected = DecoderException.class)
    public void decode_givenNonByteArray_shouldThrowDecoderException() throws Exception {
        // Arrange & Act & Assert
        this.base32.decode(new Integer(99));
    }
}
