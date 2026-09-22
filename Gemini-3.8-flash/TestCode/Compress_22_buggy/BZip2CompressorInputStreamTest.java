package org.apache.commons.compress.compressors.bzip2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

public class BZip2CompressorInputStreamTest {

    private static final byte[] EMPTY_BZIP2_STREAM = new byte[] {
        'B', 'Z', 'h', '9',
        0x17, 0x72, 0x45, 0x38, 0x50, (byte) 0x90,
        0x00, 0x00, 0x00, 0x00
    };

    @Test
    public void matches_givenValidSignature_shouldReturnTrue() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '9' };
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 4));
        Assert.assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void matches_givenShortLength_shouldReturnFalse() {
        byte[] sig = new byte[] { 'B', 'Z', 'h' };
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 2));
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, 0));
        Assert.assertFalse(BZip2CompressorInputStream.matches(sig, -1));
    }

    @Test
    public void matches_givenInvalidMagicBytes_shouldReturnFalse() {
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'A', 'Z', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'A', 'h' }, 3));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z', 'a' }, 3));
    }

    @Test(expected = IOException.class)
    public void constructor_givenNullInputStream_shouldThrowIOException() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void constructor_givenEmptyStream_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenInvalidHeaderMagic_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 'B', 'X', 'h', '9' });
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenInvalidBlockSizeBelowOne_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '0' });
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenInvalidBlockSizeAboveNine_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', ':' });
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenTruncatedBlockHeader_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[] { 'B', 'Z', 'h', '9', 0x17, 0x72 });
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenBadBlockHeaderMagic_shouldThrowIOException() throws IOException {
        byte[] badHeader = new byte[] {
            'B', 'Z', 'h', '9',
            0x00, 0x01, 0x02, 0x03, 0x04, 0x05
        };
        InputStream in = new ByteArrayInputStream(badHeader);
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void constructor_givenEmptyStreamWithInvalidCRC_shouldThrowIOException() throws IOException {
        byte[] badCrcStream = new byte[] {
            'B', 'Z', 'h', '9',
            0x17, 0x72, 0x45, 0x38, 0x50, (byte) 0x90,
            0x00, 0x00, 0x00, 0x01
        };
        InputStream in = new ByteArrayInputStream(badCrcStream);
        new BZip2CompressorInputStream(in);
    }

    @Test
    public void read_givenEmptyBZip2Stream_shouldReturnMinusOne() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);

        int readResult = bzipIn.read();
        Assert.assertEquals(-1, readResult);

        bzipIn.close();
    }

    @Test
    public void readArray_givenEmptyBZip2Stream_shouldReturnMinusOne() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] buffer = new byte[16];

        int readResult = bzipIn.read(buffer, 0, buffer.length);
        Assert.assertEquals(-1, readResult);

        bzipIn.close();
    }

    @Test
    public void readArray_givenZeroLengthBuffer_shouldReturnZero() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        byte[] buffer = new byte[16];

        int readResult = bzipIn.read(buffer, 0, 0);
        Assert.assertEquals(-1, readResult);

        bzipIn.close();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readArray_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        try {
            bzipIn.read(new byte[10], -1, 5);
        } finally {
            bzipIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readArray_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        try {
            bzipIn.read(new byte[10], 0, -1);
        } finally {
            bzipIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readArray_givenOffsetPlusLengthGreaterThanBuffer_shouldThrowIndexOutOfBoundsException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        try {
            bzipIn.read(new byte[10], 5, 6);
        } finally {
            bzipIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void read_whenStreamClosed_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        bzipIn.close();
        bzipIn.read();
    }

    @Test(expected = IOException.class)
    public void readArray_whenStreamClosed_shouldThrowIOException() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        bzipIn.close();
        bzipIn.read(new byte[10], 0, 10);
    }

    @Test
    public void close_whenCalledMultipleTimes_shouldBeIdempotent() throws IOException {
        InputStream in = new ByteArrayInputStream(EMPTY_BZIP2_STREAM);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in);
        bzipIn.close();
        bzipIn.close();
    }

    @Test
    public void constructor_givenConcatenatedEmptyStreams_shouldSucceed() throws IOException {
        byte[] concatenated = new byte[EMPTY_BZIP2_STREAM.length * 2];
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, concatenated, 0, EMPTY_BZIP2_STREAM.length);
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, concatenated, EMPTY_BZIP2_STREAM.length, EMPTY_BZIP2_STREAM.length);

        InputStream in = new ByteArrayInputStream(concatenated);
        BZip2CompressorInputStream bzipIn = new BZip2CompressorInputStream(in, true);

        Assert.assertEquals(-1, bzipIn.read());
        bzipIn.close();
    }

    @Test(expected = IOException.class)
    public void constructor_givenConcatenatedGarbageAfterStream_shouldThrowIOException() throws IOException {
        byte[] corruptedConcatenated = new byte[EMPTY_BZIP2_STREAM.length + 4];
        System.arraycopy(EMPTY_BZIP2_STREAM, 0, corruptedConcatenated, 0, EMPTY_BZIP2_STREAM.length);
        corruptedConcatenated[EMPTY_BZIP2_STREAM.length] = 'X';
        corruptedConcatenated[EMPTY_BZIP2_STREAM.length + 1] = 'Y';
        corruptedConcatenated[EMPTY_BZIP2_STREAM.length + 2] = 'Z';
        corruptedConcatenated[EMPTY_BZIP2_STREAM.length + 3] = '1';

        InputStream in = new ByteArrayInputStream(corruptedConcatenated);
        new BZip2CompressorInputStream(in, true);
    }
}