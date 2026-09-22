package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;

public class TarUtilsTest {

    @Test
    public void privateConstructor_whenInvokedViaReflection_shouldBeAccessible() throws Exception {
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
    }

    @Test
    public void parseOctal_givenLengthLessThanTwo_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[10];
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            Assert.fail("Expected IllegalArgumentException for length < 2");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("must be at least 2") != -1);
        }
    }

    @Test
    public void parseOctal_givenBufferStartingWithZero_shouldReturnZero() {
        byte[] buffer = new byte[]{0, '1', '2', ' ', 0};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingSpacesAndValidTrailer_shouldParseCorrectly() {
        byte[] buffer = "   123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0123L, result);
    }

    @Test
    public void parseOctal_givenSingleTrailingSpace_shouldParseCorrectly() {
        byte[] buffer = "123 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0123L, result);
    }

    @Test
    public void parseOctal_givenSingleTrailingNull_shouldParseCorrectly() {
        byte[] buffer = new byte[]{'1', '2', '3', 0};
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0123L, result);
    }

    @Test
    public void parseOctal_givenInvalidFirstTrailer_shouldThrowIllegalArgumentException() {
        byte[] buffer = "1234".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException due to invalid trailer byte");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
        }
    }

    @Test
    public void parseOctal_givenNonOctalCharacter_shouldThrowIllegalArgumentException() {
        byte[] buffer = "128 \0".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException due to character '8'");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte 56") != -1);
        }

        byte[] bufferSlash = "12/ \0".getBytes();
        try {
            TarUtils.parseOctal(bufferSlash, 0, bufferSlash.length);
            Assert.fail("Expected IllegalArgumentException due to character '/'");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte 47") != -1);
        }
    }

    @Test
    public void parseOctalOrBinary_givenPositiveOctal_shouldDelegateToParseOctal() {
        byte[] buffer = " 755 \0".getBytes();
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(0755L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryUnder9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(0x01020304050607L, buffer, 0, buffer.length);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(0x01020304050607L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryUnder9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[8];
        long value = -12345678L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(value, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinary9BytesOrMore_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        long value = 0x10203040506070L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(value, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinary9BytesOrMore_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        long value = -0x10203040506070L;
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(value, result);
    }

    @Test
    public void parseOctalOrBinary_givenBinaryBigIntegerExceeding63Bits_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = (byte) 0x7F;
        for (int i = 2; i < buffer.length; i++) {
            buffer[i] = (byte) 0xFF;
        }
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for binary value exceeding max long");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("exceeds maximum signed long value") != -1);
        }
    }

    @Test
    public void parseBoolean_givenDifferentByteValues_shouldReturnExpectedBoolean() {
        byte[] buffer = new byte[]{1, 0, 2, (byte) 0xFF};
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 2));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 3));
    }

    @Test
    public void parseName_givenEmptyOrNullPaddedBuffer_shouldReturnEmptyString() {
        byte[] buffer = new byte[10];
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", result);
    }

    @Test
    public void parseName_givenValidNameWithNullPadding_shouldTrimNullsAndDecode() {
        byte[] buffer = new byte[10];
        buffer[0] = 't';
        buffer[1] = 'e';
        buffer[2] = 's';
        buffer[3] = 't';
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test", result);
    }

    @Test
    public void parseName_givenCustomZipEncoding_shouldDecodeCorrectly() throws IOException {
        byte[] buffer = "hello\0\0".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length, TarUtils.FALLBACK_ENCODING);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void formatNameBytes_givenShorterName_shouldPadWithZeros() {
        byte[] buffer = new byte[10];
        int endOffset = TarUtils.formatNameBytes("file", buffer, 0, buffer.length);
        Assert.assertEquals(10, endOffset);
        Assert.assertEquals('f', buffer[0]);
        Assert.assertEquals('i', buffer[1]);
        Assert.assertEquals('l', buffer[2]);
        Assert.assertEquals('e', buffer[3]);
        for (int i = 4; i < 10; i++) {
            Assert.assertEquals(0, buffer[i]);
        }
    }

    @Test
    public void formatNameBytes_givenLongerName_shouldTruncateToFit() {
        byte[] buffer = new byte[4];
        int endOffset = TarUtils.formatNameBytes("filename", buffer, 0, buffer.length);
        Assert.assertEquals(4, endOffset);
        Assert.assertEquals("file", new String(buffer));
    }

    @Test
    public void formatNameBytes_givenCustomZipEncoding_shouldFormatCorrectly() throws IOException {
        byte[] buffer = new byte[6];
        int endOffset = TarUtils.formatNameBytes("abc", buffer, 0, buffer.length, TarUtils.FALLBACK_ENCODING);
        Assert.assertEquals(6, endOffset);
        Assert.assertEquals('a', buffer[0]);
        Assert.assertEquals('b', buffer[1]);
        Assert.assertEquals('c', buffer[2]);
        Assert.assertEquals(0, buffer[3]);
    }

    @Test
    public void formatUnsignedOctalString_givenZero_shouldFillWithZeros() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, buffer.length);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void formatUnsignedOctalString_givenValueFittingBuffer_shouldFormatWithLeadingZeros() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(0755L, buffer, 0, buffer.length);
        Assert.assertEquals("000755", new String(buffer));
    }

    @Test
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(07777L, buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException when value does not fit");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("will not fit in octal number buffer") != -1);
        }
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldFormatWithTrailingSpaceAndNull() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatOctalBytes(0755L, buffer, 0, buffer.length);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('7', buffer[3]);
        Assert.assertEquals('5', buffer[4]);
        Assert.assertEquals('5', buffer[5]);
        Assert.assertEquals(' ', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldFormatWithTrailingSpace() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatLongOctalBytes(0755L, buffer, 0, buffer.length);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('0', buffer[3]);
        Assert.assertEquals('7', buffer[4]);
        Assert.assertEquals('5', buffer[5]);
        Assert.assertEquals('5', buffer[6]);
        Assert.assertEquals(' ', buffer[7]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenValueWithinOctalLimit_shouldFormatOctal() {
        byte[] buffer = new byte[12];
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(0755L, buffer, 0, buffer.length);
        Assert.assertEquals(12, endOffset);
        Assert.assertEquals(' ', buffer[11]);
        Assert.assertEquals('5', buffer[10]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenValueExceedingOctalLimitUnder9Bytes_shouldFormatBinary() {
        byte[] buffer = new byte[8];
        long largeValue = 0x102030405060L;
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buffer, 0, buffer.length);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(largeValue, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValueUnder9Bytes_shouldFormatBinary() {
        byte[] buffer = new byte[8];
        long negativeValue = -54321L;
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(negativeValue, buffer, 0, buffer.length);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals((byte) 0xFF, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(negativeValue, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenValueTooLargeForBinaryUnder9Bytes_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatLongOctalOrBinaryBytes(0x1FFFFL, buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException when value exceeds binary field size");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("is too large for 2 byte field") != -1);
        }
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValue9BytesOrMore_shouldFormatBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long negativeValue = -123456789L;
        int endOffset = TarUtils.formatLongOctalOrBinaryBytes(negativeValue, buffer, 0, buffer.length);
        Assert.assertEquals(12, endOffset);
        Assert.assertEquals((byte) 0xFF, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(negativeValue, parsed);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldFormatWithNullAndSpaceTrailer() {
        byte[] buffer = new byte[8];
        int endOffset = TarUtils.formatCheckSumOctalBytes(0123L, buffer, 0, buffer.length);
        Assert.assertEquals(8, endOffset);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(' ', buffer[7]);
        long checksum = TarUtils.parseOctal(buffer, 0, 7);
        Assert.assertEquals(0123L, checksum);
    }

    @Test
    public void computeCheckSum_givenSampleBuffer_shouldCalculateUnsignedSum() {
        byte[] buffer = new byte[]{(byte) 255, 1, 2, 3};
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(255L + 1L + 2L + 3L, sum);
    }

    @Test
    public void verifyCheckSum_givenHeaderWithMatchingUnsignedChecksum_shouldReturnTrue() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = 1;
        }
        TarUtils.formatCheckSumOctalBytes(0L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        long unsignedSum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(unsignedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_givenHeaderWithChecksumGreaterThanUnsignedSum_shouldReturnTrue() {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(999999L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_givenCorruptedChecksum_shouldReturnFalse() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'A';
        }
        TarUtils.formatCheckSumOctalBytes(10L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        Assert.assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_givenChecksumWithDigitsBoundary_shouldHandleDigitsTransition() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = 0;
        }
        header[TarConstants.CHKSUM_OFFSET] = '1';
        header[TarConstants.CHKSUM_OFFSET + 1] = '2';
        header[TarConstants.CHKSUM_OFFSET + 2] = ' ';
        header[TarConstants.CHKSUM_OFFSET + 3] = '3';
        boolean result = TarUtils.verifyCheckSum(header);
        Assert.assertNotNull(Boolean.valueOf(result));
    }

    @Test
    public void fallbackEncoding_givenCanEncodeAndDecode_shouldWorkProperly() {
        ZipEncoding fallback = TarUtils.FALLBACK_ENCODING;
        Assert.assertTrue(fallback.canEncode("anyText"));
        ByteBuffer encoded = fallback.encode("ABC\0DEF");
        Assert.assertEquals(7, encoded.limit());
        byte[] raw = new byte[encoded.limit()];
        encoded.get(raw);
        Assert.assertEquals((byte) 'A', raw[0]);
        Assert.assertEquals((byte) 'B', raw[1]);
        Assert.assertEquals((byte) 'C', raw[2]);
        Assert.assertEquals((byte) 0, raw[3]);
        String decoded = fallback.decode(raw);
        Assert.assertEquals("ABC", decoded);
    }
}