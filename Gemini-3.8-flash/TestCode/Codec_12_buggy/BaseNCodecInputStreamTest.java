package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BaseNCodecInputStreamTest {

    private static class TestableBaseNCodecInputStream extends BaseNCodecInputStream {
        public TestableBaseNCodecInputStream(InputStream in, BaseNCodec baseNCodec, boolean doEncode) {
            super(in, baseNCodec, doEncode);
        }
    }

    private static class StubBaseNCodec extends BaseNCodec {
        private boolean hasDataResult = false;
        private int[] readResultsSequence = null;
        private int readResultsCallCount = 0;
        private byte byteToReturn = 0;
        private int lastBufferAllocatedSize = 0;
        private int lastInputAvail = 0;
        private boolean encodeCalled = false;
        private boolean decodeCalled = false;

        public StubBaseNCodec() {
            super(3, 4, 0, 0);
        }

        public boolean isInAlphabet(byte octet) {
            return false;
        }

        public boolean hasData() {
            return this.hasDataResult;
        }

        public void encode(byte[] in, int inPos, int inAvail) {
            this.encodeCalled = true;
            this.lastBufferAllocatedSize = (in != null) ? in.length : 0;
            this.lastInputAvail = inAvail;
        }

        public void decode(byte[] in, int inPos, int inAvail) {
            this.decodeCalled = true;
            this.lastBufferAllocatedSize = (in != null) ? in.length : 0;
            this.lastInputAvail = inAvail;
        }

        public int readResults(byte[] b, int offset, int len) {
            if (this.readResultsSequence != null && this.readResultsCallCount < this.readResultsSequence.length) {
                int res = this.readResultsSequence[this.readResultsCallCount++];
                if (res > 0 && b != null && offset >= 0 && offset < b.length) {
                    b[offset] = this.byteToReturn;
                }
                return res;
            }
            return EOF;
        }
    }

    @Test
    public void markSupported_whenCalled_shouldReturnFalse() {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        boolean result = stream.markSupported();

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void readByteArray_givenNullBuffer_shouldThrowNullPointerException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        stream.read(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readByteArray_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        stream.read(buffer, -1, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readByteArray_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        stream.read(buffer, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readByteArray_givenOffsetGreaterThanBufferLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        stream.read(buffer, 11, 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readByteArray_givenOffsetPlusLengthGreaterThanBufferLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        stream.read(buffer, 6, 5);
    }

    @Test
    public void readByteArray_givenZeroLength_shouldReturnZeroWithoutReading() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[10]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 0);

        // Assert
        Assert.assertEquals(0, result);
        Assert.assertEquals(0, codec.readResultsCallCount);
    }

    @Test
    public void readByteArray_givenOffsetEqualsBufferLengthAndZeroLength_shouldReturnZero() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[10]);
        StubBaseNCodec codec = new StubBaseNCodec();
        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 10, 0);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void readByteArray_givenDoEncodeTrueAndNoData_shouldAllocate4096AndCallEncode() throws IOException {
        // Arrange
        byte[] inputData = new byte[]{1, 2, 3};
        InputStream in = new ByteArrayInputStream(inputData);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = false;
        codec.readResultsSequence = new int[]{3};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, true);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 10);

        // Assert
        Assert.assertEquals(3, result);
        Assert.assertTrue(codec.encodeCalled);
        Assert.assertFalse(codec.decodeCalled);
        Assert.assertEquals(4096, codec.lastBufferAllocatedSize);
        Assert.assertEquals(3, codec.lastInputAvail);
    }

    @Test
    public void readByteArray_givenDoEncodeFalseAndNoData_shouldAllocate8192AndCallDecode() throws IOException {
        // Arrange
        byte[] inputData = new byte[]{4, 5, 6, 7};
        InputStream in = new ByteArrayInputStream(inputData);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = false;
        codec.readResultsSequence = new int[]{4};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 10);

        // Assert
        Assert.assertEquals(4, result);
        Assert.assertFalse(codec.encodeCalled);
        Assert.assertTrue(codec.decodeCalled);
        Assert.assertEquals(8192, codec.lastBufferAllocatedSize);
        Assert.assertEquals(4, codec.lastInputAvail);
    }

    @Test
    public void readByteArray_givenHasDataTrue_shouldNotReadFromInputStream() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.readResultsSequence = new int[]{2};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, true);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 10);

        // Assert
        Assert.assertEquals(2, result);
        Assert.assertFalse(codec.encodeCalled);
        Assert.assertFalse(codec.decodeCalled);
    }

    @Test
    public void readByteArray_givenReadResultsReturnsZeroInitially_shouldLoopUntilNonZero() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[]{1});
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.readResultsSequence = new int[]{0, 0, 5};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, true);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 10);

        // Assert
        Assert.assertEquals(5, result);
        Assert.assertEquals(3, codec.readResultsCallCount);
    }

    @Test
    public void readByteArray_givenEOFReached_shouldReturnNegativeOne() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.readResultsSequence = new int[]{BaseNCodec.EOF};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);
        byte[] buffer = new byte[10];

        // Act
        int result = stream.read(buffer, 0, 10);

        // Assert
        Assert.assertEquals(-1, result);
    }

    @Test
    public void readSingleByte_givenPositiveByte_shouldReturnExactByteValue() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.byteToReturn = 42;
        codec.readResultsSequence = new int[]{1};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(42, result);
    }

    @Test
    public void readSingleByte_givenNegativeByte_shouldReturnUnsignedInteger() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.byteToReturn = (byte) -1; // 0xFF
        codec.readResultsSequence = new int[]{1};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(255, result);
    }

    @Test
    public void readSingleByte_givenNegativeByteMin_shouldReturn128() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.byteToReturn = (byte) -128; // 0x80
        codec.readResultsSequence = new int[]{1};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(128, result);
    }

    @Test
    public void readSingleByte_givenEOF_shouldReturnNegativeOne() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.readResultsSequence = new int[]{BaseNCodec.EOF};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(-1, result);
    }

    @Test
    public void readSingleByte_givenIntermediateZeroReads_shouldLoopUntilDataRead() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.byteToReturn = 100;
        codec.readResultsSequence = new int[]{0, 0, 1};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(100, result);
        Assert.assertEquals(3, codec.readResultsCallCount);
    }

    @Test
    public void readSingleByte_givenIntermediateZeroReadsThenEOF_shouldReturnNegativeOne() throws IOException {
        // Arrange
        InputStream in = new ByteArrayInputStream(new byte[0]);
        StubBaseNCodec codec = new StubBaseNCodec();
        codec.hasDataResult = true;
        codec.readResultsSequence = new int[]{0, BaseNCodec.EOF};

        BaseNCodecInputStream stream = new TestableBaseNCodecInputStream(in, codec, false);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(-1, result);
        Assert.assertEquals(2, codec.readResultsCallCount);
    }
}