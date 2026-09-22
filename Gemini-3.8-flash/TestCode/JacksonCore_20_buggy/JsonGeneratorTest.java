package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;

/**
 * Comprehensive Unit Tests for {@link JsonGenerator}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class JsonGeneratorTest {

    @Test
    public void features_defaultValues_shouldBeCorrect() {
        // Arrange & Act & Assert
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledByDefault());
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.enabledByDefault());
        assertTrue(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.enabledByDefault());
        assertFalse(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledByDefault());
        assertFalse(JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledByDefault());
    }

    @Test
    public void convenienceWriteMethods_shouldGenerateJson() throws Exception {
        // Arrange
        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        gen.writeStartObject();
        gen.writeStringField("strField", "hello");
        gen.writeNumberField("intField", 123);
        gen.writeNumberField("longField", 123456789L);
        gen.writeNumberField("doubleField", 45.67);
        gen.writeBooleanField("boolField", true);

        gen.writeArrayFieldStart("arrayField");
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeEndArray();

        gen.writeObjectFieldStart("nestedObject");
        gen.writeStringField("k", "v");
        gen.writeEndObject();

        gen.writeEndObject();
        gen.close();

        // Assert
        String expected = "{\"strField\":\"hello\",\"intField\":123,\"longField\":123456789,\"doubleField\":45.67,\"boolField\":true,\"arrayField\":[1,2],\"nestedObject\":{\"k\":\"v\"}}";
        assertEquals(expected, writer.toString());
    }
}
