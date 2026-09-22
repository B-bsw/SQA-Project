package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link ParserMinimalBase}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ParserMinimalBaseTest {

    @Test
    public void parserMinimalBase_tokenInquiryMethods_shouldWorkCorrectly() throws Exception {
        // Arrange
        String json = "{\"items\":[1, true, null]}";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act & Assert
        assertFalse(parser.hasCurrentToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.hasCurrentToken());
        assertTrue(parser.isExpectedStartObjectToken());
        assertFalse(parser.isExpectedStartArrayToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("items", parser.getCurrentName());

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertTrue(parser.isExpectedStartArrayToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getValueAsInt());
        assertEquals(1L, parser.getValueAsLong());
        assertEquals(1.0, parser.getValueAsDouble(), 0.001);
        assertEquals("1", parser.getValueAsString());

        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getValueAsBoolean());

        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.getValueAsString(null));

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void skipChildren_shouldSkipEntireArrayOrObject() throws Exception {
        // Arrange
        String json = "{\"skipMe\":[1, 2, 3, 4], \"keepMe\":42}";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("skipMe", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.currentToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("keepMe", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }
}
