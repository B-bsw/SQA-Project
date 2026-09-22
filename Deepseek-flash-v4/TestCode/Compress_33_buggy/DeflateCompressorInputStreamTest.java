package org.apache.commons.compress.compressors.deflate;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeflateCompressorInputStreamTest {

    private static final byte[] EMPTY = new byte[0];
    private static final byte[] SIMPLE_TEXT = "Hello, Deflate!".getBytes();
    private static final byte[] LARGE_DATA;

    static {
        LARGE_DATA = new byte[1024 * 64]; // 64KB random data
        new Random(42L).nextBytes(LARGE_DATA);
    }

    private DeflateCompressorInputStream stream;
    private ByteArrayInputStream rawInput;

    @Before
    public void setUp() throws IOException {
        // Default is with zlib header
        rawInput = new ByteArrayInputStream(compress(SIMPLE_TEXT, true));
        stream = new DeflateCompressorInputStream(rawInput);
    }

    @After
    public void tearDown() throws IOException {
        if (stream != null) {
            stream.close();
        }
    }

    @Test
    public void testReadSingleByte() throws IOException {
        int first = stream.read();
        assertEquals(SIMPLE_TEXT[0] & 0xFF, first);
        int second = stream.read();
        assertEquals(SIMPLE_TEXT[1] & 0xFF, second);
    }

    @Test
    public void testReadMultipleBytes() throws IOException {
        byte[] buf = new byte[10];
        int n = stream.read(buf, 0, buf.length);
        assertTrue(n > 0);
        assertArrayEquals(java.util.Arrays.copyOf(SIMPLE_TEXT, n), java.util.Arrays.copyOf(buf, n));
    }

    @Test
    public void testReadWithZlibHeader() throws IOException {
        byte[] buf = new byte[SIMPLE_TEXT.length];
        int n = stream.read(buf);
        assertEquals(SIMPLE_TEXT.length, n);
        assertArrayEquals(SIMPLE_TEXT, buf);
        assertEquals(-1, stream.read()); // EOF after full read
    }

    @Test
    public void testReadWithoutZlibHeader() throws IOException {
        byte[] rawDeflate = compress(SIMPLE_TEXT, false);
        DeflateCompressorInputStream noHeaderStream = new DeflateCompressorInputStream(
                new ByteArrayInputStream(rawDeflate), new DeflateParameters());
        byte[] buf = new byte[SIMPLE_TEXT.length];
        int n = noHeaderStream.read(buf);
        assertEquals(SIMPLE_TEXT.length, n);
        assertArrayEquals(SIMPLE_TEXT, buf);
        noHeaderStream.close();
    }

    @Test
    public void testReadEmptyData() throws IOException {
        DeflateCompressorInputStream emptyStream = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compress(EMPTY, true)));
        assertEquals(-1, emptyStream.read());
        byte[] buf = new byte[10];
        assertEquals(-1, emptyStream.read(buf, 0, buf.length));
        emptyStream.close();
    }

    @Test
    public void testReadLargeData() throws IOException {
        byte[] compressed = compress(LARGE_DATA, true);
        DeflateCompressorInputStream largeStream = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = largeStream.read(buf)) != -1) {
            baos.write(buf, 0, n);
        }
        assertArrayEquals(LARGE_DATA, baos.toByteArray());
        largeStream.close();
    }

    @Test
    public void testReadWithAllZeroLengthBuffer() throws IOException {
        byte[] buf = new byte[0];
        assertEquals(0, stream.read(buf, 0, 0));
    }

    @Test
    public void testSkip() throws IOException {
        // Skip first 3 bytes
        long skipped = stream.skip(3);
        assertEquals(3, skipped);
        int fourth = stream.read();
        assertEquals(SIMPLE_TEXT[3] & 0xFF, fourth);
    }

    @Test
    public void testSkipToEnd() throws IOException {
        long skipped = stream.skip(Long.MAX_VALUE);
        assertEquals(SIMPLE_TEXT.length, skipped);
        assertEquals(-1, stream.read());
    }

    @Test
    public void testAvailableInitially() throws IOException {
        int available = stream.available();
        assertTrue(available >= 0);
        assertTrue(available <= SIMPLE_TEXT.length);
    }

    @Test
    public void testAvailableAfterReading() throws IOException {
        stream.read();
        int availableAfter = stream.available();
        assertTrue(availableAfter >= 0);
    }

    @Test
    public void testConstructorWithNullInputStream() {
        try {
            new DeflateCompressorInputStream(null);
            fail("Expected NullPointerException for null input stream");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithNullParameters() {
        try {
            new DeflateCompressorInputStream(new ByteArrayInputStream(EMPTY), null);
            fail("Expected NullPointerException for null parameters");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNullBuffer() throws IOException {
        byte[] buf = null;
        try {
            stream.read(buf, 0, 10);
            fail("Expected NullPointerException for null buffer");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNegativeOffset() throws IOException {
        byte[] buf = new byte[10];
        try {
            stream.read(buf, -1, 5);
            fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithLengthTooLarge() throws IOException {
        byte[] buf = new byte[10];
        try {
            stream.read(buf, 0, buf.length + 1);
            fail("Expected IndexOutOfBoundsException for length too large");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testClose() throws IOException {
        stream.close();
        // Should be idempotent - no exception on double close
        stream.close();
    }

    @Test
    public void testDoubleClose() throws IOException {
        stream.close();
        stream.close();
    }

    // Additional test to ensure counting works correctly
    @Test
    public void testCountAfterRead() throws IOException {
        byte[] buf = new byte[10];
        stream.read(buf, 0, 5);
        // count should be 5 after reading 5 bytes
        assertEquals(5, stream.getCount());
        stream.read(buf, 0, 3);
        assertEquals(8, stream.getCount());
    }

    @Test
    public void testCountWithSkip() throws IOException {
        stream.skip(2);
        assertEquals(2, stream.getCount());
    }

    @Test
    public void testReadSingleByteCount() throws IOException {
        stream.read();
        assertEquals(1, stream.getCount());
        stream.read();
        assertEquals(2, stream.getCount());
    }

    private static byte[] compress(byte[] data, boolean withZlibHeader) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(
                Deflater.DEFAULT_COMPRESSION, !withZlibHeader));
        dos.write(data);
        dos.close();
        return baos.toByteArray();
    }
}