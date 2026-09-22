package com.fasterxml.jackson.core.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContextTest {

    private BufferRecycler bufferRecycler;
    private Object sourceReference;
    private IOContext ioContext;

    @Before
    public void setUp() {
        bufferRecycler = new BufferRecycler();
        sourceReference = "TestSourceRef";
        ioContext = new IOContext(bufferRecycler, sourceReference, true);
    }

    @Test
    public void constructor_givenManagedResourceTrue_shouldInitializeProperly() {
        // Arrange & Act
        IOContext context = new IOContext(bufferRecycler, sourceReference, true);

        // Assert
        Assert.assertSame(sourceReference, context.getSourceReference());
        Assert.assertTrue(context.isResourceManaged());
        Assert.assertNull(context.getEncoding());
    }

    @Test
    public void constructor_givenManagedResourceFalseAndNullSource_shouldInitializeProperly() {
        // Arrange & Act
        IOContext context = new IOContext(bufferRecycler, null, false);

        // Assert
        Assert.assertNull(context.getSourceReference());
        Assert.assertFalse(context.isResourceManaged());
        Assert.assertNull(context.getEncoding());
    }

    @Test
    public void setEncoding_givenValidEncoding_shouldUpdateEncoding() {
        // Arrange
        JsonEncoding enc = JsonEncoding.UTF8;

        // Act
        ioContext.setEncoding(enc);

        // Assert
        Assert.assertSame(enc, ioContext.getEncoding());
    }

    @Test
    public void withEncoding_givenValidEncoding_shouldUpdateAndReturnSameContext() {
        // Arrange
        JsonEncoding enc = JsonEncoding.UTF16_BE;

        // Act
        IOContext result = ioContext.withEncoding(enc);

        // Assert
        Assert.assertSame(ioContext, result);
        Assert.assertSame(enc, ioContext.getEncoding());
    }

    @Test
    public void constructTextBuffer_shouldReturnNonNullTextBuffer() {
        // Arrange & Act
        TextBuffer textBuffer = ioContext.constructTextBuffer();

        // Assert
        Assert.assertNotNull(textBuffer);
    }

    @Test
    public void allocReadIOBuffer_givenFirstCall_shouldAllocateNonNullBuffer() {
        // Arrange & Act
        byte[] buf = ioContext.allocReadIOBuffer();

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void allocReadIOBuffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocReadIOBuffer();

        // Act
        ioContext.allocReadIOBuffer();
    }

    @Test
    public void allocReadIOBuffer_withMinSize_shouldAllocateAtLeastMinSize() {
        // Arrange
        int minSize = 20000;

        // Act
        byte[] buf = ioContext.allocReadIOBuffer(minSize);

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= minSize);
    }

    @Test(expected = IllegalStateException.class)
    public void allocReadIOBuffer_withMinSize_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocReadIOBuffer(100);

        // Act
        ioContext.allocReadIOBuffer(200);
    }

    @Test
    public void releaseReadIOBuffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseReadIOBuffer(null);

        // Assert
        byte[] buf = ioContext.allocReadIOBuffer();
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseReadIOBuffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        byte[] buf = ioContext.allocReadIOBuffer();

        // Act
        ioContext.releaseReadIOBuffer(buf);

        // Assert
        byte[] reallocated = ioContext.allocReadIOBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseReadIOBuffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buf = ioContext.allocReadIOBuffer();
        byte[] fakeBuf = new byte[buf.length];

        // Act
        ioContext.releaseReadIOBuffer(fakeBuf);
    }

    @Test
    public void releaseReadIOBuffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        byte[] buf = ioContext.allocReadIOBuffer();
        byte[] largerBuf = new byte[buf.length + 100];

        // Act
        ioContext.releaseReadIOBuffer(largerBuf);

        // Assert - verified by allowing reallocation
        byte[] reallocated = ioContext.allocReadIOBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void allocWriteEncodingBuffer_givenFirstCall_shouldAllocateNonNullBuffer() {
        // Arrange & Act
        byte[] buf = ioContext.allocWriteEncodingBuffer();

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void allocWriteEncodingBuffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocWriteEncodingBuffer();

        // Act
        ioContext.allocWriteEncodingBuffer();
    }

    @Test
    public void allocWriteEncodingBuffer_withMinSize_shouldAllocateAtLeastMinSize() {
        // Arrange
        int minSize = 15000;

        // Act
        byte[] buf = ioContext.allocWriteEncodingBuffer(minSize);

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= minSize);
    }

    @Test(expected = IllegalStateException.class)
    public void allocWriteEncodingBuffer_withMinSize_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocWriteEncodingBuffer(500);

        // Act
        ioContext.allocWriteEncodingBuffer(600);
    }

    @Test
    public void releaseWriteEncodingBuffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseWriteEncodingBuffer(null);

        // Assert
        byte[] buf = ioContext.allocWriteEncodingBuffer();
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseWriteEncodingBuffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        byte[] buf = ioContext.allocWriteEncodingBuffer();

        // Act
        ioContext.releaseWriteEncodingBuffer(buf);

        // Assert
        byte[] reallocated = ioContext.allocWriteEncodingBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseWriteEncodingBuffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buf = ioContext.allocWriteEncodingBuffer();
        byte[] fakeBuf = new byte[buf.length];

        // Act
        ioContext.releaseWriteEncodingBuffer(fakeBuf);
    }

    @Test
    public void releaseWriteEncodingBuffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        byte[] buf = ioContext.allocWriteEncodingBuffer();
        byte[] largerBuf = new byte[buf.length + 10];

        // Act
        ioContext.releaseWriteEncodingBuffer(largerBuf);

        // Assert
        byte[] reallocated = ioContext.allocWriteEncodingBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void allocBase64Buffer_givenFirstCall_shouldAllocateNonNullBuffer() {
        // Arrange & Act
        byte[] buf = ioContext.allocBase64Buffer();

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void allocBase64Buffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocBase64Buffer();

        // Act
        ioContext.allocBase64Buffer();
    }

    @Test
    public void releaseBase64Buffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseBase64Buffer(null);

        // Assert
        byte[] buf = ioContext.allocBase64Buffer();
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseBase64Buffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        byte[] buf = ioContext.allocBase64Buffer();

        // Act
        ioContext.releaseBase64Buffer(buf);

        // Assert
        byte[] reallocated = ioContext.allocBase64Buffer();
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseBase64Buffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        byte[] buf = ioContext.allocBase64Buffer();
        byte[] fakeBuf = new byte[buf.length];

        // Act
        ioContext.releaseBase64Buffer(fakeBuf);
    }

    @Test
    public void releaseBase64Buffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        byte[] buf = ioContext.allocBase64Buffer();
        byte[] largerBuf = new byte[buf.length + 50];

        // Act
        ioContext.releaseBase64Buffer(largerBuf);

        // Assert
        byte[] reallocated = ioContext.allocBase64Buffer();
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void allocTokenBuffer_givenFirstCall_shouldAllocateNonNullBuffer() {
        // Arrange & Act
        char[] buf = ioContext.allocTokenBuffer();

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void allocTokenBuffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocTokenBuffer();

        // Act
        ioContext.allocTokenBuffer();
    }

    @Test
    public void allocTokenBuffer_withMinSize_shouldAllocateAtLeastMinSize() {
        // Arrange
        int minSize = 8000;

        // Act
        char[] buf = ioContext.allocTokenBuffer(minSize);

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= minSize);
    }

    @Test(expected = IllegalStateException.class)
    public void allocTokenBuffer_withMinSize_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocTokenBuffer(500);

        // Act
        ioContext.allocTokenBuffer(1000);
    }

    @Test
    public void releaseTokenBuffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseTokenBuffer(null);

        // Assert
        char[] buf = ioContext.allocTokenBuffer();
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseTokenBuffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        char[] buf = ioContext.allocTokenBuffer();

        // Act
        ioContext.releaseTokenBuffer(buf);

        // Assert
        char[] reallocated = ioContext.allocTokenBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseTokenBuffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        char[] buf = ioContext.allocTokenBuffer();
        char[] fakeBuf = new char[buf.length];

        // Act
        ioContext.releaseTokenBuffer(fakeBuf);
    }

    @Test
    public void releaseTokenBuffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        char[] buf = ioContext.allocTokenBuffer();
        char[] largerBuf = new char[buf.length + 20];

        // Act
        ioContext.releaseTokenBuffer(largerBuf);

        // Assert
        char[] reallocated = ioContext.allocTokenBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void allocConcatBuffer_givenFirstCall_shouldAllocateNonNullBuffer() {
        // Arrange & Act
        char[] buf = ioContext.allocConcatBuffer();

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void allocConcatBuffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocConcatBuffer();

        // Act
        ioContext.allocConcatBuffer();
    }

    @Test
    public void releaseConcatBuffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseConcatBuffer(null);

        // Assert
        char[] buf = ioContext.allocConcatBuffer();
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseConcatBuffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        char[] buf = ioContext.allocConcatBuffer();

        // Act
        ioContext.releaseConcatBuffer(buf);

        // Assert
        char[] reallocated = ioContext.allocConcatBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseConcatBuffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        char[] buf = ioContext.allocConcatBuffer();
        char[] fakeBuf = new char[buf.length];

        // Act
        ioContext.releaseConcatBuffer(fakeBuf);
    }

    @Test
    public void releaseConcatBuffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        char[] buf = ioContext.allocConcatBuffer();
        char[] largerBuf = new char[buf.length + 10];

        // Act
        ioContext.releaseConcatBuffer(largerBuf);

        // Assert
        char[] reallocated = ioContext.allocConcatBuffer();
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void allocNameCopyBuffer_withMinSize_shouldAllocateAtLeastMinSize() {
        // Arrange
        int minSize = 256;

        // Act
        char[] buf = ioContext.allocNameCopyBuffer(minSize);

        // Assert
        Assert.assertNotNull(buf);
        Assert.assertTrue(buf.length >= minSize);
    }

    @Test(expected = IllegalStateException.class)
    public void allocNameCopyBuffer_givenSecondCallWithoutRelease_shouldThrowIllegalStateException() {
        // Arrange
        ioContext.allocNameCopyBuffer(100);

        // Act
        ioContext.allocNameCopyBuffer(200);
    }

    @Test
    public void releaseNameCopyBuffer_givenNull_shouldDoNothing() {
        // Arrange & Act
        ioContext.releaseNameCopyBuffer(null);

        // Assert
        char[] buf = ioContext.allocNameCopyBuffer(128);
        Assert.assertNotNull(buf);
    }

    @Test
    public void releaseNameCopyBuffer_givenAllocatedBuffer_shouldReleaseAndAllowReallocation() {
        // Arrange
        char[] buf = ioContext.allocNameCopyBuffer(64);

        // Act
        ioContext.releaseNameCopyBuffer(buf);

        // Assert
        char[] reallocated = ioContext.allocNameCopyBuffer(64);
        Assert.assertNotNull(reallocated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void releaseNameCopyBuffer_givenDifferentSmallerOrEqualBuffer_shouldThrowIllegalArgumentException() {
        // Arrange
        char[] buf = ioContext.allocNameCopyBuffer(64);
        char[] fakeBuf = new char[buf.length];

        // Act
        ioContext.releaseNameCopyBuffer(fakeBuf);
    }

    @Test
    public void releaseNameCopyBuffer_givenLargerBuffer_shouldAllowUpgrade() {
        // Arrange
        char[] buf = ioContext.allocNameCopyBuffer(64);
        char[] largerBuf = new char[buf.length + 30];

        // Act
        ioContext.releaseNameCopyBuffer(largerBuf);

        // Assert
        char[] reallocated = ioContext.allocNameCopyBuffer(64);
        Assert.assertNotNull(reallocated);
    }

    @Test
    public void verifyRelease_givenSameInstance_shouldPassSilently() {
        // Arrange
        byte[] byteBuf = new byte[10];
        char[] charBuf = new char[10];

        // Act & Assert (verify protected method behavior)
        ioContext._verifyRelease(byteBuf, byteBuf);
        ioContext._verifyRelease(charBuf, charBuf);
    }

    @Test
    public void verifyAlloc_givenNullBuffer_shouldPassSilently() {
        // Arrange, Act & Assert
        ioContext._verifyAlloc(null);
    }

    @Test(expected = IllegalStateException.class)
    public void verifyAlloc_givenNonNullBuffer_shouldThrowIllegalStateException() {
        // Arrange, Act & Assert
        ioContext._verifyAlloc(new Object());
    }
}