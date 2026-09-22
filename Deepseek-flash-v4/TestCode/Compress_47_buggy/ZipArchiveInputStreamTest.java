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
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private ZipArchiveInputStream zipInputStream;
    private ByteArrayOutputStream baos;
    private ByteArrayInputStream bais;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() throws IOException {
        if (zipInputStream != null) {
            zipInputStream.close();
        }
        baos.close();
        if (bais != null) {
            bais.close();
        }
    }

    @Test
    public void testConstructorWithNullInputStream() {
        try {
            zipInputStream = new ZipArchiveInputStream((InputStream) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNextZipEntryWithEmptyStream() throws IOException {
        bais = new ByteArrayInputStream(new byte[0]);
        zipInputStream = new ZipArchiveInputStream(bais);
        assertNull(zipInputStream.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWithSingleStoredEntry() throws IOException {
        writeZipWithStoredEntry("test.txt", "Hello World".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        
        ZipArchiveEntry entry = zipInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipMethod.STORED.getCode(), entry.getMethod());
        
        byte[] content = new byte[11];
        int read = zipInputStream.read(content);
        assertEquals(11, read);
        assertArrayEquals("Hello World".getBytes(), content);
        
        assertNull(zipInputStream.getNextZipEntry());
        assertEquals(-1, zipInputStream.read(content));
    }

    @Test
    public void testGetNextZipEntryWithSingleDeflatedEntry() throws IOException {
        writeZipWithDeflatedEntry("deflated.txt", "Compressed content".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        
        ZipArchiveEntry entry = zipInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("deflated.txt", entry.getName());
        assertEquals(ZipMethod.DEFLATED.getCode(), entry.getMethod());
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int read;
        while ((read = zipInputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, read);
        }
        assertArrayEquals("Compressed content".getBytes(), bos.toByteArray());
    }

    @Test
    public void testGetNextZipEntryWithMultipleEntries() throws IOException {
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            zos.putArchiveEntry(new ZipArchiveEntry("first.txt"));
            zos.write("First file".getBytes());
            zos.closeArchiveEntry();
            
            zos.putArchiveEntry(new ZipArchiveEntry("second.dat"));
            zos.write("Second content".getBytes());
            zos.closeArchiveEntry();
        }
        
        bais = new ByteArrayInputStream(baos.toByteArray());
        zipInputStream = new ZipArchiveInputStream(bais);
        
        ZipArchiveEntry entry1 = zipInputStream.getNextZipEntry();
        assertNotNull(entry1);
        assertEquals("first.txt", entry1.getName());
        
        byte[] firstContent = new byte[10];
        assertEquals(10, zipInputStream.read(firstContent));
        assertArrayEquals("First file".getBytes(), firstContent);
        
        ZipArchiveEntry entry2 = zipInputStream.getNextZipEntry();
        assertNotNull(entry2);
        assertEquals("second.dat", entry2.getName());
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int read;
        while ((read = zipInputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, read);
        }
        assertArrayEquals("Second content".getBytes(), bos.toByteArray());
        
        assertNull(zipInputStream.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryReturnsNullWhenClosed() throws IOException {
        writeZipWithStoredEntry("test.txt", "data".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.close();
        
        assertNull(zipInputStream.getNextZipEntry());
    }

    @Test
    public void testReadWithInvalidOffsetAndLength() throws IOException {
        writeZipWithStoredEntry("test.txt", "data".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        byte[] buffer = new byte[10];
        try {
            zipInputStream.read(buffer, -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        try {
            zipInputStream.read(buffer, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        try {
            zipInputStream.read(buffer, 0, buffer.length + 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReadWhenNoCurrentEntry() throws IOException {
        bais = new ByteArrayInputStream(new byte[0]);
        zipInputStream = new ZipArchiveInputStream(bais);
        
        byte[] buffer = new byte[10];
        assertEquals(-1, zipInputStream.read(buffer, 0, buffer.length));
    }

    @Test
    public void testSkipWithNegativeValue() throws IOException {
        writeZipWithStoredEntry("test.txt", "data".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        assertEquals(0, zipInputStream.skip(-100));
    }

    @Test
    public void testSkipWithinEntry() throws IOException {
        writeZipWithStoredEntry("test.txt", "Hello World".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        long skipped = zipInputStream.skip(6);
        assertEquals(6, skipped);
        
        byte[] remaining = new byte[5];
        int read = zipInputStream.read(remaining);
        assertEquals(5, read);
        assertArrayEquals("World".getBytes(), remaining);
    }

    @Test
    public void testGetNextEntryInterfaceMethod() throws IOException {
        writeZipWithStoredEntry("test.txt", "data".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        
        ArchiveEntry entry = zipInputStream.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testCanReadEntryData() throws IOException {
        writeZipWithStoredEntry("test.txt", "data".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        ZipArchiveEntry entry = zipInputStream.getNextZipEntry();
        
        assertTrue(zipInputStream.canReadEntryData(entry));
        assertFalse(zipInputStream.canReadEntryData(new ZipArchiveEntry("nonexistent")));
    }

    @Test
    public void testMatchesMethod() {
        byte[] lfh = new byte[]{0x50, 0x4B, 0x03, 0x04};
        assertTrue(ZipArchiveInputStream.matches(lfh, 4));
        assertFalse(ZipArchiveInputStream.matches(lfh, 2));
        assertFalse(ZipArchiveInputStream.matches(new byte[4], 4));
    }

    @Test
    public void testStoredEntryWithDataDescriptor() throws IOException {
        baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry("data.txt");
            entry.setMethod(ZipEntry.STORED);
            GeneralPurposeBit gpb = new GeneralPurposeBit();
            gpb.useDataDescriptor(true);
            entry.setGeneralPurposeBit(gpb);
            zos.putArchiveEntry(entry);
            zos.write("stored data".getBytes());
            zos.closeArchiveEntry();
        }
        
        byte[] raw = baos.toByteArray();
        bais = new ByteArrayInputStream(raw);
        zipInputStream = new ZipArchiveInputStream(bais, "UTF8", true, true);
        
        ZipArchiveEntry entry = zipInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipEntry.STORED, entry.getMethod());
        
        byte[] content = new byte[11];
        int read = zipInputStream.read(content);
        assertEquals(11, read);
        assertArrayEquals("stored data".getBytes(), content);
    }

    @Test
    public void testEmptyZipArchive() throws IOException {
        baos = new ByteArrayOutputStream();
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            // no entries
        }
        
        bais = new ByteArrayInputStream(baos.toByteArray());
        zipInputStream = new ZipArchiveInputStream(bais);
        
        assertNull(zipInputStream.getNextZipEntry());
    }

    @Test
    public void testReadWithExactBufferSize() throws IOException {
        String data = "Exact buffer size test";
        writeZipWithStoredEntry("test.txt", data.getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        byte[] buffer = new byte[data.length()];
        int read = zipInputStream.read(buffer);
        assertEquals(data.length(), read);
        assertArrayEquals(data.getBytes(), buffer);
    }

    @Test
    public void testMultipleReadCalls() throws IOException {
        String data = "Splitting this across multiple reads";
        writeZipWithStoredEntry("test.txt", data.getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        byte[] content = new byte[data.length()];
        int offset = 0;
        int read;
        byte[] temp = new byte[7]; // small buffer to force multiple reads
        while ((read = zipInputStream.read(temp)) != -1 && offset < content.length) {
            System.arraycopy(temp, 0, content, offset, read);
            offset += read;
        }
        assertEquals(data.length(), offset);
        assertArrayEquals(data.getBytes(), content);
    }

    @Test
    public void testReadBeyondEntryEnd() throws IOException {
        writeZipWithStoredEntry("test.txt", "short".getBytes());
        zipInputStream = new ZipArchiveInputStream(bais);
        zipInputStream.getNextZipEntry();
        
        byte[] buffer = new byte[5];
        int read1 = zipInputStream.read(buffer);
        assertEquals(5, read1);
        int read2 = zipInputStream.read(buffer);
        assertEquals(-1, read2);
    }

    private void writeZipWithStoredEntry(String name, byte[] content) throws IOException {
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            ZipArchiveEntry entry = new ZipArchiveEntry(name);
            entry.setMethod(ZipEntry.STORED);
            entry.setSize(content.length);
            entry.setCompressedSize(content.length);
            CRC32 crc = new CRC32();
            crc.update(content);
            entry.setCrc(crc.getValue());
            zos.putArchiveEntry(entry);
            zos.write(content);
            zos.closeArchiveEntry();
        }
        bais = new ByteArrayInputStream(baos.toByteArray());
    }

    private void writeZipWithDeflatedEntry(String name, byte[] content) throws IOException {
        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos)) {
            zos.putArchiveEntry(new ZipArchiveEntry(name));
            zos.write(content);
            zos.closeArchiveEntry();
        }
        bais = new ByteArrayInputStream(baos.toByteArray());
    }
}