package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream byteOut;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() {
        byteOut = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(byteOut);
    }

    @After
    public void tearDown() throws IOException {
        if (tarOut != null) {
            tarOut.close();
        }
    }

    @Test
    public void testConstructorDefaultRecordSize() {
        assertEquals(512, tarOut.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() {
        TarArchiveOutputStream customOut = new TarArchiveOutputStream(byteOut, 2048, 512);
        assertEquals(512, customOut.getRecordSize());
        customOut.close();
    }

    @Test
    public void testConstructorWithBlockSizeStringEncoding() {
        TarArchiveOutputStream customOut = new TarArchiveOutputStream(byteOut, 1024, "UTF-8");
        assertEquals(512, customOut.getRecordSize());
        customOut.close();
    }

    @Test
    public void testSetLongFileMode() {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        // No exception expected for valid values
    }

    @Test
    public void testSetBigNumberMode() {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        // No exception expected for valid values
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNames() {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        tarOut.setAddPaxHeadersForNonAsciiNames(false);
    }

    @Test
    public void testFinishEmptyArchive() throws IOException {
        tarOut.finish();
        byte[] result = byteOut.toByteArray();
        // Two 512-byte zero blocks at the end
        assertEquals(1024, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(0, result[i]);
        }
    }

    @Test
    public void testFinishWhenAlreadyFinished() throws IOException {
        tarOut.finish();
        try {
            tarOut.finish();
            fail("Should throw IOException when finishing twice");
        } catch (IOException e) {
            assertEquals("This archive has already been finished", e.getMessage());
        }
    }

    @Test
    public void testFinishWithUnclosedEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.finish();
            fail("Should throw IOException with unclosed entries");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCloseCallsFinish() throws IOException {
        tarOut.close();
        byte[] result = byteOut.toByteArray();
        assertEquals(1024, result.length);
    }

    @Test
    public void testCloseTwice() throws IOException {
        tarOut.close();
        tarOut.close();
        // Should not throw exception
    }

    @Test
    public void testGetBytesWritten() throws IOException {
        assertEquals(0, tarOut.getBytesWritten());
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.finish();
        assertTrue(tarOut.getBytesWritten() > 0);
    }

    @Test
    public void testGetCountDeprecated() throws IOException {
        assertEquals(0, tarOut.getCount());
    }

    @Test
    public void testPutArchiveEntryWithFinishedStream() throws IOException {
        tarOut.finish();
        try {
            tarOut.putArchiveEntry(new TarArchiveEntry("test.txt"));
            fail("Should throw IOException when putting entry after finish");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntrySimpleEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        byte[] result = byteOut.toByteArray();
        assertTrue(result.length >= 1024);
    }

    @Test
    public void testPutArchiveEntryDirectory() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        entry.setSize(0);
        entry.setMode(TarArchiveEntry.DIR_MODE);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        byte[] result = byteOut.toByteArray();
        assertTrue(result.length >= 1024);
    }

    @Test
    public void testPutArchiveEntryFileWithData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        String content = "Hello World!";
        byte[] data = content.getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.finish();
        byte[] result = byteOut.toByteArray();
        assertTrue(result.length > data.length + 2048);
    }

    @Test
    public void testPutArchiveEntryLongFileNameGNU() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("x");
        }
        String longName = sb.toString();
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryLongFileNamePOSIX() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("x");
        }
        String longName = sb.toString();
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryLongFileNameTruncate() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("x");
        }
        String longName = sb.toString();
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryLongFileNameError() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("x");
        }
        String longName = sb.toString();
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Should throw IOException for long file name in error mode");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryWithBigNumberModePosix() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(10);
        entry.setGroupId(999999999L);
        entry.setUserId(999999999L);
        entry.setModTime(new Date(15000000000000L));
        entry.setMode(0777);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithBigNumberModeStar() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(10);
        entry.setGroupId(999999999L);
        entry.setUserId(999999999L);
        entry.setModTime(new Date(15000000000000L));
        entry.setMode(0777);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithBigNumberModeError() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(10);
        entry.setGroupId(999999999L);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Should throw RuntimeException for big number in error mode");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryWithNonAsciiNameAndPaxHeaders() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        String entryName = "test-é.txt";
        TarArchiveEntry entry = new TarArchiveEntry(entryName);
        entry.setSize(0);
        byte[] data = new byte[0];
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithNonAsciiLinkNameAndPaxHeaders() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setLinkName("link-é.txt");
        entry.setLinkFlag(TarConstants.LF_SYMLINK);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryWithNoOpenEntry() throws IOException {
        try {
            tarOut.closeArchiveEntry();
            fail("Should throw IOException when closing non-existent entry");
        } catch (IOException e) {
            assertEquals("No current entry to close", e.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntryAfterWriteAllBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryWithPartialWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length + 10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        try {
            tarOut.closeArchiveEntry();
            fail("Should throw IOException when closing with less bytes than expected");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed at"));
        }
    }

    @Test
    public void testWriteWithoutCurrentEntry() throws IOException {
        try {
            tarOut.write(new byte[10], 0, 10);
            fail("Should throw IllegalStateException when writing without entry");
        } catch (IllegalStateException e) {
            assertEquals("No current tar entry", e.getMessage());
        }
    }

    @Test
    public void testWriteExceedingEntrySize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.write(new byte[10], 0, 10);
            fail("Should throw IOException when writing more than header size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size in header"));
        }
    }

    @Test
    public void testWriteMultipleWritesWithinSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = "Hello World!".getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, 5);
        tarOut.write(data, 5, 5);
        tarOut.write(data, 10, 2);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteWhenExactRecordSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[512];
        for (int i = 0; i < 512; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteSpansMultipleRecords() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("large.bin");
        byte[] data = new byte[2000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.finish();
        byte[] result = byteOut.toByteArray();
        assertTrue(result.length >= 2000 + 1024);
    }

    @Test
    public void testWritePaxHeadersForBigNumbers() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5000000000L);
        entry.setUserId(123456789L);
        entry.setGroupId(987654321L);
        entry.setMode(0644);
        entry.setModTime(new Date(1500000000000L));
        entry.setDevMajor(1001);
        entry.setDevMinor(2002);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCreateArchiveEntryWithFinished() throws IOException {
        tarOut.finish();
        File file = new File("test.txt");
        try {
            tarOut.createArchiveEntry(file, "test.txt");
            fail("Should throw IOException when creating entry after finish");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testCreateArchiveEntryNormal() throws IOException {
        File file = File.createTempFile("test", ".txt");
        file.deleteOnExit();
        java.io.FileWriter writer = new java.io.FileWriter(file);
        writer.write("test");
        writer.close();
        ArchiveEntry entry = tarOut.createArchiveEntry(file, "test.txt");
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
        TarArchiveEntry tarEntry = (TarArchiveEntry) entry;
        assertEquals(4, tarEntry.getSize());
        tarOut.putArchiveEntry(tarEntry);
        tarOut.write(new byte[4]);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testNullEncoding() {
        TarArchiveOutputStream nullEncodingOut = new TarArchiveOutputStream(byteOut, (String) null);
        assertNotNull(nullEncodingOut);
    }

    @Test
    public void testWriteRecordInvalidLength() throws IOException {
        try {
            tarOut.writeRecord(new byte[10]);
            fail("Should throw IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("record to write has length"));
        }
    }

    @Test
    public void testWriteRecordInvalidOffset() throws IOException {
        try {
            tarOut.writeRecord(new byte[600], 100);
            fail("Should throw IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("record has length"));
        }
    }

    @Test
    public void testWriteWithOffset() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, data.length);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testFlushAfterWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        String content = "This is a flush test";
        byte[] data = content.getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.flush();
        tarOut.closeArchiveEntry();
        byte[] result = byteOut.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testWritePartialThenFillAssemBuffer() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        byte[] data = new byte[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, 50);
        tarOut.write(data, 50, 50);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteWithPartialLastBuffer() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 100);
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteZeroBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[0], 0, 0);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testGetCountAfterWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        String content = "Count test";
        byte[] data = content.getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        long bytes = tarOut.getBytesWritten();
        assertTrue(bytes > 0);
    }

    @Test
    public void testPutArchiveEntryWithPaxHeaderForBigSize() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("bigsize.bin");
        entry.setSize(TarConstants.MAXSIZE + 100);
        entry.setUserId(10);
        entry.setGroupId(10);
        entry.setModTime(new Date(System.currentTimeMillis()));
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithPaxHeaderForNoAsciiName() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("naïve.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithPaxHeaderForNoAsciiLinkName() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("link.txt");
        entry.setLinkName("lïnk.txt");
        entry.setSize(0);
        entry.setLinkFlag(TarConstants.LF_SYMLINK);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithNegativeSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("negative.txt");
        try {
            entry.setSize(-1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCloseArchiveEntryAfterExactWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
        byte[] data = new byte[1024];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }
}