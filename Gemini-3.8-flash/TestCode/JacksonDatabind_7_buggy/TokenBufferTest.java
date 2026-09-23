package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link TokenBuffer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class TokenBufferTest {

    @Test
    public void writeAndReadTokens_givenObjectAndPrimitives_shouldReproduceTokens() throws Exception {
        // Arrange
        TokenBuffer buffer = new TokenBuffer(null, false);

        // Act - Write tokens
        buffer.writeStartObject();
        buffer.writeFieldName("id");
        buffer.writeNumber(101);
        buffer.writeFieldName("name");
        buffer.writeString("Jackson");
        buffer.writeFieldName("active");
        buffer.writeBoolean(true);
        buffer.writeFieldName("score");
        buffer.writeNumber(98.5);
        buffer.writeFieldName("tag");
        buffer.writeNull();
        buffer.writeEndObject();
        buffer.close();

        // Assert - Read tokens back via asParser()
        JsonParser p = buffer.asParser();
        assertNotNull(p);

        assertEquals(JsonToken.START_OBJECT, p.nextToken());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("id", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(101, p.getIntValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("Jackson", p.getText());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("active", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("score", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(98.5, p.getDoubleValue(), 0.001);

        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("tag", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());

        p.close();
    }

    @Test
    public void writeAndReadTokens_givenArrayWithNumbers_shouldTraverseCorrectly() throws Exception {
        // Arrange
        TokenBuffer buffer = new TokenBuffer(null, false);

        // Act
        buffer.writeStartArray();
        buffer.writeNumber((short) 1);
        buffer.writeNumber(2L);
        buffer.writeNumber(new BigInteger("10000000000"));
        buffer.writeNumber(new BigDecimal("123.456"));
        buffer.writeEndArray();
        buffer.close();

        // Assert
        JsonParser p = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2L, p.getLongValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(new BigInteger("10000000000"), p.getBigIntegerValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(new BigDecimal("123.456"), p.getDecimalValue());

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());

        p.close();
    }

    @Test
    public void serialize_shouldCopyTokensToOutputGenerator() throws Exception {
        // Arrange
        TokenBuffer buffer = new TokenBuffer(null, false);
        buffer.writeStartObject();
        buffer.writeStringField("k", "v");
        buffer.writeEndObject();
        buffer.close();

        StringWriter writer = new StringWriter();
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(writer);

        // Act
        buffer.serialize(gen);
        gen.close();

        // Assert
        assertEquals("{\"k\":\"v\"}", writer.toString());
    }

    @Test
    public void append_givenAnotherTokenBuffer_shouldCombineTokens() throws Exception {
        // Arrange
        TokenBuffer buf1 = new TokenBuffer(null, false);
        buf1.writeStartArray();
        buf1.writeNumber(1);
        buf1.writeEndArray();
        buf1.close();

        TokenBuffer buf2 = new TokenBuffer(null, false);
        buf2.writeStartArray();
        buf2.writeNumber(2);
        buf2.writeEndArray();
        buf2.close();

        // Act
        TokenBuffer combined = new TokenBuffer(null, false);
        combined.append(buf1);
        combined.append(buf2);
        combined.close();

        // Assert
        JsonParser p = combined.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());

        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());

        p.close();
    }
}
