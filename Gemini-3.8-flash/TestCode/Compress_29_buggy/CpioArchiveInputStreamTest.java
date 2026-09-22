package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveInputStreamTest {

    @Test
    public void matches_givenLengthLessThanSix_shouldReturnFalse() {
        // Arrange
        byte[] shortSignature = new byte[] { '0', '7', '0', '7', '0' };

        // Act & Assert
        Assert.assertFalse(CpioArchiveInputStream.matches(shortSignature, 5));
    }

    @Test
    public void matches_givenOldBinarySignatures_shouldReturnTrue() {
        // Arrange
        byte[] magic1 = new byte[] { (byte) 0x71, (byte) 0xC7, 0, 0, 0, 0 };
        byte[] magic2 = new byte[] { (byte) 0xC7, (byte) 0x71, 0, 0, 0, 0 };

        // Act & Assert
        Assert.assertTrue(CpioArchiveInputStream.matches(magic1, 6));
        Assert.assertTrue(CpioArchiveInputStream.matches(magic2, 6));
    }

    @Test
    public void matches_givenAsciiSignatures_shouldReturnTrue() {
        // Arrange
        byte[] magicNew = new byte[] { '0', '7', '0', '7', '0', '1' };
        byte[] magicNewCrc = new byte[] { '0', '7', '0', '7', '0', '2' };
        byte[] magicOldAscii = new byte[] { '0', '7', '0', '7', '0', '7' };

        // Act & Assert
        Assert.assertTrue(CpioArchiveInputStream.matches(magicNew, 6));
        Assert.assertTrue(CpioArchiveInputStream.matches(magicNewCrc, 6));
        Assert.assertTrue(CpioArchiveInputStream.matches(magicOldAscii, 6));
    }

    @Test
    public void matches_givenInvalidSignatures_shouldReturnFalse() {
        // Arrange
        byte[] invalid0 = new byte[] { '1', '7', '0', '7', '0', '1' };
        byte[] invalid1 = new byte[] { '0', '8', '0', '7', '0', '1' };
        byte[] invalid2 = new byte[] { '0', '7', '1', '7', '0', '1' };
        byte[] invalid3 = new byte[] { '0', '7', '0', '8', '0', '1' };
        byte[] invalid4 = new byte[] { '0', '7', '0', '7', '1', '1' };
        byte[] invalid5 = new byte[] { '0', '7', '0', '7', '0', '9' };

        // Act & Assert
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid0, 6));
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid1, 6));
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid2, 6));
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid3, 6));
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid4, 6));
        Assert.assertFalse(CpioArchiveInputStream.matches(invalid5, 6));
    }

    @Test
    public void constructor_givenDifferentConstructors_shouldInitializeWithoutError() throws IOException {
        // Arrange
        byte[] empty = new byte[0];

        // Act
        CpioArchiveInputStream in1 = new CpioArchiveInputStream(new ByteArrayInputStream(empty));
        CpioArchiveInputStream in2 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), "UTF-8");
        CpioArchiveInputStream in3 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        CpioArchiveInputStream in4 = new CpioArchiveInputStream(new ByteArrayInputStream(empty), 1024, "UTF-8");

        // Assert
        Assert.assertNotNull(in1);
        Assert.assertNotNull(in2);
        Assert.assertNotNull(in3);
        Assert.assertNotNull(in4);

        in1.close();
        in2.close();
        in3.close();
        in4.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseStreamAndBeIdempotent() throws IOException {
        // Arrange
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        // Act
        in.close();
        in.close(); // Verify idempotent behavior

        // Assert
        try {
            in.available();
            Assert.fail("available() should throw IOException after close()");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void ensureOpen_givenClosedStream_shouldThrowExceptionOnAllOperations() throws IOException {
        // Arrange
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();

        // Act & Assert - available
        try {
            in.available();
            Assert.fail("available should fail when closed");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }

        // Act & Assert - getNextCPIOEntry
        try {
            in.getNextCPIOEntry();
            Assert.fail("getNextCPIOEntry should fail when closed");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }

        // Act & Assert - read
        try {
            in.read(new byte[10], 0, 10);
            Assert.fail("read should fail when closed");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }

        // Act & Assert - skip
        try {
            in.skip(5);
            Assert.fail("skip should fail when closed");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void read_givenInvalidBounds_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        byte[] dummyArchive = createSimpleArchive(CpioConstants.FORMAT_NEW, "file.txt", "data".getBytes());
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(dummyArchive));
        in.getNextCPIOEntry();
        byte[] buf = new byte[10];

        // Act & Assert - negative offset
        try {
            in.read(buf, -1, 5);
            Assert.fail("Negative offset should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        // Act & Assert - negative length
        try {
            in.read(buf, 0, -1);
            Assert.fail("Negative length should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        // Act & Assert - offset + len exceeds buffer size
        try {
            in.read(buf, 8, 5);
            Assert.fail("Offset + length exceeding buffer length should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        in.close();
    }

    @Test
    public void read_givenZeroLength_shouldReturnZero() throws IOException {
        // Arrange
        byte[] dummyArchive = createSimpleArchive(CpioConstants.FORMAT_NEW, "file.txt", "data".getBytes());
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(dummyArchive));
        in.getNextCPIOEntry();

        // Act
        int bytesRead = in.read(new byte[10], 0, 0);

        // Assert
        Assert.assertEquals(0, bytesRead);
        in.close();
    }

    @Test
    public void read_givenNoCurrentEntryOrAtEof_shouldReturnMinusOne() throws IOException {
        // Arrange
        byte[] dummyArchive = createSimpleArchive(CpioConstants.FORMAT_NEW, "file.txt", new byte[0]);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(dummyArchive));

        // Act & Assert - Before reading entry
        Assert.assertEquals(-1, in.read(new byte[10], 0, 10));

        // Advance to entry
        in.getNextCPIOEntry();
        // Entry size is 0, reading should immediately reach EOF
        Assert.assertEquals(-1, in.read(new byte[10], 0, 10));
        Assert.assertEquals(-1, in.read(new byte[10], 0, 10));

        in.close();
    }

    @Test
    public void skip_givenNegativeValue_shouldThrowIllegalArgumentException() throws IOException {
        // Arrange
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        // Act & Assert
        try {
            in.skip(-1);
            Assert.fail("skip() with negative argument should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("negative skip length", e.getMessage());
        } finally {
            in.close();
        }
    }

    @Test
    public void getNextCPIOEntry_givenPrematureEOF_shouldThrowEOFException() throws IOException {
        // Arrange
        byte[] truncatedHeader = new byte[] { '0', '7', '0', '7' };
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(truncatedHeader));

        // Act & Assert
        try {
            in.getNextCPIOEntry();
            Assert.fail("Premature EOF in header should throw EOFException");
        } catch (EOFException e) {
            // Success
        } finally {
            in.close();
        }
    }

    @Test
    public void getNextCPIOEntry_givenUnknownMagic_shouldThrowIOException() throws IOException {
        // Arrange
        byte[] unknownMagic = new byte[] { '9', '9', '9', '9', '9', '9', 0, 0 };
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(unknownMagic));

        // Act & Assert
        try {
            in.getNextCPIOEntry();
            Assert.fail("Unknown magic should throw IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unknown magic") != -1);
        } finally {
            in.close();
        }
    }

    @Test
    public void getNextCPIOEntry_givenFormatNew_shouldReadEntryAndDataCorrectly() throws IOException {
        // Arrange
        byte[] expectedContent = "Test content for format NEW".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_NEW, "new_entry.txt", expectedContent);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));

        // Act
        CpioArchiveEntry entry = in.getNextCPIOEntry();

        // Assert
        Assert.assertNotNull(entry);
        Assert.assertEquals("new_entry.txt", entry.getName());
        Assert.assertEquals(expectedContent.length, entry.getSize());
        Assert.assertEquals(1, in.available());

        byte[] readBuf = new byte[expectedContent.length];
        int readTotal = 0;
        int r;
        while (readTotal < expectedContent.length && (r = in.read(readBuf, readTotal, expectedContent.length - readTotal)) != -1) {
            readTotal += r;
        }

        Assert.assertEquals(expectedContent.length, readTotal);
        Assert.assertEquals(new String(expectedContent, "US-ASCII"), new String(readBuf, "US-ASCII"));
        Assert.assertEquals(-1, in.read(readBuf, 0, 1));
        Assert.assertEquals(0, in.available());

        // Trailer reached, next entry is null
        CpioArchiveEntry trailer = in.getNextCPIOEntry();
        Assert.assertNull(trailer);

        in.close();
    }

    @Test
    public void getNextEntry_givenArchive_shouldDelegateToGetNextCPIOEntry() throws IOException {
        // Arrange
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_NEW, "test.txt", "abc".getBytes());
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));

        // Act
        org.apache.commons.compress.archivers.ArchiveEntry entry = in.getNextEntry();

        // Assert
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        in.close();
    }

    @Test
    public void getNextCPIOEntry_givenFormatOldAscii_shouldReadEntryAndDataCorrectly() throws IOException {
        // Arrange
        byte[] expectedContent = "Test content for old ASCII format".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_OLD_ASCII, "old_ascii.txt", expectedContent);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));

        // Act
        CpioArchiveEntry entry = in.getNextCPIOEntry();

        // Assert
        Assert.assertNotNull(entry);
        Assert.assertEquals("old_ascii.txt", entry.getName());
        Assert.assertEquals(expectedContent.length, entry.getSize());

        byte[] readBuf = new byte[expectedContent.length];
        int totalRead = 0;
        int r;
        while (totalRead < expectedContent.length && (r = in.read(readBuf, totalRead, expectedContent.length - totalRead)) != -1) {
            totalRead += r;
        }

        Assert.assertEquals(expectedContent.length, totalRead);
        Assert.assertEquals(new String(expectedContent, "US-ASCII"), new String(readBuf, "US-ASCII"));
        Assert.assertNull(in.getNextCPIOEntry());

        in.close();
    }

    @Test
    public void getNextCPIOEntry_givenFormatOldBinary_shouldReadEntryAndDataCorrectly() throws IOException {
        // Arrange
        byte[] expectedContent = "Binary CPIO Content".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_OLD_BINARY, "binary.bin", expectedContent);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));

        // Act
        CpioArchiveEntry entry = in.getNextCPIOEntry();

        // Assert
        Assert.assertNotNull(entry);
        Assert.assertEquals("binary.bin", entry.getName());
        Assert.assertEquals(expectedContent.length, entry.getSize());

        byte[] readBuf = new byte[expectedContent.length];
        int totalRead = 0;
        int r;
        while (totalRead < expectedContent.length && (r = in.read(readBuf, totalRead, expectedContent.length - totalRead)) != -1) {
            totalRead += r;
        }

        Assert.assertEquals(expectedContent.length, totalRead);
        Assert.assertEquals(new String(expectedContent, "US-ASCII"), new String(readBuf, "US-ASCII"));
        Assert.assertNull(in.getNextCPIOEntry());

        in.close();
    }

    @Test
    public void getNextCPIOEntry_givenFormatNewCrcWithValidChecksum_shouldSucceed() throws IOException {
        // Arrange
        byte[] content = "Data to test valid CRC verification".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_NEW_CRC, "crc_valid.txt", content);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));

        // Act
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);

        byte[] readBuf = new byte[content.length];
        int readBytes = in.read(readBuf, 0, content.length);

        // Assert
        Assert.assertEquals(content.length, readBytes);
        Assert.assertEquals(-1, in.read(readBuf, 0, 1)); // Trigger checksum validation
        Assert.assertNull(in.getNextCPIOEntry());

        in.close();
    }

    @Test
    public void getNextCPIOEntry_givenFormatNewCrcWithCorruptedData_shouldThrowCRCException() throws IOException {
        // Arrange
        byte[] content = "Original uncorrupted data".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_NEW_CRC, "crc_invalid.txt", content);

        // Corrupt entry payload in the raw byte array
        // In FORMAT_NEW_CRC, header is 110 bytes, name is "crc_invalid.txt\0" (16 bytes), padded to 4 bytes boundary (0 pad)
        // Header (110) + name (16) = 126 bytes -> pad to 128 bytes. The content begins at index 128.
        int contentOffset = 110 + 15 + 1;
        while (contentOffset % 4 != 0) {
            contentOffset++;
        }
        archiveData[contentOffset] ^= 0xFF; // Invert bits of first byte of payload

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        Assert.assertNotNull(entry);

        byte[] readBuf = new byte[content.length];
        in.read(readBuf, 0, content.length);

        // Act & Assert
        try {
            in.read(readBuf, 0, 1); // Triggers EOF & CRC check
            Assert.fail("Corrupted CRC should throw IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("CRC Error") != -1);
        } finally {
            in.close();
        }
    }

    @Test
    public void getNextCPIOEntry_givenModeZeroNonTrailer_shouldThrowIOException() throws IOException {
        // Arrange
        // Craft a CPIO entry with MAGIC_NEW, mode 0, but file name != TRAILER!!!
        StringBuilder sb = new StringBuilder();
        sb.append(CpioConstants.MAGIC_NEW);      // 6 bytes magic
        sb.append("00000001");                    // ino (8 hex)
        sb.append("00000000");                    // mode = 0 (fileType == 0)
        sb.append("00000000");                    // uid (8 hex)
        sb.append("00000000");                    // gid (8 hex)
        sb.append("00000001");                    // nlink (8 hex)
        sb.append("00000000");                    // mtime (8 hex)
        sb.append("00000000");                    // filesize = 0 (8 hex)
        sb.append("00000000");                    // devmaj (8 hex)
        sb.append("00000000");                    // devmin (8 hex)
        sb.append("00000000");                    // rdevmaj (8 hex)
        sb.append("00000000");                    // rdevmin (8 hex)
        sb.append("00000005");                    // namesize = 5 ("bad\0")
        sb.append("00000000");                    // chksum (8 hex)
        sb.append("bad\0");                       // name + null terminator
        // pad header (110 + 5 = 115 bytes -> pad 1 byte)
        sb.append("\0");

        byte[] badEntryBytes = sb.toString().getBytes("US-ASCII");
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(badEntryBytes));

        // Act & Assert
        try {
            in.getNextCPIOEntry();
            Assert.fail("Mode 0 for non-trailer entry must throw IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Mode 0 only allowed in the trailer") != -1);
        } finally {
            in.close();
        }
    }

    @Test
    public void getNextCPIOEntry_givenUnconsumedEntryData_shouldAutoSkipAndReadNextEntry() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);

        byte[] firstData = "First file content".getBytes("US-ASCII");
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt", firstData.length);
        entry1.setMode(CpioConstants.C_ISREG | 0644);
        out.putNextEntry(entry1);
        out.write(firstData);
        out.closeArchiveEntry();

        byte[] secondData = "Second file content".getBytes("US-ASCII");
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file2.txt", secondData.length);
        entry2.setMode(CpioConstants.C_ISREG | 0644);
        out.putNextEntry(entry2);
        out.write(secondData);
        out.closeArchiveEntry();

        out.close();

        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        // Act
        CpioArchiveEntry readEntry1 = in.getNextCPIOEntry();
        Assert.assertEquals("file1.txt", readEntry1.getName());
        // Do not read content of file1, call getNextCPIOEntry directly to test closeEntry() auto-skipping
        CpioArchiveEntry readEntry2 = in.getNextCPIOEntry();

        // Assert
        Assert.assertEquals("file2.txt", readEntry2.getName());
        byte[] readBuf = new byte[secondData.length];
        int r = in.read(readBuf, 0, secondData.length);
        Assert.assertEquals(secondData.length, r);
        Assert.assertEquals(new String(secondData, "US-ASCII"), new String(readBuf, "US-ASCII"));

        in.close();
    }

    @Test
    public void skip_givenValidCount_shouldSkipBytesCorrectly() throws IOException {
        // Arrange
        byte[] content = "0123456789ABCDEF".getBytes("US-ASCII");
        byte[] archiveData = createSimpleArchive(CpioConstants.FORMAT_NEW, "skip.txt", content);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(archiveData));
        in.getNextCPIOEntry();

        // Act
        long skipped = in.skip(10);
        byte[] remaining = new byte[6];
        int readBytes = in.read(remaining, 0, remaining.length);

        // Assert
        Assert.assertEquals(10L, skipped);
        Assert.assertEquals(6, readBytes);
        Assert.assertEquals("ABCDEF", new String(remaining, "US-ASCII"));
        Assert.assertEquals(-1, in.read(remaining, 0, 1));

        in.close();
    }

    private byte[] createSimpleArchive(short format, String filename, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, format);
        CpioArchiveEntry entry = new CpioArchiveEntry(format, filename, content.length);
        entry.setMode(CpioConstants.C_ISREG | 0644);
        out.putNextEntry(entry);
        out.write(content);
        out.closeArchiveEntry();
        out.close();
        return baos.toByteArray();
    }
}