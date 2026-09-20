package com.fasterxml.jackson.databind.deser.std;

import java.util.concurrent.atomic.AtomicReference;
import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class AtomicReferenceDeserializerTest {

    @Test
    public void constructor_givenNullArguments_shouldInstantiateSuccessfully() {
        // Arrange & Act
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Assert
        Assert.assertNotNull(deserializer);
    }

    @Test
    public void withResolved_givenSameDeserializers_shouldReturnNewInstance() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        AtomicReferenceDeserializer resolved = deserializer.withResolved(
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Assert
        Assert.assertNotNull(resolved);
        Assert.assertNotSame(deserializer, resolved);
    }

    @Test
    public void getNullValue_givenNullContext_shouldReturnEmptyAtomicReference() throws JsonMappingException {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        AtomicReference<Object> nullValue = deserializer.getNullValue((DeserializationContext) null);

        // Assert
        Assert.assertNotNull(nullValue);
        Assert.assertNull(nullValue.get());
    }

    @Test
    public void getEmptyValue_givenNullContext_shouldReturnEmptyAtomicReference() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        Object emptyValue = deserializer.getEmptyValue((DeserializationContext) null);

        // Assert
        Assert.assertNotNull(emptyValue);
        Assert.assertTrue(emptyValue instanceof AtomicReference);
        AtomicReference<?> ref = (AtomicReference<?>) emptyValue;
        Assert.assertNull(ref.get());
    }

    @Test
    public void referenceValue_givenNonNullObject_shouldReturnAtomicReferenceContainingValue() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );
        String expectedValue = "testValue";

        // Act
        AtomicReference<Object> reference = deserializer.referenceValue(expectedValue);

        // Assert
        Assert.assertNotNull(reference);
        Assert.assertEquals(expectedValue, reference.get());
    }

    @Test
    public void referenceValue_givenNullObject_shouldReturnAtomicReferenceContainingNull() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        AtomicReference<Object> reference = deserializer.referenceValue(null);

        // Assert
        Assert.assertNotNull(reference);
        Assert.assertNull(reference.get());
    }

    @Test
    public void getReferenced_givenAtomicReferenceWithValue_shouldReturnUnderlyingValue() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );
        Integer expectedValue = Integer.valueOf(42);
        AtomicReference<Object> reference = new AtomicReference<Object>(expectedValue);

        // Act
        Object actualValue = deserializer.getReferenced(reference);

        // Assert
        Assert.assertNotNull(actualValue);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getReferenced_givenAtomicReferenceWithNull_shouldReturnNull() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );
        AtomicReference<Object> reference = new AtomicReference<Object>(null);

        // Act
        Object actualValue = deserializer.getReferenced(reference);

        // Assert
        Assert.assertNull(actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void getReferenced_givenNullReference_shouldThrowNullPointerException() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        deserializer.getReferenced(null);
    }

    @Test
    public void updateReference_givenExistingReferenceAndNewValue_shouldUpdateAndReturnSameReference() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );
        AtomicReference<Object> reference = new AtomicReference<Object>("oldValue");
        String newValue = "newValue";

        // Act
        AtomicReference<Object> updatedReference = deserializer.updateReference(reference, newValue);

        // Assert
        Assert.assertSame(reference, updatedReference);
        Assert.assertEquals(newValue, updatedReference.get());
    }

    @Test
    public void updateReference_givenExistingReferenceAndNullValue_shouldUpdateToNullAndReturnSameReference() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );
        AtomicReference<Object> reference = new AtomicReference<Object>("initial");

        // Act
        AtomicReference<Object> updatedReference = deserializer.updateReference(reference, null);

        // Assert
        Assert.assertSame(reference, updatedReference);
        Assert.assertNull(updatedReference.get());
    }

    @Test(expected = NullPointerException.class)
    public void updateReference_givenNullReference_shouldThrowNullPointerException() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        deserializer.updateReference(null, "someValue");
    }

    @Test
    public void supportsUpdate_givenNullConfig_shouldReturnBooleanTrue() {
        // Arrange
        AtomicReferenceDeserializer deserializer = new AtomicReferenceDeserializer(
                (JavaType) null,
                (ValueInstantiator) null,
                (TypeDeserializer) null,
                (JsonDeserializer<?>) null
        );

        // Act
        Boolean supportsUpdate = deserializer.supportsUpdate((DeserializationConfig) null);

        // Assert
        Assert.assertNotNull(supportsUpdate);
        Assert.assertEquals(Boolean.TRUE, supportsUpdate);
    }
}