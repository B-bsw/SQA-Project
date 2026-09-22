package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Comprehensive Unit Tests for {@link UTF8JsonGenerator}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class UTF8JsonGeneratorTest {

    @Test
    public void writeJsonObject_givenSimpleFields_shouldGenerateValidJson() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        assertTrue(gen instanceof UTF8JsonGenerator);
        gen.writeStartObject();
        gen.writeFieldName("name");
        gen.writeString("Jackson");
        gen.writeFieldName("count");
        gen.writeNumber(42);
        gen.writeFieldName("price");
        gen.writeNumber(19.99);
        gen.writeFieldName("active");
        gen.writeBoolean(true);
        gen.writeFieldName("extra");
        gen.writeNull();
        gen.writeEndObject();
        gen.close();

        // Assert
        assertTrue(gen.isClosed());
        String result = out.toString("UTF-8");
        assertEquals("{\"name\":\"Jackson\",\"count\":42,\"price\":19.99,\"active\":true,\"extra\":null}", result);
    }

    @Test
    public void writeJsonArray_givenNumbersAndBigNumbers_shouldGenerateArray() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        gen.writeStartArray();
        gen.writeNumber((short) 1);
        gen.writeNumber(2);
        gen.writeNumber(3L);
        gen.writeNumber(4.5f);
        gen.writeNumber(5.6d);
        gen.writeNumber(new BigInteger("12345678901234567890"));
        gen.writeNumber(new BigDecimal("999.999"));
        gen.writeEndArray();
        gen.close();

        // Assert
        String result = out.toString("UTF-8");
        assertEquals("[1,2,3,4.5,5.6,12345678901234567890,999.999]", result);
    }

    @Test
    public void writeRaw_givenRawContent_shouldOutputVerbatim() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        gen.writeStartObject();
        gen.writeFieldName("raw");
        gen.writeRawValue("[1,2,3]");
        gen.writeEndObject();
        gen.close();

        // Assert
        String result = out.toString("UTF-8");
        assertEquals("{\"raw\":[1,2,3]}", result);
    }

    @Test
    public void writeUtf8String_givenUnicodeCharacters_shouldEncodeProperly() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        gen.writeStartObject();
        gen.writeFieldName("greeting");
        gen.writeString("สวัสดี / Hello 🚀");
        gen.writeEndObject();
        gen.close();

        // Assert
        String result = out.toString("UTF-8");
        assertTrue(result.contains("สวัสดี / Hello 🚀"));
    }

    @Test
    public void flushAndClose_shouldFlushRemainingBuffers() throws Exception {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(out, JsonEncoding.UTF8);

        // Act
        gen.writeStartArray();
        gen.writeNumber(100);
        gen.flush();
        assertTrue(out.size() > 0);
        gen.writeEndArray();
        gen.close();

        // Assert
        assertTrue(gen.isClosed());
        assertEquals("[100]", out.toString("UTF-8"));
    }
}
