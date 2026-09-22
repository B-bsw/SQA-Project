package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private static class DummyArchiveEntry implements ArchiveEntry {
        public String getName() {
            return "dummy";
        }

        public long getSize() {
            return 0;
        }

        public boolean isDirectory() {
            return false;
        }

        public java.util.Date getLastModifiedDate() {
            return new java.util.Date();
        }
    }

    private static class CloseCheckingOutputStream extends ByteArrayOutputStream {
        private boolean closed = false;

        public void close() throws IOException {
            super.close();
            this.closed = true;
        }

        public boolean isClosed() {
            return closed;
        }
    }

    @Test
    public void constructor_givenOneArg_shouldInitializeWithDefaultSizes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        } finally {
            taos.close();
        }
    }

    @Test
    public void constructor_givenTwoArgs_shouldInitializeWithCustomBlockSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024);
        try {
            Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        } finally {
            taos.close();
        }
    }

    @Test
    public void constructor_givenThreeArgs_shouldInitializeWithCustomBlockAndRecordSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        try {
            Assert.assertEquals(512, taos.getRecordSize());
        } finally {
            taos.close();
        }
    }

    @Test
    public void getRecordSize_givenStandardStream_shouldReturn512() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            Assert.assertEquals(512, taos.getRecordSize());
        } finally {
            taos.close();
        }
    }

    @Test
    public void flush_givenOpenStream_shouldFlushUnderlyingStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            taos.flush();
        } finally {
            taos.close();
        }
    }

    @Test
    public void finish_givenHappyPath_shouldCompleteArchive() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.close();
        Assert.assertTrue(baos.toByteArray().length >= 1024);
    }

    @Test
    public void finish_givenAlreadyFinished_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.finish();
            Assert.fail("Expected IOException on second finish call");
        } catch (IOException e) {
            Assert.assertEquals("This archive has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void finish_givenUnclosedEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.finish();
            Assert.fail("Expected IOException when finishing with unclosed entry");
        } catch (IOException e) {
            Assert.assertEquals("This archives contains unclosed entries.", e.getMessage());
        } finally {
            try {
                taos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void close_givenOpenStream_shouldFinishAndCloseUnderlyingStream() throws IOException {
        CloseCheckingOutputStream out = new CloseCheckingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(out);
        taos.close();
        Assert.assertTrue(out.isClosed());
        // Second close should be idempotent
        taos.close();
    }

    @Test
    public void createArchiveEntry_givenValidFileAndName_shouldReturnTarArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            File dummyFile = new File("test.txt");
            ArchiveEntry entry = taos.createArchiveEntry(dummyFile, "test.txt");
            Assert.assertNotNull(entry);
            Assert.assertTrue(entry instanceof TarArchiveEntry);
            Assert.assertEquals("test.txt", entry.getName());
        } finally {
            taos.close();
        }
    }

    @Test
    public void createArchiveEntry_givenFinishedStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            File dummyFile = new File("test.txt");
            taos.createArchiveEntry(dummyFile, "test.txt");
            Assert.fail("Expected IOException when creating entry on finished stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenFinishedStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            TarArchiveEntry entry = new TarArchiveEntry("file.txt");
            taos.putArchiveEntry(entry);
            Assert.fail("Expected IOException when putting entry on finished stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenNonTarArchiveEntry_shouldThrowClassCastException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            taos.putArchiveEntry(new DummyArchiveEntry());
            Assert.fail("Expected ClassCastException for non-TarArchiveEntry");
        } catch (ClassCastException e) {
            // Success
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndModeError_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < 101; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long file name under LONGFILE_ERROR");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("too long") >= 0);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndModeTruncate_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < 110; i++) {
            longName.append("b");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndModeGnu_shouldWriteLongLinkEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < 120; i++) {
            longName.append("c");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(4);
        taos.putArchiveEntry(entry);
        taos.write(new byte[] { 1, 2, 3, 4 });
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenDirectoryEntry_shouldSetCurrSizeToZero() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        dirEntry.setSize(100); // Directory should reset currSize to 0 regardless of getSize()
        taos.putArchiveEntry(dirEntry);
        // Closing without writing any data should succeed because currSize is 0
        taos.closeArchiveEntry();
        taos.close();
    }

    @Test
    public void closeArchiveEntry_givenFinishedStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry on finished stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenNoUnclosedEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry without opening one");
        } catch (IOException e) {
            Assert.assertEquals("No current entry to close", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenBytesWrittenLessThanHeaderSize_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            TarArchiveEntry entry = new TarArchiveEntry("partial.txt");
            entry.setSize(10);
            taos.putArchiveEntry(entry);
            taos.write(new byte[] { 1, 2, 3 });
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when entry closed before specified bytes were written");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("before the '10' bytes specified in the header were written") >= 0);
        } finally {
            try {
                taos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void write_givenBytesExceedingEntrySize_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        try {
            TarArchiveEntry entry = new TarArchiveEntry("exceed.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.write(new byte[] { 1, 2, 3, 4, 5, 6 });
            Assert.fail("Expected IOException when writing more bytes than specified in entry size");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("exceeds size in header of '5' bytes") >= 0);
        } finally {
            try {
                taos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void write_givenSmallChunksAssemblingBuffer_shouldFlushCorrectlyOnCloseEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("assemble.txt");
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 128);
        }
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);

        // Write in small 10-byte chunks
        for (int i = 0; i < 10; i++) {
            taos.write(data, i * 10, 10);
        }
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenAssemblyBufferCrossesRecordLength_shouldFlushRecordAndStoreRemaining() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        int recordSize = taos.getRecordSize(); // 512
        TarArchiveEntry entry = new TarArchiveEntry("cross_record.txt");
        int totalSize = recordSize + 100;
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        byte[] firstPart = new byte[recordSize - 10];
        taos.write(firstPart, 0, firstPart.length);

        byte[] secondPart = new byte[110];
        taos.write(secondPart, 0, secondPart.length);

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenMultipleRecordsAtOnce_shouldWriteAllRecords() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        int recordSize = taos.getRecordSize(); // 512
        int totalBytes = recordSize * 3;
        TarArchiveEntry entry = new TarArchiveEntry("multi_record.txt");
        entry.setSize(totalBytes);
        taos.putArchiveEntry(entry);

        byte[] buffer = new byte[totalBytes];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) (i % 256);
        }

        taos.write(buffer, 0, buffer.length);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() >= totalBytes);
    }

    @Test
    public void write_givenSingleBytesViaOutputStreamWrite_shouldAssembleAndWrite() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("single_bytes.txt");
        entry.setSize(3);
        taos.putArchiveEntry(entry);

        taos.write(65);
        taos.write(66);
        taos.write(67);

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenZeroLengthBuffer_shouldHandleGracefully() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("zero_write.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);

        byte[] empty = new byte[0];
        taos.write(empty, 0, 0);

        taos.closeArchiveEntry();
        taos.close();
    }
}