package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static class MockExtraField implements ZipExtraField {
        private final ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        public MockExtraField(final ZipShort headerId, final byte[] localData, final byte[] centralData) {
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

        public byte[] getLocalFileDataData() {
            return localData;
        }

        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        public void parseFromLocalFileData(final byte[] buffer, final int offset, final int length) {
            localData = new byte[length];
            System.arraycopy(buffer, offset, localData, 0, length);
        }

        public void parseFromCentralDirectoryData(final byte[] buffer, final int offset, final int length) {
            centralData = new byte[length];
            System.arraycopy(buffer, offset, centralData, 0, length);
        }
    }

    private static class SubclassZipArchiveEntry extends ZipArchiveEntry {
        public SubclassZipArchiveEntry() {
            super();
        }
    }

    @Test
    public void constructor_givenName_shouldInitializeProperly() {
        // Arrange & Act
        final ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");

        // Assert
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertEquals(ZipMethod.UNKNOWN_CODE, entry.getMethod());
        Assert.assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());
    }

    @Test
    public void constructor_givenWindowsPathOnFat_shouldReplaceBackslashes() {
        // Arrange & Act
        final ZipArchiveEntry entry = new ZipArchiveEntry("dir\\subdir\\file.txt");

        // Assert
        Assert.assertEquals("dir/subdir/file.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenDirectoryName_shouldDetectDirectory() {
        // Arrange & Act
        final ZipArchiveEntry entry = new ZipArchiveEntry("directory/");

        // Assert
        Assert.assertTrue(entry.isDirectory());
        Assert.assertEquals("directory/", entry.getName());
    }

    @Test
    public void constructor_givenFileAndEntryName_shouldSetSizeAndTime() throws IOException {
        // Arrange
        final File tempFile = File.createTempFile("testZipEntry", ".tmp");
        tempFile.deleteOnExit();
        final FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(new byte[]{1, 2, 3, 4, 5});
        fos.close();

        try {
            // Act
            final ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "customName");

            // Assert
            Assert.assertEquals("customName", entry.getName());
            Assert.assertEquals(5L, entry.getSize());
            Assert.assertEquals(tempFile.lastModified(), entry.getTime());
            Assert.assertFalse(entry.isDirectory());
        } finally {
            tempFile.delete();
        }
    }

    @Test
    public void constructor_givenDirectoryFileWithoutSlash_shouldAppendSlash() {
        // Arrange
        final File tempDir = new File(System.getProperty("java.io.tmpdir"));

        // Act
        final ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "folder");

        // Assert
        Assert.assertEquals("folder/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void constructor_givenDirectoryFileWithSlash_shouldKeepSingleSlash() {
        // Arrange
        final File tempDir = new File(System.getProperty("java.io.tmpdir"));

        // Act
        final ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "folder/");

        // Assert
        Assert.assertEquals("folder/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void constructor_givenStandardZipEntryWithoutExtra_shouldCopyFields() throws ZipException {
        // Arrange
        final ZipEntry stdEntry = new ZipEntry("entry.txt");
        stdEntry.setMethod(ZipEntry.DEFLATED);
        stdEntry.setSize(100L);

        // Act
        final ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        // Assert
        Assert.assertEquals("entry.txt", entry.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertEquals(100L, entry.getSize());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void constructor_givenStandardZipEntryWithExtra_shouldParseExtra() throws ZipException {
        // Arrange
        final ZipEntry stdEntry = new ZipEntry("entry.txt");
        final byte[] extraBytes = new byte[]{1, 0, 2, 0, 65, 66};
        stdEntry.setExtra(extraBytes);

        // Act
        final ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        // Assert
        Assert.assertNotNull(entry.getExtraFields());
        Assert.assertTrue(entry.getExtraFields().length > 0);
    }

    @Test
    public void constructor_givenZipArchiveEntry_shouldCopyAllAttributes() throws ZipException {
        // Arrange
        final ZipArchiveEntry src = new ZipArchiveEntry("source.txt");
        src.setInternalAttributes(12);
        src.setExternalAttributes(34L);
        src.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        src.setGeneralPurposeBit(gpb);
        final MockExtraField field = new MockExtraField(new ZipShort(0x1111), new byte[]{1}, new byte[]{2});
        src.addExtraField(field);

        // Act
        final ZipArchiveEntry copy = new ZipArchiveEntry(src);

        // Assert
        Assert.assertEquals("source.txt", copy.getName());
        Assert.assertEquals(12, copy.getInternalAttributes());
        Assert.assertEquals(34L, copy.getExternalAttributes());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, copy.getPlatform());
        Assert.assertEquals(gpb, copy.getGeneralPurposeBit());
        Assert.assertNotSame(gpb, copy.getGeneralPurposeBit());
        Assert.assertNotNull(copy.getExtraField(new ZipShort(0x1111)));
    }

    @Test
    public void constructor_protectedDefault_shouldInitializeWithEmptyName() {
        // Arrange & Act
        final ZipArchiveEntry entry = new SubclassZipArchiveEntry();

        // Assert
        Assert.assertEquals("", entry.getName());
    }

    @Test
    public void clone_givenZipArchiveEntry_shouldPerformFieldCopy() {
        // Arrange
        final ZipArchiveEntry src = new ZipArchiveEntry("cloneTarget.txt");
        src.setInternalAttributes(5);
        src.setExternalAttributes(99L);
        final MockExtraField field = new MockExtraField(new ZipShort(0x2222), new byte[]{3}, new byte[]{4});
        src.addExtraField(field);

        // Act
        final ZipArchiveEntry cloned = (ZipArchiveEntry) src.clone();

        // Assert
        Assert.assertNotSame(src, cloned);
        Assert.assertEquals(src.getName(), cloned.getName());
        Assert.assertEquals(src.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertEquals(src.getExternalAttributes(), cloned.getExternalAttributes());
        Assert.assertNotNull(cloned.getExtraField(new ZipShort(0x2222)));
    }

    @Test
    public void setMethod_givenValidMethod_shouldUpdateMethod() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setMethod(ZipEntry.STORED);

        // Assert
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setMethod_givenNegativeMethod_shouldThrowIllegalArgumentException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setMethod(-1);
    }

    @Test
    public void setSize_givenValidSize_shouldUpdateSize() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setSize(2048L);

        // Assert
        Assert.assertEquals(2048L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSize_givenNegativeSize_shouldThrowIllegalArgumentException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setSize(-2L);
    }

    @Test
    public void unixMode_givenUnixModeForFile_shouldSetAttributesAndPlatform() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setUnixMode(0644);

        // Assert
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0644, entry.getUnixMode());
        Assert.assertFalse(entry.isUnixSymlink());
    }

    @Test
    public void unixMode_givenUnixModeForDirectory_shouldIncludeDirectoryFlag() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("dir/");

        // Act
        entry.setUnixMode(0755);

        // Assert
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0755, entry.getUnixMode());
        Assert.assertEquals(0x10, entry.getExternalAttributes() & 0x10);
    }

    @Test
    public void unixMode_givenPlatformFat_getUnixModeShouldReturnZero() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setExternalAttributes(0644L << 16);

        // Act & Assert
        Assert.assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void isUnixSymlink_givenLinkFlag_shouldReturnTrue() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("link");

        // Act
        entry.setUnixMode(UnixStat.LINK_FLAG | 0777);

        // Assert
        Assert.assertTrue(entry.isUnixSymlink());
    }

    @Test
    public void addExtraField_givenNewField_shouldBeRetrievable() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field = new MockExtraField(new ZipShort(0x1234), new byte[]{1, 2}, new byte[]{3, 4});

        // Act
        entry.addExtraField(field);

        // Assert
        Assert.assertSame(field, entry.getExtraField(new ZipShort(0x1234)));
        Assert.assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void addExtraField_givenDuplicateField_shouldReplaceOldField() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field1 = new MockExtraField(new ZipShort(0x1234), new byte[]{1}, new byte[]{1});
        final MockExtraField field2 = new MockExtraField(new ZipShort(0x1234), new byte[]{2}, new byte[]{2});

        // Act
        entry.addExtraField(field1);
        entry.addExtraField(field2);

        // Assert
        Assert.assertSame(field2, entry.getExtraField(new ZipShort(0x1234)));
        Assert.assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void addExtraField_givenUnparseableExtraFieldData_shouldSetUnparseable() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();

        // Act
        entry.addExtraField(unparseable);

        // Assert
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
        Assert.assertEquals(0, entry.getExtraFields(false).length);
        Assert.assertEquals(1, entry.getExtraFields(true).length);
    }

    @Test
    public void addAsFirstExtraField_givenEmpty_shouldPlaceFieldAtFirstIndex() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field = new MockExtraField(new ZipShort(0x1234), new byte[]{1}, new byte[]{1});

        // Act
        entry.addAsFirstExtraField(field);

        // Assert
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertSame(field, entry.getExtraFields()[0]);
    }

    @Test
    public void addAsFirstExtraField_givenExistingFields_shouldPrepend() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field1 = new MockExtraField(new ZipShort(0x1111), new byte[]{1}, new byte[]{1});
        final MockExtraField field2 = new MockExtraField(new ZipShort(0x2222), new byte[]{2}, new byte[]{2});
        entry.addExtraField(field1);

        // Act
        entry.addAsFirstExtraField(field2);

        // Assert
        final ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(2, fields.length);
        Assert.assertSame(field2, fields[0]);
        Assert.assertSame(field1, fields[1]);
    }

    @Test
    public void addAsFirstExtraField_givenDuplicateField_shouldReplaceAndPrepend() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field1 = new MockExtraField(new ZipShort(0x1111), new byte[]{1}, new byte[]{1});
        final MockExtraField field2 = new MockExtraField(new ZipShort(0x2222), new byte[]{2}, new byte[]{2});
        final MockExtraField field1Replacement = new MockExtraField(new ZipShort(0x1111), new byte[]{9}, new byte[]{9});
        entry.addExtraField(field1);
        entry.addExtraField(field2);

        // Act
        entry.addAsFirstExtraField(field1Replacement);

        // Assert
        final ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(2, fields.length);
        Assert.assertSame(field1Replacement, fields[0]);
        Assert.assertSame(field2, fields[1]);
    }

    @Test
    public void addAsFirstExtraField_givenUnparseable_shouldSetUnparseable() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();

        // Act
        entry.addAsFirstExtraField(unparseable);

        // Assert
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void setExtraFields_givenMixedFields_shouldSeparateUnparseable() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field = new MockExtraField(new ZipShort(0x1234), new byte[]{1}, new byte[]{1});
        final UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();

        // Act
        entry.setExtraFields(new ZipExtraField[]{field, unparseable});

        // Assert
        Assert.assertEquals(1, entry.getExtraFields(false).length);
        Assert.assertEquals(2, entry.getExtraFields(true).length);
        Assert.assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void removeExtraField_givenExistingField_shouldRemoveIt() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field1 = new MockExtraField(new ZipShort(0x1111), new byte[]{1}, new byte[]{1});
        final MockExtraField field2 = new MockExtraField(new ZipShort(0x2222), new byte[]{2}, new byte[]{2});
        entry.addExtraField(field1);
        entry.addExtraField(field2);

        // Act
        entry.removeExtraField(new ZipShort(0x1111));

        // Assert
        Assert.assertNull(entry.getExtraField(new ZipShort(0x1111)));
        Assert.assertNotNull(entry.getExtraField(new ZipShort(0x2222)));
        Assert.assertEquals(1, entry.getExtraFields().length);
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenNonExistingField_shouldThrowNoSuchElementException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.addExtraField(new MockExtraField(new ZipShort(0x1111), new byte[]{1}, new byte[]{1}));

        // Act
        entry.removeExtraField(new ZipShort(0x9999));
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExtraField_givenNullExtraFields_shouldThrowNoSuchElementException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.removeExtraField(new ZipShort(0x1111));
    }

    @Test
    public void removeUnparseableExtraFieldData_givenExisting_shouldRemoveIt() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        entry.addExtraField(new UnparseableExtraFieldData());

        // Act
        entry.removeUnparseableExtraFieldData();

        // Assert
        Assert.assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeUnparseableExtraFieldData_givenNull_shouldThrowNoSuchElementException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void getExtraFields_givenOnlyUnparseableAndIncludeUnparseable_shouldReturnIt() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);

        // Act
        final ZipExtraField[] fieldsWithUnparseable = entry.getExtraFields(true);
        final ZipExtraField[] fieldsWithoutUnparseable = entry.getExtraFields(false);

        // Assert
        Assert.assertEquals(1, fieldsWithUnparseable.length);
        Assert.assertSame(unparseable, fieldsWithUnparseable[0]);
        Assert.assertEquals(0, fieldsWithoutUnparseable.length);
    }

    @Test
    public void setExtra_givenValidBytes_shouldParseAndSetExtra() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final byte[] extra = new byte[]{1, 0, 2, 0, 65, 66};

        // Act
        entry.setExtra(extra);

        // Assert
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertEquals(new ZipShort(1), entry.getExtraFields()[0].getHeaderId());
    }

    @Test(expected = RuntimeException.class)
    public void setExtra_givenInvalidBytes_shouldThrowRuntimeException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final byte[] malformed = new byte[]{1};

        // Act
        entry.setExtra(malformed);
    }

    @Test
    public void setCentralDirectoryExtra_givenValidBytes_shouldMergeCentralData() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final byte[] central = new byte[]{1, 0, 2, 0, 65, 66};

        // Act
        entry.setCentralDirectoryExtra(central);

        // Assert
        Assert.assertEquals(1, entry.getExtraFields().length);
    }

    @Test(expected = RuntimeException.class)
    public void setCentralDirectoryExtra_givenInvalidBytes_shouldThrowRuntimeException() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final byte[] malformed = new byte[]{1};

        // Act
        entry.setCentralDirectoryExtra(malformed);
    }

    @Test
    public void getLocalFileDataExtra_givenNoExtra_shouldReturnEmptyByteArray() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        final byte[] result = entry.getLocalFileDataExtra();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getCentralDirectoryExtra_givenExtraFields_shouldReturnMergedData() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final MockExtraField field = new MockExtraField(new ZipShort(0x0001), new byte[]{1, 2}, new byte[]{3, 4});
        entry.addExtraField(field);

        // Act
        final byte[] central = entry.getCentralDirectoryExtra();

        // Assert
        Assert.assertNotNull(central);
        Assert.assertTrue(central.length >= 6);
    }

    @Test
    public void rawName_givenRawName_shouldReturnCopy() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final byte[] raw = new byte[]{65, 66, 67};

        // Act
        entry.setName("file.txt", raw);
        final byte[] result = entry.getRawName();

        // Assert
        Assert.assertArrayEquals(raw, result);
        Assert.assertNotSame(raw, result);
    }

    @Test
    public void rawName_givenNoRawName_shouldReturnNull() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act & Assert
        Assert.assertNull(entry.getRawName());
    }

    @Test
    public void getLastModifiedDate_givenTime_shouldReturnDateObject() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        final long now = 1600000000000L;
        entry.setTime(now);

        // Act
        final Date date = entry.getLastModifiedDate();

        // Assert
        Assert.assertEquals(now, date.getTime());
    }

    @Test
    public void versionAndRawFlag_givenValues_shouldGetSameValues() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Act
        entry.setVersionMadeBy(45);
        entry.setVersionRequired(20);
        entry.setRawFlag(8);

        // Assert
        Assert.assertEquals(45, entry.getVersionMadeBy());
        Assert.assertEquals(20, entry.getVersionRequired());
        Assert.assertEquals(8, entry.getRawFlag());
    }

    @Test
    public void equalsAndHashCode_givenIdenticalEntries_shouldBeEqualAndHaveSameHashCode() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");

        // Assert
        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry2.equals(entry1));
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Assert
        Assert.assertTrue(entry.equals(entry));
    }

    @Test
    public void equals_givenNullOrDifferentClass_shouldReturnFalse() {
        // Arrange
        final ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");

        // Assert
        Assert.assertFalse(entry.equals(null));
        Assert.assertFalse(entry.equals("a string"));
    }

    @Test
    public void equals_givenDifferentNames_shouldReturnFalse() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file2.txt");

        // Assert
        Assert.assertFalse(entry1.equals(entry2));
    }

    @Test
    public void equals_givenDifferentAttributes_shouldReturnFalse() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        entry2.setInternalAttributes(10);

        // Assert
        Assert.assertFalse(entry1.equals(entry2));
    }

    @Test
    public void equals_givenDifferentComments_shouldReturnFalse() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        entry1.setComment("comment 1");
        entry2.setComment("comment 2");

        // Assert
        Assert.assertFalse(entry1.equals(entry2));
    }

    @Test
    public void equals_givenOneCommentNullOneEmpty_shouldReturnTrue() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        entry1.setComment(null);
        entry2.setComment("");

        // Assert
        Assert.assertTrue(entry1.equals(entry2));
    }

    @Test
    public void equals_givenDifferentGeneralPurposeBit_shouldReturnFalse() {
        // Arrange
        final ZipArchiveEntry entry1 = new ZipArchiveEntry("file.txt");
        final ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        final GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry2.setGeneralPurposeBit(gpb);

        // Assert
        Assert.assertFalse(entry1.equals(entry2));
    }
}