package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Comprehensive Unit Tests for {@link TextBuffer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class TextBufferTest {

    @Test
    public void resetWithEmpty_givenNewBuffer_shouldInitializeProperly() {
        // Arrange
        TextBuffer tb = new TextBuffer(new BufferRecycler());

        // Act
        tb.resetWithEmpty();

        // Assert
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
        assertNotNull(tb.getTextBuffer());
        assertEquals(0, tb.getTextOffset());
        assertEquals(0, tb.getTextLength());
    }

    @Test
    public void resetWithShared_givenCharArray_shouldShareInputData() {
        // Arrange
        TextBuffer tb = new TextBuffer(null);
        char[] shared = "HelloWorld".toCharArray();

        // Act
        tb.resetWithShared(shared, 5, 5);

        // Assert
        assertEquals(5, tb.size());
        assertEquals("World", tb.contentsAsString());
        assertEquals(5, tb.getTextOffset());
        assertEquals(5, tb.getTextLength());
        assertArrayEquals("World".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void resetWithString_givenStringValue_shouldContainString() {
        // Arrange
        TextBuffer tb = new TextBuffer(null);
        String input = "JacksonTextBuffer";

        // Act
        tb.resetWithString(input);

        // Assert
        assertEquals(input.length(), tb.size());
        assertEquals(input, tb.contentsAsString());
        assertEquals(input, tb.toString());
        assertArrayEquals(input.toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void append_givenCharAndCharArrayAndString_shouldAccumulateContent() {
        // Arrange
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.resetWithEmpty();

        // Act
        tb.append('A');
        tb.append("BCDE".toCharArray(), 0, 4);
        tb.append("FGHIJ", 0, 5);

        // Assert
        assertEquals(10, tb.size());
        assertEquals("ABCDEFGHIJ", tb.contentsAsString());
    }

    @Test
    public void ensureNotShared_givenSharedBuffer_shouldMakeCopy() {
        // Arrange
        TextBuffer tb = new TextBuffer(null);
        char[] original = "SharedData".toCharArray();
        tb.resetWithShared(original, 0, original.length);

        // Act
        tb.ensureNotShared();

        // Assert
        assertEquals("SharedData", tb.contentsAsString());
        assertNotSame(original, tb.getTextBuffer());
    }

    @Test
    public void getCurrentSegment_andExpand_shouldProvideWriteableBuffer() {
        // Arrange
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.resetWithEmpty();

        // Act
        char[] segment = tb.getCurrentSegment();
        assertNotNull(segment);
        assertTrue(segment.length > 0);

        segment[0] = 'X';
        tb.setCurrentLength(1);
        char[] expanded = tb.expandCurrentSegment();

        // Assert
        assertNotNull(expanded);
        assertTrue(expanded.length > segment.length);
        assertEquals('X', expanded[0]);
    }

    @Test
    public void finishCurrentSegment_shouldCreateMultipleSegments() {
        // Arrange
        TextBuffer tb = new TextBuffer(new BufferRecycler());
        tb.resetWithEmpty();

        // Act
        char[] seg1 = tb.getCurrentSegment();
        seg1[0] = '1';
        seg1[1] = '2';
        tb.setCurrentLength(2);

        char[] seg2 = tb.finishCurrentSegment();
        seg2[0] = '3';
        seg2[1] = '4';
        tb.setCurrentLength(2);

        // Assert
        assertEquals(4, tb.size());
        assertEquals("1234", tb.contentsAsString());
        assertArrayEquals("1234".toCharArray(), tb.contentsAsArray());
    }

    @Test
    public void contentsAsDecimal_andDouble_shouldParseCorrectly() {
        // Arrange
        TextBuffer tb = new TextBuffer(null);
        tb.resetWithString("123.45");

        // Act & Assert
        assertEquals(new BigDecimal("123.45"), tb.contentsAsDecimal());
        assertEquals(123.45, tb.contentsAsDouble(), 0.0001);
    }

    @Test
    public void releaseBuffers_shouldClearContent() {
        // Arrange
        BufferRecycler recycler = new BufferRecycler();
        TextBuffer tb = new TextBuffer(recycler);
        tb.resetWithEmpty();
        tb.append("TestData", 0, 8);

        // Act
        tb.releaseBuffers();

        // Assert
        assertEquals(0, tb.size());
        assertEquals("", tb.contentsAsString());
    }
}
