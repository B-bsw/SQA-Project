package org.apache.commons.compress.archivers.tar;

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
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.Charsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {
    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws IOException {
        if (tarOut != null) {
            tarOut.close();
        }
    }

    @Test
    public void testConstructors() {
        // Test constructor with two args
        OutputStream os2 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut2 = new TarArchiveOutputStream(os2, 512);
        assertNotNull(tarOut2);
        
        // Test constructor with three args
        OutputStream os3 = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut3 = new TarArchiveOutputStream(os3, 512, 32);
        assertNotNull(tarOut3);
        assertEquals(32, tarOut3.getRecordSize());
    }

    @Test
    public void testGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test
    public void testSetLongFileMode() {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        // No exception expected
    }

    @Test
    public void testPutArchiveEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(4);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = "test".getBytes(Charsets.UTF_8);
        tarOut.write(data);
        tarOut.closeArchiveEntry();
        tarOut.close();
        
        byte[] result = baos.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testPutArchiveEntryWithLongNameGNU() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithLongNameDefaultFails() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        // Default longFileMode is LONGFILE_ERROR, so should throw
        assertThrows(RuntimeException.class, () -> {
            tarOut.putArchiveEntry(entry);
        });
    }

    @Test
    public void testPutArchiveEntryWithLongNameTruncate() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = "hello".getBytes(Charsets.UTF_8);
        tarOut.write(data);
        
        // Should write remaining bytes
        byte[] moreData = "world".getBytes(Charsets.UTF_8);
        tarOut.write(moreData);
        
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteExceedsSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = "hello world".getBytes(Charsets.UTF_8);
        try {
            tarOut.write(data);
            fail("Should have thrown IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseArchiveEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = "hello".getBytes(Charsets.UTF_8);
        tarOut.write(data);
        
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryInsufficientBytes() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = "hello".getBytes(Charsets.UTF_8);
        tarOut.write(data);
        
        try {
            // Should throw IOException because we only wrote 5 of 10 bytes
            tarOut.closeArchiveEntry();
            fail("Should have thrown IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testFlush() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.flush();
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testFinish() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        tarOut.finish();
        
        byte[] result = baos.toByteArray();
        // Should have at least 2 empty records at end
        assertTrue(result.length >= 1024);
    }

    @Test
    public void testClose() throws IOException {
        tarOut.close();
        tarOut = null; // prevent close in tearDown
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File file = File.createTempFile("test", ".txt");
        try {
            String entryName = "testentry.txt";
            ArchiveEntry entry = tarOut.createArchiveEntry(file, entryName);
            assertNotNull(entry);
            assertTrue(entry instanceof TarArchiveEntry);
            TarArchiveEntry tarEntry = (TarArchiveEntry) entry;
            assertEquals(entryName, tarEntry.getName());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testWriteWithAssembleBuffer() throws IOException {
        // Test writing data in small chunks that don't align to record sizes
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(100);
        tarOut.putArchiveEntry(entry);
        
        // Write in small chunks to trigger assem buffer logic
        for (int i = 0; i < 10; i++) {
            byte[] chunk = new byte[10];
            for (int j = 0; j < chunk.length; j++) {
                chunk[j] = (byte) (i + j);
            }
            tarOut.write(chunk);
        }
        
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteWithAssembleBufferExactRecord() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(recordSize);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = new byte[recordSize];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteWithAssembleBufferSpanningRecords() throws IOException {
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(recordSize + 10);
        tarOut.putArchiveEntry(entry);
        
        byte[] data = new byte[recordSize + 10];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteZeroLengthEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteMultipleEntries() throws IOException {
        // First entry
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        entry1.setSize(5);
        tarOut.putArchiveEntry(entry1);
        tarOut.write("hello".getBytes(Charsets.UTF_8));
        tarOut.closeArchiveEntry();
        
        // Second entry with directory
        TarArchiveEntry entry2 = new TarArchiveEntry("dir/");
        entry2.setSize(0);
        tarOut.putArchiveEntry(entry2);
        tarOut.closeArchiveEntry();
        
        // Third entry
        TarArchiveEntry entry3 = new TarArchiveEntry("file2.txt");
        entry3.setSize(0);
        tarOut.putArchiveEntry(entry3);
        tarOut.closeArchiveEntry();
    }
}