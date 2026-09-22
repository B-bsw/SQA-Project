package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;

import org.junit.Before;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static final ZipShort MOCK_ID = new ZipShort(0x1234);

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test/entry.txt");
    }

    @Test
    public void testConstructors() throws Exception {
        ZipArchiveEntry fromName = new ZipArchiveEntry("name.txt");
        assertEquals("name.txt", fromName.getName());
        assertTrue(fromName.isDirectory() == false);
        assertFalse(fromName.isDirectory());

        ZipArchiveEntry fromZipEntry = new ZipArchiveEntry(new ZipEntry("zipentry.txt"));
        assertEquals("zipentry.txt", fromZipEntry.getName());

        ZipArchiveEntry copy = new ZipArchiveEntry(fromZipEntry);
        assertEquals(fromZipEntry.getName(), copy.getName());

        File f = File.createTempFile("test", ".txt");
        f.deleteOnExit();
        ZipArchiveEntry fromFile = new ZipArchiveEntry(f, "fileentry.txt");
        assertEquals(f.length(), fromFile.getSize());

        ZipArchiveEntry dirEntry = new ZipArchiveEntry("dir/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testMethodValidation() {
        entry.setMethod(ZipEntry.DEFLATED);
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());

        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException for negative method");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSizeValidation() {
        entry.setSize(100);
        assertEquals(100L, entry.getSize());

        try {
            entry.setSize(-5);
            fail("Expected IllegalArgumentException for negative size");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetUnixModeAndGetUnixMode() {
        entry.setUnixMode(0644);
        assertEquals(0644, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testUnixModeWithSpecialBits() {
        entry.setUnixMode(0100755);
        assertTrue(entry.isUnixSymlink() == false);
        assertEquals(0100755, entry.getUnixMode());
    }

    @Test
    public void testUnixSymlink() {
        entry.setUnixMode(0120777);
        assertTrue(entry.isUnixSymlink());
    }

    @Test
    public void testPlatform() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testExtraFields() {
        ZipExtraField field = createMockExtraField();
        entry.addExtraField(field);
        assertNotNull(entry.getExtraField(MOCK_ID));
        assertEquals(1, entry.getExtraFields().length);

        entry.removeExtraField(MOCK_ID);
        assertNull(entry.getExtraField(MOCK_ID));
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveNonExistentExtraField() {
        entry.removeExtraField(MOCK_ID);
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipExtraField field1 = createMockExtraField();
        ZipExtraField field2 = createMockExtraField();
        entry.addExtraField(field1);
        entry.addAsFirstExtraField(field2);
        assertEquals(2, entry.getExtraFields().length);
        assertEquals(field2, entry.getExtraFields()[0]);
    }

    @Test
    public void testSetExtraWithValidData() {
        byte[] data = new byte[] {0x34, 0x12, 0x00, 0x01};
        entry.setExtra(data);
        assertNotNull(entry.getExtra());
    }

    @Test
    public void testSetExtraWithNull() {
        byte[] data = new byte[0];
        entry.setExtra(data);
        assertEquals(0, entry.getLocalFileDataExtra().length);
    }

    @Test
    public void testMergeExtraFields() throws Exception {
        ZipExtraField field = createMockExtraField();
        byte[] local = new byte[] {0x01, 0x02};
        entry.mergeExtraFields(new ZipExtraField[] { field }, true);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testSetName() {
        entry.setName("new\\path\\file.txt");
        assertEquals("new/path/file.txt", entry.getName());
    }

    @Test
    public void testSetNameWithSlashes() {
        entry.setName("already/slashed.txt");
        assertEquals("already/slashed.txt", entry.getName());
    }

    @Test
    public void testGetNameWithNullName() {
        ZipArchiveEntry e = new ZipArchiveEntry((String) null);
        assertNotNull(e.getName());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        assertNotNull(entry.getCentralDirectoryExtra());
        assertEquals(0, entry.getCentralDirectoryExtra().length);
    }

    @Test
    public void testGetRawName() {
        byte[] rawName = {(byte) 0x60, 0x00, (byte) 0x82, 0x01};
        entry.setExternalAttributes(0L);
        entry.setSize(0);
        entry.setRawFlag(0);
        entry.setRawFlag(0);
        entry.setVersionMadeBy(0);
        entry.setVersionRequired(0);
        entry.setRawFlag(0);
        entry.setName("raw", rawName);
        assertArrayEquals(rawName, entry.getRawName());
    }

    @Test
    public void testEquals() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");
        assertEquals(entry1, entry2);

        entry1.setSize(100);
        entry2.setSize(100);
        entry1.setTime(12345L);
        entry2.setTime(12345L);
        entry1.setMethod(ZipEntry.DEFLATED);
        entry2.setMethod(ZipEntry.DEFLATED);
        entry1.setInternalAttributes(1);
        entry2.setInternalAttributes(1);
        entry1.setExternalAttributes(0x10L);
        entry2.setExternalAttributes(0x10L);
        entry1.setUnixMode(0644);
        entry2.setUnixMode(0644);
        entry1.setComment("comment");
        entry2.setComment("comment");
        entry1.setCompressedSize(50);
        entry2.setCompressedSize(50);
        entry1.setCrc(123L);
        entry2.setCrc(123L);
        entry1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        byte[] extra = new byte[] {0x01, 0x02};
        entry1.setExtra(extra);
        entry2.setExtra(extra);
        long time = System.currentTimeMillis();
        entry1.setTime(time);
        entry2.setTime(time);
        assertEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(entry.equals("test"));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry other = new ZipArchiveEntry("other.txt");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsDifferentNameSameValues() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("name");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("name");
        entry1.setTime(100);
        entry2.setTime(200);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test");
        assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    @Test
    public void testGeneralPurposeBit() {
        GeneralPurposeBit bit = new GeneralPurposeBit();
        entry.setGeneralPurposeBit(bit);
        assertEquals(bit, entry.getGeneralPurposeBit());
    }

    @Test
    public void testClone() {
        try {
            ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
            assertEquals(entry.getName(), cloned.getName());
            assertEquals(entry.getTime(), cloned.getTime());
            assertNotEquals(entry, cloned); // internal attributes not cloned in this case
        } catch (CloneNotSupportedException e) {
            fail("Clone not supported");
        }
    }

    @Test
    public void testGetLastModifiedDate() {
        long time = System.currentTimeMillis();
        entry.setTime(time);
        Date date = entry.getLastModifiedDate();
        assertNotNull(date);
        assertEquals(new Date(time), date);
    }

    private ZipExtraField createMockExtraField() {
        return new ZipExtraField() {
            @Override
            public ZipShort getHeaderId() {
                return MOCK_ID;
            }

            @Override
            public ZipShort getLocalFileDataLength() {
                return new ZipShort(0);
            }

            @Override
            public ZipShort getCentralDirectoryLength() {
                return new ZipShort(0);
            }

            @Override
            public byte[] getLocalFileDataData() {
                return new byte[0];
            }

            @Override
            public byte[] getCentralDirectoryData() {
                return new byte[0];
            }

            @Override
            public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws java.util.zip.ZipException {
            }

            @Override
            public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws java.util.zip.ZipException {
            }
        };
    }
}