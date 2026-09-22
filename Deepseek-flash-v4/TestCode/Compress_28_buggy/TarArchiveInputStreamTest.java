package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static final byte[] ZERO_BLOCK = new byte[TarConstants.DEFAULT_RCDSIZE];
    private static final byte[] ZERO_RECORD = new byte[TarConstants.DEFAULT_RCDSIZE];

    @Before
    public void setUp() {
        // No setup required
    }

    @After
    public void tearDown() {
        // No teardown required
    }

    // Helper to create a valid TAR header with given name
    private byte[] createTarHeader(String name, long size, int mode, byte[]... extra) throws IOException {
        ByteArrayOutputStream headerBuf = new ByteArrayOutputStream();
        byte[] nameBytes = name.getBytes("UTF-8");
        headerBuf.write(nameBytes, 0, Math.min(nameBytes.length, 100));
        headerBuf.write(new byte[100 - Math.min(nameBytes.length, 100)]);
        headerBuf.write(new byte[24]); // mode, uid, gid - 8 each = 24 (0 for simplicity)
        // Write size in octal
        String sizeStr = String.format("%011o", size);
        headerBuf.write(sizeStr.getBytes("US-ASCII"));
        headerBuf.write(new byte[] {0});
        headerBuf.write(new byte[12]); // mtime, chksum
        headerBuf.write(new byte[8]); // typeflag
        headerBuf.write(new byte[100]); // linkname
        headerBuf.write(new byte[65]); // magic, version, uname, gname
        headerBuf.write(new byte[90]); // devmajor, devminor, prefix, padding
        // Write checksum digits (we'll just put spaces)
        byte[] header = headerBuf.toByteArray();
        byte[] checksumBuf = new byte[8];
        java.util.Arrays.fill(checksumBuf, (byte) ' ');
        System.arraycopy(checksumBuf, 0, header, 148, 8);
        int chkSum = 0;
        for (byte b : header) {
            chkSum += b & 0xff;
        }
        byte[] checksum = String.format("%06o", chkSum).getBytes("US-ASCII");
        System.arraycopy(checksum, 0, header, 148, checksum.length);
        header[154] = 0;
        System.arraycopy(checksum, 0, header, 148, checksum.length);
        // Fix integer overflow of octal
        // Recalculate with proper sum
        int sum = 0;
        for (int i = 0; i < 148; i++) sum += header[i] & 0xff;
        for (int i = 156; i < 512; i++) sum += header[i] & 0xff;
        chkSum = sum;
        String chkStr = String.format("%06o", chkSum);
        for (int i = 0; i < chkStr.length(); i++) header[148 + 5 - i] = (byte) (chkStr.charAt(chkStr.length() - 1 - i));
        return header;
    }

    @Test
    public void testConstructorDefaultRecordSize() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tarIn.getRecordSize());
    }

    @Test
    public void testGetNextEntryWithEOF() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        assertNull(tarIn.getNextTarEntry());
        assertTrue(tarIn.isAtEOF());
    }

    @Test
    public void testGetNextEntrySingleBlock() throws IOException {
        byte[] header = createTarHeader("test.txt", 0, 0644);
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testGetNextEntryWithTwoRecords() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] header = createTarHeader("file1.txt", 5, 0644);
        bos.write(header);
        bos.write("Hello".getBytes());
        bos.write(new byte[507]); // padding to record size
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("file1.txt", entry.getName());
        assertEquals(5, entry.getSize());
        byte[] data = new byte[5];
        int len = tarIn.read(data);
        assertEquals(5, len);
        assertEquals("Hello", new String(data, 0, len));
    }

    @Test
    public void testReadDataWithPadding() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] header = createTarHeader("file1.txt", 5, 0644);
        bos.write(header);
        bos.write("Hello".getBytes());
        bos.write(new byte[507]); // padding to record size
        // Add another entry
        bos.write(createTarHeader("file2.txt", 3, 0644));
        bos.write("abc".getBytes());
        bos.write(new byte[509]);
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        tarIn.getNextTarEntry();
        byte[] data = new byte[10];
        int totalRead = 0;
        while (totalRead < 5) {
            int r = tarIn.read(data, totalRead, 5 - totalRead);
            if (r == -1) break;
            totalRead += r;
        }
        assertEquals(5, totalRead);
        assertEquals("Hello", new String(data, 0, 5));
        // Next entry should have data "abc"
        TarArchiveEntry second = tarIn.getNextTarEntry();
        assertNotNull(second);
        assertEquals("file2.txt", second.getName());
        int r = tarIn.read(data);
        assertEquals(3, r);
        assertEquals("abc", new String(data, 0, 3));
    }

    @Test
    public void testSkipMethod() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] header = createTarHeader("file1.txt", 10, 0644);
        bos.write(header);
        bos.write("0123456789".getBytes());
        bos.write(new byte[502]); // padding
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        tarIn.getNextTarEntry();
        long skipped = tarIn.skip(5);
        assertEquals(5, skipped);
        byte[] data = new byte[5];
        tarIn.read(data);
        assertEquals("56789", new String(data));
    }

    @Test
    public void testAvailableMethod() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] header = createTarHeader("file1.txt", 10, 0644);
        bos.write(header);
        bos.write("0123456789".getBytes());
        bos.write(new byte[502]);
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        tarIn.getNextTarEntry();
        assertEquals(10, tarIn.available());
        tarIn.read(new byte[3]);
        assertEquals(7, tarIn.available());
    }

    @Test
    public void testIsAtEOFFalseBeforeReading() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        assertFalse(tarIn.isAtEOF());
    }

    @Test
    public void testMatchesMethod() {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, signature, 0, TarConstants.MAGIC_POSIX.length);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
        assertFalse(TarArchiveInputStream.matches(signature, 0));
    }

    @Test
    public void testGetNextTarEntryWithGNULongName() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // Create long name entry (GNU type L)
        String longName = "this/is/a/very/long/path/that/exceeds/one/hundred/characters/for/testing/purposes/to/verify/the/gnu/long/name/handling/works/correctly/and/does/not/fail";
        byte[] longNameBytes = longName.getBytes();
        byte[] longHeader = createTarHeader("././@LongLink", longNameBytes.length, 0644);
        longHeader[156] = 'L'; // GNU long name type
        bos.write(longHeader);
        bos.write(longNameBytes);
        // Pad to record boundary
        int padding = (TarConstants.DEFAULT_RCDSIZE - (longNameBytes.length % TarConstants.DEFAULT_RCDSIZE)) % TarConstants.DEFAULT_RCDSIZE;
        bos.write(new byte[padding]);
        // Now write actual file entry
        bos.write(createTarHeader("short.txt", 5, 0644));
        bos.write("hello".getBytes());
        bos.write(new byte[507]);
        InputStream is = new ByteArrayInputStream(bos.toByteArray());
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(longName, entry.getName());
    }

    @Test
    public void testMalformedHeaderThrowsIOException() throws IOException {
        byte[] malformed = new byte[TarConstants.DEFAULT_RCDSIZE];
        // Fill with bad data that triggers exception
        for (int i = 0; i < malformed.length; i++) {
            malformed[i] = (byte) 0xFF;
        }
        InputStream is = new ByteArrayInputStream(malformed);
        TarArchiveInputStream tarIn = new TarArchiveInputStream(is);
        try {
            tarIn.getNextTarEntry();
            fail("Should have thrown IOException");
        } catch (IOException e) {
            assertTrue(true);
        }
    }
}