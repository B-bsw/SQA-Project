package org.apache.commons.compress.utils;

import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import java.util.zip.CRC32;

import static org.junit.Assert.*;

public class ChecksumCalculatingInputStreamTest {

    private static class MockChecksum implements Checksum {
        private long value = 0;
        private int updateCount = 0;
        private int updateWithByteArrayCount = 0;
        private int[] lastByteArray;
        private int lastOff;
        private int lastLen;

        @Override
        public void update(int b) {
            updateCount++;
            value = value * 31 + b; // simple hash for testing
        }

        @Override
        public void update(byte[] b, int off, int len) {
            updateWithByteArrayCount++;
            lastByteArray = b.clone();
            lastOff = off;
            lastLen = len;
            for (int i = off; i < off + len; i++) {
                value = value * 31 + b[i];
            }
        }

        @Override
        public long getValue() {
            return value;
        }

        @Override
        public void reset() {
            value = 0;
            updateCount = 0;
            updateWithByteArrayCount = 0;
        }

        public int getUpdateCount() { return updateCount; }
        public int getUpdateWithByteArrayCount() { return updateWithByteArrayCount; }
        public int[] getLastByteArray() { return lastByteArray; }
        public int getLastOff() { return lastOff; }
        public int getLastLen() { return lastLen; }
    }

    private static class ThrowingInputStream extends InputStream {
        private final boolean throwOnFirstRead;
        private int readCount = 0;

        public ThrowingInputStream(boolean throwOnFirstRead) {
            this.throwOnFirstRead = throwOnFirstRead;
        }

        @Override
        public int read() throws IOException {
            if (throwOnFirstRead && readCount == 0) {
                throw new IOException("First read fails");
            }
            readCount++;
            return -1; // EOF
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (throwOnFirstRead && readCount == 0) {
                throw new IOException("First read fails");
            }
            readCount++;
            return -1; // EOF
        }

        @Override
        public long skip(long n) throws IOException {
            if (throwOnFirstRead && readCount == 0) {
                throw new IOException("First skip fails");
            }
            readCount++;
            return 0;
        }
    }

    private static class CountingInputStream extends InputStream {
        private final byte[] data;
        private int pos = 0;
        private int readCalls = 0;
        private int skipCalls = 0;

        public CountingInputStream(byte[] data) {
            this.data = data;
        }

        @Override
        public int read() throws IOException {
            readCalls++;
            if (pos >= data.length) {
                return -1;
            }
            return data[pos++] & 0xFF;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            readCalls++;
            if (pos >= data.length) {
                return -1;
            }
            int count = Math.min(len, data.length - pos);
            System.arraycopy(data, pos, b, off, count);
            pos += count;
            return count;
        }

        @Override
        public long skip(long n) throws IOException {
            skipCalls++;
            int skipped = (int) Math.min(n, data.length - pos);
            pos += skipped;
            return skipped;
        }

        public int getReadCalls() { return readCalls; }
        public int getSkipCalls() { return skipCalls; }
    }

    private MockChecksum mockChecksum;
    private ByteArrayInputStream emptyStream;
    private ByteArrayInputStream singleByteStream;
    private ByteArrayInputStream multiByteStream;

