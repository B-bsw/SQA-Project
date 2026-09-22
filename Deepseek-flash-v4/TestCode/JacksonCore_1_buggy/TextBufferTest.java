package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class TextBufferTest {

    private static final BufferRecycler RECYCLER = new BufferRecycler();
    private TextBuffer textBuffer;

    @Before
    public void setUp() {
        textBuffer = new TextBuffer(RECYCLER);
    }

    @Test
    public void testInitialState() {
        assertEquals(0, textBuffer.size());
        assertEquals(0, textBuffer.getTextOffset());
        assertFalse(textBuffer.hasTextAsCharacters());
        assertNotNull(textBuffer.getTextBuffer());
        assertEquals("", textBuffer.contentsAsString());
        assertEquals(0, textBuffer.contentsAsArray().length);
    }

    @Test
    public void testResetWithEmpty() {
        textBuffer.append("hello");
        textBuffer.resetWithEmpty();
        assertEquals(0, textBuffer.size());
        assertEquals("", textBuffer.contentsAsString());
        assertEquals(0, textBuffer.contentsAsArray().length);
        assertEquals(0, textBuffer.getTextOffset());
        assertFalse(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testResetWithShared() {
        char[] shared = "shared data".toCharArray();
        textBuffer.resetWithShared(shared, 0, shared.length);
        assertEquals(shared.length, textBuffer.size());
        assertEquals(0, textBuffer.getTextOffset());
        assertTrue(textBuffer.hasTextAsCharacters());
        assertSame(shared, textBuffer.getTextBuffer());
        assertEquals("shared data", textBuffer.contentsAsString());
        assertArrayEquals(shared, textBuffer.contentsAsArray());
        textBuffer.append('x'); // should unshare
        assertNotSame(shared, textBuffer.getTextBuffer());
        assertEquals("shared datax", textBuffer.contentsAsString());
    }

    @Test
    public void testResetWithSharedPartial() {
        char[] shared = "  hello  ".toCharArray();
        textBuffer.resetWithShared(shared, 2, 5);
        assertEquals(5, textBuffer.size());
        assertEquals(2, textBuffer.getTextOffset());
        assertEquals("hello", textBuffer.contentsAsString());
        assertEquals(5, textBuffer.contentsAsArray().length);
    }

    @Test
    public void testResetWithCopy() {
        char[] data = "copy".toCharArray();
        textBuffer.resetWithCopy(data, 0, data.length);
        assertEquals(4, textBuffer.size());
        assertEquals("copy", textBuffer.contentsAsString());
        assertNotSame(data, textBuffer.getTextBuffer());
    }

    @Test
    public void testResetWithCopyEmpty() {
        textBuffer.resetWithCopy(new char[0], 0, 0);
        assertEquals(0, textBuffer.size());
        assertEquals("", textBuffer.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        textBuffer.resetWithString("hello");
        assertEquals("hello", textBuffer.contentsAsString());
        assertEquals(5, textBuffer.getTextBuffer().length);
    }

    @Test
    public void testAppendSingleChar() {
        textBuffer.append('a');
        textBuffer.append('b');
        assertEquals(2, textBuffer.size());
        assertEquals("ab", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharArray() {
        textBuffer.append("hello".toCharArray(), 0, 5);
        textBuffer.append(" world".toCharArray(), 0, 6);
        assertEquals("hello world", textBuffer.contentsAsString());
        assertEquals(11, textBuffer.size());
    }

    @Test
    public void testAppendString() {
        textBuffer.append("hello", 0, 5);
        textBuffer.append(" world", 0, 6);
        assertEquals("hello world", textBuffer.contentsAsString());
        assertEquals(11, textBuffer.size());
    }

    @Test
    public void testAppendLargeData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append('x');
        }
        String large = sb.toString();
        textBuffer.append(large);
        assertEquals(large, textBuffer.contentsAsString());
        assertEquals(large.length(), textBuffer.size());
    }

    @Test
    public void testAppendToSharedBuffer() {
        char[] shared = "hello".toCharArray();
        textBuffer.resetWithShared(shared, 0, 5);
        textBuffer.append('x');
        assertEquals("hellox", textBuffer.contentsAsString());
        assertEquals(6, textBuffer.size());
    }

    @Test
    public void testGetCurrentSegmentAndSetLength() {
        char[] seg = textBuffer.getCurrentSegment();
        assertEquals(1000, seg.length);
        seg[0] = 'a';
        textBuffer.setCurrentLength(1);
        assertEquals(1, textBuffer.getCurrentSegmentSize());
        assertEquals("a", textBuffer.contentsAsString());
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        textBuffer.append("hello");
        char[] seg = textBuffer.emptyAndGetCurrentSegment();
        assertEquals(0, textBuffer.size());
        assertEquals(0, textBuffer.getCurrentSegmentSize());
        assertNotNull(seg);
        seg[0] = 'x';
        textBuffer.setCurrentLength(1);
        assertEquals("x", textBuffer.contentsAsString());
    }

    @Test
    public void testFinishCurrentSegment() {
        textBuffer.append("hello");
        char[] finished = textBuffer.finishCurrentSegment();
        assertNotNull(finished);
        assertEquals(5, textBuffer.size());
        textBuffer.append('x');
        assertEquals("hellox", textBuffer.contentsAsString());
    }

    @Test
    public void testExpandCurrentSegment() {
        char[] seg = textBuffer.getCurrentSegment();
        int originalLength = seg.length;
        char[] expanded = textBuffer.expandCurrentSegment();
        assertTrue(expanded.length > originalLength);
        assertSame(expanded, textBuffer.getCurrentSegment());
    }

    @Test
    public void testGetTextBufferMultipleSegments() {
        // Create multiple segments
        textBuffer.append("hello world".toCharArray(), 0, 11);
        char[] buf = textBuffer.getTextBuffer();
        assertEquals("hello world", new String(buf, 0, textBuffer.size()));
    }

    @Test
    public void testContentsAsArrayFromString() {
        textBuffer.resetWithString("hello");
        char[] arr = textBuffer.contentsAsArray();
        assertEquals("hello", new String(arr));
        assertSame(arr, textBuffer.contentsAsArray()); // cached
    }

    @Test
    public void testContentsAsArrayFromShared() {
        char[] shared = "hello".toCharArray();
        textBuffer.resetWithShared(shared, 0, 5);
        char[] arr = textBuffer.contentsAsArray();
        assertEquals("hello", new String(arr));
    }

    @Test
    public void testContentsAsDecimalFromString() {
        textBuffer.resetWithString("123.45");
        BigDecimal dec = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), dec);
    }

    @Test
    public void testContentsAsDecimalFromArray() {
        textBuffer.resetWithCopy(new char[]{'9', '9', '.', '5'}, 0, 4);
        BigDecimal dec = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("99.5"), dec);
    }

    @Test
    public void testContentsAsDecimalFromSegments() {
        textBuffer.append("123");
        textBuffer.append('.');
        textBuffer.append("45");
        BigDecimal dec = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), dec);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimalInvalid() {
        textBuffer.resetWithString("not-a-number");
        textBuffer.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        textBuffer.resetWithString("3.14");
        assertEquals(3.14, textBuffer.contentsAsDouble(), 0.0001);
    }

    @Test
    public void testToString() {
        textBuffer.append("hello");
        assertEquals("hello", textBuffer.toString());
    }
}