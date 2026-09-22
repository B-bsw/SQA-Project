package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Comprehensive Unit Tests for {@link StringCollectionDeserializer}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StringCollectionDeserializerTest {

    @Test
    public void deserializeList_givenValidJsonArray_shouldReturnListOfStrings() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"apple\", \"banana\", \"cherry\"]";

        // Act
        List<String> result = mapper.readValue(json, new TypeReference<List<String>>() {});

        // Assert
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("apple", result.get(0));
        assertEquals("banana", result.get(1));
        assertEquals("cherry", result.get(2));
    }

    @Test
    public void deserializeList_givenEmptyJsonArray_shouldReturnEmptyList() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[]";

        // Act
        List<String> result = mapper.readValue(json, new TypeReference<List<String>>() {});

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void deserializeList_givenNullElements_shouldRetainNulls() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"a\", null, \"b\"]";

        // Act
        List<String> result = mapper.readValue(json, new TypeReference<List<String>>() {});

        // Assert
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertNull(result.get(1));
        assertEquals("b", result.get(2));
    }

    @Test
    public void deserializeSet_givenDuplicates_shouldDeduplicateInSet() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"dup\", \"unique\", \"dup\"]";

        // Act
        Set<String> result = mapper.readValue(json, new TypeReference<Set<String>>() {});

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains("dup"));
        assertTrue(result.contains("unique"));
    }

    @Test
    public void deserialize_givenSingleValueWhenUnwrapSingleAllowed_shouldWrapInCollection() throws Exception {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"standalone\"";

        // Act
        List<String> result = mapper.readValue(json, new TypeReference<List<String>>() {});

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("standalone", result.get(0));
    }

    @Test
    public void directInstantiation_shouldExposeProperties() {
        // Arrange
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType collectionType = tf.constructCollectionType(ArrayList.class, String.class);

        // Act
        StringCollectionDeserializer deser = new StringCollectionDeserializer(collectionType, null, null);

        // Assert
        assertNotNull(deser);
        assertTrue(deser.isCachable());
        assertNull(deser.getContentDeserializer());
        assertNull(deser.getValueInstantiator());
    }
}
