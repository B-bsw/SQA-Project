package org.mockito.internal.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimitivesTest {

    @Test
    public void shouldReturnPrimitiveTypeWhenClassIsAlreadyPrimitive() {
        Class<Integer> result = Primitives.primitiveTypeOf(int.class);
        assertEquals(int.class, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForBooleanWrapper() {
        Class<Boolean> result = Primitives.primitiveTypeOf(Boolean.class);
        assertEquals(Boolean.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForCharacterWrapper() {
        Class<Character> result = Primitives.primitiveTypeOf(Character.class);
        assertEquals(Character.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForByteWrapper() {
        Class<Byte> result = Primitives.primitiveTypeOf(Byte.class);
        assertEquals(Byte.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForShortWrapper() {
        Class<Short> result = Primitives.primitiveTypeOf(Short.class);
        assertEquals(Short.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForIntegerWrapper() {
        Class<Integer> result = Primitives.primitiveTypeOf(Integer.class);
        assertEquals(Integer.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForLongWrapper() {
        Class<Long> result = Primitives.primitiveTypeOf(Long.class);
        assertEquals(Long.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForFloatWrapper() {
        Class<Float> result = Primitives.primitiveTypeOf(Float.class);
        assertEquals(Float.TYPE, result);
    }

    @Test
    public void shouldReturnPrimitiveTypeForDoubleWrapper() {
        Class<Double> result = Primitives.primitiveTypeOf(Double.class);
        assertEquals(Double.TYPE, result);
    }

    @Test
    public void shouldReturnNullWhenClassIsNotPrimitiveOrWrapper() {
        Class<String> result = Primitives.primitiveTypeOf(String.class);
        assertNull(result);
    }

    @Test
    public void shouldReturnTrueForKnownPrimitiveWrapperTypes() {
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
        assertTrue(Primitives.isPrimitiveWrapper(Character.class));
        assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
        assertTrue(Primitives.isPrimitiveWrapper(Short.class));
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        assertTrue(Primitives.isPrimitiveWrapper(Long.class));
        assertTrue(Primitives.isPrimitiveWrapper(Float.class));
        assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void shouldReturnFalseForNonWrapperType() {
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
    }

    @Test
    public void shouldReturnFalseForPrimitiveType() {
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
    }

    @Test
    public void shouldReturnFalseForNullType() {
        assertFalse(Primitives.isPrimitiveWrapper(null));
    }

    @Test
    public void shouldReturnDefaultWrapperValueForBoolean() {
        Boolean result = Primitives.primitiveWrapperOf(Boolean.class);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForCharacter() {
        Character result = Primitives.primitiveWrapperOf(Character.class);
        assertEquals(Character.valueOf('\u0000'), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForByte() {
        Byte result = Primitives.primitiveWrapperOf(Byte.class);
        assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForShort() {
        Short result = Primitives.primitiveWrapperOf(Short.class);
        assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForInteger() {
        Integer result = Primitives.primitiveWrapperOf(Integer.class);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForLong() {
        Long result = Primitives.primitiveWrapperOf(Long.class);
        assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForFloat() {
        Float result = Primitives.primitiveWrapperOf(Float.class);
        assertEquals(Float.valueOf(0F), result);
    }

    @Test
    public void shouldReturnDefaultWrapperValueForDouble() {
        Double result = Primitives.primitiveWrapperOf(Double.class);
        assertEquals(Double.valueOf(0D), result);
    }

    @Test
    public void shouldReturnNullWhenTypeHasNoWrapperReturnValue() {
        String result = Primitives.primitiveWrapperOf(String.class);
        assertNull(result);
    }

    @Test
    public void shouldReturnDefaultPrimitiveValueForBoolean() {
        Boolean result = Primitives.primitiveValueOrNullFor(boolean.class);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void shouldReturnDefaultPrimitiveValueForChar() {
        Character result = Primitives.primitiveValueOrNullFor(char.class);
        assertEquals(Character.valueOf('\u0000'), result);
    }

    @Test
    public void shouldReturnDefaultPrimitiveValueForByte() {
        Byte result = Primitives.primitiveValueOrNullFor(byte.class);
        assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void shouldReturnDefaultPrimitiveValueForShort() {
        Short result = Primitives.primitiveValueOrNullFor(short.class);
        assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void shouldRetur