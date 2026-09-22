package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link ParserBase}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ParserBaseTest {

    @Test
    public void parserBase_parsingContextAndLocations_shouldTrackPosition() throws Exception {
        // Arrange
        String json = "{\"a\":10,\"b\":20}";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader(json));

        // Act & Assert
        assertTrue(parser.getParsingContext().inRoot());
        assertNotNull(parser.getCurrentLocation());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.getParsingContext().inObject());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertNotNull(parser.getTokenLocation());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10, parser.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(20, parser.getIntValue());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertTrue(parser.getParsingContext().inRoot());

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void parserBase_featureToggling_shouldBehaveProperly() throws Exception {
        // Arrange
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new StringReader("{}"));

        // Act & Assert
        assertTrue(parser.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));
        parser.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        assertFalse(parser.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));

        parser.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        assertTrue(parser.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));

        parser.close();
    }
}
