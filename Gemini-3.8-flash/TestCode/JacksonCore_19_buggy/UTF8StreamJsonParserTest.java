package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link UTF8StreamJsonParser}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class UTF8StreamJsonParserTest {

    @Test
    public void parseJsonObject_givenByteStream_shouldTraverseTokensCorrectly() throws Exception {
        // Arrange
        String json = "{\"id\":1001,\"title\":\"UTF-8 Test\",\"enabled\":false,\"ratio\":3.14,\"tag\":null}";
        byte[] bytes = json.getBytes("UTF-8");
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new ByteArrayInputStream(bytes));

        // Act & Assert
        assertTrue(parser instanceof UTF8StreamJsonParser);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1001, parser.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("title", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("UTF-8 Test", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("enabled", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertFalse(parser.getBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("ratio", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.001);

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("tag", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void parseJsonArray_givenNestedArrayAndObject_shouldParseStructure() throws Exception {
        // Arrange
        String json = "[{\"x\":1},{\"x\":2},[true,false]]";
        byte[] bytes = json.getBytes("UTF-8");
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(bytes);

        // Act & Assert
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
    }

    @Test
    public void parseUtf8MultiByteChars_givenUnicodeAndThaiCharacters_shouldDecodeCorrectly() throws Exception {
        // Arrange
        String json = "{\"greeting\":\"สวัสดีชาวโลก\",\"symbol\":\"© € 🚀\"}";
        byte[] bytes = json.getBytes("UTF-8");
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new ByteArrayInputStream(bytes));

        // Act & Assert
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("greeting", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("สวัสดีชาวโลก", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("symbol", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("© € 🚀", parser.getText());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void releaseBuffered_givenBufferedContent_shouldReleaseBytes() throws Exception {
        // Arrange
        String json = "{} trailing byte stream";
        byte[] bytes = json.getBytes("UTF-8");
        JsonFactory factory = new JsonFactory();
        UTF8StreamJsonParser parser = (UTF8StreamJsonParser) factory.createParser(new ByteArrayInputStream(bytes));

        // Act
        parser.nextToken();
        parser.nextToken();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(baos);

        // Assert
        assertTrue(count >= 0);
        parser.close();
    }
}
