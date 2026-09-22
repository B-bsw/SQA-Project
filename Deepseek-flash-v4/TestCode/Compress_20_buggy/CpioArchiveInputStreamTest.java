package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertArrayEquals;
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

import org.junit.Test;

public class CpioArchiveInputStreamTest {

    private static final String TRAILER_NAME = "TRAILER!!!";

    private byte[] createOldAsciiArchive() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(String.format("%06o", 070707).getBytes("US-ASCII")); // magic
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // dev
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // ino
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // mode
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // uid
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // gid
        baos.write(String.format("%06o", 1).getBytes("US-ASCII")); // nlink
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // mtime
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // filesize
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // magic2
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // modif
        baos.write(String.format("%06o", 0).getBytes("US-ASCII")); // checksum
        // filename
        baos.write("TRAILER!!!\0".getBytes("US-ASCII"));
        // pad to 4-byte boundary
        while (baos.size() % 4 != 0) {
            baos.write(0);
        }
        return baos.toByteArray();
    }

    private CpioArchiveInputStream createStream(byte[] data) {
        return new CpioArchiveInputStream(new ByteArrayInputStream(data));
    }

    @Test
    public void testMatchesNegativeLength() {
        assertFalse(CpioArchiveInputStream.matches(new byte[10], -1));
    }

    @Test
    public void testMatchesShortLength() {
        byte[] shortSig = new byte[5];
        shortSig[0] = 0x30;
        assertFalse(CpioArchiveInputStream.matches(shortSig, 5));
    }

    @Test
    public void testMatchesOldBinaryMagic() {
        byte[] sig = CpioUtil.long2byteArray(0x71c7, 2, false);
        assertTrue(CpioArchiveInputStream.matches(sig, 2));
    }

    @Test
    public void testMatchesOldBinaryMagicSwapped() {
        byte[] sig = CpioUtil.long2byteArray(0x71c7, 2, true);
        assertTrue(CpioArchiveInputStream.matches(sig, 2));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] sig = "abcdef".getBytes();
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testAvailableOpen() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        in.getNextEntry();
        assertEquals(1, in.available());
        in.close();
    }

    @Test
    public void testAvailableEOF() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        assertNull(in.getNextEntry());
        assertEquals(0, in.available());
        in.close();
    }

    @Test(expected = IOException.class)
    public void testAvailableClosedStream() throws IOException {
        CpioArchiveInputStream in = createStream(new byte[0]);
        in.close();
        in.available();
    }

    @Test(expected = IOException.class)
    public void testCloseTwice() throws IOException {
        CpioArchiveInputStream in = createStream(new byte[0]);
        in.close();
        in.close();
    }

    @Test
    public void testReadInvalidOffLen() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        try {
            in.read(new byte[10], -1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        in.close();
    }

    @Test
    public void testReadLenZero() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        assertEquals(0, in.read(new byte[10], 0, 0));
        in.close();
    }

    @Test
    public void testReadNullEntryEOF() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        assertNull(in.getNextEntry());
        assertEquals(-1, in.read(new byte[10], 0, 1));
        in.close();
    }

    @Test
    public void testReadTrailer() throws IOException {
        CpioArchiveInputStream in = createStream(createOldAsciiArchive());
        CpioArchiveEntry e = in.getNextEntry();
        assertNull(e);
        in.close();
    }

    @Test
    public void testReadAsciiHeader() throws IOException {
        byte[] data = createOldAsciiArchive();
        CpioArchiveInputStream in = createStream(data);
        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testSkipNegative() throws IOException {
        CpioArchiveInputStream in = createStream(new byte[0]);
        try {
            in.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        in.close();
    }

    @Test
    public void testSkipZero() throws IOException {
        CpioArchiveInputStream in = createStream(new byte[0]);
        assertEquals(0, in.skip(0));
        in.close();
    }

    @Test
    public void testSkipNormal() throws IOException {
        byte[] data = new byte[100];
        data[0] = 0x00;
        CpioArchiveInputStream in = new CpioArchiveInputStream(new ByteArrayInputStream(data));
        // just ensure no exception and return value is zero for empty stream
        assertEquals(0, in.skip(10));
        in.close();
    }
}