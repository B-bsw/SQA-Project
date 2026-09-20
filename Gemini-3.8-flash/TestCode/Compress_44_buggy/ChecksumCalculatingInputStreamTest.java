package org.apache.commons.compress.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.junit.Assert;
import org.junit.Test;

public class ChecksumCalculatingInputStreamTest {

    @Test
    public void getValue_givenNewInstance_shouldReturnInitialChecksum() {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream emptyIn = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, emptyIn);

        // Act
        long value = stream.getValue();

        // Assert
        Assert.assertEquals(0L, value);
    }

    @Test
    public void read_givenSingleByteAvailable_shouldUpdateChecksumAndReturnValue() throws IOException {
        // Arrange
        byte[] data = new byte[] { 'A', 'B' };
        Checksum checksum = new CRC32();
        InputStream byteIn = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, byteIn);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update('A');

        // Act
        int firstByte = stream.read();

        // Assert
        Assert.assertEquals('A', firstByte);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void read_givenEofStream_shouldReturnMinusOneAndLeaveChecksumUnchanged() throws IOException {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream emptyIn = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, emptyIn);

        // Act
        int result = stream.read();

        // Assert
        Assert.assertEquals(-1, result);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void read_givenUnderlyingStreamThrowsIOException_shouldPropagateIOException() {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream failingIn = new InputStream() {
            public int read() throws IOException {
                throw new IOException("Simulated Read Failure");
            }
        };
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, failingIn);

        // Act & Assert
        try {
            stream.read();
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException ex) {
            Assert.assertEquals("Simulated Read Failure", ex.getMessage());
        }
    }

    @Test
    public void readArray_givenValidBuffer_shouldDelegateToOffsetReadAndMatchCrc() throws IOException {
        // Arrange
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data, 0, data.length);

        byte[] buffer = new byte[5];

        // Act
        int bytesRead = stream.read(buffer);

        // Assert
        Assert.assertEquals(5, bytesRead);
        Assert.assertArrayEquals(data, buffer);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void readArray_givenZeroLengthBuffer_shouldReturnZeroAndLeaveChecksumUnchanged() throws IOException {
        // Arrange
        byte[] data = new byte[] { 1, 2, 3 };
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        byte[] emptyBuffer = new byte[0];

        // Act
        int bytesRead = stream.read(emptyBuffer);

        // Assert
        Assert.assertEquals(0, bytesRead);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void readArray_givenNullBuffer_shouldThrowNullPointerException() throws IOException {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(new byte[] { 1, 2 });
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        // Act & Assert
        try {
            stream.read(null);
            Assert.fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException ex) {
            // Success
        }
    }

    @Test
    public void readBufferWithOffset_givenValidData_shouldUpdateChecksumOnlyForReadBytes() throws IOException {
        // Arrange
        byte[] data = new byte[] { 10, 20, 30 };
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        byte[] destination = new byte[10];
        int offset = 2;
        int length = 3;

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(data, 0, 3);

        // Act
        int bytesRead = stream.read(destination, offset, length);

        // Assert
        Assert.assertEquals(3, bytesRead);
        Assert.assertEquals(10, destination[2]);
        Assert.assertEquals(20, destination[3]);
        Assert.assertEquals(30, destination[4]);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
    }

    @Test
    public void readBufferWithOffset_givenEofStream_shouldReturnMinusOneAndNotUpdateChecksum() throws IOException {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        byte[] buffer = new byte[5];

        // Act
        int bytesRead = stream.read(buffer, 0, buffer.length);

        // Assert
        Assert.assertEquals(-1, bytesRead);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void readBufferWithOffset_givenUnderlyingStreamThrowsIOException_shouldPropagateIOException() {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream failingIn = new InputStream() {
            public int read() throws IOException {
                return -1;
            }

            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Simulated Buffer Read Failure");
            }
        };
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, failingIn);
        byte[] buffer = new byte[4];

        // Act & Assert
        try {
            stream.read(buffer, 0, 4);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException ex) {
            Assert.assertEquals("Simulated Buffer Read Failure", ex.getMessage());
        }
    }

    @Test
    public void skip_givenPositiveNAndStreamHasData_shouldReturnOneAndAdvanceChecksum() throws IOException {
        // Arrange
        byte[] data = new byte[] { 42, 84 };
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        CRC32 expectedChecksum = new CRC32();
        expectedChecksum.update(42);

        // Act
        long skipped = stream.skip(100L);

        // Assert
        Assert.assertEquals(1L, skipped);
        Assert.assertEquals(expectedChecksum.getValue(), stream.getValue());
        Assert.assertEquals(84, stream.read());
    }

    @Test
    public void skip_givenEofStream_shouldReturnZero() throws IOException {
        // Arrange
        Checksum checksum = new CRC32();
        InputStream emptyIn = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, emptyIn);

        // Act
        long skipped = stream.skip(5L);

        // Assert
        Assert.assertEquals(0L, skipped);
        Assert.assertEquals(0L, stream.getValue());
    }

    @Test
    public void skip_givenNegativeOrZeroNAndStreamHasData_shouldStillReturnOne() throws IOException {
        // Arrange
        byte[] data = new byte[] { 99 };
        Checksum checksum = new CRC32();
        InputStream inStream = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, inStream);

        // Act
        long skipped = stream.skip(-10L);

        // Assert
        Assert.assertEquals(1L, skipped);
        Assert.assertEquals(-1, stream.read());
    }

    @Test
    public void read_givenNullInputStream_shouldThrowNullPointerException() throws IOException {
        // Arrange
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(checksum, null);

        // Act & Assert
        try {
            stream.read();
            Assert.fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException ex) {
            // Success
        }
    }

    @Test
    public void read_givenNullChecksum_shouldThrowNullPointerException() throws IOException {
        // Arrange
        InputStream inStream = new ByteArrayInputStream(new byte[] { 1 });
        ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(null, inStream);

        // Act & Assert
        try {
            stream.read();
            Assert.fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException ex) {
            // Success
        }
    }
}