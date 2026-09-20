package org.apache.commons.compress.compressors.deflate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class DeflateCompressorInputStreamTest {

    private byte[] compressWithZlib(byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos);
        dos.write(data);
        dos.finish();
        dos.close();
        return baos.toByteArray();
    }

    private byte[] compressRawDeflate(byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, deflater);
        dos.write(data);
        dos.finish();
        dos.close();
        deflater.end();
        return baos.toByteArray();
    }

    @Test
    public void read_givenSingleByteRead_shouldReturnCorrectByteAndCount() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { (byte) 0x12, (byte) 0xAB, (byte) 0xCD };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act & Assert
            int b1 = in.read();
            Assert.assertEquals(0x12, b1);
            Assert.assertEquals(1L, in.getBytesRead());

            int b2 = in.read();
            Assert.assertEquals(0xAB, b2);
            Assert.assertEquals(2L, in.getBytesRead());

            int b3 = in.read();
            Assert.assertEquals(0xCD, b3);
            Assert.assertEquals(3L, in.getBytesRead());

            int eof = in.read();
            Assert.assertEquals(-1, eof);
            Assert.assertEquals(3L, in.getBytesRead());
        } finally {
            in.close();
        }
    }

    @Test
    public void read_givenByteArrayRead_shouldFillBufferAndCount() throws IOException {
        // Arrange
        byte[] originalData = "Hello Legacy JUnit Test Suite!".getBytes("UTF-8");
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            byte[] buffer = new byte[originalData.length];
            int totalRead = 0;
            int readBytes;

            // Act
            while ((readBytes = in.read(buffer, totalRead, buffer.length - totalRead)) != -1) {
                totalRead += readBytes;
                if (totalRead == buffer.length) {
                    break;
                }
            }

            // Assert
            Assert.assertEquals(originalData.length, totalRead);
            Assert.assertEquals(originalData.length, in.getBytesRead());
            Assert.assertTrue(Arrays.equals(originalData, buffer));

            int eof = in.read(buffer, 0, buffer.length);
            Assert.assertEquals(-1, eof);
            Assert.assertEquals(originalData.length, in.getBytesRead());
        } finally {
            in.close();
        }
    }

    @Test
    public void read_givenBufferWithOffsetAndLength_shouldReadIntoSubArray() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 1, 2, 3, 4, 5 };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            byte[] target = new byte[10];

            // Act
            int bytesRead = in.read(target, 2, 3);

            // Assert
            Assert.assertEquals(3, bytesRead);
            Assert.assertEquals(3L, in.getBytesRead());
            Assert.assertEquals(0, target[0]);
            Assert.assertEquals(0, target[1]);
            Assert.assertEquals(1, target[2]);
            Assert.assertEquals(2, target[3]);
            Assert.assertEquals(3, target[4]);
            Assert.assertEquals(0, target[5]);
        } finally {
            in.close();
        }
    }

    @Test
    public void read_givenZeroLengthBuffer_shouldReturnZeroAndNotIncrementCount() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 10, 20, 30 };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            int bytesRead = in.read(new byte[10], 0, 0);

            // Assert
            Assert.assertEquals(0, bytesRead);
            Assert.assertEquals(0L, in.getBytesRead());
        } finally {
            in.close();
        }
    }

    @Test
    public void constructor_givenDefaultParameters_shouldDecompressWithZlibHeader() throws IOException {
        // Arrange
        byte[] originalData = "Zlib Header Test".getBytes("UTF-8");
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);

        // Act
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);
        byte[] buffer = new byte[originalData.length];
        int readCount = in.read(buffer, 0, buffer.length);
        in.close();

        // Assert
        Assert.assertEquals(originalData.length, readCount);
        Assert.assertTrue(Arrays.equals(originalData, buffer));
    }

    @Test
    public void constructor_givenRawDeflateParameters_shouldDecompressWithoutZlibHeader() throws IOException {
        // Arrange
        byte[] originalData = "Raw Deflate Test Without Header".getBytes("UTF-8");
        byte[] compressedData = compressRawDeflate(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(false);

        // Act
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais, params);
        byte[] buffer = new byte[originalData.length];
        int readCount = in.read(buffer, 0, buffer.length);
        in.close();

        // Assert
        Assert.assertEquals(originalData.length, readCount);
        Assert.assertTrue(Arrays.equals(originalData, buffer));
    }

    @Test
    public void constructor_givenExplicitWithZlibHeaderTrue_shouldDecompressWithZlibHeader() throws IOException {
        // Arrange
        byte[] originalData = "Explicit Zlib Header Enabled".getBytes("UTF-8");
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(true);

        // Act
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais, params);
        byte[] buffer = new byte[originalData.length];
        int readCount = in.read(buffer, 0, buffer.length);
        in.close();

        // Assert
        Assert.assertEquals(originalData.length, readCount);
        Assert.assertTrue(Arrays.equals(originalData, buffer));
    }

    @Test
    public void skip_givenPositiveBytesToSkip_shouldSkipDataCorrectly() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            long skipped = in.skip(3);
            int nextByte = in.read();

            // Assert
            Assert.assertEquals(3L, skipped);
            Assert.assertEquals('D', nextByte);
        } finally {
            in.close();
        }
    }

    @Test
    public void skip_givenZeroOrNegativeBytes_shouldReturnZero() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 1, 2, 3 };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            long skippedZero = in.skip(0);
            long skippedNegative = in.skip(-5);

            // Assert
            Assert.assertEquals(0L, skippedZero);
            Assert.assertEquals(0L, skippedNegative);
        } finally {
            in.close();
        }
    }

    @Test
    public void available_givenOpenStream_shouldReturnNonNegativeValue() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 1, 2, 3, 4, 5 };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            int availableBeforeRead = in.available();

            // Assert
            Assert.assertTrue(availableBeforeRead >= 0);
        } finally {
            in.close();
        }
    }

    @Test
    public void close_givenStream_shouldCloseUnderlyingStream() throws IOException {
        // Arrange
        final boolean[] underlyingClosed = new boolean[] { false };
        byte[] compressedData = compressWithZlib(new byte[] { 42 });
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData) {
            public void close() throws IOException {
                underlyingClosed[0] = true;
                super.close();
            }
        };

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        // Act
        in.close();

        // Assert
        Assert.assertTrue(underlyingClosed[0]);
    }

    @Test(expected = IOException.class)
    public void read_givenClosedStream_shouldThrowIOException() throws IOException {
        // Arrange
        byte[] originalData = new byte[] { 1, 2, 3 };
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);
        in.close();

        // Act
        in.read();
    }

    @Test(expected = IOException.class)
    public void read_givenCorruptedCompressedStream_shouldThrowIOException() throws IOException {
        // Arrange
        byte[] invalidData = new byte[] { 0x1F, (byte) 0x8B, 0x00, 0x01, 0x02 };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            in.read();
        } finally {
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void read_givenEmptyCompressedData_shouldReturnMinusOneImmediately() throws IOException {
        // Arrange
        byte[] originalData = new byte[0];
        byte[] compressedData = compressWithZlib(originalData);
        ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
        DeflateCompressorInputStream in = new DeflateCompressorInputStream(bais);

        try {
            // Act
            int b = in.read();

            // Assert
            Assert.assertEquals(-1, b);
            Assert.assertEquals(0L, in.getBytesRead());
        } finally {
            in.close();
        }
    }
}