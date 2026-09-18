package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.FileNotFoundException;

public class UncheckedIOExceptionTest {

    @Test
    public void testConstructorAndGetCause() {
        IOException cause = new IOException("test exception");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        assertNotNull(uioe);
        assertEquals(cause, uioe.getCause());
    }

    @Test
    public void testIoExceptionReturnsSameInstance() {
        IOException cause = new IOException("io error");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        IOException result = uioe.ioException();

        assertNotNull(result);
        assertSame(cause, result);
    }

    @Test
    public void testIoExceptionWithMessage() {
        String message = "specific error message";
        IOException cause = new IOException(message);
        UncheckedIOException uioe = new UncheckedIOException(cause);

        IOException result = uioe.ioException();

        assertEquals(message, result.getMessage());
    }

    @Test
    public void testIoExceptionWithNullMessage() {
        IOException cause = new IOException((String) null);
        UncheckedIOException uioe = new UncheckedIOException(cause);

        IOException result = uioe.ioException();

        assertNull(result.getMessage());
    }

    @Test
    public void testWithSubclassOfIOException() {
        FileNotFoundException cause = new FileNotFoundException("file not found");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        IOException result = uioe.ioException();

        assertNotNull(result);
        assertTrue(result instanceof FileNotFoundException);
        assertEquals("file not found", result.getMessage());
    }

    @Test
    public void testIsRuntimeException() {
        IOException cause = new IOException("test");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        assertTrue(uioe instanceof RuntimeException);
    }

    @Test(expected = UncheckedIOException.class)
    public void testCanBeThrown() {
        IOException cause = new IOException("throwable test");
        throw new UncheckedIOException(cause);
    }

    @Test
    public void testCatchThrownException() {
        IOException cause = new IOException("catch test");
        try {
            throw new UncheckedIOException(cause);
        } catch (UncheckedIOException e) {
            assertSame(cause, e.getCause());
            assertSame(cause, e.ioException());
        }
    }

    @Test
    public void testGetMessageDelegatesToCause() {
        String message = "delegated message";
        IOException cause = new IOException(message);
        UncheckedIOException uioe = new UncheckedIOException(cause);

        assertEquals("java.io.IOException: " + message, uioe.getMessage());
    }

    @Test
    public void testMultipleInstancesIndependent() {
        IOException cause1 = new IOException("first");
        IOException cause2 = new IOException("second");

        UncheckedIOException uioe1 = new UncheckedIOException(cause1);
        UncheckedIOException uioe2 = new UncheckedIOException(cause2);

        assertSame(cause1, uioe1.ioException());
        assertSame(cause2, uioe2.ioException());
        assertNotSame(uioe1.ioException(), uioe2.ioException());
    }

    @Test
    public void testCauseCastToIOExceptionType() {
        IOException cause = new IOException("cast test");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        Object result = uioe.ioException();

        assertTrue(result instanceof IOException);
    }

    @Test
    public void testStackTracePreserved() {
        IOException cause = new IOException("stack trace test");
        UncheckedIOException uioe = new UncheckedIOException(cause);

        assertNotNull(uioe.getStackTrace());
        assertNotNull(uioe.ioException().getStackTrace());
    }
}