package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link HashCodeBuilder}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class HashCodeBuilderTest {

    private static class TestBean {
        private int id;
        private String name;

        public TestBean(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37)
                    .append(id)
                    .append(name)
                    .toHashCode();
        }
    }

    @Test
    public void append_givenPrimitiveTypes_shouldProduceValidHashCode() {
        // Arrange
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);

        // Act
        builder.append(true)
               .append((byte) 1)
               .append('c')
               .append((short) 2)
               .append(3)
               .append(4L)
               .append(5.0f)
               .append(6.0d)
               .append("string");
        int code = builder.toHashCode();

        // Assert
        assertTrue(code != 0);
    }

    @Test
    public void reflectionHashCode_givenObject_shouldComputeHashCode() {
        // Arrange
        TestBean bean1 = new TestBean(1, "Alice");
        TestBean bean2 = new TestBean(1, "Alice");
        TestBean bean3 = new TestBean(2, "Bob");

        // Act
        int h1 = HashCodeBuilder.reflectionHashCode(bean1);
        int h2 = HashCodeBuilder.reflectionHashCode(bean2);
        int h3 = HashCodeBuilder.reflectionHashCode(bean3);

        // Assert
        assertEquals(h1, h2);
        assertTrue(h1 != h3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEvenInitialNumber_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new HashCodeBuilder(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenEvenMultiplier_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new HashCodeBuilder(3, 2);
    }
}
