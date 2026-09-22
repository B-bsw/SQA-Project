package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IOContextTest {

    private IOContext context;
    private BufferRecycler br;

    @Before
    public void setUp() {
        br = new BufferRecycler();
        context = new IOContext(br, "source", true);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("source", context.getSourceReference());
        assertTrue(context.isResourceManaged());
        assertNull(context.getEncoding());
        context.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, context.getEncoding());
    }

    @Test
    public void testWithEncodingReturnsSameInstance() {
        IOContext result = context.withEncoding(JsonEncoding.UTF16);
        assertSame(context, result);
        assertEquals(JsonEncoding.UTF16, context.getEncoding());
    }

    @Test
    public void testConstructTextBuffer() {
        TextBuffer tb = context.constructTextBuffer();
        assertNotNull(tb);
    }

    @Test
    public void testAllocMethods() {
        assertNotNull(context.allocReadIOBuffer());
        assertNotNull(context.allocReadIOBuffer(100));
        assertNotNull(context.allocWriteEncodingBuffer());
        assertNotNull(context.allocWriteEncodingBuffer(200));
        assertNotNull(context.allocBase64Buffer());
        assertNotNull(context.allocTokenBuffer());
        assertNotNull(context.allocTokenBuffer(300));
        assertNotNull(context.allocConcatBuffer());
        assertNotNull(context.allocNameCopyBuffer(400));
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferTwiceThrows() {
        context.allocReadIOBuffer();
        context.allocReadIOBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferTwiceThrows() {
        context.allocWriteEncodingBuffer();
        context.allocWriteEncodingBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferTwiceThrows() {
        context.allocTokenBuffer();
        context.allocTokenBuffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBufferTwiceThrows() {
        context.allocConcatBuffer();
        context.allocConcatBuffer();
    }

    @Test
    public void testReleaseMethods() {
        byte[] readBuf = context.allocReadIOBuffer();
        context.releaseReadIOBuffer(readBuf);
        assertNull(context.allocReadIOBuffer());

        byte[] writeBuf = context.allocWriteEncodingBuffer();
        context.releaseWriteEncodingBuffer(writeBuf);
        assertNotNull(context.allocWriteEncodingBuffer());

        byte[] base64Buf = context.allocBase64Buffer();
        context.releaseBase64Buffer(base64Buf);
        assertNotNull(context.allocBase64Buffer());

        char[] tokenBuf = context.allocTokenBuffer();
        context.releaseTokenBuffer(tokenBuf);
        assertNotNull(context.allocTokenBuffer());

        char[] concatBuf = context.allocConcatBuffer();
        context.releaseConcatBuffer(concatBuf);
        assertNotNull(context.allocConcatBuffer());

        char[] nameBuf = context.allocNameCopyBuffer(100);
        context.releaseNameCopyBuffer(nameBuf);
        assertNotNull(context.allocNameCopyBuffer(200));
    }

    @Test
    public void testReleaseNullBufferDoesNothing() {
        context.releaseReadIOBuffer(null);
        context.releaseWriteEncodingBuffer(null);
        context.releaseBase64Buffer(null);
        context.releaseTokenBuffer(null);
        context.releaseConcatBuffer(null);
        context.releaseNameCopyBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWrongReadBufferThrows() {
        byte[] buf = context.allocReadIOBuffer();
        context.allocWriteEncodingBuffer();
        context.releaseReadIOBuffer(buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWrongTokenBufferThrows() {
        char[] buf = context.allocTokenBuffer();
        context.allocConcatBuffer();
        context.releaseTokenBuffer(buf);
    }

    @Test
    public void testNonManagedResource() {
        IOContext nonManaged = new IOContext(br, null, false);
        assertFalse(nonManaged.isResourceManaged());
        assertNull(nonManaged.getSourceReference());
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64BufferTwiceThrows() {
        context.allocBase64Buffer();
        context.allocBase64Buffer();
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBufferTwiceThrows() {
        context.allocNameCopyBuffer(10);
        context.allocNameCopyBuffer(20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWrongConcatBufferThrows() {
        char[] buf = context.allocConcatBuffer();
        context.allocTokenBuffer();
        context.releaseConcatBuffer(buf);
    }

    @Test
    public void testReleaseAndReallocReadBuffer() {
        byte[] buf1 = context.allocReadIOBuffer();
        context.releaseReadIOBuffer(buf1);
        byte[] buf2 = context.allocReadIOBuffer();
        assertNotNull(buf2);
    }

    @Test
    public void testReleaseAndReallocTokenBuffer() {
        char[] buf1 = context.allocTokenBuffer();
        context.releaseTokenBuffer(buf1);
        char[] buf2 = context.allocTokenBuffer();
        assertNotNull(buf2);
    }
}