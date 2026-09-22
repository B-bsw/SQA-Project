package org.apache.commons.compress.archivers.ar;

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

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Test;

public class ArArchiveInputStreamTest {

    private static final String HEADER = "!<arch>\n";
    private static final String TRAILER = "`\n";
    private static final String FULL_HEADER = HEADER + "test.txt" + pad(16 - "test.txt".length())
            + "123456789012" + "12345" + "1234" + "123456" + "100644" + "1234567890" + TRAILER;

    private static String pad(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    private static byte[] toBytes(String s) {
        return s.getBytes();
    }

    private static InputStream createStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }

    private static ArArchiveInputStream createStream(String data) {
        return new ArArchiveInputStream(createStream(toBytes(data)));
    }

    @Test
    public void testGetNextArEntryWithValidHeaderAndEntry() throws IOException {
        String data = FULL_HEADER;
        ArArchiveInputStream stream = createStream(data);

        ArArchiveEntry entry = stream.getNextArEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(1234567890L, entry.getLength());

        // Additional metadata assertions from ArArchiveEntry
        assertEquals(1234567890L, entry.getLastModified());
        assertEquals(12345, entry.getUserId());
        assertEquals(1234, entry.getGroupId());
        assertEquals(0x81A4, entry.getMode());
    }

    @Test
    public void testGetNextArEntryWithPaddingAtStart() throws IOException {
        // offset is 0 initially, but after reading header, offset becomes 8
        // Then if available() > 0, it processes entry normally
        String data = FULL_HEADER;
        ArArchiveInputStream stream = createStream(data);
        stream.setOffset(8); // simulate after reading header

        ArArchiveEntry entry = stream.getNextArEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testGetNextArEntryWithOddOffset() throws IOException {
        // Simulate offset from previous entry (odd offset)
        String data = HEADER + "pad" + TRAILER + "test.txt" + pad(16 - "test.txt".length())
                + "123456789012" + "12345" + "1234" + "123456" + "100644" + "1234567890" + TRAILER;
        ArArchiveInputStream stream = createStream(data);
        // Skip header and one byte padding implicitly? Actually after header offset=8
        // Then we need to have odd offset? Let's just read a first entry with odd length.
        // For simplicity, manually set offset to 9 to test the read() for padding
        stream.setOffset(9);
        ArArchiveEntry entry = stream.getNextArEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testGetNextArEntryWhenAvailableZero() throws IOException {
        // No data after header -> EOF
        String data = HEADER;
        ArArchiveInputStream stream = createStream(data);
        // After reading header, input.available() == 0
        ArArchiveEntry entry = stream.getNextArEntry();
        assertNull(entry);
    }

    @Test
    public void testGetNextArEntryThrowsIOExceptionForInvalidHeader() {
        String data = "invalid header content!";
        ArArchiveInputStream stream = createStream(data);
        try {
            stream.getNextArEntry();
            fail("Should throw IOException for invalid header");
        } catch (IOException e) {
            assertEquals("failed to read header", e.getMessage());
        }
    }

    @Test
    public void testGetNextArEntryThrowsIOExceptionForMismatchedHeader() throws IOException {
        String data = "!<ar>\n" + "test.txt" + pad(8) + "123456789012" + "12345" + "1234" + "123456" + "100644" + "1234567890" + TRAILER;
        ArArchiveInputStream stream = createStream(data);
        try {
            stream.getNextArEntry();
            fail("Should throw IOException for mismatched header");
        } catch (IOException e) {
            assertEquals("invalid header", e.getMessage().substring(0, 13));
        }
    }

    @Test
    public void testGetNextArEntryThrowsIOExceptionForInvalidTrailer() {
        // Correct header but wrong trailer
        String data = HEADER + "test.txt" + pad(16 - "test.txt".length())
                + "123456789012" + "12345" + "1234" + "123456" + "100644" + "1234567890" + "XX";
        ArArchiveInputStream stream = createStream(data);
        try {
            stream.getNextArEntry();
            fail("Should throw IOException for invalid entry header");
        } catch (IOException e) {
            assertEquals("failed to read entry header", e.getMessage());
        }
    }

    @Test
    public void testMatchesWithValidSignature() {
        byte[] sig = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertTrue(ArArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithShortLength() {
        byte[] sig = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e};
        assertFalse(ArArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithZeroSignature() {
        byte[] sig = new byte[8];
        assertFalse(ArArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testCloseClosesUnderlyingStream() throws IOException {
        InputStream is = createStream(toBytes(HEADER));
        ArArchiveInputStream stream = new ArArchiveInputStream(is);
        stream.close();
        stream.close(); // double close
        // After close, reading should throw IOException
        try {
            stream.read();
            fail("Should throw IOException after close");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testReadWithZeroLength() throws IOException {
        ArArchiveInputStream stream = createStream("test");
        byte[] buf = new byte[10];
        int read = stream.read(buf, 0, 0);
        assertEquals(0, read);
    }

    @Test
    public void testReadWithNegativeOffset() throws IOException {
        ArArchiveInputStream stream = createStream("test");
        byte[] buf = new byte[10];
        try {
            stream.read(buf, -1, 5);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReadBytesAndOffsetTracking() throws IOException {
        String data = "1234567890";
        ArArchiveInputStream stream = createStream(data);
        byte[] buffer = new byte[5];
        int read = stream.read(buffer, 2, 4);
        assertEquals(4, read);
        assertEquals(4, stream.getBytesRead());
        assertArrayEquals(new byte[]{'1','2','3','4'}, new byte[]{buffer[2], buffer[3], buffer[4], buffer[5]});
    }

    @Test
    public void testReadSingleByteAndOffsetTracking() throws IOException {
        ArArchiveInputStream stream = createStream("A");
        assertEquals('A', stream.read());
        assertEquals(1, stream.getBytesRead());
    }

    @Test
    public void testGetNextArEntryWithMultipleEntries() throws IOException {
        String entry1 = "a.txt" + pad(11) + "123456789012" + "12345" + "1234" + "123456" + "100644" + "5" + TRAILER + "hello";
        String entry2 = "b.txt" + pad(11) + "123456789012" + "12345" + "1234" + "123456" + "100644" + "6" + TRAILER + "world!";
        String data = HEADER + entry1 + entry2;
        ArArchiveInputStream stream = createStream(data);

        ArArchiveEntry e1 = stream.getNextArEntry();
        assertNotNull(e1);
        assertEquals("a.txt", e1.getName());
        assertEquals(5L, e1.getLength());

        ArArchiveEntry e2 = stream.getNextArEntry();
        assertNotNull(e2);
        assertEquals("b.txt", e2.getName());
        assertEquals(6L, e2.getLength());

        assertNull(stream.getNextArEntry());
    }

    @Test
    public void testReadWithFullBuffer() throws IOException {
        ArArchiveInputStream stream = createStream("hello world");
        byte[] buffer = new byte[100];
        int read = stream.read(buffer, 0, 100);
        assertEquals(11, read);
        assertEquals(11, stream.getBytesRead());
    }

    @Test
    public void testMatchesWithPartialSignature() {
        byte[] sig = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a, 0x00};
        assertTrue(ArArchiveInputStream.matches(sig, 9));
        assertFalse(ArArchiveInputStream.matches(sig, 7));
    }

    @Test
    public void testGetNextArEntryWithOddNamePadding() throws IOException {
        String name = "odd";
        String data = HEADER + name + pad(16 - name.length()) +
                "000000000000" + "00000" + "0000" + "000000" + "100644" + "10" + TRAILER + "0123456789";
        ArArchiveInputStream stream = createStream(data);
        ArArchiveEntry entry = stream.getNextArEntry();
        assertNotNull(entry);
        assertEquals(name, entry.getName());
        assertEquals(10L, entry.getLength());
    }

    @Test
    public void testMatchesWithInvalidByteAtEachPosition() {
        byte[] base = {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        for (int i = 0; i < 8; i++) {
            byte[] sig = base.clone();
            sig[i] = (byte) (sig[i] + 1); // change one byte
            assertFalse("Should fail at position " + i, ArArchiveInputStream.matches(sig, 8));
        }
    }

}