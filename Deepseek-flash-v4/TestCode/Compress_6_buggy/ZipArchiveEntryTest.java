package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipException;

import org.junit.Before;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static final ZipShort SAMPLE_ID = new ZipShort(0x1234);
    private static final byte[] SAMPLE_DATA = new byte[] {1, 2, 3, 4};

    private ZipArchiveEntry entry;

    private static class TestExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private boolean parsedFromLocalCalled = false;
        private boolean parsedFromCentralCalled = false;

        TestExtraField(ZipShort headerId) {
            this.headerId = headerId;
        }

        @Override
        public ZipShort getHeaderId() {
            return headerId;
        }

        @Override
        public ZipShort getLocalFileDataLength() {
            return new ZipShort(SAMPLE_DATA.length);
        }

        @Override
        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(SAMPLE_DATA.length);
        }

        @Override
        public byte[] getLocalFileDataData() {
            return SAMPLE_DATA;
        }

        @Override
        public byte[] getCentralDirectoryData() {
            return SAMPLE_DATA;
        }

        @Override
        public void parseFromLocalFileData(byte[] data, int offset, int length) {
            parsedFromLocalCalled = true;
        }

        @Override
        public void parseFromCentralDirectoryData(byte[] data, int offset, int length) {
            parsedFromCentralCalled = true;
        }

        boolean isParsedFromLocalCalled() {
            return parsedFromLocalCalled;
        }

        boolean isParsedFromCentralCalled() {
            return parsedFromCentralCalled;
        }
    }

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test-entry");
    }

    @Test
    public void testConstructors() throws ZipException {
        ZipArchiveEntry byString = new ZipArchiveEntry("test");
        assertEquals("test", byString.getName());

        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("zip-entry");
        byte[] extra = new byte[] {0x01, 0x02, 0x03, 0x04};
        zipEntry.setExtra(extra);
        ZipArchiveEntry byZipEntry = new ZipArchiveEntry(zipEntry);
        assertEquals("zip-entry", byZipEntry.getName());
        assertNotNull(byZipEntry.getExtra());

        ZipArchiveEntry byZipArchiveEntry = new ZipArchiveEntry(byString);
        assertEquals("test", byZipArchiveEntry.getName());

        File dir = new File("testdir");
        dir.mkdirs();
        File dirFile = new File(dir, "subdir");
        dirFile.mkdirs();
        dirFile.deleteOnExit();
        dir.deleteOnExit();
        try {
            ZipArchiveEntry fromFile = new ZipArchiveEntry(dirFile, "entryName");
            assertEquals("entryName/", fromFile.getName());
            assertTrue(fromFile.isDirectory());
        } finally {
            dirFile.delete();
            dir.delete();
        }
    }

    @Test
    public void testDefaultMethodIsMinusOne() {
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testSetGetMethod() {
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
    }

    @Test
    public void testSetMethodNegativeThrows() {
        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("ZIP compression method can not be negative: -1", e.getMessage());
        }
    }

    @Test
    public void testSetMethodZeroAllowed() {
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
    }

    @Test
    public void testIsSupportedCompressionMethod() {
        entry.setMethod(ZipArchiveEntry.STORED);
        assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(999);
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testGetNameWhenNull() throws ZipException {
        ZipArchiveEntry e = new ZipArchiveEntry((java.util.zip.ZipEntry) new java.util.zip.ZipEntry(""));
        e.setName(null);
        assertEquals("", e.getName());
    }

    @Test
    public void testSetNameInternal() {
        entry.setName("internal-name");
        assertEquals("internal-name", entry.getName());
    }

    @Test
    public void testIsDirectoryForSlashSuffix() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        assertTrue(dirEntry.isDirectory());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testHashCodeUsesName() {
        ZipArchiveEntry other = new ZipArchiveEntry("test-entry");
        assertEquals(entry.hashCode(), other.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(entry.equals(new Object()));
    }

    @Test
    public void testEqualsSameName() throws ZipException {
        ZipArchiveEntry other = new ZipArchiveEntry("test-entry");
        assertTrue(entry.equals(other));
        assertEquals(entry.hashCode(), other.hashCode());
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry other = new ZipArchiveEntry("other-name");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsNullNameBoth() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry((java.util.zip.ZipEntry) new java.util.zip.ZipEntry(""));
        e1.setName(null);
        ZipArchiveEntry e2 = new ZipArchiveEntry((java.util.zip.ZipEntry) new java.util.zip.ZipEntry(""));
        e2.setName(null);
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsNullNameVsNonNull() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry((java.util.zip.ZipEntry) new java.util.zip.ZipEntry(""));
        e1.setName(null);
        assertFalse(e1.equals(entry));
    }

    @Test
    public void testClone() throws Exception {
        entry.setUnixMode(0644);
        ZipExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field);
        ZipArchiveEntry clone = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getName(), clone.getName());
        assertEquals(entry.getUnixMode(), clone.getUnixMode());
        assertEquals(entry.getExtraFields().length, clone.getExtraFields().length);
        assertNotNull(clone.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testGetLastModifiedDate() {
        long time = 123456789L;
        entry.setTime(time);
        Date date = entry.getLastModifiedDate();
        assertEquals(new Date(time), date);
    }

    @Test
    public void testSetUnixModeAndGetPlatform() {
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testGetUnixModeForNonUnixPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testSetGetInternalAttributes() {
        entry.setInternalAttributes(12345);
        assertEquals(12345, entry.getInternalAttributes());
    }

    @Test
    public void testSetGetExternalAttributes() {
        entry.setExternalAttributes(987654321L);
        assertEquals(987654321L, entry.getExternalAttributes());
    }

    @Test
    public void testAddAndGetExtraField() {
        TestExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field);
        assertSame(field, entry.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipShort id1 = new ZipShort(0x1000);
        ZipShort id2 = new ZipShort(0x2000);
        TestExtraField first = new TestExtraField(id1);
        TestExtraField second = new TestExtraField(id2);
        entry.addExtraField(first);
        entry.addExtraField(second);
        TestExtraField newFirst = new TestExtraField(id1);
        entry.addAsFirstExtraField(newFirst);
        assertSame(newFirst, entry.getExtraField(id1));
    }

    @Test
    public void testAddAsFirstWhenEmpty() {
        TestExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addAsFirstExtraField(field);
        assertSame(field, entry.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testRemoveExtraField() {
        TestExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field);
        entry.removeExtraField(SAMPLE_ID);
        assertNull(entry.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testRemoveExtraFieldNonExistentThrows() {
        try {
            entry.removeExtraField(new ZipShort(0xFFFF));
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testGetExtraFieldNullWhenNoFields() {
        assertNull(entry.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testGetExtraFieldsEmptyArrayWhenNoFields() {
        assertArrayEquals(new ZipExtraField[0], entry.getExtraFields());
    }

    @Test
    public void testSetExtraInvalidDataThrowsRuntime() {
        try {
            entry.setExtra(new byte[] {(byte) 0xFF, (byte) 0xFF, 1});
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testSetCentralDirectoryExtra() throws Exception {
        ZipExtraField field = new TestExtraField(SAMPLE_ID);
        ZipExtraField[] fields = new ZipExtraField[] {field};
        byte[] centralData = ExtraFieldUtils.mergeCentralDirectoryData(fields);
        entry.setCentralDirectoryExtra(centralData);
        assertNotNull(entry.getExtraField(SAMPLE_ID));
    }

    @Test
    public void testGetLocalFileDataExtraReturnsEmptyWhenNull() throws ZipException {
        ZipArchiveEntry e = new ZipArchiveEntry((java.util.zip.ZipEntry) new java.util.zip.ZipEntry(""));
        e.setExtra((byte[]) null);
        assertArrayEquals(new byte[0], e.getLocalFileDataExtra());
    }

    @Test
    public void testGetLocalFileDataExtraWithData() {
        byte[] extra = new byte[] {0x01};
        entry.setExtra(extra);
        assertArrayEquals(extra, entry.getLocalFileDataExtra());
    }

    @Test
    public void testGetCentralDirectoryExtraWithFields() {
        TestExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field);
        byte[] central = entry.getCentralDirectoryExtra();
        assertNotNull(central);
        assertTrue(central.length > 0);
    }

    @Test
    public void testSetExtraWithValidDataParsesFields() throws IOException {
        ZipShort headerId = new ZipShort(0xCAFE);
        byte[] localData = new byte[] {0x01, 0x02};
        byte[] extraData = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[] {new UnparseableExtraFieldData() {
            @Override
            public ZipShort getHeaderId() {
                return headerId;
            }

            @Override
            public ZipShort getLocalFileDataLength() {
                return new ZipShort(localData.length);
            }

            @Override
            public ZipShort getCentralDirectoryLength() {
                return new ZipShort(0);
            }

            @Override
            public byte[] getLocalFileDataData() {
                return localData;
            }

            @Override
            public byte[] getCentralDirectoryData() {
                return new byte[0];
            }

            @Override
            public void parseFromLocalFileData(byte[] data, int offset, int length) {
                // no-op
            }

            @Override
            public void parseFromCentralDirectoryData(byte[] data, int offset, int length) {
                // no-op
            }
        }});
        entry.setExtra(extraData);
        assertNotNull(entry.getExtraField(headerId));
    }

    @Test
    public void testMergeExtraFieldsWithLocalFlag() throws ZipException {
        TestExtraField field1 = new TestExtraField(SAMPLE_ID);
        TestExtraField field2 = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field1);
        entry.mergeExtraFields(new ZipExtraField[] {field2}, true);
        assertSame(field2, entry.getExtraField(SAMPLE_ID));
        assertTrue(field2.isParsedFromLocalCalled());
    }

    @Test
    public void testMergeExtraFieldsWithCentralFlag() throws ZipException {
        TestExtraField field1 = new TestExtraField(SAMPLE_ID);
        TestExtraField field2 = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field1);
        entry.mergeExtraFields(new ZipExtraField[] {field2}, false);
        assertSame(field2, entry.getExtraField(SAMPLE_ID));
        assertTrue(field2.isParsedFromCentralCalled());
    }

    @Test
    public void testMergeExtraFieldsWithNewField() throws ZipException {
        TestExtraField field = new TestExtraField(SAMPLE_ID);
        entry.addExtraField(field);
        ZipShort newId = new ZipShort(0x2222);
        TestExtraField newField = new TestExtraField(newId);
        entry.mergeExtraFields(new ZipExtraField[] {newField}, true);
        assertSame(newField, entry.getExtraField(newId));
    }

    @Test
    public void testSetExtraFieldsReplacesAll() {
        TestExtraField field1 = new TestExtraField(SAMPLE_ID);
        TestExtraField field2 = new TestExtraField(new ZipShort(0x2222));
        entry.addExtraField(field1);
        entry.setExtraFields(new ZipExtraField[] {field2});
        assertNull(entry.getExtraField(SAMPLE_ID));
        assertNotNull(entry.getExtraField(new ZipShort(0x2222)));
    }

    @Test
    public void testCreateEntryFromDirectoryFile() {
        File dir = new File("testDir");
        dir.mkdirs();
        try {
            ZipArchiveEntry dirEntry = new ZipArchiveEntry(dir, "testDir");
            assertTrue(dirEntry.isDirectory());
            assertEquals("testDir/", dirEntry.getName());
        } finally {
            dir.delete();
        }
    }

    @Test
    public void testCreateEntryFromRegularFile() throws IOException {
        File file = File.createTempFile("test", ".tmp");
        try {
            ZipArchiveEntry fileEntry = new ZipArchiveEntry(file, "test.tmp");
            assertFalse(fileEntry.isDirectory());
            assertEquals("test.tmp", fileEntry.getName());
            assertTrue(fileEntry.getSize() >= 0);
            assertTrue(fileEntry.getTime() > 0);
        } finally {
            file.delete();
        }
    }

    @Test
    public void testGetMethodDefaultIsMinusOneFromZipEntryConstructor() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("x");
        ze.setMethod(java.util.zip.ZipEntry.STORED);
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals(java.util.zip.ZipEntry.STORED, e.getMethod());
    }

    @Test
    public void testSetMethodRetainsFromZipEntryConstructor() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("x");
        ze.setMethod(java.util.zip.ZipEntry.DEFLATED);
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals(java.util.zip.ZipEntry.DEFLATED, e.getMethod());
    }

    @Test
    public void testMergeExtraFieldsWithNullArray() throws ZipException {
        entry.setExtraFields(new ZipExtraField[] {});
        entry.mergeExtraFields(null, true);
        assertEquals(0, entry.getExtraFields().length);
    }
}