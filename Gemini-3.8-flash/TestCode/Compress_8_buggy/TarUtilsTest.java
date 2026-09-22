package org.apache.commons.compress.archivers.tar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void constructor_shouldBePrivateAndCallableViaReflection() throws Exception {
        // Arrange
        Constructor constructor = TarUtils.class.getDeclaredConstructor(new Class[0]);

        // Act & Assert
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof TarUtils);
    }

    @Test
    public void parseOctal_givenAllNulBytes_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[]{0, 0, 0, 0};

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingNul_shouldReturnZero() {
        // Arrange
        byte[] buffer = new byte[]{0, (byte) '7', (byte) '7', (byte) ' '};

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void parseOctal_givenLeadingSpacesAndZeros_shouldParseCorrectly() {
        // Arrange
        byte[] buffer = new byte[]{(byte) ' ', (byte) ' ', (byte) '0', (byte) '0', (byte) '7', (byte) '5', (byte) ' ', 0};

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(61L, result); // 75 in octal = 7 * 8 + 5 = 61
    }

    @Test
    public void parseOctal_givenTrailingSpace_shouldStopParsing() {
        // Arrange
        byte[] buffer = new byte[]{(byte) '1', (byte) '2', (byte) '3', (byte) ' ', (byte) '4'};

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(83L, result); // 123 in octal = 1*64 + 2*8 + 3 = 83
    }

    @Test
    public void parseOctal_givenTrailingNul_shouldStopParsing() {
        // Arrange
        byte[] buffer = new byte[]{(byte) '7', (byte) '7', 0, (byte) '7'};

        // Act
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(63L, result); // 77 in octal = 63
    }

    @Test
    public void parseOctal_givenOffsetAndLength_shouldParseCorrectSlice() {
        // Arrange
        byte[] buffer = new byte[]{(byte) '9', (byte) '9', (byte) '1', (byte) '0', 0, (byte) '9'};

        // Act
        long result = TarUtils.parseOctal(buffer, 2, 3);

        // Assert
        Assert.assertEquals(8L, result); // 10 in octal = 8
    }

    @Test
    public void parseOctal_givenByteBelowZeroChar_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[]{(byte) '1', (byte) '/', 0};

        // Act & Assert
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for byte '/' (< '0')");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
            Assert.assertTrue(ex.getMessage().indexOf("{NUL}") != -1);
        }
    }

    @Test
    public void parseOctal_givenByteAboveSevenChar_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[]{(byte) '1', (byte) '8', 0};

        // Act & Assert
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for byte '8' (> '7')");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
        }
    }

    @Test
    public void parseOctal_givenLetterByte_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 'A', 0};

        // Act & Assert
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            Assert.fail("Expected IllegalArgumentException for byte 'A'");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Invalid byte") != -1);
        }
    }

    @Test
    public void parseName_givenFullLengthWithoutNul_shouldReturnFullString() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c', (byte) 'd'};

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("abcd", result);
    }

    @Test
    public void parseName_givenTrailingNul_shouldReturnStringBeforeNul() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 't', (byte) 'e', (byte) 's', (byte) 't', 0, (byte) 'x'};

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("test", result);
    }

    @Test
    public void parseName_givenLeadingNul_shouldReturnEmptyString() {
        // Arrange
        byte[] buffer = new byte[]{0, (byte) 'a', (byte) 'b'};

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void parseName_givenSignedExtendedBytes_shouldMaskCorrectly() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 0xFF, (byte) 0xFE, 0};

        // Act
        String result = TarUtils.parseName(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals((char) 255, result.charAt(0));
        Assert.assertEquals((char) 254, result.charAt(1));
    }

    @Test
    public void parseName_givenOffsetAndLength_shouldParseWithinWindow() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 'x', (byte) 'x', (byte) 'o', (byte) 'k', 0, (byte) 'x'};

        // Act
        String result = TarUtils.parseName(buffer, 2, 4);

        // Assert
        Assert.assertEquals("ok", result);
    }

    @Test
    public void formatNameBytes_givenShorterName_shouldPadWithNulAndReturnUpdatedOffset() {
        // Arrange
        byte[] buffer = new byte[8];
        String name = "tar";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 1, 5);

        // Assert
        Assert.assertEquals(6, nextOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals((byte) 't', buffer[1]);
        Assert.assertEquals((byte) 'a', buffer[2]);
        Assert.assertEquals((byte) 'r', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void formatNameBytes_givenLongerName_shouldTruncateAndReturnUpdatedOffset() {
        // Arrange
        byte[] buffer = new byte[6];
        String name = "longentryname";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, 4);

        // Assert
        Assert.assertEquals(4, nextOffset);
        Assert.assertEquals((byte) 'l', buffer[0]);
        Assert.assertEquals((byte) 'o', buffer[1]);
        Assert.assertEquals((byte) 'n', buffer[2]);
        Assert.assertEquals((byte) 'g', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
    }

    @Test
    public void formatNameBytes_givenExactLengthName_shouldCopyAllWithoutExtraPadding() {
        // Arrange
        byte[] buffer = new byte[3];
        String name = "abc";

        // Act
        int nextOffset = TarUtils.formatNameBytes(name, buffer, 0, 3);

        // Assert
        Assert.assertEquals(3, nextOffset);
        Assert.assertEquals((byte) 'a', buffer[0]);
        Assert.assertEquals((byte) 'b', buffer[1]);
        Assert.assertEquals((byte) 'c', buffer[2]);
    }

    @Test
    public void formatUnsignedOctalString_givenZeroValue_shouldFillWithZeroDigits() {
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
    public void formatUnsignedOctalString_givenPositiveValueWithLeadingZeroPadding_shouldFormatProperly() {
        // Arrange
        byte[] buffer = new byte[6];

        // Act (61 in octal is 75)
        TarUtils.formatUnsignedOctalString(61L, buffer, 1, 4);

        // Assert
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '0', buffer[2]);
        Assert.assertEquals((byte) '7', buffer[3]);
        Assert.assertEquals((byte) '5', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test
    public void formatUnsignedOctalString_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[2];

        // Act & Assert (octal 100 requires 3 characters)
        try {
            TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
            Assert.fail("Expected IllegalArgumentException when value does not fit");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("will not fit") != -1);
        }
    }

    @Test
    public void formatOctalBytes_givenValidValue_shouldWriteOctalWithTrailingSpaceAndNul() {
        // Arrange
        byte[] buffer = new byte[8];

        // Act
        int updatedOffset = TarUtils.formatOctalBytes(61L, buffer, 1, 6);

        // Assert
        Assert.assertEquals(7, updatedOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '0', buffer[2]);
        Assert.assertEquals((byte) '7', buffer[3]);
        Assert.assertEquals((byte) '5', buffer[4]);
        Assert.assertEquals((byte) ' ', buffer[5]);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[4];

        // Act (idx = 4 - 2 = 2. 64 decimal = 100 octal, requires 3 chars)
        TarUtils.formatOctalBytes(64L, buffer, 0, 4);
    }

    @Test
    public void formatLongOctalBytes_givenValidValue_shouldWriteOctalWithTrailingSpace() {
        // Arrange
        byte[] buffer = new byte[6];

        // Act
        int updatedOffset = TarUtils.formatLongOctalBytes(8L, buffer, 1, 4);

        // Assert
        Assert.assertEquals(5, updatedOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '1', buffer[2]);
        Assert.assertEquals((byte) '0', buffer[3]);
        Assert.assertEquals((byte) ' ', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatLongOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[3];

        // Act (idx = 3 - 1 = 2. 64 decimal = 100 octal, requires 3 chars)
        TarUtils.formatLongOctalBytes(64L, buffer, 0, 3);
    }

    @Test
    public void formatCheckSumOctalBytes_givenValidValue_shouldWriteOctalWithTrailingNulAndSpace() {
        // Arrange
        byte[] buffer = new byte[8];

        // Act
        int updatedOffset = TarUtils.formatCheckSumOctalBytes(61L, buffer, 1, 6);

        // Assert
        Assert.assertEquals(7, updatedOffset);
        Assert.assertEquals(0, buffer[0]);
        Assert.assertEquals((byte) '0', buffer[1]);
        Assert.assertEquals((byte) '0', buffer[2]);
        Assert.assertEquals((byte) '7', buffer[3]);
        Assert.assertEquals((byte) '5', buffer[4]);
        Assert.assertEquals(0, buffer[5]);
        Assert.assertEquals((byte) ' ', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatCheckSumOctalBytes_givenValueTooLarge_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buffer = new byte[4];

        // Act (idx = 4 - 2 = 2. 64 decimal = 100 octal, requires 3 chars)
        TarUtils.formatCheckSumOctalBytes(64L, buffer, 0, 4);
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

    @Test
    public void computeCheckSum_givenPositiveBytes_shouldReturnSum() {
        // Arrange
        byte[] buffer = new byte[]{1, 2, 3, 4};

        // Act
        long sum = TarUtils.computeCheckSum(buffer);

        // Assert
        Assert.assertEquals(10L, sum);
    }

    @Test
    public void computeCheckSum_givenNegativeBytes_shouldTreatAsUnsigned() {
        // Arrange
        byte[] buffer = new byte[]{(byte) 0xFF, (byte) 0x80}; // 255 + 128 = 383

        // Act
        long sum = TarUtils.computeCheckSum(buffer);

        // Assert
        Assert.assertEquals(383L, sum);
    }

    @Test
    public void roundTrip_parseAndFormatOctalBytes_shouldMatchOriginal() {
        // Arrange
        long original = 123456L;
        byte[] buffer = new byte[12];

        // Act
        TarUtils.formatOctalBytes(original, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctal(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(original, parsed);
    }
}