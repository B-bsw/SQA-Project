package org.apache.commons.compress.archivers.tar;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.Assert;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void constructor_shouldBePrivate() throws Exception {
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void parseOctal_givenValidOctalWithTrailingSpace_shouldReturnParsedValue() {
        byte[] buffer = new byte[] { ' ', ' ', '1', '2', '3', ' ', ' ' };
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, val);
    }

    @Test
    public void parseOctal_givenValidOctalWithTrailingNull_shouldReturnParsedValue() {
        byte[] buffer = new byte[] { '0', '7', '5', '5', 0 };
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, val);
    }

    @Test
    public void parseOctal_givenLeadingNullByte_shouldReturnZeroImmediately() {
        byte[] buffer = new byte[] { 0, '1', '2', '3', 0 };
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void parseOctal_givenOnlySpacesAndTrailingNull_shouldReturnZero() {
        byte[] buffer = new byte[] { ' ', ' ', ' ', 0 };
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenLengthLessThanTwo_shouldThrowException() {
        byte[] buffer = new byte[] { '7' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidTrailer_shouldThrowException() {
        byte[] buffer = new byte[] { '1', '2', '3' };
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenNonOctalDigit_shouldThrowException() {
        byte[] buffer = new byte[] { '1', '8', '3', ' ' };
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidCharacterBelowZero_shouldThrowException() {
        byte[] buffer = new byte[] { '/', '7', ' ' };
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveOctal_shouldParseOctal() {
        byte[] buffer = new byte[] { '0', '7', '7', '7', ' ' };
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(511L, val);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryShort_shouldParseBinaryLong() {
        byte[] buffer = new byte[] { (byte) 0x80, 0x01, 0x02 };
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(258L, val);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryShort_shouldParseNegativeLong() {
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xfe };
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-2L, val);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryBigInteger_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[buffer.length - 1] = 0x05;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(5L, val);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryBigInteger_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        Arrays.fill(buffer, (byte) 0xff);
        buffer[buffer.length - 1] = (byte) 0xfb;
        long val = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-5L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_givenBigIntegerOverflowingLong_shouldThrowException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0x7f;
        buffer[2] = (byte) 0xff;
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void parseBoolean_givenValueOne_shouldReturnTrue() {
        byte[] buffer = new byte[] { 0, 1, 0 };
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void parseBoolean_givenValueNotOne_shouldReturnFalse() {
        byte[] buffer = new byte[] { 0, 2, 0 };
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void parseName_givenEmptyZeroBuffer_shouldReturnEmptyString() {
        byte[] buffer = new byte[10];
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", name);
    }

    @Test
    public void parseName_givenAsciiName_shouldReturnDecodedString() {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 'a', 'b', 'c' };
        String name = TarUtils.parseName(buffer, 0, 5);
        Assert.assertEquals("test", name);
    }

    @Test
    public void parseName_givenFallbackEncoding_shouldDecodeCorrectly() {
        byte[] buffer = new byte[] { 'f', 'i', 'l', 'e', 0 };
        String result = TarUtils.FALLBACK_ENCODING.decode(buffer);
        Assert.assertEquals("file", result);
        Assert.assertTrue(TarUtils.FALLBACK_ENCODING.canEncode("file"));
        ByteBuffer encoded = TarUtils.FALLBACK_ENCODING.encode("file");
        Assert.assertEquals(4, encoded.limit());
    }

    @Test
    public void parseName_givenCustomFailingZipEncoding_shouldFallback() {
        ZipEncoding throwingEncoding = new ZipEncoding() {
            public boolean canEncode(String name) {
                return false;
            }
            public ByteBuffer encode(String name) throws IOException {
                throw new IOException("Simulated encode error");
            }
            public String decode(byte[] buffer) throws IOException {
                throw new IOException("Simulated decode error");
            }
        };
        byte[] buffer = new byte[] { 'h', 'e', 'l', 'l', 'o', 0 };
        try {
            TarUtils.parseName(buffer, 0, buffer.length, throwingEncoding);
            Assert.fail("Expected IOException");
        } catch (IOException expected) {
            Assert.assertEquals("Simulated decode error", expected.getMessage());
        }
    }

    @Test
    public void formatNameBytes_givenNormalString_shouldEncodeAndPadZeros() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("hello", buffer, 0, 8);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals('h', (char) buffer[0]);
        Assert.assertEquals('e', (char) buffer[1]);
        Assert.assertEquals('l', (char) buffer[2]);
        Assert.assertEquals('l', (char) buffer[3]);
        Assert.assertEquals('o', (char) buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
        Assert.assertEquals(0, buffer[8]);
    }

    @Test
    public void formatNameBytes_givenLongString_shouldTruncateToFit() {
        byte[] buffer = new byte[5];
        int endOffset = TarUtils.formatNameBytes("verylongname", buffer, 0, 5);
        Assert.assertEquals(5, endOffset);
        Assert.assertEquals('v', (char) buffer[0]);
        Assert.assertEquals('e', (char) buffer[1]);
        Assert.assertEquals('r', (char) buffer[2]);
        Assert.assertEquals('y', (char) buffer[3]);
        Assert.assertEquals('l', (char) buffer[4]);
    }

    @Test
    public void formatUnsignedOctalString_givenZero_shouldFillWithZeroCharacters() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 5);
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals('0', (char) buffer[i]);
        }
    }

    @Test
    public void formatUnsignedOctalString_givenValue_shouldFormatWithLeadingZeros() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 5);
        Assert.assertEquals("00010", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(512L, buffer, 0, 2);
    }

    @Test
    public void formatOctalBytes_givenValue_shouldPadSpaceAndNullAtEnd() {
        byte[] buffer = new byte[8];
        int res = TarUtils.formatOctalBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals("0000010", new String(buffer, 0, 6));
        Assert.assertEquals(' ', (char) buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatLongOctalBytes_givenValue_shouldEndWithTrailingSpace() {
        byte[] buffer = new byte[8];
        int res = TarUtils.formatLongOctalBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals("00000010", new String(buffer, 0, 7));
        Assert.assertEquals(' ', (char) buffer[7]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenSmallValue_shouldFormatAsOctal() {
        byte[] buffer = new byte[8];
        int res = TarUtils.formatLongOctalOrBinaryBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals(' ', (char) buffer[7]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(8L, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenLargeValueFittingSmallBinary_shouldFormatBinary() {
        byte[] buffer = new byte[8];
        long val = 077777777L;
        int res = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(val, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValueSmallLength_shouldFormatBinaryNegative() {
        byte[] buffer = new byte[8];
        long val = -12345L;
        int res = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(val, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenLargeLength_shouldFormatBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long val = 123456789012345L;
        int res = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, 12);
        Assert.assertEquals(12, res);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(val, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValueLargeLength_shouldFormatBigIntegerNegative() {
        byte[] buffer = new byte[12];
        long val = -123456789012345L;
        int res = TarUtils.formatLongOctalOrBinaryBytes(val, buffer, 0, 12);
        Assert.assertEquals(12, res);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(val, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_givenValueTooLargeForBinaryField_shouldThrowException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(1000L, buffer, 0, 2);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValue_shouldEndWithNullAndSpace() {
        byte[] buffer = new byte[8];
        int res = TarUtils.formatCheckSumOctalBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, res);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(' ', (char) buffer[7]);
    }

    @Test
    public void computeCheckSum_givenBytes_shouldReturnUnsignedSum() {
        byte[] buffer = new byte[] { (byte) 0xff, 1, 2, 3 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(255L + 1L + 2L + 3L, sum);
    }

    @Test
    public void verifyCheckSum_givenHeaderWithValidCheckSum_shouldReturnTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i & 0x7f);
        }
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_givenInvalidCheckSum_shouldReturnFalse() {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(1234L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        header[0] = 1;
        Assert.assertFalse(TarUtils.verifyCheckSum(header));
    }
}