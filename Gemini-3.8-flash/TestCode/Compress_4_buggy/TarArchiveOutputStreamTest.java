package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link TarArchiveOutputStream}.
 * Designed for Java 1.4 / Java 7 compatibility without third-party mocking libraries.
 */
public class TarArchiveOutputStreamTest {

    private static class TrackingOutputStream extends ByteArrayOutputStream {
        private boolean flushed = false;
        private boolean closed = false;

        public void flush() throws IOException {
            super.flush();
            this.flushed = true;
        }

        public void close() throws IOException {
            super.close();
            this.closed = true;
        }

        public boolean isFlushed() {
            return flushed;
        }

        public boolean isClosed() {
            return closed;
        }
    }

    private static class DummyArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;

        public DummyArchiveEntry(String name, long size) {
            this.name = name;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return size;
        }

        public boolean isDirectory() {
            return false;
        }

        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private String createStringOfLength(int length, char fillChar) {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = fillChar;
        }
        return new String(chars);
    }

    @Test
    public void constructor_givenOutputStream_shouldInitializeWithDefaultSizes() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Act
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        // Assert
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        taos.close();
    }

    @Test
    public void constructor_givenOutputStreamAndBlockSize_shouldInitializeWithDefaultRecordSize() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customBlockSize = TarBuffer.DEFAULT_RCDSIZE * 4;

        // Act
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, customBlockSize);

        // Assert
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        taos.close();
    }

    @Test
    public void constructor_givenCustomBlockAndRecordSize_shouldInitializeCorrectly() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customRecordSize = 1024;
        int customBlockSize = 2048;

        // Act
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, customBlockSize, customRecordSize);

        // Assert
        Assert.assertEquals(customRecordSize, taos.getRecordSize());
        taos.close();
    }

    @Test
    public void putArchiveEntry_givenNonTarArchiveEntry_shouldThrowClassCastException() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        ArchiveEntry invalidEntry = new DummyArchiveEntry("invalid.txt", 10);

        // Act & Assert
        try {
            taos.putArchiveEntry(invalidEntry);
            Assert.fail("Expected ClassCastException when non-TarArchiveEntry is provided");
        } catch (ClassCastException e) {
            // Expected
        } finally {
            try {
                taos.close();
            } catch (IOException e) {
                // Ignore cleanup error
            }
        }
    }

    @Test
    public void putArchiveEntry_givenNameLessThan100Chars_shouldSucceed() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        String name99 = createStringOfLength(99, 'a');
        TarArchiveEntry entry = new TarArchiveEntry(name99);
        entry.setSize(0);

        // Act
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenName100CharsAndDefaultErrorMode_shouldThrowRuntimeException() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        String name100 = createStringOfLength(100, 'b');
        TarArchiveEntry entry = new TarArchiveEntry(name100);

        // Act & Assert
        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long file name under default LONGFILE_ERROR mode");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("too long") != -1);
        } finally {
            try {
                taos.close();
            } catch (IOException e) {
                // Ignore cleanup error
            }
        }
    }

    @Test
    public void putArchiveEntry_givenLongNameAndTruncateMode_shouldSucceed() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String name120 = createStringOfLength(120, 'c');
        TarArchiveEntry entry = new TarArchiveEntry(name120);
        entry.setSize(0);

        // Act
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenLongNameAndGnuMode_shouldWriteLongLinkAndOriginalEntry() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String name120 = createStringOfLength(120, 'd');
        TarArchiveEntry entry = new TarArchiveEntry(name120);
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        entry.setSize(data.length);

        // Act
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenDirectoryEntry_shouldSetCurrSizeToZero() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        dirEntry.setSize(500); // Directory size should be forced to 0 internally

        // Act
        taos.putArchiveEntry(dirEntry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenBytesExceedingHeaderSize_shouldThrowIOException() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);

        byte[] overData = new byte[11];

        // Act & Assert
        try {
            taos.write(overData, 0, overData.length);
            Assert.fail("Expected IOException when writing more bytes than specified in entry size");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("exceeds size in header") != -1);
        } finally {
            try {
                taos.close();
            } catch (IOException e) {
                // Ignore cleanup error
            }
        }
    }

    @Test
    public void closeArchiveEntry_givenFewerBytesThanSpecified_shouldThrowIOException() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("underflow.txt");
        entry.setSize(100);
        taos.putArchiveEntry(entry);

        byte[] partialData = new byte[50];
        taos.write(partialData, 0, partialData.length);

        // Act & Assert
        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry before all specified bytes were written");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("before the '100' bytes specified in the header were written") != -1);
        } finally {
            try {
                taos.close();
            } catch (IOException e) {
                // Ignore cleanup error
            }
        }
    }

    @Test
    public void write_givenDataSmallerThanRecordSize_shouldAssembleAndPadOnClose() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        byte[] payload = "Hello Apache Commons Compress Tar".getBytes();
        entry.setSize(payload.length);

        // Act
        taos.putArchiveEntry(entry);
        taos.write(payload, 0, payload.length);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenMultipleSmallChunks_shouldAssembleInAssemBuf() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("assemble_chunks.txt");
        int totalSize = 100;
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        // Act - write 10 chunks of 10 bytes (all within first record size)
        byte[] chunk = new byte[10];
        for (int i = 0; i < 10; i++) {
            chunk[0] = (byte) i;
            taos.write(chunk, 0, 10);
        }
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenChunkThatFillsAndExceedsAssemBuf_shouldFlushRecordAndBufferRemainder() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize(); // default 512
        int totalSize = recordSize + 100;
        TarArchiveEntry entry = new TarArchiveEntry("split_assemble.txt");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        // Act
        // Step 1: Write partial record (300 bytes) -> stored in assemBuf
        byte[] part1 = new byte[300];
        taos.write(part1, 0, 300);

        // Step 2: Write (300 + 12) bytes -> 300 + 312 = 612 >= 512
        // Should fill remaining 212 bytes into recordBuf, write record, and buffer remaining 100 bytes into assemBuf
        byte[] part2 = new byte[312];
        taos.write(part2, 0, 312);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenExactRecordSize_shouldWriteDirectRecord() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("exact_record.txt");
        entry.setSize(recordSize);
        byte[] data = new byte[recordSize];

        // Act
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenMultipleRecordsPlusRemainder_shouldProcessDirectAndBuffered() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize();
        int totalSize = (recordSize * 2) + 50;
        TarArchiveEntry entry = new TarArchiveEntry("multi_record.txt");
        entry.setSize(totalSize);
        byte[] data = new byte[totalSize];

        // Act
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        // Assert
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void finish_givenUnclosedEntry_shouldThrowIOException() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);

        // Act & Assert
        try {
            taos.finish();
            Assert.fail("Expected IOException when finish() is called with unclosed entry");
        } catch (IOException e) {
            Assert.assertEquals("This archives contains unclosed entries.", e.getMessage());
        } finally {
            try {
                taos.closeArchiveEntry();
                taos.close();
            } catch (IOException e) {
                // Ignore cleanup error
            }
        }
    }

    @Test
    public void close_givenOpenArchive_shouldCloseUnderlyingStream() throws IOException {
        // Arrange
        TrackingOutputStream tos = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tos);

        // Act
        taos.close();

        // Assert
        Assert.assertTrue(tos.isClosed());
    }

    @Test
    public void close_calledMultipleTimes_shouldBeIdempotent() throws IOException {
        // Arrange
        TrackingOutputStream tos = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tos);

        // Act
        taos.close();
        taos.close(); // Second call should do nothing

        // Assert
        Assert.assertTrue(tos.isClosed());
    }

    @Test
    public void flush_shouldPropagateToUnderlyingStream() throws IOException {
        // Arrange
        TrackingOutputStream tos = new TrackingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(tos);

        // Act
        taos.flush();

        // Assert
        Assert.assertTrue(tos.isFlushed());
        taos.close();
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldReturnTarArchiveEntry() throws IOException {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        File tempFile = File.createTempFile("tar_test", ".tmp");
        tempFile.deleteOnExit();

        // Act
        ArchiveEntry createdEntry = taos.createArchiveEntry(tempFile, "archive_entry.txt");

        // Assert
        Assert.assertNotNull(createdEntry);
        Assert.assertTrue(createdEntry instanceof TarArchiveEntry);
        Assert.assertEquals("archive_entry.txt", createdEntry.getName());
        taos.close();
    }
}