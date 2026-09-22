package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class TarUtilsTest {

    @Test
    public void testConstructor_isPrivate_shouldBeAccessibleViaReflection() throws Exception {
        // Arrange & Act
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);
        
        // Assert
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof TarUtils);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenLengthLessThanTwo_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { '0' };
        
        // Act
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void parseOctal_givenAllNulBuffer_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[] { 0, 0, 0, 0 };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingSpacesAndTrailingSpace_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { ' ', ' ', '7', '5', '5', ' ' };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(493L, result);
    }

    @Test
    public void parseOctal_givenTrailingNulAndSpace_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { '1', '2', '3', 0, ' ' };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(83L, result);
    }

    @Test
    public void parseOctal_givenSingleTrailingNul_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { '7', 0 };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(7L, result);
    }

    @Test
    public void parseOctal_givenTrailingSpaceAndNul_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { '7', '7', ' ', 0 };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(63L, result);
    }

    @Test
    public void parseOctal_givenTrailingTwoNuls_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { '1', 0, 0 };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(1L, result);
    }

    @Test
    public void parseOctal_givenTrailingTwoSpaces_shouldParseSuccessfully() {
        // Arrange
        byte[] buffer = new byte[] { '2', ' ', ' ' };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(2L, result);
    }

    @Test
    public void parseOctal_givenNonZeroOffset_shouldParseCorrectRange() {
        // Arrange
        byte[] buffer = new byte[] { 'x', 'x', '1', '0', ' ', 'y' };
        
        // Act
        long result = TarUtils.parseOctal(buffer, 2, 3);
        
        // Assert
        Assert.assertEquals(8L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenMissingTrailingSpaceOrNul_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { '1', '2' };
        
        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidOctalDigitTooHigh_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { '8', ' ' };
        
        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidOctalDigitTooLow_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { '/', ' ' };
        
        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenEmbeddedSpace_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] { '1', ' ', '2', ' ' };
        
        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void parseOctalOrBinary_givenOctalFirstByte_shouldDelegateToParseOctal() {
        // Arrange
        byte[] buffer = new byte[] { '7', '5', '5', ' ' };
        
        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(493L, result);
    }

    @Test
    public void parseOctalOrBinary_givenBinaryPositiveNumber_shouldParseCorrectly() {
        // Arrange
        byte[] buffer = new byte[] { (byte) 0x80, 0x01, 0x02 };
        
        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(258L, result);
    }

    @Test
    public void parseOctalOrBinary_givenBinaryWithMaxSignedLongValue_shouldParseCorrectly() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        };
        
        // Act
        long result = TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(Long.MAX_VALUE, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctalOrBinary_givenBinaryExceedingMaxLong_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[] {
            (byte) 0x80, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09
        };
        
        // Act
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void parseBoolean_givenByteOne_shouldReturnTrue() {
        // Arrange
        byte[] buffer = new byte[] { 0, 1, 0 };
        
        // Act
        boolean result = TarUtils.parseBoolean(buffer, 1);
        
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void parseBoolean_givenByteZero_shouldReturnFalse() {
        // Arrange
        byte[] buffer = new byte[] { 0 };
        
        // Act
        boolean result = TarUtils.parseBoolean(buffer, 0);
        
        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void parseBoolean_givenArbitraryByteNotOne_shouldReturnFalse() {
        // Arrange
        byte[] buffer = new byte[] { 2, (byte) 0xFF, '1' };
        
        // Act & Assert
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 1));
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void parseName_givenNullTerminatedString_shouldStopAtNull() {
        // Arrange
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 'x', 'y' };
        
        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals("test", result);
    }

    @Test
    public void parseName_givenFullLengthWithoutNull_shouldParseFullLength() {
        // Arrange
        byte[] buffer = new byte[] { 't', 'e', 's', 't' };
        
        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals("test", result);
    }

    @Test
    public void parseName_givenNonZeroOffset_shouldParseSpecifiedRange() {
        // Arrange
        byte[] buffer = new byte[] { 'a', 'b', 'c', 'd', 0 };
        
        // Act
        String result = TarUtils.parseName(buffer, 1, 3);
        
        // Assert
        Assert.assertEquals("bcd", result);
    }

    @Test
    public void parseName_givenHighBitCharacters_shouldPreserveUnsignedChar() {
        // Arrange
        byte[] buffer = new byte[] { (byte) 0xE4, (byte) 0xF6, 0 };
        
        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        
        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) 0xE4, result.charAt(0));
        Assert.assertEquals((char) 0xF6, result.charAt(1));
    }

    @Test
    public void formatNameBytes_givenShorterName_shouldPadWithNul() {
        // Arrange
        byte[] buffer = new byte[8];
        String name = "tar";
        
        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, 6);
        
        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('t', buffer[0]);
        Assert.assertEquals('a', buffer[1]);
        Assert.assertEquals('r', buffer[2]);
        Assert.assertEquals(0, buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
    }

    @Test
    public void formatNameBytes_givenLongerName_shouldTruncateToLength() {
        // Arrange
        byte[] buffer = new byte[4];
        String name = "longerName";
        
        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, 4);
        
        // Assert
        Assert.assertEquals(4, nextOffset);
        Assert.assertEquals('l', buffer[0]);
        Assert.assertEquals('o', buffer[1]);
        Assert.assertEquals('n', buffer[2]);
        Assert.assertEquals('g', buffer[3]);
    }

    @Test
    public void formatNameBytes_givenNonZeroOffset_shouldWriteAtOffset() {
        // Arrange
        byte[] buffer = new byte[6];
        String name = "ab";
        
        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 2, 3);
        
        // Assert
        Assert.assertEquals(5, nextOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals(0, buffer[1]);
        Assert.assertEquals('a', buffer[2]);
        Assert.assertEquals('b', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatUnsignedOctalString_givenZeroValue_shouldFormatLeadingZerosWithSingleZero() {
        // Arrange
        byte[] buffer = new byte[4];
        
        // Act
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        
        // Assert
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('0', buffer[1]);
        Assert.assertEquals('0', buffer[2]);
        Assert.assertEquals('0', buffer[3]);
    }

    @Test
    public void formatUnsignedOctalString_givenPositiveValue_shouldFormatWithLeadingZeros() {
        // Arrange
        byte[] buffer = new byte[6];
        
        // Act
        TarUtils.formatUnsignedOctalString(493L, buffer, 0, 6);
        
        // Assert
        Assert.assertEquals("000755", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[2];
        
        // Act
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldFormatWithSpaceAndNulTrailer() {
        // Arrange
        byte[] buffer = new byte[6];
        
        // Act
        int nextOffset = TarUtils.formatOctalBytes(493L, buffer, 0, 6);
        
        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('7', buffer[1]);
        Assert.assertEquals('5', buffer[2]);
        Assert.assertEquals('5', buffer[3]);
        Assert.assertEquals(' ', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldFormatWithSpaceTrailer() {
        // Arrange
        byte[] buffer = new byte[5];
        
        // Act
        int nextOffset = TarUtils.formatLongOctalBytes(493L, buffer, 0, 5);
        
        // Assert
        Assert.assertEquals(5, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('7', buffer[1]);
        Assert.assertEquals('5', buffer[2]);
        Assert.assertEquals('5', buffer[3]);
        Assert.assertEquals(' ', buffer[4]);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenUidLenFittingInMaxId_shouldFormatAsOctal() {
        // Arrange
        byte[] buffer = new byte[TarConstants.UIDLEN];
        
        // Act
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXID, buffer, 0, TarConstants.UIDLEN);
        
        // Assert
        Assert.assertEquals(TarConstants.UIDLEN, nextOffset);
        Assert.assertEquals(' ', buffer[TarConstants.UIDLEN - 1]);
        Assert.assertTrue((buffer[0] & 0x80) == 0);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenUidLenExceedingMaxId_shouldFormatAsBinary() {
        // Arrange
        byte[] buffer = new byte[TarConstants.UIDLEN];
        long value = TarConstants.MAXID + 1L;
        
        // Act
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, TarConstants.UIDLEN);
        
        // Assert
        Assert.assertEquals(TarConstants.UIDLEN, nextOffset);
        Assert.assertTrue((buffer[0] & 0x80) != 0);
        
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, TarConstants.UIDLEN);
        Assert.assertEquals(value, parsed);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNonUidLenFittingInMaxSize_shouldFormatAsOctal() {
        // Arrange
        byte[] buffer = new byte[12];
        
        // Act
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, buffer, 0, 12);
        
        // Assert
        Assert.assertEquals(12, nextOffset);
        Assert.assertEquals(' ', buffer[11]);
        Assert.assertTrue((buffer[0] & 0x80) == 0);
    }

    @Test
    public void formatLongOctalOrBinaryBytes_givenNonUidLenExceedingMaxSize_shouldFormatAsBinary() {
        // Arrange
        byte[] buffer = new byte[12];
        long value = TarConstants.MAXSIZE + 1L;
        
        // Act
        int nextOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12);
        
        // Assert
        Assert.assertEquals(12, nextOffset);
        Assert.assertTrue((buffer[0] & 0x80) != 0);
        
        long parsed = TarUtils.parseOctalOrBinary(buffer, 0, 12);
        Assert.assertEquals(value, parsed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_givenValueTooLargeForBinaryField_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[2];
        long value = 0x10000L;
        
        // Act
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalOrBinaryBytes_givenBinaryValueWithTopBitSetInLeadingByte_shouldThrowException() {
        // Arrange
        byte[] buffer = new byte[2];
        long value = 0x8000L;
        
        // Act
        TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 2);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldFormatWithNulAndSpaceTrailer() {
        // Arrange
        byte[] buffer = new byte[6];
        
        // Act
        int nextOffset = TarUtils.formatCheckSumOctalBytes(493L, buffer, 0, 6);
        
        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', buffer[0]);
        Assert.assertEquals('7', buffer[1]);
        Assert.assertEquals('5', buffer[2]);
        Assert.assertEquals('5', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(' ', buffer[5]);
    }

    @Test
    public void computeCheckSum_givenMixedSignedBytes_shouldTreatAsUnsignedAndSumCorrectly() {
        // Arrange
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 0xFF, (byte) 0xFE };
        
        // Act
        long sum = TarUtils.computeCheckSum(buffer);
        
        // Assert
        Assert.assertEquals(1 + 2 + 3 + 255 + 254, sum);
    }

    @Test
    public void computeCheckSum_givenEmptyBuffer_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[0];
        
        // Act
        long sum = TarUtils.computeCheckSum(buffer);
        
        // Assert
        Assert.assertEquals(0L, sum);
    }
}