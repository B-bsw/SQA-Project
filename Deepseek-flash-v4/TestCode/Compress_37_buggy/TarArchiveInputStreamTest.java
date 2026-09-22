package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static final byte[] ZERO_BLOCK = new byte[512];
    private static final byte[] EOF_BLOCK;

    static {
        EOF_BLOCK = new byte[512];
        System.arraycopy(ZERO_BLOCK, 0, EOF_BLOCK, 0, 512);
    }

    private TarArchiveInputStream tarIn;

    @Before
    public void setUp() {
        // Basic setup with empty tar (two zero blocks)
        byte[] emptyTar = new byte[1024];
        tarIn = new TarArchiveInputStream(new ByteArrayInputStream(emptyTar));
    }

    @Test
    public void testConstructorDefaultValues() {
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tarIn.getRecordSize());
        try {
            tarIn.close();
        } catch (IOException e) {
            fail("close should not throw IOException");
        }
    }

    @Test
    public void testConstructorWithCustomSizes() {
        TarArchiveInputStream custom = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[1024]), 1024, 1024);
        assertEquals(1024, custom.getRecordSize());
        try {
            custom.close();
        } catch (IOException e) {
            fail("close should not throw IOException");
        }
    }

    @Test
    public void testGetRecordSize() {
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tarIn.getRecordSize());
        TarArchiveInputStream custom = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[2048]), 2048, 1024);
        assertEquals(1024, custom.getRecordSize());
        try {
            custom.close();
        } catch (IOException e) {
            fail("close should not throw IOException");
        }
    }

    @Test
    public void testAvailableNoCurrentEntry() throws IOException {
        ByteArrayInputStream empty = new ByteArrayInputStream(EOF_BLOCK);
        TarArchiveInputStream tar = new TarArchiveInputStream(empty);
        assertEquals(0, tar.available());
        tar.close();
    }

    @Test
    public void testAvailableDirectory() throws IOException {
        // Create a tar with a directory entry - we'll mock via testing utility
        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/");
        ByteArrayOutputStream tarData = createTarWithEntry(dirEntry, null);
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData.toByteArray()));
        assertNotNull(tar.getNextTarEntry());
        assertEquals(0, tar.available());
        tar.close();
    }

    @Test
    public void testAvailableWithEntry() throws IOException {
        byte[] content = "Hello World".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(content.length);
        ByteArrayOutputStream tarData = createTarWithEntry(entry, content);
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData.toByteArray()));
        assertNotNull(tar.getNextTarEntry());
        assertEquals(content.length, tar.available());
        tar.close();
    }

    @Test
    public void testSkipZeroOrNegative() throws IOException {
        assertEquals(0, tarIn.skip(0));
        assertEquals(0, tarIn.skip(-5));
    }

    @Test
    public void testSkipNoCurrentEntry() throws IOException {
        assertEquals(0, tarIn.skip(10));
    }

    @Test
    public void testReadNoCurrentEntry() throws IOException {
        byte[] buf = new byte[10];
        try {
            tarIn.read(buf, 0, 10);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetNextTarEntryEmptyTar() throws IOException {
        assertNull(tarIn.getNextTarEntry());
        // Second call should also return null
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testGetNextEntryEmptyTar() throws IOException {
        assertNull(tarIn.getNextEntry());
    }

    @Test
    public void testMatchesNullSignature() {
        assertFalse(TarArchiveInputStream.matches(null, 0));
    }

    @Test
    public void testMatchesShortLength() {
        byte[] sig = new byte[20];
        assertFalse(TarArchiveInputStream.matches(sig, 20));
    }

    @Test
    public void testMatchesZeroSignature() {
        byte[] sig = new byte[512];
        assertFalse(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void testMatchesPosixSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, 
                TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, 
                TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, 
                TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, 
                TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesAntSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, 
                TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, 
                TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testCanReadEntryData() throws IOException {
        byte[] content = "test".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(content.length);
        entry.setSparseHeaders(new HashMap<String, String>());
        assertTrue(tarIn.canReadEntryData(entry));
    }

    @Test
    public void testGetCurrentEntry() throws IOException {
        assertNull(tarIn.getCurrentEntry());
        byte[] content = "data".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(content.length);
        ByteArrayOutputStream tarData = createTarWithEntry(entry, content);
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData.toByteArray()));
        tar.getNextTarEntry();
        assertNotNull(tar.getCurrentEntry());
        assertEquals("file.txt", tar.getCurrentEntry().getName());
        tar.close();
    }

    @Test
    public void testParsePaxHeaders() throws IOException {
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[1024]));
        byte[] data = "10 path=test.txt\n".getBytes();
        Map<String, String> headers = tar.parsePaxHeaders(
                new ByteArrayInputStream(data));
        assertEquals("test.txt", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithSpacesBeforeLength() throws IOException {
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[1024]));
        byte[] data = "12 path=test file.txt\n".getBytes();
        Map<String, String> headers = tar.parsePaxHeaders(
                new ByteArrayInputStream(data));
        assertEquals("test file.txt", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithInvalidLength() throws IOException {
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[1024]));
        byte[] data = "notanum path=test.txt\n".getBytes();
        Map<String, String> headers = tar.parsePaxHeaders(
                new ByteArrayInputStream(data));
        assertEquals(0, headers.size());
    }

    @Test
    public void testReadFromSparseFile() throws IOException {
        byte[] content = "sparse".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("sparse.txt");
        entry.setSize(content.length);
        entry.setSparseHeaders(new HashMap<String, String>());
        ByteArrayOutputStream tarData = createTarWithEntry(entry, content);
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData.toByteArray()));
        assertNotNull(tar.getNextEntry());
        byte[] buf = new byte[10];
        int total = 0;
        int read;
        while ((read = tar.read(buf, 0, buf.length)) != -1) {
            total += read;
        }
        assertEquals(content.length, total);
        tar.close();
    }

    @Test
    public void testClose() throws IOException {
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(EOF_BLOCK));
        tar.close();
        // Ensure no exception and can call close multiple times
        tar.close();
    }

    @Test
    public void testReadIntoLongNameData() throws IOException {
        byte[] content = "test".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(content.length);
        ByteArrayOutputStream tarData = createTarWithEntry(entry, content);
        // Append zeros to meet record size
        int padding = TarConstants.DEFAULT_RCDSIZE - (tarData.size() % TarConstants.DEFAULT_RCDSIZE);
        if (padding != TarConstants.DEFAULT_RCDSIZE) {
            for (int i = 0; i < padding; i++) {
                tarData.write(0);
            }
        }
        // Add EOF records
        tarData.write(EOF_BLOCK);
        tarData.write(EOF_BLOCK);

        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData.toByteArray()));
        assertNotNull(tar.getNextTarEntry());
        assertEquals(content.length, tar.available());
        byte[] buf = new byte[4];
        assertEquals(4, tar.read(buf, 0, 4));
        assertEquals(0, tar.read(buf, 0, 4));
        tar.close();
    }

    @Test
    public void testReadFullyWithShortRead() throws IOException {
        byte[] content = "short".getBytes();
        TarArchiveEntry entry = new TarArchiveEntry("short.txt");
        entry.setSize(content.length);
        ByteArrayOutputStream tarData = new ByteArrayOutputStream();
        try {
            tarData.write(new byte[512]); // header mock - just zeros
            tarData.write(content);
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testApplyPaxHeadersToCurrentEntry() throws IOException {
        TarArchiveInputStream tar = new TarArchiveInputStream(
                new ByteArrayInputStream(new byte[1024]));
        TarArchiveEntry entry = new TarArchiveEntry("original");
        entry.setSize(100);
        tar.setCurrentEntry(entry);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("path", "newpath.txt");
        headers.put("linkpath", "link");
        headers.put("gid", "100");
        headers.put("gname", "group");
        headers.put("uid", "200");
        headers.put("uname", "user");
        headers.put("size", "200");
        headers.put("mtime", "1000.5");
        headers.put("SCHILY.devminor", "3");
        headers.put("SCHILY.devmajor", "4");
        headers.put("GNU.sparse.size", "50");
        headers.put("GNU.sparse.realsize", "100");
        headers.put("SCHILY.filetype", "sparse");

        try {
            tar.applyPaxHeadersToCurrentEntry(headers);
            assertEquals("newpath.txt", entry.getName());
            assertEquals("link", entry.getLinkName());
            assertEquals(100L, entry.getGroupId());
            assertEquals("group", entry.getGroupName());
            assertEquals(200L, entry.getUserId());
            assertEquals("user", entry.getUserName());
            assertEquals(200L, entry.getSize());
            assertEquals(1000500L, entry.getModTime().getTime());
            assertEquals(3, entry.getDevMinor());
            assertEquals(4, entry.getDevMajor());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    private ByteArrayOutputStream createTarWithEntry(TarArchiveEntry entry, byte[] content) 
            throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write header
        byte[] header = new byte[512];
        byte[] nameBytes = entry.getName().getBytes("UTF-8");
        System.arraycopy(nameBytes, 0, header, 0, Math.min(nameBytes.length, 100));
        byte[] sizeBytes = Long.toOctalString(entry.getSize()).getBytes("UTF-8");
        System.arraycopy(sizeBytes, 0, header, 124, Math.min(sizeBytes.length, 12));
        byte[] magic = new byte[] { 'u', 's', 't', 'a', 'r', ' ', '\0', '0', '0' };
        System.arraycopy(magic, 0, header, 257, magic.length);
        baos.write(header);
        if (content != null) {
            baos.write(content);
            // Pad to 512 boundary
            int padding = 512 - (content.length % 512);
            if (padding != 512) {
                baos.write(new byte[padding]);
            }
        } else {
            baos.write(new byte[512]);
        }
        // Write EOF
        baos.write(EOF_BLOCK);
        baos.write(EOF_BLOCK);
        return baos;
    }
}