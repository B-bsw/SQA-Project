package com.fasterxml.jackson.core.util;

import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TextBufferTest {

    @Test
    public void constructor_givenNullAllocator_shouldInitializeCleanly() {
        TextBuffer tb = new TextBuffer(null);

        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());
        Assert.assertEquals("", tb.contentsAsString());
        Assert.assertArrayEquals(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void constructor_givenBufferRecycler_shouldInitializeCleanly() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);

        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
    }

    @Test
    public void releaseBuffers_givenNullAllocator_shouldResetWithEmpty() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("test");

        tb.releaseBuffers();

        Assert.assertEquals(0, tb.size());
        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void releaseBuffers_givenNonNullAllocatorAndNullCurrentSegment_shouldDoNothing() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);

        tb.releaseBuffers();

        Assert.assertEquals(0, tb.size());
    }

    @Test
    public void releaseBuffers_givenNonNullAllocatorAndActiveSegment_shouldReleaseAndClear() {
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.emptyAndGetCurrentSegment();

        tb.releaseBuffers();

        Assert.assertEquals(0, tb.size());
        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void resetWithEmpty_givenPopulatedSegments_shouldClearSegmentsAndState() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();
        tb.append('a');

        tb.resetWithEmpty();

        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getCurrentSegmentSize());
        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void resetWithShared_givenValidCharArray_shouldPointToSharedBuffer() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "Hello World".toCharArray();

        tb.resetWithShared(shared, 6, 5);

        Assert.assertEquals(5, tb.size());
        Assert.assertEquals(6, tb.getTextOffset());
        Assert.assertTrue(tb.hasTextAsCharacters());
        Assert.assertSame(shared, tb.getTextBuffer());
        Assert.assertEquals("World", tb.contentsAsString());
    }

    @Test
    public void resetWithShared_givenPriorSegments_shouldClearSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();

        char[] shared = "abc".toCharArray();
        tb.resetWithShared(shared, 0, 3);

        Assert.assertEquals(3, tb.size());
        Assert.assertEquals("abc", tb.contentsAsString());
    }

    @Test
    public void resetWithCopy_givenInitialState_shouldCopyIntoCurrentSegment() {
        TextBuffer tb = new TextBuffer(null);
        char[] input = "CopyThis".toCharArray();

        tb.resetWithCopy(input, 0, 8);

        Assert.assertEquals(8, tb.size());
        Assert.assertEquals(0, tb.getTextOffset());
        Assert.assertEquals("CopyThis", tb.contentsAsString());
    }

    @Test
    public void resetWithCopy_givenActiveSegments_shouldClearSegmentsAndCopy() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();

        char[] input = "CleanCopy".toCharArray();
        tb.resetWithCopy(input, 0, 9);

        Assert.assertEquals(9, tb.size());
        Assert.assertEquals("CleanCopy", tb.contentsAsString());
    }

    @Test
    public void resetWithString_givenNonNullString_shouldStoreStringValue() {
        TextBuffer tb = new TextBuffer(null);

        tb.resetWithString("DirectString");

        Assert.assertEquals(12, tb.size());
        Assert.assertFalse(tb.hasTextAsCharacters());
        Assert.assertEquals("DirectString", tb.contentsAsString());
    }

    @Test
    public void resetWithString_givenActiveSegments_shouldClearSegments() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();

        tb.resetWithString("NewString");

        Assert.assertEquals(9, tb.size());
        Assert.assertEquals("NewString", tb.contentsAsString());
    }

    @Test
    public void hasTextAsCharacters_givenDifferentStates_shouldReturnExpectedBooleans() {
        TextBuffer tb = new TextBuffer(null);
        Assert.assertTrue(tb.hasTextAsCharacters());

        tb.resetWithString("hello");
        Assert.assertFalse(tb.hasTextAsCharacters());

        tb.getTextBuffer();
        Assert.assertTrue(tb.hasTextAsCharacters());

        tb.resetWithShared("abc".toCharArray(), 0, 3);
        Assert.assertTrue(tb.hasTextAsCharacters());
    }

    @Test
    public void getTextBuffer_givenSharedBuffer_shouldReturnInputBuffer() {
        TextBuffer tb = new TextBuffer(null);
        char[] arr = "test".toCharArray();
        tb.resetWithShared(arr, 0, 4);

        Assert.assertSame(arr, tb.getTextBuffer());
    }

    @Test
    public void getTextBuffer_givenResultArrayPresent_shouldReturnResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("test");
        char[] arr = tb.contentsAsArray();

        Assert.assertSame(arr, tb.getTextBuffer());
    }

    @Test
    public void getTextBuffer_givenResultStringOnly_shouldConvertAndCacheResultArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("cached");

        char[] chars = tb.getTextBuffer();

        Assert.assertArrayEquals("cached".toCharArray(), chars);
        Assert.assertSame(chars, tb.contentsAsArray());
    }

    @Test
    public void getTextBuffer_givenSingleSegmentWithoutSegments_shouldReturnCurrentSegment() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();

        Assert.assertSame(seg, tb.getTextBuffer());
    }

    @Test
    public void getTextBuffer_givenMultipleSegments_shouldReturnContentsAsArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.append("Part1", 0, 5);
        tb.finishCurrentSegment();
        tb.append("Part2", 0, 5);

        char[] full = tb.getTextBuffer();

        Assert.assertEquals("Part1Part2", new String(full));
    }

    @Test
    public void contentsAsString_givenSharedEmptyBuffer_shouldReturnEmptyString() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared(new char[10], 0, 0);

        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void contentsAsString_givenSharedNonEmptyBuffer_shouldReturnSubString() {
        TextBuffer tb = new TextBuffer(null);
        char[] arr = "prefix_target_suffix".toCharArray();
        tb.resetWithShared(arr, 7, 6);

        Assert.assertEquals("target", tb.contentsAsString());
    }

    @Test
    public void contentsAsString_givenCachedResultArray_shouldCreateStringFromResultArray() {
        TextBuffer tb = new TextBuffer(null);
        char[] chars = "from_array".toCharArray();
        tb.resetWithShared(chars, 0, 10);
        tb.contentsAsArray();

        tb.ensureNotShared();
        Assert.assertEquals("from_array", tb.contentsAsString());
    }

    @Test
    public void contentsAsString_givenMultipleSegments_shouldCombineAllSegments() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        seg[0] = 'A';
        tb.setCurrentLength(1);
        tb.finishCurrentSegment();

        seg = tb.getCurrentSegment();
        seg[0] = 'B';
        tb.setCurrentLength(1);
        tb.finishCurrentSegment();

        seg = tb.getCurrentSegment();
        seg[0] = 'C';
        tb.setCurrentLength(1);

        Assert.assertEquals("ABC", tb.contentsAsString());
    }

    @Test
    public void contentsAsArray_givenSharedZeroLength_shouldReturnNoChars() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared(new char[10], 5, 0);

        Assert.assertSame(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void contentsAsArray_givenSharedOffsetZero_shouldUseCopyOf() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "ABCDEF".toCharArray();
        tb.resetWithShared(src, 0, 3);

        char[] res = tb.contentsAsArray();

        Assert.assertArrayEquals("ABC".toCharArray(), res);
        Assert.assertNotSame(src, res);
    }

    @Test
    public void contentsAsArray_givenSharedOffsetNonZero_shouldUseCopyOfRange() {
        TextBuffer tb = new TextBuffer(null);
        char[] src = "ABCDEF".toCharArray();
        tb.resetWithShared(src, 2, 3);

        char[] res = tb.contentsAsArray();

        Assert.assertArrayEquals("CDE".toCharArray(), res);
    }

    @Test
    public void contentsAsArray_givenZeroSize_shouldReturnNoChars() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithEmpty();

        Assert.assertSame(TextBuffer.NO_CHARS, tb.contentsAsArray());
    }

    @Test
    public void contentsAsArray_givenSegments_shouldCombineIntoSingleArray() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("Hello ", 0, 6);
        tb.finishCurrentSegment();
        tb.append("World!", 0, 6);

        char[] res = tb.contentsAsArray();

        Assert.assertArrayEquals("Hello World!".toCharArray(), res);
    }

    @Test
    public void contentsAsDecimal_givenResultArray_shouldParseSuccessfully() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("123.45");
        tb.getTextBuffer();

        BigDecimal bd = tb.contentsAsDecimal();

        Assert.assertEquals(new BigDecimal("123.45"), bd);
    }

    @Test
    public void contentsAsDecimal_givenSharedBuffer_shouldParseSuccessfully() {
        TextBuffer tb = new TextBuffer(null);
        char[] buf = "xx987.65yy".toCharArray();
        tb.resetWithShared(buf, 2, 6);

        BigDecimal bd = tb.contentsAsDecimal();

        Assert.assertEquals(new BigDecimal("987.65"), bd);
    }

    @Test
    public void contentsAsDecimal_givenSingleSegment_shouldParseSuccessfully() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        "42.5".getChars(0, 4, seg, 0);
        tb.setCurrentLength(4);

        BigDecimal bd = tb.contentsAsDecimal();

        Assert.assertEquals(new BigDecimal("42.5"), bd);
    }

    @Test
    public void contentsAsDecimal_givenMultipleSegments_shouldParseSuccessfully() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("123", 0, 3);
        tb.finishCurrentSegment();
        tb.append(".456", 0, 4);

        BigDecimal bd = tb.contentsAsDecimal();

        Assert.assertEquals(new BigDecimal("123.456"), bd);
    }

    @Test
    public void contentsAsDouble_givenValidDouble_shouldParseSuccessfully() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("123.5");

        double val = tb.contentsAsDouble();

        Assert.assertEquals(123.5, val, 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void contentsAsDouble_givenInvalidInput_shouldThrowNumberFormatException() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("invalid_double");

        tb.contentsAsDouble();
    }

    @Test
    public void ensureNotShared_givenSharedBuffer_shouldUnshare() {
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "UnshareMe".toCharArray();
        tb.resetWithShared(shared, 0, 9);

        tb.ensureNotShared();

        Assert.assertEquals(-1, tb.getTextOffset());
        Assert.assertEquals("UnshareMe", tb.contentsAsString());
        Assert.assertNotSame(shared, tb.getTextBuffer());
    }

    @Test
    public void ensureNotShared_givenNotSharedBuffer_shouldBeNoOp() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("NotShared");

        tb.ensureNotShared();

        Assert.assertEquals("NotShared", tb.contentsAsString());
    }

    @Test
    public void append_givenCharAndSharedBuffer_shouldUnshareAndAppend() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("Test".toCharArray(), 0, 4);

        tb.append('!');

        Assert.assertEquals(5, tb.size());
        Assert.assertEquals("Test!", tb.contentsAsString());
    }

    @Test
    public void append_givenCharCausingExpansion_shouldExpandAndAppend() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int initialLen = seg.length;
        for (int i = 0; i < initialLen; i++) {
            tb.append('x');
        }

        tb.append('y');

        Assert.assertEquals(initialLen + 1, tb.size());
        Assert.assertTrue(tb.contentsAsString().endsWith("xy"));
    }

    @Test
    public void append_givenCharArrayAndSharedBuffer_shouldUnshareAndAppend() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("Prefix_".toCharArray(), 0, 7);

        char[] toAppend = "Suffix".toCharArray();
        tb.append(toAppend, 0, toAppend.length);

        Assert.assertEquals("Prefix_Suffix", tb.contentsAsString());
    }

    @Test
    public void append_givenCharArrayExceedingCurrentSegment_shouldExpandAndSplit() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int fill = seg.length - 2;
        char[] filler = new char[fill];
        Arrays.fill(filler, 'a');
        tb.append(filler, 0, fill);

        char[] largeAppend = new char[seg.length * 2];
        Arrays.fill(largeAppend, 'b');
        tb.append(largeAppend, 0, largeAppend.length);

        Assert.assertEquals(fill + largeAppend.length, tb.size());
        String res = tb.contentsAsString();
        Assert.assertTrue(res.startsWith("aaa"));
        Assert.assertTrue(res.endsWith("bbb"));
    }

    @Test
    public void append_givenStringAndSharedBuffer_shouldUnshareAndAppend() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("Shared".toCharArray(), 0, 6);

        tb.append("AppendString", 0, 6);

        Assert.assertEquals("SharedAppend", tb.contentsAsString());
    }

    @Test
    public void append_givenStringExceedingCurrentSegment_shouldExpandAndSplit() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int fill = seg.length - 3;
        char[] filler = new char[fill];
        Arrays.fill(filler, 'z');
        tb.append(filler, 0, fill);

        char[] strChars = new char[seg.length * 2];
        Arrays.fill(strChars, 'k');
        String largeStr = new String(strChars);
        tb.append(largeStr, 0, largeStr.length());

        Assert.assertEquals(fill + largeStr.length(), tb.size());
        String res = tb.contentsAsString();
        Assert.assertTrue(res.startsWith("zzz"));
        Assert.assertTrue(res.endsWith("kkk"));
    }

    @Test
    public void getCurrentSegment_givenSharedBuffer_shouldUnshareAndReturnSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithShared("Initial".toCharArray(), 0, 7);

        char[] seg = tb.getCurrentSegment();

        Assert.assertNotNull(seg);
        Assert.assertEquals(7, tb.getCurrentSegmentSize());
        Assert.assertEquals("Initial", new String(seg, 0, 7));
    }

    @Test
    public void getCurrentSegment_givenNullSegment_shouldAllocateBuffer() {
        TextBuffer tb = new TextBuffer(null);

        char[] seg = tb.getCurrentSegment();

        Assert.assertNotNull(seg);
        Assert.assertTrue(seg.length >= TextBuffer.MIN_SEGMENT_LEN);
    }

    @Test
    public void getCurrentSegment_givenFullSegment_shouldExpandSegment() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        tb.setCurrentLength(seg.length);

        char[] next = tb.getCurrentSegment();

        Assert.assertNotNull(next);
        Assert.assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void emptyAndGetCurrentSegment_givenExistingSegments_shouldResetSegmentsAndReturnSegment() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.finishCurrentSegment();

        char[] seg = tb.emptyAndGetCurrentSegment();

        Assert.assertNotNull(seg);
        Assert.assertEquals(0, tb.size());
        Assert.assertEquals(0, tb.getCurrentSegmentSize());
    }

    @Test
    public void setCurrentAndReturn_givenZeroSegmentSizeAndZeroLength_shouldReturnEmptyString() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();

        String res = tb.setCurrentAndReturn(0);

        Assert.assertEquals("", res);
        Assert.assertEquals("", tb.contentsAsString());
    }

    @Test
    public void setCurrentAndReturn_givenZeroSegmentSizeAndPositiveLength_shouldReturnString() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        seg[0] = 'H';
        seg[1] = 'i';

        String res = tb.setCurrentAndReturn(2);

        Assert.assertEquals("Hi", res);
        Assert.assertEquals("Hi", tb.contentsAsString());
    }

    @Test
    public void setCurrentAndReturn_givenPositiveSegmentSize_shouldReturnFullContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        tb.append("Seg1", 0, 4);
        tb.finishCurrentSegment();
        char[] seg = tb.getCurrentSegment();
        seg[0] = '2';

        String res = tb.setCurrentAndReturn(1);

        Assert.assertEquals("Seg12", res);
    }

    @Test
    public void finishCurrentSegment_givenSmallInitialBuffer_shouldClampToMinSegmentLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();

        char[] next = tb.finishCurrentSegment();

        Assert.assertTrue(next.length >= TextBuffer.MIN_SEGMENT_LEN);
    }

    @Test
    public void finishCurrentSegment_givenHugeBuffer_shouldClampToMaxSegmentLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.expandCurrentSegment(TextBuffer.MAX_SEGMENT_LEN);

        char[] next = tb.finishCurrentSegment();

        Assert.assertEquals(TextBuffer.MAX_SEGMENT_LEN, next.length);
    }

    @Test
    public void expandCurrentSegment_givenNormalSegment_shouldGrowByFiftyPercent() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int origLen = seg.length;

        char[] expanded = tb.expandCurrentSegment();

        Assert.assertEquals(origLen + (origLen >> 1), expanded.length);
        Assert.assertSame(expanded, tb.getCurrentSegment());
    }

    @Test
    public void expandCurrentSegment_givenSegmentNearMax_shouldGrowByTwentyFivePercent() {
        TextBuffer tb = new TextBuffer(null);
        tb.emptyAndGetCurrentSegment();
        tb.expandCurrentSegment(TextBuffer.MAX_SEGMENT_LEN);

        char[] expanded = tb.expandCurrentSegment();

        int expected = TextBuffer.MAX_SEGMENT_LEN + (TextBuffer.MAX_SEGMENT_LEN >> 2);
        Assert.assertEquals(expected, expanded.length);
    }

    @Test
    public void expandCurrentSegment_givenMinSizeSmallerThanCurrent_shouldReturnCurrent() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();

        char[] expanded = tb.expandCurrentSegment(seg.length - 10);

        Assert.assertSame(seg, expanded);
    }

    @Test
    public void expandCurrentSegment_givenMinSizeLargerThanCurrent_shouldExpandToMinSize() {
        TextBuffer tb = new TextBuffer(null);
        char[] seg = tb.emptyAndGetCurrentSegment();
        int target = seg.length + 500;

        char[] expanded = tb.expandCurrentSegment(target);

        Assert.assertEquals(target, expanded.length);
        Assert.assertSame(expanded, tb.getCurrentSegment());
    }

    @Test
    public void toString_givenVariousStates_shouldMatchContentsAsString() {
        TextBuffer tb = new TextBuffer(null);
        Assert.assertEquals("", tb.toString());

        tb.resetWithString("SampleText");
        Assert.assertEquals("SampleText", tb.toString());

        tb.resetWithShared("SharedText".toCharArray(), 0, 10);
        Assert.assertEquals("SharedText", tb.toString());
    }

    @Test
    public void size_givenResultArrayPrecomputed_shouldReturnResultArrayLength() {
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("ExactLength");
        tb.contentsAsArray();

        Assert.assertEquals(11, tb.size());
    }
}