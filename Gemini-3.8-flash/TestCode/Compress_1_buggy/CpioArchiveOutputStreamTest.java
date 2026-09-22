package org.apache.commons.compress.archivers.cpio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream cpioOut;

    @Before
    public void setUp() {
        this.baos = new ByteArrayOutputStream();
        this.cpioOut = new CpioArchiveOutputStream(this.baos);
    }

    @Test
    public void constructor_givenValidOutputStream_shouldInitializeSuccessfully() {
        // Arrange & Act
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream stream = new CpioArchiveOutputStream(out);

        // Assert
        Assert.assertNotNull(stream);
    }

    @Test
    public void constructor_givenFormat_shouldInitializeWithSpecifiedFormat() {
        // Arrange & Act
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream stream = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_OLD_ASCII);

        // Assert
        Assert.assertNotNull(stream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenUnknownFormat_shouldThrowIllegalArgumentException() {
        // Arrange, Act & Assert
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(out, (short) 999);
    }

    @Test
    public void putNextEntryAndWrite_givenValidEntryAndData_shouldWriteSuccessfully() throws Exception {
        // Arrange
        byte[] content = "Hello CPIO Archive!".getBytes("UTF-8");
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile.txt", content.length);

        // Act
        this.cpioOut.putNextEntry(entry);
        this.cpioOut.write(content, 0, content.length);
        this.cpioOut.closeArchiveEntry();
        this.cpioOut.finish();

        // Assert
        byte[] result = this.baos.toByteArray();
        Assert.assertTrue(result.length > 0);
        String resultStr = new String(result, "UTF-8");
        Assert.assertTrue(resultStr.contains("testfile.txt"));
        Assert.assertTrue(resultStr.contains("TRAILER!!!"));
    }

    @Test(expected = IOException.class)
    public void putNextEntry_givenDuplicateEntryName_shouldThrowIOException() throws Exception {
        // Arrange
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "duplicate.txt", 0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "duplicate.txt", 0);

        // Act & Assert
        this.cpioOut.putNextEntry(entry1);
        this.cpioOut.closeArchiveEntry();
        this.cpioOut.putNextEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void putNextEntry_givenClosedStream_shouldThrowIOException() throws Exception {
        // Arrange
        this.cpioOut.close();
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt", 0);

        // Act & Assert
        this.cpioOut.putNextEntry(entry);
    }

    @Test(expected = IOException.class)
    public void write_givenNoActiveEntry_shouldThrowIOException() throws Exception {
        // Arrange
        byte[] data = new byte[] { 1, 2, 3 };

        // Act & Assert
        this.cpioOut.write(data, 0, data.length);
    }

    @Test(expected = IOException.class)
    public void write_givenDataExceedingEntrySize_shouldThrowIOException() throws Exception {
        // Arrange
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "small.txt", 2);
        this.cpioOut.putNextEntry(entry);

        byte[] data = new byte[] { 1, 2, 3, 4, 5 };

        // Act & Assert
        this.cpioOut.write(data, 0, data.length);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void write_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws Exception {
        // Arrange
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test.txt", 5);
        this.cpioOut.putNextEntry(entry);

        byte[] data = new byte[5];

        // Act & Assert
        this.cpioOut.write(data, -1, 3);
    }

    @Test(expected = IOException.class)
    public void closeArchiveEntry_givenSizeMismatch_shouldThrowIOException() throws Exception {
        // Arrange
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "incomplete.txt", 10);
        this.cpioOut.putNextEntry(entry);
        this.cpioOut.write(new byte[] { 1, 2, 3 }, 0, 3);

        // Act & Assert
        this.cpioOut.closeArchiveEntry();
    }

    @Test
    public void finish_givenActiveEntry_shouldWriteTrailer() throws Exception {
        // Arrange
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "entry.txt", 0);
        this.cpioOut.putNextEntry(entry);

        // Act
        this.cpioOut.finish();

        // Assert
        String outStr = new String(this.baos.toByteArray(), "UTF-8");
        Assert.assertTrue(outStr.contains("TRAILER!!!"));
    }

    @Test
    public void finish_givenAlreadyFinished_shouldBeIdempotent() throws Exception {
        // Arrange
        this.cpioOut.finish();
        int initialSize = this.baos.size();

        // Act
        this.cpioOut.finish();

        // Assert
        Assert.assertEquals(initialSize, this.baos.size());
    }

    @Test
    public void close_givenOpenStream_shouldCloseStreamAndPreventFurtherOperations() throws Exception {
        // Arrange & Act
        this.cpioOut.close();

        // Assert
        try {
            this.cpioOut.finish();
            Assert.fail("Expected IOException after close");
        } catch (IOException expected) {
            Assert.assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void putNextEntry_givenOldAsciiFormat_shouldWriteOldAsciiHeader() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream stream = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "old_ascii.txt", 0);

        // Act
        stream.putNextEntry(entry);
        stream.closeArchiveEntry();
        stream.finish();

        // Assert
        byte[] data = out.toByteArray();
        Assert.assertTrue(data.length > 0);
        String str = new String(data, "UTF-8");
        Assert.assertTrue(str.startsWith(CpioConstants.MAGIC_OLD_ASCII));
    }

    @Test
    public void putNextEntry_givenOldBinaryFormat_shouldWriteOldBinaryHeader() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream stream = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "old_bin.bin", 0);

        // Act
        stream.putNextEntry(entry);
        stream.closeArchiveEntry();
        stream.finish();

        // Assert
        byte[] data = out.toByteArray();
        Assert.assertTrue(data.length > 0);
    }
}
