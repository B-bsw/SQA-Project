package org.apache.commons.compress.archivers.tar;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.Assert;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void constructor_givenPrivateModifier_shouldBeInaccessibleNormally() throws Exception {
        // Arrange
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);

        // Act
        boolean isPrivate = Modifier.isPrivate(constructor.getModifiers());
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);

        // Assert
        Assert.assertTrue(isPrivate);
        Assert.assertNotNull(instance);
    }

    @Test
    public void fallbackEncoding_givenVariousInputs_shouldEncodeAndDecodeCorrectly() {
        // Arrange
        ZipEncoding encoding = TarUtils.FALLBACK_ENCODING;
        String testString = "test-name";

        // Act & Assert
        Assert.assertTrue(encoding.canEncode(testString));

        ByteBuffer buffer = encoding.encode(testString);
        Assert.assertEquals(testString.length(), buffer.limit());

        byte[] withNul = new byte[] { (byte) 'a', (byte) 'b', 0, (byte) 'c' };
        String decoded = encoding.decode(withNul);
        Assert.assertEquals("ab", decoded);

        byte[] withoutNul = new byte[] { (byte) 'x', (byte) 'y' };
        Assert.assertEquals("xy", encoding.decode(withoutNul));
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenLengthLessThanTwo_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[] { (byte) '0' };

        // Act
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void parseOctal_givenBufferStartingWithZero_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[] { 0, (byte) '7', (byte) '7' };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, 3);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingAndTrailingSpacesAndNulls_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) ' ', (byte) ' ', (byte) '1', (byte) '2', (byte) '3', (byte) ' ', 0
        };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(83L, result); // 123 in octal = 1*64 + 2*8 + 3 = 83
    }

    @Test
    public void parseOctal_givenEmbeddedZeroByte_shouldStopParsingAtZero() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) '1', (byte) '2', 0, (byte) '7', (byte) ' '
        };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(10L, result); // 12 in octal = 10
    }

    @Test
    public void parseOctal_givenAllSpaces_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) ' ', (byte) ' ', (byte) ' '
        };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenInvalidOctalByte_shouldThrowExceptionWithMessage() {
        // Arrange
        byte[] buffer = new byte[] { (byte) '1', (byte) '8', (byte) ' ' };

        // Act & Assert
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for invalid octal digit '8'");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte 56 at offset 1") >= 0);
        }
    }

    @Test
    public void parseOctal_givenByteLessThanZeroChar_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { (byte) '/', (byte) ' ' };

        // Act & Assert
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for character '/'");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") >= 0);
        }
    }

    @Test
    public void parseOctalOrBinary_givenPositiveOctal_shouldDelegateToParseOctal() {
        // Arrange
        byte[] buffer = new byte[] { (byte) '0', (byte) '7', (byte) '5', 0 };

        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(61L, result); // 075 octal = 61 decimal
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryUnderNineBytes_shouldParseBinaryLong() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0x80, 0, 0, 0, 0, 0, 0, (byte) 0x2A
        };

        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(42L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryUnderNineBytes_shouldParseNegativeBinaryLong() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xd6
        };

        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(-42L, result);
    }

    @Test
    public void parseOctalOrBinary_givenPositiveBinaryAtOrOverNineBytes_shouldParseBinaryBigInteger() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0
        };

        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(256L, result);
    }

    @Test
    public void parseOctalOrBinary_givenNegativeBinaryAtOrOverNineBytes_shouldParseNegativeBinaryBigInteger() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
            (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
            (byte) 0xfe, (byte) 0x00
        };

        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(-512L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_givenBinaryBigIntegerExceeding63Bits_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0x80, (byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };

        // Act
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void parseBoolean_givenVariousValues_shouldReturnExpectedBoolean() {
        // Arrange
        byte[] buffer = new byte[] { 1, 0, 2, (byte) 0xff };

        // Act & Assert
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 2));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 3));
    }

    @Test
    public void parseName_givenTrailingNulls_shouldTrimTrailingNulls() {
        // Arrange
        byte[] buffer = new byte[] { (byte) 'a', (byte) 'b', (byte) 'c', 0, 0, 0 };

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("abc", result);
    }

    @Test
    public void parseName_givenAllNulls_shouldReturnEmptyString() {
        // Arrange
        byte[] buffer = new byte[] { 0, 0, 0, 0 };

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void parseName_givenCustomEncodingThrowingIOException_shouldUseFallbackEncoding() {
        // Arrange
        byte[] buffer = new byte[] { (byte) 'H', (byte) 'e', (byte) 'l', (byte) 'l', (byte) 'o', 0 };
        ZipEncoding faultyEncoding = new ZipEncoding() {
            public boolean canEncode(String name) {
                return false;
            }
            public ByteBuffer encode(String name) throws IOException {
                throw new IOException("Simulated encode error");
            }
            public String decode(byte[] data) throws IOException {
                throw new IOException("Simulated decode error");
            }
        };

        // Act & Assert
        try {
            TarUtils.parseName(buffer, 0, buffer.length, faultyEncoding);
            Assert.fail("Expected IOException from custom encoding");
        } catch (IOException expected) {
            // expected when calling method with ZipEncoding parameter
        }

        // Test fallback mechanism via parseName(buffer, offset, length) default route
        String parsed = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("Hello", parsed);
    }

    @Test
    public void formatNameBytes_givenShortName_shouldPadWithNulls() {
        // Arrange
        byte[] buffer = new byte[8];
        String name = "tar";

        // Act
        int offsetResult = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(8, offsetResult);
        Assert.assertEquals((byte) 't', buffer[0]);
        Assert.assertEquals((byte) 'a', buffer[1]);
        Assert.assertEquals((byte) 'r', buffer[2]);
        for (int i = 3; i < 8; i++) {
            Assert.assertEquals(0, buffer[i]);
        }
    }

    @Test
    public void formatNameBytes_givenLongName_shouldTruncateToFit() {
        // Arrange
        byte[] buffer = new byte[4];
        String name = "longfilename";

        // Act
        int offsetResult = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(4, offsetResult);
        Assert.assertEquals((byte) 'l', buffer[0]);
        Assert.assertEquals((byte) 'o', buffer[1]);
        Assert.assertEquals((byte) 'n', buffer[2]);
        Assert.assertEquals((byte) 'g', buffer[3]);
    }

    @Test
    public void formatUnsignedOctalString_givenZeroValue_shouldFormatWithZeros() {
        // Arrange
        byte[] buffer = new byte[4];

        // Act
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);

        // Assert
        Assert.assertEquals((byte) '0', buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '0', buffer[2]);
        Assert.assertEquals((byte) '0', buffer[3]);
    }

    @Test
    public void formatUnsignedOctalString_givenNonZeroValue_shouldFormatRightAlignedPaddedWithZeros() {
        // Arrange
        byte[] buffer = new byte[5];

        // Act
        TarUtils.formatUnsignedOctalString(9L, buffer, 0, 5); // 9 decimal = 00011 octal

        // Assert
        Assert.assertEquals((byte) '0', buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '0', buffer[2]);
        Assert.assertEquals((byte) '1', buffer[3]);
        Assert.assertEquals((byte) '1', buffer[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[2];

        // Act - 100 decimal requires 3 octal digits ('144'), but length is only 2
        TarUtils.formatUnsignedOctalString(100L, buffer, 0, 2);
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldEndWithSpaceAndNull() {
        // Arrange
        byte[] buffer = new byte[6];

        // Act
        int endOffset = TarUtils.formatOctalBytes(8L, buffer, 0, 6); // 8 = 0010 in 4 chars

        // Assert
        Assert.assertEquals(6, endOffset);
        Assert.assertEquals((byte) '0', buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '1', buffer[2]);
        Assert.assertEquals((byte) '0', buffer[3]);
        Assert.assertEquals((byte) ' ', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldEndWithSpaceOnly() {
        // Arrange
        byte[] buffer = new byte[5];

        // Act
        int endOffset = TarUtils.formatLongOctalBytes(8L, buffer, 0, 5);

        // Assert
        Assert.assertEquals(5, endOffset);
        Assert.assertEquals((byte) '0', buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '1', buffer[2]);
        Assert.assertEquals((byte) '0', buffer[3]);
        Assert.assertEquals((byte) ' ', buffer[4]);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldEndWithNullAndSpace() {
        // Arrange
        byte[] buffer = new byte[6];

        // Act
        int endOffset = TarUtils.formatCheckSumOctalBytes(8L, buffer, 0, 6);

        // Assert
        Assert.assertEquals(6, endOffset);
        Assert.assertEquals((byte) '0', buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '1', buffer[2]);
        Assert.assertEquals((byte) '0', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals((byte) ' ', buffer[5]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenValueWithinOctalLimit_shouldFormatOctal() {
        // Arrange
        byte[] buffer = new byte[TarConstants.UIDLEN];

        // Act
        int result = TarUtils.formatLongOctalOrBinaryBytes(123L, buffer, 0, TarConstants.UIDLEN);

        // Assert
        Assert.assertEquals(TarConstants.UIDLEN, result);
        Assert.assertEquals((byte) ' ', buffer[TarConstants.UIDLEN - 1]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, TarConstants.UIDLEN);
        Assert.assertEquals(123L, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenPositiveBinaryUnderNineBytes_shouldFormatBinary() {
        // Arrange
        byte[] buffer = new byte[8];
        long value = TarConstants.MAXID + 10L;

        // Act
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 8);

        // Assert
        Assert.assertEquals(8, result);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeBinaryUnderNineBytes_shouldFormatBinary() {
        // Arrange
        byte[] buffer = new byte[8];
        long value = -12345L;

        // Act
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 8);

        // Assert
        Assert.assertEquals(8, result);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 8);
        Assert.assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_givenPositiveValueTooLargeForSmallField_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[2]; // length 2 -> bits = 8, max = 256

        // Act
        TarUtils.formatLongOctalOrBinaryBytes(300L, buffer, 0, 2);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenPositiveBinaryAtOrOverNineBytes_shouldFormatBigIntegerBinary() {
        // Arrange
        byte[] buffer = new byte[12];
        long value = TarConstants.MAXSIZE + 500L;

        // Act
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);

        // Assert
        Assert.assertEquals(12, result);
        Assert.assertEquals((byte) 0x80, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNegativeBinaryAtOrOverNineBytes_shouldFormatBigIntegerBinary() {
        // Arrange
        byte[] buffer = new byte[12];
        long value = -987654321L;

        // Act
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);

        // Assert
        Assert.assertEquals(12, result);
        Assert.assertEquals((byte) 0xff, buffer[0]);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void computeCheckSum_givenVariousBytes_shouldSumUnsignedBytes() {
        // Arrange
        byte[] buffer = new byte[] { 1, 2, (byte) 255 };

        // Act
        long sum = TarUtils.computeCheckSum(buffer);

        // Assert
        Assert.assertEquals(1 + 2 + 255, sum);
    }

    @Test
    public void verifyCheckSum_givenStandardOctalChecksum_shouldReturnTrue() {
        // Arrange
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'a';
        }

        // Fill checksum position with 8 spaces to simulate standard tar header state
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = (byte) ' ';
        }

        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        // Act
        boolean valid = TarUtils.verifyCheckSum(header);

        // Assert
        Assert.assertTrue(valid);
    }

    @Test
    public void verifyCheckSum_givenDigitsExceedingSix_shouldHandleDigitsBoundaryCorrectly() {
        // Arrange
        byte[] header = new byte[512];
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = (byte) '0';
        }

        // Act
        boolean result = TarUtils.verifyCheckSum(header);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void verifyCheckSum_givenInvalidChecksum_shouldReturnFalse() {
        // Arrange
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) 'z';
        }
        // Force stored checksum to zero
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUM_OFFSET + i] = 0;
        }

        // Act
        boolean valid = TarUtils.verifyCheckSum(header);

        // Assert
        Assert.assertFalse(valid);
    }
}