package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private static class FlushCountingOutputStream extends ByteArrayOutputStream {
        private int flushCount = 0;
        private boolean closed = false;

        public void flush() throws IOException {
            super.flush();
            this.flushCount++;
        }

        public void close() throws IOException {
            super.close();
            this.closed = true;
        }

        public int getFlushCount() {
            return this.flushCount;
        }

        public boolean isClosed() {
            return this.closed;
        }
    }

    private static String createString(char c, int length) {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = c;
        }
        return new String(chars);
    }

    @Test
    public void constructors_givenVariousParameters_shouldInstantiateCorrectly() throws IOException {
        ByteArrayOutputStream bos1 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos1 = new TarArchiveOutputStream(bos1);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos1.getRecordSize());
        taos1.close();

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos2 = new TarArchiveOutputStream(bos2, "UTF-8");
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos2.getRecordSize());
        taos2.close();

        ByteArrayOutputStream bos3 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos3 = new TarArchiveOutputStream(bos3, TarBuffer.DEFAULT_BLKSIZE);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos3.getRecordSize());
        taos3.close();

        ByteArrayOutputStream bos4 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos4 = new TarArchiveOutputStream(bos4, TarBuffer.DEFAULT_BLKSIZE, "UTF-8");
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos4.getRecordSize());
        taos4.close();

        ByteArrayOutputStream bos5 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos5 = new TarArchiveOutputStream(bos5, TarBuffer.DEFAULT_BLKSIZE, 1024);
        Assert.assertEquals(1024, taos5.getRecordSize());
        taos5.close();

        ByteArrayOutputStream bos6 = new ByteArrayOutputStream();
        TarArchiveOutputStream taos6 = new TarArchiveOutputStream(bos6, TarBuffer.DEFAULT_BLKSIZE, 1024, "UTF-8");
        Assert.assertEquals(1024, taos6.getRecordSize());
        taos6.close();
    }

    @Test
    public void putArchiveEntry_givenSimpleFileEntry_shouldWriteSuccessfully() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] content = "Hello World".getBytes("UTF-8");
        entry.setSize(content.length);

        taos.putArchiveEntry(entry);
        taos.write(content);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(taos.getBytesWritten() > 0);
        Assert.assertEquals((int) taos.getBytesWritten(), taos.getCount());
    }

    @Test
    public void putArchiveEntry_givenDirectoryEntry_shouldHaveZeroCurrSize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry dirEntry = new TarArchiveEntry("testDir/");
        dirEntry.setSize(12345);

        taos.putArchiveEntry(dirEntry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenFinishedStream_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();

        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            taos.putArchiveEntry(entry);
            Assert.fail("Expected IOException when putting entry after finish");
        } catch (IOException e) {
            Assert.assertEquals("Stream has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongNameAndModeError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        String longName = createString('a', 101);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long file name");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("is too long") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenLongNameAndModeTruncate_shouldTruncateAndSucceed() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        String longName = createString('a', 120);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenLongNameAndModeGNU_shouldWriteLongLink() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longName = createString('g', 150);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenLongNameAndModePOSIX_shouldWritePaxHeader() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);

        String longName = createString('p', 150);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenNonAsciiNameWithAddPaxHeader_shouldAddPaxHeader() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        TarArchiveEntry entry = new TarArchiveEntry("test-\u00e9\u00e0.txt");
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenLinkWithNonAsciiLinkName_shouldAddPaxHeader() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        TarArchiveEntry entry = new TarArchiveEntry("link.txt", TarConstants.LF_SYMLINK);
        entry.setLinkName("target-\u00e9.txt");
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenHardLinkWithNonAsciiLinkName_shouldAddPaxHeader() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        TarArchiveEntry entry = new TarArchiveEntry("hlink.txt", TarConstants.LF_LINK);
        entry.setLinkName("target-\u00df.txt");
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenBigSizeAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigfile.bin");
        entry.setSize(TarConstants.MAXSIZE + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for size overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("entry size") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenNegativeSizeAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("bigfile.bin");
        entry.setSize(-1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for negative size");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("entry size") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigGroupIdAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(0);
        entry.setGroupId(TarConstants.MAXID + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for group id overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("group id") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigUserIdAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(0);
        entry.setUserId(TarConstants.MAXID + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for user id overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("user id") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigModTimeAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(0);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 10L) * 1000L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for mod time overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("last modification time") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigModeAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(0);
        entry.setMode((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for mode overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("mode") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigDevMajorAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("dev", TarConstants.LF_CHR);
        entry.setSize(0);
        entry.setDevMajor((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for devmajor overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("major device number") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigDevMinorAndBigNumberError_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("dev", TarConstants.LF_CHR);
        entry.setSize(0);
        entry.setDevMinor((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for devminor overflow");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("minor device number") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigNumbersAndModePOSIX_shouldWritePaxHeaders() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("bigfile.bin", TarConstants.LF_CHR);
        entry.setSize(TarConstants.MAXSIZE + 100L);
        entry.setGroupId(TarConstants.MAXID + 10L);
        entry.setUserId(TarConstants.MAXID + 20L);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 50L) * 1000L));
        entry.setDevMajor((int) (TarConstants.MAXID + 30L));
        entry.setDevMinor((int) (TarConstants.MAXID + 40L));

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenBigNumbersAndModePOSIX_modeTooBig_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("bigmode.bin");
        entry.setSize(0);
        entry.setMode((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for mode overflow in POSIX mode");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("mode") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenBigNumbersAndModeSTAR_shouldSucceed() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);

        TarArchiveEntry entry = new TarArchiveEntry("star.bin");
        entry.setSize(TarConstants.MAXSIZE + 500L);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void closeArchiveEntry_givenFinishedStream_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
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
    public void closeArchiveEntry_givenNoUnclosedEntry_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when no entry is open");
        } catch (IOException e) {
            Assert.assertEquals("No current entry to close", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenUnderwrittenBytes_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("underwrite.txt");
        entry.setSize(100);
        taos.putArchiveEntry(entry);
        taos.write("Short".getBytes("UTF-8"));

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException for premature close");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("before the '100' bytes specified") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void write_givenDataExceedingEntrySize_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);

        byte[] overflow = new byte[6];
        try {
            taos.write(overflow, 0, overflow.length);
            Assert.fail("Expected IOException when writing more bytes than entry size");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("exceeds size in header") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void write_givenMultipleChunksFillingRecordBuffer_shouldBufferAndFlushCorrectly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        int recordSize = taos.getRecordSize();

        int totalSize = recordSize * 2 + 150;
        TarArchiveEntry entry = new TarArchiveEntry("chunks.bin");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        byte[] part1 = new byte[recordSize / 2];
        byte[] part2 = new byte[recordSize / 2 + 10];
        byte[] part3 = new byte[totalSize - part1.length - part2.length];

        taos.write(part1);
        taos.write(part2);
        taos.write(part3);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertEquals(totalSize, entry.getSize());
        Assert.assertTrue(bos.size() > totalSize);
    }

    @Test
    public void write_givenLargeBufferExceedingRecordSizeDirectly_shouldWriteFullRecords() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        int recordSize = taos.getRecordSize();

        int totalSize = recordSize * 3;
        TarArchiveEntry entry = new TarArchiveEntry("direct.bin");
        entry.setSize(totalSize);
        taos.putArchiveEntry(entry);

        byte[] largeData = new byte[totalSize];
        taos.write(largeData, 0, largeData.length);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() >= totalSize);
    }

    @Test
    public void finish_givenUnclosedEntry_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);

        try {
            taos.finish();
            Assert.fail("Expected IOException when finishing with unclosed entry");
        } catch (IOException e) {
            Assert.assertEquals("This archives contains unclosed entries.", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void finish_givenAlreadyFinished_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();

        try {
            taos.finish();
            Assert.fail("Expected IOException when calling finish() twice");
        } catch (IOException e) {
            Assert.assertEquals("This archive has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void close_givenUnfinishedArchive_shouldFinishAndCloseStreams() throws IOException {
        FlushCountingOutputStream fcos = new FlushCountingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(fcos);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();

        taos.close();

        Assert.assertTrue(fcos.isClosed());
        Assert.assertTrue(fcos.size() > 0);

        taos.close();
    }

    @Test
    public void flush_givenCall_shouldFlushUnderlyingStream() throws IOException {
        FlushCountingOutputStream fcos = new FlushCountingOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(fcos);

        int initialFlush = fcos.getFlushCount();
        taos.flush();
        Assert.assertEquals(initialFlush + 1, fcos.getFlushCount());

        taos.finish();
        taos.close();
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldReturnCorrectEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        File dummyFile = new File("someNonExistentTestFile.txt");
        org.apache.commons.compress.archivers.ArchiveEntry entry = taos.createArchiveEntry(dummyFile, "customName.txt");

        Assert.assertNotNull(entry);
        Assert.assertEquals("customName.txt", entry.getName());
        taos.finish();
        taos.close();
    }

    @Test
    public void createArchiveEntry_givenFinishedStream_shouldThrowException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();

        try {
            File dummyFile = new File("test.txt");
            taos.createArchiveEntry(dummyFile, "test.txt");
            Assert.fail("Expected IOException when creating archive entry on finished stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream has already been finished", e.getMessage());
        } finally {
            taos.close();
        }
    }

    @Test
    public void writePaxHeaders_givenLongEntryNameAndSpecialLengths_shouldAdjustLineLengthCorrectly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        String longEntryName = createString('a', 150);
        Map headers = new HashMap();
        headers.put("longKey", createString('v', 85));
        headers.put("keyWithUtf8", "\u00e9\u00e8\u00ea\u00eb");

        taos.writePaxHeaders(longEntryName, headers);
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void writePaxHeaders_givenNameWithNullCharacters_shouldStripTo7BitsProperly() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);

        String nameWithNulls = "a\0b\0c";
        Map headers = new HashMap();
        headers.put("testKey", "testVal");

        taos.writePaxHeaders(nameWithNulls, headers);
        taos.finish();
        taos.close();

        Assert.assertTrue(bos.size() > 0);
    }
}