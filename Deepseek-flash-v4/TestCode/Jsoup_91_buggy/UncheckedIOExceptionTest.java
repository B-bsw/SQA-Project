package org.jsoup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class UncheckedIOExceptionTest {

    @Test
    public void testWrapsIOException() {
        IOException original = new IOException("disk full");
        UncheckedIOException ex = new UncheckedIOException(original);

        assertSame(original, ex.ioException());
        assertSame(original, ex.getCause());
        assertEquals("java.io.IOException: disk full", ex.getMessage());
        assertTrue(ex instanceof RuntimeException);
    }

    @Test
    public void testNullCauseIsAllowed() {
        UncheckedIOException ex = new UncheckedIOException(null);

        assertNull(ex.ioException());
        assertNull(ex.getCause());
        assertNull(ex.getMessage());
    }

    @Test
    public void testEmptyIOExceptionMessage() {
        IOException original = new IOException("");
        UncheckedIOException ex = new UncheckedIOException(original);

        assertSame(original, ex.ioException());
        assertEquals("java.io.IOException: ", ex.getMessage());
    }
}