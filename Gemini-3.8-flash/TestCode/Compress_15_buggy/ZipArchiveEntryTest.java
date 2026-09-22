package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static class DummyExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData = new byte[0];
        private byte[] centralData = new byte[0];

        public DummyExtraField(ZipShort headerId) {
            this.headerId = headerId;
        }

        public ZipShort getHeaderId() {
            return headerId;
        }

        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        public byte[] getLocalFileDataData() {
            return localData;
        }

        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        public void parseFromLocalFileData(byte[] buffer, int offset, int length) {
            localData = new byte[length];
            System.arraycopy(buffer, offset, localData, 0, length);
        }

        public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) {
            centralData = new byte[length];
            System.arraycopy(buffer, offset, centralData, 0, length);
        }

        public void setLocalData(byte[] data) {
            this.localData = data;
        }

        public void setCentralData(byte[] data) {
            this.centralData = data;
        }
    }

    private static class DummySubclassEntry extends ZipArchiveEntry {
        public DummySubclassEntry() {
            super();
        }

        public DummySubclassEntry(String name) {
            super(name);
        }
    }

    @Test
    public void constructor_givenProtectedNoArg_shouldInitializeDefaults() {
        DummySubclassEntry entry = new DummySubclassEntry();
        Assert.assertEquals("", entry.getName());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertEquals(0, entry.getInternalAttributes());
        Assert.assertEquals(0, entry.getExternalAttributes());
        Assert.assertNull(entry.getRawName());
        Assert.assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void constructor_givenNameWithBackslashOnFatPlatform_shouldNormalizeSlashes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("folder\\subfolder\\file.txt");
        Assert.assertEquals("folder/subfolder/file.txt", entry.getName());
    }

    @Test
    public void constructor_givenNameWithExistingSlashOnFatPlatform_shouldNotReplaceBackslashes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("folder/subfolder\\file.txt");
        Assert.assertEquals("folder/subfolder\\file.txt", entry.getName());
    }

    @Test
    public void constructor_givenZipEntryWithoutExtra_shouldInitializeProperly() throws ZipException {
        java.util.zip.ZipEntry stdEntry = new java.util.zip.ZipEntry("test.txt");
        stdEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        stdEntry.setSize(1024L);

        ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertEquals(1024L, entry.getSize());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void constructor_givenZipEntryWithExtra_shouldParseExtraFields() throws ZipException {
        java.util.zip.ZipEntry stdEntry = new java.util.zip.ZipEntry("extra.txt");
        byte[] extraData = new byte[] { 1, 0, 2, 0, 10, 20 };
        stdEntry.setExtra(extraData);

        ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        Assert.assertEquals("extra.txt", entry.getName());
        Assert.assertTrue(entry.getExtraFields().length > 0);
    }

    @Test
    public void constructor_givenZipArchiveEntryCopy_shouldCopyAllProperties() throws ZipException {
        ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setInternalAttributes(2);
        source.setExternalAttributes(4L);
        DummyExtraField field = new DummyExtraField(new ZipShort(0x1234));
        source.addExtraField(field);

        ZipArchiveEntry copy = new ZipArchiveEntry(source);

        Assert.assertEquals("source.txt", copy.getName());
        Assert.assertEquals(2, copy.getInternalAttributes());
        Assert.assertEquals(4L, copy.getExternalAttributes());
        Assert.assertNotNull(copy.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void constructor_givenFileDirectoryWithoutTrailingSlash_shouldAppendSlash() {
        File dir = new File(System.getProperty("java.io.tmpdir"));
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "myDirectory");

        Assert.assertTrue(entry.isDirectory());
        Assert.assertEquals("myDirectory/", entry.getName());
        Assert.assertEquals(dir.lastModified(), entry.getTime());
    }

    @Test
    public void constructor_givenFileDirectoryWithTrailingSlash_shouldNotDoubleSlash() {
        File dir = new File(System.getProperty("java.io.tmpdir"));
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "myDirectory/");

        Assert.assertTrue(entry.isDirectory());
        Assert.assertEquals("myDirectory/", entry.getName());
    }

    @Test
    public void constructor_givenRegularFile_shouldSetSizeAndTime() throws IOException {
        File tempFile = File.createTempFile("zipEntryTest", ".tmp");
        try {
            FileOutputStream fos = new FileOutputStream(tempFile);
            fos.write(new byte[] { 1, 2, 3, 4, 5 });
            fos.close();

            ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "tempFile.bin");

            Assert.assertFalse(entry.isDirectory());
            Assert.assertEquals("tempFile.bin", entry.getName());
            Assert.assertEquals(tempFile.length(), entry.getSize());
            Assert.assertEquals(tempFile.lastModified(), entry.getTime());
        } finally {
            if (tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Test
    public void clone_givenConfiguredEntry_shouldReturnIdenticalClonedObject() {
        ZipArchiveEntry entry = new ZipArchiveEntry("original.txt");
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(0777L << 16);
        DummyExtraField field = new DummyExtraField(new ZipShort(0x0001));
        entry.addExtraField(field);

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();

        Assert.assertNotSame(entry, cloned);
        Assert.assertEquals(entry.getName(), cloned.getName());
        Assert.assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        Assert.assertNotNull(cloned.getExtraField(new ZipShort(0x0001)));
    }

    @Test
    public void setMethod_givenValidMethod_shouldUpdateMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setMethod(8);
        Assert.assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMethod_givenNegativeMethod_shouldThrowIllegalArgumentException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setMethod(-2);
    }

    @Test
    public void setSize_givenValidSize_shouldUpdateSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setSize(5000L);
        Assert.assertEquals(5000L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSize_givenNegativeSize_shouldThrowIllegalArgumentException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setSize(-10L);
    }

    @Test
    public void setUnixMode_givenDirectoryAndModeWithUserWrite_shouldEncodeProperAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0755);

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0755, entry.getUnixMode());
        long expectedAttr = (0755 << 16) | 0 | 0x10;
        Assert.assertEquals(expectedAttr, entry.getExternalAttributes());
    }

    @Test
    public void setUnixMode_givenFileAndModeWithoutUserWrite_shouldEncodeLowestBitAsOne() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setUnixMode(0555);

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0555, entry.getUnixMode());
        long expectedAttr = (0555 << 16) | 1 | 0;
        Assert.assertEquals(expectedAttr, entry.getExternalAttributes());
    }

    @Test
    public void getUnixMode_givenPlatformFat_shouldReturnZero() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setExternalAttributes(0777L << 16);

        Assert.assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void setName_givenPlatformUnix_shouldNotReplaceBackslashes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setName("dir\\name.txt");

        Assert.assertEquals("dir\\name.txt", entry.getName());
    }

    @Test
    public void setNameAndRawName_givenRawName_shouldStoreAndReturnClone() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        byte[] raw = new byte[] { 65, 66, 67 };
        entry.setName("file.txt", raw);

        byte[] returnedRaw = entry.getRawName();
        Assert.assertArrayEquals(raw, returnedRaw);
        Assert.assertNotSame(raw, returnedRaw);

        returnedRaw[0] = 99;
        Assert.assertEquals(65, entry.getRawName()[0]);
    }

    @Test
    public void getRawName_givenNotSet_shouldReturnNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        Assert.assertNull(entry.getRawName());
    }

    @Test
    public void extraFields_givenStandardAndUnparseableFields_shouldManageFieldsCorrectly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        ZipShort id1 = new ZipShort(1);
        ZipShort id2 = new ZipShort(2);
        DummyExtraField field1 = new DummyExtraField(id1);
        DummyExtraField field2 = new DummyExtraField(id2);
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();

        entry.setExtraFields(new ZipExtraField[] { field1, unparseable });

        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertEquals(2, entry.getExtraFields(true).length);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
        Assert.assertSame(field1, entry.getExtraField(id1));

        entry.addExtraField(field2);
        Assert.assertEquals(2, entry.getExtraFields().length);
        Assert.assertEquals(3, entry.getExtraFields(true).length);

        UnparseableExtraFieldData unparseable2 = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable2);
        Assert.assertSame(unparseable2, entry.getUnparseableExtraFieldData());

        entry.removeExtraField(id1);
        Assert.assertNull(entry.getExtraField(id1));

        entry.removeUnparseableExtraFieldData();
        Assert.assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void getExtraFields_givenNoFields_shouldHandleIncludeUnparseableOptions() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        Assert.assertEquals(0, entry.getExtraFields(false).length);
        Assert.assertEquals(0, entry.getExtraFields(true).length);

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);

        Assert.assertEquals(0, entry.getExtraFields(false).length);
        Assert.assertEquals(1, entry.getExtraFields(true).length);
        Assert.assertSame(unparseable, entry.getExtraFields(true)[0]);
    }

    @Test
    public void addAsFirstExtraField_givenRegularAndUnparseableFields_shouldOrderProperly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        DummyExtraField field1 = new DummyExtraField(new ZipShort(1));
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2));

        entry.addAsFirstExtraField(field1);
        Assert.assertSame(field1, entry.getExtraFields()[0]);

        entry.addAsFirstExtraField(field2);
        Assert.assertSame(field2, entry.getExtraFields()[0]);
        Assert.assertSame(field1, entry.getExtraFields()[1]);

        entry.addAsFirstExtraField(field1);
        Assert.assertSame(field1, entry.getExtraFields()[0]);
        Assert.assertSame(field2, entry.getExtraFields()[1]);

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addAsFirstExtraField(unparseable);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenNullExtraFields_shouldThrowNoSuchElementException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.removeExtraField(new ZipShort(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenMissingField_shouldThrowNoSuchElementException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.addExtraField(new DummyExtraField(new ZipShort(1)));
        entry.removeExtraField(new ZipShort(2));
    }

    @Test(expected = NoSuchElementException.class)
    public void removeUnparseableExtraFieldData_givenMissingData_shouldThrowNoSuchElementException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void setExtra_givenValidBytes_shouldParseAndMergeLocalData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        byte[] extraBytes = new byte[] { 1, 0, 2, 0, 11, 22 };
        entry.setExtra(extraBytes);

        ZipExtraField field = entry.getExtraField(new ZipShort(1));
        Assert.assertNotNull(field);
        Assert.assertEquals(2, field.getLocalFileDataLength().getValue());

        byte[] updatedBytes = new byte[] { 1, 0, 2, 0, 33, 44 };
        entry.setExtra(updatedBytes);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test(expected = RuntimeException.class)
    public void setExtra_givenCorruptBytes_shouldThrowRuntimeException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setExtra(new byte[] { 1 });
    }

    @Test
    public void setCentralDirectoryExtra_givenValidBytes_shouldParseAndMergeCentralData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        byte[] extraBytes = new byte[] { 1, 0, 2, 0, 5, 6 };
        entry.setCentralDirectoryExtra(extraBytes);

        ZipExtraField field = entry.getExtraField(new ZipShort(1));
        Assert.assertNotNull(field);

        byte[] updatedBytes = new byte[] { 1, 0, 2, 0, 7, 8 };
        entry.setCentralDirectoryExtra(updatedBytes);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test(expected = RuntimeException.class)
    public void setCentralDirectoryExtra_givenCorruptBytes_shouldThrowRuntimeException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setCentralDirectoryExtra(new byte[] { 1 });
    }

    @Test
    public void getLocalAndCentralDirectoryExtra_givenDefaultEntry_shouldReturnNonEmptyOrEmptyArray() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        byte[] localExtra = entry.getLocalFileDataExtra();
        Assert.assertNotNull(localExtra);

        byte[] centralExtra = entry.getCentralDirectoryExtra();
        Assert.assertNotNull(centralExtra);
    }

    @Test
    public void getLastModifiedDate_givenTimeSet_shouldReturnCorrespondingDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        long now = 1600000000000L;
        entry.setTime(now);
        Assert.assertEquals(new Date(now), entry.getLastModifiedDate());
    }

    @Test
    public void generalPurposeBit_givenInstance_shouldGetAndSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useEncryption(true);
        entry.setGeneralPurposeBit(gpb);
        Assert.assertTrue(entry.getGeneralPurposeBit().usesEncryption());
    }

    @Test
    public void equalsAndHashCode_givenVariousScenarios_shouldExerciseAllEqualityBranches() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");

        Assert.assertTrue(entry1.equals(entry1));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("NotAZipEntry"));

        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());

        entry2 = new ZipArchiveEntry("other.txt");
        Assert.assertFalse(entry1.equals(entry2));

        entry2 = new ZipArchiveEntry("test.txt");
        entry1.setComment("comment");
        Assert.assertFalse(entry1.equals(entry2));
        Assert.assertFalse(entry2.equals(entry1));

        entry2.setComment("different");
        Assert.assertFalse(entry1.equals(entry2));

        entry2.setComment("comment");
        Assert.assertTrue(entry1.equals(entry2));

        entry2.setTime(50000L);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setTime(50000L);

        entry2.setInternalAttributes(1);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setInternalAttributes(1);

        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);

        entry2.setExternalAttributes(20L);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setExternalAttributes(20L);

        entry2.setMethod(java.util.zip.ZipEntry.DEFLATED);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setMethod(java.util.zip.ZipEntry.DEFLATED);

        entry2.setSize(100L);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setSize(100L);

        entry2.setCrc(12345L);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setCrc(12345L);

        entry2.setCompressedSize(50L);
        Assert.assertFalse(entry1.equals(entry2));
        entry1.setCompressedSize(50L);

        DummyExtraField fieldA = new DummyExtraField(new ZipShort(1));
        fieldA.setCentralData(new byte[] { 1, 2 });
        fieldA.setLocalData(new byte[] { 1, 2 });
        entry1.addExtraField(fieldA);
        Assert.assertFalse(entry1.equals(entry2));

        DummyExtraField fieldB = new DummyExtraField(new ZipShort(1));
        fieldB.setCentralData(new byte[] { 1, 2 });
        fieldB.setLocalData(new byte[] { 1, 2 });
        entry2.addExtraField(fieldB);
        Assert.assertTrue(entry1.equals(entry2));

        GeneralPurposeBit gpbDifferent = new GeneralPurposeBit();
        gpbDifferent.useEncryption(true);
        entry2.setGeneralPurposeBit(gpbDifferent);
        Assert.assertFalse(entry1.equals(entry2));
    }
}