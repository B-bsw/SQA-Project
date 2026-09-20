package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.junit.Test;

public class ChecksumCalculatingInputStreamTest {

    private static class ThrowingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("simulated failure");
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            throw new IOException("simulated failure");
        }
    }

    @Test
    public void testReadSingleByteNormal() throws IOException {
        byte[] data = {65, 66, 67}; // A, B, C
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        int b1 = stream.read();
        assertEquals(65, b1);
        int b2 = stream.read();
        assertEquals(66, b2);
        int b3 = stream.read();
        assertEquals(67, b3);
        int eof = stream.read();
        assertEquals(-1, eof);

        CRC32 expected = new CRC32();
        expected.update(data, 0, data.length);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testReadSingleByteEmptyStream() throws IOException {
        byte[] data = {};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        int result = stream.read();
        assertEquals(-1, result);
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadByteArrayNormal() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[5];
        int read = stream.read(buffer);
        assertEquals(5, read);
        assertEquals(data.length, buffer.length);
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], buffer[i]);
        }

        CRC32 expected = new CRC32();
        expected.update(data, 0, data.length);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testReadByteArrayEmptyInputArray() throws IOException {
        byte[] data = {1, 2, 3};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[0];
        int read = stream.read(buffer);
        assertEquals(0, read);
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadByteArrayEmptyStream() throws IOException {
        byte[] data = {};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[5];
        int read = stream.read(buffer);
        assertEquals(-1, read);
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadWithOffsetAndLengthNormal() throws IOException {
        byte[] data = {10, 20, 30, 40, 50};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[10];
        int read = stream.read(buffer, 2, 5);
        assertEquals(5, read);
        assertEquals(10, buffer[2]);
        assertEquals(20, buffer[3]);
        assertEquals(30, buffer[4]);
        assertEquals(40, buffer[5]);
        assertEquals(50, buffer[6]);

        CRC32 expected = new CRC32();
        expected.update(data, 0, data.length);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testReadWithOffsetAndLengthPartial() throws IOException {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[10];
        int firstRead = stream.read(buffer, 0, 4);
        assertEquals(4, firstRead);

        int secondRead = stream.read(buffer, 4, 6);
        assertEquals(6, secondRead);

        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], buffer[i]);
        }

        CRC32 expected = new CRC32();
        expected.update(data, 0, data.length);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testReadWithOffsetAndLengthEmptyStream() throws IOException {
        byte[] data = {};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInputStream(data));

        byte[] buffer = new byte[5];
        int read = stream.read(buffer, 0, 5);
        assertEquals(-1, read);
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testSkipSingleByteAvailable() throws IOException {
        byte[] data = {1, 2, 3};
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(crc,
                new ByteArrayInput