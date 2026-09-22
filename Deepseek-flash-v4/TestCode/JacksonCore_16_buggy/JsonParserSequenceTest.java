package com.fasterxml.jackson.core.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParserSequenceTest {

    private JsonParser mockParser1;
    private JsonParser mockParser2;
    private JsonParser mockParser3;
    private JsonParser[] mockParsers;

    @Before
    public void setUp() {
        mockParser1 = mock(JsonParser.class);
        mockParser2 = mock(JsonParser.class);
        mockParser3 = mock(JsonParser.class);
        mockParsers = new JsonParser[] { mockParser1, mockParser2, mockParser3 };
    }

    @Test
    public void testCreateFlattenedWithNonSequences() throws IOException {
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        assertNotNull(seq);
        assertEquals(2, seq.containedParsersCount());
        assertSame(mockParser1, seq.delegate);
    }

    @Test
    public void testCreateFlattenedWithFirstAsSequence() throws IOException {
        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { mockParser2, mockParser3 });
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq, mockParser1);
        assertNotNull(outerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
        assertSame(mockParser2, outerSeq.delegate);
    }

    @Test
    public void testCreateFlattenedWithSecondAsSequence() throws IOException {
        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { mockParser2, mockParser3 });
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(mockParser1, innerSeq);
        assertNotNull(outerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
        assertSame(mockParser1, outerSeq.delegate);
    }

    @Test
    public void testCreateFlattenedWithBothSequences() throws IOException {
        JsonParserSequence innerSeq1 = new JsonParserSequence(new JsonParser[] { mockParser1, mockParser2 });
        JsonParserSequence innerSeq2 = new JsonParserSequence(new JsonParser[] { mockParser3 });
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(innerSeq1, innerSeq2);
        assertNotNull(outerSeq);
        assertEquals(3, outerSeq.containedParsersCount());
        assertSame(mockParser1, outerSeq.delegate);
    }

    @Test
    public void testNextTokenReturnsTokenFromFirstParser() throws IOException {
        when(mockParser1.nextToken()).thenReturn(JsonToken.START_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        verify(mockParser1).nextToken();
        verify(mockParser2, never()).nextToken();
    }

    @Test
    public void testNextTokenReturnsTokenFromSecondParserWhenFirstReturnsNull() throws IOException {
        when(mockParser1.nextToken()).thenReturn(null);
        when(mockParser2.nextToken()).thenReturn(JsonToken.VALUE_STRING);
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        assertEquals(JsonToken.VALUE_STRING, seq.nextToken());
        verify(mockParser1).nextToken();
        verify(mockParser2).nextToken();
    }

    @Test
    public void testNextTokenReturnsNullWhenAllParsersReturnNull() throws IOException {
        when(mockParser1.nextToken()).thenReturn(null);
        when(mockParser2.nextToken()).thenReturn(null);
        when(mockParser3.nextToken()).thenReturn(null);
        JsonParserSequence seq = new JsonParserSequence(mockParsers);
        assertNull(seq.nextToken());
        verify(mockParser1).nextToken();
        verify(mockParser2).nextToken();
        verify(mockParser3).nextToken();
    }

    @Test
    public void testNextTokenReturnsNullWhenNoParsers() throws IOException {
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[0]);
        assertNull(seq.nextToken());
    }

    @Test
    public void testNextTokenReturnsTokenWhenLoopRunsMultipleIterations() throws IOException {
        when(mockParser1.nextToken()).thenReturn(null, null);
        when(mockParser2.nextToken()).thenReturn(null, null);
        when(mockParser3.nextToken()).thenReturn(null, JsonToken.VALUE_TRUE);
        JsonParserSequence seq = new JsonParserSequence(mockParsers);
        assertEquals(JsonToken.VALUE_TRUE, seq.nextToken());
        verify(mockParser1, times(1)).nextToken();
        verify(mockParser2, times(1)).nextToken();
        verify(mockParser3, times(2)).nextToken();
    }

    @Test
    public void testCloseClosesAllParsers() throws Exception {
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        seq.close();
        verify(mockParser1).close();
        verify(mockParser2).close();
    }

    @Test
    public void testCloseClosesAllParsersIncludingNestedSequences() throws Exception {
        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { mockParser2, mockParser3 });
        JsonParserSequence outerSeq = JsonParserSequence.createFlattened(mockParser1, innerSeq);
        outerSeq.close();
        verify(mockParser1).close();
        verify(mockParser2).close();
        verify(mockParser3).close();
    }

    @Test
    public void testContainedParsersCount() {
        JsonParserSequence seq = new JsonParserSequence(mockParsers);
        assertEquals(3, seq.containedParsersCount());
    }

    @Test
    public void testSwitchToNextWhenParsersRemain() {
        JsonParserSequence seq = new JsonParserSequence(mockParsers);
        assertSame(mockParser1, seq.delegate);
        assertEquals(true, seq.switchToNext());
        assertSame(mockParser2, seq.delegate);
        assertEquals(true, seq.switchToNext());
        assertSame(mockParser3, seq.delegate);
        assertEquals(false, seq.switchToNext());
    }

    @Test
    public void testSwitchToNextWhenNoParsersLeft() {
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { mockParser1 });
        assertEquals(false, seq.switchToNext());
    }

    @Test
    public void testAddFlattenedActiveParsersWithRecursiveNestedSequence() {
        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { mockParser2 });
        JsonParserSequence outerSeq = new JsonParserSequence(new JsonParser[] { mockParser1, innerSeq, mockParser3 });
        List<JsonParser> result = new ArrayList<>();
        outerSeq.addFlattenedActiveParsers(result);
        assertEquals(3, result.size());
        assertSame(mockParser1, result.get(0));
        assertSame(mockParser2, result.get(1));
        assertSame(mockParser3, result.get(2));
    }

    @Test
    public void testAddFlattenedActiveParsersWithMultipleNestedSequences() {
        JsonParserSequence innerSeq1 = new JsonParserSequence(new JsonParser[] { mockParser1, mockParser2 });
        JsonParserSequence innerSeq2 = new JsonParserSequence(new JsonParser[] { mockParser3 });
        JsonParserSequence outerSeq = new JsonParserSequence(new JsonParser[] { innerSeq1, innerSeq2 });
        List<JsonParser> result = new ArrayList<>();
        outerSeq.addFlattenedActiveParsers(result);
        assertEquals(3, result.size());
        assertSame(mockParser1, result.get(0));
        assertSame(mockParser2, result.get(1));
        assertSame(mockParser3, result.get(2));
    }

    @Test
    public void testProtectedConstructorWithNullArray() {
        try {
            new JsonParserSequence(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenWithIOException() throws IOException {
        when(mockParser1.nextToken()).thenThrow(new IOException("test"));
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        try {
            seq.nextToken();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("test", e.getMessage());
        }
    }

    @Test
    public void testNextTokenWithJsonParseException() throws IOException {
        when(mockParser1.nextToken()).thenThrow(new JsonParseException(null, "parse error"));
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        try {
            seq.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            assertEquals("parse error", e.getMessage());
        }
    }

    @Test
    public void testCloseWithIOException() throws Exception {
        doThrow(new IOException("close error")).when(mockParser1).close();
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        try {
            seq.close();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("close error", e.getMessage());
        }
    }

    @Test
    public void testNextTokenContinuesToNextParserWhenFirstReturnsNull() throws IOException {
        when(mockParser1.nextToken()).thenReturn(null);
        when(mockParser2.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(mockParser1, mockParser2);
        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        verify(mockParser1).nextToken();
        verify(mockParser2).nextToken();
    }

    @Test
    public void testSwitchToNextPreservesDelegate() {
        JsonParserSequence seq = new JsonParserSequence(mockParsers);
        assertSame(mockParser1, seq.delegate);
        seq.switchToNext();
        assertSame(mockParser2, seq.delegate);
        seq.switchToNext();
        assertSame(mockParser3, seq.delegate);
        seq.switchToNext();
        assertSame(mockParser3, seq.delegate); // no change when no more parsers
    }

    @Test
    public void testAddFlattenedActiveParsersIgnoresNonSequenceAndStartsFromNextParser() {
        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { mockParser1, mockParser2 });
        JsonParserSequence outerSeq = new JsonParserSequence(new JsonParser[] { innerSeq, mockParser3 });
        outerSeq._nextParser = 1; // simulate delegate points to innerSeq, next parser is mockParser3
        List<JsonParser> result = new ArrayList<>();
        outerSeq.addFlattenedActiveParsers(result);
        assertEquals(1, result.size());
        assertSame(mockParser3, result.get(0));
    }
}