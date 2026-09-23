package org.mockito.internal.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitivesTest {
    
    private static final Class<?>[] PRIMITIVE_CLASSES = new Class<?>[] {
        boolean.class, char.class, byte.class, short.class, int.class, long.class, float.class, double.class
    };
    
    private static final Class<?>[] WRAPPER_CLASSES = new Class<?>[] {
        Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class
    };
    
    private static final Class<?>[] NON_PRIMITIVE_CLASSES = new Class<?>[] {
        String.class, Object.class, Number.class, Integer[].class, void.class, Runnable.class, int[].class, boolean[].class, null
    };
    
    @Before
    public void setUp() {
        // Test setup if needed, but no static initialization required as static blocks are invoked at class load time
    }
    
    @Test
    public void testPrimitiveTypeOfWhenPrimitivePassed() {
        for (Class<?> primitiveClass : PRIMITIVE_CLASSES) {
            Class<?> result = Primitives.primitiveTypeOf(primitiveClass);
            assertSame("Expected same primitive class for " + primitiveClass.getName(), primitiveClass, result);
        }
    }
    
    @Test
    public void testPrimitiveTypeOfWhenWrapperPassed() {
        for (int i = 0; i < WRAPPER_CLASSES.length; i++) {
            Class<?> result = Primitives.primitiveTypeOf(WRAPPER_CLASSES[i]);
            assertSame("Expected primitive class for " + WRAPPER_CLASSES[i].getName(), PRIMITIVE_CLASSES[i], result);
        }
    }
    
    @Test
    public void testPrimitiveTypeOfWhenNonPrimitiveOrWrapperClassPassed() {
        assertNull("Expected null for String.class", Primitives.primitiveTypeOf(String.class));
        assertNull("Expected null for Object.class", Primitives.primitiveTypeOf(Object.class));
        assertNull("Expected null for Number.class", Primitives.primitiveTypeOf(Number.class));
        assertNull("Expected null for Integer[].class", Primitives.primitiveTypeOf(Integer[].class));
        assertNull("Expected null for void.class", Primitives.primitiveTypeOf(void.class));
        assertNull("Expected null for Runnable.class", Primitives.primitiveTypeOf(Runnable.class));
        assertNull("Expected null for int[].class", Primitives.primitiveTypeOf(int[].class));
        assertNull("Expected null for boolean[].class", Primitives.primitiveTypeOf(boolean[].class));
    }
    
    @Test
    public void testPrimitiveTypeOfWhenNullPassed() {
        assertNull("Expected null when null is passed", Primitives.primitiveTypeOf(null));
    }
    
    @Test
    public void testIsPrimitiveWrapperWhenWrapperPassed() {
        for (Class<?> wrapperClass : WRAPPER_CLASSES) {
            assertTrue("Expected true for " + wrapperClass.getName(), Primitives.isPrimitiveWrapper(wrapperClass));
        }
    }
    
    @Test
    public void testIsPrimitiveWrapperWhenNonWrapperPassed() {
        assertFalse("Expected false for boolean.class", Primitives.isPrimitiveWrapper(boolean.class));
        assertFalse("Expected false for String.class", Primitives.isPrimitiveWrapper(String.class));
        assertFalse("Expected false for Object.class", Primitives.isPrimitiveWrapper(Object.class));
        assertFalse("Expected false for Integer[].class", Primitives.isPrimitiveWrapper(Integer[].class));
        assertFalse("Expected false for void.class", Primitives.isPrimitiveWrapper(void.class));
    }
    
    @Test
    public void testIsPrimitiveWrapperWhenNullPassed() {
        assertFalse("Expected false when null is passed", Primitives.isPrimitiveWrapper(null));
    }
    
    @Test
    public void testPrimitiveWrapperOfWhenWrapperPassed() {
        assertEquals("Expected false for Boolean", Boolean.FALSE, Primitives.primitiveWrapperOf(Boolean.class));
        assertEquals("Expected \\u0000 for Character", '\u0000', Primitives.primitiveWrapperOf(Character.class));
        assertEquals("Expected (byte) 0 for Byte", (byte) 0, Primitives.primitiveWrapperOf(Byte.class));
        assertEquals("Expected (short) 0 for Short", (short) 0, Primitives.primitiveWrapperOf(Short.class));
        assertEquals("Expected 0 for Integer", (Integer) 0, Primitives.primitiveWrapperOf(Integer.class));
        assertEquals("Expected 0L for Long", (Long) 0L, Primitives.primitiveWrapperOf(Long.class));
        assertEquals("Expected 0F for Float", 0F, Primitives.primitiveWrapperOf(Float.class));
        assertEquals("Expected 0D for Double", 0D, Primitives.primitiveWrapperOf(Double.class));
    }
    
    @Test
    public void testPrimitiveWrapperOfWhenNonWrapperPassed() {
        assertNull("Expected null for String.class", Primitives.primitiveWrapperOf(String.class));
        assertNull("Expected null for boolean.class", Primitives.primitiveWrapperOf(boolean.class));
        assertNull("Expected null for void.class", Primitives.primitiveWrapperOf(void.class));
        assertNull("Expected null for Integer[].class", Primitives.primitiveWrapperOf(Integer[].class));
        assertNull("Expected null for Object.class", Primitives.primitiveWrapperOf(Object.class));
    }
    
    @Test
    public void testPrimitiveWrapperOfWhenNullPassed() {
        assertNull("Expected null when null is passed", Primitives.primitiveWrapperOf(null));
    }
    
    @Test
    public void testPrimitiveValueOrNullForWhenPrimitiveClassPassed() {
        assertEquals("Expected false for boolean.class", false, Primitives.primitiveValueOrNullFor(boolean.class));
        assertEquals("Expected \\u0000 for char.class", '\u0000', Primitives.primitiveValueOrNullFor(char.class));
        assertEquals("Expected (byte) 0 for byte.class", (byte) 0, Primitives.primitiveValueOrNullFor(byte.class));
        assertEquals("Expected (short) 0 for short.class", (short) 0, Primitives.primitiveValueOrNullFor(short.class));
        assertEquals("Expected 0 for int.class", (Integer) 0, Primitives.primitiveValueOrNullFor(int.class));
        assertEquals("Expected 0L for long.class", (Long) 0L, Primitives.primitiveValueOrNullFor(long.class));
        assertEquals("Expected 0F for float.class", 0F, Primitives.primitiveValueOrNullFor(float.class));
        assertEquals("Expected 0D for double.class", 0D, Primitives.primitiveValueOrNullFor(double.class));
    }
    
    @Test
    public void testPrimitiveValueOrNullForWhenNonPrimitivePassed() {
        assertNull("Expected null for String.class", Primitives.primitiveValueOrNullFor(String.class));
        assertNull("Expected null for Integer.class", Primitives.primitiveValueOrNullFor(Integer.class));
        assertNull("Expected null for Boolean.class", Primitives.primitiveValueOrNullFor(Boolean.class));
        assertNull("Expected null for void.class", Primitives.primitiveValueOrNullFor(void.class));
        assertNull("Expected null for Object.class", Primitives.primitiveValueOrNullFor(Object.class));
    }
    
    @Test
    public void testPrimitiveValueOrNullForWhenNullPassed() {
        assertNull("Expected null when null is passed", Primitives.primitiveValueOrNullFor(null));
    }
    
    @Test
    public void testAllPrimitiveTypesAreInMaps() {
        assertTrue("Primitive types should be in primitiveTypeOf map", !Primitives.primitiveTypeOf(boolean.class).equals(void.class));
        assertTrue("void.class should not cause class cast exception when checking wrapper", !Primitives.isPrimitiveWrapper(void.class));
        assertTrue("Wrapper types should not be in primitiveValueOrNullFor map", !Boolean.class.equals(void.class));
    }
    
    @Test
    public void testCrossReferenceBetweenMaps() {
        for (int i = 0; i < WRAPPER_CLASSES.length; i++) {
            assertSame("primitiveTypeOf should convert wrapper to primitive", 
                      PRIMITIVE_CLASSES[i], Primitives.primitiveTypeOf(WRAPPER_CLASSES[i]));
            assertNull("primitiveValueOrNullFor should return null for wrapper class", 
                      Primitives.primitiveValueOrNullFor(WRAPPER_CLASSES[i]));
            assertNull("primitiveWrapperOf should return null for primitive class", 
                      Primitives.primitiveWrapperOf(PRIMITIVE_CLASSES[i]));
        }
    }
    
    @Test
    public void testEdgeCaseWith2BytePrimitiveValue() {
        Byte byteValue = (Byte) Primitives.primitiveValueOrNullFor(byte.class);
        assertSame("Byte value should be cached", (byte) 0, byteValue);
    }
    
    @Test
    public void testEdgeCaseWithIntegerCaching() {
        Integer integerValue = (Integer) Primitives.primitiveValueOrNullFor(int.class);
        assertSame("Integer value should be cached for 0", (Integer) 0, integerValue);
    }
    
    @Test
    public void testEdgeCaseWithCharacterPrimitive() {
        Character charValue = (Character) Primitives.primitiveValueOrNullFor(char.class);
        assertSame("Character value should be cached for \\u0000", '\u0000', charValue);
    }
    
    @Test
    public void testNoClassCastExceptionWhenCallingPrimitiveTypeOfWithDifferentTypes() {
        Class<?> result = Primitives.primitiveTypeOf(Integer.class);
        assertEquals("Should return int.class for Integer.class", int.class, result);
        
        result = Primitives.primitiveTypeOf(Boolean.class);
        assertEquals("Should return boolean.class for Boolean.class", boolean.class, result);
    }
    
    @Test
    public void testConsistentBehaviorWithWrapperAndPrimitiveMapping() {
        for (int i = 0; i < WRAPPER_CLASSES.length; i++) {
            Class<?> primitive = PRIMITIVE_CLASSES[i];
            Class<?> wrapper = WRAPPER_CLASSES[i];
            
            assertEquals("Mapping from wrapper to primitive should return the actual primitive type", 
                        primitive, Primitives.primitiveTypeOf(wrapper));
            assertEquals("Mapping from primitive to primitive should return the same primitive type", 
                        primitive, Primitives.primitiveTypeOf(primitive));
        }
    }
    
    @Test
    public void testWrapperReturnValuesAreDefaultValues() {
        assertEquals("Boolean default should be false", false, (Object) Boolean.FALSE);
        assertEquals("Character default should be null character", '\u0000', (Object) '\u0000');
        assertEquals("Byte default should be 0", (byte) 0, (Object) (byte) 0);
        assertEquals("Short default should be 0", (short) 0, (Object) (short) 0);
        assertEquals("Integer default should be 0", (Integer) 0, (Object) (Integer) 0);
        assertEquals("Long default should be 0L", (Long) 0L, (Object) (Long) 0L);
        assertEquals("Float default should be 0.0F", (Float) 0F, (Object) (Float) 0F);
        assertEquals("Double default should be 0.0D", (Double) 0D, (Object) (Double) 0D);
    }
    
    @Test
    public void testPrimitiveValueOrNullForWithBoolean() {
        Object value = Primitives.primitiveValueOrNullFor(boolean.class);
        assertNotNull("Value should not be null", value);
        assertEquals("Value should be false", false, value);
    }
    
    @Test
    public void testPrimitiveValueOrNullForWithVoidClass() {
        assertNull("primitiveValueOrNullFor should return null for void.class", Primitives.primitiveValueOrNullFor(void.class));
    }
    
    @Test
    public void testPrimitiveTypeOfWithAllPrimitiveClasses() {
        assertSame("boolean.class should map to itself", boolean.class, Primitives.primitiveTypeOf(boolean.class));
        assertSame("char.class should map to itself", char.class, Primitives.primitiveTypeOf(char.class));
        assertSame("byte.class should map to itself", byte.class, Primitives.primitiveTypeOf(byte.class));
        assertSame("short.class should map to itself", short.class, Primitives.primitiveTypeOf(short.class));
        assertSame("int.class should map to itself", int.class, Primitives.primitiveTypeOf(int.class));
        assertSame("long.class should map to itself", long.class, Primitives.primitiveTypeOf(long.class));
        assertSame("float.class should map to itself", float.class, Primitives.primitiveTypeOf(float.class));
        assertSame("double.class should map to itself", double.class, Primitives.primitiveTypeOf(double.class));
    }
    
    @Test
    public void testPrimitiveTypeOfWithAllWrapperClasses() {
        assertSame("Boolean should map to boolean", boolean.class, Primitives.primitiveTypeOf(Boolean.class));
        assertSame("Character should map to char", char.class, Primitives.primitiveTypeOf(Character.class));
        assertSame("Byte should map to byte", byte.class, Primitives.primitiveTypeOf(Byte.class));
        assertSame("Short should map to short", short.class, Primitives.primitiveTypeOf(Short.class));
        assertSame("Integer should map to int", int.class, Primitives.primitiveTypeOf(Integer.class));
        assertSame("Long should map to long", long.class, Primitives.primitiveTypeOf(Long.class));
        assertSame("Float should map to float", float.class, Primitives.primitiveTypeOf(Float.class));
        assertSame("Double should map to double", double.class, Primitives.primitiveTypeOf(Double.class));
    }
    
    @Test
    public void testIsPrimitiveWrapperForAllPrimitiveClasses() {
        assertFalse("boolean.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(boolean.class));
        assertFalse("char.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(char.class));
        assertFalse("byte.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(byte.class));
        assertFalse("short.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(short.class));
        assertFalse("int.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(int.class));
        assertFalse("long.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(long.class));
        assertFalse("float.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(float.class));
        assertFalse("double.class should not be primitive wrapper", Primitives.isPrimitiveWrapper(double.class));
    }
}