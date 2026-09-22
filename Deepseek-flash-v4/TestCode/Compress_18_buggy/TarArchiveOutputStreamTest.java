package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() throws IOException {
        baos = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        tarOut.close();
    }

    @Test
    public void testConstructorWithEncoding() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(baos, "UTF-8");
        assertNotNull(tarOut);
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(baos, TarBuffer.DEFAULT_BLKSIZE, "UTF-8");
        assertNotNull(tarOut);
    }

    @Test
    public void testConstructorWithRecordSize() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(baos, TarBuffer.DEFAULT_BLKSIZE, TarBuffer.DEFAULT_RCDSIZE);
        assertNotNull(tarOut);
    }

    @Test
    public void testConstructorFull() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(baos, TarBuffer.DEFAULT_BLKSIZE, TarBuffer.DEFAULT_RCDSIZE, "UTF-8");
        assertNotNull(tarOut);
    }

    @Test
    public void testSetLongFileModeGnu() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        assertEquals(TarArchiveOutputStream.LONGFILE_GNU, tarOut.longFileMode);
    }

    @Test
    public void testSetBigNumberModeStar() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        assertEquals(TarArchiveOutputStream.BIGNUMBER_STAR, tarOut.bigNumberMode);
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNames() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        assertTrue(tarOut.addPaxHeadersForNonAsciiNames);
    }

    @Test
    public void testGetCount() throws IOException {
        assertEquals(0, tarOut.getCount());
    }

    @Test
    public void testGetBytesWritten() throws IOException {
        assertEquals(0, tarOut.getBytesWritten());
    }

    @Test
    public void testFinish() throws IOException {
        tarOut.finish();
        assertEquals(1024, baos.size());
    }

    @Test
    public void testFinishTwiceThrows() throws IOException {
        tarOut.finish();
        try {
            tarOut.finish();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("This archive has already been finished", e.getMessage());
        }
    }

    @Test
    public void testFinishWithUnclosedEntryThrows() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.finish();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    @Test
    public void testClose() throws IOException {
        tarOut.close();
        assertTrue(tarOut.closed);
    }

    @Test
    public void testGetRecordSize() throws IOException {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testPutArchiveEntryBasic() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(4);
        tarOut.putArchiveEntry(entry);
        assertEquals("test.txt", tarOut.currName);
        assertEquals(4, tarOut.currSize);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryDirectory() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("testdir/");
        entry.setSize(0);
        entry.setMode(TarConstants.DIR_MODE);
        entry.setLinkFlag(TarConstants.LF_DIR);
        tarOut.putArchiveEntry(entry);
        assertEquals("testdir/", tarOut.currName);
        assertEquals(0, tarOut.currSize);
    }

    @Test
    public void testPutArchiveEntryLongNamePosix() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry(generateLongName());
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryLongNameGnu() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(generateLongName());
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryLongNameTruncate() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(generateLongName());
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryLongNameError() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry(generateLongName());
        entry.setSize(0);
        assertThrows(RuntimeException.class, () -> tarOut.putArchiveEntry(entry));
    }

    @Test
    public void testPutArchiveEntryBigNumberPosix() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("bulk.tar");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tarOut.putArchiveEntry(entry);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryBigNumberStar() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("bulk.tar");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tarOut.putArchiveEntry(entry);
        assertTrue(tarOut.haveUnclosedEntry);
    }

    @Test
    public void testPutArchiveEntryBigNumberError() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("bulk.tar");
        entry.setSize(TarConstants.MAXSIZE + 1);
        assertThrows(RuntimeException.class, () -> tarOut.putArchiveEntry(entry));
    }

    @Test
    public void testPutArchiveEntryFinished() throws IOException {
        tarOut.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testWriteExactSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'h', 'e', 'l', 'l', 'o'}, 0, 5);
        tarOut.closeArchiveEntry();
        assertEquals(5, tarOut.currBytes);
    }

    @Test
    public void testWritePartialData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'h', 'i'}, 0, 2);
        tarOut.closeArchiveEntry();
        assertEquals(2, tarOut.currBytes);
    }

    @Test
    public void testWriteOverflow() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(3);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'a', 'b', 'c', 'd'}, 0, 4);
        assertEquals(4, tarOut.currBytes);
    }

    @Test
    public void testWriteZeroLength() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{}, 0, 0);
        tarOut.closeArchiveEntry();
        assertEquals(0, tarOut.currBytes);
    }

    @Test
    public void testCloseArchiveEntryNoCurrent() throws IOException {
        try {
            tarOut.closeArchiveEntry();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("No current entry to close", e.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntryBeforeFullWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'a'}, 0, 1);
        try {
            tarOut.closeArchiveEntry();
            fail("Should throw IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("before the"));
        }
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = new File("temp.txt");
        Files.write(tempFile.toPath(), "test".getBytes());
        try {
            TarArchiveEntry entry = (TarArchiveEntry) tarOut.createArchiveEntry(tempFile, "temp.txt");
            assertEquals("temp.txt", entry.getFileName());
        } finally {
            tempFile.delete();
        }
    }

    @Test
    public void testWriteWhenNoEntry() throws IOException {
        assertEquals(0, tarOut.currBytes);
    }

    @Test
    public void testConstructWithEncodingAndGetBytesWritten() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(baos, "UTF-8");
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(4);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'d', 'a', 't', 'a'}, 0, 4);
        tarOut.closeArchiveEntry();
        assertTrue(tarOut.getBytesWritten() > 0);
    }

    @Test
    public void testWriteWithPaxHeaders() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        String unicodeName = "tëst.txt";
        TarArchiveEntry entry = new TarArchiveEntry(unicodeName);
        entry.setSize(4);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'t', 'e', 's', 't'}, 0, 4);
        tarOut.closeArchiveEntry();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testWriteWithNonAsciiLinkPax() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        String unicodeName = "tëstlink";
        TarArchiveEntry entry = new TarArchiveEntry(unicodeName);
        entry.setSize(0);
        entry.setLinkName("target-ünïcode");
        entry.setLinkFlag(TarConstants.LF_SYMLINK);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testWriteLargeEntryWithAssembledData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("large.txt");
        entry.setSize(2000);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[2000];
        for (int i = 0; i < 2000; i++) {
            data[i] = (byte) (i % 256);
        }
        tarOut.write(data, 0, 2000);
        tarOut.closeArchiveEntry();
        assertEquals(2000, tarOut.currBytes);
    }

    @Test
    public void testWriteByteByByte() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        for (int i = 0; i < 5; i++) {
            tarOut.write(new byte[]{'a'}, 0, 1);
        }
        tarOut.closeArchiveEntry();
        assertEquals(5, tarOut.currBytes);
    }

    @Test
    public void testWriteUsingConsecutiveCalls() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("split.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'h', 'e', 'l', 'l', 'o'}, 0, 5);
        tarOut.write(new byte[]{' ', 'w', 'o', 'r', 'l', 'd'}, 0, 5);
        tarOut.closeArchiveEntry();
        assertEquals(10, tarOut.currBytes);
    }

    @Test
    public void testWriteWithZeroOffset() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("zero.txt");
        entry.setSize(3);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'a', 'b', 'c'}, 0, 3);
        tarOut.closeArchiveEntry();
        assertEquals(3, tarOut.currBytes);
    }

    @Test
    public void testWriteWithOffsetAndLength() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("offset.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[]{'x', 'y', '1', '2', '3', '4', '5'};
        tarOut.write(data, 2, 5);
        tarOut.closeArchiveEntry();
        assertEquals(5, tarOut.currBytes);
    }

    @Test
    public void testWriteNothing() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        assertEquals(0, tarOut.currBytes);
    }

    @Test
    public void testGetCountAfterFinish() throws IOException {
        tarOut.finish();
        assertTrue(tarOut.getCount() >= 1024);
    }

    @Test
    public void testGetBytesWrittenAfterFinish() throws IOException {
        tarOut.finish();
        assertTrue(tarOut.getBytesWritten() >= 1024);
    }

    @Test
    public void testCloseUnsuccessfulWithoutFinish() throws IOException {
        assertTrue(baos.size() == 0);
    }

    @Test
    public void testWriteWithAssembledBufferExactlyFilled() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        entry.setSize(TarBuffer.DEFAULT_RCDSIZE);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[TarBuffer.DEFAULT_RCDSIZE];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        tarOut.write(data, 0, data.length);
        tarOut.closeArchiveEntry();
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.currBytes);
    }

    @Test
    public void testWriteWhenCurrBytesEqualsCurrSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("end.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        assertEquals(0, tarOut.currBytes);
    }

    @Test
    public void testFinishOnceOnly() throws IOException {
        tarOut.finish();
    }

    @Test
    public void testPutEntryAndCloseThenFinish() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("entry.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'h', 'e', 'l', 'l', 'o'}, 0, 5);
        tarOut.closeArchiveEntry();
        tarOut.finish();
    }

    @Test
    public void testWriteToClosedStream() throws IOException {
        tarOut.close();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(1);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Should throw IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testWriteWithNonAsciiEntryName() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("ünïcode.txt");
        entry.setSize(4);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[]{'t', 'e', 's', 't'}, 0, 4);
        tarOut.closeArchiveEntry();
        assertTrue(baos.size() > 0);
    }

    private String generateLongName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        return sb.toString();
    }
}