package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link ToStringStyle}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ToStringStyleTest {

    private static class Person {
        String name = "Alice";
        int age = 30;
    }

    @Test
    public void defaultStyle_shouldFormatStandardRepresentation() {
        // Arrange
        Person p = new Person();

        // Act
        String result = new ToStringBuilder(p, ToStringStyle.DEFAULT_STYLE)
                .append("name", p.name)
                .append("age", p.age)
                .toString();

        // Assert
        assertTrue(result.contains("name=Alice"));
        assertTrue(result.contains("age=30"));
    }

    @Test
    public void simpleStyle_shouldOmitClassAndFieldNames() {
        // Arrange
        Person p = new Person();

        // Act
        String result = new ToStringBuilder(p, ToStringStyle.SIMPLE_STYLE)
                .append("name", p.name)
                .append("age", p.age)
                .toString();

        // Assert
        assertEquals("Alice,30", result);
    }

    @Test
    public void noFieldNameStyle_shouldOmitFieldNames() {
        // Arrange
        Person p = new Person();

        // Act
        String result = new ToStringBuilder(p, ToStringStyle.NO_FIELD_NAMES_STYLE)
                .append("name", p.name)
                .append("age", p.age)
                .toString();

        // Assert
        assertTrue(result.contains("Alice,30"));
        assertFalse(result.contains("name="));
    }

    @Test
    public void shortPrefixStyle_shouldUseShortClassName() {
        // Arrange
        Person p = new Person();

        // Act
        String result = new ToStringBuilder(p, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", p.name)
                .toString();

        // Assert
        assertTrue(result.startsWith("ToStringStyleTest.Person["));
    }
}
