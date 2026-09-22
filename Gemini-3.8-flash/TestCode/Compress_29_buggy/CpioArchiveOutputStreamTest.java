package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveOutputStreamTest {

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

    private static class CloseDetectingOutputStream extends OutputStream {
        private boolean closed = false;
        private final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        public void write(int b) throws IOException {
            baos.write(b);
        }

        public void write(byte[] b, int off, int len) throws IOException {
            baos.write(b, off, len);
        }

        public void close() throws IOException {
            this.closed = true;
            super.close();
        }

        public boolean isClosed() {
            return closed;
        }

        public byte[] toByteArray() {
            return baos.toByteArray();
        }
    }

    @Test
    public void constructor_givenInvalidFormat_shouldThrowIllegalArgumentException() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            new CpioArchiveOutputStream(baos, (short) 999);
            Assert.fail("Expected IllegalArgumentException for unknown format");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unknown format") != -1);
        }
    }

    @Test
    public void constructor_givenFormatNewCrc_shouldInitializeCorrectly() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void constructor_givenFormatOldAsciiAndBlockSize_shouldInitializeCorrectly() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII, 512);
        out.close();
        Assert.assertEquals(512, baos.size());
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldUseFormatNew() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void constructor_givenEncodingConstructor_shouldInitialize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, "UTF-8");
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenNonCpioArchiveEntry_shouldThrowClassCastException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        try {
            out.putArchiveEntry(new DummyArchiveEntry());
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            Assert.assertNotNull(e);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenMismatchedFormat_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "test.txt");
        try {
            out.putArchiveEntry(entry);
            Assert.fail("Expected IOException due to format mismatch");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("does not match existing format") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenDuplicateEntryName_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry1.setSize(0);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file.txt");
        entry2.setSize(0);
        try {
            out.putArchiveEntry(entry2);
            Assert.fail("Expected IOException for duplicate entry");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("duplicate entry") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenPreviousUnclosedEntry_shouldAutoClosePreviousEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt");
        entry1.setSize(0);
        out.putArchiveEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file2.txt");
        entry2.setSize(0);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenEntryWithUnsetTime_shouldSetCurrentTime() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt");
        entry.setSize(0);
        entry.setTime(-1);
        out.putArchiveEntry(entry);
        Assert.assertTrue(entry.getTime() > 0);
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void putArchiveEntry_givenExplicitDeviceAndInodeFormatNew_shouldUpdateArtificialCounter() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "file1.txt");
        entry.setSize(0);
        entry.setInode(10);
        entry.setDeviceMin(2);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenFormatOldAsciiWithZeroAndNonZeroInode_shouldSucceed() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "zero.txt");
        entry1.setSize(0);
        entry1.setInode(0);
        entry1.setDevice(0);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "nonzero.txt");
        entry2.setSize(0);
        entry2.setInode(02000000L);
        entry2.setDevice(5);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();

        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenFormatOldBinaryWithZeroAndNonZeroInode_shouldSucceed() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "zero.txt");
        entry1.setSize(0);
        entry1.setInode(0);
        entry1.setDevice(0);
        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY, "nonzero.txt");
        entry2.setSize(0);
        entry2.setInode(20);
        entry2.setDevice(3);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();

        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenValidData_shouldWriteSuccessfully() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "data.txt");
        byte[] content = new byte[] { 1, 2, 3, 4, 5 };
        entry.setSize(content.length);
        out.putArchiveEntry(entry);
        out.write(content, 0, content.length);
        out.closeArchiveEntry();
        out.close();

        Assert.assertTrue(out.getBytesWritten() > content.length);
    }

    @Test
    public void write_givenLenZero_shouldReturnWithoutWriting() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "zero.txt");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        long writtenBefore = out.getBytesWritten();
        out.write(new byte[10], 0, 0);
        Assert.assertEquals(writtenBefore, out.getBytesWritten());
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void write_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[10], -1, 5);
            Assert.fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertNotNull(e);
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[10], 0, -1);
            Assert.fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertNotNull(e);
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenOffsetPastEnd_shouldThrowIndexOutOfBoundsException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[10], 8, 5);
            Assert.fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertNotNull(e);
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenNoCurrentEntry_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[] { 1, 2, 3 }, 0, 3);
            Assert.fail("Expected IOException because no entry was started");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("no current CPIO entry") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenBytesExceedingSize_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "small.txt");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        try {
            out.write(new byte[] { 1, 2, 3 }, 0, 3);
            Assert.fail("Expected IOException when writing past end of entry");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("attempt to write past end") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenNoActiveEntry_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException when closing nonexistent entry");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("non-existent entry") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenSizeMismatch_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "mismatch.txt");
        entry.setSize(10);
        out.putArchiveEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);
        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException for size mismatch");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("invalid entry size") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenNewCrcFormatWithCorrectCrc_shouldSucceed() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "crc.txt");
        byte[] data = new byte[] { 10, 20, 30 };
        long expectedCrc = 10 + 20 + 30;
        entry.setSize(data.length);
        entry.setChksum(expectedCrc);
        out.putArchiveEntry(entry);
        out.write(data, 0, data.length);
        out.closeArchiveEntry();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void closeArchiveEntry_givenNewCrcFormatWithWrongCrc_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC, "wrong_crc.txt");
        byte[] data = new byte[] { 10, 20, 30 };
        entry.setSize(data.length);
        entry.setChksum(999);
        out.putArchiveEntry(entry);
        out.write(data, 0, data.length);
        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException for CRC Error");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("CRC Error") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void finish_givenActiveEntryNotClosed_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "active.txt");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        try {
            out.finish();
            Assert.fail("Expected IOException for unclosed entries");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("unclosed entries") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void finish_givenAlreadyFinished_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        try {
            out.finish();
            Assert.fail("Expected IOException on subsequent finish()");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("already been finished") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenAlreadyFinished_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "late.txt");
        try {
            out.putArchiveEntry(entry);
            Assert.fail("Expected IOException when putting entry after finish()");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("already been finished") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenAlreadyFinished_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException when closing entry after finish()");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("already been finished") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void createArchiveEntry_givenAlreadyFinished_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        try {
            out.createArchiveEntry(new File("test"), "test");
            Assert.fail("Expected IOException when createArchiveEntry after finish()");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("already been finished") != -1);
        } finally {
            out.close();
        }
    }

    @Test
    public void createArchiveEntry_givenActiveStream_shouldCreateEntrySuccessfully() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        File tempFile = File.createTempFile("cpio_test", ".tmp");
        tempFile.deleteOnExit();
        try {
            ArchiveEntry created = out.createArchiveEntry(tempFile, "entryName");
            Assert.assertNotNull(created);
            Assert.assertEquals("entryName", created.getName());
        } finally {
            out.close();
            tempFile.delete();
        }
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingStream() throws Exception {
        CloseDetectingOutputStream cdos = new CloseDetectingOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(cdos, CpioConstants.FORMAT_NEW);
        Assert.assertFalse(cdos.isClosed());
        out.close();
        Assert.assertTrue(cdos.isClosed());
    }

    @Test
    public void close_givenCalledMultipleTimes_shouldNotThrowException() throws Exception {
        CloseDetectingOutputStream cdos = new CloseDetectingOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(cdos, CpioConstants.FORMAT_NEW);
        out.close();
        out.close();
        Assert.assertTrue(cdos.isClosed());
    }

    @Test
    public void operations_givenClosedStream_shouldThrowStreamClosedIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();

        try {
            out.finish();
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Stream closed") != -1);
        }

        try {
            out.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "closed.txt"));
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Stream closed") != -1);
        }

        try {
            out.write(new byte[] { 1 }, 0, 1);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Stream closed") != -1);
        }
    }

    @Test
    public void finish_givenCustomBlockSize_shouldPadToBlockBoundary() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customBlockSize = 1024;
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW, customBlockSize);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test_pad.txt");
        byte[] content = "Hello CPIO Padding".getBytes("US-ASCII");
        entry.setSize(content.length);
        out.putArchiveEntry(entry);
        out.write(content, 0, content.length);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        Assert.assertEquals(0, baos.size() % customBlockSize);
    }
}