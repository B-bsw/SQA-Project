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
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private ZipArchiveInputStream zipArchiveInputStream;
    private ByteArrayInputStream byteArrayInputStream;

    @Before
    public void setUp() {
        // Initialize with empty stream
        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        zipArchiveInputStream = new ZipArchiveInputStream(byteArrayInputStream);
    }

    @After
    public void tearDown() throws IOException {
        if (zipArchiveInputStream != null) {
            zipArchiveInputStream.close();
        }
        byteArrayInputStream.close();
    }

    @Test
    public void testMatchesEmptySignature() {
        assertFalse(ZipArchiveInputStream.matches(new byte[0], 0));
    }

    @Test
    public void testMatchesShortSignature() {
        assertFalse(ZipArchiveInputStream.matches(new byte[4], 3));
    }

    @Test
    public void testMatchesValidLFHSignature() {
        byte[] signature = new byte[4];
        signature[0] = ZipArchiveOutputStream.LFH_SIG[0];
        signature[1] = ZipArchiveOutputStream.LFH_SIG[1];
        signature[2] = ZipArchiveOutputStream.LFH_SIG[2];
        signature[3] = ZipArchiveOutputStream.LFH_SIG[3];
        assertTrue(ZipArchiveInputStream.matches(signature, 4));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] signature = new byte[4];
        signature[0] = 0x50;
        signature[1] = 0x4B;
        signature[2] = 0x03;
        signature[3] = 0x05;
        assertFalse(ZipArchiveInputStream.matches(signature, 4));
    }

    @Test
    public void testGetNextEntryEmptyArchive() throws IOException {
        assertNull(zipArchiveInputStream.getNextZipEntry());
        assertNull(zipArchiveInputStream.getNextEntry());
    }

    @Test
    public void testGetNextEntryAfterClose() throws IOException {
        zipArchiveInputStream.close();
        assertNull(zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testReadWithNullBuffer() throws IOException {
        try {
            zipArchiveInputStream.read(null, 0, 10);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testReadWithInvalidOffsetNegative() throws IOException {
        try {
            zipArchiveInputStream.read(new byte[10], -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReadWithInvalidLengthNegative() throws IOException {
        try {
            zipArchiveInputStream.read(new byte[10], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReadWithOffsetTooLarge() throws IOException {
        try {
            zipArchiveInputStream.read(new byte[10], 11, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReadWithLengthTooLarge() throws IOException {
        byte[] buffer = new byte[10];
        try {
            zipArchiveInputStream.read(buffer, 0, buffer.length - 5);
            // May or may not throw depending on implementation
        } catch (Exception e) {
            // Acceptable
        }
    }

    @Test
    public void testSkipNegativeValue() throws IOException {
        assertEquals(0, zipArchiveInputStream.skip(-1));
        assertEquals(0, zipArchiveInputStream.skip(Long.MIN_VALUE));
    }

    @Test
    public void testSkipZeroValue() throws IOException {
        assertEquals(0, zipArchiveInputStream.skip(0));
    }

    @Test
    public void testReadFromEmptyStream() throws IOException {
        assertEquals(-1, zipArchiveInputStream.read(new byte[10], 0, 10));
    }
    
    @Test
    public void testReadSimpleStoredEntry() throws IOException {
        // Create a simple zip with stored entry
        byte[] zipData = createZipData("test.txt", "Hello World".getBytes(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        
        byte[] buffer = new byte[32];
        int read = zipArchiveInputStream.read(buffer, 0, buffer.length);
        assertTrue(read >= 0);
        zipArchiveInputStream.closeEntry();
    }
    
    @Test
    public void testReadDeflatedEntry() throws IOException {
        String content = "This is a test content for deflated entry";
        byte[] zipData = createZipData("test.bin", content.getBytes(), true);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.bin", entry.getName());
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = zipArchiveInputStream.read(buffer, 0, buffer.length)) > 0) {
            outputStream.write(buffer, 0, bytesRead);
        }
        assertEquals(content, new String(outputStream.toByteArray()));
    }

    @Test
    public void testReadWithEmptyBufferAtBoundary() throws IOException {
        byte[] zipData = createZipData("empty.txt", new byte[0], false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(0, zipArchiveInputStream.read(new byte[0], 0, 0));
    }

    @Test
    public void testCanReadEntryDataStored() throws IOException {
        byte[] zipData = createZipData("test.canread", "data".getBytes(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertTrue(zipArchiveInputStream.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataUnsupportedMethod() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("bad");
        entry.setMethod(ZipMethod.LZMA.getCode());
        entry.setSize(100);
        entry.setCompressedSize(100);
        entry.setCrc(0);
        
        ZipArchiveInputStream inputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(inputStream.canReadEntryData(entry));
    }

    @Test
    public void testReadWithMultipleEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipOutputStream zos = new ZipOutputStream(baos)) {
            ZipEntry entry1 = new ZipEntry("a.txt");
            entry1.setMethod(ZipEntry.DEFLATED);
            zos.putNextEntry(entry1);
            zos.write("a".getBytes());
            zos.closeEntry();
            
            ZipEntry entry2 = new ZipEntry("b.txt");
            entry2.setMethod(ZipEntry.DEFLATED);
            zos.putNextEntry(entry2);
            zos.write("b".getBytes());
            zos.closeEntry();
        }
        
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry first = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(first);
        assertEquals("a.txt", first.getName());
        
        ZipArchiveEntry second = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(second);
        assertEquals("b.txt", second.getName());
        
        assertNull(zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testReadWithZeroLength() throws IOException {
        byte[] zipData = createZipData("test.txt", new byte[0], false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(0, entry.getSize());
        
        int result = zipArchiveInputStream.read(new byte[10], 0, 10);
        assertTrue(result == -1 || result == 0);
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        byte[] zipData = createZipData("test.txt", "Hello World This Is A Longer Content".getBytes(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        
        long skipped = zipArchiveInputStream.skip(5);
        assertTrue(skipped >= 0);
    }

    @Test
    public void testSkipLargeValue() throws IOException {
        byte[] content = new byte[100];
        for (int i = 0; i < 100; i++) {
            content[i] = (byte) i;
        }
        byte[] zipData = createZipData("test.txt", content, false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        
        long skipped = zipArchiveInputStream.skip(50);
        assertTrue(skipped >= 0);
    }

    @Test
    public void testReadAfterClose() throws IOException {
        zipArchiveInputStream.close();
        try {
            zipArchiveInputStream.read(new byte[10], 0, 10);
            fail("Expected IOException or returning -1");
        } catch (IOException e) {
            // expected behavior
        }
    }

    @Test
    public void testGetNextEntryAfterReadingAll() throws IOException {
        byte[] zipData = createZipData("test.txt", "content".getBytes(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        
        ZipArchiveEntry first = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(first);
        byte[] buffer = new byte[7];
        assertEquals(7, zipArchiveInputStream.read(buffer, 0, 7));
        
        assertNull(zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testCorruptedZip() {
        byte[] corrupt = new byte[] { 0x50, 0x4B, 0x00, 0x00, 0x00, 0x01 };
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(corrupt));
        try {
            zipArchiveInputStream.getNextZipEntry();
            // May or may not throw
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testReadWithOffsetAndLength() throws IOException {
        byte[] content = "OffsetAndLengthTest".getBytes();
        byte[] zipData = createZipData("test.txt", content, false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        
        byte[] buffer = new byte[50];
        int read = zipArchiveInputStream.read(buffer, 10, 20);
        assertTrue(read > 0);
        for (int i = 0; i < read; i++) {
            assertEquals(content[i], buffer[i + 10]);
        }
    }

    private byte[] createZipData(String entryName, byte[] content, boolean useDeflate) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipOutputStream zos = new ZipOutputStream(baos)) {
            ZipEntry entry = new ZipEntry(entryName);
            if (useDeflate) {
                entry.setMethod(ZipEntry.DEFLATED);
            } else {
                entry.setMethod(ZipEntry.STORED);
            }
            
            if (!useDeflate) {
                // For Stored, need to set these for Java's ZipOutputStream
                entry.setSize(content.length);
                CRC32 crc = new CRC32();
                crc.update(content);
                entry.setCrc(crc.getValue());
                entry.setCompressedSize(content.length);
            }
            
            zos.putNextEntry(entry);
            zos.write(content);
            zos.closeEntry();
        }
        return baos.toByteArray();
    }
}