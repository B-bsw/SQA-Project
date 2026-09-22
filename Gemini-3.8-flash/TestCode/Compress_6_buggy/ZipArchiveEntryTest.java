package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static class DummyExtraField implements ZipExtraField {
        private ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        public DummyExtraField(ZipShort headerId) {
            this.headerId = headerId;
            this.localData = new byte[0];
            this.centralData = new byte[0];
        }

        public DummyExtraField(ZipShort headerId, byte[] localData, byte[] centralData) {
            this.headerId = headerId;
            this.localData = localData != null ? localData : new byte[0];
            this.centralData = centralData != null ? centralData : new byte[0];
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
    }

    private static class SubclassZipArchiveEntry extends ZipArchiveEntry {
        public SubclassZipArchiveEntry() {
            super();
        }

        public void testSetName(String name) {
            setName(name);
        }

        public void testSetPlatform(int platform) {
            setPlatform(platform);
        }

        public void testSetExtra() {
            setExtra();
        }
    }

    @Test
    public void constructor_givenName_shouldSetDefaultValues() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");

        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertEquals(0, entry.getInternalAttributes());
        Assert.assertEquals(0L, entry.getExternalAttributes());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertEquals(0, entry.getExtraFields().length);
        Assert.assertFalse(entry.isDirectory());
        Assert.assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void constructor_givenProtectedNoArgConstructor_shouldSetEmptyName() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();

        Assert.assertEquals("", entry.getName());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenJavaZipEntryWithoutExtra_shouldInitializeProperly() throws ZipException {
        ZipEntry javaZipEntry = new ZipEntry("entry.dat");
        javaZipEntry.setMethod(ZipEntry.DEFLATED);

        ZipArchiveEntry archiveEntry = new ZipArchiveEntry(javaZipEntry);

        Assert.assertEquals("entry.dat", archiveEntry.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, archiveEntry.getMethod());
        Assert.assertTrue(archiveEntry.isSupportedCompressionMethod());
        Assert.assertEquals(0, archiveEntry.getExtraFields().length);
    }

    @Test
    public void constructor_givenJavaZipEntryWithExtra_shouldParseExtraFields() throws ZipException {
        ZipEntry javaZipEntry = new ZipEntry("entryWithExtra.bin");
        byte[] extraData = new byte[] {0x41, 0x42, 0x02, 0x00, 0x01, 0x02};
        javaZipEntry.setExtra(extraData);

        ZipArchiveEntry archiveEntry = new ZipArchiveEntry(javaZipEntry);

        Assert.assertEquals("entryWithExtra.bin", archiveEntry.getName());
        Assert.assertEquals(1, archiveEntry.getExtraFields().length);
        Assert.assertEquals(new ZipShort(0x4241), archiveEntry.getExtraFields()[0].getHeaderId());
    }

    @Test
    public void constructor_givenZipArchiveEntry_shouldCopyAllAttributes() throws ZipException {
        ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setMethod(ZipEntry.STORED);
        source.setInternalAttributes(12);
        source.setExternalAttributes(3456L);
        DummyExtraField field = new DummyExtraField(new ZipShort(1));
        source.addExtraField(field);

        ZipArchiveEntry copy = new ZipArchiveEntry(source);

        Assert.assertEquals("source.txt", copy.getName());
        Assert.assertEquals(ZipEntry.STORED, copy.getMethod());
        Assert.assertEquals(12, copy.getInternalAttributes());
        Assert.assertEquals(3456L, copy.getExternalAttributes());
        Assert.assertEquals(1, copy.getExtraFields().length);
        Assert.assertNotNull(copy.getExtraField(new ZipShort(1)));
    }

    @Test
    public void constructor_givenDirectoryFileWithoutSlash_shouldAppendSlash() throws IOException {
        File tempDir = File.createTempFile("zipTestDir", "");
        tempDir.delete();
        tempDir.mkdir();
        tempDir.deleteOnExit();

        try {
            ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "folder");

            Assert.assertEquals("folder/", entry.getName());
            Assert.assertTrue(entry.isDirectory());
            Assert.assertEquals(tempDir.lastModified(), entry.getTime());
        } finally {
            tempDir.delete();
        }
    }

    @Test
    public void constructor_givenDirectoryFileWithSlash_shouldNotAppendExtraSlash() throws IOException {
        File tempDir = File.createTempFile("zipTestDirSlash", "");
        tempDir.delete();
        tempDir.mkdir();
        tempDir.deleteOnExit();

        try {
            ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "folder/");

            Assert.assertEquals("folder/", entry.getName());
            Assert.assertTrue(entry.isDirectory());
        } finally {
            tempDir.delete();
        }
    }

    @Test
    public void constructor_givenRegularFile_shouldSetSizeAndTime() throws IOException {
        File tempFile = File.createTempFile("zipTestFile", ".txt");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(new byte[] {1, 2, 3, 4, 5});
        fos.close();

        try {
            ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "sub/file.txt");

            Assert.assertEquals("sub/file.txt", entry.getName());
            Assert.assertFalse(entry.isDirectory());
            Assert.assertEquals(5L, entry.getSize());
            Assert.assertEquals(tempFile.lastModified(), entry.getTime());
        } finally {
            tempFile.delete();
        }
    }

    @Test
    public void clone_givenEntryWithExtraFields_shouldProduceIndependentClone() {
        ZipArchiveEntry entry = new ZipArchiveEntry("original.txt");
        entry.setInternalAttributes(7);
        entry.setExternalAttributes(99L);
        entry.addExtraField(new DummyExtraField(new ZipShort(123)));

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();

        Assert.assertNotSame(entry, cloned);
        Assert.assertEquals(entry.getName(), cloned.getName());
        Assert.assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        Assert.assertEquals(1, cloned.getExtraFields().length);
        Assert.assertNotNull(cloned.getExtraField(new ZipShort(123)));

        cloned.addExtraField(new DummyExtraField(new ZipShort(456)));
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertEquals(2, cloned.getExtraFields().length);
    }

    @Test
    public void clone_givenEntryWithNullExtraFields_shouldCloneWithoutError() {
        ZipArchiveEntry entry = new ZipArchiveEntry("noExtra.txt");

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();

        Assert.assertNotSame(entry, cloned);
        Assert.assertEquals(0, cloned.getExtraFields().length);
    }

    @Test
    public void isSupportedCompressionMethod_givenVariousMethods_shouldReturnExpectedBoolean() {
        ZipArchiveEntry entry = new ZipArchiveEntry("methodTest");

        entry.setMethod(ZipEntry.STORED);
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipEntry.DEFLATED);
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(12);
        Assert.assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMethod_givenNegativeValue_shouldThrowIllegalArgumentException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("negMethod");
        entry.setMethod(-2);
    }

    @Test
    public void setInternalAttributes_givenValue_shouldStoreAndRetrieveCorrectly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("attr");
        entry.setInternalAttributes(42);
        Assert.assertEquals(42, entry.getInternalAttributes());
    }

    @Test
    public void setExternalAttributes_givenValue_shouldStoreAndRetrieveCorrectly() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extAttr");
        entry.setExternalAttributes(0xFFFFFFFFL);
        Assert.assertEquals(0xFFFFFFFFL, entry.getExternalAttributes());
    }

    @Test
    public void unixMode_givenFatPlatform_shouldReturnZero() {
        ZipArchiveEntry entry = new ZipArchiveEntry("fatFile.txt");
        entry.setExternalAttributes(0644L << 16);
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);

        Assert.assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void unixMode_givenFileMode_shouldSetUnixPlatformAndExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixFile.txt");
        entry.setUnixMode(0644);

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0644, entry.getUnixMode());
        Assert.assertEquals((0644 << 16) | 0, entry.getExternalAttributes());
    }

    @Test
    public void unixMode_givenReadOnlyFileMode_shouldSetDosReadOnlyBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("readonly.txt");
        entry.setUnixMode(0444);

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0444, entry.getUnixMode());
        Assert.assertEquals((0444 << 16) | 1, entry.getExternalAttributes());
    }

    @Test
    public void unixMode_givenDirectoryMode_shouldSetDosDirectoryBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixDir/");
        entry.setUnixMode(0755);

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0755, entry.getUnixMode());
        Assert.assertEquals((0755 << 16) | 0x10, entry.getExternalAttributes());
    }

    @Test
    public void setPlatform_givenUnixPlatform_shouldReturnUnixPlatform() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        entry.testSetPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void setExtraFields_givenMultipleFields_shouldReplaceExisting() {
        ZipArchiveEntry entry = new ZipArchiveEntry("multiExtra");
        ZipExtraField[] fields = new ZipExtraField[] {
            new DummyExtraField(new ZipShort(1)),
            new DummyExtraField(new ZipShort(2))
        };

        entry.setExtraFields(fields);
        Assert.assertEquals(2, entry.getExtraFields().length);

        ZipExtraField[] replacement = new ZipExtraField[] {
            new DummyExtraField(new ZipShort(3))
        };
        entry.setExtraFields(replacement);

        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
        Assert.assertNotNull(entry.getExtraField(new ZipShort(3)));
    }

    @Test
    public void addExtraField_givenSameHeaderId_shouldReplaceExistingFieldAtEnd() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extraReplace");
        DummyExtraField field1 = new DummyExtraField(new ZipShort(1), new byte[] {1}, new byte[] {1});
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2), new byte[] {2}, new byte[] {2});
        DummyExtraField field1Replacement = new DummyExtraField(new ZipShort(1), new byte[] {9}, new byte[] {9});

        entry.addExtraField(field1);
        entry.addExtraField(field2);
        entry.addExtraField(field1Replacement);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(2, fields.length);
        Assert.assertEquals(new ZipShort(2), fields[0].getHeaderId());
        Assert.assertEquals(new ZipShort(1), fields[1].getHeaderId());
        Assert.assertEquals(9, fields[1].getLocalFileDataData()[0]);
    }

    @Test
    public void addAsFirstExtraField_givenNullExtraFields_shouldInitializeAndAdd() {
        ZipArchiveEntry entry = new ZipArchiveEntry("firstNull");
        DummyExtraField field = new DummyExtraField(new ZipShort(10));

        entry.addAsFirstExtraField(field);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(1, fields.length);
        Assert.assertEquals(new ZipShort(10), fields[0].getHeaderId());
    }

    @Test
    public void addAsFirstExtraField_givenExistingFields_shouldPrependField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("firstPrepend");
        DummyExtraField field1 = new DummyExtraField(new ZipShort(1));
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2));
        DummyExtraField field0 = new DummyExtraField(new ZipShort(0));

        entry.addExtraField(field1);
        entry.addExtraField(field2);
        entry.addAsFirstExtraField(field0);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(3, fields.length);
        Assert.assertEquals(new ZipShort(0), fields[0].getHeaderId());
        Assert.assertEquals(new ZipShort(1), fields[1].getHeaderId());
        Assert.assertEquals(new ZipShort(2), fields[2].getHeaderId());
    }

    @Test
    public void addAsFirstExtraField_givenDuplicateField_shouldMoveToFirst() {
        ZipArchiveEntry entry = new ZipArchiveEntry("firstDuplicate");
        DummyExtraField field1 = new DummyExtraField(new ZipShort(1));
        DummyExtraField field2 = new DummyExtraField(new ZipShort(2));
        DummyExtraField field2New = new DummyExtraField(new ZipShort(2));

        entry.addExtraField(field1);
        entry.addExtraField(field2);
        entry.addAsFirstExtraField(field2New);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(2, fields.length);
        Assert.assertEquals(new ZipShort(2), fields[0].getHeaderId());
        Assert.assertEquals(new ZipShort(1), fields[1].getHeaderId());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenNullExtraFields_shouldThrowNoSuchElementException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("removeNull");
        entry.removeExtraField(new ZipShort(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenNonExistingField_shouldThrowNoSuchElementException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("removeNonExist");
        entry.addExtraField(new DummyExtraField(new ZipShort(1)));
        entry.removeExtraField(new ZipShort(2));
    }

    @Test
    public void removeExtraField_givenExistingField_shouldRemoveField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("removeOk");
        entry.addExtraField(new DummyExtraField(new ZipShort(1)));
        entry.addExtraField(new DummyExtraField(new ZipShort(2)));

        entry.removeExtraField(new ZipShort(1));

        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
        Assert.assertNotNull(entry.getExtraField(new ZipShort(2)));
    }

    @Test
    public void getExtraField_givenNullExtraFields_shouldReturnNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getNull");
        Assert.assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void getExtraField_givenNonExistingKey_shouldReturnNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getMissing");
        entry.addExtraField(new DummyExtraField(new ZipShort(1)));
        Assert.assertNull(entry.getExtraField(new ZipShort(99)));
    }

    @Test
    public void setExtra_givenValidBytesWhenExtraFieldsNull_shouldParseAndSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("validExtra");
        byte[] extraData = new byte[] {0x01, 0x00, 0x01, 0x00, 0x7F};

        entry.setExtra(extraData);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(1, fields.length);
        Assert.assertEquals(new ZipShort(1), fields[0].getHeaderId());
    }

    @Test
    public void setExtra_givenBytesWithExistingMatchingField_shouldMergeLocalData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("mergeLocal");
        DummyExtraField field = new DummyExtraField(new ZipShort(1), new byte[] {0}, new byte[] {0});
        entry.addExtraField(field);

        byte[] newLocalBytes = new byte[] {0x01, 0x00, 0x02, 0x00, 0x55, 0x66};
        entry.setExtra(newLocalBytes);

        DummyExtraField updated = (DummyExtraField) entry.getExtraField(new ZipShort(1));
        Assert.assertEquals(2, updated.getLocalFileDataData().length);
        Assert.assertEquals(0x55, updated.getLocalFileDataData()[0]);
        Assert.assertEquals(0x66, updated.getLocalFileDataData()[1]);
    }

    @Test
    public void setExtra_givenBytesWithNewFieldWhenExtraFieldsNotNull_shouldAddNewField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("addNewFieldViaSetExtra");
        DummyExtraField field = new DummyExtraField(new ZipShort(1));
        entry.addExtraField(field);

        byte[] secondFieldBytes = new byte[] {0x02, 0x00, 0x01, 0x00, 0x22};
        entry.setExtra(secondFieldBytes);

        Assert.assertEquals(2, entry.getExtraFields().length);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(1)));
        Assert.assertNotNull(entry.getExtraField(new ZipShort(2)));
    }

    @Test
    public void setExtra_givenInvalidExtraBytes_shouldThrowRuntimeException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("invalidExtra");
        try {
            entry.setExtra(new byte[] {0x01, 0x02, 0x03});
            Assert.fail("Expected RuntimeException on invalid extra data");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getCause() instanceof ZipException);
        }
    }

    @Test
    public void setCentralDirectoryExtra_givenValidBytesWhenExtraFieldsNull_shouldParseAndSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("validCentral");
        byte[] centralBytes = new byte[] {0x05, 0x00, 0x01, 0x00, 0x11};

        entry.setCentralDirectoryExtra(centralBytes);

        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(1, fields.length);
        Assert.assertEquals(new ZipShort(5), fields[0].getHeaderId());
    }

    @Test
    public void setCentralDirectoryExtra_givenBytesWithExistingMatchingField_shouldMergeCentralData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("mergeCentral");
        DummyExtraField field = new DummyExtraField(new ZipShort(1), new byte[] {0}, new byte[] {0});
        entry.addExtraField(field);

        byte[] newCentralBytes = new byte[] {0x01, 0x00, 0x02, 0x00, 0x33, 0x44};
        entry.setCentralDirectoryExtra(newCentralBytes);

        DummyExtraField updated = (DummyExtraField) entry.getExtraField(new ZipShort(1));
        Assert.assertEquals(2, updated.getCentralDirectoryData().length);
        Assert.assertEquals(0x33, updated.getCentralDirectoryData()[0]);
        Assert.assertEquals(0x44, updated.getCentralDirectoryData()[1]);
    }

    @Test
    public void setCentralDirectoryExtra_givenInvalidBytes_shouldThrowRuntimeException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("invalidCentral");
        try {
            entry.setCentralDirectoryExtra(new byte[] {0x01});
            Assert.fail("Expected RuntimeException on invalid central directory extra data");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getCause() instanceof ZipException);
        }
    }

    @Test
    public void getLocalFileDataExtra_givenEmptyOrNullExtra_shouldReturnEmptyArray() {
        ZipArchiveEntry entry = new ZipArchiveEntry("noLocalExtra");
        byte[] localExtra = entry.getLocalFileDataExtra();

        Assert.assertNotNull(localExtra);
        Assert.assertEquals(0, localExtra.length);
    }

    @Test
    public void getLocalFileDataExtra_givenPopulatedExtra_shouldReturnMergedBytes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("populatedLocalExtra");
        DummyExtraField field = new DummyExtraField(new ZipShort(1), new byte[] {0x0A, 0x0B}, new byte[0]);
        entry.addExtraField(field);

        byte[] localExtra = entry.getLocalFileDataExtra();

        Assert.assertEquals(6, localExtra.length);
        Assert.assertEquals(0x01, localExtra[0]);
        Assert.assertEquals(0x00, localExtra[1]);
        Assert.assertEquals(0x02, localExtra[2]);
        Assert.assertEquals(0x00, localExtra[3]);
        Assert.assertEquals(0x0A, localExtra[4]);
        Assert.assertEquals(0x0B, localExtra[5]);
    }

    @Test
    public void getCentralDirectoryExtra_givenPopulatedExtra_shouldReturnMergedBytes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("populatedCentralExtra");
        DummyExtraField field = new DummyExtraField(new ZipShort(2), new byte[0], new byte[] {0x0C, 0x0D});
        entry.addExtraField(field);

        byte[] centralExtra = entry.getCentralDirectoryExtra();

        Assert.assertEquals(6, centralExtra.length);
        Assert.assertEquals(0x02, centralExtra[0]);
        Assert.assertEquals(0x00, centralExtra[1]);
        Assert.assertEquals(0x02, centralExtra[2]);
        Assert.assertEquals(0x00, centralExtra[3]);
        Assert.assertEquals(0x0C, centralExtra[4]);
        Assert.assertEquals(0x0D, centralExtra[5]);
    }

    @Test
    public void getName_and_setName_shouldReturnCustomNameWhenSet() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        Assert.assertEquals("", entry.getName());

        entry.testSetName("renamed.log");
        Assert.assertEquals("renamed.log", entry.getName());
    }

    @Test
    public void isDirectory_givenTrailingSlash_shouldReturnTrue() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        Assert.assertTrue(dirEntry.isDirectory());

        ZipArchiveEntry fileEntry = new ZipArchiveEntry("folder");
        Assert.assertFalse(fileEntry.isDirectory());
    }

    @Test
    public void hashCode_givenEqualNames_shouldReturnEqualHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("alpha");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("alpha");

        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
        Assert.assertEquals("alpha".hashCode(), entry1.hashCode());
    }

    @Test
    public void getLastModifiedDate_givenTime_shouldReturnCorrespondingDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dateTest");
        long now = 1600000000000L;
        entry.setTime(now);

        Date date = entry.getLastModifiedDate();
        Assert.assertNotNull(date);
        Assert.assertEquals(entry.getTime(), date.getTime());
    }

    @Test
    public void equals_givenVariousScenarios_shouldAdhereToEqualsContract() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("common");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("common");
        ZipArchiveEntry entryDifferent = new ZipArchiveEntry("different");

        Assert.assertTrue(entry1.equals(entry1));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("A String Object"));
        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry2.equals(entry1));
        Assert.assertFalse(entry1.equals(entryDifferent));

        SubclassZipArchiveEntry nullName1 = new SubclassZipArchiveEntry();
        nullName1.testSetName(null);
        SubclassZipArchiveEntry nullName2 = new SubclassZipArchiveEntry();
        nullName2.testSetName(null);

        Assert.assertTrue(nullName1.equals(nullName2));
        Assert.assertFalse(nullName1.equals(entry1));
        Assert.assertFalse(entry1.equals(nullName1));
    }

    @Test
    public void testSetExtraDirectProtectedCall() {
        SubclassZipArchiveEntry entry = new SubclassZipArchiveEntry();
        entry.testSetExtra();
        Assert.assertNotNull(entry.getLocalFileDataExtra());
    }
}