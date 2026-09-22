package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class SevenZOutputFileTest {

    @Test
    public void testCreateArchiveEntryWithDirectory() throws IOException {
        File dir = new File(".");
        String entryName = "testDir";
        SevenZArchiveEntry entry = new SevenZOutputFile(new File("temp7z.7z")) {{
            // Override constructor to avoid real file access? No, use real temp file
        }}.createArchiveEntry(dir, entryName);
        assertTrue(entry.isDirectory());
        assertEquals(entryName, entry.getName());
        assertNotNull(entry.getLastModifiedDate());
    }

    @Test
    public void testCreateArchiveEntryWithFile() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(new File("temp7z.7z"));
        SevenZArchiveEntry entry = output.createArchiveEntry(tempFile, "file.txt");
        assertFalse(entry.isDirectory());
        assertEquals("file.txt", entry.getName());
        assertNotNull(entry.getLastModifiedDate());
        output.close();
    }

    @Test
    public void testWriteAndCloseArchiveEntryWithStream() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.txt");
        entry.setDirectory(false);
        output.putArchiveEntry(entry);
        byte[] data = "Hello World".getBytes();
        output.write(data);
        output.closeArchiveEntry();
        output.close();
        // Verify file has data (no exception)
        assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testWriteEmptyEntry() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty.txt");
        entry.setDirectory(false);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.close();
        // No exception is sufficient
    }

    @Test
    public void testWriteByteArrayWithOffset() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.bin");
        output.putArchiveEntry(entry);
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        output.write(data, 2, 5);
        output.closeArchiveEntry();
        output.close();
        // Verify by attempting to reopen or just no crash
    }

    @Test
    public void testWriteWithInvalidOffsetThrowsException() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        output.putArchiveEntry(entry);
        byte[] data = new byte[]{1, 2, 3};
        try {
            output.write(data, 0, 5); // len > b.length
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        output.closeArchiveEntry();
        output.close();
    }

    @Test
    public void testFinishTwiceThrowsIOException() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        output.finish();
        try {
            output.finish();
            fail("Expected IOException on second finish");
        } catch (IOException e) {
            // Expected
        }
        output.close();
    }

    @Test
    public void testCloseArchiveEntryWithNoStream() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("emptydir");
        entry.setDirectory(true);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.close();
    }

    @Test
    public void testWriteAfterFinishThrowsIOException() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        output.finish();
        try {
            output.write(new byte[]{1, 2, 3});
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
        output.close();
    }

    @Test
    public void testSetContentCompression() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        output.setContentCompression(SevenZMethod.COPY);
        // Write a small entry
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test");
        output.putArchiveEntry(entry);
        output.write("testdata".getBytes());
        output.closeArchiveEntry();
        output.close();
        // No assertion needed, just no exception
    }

    @Test
    public void testMultipleEntriesWithStreams() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        for (int i = 0; i < 3; i++) {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("file" + i);
            output.putArchiveEntry(entry);
            output.write(("content" + i).getBytes());
            output.closeArchiveEntry();
        }
        output.close();
    }

    @Test
    public void testWriteHeaderWhenNoFiles() throws IOException {
        File tempFile = File.createTempFile("test", ".7z");
        tempFile.deleteOnExit();
        SevenZOutputFile output = new SevenZOutputFile(tempFile);
        output.finish();
        output.close();
        // Should not throw
    }
}