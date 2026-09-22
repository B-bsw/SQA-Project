package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

/**
 * Comprehensive Unit Tests for {@link ClassUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ClassUtilsTest {

    @Test
    public void getShortClassName_shouldExtractSimpleName() {
        // Arrange & Act & Assert
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("Map", ClassUtils.getShortClassName(Map.class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void getPackageName_shouldExtractPackage() {
        // Arrange & Act & Assert
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("java.util", ClassUtils.getPackageName(List.class));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void isAssignable_givenCompatibleTypes_shouldReturnTrue() {
        // Arrange & Act & Assert
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class));
        assertTrue(ClassUtils.isAssignable(int.class, Number.class));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class));
        assertFalse(ClassUtils.isAssignable(String.class, Number.class));
    }

    @Test
    public void primitiveToWrapper_andWrapperToPrimitive_shouldConvert() {
        // Arrange & Act & Assert
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(double.class));
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(boolean.class));

        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(double.class, ClassUtils.wrapperToPrimitive(Double.class));
        assertEquals(boolean.class, ClassUtils.wrapperToPrimitive(Boolean.class));
    }

    @Test
    public void toClass_givenObjects_shouldReturnArrayOfClasses() {
        // Arrange
        Object[] objects = new Object[] { "hello", Integer.valueOf(10) };

        // Act
        Class<?>[] classes = ClassUtils.toClass(objects);

        // Assert
        assertNotNull(classes);
        assertEquals(2, classes.length);
        assertEquals(String.class, classes[0]);
        assertEquals(Integer.class, classes[1]);
    }
}