    @Before
    public void setUp() {
        mockChecksum = new MockChecksum();
        emptyStream = new ByteArrayInputStream(new byte[0]);
        singleByteStream = new ByteArrayInputStream(new byte[]{0x41}); // 'A'
        multiByteStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4, 5});
    }

    // --- Constructors and basic getValue ---

    @Test
    public void testConstructorAndGetValueInitial() {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, emptyStream);
        assertEquals("Initial checksum value should be 0", 0L, cis.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullChecksum() {
        new ChecksumCalculatingInputStream(null, emptyStream);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullInputStream() {
        new ChecksumCalculatingInputStream(mockChecksum, null);
    }

    // --- read() ---

    @Test
    public void testReadSingleByteFromEmptyStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, emptyStream);
        assertEquals("Reading from empty stream should return -1", -1, cis.read());
        assertEquals("Checksum should not be updated on empty read", 0L, cis.getValue());
        assertEquals("No update should be called", 0, mockChecksum.getUpdateCount());
    }

    @Test
    public void testReadSingleByteFromNonEmptyStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, singleByteStream);
        int b = cis.read();
        assertEquals("Should read 0x41", 0x41, b);
        assertEquals("Checksum should be updated", 0x41 * 31L, mockChecksum.getValue());
        assertEquals("Update should have been called once", 1, mockChecksum.getUpdateCount());
    }

    @Test
    public void testReadSingleByteToEOF() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, singleByteStream);
        cis.read();
        assertEquals("After reading all bytes, next read should return -1", -1, cis.read());
        assertEquals("Checksum update should not happen for EOF", 1, mockChecksum.getUpdateCount());
    }

    @Test
    public void testReadSingleByteWithIOException() throws IOException {
        ThrowingInputStream throwing = new ThrowingInputStream(true);
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, throwing);
        try {
            cis.read();
            fail("Should have thrown IOException");
        } catch (IOException e) {
            assertEquals("First read fails", e.getMessage());
        }
    }

    // --- read(byte[]) ---

    @Test
    public void testReadByteArrayFromEmptyStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, emptyStream);
        byte[] buffer = new byte[10];
        assertEquals("Empty stream should return -1 for read(byte[])", -1, cis.read(buffer));
        assertEquals("No checksum update expected", 0L, mockChecksum.getValue());
        assertEquals("No byte array update expected", 0, mockChecksum.getUpdateWithByteArrayCount());
    }

    @Test
    public void testReadByteArrayFromSingleByteStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, singleByteStream);
        byte[] buffer = new byte[10];
        int count = cis.read(buffer);
        assertEquals("Should read 1 byte", 1, count);
        assertEquals("First byte should be 0x41", 0x41, buffer[0] & 0xFF);
        assertEquals("Byte array update should have been called once", 1, mockChecksum.getUpdateWithByteArrayCount());
        assertEquals("Offset should be 0", 0, mockChecksum.getLastOff());
        assertEquals("Length should be 1", 1, mockChecksum.getLastLen());
    }

    @Test
    public void testReadByteArrayFromMultiByteStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        byte[] buffer = new byte[5];
        int count = cis.read(buffer);
        assertEquals("Should read 5 bytes", 5, count);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5}, buffer);
        assertEquals("Byte array update should have been called once", 1, mockChecksum.getUpdateWithByteArrayCount());
        assertEquals("Length should be 5", 5, mockChecksum.getLastLen());
    }

    @Test
    public void testReadByteArrayFullyThenEOF() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, new ByteArrayInputStream(new byte[]{1, 2}));
        byte[] buffer = new byte[3];
        int first = cis.read(buffer);
        assertEquals("First read should return 2 bytes", 2, first);
        assertEquals("Second read should return -1", -1, cis.read(buffer));
        assertEquals("Only one byte array update expected", 1, mockChecksum.getUpdateWithByteArrayCount());
    }

    @Test
    public void testReadByteArrayWithPartialBuffer() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, new ByteArrayInputStream(new byte[]{1, 2, 3}));
        byte[] buffer = new byte[5];
        int count = cis.read(buffer, 1, 2);
        assertEquals("Should read 2 bytes", 2, count);
        assertEquals("Buffer[1] should be 1", 1, buffer[1]);
        assertEquals("Buffer[2] should be 2", 2, buffer[2]);
        assertEquals("offset 1", 1, mockChecksum.getLastOff());
        assertEquals("len 2", 2, mockChecksum.getLastLen());
    }

    // --- read(byte[], int, int) ---

    @Test(expected = NullPointerException.class)
    public void testReadWithNullArray() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        cis.read(null, 0, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadWithInvalidOffset() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        cis.read(new byte[5], -1, 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadWithInvalidLength() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        cis.read(new byte[5], 0, 6);
    }

    @Test
    public void testReadWithZeroLength() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        byte[] buffer = new byte[5];
        int count = cis.read(buffer, 2, 0);
        assertEquals("Zero length read should return 0", 0, count);
        assertEquals("No checksum update should occur", 0, mockChecksum.getUpdateWithByteArrayCount());
    }

    @Test
    public void testReadWithExactBufferSize() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, multiByteStream);
        byte[] buffer = new byte[5];
        int count = cis.read(buffer, 0, 5);
        assertEquals("Should read exactly 5 bytes", 5, count);
        assertEquals("Last length should be 5", 5, mockChecksum.getLastLen());
    }

    // --- skip ---

    @Test
    public void testSkipOnEmptyStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, emptyStream);
        assertEquals("Skip on empty stream should return 0", 0, cis.skip(10));
        assertEquals("Checksum should not be updated", 0L, mockChecksum.getValue());
    }

    @Test
    public void testSkipOnNonEmptyStream() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, singleByteStream);
        long skipped = cis.skip(5);
        assertEquals("Should skip exactly 1 byte", 1, skipped);
        assertEquals("Checksum should be updated once", 1, mockChecksum.getUpdateCount());
        assertEquals("Checksum value should reflect read byte", 0x41 * 31L, mockChecksum.getValue());
    }

    @Test
    public void testSkipMultiple() throws IOException {
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, new ByteArrayInputStream(new byte[]{1, 2, 3}));
        assertEquals("First skip should return 1", 1, cis.skip(2));
        assertEquals("Second skip should return 1", 1, cis.skip(2));
        assertEquals("Third skip should return 0", 0, cis.skip(2));
        assertEquals("Checksum should have been updated twice", 2, mockChecksum.getUpdateCount());
    }

    @Test
    public void testSkipWithIOException() throws IOException {
        ThrowingInputStream throwing = new ThrowingInputStream(true);
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, throwing);
        try {
            cis.skip(1);
            fail("Should have thrown IOException");
        } catch (IOException e) {
            assertEquals("First skip fails", e.getMessage());
        }
    }

    // --- close ---

    @Test
    public void testClose() throws IOException {
        CheckingCloseInputStream closeStream = new CheckingCloseInputStream();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(mockChecksum, closeStream);
        cis.close();
        assertTrue("Underlying stream should be closed", closeStream.isClosed());
    }

    private static class CheckingCloseInputStream extends InputStream {
        private boolean closed = false;

        @Override
        public int read() throws IOException {
            return -1;
        }

        @Override
        public void close() throws IOException {
            closed = true;
            super.close();
        }

        public boolean isClosed() { return closed; }
    }

    // --- integration with real CRC32 ---

    @Test
    public void testRealCRC32WithSingleByte() throws IOException {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(crc, singleByteStream);
        cis.read();
        assertEquals("CRC32 of empty should be 0", 0x20200201L, crc.getValue());
    }

    @Test
    public void testRealCRC32WithMultiBytes() throws IOException {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(crc, multiByteStream);
        byte[] buffer = new byte[5];
        cis.read(buffer);
        // CRC32 of [1,2,3,4,5]
        assertEquals(0x4C2750BDL, crc.getValue());
    }

    @Test
    public void testRealCRC32WithFullReadThenEOF() throws IOException {
        CRC32 crc = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(crc, new ByteArrayInputStream(new byte[]{1, 2, 3}));
        byte[] buffer = new byte[3];
        cis.read(buffer);
        assertEquals("CRC32 of [1,2,3] should be 0xCBF43926", 0xCBF43926L, crc.getValue());
        assertEquals("Next read should return -1", -1, cis.read());
    }
}