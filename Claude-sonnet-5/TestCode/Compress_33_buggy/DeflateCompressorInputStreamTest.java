package org.apache.commons.compress.compressors.deflate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.junit.Test;

public class DeflateCompressorInputStreamTest {

    private byte[] compress(byte[] data, boolean nowrap) throws IOException {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, nowrap);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, deflater);
        dos.write(data);
        dos.close();
        return baos.toByteArray();
    }

    @Test
    public void testReadSingleByteNormalCase() throws IOException {
        byte[] original = "Hello, Deflate!".getBytes();
        byte[] compressed = compress(original, false); // zlib header

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            result.write(b);
        }
        in.close();

        assertArrayEquals(original, result.toByteArray());
        assertEquals(original.length, in.getBytesRead());
    }

    @Test
    public void testReadByteArrayNormalCase() throws IOException {
        byte[] original = "The quick brown fox jumps over the lazy dog".getBytes();
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        byte[] buf = new byte[1024];
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int len;
        while ((len = in.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, len);
        }
        in.close();

        assertArrayEquals(original, result.toByteArray());
    }

    @Test
    public void testReadByteArrayWithMultipleChunks() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("data chunk number ").append(i).append(" ");
        }
        byte[] original = sb.toString().getBytes();
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        byte[] buf = new byte[16]; // small buffer to force multiple reads
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        int len;
        int readCount = 0;
        while ((len = in.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, len);
            readCount++;
        }
        in.close();

        assertArrayEquals(original, result.toByteArray());
        assertTrue(readCount > 1);
    }

    @Test
    public void testReadRawDeflateNoZlibHeader() throws IOException {
        byte[] original = "Raw deflate without zlib header".getBytes();
        byte[] compressed = compress(original, true); // no zlib header

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed), params);

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        int len;
        while ((len = in.read(buf, 0, buf.length)) != -1) {
            result.write(buf, 0, len);
        }
        in.close();

        assertArrayEquals(original, result.toByteArray());
    }

    @Test
    public void testReadEmptyInput() throws IOException {
        byte[] original = new byte[0];
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        int b = in.read();
        assertEquals(-1, b);
        assertEquals(0, in.getBytesRead());
        in.close();
    }

    @Test
    public void testReadByteArrayBoundaryZeroLength() throws IOException {
        byte[] original = "some data".getBytes();
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        byte[] buf = new byte[10];
        int ret = in.read(buf, 0, 0);
        assertEquals(0, ret);
        in.close();
    }

    @Test
    public void testReadAtEOFReturnsMinusOne() throws IOException {
        byte[] original = "small".getBytes();
        byte[] compressed = compress(original, false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
                new ByteArrayInputStream(compressed));

        byte[] buf = new byte[1024];
        int total = 0;
        int len;
        while ((len = in.read(buf, total, buf.length - total)) != -1) {
            total += len;
        }
        assertEquals(-1, len);
        assertEquals(original.length, total);

        // subsequent read should also return -1
        int again = in.read();
        assertEquals(-1, again);

        in.close();
    }

    @Test
    public void testSkip() throws IOException {
        byte[] original = "0123456789ABCDE