package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamTest {

    @Test
    public void constructor_givenInputStream_shouldInitializeSuccessfully() {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);

        // Act
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        // Assert
        Assert.assertNotNull(in);
        try {
            in.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void constructor_givenEncoding_shouldSetEncoding() {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);

        // Act
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais, "UTF-8", true, false);

        // Assert
        Assert.assertNotNull(in);
        Assert.assertEquals("UTF-8", in.encoding);
        try {
            in.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void matches_givenZipSignature_shouldReturnTrue() {
        // Local file header signature: 0x04034b50 -> PK\003\004
        byte[] sig = new byte[] { 0x50, 0x4b, 0x03, 0x04 };

        // Act & Assert
        Assert.assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenInvalidSignature_shouldReturnFalse() {
        // Invalid signature
        byte[] sig = new byte[] { 0x00, 0x00, 0x00, 0x00 };

        // Act & Assert
        Assert.assertFalse(ZipArchiveInputStream.matches(sig, 4));
        Assert.assertFalse(ZipArchiveInputStream.matches(sig, 2)); // Too short
    }

    @Test
    public void getNextZipEntry_givenEmptyInputStream_shouldReturnNull() throws IOException {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        // Act
        ZipArchiveEntry entry = in.getNextZipEntry();

        // Assert
        Assert.assertNull(entry);
        in.close();
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        // Act
        int read = in.read(new byte[10], 0, 10);

        // Assert
        Assert.assertEquals(-1, read);
        in.close();
    }

    @Test
    public void canReadEntryData_givenSupportedAndUnsupportedEntries_shouldEvaluateCorrectly() {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        ZipArchiveEntry supported = new ZipArchiveEntry("test.txt");
        supported.setMethod(ZipMethod.DEFLATED.getCode());

        ZipArchiveEntry unsupported = new ZipArchiveEntry("test.txt");
        unsupported.setMethod(99); // Unknown method

        // Act & Assert
        Assert.assertTrue(in.canReadEntryData(supported));
        Assert.assertFalse(in.canReadEntryData(unsupported));

        try {
            in.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void readAndGetNextEntry_givenValidZipStream_shouldReadEntriesAndContent() throws Exception {
        // Arrange: build a valid zip archive in memory
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        byte[] content1 = "Content of first file".getBytes("UTF-8");
        zaos.putArchiveEntry(entry1);
        zaos.write(content1);
        zaos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("dir/file2.txt");
        byte[] content2 = "Second file content".getBytes("UTF-8");
        zaos.putArchiveEntry(entry2);
        zaos.write(content2);
        zaos.closeArchiveEntry();

        zaos.finish();
        zaos.close();

        // Act: read the zip archive back
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);

        // Read Entry 1
        ZipArchiveEntry readEntry1 = zais.getNextZipEntry();
        Assert.assertNotNull(readEntry1);
        Assert.assertEquals("file1.txt", readEntry1.getName());

        byte[] buf = new byte[100];
        int bytesRead1 = zais.read(buf, 0, buf.length);
        Assert.assertEquals(content1.length, bytesRead1);
        Assert.assertEquals("Content of first file", new String(buf, 0, bytesRead1, "UTF-8"));

        // Read Entry 2
        ZipArchiveEntry readEntry2 = (ZipArchiveEntry) zais.getNextEntry();
        Assert.assertNotNull(readEntry2);
        Assert.assertEquals("dir/file2.txt", readEntry2.getName());

        int bytesRead2 = zais.read(buf, 0, buf.length);
        Assert.assertEquals(content2.length, bytesRead2);
        Assert.assertEquals("Second file content", new String(buf, 0, bytesRead2, "UTF-8"));

        // No more entries
        Assert.assertNull(zais.getNextZipEntry());
        zais.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseStream() throws IOException {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        // Act
        in.close();

        // Assert: reading from closed stream should throw IOException
        try {
            in.read();
            Assert.fail("Expected IOException on closed stream");
        } catch (IOException expected) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void skip_givenNegativeCount_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream in = new ZipArchiveInputStream(bais);

        // Act & Assert
        try {
            in.skip(-1L);
        } finally {
            in.close();
        }
    }
}
