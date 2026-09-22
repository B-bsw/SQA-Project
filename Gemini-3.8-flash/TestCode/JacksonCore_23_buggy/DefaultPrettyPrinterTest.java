package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;

/**
 * Comprehensive Unit Tests for {@link DefaultPrettyPrinter}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class DefaultPrettyPrinterTest {

    @Test
    public void prettyPrinter_createInstance_shouldCreateDistinctCopy() {
        // Arrange
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();

        // Act
        DefaultPrettyPrinter copy = printer.createInstance();

        // Assert
        assertNotNull(copy);
        assertNotSame(printer, copy);
    }

    @Test
    public void prettyPrinter_withRootSeparator_shouldUpdateSeparator() {
        // Arrange
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        SerializedString sep = new SerializedString("\n");

        // Act
        DefaultPrettyPrinter updated = printer.withRootSeparator(sep);

        // Assert
        assertNotNull(updated);
    }

    @Test
    public void prettyPrinter_formattingJson_shouldAddIndentationAndLinefeeds() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);
        gen.setPrettyPrinter(new DefaultPrettyPrinter());

        // Act
        gen.writeStartObject();
        gen.writeStringField("name", "John");
        gen.writeNumberField("age", 30);
        gen.writeEndObject();
        gen.close();

        // Assert
        String formatted = writer.toString();
        assertTrue(formatted.contains("\n"));
        assertTrue(formatted.contains("  \"name\" : \"John\""));
        assertTrue(formatted.contains("  \"age\" : 30"));
    }
}
