package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Comprehensive Unit Tests for {@link StringArrayDeserializer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StringArrayDeserializerTest {

    @Test
    public void deserialize_givenSimpleStringArray_shouldReturnStringArray() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"hello\", \"world\", \"jackson\"]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("hello", result[0]);
        assertEquals("world", result[1]);
        assertEquals("jackson", result[2]);
    }

    @Test
    public void deserialize_givenEmptyArray_shouldReturnEmptyStringArray() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void deserialize_givenCoercibleNumbersAndBooleans_shouldConvertToStrings() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[123, true, 45.67]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("123", result[0]);
        assertEquals("true", result[1]);
        assertEquals("45.67", result[2]);
    }

    @Test
    public void deserialize_givenSingleStringWithFeatureEnabled_shouldWrapInArray() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"single_value\"";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("single_value", result[0]);
    }
}
