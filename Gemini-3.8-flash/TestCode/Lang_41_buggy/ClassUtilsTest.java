package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link ClassUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ClassUtilsTest {

    @Test
    public void getShortClassName_shouldReturnSimpleName() {
        // Arrange & Act & Assert
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("Integer", ClassUtils.getShortClassName(Integer.class));
        assertEquals("", ClassUtils.getShortClassName((Class) null));
    }

    @Test
    public void getPackageName_shouldReturnPackage() {
        // Arrange & Act & Assert
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("", ClassUtils.getPackageName((Class) null));
    }

    @Test
    public void isAssignable_shouldDetermineTypeHierarchy() {
        // Arrange & Act & Assert
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class));
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class));
        assertFalse(ClassUtils.isAssignable(String.class, Number.class));
    }
}
