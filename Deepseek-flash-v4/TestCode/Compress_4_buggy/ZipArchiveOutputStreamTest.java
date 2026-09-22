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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveOutputStreamTest {

    private ByteArrayOutputStream byteArrayOutputStream;
    private ZipArchiveOutputStream zipOut;
    private File tempFile;

    @Before
    public void setUp() throws Exception {
        byteArrayOutputStream = new ByteArrayOutputStream();
        zipOut = new ZipArchiveOutputStream(byteArrayOutputStream);
    }

    @After
    public void tearDown() throws Exception {
        if (zipOut != null) {
            try {
                zipOut.close();
            } catch (IOException e) {
                // ignore
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testConstructOutputStream() {
        assertNotNull(zipOut);
        assertFalse(zipOut.isSeekable());
    }

    @Test
    public void testConstructFileAndSeekable() throws Exception {
        tempFile = File.createTempFile("testZipOutput", ".zip");
        try (ZipArchiveOutputStream fileZipOut = new ZipArchiveOutputStream(tempFile)) {
            assertNotNull(fileZipOut);
            assertTrue(fileZipOut.isSeekable());
        }
    }

    @Test
    public void testSetAndGetEncoding() {
        assertEquals(ZipEncodingHelper.UTF8, zipOut.getEncoding());
        zipOut.setEncoding("Cp437");
        assertEquals("Cp437", zipOut.getEncoding());
    }

    @Test
    public void testSetLevelInvalid() {
        try {
            zipOut.setLevel(Deflater.DEFLATED - 1);
            fail("Expected IllegalArgumentException for too low level");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            zipOut.setLevel(Deflater.BEST_COMPRESSION + 1);
            fail("Expected IllegalArgumentException for too high level");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetLevelValid() {
        zipOut.setLevel(Deflater.BEST_COMPRESSION);
        // no exception expected
        zipOut.setLevel(Deflater.DEFAULT_COMPRESSION);
    }

    @Test
    public void testSetMethodValid() {
        zipOut.setMethod(ZipArchiveOutputStream.DEFLATED);
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        // no exception expected
    }

    @Test
    public void testPutArchiveEntryStoredNoSeekableNoSize() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setCrc(0);
        try {
            zipOut.putArchiveEntry(entry);
            byte[] data = new byte[0];
            zipOut.write(data);
            zipOut.closeArchiveEntry();
            zipOut.finish();
        } catch (ZipException e) {
            fail("Unexpected ZipException: " + e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryStoredNoSeekableMissingSize() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(-1);
        entry.setCrc(0);
        try {
            zipOut.putArchiveEntry(entry);
            fail("Expected ZipException for missing size");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryStoredNoSeekableMissingCrc() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setCrc(-1);
        try {
            zipOut.putArchiveEntry(entry);
            fail("Expected ZipException for missing crc");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryDeflated() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("Hello World".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
        assertTrue(zipOut.getBytesWritten() > 0);
    }

    @Test
    public void testSimpleZipRoundTrip() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        byte[] content = "Hello, World!".getBytes("UTF-8");
        zipOut.write(content);
        zipOut.closeArchiveEntry();
        zipOut.finish();
        assertTrue(zipOut.getBytesWritten() > content.length);
    }

    @Test
    public void testWriteMultipleEntriesAndClose() throws Exception {
        for (int i = 0; i < 3; i++) {
            ZipArchiveEntry entry = new ZipArchiveEntry("file" + i + ".txt");
            zipOut.putArchiveEntry(entry);
            zipOut.write(("content" + i).getBytes("UTF-8"));
            zipOut.closeArchiveEntry();
        }
        zipOut.finish();
        assertTrue(zipOut.getBytesWritten() > 0);
    }

    @Test
    public void testWriteWithInvalidMethod() throws Exception {
        zipOut.setMethod(999);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setCrc(0);
        zipOut.putArchiveEntry(entry);
        zipOut.write(new byte[0]);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteStoredAndCheckCRC() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        byte[] content = "This is a stored test".getBytes("UTF-8");
        CRC32 crc = new CRC32();
        crc.update(content);
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setSize(content.length);
        entry.setCrc(crc.getValue());
        zipOut.putArchiveEntry(entry);
        zipOut.write(content);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteStoredWithBadCRC() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        byte[] content = "This is stored".getBytes("UTF-8");
        CRC32 crc = new CRC32();
        crc.update("wrong".getBytes());
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setSize(content.length);
        entry.setCrc(crc.getValue());
        zipOut.putArchiveEntry(entry);
        zipOut.write(content);
        try {
            zipOut.closeArchiveEntry();
            fail("Expected ZipException for bad CRC");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testWriteStoredWithBadSize() throws Exception {
        zipOut.setMethod(ZipArchiveOutputStream.STORED);
        byte[] content = "This is stored".getBytes("UTF-8");
        CRC32 crc = new CRC32();
        crc.update(content);
        ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
        entry.setSize(content.length + 10);
        entry.setCrc(crc.getValue());
        zipOut.putArchiveEntry(entry);
        zipOut.write(content);
        try {
            zipOut.closeArchiveEntry();
            fail("Expected ZipException for bad size");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testLargeWriteMultipleBlocks() throws Exception {
        byte[] largeData = new byte[20000];
        new Random(123).nextBytes(largeData);
        ZipArchiveEntry entry = new ZipArchiveEntry("large.bin");
        zipOut.putArchiveEntry(entry);
        zipOut.write(largeData, 0, largeData.length);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testCloseWithoutFinish() throws Exception {
        zipOut.closeArchiveEntry();
        zipOut.close();
        // no exception expected
    }

    @Test
    public void testFlush() throws Exception {
        zipOut.flush();
        // no exception
    }

    @Test
    public void testFinishWithUnclosedEntry() throws Exception {
        zipOut.putArchiveEntry(new ZipArchiveEntry("unclosed.txt"));
        try {
            zipOut.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testWriteDataDescriptorForSeekable() throws Exception {
        tempFile = File.createTempFile("zipSeekable", ".zip");
        try (ZipArchiveOutputStream seekableZip = new ZipArchiveOutputStream(tempFile)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            seekableZip.putArchiveEntry(entry);
            String content = "Some data for seekable output";
            seekableZip.write(content.getBytes("UTF-8"));
            seekableZip.closeArchiveEntry();
            seekableZip.finish();
        }
    }

    @Test
    public void testSetLevelAffectsNextEntry() throws Exception {
        zipOut.setLevel(9);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("compress me".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testSetCommentLength() throws Exception {
        zipOut.setComment("This is a comment");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testSetCommentEmpty() throws Exception {
        zipOut.setComment("");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testSetCommentLongEncoding() throws Exception {
        zipOut.setComment("A very long comment that may require encoding handling in the central directory. This comment is intentionally verbose to ensure that the code path for writing the comment data is covered and any potential issues with encoding or length calculations are exposed during testing. Adding more characters to make this comment even longer.");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testFallbackToUTF8WhenNameNotEncodable() throws Exception {
        zipOut.setEncoding("Cp437");
        zipOut.setFallbackToUTF8(true);
        String nonEncodableName = "non-encodable-é";
        ZipArchiveEntry entry = new ZipArchiveEntry(nonEncodableName);
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testUnicodeExtraFieldAlways() throws Exception {
        zipOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        String name = "unicode-name-\u00e9";
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testUnicodeExtraFieldNotEncodable() throws Exception {
        zipOut.setEncoding("Cp437");
        zipOut.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        String name = "not-encodable-\u00e9";
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testUseLanguageEncodingFlag() throws Exception {
        zipOut.setUseLanguageEncodingFlag(true);
        zipOut.setEncoding("UTF-8");
        zipOut.setUseLanguageEncodingFlag(false);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zipOut.putArchiveEntry(entry);
        zipOut.write("data".getBytes("UTF-8"));
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testCreateArchiveEntry() {
        tempFile = new File("testEntry.txt");
        ArchiveEntry entry = zipOut.createArchiveEntry(tempFile, "entryName");
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
    }

    @Test
    public void testWriteWithZeroLength() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("zero.bin");
        zipOut.putArchiveEntry(entry);
        zipOut.write(new byte[0], 0, 0);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteWithLengthExactlyBlockSize() throws Exception {
        int blockSize = 8192;
        byte[] data = new byte[blockSize];
        ZipArchiveEntry entry = new ZipArchiveEntry("block.bin");
        zipOut.putArchiveEntry(entry);
        zipOut.write(data, 0, blockSize);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }

    @Test
    public void testWriteWithLengthMultipleBlockSize() throws Exception {
        int blockSize = 8192;
        byte[] data = new byte[blockSize * 2];
        ZipArchiveEntry entry = new ZipArchiveEntry("multiple.bin");
        zipOut.putArchiveEntry(entry);
        zipOut.write(data, 0, data.length);
        zipOut.closeArchiveEntry();
        zipOut.finish();
    }
}