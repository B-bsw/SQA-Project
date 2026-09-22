package org.apache.commons.compress.utils;

import java.lang.reflect.Constructor;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveUtilsTest {

    private static class DummyArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean directory;

        public DummyArchiveEntry(String name, long size, boolean directory) {
            this.name = name;
            this.size = size;
            this.directory = directory;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public boolean isDirectory() {
            return this.directory;
        }

        public Date getLastModifiedDate() {
            return null;
        }
    }

    @Test
    public void constructor_whenInvokedViaReflection_shouldInstantiateSuccessfully() throws Exception {
        Constructor constructor = ArchiveUtils.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof ArchiveUtils);
    }

    @Test
    public void toString_givenDirectoryEntry_shouldStartWithDAndPaddedSize() {
        ArchiveEntry entry = new DummyArchiveEntry("testDir", 100L, true);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("d     100 testDir", result);
    }

    @Test
    public void toString_givenFileEntry_shouldStartWithDashAndPaddedSize() {
        ArchiveEntry entry = new DummyArchiveEntry("main.c", 2000L, false);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("-    2000 main.c", result);
    }

    @Test
    public void toString_givenExactSevenDigitSize_shouldHaveNoExtraPadding() {
        ArchiveEntry entry = new DummyArchiveEntry("file.bin", 1234567L, false);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("- 1234567 file.bin", result);
    }

    @Test
    public void toString_givenMoreThanSevenDigitSize_shouldNotBePadded() {
        ArchiveEntry entry = new DummyArchiveEntry("bigfile.bin", 12345678L, false);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("- 12345678 bigfile.bin", result);
    }

    @Test
    public void toString_givenZeroSizeEntry_shouldPadProperly() {
        ArchiveEntry entry = new DummyArchiveEntry("empty.txt", 0L, false);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("-       0 empty.txt", result);
    }

    @Test
    public void toAsciiBytes_givenValidString_shouldReturnAsciiByteArray() {
        String input = "Hello ASCII";
        byte[] expected = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 'A', 'S', 'C', 'I', 'I' };
        byte[] actual = ArchiveUtils.toAsciiBytes(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void toAsciiBytes_givenEmptyString_shouldReturnEmptyByteArray() {
        byte[] actual = ArchiveUtils.toAsciiBytes("");
        Assert.assertEquals(0, actual.length);
    }

    @Test
    public void toAsciiString_givenByteArray_shouldReturnValidAsciiString() {
        byte[] input = new byte[] { 'A', 'B', 'C' };
        String result = ArchiveUtils.toAsciiString(input);
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void toAsciiString_givenEmptyByteArray_shouldReturnEmptyString() {
        byte[] input = new byte[0];
        String result = ArchiveUtils.toAsciiString(input);
        Assert.assertEquals("", result);
    }

    @Test
    public void toAsciiString_givenByteArrayWithOffsetAndLength_shouldReturnSubstring() {
        byte[] input = new byte[] { 'X', 'A', 'B', 'C', 'Y' };
        String result = ArchiveUtils.toAsciiString(input, 1, 3);
        Assert.assertEquals("ABC", result);
    }

    @Test
    public void toAsciiString_givenZeroLength_shouldReturnEmptyString() {
        byte[] input = new byte[] { 'X', 'Y', 'Z' };
        String result = ArchiveUtils.toAsciiString(input, 1, 0);
        Assert.assertEquals("", result);
    }

    @Test
    public void matchAsciiBuffer_givenMatchingBufferAndRange_shouldReturnTrue() {
        byte[] buffer = new byte[] { 'p', 'r', 'e', 'T', 'E', 'S', 'T', 's', 'u', 'f' };
        boolean result = ArchiveUtils.matchAsciiBuffer("TEST", buffer, 3, 4);
        Assert.assertTrue(result);
    }

    @Test
    public void matchAsciiBuffer_givenMismatchingBufferAndRange_shouldReturnFalse() {
        byte[] buffer = new byte[] { 'p', 'r', 'e', 'F', 'A', 'I', 'L', 's', 'u', 'f' };
        boolean result = ArchiveUtils.matchAsciiBuffer("TEST", buffer, 3, 4);
        Assert.assertFalse(result);
    }

    @Test
    public void matchAsciiBuffer_givenFullBufferMatch_shouldReturnTrue() {
        byte[] buffer = new byte[] { 'T', 'E', 'S', 'T' };
        boolean result = ArchiveUtils.matchAsciiBuffer("TEST", buffer);
        Assert.assertTrue(result);
    }

    @Test
    public void matchAsciiBuffer_givenFullBufferMismatch_shouldReturnFalse() {
        byte[] buffer = new byte[] { 'T', 'E', 'S', 'X' };
        boolean result = ArchiveUtils.matchAsciiBuffer("TEST", buffer);
        Assert.assertFalse(result);
    }

    @Test
    public void matchAsciiBuffer_givenDifferentLengths_shouldReturnFalse() {
        byte[] buffer = new byte[] { 'T', 'E', 'S', 'T', 'S' };
        boolean result = ArchiveUtils.matchAsciiBuffer("TEST", buffer);
        Assert.assertFalse(result);
    }

    @Test
    public void isEqual_givenIdenticalBuffers_shouldReturnTrue() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void isEqual_givenDifferentLengthsWithoutIgnoreNulls_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3, 0 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void isEqual_givenDifferentContentSameLength_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 4 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b2));
    }

    @Test
    public void isEqual_givenOffsetsAndLengthsMatching_shouldReturnTrue() {
        byte[] b1 = new byte[] { 9, 1, 2, 3, 9 };
        byte[] b2 = new byte[] { 8, 8, 1, 2, 3, 8 };
        Assert.assertTrue(ArchiveUtils.isEqual(b1, 1, 3, b2, 2, 3));
    }

    @Test
    public void isEqual_givenOffsetsAndLengthsMismatch_shouldReturnFalse() {
        byte[] b1 = new byte[] { 9, 1, 2, 3, 9 };
        byte[] b2 = new byte[] { 8, 8, 1, 2, 4, 8 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, 1, 3, b2, 2, 3));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsAndBuffer1LongerWithOnlyZeroes_shouldReturnTrue() {
        byte[] b1 = new byte[] { 1, 2, 3, 0, 0 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsAndBuffer1LongerWithNonZero_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 3, 0, 5 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsAndBuffer2LongerWithOnlyZeroes_shouldReturnTrue() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3, 0, 0, 0 };
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsAndBuffer2LongerWithNonZero_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3, 0, 1 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsFalseAndDifferentLengths_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 3 };
        byte[] b2 = new byte[] { 1, 2, 3, 0 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, 0, 3, b2, 0, 4, false));
    }

    @Test
    public void isEqual_givenIgnoreTrailingNullsMismatchInPrefix_shouldReturnFalse() {
        byte[] b1 = new byte[] { 1, 2, 4, 0 };
        byte[] b2 = new byte[] { 1, 2, 3 };
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void isEqual_givenBothEmptyArrays_shouldReturnTrue() {
        byte[] b1 = new byte[0];
        byte[] b2 = new byte[0];
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2));
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2, true));
        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2, false));
    }

    @Test
    public void isEqualWithNull_givenTrailingNullsInBuffer1_shouldReturnTrue() {
        byte[] b1 = new byte[] { 9, 1, 2, 0, 0, 9 };
        byte[] b2 = new byte[] { 8, 1, 2, 8 };
        Assert.assertTrue(ArchiveUtils.isEqualWithNull(b1, 1, 4, b2, 1, 2));
    }

    @Test
    public void isEqualWithNull_givenTrailingNullsInBuffer2_shouldReturnTrue() {
        byte[] b1 = new byte[] { 8, 1, 2, 8 };
        byte[] b2 = new byte[] { 9, 1, 2, 0, 0, 9 };
        Assert.assertTrue(ArchiveUtils.isEqualWithNull(b1, 1, 2, b2, 1, 4));
    }

    @Test
    public void isEqualWithNull_givenTrailingNonZeroInBuffer1_shouldReturnFalse() {
        byte[] b1 = new byte[] { 9, 1, 2, 0, 7, 9 };
        byte[] b2 = new byte[] { 8, 1, 2, 8 };
        Assert.assertFalse(ArchiveUtils.isEqualWithNull(b1, 1, 4, b2, 1, 2));
    }

    @Test
    public void isEqualWithNull_givenTrailingNonZeroInBuffer2_shouldReturnFalse() {
        byte[] b1 = new byte[] { 8, 1, 2, 8 };
        byte[] b2 = new byte[] { 9, 1, 2, 0, 7, 9 };
        Assert.assertFalse(ArchiveUtils.isEqualWithNull(b1, 1, 2, b2, 1, 4));
    }

    @Test
    public void isArrayZero_givenAllZeroes_shouldReturnTrue() {
        byte[] array = new byte[] { 0, 0, 0, 0, 0 };
        Assert.assertTrue(ArchiveUtils.isArrayZero(array, array.length));
    }

    @Test
    public void isArrayZero_givenNonZeroAtStart_shouldReturnFalse() {
        byte[] array = new byte[] { 1, 0, 0 };
        Assert.assertFalse(ArchiveUtils.isArrayZero(array, array.length));
    }

    @Test
    public void isArrayZero_givenNonZeroAtMiddle_shouldReturnFalse() {
        byte[] array = new byte[] { 0, 1, 0 };
        Assert.assertFalse(ArchiveUtils.isArrayZero(array, array.length));
    }

    @Test
    public void isArrayZero_givenNonZeroAtEnd_shouldReturnFalse() {
        byte[] array = new byte[] { 0, 0, 1 };
        Assert.assertFalse(ArchiveUtils.isArrayZero(array, array.length));
    }

    @Test
    public void isArrayZero_givenZeroLengthCheck_shouldReturnTrue() {
        byte[] array = new byte[] { 5, 6, 7 };
        Assert.assertTrue(ArchiveUtils.isArrayZero(array, 0));
    }

    @Test
    public void isArrayZero_givenCheckSizeLessThanFirstNonZero_shouldReturnTrue() {
        byte[] array = new byte[] { 0, 0, 1 };
        Assert.assertTrue(ArchiveUtils.isArrayZero(array, 2));
    }

    @Test
    public void isArrayZero_givenEmptyArrayAndZeroSize_shouldReturnTrue() {
        byte[] array = new byte[0];
        Assert.assertTrue(ArchiveUtils.isArrayZero(array, 0));
    }

    @Test
    public void sanitize_givenStandardPrintableAscii_shouldReturnSameString() {
        String input = "archive-name_123.tar.gz";
        String actual = ArchiveUtils.sanitize(input);
        Assert.assertEquals(input, actual);
    }

    @Test
    public void sanitize_givenIsoControlCharacters_shouldReplaceWithQuestionMarks() {
        String input = "line1\nline2\rline3\tline4\0file";
        String expected = "line1?line2?line3?line4?file";
        String actual = ArchiveUtils.sanitize(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sanitize_givenUnicodeSpecialsBlock_shouldReplaceWithQuestionMark() {
        char specialChar = '\uFFF0';
        String input = "test" + specialChar + "special";
        String expected = "test?special";
        String actual = ArchiveUtils.sanitize(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sanitize_givenNullUnicodeBlock_shouldReplaceWithQuestionMark() {
        char unassignedChar = '\uFFFF';
        String input = "test" + unassignedChar + "end";
        String expected = "test?end";
        String actual = ArchiveUtils.sanitize(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sanitize_givenEmptyString_shouldReturnEmptyString() {
        String actual = ArchiveUtils.sanitize("");
        Assert.assertEquals("", actual);
    }

    @Test(expected = NullPointerException.class)
    public void sanitize_givenNull_shouldThrowNullPointerException() {
        ArchiveUtils.sanitize(null);
    }

    @Test(expected = NullPointerException.class)
    public void toString_givenNullArchiveEntry_shouldThrowNullPointerException() {
        ArchiveUtils.toString(null);
    }

    @Test(expected = NullPointerException.class)
    public void matchAsciiBuffer_givenNullExpectedString_shouldThrowNullPointerException() {
        ArchiveUtils.matchAsciiBuffer(null, new byte[] { 1 });
    }

    @Test(expected = NullPointerException.class)
    public void matchAsciiBuffer_givenNullBuffer_shouldThrowNullPointerException() {
        ArchiveUtils.matchAsciiBuffer("TEST", null);
    }

    @Test(expected = NullPointerException.class)
    public void toAsciiBytes_givenNullString_shouldThrowNullPointerException() {
        ArchiveUtils.toAsciiBytes(null);
    }

    @Test(expected = NullPointerException.class)
    public void toAsciiString_givenNullBytes_shouldThrowNullPointerException() {
        ArchiveUtils.toAsciiString(null);
    }

    @Test(expected = NullPointerException.class)
    public void toAsciiStringWithOffset_givenNullBytes_shouldThrowNullPointerException() {
        ArchiveUtils.toAsciiString(null, 0, 0);
    }

    @Test(expected = NullPointerException.class)
    public void isEqual_givenNullBuffer1_shouldThrowNullPointerException() {
        ArchiveUtils.isEqual(null, new byte[] { 1 });
    }

    @Test(expected = NullPointerException.class)
    public void isEqual_givenNullBuffer2_shouldThrowNullPointerException() {
        ArchiveUtils.isEqual(new byte[] { 1 }, null);
    }

    @Test(expected = NullPointerException.class)
    public void isArrayZero_givenNullArray_shouldThrowNullPointerException() {
        ArchiveUtils.isArrayZero(null, 5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void isArrayZero_givenSizeLargerThanArrayLength_shouldThrowArrayIndexOutOfBoundsException() {
        byte[] array = new byte[] { 0, 0 };
        ArchiveUtils.isArrayZero(array, 3);
    }
}