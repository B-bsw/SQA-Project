package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream out;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(out);
    }

    @After
    public void tearDown() throws IOException {
        if (!tarOutClosed) {
            tarOut.close();
        }
    }

    private boolean tarOutClosed;

    private void closeTarOut() throws IOException {
        tarOut.close();
        tarOutClosed = true;
    }

    @Test
    public void testConstructor1() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testConstructor2() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(out, TarBuffer.DEFAULT_BLKSIZE * 2);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testConstructor3() throws IOException {
        tarOut.close();
        tarOut = new TarArchiveOutputStream(out, TarBuffer.DEFAULT_BLKSIZE * 2, 256);
        assertEquals(256, tarOut.getRecordSize());
    }

    @Test
    public void testSetLongFileMode() {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        // No exception expected
    }

    @Test
    public void testFinishWithUnclosedEntry() {
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(10);
            tarOut.putArchiveEntry(entry);
            tarOut.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    @Test
    public void testFinishEmpty() throws IOException {
        tarOut.finish();
        byte[] result = out.toByteArray();
        assertEquals(1024, result.length);
        // All bytes should be zero
        for (byte b : result) {
            assertEquals(0, b);
        }
    }

    @Test
    public void testCloseCallsFinish() throws IOException {
        tarOut.close();
        assertTrue(out.size() >= 1024); // should contain EOF records
        assertEquals(true, tarOut.closed);
        // verify underlying output is closed
    }

    @Test
    public void testCloseClosedCalledTwice() throws IOException {
        tarOut.close();
        tarOut.close(); // should not throw
    }

    @Test
    public void testGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testPutArchiveEntryWithGnuLongName() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = "";
        for (int i = 0; i < TarConstants.NAMELEN; i++) {
            longName += "a";
        }
        longName += "b";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        byte[] data = out.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test
    public void testPutArchiveEntryWithLongNameThrows() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        String longName = "";
        for (int i = 0; i < TarConstants.NAMELEN; i++) {
            longName += "a";
        }
        longName += "b";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testPutArchiveEntryWithLongNameTruncates() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longName = "";
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) {
            longName += "a";
        }
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        byte[] data = out.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test
    public void testWriteExceedingSizeThrows() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.write(new byte[20], 0, 20);
            fail("Expected IOException for exceeding size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size"));
        }
    }

    @Test
    public void testWriteExactlySize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, data.length);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testWritePartialRecords() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[TarBuffer.DEFAULT_RCDSIZE + 100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, data.length);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length >= data.length);
    }

    @Test
    public void testWriteWithZeroBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("zero.bin");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[0], 0, 0);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testWriteWithNullBuffer() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.write(null, 0, 10);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testWriteWithNegativeOffset() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.write(new byte[10], -1, 10);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testWriteWithNegativeLength() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.write(new byte[10], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryNormal() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("normal.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.write("hello".getBytes(), 0, 5);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testPutArchiveEntryWithClassCastException() {
        try {
            tarOut.putArchiveEntry(new ArchiveEntry() {
                @Override
                public String getName() {
                    return "dummy";
                }

                @Override
                public long getSize() {
                    return 0;
                }

                @Override
                public boolean isDirectory() {
                    return false;
                }

                @Override
                public boolean isFile() {
                    return false;
                }

                @Override
                public long getLastModified() {
                    return 0;
                }
            });
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        }
    }

    @Test
    public void testFlush() throws IOException {
        tarOut.flush();
        // No exception expected
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tmpFile = File.createTempFile("test", ".txt");
        try {
            ArchiveEntry entry = tarOut.createArchiveEntry(tmpFile, "test.txt");
            assertNotNull(entry);
            assertTrue(entry instanceof TarArchiveEntry);
            assertEquals("test.txt", entry.getName());
        } finally {
            tmpFile.delete();
        }
    }

    @Test
    public void testCreateArchiveEntryWithDirectories() throws IOException {
        File tmpDir = new File("testDir");
        tmpDir.mkdir();
        try {
            ArchiveEntry entry = tarOut.createArchiveEntry(tmpDir, "testDir");
            assertNotNull(entry);
            assertTrue(entry.isDirectory());
        } finally {
            tmpDir.delete();
        }
    }

    @Test
    public void testFinishWithDataButNoCloseEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntryWithIncompleteData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[5], 0, 5);
        try {
            tarOut.closeArchiveEntry();
            fail("Expected IOException for incomplete data");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("before"));
        }
    }

    @Test
    public void testCloseArchiveEntryWithAssembledData() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[TarBuffer.DEFAULT_RCDSIZE + 100];
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, 100);
        tarOut.write(data, 100, 100);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length >= data.length);
    }

    @Test
    public void testCloseArchiveEntryAfterFullWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.bin");
        byte[] data = new byte[500];
        entry.setSize(data.length);
        tarOut.putArchiveEntry(entry);
        tarOut.write(data, 0, data.length);
        tarOut.closeArchiveEntry();
        byte[] result = out.toByteArray();
        assertTrue(result.length >= data.length);
    }
}