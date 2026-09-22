package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathArithmeticException;

/**
 * Comprehensive Unit Tests for {@link Fraction}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FractionTest {

    @Test
    public void getNumeratorAndDenominator_shouldReduceFraction() {
        // Arrange & Act
        Fraction f = new Fraction(4, 8);

        // Assert
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        assertEquals(0.5, f.doubleValue(), 0.0001);
    }

    @Test
    public void arithmeticOperations_shouldComputeCorrectly() {
        // Arrange
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);

        // Act
        Fraction sum = half.add(third);
        Fraction diff = half.subtract(third);
        Fraction prod = half.multiply(third);
        Fraction quot = half.divide(third);

        // Assert
        assertEquals(new Fraction(5, 6), sum);
        assertEquals(new Fraction(1, 6), diff);
        assertEquals(new Fraction(1, 6), prod);
        assertEquals(new Fraction(3, 2), quot);
    }

    @Test
    public void absNegateAndReciprocal_shouldTransformFraction() {
        // Arrange
        Fraction f = new Fraction(-3, 4);

        // Act & Assert
        assertEquals(new Fraction(3, 4), f.abs());
        assertEquals(new Fraction(3, 4), f.negate());
        assertEquals(new Fraction(-4, 3), f.reciprocal());
    }

    @Test(expected = MathArithmeticException.class)
    public void constructor_givenZeroDenominator_shouldThrowException() {
        // Arrange & Act
        new Fraction(1, 0);
    }

    @Test
    public void equalsAndCompareTo_shouldCompareFractions() {
        // Arrange
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);

        // Act & Assert
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(f3));
        assertEquals(0, f1.compareTo(f2));
        assertTrue(f1.compareTo(f3) < 0);
        assertTrue(f3.compareTo(f1) > 0);
    }
}
