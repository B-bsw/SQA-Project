package org.apache.commons.compress.compressors.bzip2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

public class BZip2CompressorInputStreamTest {

    private static final byte[] EMPTY_BZIP2_STREAM = new byte[] {
        (byte) 'B', (byte) 'Z', (byte) 'h', (byte) '1',
        (byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90,
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00
    };

    private static class CloseTrackingInputStream extends ByteArrayInputStream {
        private boolean closed = false;

        public CloseTrackingInputStream(byte[] buf) {
            super(buf);
        }

        @Override
        public void close() throws IOException {
            this.closed = true;
            super.close();
        }

        public boolean isClosed() {
            return this.closed;
        }
    }

    @Test
    public void matches_givenLengthLessThan3_shouldReturnFalse() {
        byte[] sig = new byte[] { 'B', 'Z' };
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 0));
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 1));
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 2));
    }

    @Test
    public void matches_givenValidSignature_shouldReturnTrue() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '1' };
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 3));
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenInvalidFirstByte_shouldReturnFalse() {
        byte[] sig = new byte[] { 'A', 'Z', 'h' };
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void matches_givenInvalidSecondByte_shouldReturnFalse() {
        byte[] sig = new byte[] { 'B', 'A', 'h' };
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void matches_givenInvalidThirdByte_shouldReturnFalse() {
        byte[] sig = new byte[] { 'B', 'Z', 'a' };
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void constructor_givenNullInputStream_shouldThrowIOException() {
        try {
            new BZip2CompressorInputStream(null);
            Assert.fail("Expected IOException for null InputStream");
        } catch (IOException e) {
            Assert.assertEquals("No InputStream", e.getMessage());
        }
    }

    @Test
    public void constructor_givenEmptyStream_shouldThrowIOException() {
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected IOException for empty stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream is not in the BZip2 format", e.getMessage());
        }
    }

    @Test
    public void constructor_givenInvalidMagicBytes_shouldThrowIOException() {
        byte[][] invalidMagics = new byte[][] {
            new byte[] { 'X', 'Z', 'h', '1' },
            new byte[] { 'B', 'X', 'h', '1' },
            new byte[] { 'B', 'Z', 'X', '1' }
        };

        for (int i = 0; i < invalidMagics.length; i++) {
            try {
                new BZip2CompressorInputStream(new ByteArrayInputStream(invalidMagics[i]));
                Assert.fail("Expected IOException for invalid magic at index " + i);
            } catch (IOException e) {
                Assert.assertEquals("Stream is not in the BZip2 format", e.getMessage());
            }
        }
    }

    @Test
    public void constructor_givenInvalidBlockSize_shouldThrowIOException() {
        byte[][] invalidBlockSizes = new byte[][] {
            new byte[] { 'B', 'Z', 'h', '0' },
            new byte[] { 'B', 'Z', 'h', ':' },
            new byte[] { 'B', 'Z', 'h', ' ' }
        };

        for (int i = 0; i < invalidBlockSizes.length; i++) {
            try {
                new BZip2CompressorInputStream(new ByteArrayInputStream(invalidBlockSizes[i]));
                Assert.fail("Expected IOException for invalid block size at index " + i);
            } catch (IOException e) {
                Assert.assertEquals("BZip2 block size is invalid", e.getMessage());
            }
        }
    }

    @Test
    public void constructor_givenUnexpectedEndOfStreamInBlockHeader_shouldThrowIOException() {
        byte[] truncatedHeader = new byte[] { 'B', 'Z', 'h', '1', 0x17, 0x72 };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(truncatedHeader));
            Assert.fail("Expected IOException due to unexpected end of stream");
        } catch (IOException e) {
            Assert.assertEquals("unexpected end of stream", e.getMessage());
        }
    }

    @Test
    public void constructor_givenBadBlockHeaderMagic_shouldThrowIOException() {
        byte[] badBlockHeader = new byte[] {
            (byte) 'B', (byte) 'Z', (byte) 'h', (byte) '1',
            (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05, (byte) 0x06
        };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(badBlockHeader));
            Assert.fail("Expected IOException due to bad block header");
        } catch (IOException e) {
            Assert.assertEquals("bad block header", e.getMessage());
        }
    }

    @Test
    public void constructor_givenCrcMismatchInEmptyStream_shouldThrowIOException() {
        byte[] invalidCrcStream = new byte[] {
            (byte) 'B', (byte) 'Z', (byte) 'h', (byte) '1',
            (byte) 0x17, (byte) 0x72, (byte) 0x45, (byte) 0x38, (byte) 0x50, (byte) 0x90,
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01
        };
        try {
            new BZip2CompressorInputStream(new ByteArrayInputStream(invalidCrcStream));
            Assert.fail("Expected IOException due to CRC error");
        } catch (IOException e) {
            Assert.assertEquals("BZip2 CRC error", e.getMessage());
        }
    }

    @Test
    public void read_givenEmptyBZip2Stream_shouldReturnNegativeOne() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);

        int result = bzipIn.read();

        Assert.assertEquals(-1, result);
        bzipIn.close();
    }

    @Test
    public void read_givenClosedStream_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        bzipIn.close();

        try {
            bzipIn.read();
            Assert.fail("Expected IOException on read() from closed stream");
        } catch (IOException e) {
            Assert.assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void readArray_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] dest = new byte[10];

        try {
            bzipIn.read(dest, -1, 5);
            Assert.fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertEquals("offs(-1) < 0.", e.getMessage());
        } finally {
            bzipIn.close();
        }
    }

    @Test
    public void readArray_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] dest = new byte[10];

        try {
            bzipIn.read(dest, 0, -1);
            Assert.fail("Expected IndexOutOfBoundsException for negative length");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertEquals("len(-1) < 0.", e.getMessage());
        } finally {
            bzipIn.close();
        }
    }

    @Test
    public void readArray_givenOffsetPlusLengthGreaterThanDestLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] dest = new byte[10];

        try {
            bzipIn.read(dest, 6, 5);
            Assert.fail("Expected IndexOutOfBoundsException for bounds overrun");
        } catch (IndexOutOfBoundsException e) {
            Assert.assertEquals("offs(6) + len(5) > dest.length(10).", e.getMessage());
        } finally {
            bzipIn.close();
        }
    }

    @Test
    public void readArray_givenClosedStream_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        bzipIn.close();
        byte[] dest = new byte[10];

        try {
            bzipIn.read(dest, 0, 5);
            Assert.fail("Expected IOException on read(byte[], int, int) from closed stream");
        } catch (IOException e) {
            Assert.assertEquals("stream closed", e.getMessage());
        }
    }

    @Test
    public void readArray_givenEmptyBZip2Stream_shouldReturnNegativeOne() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] dest = new byte[10];

        int bytesRead = bzipIn.read(dest, 0, 5);

        Assert.assertEquals(-1, bytesRead);
        bzipIn.close();
    }

    @Test
    public void readArray_givenZeroLength_shouldReturnNegativeOneWhenAtEOF() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] dest = new byte[10];

        int bytesRead = bzipIn.read(dest, 0, 0);

        Assert.assertEquals(-1, bytesRead);
        bzipIn.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingInputStream() throws IOException {
        CloseTrackingInputStream trackingIn = new CloseTrackingInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(trackingIn);

        Assert.assertFalse(trackingIn.isClosed());
        bzipIn.close();
        Assert.assertTrue(trackingIn.isClosed());
    }

    @Test
    public void close_givenMultipleInvocations_shouldBeIdempotent() throws IOException {
        CloseTrackingInputStream trackingIn = new CloseTrackingInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(trackingIn);

        bzipIn.close();
        bzipIn.close();

        Assert.assertTrue(trackingIn.isClosed());
    }

    @Test
    public void decompressConcatenated_givenSingleEmptyStream_shouldTerminateCleanly() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in, true);

        Assert.assertEquals(-1, bzipIn.read());
        bzipIn.close();
    }

    @Test
    public void decompressConcatenated_givenMultipleConcatenatedStreams_shouldHandleSuccessfully() throws IOException {
        byte[] concatenated = new byte[EMPTY_BZIP2_STREAM.length * 2];
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, concatenated, 0, EMPTY_BZIP2_STREAM.length);
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, concatenated, EMPTY_BZIP2_STREAM.length, EMPTY_BZIP2_STREAM.length);

        InputStream in = new ByteArrayInputStream(concatenated);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in, true);

        Assert.assertEquals(-1, bzipIn.read());
        bzipIn.close();
    }

    @Test
    public void decompressConcatenated_givenGarbageAfterFirstStream_shouldThrowIOException() throws IOException {
        byte[] garbageStream = new byte[EMPTY_BZIP2_STREAM.length + 4];
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, garbageStream, 0, EMPTY_BZIP2_STREAM.length);
        garbageStream[EMPTY_BZIP2_STREAM.length] = (byte) 'G';
        garbageStream[EMPTY_BZIP2_STREAM.length + 1] = (byte) 'A';
        garbageStream[EMPTY_BZIP2_STREAM.length + 2] = (byte) 'R';
        garbageStream[EMPTY_BZIP2_STREAM.length + 3] = (byte) 'B';

        InputStream in = new ByteArrayInputStream(garbageStream);
        try {
            new BZip2CompressorInputStream(in, true);
            Assert.fail("Expected IOException for garbage after valid BZip2 stream");
        } catch (IOException e) {
            Assert.assertEquals("Garbage after a valid BZip2 stream", e.getMessage());
        }
    }

    @Test
    public void decompressNotConcatenated_givenTrailingGarbage_shouldIgnoreTrailingData() throws IOException {
        byte[] streamWithTrailing = new byte[EMPTY_BZIP2_STREAM.length + 4];
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, streamWithTrailing, 0, EMPTY_BZIP2_STREAM.length);
        streamWithTrailing[EMPTY_BZIP2_STREAM.length] = (byte) 'X';

        InputStream in = new ByteArrayInputStream(streamWithTrailing);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in, false);

        Assert.assertEquals(-1, bzipIn.read());
        bzipIn.close();
    }
}