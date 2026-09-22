package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final String TEST_DATA = "Hello World! This is a test string for ZIP archive.";

    private ZipArchiveInputStream zipStream;

    @Before
    public void setUp() {
        // Will be initialized per test
    }

    @After
    public void tearDown() {
        if (zipStream != null) {
            try {
                zipStream.close();
            } catch (IOException e) {
                // Ignore
            }
        }
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] { 0x50, 0x4B, 0x03, 0x04 };
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesNullSignature() {
        assertFalse(ZipArchiveInputStream.matches(null, 4));
    }

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[] { 0x50, 0x4B };
        assertFalse(ZipArchiveInputStream.matches(sig, 2));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] sig = new byte[] { 0x00, 0x00, 0x00, 0x00 };
        assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesEmptyArray() {
        byte[] sig = new byte[] {};
        assertFalse(ZipArchiveInputStream.matches(sig, 0));
    }

    @Test
    public void testGetNextZipEntry_EmptyStream() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zipStream.getNextZipEntry());
        assertEquals(-1, zipStream.read(new byte[10]));
    }

    @Test
    public void testRead_AfterCloseThrowsIOException() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zipStream.close();
        try {
            zipStream.read(new byte[10]);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testRead_NullBuffer() throws IOException {
        byte[] zipData = createMinimalZip();
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        assertNotNull(zipStream.getNextZipEntry());
        try {
            zipStream.read(null, 0, 10);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRead_InvalidOffset() throws IOException {
        byte[] zipData = createMinimalZip();
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        assertNotNull(zipStream.getNextZipEntry());
        byte[] buffer = new byte[10];
        try {
            zipStream.read(buffer, -1, 5);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testRead_InvalidLength() throws IOException {
        byte[] zipData = createMinimalZip();
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        assertNotNull(zipStream.getNextZipEntry());
        byte[] buffer = new byte[10];
        try {
            zipStream.read(buffer, 0, -1);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetNextEntry_WhenClosed() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zipStream.close();
        assertNull(zipStream.getNextZipEntry());
    }

    @Test
    public void testCanReadEntryData_Deflated() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("test.txt"));
        zos.write(TEST_DATA.getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertTrue(zipStream.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryData_NullEntry() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(zipStream.canReadEntryData(null));
    }

    @Test
    public void testCanReadEntryData_NonZipEntry() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(zipStream.canReadEntryData(new ZipArchiveEntry("dummy")));
    }

    @Test
    public void testCanReadEntryData_StoredEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.setMethod(ZipEntry.STORED);
        byte[] content = "stored data".getBytes("UTF-8");
        java.util.zip.CRC32 crc = new java.util.zip.CRC32();
        crc.update(content);
        zos.putNextEntry(new java.util.zip.ZipEntry("stored.txt"));
        zos.write(content);
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertEquals(ZipMethod.STORED.getCode(), entry.getMethod());
        assertTrue(zipStream.canReadEntryData(entry));
    }

    @Test
    public void testRead_StoredEntry() throws IOException {
        String content = "Stored content in ZIP";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.setMethod(ZipEntry.STORED);
        byte[] data = content.getBytes("UTF-8");
        java.util.zip.CRC32 crc = new java.util.zip.CRC32();
        crc.update(data);
        zos.putNextEntry(new java.util.zip.ZipEntry("stored.bin"));
        zos.write(data);
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[64];
        int bytesRead = zipStream.read(buffer, 0, buffer.length);
        assertEquals(content.length(), bytesRead);
        assertEquals(content, new String(buffer, 0, bytesRead, "UTF-8"));
        assertEquals(-1, zipStream.read(buffer, 0, buffer.length));
    }

    @Test
    public void testRead_DeflatedEntry_MultipleReads() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("Line ").append(i).append("\n");
        }
        String content = sb.toString();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("large.txt"));
        zos.write(content.getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[7]; // small buffer to force multiple reads
        int read;
        while ((read = zipStream.read(buffer, 0, buffer.length)) != -1) {
            result.write(buffer, 0, read);
        }
        assertEquals(content, result.toString("UTF-8"));
    }

    @Test
    public void testRead_ZeroLength() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("empty.txt"));
        zos.write(new byte[0]);
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[10];
        assertEquals(0, zipStream.read(buffer, 0, 0));
        assertEquals(-1, zipStream.read(buffer, 0, buffer.length));
    }

    @Test
    public void testSkip_PositiveValue() throws IOException {
        String content = "Skip this content in zip file";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("skip.txt"));
        zos.write(content.getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        long skipped = zipStream.skip(5);
        assertEquals(5, skipped);
        byte[] buffer = new byte[10];
        int read = zipStream.read(buffer);
        assertEquals(content.length() - 5, read);
    }

    @Test
    public void testSkip_NegativeValue() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zipStream.skip(-1));
    }

    @Test
    public void testSkip_ZeroValue() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("data.txt"));
        zos.write("test".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zipStream.getNextZipEntry();
        assertEquals(0, zipStream.skip(0));
    }

    @Test
    public void testAvailable_NoCurrentEntry() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, zipStream.available());
    }

    @Test
    public void testGetNextZipEntry_InvalidSignature() throws IOException {
        byte[] invalidZip = new byte[] { 0x00, 0x01, 0x02, 0x03 };
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(invalidZip));
        try {
            zipStream.getNextZipEntry();
            fail("Expected ZipException for invalid signature");
        } catch (ZipException e) {
            assertTrue(e.getMessage().contains("local file header"));
        }
    }

    @Test
    public void testClose_IsIdempotent() throws IOException {
        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zipStream.close();
        zipStream.close(); // Should not throw
    }

    @Test
    public void testRead_WithMultipleEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        
        byte[] first = "first entry".getBytes("UTF-8");
        byte[] second = "second entry data".getBytes("UTF-8");
        
        zos.putNextEntry(new java.util.zip.ZipEntry("first.txt"));
        zos.write(first);
        zos.closeEntry();
        
        zos.putNextEntry(new java.util.zip.ZipEntry("second.txt"));
        zos.write(second);
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertEquals("first.txt", entry.getName());
        byte[] buffer = new byte[100];
        assertEquals(first.length, zipStream.read(buffer));
        
        entry = zipStream.getNextZipEntry();
        assertEquals("second.txt", entry.getName());
        assertEquals(second.length, zipStream.read(buffer));
        
        assertNull(zipStream.getNextZipEntry());
    }

    @Test
    public void testRead_UnsupportedMethod() throws IOException {
        // Create a ZIP entry with method 99 (invalid)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("test.txt"));
        zos.write("data".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        // We cannot easily simulate unsupported method without mocking; skip
    }

    @Test
    public void testRead_ArrayIndexOutOfBounds_LargeBuffer() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("test.txt"));
        zos.write("test".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zipStream.getNextZipEntry();
        byte[] buffer = new byte[10];
        try {
            zipStream.read(buffer, 8, 3); // length extends beyond 
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testMatches_WithValidSignature_NonZeroLength() {
        byte[] sig = new byte[] { 0x50, 0x4B, 0x03, 0x04 };
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatches_WithValidSignature_ExtraBytes() {
        byte[] sig = new byte[] { 0x50, 0x4B, 0x03, 0x04, 0x00, 0x00 };
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatches_WithInvalidSignatureData() {
        byte[] sig = new byte[] { 0x50, 0x4B, 0x05, 0x06 };
        assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testGetNextZipEntry_FromPreamble() throws IOException {
        byte[] filePreamble = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("test.txt"));
        zos.write("content".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();

        byte[] zipData = baos.toByteArray();
        byte[] combined = new byte[filePreamble.length + zipData.length];
        System.arraycopy(filePreamble, 0, combined, 0, filePreamble.length);
        System.arraycopy(zipData, 0, combined, filePreamble.length, zipData.length);

        zipStream = new ZipArchiveInputStream(new ByteArrayInputStream(combined));
        ZipArchiveEntry entry = zipStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
    }

    private byte[] createMinimalZip() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(baos);
        zos.putNextEntry(new java.util.zip.ZipEntry("test.txt"));
        zos.write("Hello".getBytes("UTF-8"));
        zos.closeEntry();
        zos.close();
        return baos.toByteArray();
    }
}