package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SevenZFileTest {

    private File tempFile;
    private SevenZFile sevenZFile;

    @Before
    public void setUp() throws Exception {
        Path tempDir = Files.createTempDirectory("sevenz-test");
        tempFile = tempDir.resolve("test.7z").toFile();
    }

    @After
    public void tearDown() throws Exception {
        if (sevenZFile != null) {
            sevenZFile.close();
        }
        if (tempFile.exists()) {
            tempFile.delete();
            tempFile.getParentFile().delete();
        }
    }

    @Test
    public void testConstructorWithFileAndNullPassword() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile, null);
        assertNotNull(sevenZFile);
    }

    @Test
    public void testConstructorWithFileAndPassword() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile, new byte[0]);
        assertNotNull(sevenZFile);
    }

    @Test
    public void testConstructorWithFileOnly() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        assertNotNull(sevenZFile);
    }

    @Test
    public void testConstructorWithInvalidSignature() throws Exception {
        Files.write(tempFile.toPath(), new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        try {
            sevenZFile = new SevenZFile(tempFile);
            fail("Expected IOException for invalid signature");
        } catch (IOException e) {
            assertEquals("Bad 7z signature", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithUnsupportedVersion() throws Exception {
        byte[] data = new byte[40];
        data[0] = '7';
        data[1] = 'z';
        data[2] = (byte) 0xBC;
        data[3] = (byte) 0xAF;
        data[4] = 0x27;
        data[5] = 0x1C;
        data[6] = 1; // version major
        Files.write(tempFile.toPath(), data);
        try {
            sevenZFile = new SevenZFile(tempFile);
            fail("Expected IOException for unsupported version");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported 7z version"));
        }
    }

    @Test
    public void testGetNextEntryWithEmptyArchive() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        assertNull(sevenZFile.getNextEntry());
    }

    @Test
    public void testGetNextEntryWithMultipleFiles() throws Exception {
        byte[] content = new byte[10];
        byte[] header = createNextHeader(content, 1);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        entry = sevenZFile.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testGetEntriesEmpty() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
        assertFalse(entries.iterator().hasNext());
    }

    @Test
    public void testGetEntriesWithFiles() throws Exception {
        byte[] content = new byte[5];
        byte[] header = createNextHeader(content, 2);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
        int count = 0;
        for (SevenZArchiveEntry e : entries) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testReadWithNoCurrentEntry() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        try {
            sevenZFile.read();
            fail("Expected IOException when no entry is selected");
        } catch (IOException e) {
            assertEquals("No current 7z entry", e.getMessage());
        }
    }

    @Test
    public void testReadWithSingleByteBuffer() throws Exception {
        byte[] content = new byte[] { 10, 20, 30 };
        byte[] header = createNextHeaderWithContent(content);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[4];
        int bytesRead = sevenZFile.read(buffer);
        assertEquals(3, bytesRead);
        assertArrayEquals(content, Arrays.copyOf(buffer, 3));
    }

    @Test
    public void testReadWithOffsetAndLength() throws Exception {
        byte[] content = new byte[] { 1, 2, 3, 4, 5 };
        byte[] header = createNextHeaderWithContent(content);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[10];
        int bytesRead = sevenZFile.read(buffer, 2, 3);
        assertEquals(3, bytesRead);
        assertArrayEquals(new byte[] { 0, 0, 1, 2, 3, 0, 0, 0, 0, 0 }, buffer);
    }

    @Test
    public void testReadBeyondContent() throws Exception {
        byte[] content = new byte[] { 42 };
        byte[] header = createNextHeaderWithContent(content);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        assertEquals(42, sevenZFile.read());
        assertEquals(-1, sevenZFile.read());
    }

    @Test
    public void testCloseMethod() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        sevenZFile.close();
        try {
            sevenZFile.read();
            fail("Expected IOException after close");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testMatchesMethod() {
        assertTrue(SevenZFile.matches(new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C }, 6));
        assertFalse(SevenZFile.matches(new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1D }, 6));
        assertTrue(SevenZFile.matches(new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 0x00 }, 7));
        assertFalse(SevenZFile.matches(new byte[] { '7', 'z' }, 2));
        assertFalse(SevenZFile.matches(new byte[] {}, 0));
        assertTrue(SevenZFile.matches(null, 6));
        assertFalse(SevenZFile.matches(new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C }, 5));
    }

    @Test
    public void testToStringMethod() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        String s = sevenZFile.toString();
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }

    @Test
    public void testReadWithMultipleEntriesAndStreams() throws Exception {
        byte[] content1 = new byte[] { 10, 20 };
        byte[] content2 = new byte[] { 30, 40, 50 };
        byte[] header = createNextHeaderTwoFiles(content1, content2);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        
        SevenZArchiveEntry entry1 = sevenZFile.getNextEntry();
        assertNotNull(entry1);
        byte[] buffer = new byte[2];
        assertEquals(2, sevenZFile.read(buffer));
        assertArrayEquals(content1, buffer);
        
        SevenZArchiveEntry entry2 = sevenZFile.getNextEntry();
        assertNotNull(entry2);
        buffer = new byte[3];
        assertEquals(3, sevenZFile.read(buffer));
        assertArrayEquals(content2, buffer);
        
        assertNull(sevenZFile.getNextEntry());
    }

    @Test
    public void testEmptyFileEntry() throws Exception {
        byte[] header = createNextHeader(new byte[0], 1);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
        assertEquals(-1, sevenZFile.read());
    }

    @Test
    public void testNullInputToMatches() {
        assertTrue(SevenZFile.matches(null, 0));
    }

    @Test
    public void testConstructorWithNullFile() throws Exception {
        try {
            sevenZFile = new SevenZFile((File) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCloseWithNullPassword() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        sevenZFile.close();
    }

    @Test
    public void testReadByteBufferWithNull() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        try {
            sevenZFile.read(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testReadByteBufferWithNullOffset() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        try {
            sevenZFile.read(new byte[1]);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testReadByteArrayWithInvalidOffsets() throws Exception {
        createMinimalArchive();
        sevenZFile = new SevenZFile(tempFile);
        try {
            sevenZFile.read(new byte[10], -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetNextEntryWithNullArchive() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
        sevenZFile = new SevenZFile(tempFile);
        sevenZFile.getNextEntry();
        assertNull(sevenZFile.getNextEntry());
    }

    private void createMinimalArchive() throws Exception {
        byte[] header = createNextHeader(new byte[0], 0);
        createArchiveWithHeader(header);
    }

    private void createArchiveWithHeader(byte[] nextHeader) throws Exception {
        int headerSize = 32 + nextHeader.length;
        byte[] data = new byte[headerSize];
        data[0] = '7';
        data[1] = 'z';
        data[2] = (byte) 0xBC;
        data[3] = (byte) 0xAF;
        data[4] = 0x27;
        data[5] = 0x1C;
        data[6] = 0;
        data[7] = 4;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 20;
        data[16] = 0;
        data[17] = 0;
        data[18] = 0;
        data[19] = 0;
        data[20] = 0;
        data[21] = 0;
        data[22] = 0;
        data[23] = 0;
        data[24] = 0;
        data[25] = 0;
        data[26] = 0;
        data[27] = 0;
        data[28] = 0;
        data[29] = 0;
        data[30] = 0;
        data[31] = 0;
        System.arraycopy(nextHeader, 0, data, 32, nextHeader.length);
        Files.write(tempFile.toPath(), data);
    }

    private byte[] createNextHeader(byte[] contents, int numFiles) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0x03); // kHeader (simplified)
        if (numFiles > 0) {
            baos.write(0x04); // kFilesInfo
            baos.write(0x00); // Folder
            baos.write(0x01); // kEmptyStream
            baos.write(0x00); // empty bits
            baos.write(0x00); // kEmptyFile
            baos.write(0x00); // kAnti
            baos.write(0x05); // kName
            baos.write(0x00);
            baos.write(0x00); // numFiles
            baos.write(0x00); // external
            baos.write(0x00); // names
            baos.write(0x00); // kEnd
            baos.write(0x00); // kEnd
        }
        baos.write(0x00); // kEnd
        baos.flush();
        return baos.toByteArray();
    }

    private byte[] createNextHeaderWithContent(byte[] content) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0x03); // kHeader
        if (content.length > 0) {
            baos.write(0x04); // kFilesInfo
            baos.write(0x00); // Folder
            baos.write(0x01); // kEmptyStream
            baos.write(0x00); // kEmptyFile
            baos.write(0x00); // kAnti
            baos.write(0x05); // kName
            baos.write(0x01); // size
            baos.write(0x00); // numFiles
            baos.write(0x00); // external
            baos.write(0x00); // names
            baos.write(0x00); // kEnd
            baos.write(0x00); // kEnd
        }
        baos.write(0x00); // kEnd
        return baos.toByteArray();
    }

    private byte[] createNextHeaderTwoFiles(byte[] content1, byte[] content2) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0x03); // kHeader
        baos.write(0x04); // kFilesInfo
        baos.write(0x00); // Folder
        baos.write(0x01); // kEmptyStream
        baos.write(0x00); // kEmptyFile
        baos.write(0x00); // kAnti
        baos.write(0x05); // kName
        baos.write(0x02); // size
        baos.write(0x00); // numFiles
        baos.write(0x00); // external
        baos.write(0x00); // names
        baos.write(0x00); // kEnd
        baos.write(0x00); // kEnd
        return baos.toByteArray();
    }
}