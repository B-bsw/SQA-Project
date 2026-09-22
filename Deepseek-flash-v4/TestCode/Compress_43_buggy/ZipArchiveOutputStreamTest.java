package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;

import static org.junit.Assert.*;

public class ZipArchiveOutputStreamTest {

    private ZipArchiveOutputStream zipOut;
    private ByteArrayOutputStream byteOut;

    @Before
    public void setUp() {
        byteOut = new ByteArrayOutputStream();
        zipOut = new ZipArchiveOutputStream(byteOut);
    }

    @After
    public void tearDown() throws IOException {
        if (zipOut != null) {
            zipOut.close();
        }
        byteOut.close();
    }

    @Test
    public void testConstructorWithOutputStream() {
        assertNotNull(zipOut);
        assertTrue(zipOut.isSeekable());
        assertEquals("", zipOut.getComment());
    }

    @Test
    public void testConstructorWithFile() throws IOException {
        File tempFile = File.createTempFile("test", ".zip");
        tempFile.deleteOnExit();
        ZipArchiveOutputStream fileOut = new ZipArchiveOutputStream(tempFile);
        assertNotNull(fileOut);
        fileOut.close();
    }

    @Test(expected = IOException.class)
    public void testConstructorWithNullFile() throws IOException {
        new ZipArchiveOutputStream((File) null);
    }

    @Test
    public void testSetComment() {
        zipOut.setComment("Test Comment");
        assertEquals("Test Comment", zipOut.getComment());
    }

    @Test
    public void testSetCommentNull() {
        zipOut.setComment(null);
        assertEquals("", zipOut.getComment());
    }

    @Test
    public void testSetMethodValid() {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        assertEquals(ZipArchiveOutputStream.STORED, zipOut.getMethod());
    }

    @Test
    public void testSetMethodDefault() {
        zipOut.setMethod(ZipArchiveOutputStream.DEFLATED);
        assertEquals(ZipArchiveOutputStream.DEFLATED, zipOut.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodInvalid() {
        zipOut.setMethod(999);
    }

    @Test
    public void testSetLevelValid() {
        zipOut.setLevel(5);
        // No direct getter, but no exception means ok
    }

    @Test
    public void testSetLevelBoundaryLow() {
        zipOut.setLevel(java.util.zip.Deflater.DEFAULT_COMPRESSION);
    }

    @Test
    public void testSetLevelBoundaryHigh() {
        zipOut.setLevel(java.util.zip.Deflater.BEST_COMPRESSION);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooLow() {
        zipOut.setLevel(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooHigh() {
        zipOut.setLevel(10);
    }

    @Test
    public void testPutArchiveEntryAndCloseEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("Hello World".getBytes());
        zipOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryStoredMethod() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.bin");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        entry.setCrc(10);
        entry.setCompressedSize(5);
        zipOut.putArchiveEntry(entry);
        zipOut.write(new byte[]{1, 2, 3, 4, 5});
        zipOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithMissingCrc() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.bin");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        entry.setCompressedSize(5);
        try {
            zipOut.putArchiveEntry(entry);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // Expected
        }
    }

    @Test
    public void testWriteAndFinish() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        byte[] data = "Test data".getBytes();
        zipOut.write(data, 0, data.length);
        zipOut.closeArchiveEntry();
        zipOut.finish();
        assertTrue(byteOut.size() > 0);
    }

    @Test
    public void testWriteEmptyEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("empty.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteWithOffsetAndLength() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        byte[] data = "Partial write test".getBytes();
        zipOut.write(data, 7, 5);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteNullByteArray() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        try {
            zipOut.write(null, 0, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testWriteNegativeOffset() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        try {
            zipOut.write(new byte[5], -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testWriteNegativeLength() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        try {
            zipOut.write(new byte[5], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testFlush() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("Data".getBytes());
        zipOut.flush();
        zipOut.closeArchiveEntry();
    }

    @Test
    public void testCloseOnUnfinishedEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("Data".getBytes());
        zipOut.close();
        zipOut = null;
    }

    @Test
    public void testFinishTwice() throws IOException {
        zipOut.finish();
        try {
            zipOut.finish();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testCloseArchiveEntryWithoutEntry() throws IOException {
        try {
            zipOut.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testCanWriteEntryDataWithNull() {
        assertFalse(zipOut.canWriteEntryData(null));
    }

    @Test
    public void testCanWriteEntryDataDeflated() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        assertTrue(zipOut.canWriteEntryData(entry));
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();
        Files.write(tempFile.toPath(), "Content".getBytes());
        ZipArchiveEntry entry = (ZipArchiveEntry) zipOut.createArchiveEntry(tempFile, "dir/test.txt");
        assertNotNull(entry);
        assertEquals("dir/test.txt", entry.getName());
        assertEquals(7, entry.getSize());
    }

    @Test
    public void testSetUseZip64Always() {
        zipOut.setUseZip64(Zip64Mode.Always);
        zipOut.setUseZip64(Zip64Mode.Never);
        zipOut.setUseZip64(Zip64Mode.AsNeeded);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        zipOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zipOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
        zipOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
    }

    @Test
    public void testSetFallbackToUTF8() {
        zipOut.setFallbackToUTF8(true);
        zipOut.setFallbackToUTF8(false);
    }

    @Test
    public void testSetUseLanguageEncodingFlag() {
        zipOut.setUseLanguageEncodingFlag(true);
        zipOut.setUseLanguageEncodingFlag(false);
    }

    @Test
    public void testAddRawArchiveEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("raw.bin");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        entry.setCrc(10);
        entry.setCompressedSize(5);
        
        zipOut.putArchiveEntry(entry);
        byte[] rawData = new byte[]{1, 2, 3, 4, 5};
        zipOut.addRawArchiveEntry(entry, new ByteArrayInputStream(rawData));
        zipOut.closeArchiveEntry();
    }

    @Test
    public void testSetEncoding() {
        zipOut.setEncoding("UTF-8");
        assertEquals("UTF-8", zipOut.getEncoding());
    }

    @Test
    public void testSetEncodingNull() {
        zipOut.setEncoding(null);
        assertNotNull(zipOut.getEncoding());
    }

    @Test
    public void testMultipleEntries() throws IOException {
        for (int i = 0; i < 3; i++) {
            ZipArchiveEntry entry = new ZipArchiveEntry("file" + i + ".txt");
            zipOut.putArchiveEntry(entry);
            byte[] data = ("Content " + i).getBytes();
            zipOut.write(data, 0, data.length);
            zipOut.closeArchiveEntry();
        }
        zipOut.finish();
    }
}