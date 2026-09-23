package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TextBufferTest {
    private TextBuffer buffer;

    @Before
    public void setUp() {
        buffer = new TextBuffer(new BufferRecycler());
    }

    @Test
    public void testConstructorAndInitialState() {
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertTrue(buffer.hasTextAsCharacters());
        assertNotNull(buffer.getTextBuffer());
    }

    @Test
    public void testResetWithEmpty() {
        buffer.append("hello");
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
        assertEquals(0, buffer.getCurrentSegmentSize());
        assertTrue(buffer.hasTextAsCharacters());
    }

    @Test
    public void testResetWithShared() {
        char[] shared = "hello".toCharArray();
        buffer.resetWithShared(shared, 0, 5);
        assertEquals(5, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertSame(shared, buffer.getTextBuffer());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testResetWithCopy() {
        char[] input = "hello".toCharArray();
        buffer.resetWithCopy(input, 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        buffer.resetWithString("hello");
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharBasic() {
        buffer.append('a');
        buffer.append('b');
        assertEquals(2, buffer.size());
        assertEquals("ab", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharToExpandSegment() {
        for (int i = 0; i < 2000; i++) {
            buffer.append('x');
        }
        assertEquals(2000, buffer.size());
    }

    @Test
    public void testAppendCharArray() {
        char[] chars = "hello".toCharArray();
        buffer.append(chars, 0, chars.length);
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendWithMultipleSegments() {
        String longStr = new String(new char[5000]).replace('\0', 'x');
        buffer.append(longStr.toCharArray(), 0, longStr.length());
        assertEquals(longStr.length(), buffer.size());
        assertEquals(longStr, buffer.contentsAsString());
    }

    @Test
    public void testAppendAfterUnshare() {
        char[] shared = "hello".toCharArray();
        buffer.resetWithShared(shared, 0, 5);
        buffer.append('!');
        assertEquals(6, buffer.size());
        assertEquals("hello!", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringBasic() {
        buffer.append("hello", 0, 5);
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringWithOffset() {
        String str = "hello world";
        buffer.append(str, 6, 5);
        assertEquals("world", buffer.contentsAsString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendStringOutOfBounds() {
        buffer.append("hello", 2, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testAppendNullCharArray() {
        char[] arr = null;
        buffer.append(arr, 0, 5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppendCharArrayOutOfBounds() {
        char[] chars = "hello".toCharArray();
        buffer.append(chars, 2, 10);
    }

    @Test
    public void testGetCurrentSegment() {
        char[] seg1 = buffer.getCurrentSegment();
        assertNotNull(seg1);
        assertTrue(seg1.length >= 1000);

        buffer.append('a');
        char[] seg2 = buffer.getCurrentSegment();
        assertSame(seg1, seg2);
    }

    @Test
    public void testGetCurrentSegmentAfterSegmentFull() {
        for (int i = 0; i < 1100; i++) {
            buffer.append('x');
        }
        char[] seg = buffer.getCurrentSegment();
        assertNotNull(seg);
        assertTrue(seg.length >= 1000);
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        char[] seg = buffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, buffer.size());
    }

    @Test
    public void testGetCurrentSegmentSize() {
        assertEquals(0, buffer.getCurrentSegmentSize());
        buffer.append('a');
        assertEquals(1, buffer.getCurrentSegmentSize());
        buffer.append("bc", 0, 2);
        assertEquals(3, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentLength() {
        buffer.setCurrentLength(5);
        assertEquals(5, buffer.getCurrentSegmentSize());
        buffer.setCurrentLength(0);
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testSetCurrentLengthNegative() {
        buffer.append("hello");
        buffer.setCurrentLength(-1);
        assertEquals(-1, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegment() {
        for (int i = 0; i < 1000; i++) {
            buffer.append('x');
        }
        char[] seg1 = buffer.finishCurrentSegment();
        assertNotNull(seg1);

        char[] seg2 = buffer.finishCurrentSegment();
        assertNotNull(seg2);

        buffer.append('a');
        assertEquals("a", buffer.contentsAsString());
    }

    @Test
    public void testExpandCurrentSegment() {
        char[] seg = buffer.getCurrentSegment();
        int originalLen = seg.length;
        char[] expanded = buffer.expandCurrentSegment();
        assertEquals(originalLen * 2, expanded.length);
    }

    @Test
    public void testExpandCurrentSegmentMinSize() {
        char[] seg = buffer.getCurrentSegment();
        int origLen = seg.length;
        char[] expanded = buffer.expandCurrentSegment(origLen + 100);
        assertTrue(expanded.length >= origLen + 100);
    }

    @Test
    public void testExpandCurrentSegmentMinSizeAlreadyBigEnough() {
        char[] seg = buffer.getCurrentSegment();
        char[] expanded = buffer.expandCurrentSegment(seg.length - 10);
        assertSame(seg, expanded);
    }

    @Test
    public void testContentsAsDecimal() throws Exception {
        buffer.append("3.14159");
        BigDecimal decimal = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("3.14159"), decimal);
    }

    @Test
    public void testContentsAsDecimalWithSharedBuffer() throws Exception {
        char[] shared = "3.14159".toCharArray();
        buffer.resetWithShared(shared, 0, shared.length);
        assertEquals(new BigDecimal("3.14159"), buffer.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimalWithCurrentSegment() throws Exception {
        buffer.append("99.99");
        assertEquals(new BigDecimal("99.99"), buffer.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDecimalWithMultipleSegments() throws Exception {
        String largeNum = "1234567890.1234567890";
        buffer.append(largeNum.toCharArray(), 0, largeNum.length());
        for (int i = 0; i < 10; i++) {
            buffer.append("more");
        }
        assertEquals(new BigDecimal(largeNum + "moremoremoremoremoremoremoremoremoremore"), buffer.contentsAsDecimal());
    }

    @Test
    public void testContentsAsDouble() {
        buffer.append("3.14");
        assertEquals(3.14, buffer.contentsAsDouble(), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDoubleInvalid() {
        buffer.append("not-a-number");
        buffer.contentsAsDouble();
    }

    @Test
    public void testContentsAsArray() {
        char[] result = buffer.contentsAsArray();
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testContentsAsArrayWithContent() {
        buffer.append("hello");
        char[] result = buffer.contentsAsArray();
        assertEquals("hello", new String(result));
    }

    @Test
    public void testContentsAsArrayWithShared() {
        char[] shared = "shared".toCharArray();
        buffer.resetWithShared(shared, 0, shared.length);
        char[] result = buffer.contentsAsArray();
        assertEquals("shared", new String(result));
    }

    @Test
    public void testContentsAsStringWithShared() {
        char[] shared = "sample".toCharArray();
        buffer.resetWithShared(shared, 0, 6);
        assertEquals("sample", buffer.contentsAsString());
    }

    @Test
    public void testContentsAsStringWithResultArray() {
        buffer.append("result");
        char[] arr = buffer.contentsAsArray();
        assertNotNull(arr);
        assertEquals("result", buffer.contentsAsString());
    }

    @Test
    public void testSizeWhenEmpty() {
        assertEquals(0, buffer.size());
    }

    @Test
    public void testGetTextOffsetWithSharedBuffer() {
        char[] shared = new char[100];
        buffer.resetWithShared(shared, 10, 5);
        assertEquals(10, buffer.getTextOffset());
    }

    @Test
    public void testGetTextOffsetWithLocalBuffer() {
        assertEquals(0, buffer.getTextOffset());
    }

    @Test
    public void testHasTextAsCharactersWithStringResult() {
        buffer.append("hello");
        buffer.contentsAsString();
        assertFalse(buffer.hasTextAsCharacters());
    }

    @Test
    public void testLargeAppend() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append('x');
        }
        buffer.append(sb.toString(), 0, sb.length());
        assertEquals(sb.length(), buffer.size());
    }

    @Test
    public void testReleaseBuffersWithNullAllocator() {
        TextBuffer b = new TextBuffer(new BufferRecycler());
        b.releaseBuffers();
        assertEquals(0, b.size());
    }

    @Test
    public void testReleaseBuffersWithAllocator() {
        buffer.append("content");
        TextBuffer b = new TextBuffer(new BufferRecycler());
        b.append("hello");
        b.releaseBuffers();
    }

    @Test
    public void testContentsAsArrayWithInputBuffer() {
        char[] input = "buffer".toCharArray();
        buffer.resetWithShared(input, 2, 4);
        char[] result = buffer.contentsAsArray();
        assertArrayEquals("ffer".toCharArray(), result);
    }

    @Test
    public void testExpandCurrentSegmentAfterNoSegments() {
        TextBuffer b = new TextBuffer(null);
        b.append("ab");
        b.finishCurrentSegment();
        char[] seg = b.expandCurrentSegment();
        assertNotNull(seg);
    }
}