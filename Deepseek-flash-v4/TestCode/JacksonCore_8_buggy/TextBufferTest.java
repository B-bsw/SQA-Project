package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class TextBufferTest {

    private TextBuffer textBuffer;

    @Before
    public void setUp() {
        textBuffer = new TextBuffer(new BufferRecycler());
    }

    @Test
    public void testResetWithEmpty() {
        textBuffer.resetWithShared(new char[]{'a', 'b'}, 0, 2);
        assertEquals(2, textBuffer.size());
        textBuffer.resetWithEmpty();
        assertEquals(0, textBuffer.size());
        assertFalse(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testResetWithShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        assertEquals("hello", textBuffer.contentsAsString());
        assertEquals(5, textBuffer.size());
        assertEquals(0, textBuffer.getTextOffset());
    }

    @Test
    public void testResetWithSharedNonZeroStart() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 1, 4);
        assertEquals(4, textBuffer.size());
        assertEquals(1, textBuffer.getTextOffset());
        assertEquals("ello", textBuffer.contentsAsString());
    }

    @Test
    public void testResetWithCopy() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        assertEquals("hello", textBuffer.contentsAsString());
        assertEquals(5, textBuffer.size());
    }

    @Test
    public void testResetWithString() {
        textBuffer.resetWithString("hello");
        assertEquals("hello", textBuffer.contentsAsString());
        assertEquals(5, textBuffer.size());
        assertFalse(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testAppendChar() {
        textBuffer.resetWithEmpty();
        textBuffer.append('a');
        textBuffer.append('b');
        textBuffer.append('c');
        assertEquals(3, textBuffer.size());
        assertEquals("abc", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharToShared() {
        char[] input = "abcd".toCharArray();
        textBuffer.resetWithShared(input, 0, 4);
        textBuffer.append('e');
        assertEquals(5, textBuffer.size());
        assertEquals("abcde", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharArray() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello".toCharArray(), 0, 5);
        assertEquals(5, textBuffer.size());
        assertEquals("hello", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayPartial() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello".toCharArray(), 1, 3);
        assertEquals(3, textBuffer.size());
        assertEquals("ell", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayMultipleSegments() {
        textBuffer.resetWithEmpty();
        char[] data = new char[1500];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('a' + (i % 26));
        }
        textBuffer.append(data, 0, data.length);
        assertEquals(data.length, textBuffer.size());
        assertEquals(new String(data), textBuffer.contentsAsString());
    }

    @Test
    public void testAppendString() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello", 0, 5);
        assertEquals("hello", textBuffer.contentsAsString());
    }

    @Test
    public void testAppendStringSubstring() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello world", 6, 5);
        assertEquals("world", textBuffer.contentsAsString());
    }

    @Test
    public void testGetCurrentSegment() {
        textBuffer.resetWithEmpty();
        char[] seg = textBuffer.getCurrentSegment();
        assertNotNull(seg);
        assertTrue(seg.length >= 1000);
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        textBuffer.resetWithEmpty();
        char[] seg = textBuffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, textBuffer.getCurrentSegmentSize());
    }

    @Test
    public void testGetCurrentSegmentSize() {
        textBuffer.resetWithEmpty();
        assertEquals(0, textBuffer.getCurrentSegmentSize());
        textBuffer.append('a');
        assertEquals(1, textBuffer.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentLength() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello".toCharArray(), 0, 5);
        textBuffer.setCurrentLength(3);
        assertEquals("hel", textBuffer.contentsAsString());
    }

    @Test
    public void testSetCurrentAndReturn() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello".toCharArray(), 0, 5);
        String result = textBuffer.setCurrentAndReturn(3);
        assertEquals("hel", result);
    }

    @Test
    public void testContentsAsArray() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        char[] arr = textBuffer.contentsAsArray();
        assertArrayEquals("hello".toCharArray(), arr);
    }

    @Test
    public void testContentsAsArrayShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        char[] arr = textBuffer.contentsAsArray();
        assertArrayEquals("hello".toCharArray(), arr);
    }

    @Test
    public void testContentsAsArrayMultipleSegments() {
        textBuffer.resetWithEmpty();
        char[] data = new char[2500];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('a' + (i % 26));
        }
        textBuffer.append(data, 0, data.length);
        char[] arr = textBuffer.contentsAsArray();
        assertArrayEquals(data, arr);
    }

    @Test
    public void testContentsAsString() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        assertEquals("hello", textBuffer.contentsAsString());
    }

    @Test
    public void testContentsAsStringEmpty() {
        textBuffer.resetWithEmpty();
        assertEquals("", textBuffer.contentsAsString());
    }

    @Test
    public void testContentsAsStringShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        assertEquals("hello", textBuffer.contentsAsString());
    }

    @Test
    public void testContentsAsStringMultipleSegments() {
        textBuffer.resetWithEmpty();
        char[] data = new char[2500];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('a' + (i % 26));
        }
        textBuffer.append(data, 0, data.length);
        assertEquals(new String(data), textBuffer.contentsAsString());
    }

    @Test
    public void testContentsAsStringCached() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        textBuffer.contentsAsString();
        textBuffer.contentsAsString();
        assertEquals("hello", textBuffer.contentsAsString());
    }

    @Test
    public void testContentsAsDecimalShared() {
        char[] input = "123.45".toCharArray();
        textBuffer.resetWithShared(input, 0, 6);
        BigDecimal result = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), result);
    }

    @Test
    public void testContentsAsDecimalSingleSegment() {
        textBuffer.resetWithCopy("123.45".toCharArray(), 0, 6);
        BigDecimal result = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), result);
    }

    @Test
    public void testContentsAsDecimalMultipleSegments() {
        textBuffer.resetWithEmpty();
        String value = "12345.6789";
        for (int i = 0; i < value.length(); i++) {
            textBuffer.append(value.charAt(i));
        }
        BigDecimal result = textBuffer.contentsAsDecimal();
        assertEquals(new BigDecimal(value), result);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimalInvalid() {
        textBuffer.resetWithCopy("abc".toCharArray(), 0, 3);
        textBuffer.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        textBuffer.resetWithCopy("3.14".toCharArray(), 0, 4);
        double result = textBuffer.contentsAsDouble();
        assertEquals(3.14, result, 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDoubleInvalid() {
        textBuffer.resetWithCopy("abc".toCharArray(), 0, 3);
        textBuffer.contentsAsDouble();
    }

    @Test
    public void testEnsureNotShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        textBuffer.ensureNotShared();
        assertEquals("hello", textBuffer.contentsAsString());
        assertTrue(textBuffer.getTextOffset() == 0);
    }

    @Test
    public void testExpandCurrentSegment() {
        textBuffer.resetWithEmpty();
        char[] seg = textBuffer.getCurrentSegment();
        int origLen = seg.length;
        char[] expanded = textBuffer.expandCurrentSegment();
        assertTrue(expanded.length >= origLen);
    }

    @Test
    public void testExpandCurrentSegmentMinSize() {
        textBuffer.resetWithEmpty();
        char[] seg = textBuffer.getCurrentSegment();
        char[] expanded = textBuffer.expandCurrentSegment(seg.length + 5000);
        assertTrue(expanded.length >= seg.length);
    }

    @Test
    public void testFinishCurrentSegment() {
        textBuffer.resetWithEmpty();
        textBuffer.append("hello".toCharArray(), 0, 5);
        char[] seg = textBuffer.finishCurrentSegment();
        assertNotNull(seg);
    }

    @Test
    public void testSizeWithMultipleSegments() {
        textBuffer.resetWithEmpty();
        char[] data = new char[2500];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('a' + (i % 26));
        }
        textBuffer.append(data, 0, data.length);
        assertEquals(data.length, textBuffer.size());
    }

    @Test
    public void testGetTextBufferWithShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        assertSame(input, textBuffer.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWithResultArray() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        textBuffer.contentsAsArray();
        char[] buf = textBuffer.getTextBuffer();
        assertNotNull(buf);
    }

    @Test
    public void testGetTextBufferWithSingleSegment() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        char[] buf = textBuffer.getTextBuffer();
        assertNotNull(buf);
    }

    @Test
    public void testGetTextBufferWithMultipleSegments() {
        textBuffer.resetWithEmpty();
        char[] data = new char[2500];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('a' + (i % 26));
        }
        textBuffer.append(data, 0, data.length);
        char[] buf = textBuffer.getTextBuffer();
        assertNotNull(buf);
    }

    @Test
    public void testGetTextOffsetWithShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 1, 4);
        assertEquals(1, textBuffer.getTextOffset());
    }

    @Test
    public void testGetTextOffsetWithSegments() {
        textBuffer.resetWithEmpty();
        assertEquals(0, textBuffer.getTextOffset());
    }

    @Test
    public void testHasTextAsCharactersWithShared() {
        char[] input = "hello".toCharArray();
        textBuffer.resetWithShared(input, 0, 5);
        assertTrue(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWithResultArray() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        textBuffer.contentsAsArray();
        assertTrue(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWithString() {
        textBuffer.resetWithString("hello");
        assertFalse(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWithEmpty() {
        textBuffer.resetWithEmpty();
        assertTrue(textBuffer.hasTextAsCharacters());
    }

    @Test
    public void testReleaseBuffersRecycles() {
        textBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        textBuffer.releaseBuffers();
        assertEquals(0, textBuffer.size());
    }

    @Test
    public void testReleaseBuffersWithoutAllocator() {
        TextBuffer simpleBuffer = new TextBuffer(null);
        simpleBuffer.resetWithCopy("hello".toCharArray(), 0, 5);
        simpleBuffer.releaseBuffers();
        assertEquals(0, simpleBuffer.size());
    }
}