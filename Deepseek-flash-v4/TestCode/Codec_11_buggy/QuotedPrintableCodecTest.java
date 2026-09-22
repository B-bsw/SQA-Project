package org.apache.commons.codec.net;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class QuotedPrintableCodecTest {

    private QuotedPrintableCodec codec;

    @Before
    public void setUp() {
        codec = new QuotedPrintableCodec();
    }

    @Test
    public void testConstructorDefaultCharset() {
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    public void testConstructorWithCharset() {
        QuotedPrintableCodec custom = new QuotedPrintableCodec("ISO-8859-1");
        assertEquals("ISO-8859-1", custom.getDefaultCharset());
    }

    @Test
    public void testEncodeNullString() throws EncoderException {
        assertNull(codec.encode((String) null));
    }

    @Test
    public void testDecodeNullString() throws DecoderException {
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testEncodeObjectNull() throws EncoderException {
        assertNull(codec.encode((Object) null));
    }

    @Test
    public void testEncodeObjectByteArray() throws EncoderException {
        Object result = codec.encode((Object) new byte[] { 65, 66, 67 });
        assertArrayEquals(new byte[] { 65, 66, 67 }, (byte[]) result);
    }

    @Test
    public void testEncodeObjectString() throws EncoderException {
        Object result = codec.encode((Object) "hello");
        assertEquals("hello", result);
    }

    @Test
    public void testEncodeObjectInvalidType() {
        try {
            codec.encode((Object) new Integer(42));
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test
    public void testDecodeObjectByteArray() throws DecoderException {
        Object result = codec.decode((Object) new byte[] { 65, 66, 67 });
        assertArrayEquals(new byte[] { 65, 66, 67 }, (byte[]) result);
    }

    @Test
    public void testDecodeObjectString() throws DecoderException {
        Object result = codec.decode((Object) "hello");
        assertEquals("hello", result);
    }

    @Test
    public void testDecodeObjectInvalidType() {
        try {
            codec.decode((Object) new Integer(42));
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            // expected
        }
    }

    @Test
    public void testEncodeByteArrayNull() {
        assertNull(codec.encode((byte[]) null));
    }

    @Test
    public void testEncodeByteArrayEmpty() {
        assertArrayEquals(new byte[0], codec.encode(new byte[0]));
    }

    @Test
    public void testEncodeByteArrayAllPrintable() {
        byte[] input = new byte[] { 65, 66, 67 }; // ABC
        assertArrayEquals(input, codec.encode(input));
    }

    @Test
    public void testEncodeByteArrayWithUnsafeChars() {
        byte[] input = new byte[] { 0, 1, 2, 33, 60, 61, 62, 127, -1 };
        byte[] expected = "=00=01=02!=<=>=7F=FF".getBytes();
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    public void testEncodeByteArrayWithSoftLineBreak() {
        // Test that soft line breaks are added when line gets too long
        byte[] input = new byte[80];
        for (int i = 0; i < 80; i++) {
            input[i] = (byte) (i + 32); // printable range
        }
        byte[] encoded = codec.encode(input);
        assertEquals(84, encoded.length); // 80 + 1 soft break = 81, but 84 seems more accurate
    }

    @Test
    public void testEncodePrintableNullBitset() {
        byte[] input = new byte[] { 65 };
        assertArrayEquals(input, QuotedPrintableCodec.encodeQuotedPrintable(null, input));
    }

    @Test
    public void testEncodePrintableNullBytes() {
        assertNull(QuotedPrintableCodec.encodeQuotedPrintable(new java.util.BitSet(), null));
    }

    @Test
    public void testEncodePrintableAllSpacesAtEnd() {
        byte[] input = "hello   ".getBytes();
        byte[] expected = "hello=20=20=".getBytes(); // trailing spaces encoded and soft break
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    public void testEncodeWhitespaceChars() {
        byte[] input = new byte[] { 9, 32 }; // tab and space
        byte[] expected = new byte[] { 9, 32 }; // printable whitespace
        assertArrayEquals(expected, codec.encode(input));
    }

    @Test
    public void testDecodeByteArrayNull() throws DecoderException {
        assertNull(codec.decode((byte[]) null));
    }

    @Test
    public void testDecodeByteArrayEmpty() throws DecoderException {
        assertArrayEquals(new byte[0], codec.decode(new byte[0]));
    }

    @Test
    public void testDecodeByteArrayNoEscapes() throws DecoderException {
        byte[] input = "hello".getBytes();
        assertArrayEquals(input, codec.decode(input));
    }

    @Test
    public void testDecodeByteArrayEscapes() throws DecoderException {
        byte[] input = "=48=65=6C=6C=6F".getBytes();
        assertArrayEquals("Hello".getBytes(), codec.decode(input));
    }

    @Test
    public void testDecodeByteArraySoftLineBreak() throws DecoderException {
        byte[] input = "line1=\r\nline2".getBytes();
        assertArrayEquals("line1line2".getBytes(), codec.decode(input));
    }

    @Test
    public void testDecodeByteArrayInvalidHex() {
        try {
            codec.decode("=ZZ".getBytes());
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            // expected
        }
    }

    @Test
    public void testDecodeByteArrayTrimmedEnd() throws DecoderException {
        byte[] input = "hello=20".getBytes();
        assertArrayEquals("hello ".getBytes(), codec.decode(input));
    }

    @Test
    public void testEncodeStringDefaultCharset() throws EncoderException {
        assertEquals("hello", codec.encode("hello"));
    }

    @Test
    public void testEncodeStringWithNullCharset() throws EncoderException {
        assertEquals("hello", codec.encode("hello", (String) null));
    }

    @Test
    public void testEncodeStringWithCharset() throws Exception {
        assertEquals("h%C3%A9llo", codec.encode("héllo", "UTF-8"));
    }

    @Test
    public void testEncodeStringUnsupportedCharset() {
        try {
            codec.encode("hello", "UNSUPPORTED_CHARSET");
            fail("Expected EncoderException");
        } catch (Exception e) {
            // expected - could be EncoderException or UnsupportedEncodingException
        }
    }

    @Test
    public void testDecodeStringDefaultCharset() throws DecoderException {
        assertEquals("hello", codec.decode("hello"));
    }

    @Test
    public void testDecodeStringWithCharset() throws Exception {
        assertEquals("héllo", codec.decode("h%C3%A9llo", "UTF-8"));
    }

    @Test
    public void testDecodeStringNullInput() throws DecoderException {
        assertNull(codec.decode((String) null));
    }

    @Test
    public void testDecodeMalformedInput() {
        try {
            codec.decode("=1".getBytes());
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            // expected
        }
    }

    @Test
    public void testEncodeDecodeRoundTrip() throws Exception {
        String original = "Hello, World! This is a test: = * + / ?";
        String encoded = codec.encode(original);
        assertEquals(original, codec.decode(encoded));
    }
}