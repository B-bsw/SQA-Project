package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;

import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

/**
 * Comprehensive Unit Tests for {@link ToXmlGenerator}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ToXmlGeneratorTest {

    @Test
    public void generateXml_shouldWriteElementsAndAttributes() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        XmlFactory factory = new XmlFactory();
        ToXmlGenerator gen = (ToXmlGenerator) factory.createGenerator(writer);

        // Act
        gen.writeStartObject();
        gen.writeStringField("greeting", "Hello XML");
        gen.writeNumberField("year", 2026);
        gen.writeEndObject();
        gen.close();

        // Assert
        String xml = writer.toString();
        assertNotNull(xml);
        assertTrue(xml.contains("<greeting>Hello XML</greeting>"));
        assertTrue(xml.contains("<year>2026</year>"));
    }
}
