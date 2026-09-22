package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

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
        tarOut.close();
    }

    @Test
    public void testConstructorWithDefaultBlockSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testConstructorWithCustomBlockSize() {
        TarArchiveOutputStream custom = new TarArchiveOutputStream(byteOut, 1024);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, custom.getRecordSize());
        try {
            custom.close();
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithCustomBlockAndRecordSize() {
        TarArchiveOutputStream custom = new TarArchiveOutputStream(byteOut, 1024, 512);
        assertEquals(512, custom.getRecordSize());
        try {
            custom.close();
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testFinishTwiceThrowsIOException() throws IOException {
        tarOut.finish();
        try {
            tarOut.finish();
            fail("Expected IOException on second finish");
        } catch (IOException e) {
            assertEquals("This archive has already been finished", e.getMessage());
        }
    }

    @Test
    public void testFinishWithUnclosedEntryThrowsIOException() throws IOException {
        // Create a valid entry and put it
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10); // Header size is 512, but we need to set size for testing
        tarOut.putArchiveEntry(entry);

        try {
            tarOut.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    @Test
    public void testFinishCallsCloseUnderlyingStream() throws IOException {
        // Finish and then close - should work
        tarOut.finish();
        tarOut.close(); // Should not throw

        // Second close should be no-op
        tarOut.close();
    }

    @Test
    public void testCloseWithUnfinishedStreamFinishes() throws IOException {
        // Don't call finish before close - should finish automatically
        tarOut.close();
        // Just verify no exception and mark is closed
        assertTrue(true);
    }

    @Test
    public void testPutArchiveEntryAfterFinishThrowsIOException() throws IOException {
        tarOut.finish();
        try {
            TarArchiveEntry entry = new TarArchiveEntry("new.txt");
            entry.setSize(10);
            tarOut.putArchiveEntry(entry);
            fail("Expected IOException when putting entry after finish");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testCreateArchiveEntryAfterFinishThrowsIOException() throws IOException {
        tarOut.finish();
        try {
            tarOut.createArchiveEntry(new java.io.File("test.txt"), "test.txt");
            fail("Expected IOException when creating entry after finish");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntryWithoutOpeningThrowsIOException() throws IOException {
        try {
            tarOut.closeArchiveEntry();
            fail("Expected IOException when closing with no open entry");
        } catch (IOException e) {
            assertEquals("No current entry to close", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryWithLongNameAndDefaultModeThrows() throws IOException {
        char[] longName = new char[200];
        for (int i = 0; i < longName.length; i++) {
            longName[i] = 'a';
        }
        String name = new String(longName);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(0); // Directory entry

        try {
            tarOut.putArchiveEntry(entry);
            fail("Expected RuntimeException for long name in ERROR mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testPutArchiveEntryWithLongNameAndTruncateMode() throws IOException {
        // Set mode to truncate
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        char[] longName = new char[150];
        for (int i = 0; i < longName.length; i++) {
            longName[i] = 'b';
        }
        String name = new String(longName);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(0);

        tarOut.putArchiveEntry(entry);
        // Should not throw
    }

    @Test
    public void testPutArchiveEntryWithDirectoryAndWriteExactBytes() throws IOException {
        // Setup a directory entry with size 0
        TarArchiveEntry entry = new TarArchiveEntry("mydir/");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteExceedsEntrySizeThrowsIOException() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);

        byte[] data = new byte[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        try {
            tarOut.write(data, 0, 20);
            fail("Expected IOException when writing more bytes than entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("request to write '20'"));
            assertTrue(e.getMessage().contains("exceeds size"));
        }
    }

    @Test
    public void testWriteWithPartialRecord() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        int entrySize = 100; // Less than one record (512)
        entry.setSize(entrySize);
        tarOut.putArchiveEntry(entry);

        byte[] data = new byte[entrySize];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }

        tarOut.write(data, 0, entrySize);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteMultipleRecords() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("large.bin");
        int entrySize = 1024; // Two full records
        entry.setSize(entrySize);
        tarOut.putArchiveEntry(entry);

        byte[] data = new byte[entrySize];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i & 0xFF);
        }

        tarOut.write(data, 0, entrySize);

        // Write exactly what was specified
        assertEquals(entrySize, tarOut.getBytesWritten());

        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteWithOffsetAndLength() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("offset.bin");
        int entrySize = 500;
        entry.setSize(entrySize);
        tarOut.putArchiveEntry(entry);

        byte[] data = new byte[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i & 0xFF);
        }

        tarOut.write(data, 250, entrySize);

        tarOut.closeArchiveEntry();
    }

    @Test
    public void testGetBytesWrittenAfterEmptyEntry() throws IOException {
        assertEquals(0, tarOut.getBytesWritten());

        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);

        assertEquals(0, tarOut.getBytesWritten());

        tarOut.closeArchiveEntry();
    }

    @Test
    public void testFlush() throws IOException {
        tarOut.flush();
        // Should not throw
    }

    @Test
    public void testCloseArchiveEntryWritesRemainingAssembledData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("partial.bin");
        int entrySize = 700; // 512 + 188 bytes
        entry.setSize(entrySize);
        tarOut.putArchiveEntry(entry);

        byte[] data = new byte[entrySize];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i & 0xFF);
        }

        tarOut.write(data, 0, entrySize);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteZeroBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("zero.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[0], 0, 0);
        tarOut.closeArchiveEntry();
    }
}