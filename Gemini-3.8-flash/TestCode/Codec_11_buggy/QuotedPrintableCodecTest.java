package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuotedPrintableCodecTest {

    private QuotedPrintableCodec qpCodec;

    @Before
    public void setUp() {
        this.qpCodec = new QuotedPrintableCodec();
    }

    @Test
    public void encode_givenNullOrEmptyBytes_shouldReturnNullOrEmpty() throws Exception {
        // Arrange & Act & Assert
        Assert.assertNull(this.qpCodec.encode((byte[]) null));
        Assert.assertEquals(0, this.qpCodec.encode(new byte[0]).length);
    }

    @Test
    public void decode_givenNullOrEmptyBytes_shouldReturnNullOrEmpty() throws Exception {
        // Arrange & Act & Assert
        Assert.assertNull(this.qpCodec.decode((byte[]) null));
        Assert.assertEquals(0, this.qpCodec.decode(new byte[0]).length);
    }

    @Test
    public void encode_givenAsciiPrintableBytes_shouldNotEscape() throws Exception {
        // Arrange
        byte[] input = "Hello World!".getBytes("US-ASCII");

        // Act
        byte[] encoded = this.qpCodec.encode(input);

        // Assert
        Assert.assertEquals("Hello World!", new String(encoded, "US-ASCII"));
    }

    @Test
    public void encode_givenSpecialOrHighBytes_shouldEscapeWithEqualHex() throws Exception {
        // Arrange
        byte[] input = new byte[] { '=', (byte) 0xC3, (byte) 0xA9 };

        // Act
        byte[] encoded = this.qpCodec.encode(input);

        // Assert
        String encodedStr = new String(encoded, "US-ASCII");
        Assert.assertEquals("=3D=C3=A9", encodedStr);
    }

    @Test
    public void decode_givenValidQuotedPrintableBytes_shouldDecodeCorrectly() throws Exception {
        // Arrange
        byte[] input = "=3D=C3=A9".getBytes("US-ASCII");

        // Act
        byte[] decoded = this.qpCodec.decode(input);

        // Assert
        Assert.assertArrayEquals(new byte[] { '=', (byte) 0xC3, (byte) 0xA9 }, decoded);
    }

    @Test(expected = DecoderException.class)
    public void decode_givenInvalidHexSequence_shouldThrowDecoderException() throws Exception {
        // Arrange
        byte[] invalid = "=ZZ".getBytes("US-ASCII");

        // Act & Assert
        this.qpCodec.decode(invalid);
    }

    @Test
    public void encodeString_givenVariousCharsets_shouldEncodeCorrectly() throws Exception {
        // Arrange
        String input = "Hello=World";

        // Act
        String encoded = this.qpCodec.encode(input, "UTF-8");
        String decoded = this.qpCodec.decode(encoded, "UTF-8");

        // Assert
        Assert.assertEquals("Hello=3DWorld", encoded);
        Assert.assertEquals(input, decoded);
    }

    @Test
    public void encode_givenStringMethod_shouldRoundTrip() throws Exception {
        // Arrange
        String input = "Test 123 !";

        // Act
        String encoded = this.qpCodec.encode(input);
        String decoded = this.qpCodec.decode(encoded);

        // Assert
        Assert.assertEquals(input, decoded);
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonByteArrayOrString_shouldThrowEncoderException() throws Exception {
        // Arrange & Act & Assert
        this.qpCodec.encode(new Double(3.14));
    }

    @Test(expected = DecoderException.class)
    public void decode_givenNonByteArrayOrString_shouldThrowDecoderException() throws Exception {
        // Arrange & Act & Assert
        this.qpCodec.decode(new Double(3.14));
    }

    @Test
    public void getDefaultCharset_givenInstance_shouldReturnConfiguredCharset() {
        // Arrange
        QuotedPrintableCodec custom = new QuotedPrintableCodec("ISO-8859-1");

        // Act & Assert
        Assert.assertEquals("ISO-8859-1", custom.getDefaultCharset());
    }
}
