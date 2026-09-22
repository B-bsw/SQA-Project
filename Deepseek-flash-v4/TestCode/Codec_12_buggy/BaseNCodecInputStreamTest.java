package org.apache.commons.codec.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class BaseNCodecInputStreamTest {

    // Test read() method
    @Test
    public void testReadSingleByte() throws IOException {
        byte[] data = {(byte) 0xFF, (byte) 0x80, 0x0F};
        try (InputStream in = new ByteArrayInputStream(data);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            assertEquals(255, stream.read());
            assertEquals(128, stream.read());
            assertEquals(15, stream.read());
            assertEquals(-1, stream.read());
        }
    }

    @Test
    public void testReadSingleByteWithEncoding() throws IOException {
        byte[] data = {(byte) 0x0A};
        try (InputStream in = new ByteArrayInputStream(data);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, true)) {
            assertEquals(10, stream.read());
        }
    }

    // Test read(byte[], int, int) with null array
    @Test(expected = NullPointerException.class)
    public void testReadNullArray() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            stream.read(null, 0, 1);
        }
    }

    // Test read(byte[], int, int) with invalid offset
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidOffset() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            stream.read(new byte[1], -1, 0);
        }
    }

    // Test read(byte[], int, int) with invalid length
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidLength() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            stream.read(new byte[1], 0, -1);
        }
    }

    // Test read(byte[], int, int) with offset plus length beyond array
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLengthBeyondArray() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            stream.read(new byte[1], 0, 2);
        }
    }

    // Test read(byte[], int, int) with zero length
    @Test
    public void testReadZeroLength() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[1]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            assertEquals(0, stream.read(new byte[1], 0, 0));
        }
    }

    // Test read(byte[], int, int) with data and zero-length result
    @Test
    public void testReadMultipleBytes() throws IOException {
        byte[] data = {(byte) 0x01, (byte) 0x02, (byte) 0x03};
        try (InputStream in = new ByteArrayInputStream(data);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            byte[] buffer = new byte[3];
            assertEquals(3, stream.read(buffer, 0, 3));
            assertArrayEquals(data, buffer);
            assertEquals(-1, stream.read(buffer, 0, 1));
        }
    }

    @Test
    public void testReadMultipleBytesWithLongData() throws IOException {
        byte[] data = new byte[8192];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        try (InputStream in = new ByteArrayInputStream(data);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            byte[] buffer = new byte[1000];
            int totalRead = 0;
            while (totalRead < data.length) {
                int read = stream.read(buffer, 0, 1000);
                if (read == -1) {
                    break;
                }
                totalRead += read;
            }
            assertEquals(data.length, totalRead);
        }
    }

    // Test markSupported returns false
    @Test
    public void testMarkSupported() throws IOException {
        try (InputStream in = new ByteArrayInputStream(new byte[0]);
             BaseNCodecInputStream stream = new TestBaseNCodecInputStream(in, false)) {
            assertFalse(stream.markSupported());
        }
    }

    // Helper class that provides a BaseNCodec implementation
    private static class TestBaseNCodecInputStream extends BaseNCodecInputStream {
        public TestBaseNCodecInputStream(InputStream in, boolean doEncode) {
            super(in, new Base32Codec(), doEncode);
        }
    }

    // Mock BaseNCodec for testing
    private static class Base32Codec extends BaseNCodec {
        private static final int DEFAULT_BUFFER_SIZE = 8192;
        private final byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
        private int bufferPosition;

        @Override
        protected boolean isInAlphabet(byte value) {
            return (value >= 'A' && value <= 'Z') || (value >= '2' && value <= '7');
        }

        @Override
        protected boolean isInAlphabet(byte[] array, boolean allowWSPad) {
            return false;
        }

        @Override
        public boolean isInAlphabet(String basen) {
            return false;
        }

        @Override
        protected void encode(byte[] array, int offset, int length) {
            // Simple encoding: duplicate the input and add a marker
            System.arraycopy(array, offset, buffer, 0, length);
            bufferPosition = length;
        }

        @Override
        protected void decode(byte[] array, int offset, int length) {
            System.arraycopy(array, offset, buffer, 0, length);
            bufferPosition = length;
        }

        @Override
        public long getEncodedLength(byte[] pArray) {
            return 0;
        }

        @Override
        public long getDecodedLength(byte[] pArray) {
            return 0;
        }

        @Override
        protected int readResults(byte[] b, int offset, int len) {
            if (bufferPosition <= 0) {
                return 0;
            }
            int bytesToCopy = Math.min(len, bufferPosition);
            System.arraycopy(buffer, 0, b, offset, bytesToCopy);
            bufferPosition -= bytesToCopy;
            return bytesToCopy;
        }

        @Override
        protected boolean hasData() {
            return bufferPosition > 0;
        }

        @Override
        protected int available() {
            return 0;
        }

        @Override
        protected void setInitialBuffer(byte[] out, int outPos, int outAvail) {
        }

        @Override
        protected void ensureBufferSize(int size) {
        }

        @Override
        protected void reset() {
            bufferPosition = 0;
        }
    }

    // Provide assertArrayEquals for byte array
    public static void assertArrayEquals(byte[] expected, byte[] actual) {
        if (expected == null || actual == null) {
            fail("Arrays cannot be null");
        }
        if (expected.length != actual.length) {
            fail("Array lengths differ: " + expected.length + " != " + actual.length);
        }
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                fail("Arrays differ at index " + i + ": expected " + expected[i] + " but was " + actual[i]);
            }
        }
    }
}