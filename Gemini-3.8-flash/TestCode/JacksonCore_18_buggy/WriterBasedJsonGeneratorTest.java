package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Comprehensive Unit Tests for {@link WriterBasedJsonGenerator}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class WriterBasedJsonGeneratorTest {

    @Test
    public void writeJsonObject_givenSimpleFields_shouldWriteFormattedJson() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        assertTrue(gen instanceof WriterBasedJsonGenerator);
        gen.writeStartObject();
        gen.writeFieldName("title");
        gen.writeString("WriterTest");
        gen.writeFieldName("value");
        gen.writeNumber(99);
        gen.writeFieldName("rate");
        gen.writeNumber(1.25);
        gen.writeFieldName("valid");
        gen.writeBoolean(false);
        gen.writeFieldName("opt");
        gen.writeNull();
        gen.writeEndObject();
        gen.close();

        // Assert
        assertTrue(gen.isClosed());
        assertEquals("{\"title\":\"WriterTest\",\"value\":99,\"rate\":1.25,\"valid\":false,\"opt\":null}", writer.toString());
    }

    @Test
    public void writeJsonArray_givenMixedValues_shouldWriteArray() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        gen.writeStartArray();
        gen.writeNumber(10);
        gen.writeNumber(20L);
        gen.writeNumber(new BigInteger("9999999999"));
        gen.writeNumber(new BigDecimal("12.34"));
        gen.writeString("str");
        gen.writeEndArray();
        gen.close();

        // Assert
        assertEquals("[10,20,9999999999,12.34,\"str\"]", writer.toString());
    }

    @Test
    public void writeEscapedString_givenQuotesAndBackslashes_shouldEscapeProperly() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        gen.writeStartObject();
        gen.writeFieldName("escaped");
        gen.writeString("line1\nline2\t\"quoted\"\\slash");
        gen.writeEndObject();
        gen.close();

        // Assert
        assertEquals("{\"escaped\":\"line1\\nline2\\t\\\"quoted\\\"\\\\slash\"}", writer.toString());
    }

    @Test
    public void writeRaw_givenRawText_shouldOutputDirectly() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        gen.writeStartArray();
        gen.writeRawValue("{\"nested\":true}");
        gen.writeEndArray();
        gen.close();

        // Assert
        assertEquals("[{\"nested\":true}]", writer.toString());
    }
}
