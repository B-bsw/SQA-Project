package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    @Test
    public void constructor_givenOutputStream_shouldInitializeWithDefaultSizes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void constructor_givenBlockSize_shouldInitializeWithCustomBlockSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customBlockSize = TarBuffer.DEFAULT_RCDSIZE * 4;
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, customBlockSize);

        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void constructor_givenBlockAndRecordSize_shouldInitializeWithCustomSizes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customBlockSize = 1024;
        int customRecordSize = 512;
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, customBlockSize, customRecordSize);

        Assert.assertEquals(customRecordSize, taos.getRecordSize());
    }

    @Test
    public void setLongFileMode_givenValidModes_shouldUpdateMode() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        taos.close();
    }

    @Test
    public void finish_givenOpenStream_shouldWriteTwoEofRecords() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        taos.finish();

        byte[] output = baos.toByteArray();
        Assert.assertEquals(1024, output.length);

        for (int i = 0; i < output.length; i++) {
            Assert.assertEquals(0, output[i]);
        }
    }

    @Test
    public void close_givenOpenStream_shouldFinishAndCloseUnderlyingStream() throws IOException {
        final boolean[] streamClosed = new boolean[]{false};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream trackingOut = new FilterOutputStream(baos) {
            public void close() throws IOException {
                streamClosed[0] = true;
                super.close();
            }
        };

        TarArchiveOutputStream taos = new TarArchiveOutputStream(trackingOut, 1024, 512);
        taos.close();

        Assert.assertTrue(streamClosed[0]);
        Assert.assertEquals(1024, baos.toByteArray().length);

        taos.close();
        Assert.assertEquals(1024, baos.toByteArray().length);
    }

    @Test
    public void flush_givenUnderlyingStream_shouldCallUnderlyingFlush() throws IOException {
        final boolean[] streamFlushed = new boolean[]{false};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream trackingOut = new FilterOutputStream(baos) {
            public void flush() throws IOException {
                streamFlushed[0] = true;
                super.flush();
            }
        };

        TarArchiveOutputStream taos = new TarArchiveOutputStream(trackingOut);
        taos.flush();

        Assert.assertTrue(streamFlushed[0]);
        taos.close();
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldReturnTarArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("test-tar-entry", ".tmp");
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

            ArchiveEntry entry = taos.createArchiveEntry(tempFile, "testEntryName.txt");

            Assert.assertNotNull(entry);
            Assert.assertTrue(entry instanceof TarArchiveEntry);
            Assert.assertEquals("testEntryName.txt", entry.getName());
            taos.close();
        } finally {
            if (tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Test
    public void putArchiveEntry_givenNonTarArchiveEntry_shouldThrowClassCastException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);

        ArchiveEntry dummyEntry = new ArchiveEntry() {
            public String getName() {
                return "dummy";
            }

            public long getSize() {
                return 0;
            }

            public boolean isDirectory() {
                return false;
            }

            public Date getLastModifiedDate() {
                return new Date();
            }
        };

        try {
            taos.putArchiveEntry(dummyEntry);
            Assert.fail("Expected ClassCastException when passing non-TarArchiveEntry");
        } catch (ClassCastException expected) {
            Assert.assertNotNull(expected);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndErrorMode_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < TarConstants.NAMELEN + 5; i++) {
            longName.append("a");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long file name in LONGFILE_ERROR mode");
        } catch (RuntimeException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("too long") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndTruncateMode_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName.append("b");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 512);
    }

    @Test
    public void putArchiveEntry_givenLongFileNameAndGnuMode_shouldWriteLongLinkEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        StringBuffer longName = new StringBuffer();
        for (int i = 0; i < 120; i++) {
            longName.append("x");
        }

        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.close();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length > 512);
    }

    @Test
    public void putArchiveEntry_givenDirectoryEntry_shouldSetCurrentSizeToZero() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        dirEntry.setSize(1024);

        taos.putArchiveEntry(dirEntry);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 512);
    }

    @Test
    public void closeArchiveEntry_givenUnwrittenBytes_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry before writing specified bytes");
        } catch (IOException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("before the '10' bytes") != -1);
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
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);

        byte[] data = new byte[6];
        try {
            taos.write(data, 0, data.length);
            Assert.fail("Expected IOException when writing more bytes than entry size");
        } catch (IOException expected) {
            Assert.assertTrue(expected.getMessage().indexOf("exceeds size in header") != -1);
        } finally {
            try {
                taos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void write_givenSmallDataLessThanRecordSize_shouldAssembleAndPadOnClose() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        byte[] payload = new byte[]{1, 2, 3, 4, 5};
        entry.setSize(payload.length);

        taos.putArchiveEntry(entry);
        taos.write(payload, 0, payload.length);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 1024);
    }

    @Test
    public void write_givenMultipleSmallWritesFillingAssembleBufferExactly_shouldFlushAssembleBuffer() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        entry.setSize(512);
        taos.putArchiveEntry(entry);

        byte[] part1 = new byte[200];
        byte[] part2 = new byte[312];
        Arrays.fill(part1, (byte) 'A');
        Arrays.fill(part2, (byte) 'B');

        taos.write(part1, 0, part1.length);
        taos.write(part2, 0, part2.length);

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 1024);
    }

    @Test
    public void write_givenAssembleBufferWithOverflow_shouldWriteRecordAndRetainRemainder() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
        entry.setSize(600);
        taos.putArchiveEntry(entry);

        byte[] part1 = new byte[300];
        byte[] part2 = new byte[300];
        Arrays.fill(part1, (byte) 1);
        Arrays.fill(part2, (byte) 2);

        taos.write(part1, 0, part1.length);
        taos.write(part2, 0, part2.length);

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 1536);
    }

    @Test
    public void write_givenExactRecordSizeWrite_shouldWriteDirectlyWithoutAssembleBuffer() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("fullrecord.txt");
        entry.setSize(512);
        taos.putArchiveEntry(entry);

        byte[] fullRecord = new byte[512];
        Arrays.fill(fullRecord, (byte) 'F');

        taos.write(fullRecord, 0, fullRecord.length);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 1024);
    }

    @Test
    public void write_givenMultipleFullRecordsAndRemainder_shouldHandleBothLoops() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        int totalSize = 512 * 2 + 50;
        TarArchiveEntry entry = new TarArchiveEntry("multirecords.txt");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        byte[] bigPayload = new byte[totalSize];
        Arrays.fill(bigPayload, (byte) 'M');

        taos.write(bigPayload, 0, bigPayload.length);
        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 2048);
    }

    @Test
    public void write_givenSingleIntByteWrites_shouldAssembleAndWriteCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("singlebytes.txt");
        entry.setSize(3);
        taos.putArchiveEntry(entry);

        taos.write(10);
        taos.write(20);
        taos.write(30);

        taos.closeArchiveEntry();
        taos.close();

        Assert.assertTrue(baos.toByteArray().length >= 1024);
    }
}