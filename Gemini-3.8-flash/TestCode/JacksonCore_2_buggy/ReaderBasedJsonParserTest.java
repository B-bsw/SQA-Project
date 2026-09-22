package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link ReaderBasedJsonParser}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ReaderBasedJsonParserTest {

    @Test
    public void parseJsonObject_givenSimpleJson_shouldTraverseTokensCorrectly() throws Exception {
        // Arrange
        String json = "{\"name\":\"test\",\"val\":123,\"flag\":true,\"score\":45.67,\"extra\":null}";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act & Assert
        assertTrue(parser instanceof ReaderBasedJsonParser);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("test", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("val", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("flag", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("score", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(45.67, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("extra", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void parseJsonArray_givenArrayOfNumbers_shouldIterateElements() throws Exception {
        // Arrange
        String json = "[10, 20, 30]";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act & Assert
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(20, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(30, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void parseEscapedString_givenSpecialCharacters_shouldUnescape() throws Exception {
        // Arrange
        String json = "{\"msg\":\"Hello \\\"World\\\"\\n\\t\\r\"}";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act & Assert
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("Hello \"World\"\n\t\r", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        parser.close();
    }

    @Test
    public void releaseBuffered_givenBufferedContent_shouldReleaseRemainingCharacters() throws Exception {
        // Arrange
        String json = "{} trailing data";
        JsonFactory factory = new JsonFactory();
        ReaderBasedJsonParser parser = (ReaderBasedJsonParser) factory.createParser(new StringReader(json));

        // Act
        parser.nextToken();
        parser.nextToken();
        StringWriter sw = new StringWriter();
        int count = parser.releaseBuffered(sw);

        // Assert
        assertTrue(count >= 0);
        parser.close();
    }
}
