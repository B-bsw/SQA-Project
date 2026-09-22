package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class Base64InputStreamTest {

    private static final byte[] ENCODED = "SGVsbG8gV29ybGQh".getBytes();
    private static final byte[] DECODED = "Hello World!".getBytes();

    private InputStream createStream(final byte[] data) {
        return new ByteArrayInputStream(data);
    }

    private void assertDecodedEquals(final byte[] expected, final Base64InputStream in) throws IOException {
        final byte[] actual = new byte[expected.length];
        int read = in.read(actual, 0, expected.length);
        assertEquals(expected.length, read);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReadSingleByteWithEOF() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        assertEquals('H', in.read());
        assertEquals('e', in.read());
        in.read(); // consume rest partially
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testReadSingleByteWithEOFWhenEmpty() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(new byte[0]));
        assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testReadNullBuffer() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        try {
            in.read(null, 0, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
        in.close();
    }

    @Test
    public void testReadInvalidOffsetAndLength() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        final byte[] buf = new byte[10];
        try {
            in.read(buf, -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            in.read(buf, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            in.read(buf, 5, 10);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        in.close();
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        assertEquals(0, in.read(new byte[10], 0, 0));
        in.close();
    }

    @Test
    public void testDecodeMultipleReads() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        final byte[] buf = new byte[6];
        int read = in.read(buf, 0, buf.length);
        assertEquals(6, read);
        assertArrayEquals(new byte[]{'H','e','l','l','o',' '}, buf);
        read = in.read(buf, 0, buf.length);
        assertEquals(6, read);
        assertArrayEquals(new byte[]{'W','o','r','l','d','!'}, buf);
        assertEquals(-1, in.read(buf, 0, 1));
        in.close();
    }

    @Test
    public void testEncodeMode() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(DECODED), true);
        final byte[] buf = new byte[ENCODED.length];
        int read = in.read(buf, 0, buf.length);
        assertEquals(ENCODED.length, read);
        assertArrayEquals(ENCODED, buf);
        assertEquals(-1, in.read(buf, 0, 1));
        in.close();
    }

    @Test
    public void testMarkSupportedFalse() {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        assertFalse(in.markSupported());
        in.close();
    }

    @Test
    public void testNonBase64DataReturnsZeroThenProcesses() throws IOException {
        final byte[] data = new byte[9000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        data[0] = 'A'; data[1] = 'B'; data[2] = 'C'; data[3] = 'D'; // valid base64
        data[4] = '='; data[5] = '\n';
        final Base64InputStream in = new Base64InputStream(createStream(data), false, 0, new byte[0]);
        final byte[] buf = new byte[16];
        int read = in.read(buf, 0, buf.length);
        assertTrue(read > 0);
        in.close();
    }

    @Test
    public void testSkipAndAvailableWithTrailingNonBase64() throws IOException {
        final byte[] padded = "SGVsbG8gV29ybGQh=".getBytes();
        final Base64InputStream in = new Base64InputStream(createStream(padded));
        assertNotEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testReadWithLargeBuffer() throws IOException {
        final Base64InputStream in = new Base64InputStream(createStream(ENCODED));
        final byte[] buf = new byte[100];
        int read = in.read(buf, 0, buf.length);
        assertEquals(ENCODED.length / 4 * 3, read);
        in.close();
    }
}