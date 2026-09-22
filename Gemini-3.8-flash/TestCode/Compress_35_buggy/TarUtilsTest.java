package org.apache.commons.compress.archivers.tar;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class TarUtilsTest {

    @Test
    public void parseOctal_givenValidOctalString_shouldReturnValue() {
        byte[] buffer = " 0755 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, result);
    }

    @Test
    public void parseOctal_givenAllSpacesWithTrailingNull_shouldReturnZero() {
        byte[] buffer = "      \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenBufferStartingWithNull_shouldReturnZero() {
        byte[] buffer = new byte[8];
        buffer[0] = 0;
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenOnlySpaces_shouldReturnZero() {
        byte[] buffer = "        ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenAllNulls_shouldReturnZero() {
        byte[] buffer = new byte[4];
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenOffsetAndLength_shouldParseCorrectRange() {
        byte[] buffer = "ABC 0123 \0XYZ".getBytes();
        long result = TarUtils.parseOctal(buffer, 3, 7);
        Assert.assertEquals(83L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenLengthLessThanTwo_shouldThrowIllegalArgumentException() {
        byte[] buffer = "0".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidCharacters_shouldThrowIllegalArgumentException() {
        byte[] buffer = " 0789 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void parseOctal_givenEmbeddedNulls_shouldFormatProperMessageInException() {
        byte[] buffer = new byte[]{' ', '8', 0, ' '};
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("{NUL}"));
        }
    }

    @Test
    public void parseOctalOrBinary_givenPositiveOctal_shouldParseCorrectly() {
        byte[] buffer = " 0644 \0".getBytes();
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(420L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryUnder9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[]{(byte) 0x80, 0, 0, 1, 0};
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(256L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryUnder9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[5];
        TarUtils.formatLongOctalOrBinaryBytes(-256L, buffer, 0, 5);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 5);
        Assert.assertEquals(-256L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinary9BytesOrMore_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(1099511627776L, buffer, 0, 12);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(1099511627776L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinary9BytesOrMore_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(-1099511627776L, buffer, 0, 12);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(-1099511627776L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_givenBigIntegerExceeding63Bits_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = (byte) 0x7F;
        for (int i = 2; i < buffer.length; i++) {
            buffer[i] = (byte) 0xFF;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void parseBoolean_givenOne_shouldReturnTrue() {
        byte[] buffer = new byte[]{0, 1, 0};
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void parseBoolean_givenZeroOrOther_shouldReturnFalse() {
        byte[] buffer = new byte[]{0, 2, (byte) 255};
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void parseName_givenAsciiName_shouldReturnString() {
        byte[] buffer = new byte[16];
        byte[] nameBytes = "testfile.txt".getBytes();
        System.arraycopy(nameBytes, 0, buffer, 0, nameBytes.length);

        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("testfile.txt", result);
    }

    @Test
    public void parseName_givenAllNulls_shouldReturnEmptyString() {
        byte[] buffer = new byte[10];
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", result);
    }

    @Test
    public void parseName_givenCustomZipEncoding_shouldDecodeCorrectly() throws IOException {
        byte[] buffer = "hello\0".getBytes();
        ZipEncoding encoding = TarUtils.FALLBACK_ENCODING;
        String result = TarUtils.parseName(buffer, 0, buffer.length, encoding);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void formatNameBytes_givenNormalString_shouldFillAndPadWithNulls() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("file", buffer, 0, 10);
        Assert.assertEquals(10, endOffset);
        Assert.assertEquals('f', (char) buffer[0]);
        Assert.assertEquals('i', (char) buffer[1]);
        Assert.assertEquals('l', (char) buffer[2]);
        Assert.assertEquals('e', (char) buffer[3]);
        for (int i = 4; i < 10; i++) {
            Assert.assertEquals(0, buffer[i]);
        }
    }

    @Test
    public void formatNameBytes_givenLongString_shouldTruncateToFit() {
        byte[] buffer = new byte[5];
        int endOffset = TarUtils.formatNameBytes("verylongfilename", buffer, 0, 5);
        Assert.assertEquals(5, endOffset);
        Assert.assertEquals("veryl", new String(buffer, 0, 5));
    }

    @Test
    public void formatNameBytes_withOffset_shouldWriteAtOffset() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("abc", buffer, 2, 5);
        Assert.assertEquals(7, endOffset);
        Assert.assertEquals('a', (char) buffer[2]);
        Assert.assertEquals('b', (char) buffer[3]);
        Assert.assertEquals('c', (char) buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
    }

    @Test
    public void formatUnsignedOctalString_givenZero_shouldFillWithLeadingZeros() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void formatUnsignedOctalString_givenPositiveValue_shouldFormatWithLeadingZeros() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 6);
        Assert.assertEquals("000010", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldFormatWithSpaceAndNullTrailer() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(493L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("0000755 ", new String(buffer, 0, 7));
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldFormatWithSpaceTrailerOnly() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(493L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("0000755 ", new String(buffer));
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenStandardPositiveValue_shouldFormatAsOctal() {
        byte[] buffer = new byte[12];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(100L, buffer, 0, 12);
        Assert.assertEquals(12, nextOffset);
        Assert.assertTrue(buffer[0] != (byte) 0x80);
        Assert.assertEquals(' ', (char) buffer[11]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenLargeValueUnder9Bytes_shouldFormatAsBinary() {
        byte[] buffer = new byte[8];
        long largeValue = 077777777L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(largeValue, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValueUnder9Bytes_shouldFormatAsBinary() {
        byte[] buffer = new byte[8];
        long negValue = -500L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(negValue, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(negValue, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenLargeValue9BytesOrMore_shouldFormatAsBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long largeValue = 0777777777777L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buffer, 0, 12);
        Assert.assertEquals(12, nextOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(largeValue, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValue9BytesOrMore_shouldFormatAsBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long negValue = -1234567890L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(negValue, buffer, 0, 12);
        Assert.assertEquals(12, nextOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(negValue, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_givenBinaryValueTooLargeForSmallField_shouldThrowException() {
        byte[] buffer = new byte[2];
        TarUtils.formatLongOctalOrBinaryBytes(65536L, buffer, 0, 2);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldFormatWithNullAndSpaceTrailer() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(123L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals("000173", new String(buffer, 0, 6));
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals((byte) ' ', buffer[7]);
    }

    @Test
    public void computeCheckSum_givenKnownByteArray_shouldCalculateAccurately() {
        byte[] buffer = new byte[]{1, 2, 3, (byte) 255};
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(261L, sum);
    }

    @Test
    public void verifyCheckSum_givenHeaderWithValidCheckSum_shouldReturnTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = (byte) (i % 127);
        }
        TarUtils.formatCheckSumOctalBytes(0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        long sum = 0;
        for (int i = 0; i < 512; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                sum += ' ';
            } else {
                sum += (header[i] & 0xFF);
            }
        }
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        boolean valid = TarUtils.verifyCheckSum(header);
        Assert.assertTrue(valid);
    }

    @Test
    public void verifyCheckSum_givenHeaderWithInvalidCheckSum_shouldReturnFalse() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'a');
        TarUtils.formatCheckSumOctalBytes(999L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        boolean valid = TarUtils.verifyCheckSum(header);
        Assert.assertFalse(valid);
    }

    @Test
    public void verifyCheckSum_givenHeaderWithSignedCheckSumMatch_shouldReturnTrue() {
        byte[] header = new byte[512];
        header[0] = (byte) -5;
        TarUtils.formatCheckSumOctalBytes(0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        long signedSum = 0;
        for (int i = 0; i < 512; i++) {
            byte b = header[i];
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                b = ' ';
            }
            signedSum += b;
        }

        if (signedSum > 0) {
            TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
            Assert.assertTrue(TarUtils.verifyCheckSum(header));
        }
    }

    @Test
    public void fallbackEncoding_shouldCorrectlyEncodeAndDecode() throws IOException {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        Assert.assertTrue(fallback.canEncode("TestString"));
        ByteBuffer encoded = fallback.encode("TestString");
        Assert.assertEquals(10, encoded.limit());

        byte[] raw = new byte[encoded.limit()];
        encoded.get(raw);
        Assert.assertEquals("TestString", new String(raw));

        byte[] withNull = new byte[]{'A', 'B', 0, 'C'};
        String decoded = fallback.decode(withNull);
        Assert.assertEquals("AB", decoded);
    }
}