package com.fasterxml.jackson.core.json.async;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;

/**
 * Comprehensive Unit Tests for {@link NonBlockingJsonParser}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class NonBlockingJsonParserTest {

    @Test
    public void nonBlockingParsing_givenChunkedInput_shouldParseTokensIncrementally() throws Exception {
        // Arrange
        JsonFactory factory = new JsonFactory();
        NonBlockingJsonParser parser = (NonBlockingJsonParser) factory.createNonBlockingByteArrayParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();

        String chunk1 = "{\"name\":\"Async\",";
        String chunk2 = "\"count\":55}";

        byte[] b1 = chunk1.getBytes("UTF-8");
        byte[] b2 = chunk2.getBytes("UTF-8");

        // Act & Assert - Feed chunk 1
        feeder.feedInput(b1, 0, b1.length);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("Async", parser.getText());

        // Need more input for chunk 2
        assertEquals(JsonToken.NOT_AVAILABLE, parser.nextToken());

        // Feed chunk 2 and signal EOF
        feeder.feedInput(b2, 0, b2.length);
        feeder.endOfInput();

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("count", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(55, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void nonBlockingParsing_givenFullInput_shouldParseArray() throws Exception {
        // Arrange
        JsonFactory factory = new JsonFactory();
        NonBlockingJsonParser parser = (NonBlockingJsonParser) factory.createNonBlockingByteArrayParser();
        ByteArrayFeeder feeder = parser.getNonBlockingInputFeeder();

        byte[] data = "[1, 2, 3]".getBytes("UTF-8");
        feeder.feedInput(data, 0, data.length);
        feeder.endOfInput();

        // Act & Assert
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }
}
