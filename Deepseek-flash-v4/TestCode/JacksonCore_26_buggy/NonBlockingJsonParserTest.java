package com.fasterxml.jackson.core.json.async;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.io.IOContext;

public class NonBlockingJsonParserTest {

    private NonBlockingJsonParser parser;
    private JsonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        parser = (NonBlockingJsonParser) factory.createNonBlockingByteArrayParser();
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null) {
            parser.close();
        }
    }

    // ---------- needMoreInput ----------
    @Test
    public void testNeedMoreInputInitially() {
        assertTrue("Initially should need more input", parser.needMoreInput());
    }

    @Test
    public void testNeedMoreInputAfterEndOfInput() throws IOException {
        parser.endOfInput();
        assertFalse("After endOfInput should not need more input", parser.needMoreInput());
    }

    // ---------- feedInput ----------
    @Test
    public void testFeedInputNormal() throws IOException {
        byte[] data = "{}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        // After feeding, needMoreInput should be false if not fully consumed
        assertFalse("After feeding complete data, needMoreInput should be false", parser.needMoreInput());
    }

    @Test(expected = IOException.class)
    public void testFeedInputWithUndecodedBytes() throws IOException {
        // Feed first part, but don't consume all
        byte[] part1 = "12".getBytes("UTF-8");
        parser.feedInput(part1, 0, part1.length);
        // Now feed more without consuming the first part (inputPtr < inputEnd)
        // The parser will still have undecoded bytes because it hasn't called nextToken
        byte[] part2 = "34".getBytes("UTF-8");
        parser.feedInput(part2, 0, part2.length); // should throw
    }

    @Test(expected = IOException.class)
    public void testFeedInputEndBeforeStart() throws IOException {
        byte[] data = "{}".getBytes("UTF-8");
        parser.feedInput(data, 2, 1); // end < start
    }

    @Test(expected = IOException.class)
    public void testFeedInputAfterEndOfInput() throws IOException {
        parser.endOfInput();
        byte[] data = "{}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
    }

    // ---------- endOfInput ----------
    @Test
    public void testEndOfInput() throws IOException {
        parser.endOfInput();
        assertFalse("After endOfInput, needMoreInput should be false", parser.needMoreInput());
    }

    // ---------- nextToken ----------
    @Test
    public void testNextTokenEmptyEOF() throws IOException {
        parser.endOfInput();
        // No input ever fed, should return null (end of input)
        assertNull("nextToken after endOfInput with no data should be null", parser.nextToken());
    }

    @Test
    public void testNextTokenSimpleObject() throws IOException {
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertNull("After end object, nextToken should be null", parser.nextToken());
    }

    @Test
    public void testNextTokenArray() throws IOException {
        byte[] data = "[1,2,3]".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenString() throws IOException {
        byte[] data = "\"hello\"".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testNextTokenNull() throws IOException {
        byte[] data = "null".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenTrue() throws IOException {
        byte[] data = "true".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws IOException {
        byte[] data = "false".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenInteger() throws IOException {
        byte[] data = "42".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenNegativeInteger() throws IOException {
        byte[] data = "-7".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-7, parser.getIntValue());
    }

    @Test
    public void testNextTokenFloat() throws IOException {
        byte[] data = "3.14".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNextTokenNestedObject() throws IOException {
        byte[] data = "{\"x\":{\"y\":[]}}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.getCurrentName());
        assertToken(JsonToken.START_OBJECT, parser.nextToken());
        assertToken(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("y", parser.getCurrentName());
        assertToken(JsonToken.START_ARRAY, parser.nextToken());
        assertToken(JsonToken.END_ARRAY, parser.nextToken());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertToken(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test(expected = IOException.class)
    public void testNextTokenInvalidJson() throws IOException {
        byte[] data = "{invalid}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        parser.nextToken(); // should throw
    }

    // ---------- releaseBuffered ----------
    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals("No input, released should be 0", 0, released);
        assertEquals("Output stream should be empty", 0, out.size());
    }

    @Test
    public void testReleaseBufferedWithData() throws IOException {
        byte[] data = "some data".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        // Consume one character? Not required; just test releaseBuffered
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertTrue("Should have released some bytes", released > 0);
        assertArrayEquals("Output should contain the buffer", data, out.toByteArray());
    }

    // ---------- getNonBlockingInputFeeder ----------
    @Test
    public void testGetNonBlockingInputFeeder() {
        assertSame("Should return same parser instance", parser, parser.getNonBlockingInputFeeder());
    }

    // Helper to assert token type
    private void assertToken(JsonToken expected, JsonToken actual) {
        assertNotNull("Expected token, got null", actual);
        assertEquals("Token type mismatch", expected, actual);
    }
}