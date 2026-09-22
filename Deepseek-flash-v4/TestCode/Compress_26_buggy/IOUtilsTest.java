package org.apache.commons.compress.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class IOUtilsTest {

    private static final byte[] EMPTY = new byte[0];
    private static final byte[] SINGLE = new byte[]{1};
    private static final byte[] MULTIPLE = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final byte[] LARGE = new byte[16384];
    
    static {
        for (int i = 0; i < LARGE.length; i++) {
            LARGE[i] = (byte) (i % 128);
        }
    }

    // ========== copy(InputStream, OutputStream) ==========
    @Test
    public void testCopyEmpty() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(EMPTY);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0L, IOUtils.copy(in, out));
        assertArrayEquals(EMPTY, out.toByteArray());
    }

    @Test
    public void testCopySingleByte() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(SINGLE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(1L, IOUtils.copy(in, out));
        assertArrayEquals(SINGLE, out.toByteArray());
    }

    @Test
    public void testCopyMultipleBytes() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(10L, IOUtils.copy(in, out));
        assertArrayEquals(MULTIPLE, out.toByteArray());
    }

    @Test
    public void testCopyLargeData() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(LARGE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(LARGE.length, IOUtils.copy(in, out));
        assertArrayEquals(LARGE, out.toByteArray());
    }

    @Test
    public void testCopyWithCustomBufferSizeZero() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // buffer size 0 should still work (may loop indefinitely? Actually it will read until EOF)
        assertEquals(10L, IOUtils.copy(in, out, 0));
        assertArrayEquals(MULTIPLE, out.toByteArray());
    }

    // ========== skip(InputStream, long) ==========
    @Test
    public void testSkipAll() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        assertEquals(10L, IOUtils.skip(in, 10));
        assertEquals(-1, in.read());
    }

    @Test
    public void testSkipPartial() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        assertEquals(3L, IOUtils.skip(in, 3));
        assertEquals(4, in.read());
    }

    @Test
    public void testSkipZero() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        assertEquals(0L, IOUtils.skip(in, 0));
        assertEquals(1, in.read());
    }

    @Test
    public void testSkipMoreThanAvailable() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        assertEquals(10L, IOUtils.skip(in, 100));
        assertEquals(-1, in.read());
    }

    @Test
    public void testSkipNegative() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        assertEquals(0L, IOUtils.skip(in, -1));
        assertEquals(1, in.read());
    }

    // ========== readFully(InputStream, byte[]) ==========
    @Test
    public void testReadFullyEmpty() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(EMPTY);
        byte[] buf = new byte[5];
        assertEquals(0, IOUtils.readFully(in, buf));
        assertArrayEquals(new byte[5], buf);
    }

    @Test
    public void testReadFullyPartial() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        byte[] buf = new byte[5];
        assertEquals(5, IOUtils.readFully(in, buf));
        assertEquals(1, buf[0]);
        assertEquals(5, buf[4]);
    }

    @Test
    public void testReadFullyExact() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        byte[] buf = new byte[10];
        assertEquals(10, IOUtils.readFully(in, buf));
        assertArrayEquals(MULTIPLE, buf);
    }

    @Test
    public void testReadFullyMoreThanAvailable() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        byte[] buf = new byte[15];
        assertEquals(10, IOUtils.readFully(in, buf));
        assertEquals(0, buf[10]);
    }

    // ========== readFully(InputStream, byte[], int, int) ==========
    @Test
    public void testReadFullyWithOffsetLen() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        byte[] buf = new byte[10];
        assertEquals(3, IOUtils.readFully(in, buf, 2, 3));
        assertArrayEquals(new byte[]{0, 0, 1, 2, 3, 0, 0, 0, 0, 0}, buf);
    }

    @Test
    public void testReadFullyWithOffsetLenExact() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(MULTIPLE);
        byte[] buf = new byte[15];
        assertEquals(10, IOUtils.readFully(in, buf, 2, 10));
        assertArrayEquals(new byte[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0}, buf);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyInvalidLenNegative() throws IOException {
        IOUtils.readFully(new ByteArrayInputStream(EMPTY), new byte[10], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyInvalidOffsetNegative() throws IOException {
        IOUtils.readFully(new ByteArrayInputStream(EMPTY), new byte[10], -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyInvalidOffsetPlusLenTooBig() throws IOException {
        IOUtils.readFully(new ByteArrayInputStream(EMPTY), new byte[10], 5, 6);
    }

    // ========== toByteArray(InputStream) ==========
    @Test
    public void testToByteArrayEmpty() throws IOException {
        assertArrayEquals(EMPTY, IOUtils.toByteArray(new ByteArrayInputStream(EMPTY)));
    }

    @Test
    public void testToByteArrayNonEmpty() throws IOException {
        assertArrayEquals(MULTIPLE, IOUtils.toByteArray(new ByteArrayInputStream(MULTIPLE)));
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArrayNull() throws IOException {
        IOUtils.toByteArray(null);
    }

    // ========== closeQuietly(Closeable) ==========
    @Test
    public void testCloseQuietlyNull() {
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietlySuccess() {
        Closeable c = new Closeable() {
            @Override
            public void close() throws IOException {
            }
        };
        IOUtils.closeQuietly(c);
    }

    @Test
    public void testCloseQuietlyThrowing() {
        Closeable c = new Closeable() {
            private int calls = 0;
            @Override
            public void close() throws IOException {
                if (++calls > 1) {
                    throw new IOException("boom");
                }
            }
        };
        IOUtils.closeQuietly(c);
        IOUtils.closeQuietly(c); // should swallow
    }

    // ========== Edge cases ==========
    @Test
    public void testCopyNullInput() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            IOUtils.copy(null, out);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCopyNullOutput() throws IOException {
        try {
            IOUtils.copy(new ByteArrayInputStream(EMPTY), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCopyLargeBuffer() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(LARGE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(LARGE.length, IOUtils.copy(in, out, 8192));
        assertArrayEquals(LARGE, out.toByteArray());
    }

    @Test
    public void testReadFullyNullInput() throws IOException {
        try {
            IOUtils.readFully(null, new byte[1]);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSkipNullInput() throws IOException {
        try {
            IOUtils.skip(null, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    // ========== Additional branch coverage ==========
    @Test
    public void testCopyThrowsIOException() throws IOException {
        final InputStream failingInput = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("read failed");
            }
        };
        try {
            IOUtils.copy(failingInput, new ByteArrayOutputStream());
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("read failed", e.getMessage());
        }
    }

    @Test
    public void testSkipWithReadFallback() throws IOException {
        final InputStream input = new InputStream() {
            @Override
            public int read() throws IOException {
                return 42;
            }
            @Override
            public long skip(long n) throws IOException {
                return 0; // always fails skip
            }
        };
        // Should fall back to read() and skip never solves anything -> infinite loop? 
        // Actually skip(1) called repeatedly returns 0 -> breaks loop.
        // But then numToSkip stays > 0 -> returns 0.
        assertEquals(0L, IOUtils.skip(input, 5));
    }

    @Test
    public void testSkipWithPartialReadFallback() throws IOException {
        final InputStream input = new InputStream() {
            private int count = 0;
            @Override
            public int read() throws IOException {
                if (count++ < 3) return 1;
                return -1;
            }
        };
        // skip(10) will try skip -> 0, then read up to 3 bytes and then EOF
        assertEquals(3L, IOUtils.skip(input, 10));
    }

    @Test
    public void testCloseQuietlyWithIOException() {
        Closeable c = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("ignored");
            }
        };
        IOUtils.closeQuietly(c);
    }

    // Test for toByteArray with large data to cover multiple buffer iterations
    @Test
    public void testToByteArrayLarge() throws IOException {
        assertArrayEquals(LARGE, IOUtils.toByteArray(new ByteArrayInputStream(LARGE)));
    }

    // Test readFully with zero length
    @Test
    public void testReadFullyZeroLen() throws IOException {
        byte[] buf = new byte[5];
        assertEquals(0, IOUtils.readFully(new ByteArrayInputStream(EMPTY), buf, 0, 0));
        assertArrayEquals(new byte[5], buf);
    }

    // Test readFully with offset at end
    @Test
    public void testReadFullyOffsetAtEnd() throws IOException {
        byte[] buf = new byte[5];
        assertEquals(0, IOUtils.readFully(new ByteArrayInputStream(EMPTY), buf, 5, 0));
        assertArrayEquals(new byte[5], buf);
    }

    // Test copy with large data and small buffer to exercise multiple writes
    @Test
    public void testCopyWithTinyBuffer() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(LARGE);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(LARGE.length, IOUtils.copy(in, out, 1));
        assertArrayEquals(LARGE, out.toByteArray());
    }
}