package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class TarUtilsTest {

    @Test
    public void parseOctal_givenLengthLessThanTwo_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[] { '0' };
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            Assert.fail("Expected IllegalArgumentException when length < 2");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("must be at least 2") != -1);
        }
    }

    @Test
    public void parseOctal_givenAllZeroBuffer_shouldReturnZero() {
        byte[] buffer = new byte[] { 0, 0, 0, 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingAndTrailingSpacesAndNuls_shouldParseSuccessfully() {
        byte[] buffer = new byte[] { ' ', ' ', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, result);
    }

    @Test
    public void parseOctal_givenOffset_shouldParseProperSegment() {
        byte[] buffer = new byte[] { 'X', 'X', '7', '5', '5', ' ', 'Y' };
        long result = TarUtils.parseOctal(buffer, 2, 4);
        Assert.assertEquals(493L, result);
    }

    @Test
    public void parseOctal_givenAllSpaces_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[] { ' ', ' ', ' ' };
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for all spaces");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
        }
    }

    @Test
    public void parseOctal_givenTrailingSpacesFollowedByNonOctal_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[] { '1', '8', ' ' };
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for non-octal digit 8");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte 56") != -1);
        }
    }

    @Test
    public void parseOctal_givenInvalidCharacters_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[] { 'a', 'b', ' ' };
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for letters");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
        }
    }

    @Test
    public void parseOctalOrBinary_givenPositiveOctal_shouldParseCorrectly() {
        byte[] buffer = new byte[] { '0', '7', '5', '5', ' ' };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(493L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryLessThan9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[] { (byte) 0x80, 0x01, 0x02 };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(258L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryLessThan9Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xfe };
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-2L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinary12Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[10] = 0x01;
        buffer[11] = 0x00;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(256L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinary12Bytes_shouldParseCorrectly() {
        byte[] buffer = new byte[12];
        Arrays.fill(buffer, (byte) 0xff);
        buffer[11] = (byte) 0xfe;
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        Assert.assertEquals(-2L, result);
    }

    @Test
    public void parseOctalOrBinary_givenBinaryExceeding63Bits_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[12];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0x01;
        buffer[2] = 0x00;
        buffer[3] = 0x00;
        buffer[4] = 0x00;
        buffer[5] = 0x00;
        buffer[6] = 0x00;
        buffer[7] = 0x00;
        buffer[8] = 0x00;
        buffer[9] = 0x00;
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for exceeding 63 bits");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("exceeds maximum signed long value") != -1);
        }
    }

    @Test
    public void parseBoolean_givenOne_shouldReturnTrue() {
        byte[] buffer = new byte[] { 0, 1, 0 };
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void parseBoolean_givenZeroOrOther_shouldReturnFalse() {
        byte[] buffer = new byte[] { 0, 2, (byte) 0xFF };
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void parseName_givenEmptyOrNullBuffer_shouldReturnEmptyString() {
        byte[] buffer = new byte[10];
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("", name);
    }

    @Test
    public void parseName_givenNormalStringWithTrailingNul_shouldReturnParsedString() {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 0, 0 };
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("test", name);
    }

    @Test
    public void parseName_givenFullBufferWithoutTrailingNul_shouldReturnFullString() {
        byte[] buffer = new byte[] { 'f', 'u', 'l', 'l' };
        String name = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("full", name);
    }

    @Test
    public void parseName_withCustomEncoding_shouldParseCorrectly() throws IOException {
        byte[] buffer = new byte[] { 'a', 'b', 'c', 0 };
        String name = TarUtils.parseName(buffer, 0, buffer.length, TarUtils.FALLBACK_ENCODING);
        Assert.assertEquals("abc", name);
    }

    @Test
    public void formatNameBytes_givenShorterString_shouldPadWithZeros() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatNameBytes("file", buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('f', buffer[0]);
        Assert.assertEquals('i', buffer[1]);
        Assert.assertEquals('l', buffer[2]);
        Assert.assertEquals('e', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatNameBytes_givenLongerString_shouldTruncateToFit() {
        byte[] buffer = new byte[4];
        int nextOffset = TarUtils.formatNameBytes("verylongfilename", buffer, 0, 4);
        Assert.assertEquals(4, nextOffset);
        Assert.assertEquals('v', buffer[0]);
        Assert.assertEquals('e', buffer[1]);
        Assert.assertEquals('r', buffer[2]);
        Assert.assertEquals('y', buffer[3]);
    }

    @Test
    public void formatNameBytes_withOffset_shouldWriteAtProperPosition() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("hi", buffer, 2, 4);
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals(0, buffer[1]);
        Assert.assertEquals('h', buffer[2]);
        Assert.assertEquals('i', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatUnsignedOctalString_givenZero_shouldFillWithZeros() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void formatUnsignedOctalString_givenNonZero_shouldFormatCorrectly() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(7L, buffer, 0, 4);
        Assert.assertEquals("0007", new String(buffer));
    }

    @Test
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
            Assert.fail("Expected IllegalArgumentException when value does not fit");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("will not fit in octal number buffer") != -1);
        }
    }

    @Test
    public void formatOctalBytes_shouldTerminateWithSpaceAndNul() {
        byte[] buffer = new byte[6];
        int nextOffset = TarUtils.formatOctalBytes(7L, buffer, 0, 6);
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('7', buffer[3]);
        Assert.assertEquals(' ', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatLongOctalBytes_shouldTerminateWithSpace() {
        byte[] buffer = new byte[5];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, 5);
        Assert.assertEquals(5, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('7', buffer[3]);
        Assert.assertEquals(' ', buffer[4]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenSmallPositiveValue_shouldFormatAsOctal() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(123L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', buffer[7]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(123L, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenSmallNegativeValueUnder9Bytes_shouldFormatAsBinary() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(-5L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(-5L, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenLargeValueLength12_shouldFormatAsBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long value = TarConstants.MAXSIZE + 1000L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        Assert.assertEquals(12, nextOffset);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeValueLength12_shouldFormatAsBigIntegerBinary() {
        byte[] buffer = new byte[12];
        long value = -123456789L;
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        Assert.assertEquals(12, nextOffset);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenTooLargeValueForLength_shouldThrowIllegalArgumentException() {
        byte[] buffer = new byte[3];
        try {
            TarUtils.formatLongOctalOrBinaryBytes(0x10000L, buffer, 0, 3);
            Assert.fail("Expected IllegalArgumentException when value exceeds length capacity");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("is too large for") != -1);
        }
    }

    @Test
    public void formatCheckSumOctalBytes_shouldTerminateWithNulAndSpace() {
        byte[] buffer = new byte[6];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(7L, buffer, 0, 6);
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('7', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(' ', buffer[5]);
    }

    @Test
    public void computeCheckSum_givenBytes_shouldReturnUnsignedSum() {
        byte[] buffer = new byte[] { 10, (byte) 250, 5 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(10L + 250L + 5L, sum);
    }

    @Test
    public void verifyCheckSum_givenValidHeader_shouldReturnTrue() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'a');
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        boolean valid = TarUtils.verifyCheckSum(header);
        Assert.assertTrue(valid);
    }

    @Test
    public void verifyCheckSum_givenCorruptedHeader_shouldReturnFalse() {
        byte[] header = new byte[512];
        Arrays.fill(header, (byte) 'a');
        TarUtils.formatCheckSumOctalBytes(1234L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        header[0] = 'z';

        boolean valid = TarUtils.verifyCheckSum(header);
        Assert.assertFalse(valid);
    }

    @Test
    public void fallbackEncoding_canEncodeAndDecodeCorrectly() {
        String testString = "Hello Tar!";
        ByteBuffer buf = TarUtils.FALLBACK_ENCODING.encode(testString);
        Assert.assertEquals(testString.length(), buf.limit());
        String decoded = TarUtils.FALLBACK_ENCODING.decode(buf.array());
        Assert.assertEquals(testString, decoded);
        Assert.assertTrue(TarUtils.FALLBACK_ENCODING.canEncode(testString));
    }

    @Test
    public void fallbackEncoding_decodeWithNulTerminator_shouldTruncateAtNul() {
        byte[] bytes = new byte[] { 'A', 'B', 0, 'C' };
        String decoded = TarUtils.FALLBACK_ENCODING.decode(bytes);
        Assert.assertEquals("AB", decoded);
    }
}