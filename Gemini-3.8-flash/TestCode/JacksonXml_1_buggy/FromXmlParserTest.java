package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;

/**
 * Comprehensive Unit Tests for {@link FromXmlParser}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FromXmlParserTest {

    @Test
    public void parseSimpleXml_shouldTraverseXmlTokens() throws Exception {
        // Arrange
        String xml = "<root><id>123</id><name>XML Test</name><flag>true</flag></root>";
        XmlFactory factory = new XmlFactory();
        FromXmlParser parser = (FromXmlParser) factory.createParser(new StringReader(xml));

        // Act & Assert
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("123", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("XML Test", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("flag", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("true", parser.getText());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());

        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void parseXmlWithAttributes_shouldExtractAttributes() throws Exception {
        // Arrange
        String xml = "<item id=\"42\" category=\"test\"><val>content</val></item>";
        XmlFactory factory = new XmlFactory();
        FromXmlParser parser = (FromXmlParser) factory.createParser(new StringReader(xml));

        // Act & Assert
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("id", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("42", parser.getText());

        parser.close();
    }
}
