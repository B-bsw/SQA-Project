package org.apache.commons.compress.utils;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.junit.Test;

public class IOUtilsTest {

    // ---------- copy(InputStream, OutputStream) ----------

    @Test
    public void testCopyNormal() throws IOException {
        byte[] data = "Hello World".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out);
        assertEquals(data.length, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyEmptyStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out);
        assertEquals(0, count);
        assertEquals(0, out.toByteArray().length);
    }

    @Test
    public void testCopyMultipleLoopIterations() throws IOException {
        byte[] data = new byte[20000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out, 100);
        assertEquals(data.length, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyWithCustomBufferSize() throws IOException {
        byte[] data = "Some test data for buffer size test".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long count = IOUtils.copy(in, out, 4);
        assertEquals(data.length, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test(expected = IOException.class)
    public void testCopyThrowsIOException() throws IOException {
        InputStream in = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("read error");
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("read error");
            }
        };
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(in, out);
    }

    // ---------- skip(InputStream, long) ----------

    @Test
    public void testSkipNormal() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(in, 5);
        assertEquals(5, skipped);
        int next = in.read();
        assertEquals('5', next);
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = "0123456789".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(in, 0);
        assertEquals(0, skipped);
    }

    @Test
    public void testSkipMoreThanAvailable() throws IOException {
        byte[] data = "12345".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(in, 100);
        assertEquals(5, skipped);
    }

    @Test
    public void testSkipMultipleIterations() throws IOException {
        // A stream whose skip() only returns partial amounts each call,
        // forcing multiple loop iterations before finishing.
        InputStream in = new InputStream() {
            private long remaining = 30;

            @Override
            public int read() throws IOException {
                return -1;
            }

            @Override
            public long skip(long n) throws IOException {
                if (remaining <= 0) {
                    return 0;
                }
                long toSkip = Math.min(n, 10);
                toSkip = Math.min(toSkip, remaining);
                remaining -= toSkip;
                return toSkip