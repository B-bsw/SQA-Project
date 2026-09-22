package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class CpioArchiveInputStreamTest {

    private static final String MAGIC_NEW = "070701";
    private static final String MAGIC_NEW_CRC = "070702";
    private static final String MAGIC_OLD_ASCII = "070707";
    private static final String MAGIC_OLD_BINARY = "1234";
    private static final String CPIO_TRAILER = "TRAILER!!!";
    private static final byte[] TWO_BYTES = new byte[2];
    private static final byte[] FOUR_BYTES = new byte[4];
    private static final byte[] SIX_BYTES = new byte[6];
    private static final byte[] EIGHT_BYTES = new byte[8];

    @Test
    public void testAvailableBeforeEOF() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream in = new CpioArchiveInputStream(emptyStream);
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void testAvailableAfterEOF() throws IOException {
        // Simulate a stream with one entry and then EOF
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write header for one file
        writeHeader(baos, "test.txt", 5, MAGIC_NEW, false);
        baos.write("hello".getBytes());
        writeHeader(baos, CPIO_TRAILER, 0, MAGIC_NEW, false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), BLOCK_SIZE, "US-ASCII");
        in.getNextEntry();
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void testMatchesWithOldBinaryMagic() {
        byte[] sig = new byte[]{0x71, (byte)0xc7, 0x00, 0x00};
        assertTrue(CpioArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesWithSwappedOldBinaryMagic() {
        byte[] sig = new byte[]{(byte)0xc7, 0x71, 0x00, 0x00};
        assertTrue(CpioArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesWithNewMagic() {
        byte[] sig = new byte[]{(byte)0x30, (byte)0x37, (byte)0x30, (byte)0x37, (byte)0x30, (byte)0x31};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesWithCrcMagic() {
        byte[] sig = new byte[]{(byte)0x30, (byte)0x37, (byte)0x30, (byte)0x37, (byte)0x30, (byte)0x32};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesWithOldAsciiMagic() {
        byte[] sig = new byte[]{(byte)0x30, (byte)0x37, (byte)0x30, (byte)0x37, (byte)0x30, (byte)0x37};
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesWithInvalidLength() {
        byte[] sig = new byte[]{(byte)0x30, (byte)0x37};
        assertFalse(CpioArchiveInputStream.matches(sig, 2));
    }

    @Test(expected = IOException.class)
    public void testMatchesWithInvalidMagic() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[]{(byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00}));
        in.getNextEntry();
        in.close();
    }

    @Test
    public void testSkipWithNegativeValue() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("Expected IOException for negative skip");
        } catch (IOException e) {
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadWithNullArray() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(null, 0, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadWithPartialData() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeHeader(baos, "test", 10, MAGIC_NEW, false);
        baos.write(new byte[10]); // data
        writeHeader(baos, CPIO_TRAILER, 0, MAGIC_NEW, false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), BLOCK_SIZE, "US-ASCII");
        in.getNextEntry();
        byte[] buffer = new byte[8];
        int read = in.read(buffer, 0, buffer.length);
        assertEquals(8, read);
        in.close();
    }

    @Test
    public void testCloseEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeHeader(baos, "test", 5, MAGIC_NEW, false);
        baos.write("hello".getBytes());
        writeHeader(baos, CPIO_TRAILER, 0, MAGIC_NEW, false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), BLOCK_SIZE, "US-ASCII");
        in.getNextEntry();
        in.closeEntry();
        in.close();
    }

    @Test
    public void testGetNextEntryMultipleTimes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeHeader(baos, "file1", 3, MAGIC_NEW, false);
        baos.write("one".getBytes());
        writeHeader(baos, "file2", 3, MAGIC_NEW, false);
        baos.write("two".getBytes());
        writeHeader(baos, CPIO_TRAILER, 0, MAGIC_NEW, false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), BLOCK_SIZE, "US-ASCII");
        assertNotNull(in.getNextEntry());
        assertNotNull(in.getNextEntry());
        assertNotNull(in.getNextEntry()); // trailer
        in.close();
    }

    @Test
    public void testSkipToEndOfEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeHeader(baos, "big", 100, MAGIC_NEW, false);
        for (int i = 0; i < 100; i++) baos.write(0);
        writeHeader(baos, CPIO_TRAILER, 0, MAGIC_NEW, false);
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), BLOCK_SIZE, "US-ASCII");
        in.getNextEntry();
        long skipped = in.skip(200);
        assertEquals(100, skipped);
        in.close();
    }

    @Test
    public void testCloseWithEmptyStream() throws IOException {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close(); // double close
    }

    private void writeHeader(ByteArrayOutputStream baos, String name, long size, String magic, boolean crc) throws IOException {
        if (magic.equals(MAGIC_NEW) || magic.equals(MAGIC_NEW_CRC)) {
            writeAsciiField(baos, magic, 6);
            writeAsciiField(baos, String.format("%08x", 1), 8); // inode
            writeAsciiField(baos, String.format("%08x", 1), 8); // mode
            writeAsciiField(baos, String.format("%08x", 1), 8); // uid
            writeAsciiField(baos, String.format("%08x", 1), 8); // gid
            writeAsciiField(baos, String.format("%08x", 1), 8); // nlink
            writeAsciiField(baos, String.format("%08x", System.currentTimeMillis()/1000), 8); // mtime
            writeAsciiField(baos, String.format("%08x", size), 8); // filesize
            writeAsciiField(baos, "00000000", 8); // devmajor
            writeAsciiField(baos, "00000000", 8); // devminor
            writeAsciiField(baos, "00000000", 8); // rdevmajor
            writeAsciiField(baos, "00000000", 8); // rdevminor
            writeAsciiField(baos, String.format("%08x", 0), 8); // namesize
            writeAsciiField(baos, String.format("%08x", crc ? 1 : 0), 8); // check
            baos.write(name.getBytes());
            // padding
            while (baos.size() % 4 != 0) baos.write(0);
        } else {
            throw new UnsupportedOperationException("Only new formats supported for test");
        }
    }

    private void writeAsciiField(ByteArrayOutputStream baos, String value, int length) {
        byte[] bytes = value.getBytes();
        for (int i = 0; i < length - bytes.length; i++) baos.write('0');
        baos.write(bytes, 0, bytes.length);
    }
}