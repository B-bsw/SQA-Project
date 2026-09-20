package org.mockito.internal.util;

import org.junit.Assert;
import org.junit.Test;

public class PrimitivesTest {

    @Test
    public void constructor_whenInstantiated_shouldNotBeNull() {
        // Arrange & Act
        Primitives primitives = new Primitives();

        // Assert
        Assert.assertNotNull(primitives);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveBoolean_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Boolean> input = Boolean.TYPE;

        // Act
        Class<Boolean> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Boolean.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveCharacter_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Character> input = Character.TYPE;

        // Act
        Class<Character> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Character.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveByte_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Byte> input = Byte.TYPE;

        // Act
        Class<Byte> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Byte.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveShort_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Short> input = Short.TYPE;

        // Act
        Class<Short> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Short.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveInteger_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Integer> input = Integer.TYPE;

        // Act
        Class<Integer> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Integer.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveLong_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Long> input = Long.TYPE;

        // Act
        Class<Long> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Long.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveFloat_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Float> input = Float.TYPE;

        // Act
        Class<Float> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Float.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveDouble_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Double> input = Double.TYPE;

        // Act
        Class<Double> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Double.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenPrimitiveVoid_shouldReturnSamePrimitiveType() {
        // Arrange
        Class<Void> input = Void.TYPE;

        // Act
        Class<Void> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Void.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenBooleanWrapper_shouldReturnPrimitiveBoolean() {
        // Arrange
        Class<Boolean> input = Boolean.class;

        // Act
        Class<Boolean> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Boolean.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenCharacterWrapper_shouldReturnPrimitiveCharacter() {
        // Arrange
        Class<Character> input = Character.class;

        // Act
        Class<Character> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Character.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenByteWrapper_shouldReturnPrimitiveByte() {
        // Arrange
        Class<Byte> input = Byte.class;

        // Act
        Class<Byte> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Byte.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenShortWrapper_shouldReturnPrimitiveShort() {
        // Arrange
        Class<Short> input = Short.class;

        // Act
        Class<Short> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Short.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenIntegerWrapper_shouldReturnPrimitiveInteger() {
        // Arrange
        Class<Integer> input = Integer.class;

        // Act
        Class<Integer> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Integer.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenLongWrapper_shouldReturnPrimitiveLong() {
        // Arrange
        Class<Long> input = Long.class;

        // Act
        Class<Long> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Long.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenFloatWrapper_shouldReturnPrimitiveFloat() {
        // Arrange
        Class<Float> input = Float.class;

        // Act
        Class<Float> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Float.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenDoubleWrapper_shouldReturnPrimitiveDouble() {
        // Arrange
        Class<Double> input = Double.class;

        // Act
        Class<Double> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertEquals(Double.TYPE, result);
    }

    @Test
    public void primitiveTypeOf_givenNonWrapperClass_shouldReturnNull() {
        // Arrange
        Class<String> input = String.class;

        // Act
        Class<String> result = Primitives.primitiveTypeOf(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void primitiveTypeOf_givenNullClass_shouldThrowNullPointerException() {
        // Arrange & Act & Assert
        Primitives.primitiveTypeOf(null);
    }

    @Test
    public void isPrimitiveWrapper_givenAllWrapperClasses_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Character.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Short.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Long.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Float.class));
        Assert.assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void isPrimitiveWrapper_givenPrimitiveClasses_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Boolean.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Character.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Byte.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Short.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Integer.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Long.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Float.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Double.TYPE));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Void.TYPE));
    }

    @Test
    public void isPrimitiveWrapper_givenNonWrapperClass_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(Primitives.isPrimitiveWrapper(String.class));
        Assert.assertFalse(Primitives.isPrimitiveWrapper(Object.class));
    }

    @Test
    public void isPrimitiveWrapper_givenNull_shouldReturnFalse() {
        // Arrange & Act
        boolean result = Primitives.isPrimitiveWrapper(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void primitiveWrapperOf_givenBooleanWrapper_shouldReturnFalse() {
        // Arrange & Act
        Boolean result = Primitives.primitiveWrapperOf(Boolean.class);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void primitiveWrapperOf_givenCharacterWrapper_shouldReturnNullChar() {
        // Arrange & Act
        Character result = Primitives.primitiveWrapperOf(Character.class);

        // Assert
        Assert.assertEquals(Character.valueOf('\u0000'), result);
    }

    @Test
    public void primitiveWrapperOf_givenByteWrapper_shouldReturnZero() {
        // Arrange & Act
        Byte result = Primitives.primitiveWrapperOf(Byte.class);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void primitiveWrapperOf_givenShortWrapper_shouldReturnZero() {
        // Arrange & Act
        Short result = Primitives.primitiveWrapperOf(Short.class);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void primitiveWrapperOf_givenIntegerWrapper_shouldReturnZero() {
        // Arrange & Act
        Integer result = Primitives.primitiveWrapperOf(Integer.class);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void primitiveWrapperOf_givenLongWrapper_shouldReturnZero() {
        // Arrange & Act
        Long result = Primitives.primitiveWrapperOf(Long.class);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void primitiveWrapperOf_givenFloatWrapper_shouldReturnZero() {
        // Arrange & Act
        Float result = Primitives.primitiveWrapperOf(Float.class);

        // Assert
        Assert.assertEquals(Float.valueOf(0F), result);
    }

    @Test
    public void primitiveWrapperOf_givenDoubleWrapper_shouldReturnZero() {
        // Arrange & Act
        Double result = Primitives.primitiveWrapperOf(Double.class);

        // Assert
        Assert.assertEquals(Double.valueOf(0D), result);
    }

    @Test
    public void primitiveWrapperOf_givenNonWrapperClass_shouldReturnNull() {
        // Arrange & Act
        String result = Primitives.primitiveWrapperOf(String.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void primitiveWrapperOf_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Primitives.primitiveWrapperOf(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void primitiveValueOrNullFor_givenBooleanPrimitive_shouldReturnFalse() {
        // Arrange & Act
        Boolean result = Primitives.primitiveValueOrNullFor(Boolean.TYPE);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void primitiveValueOrNullFor_givenCharPrimitive_shouldReturnNullChar() {
        // Arrange & Act
        Character result = Primitives.primitiveValueOrNullFor(Character.TYPE);

        // Assert
        Assert.assertEquals(Character.valueOf('\u0000'), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenBytePrimitive_shouldReturnZero() {
        // Arrange & Act
        Byte result = Primitives.primitiveValueOrNullFor(Byte.TYPE);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenShortPrimitive_shouldReturnZero() {
        // Arrange & Act
        Short result = Primitives.primitiveValueOrNullFor(Short.TYPE);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenIntPrimitive_shouldReturnZero() {
        // Arrange & Act
        Integer result = Primitives.primitiveValueOrNullFor(Integer.TYPE);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenLongPrimitive_shouldReturnZero() {
        // Arrange & Act
        Long result = Primitives.primitiveValueOrNullFor(Long.TYPE);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenFloatPrimitive_shouldReturnZero() {
        // Arrange & Act
        Float result = Primitives.primitiveValueOrNullFor(Float.TYPE);

        // Assert
        Assert.assertEquals(Float.valueOf(0F), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenDoublePrimitive_shouldReturnIntegerZeroStoredInMap() {
        // In the legacy implementation, primitiveValues.put(double.class, 0) stores an Integer object
        // Arrange & Act
        Object result = Primitives.primitiveValueOrNullFor(Double.TYPE);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void primitiveValueOrNullFor_givenWrapperClass_shouldReturnNull() {
        // Arrange & Act
        Integer result = Primitives.primitiveValueOrNullFor(Integer.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void primitiveValueOrNullFor_givenNonPrimitiveClass_shouldReturnNull() {
        // Arrange & Act
        String result = Primitives.primitiveValueOrNullFor(String.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void primitiveValueOrNullFor_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Primitives.primitiveValueOrNullFor(null);

        // Assert
        Assert.assertNull(result);
    }
}