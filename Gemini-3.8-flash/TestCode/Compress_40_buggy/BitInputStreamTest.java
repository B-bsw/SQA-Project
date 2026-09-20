package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {

    private static class CloseTrackingInputStream extends InputStream {
        private final InputStream delegate;
        private boolean closed = false;

        public CloseTrackingInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        public int read() throws IOException {
            return delegate.read();
        }

        public void close() throws IOException {
            closed = true;
            delegate.close();
        }

        public boolean isClosed() {
            return closed;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void readBits_givenNegativeCount_shouldThrowIllegalArgumentException() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            bis.readBits(-1);
        } finally {
            bis.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void readBits_givenCountGreaterThan63_shouldThrowIllegalArgumentException() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            bis.readBits(64);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenCountZero_shouldReturnZeroWithoutConsumingBits() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{(byte) 0xAA});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            long result = bis.readBits(0);
            Assert.assertEquals(0L, result);

            long nextByte = bis.readBits(8);
            Assert.assertEquals(0xAA, nextByte);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenEmptyStream_shouldReturnNegativeOne() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            long result = bis.readBits(1);
            Assert.assertEquals(-1L, result);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenStreamEndingPrematurely_shouldReturnNegativeOne() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{(byte) 0xFF});
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            long result = bis.readBits(9);
            Assert.assertEquals(-1L, result);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenLittleEndianAcrossBytes_shouldReturnCorrectValues() throws IOException {
        // 0x2C = 0010 1100, 0x01 = 0000 0001
        byte[] data = new byte[]{(byte) 0x2C, (byte) 0x01};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            // First 4 bits: 1100 -> 12 (0x0C)
            Assert.assertEquals(12L, bis.readBits(4));
            // Next 4 bits: 0010 -> 2 (0x02)
            Assert.assertEquals(2L, bis.readBits(4));
            // Next 8 bits: 0000 0001 -> 1 (0x01)
            Assert.assertEquals(1L, bis.readBits(8));
            // Stream EOF
            Assert.assertEquals(-1L, bis.readBits(1));
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenBigEndianAcrossBytes_shouldReturnCorrectValues() throws IOException {
        // 0x2C = 0010 1100, 0x01 = 0000 0001
        byte[] data = new byte[]{(byte) 0x2C, (byte) 0x01};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        try {
            // High 4 bits of 0x2C: 0010 -> 2 (0x02)
            Assert.assertEquals(2L, bis.readBits(4));
            // Low 4 bits of 0x2C: 1100 -> 12 (0x0C)
            Assert.assertEquals(12L, bis.readBits(4));
            // Entire next byte: 0000 0001 -> 1 (0x01)
            Assert.assertEquals(1L, bis.readBits(8));
            // Stream EOF
            Assert.assertEquals(-1L, bis.readBits(1));
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenLittleEndianMultiByteRequest_shouldCombineProperly() throws IOException {
        // 0x55 = 01010101, 0xAA = 10101010
        // Combined LE: 0xAA55 = 1010 1010 0101 0101 = 43605
        byte[] data = new byte[]{(byte) 0x55, (byte) 0xAA};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            long result = bis.readBits(16);
            Assert.assertEquals(0xAA55L, result);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenBigEndianMultiByteRequest_shouldCombineProperly() throws IOException {
        // 0x55 = 01010101, 0xAA = 10101010
        // Combined BE: 0x55AA = 0101 0101 1010 1010 = 21930
        byte[] data = new byte[]{(byte) 0x55, (byte) 0xAA};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        try {
            long result = bis.readBits(16);
            Assert.assertEquals(0x55AAL, result);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenMax63BitsLittleEndian_shouldReadSuccessfully() throws IOException {
        byte[] data = new byte[]{
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x7F
        };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            long result = bis.readBits(63);
            Assert.assertEquals(0x7FFFFFFFFFFFFFFFL, result);
        } finally {
            bis.close();
        }
    }

    @Test
    public void readBits_givenMax63BitsBigEndian_shouldReadSuccessfully() throws IOException {
        byte[] data = new byte[]{
            (byte) 0x7F, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE
        };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        try {
            // 63 bits read from 8 bytes in big-endian
            long result = bis.readBits(63);
            Assert.assertEquals(0x7FFFFFFFFFFFFFFFL, result);

            // Last 1 bit remaining in the cache should be 0
            long remainingBit = bis.readBits(1);
            Assert.assertEquals(0L, remainingBit);
        } finally {
            bis.close();
        }
    }

    @Test
    public void clearBitCache_givenCachedBits_shouldDiscardCachedBits() throws IOException {
        byte[] data = new byte[]{(byte) 0xFF, (byte) 0x42};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bis = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        try {
            // Read 3 bits from 0xFF, 5 bits left in cache
            long firstRead = bis.readBits(3);
            Assert.assertEquals(7L, firstRead);

            // Clear cache, discarding the remaining 5 bits of 0xFF
            bis.clearBitCache();

            // Next read should pull directly from the next byte in the stream (0x42 = 66)
            long secondRead = bis.readBits(8);
            Assert.assertEquals(0x42L, secondRead);
        } finally {
            bis.close();
        }
    }

    @Test
    public void close_givenUnderlyingStream_shouldCloseUnderlyingStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        CloseTrackingInputStream trackingIn = new CloseTrackingInputStream(in);
        BitInputStream bis = new BitInputStream(trackingIn, ByteOrder.LITTLE_ENDIAN);

        Assert.assertFalse(trackingIn.isClosed());
        bis.close();
        Assert.assertTrue(trackingIn.isClosed());
    }
}