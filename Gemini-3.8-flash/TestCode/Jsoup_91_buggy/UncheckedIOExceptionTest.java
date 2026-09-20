package org.jsoup;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UncheckedIOExceptionTest {

    @Test
    public void constructor_givenStandardIOException_shouldStoreCauseAndBeRetrievable() {
        // Arrange
        String errorMessage = "Disk read error";
        IOException cause = new IOException(errorMessage);

        // Act
        UncheckedIOException exception = new UncheckedIOException(cause);

        // Assert
        Assert.assertNotNull(exception);
        Assert.assertSame(cause, exception.getCause());
        Assert.assertSame(cause, exception.ioException());
        Assert.assertEquals(cause.toString(), exception.getMessage());
    }

    @Test
    public void constructor_givenSubclassedIOException_shouldPreserveSpecificType() {
        // Arrange
        FileNotFoundException cause = new FileNotFoundException("File not found on disk");

        // Act
        UncheckedIOException exception = new UncheckedIOException(cause);

        // Assert
        Assert.assertSame(cause, exception.ioException());
        Assert.assertTrue(exception.ioException() instanceof FileNotFoundException);
    }

    @Test
    public void constructor_givenNullCause_shouldAllowNullAndReturnNullIOException() {
        // Arrange
        IOException cause = null;

        // Act
        UncheckedIOException exception = new UncheckedIOException(cause);

        // Assert
        Assert.assertNull(exception.getCause());
        Assert.assertNull(exception.ioException());
    }

    @Test
    public void ioException_givenIOExceptionWithCauseChain_shouldPreserveEntireChain() {
        // Arrange
        Throwable rootCause = new IllegalStateException("Root failure");
        IOException ioException = new IOException("IO failure");
        ioException.initCause(rootCause);

        // Act
        UncheckedIOException unchecked = new UncheckedIOException(ioException);

        // Assert
        Assert.assertSame(ioException, unchecked.ioException());
        Assert.assertSame(rootCause, unchecked.ioException().getCause());
    }

    @Test
    public void uncheckedIOException_shouldBeSubclassOfRuntimeException() {
        // Arrange
        IOException cause = new IOException("Sample error");

        // Act
        UncheckedIOException exception = new UncheckedIOException(cause);

        // Assert
        Assert.assertTrue("UncheckedIOException must be an instance of RuntimeException", exception instanceof RuntimeException);
    }

    @Test
    public void uncheckedIOException_whenThrown_shouldBeCatchableAsRuntimeException() {
        // Arrange
        IOException cause = new IOException("Network timeout");
        boolean caught = false;

        // Act
        try {
            throw new UncheckedIOException(cause);
        } catch (RuntimeException e) {
            caught = true;
            Assert.assertTrue(e instanceof UncheckedIOException);
            UncheckedIOException casted = (UncheckedIOException) e;
            Assert.assertSame(cause, casted.ioException());
        }

        // Assert
        Assert.assertTrue("Exception should have been caught as RuntimeException", caught);
    }
}