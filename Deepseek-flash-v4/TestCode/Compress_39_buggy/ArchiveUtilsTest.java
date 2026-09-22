package org.apache.commons.compress.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

public class ArchiveUtilsTest {

    private static class TestArchiveEntry implements ArchiveEntry {
        private final String name;
        private final boolean directory;
        private final long size;

        TestArchiveEntry(String name, boolean directory, long size) {
            this.name = name;
            this.directory = directory;
            this.size = size;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public long getSize() {
            return size;
        }

        @Override
        public boolean isDirectory() {
            return directory;
        }
    }

    // ====== toString ======
    @Test
    public void testToStringFileEntry() {
        ArchiveEntry entry = new TestArchiveEntry("file.txt", false, 256);
        assertEquals("-     256 file.txt", ArchiveUtils.toString(entry));
    }

    @Test
    public void testToStringDirectoryEntry() {
        ArchiveEntry entry = new TestArchiveEntry("dir/", true, 0);
        assertEquals("d       0 dir/", ArchiveUtils.toString(entry));
    }

    // ====== matchAsciiBuffer ======
    @Test
    public void testMatchAsciiBufferExactMatch() {
        byte[] buffer = "hello".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        assertTrue(ArchiveUtils.matchAsciiBuffer("hello", buffer));
    }

    @Test
    public void testMatchAsciiBufferMismatch() {
        byte[] buffer = "hello".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        assertFalse(ArchiveUtils.matchAsciiBuffer("world", buffer));
    }

    @Test
    public void testMatchAsciiBufferWithOffsetLength() {
        String expected = "lo";
        byte[] buffer = "hello".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer, 3, 2));
    }

    @Test
    public void testMatchAsciiBufferWithOffsetLengthMismatch() {
        String expected = "ho";
        byte[] buffer = "hello".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        assertFalse(ArchiveUtils.matchAsciiBuffer(expected, buffer, 3, 2));
    }

    // ====== toAsciiBytes ======
    @Test
    public void testToAsciiBytesValid() {
        byte[] result = ArchiveUtils.toAsciiBytes("abc");
        assertArrayEquals(new byte[]{97, 98, 99}, result);
    }

    @Test
    public void testToAsciiBytesEmpty() {
        byte[] result = ArchiveUtils.toAsciiBytes("");
        assertEquals(0, result.length);
    }

    // ====== toAsciiString ======
    @Test
    public void testToAsciiStringFull() {
        assertEquals("abc", ArchiveUtils.toAsciiString(new byte[]{97, 98, 99}));
    }

    @Test
    public void testToAsciiStringWithOffsetLength() {
        assertEquals("bc", ArchiveUtils.toAsciiString(new byte[]{97, 98, 99, 100}, 1, 2));
    }

    // ====== isEqual (full) ======
    @Test
    public void testIsEqualSameBuffersIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{1, 2, 0, 0};
        byte[] b2 = new byte[]{1, 2};
        assertTrue(ArchiveUtils.isEqual(b1, b2, true));
    }

    @Test
    public void testIsEqualSameBuffersNotIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{1, 2, 0, 0};
        byte[] b2 = new byte[]{1, 2};
        assertFalse(ArchiveUtils.isEqual(b1, b2, false));
    }

    @Test
    public void testIsEqualDifferentContents() {
        byte[] b1 = new byte[]{1, 2, 3};
        byte[] b2 = new byte[]{1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(b1, b2, false));
    }

    @Test
    public void testIsEqualSameLengthDifferentContent() {
        byte[] b1 = new byte[]{1, 2, 3};
        byte[] b2 = new byte[]{1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(b1, b2, true));
    }

    // ====== isEqual with offsets ======
    @Test
    public void testIsEqualWithOffsetsAndIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{0, 1, 2, 0, 0};
        byte[] b2 = new byte[]{7, 1, 2};
        assertTrue(ArchiveUtils.isEqual(b1, 1, 2, b2, 1, 2, true));
    }

    @Test
    public void testIsEqualWithOffsetsDifferentLengthIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{0, 1, 2, 3, 0};
        byte[] b2 = new byte[]{7, 1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(b1, 1, 4, b2, 1, 3, true));
    }

    @Test
    public void testIsEqualWithOffsetsDifferentLengthNotIgnore() {
        byte[] b1 = new byte[]{0, 1, 2, 3, 4};
        byte[] b2 = new byte[]{7, 1, 2};
        assertFalse(ArchiveUtils.isEqual(b1, 1, 4, b2, 1, 2, false));
    }

    // ====== isEqualWithNull ======
    @Test
    public void testIsEqualWithNullIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{1, 2, 0, 0};
        byte[] b2 = new byte[]{1, 2};
        assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 4, b2, 0, 2));
    }

    @Test
    public void testIsEqualWithNullNotIgnoreTrailingNulls() {
        byte[] b1 = new byte[]{1, 2, 0, 0};
        byte[] b2 = new byte[]{1, 2, 3};
        assertFalse(ArchiveUtils.isEqualWithNull(b1, 0, 4, b2, 0, 3));
    }

    // ====== isArrayZero ======
    @Test
    public void testIsArrayZeroAllZero() {
        byte[] a = new byte[]{0, 0, 0};
        assertTrue(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZeroNotEmpty() {
        byte[] a = new byte[]{0, 1, 0};
        assertFalse(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZeroSizeZero() {
        byte[] a = new byte[]{0, 1, 0};
        assertTrue(ArchiveUtils.isArrayZero(a, 0));
    }

    // ====== sanitize ======
    @Test
    public void testSanitizeNormal() {
        assertEquals("hello", ArchiveUtils.sanitize("hello"));
    }

    @Test
    public void testSanitizeControlCharacters() {
        assertEquals("????", ArchiveUtils.sanitize("a\u0001b\u0002"));
    }

    @Test
    public void testSanitizeNull() {
        try {
            ArchiveUtils.sanitize(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSanitizeEmpty() {
        assertEquals("", ArchiveUtils.sanitize(""));
    }

    @Test
    public void testSanitizeSpecialsBlockCharacters() {
        // Unicode specials block: U+FFF0-U+FFFF
        assertEquals("?", ArchiveUtils.sanitize("\uFFFE"));
    }

    @Test
    public void testSanitizeNonControlUnicode() {
        assertEquals("é", ArchiveUtils.sanitize("é"));
    }
}