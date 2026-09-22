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

    private static class CloseTrackerOutputStream extends ByteArrayOutputStream {
        private boolean closed = false;

        @Override
        public void close() throws IOException {
            this.closed = true;
            super.close();
        }

        public boolean isClosed() {
            return closed;
        }
    }

    private static String createString(int length, char fillChar) {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = fillChar;
        }
        return new String(chars);
    }

    @Test
    public void constructors_givenVariousParameters_shouldInitializeCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        TarArchiveOutputStream taos1 = new TarArchiveOutputStream(baos);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, taos1.getRecordSize());
        taos1.close();

        TarArchiveOutputStream taos2 = new TarArchiveOutputStream(new ByteArrayOutputStream(), "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, taos2.getRecordSize());
        taos2.close();

        TarArchiveOutputStream taos3 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, taos3.getRecordSize());
        taos3.close();

        TarArchiveOutputStream taos4 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, taos4.getRecordSize());
        taos4.close();

        TarArchiveOutputStream taos5 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 512);
        Assert.assertEquals(512, taos5.getRecordSize());
        taos5.close();

        TarArchiveOutputStream taos6 = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 512, "UTF-8");
        Assert.assertEquals(512, taos6.getRecordSize());
        taos6.close();
    }

    @Test
    public void finish_givenEmptyArchive_shouldPadToBlockAndSetCounts() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        taos.finish();
        taos.close();

        Assert.assertEquals(1024, taos.getBytesWritten());
        Assert.assertEquals(1024, taos.getCount());
        Assert.assertEquals(1024, baos.size());
    }

    @Test
    public void finish_whenCalledTwice_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.finish();

        try {
            taos.finish();
            Assert.fail("Expected IOException when calling finish twice");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("archive has already been finished") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void finish_withUnclosedEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        taos.putArchiveEntry(entry);

        try {
            taos.finish();
            Assert.fail("Expected IOException when archive contains unclosed entries");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("unclosed entries") != -1);
        } finally {
            taos.closeArchiveEntry();
            taos.close();
        }
    }

    @Test
    public void close_whenCalledMultipleTimes_shouldOnlyCloseOnce() throws IOException {
        CloseTrackerOutputStream ctos = new CloseTrackerOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(ctos, 1024, 512);

        taos.close();
        Assert.assertTrue(ctos.isClosed());
        taos.close();
        Assert.assertTrue(ctos.isClosed());
    }

    @Test
    public void putArchiveEntry_whenFinished_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.finish();

        try {
            taos.putArchiveEntry(new TarArchiveEntry("test.txt"));
            Assert.fail("Expected IOException when putting entry into finished archive");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("finished") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_whenFinished_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.finish();

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry on finished archive");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("finished") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_whenNoCurrentEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when no entry to close");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("No current entry to close") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void closeArchiveEntry_whenEntryDataIncomplete_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[]{1, 2, 3});

        try {
            taos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry before size written");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("before the '10' bytes specified") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void write_withoutActiveEntry_shouldThrowIllegalStateException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        try {
            taos.write(new byte[]{1, 2, 3});
            Assert.fail("Expected IllegalStateException when writing without active entry");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().indexOf("No current tar entry") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void write_exceedingEntrySize_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(2);
        taos.putArchiveEntry(entry);

        try {
            taos.write(new byte[]{1, 2, 3});
            Assert.fail("Expected IOException when writing more bytes than specified in header");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("exceeds size in header") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void write_withAssembledBufferAndExactBlock_shouldFlushCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("file.bin");
        entry.setSize(1500);
        taos.putArchiveEntry(entry);

        byte[] chunk1 = new byte[100];
        taos.write(chunk1, 0, 100);

        byte[] chunk2 = new byte[412];
        taos.write(chunk2, 0, 412);

        byte[] chunk3 = new byte[600];
        taos.write(chunk3, 0, 600);

        byte[] chunk4 = new byte[388];
        taos.write(chunk4, 0, 388);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertEquals(0, taos.getBytesWritten() % 1024);
    }

    @Test
    public void putArchiveEntry_forDirectory_shouldTreatSizeAsZero() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry dirEntry = new TarArchiveEntry("my-dir/");
        dirEntry.setSize(500);
        taos.putArchiveEntry(dirEntry);

        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
    }

    @Test
    public void createArchiveEntry_whenActive_shouldReturnNewEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        File tempFile = File.createTempFile("tartest", ".tmp");
        tempFile.deleteOnExit();

        try {
            TarArchiveEntry entry = (TarArchiveEntry) taos.createArchiveEntry(tempFile, "tempEntry");
            Assert.assertNotNull(entry);
            Assert.assertEquals("tempEntry", entry.getName());
        } finally {
            taos.close();
            tempFile.delete();
        }
    }

    @Test
    public void createArchiveEntry_whenFinished_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        File tempFile = File.createTempFile("tartest", ".tmp");
        tempFile.deleteOnExit();

        taos.finish();
        try {
            taos.createArchiveEntry(tempFile, "tempEntry");
            Assert.fail("Expected IOException when createArchiveEntry called after finish");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("finished") != -1);
        } finally {
            taos.close();
            tempFile.delete();
        }
    }

    @Test
    public void flush_shouldPropagateToUnderlyingStream() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.flush();
        taos.close();
    }

    @Test
    public void longName_modeError_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        String longName = createString(105, 'a');
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long file name in ERROR mode");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("too long") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void longLinkName_modeError_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("short_name");
        entry.setSize(0);
        entry.setLinkName(createString(105, 'l'));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for long link name in ERROR mode");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("too long") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void longName_modeTruncate_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        String longName = createString(105, 'b');
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
    }

    @Test
    public void longName_modeGnu_shouldWriteLongLinkEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        String longName = createString(120, 'g');
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        entry.setModTime(new Date(123456000L));

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 1024);
    }

    @Test
    public void longLinkName_modeGnu_shouldWriteLongLinkEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(0);
        entry.setLinkName(createString(110, 'k'));

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 1024);
    }

    @Test
    public void longName_modePosix_shouldWritePaxHeaders() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);

        String longName = createString(105, 'p');
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        entry.setLinkName(createString(105, 'q'));

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 1024);
    }

    @Test
    public void bigNumbers_modeError_sizeTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for size > MAXSIZE");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("entry size") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_gidTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setGroupId(TarConstants.MAXID + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for gid > MAXID");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("group id") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_mtimeTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 10L) * 1000L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for mtime > MAXSIZE");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("last modification time") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_uidTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setUserId(TarConstants.MAXID + 1L);

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for uid > MAXID");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("user id") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_modeTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setMode((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for mode > MAXID");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("mode") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_devMajorTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setDevMajor((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for devmajor > MAXID");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("major device number") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeError_devMinorTooBig_shouldThrowRuntimeException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setDevMinor((int) (TarConstants.MAXID + 1L));

        try {
            taos.putArchiveEntry(entry);
            Assert.fail("Expected RuntimeException for devminor > MAXID");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("minor device number") != -1);
        } finally {
            taos.close();
        }
    }

    @Test
    public void bigNumbers_modeStar_shouldSucceedWithoutPaxHeader() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 100L);
        entry.setGroupId(TarConstants.MAXID + 10L);
        entry.setUserId(TarConstants.MAXID + 20L);

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void bigNumbers_modePosix_shouldAddPaxHeadersForBigFields() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);

        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 100L);
        entry.setGroupId(TarConstants.MAXID + 10L);
        entry.setUserId(TarConstants.MAXID + 20L);
        entry.setModTime(new Date((TarConstants.MAXSIZE + 50L) * 1000L));
        entry.setDevMajor((int) (TarConstants.MAXID + 5L));
        entry.setDevMinor((int) (TarConstants.MAXID + 6L));

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 1024);
    }

    @Test
    public void addPaxHeadersForNonAsciiNames_whenEnabled_shouldAddPaxHeadersForNames() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        taos.setAddPaxHeadersForNonAsciiNames(true);

        String nonAsciiName = "file-\u00fc\u00e9\u00e0.txt";
        TarArchiveEntry entry = new TarArchiveEntry(nonAsciiName, TarConstants.LF_SYMLINK);
        entry.setSize(0);
        entry.setLinkName("link-\u00df\u00e4.txt");

        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 1024);
    }

    @Test
    public void writePaxHeaders_longPexHeaderName_shouldTruncateTo99Chars() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("entry");
        entry.setSize(0);
        entry.setModTime(new Date(-10000L));

        String longName = createString(120, 'z') + "/\\";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("key", "val");

        taos.writePaxHeaders(entry, longName, headers);
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void writePaxHeaders_multiByteCharacters_shouldRecalculateLineLength() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);

        TarArchiveEntry entry = new TarArchiveEntry("entry");
        entry.setSize(0);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("comment", "\u3042\u3044\u3046\u3048\u304a\u304b\u304d\u304f\u3051\u3053");

        taos.writePaxHeaders(entry, "entry", headers);
        taos.finish();
        taos.close();

        Assert.assertTrue(baos.size() > 0);
    }
}