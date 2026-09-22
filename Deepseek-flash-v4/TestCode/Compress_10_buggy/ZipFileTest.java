package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipFileTest {

    private File tempFile;
    private ZipFile zipFile;
    private static final String TEST_ENTRY_NAME = "test.txt";
    private static final String TEST_CONTENT = "Hello, World!";

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("zipfile-test-", ".zip");
        createSimpleZipFile(tempFile);
        zipFile = new ZipFile(tempFile);
    }

    @After
    public void tearDown() throws IOException {
        if (zipFile != null) {
            zipFile.close();
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // Helper to create a simple ZIP file in memory
    private void createSimpleZipFile(File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(fos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry(TEST_ENTRY_NAME);
            zos.putArchiveEntry(entry);
            zos.write(TEST_CONTENT.getBytes("UTF-8"));
            zos.closeArchiveEntry();
        }
    }

    @Test
    public void testConstructor_withFile() throws IOException {
        try (ZipFile zf = new ZipFile(tempFile)) {
            assertNotNull(zf);
            assertEquals("UTF-8", zf.getEncoding());
            assertNotNull(zf.getEntry(TEST_ENTRY_NAME));
        }
    }

    @Test(expected = IOException.class)
    public void testConstructor_withNonExistentFile() throws IOException {
        File missing = new File(tempFile.getAbsolutePath() + "-missing");
        try (ZipFile zf = new ZipFile(missing)) {
            fail("Should have thrown IOException");
        }
    }

    @Test
    public void testGetEncoding() throws IOException {
        try (ZipFile zf = new ZipFile(tempFile, "ISO-8859-1")) {
            assertEquals("ISO-8859-1", zf.getEncoding());
        }
    }

    @Test
    public void testGetEntry_existingEntry() {
        ZipArchiveEntry entry = zipFile.getEntry(TEST_ENTRY_NAME);
        assertNotNull(entry);
        assertEquals(TEST_ENTRY_NAME, entry.getName());
    }

    @Test
    public void testGetEntry_nullName() {
        assertNull(zipFile.getEntry(null));
    }

    @Test
    public void testGetEntry_emptyName() {
        assertNull(zipFile.getEntry(""));
    }

    @Test
    public void testGetEntry_nonExistent() {
        assertNull(zipFile.getEntry("does-not-exist.txt"));
    }

    @Test
    public void testGetEntries_containsEntry() {
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        boolean found = false;
        while (entries.hasMoreElements()) {
            ZipArchiveEntry entry = entries.nextElement();
            if (TEST_ENTRY_NAME.equals(entry.getName())) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testGetEntriesInPhysicalOrder() {
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
        assertNotNull(entries);
        assertTrue(entries.hasMoreElements());
    }

    @Test
    public void testGetInputStream_storedEntry() throws IOException {
        ZipArchiveEntry entry = zipFile.getEntry(TEST_ENTRY_NAME);
        // Test entry is STORED (no compression)
        // For simplicity, we use the content from the entry
        ZipArchiveEntry storedEntry = new ZipArchiveEntry("stored.txt");
        storedEntry.setMethod(ZipArchiveEntry.STORED);
        storedEntry.setSize(TEST_CONTENT.length());
        storedEntry.setCompressedSize(TEST_CONTENT.length());
        storedEntry.setCrc(1326220836L); // CRC32 of TEST_CONTENT

        // Manually add to a new zip file for stored entry
        try (FileOutputStream fos = new FileOutputStream(tempFile);
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(fos)) {
            // Add raw entry
            byte[] content = TEST_CONTENT.getBytes("UTF-8");
            java.util.zip.CRC32 crc = new java.util.zip.CRC32();
            crc.update(content);
            storedEntry.setCrc(crc.getValue());
            storedEntry.setSize(content.length);
            storedEntry.setCompressedSize(content.length);
            storedEntry.setMethod(ZipArchiveEntry.STORED);
            zos.putArchiveEntry(storedEntry);
            zos.write(content);
            zos.closeArchiveEntry();
        }

        try (ZipFile zf = new ZipFile(tempFile);
             InputStream is = zf.getInputStream(zf.getEntry("stored.txt"))) {
            assertNotNull(is);
            byte[] buffer = new byte[128];
            int len = is.read(buffer);
            assertEquals(TEST_CONTENT.length(), len);
            assertEquals(TEST_CONTENT, new String(buffer, 0, len, "UTF-8"));
        }
    }

    @Test
    public void testGetInputStream_deflatedEntry() throws IOException {
        ZipArchiveEntry entry = zipFile.getEntry(TEST_ENTRY_NAME);
        assertNotNull(entry);
        try (InputStream is = zipFile.getInputStream(entry)) {
            assertNotNull(is);
            byte[] buffer = new byte[128];
            int len = is.read(buffer);
            assertEquals(TEST_CONTENT.length(), len);
            assertEquals(TEST_CONTENT, new String(buffer, 0, len, "UTF-8"));
        }
    }

    @Test
    public void testGetInputStream_nonexistentEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("nonexistent.txt");
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        entry.setSize(10);
        entry.setCompressedSize(10);
        assertNull(zipFile.getInputStream(entry));
    }

    @Test(expected = ZipException.class)
    public void testGetInputStream_unsupportedMethod() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("unsupported.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        entry.setSize(10);
        entry.setCompressedSize(10);
        entry.setCrc(0);
        // Manually create a custom entry with unsupported method
        byte[] content = "Test content".getBytes("UTF-8");
        try (FileOutputStream fos = new FileOutputStream(tempFile);
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(fos)) {
            java.util.zip.CRC32 crc = new java.util.zip.CRC32();
            crc.update(content);
            entry.setMethod(99); // Unsupported
            entry.setSize(content.length);
            entry.setCompressedSize(content.length);
            entry.setCrc(crc.getValue());
            zos.putArchiveEntry(entry);
            zos.write(content);
            zos.closeArchiveEntry();
        }

        try (ZipFile zf = new ZipFile(tempFile)) {
            zf.getInputStream(zf.getEntry("unsupported.txt"));
        }
    }

    @Test
    public void testCanReadEntryData_supportedEntry() {
        ZipArchiveEntry entry = zipFile.getEntry(TEST_ENTRY_NAME);
        assertTrue(zipFile.canReadEntryData(entry));
    }

    @Test
    public void testCloseQuietly() throws IOException {
        ZipFile zf = new ZipFile(tempFile);
        ZipFile.closeQuietly(zf);
        assertNotNull(zf);
        // Should not throw when closing again
        ZipFile.closeQuietly(null);
    }

    @Test
    public void testClose_multipleTimes() throws IOException {
        zipFile.close();
        zipFile.close(); // Should not throw
    }

    @Test
    public void testPositionAtCentralDirectory32() throws IOException {
        // Test by attempting to read entries (indirectly tests central dir positioning)
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        int count = 0;
        while (entries.hasMoreElements()) {
            entries.nextElement();
            count++;
        }
        assertEquals(1, count);
    }

    @Test
    public void testGetEntry_caseInsensitive() {
        ZipArchiveEntry entry = zipFile.getEntry("TEST.TXT");
        // Default is case-sensitive, should return null
        assertNull(entry);
    }

    @Test
    public void testReadEntryMetadata() {
        ZipArchiveEntry entry = zipFile.getEntry(TEST_ENTRY_NAME);
        assertNotNull(entry);
        assertEquals(TEST_CONTENT.length(), entry.getSize());
        assertTrue(entry.getCompressedSize() > 0);
        assertNotNull(entry.getComment());
        assertEquals(-1, entry.getMethod() == ZipArchiveEntry.STORED ? -1 : 0); // Just placeholder
    }

    private static class TestZipFile extends ZipFile {
        public TestZipFile(File f) throws IOException {
            super(f);
        }
    }
}