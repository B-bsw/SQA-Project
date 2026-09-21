package com.fasterxml.jackson.core.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class JsonParserSequenceTest
{
    // ------------------------------------------------------------
    // createFlattened() tests
    // ------------------------------------------------------------

    @Test
    public void testCreateFlattenedSimpleTwoParsers() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertNotNull(seq);
        assertEquals(2, seq.containedParsersCount());
        assertSame(p1, seq.getDelegate());
    }

    @Test
    public void testCreateFlattenedFirstIsSequence() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);
        JsonParser p3 = mock(JsonParser.class);

        JsonParserSequence inner = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, p3);

        assertEquals(3, outer.containedParsersCount());
        assertSame(p1, outer.getDelegate());
    }

    @Test
    public void testCreateFlattenedSecondIsSequence() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);
        JsonParser p3 = mock(JsonParser.class);

        JsonParserSequence inner = JsonParserSequence.createFlattened(p2, p3);
        JsonParserSequence outer = JsonParserSequence.createFlattened(p1, inner);

        assertEquals(3, outer.containedParsersCount());
        assertSame(p1, outer.getDelegate());
    }

    @Test
    public void testCreateFlattenedBothAreSequences() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);
        JsonParser p3 = mock(JsonParser.class);
        JsonParser p4 = mock(JsonParser.class);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(p3, p4);
        JsonParserSequence outer = JsonParserSequence.createFlattened(seq1, seq2);

        assertEquals(4, outer.containedParsersCount());
        assertSame(p1, outer.getDelegate());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFlattenedWithNullDelegateThrowsOnUse() throws IOException
    {
        JsonParserSequence seq = JsonParserSequence.createFlattened(null, null);
        // delegate is null -> calling nextToken should throw NPE
        seq.nextToken();
    }

    // ------------------------------------------------------------
    // containedParsersCount() tests
    // ------------------------------------------------------------

    @Test
    public void testContainedParsersCountBoundary() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(2, seq.containedParsersCount());
    }

    // ------------------------------------------------------------
    // nextToken() tests
    // ------------------------------------------------------------

    @Test
    public void testNextTokenNormalCaseNoSwitch() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        when(p1.nextToken()).thenReturn(JsonToken.START_OBJECT);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t = seq.nextToken();
        assertEquals(JsonToken.START_OBJECT, t);
        verify(p1, times(1)).nextToken();
        verify(p2, never()).nextToken();
    }

    @Test
    public void testNextTokenSwitchesOnceToSecondParser() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        when(p1.nextToken()).thenReturn(null);
        when(p2.nextToken()).thenReturn(JsonToken.START_ARRAY);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t = seq.nextToken();
        assertEquals(JsonToken.START_ARRAY, t);
        assertSame(p2, seq.getDelegate());
        verify(p1, times(1)).nextToken();
        verify(p2, times(1)).nextToken();
    }

    @Test
    public void testNextTokenSwitchesMultipleTimes() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);
        JsonParser p3 = mock(JsonParser.class);

        when(p1.nextToken()).thenReturn(null);
        when(p2.nextToken()).thenReturn(null);
        when(p3.nextToken()).thenReturn(JsonToken.VALUE_NUMBER_INT);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq = JsonParserSequence.createFlattened(seq1, p3);

        JsonToken t = seq.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertSame(p3, seq.getDelegate());
        verify(p1, times(1)).nextToken();
        verify(p2, times(1)).nextToken();
        verify(p3, times(1)).nextToken();
    }

    @Test
    public void testNextTokenAllParsersExhaustedReturnsNull() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        when(p1.nextToken()).thenReturn(null);
        when(p2.nextToken()).thenReturn(null);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t = seq.nextToken();
        assertNull(t);
        assertSame(p2, seq.getDelegate());
        verify(p1, times(1)).nextToken();
        verify(p2, times(1)).nextToken();
    }

    @Test(expected = IOException.class)
    public void testNextTokenExceptionPropagates() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        when(p1.nextToken()).thenThrow(new IOException("boom"));

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.nextToken();
    }

    // ------------------------------------------------------------
    // close() tests
    // ------------------------------------------------------------

    @Test
    public void testCloseCallsCloseOnAllDelegates() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);
        JsonParser p3 = mock(JsonParser.class);

        JsonParserSequence seq1 = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq = JsonParserSequence.createFlattened(seq1, p3);

        seq.close();

        verify(p1, times(1)).close();
        verify(p2, times(1)).close();
        verify(p3, times(1)).close();
    }

    @Test
    public void testCloseSingleParserOnlyClosesOnce() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        seq.close();

        verify(p1, times(1)).close();
        verify(p2, times(1)).close();
    }

    @Test(expected = IOException.class)
    public void testCloseExceptionPropagates() throws IOException
    {
        JsonParser p1 = mock(JsonParser.class);
        JsonParser p2 = mock(JsonParser.class);

        doThrow(new IOException("close failed")).when(p1).close();

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();
    }
}