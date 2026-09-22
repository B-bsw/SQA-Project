package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private File tempFile;
    private File tempDir;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("test_entry_", ".tmp");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(new byte[] { 1, 2, 3, 4, 5 });
        fos.close();

        File baseDir = tempFile.getParentFile();
        tempDir = new File(baseDir, "test_dir_" + System.currentTimeMillis());
        if (!tempDir.mkdir()) {
            throw new IOException("Failed to create temporary directory: " + tempDir.getAbsolutePath());
        }
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
        if (tempDir != null && tempDir.exists()) {
            tempDir.delete();
        }
    }

    @Test
    public void constructor_givenStringName_shouldInitializeProperly() {
        // Arrange & Act
        ZipArchiveEntry entry = new ZipArchiveEntry("test/file.txt");

        // Assert
        Assert.assertEquals("test/file.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertEquals(-1, entry.getSize());
        Assert.assertEquals(0, entry.getInternalAttributes());
        Assert.assertEquals(0, entry.getExternalAttributes());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        Assert.assertNotNull(entry.getGeneralPurposeBit());
        Assert.assertNull(entry.getRawName());
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldInitializeWithEmptyName() {
        // Arrange & Act
        ZipArchiveEntry entry = new ZipArchiveEntry();

        // Assert
        Assert.assertEquals("", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenJavaZipEntryWithoutExtra_shouldCopyBasicFields() throws ZipException {
        // Arrange
        ZipEntry stdEntry = new ZipEntry("entry.bin");
        stdEntry.setMethod(ZipEntry.DEFLATED);
        stdEntry.setSize(1024L);
        stdEntry.setTime(12345678000L);

        // Act
        ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        // Assert
        Assert.assertEquals("entry.bin", entry.getName());
        Assert.assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        Assert.assertEquals(1024L, entry.getSize());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void constructor_givenJavaZipEntryWithExtra_shouldParseExtraFields() throws ZipException {
        // Arrange
        ZipEntry stdEntry = new ZipEntry("entry_with_extra.bin");
        byte[] extraData = new byte[] {
            1, 0, // Header ID: 0x0001
            2, 0, // Data size: 2
            0x0A, 0x0B
        };
        stdEntry.setExtra(extraData);
        stdEntry.setMethod(ZipEntry.STORED);
        stdEntry.setSize(200L);

        // Act
        ZipArchiveEntry entry = new ZipArchiveEntry(stdEntry);

        // Assert
        Assert.assertEquals("entry_with_extra.bin", entry.getName());
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
        Assert.assertEquals(200L, entry.getSize());
        Assert.assertEquals(1, entry.getExtraFields().length);
        Assert.assertNotNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void constructor_givenZipArchiveEntry_shouldCopyAllProperties() throws ZipException {
        // Arrange
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setInternalAttributes(12);
        original.setExternalAttributes(0x81A40000L);
        original.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        original.setMethod(ZipEntry.DEFLATED);
        original.setSize(500L);
        DummyExtraField field = new DummyExtraField(new ZipShort(0x1234), new byte[] { 1 }, new byte[] { 2 });
        original.addExtraField(field);

        // Act
        ZipArchiveEntry copy = new ZipArchiveEntry(original);

        // Assert
        Assert.assertEquals("original.txt", copy.getName());
        Assert.assertEquals(12, copy.getInternalAttributes());
        Assert.assertEquals(0x81A40000L, copy.getExternalAttributes());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, copy.getPlatform());
        Assert.assertEquals(ZipEntry.DEFLATED, copy.getMethod());
        Assert.assertEquals(500L, copy.getSize());
        Assert.assertEquals(1, copy.getExtraFields().length);
        Assert.assertNotNull(copy.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void constructor_givenFileAndName_shouldSetSizeAndTimeForRegularFile() {
        // Arrange & Act
        ZipArchiveEntry entry = new ZipArchiveEntry(tempFile, "custom/file.txt");

        // Assert
        Assert.assertEquals("custom/file.txt", entry.getName());
        Assert.assertEquals(5L, entry.getSize());
        Assert.assertEquals(tempFile.lastModified(), entry.getTime());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenDirectoryFileWithoutSlash_shouldAppendTrailingSlash() {
        // Arrange & Act
        ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "custom_dir");

        // Assert
        Assert.assertEquals("custom_dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
        Assert.assertEquals(tempDir.lastModified(), entry.getTime());
    }

    @Test
    public void constructor_givenDirectoryFileWithSlash_shouldKeepTrailingSlash() {
        // Arrange & Act
        ZipArchiveEntry entry = new ZipArchiveEntry(tempDir, "custom_dir/");

        // Assert
        Assert.assertEquals("custom_dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void clone_givenPopulatedEntry_shouldCreateEqualClone() {
        // Arrange
        ZipArchiveEntry entry = new ZipArchiveEntry("clone_target.txt");
        entry.setInternalAttributes(42);
        entry.setExternalAttributes(12345L);
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(100L);
        entry.setTime(999999000L);
        entry.setComment("test comment");
        DummyExtraField field = new DummyExtraField(new ZipShort(0xA1), new byte[] { 9 }, new byte[] { 9 });
        entry.addExtraField(field);

        // Act
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();

        // Assert
        Assert.assertNotSame(entry, cloned);
        Assert.assertEquals(entry, cloned);
        Assert.assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertEquals(entry.getExternalAttributes