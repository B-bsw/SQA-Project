package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TarUtilsTest {

    @Test
    public void constructor_givenPrivateAccess_shouldInstantiateViaReflection() throws Exception {
        // Arrange
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        // Act
        Object instance = constructor.newInstance(new Object[0]);

        // Assert
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof TarUtils);
    }

    @Test
    public void parseOctal_givenEmptyLength_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[10];

        // Act
        long result = TarUtils.parseOctal(buffer, 0, 0);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingNull_shouldReturnZeroImmediately() {
        // Arrange
        byte[] buffer = new byte[] { 0, '1', '2' };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingSpacesAndZeros_shouldParseCorrectly() {
        // Arrange
        byte[] buffer = "   000755 ".getBytes();

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(493L, result); // 0755 in octal is 493 in decimal
    }

    @Test
    public void parseOctal_givenEmbeddedZeros_shouldIncludeThemInResult() {
        // Arrange
        byte[] buffer = " 107 ".getBytes();

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(71L, result); // 0107 in octal is 71 in decimal
    }

    @Test
    public void parseOctal_givenTrailingNull_shouldStopParsing() {
        // Arrange
        byte[] buffer = new byte[] { '7', '5', 0, '5' };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(61L, result); // 075 in octal is 61 in decimal
    }

    @Test
    public void parseOctal_givenTrailingSpace_shouldStopParsing() {
        // Arrange
        byte[] buffer = new byte[] { '7', '5', ' ', '7' };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(61L, result); // 075 in octal is 61 in decimal
    }

    @Test
    public void parseOctal_givenExactLengthWithoutTrailingDelimiter_shouldParseFully() {
        // Arrange
        byte[] buffer = new byte[] { '7', '7' };

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(63L, result); // 077 in octal is 63 in decimal
    }

    @Test
    public void parseOctal_givenOffsetAndLength_shouldParseSubArray() {
        // Arrange
        byte[] buffer = new byte[] { '9', '9', '1', '2', '3', ' ', '9' };

        // Act
        long result = TarUtils.parseOctal(buffer, 2, 4);

        // Assert
        Assert.assertEquals(83L, result); // 0123 in octal is 83 in decimal
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenDigitLessThanZero_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[] { '1', '/', '3' };

        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenDigitGreaterThanSeven_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[] { '1', '8', '3' };

        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseOctal_givenInvalidCharacterAfterDigits_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[] { '1', 'A', '3' };

        // Act
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void parseName_givenNullTerminatedString_shouldReturnTruncatedName() {
        // Arrange
        byte[] buffer = new byte[] { 'f', 'o', 'o', 0, 'b', 'a', 'r' };

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("foo", result);
    }

    @Test
    public void parseName_givenNoNullCharacter_shouldReturnFullName() {
        // Arrange
        byte[] buffer = new byte[] { 'h', 'e', 'l', 'l', 'o' };

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("hello", result);
    }

    @Test
    public void parseName_givenLeadingNull_shouldReturnEmptyString() {
        // Arrange
        byte[] buffer = new byte[] { 0, 'a', 'b', 'c' };

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void parseName_givenOffsetAndLength_shouldReturnSubArrayName() {
        // Arrange
        byte[] buffer = new byte[] { 'x', 'x', 't', 'e', 's', 't', 0, 'y' };

        // Act
        String result = TarUtils.parseName(buffer, 2, 5);

        // Assert
        Assert.assertEquals("test", result);
    }

    @Test
    public void formatNameBytes_givenShorterName_shouldPadWithTrailingZeros() {
        // Arrange
        byte[] buffer = new byte[8];
        String name = "test";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('t', (char) buffer[0]);
        Assert.assertEquals('e', (char) buffer[1]);
        Assert.assertEquals('s', (char) buffer[2]);
        Assert.assertEquals('t', (char) buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatNameBytes_givenLongerName_shouldTruncateToBufferLength() {
        // Arrange
        byte[] buffer = new byte[4];
        String name = "testingLongName";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(4, nextOffset);
        Assert.assertEquals('t', (char) buffer[0]);
        Assert.assertEquals('e', (char) buffer[1]);
        Assert.assertEquals('s', (char) buffer[2]);
        Assert.assertEquals('t', (char) buffer[3]);
    }

    @Test
    public void formatNameBytes_givenExactLengthName_shouldFitWithoutTrailingZeros() {
        // Arrange
        byte[] buffer = new byte[4];
        String name = "abcd";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(4, nextOffset);
        Assert.assertEquals('a', (char) buffer[0]);
        Assert.assertEquals('b', (char) buffer[1]);
        Assert.assertEquals('c', (char) buffer[2]);
        Assert.assertEquals('d', (char) buffer[3]);
    }

    @Test
    public void formatNameBytes_givenNonZeroOffset_shouldWriteAtOffset() {
        // Arrange
        byte[] buffer = new byte[8];
        String name = "ab";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 2, 4);

        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals(0, buffer[1]);
        Assert.assertEquals('a', (char) buffer[2]);
        Assert.assertEquals('b', (char) buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
    }

    @Test
    public void formatUnsignedOctalString_givenZeroValue_shouldPadAllWithZeros() {
        // Arrange
        byte[] buffer = new byte[4];

        // Act
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);

        // Assert
        Assert.assertEquals('0', (char) buffer[0]);
        Assert.assertEquals('0', (char) buffer[1]);
        Assert.assertEquals('0', (char) buffer[2]);
        Assert.assertEquals('0', (char) buffer[3]);
    }

    @Test
    public void formatUnsignedOctalString_givenPositiveValue_shouldFormatWithLeadingZeros() {
        // Arrange
        byte[] buffer = new byte[5];
        long value = 63L; // octal 77

        // Act
        TarUtils.formatUnsignedOctalString(value, buffer, 0, 5);

        // Assert
        Assert.assertEquals('0', (char) buffer[0]);
        Assert.assertEquals('0', (char) buffer[1]);
        Assert.assertEquals('0', (char) buffer[2]);
        Assert.assertEquals('7', (char) buffer[3]);
        Assert.assertEquals('7', (char) buffer[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatUnsignedOctalString_givenValueTooLargeForBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[2];
        long value = 512L; // octal 1000 requires 4 characters

        // Act
        TarUtils.formatUnsignedOctalString(value, buffer, 0, 2);
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldFormatWithSpaceAndNullTrailer() {
        // Arrange
        byte[] buffer = new byte[6];
        long value = 7L;

        // Act
        int nextOffset = TarUtils.formatOctalBytes(value, buffer, 0, 6);

        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', (char) buffer[0]);
        Assert.assertEquals('0', (char) buffer[1]);
        Assert.assertEquals('0', (char) buffer[2]);
        Assert.assertEquals('7', (char) buffer[3]);
        Assert.assertEquals(' ', (char) buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[3]; // only 1 octal digit available
        long value = 64L; // octal 100 requires 3 characters

        // Act
        TarUtils.formatOctalBytes(value, buffer, 0, 3);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldFormatWithSpaceTrailer() {
        // Arrange
        byte[] buffer = new byte[5];
        long value = 8L; // octal 10

        // Act
        int nextOffset = TarUtils.formatLongOctalBytes(value, buffer, 0, 5);

        // Assert
        Assert.assertEquals(5, nextOffset);
        Assert.assertEquals('0', (char) buffer[0]);
        Assert.assertEquals('0', (char) buffer[1]);
        Assert.assertEquals('1', (char) buffer[2]);
        Assert.assertEquals('0', (char) buffer[3]);
        Assert.assertEquals(' ', (char) buffer[4]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[2]; // only 1 octal digit available
        long value = 8L; // octal 10

        // Act
        TarUtils.formatLongOctalBytes(value, buffer, 0, 2);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldFormatWithNullAndSpaceTrailer() {
        // Arrange
        byte[] buffer = new byte[6];
        long value = 73L; // octal 111

        // Act
        int nextOffset = TarUtils.formatCheckSumOctalBytes(value, buffer, 0, 6);

        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals('0', (char) buffer[0]);
        Assert.assertEquals('1', (char) buffer[1]);
        Assert.assertEquals('1', (char) buffer[2]);
        Assert.assertEquals('1', (char) buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(' ', (char) buffer[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatCheckSumOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[3]; // only 1 octal digit available
        long value =