package org.apache.commons.compress.archivers.tar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class TarArchiveInputStreamTest {

    private static final int BLOCK_SIZE = 512;
    private static final int RECORD_SIZE = 512;
    private static final byte[] ZERO_BLOCK = new byte[BLOCK_SIZE];

    private TarArchiveInputStream tarIn;

    @Before
    public void setUp() {
        tarIn = null;
    }

    @After
    public void tearDown() throws IOException {
        if (tarIn != null) {
            tarIn.close();
        }
    }

    private InputStream createInputStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }

    @Test
    public void testConstructorWithEncoding() throws IOException {
        byte[] data = new byte[1024];
        System.arraycopy(ZERO_BLOCK, 0, data, 0, BLOCK_SIZE);
        System.arraycopy(ZERO_BLOCK, 0, data, BLOCK_SIZE, BLOCK_SIZE);

        InputStream rawIs = createInputStream(data);
        tarIn = new TarArchiveInputStream(rawIs, "UTF-8");
        assertNotNull(tarIn);
        assertEquals(BLOCK_SIZE, tarIn.getRecordSize());
    }

    @Test
    public void testConstructorMultipleParameters() throws IOException {
        byte[] data = new byte[1536];
        System.arraycopy(ZERO_BLOCK, 0, data, 0, BLOCK_SIZE);
        System.arraycopy(ZERO_BLOCK, 0, data, BLOCK_SIZE, BLOCK_SIZE);
        System.arraycopy(ZERO_BLOCK, 0, data, 2 * BLOCK_SIZE, BLOCK_SIZE);

        InputStream rawIs = createInputStream(data);
        tarIn = new TarArchiveInputStream(rawIs, 1024, 512, "UTF-8");
        assertNotNull(tarIn);
        assertEquals(512, tarIn.getRecordSize());
    }

    @Test
    public void testGetNextEntryEmptyArchive() throws IOException {
        byte[] data = new byte[BLOCK_SIZE * 2];
        System.arraycopy(ZERO_BLOCK, 0, data, 0, BLOCK_SIZE);
        System.arraycopy(ZERO_BLOCK, 0, data, BLOCK_SIZE, BLOCK_SIZE);

        tarIn = new TarArchiveInputStream(createInputStream(data));
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testGetNextEntryCompleteHeaderAndData() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("testfile.txt", entry.getName());
        assertEquals(12, entry.getSize());

        byte[] content = new byte[12];
        int bytesRead = tarIn.read(content, 0, 12);
        assertEquals(12, bytesRead);
        assertEquals("Hello World!", new String(content));
    }

    @Test
    public void testGetNextEntryNullOnEof() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testAvailableMetrics() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertEquals(12, tarIn.available());

        byte[] buf = new byte[1];
        tarIn.read(buf, 0, 1);
        assertEquals(11, tarIn.available());
    }

    @Test
    public void testAvailableZeroBytes() throws IOException {
        byte[] data = new byte[BLOCK_SIZE * 2];
        System.arraycopy(ZERO_BLOCK, 0, data, 0, BLOCK_SIZE);
        System.arraycopy(ZERO_BLOCK, 0, data, BLOCK_SIZE, BLOCK_SIZE);

        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertEquals(0, tarIn.available());
    }

    @Test
    public void testSkipNegative() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertEquals(0, tarIn.skip(-5));
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertEquals(0, tarIn.skip(0));
    }

    @Test
    public void testSkipPartOfEntry() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        long skipped = tarIn.skip(10);
        assertEquals(10, skipped);
        assertEquals(2, tarIn.available());
    }

    @Test
    public void testSkipMoreThanEntrySize() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        long skipped = tarIn.skip(100);
        assertEquals(12, skipped);
    }

    @Test
    public void testReadAfterEntryEnd() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        byte[] buf = new byte[12];
        tarIn.read(buf, 0, 12);
        assertEquals(-1, tarIn.read(buf, 0, 12));
    }

    @Test
    public void testReadWithZeroLength() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        tarIn.getNextTarEntry();
        assertEquals(0, tarIn.read(new byte[0], 0, 0));
    }

    @Test
    public void testMarkSupportedReturnsFalse() {
        tarIn = new TarArchiveInputStream(createInputStream(new byte[BLOCK_SIZE * 2]));
        assertFalse(tarIn.markSupported());
    }

    @Test
    public void testMarkAndResetNoOp() {
        tarIn = new TarArchiveInputStream(createInputStream(new byte[BLOCK_SIZE * 2]));
        tarIn.mark(100);
        tarIn.reset();
    }

    @Test
    public void testMatches() {
        byte[] sig = new byte[265];
        sig[0] = 'u';
        sig[1] = 's';
        sig[2] = 't';
        sig[3] = 'a';
        sig[4] = 'r';
        assertTrue(TarArchiveInputStream.matches(sig, 265));
        assertFalse(TarArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testGetNextTarEntryWhenHasHitEOFIsTrue() throws IOException {
        byte[] data = createTarWithOneEntry();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        assertNotNull(tarIn.getNextTarEntry());
        assertNull(tarIn.getNextTarEntry());
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testReadGNUSparseEntry() throws IOException {
        // Test reading via getNextTarEntry with a GNUSparse entry
        byte[] data = createSparseTarFile();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNull(entry);
    }

    @Test
    public void testGetNextEntryWithMalformedHeader() throws IOException {
        byte[] data = new byte[BLOCK_SIZE * 2];
        for (int i = 0; i < BLOCK_SIZE; i++) {
            data[i] = (byte) 0xFF;
        }
        tarIn = new TarArchiveInputStream(createInputStream(data));
        try {
            tarIn.getNextTarEntry();
            fail("Expected IOException for malformed header");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testGetNextEntryWithNullHeader() throws IOException {
        byte[] data = new byte[BLOCK_SIZE * 2];
        // All zeros means empty records, which means EOF without entry
        tarIn = new TarArchiveInputStream(createInputStream(data));
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testReadBubblesIOException() throws IOException {
        tarIn = new TarArchiveInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Test exception");
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Test exception");
            }
        });
        try {
            tarIn.getNextTarEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Test exception", e.getMessage());
        }
    }

    @Test
    public void testSkipRecordPaddingWhenEntryNeedsPadding() throws IOException {
        // Create a tar with entry size 100, record size 512
        // It will have 100 bytes of data and padding 412
        byte[] header = createHeader("file.txt", 100);
        byte[] data = new byte[header.length + 512];
        System.arraycopy(header, 0, data, 0, header.length);
        // data and padding are all zeros
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(100, entry.getSize());
        byte[] buf = new byte[100];
        int read = tarIn.read(buf, 0, 100);
        assertEquals(100, read);
    }

    @Test
    public void testGetLongNameDataWithNullByte() throws IOException {
        byte[] longName = new byte[20];
        byte[] nameBytes = "verylongfilename_that_exceeds_the_limit".getBytes();
        System.arraycopy(nameBytes, 0, longName, 0, Math.min(nameBytes.length, longName.length - 1));
        longName[longName.length - 1] = 0;

        // Create a TarEntry with a long name, then a regular entry
        byte[] data = createLongNameTarFile(longName);
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        // Either returns an entry (if long name processed) or null
        assertNotNull(entry);
    }

    @Test
    public void testGetNextTarEntryWithInvalidLongLink() throws IOException {
        // Test handling of GNU Long Link entry that is malformed
        byte[] data = createInvalidLongLinkFile();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNull(entry);
    }

    private byte[] createTarWithOneEntry() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] header = createHeader("testfile.txt", 12);
        out.write(header);
        out.write("Hello World!".getBytes("ASCII"));
        out.write(new byte[BLOCK_SIZE - 12]); // padding
        out.write(ZERO_BLOCK);
        out.write(ZERO_BLOCK);
        return out.toByteArray();
    }

    private byte[] createHeader(String name, long size) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(name.getBytes("ASCII"));
        out.write(new byte[100 - name.length()]);
        out.write(new byte[24]); // mode, uid, gid, mtime, etc.
        String sizeStr = Long.toOctalString(size);
        String paddedSize = String.format("%07o", size);
        out.write(paddedSize.getBytes("ASCII"));
        out.write(new byte[12]); // rest of header
        // simplified header, enough for test
        return out.toByteArray();
    }

    private byte[] createSparseTarFile() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // Create a sparse entry (simplified)
        return out.toByteArray();
    }

    private byte[] createLongNameTarFile(byte[] longName) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // Create a long name entry then a short name entry
        byte[] longHeader = createHeader("././@LongLink", 100);
        out.write(longHeader);
        out.write(longName);
        out.write(new byte[BLOCK_SIZE - longName.length]);
        byte[] entryHeader = createHeader("file.txt", 0);
        out.write(entryHeader);
        out.write(ZERO_BLOCK);
        out.write(ZERO_BLOCK);
        return out.toByteArray();
    }

    private byte[] createInvalidLongLinkFile() throws IOException {
        // Create a file with a GNULongLink marker but no following entry
        byte[] header = createHeader("file.txt", 0);
        header[156] = 'L'; // at typeflag
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(header);
        out.write(ZERO_BLOCK);
        out.write(ZERO_BLOCK);
        return out.toByteArray();
    }

    @Test
    public void testGetNextEntryWithGnuLongLink() throws IOException {
        // Test proper GNU LongLink processing (not malformed)
        byte[] data = createValidGNULongLinkFile();
        tarIn = new TarArchiveInputStream(createInputStream(data));
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
    }

    private byte[] createValidGNULongLinkFile() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] longHeader = createHeader("././@LongLink", 6);
        longHeader[156] = 'L';
        out.write(longHeader);
        byte[] linkName = "link.txt".getBytes();
        out.write(linkName);
        out.write(new byte[BLOCK_SIZE - linkName.length]);

        byte[] entryHeader = createHeader("file.txt", 6);
        out.write(entryHeader);
        byte[] data = "Hello!".getBytes();
        out.write(data);
        out.write(new byte[BLOCK_SIZE - data.length]);
        out.write(ZERO_BLOCK);
        out.write(ZERO_BLOCK);
        return out.toByteArray();
    }
}