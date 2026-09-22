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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.junit.Before;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static final byte[] ZERO_BLOCK = new byte[512];
    private static final byte[] ZERO_RECORD = new byte[512];

    @Before
    public void setUp() {
        // no setup needed for these tests
    }

    @Test
    public void testMatchesNullSignature() {
        assertFalse(TarArchiveInputStream.matches(null, 0));
    }

    @Test
    public void testMatchesShortLength() {
        byte[] signature = new byte[10];
        assertFalse(TarArchiveInputStream.matches(signature, 10));
    }

    @Test
    public void testMatchesNegativeLength() {
        byte[] signature = new byte[10];
        assertFalse(TarArchiveInputStream.matches(signature, -1));
    }

    @Test
    public void testMatchesZeroLength() {
        byte[] signature = new byte[10];
        assertFalse(TarArchiveInputStream.matches(signature, 0));
    }

    @Test
    public void testMatchesValidPosixSignature() {
        byte[] signature = new byte[1024];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, signature, 257, TarConstants.MAGIC_POSIX.length);
        assertTrue(TarArchiveInputStream.matches(signature, 1024));
    }

    @Test
    public void testMatchesValidGnuSignature() {
        byte[] signature = new byte[1024];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, signature, 257, TarConstants.MAGIC_GNU.length);
        assertTrue(TarArchiveInputStream.matches(signature, 1024));
    }

    @Test
    public void testMatchesValidAntSignature() {
        byte[] signature = new byte[1024];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, signature, 257, TarConstants.MAGIC_ANT.length);
        assertTrue(TarArchiveInputStream.matches(signature, 1024));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] signature = new byte[1024];
        signature[257] = 'X';
        signature[258] = 'Y';
        assertFalse(TarArchiveInputStream.matches(signature, 1024));
    }

    @Test
    public void testParsePaxHeadersEmptyInput() throws IOException {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeadersWithValue() throws IOException {
        String paxHeader = "10 path=foo\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals(1, headers.size());
        assertEquals("foo", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersMultipleEntries() throws IOException {
        String paxHeader = "10 path=foo\n10 path=bar\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals(2, headers.size());
        assertEquals("bar", headers.get("path")); // last wins
    }

    @Test
    public void testParsePaxHeadersWithTrailingNul() throws IOException {
        String paxHeader = "10 path=foo\n"; 
        paxHeader = "10 path=foo\0";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("foo", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersMissingSeparator() {
        String paxHeader = "10path=foo\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        try {
            java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
            tarIn.parsePaxHeaders(br);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testParsePaxHeadersEmptyValue() throws IOException {
        String paxHeader = "10 path=\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersLengthExcess() {
        String paxHeader = "5 path=foo\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        try {
            java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
            tarIn.parsePaxHeaders(br);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testParsePaxHeadersWithNewlineInValue() throws IOException {
        String paxHeader = "20 path=foo\nbar\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("foo\nbar\n", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithEmptyString() throws IOException {
        String paxHeader = "";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeadersWithOneChar() throws IOException {
        String paxHeader = "6 path=a\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("a", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithKeywordOnly() throws IOException {
        String paxHeader = "6 path=\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithMultipleEquals() throws IOException {
        String paxHeader = "11 path=a=b\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertEquals("a=b", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersWithZeroLengthValue() throws IOException {
        String paxHeader = "1 path=\n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        boolean exceptionOccurred = false;
        try {
            tarIn.parsePaxHeaders(br);
        } catch (IOException e) {
            exceptionOccurred = true;
        }
        assertTrue(exceptionOccurred);
    }

    @Test
    public void testParsePaxHeadersWithNoValues() throws IOException {
        String paxHeader = "0 \n";
        InputStream input = new ByteArrayInputStream(paxHeader.getBytes("UTF-8"));
        TarArchiveInputStream tarIn = new TarArchiveInputStream(input);
        java.io.Reader br = new java.io.InputStreamReader(input, "UTF-8");
        java.util.Map<String, String> headers = tarIn.parsePaxHeaders(br);
        assertNotNull(headers);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testCanReadEntryDataNull() {
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tarIn.canReadEntryData(null));
    }

    @Test
    public void testCanReadEntryDataNonTarEntry() {
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tarIn.canReadEntryData(new org.apache.commons.compress.archivers.tar.TarArchiveEntry("test")));
    }

    @Test
    public void testCanReadEntryDataTarEntry() {
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("test");
        assertTrue(tarIn.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataSparseTarEntry() {
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setSparseHeaders(new java.util.ArrayList<TarArchiveSparseEntry>());
        assertFalse(tarIn.canReadEntryData(entry));
    }

    @Test
    public void testCloseUnopenedStream() throws IOException {
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tarIn.close();
    }

    @Test
    public void testReadBufferBoundary() throws IOException {
        byte[] data = "hello world".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[5];
        assertEquals(5, tarIn.read(buffer, 0, 5));
        assertEquals("hello", new String(buffer, 0, 5));
    }

    @Test
    public void testReadBufferEmpty() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[10];
        assertEquals(5, tarIn.read(buffer, 0, 10));
        assertEquals("hello", new String(buffer, 0, 5));
    }

    @Test
    public void testReadBufferNegativeOffset() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[10];
        try {
            tarIn.read(buffer, -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSkipNegative() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertEquals(0, tarIn.skip(-1));
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertEquals(0, tarIn.skip(0));
    }

    @Test
    public void testSkipExactBufferSize() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertEquals(5, tarIn.skip(5));
    }

    @Test
    public void testSkipExceedBufferSize() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertEquals(5, tarIn.skip(10));
    }

    @Test
    public void testSkipMultipleBuffers() throws IOException {
        byte[] data = new byte[5000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        assertEquals(5000, tarIn.skip(5000));
    }

    @Test
    public void testAvailable() throws IOException {
        byte[] data = "hello".getBytes();
        TarArchiveInputStream tarIn = new TarArchiveInputStream(new ByteArrayInputStream(data));
        // Set entrySize and entryOffset not possible without a tar entry, so just verify
        // default behavior returns 0.
        assertEquals(0, tarIn.available());
    }
}