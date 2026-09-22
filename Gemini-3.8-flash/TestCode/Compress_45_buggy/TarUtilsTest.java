package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void parseOctal_givenValidOctalString_shouldParseValueCorrectly() {
        // Arrange: "123 " -> octal 123 = 1*64 + 2*8 + 3 = 83
        byte[] buffer = "123 ".getBytes();

        // Act
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(83L, value);
    }

    @Test
    public void parseOctal_givenAllNul_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[8];

        // Act
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(0L, value);
    }

    @Test
    public void parseOctal_givenLeadingSpacesAndTrailingNul_shouldIgnoreSpaces() {
        // Arrange: "  77\0" -> octal 77 = 63
        byte[] buffer = new byte[] { ' ', ' ', '7', '7', 0 };

        // Act
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(63L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidOctalByte_shouldThrowIllegalArgumentException() {
        // Arrange: "89 " invalid octal digits
        byte[] buffer = "89 ".getBytes();

        // Act & Assert
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenTooShortLength_shouldThrowIllegalArgumentException() {
        // Arrange: length must be at least 2 bytes
        byte[] buffer = new byte[] { '0' };

        // Act & Assert
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void parseBoolean_givenOneOrZero_shouldReturnTrueOrFalse() {
        // Arrange
        byte[] buffer = new byte[] { 1, 0 };

        // Act & Assert
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
    }

    @Test
    public void parseName_givenAsciiName_shouldReturnString() {
        // Arrange
        byte[] buffer = "my_archive_entry\0extra".getBytes();

        // Act
        String name = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("my_archive_entry", name);
    }

    @Test
    public void formatNameBytes_givenNameAndBuffer_shouldWriteBytesAndPadNulls() {
        // Arrange
        byte[] buffer = new byte[20];
        String name = "test_file.txt";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(20, nextOffset);
        String parsed = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals(name, parsed);
    }

    @Test
    public void formatOctalBytes_and_parseOctal_shouldRoundTrip() {
        // Arrange
        byte[] buffer = new byte[8];
        long value = 12345L;

        // Act
        TarUtils.formatOctalBytes(value, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalBytes_and_parseOctal_shouldRoundTrip() {
        // Arrange
        byte[] buffer = new byte[12];
        long value = 987654321L;

        // Act
        TarUtils.formatLongOctalBytes(value, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void computeCheckSum_and_verifyCheckSum_givenHeader_shouldVerifyTrue() {
        // Arrange: standard tar header is 512 bytes
        byte[] header = new byte[512];
        for (int i = 0; i < 100; i++) {
            header[i] = (byte) (i + 1);
        }

        // Act: compute checksum and format into header at offset 148
        long chksum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chksum, header, 148, 8);

        // Assert
        Assert.assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void verifyCheckSum_givenCorruptedHeader_shouldVerifyFalse() {
        // Arrange
        byte[] header = new byte[512];
        long chksum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chksum, header, 148, 8);

        // Corrupt header
        header[0] = 99;

        // Act & Assert
        Assert.assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenSmallOctal_shouldFormatAsOctal() {
        // Arrange: value fitting in octal
        byte[] buffer = new byte[12];
        long value = 500L;

        // Act
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_and_parseOctalOrBinary_shouldRoundTripLargePositive() {
        // Arrange: large 64-bit value exceeding octal limit
        byte[] buffer = new byte[12];
        long value = 0x1FFFFFFFFL;

        // Act
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_and_parseOctalOrBinary_shouldRoundTripNegativeValues() {
        // Arrange: negative value
        byte[] buffer = new byte[8];
        long value = -12345L;

        // Act
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(value, parsed);
    }
}
